package com.example.icui4cu.ndk_demo2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = (TextView)findViewById(R.id.TextView);

        libHelloJni lHJ=new libHelloJni();
        mTextView.setText(lHJ.getCLanguageString());
    }


}
