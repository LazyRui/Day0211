package com.bawei.day0211.model;

import android.annotation.SuppressLint;

import com.bawei.day0211.contract.OrderContract;
import com.bawei.day0211.entity.OrderEntity;
import com.bawei.day0211.service.OrderService;
import com.bawei.day0211.utils.MRetrofitUtil;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.model
 * ClassName:   OrderModel
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:58
 */
public class OrderModel implements OrderContract.Imodel {
    @SuppressLint("CheckResult")
    @Override
    public void getOrderStatus(String userId, String sessionId, int status, int page, int count, OrderCallBack orderCallBack) {
        MRetrofitUtil.getInstance().createService(OrderService.class)
                .getData(userId, sessionId, status, page, count)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<OrderEntity>() {
                    @Override
                    public void accept(OrderEntity orderEntity) throws Exception {
                        if (orderCallBack != null) {
                            orderCallBack.success(orderEntity);
                        }
                    }
                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        if (orderCallBack != null) {
                            orderCallBack.failure(throwable);
                        }
                    }
                });
    }
}
