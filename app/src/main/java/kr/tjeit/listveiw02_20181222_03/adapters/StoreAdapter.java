package kr.tjeit.listveiw02_20181222_03.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import kr.tjeit.listveiw02_20181222_03.R;
import kr.tjeit.listveiw02_20181222_03.datas.Store;

public class StoreAdapter extends ArrayAdapter<StoreAdapter> {

    Context mContext;
    List<Store> mList;
    LayoutInflater inf;

    public StoreAdapter(Context mContext, List<StoreAdapter> mList){

        super(mContext,R.layout.store_list_item,mList);

        this.mContext=mContext;
        this.mList = mList;
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

        Store data = mList.get(position);

        storeNameTxt.setText(data.getName());
        storeAddressTxT.setText(data.getAddress());
        
        StoreBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(mContext, "", Toast.LENGTH_SHORT).show();
                
            }
        });



        return row;
    }
}
