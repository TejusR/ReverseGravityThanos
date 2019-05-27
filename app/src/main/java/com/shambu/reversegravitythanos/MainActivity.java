package com.shambu.reversegravitythanos;

import android.animation.ObjectAnimator;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    int c=0;
    private ImageView vstone;
    private ObjectAnimator objani;
    private LinearLayout lila;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        vstone=(ImageView)findViewById(R.id.powerStone);
        lila = (LinearLayout)findViewById(R.id.mainlayout);
    }



    public void ontouch(View v){
            Display display = getWindowManager().getDefaultDisplay();
            Point size = new Point();
            display.getSize(size);
            float width = (float) size.x;
            float height = (float) size.y;
            if (c % 2 == 0) {
                objani = ObjectAnimator.ofFloat(vstone, "y", height);
                objani.setDuration(2000);
                objani.start();
            }
            if (c % 2 == 1) {
                objani = ObjectAnimator.ofFloat(vstone, "y", 0);
                objani.setDuration(2000);
                objani.start();
            }
            c++;
        }



}




