package com.example.littletraining.Base;

public abstract class BasePresenter <I extends BaseView,M extends BaseMode> {
    private I isview;
    private M imode;

    public void attachView(I i){
        this.isview=i;
        imode=setImode();
    }

    public abstract M setImode();

    public void onAdettchView(){
        imode=null;
        isview=null;
    }
}
