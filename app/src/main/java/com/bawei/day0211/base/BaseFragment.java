package com.bawei.day0211.base;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.day0211.base.base_mvp.BasePresenter;
import com.bawei.day0211.base.base_mvp.IBaseView;

import butterknife.ButterKnife;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.base
 * ClassName:   BaseFragment
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:20
 */
public abstract class BaseFragment<P extends BasePresenter> extends Fragment implements IBaseView {
    protected P mPresenter;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(layoutId(), null, false);
       // ButterKnife.bind(this, view);
        mPresenter = initPresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        initView(view);
        return view;
    }

    protected abstract int layoutId();

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        initData();
    }

    protected abstract void initData();

    protected abstract void initView(View view);

    protected abstract P initPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }
}
