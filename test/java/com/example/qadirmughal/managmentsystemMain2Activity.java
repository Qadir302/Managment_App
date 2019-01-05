package com.example.qadirmughal.managmentsystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
     private EditText Name;
     private EditText Password;
    private Button Login;
    private int Counter=5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Name = (EditText) findViewById(R.id.etname);
        Password = (EditText) findViewById(R.id.etpassword);
        Login = (Button) findViewById(R.id.btnLogin);
        Login.setOnClickListener(new View.OnClickListner()
        {
            private void onClick(View view){
                validate(Name.getText().toString(), Password.getText().toString());
            }
        });

    }
    private void validate(String userName,String userPassword){

        if ((userName == "admin") && (userPassword == "123456")){

            Intent i = new Intent(Main2Activity.this, activity3.class);
            startActivity(i);
        }else{
            Counter--;
            if(Counter==0);
            Login.setEnabled(false);
             //else system.Out.println('heloo');


        }



    }




}
