package com.example.yurina.webtoonrecy;

import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity_Webtoon extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Webtoon> arrayList;
    private Webtoon webtoon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__webtoon);

        recyclerView = findViewById(R.id.recyclerview);
        arrayList = new ArrayList<>();

        Datas();
        recyclerView.setAdapter(new MyAdapter(arrayList, this));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    public void Datas() {

        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1136/thumbnail_202x120_94cdcf4e-3fc9-4137-ac86-f4812dd27381.jpg");
        webtoon.setText("1132. 남자 다운건 처음이라");
        webtoon.setImage2(R.mipmap.one);
        webtoon.setText2("2018.04.02");
        arrayList.add(webtoon);
        webtoon = new Webtoon();


        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1135/thumbnail_202x120_35de3326-1da4-47c4-98fc-6abdc99667b6.jpg");
        webtoon.setText("1131. 히트맨");
        webtoon.setImage2(R.mipmap.two);
        webtoon.setText2("2018.03.26");
        arrayList.add(webtoon);
        webtoon = new Webtoon();


        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1134/thumbnail_202x120_72da297d-8057-4dc5-957f-a23695585e7d.jpg");
        webtoon.setText("1130. 롱파카");
        webtoon.setImage2(R.mipmap.three);
        webtoon.setText2("2018.03.12");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1133/thumbnail_202x120_caafd6c1-c400-447f-9020-8c4f22f48b66.jpg");
        webtoon.setText("1129. 진짜 숨어");
        webtoon.setImage2(R.mipmap.four);
        webtoon.setText2("2018.03.05");
        arrayList.add(webtoon);
        webtoon = new Webtoon();


        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1132/thumbnail_202x120_0854214f-207c-427f-9032-140622be7489.jpg");
        webtoon.setText("1128. 짝사랑");
        webtoon.setImage2(R.mipmap.five);
        webtoon.setText2("2018.02.26");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1131/thumbnail_202x120_3f468b32-78bb-4b6f-bca2-b774fef278d4.jpg");
        webtoon.setText("1127. 담배 놈들");
        webtoon.setImage2(R.mipmap.six);
        webtoon.setText2("2018.02.19");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1130/thumbnail_202x120_3c7cee99-8ef3-4565-a935-b881907c4837.jpg");
        webtoon.setText("1126. 손님");
        webtoon.setImage2(R.mipmap.seven);
        webtoon.setText2("2018.02.12");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1129/thumbnail_202x120_e4e207f7-9067-4328-a5b4-4c147405ed49.jpg");
        webtoon.setText("1125. 비상만화");
        webtoon.setImage2(R.mipmap.eight);
        webtoon.setText2("2018.02.05");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1128/thumbnail_202x120_3b47cc4a-e94f-47ac-a524-1aa478e14845.jpg");
        webtoon.setText("1124. 조의 영역");
        webtoon.setImage2(R.mipmap.nine);
        webtoon.setText2("2018.01.29");
        arrayList.add(webtoon);
        webtoon = new Webtoon();

        webtoon.setImage("http://thumb.comic.naver.net/webtoon/20853/1127/thumbnail_202x120_210bf93b-9961-469a-86bf-bc1f61b0e76c.jpg");
        webtoon.setText("1123. 고급주택");
        webtoon.setImage2(R.mipmap.ten);
        webtoon.setText2("2018.01.22");
        arrayList.add(webtoon);


    }

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

        ArrayList<Webtoon> arrayList;
        Context context;
        LayoutInflater inflater;

        public MyAdapter(ArrayList<Webtoon> arrayList, Context context) {
            this.arrayList = arrayList;
            this.context = context;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, final int position) {


            Glide.with(context).load(Uri.parse(arrayList.get(position).getImage())).centerCrop().into(holder.image);
            Glide.with(context).load(arrayList.get(position).getImage2()).into(holder.image2);

            holder.text.setText(arrayList.get(position).getText());
            holder.text2.setText(arrayList.get(position).getText2());
        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {

            public ImageView image;
            public ImageView image2;
            public TextView text;
            public TextView text2;

            public ViewHolder(View View) {

                super(View);

                image = View.findViewById(R.id.image);
                image2 = View.findViewById(R.id.image2);
                text = View.findViewById(R.id.text);
                text2 = View.findViewById(R.id.text2);
            }
        }
    }
}
