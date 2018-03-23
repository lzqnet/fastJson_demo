package com.example.zhiqing.testfastjson;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.fastjson.JSON;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void forceCrash(View view) {
        BaseData baseData=new BaseData("123");
        Log.d("eetest", "MainActivity.forceCrash:19 basedata="+ JSON.toJSONString(baseData).toString());
testData testdata=new testData();
testdata.setId("456");
testData.DATA data=testdata.new DATA();
data.setName("test");
testdata.setData(data);
        Log.d("eetest", "MainActivity.forceCrash:23 testdata="+JSON.toJSONString(testdata).toString());
    }
}
