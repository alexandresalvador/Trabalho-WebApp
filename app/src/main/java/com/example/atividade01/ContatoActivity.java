package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContatoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contato);
    }
    public void Voltar_pagina( View view) {
        Intent intent = new Intent (this, CarrinhoActivity.class);
        startActivity(intent);
    }
}