package id.or.codelabs.godate;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        getSupportActionBar().setTitle("Login");
    }

    public void btnLogin(View v){
        Intent iLogin = new Intent(getApplicationContext(),Login.class);
        startActivity(iLogin);
    }
}
