package com.example.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class PedidoActivity extends AppCompatActivity {
public static final String MENSAGEM = "com.mobile.atividade01.MENSAGEM";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pedido);
    }
    public void abrirCarrinho(View novaView) {
        EditText mensagem = (EditText) findViewById(R.id.nome_input);
        String texto = mensagem.getText().toString();
        Intent intencao = new Intent ( this, CarrinhoActivity.class);
        startActivity(intencao);
    }
}