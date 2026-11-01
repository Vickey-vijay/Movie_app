package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import java.util.Iterator;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes5.dex */
public class PagerAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Fragment f39683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<BaseFragment> f39684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List<String> f39685d;

    public void a() {
        FragmentTransaction fragmentTransactionBeginTransaction = this.f39683b.getChildFragmentManager().beginTransaction();
        if (this.f39684c.size() > 0) {
            Iterator<BaseFragment> it = this.f39684c.iterator();
            while (it.hasNext()) {
                fragmentTransactionBeginTransaction.remove(it.next());
            }
            fragmentTransactionBeginTransaction.commitNow();
            this.f39684c.clear();
            this.f39685d.clear();
            notifyDataSetChanged();
        }
    }

    public void b(List<BaseFragment> list) {
        this.f39684c = list;
    }

    public void c(List<String> list) {
        this.f39685d = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        if (i10 < this.f39684c.size()) {
            this.f39683b.getChildFragmentManager().beginTransaction().hide(this.f39684c.get(i10)).commitAllowingStateLoss();
        }
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39685d.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f39684c.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f39685d.get(i10);
    }

    public PagerAdapter(FragmentManager fragmentManager, Fragment fragment) {
        super(fragmentManager);
        this.f39683b = fragment;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f39683b.getChildFragmentManager().beginTransaction().show(fragment).commitAllowingStateLoss();
        return fragment;
    }
}
