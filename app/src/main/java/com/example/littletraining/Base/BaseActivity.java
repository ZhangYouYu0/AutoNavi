package com.example.littletraining.Base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity <I extends BasePresenter> extends AppCompatActivity implements BaseView {

    private I presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutID());
        if(presenter==null){
            presenter=add();
            presenter.attachView(this);
        }
        initView();
        initData();

    }
    protected abstract int getLayoutID();
    protected abstract void initData();
    protected abstract void initView();
    public abstract I add();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        presenter.setImode();
    }
}
