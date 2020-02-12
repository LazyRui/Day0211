package com.bawei.day0211.adapter;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bawei.day0211.R;
import com.bawei.day0211.entity.OrderEntity;

import java.text.SimpleDateFormat;
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
public class OrderAdapter extends RecyclerView.Adapter<OrderAdapter.VH> {


    private final Context context;
    private final List<OrderEntity.OrderListBean> orderList;
    private final int mStastus;

    public OrderAdapter(Context context, List<OrderEntity.OrderListBean> orderList, int mStastus) {

        this.context = context;
        this.orderList = orderList;
        this.mStastus = mStastus;
    }

    @NonNull
    @Override
    public VH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new VH(View.inflate(context, R.layout.rv_item, null));
        //  return new VH(LayoutInflater.from(context).inflate(R.layout.rv_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull VH holder, int position) {
        OrderEntity.OrderListBean list = orderList.get(position);
        Log.e("count", list.getOrderId());
        holder.orderId.setText(list.getOrderId());

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd");

        String format = simpleDateFormat.format(list.getOrderTime());
      //  String format1 = simpleDateFormat1.format(list.getOrderTime());

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(list.getOrderId().substring(0,8));
        stringBuffer.insert(4,"-");
        stringBuffer.insert(7,"-");

        holder.time.setText(format);
        holder.orderTime.setText(stringBuffer.toString());

        holder.rvI.setLayoutManager(new LinearLayoutManager(context));

        OrderIAdapter orderIAdapter = new OrderIAdapter(context, list.getDetailList(),mStastus);

        holder.rvI.setAdapter(orderIAdapter);
        Log.i("mSta",mStastus+"");
        switch (mStastus) {
            case 0:
            case 1:
                    holder.one.setVisibility(View.VISIBLE);
                    orderIAdapter.setCccCallBack(new OrderIAdapter.CCCCallBack() {
                        @Override
                        public void succecc(int count, double price) {
                            holder.cc.setText(count+"");
                            holder.pay.setText(price+"");
                        }
                    });
                    holder.three.setVisibility(View.GONE);
                    holder.nine.setVisibility(View.GONE);
                break;
            case 2:
                holder.one.setVisibility(View.GONE);
                holder.three.setVisibility(View.VISIBLE);
                holder.nine.setVisibility(View.GONE);
                holder.aa.setText(list.getExpressCompName());
                holder.bb.setText(list.getOrderId());
                break;
            case 3:
                holder.one.setVisibility(View.GONE);
                holder.three.setVisibility(View.GONE);
                holder.nine.setVisibility(View.VISIBLE);
                break;
            case 9:
                holder.one.setVisibility(View.GONE);
                holder.three.setVisibility(View.GONE);
                holder.nine.setVisibility(View.VISIBLE);
                holder.time.setText(format);
                break;
        }

    }

    @Override
    public int getItemCount() {
        Log.i("count", orderList.size() + "");
        return orderList.size();
    }

    static class VH extends RecyclerView.ViewHolder {
        @BindView(R.id.order_id)
        TextView orderId;
        @BindView(R.id.order_time)
        TextView orderTime;
        @BindView(R.id.rv_i)
        RecyclerView rvI;
        @BindView(R.id.cc)
        TextView cc;
        @BindView(R.id.pay)
        TextView pay;
        @BindView(R.id.one)
        LinearLayout one;
        @BindView(R.id.a)
        TextView a;
        @BindView(R.id.aa)
        TextView aa;
        @BindView(R.id.b)
        TextView b;
        @BindView(R.id.bb)
        TextView bb;
        @BindView(R.id.three)
        RelativeLayout three;
        @BindView(R.id.time)
        TextView time;
        @BindView(R.id.nine)
        LinearLayout nine;

        public VH(@NonNull View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
}
