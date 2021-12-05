package com.yde.sapiensdelivery.controllers;

import android.content.Intent;
import android.view.View;
import android.widget.Button;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.yde.sapiensdelivery.R;

public class CustomerActivity extends AppCompatActivity {
    private Button button1;
    private Button button2;
    private Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        button1 = (Button) findViewById(R.id.profile);
        button2 = (Button) findViewById(R.id.status);
        button3 = (Button) findViewById(R.id.placeOrder);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent = new Intent( CustomerActivity.this, ProfileActivity.class);
//                startActivity(intent);
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Intent intent = new Intent( CustomerActivity.this, OrderStatusActivity.class);
//                startActivity(intent);
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent( CustomerActivity.this, ShoppingListCreationActivity.class);
                startActivity(intent);
            }
        });
    }
}