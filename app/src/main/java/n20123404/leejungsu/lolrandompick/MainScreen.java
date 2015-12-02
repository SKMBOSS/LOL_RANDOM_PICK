package n20123404.leejungsu.lolrandompick;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);
    }

    public void onClick_01(View v) {
        Intent intent_01 = new Intent(getApplicationContext(),allScreen.class);
        startActivity(intent_01);
    }
}

