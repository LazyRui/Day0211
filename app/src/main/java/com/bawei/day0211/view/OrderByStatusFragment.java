package com.bawei.day0211.view;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.day0211.R;
import com.bawei.day0211.adapter.OrderAdapter;
import com.bawei.day0211.base.BaseFragment;
import com.bawei.day0211.contract.OrderContract;
import com.bawei.day0211.entity.OrderEntity;
import com.bawei.day0211.presenter.OrderPresenter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.view
 * ClassName:   OrderByStatusFragment
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:54
 */
public class OrderByStatusFragment extends BaseFragment<OrderPresenter> implements OrderContract.Iview {

    private List<OrderEntity> list;
    private RecyclerView rv;
    private int mStatus;
    @Override
    protected int layoutId() {
        return R.layout.fragment_order_by_status;
    }

    @Override
    protected void initData() {

        list = new ArrayList<>();

        int status = 0;

        Bundle arguments = getArguments();
        if (arguments != null) {
            status = arguments.getInt("status");
            mStatus = status;
        }

        mPresenter.getOrderStatus("27804", "158139549575227804", status, 1, 5);
    }

    @Override
    protected void initView(View view) {

        rv = view.findViewById(R.id.rv);

        rv.setLayoutManager(new LinearLayoutManager(getActivity()));

    }

    @Override
    protected OrderPresenter initPresenter() {
        return new OrderPresenter();
    }

    public static OrderByStatusFragment getInstance(int status) {
        OrderByStatusFragment orderByStatusFragment = new OrderByStatusFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("status", status);
        orderByStatusFragment.setArguments(bundle);
        return orderByStatusFragment;
    }

    @Override
    public void success(OrderEntity orderEntity) {
        if (orderEntity != null) {
            list.add(orderEntity);
            Log.e("xxx", "" + list.size());
            // Toast.makeText(getActivity(), orderEntity.getMessage(), Toast.LENGTH_SHORT).show();
            OrderAdapter orderAdapter = new OrderAdapter(getActivity(), orderEntity.getOrderList(),mStatus);
            rv.setAdapter(orderAdapter);
        }
    }

    @Override
    public void failure(Throwable throwable) {

    }
}
