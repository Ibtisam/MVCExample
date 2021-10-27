package com.example.mvcexample;

import android.app.Activity;
import android.widget.TextView;

public class MainModel {
    private String text;
    private String regNumber;
    private String name;
    private Activity activity;

    public MainModel(Activity activity){
        this.activity = activity;
        text = "This is the default text";
    }

    public String getText(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void setDataOnView(){
        TextView textView = activity.findViewById(R.id.textView);
        textView.setText(text);
    }

    public void getAllName(){

    }
}
