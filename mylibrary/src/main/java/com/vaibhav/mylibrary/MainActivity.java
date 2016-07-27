package com.vaibhav.mylibrary;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String key = "joke";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.joke_telling_activity);

        String joke = getIntent().getStringExtra(key);
        TextView viewById = (TextView) findViewById(R.id.joke_text_view);
        if (joke != null && viewById != null) {
            viewById.setText(joke);
        } else {
            if (viewById != null) {
                viewById.setText(getString(R.string.no_joke));
            }
        }


    }
}
