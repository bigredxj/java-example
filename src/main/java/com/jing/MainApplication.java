package com.jing;

import com.alibaba.fastjson.JSONObject;
import com.jing.utils.ThrowableUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Slf4j
public class MainApplication {
    public static void main(String[] args){
        HashMap<String, Object> reMessage = new HashMap<>();
        reMessage.put("aa",1);
        reMessage.put("ada","bb");

        log.info(reMessage.toString());

        List<String> aList = new ArrayList<>();

        aList.add("aa");


        String str = null;



    }
}
