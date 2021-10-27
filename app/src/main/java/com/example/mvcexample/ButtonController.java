package com.example.mvcexample;

import android.app.Activity;
import android.view.View;

public class ButtonController implements View.OnClickListener{
    private MainModel mainModel;
    private Activity activity;

    public ButtonController(Activity activity){
        this.activity = activity;
        mainModel = new MainModel(activity);
    }
    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){
            mainModel.setDataOnView();
        }
    }
}
