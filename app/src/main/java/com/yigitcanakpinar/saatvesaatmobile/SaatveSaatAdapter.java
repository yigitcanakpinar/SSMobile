package com.yigitcanakpinar.saatvesaatmobile;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SaatveSaatAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<ExampleData> e;

    public SaatveSaatAdapter(Activity activity, List<ExampleData> e) {
        //XML'i alıp View'a çevirecek inflater'ı örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalım
        this.e = e;
    }

    @Override
    public int getCount() {
        return e.size();
    }

    @Override
    public ExampleData getItem(int position) {
        //şöyle de olabilir: public Object getItem(int position)
        return e.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = mInflater.inflate(R.layout.saatvesaat_lv, null);
        TextView tvname =
                (TextView) satirView.findViewById(R.id.lvname);

        TextView tvdesc =
                (TextView) satirView.findViewById(R.id.lvdesc);

        TextView tvstock =
                (TextView) satirView.findViewById(R.id.lvstock);

        TextView tvprice =
                (TextView) satirView.findViewById(R.id.lvprice);


        ImageView imageView =
                (ImageView) satirView.findViewById(R.id.simge);

        ExampleData e  = this.e.get(position);

        tvname.setText(e.getName());
        tvdesc.setText(e.getDesc());
        tvstock.setText(e.getStock());
        tvprice.setText(e.getPrice());

        if(position%4 ==0){
            imageView.setImageResource(R.drawable.gant);
        }
        else if(position%4 ==1){
            imageView.setImageResource(R.drawable.tommy);
        }
        else if(position%4 ==2){
            imageView.setImageResource(R.drawable.armani);
        }
        else {
            imageView.setImageResource(R.drawable.diesel);
        }



        return satirView;
    }

}
