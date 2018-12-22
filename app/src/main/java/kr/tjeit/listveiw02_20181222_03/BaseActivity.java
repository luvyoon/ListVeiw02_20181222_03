package kr.tjeit.listveiw02_20181222_03;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import kr.tjeit.listveiw02_20181222_03.datas.Store;

public abstract class BaseActivity extends AppCompatActivity {


    Store mStore;

    public Context mContext = this;

    public  abstract void  setupEvent();
    public  abstract void setValues();
    public  abstract void bindViews();



}
