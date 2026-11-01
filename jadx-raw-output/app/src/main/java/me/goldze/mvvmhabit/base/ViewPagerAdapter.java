package me.goldze.mvvmhabit.base;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class ViewPagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList<Fragment> f64427b;

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f64427b.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f64427b.get(i10);
    }
}
