package com.dizu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView esqueceuSenha;
    Button   buttonEntrar;
    EditText campUsuario;
    EditText campoSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// aqui estou adicionando as minhas variaveis os elementos que fazem referencias aos elementos que contem o ID
        esqueceuSenha = findViewById(R.id.textViewEsqueceuSenha);
        buttonEntrar  = findViewById(R.id.btn_entrar);
        campUsuario   = findViewById(R.id.campo_usuario);
        campoSenha    = findViewById(R.id.campo_password);

//      Para monitorar os eventos do botao estarei usando Listener, para monitorar o clique usarei o onClick;
        buttonEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String texto  = campUsuario.getText().toString(); //pega o texto que está no campousuario e armazena em uma variavel
                esqueceuSenha.setText(texto); // adiciona o texto da variavel no textViewLabel 'esquceuSenha';
            }
        });



    }

}