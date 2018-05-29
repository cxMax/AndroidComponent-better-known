package com.cxmax.basemodule;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-5-1.
 */
public abstract class BaseFragment extends Fragment {

    protected Context mContext;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mContext = getActivity();
        ViewGroup view = (ViewGroup) inflater.inflate(getLayoutId(), container, false);
        return initView(view);
    }

    @LayoutRes protected abstract int getLayoutId();

    protected abstract View initView(@Nullable View parent);
}
