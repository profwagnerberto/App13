package br.com.aluno.app13;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
  private TextView mTVUsuariRecebido;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    mTVUsuariRecebido = findViewById(R.id.tvUsuariRecebido);
    Intent intent = getIntent();
    mTVUsuariRecebido.setText( intent.getStringExtra("usuario") );
  }

  public void Enviar(View v){
    Intent sendIntent = new Intent();
    sendIntent.setAction(Intent.ACTION_SEND);
    sendIntent.putExtra(Intent.EXTRA_TEXT, "teste");
    sendIntent.setType("text/plain");
    if (sendIntent.resolveActivity(getPackageManager()) != null)
      startActivity(sendIntent);
  }
}