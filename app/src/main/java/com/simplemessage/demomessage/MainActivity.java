package com.simplemessage.demomessage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView simpleMessageTextView = (TextView) findViewById(R.id.simgpleMessageTextView);
//        simpleMessageTextView.setText(MessageKit.getSimpleMessage("ABC"));
    }
}
