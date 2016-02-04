package id.or.codelabs.godate;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class Profil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        getSupportActionBar().setTitle("Profil");
        getSupportActionBar().setSubtitle("Bayu Firmawan Paoh");
        getSupportActionBar().setHomeButtonEnabled(true);

    }
}
