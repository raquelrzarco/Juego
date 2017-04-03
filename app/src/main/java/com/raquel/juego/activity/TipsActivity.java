package com.raquel.juego.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.raquel.juego.R;
import com.raquel.juego.bean.TipsBean;
import com.raquel.juego.fragments.TipsFragment;

public class TipsActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView descripciontips;
    private TextView tip1;
    private TextView tip2;
    private TextView tip3;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        descripciontips = (TextView) findViewById(R.id.descripciontips);
        tip1 = (TextView) findViewById(R.id.tip1);
        tip2 = (TextView) findViewById(R.id.tip2);
        tip3 = (TextView) findViewById(R.id.tip3);
        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        Intent intent = getIntent();
        TipsBean tipsBean = (TipsBean) intent.getSerializableExtra(TipsFragment.TIPS_KEY);

        descripciontips.setText(tipsBean.getPresentaciontip());
        tip1.setText(tipsBean.getTip1());
        tip2.setText(tipsBean.getTip2());
        tip3.setText(tipsBean.getTip3());

        btnCompartir.setOnClickListener(this);

    }
    // boton compartir
    @Override
    public void onClick(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text");

        intent.putExtra(Intent.EXTRA_TEXT, String.valueOf(descripciontips));
        startActivity(intent);
    }
}
