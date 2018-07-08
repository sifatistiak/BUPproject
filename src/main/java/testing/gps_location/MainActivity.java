package testing.gps_location;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private TextView t,t1;
    private AdView mAdView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, "ca-app-pub-3167377388817554~6016626201");
        //MobileAds.initialize(this, "ca-app-pub-3940256099942544~3347511713");


        mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        t = (TextView) findViewById(R.id.username);
        t1 = (TextView) findViewById(R.id.password);
        b = (Button) findViewById(R.id.button2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(t.getText().toString(),t1.getText().toString());
            }
        });

    }
    private void validate(String userName, String passWord) {

        if ((userName.equals("bus1")) && (passWord.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("dbase","bus1");
            startActivity(intent);

        }

        if ((userName.equals("bus2")) && (passWord.equals("2345"))) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("dbase","bus2");
            startActivity(intent);

        }
        if ((userName.equals("bus3")) && (passWord.equals("3456"))) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("dbase","bus3");
            startActivity(intent);

        }
        else {
            Toast.makeText(getApplicationContext(), "Incorrect/Invalid Inputs", Toast.LENGTH_SHORT).show();
        }

    }
}


