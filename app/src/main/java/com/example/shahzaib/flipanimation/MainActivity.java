package com.example.shahzaib.flipanimation;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    /*Inshort:  Select a Property and five FromVaue & ToValue and start the animation*/

    ImageView frontImage, backImage;
    AnimatorSet leftIn, rightOut , rightIn, leftOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frontImage  = findViewById(R.id.frontImage);
        backImage = findViewById(R.id.backImage);

    }



    // perform leftIn & right out animation.  matlb profile picture flip ho aur check picture show ho
    public void leftIn_rightOut(View view)
    {
        leftIn = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.left_in_animation);
        rightOut = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.right_out_animation);


        leftIn.setTarget(frontImage);
        rightOut.setTarget(backImage);

        leftIn.start();
        rightOut.start();
    }


    // perform RightIn & LeftOut animation
    public void rightIn_leftOut(View view)
    {
        rightIn = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.right_in_animation);
        leftOut = (AnimatorSet) AnimatorInflater.loadAnimator(this,R.animator.left_out_animation);
        rightIn.setTarget(backImage);
        leftOut.setTarget(frontImage);

        rightIn.start();
        leftOut.start();


    }

}
