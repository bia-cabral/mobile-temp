package com.aula.appbimo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Tela_LoginCadastro extends AppCompatActivity {
    AppCompatButton btn_login, btn_cadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_login_cadastro);

        btn_login = findViewById(R.id.btn_login);
        btn_cadastro = findViewById(R.id.btn_cadastro);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_LoginCadastro.this, Tela_Login.class);
                startActivity(intent);

            }
        });

        btn_cadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_LoginCadastro.this, Tela_Cadastro.class);
                startActivity(intent);
            }
        });
    }
}