package gr.aueb.cf.registrationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity {

    private TextView textViewWelcome;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        textViewWelcome = findViewById(R.id.textView5);
        imageView = findViewById(R.id.imageView);

        String username = getIntent().getStringExtra("username");
        String email = getIntent().getStringExtra("email");

        String welcomeMessage = "Welcome " + username + ". Your registration with " + email + " was completed.";
        textViewWelcome.setText(welcomeMessage);
    }
}