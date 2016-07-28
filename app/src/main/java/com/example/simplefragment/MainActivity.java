package com.example.simplefragment;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivityTAG_";
    private Button Btn1;
    private FrameLayout Frame1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Btn1 = (Button) findViewById(R.id.button1);

        FrameLayout Frame1 = (FrameLayout) findViewById(R.id.frame1);

        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager
                .beginTransaction()
                .add(R.id.frame1, new BlankFragment())
                .commit();
    }
}
