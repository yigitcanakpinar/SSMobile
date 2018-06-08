package com.yigitcanakpinar.saatvesaatmobile;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN );
        setContentView(R.layout.activity_main);


        Thread splashThread = new Thread(){
            public void run(){
                try{
                    sleep(3000);//microsaniye cinsinden bekleme süresini verdik
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    //bekleme işlemi tamamlandıktan sonra ana dizine geçiş saglıyoruz.
                    Intent intent = new Intent(getApplicationContext(),Urunler.class);
                    startActivity(intent);
                }
            }
        };
        //bekleme işlemini üslenen thread methodu çagırıldı.
        splashThread.start();


    }
}
