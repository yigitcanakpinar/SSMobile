package com.yigitcanakpinar.saatvesaatmobile;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class UrunDetayi extends Activity {

    TextView tvname,tvdesc,tvstock,tvprice;

    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urun_detayi);

        ExampleData item = (ExampleData) getIntent().getSerializableExtra("deneme");
        Integer position = getIntent().getIntExtra("position",0);

        tvname = (TextView) findViewById(R.id.tv_name);
        tvdesc = (TextView) findViewById(R.id.tv_desc);
        tvstock = (TextView) findViewById(R.id.tv_stock);
        tvprice = (TextView) findViewById(R.id.tv_price);

        tvname.setText(item.getName());
        tvdesc.setText(item.getDesc());
        tvstock.setText(item.getStock());
        tvprice.setText(item.getPrice());

        imageView = (ImageView) findViewById(R.id.pimage);


            if (position % 4 == 0) {
                imageView.setImageResource(R.drawable.gant);
            } else if (position % 4 == 1) {
                imageView.setImageResource(R.drawable.tommy);
            } else if (position % 4 == 2) {
                imageView.setImageResource(R.drawable.armani);
            } else {
                imageView.setImageResource(R.drawable.diesel);
            }

    }
}
