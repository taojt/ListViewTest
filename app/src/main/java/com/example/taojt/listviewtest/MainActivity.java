package com.example.taojt.listviewtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
//    private String[] data ={"Apple", "Banana", "Orange", "Watermelon",
//            "Pear", "Grape", "Pineapple", "Strawberry", "Cherry", "Mango","Pipe", "Salad", "Sandwich","potato"};
    private List<Fruit> fruitList = new ArrayList<Fruit>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1, data);
//        ListView listView = (ListView) findViewById(R.id.list_view);
//        listView.setAdapter(adapter);
        
        initFruits();
        FruitAdapter adapter = new FruitAdapter(MainActivity.this, R.layout.fruit_items,fruitList);
        ListView listView = (ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }

    private void initFruits() {
        Fruit apple = new Fruit("Apple", R.mipmap.apple_pic);
        fruitList.add(apple);
        Fruit banana = new Fruit("Banana", R.mipmap.banana_pic);
        fruitList.add(banana);
        Fruit cherry = new Fruit("Cherry", R.mipmap.cherry_pic);
        fruitList.add(cherry);
        Fruit grape = new Fruit("Grape", R.mipmap.grape_pic);
        fruitList.add(grape);
        Fruit orange = new Fruit("Orange", R.mipmap.orange_pic);
        fruitList.add(orange);
        Fruit watermelon = new Fruit("Watermelon", R.mipmap.watermelon_pic);
        fruitList.add(watermelon);
        Fruit pear = new Fruit("Pear", R.mipmap.pear_pic);
        fruitList.add(pear);
        Fruit pineapple = new Fruit("Pineapple", R.mipmap.pineapple_pic);
        fruitList.add(pineapple);
        Fruit strawberry = new Fruit("Strawberry", R.mipmap.strawberry_pic);
        fruitList.add(strawberry);
        Fruit mango = new Fruit("Mango", R.mipmap.mango_pic);
        fruitList.add(mango);
        Fruit pipe = new Fruit("Pipe", R.mipmap.pipe_pic);
        fruitList.add(pipe);
        Fruit potato = new Fruit("Potato", R.mipmap.potato_pic);
        fruitList.add(potato);
        Fruit salad = new Fruit("Salad", R.mipmap.salad_pic);
        fruitList.add(salad);
        Fruit sand = new Fruit("Sandwich", R.mipmap.sandwich_pic);
        fruitList.add(sand);
    }
}
