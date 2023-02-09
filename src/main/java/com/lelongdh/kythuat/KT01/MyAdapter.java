package com.lelongdh.kythuat.KT01;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm, int totalTabs) {
        super(fm);
        context = c;
        this.totalTabs = totalTabs;
    }
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                Fragmen_KT01 fragmen_kt01 = new Fragmen_KT01();
                return fragmen_kt01;
            case 1:
                Fragmen_KT02 fragmen_kt02 = new Fragmen_KT02();
                return fragmen_kt02;
            case 2:
                Fragmen_KT03 fragmen_kt03 = new Fragmen_KT03();
                return fragmen_kt03;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}
