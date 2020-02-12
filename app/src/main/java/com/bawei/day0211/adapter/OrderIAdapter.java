package com.bawei.day0211.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.day0211.R;
import com.bawei.day0211.entity.OrderEntity;
import com.bumptech.glide.Glide;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.adapter
 * ClassName:   OrderAdapter
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_22:30
 */
public class OrderIAdapter extends RecyclerView.Adapter<OrderIAdapter.VH> {


    private final Context context;
    private final List<OrderEntity.OrderListBean.DetailListBean> orderList;
    private int mStastus;


    public OrderIAdapter(Context context, List<OrderEntity.OrderListBean.DetailListBean> orderList, int mStastus) {

        this.context = context;
        this.orderList = orderList;
        this.mStastus = mStastus;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        //return new VH(View.inflate(context,R.layout.rv_item,null));
        return new VH(LayoutInflater.from(context).inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        OrderEntity.OrderListBean.DetailListBean list = orderList.get(position);
        //Log.e("count",list.getOrderId());
        holder.name.setText(list.getCommodityName());
        holder.price.setText(list.getCommodityPrice() + "");
        String[] split = list.getCommodityPic().split(",");
        Glide.with(context).load(split[0]).into(holder.iv);
        double pic = 0.00;
        for (OrderEntity.OrderListBean.DetailListBean detailListBean : orderList) {
            pic += detailListBean.getCommodityPrice();
        }
        if (cccCallBack != null) {

            cccCallBack.succecc(orderList.size(), pic);
        }

        switch (mStastus) {
            case 3:
                holder.iii.setVisibility(View.VISIBLE);
                break;
            default:
                holder.iii.setVisibility(View.GONE);
                break;
        }

    }

    @Override
    public int getItemCount() {
        Log.i("count", orderList.size() + "");
        return orderList.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.name)
        TextView name;
        @BindView(R.id.price)
        TextView price;
        @BindView(R.id.iv)
        ImageView iv;
        @BindView(R.id.iii)
        Button iii;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }


    private CCCCallBack cccCallBack;

    public void setCccCallBack(CCCCallBack cccCallBack) {
        this.cccCallBack = cccCallBack;
    }

    public interface CCCCallBack {
        void succecc(int count, double price);
    }

}
