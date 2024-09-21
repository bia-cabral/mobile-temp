package com.aula.appbimo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class Tela_Login extends AppCompatActivity {

    AppCompatButton btn_voltar, btn_entrar;
    TextView esqueciMinhaSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_login);

        btn_voltar = findViewById(R.id.btn_voltar);
        btn_entrar = findViewById(R.id.btn_entrar);

        esqueciMinhaSenha = findViewById(R.id.EsqueciMinhaSenha);

        btn_voltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Login.this, Tela_LoginCadastro.class);
                startActivity(intent);
            }
        });

        btn_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Login.this, Tela_Inicial.class);
                startActivity(intent);
            }
        });

        esqueciMinhaSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tela_Login.this, Tela_EsqueciMinhaSenha.class);
                startActivity(intent);
            }
        });
    }
}