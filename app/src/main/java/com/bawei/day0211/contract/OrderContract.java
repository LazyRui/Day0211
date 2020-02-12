package com.bawei.day0211.contract;

import com.bawei.day0211.base.base_mvp.IBaseModel;
import com.bawei.day0211.base.base_mvp.IBaseView;
import com.bawei.day0211.entity.OrderEntity;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.contract
 * ClassName:   OrderContract
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:54
 */
public interface OrderContract {
    interface Imodel extends IBaseModel {
        void getOrderStatus(String userId, String sessionId, int status, int page, int count, OrderCallBack orderCallBack);

        interface OrderCallBack {
            void success(OrderEntity orderEntity);

            void failure(Throwable throwable);
        }
    }

    interface Iview extends IBaseView {
        void success(OrderEntity orderEntity);

        void failure(Throwable throwable);
    }

    interface IPresenter {
        void getOrderStatus(String userId, String sessionId, int status, int page, int count);
    }
}
