package androidsamples.java.greetings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greeting = findViewById(R.id.greeting);
        //greeting.setText("Welcome via Java!");
        greeting.setText(getResources().getString(R.string.welcome));
        greeting.setTextColor(getResources().getColor(R.color.green));
    }
}