package com.example.merks;

import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView imageView = findViewById(R.id.imageView);
        String url = "https://i.imgur.com/8GKmHUE.jpeg";
        Glide.with(this)
                .load(url)
                .apply(new RequestOptions().override(290, 286))
                .into(imageView);
    }
}