package com.bawei.day0211.base.base_mvp;

import java.lang.ref.WeakReference;

/**
 * ProjectName: Day0211
 * PackageName: com.bawei.day0211.base.base_mvp
 * ClassName:   BasePresenter
 * Description: Java类的作用
 * Author: Lazy
 * CreateDate: 2020/2/11_21:17
 */
public abstract class BasePresenter<M extends IBaseModel, V extends IBaseView> {

    protected M mModel;
    private WeakReference<V> mWeakReference;

    public BasePresenter() {
        mModel = initModel();
    }

    protected abstract M initModel();

    public void attach(V v) {
        mWeakReference = new WeakReference<>(v);
    }

    public void detach() {
        if (mWeakReference != null) {
            mWeakReference.clear();
            mWeakReference = null;
        }
    }

    public V getView() {
        if (mWeakReference != null) {
            return mWeakReference.get();
        }
        return null;
    }
}
