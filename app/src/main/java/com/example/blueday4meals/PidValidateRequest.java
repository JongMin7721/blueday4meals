package com.example.blueday4meals;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

public class PidValidateRequest extends StringRequest {
    //서버 url 설정(php파일 연동)
    final static  private String URL="http://animalnara.kr/idvalidate_parents.php";
    private Map<String,String> map;

    public PidValidateRequest(String userID, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("userID",userID);
    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return map;
    }
}
