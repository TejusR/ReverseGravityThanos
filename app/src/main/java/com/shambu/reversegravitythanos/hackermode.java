package com.shambu.reversegravitythanos;

import android.animation.ObjectAnimator;
import android.content.res.Configuration;
import android.graphics.Point;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.widget.ImageView;

import java.util.Random;

public class hackermode extends AppCompatActivity {

    float xcor,ycor;
    int c=0;
    private ImageView img_1, img_2, img_3, img_4, img_5;
    private ObjectAnimator objani_1, objani_2, objani_3, objani_4, objani_5;
    private Display display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hackermode);
        img_1=(ImageView)findViewById(R.id.imageView1);
        img_2=(ImageView)findViewById(R.id.imageView2);
        img_3=(ImageView)findViewById(R.id.imageView3);
        img_4=(ImageView)findViewById(R.id.imageView4);
        img_5=(ImageView)findViewById(R.id.imageView5);
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        View decorView = getWindow().getDecorView();
        if(hasFocus){
            decorView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                    | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                    | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                    | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
        }
    }




    public void rndloc(View v2){

        display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height =size.y;
        Random r1 = new Random();
        xcor = (float) r1.nextInt((width-60)-60) + 60;
        ycor = (float) r1.nextInt((height-60)-0) + 0;
        img_1.setX(xcor);
        img_1.setY(ycor);
        Random r2 = new Random();
        xcor = (float) r2.nextInt((width-60)-60) + 60;
        ycor = (float) r2.nextInt((height-60)-0) + 0;
        img_2.setX(xcor);
        img_2.setY(ycor);
        Random r3 = new Random();
        xcor = (float) r3.nextInt((width-60)-60) + 60;
        ycor = (float) r3.nextInt((height-60)-0) + 0;
        img_3.setX(xcor);
        img_3.setY(ycor);
        Random r4 = new Random();
        xcor = (float) r4.nextInt((width-60)-60) + 60;
        ycor = (float) r4.nextInt((height-60)-0) + 0;
        img_4.setX(xcor);
        img_4.setY(ycor);
        Random r5 = new Random();
        xcor = (float) r5.nextInt((width-60)-60) + 60;
        ycor = (float) r5.nextInt((height-60)-0) + 0;
        img_5.setX(xcor);
        img_5.setY(ycor);

    }

    public void genani(View v1){
        int orientation = getResources().getConfiguration().orientation;
        display = getWindowManager().getDefaultDisplay();
        Point size = new Point();
        display.getSize(size);
        int width = size.x;
        int height =size.y;
        if (orientation== Configuration.ORIENTATION_PORTRAIT){
            if(c%2==0){
                objani_1 = ObjectAnimator.ofFloat(img_1, "y", height);
                objani_2 = ObjectAnimator.ofFloat(img_2, "y", 0);
                objani_3 = ObjectAnimator.ofFloat(img_3, "y", height);
                objani_4 = ObjectAnimator.ofFloat(img_4, "y", height);
                objani_5 = ObjectAnimator.ofFloat(img_5, "y", 0);
                objani_1.setDuration(3000);
                objani_2.setDuration(3000);
                objani_3.setDuration(3000);
                objani_4.setDuration(3000);
                objani_5.setDuration(3000);
                objani_1.setInterpolator(new AccelerateInterpolator());
                objani_1.setInterpolator(new BounceInterpolator());
                objani_2.setInterpolator(new AccelerateInterpolator());
                objani_2.setInterpolator(new BounceInterpolator());
                objani_3.setInterpolator(new AccelerateInterpolator());
                objani_3.setInterpolator(new BounceInterpolator());
                objani_4.setInterpolator(new AccelerateInterpolator());
                objani_4.setInterpolator(new BounceInterpolator());
                objani_5.setInterpolator(new AccelerateInterpolator());
                objani_5.setInterpolator(new BounceInterpolator());
                objani_1.start();
                objani_5.start();
                objani_3.start();
                objani_2.start();
                objani_4.start();
            }
            if(c%2==1){
                objani_1 = ObjectAnimator.ofFloat(img_1, "y", 0);
                objani_2 = ObjectAnimator.ofFloat(img_2, "y", height);
                objani_3 = ObjectAnimator.ofFloat(img_3, "y", 0);
                objani_4 = ObjectAnimator.ofFloat(img_4, "y", 0);
                objani_5 = ObjectAnimator.ofFloat(img_5, "y", height);
                objani_1.setDuration(3000);
                objani_2.setDuration(3000);
                objani_3.setDuration(3000);
                objani_4.setDuration(3000);
                objani_5.setDuration(3000);
                objani_1.setInterpolator(new AccelerateInterpolator());
                objani_1.setInterpolator(new BounceInterpolator());
                objani_2.setInterpolator(new AccelerateInterpolator());
                objani_2.setInterpolator(new BounceInterpolator());
                objani_3.setInterpolator(new AccelerateInterpolator());
                objani_3.setInterpolator(new BounceInterpolator());
                objani_4.setInterpolator(new AccelerateInterpolator());
                objani_4.setInterpolator(new BounceInterpolator());
                objani_5.setInterpolator(new AccelerateInterpolator());
                objani_5.setInterpolator(new BounceInterpolator());
                objani_1.start();
                objani_5.start();
                objani_3.start();
                objani_2.start();
                objani_4.start();
            }
            c++;
        }
        else{
            if(c%2==0){
                objani_1 = ObjectAnimator.ofFloat(img_1, "y", height);
                objani_2 = ObjectAnimator.ofFloat(img_2, "y", 0);
                objani_3 = ObjectAnimator.ofFloat(img_3, "y", height);
                objani_4 = ObjectAnimator.ofFloat(img_4, "y", height);
                objani_5 = ObjectAnimator.ofFloat(img_5, "y", 0);
                objani_1.setDuration(3000);
                objani_2.setDuration(3000);
                objani_3.setDuration(3000);
                objani_4.setDuration(3000);
                objani_5.setDuration(3000);
                objani_1.setInterpolator(new AccelerateInterpolator());
                objani_1.setInterpolator(new BounceInterpolator());
                objani_2.setInterpolator(new AccelerateInterpolator());
                objani_2.setInterpolator(new BounceInterpolator());
                objani_3.setInterpolator(new AccelerateInterpolator());
                objani_3.setInterpolator(new BounceInterpolator());
                objani_4.setInterpolator(new AccelerateInterpolator());
                objani_4.setInterpolator(new BounceInterpolator());
                objani_5.setInterpolator(new AccelerateInterpolator());
                objani_5.setInterpolator(new BounceInterpolator());
                objani_1.start();
                objani_5.start();
                objani_3.start();
                objani_2.start();
                objani_4.start();
            }
            if(c%2==1){
                objani_1 = ObjectAnimator.ofFloat(img_1, "y", 0);
                objani_2 = ObjectAnimator.ofFloat(img_2, "y", height);
                objani_3 = ObjectAnimator.ofFloat(img_3, "y", 0);
                objani_4 = ObjectAnimator.ofFloat(img_4, "y", 0);
                objani_5 = ObjectAnimator.ofFloat(img_5, "y", height);
                objani_1.setDuration(3000);
                objani_2.setDuration(3000);
                objani_3.setDuration(3000);
                objani_4.setDuration(3000);
                objani_5.setDuration(3000);
                objani_1.setInterpolator(new AccelerateInterpolator());
                objani_1.setInterpolator(new BounceInterpolator());
                objani_2.setInterpolator(new AccelerateInterpolator());
                objani_2.setInterpolator(new BounceInterpolator());
                objani_3.setInterpolator(new AccelerateInterpolator());
                objani_3.setInterpolator(new BounceInterpolator());
                objani_4.setInterpolator(new AccelerateInterpolator());
                objani_4.setInterpolator(new BounceInterpolator());
                objani_5.setInterpolator(new AccelerateInterpolator());
                objani_5.setInterpolator(new BounceInterpolator());
                objani_1.start();
                objani_5.start();
                objani_3.start();
                objani_2.start();
                objani_4.start();
            }
            c++;
        }


    }
}
