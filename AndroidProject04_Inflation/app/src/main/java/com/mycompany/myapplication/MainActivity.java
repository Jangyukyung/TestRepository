package com.mycompany.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    private static final String TAG="MainActivity";
    private LinearLayout linearLayoutTop;
    private FrameLayout frameLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayoutTop=(LinearLayout) findViewById(R.id.linearLayoutTop);
        frameLayout=(FrameLayout) findViewById(R.id.frameLayout);
    }

    public void handleRadioButton1(View v){
        linearLayoutTop.setBackgroundResource(R.drawable.photo1);
    }
    public void handleRadioButton2(View v){
        linearLayoutTop.setBackgroundResource(R.drawable.photo2);
    }
    public void handleRadioButton3(View v){
        linearLayoutTop.setBackgroundResource(R.drawable.photo3);
    }


    public void handleButton1(View v){
        frameLayout.removeAllViews();

        Content1 content1=new Content1(this);
        frameLayout.addView(content1);

        for(int i=1; i<=10; i++) {
            Item1 item = new Item1();
            item.setPhoto(getResources().getIdentifier("member" + i ,"drawable",getPackageName()));
            item.setTitle("안녕 " + i );
            //item.setStar(R.drawable.star10);
            item.setStar(getResources().getIdentifier("star" + i ,"drawable",getPackageName()));
            item.setContent("자바자바자바 반복학습을 꼭 해야 합니다 ! ");

            content1.addItem(item);
        }

        //1)
        //LayoutInflater inflater=getLayoutInflater();
        //2)
        //LayoutInflater inflater=LayoutInflater.from(this);
        //3)
        //LayoutInflater inflater= (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //1)
        //View view=inflater.inflate(R.layout.content1,null);
        //frameLayout.addView(view);
        //2)
        //View view=inflater.inflate(R.layout.content1,frameLayout,false);
        //frameLayout.addView(view);

        //3)
        //inflater.inflate(R.layout.content1,frameLayout);
        //4)
        //inflater.inflate(R.layout.content1,frameLayout,true);

    }
    public void handleButton2(View v){

    }
    public void handleButton3(View v){

    }
}
