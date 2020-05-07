package com.example.seven;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Registrar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);
        final EditText nombreT      =(EditText)findViewById(R.id.NombreRegistrarse);
        final EditText dniT         =(EditText)findViewById(R.id.DNIRegistrarse);
        final EditText telefonoT    =(EditText)findViewById(R.id.TelefonoRegistrarse);
        final EditText passwordT    =(EditText)findViewById(R.id.PasswordRegistrarse);
        final EditText emailT       =(EditText)findViewById(R.id.emailRegistrarse);
        Button btnRegistrar         =(Button)findViewById(R.id.btnRegistrarse);
        btnRegistrar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view){
                String nombre       = nombreT.getText().toString();
                int dni             = Integer.parseInt(dniT.getText().toString());
                int telefono        = Integer.parseInt(telefonoT.getText().toString());
                String password     = passwordT.getText().toString();
                String email        = emailT.getText().toString();
            }
        });
    }
}
