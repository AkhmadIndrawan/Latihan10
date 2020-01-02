package id.ac.poliban.mi.indrawan.latihan10;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referensi view ke object
        Button btPhone = findViewById(R.id.btPhone);
        Button btEmail = findViewById(R.id.btEmail);
        Button btWebsite = findViewById(R.id.btWebsite);
        Button btGeo = findViewById(R.id.btGeo);

        //event handling
        btPhone.setOnClickListener(v -> {
            Uri uri = Uri.parse("Tel: 087815559826");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

        btEmail.setOnClickListener(v -> {
            Uri uri = Uri.parse("mailto:aindrawan18@gmail.com");
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_VIEW);
            intent.setData(uri);
            startActivity(intent);
        });

        btWebsite.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/AkhmadIndrawan"))));

        btGeo.setOnClickListener(v -> startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("geo:40.7113399,-74.0263469"))));
        
    }
}
