package com.cxmax.arouterdemo.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Autowired;
import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * @desribe :
 * @usage :
 * <p>
 * </p>
 * Created by caixi on 18-4-14.
 */

@Route(path = "/test/fragment")
public class BlankFragment extends Fragment {

    @Autowired
    String name;

    public BlankFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return new TextView(getActivity());
    }
}
