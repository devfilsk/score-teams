package com.example.filipemaciel.scoreteams;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.edtLogin)
    EditText login;
    @BindView(R.id.edtSenha)
    EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_logar)
    public void logar(){
        boolean logando = autentication(this.login.getText().toString(), this.senha.getText().toString());
        if(logando){
            Intent i = new Intent(this, HomeActivity.class);
            startActivity(i);
        }else{
            Toast.makeText(this, "Usuario e/ou senha inválidos!", Toast.LENGTH_SHORT).show();
        }

    }

    public boolean autentication(String usuario, String senha){
        if(usuario.trim().isEmpty() || senha.trim().isEmpty()){
            Toast.makeText(this, "Digita aí, animal dê têtas!", Toast.LENGTH_SHORT).show();
            return false;
        }

        if(usuario.equals("filipe") && senha.equals("bonitao")){
            return true;
        }else{
            return false;
        }
    }

}
