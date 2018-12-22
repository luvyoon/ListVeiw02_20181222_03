package kr.tjeit.listveiw02_20181222_03;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import kr.tjeit.listveiw02_20181222_03.adapters.StoreAdapter;
import kr.tjeit.listveiw02_20181222_03.datas.Store;

public class MainActivity extends  BaseActivity {

    ListView storeListView;
    List<Store> storeList = new ArrayList<Store>();
    StoreAdapter mAdapter;


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

        storeListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                position변수에는 몇번째 줄이 눌렸는지를 담고 있음.
//                이를 활용해서 상황에 맞는 대처 .

//                눌린가게가 어떤 가게인지 알고 싶음

                Store clickedStore =storeList.get(position);

//                눌린 가게를 intent에 첨부해서 가게 상세 화면으로 전달+ 이동.

                Intent intent = new Intent(mContext, StoreDetailActivity.class);
                intent.putExtra("storeData",clickedStore);
                startActivity(intent);

            }
        });


    }

    @Override
    public void setValues() {

        fillStores();

        mAdapter = new StoreAdapter(mContext, storeList);
        storeListView.setAdapter(mAdapter);



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
