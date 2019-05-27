package com.shambu.reversegravitythanos;

import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int c=0;
    private ImageView vstone;
    private Animation transYd;
    private Animation transYu;
    private TextView coors;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        vstone=(ImageView)findViewById(R.id.powerStone);
        coors = (TextView)findViewById(R.id.textView);

    }

    public void ontouch(View v){
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height = size.y;
        coors.setText("X is: "+width+"\nY is: "+height);
        if (c%2==0) {
            transYd = new TranslateAnimation(0, 0, 0, height);
            transYd.setDuration(2000);
            transYd.setFillAfter(true);
            vstone.startAnimation(transYd);
        }
        if (c % 2==1){
            transYu = new TranslateAnimation(0, 0, height, 0);
            transYu.setDuration(2000);
            transYu.setFillAfter(true);
            vstone.startAnimation(transYu);
        }
        c++;
    }

}
