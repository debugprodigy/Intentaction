package android.example.intentaction;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button google = findViewById(R.id.google);
        Button youtube = findViewById(R.id.youtube);
        Button instagram = findViewById(R.id.instagram);

        google.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("QueryPermissionsNeeded")
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("https://www.google.com/search?q="+"Boat wearables");
                Intent gSearchIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(gSearchIntent);
            }
        });

        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.youtube.com/watch?v="+"_Yhyp-_hX2s");
                Intent ySearchIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(ySearchIntent);
            }
        });

        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri uri = Uri.parse("http://www.instagram.com/"+"developers_team");
                Intent igSearchIntent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(igSearchIntent);
            }
        });
    }
}