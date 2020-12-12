package com.example.test3;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class ViewpagerAdapter1 extends FragmentStatePagerAdapter {

    public ViewpagerAdapter1(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new uudai1_Fragment();
            case 1:
                return new uudai2_Fragment();
            default:
                return new  uudai1_Fragment();
        }

    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position){
            case 0:
                title = "Đổi ưu đã";
                break;
            case 1:
                title = "Ưu đãi của bạn";
                break;
        }
        return title;
    }
}
