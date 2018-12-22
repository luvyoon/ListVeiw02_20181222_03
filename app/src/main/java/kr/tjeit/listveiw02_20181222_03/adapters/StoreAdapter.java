package kr.tjeit.listveiw02_20181222_03.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ArrayAdapter;

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
        this.mList =mList;
        this.inf = LayoutInflater.from(mContext);




    }






}
