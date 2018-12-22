package kr.tjeit.listveiw02_20181222_03.adapters;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.net.URI;
import java.util.List;

import kr.tjeit.listveiw02_20181222_03.R;
import kr.tjeit.listveiw02_20181222_03.datas.Store;

public class StoreAdapter extends ArrayAdapter<Store> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context mContext, List<Store> mList){

        super(mContext, R.layout.store_list_item, mList);

        this.mContext=mContext;
        this.mList =mList;
        this.inf = LayoutInflater.from(mContext);


    }


    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        View row = convertView;

        if(row == null){
            row = inf.inflate(R.layout.store_list_item, null);

        }
        TextView storeNameTxt=row.findViewById(R.id.storeNameTxt);

        TextView storeAddressTxT= row.findViewById(R.id.storeAddressTxT);
        TextView StoreBtn= row.findViewById(R.id.StoreBtn);

        final Store data = mList.get(position);

        storeNameTxt.setText(data.getName());
        storeAddressTxT.setText(data.getAddress());
        
        StoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                전화 거는 기능을 활용!

//                Toast.makeText(mContext, data.getPhoneNum()+"에게 전화겁니다", Toast.LENGTH_SHORT).show();
//                전화를 걸기 위한 uri 생성

                Uri uri = Uri.parse(String.format("tel:%s",data.getPhoneNum()));
//                만든 uri 이용해 intent생성
                Intent intent = new Intent(Intent.ACTION_DIAL,uri);
//                작성중인 이 클래스는 ArrayAdapter상속
//                ArrayAdapter는 start기능 없음 => MainActivity가 가짐 ! 액티비티가 갖음


//                mContext가 MainActivity 가 대변!
                mContext.startActivity(intent);


                
            }
        });



        return row;
    }
}
