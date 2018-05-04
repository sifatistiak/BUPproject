package testing.gps_location;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b;
    private TextView t,t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


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
        String btext = null;
        if ((userName.equals("bus1")) && (passWord.equals("1234"))) {
            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
            intent.putExtra("dbase","bus1");
            startActivity(intent);

        } else {
            Toast.makeText(getApplicationContext(), "Incorrect/Invalid Inputs", Toast.LENGTH_SHORT).show();
        }

    }
}


