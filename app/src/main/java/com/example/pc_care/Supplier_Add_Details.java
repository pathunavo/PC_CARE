package com.example.pc_care;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class Supplier_Add_Details extends AppCompatActivity {


    Button addbtn;
    Button viewbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_supplier__add__details);


        addbtn = (Button)findViewById(R.id.supaddbtn);
        viewbtn = (Button)findViewById(R.id.supviewbtn);



        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Animation addanimation = AnimationUtils.loadAnimation(Supplier_Add_Details.this,R.anim.lefttoright);
                addbtn.startAnimation(addanimation);

            }
        });

        viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Animation viewanimation = AnimationUtils.loadAnimation(Supplier_Add_Details.this,R.anim.righttoleft);
                viewbtn.startAnimation(viewanimation);

            }
        });

    }

}
