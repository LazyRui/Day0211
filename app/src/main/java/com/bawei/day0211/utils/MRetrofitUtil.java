package com.bawei.day0211.utils;

import com.bawei.day0211.api.Api;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211
 * ClassName:   MRetrofitUtil
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:25
 */
public class MRetrofitUtil {
    private static MRetrofitUtil mRetrofitUtil;
    private final Retrofit mRetrofit;

    private MRetrofitUtil() {
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();

        mRetrofit = new Retrofit.Builder()
                .baseUrl(Api.BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
    }

    public static MRetrofitUtil getInstance() {
        if (mRetrofitUtil==null){
            synchronized (MRetrofitUtil.class){
                if (mRetrofitUtil==null){
                    mRetrofitUtil = new MRetrofitUtil();
                }
            }
        }
        return mRetrofitUtil;
    }

    public <T>T createService(Class<T> tClass){
        return mRetrofit.create(tClass);
    }


}
