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

import java.util.ArrayList;

public class MainActivity_Webtoon extends AppCompatActivity {
    private RecyclerView recyclerView;
    private ArrayList<Webtoon> arrayList;
    private Webtoon webtoon;
    private MyAdapter Myadapter;

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
        webtoon.getImage2(" ");


    }

    private class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder>{
        ArrayList<Webtoon> arrayList;
        Context context;
        LayoutInflater inflater;

        public MyAdapter(ArrayList<Webtoon> arrayList, Context context){
            this.arrayList = arrayList;
            this.context = context;
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        @Override
        public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = inflater.from(parent.getContext().inflate(R.layout.item, parent, false));
            return new ViewHolder(view);
        }

        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
          Glide.with(context).load(Uri.parse(arrayList.get(position).getImage())).into(holder.image);
         // Glide
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
