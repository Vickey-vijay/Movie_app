package com.mgs.carparking.ui.login.splash;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.db.AdNumShowDao;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.wangxiong.sdk.callBack.SplashAdCallBack;
import com.wangxiong.sdk.view.SplashAd;
import com.yk.e.object.AdInfo;
import java.util.ArrayList;
import java.util.List;
import sa.c;
import sa.p;
import t9.f;

/* JADX INFO: loaded from: classes9.dex */
public class SplashWxActivity extends BarActivity {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String[] f42015w = {"android.permission.READ_PHONE_STATE", "android.permission.WRITE_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public FrameLayout f42017k;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f42023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f42024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f42025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public RelativeLayout f42026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public SplashAd f42027u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public List<String> f42016j = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f42018l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42019m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Handler f42020n = new Handler();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f42021o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdInfoDetailEntry f42022p = new AdInfoDetailEntry();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public SplashAdCallBack f42028v = new a();

    public class a implements SplashAdCallBack {
        public a() {
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdClick() {
            Log.i("SplashActivity", "开屏广告被点击了");
            SplashWxActivity.this.f42019m = true;
            c.c(3, SplashWxActivity.this.f42022p.getAd_type(), SplashWxActivity.this.f42022p.getAd_source_id(), 1, SplashWxActivity.this.f42025s, 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdClose() {
            Log.i("SplashActivity", "开屏广告关闭");
            SplashWxActivity.this.f42019m = true;
            SplashWxActivity.this.u();
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdComplete() {
            Log.i("SplashActivity", "开屏广告播放完成");
        }

        @Override // com.yk.e.callBack.MainAdCallBack
        public void onAdFail(int i10, String str) {
            Log.i("SplashActivity", "开屏广告加载失败:" + str);
            c.c(1, SplashWxActivity.this.f42022p.getAd_type(), SplashWxActivity.this.f42022p.getAd_source_id(), 1, SplashWxActivity.this.f42025s, 0, 0, 0);
            c.b("adposition:1 Ad_source_id:" + SplashWxActivity.this.f42022p.getAd_source_id() + " +s:" + i10 + " s1:" + str);
            SplashWxActivity splashWxActivity = SplashWxActivity.this;
            if (splashWxActivity.f42028v != null) {
                splashWxActivity.v();
            }
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdLoaded() {
            SplashAd splashAd;
            Log.i("SplashActivity", "开屏广告缓存成功");
            SplashWxActivity.this.f42021o = true;
            c.c(4, SplashWxActivity.this.f42022p.getAd_type(), SplashWxActivity.this.f42022p.getAd_source_id(), 1, SplashWxActivity.this.f42025s, 1, 0, 0);
            SplashWxActivity splashWxActivity = SplashWxActivity.this;
            if (splashWxActivity.f42028v == null || (splashAd = splashWxActivity.f42027u) == null) {
                return;
            }
            splashAd.showAd();
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdShow(AdInfo adInfo) {
            Log.i("SplashActivity", "开屏广告展示了");
            Log.e("SplashActivity", "onShowSuccessed");
            SplashWxActivity.this.f42021o = true;
            SplashWxActivity.this.f42026t.setVisibility(8);
            AdNumShowDao.getInstance().updateSplashTdNum(AdNumShowDao.getInstance().getNum(2) + 1);
            c.c(2, SplashWxActivity.this.f42022p.getAd_type(), SplashWxActivity.this.f42022p.getAd_source_id(), 1, SplashWxActivity.this.f42025s, 1, 0, 0);
        }

        @Override // com.yk.e.callBack.MainSplashAdCallBack
        public void onAdSkipped() {
            Log.i("SplashActivity", "开屏广告跳过了");
            SplashWxActivity.this.f42019m = true;
            SplashWxActivity.this.u();
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SplashWxActivity.this.f42021o) {
                return;
            }
            if (SplashWxActivity.this.f42023q) {
                SplashWxActivity.this.finish();
            } else {
                SplashWxActivity.this.v();
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (i10 == 4 || i10 == 3) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    public final void v() {
        this.f42028v = null;
        this.f42019m = false;
        p.a(this);
        finish();
    }

    public void initData() {
        for (String str : f42015w) {
            if (ContextCompat.checkSelfPermission(this, str) != 0) {
                this.f42016j.add(str);
            }
        }
        this.f42017k = (FrameLayout) findViewById(R.id.splash_container);
        this.f42023q = getIntent().getBooleanExtra("flag", false);
        AdInfoDetailEntry adInfoDetailEntry = (AdInfoDetailEntry) getIntent().getSerializableExtra("adInfoDetailEntry");
        this.f42022p = adInfoDetailEntry;
        if (adInfoDetailEntry != null) {
            this.f42024r = adInfoDetailEntry.getSdk_ad_id();
            this.f42025s = this.f42022p.getAd_id();
            if (this.f42016j.isEmpty()) {
                w();
            } else {
                List<String> list = this.f42016j;
                ActivityCompat.requestPermissions(this, (String[]) list.toArray(new String[list.size()]), 1);
            }
        } else if (this.f42023q) {
            finish();
        } else {
            v();
        }
        postLoad();
    }

    public void postLoad() {
        this.f42020n.postDelayed(new b(), 3500L);
    }

    public final void u() {
        if (this.f42018l && this.f42019m) {
            this.f42018l = false;
            if (this.f42023q) {
                finish();
            } else {
                v();
            }
        }
    }

    public final void w() {
        try {
            SplashAd splashAd = new SplashAd(this, this.f42024r, this.f42017k, this.f42028v);
            this.f42027u = splashAd;
            splashAd.loadAd();
            c.c(7, this.f42022p.getAd_type(), this.f42022p.getAd_source_id(), 1, this.f42025s, 0, 0, 0);
        } catch (Exception unused) {
        }
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        sl.b.b().c(1);
        super.onCreate(bundle);
        f.d(getWindow().getDecorView());
        setContentView(R.layout.activity_splash_wx, false);
        this.f42026t = (RelativeLayout) findViewById(R.id.show_ad);
        initData();
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Handler handler = this.f42020n;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f42020n = null;
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        this.f42018l = false;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i10, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f42018l = true;
        u();
    }
}
