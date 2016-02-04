package id.or.codelabs.godate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().setTitle("Login");
    }

    public void btnLogin(View v){
        Intent iProfil = new Intent(getApplicationContext(),Profil.class);
        startActivity(iProfil);
    }

    public void btnRegister(View v){
        Intent iRegister = new Intent(getApplicationContext(),Register.class);
        startActivity(iRegister);
    }

}
