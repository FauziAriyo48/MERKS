package com.example.merks;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
public class DetailActivity extends AppCompatActivity {
    public static final String ASAL= "asal";
    public static final String NAMA = "nama";
    public static final String DESC = "desc";
    public static final String FILOSOFI = "filosofi";
    public static final String LOGO = "logo";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ImageView imageView = findViewById(R.id.img_item_photo);
        String logo = getIntent().getStringExtra(LOGO);
        Glide.with(this)
                .load(logo)
                .apply(new RequestOptions().override(200, 200))
                .into(imageView);
        TextView txtasal = findViewById(R.id.tv_item_name);
        String asal ="asal: "+ getIntent().getStringExtra(ASAL);
        txtasal.setText(asal);
        TextView txtnama = findViewById(R.id.tv_item_from);
        String nama ="nama: "+getIntent().getStringExtra(NAMA);
        txtnama.setText(nama);
        TextView txtdesc = findViewById(R.id.tv_item_description);
        String desc = "desc: "+ getIntent().getStringExtra(DESC);
        txtdesc.setText(desc);
        TextView txtfilosofi = findViewById(R.id.tv_item_stadium);
        String filosofi = "filosofi: " + getIntent().getStringExtra(FILOSOFI);
        txtfilosofi.setText(filosofi);

    }
}