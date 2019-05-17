package com.jacky.jerkins;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tv_url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_url = findViewById(R.id.tv_url);
        tv_url.setText(BuildConfig.FLAVOR + BuildConfig.BUILD_TYPE + "develop");
    }
}
