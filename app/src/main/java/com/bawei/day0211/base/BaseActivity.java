package com.bawei.day0211.base;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.day0211.base.base_mvp.BasePresenter;
import com.bawei.day0211.base.base_mvp.IBaseView;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.base
 * ClassName:   BaseActivity
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:16
 */
public abstract class BaseActivity<P extends BasePresenter> extends AppCompatActivity implements IBaseView {
    protected P mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layoutId());
        mPresenter = initPresenter();
        if (mPresenter != null) {
            mPresenter.attach(this);
        }
        initView();
        initData();
    }

    protected abstract void initData();

    protected abstract void initView();


    protected abstract P initPresenter();

    protected abstract int layoutId();

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (mPresenter != null) {
            mPresenter.detach();
        }
    }
}
