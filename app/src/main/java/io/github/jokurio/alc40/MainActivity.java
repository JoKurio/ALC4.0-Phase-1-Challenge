package io.github.jokurio.alc40;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchALC(View view) {

        Intent alcPage = new Intent(this, AboutALC.class);
        startActivity(alcPage);
    }


    public void launchProfile(View view) {
        Intent profile = new Intent(this, MyProfile.class);
        startActivity(profile);

    }
}
