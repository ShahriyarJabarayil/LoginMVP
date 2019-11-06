package com.test.loginmvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.test.loginmvp.Model.User;
import com.test.loginmvp.Presenter.ILoginPresenter;
import com.test.loginmvp.Presenter.LoginPresenter;
import com.test.loginmvp.View.LoginView;

public class LoginActivity extends AppCompatActivity implements LoginView {

    Button btnLogin,btnGoRegist;
    EditText etUsername,etPassword;
    ProgressBar progressBar;
    ILoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin=findViewById(R.id.btn_login);
        btnGoRegist=findViewById(R.id.btn_go_regst);
        etUsername=findViewById(R.id.et_namelogin);
        etPassword=findViewById(R.id.et_password);

        loginPresenter=new LoginPresenter(this);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginPresenter.onLogin(etUsername.getText().toString(),etPassword.getText().toString());
            }
        });

    }

    @Override
    public void onLoginResult(String message) {
        Toast.makeText(this,message,Toast.LENGTH_LONG).show();
    }
}
