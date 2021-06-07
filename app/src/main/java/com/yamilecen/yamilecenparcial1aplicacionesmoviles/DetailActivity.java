package com.yamilecen.yamilecenparcial1aplicacionesmoviles;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.yamilecen.yamilecenparcial1aplicacionesmoviles.model.ItemList;
import android.os.Bundle;

public class DetailActivity extends AppCompatActivity {
    private ImageView imgItemDetail,imgCaracteristicasDetail;
    private Button btnregresar;
    private TextView tvTituloDetail;
    private ItemList itemDetail;
    private TextView tvDescripcionDetail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        initViews();
        initValues();
        btnregresar = findViewById(R.id.btnregresar);
        btnregresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });
    }
    private void initViews(){
        imgItemDetail = findViewById(R.id.tvimgItemDetail);
        tvTituloDetail = findViewById(R.id.tvTituloDetail);
        tvDescripcionDetail = findViewById(R.id.tvDescripcionDetail);
        imgCaracteristicasDetail = findViewById(R.id.tvcaracteristicasItemDetail);
    }
    private void initValues(){
        itemDetail = (ItemList) getIntent().getExtras().getSerializable("itemDetail");
        imgItemDetail.setImageResource(itemDetail.getImgResource());
        tvTituloDetail.setText(itemDetail.getTitulo());
        tvDescripcionDetail.setText(itemDetail.getDescripcion());
        imgCaracteristicasDetail.setImageResource(itemDetail.getImgCaracteristicas());


    }
}