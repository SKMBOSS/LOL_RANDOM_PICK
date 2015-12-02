package n20123404.leejungsu.lolrandompick;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class allScreen extends AppCompatActivity {

    ImageView imageView;
    int imageViewArray[] = {
            R.drawable.gallio, R.drawable.gangple, R.drawable.garen, R.drawable.gragas, R.drawable.graves,
            R.drawable.nami, R.drawable.narr, R.drawable.nasus, R.drawable.nidali, R.drawable.nocturn,
            R.drawable.notil, R.drawable.nunu, R.drawable.darius, R.drawable.diana, R.drawable.draven,
            R.drawable.raize, R.drawable.rammus, R.drawable.lux, R.drawable.rummble, R.drawable.reneton,
            R.drawable.leona, R.drawable.reksai,R.drawable.rengar,R.drawable.rucian, R.drawable.rulu,
            R.drawable.rblang, R.drawable.leesin, R.drawable.riven, R.drawable.risandra, R.drawable.masteryi,
            R.drawable.maokai, R.drawable.maljaha, R.drawable.malfight, R.drawable.modekaizer, R.drawable.morgana,
            R.drawable.mundo, R.drawable.missfortune, R.drawable.vad, R.drawable.varus, R.drawable.vi,
            R.drawable.veiga, R.drawable.vain, R.drawable.velcoz, R.drawable.volbare, R.drawable.browoom,
            R.drawable.brand, R.drawable.vladimir, R.drawable.blitz, R.drawable.victor, R.drawable.bbobbi
    };
    Button selectButton;
    Boolean check =true;
    Random rand = new Random();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_screen);

        imageView = (ImageView) findViewById(R.id.imageView);
        selectButton = (Button) findViewById(R.id.selectButton);
    }

    public void onClick_back(View v) {
        finish();
    }

    public void onClick_select(View v) {


        if(check == true) {
            imageView.setImageResource(imageViewArray[rand.nextInt(50+1)%50]);
            check = false;
        }
        else {
            imageView.setImageResource(imageViewArray[rand.nextInt(50+1)%50]);
            check = true;
        }
    }
}
