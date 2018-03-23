package com.example.zhiqing.testfastjson;

/**
 * Created by zhiqing on 2018/2/24.
 */

public class testData extends BaseData {
    protected DATA data;

    public testData() {
    }

    public testData(String id, DATA data) {
        super(id);
        this.data = data;
    }

    public DATA getData() {
        return data;
    }

    public void setData(DATA data) {
        this.data = data;
    }

    public class DATA{
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
