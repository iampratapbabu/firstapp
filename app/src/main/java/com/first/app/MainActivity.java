package com.first.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_1);

        button = (Button) findViewById(R.id.button1);

        View.OnClickListener ourOnclickListener = new View.OnClickListener(){
            @Override
            public void onClick(View view){

                setContentView(R.layout.activity_main);

            }
        };
        button.setOnClickListener(ourOnclickListener);
    }

}