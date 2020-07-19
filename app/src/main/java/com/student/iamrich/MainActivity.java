package com.student.iamrich;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    protected int count = 2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void animateIt(View view) {
        float i = view.getScaleX();
        if(  i < this.count)
        {
            view.setScaleX(i+0.25f);
            view.setScaleY(i+0.25f);
            view.setTransitionAlpha(25);
        }
    }
}