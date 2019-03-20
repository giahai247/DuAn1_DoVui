package com.example.duan1;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.InterstitialAd;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_icon)
    ImageView imgIcon;
    AnimationDrawable ad;
    @BindView(R.id.btn_play_game)
    Button btnPlayGame;
    @BindView(R.id.linear_top)
    LinearLayout linearTop;
    @BindView(R.id.btn_high)
    Button btnHigh;
    @BindView(R.id.btn_game_difference)
    Button btnGameDifference;
    @BindView(R.id.btn_add_quessiton)
    Button btnAddQuessiton;
    private InterstitialAd interstitialAd;
    public static int count = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick({R.id.btn_high, R.id.btn_game_difference, R.id.btn_add_quessiton})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.btn_high:
                onBackPressed();
                break;
            case R.id.btn_game_difference:
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://play.google.com/store"));
                startActivity(intent);
                break;
            case R.id.btn_add_quessiton:
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://docs.google.com/forms/d/16nTt2Iqbewkllc24euq_zDeiwOmivgDN5tpPY-o4U24/edit"));
                startActivity(browserIntent);
                break;
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override
    public void onPause() {

       super.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();

    }

    @Override
    public void onDestroy() {
      super.onDestroy();
    }
}

