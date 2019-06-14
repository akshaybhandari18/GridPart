package com.example.gridpart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book_Activity extends AppCompatActivity {
    private TextView tvtitle,tvdescription,tvcategory;
    private ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_);
        tvtitle = findViewById(R.id.txttitle);
        tvdescription=findViewById(R.id.txtDesc);
        tvcategory = findViewById(R.id.txtCat);
        img = findViewById(R.id.bookthumbnail);



        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        String Description = intent.getExtras().getString("Description");
        int image = intent.getExtras().getInt("Thumbnail");
        String Category = intent.getExtras().getString("Category");
        //Setting values
        tvtitle.setText(Title);
        tvdescription.setText(Description);
        img.setImageResource(image);
        tvcategory.setText(Category);
    }
}
