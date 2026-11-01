package com.mgs.carparking.adapter;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.List;
import me.goldze.mvvmhabit.base.BaseFragment;

/* JADX INFO: loaded from: classes10.dex */
public class MyPagerListAdapter extends FragmentPagerAdapter {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List<BaseFragment> f39679b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List<String> f39680c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public FragmentManager f39681d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public FragmentTransaction f39682e;

    public static String makeFragmentName(int i10, long j10) {
        return "android:switcher:" + i10 + StringUtils.PROCESS_POSTFIX_DELIMITER + j10;
    }

    public void a(ViewGroup viewGroup) {
        if (this.f39682e == null) {
            this.f39682e = this.f39681d.beginTransaction();
        }
        for (int i10 = 0; i10 < this.f39679b.size(); i10++) {
            Fragment fragmentFindFragmentByTag = this.f39681d.findFragmentByTag(makeFragmentName(viewGroup.getId(), getItemId(i10)));
            if (fragmentFindFragmentByTag != null) {
                this.f39682e.remove(fragmentFindFragmentByTag);
            }
        }
        this.f39682e.commitNowAllowingStateLoss();
    }

    public void b(List<BaseFragment> list) {
        this.f39679b = list;
    }

    public void c(List<String> list) {
        this.f39680c = list;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public void destroyItem(ViewGroup viewGroup, int i10, Object obj) {
        this.f39681d.beginTransaction().hide(this.f39679b.get(i10)).commit();
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public int getCount() {
        return this.f39680c.size();
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter
    public Fragment getItem(int i10) {
        return this.f39679b.get(i10);
    }

    @Override // androidx.viewpager.widget.PagerAdapter
    public CharSequence getPageTitle(int i10) {
        return this.f39680c.get(i10);
    }

    public MyPagerListAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f39681d = fragmentManager;
    }

    @Override // androidx.fragment.app.FragmentPagerAdapter, androidx.viewpager.widget.PagerAdapter
    public Object instantiateItem(ViewGroup viewGroup, int i10) {
        Fragment fragment = (Fragment) super.instantiateItem(viewGroup, i10);
        this.f39681d.beginTransaction().show(fragment).commit();
        return fragment;
    }
}
