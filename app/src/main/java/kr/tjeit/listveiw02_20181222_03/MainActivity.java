package kr.tjeit.listveiw02_20181222_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.tjeit.listveiw02_20181222_03.datas.Store;

public class MainActivity extends  BaseActivity {

    ListView storeListView;
    List<Store> storeList = new ArrayList<Store>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        setupEvent();
        setValues();

    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        storeListView = findViewById(R.id.storeListView);

    }
}
