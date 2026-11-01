package com.mgs.carparking.ui.mine;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.Observer;
import androidx.viewpager.widget.ViewPager;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.adapter.PagerAdapter1;
import com.mgs.carparking.app.BaseActivity;
import com.mgs.carparking.databinding.ActivityDownloadBinding;
import com.mgs.carparking.model.DOWNLOADVIEWMODEL;
import em.n;
import em.r;
import java.util.ArrayList;
import me.goldze.mvvmhabit.base.BaseApplication;
import me.goldze.mvvmhabit.base.BaseFragment;
import x9.x;

/* JADX INFO: loaded from: classes2.dex */
public class DownloadActivity extends BaseActivity<ActivityDownloadBinding, DOWNLOADVIEWMODEL> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PagerAdapter1 f42031h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList<BaseFragment> f42032i = new ArrayList<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList<String> f42033j = new ArrayList<>();

    public class a implements ViewPager.OnPageChangeListener {
        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i10) {
            Log.i("wangyi", "现在位置为：" + i10);
            if (i10 == 0) {
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f39698d).f41144q.set(Boolean.TRUE);
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f39698d).f41145r.set(Boolean.FALSE);
            } else {
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f39698d).f41144q.set(Boolean.FALSE);
                ((DOWNLOADVIEWMODEL) DownloadActivity.this.f39698d).f41145r.set(Boolean.TRUE);
            }
        }
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initContentView(Bundle bundle) {
        return R.layout.activity_download;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public int initVariableId() {
        return 7;
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public DOWNLOADVIEWMODEL initViewModel() {
        return new DOWNLOADVIEWMODEL(BaseApplication.getInstance(), i9.a.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t(Void r10) {
        tl.a.a().b(new x(((ActivityDownloadBinding) this.f39697c).f39747f.getCurrentItem(), ((DOWNLOADVIEWMODEL) this.f39698d).f41146s));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u(Void r10) {
        tl.a.a().b(new x(((ActivityDownloadBinding) this.f39697c).f39747f.getCurrentItem(), ((DOWNLOADVIEWMODEL) this.f39698d).f41147t));
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initData() {
        super.initData();
        V v10 = this.f39697c;
        ((ActivityDownloadBinding) v10).f39746e.addTab(((ActivityDownloadBinding) v10).f39746e.newTab().setText(r.a().getResources().getString(R.string.text_mine_download_is_download)));
        this.f42033j.add(r.a().getResources().getString(R.string.text_mine_download_is_download));
        this.f42032i.add(DownloadVideoActivity.newInstance(1));
        V v11 = this.f39697c;
        ((ActivityDownloadBinding) v11).f39746e.addTab(((ActivityDownloadBinding) v11).f39746e.newTab().setText(r.a().getResources().getString(R.string.text_mine_download_complete_download)));
        this.f42033j.add(r.a().getResources().getString(R.string.text_mine_download_complete_download));
        this.f42032i.add(DownloadCompleteFragment.newInstance(2));
        ((ActivityDownloadBinding) this.f39697c).f39746e.setTabMode(0);
        this.f42031h = new PagerAdapter1(getSupportFragmentManager());
        V v12 = this.f39697c;
        ((ActivityDownloadBinding) v12).f39746e.setupWithViewPager(((ActivityDownloadBinding) v12).f39747f);
        this.f42031h.a(this.f42032i);
        this.f42031h.b(this.f42033j);
        ((ActivityDownloadBinding) this.f39697c).f39747f.setAdapter(this.f42031h);
        ((ActivityDownloadBinding) this.f39697c).f39747f.addOnPageChangeListener(new a());
    }

    @Override // com.mgs.carparking.app.BaseActivity
    public void initViewObservable() {
        super.initViewObservable();
        ((DOWNLOADVIEWMODEL) this.f39698d).f41148u.observe(this, new Observer() { // from class: ka.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62665b.t((Void) obj);
            }
        });
        ((DOWNLOADVIEWMODEL) this.f39698d).f41149v.observe(this, new Observer() { // from class: ka.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.f62667b.u((Void) obj);
            }
        });
    }

    @Override // com.mgs.carparking.app.BaseActivity, com.trello.rxlifecycle2.components.support.RxAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        n.a(this);
    }
}
