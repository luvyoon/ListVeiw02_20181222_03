package kr.tjeit.listveiw02_20181222_03;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import kr.tjeit.listveiw02_20181222_03.datas.Store;

public class StoreDetailActivity extends BaseActivity {

    TextView nameTxt;
    TextView addressTxt;
    TextView openTimeTxt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store_detail);

        bindViews();
        setupEvent();
        setValues();
    }

    @Override
    public void setupEvent() {

    }

    @Override
    public void setValues() {

        mStore =(Store) getIntent().getSerializableExtra("storeData");

        nameTxt.setText(mStore.getName());
        addressTxt.setText(mStore.getAddress());
        openTimeTxt.setText(mStore.getOpenAndCloseTime());

    }

    @Override
    public void bindViews() {

        nameTxt = findViewById(R.id.nameTxt);
        addressTxt= findViewById(R.id.addressTxt);
        openTimeTxt =findViewById(R.id.nameTxt);

    }
}
