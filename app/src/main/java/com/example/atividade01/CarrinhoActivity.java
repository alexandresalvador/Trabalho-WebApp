package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class CarrinhoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carrinho);
    }
    public void abreContato( View view) {
        Intent intent = new Intent (this, ContatoActivity.class);
        startActivity(intent);
    }

    public void abrePerfil( View view) {
        Intent intent = new Intent (this, PerfilActivity.class);
        startActivity(intent);
    }
}