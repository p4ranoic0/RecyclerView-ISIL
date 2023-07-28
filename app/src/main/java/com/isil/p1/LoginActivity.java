package com.isil.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText txtUser, txtPass;
    Button btnIngresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        txtUser = findViewById(R.id.etUsuario);
        txtPass = findViewById(R.id.etContrasena);
        btnIngresar = findViewById(R.id.btnIngresar);
        btnIngresar.setOnClickListener(view -> {
            String usuario = txtUser.getText().toString();
            String password = txtPass.getText().toString();
            if (usuario.equals("alumno") && password.equals("123")){
                Toast.makeText(this, "Bienvenido :  "+usuario, Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this, HomeActivity.class));
                finish();
            }else{
                Toast.makeText(this, "Los datos son errados", Toast.LENGTH_SHORT).show();
            }
        });
    }
}