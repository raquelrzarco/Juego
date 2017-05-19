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
    private TextView presentaciontip;
    private TextView tip1;
    private TextView numerotip;
    private Button btnCompartir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);
        presentaciontip = (TextView) findViewById(R.id.presentaciontip);
        tip1 = (TextView) findViewById(R.id.tip1);
        numerotip = (TextView) findViewById(R.id.numerotip);

        btnCompartir = (Button) findViewById(R.id.btnCompartir);

        Intent intent = getIntent();
        TipsBean tipsBean = (TipsBean) intent.getSerializableExtra(TipsFragment.TIPS_KEY);

        presentaciontip.setText(tipsBean.getPresentaciontip());
        tip1.setText(tipsBean.getTip1());
        numerotip.setText(tipsBean.getTip3());

        btnCompartir.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) { // boton compartir
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");

        intent.putExtra(Intent.EXTRA_TEXT, presentaciontip.getText());
        startActivity(intent);
    }
}
