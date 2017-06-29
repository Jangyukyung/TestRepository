package com.mycompany.myapplication.activity;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import com.mycompany.myapplication.content.FoodList;
import com.mycompany.myapplication.content.PictureList;
import com.mycompany.myapplication.content.ReviewList;
import com.mycompany.myapplication.dto.Food;
import com.mycompany.myapplication.dto.Picture;
import com.mycompany.myapplication.dto.Review;
import com.mycompany.myapplication.R;
import com.mycompany.myapplication.fragment.FoodListFragment;
import com.mycompany.myapplication.fragment.PictureListFragment;
import com.mycompany.myapplication.fragment.ReviewListFragment;

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
        ReviewListFragment rf= new ReviewListFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,rf);
        ft.commit();



        //pic1)
        //LayoutInflater inflater=getLayoutInflater();
        //pic2)
        //LayoutInflater inflater=LayoutInflater.from(this);
        //pic3)
        //LayoutInflater inflater= (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //pic1)
        //View view=inflater.inflate(R.layout.review_list,null);
        //frameLayout.addView(view);
        //pic2)
        //View view=inflater.inflate(R.layout.review_list,frameLayout,false);
        //frameLayout.addView(view);

        //pic3)
        //inflater.inflate(R.layout.review_list,frameLayout);
        //pic4)
        //inflater.inflate(R.layout.review_list,frameLayout,true);

    }
    public void handleButton2(View v){
        FoodListFragment ff= new FoodListFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,ff);
        ft.commit();
    }
    public void handleButton3(View v){
        PictureListFragment pf= new PictureListFragment();
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.replace(R.id.frameLayout,pf);
        ft.commit();
    }
}
