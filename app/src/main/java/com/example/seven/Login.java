package com.example.seven;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView registrar = (TextView)findViewById(R.id.RegistroLogin);
        registrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                Intent registrar = new Intent(Login.this,Registrar.class);
                Login.this.startActivity(registrar);
                finish();
            }
        });
    }
}
