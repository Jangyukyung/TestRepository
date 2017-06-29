package com.mycompany.myapplication.activity;

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
        ReviewList reviewList=new ReviewList(this);
        frameLayout.addView(reviewList);

        for(int i=0; i<=10; i++) {
            Review review = new Review();
            review.setPhoto(R.drawable.member1);
            review.setTitle("ListView 와 Adapter");
            review.setStar(R.drawable.star10);
            review.setContent("Adapter는 item xml을 inflation 해서 데이터를 세팅한 다음 listView에 제공하는 역할");
            reviewList.addItem(review);
        }
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
        frameLayout.removeAllViews();
        FoodList foodList=new FoodList(this);
        frameLayout.addView(foodList);

        for(int i=1; i<=6; i++) {
            Food food = new Food();
            food.setFno(i);
            food.setFname("삼겹살" +i);
            food.setFphoto(getResources().getIdentifier("food" +i, "drawable", getPackageName()));
            food.setFstar(getResources().getIdentifier("star" +i, "drawable", getPackageName()));
            food.setFdesc("ㅎㅎㅎㅎㅎ");
            foodList.addItem(food);
        }
    }
    public void handleButton3(View v){
        frameLayout.removeAllViews();
        PictureList pictureList=new PictureList(this);
        frameLayout.addView(pictureList);

        for(int i=1; i<=9; i++) {
            Picture picture = new Picture();
            picture.setPno(i);
            picture.setPtitle("   Picture " +i);
            picture.setPphoto(getResources().getIdentifier("picture" +i, "drawable", getPackageName()));
            picture.setPstar(getResources().getIdentifier("star" +i, "drawable", getPackageName()));
            picture.setPcontent("ㅎㅎㅎㅎㅎㅣㅣ히히히히히");
            pictureList.addItem(picture);
        }
    }
}
