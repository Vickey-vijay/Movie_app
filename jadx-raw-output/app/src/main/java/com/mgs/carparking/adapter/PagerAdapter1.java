package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes11.dex */
public class PagerAdapter1 extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<BaseFragment> f39686b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f39687c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentManager f39688d;

    public void a(List<BaseFragment> list) {
        this.f39686b = list;
    }

    public void b(List<String> list) {
        this.f39687c = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f39688d.beginTransaction().hide(this.f39686b.get(i10)).commit();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39687c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f39686b.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f39687c.get(i10);
    }

    public PagerAdapter1(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f39688d = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f39688d.beginTransaction().show(fragment).commit();
        return fragment;
    }
}
