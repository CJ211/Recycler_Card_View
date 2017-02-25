package com.example.jay.recycler_card_view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRview;
    private List<String> mVersions = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mRview = (RecyclerView) findViewById(R.id.recycler_view);

        mVersions = new ArrayList<>();

        mVersions.add("Alpha");
        mVersions.add("Beta");
        mVersions.add("Cupcake");
        mVersions.add("Donut");
        mVersions.add("Eclair");
        mVersions.add("Froyo");
        mVersions.add("Gingerbread");
        mVersions.add("Icecreamsandwich");
        mVersions.add("Jellybean");
        mVersions.add("Kitkat");
        mVersions.add("Lollipop");
        mVersions.add("Marshmallow");
        mVersions.add("Nougat");

        mRview.setAdapter(new MyRAdapter());
        mRview.setLayoutManager(new LinearLayoutManager(this));

    }

        class MyRAdapter extends RecyclerView.Adapter<MyViewHolder>
        {

            @Override
            public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
            {

                View view = getLayoutInflater().inflate(R.layout.list_row , parent , false);
                MyViewHolder holder= new MyViewHolder(view);
                return holder;
            }

            @Override
            public void onBindViewHolder(MyViewHolder holder, int position)
            {
                holder.mName.setText(mVersions.get(position));
            }

            @Override
            public int getItemCount()
            {
                return 30;
            }
        }

        class MyViewHolder extends RecyclerView.ViewHolder
        {
            private TextView mName;

            public MyViewHolder(View itemView)
            {
                super(itemView);
                mName = (TextView) itemView.findViewById(R.id.v_name);
            }
        }
}
