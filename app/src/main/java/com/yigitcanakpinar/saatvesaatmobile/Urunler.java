package com.yigitcanakpinar.saatvesaatmobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class Urunler extends Activity {


    public List<ExampleData> b = new ArrayList<ExampleData>() {
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.urun_liste);

        b.add(new ExampleData("Product 1", "Product 1 Description", "10", "10 TL"));
        b.add(new ExampleData("Product 2", "Product 2 Description", "20", "20 TL"));
        b.add(new ExampleData("Product 3", "Product 3 Description", "30", "30 TL"));
        b.add(new ExampleData("Product 4", "Product 4 Description", "40", "40 TL"));
        b.add(new ExampleData("Product 5", "Product 5 Description", "50", "50 TL"));
        b.add(new ExampleData("Product 6", "Product 6 Description", "60", "60 TL"));
        b.add(new ExampleData("Product 7", "Product 7 Description", "70", "70 TL"));
        b.add(new ExampleData("Product 8", "Product 8 Description", "80", "80 TL"));
        b.add(new ExampleData("Product 9", "Product 9 Description", "90", "90 TL"));
        b.add(new ExampleData("Product 10", "Product 10 Description", "100", "100 TL"));

        final ListView listemiz = (ListView) findViewById(R.id.lv);
        final SaatveSaatAdapter adaptorumuz = new SaatveSaatAdapter(this, b);
        listemiz.setAdapter(adaptorumuz);

        listemiz.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Toast.makeText(getApplicationContext(),"1-"+Integer.toString(i), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), UrunDetayi.class);
                ExampleData a = new ExampleData(adaptorumuz.getItem(i).getName(),adaptorumuz.getItem(i).getDesc(),adaptorumuz.getItem(i).getStock(),adaptorumuz.getItem(i).getPrice());
                intent.putExtra("deneme", a);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });


    }


}
