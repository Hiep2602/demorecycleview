package com.example.hieph.demorecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    Adapter adapter;
    List<item_data> item_data = new ArrayList<>();
    RecyclerView recyclerView;
    item_data item = new item_data();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    private void initView(){
        add();
        recyclerView = findViewById(R.id.recycleview);
        LinearLayoutManager manager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(manager);
        adapter = new Adapter(item_data,this);
        recyclerView.setAdapter(adapter);
    }
    private void add(){
        item_data = new ArrayList<>();
        item_data.add(new item_data("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQZ7f6rb3HOeKit8dwMRd1qbBo7zH9EfuSBBlMJVCKkG1RG0Csr"));
        item_data.add(new item_data("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg"));
        item_data.add(new item_data("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg"));
        item_data.add(new item_data("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg"));
        item_data.add(new item_data("https://kenh14cdn.com/2017/212310618041193431006884986278710988847462n-1507458620893.jpg"));


    }
}
