package com.bawei.day0211.service;

import com.bawei.day0211.api.Api;
import com.bawei.day0211.entity.OrderEntity;

import java.util.HashMap;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.service
 * ClassName:   OrderService
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:40
 */
public interface OrderService {
    @GET(Api.FIND_ORDERlIST_BY_STATUS_URL)
    Observable<OrderEntity> getData(@Header("userId") String userId, @Header("sessionId") String sessionId,@Query("status") int status,@Query("page") int page,@Query("count") int count);
}
