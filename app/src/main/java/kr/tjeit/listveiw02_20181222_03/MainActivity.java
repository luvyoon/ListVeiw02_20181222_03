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

        fillStores();



    }

//    가게 데이터를 채우기 위한 임시 메쏘드
    void fillStores(){
        storeList.clear();
        storeList.add(new Store("BBQ","종로구 10길 ",4,"오전2:00~오후 1:00 ","01012345678"));
        storeList.add(new Store("네네치킨","종로구 11길 ",4,"오전22:00~오후 1:00 ","01045875632"));
        storeList.add(new Store("노랑 통닭","종로구 1길 ",4,"오전4:00~오후 1:00 ","01012345678"));
        storeList.add(new Store("디디","종로구 13길 ",4,"오전2:00~오후 1:00 ","01045875632"));
        storeList.add(new Store("BHC","종로구 2길 ",4,"오전3:00~오후 1:00 ","01012345678"));
        storeList.add(new Store("교촌","종로구 3길 ",4,"오전4:00~오후 1:00 ","01045875632"));
        storeList.add(new Store("굽네","종로구 15길 ",4,"오전2:00~오후 1:00 ","01012345678"));


    }

    @Override
    public void bindViews() {

        storeListView = findViewById(R.id.storeListView);

    }
}
