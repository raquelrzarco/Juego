package com.raquel.juego.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

import com.raquel.juego.R;

public class TipsActivity extends AppCompatActivity {
    private TextView descripciontips;
    private RadioButton tip1;
    private RadioButton tip2;
    private RadioButton tip3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        descripciontips = (TextView) findViewById(R.id.descripciontips);
        tip1 = (RadioButton) findViewById(R.id.tip1);
        tip2 = (RadioButton) findViewById(R.id.tip2);
        tip3 = (RadioButton) findViewById(R.id.tip3);
    }
}
