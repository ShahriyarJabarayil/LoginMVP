package com.test.loginmvp.Model;

import android.os.Handler;
import android.text.TextUtils;

public class User implements IUser {

    private String username;
    private  String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public boolean isValiData() {
        return TextUtils.isEmpty(password)&&TextUtils.isEmpty(username);
    }




  /*  @Override
    public void login(final String username, final String password, final OnLoginFinishedListener listener) {

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                if (TextUtils.isEmpty(username)){
                    listener.onUserNameError();
                    return ;
                }
                if (TextUtils.isEmpty(password)){
                    listener.onUserNameError();
                    return ;
                }

                listener.onSuccess();

            }
        },1000);

    }*/
}
