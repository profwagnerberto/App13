package br.com.aluno.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Acesso extends AppCompatActivity {
  private EditText mETUsuario, mETSenha;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_acesso);
    mETUsuario = findViewById(R.id.etUsuario);
    mETSenha = findViewById(R.id.etSenha);
  }

  public void MostrarPrincipal(View v){
    mETSenha.setText(mETUsuario.getText());
    Intent intent = new Intent(this, MainActivity.class);
    intent.putExtra("usuario", mETUsuario.getText().toString() );
    startActivity(intent);
  }
}