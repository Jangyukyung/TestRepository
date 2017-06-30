package com.mycompany.myapplication.content;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.mycompany.myapplication.R;
import com.mycompany.myapplication.dto.Food;
import com.mycompany.myapplication.dto.Picture;

import java.util.ArrayList;
import java.util.List;

public class PictureList extends LinearLayout{

    private ListView listView;
    private List<Picture> list = new ArrayList<>();
    private ItemAdapter itemAdapter;

    public PictureList(Context context) {
        super(context);
        //ListView 생성
        LayoutInflater inflater= LayoutInflater.from(context);
        listView=(ListView) inflater.inflate(R.layout.picture_list,null);

        itemAdapter=new ItemAdapter();
        listView.setAdapter(itemAdapter);
        //ListView 를 내용으로 추가
        addView(listView);
    }

    class ItemAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public Object getItem(int position) {
            return list.get(position);
        }

        @Override
        public long getItemId(int position) {
            return list.get(position).getPno();
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            if(convertView==null) {
                //Item UI 객체 생성(Inflation)
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.picture_item, null);
            }
            //데이터 세팅
            ImageView pphoto =(ImageView) convertView.findViewById(R.id.pphoto);
            TextView ptitle=(TextView) convertView.findViewById(R.id.ptitle);
            ImageView pstar=(ImageView) convertView.findViewById(R.id.pstar);
            TextView pcontent=(TextView) convertView.findViewById(R.id.pcontent);

            Picture picture= list.get(position);

            pphoto.setImageResource(picture.getPphoto());
            ptitle.setText(picture.getPtitle());
            pstar.setImageResource(picture.getPstar());
            pcontent.setText(picture.getPcontent());

            return convertView;
        }
    }

    public void addItem(Picture item){
        list.add(item);
        itemAdapter.notifyDataSetChanged();
    }

    public void removeItem(Picture item){
        list.remove(item);
        itemAdapter.notifyDataSetChanged();
    }
}
