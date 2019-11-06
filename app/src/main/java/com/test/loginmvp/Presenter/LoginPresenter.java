package com.test.loginmvp.Presenter;

import com.test.loginmvp.Model.User;
import com.test.loginmvp.View.LoginView;

public class LoginPresenter implements ILoginPresenter{

    LoginView loginView;

    public LoginPresenter(LoginView loginView) {
        this.loginView = loginView;
    }

    @Override
    public void onLogin(String username, String password) {

        User user=new User(username,password);

        boolean isLogginSucces=user.isValiData();

        if (isLogginSucces)
            loginView.onLoginResult("Succesful");
        else
            loginView.onLoginResult("Error");

    }
}
