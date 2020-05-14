package com.luwakode.elearning.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.luwakode.elearning.R;

public class Splash extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                //setelah loading maka akan langsung berpindah ke home activity
                Intent i = new Intent(Splash.this, IntroActivity.class);
                startActivity(i);
                finish();

            }
        },1000);
    }
}
