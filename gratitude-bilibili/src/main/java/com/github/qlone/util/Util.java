package com.github.qlone.util;

import com.github.qlone.Call;
import com.github.qlone.Response;

import java.io.IOException;

/**
 * @author heweinan
 * @date 2020-12-03 15:49
 */
public class Util {
    public static <T> T doCall(Call<T> call){
        try {
            Response<T> execute = call.execute();
            return execute.body();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
