package com.bawei.day0211.presenter;

import com.bawei.day0211.base.base_mvp.BasePresenter;
import com.bawei.day0211.contract.OrderContract;
import com.bawei.day0211.entity.OrderEntity;
import com.bawei.day0211.model.OrderModel;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211
 * ClassName:   OrderPresenter
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_22:00
 */
public class OrderPresenter extends BasePresenter<OrderModel, OrderContract.Iview> implements OrderContract.IPresenter {
    @Override
    public void getOrderStatus(String userId, String sessionId, int status, int page, int count) {
        mModel.getOrderStatus(userId, sessionId, status, page, count, new OrderContract.Imodel.OrderCallBack() {
            @Override
            public void success(OrderEntity orderEntity) {
                getView().success(orderEntity);
            }

            @Override
            public void failure(Throwable throwable) {
                getView().failure(throwable);
            }
        });
    }

    @Override
    protected OrderModel initModel() {
        return new OrderModel();
    }
}
