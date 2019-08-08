package com.example.pc_care;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Customer_Add_Details extends AppCompatActivity {


    Button cusaddbtn;
    Button cusviewbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer__add__details);


        cusaddbtn = (Button)findViewById(R.id.addcusbtn);
        cusviewbtn = (Button)findViewById(R.id.viewcusbtn);

        cusaddbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation addanimation = AnimationUtils.loadAnimation(Customer_Add_Details.this,R.anim.lefttoright);
                cusaddbtn.startAnimation(addanimation);

            }
        });

        cusviewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Animation viewanimation = AnimationUtils.loadAnimation(Customer_Add_Details.this,R.anim.righttoleft);
                cusviewbtn.startAnimation(viewanimation);

            }
        });












    }

}
