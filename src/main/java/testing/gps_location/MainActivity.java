package testing.gps_location;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    private Button b;
    private TextView t,t1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);


        t = (TextView) findViewById(R.id.editText2);
        t1 = (TextView) findViewById(R.id.editText);
        b = (Button) findViewById(R.id.button2);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

            }
        });
    }
}


