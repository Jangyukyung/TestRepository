package com.mycompany.myapplication.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.mycompany.myapplication.R;

import com.mycompany.myapplication.dto.Picture;

import java.util.ArrayList;
import java.util.List;

public class PictureListFragment extends Fragment {
    private static final String TAG=PictureListFragment.class.getSimpleName();
    private ListView listView;
    private List<Picture> list = new ArrayList<>();
    private ItemAdapter itemAdapter;

    @Override
    public void onStart() {
        super.onStart();
        for(int i=1; i<=9; i++) {
            Picture picture = new Picture();
            picture.setPno(i);
            picture.setPtitle("   Picture " +i);
            picture.setPphoto(getResources().getIdentifier("picture" +i, "drawable", getContext().getPackageName()));
            picture.setPstar(getResources().getIdentifier("star" +i, "drawable", getContext().getPackageName()));
            picture.setPcontent("ㅎㅎㅎㅎㅎㅣㅣ히히히히히");
            addItem(picture);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        listView=(ListView)inflater.inflate(R.layout.fragment_picture_list, container, false);
        itemAdapter=new ItemAdapter();
        listView.setAdapter(itemAdapter);
        listView.setOnItemClickListener(itemClickListener);
        return listView;
    }


    private AdapterView.OnItemClickListener itemClickListener=new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            Picture picture=(Picture)itemAdapter.getItem(position);
            Log.i(TAG, picture.getPtitle());
            Log.i(TAG, picture.getPcontent());
        }
    };

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
