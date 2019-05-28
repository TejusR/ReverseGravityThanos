package com.shambu.reversegravitythanos;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int c=0;
    private long backpresstime;
    private Toast backToast;
    private ImageView vstone;
    private ObjectAnimator objani;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        vstone=(ImageView)findViewById(R.id.powerStone);
    }

    @Override
    public void onBackPressed() {
        if(backpresstime + 2000 > System.currentTimeMillis()){
            backToast.cancel();
            super.onBackPressed();
            return;
        }
        else{
            backToast = Toast.makeText(getApplicationContext(),"Press back again to exit", Toast.LENGTH_SHORT);
            backToast.show();
        }

        backpresstime = System.currentTimeMillis();
    }



    public void ontouch(View v){
        int orientation = getResources().getConfiguration().orientation;
        Display display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        float height = (float) size.y;
        if(orientation== Configuration.ORIENTATION_PORTRAIT) {
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
        else {
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

        public void hkermode(View view){
         startActivity(new Intent(MainActivity.this, hackermode.class));
        }



}




