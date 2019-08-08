package com.example.pc_care;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Update_Customer_Det extends AppCompatActivity {

    Button sendsmsbtn;
    EditText phonetnoxt;
    String phone;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update__customer__det);

        sendsmsbtn =(Button)findViewById(R.id.sendsmscusbtn);
        phonetnoxt = (EditText)findViewById(R.id.updatecusphonetxt);





    }

    public void sendSMS(View v)
    {
        phone = phonetnoxt.getText().toString();

        // The number on which you want to send SMS
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.fromParts("sms",phone, null)));
    }


}
