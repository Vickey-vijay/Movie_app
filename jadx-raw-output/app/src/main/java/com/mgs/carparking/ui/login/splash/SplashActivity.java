package com.mgs.carparking.ui.login.splash;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.fvvcl.flickverse.R;
import com.mgs.carparking.app.AppApplication;
import com.mgs.carparking.basecommon.ui.BarActivity;
import com.mgs.carparking.netbean.AdInfoDetailEntry;
import com.mgs.carparking.netbean.AdInfoEntry;
import com.vungle.ads.internal.ui.AdActivity;
import em.k;
import em.o;
import em.r;
import ja.c;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sa.b;
import sa.e;
import sa.i;
import sa.o0;
import sa.p;
import t9.f;

/* JADX INFO: loaded from: classes10.dex */
public class SplashActivity extends BarActivity implements ia.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f42008j = new Handler();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f42009k = "SplashActivity.classdeepLink";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public AdInfoDetailEntry f42010l = new AdInfoDetailEntry();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f42011m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f42012n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public c f42013o;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String strB = i.b(SplashActivity.this);
            if (o.b(strB)) {
                sa.c.f("");
                return;
            }
            Log.e(AdActivity.REQUEST_KEY_EXTRA, strB);
            AppApplication.clipStr = strB;
            Matcher matcher = Pattern.compile("#invited#(.+)#@#").matcher(strB);
            if (!matcher.find()) {
                sa.c.f("");
                return;
            }
            String strGroup = matcher.group(1);
            if (o.b(strGroup)) {
                sa.c.f("");
            } else {
                sa.c.f(strGroup);
                i.a();
            }
        }
    }

    public void showToast(String str) {
    }

    public void copyinit() {
        this.f42008j.postDelayed(new a(), 30L);
    }

    @Override // ia.a
    public void isConf(boolean z10) {
        c cVar;
        if (!z10 || (cVar = this.f42013o) == null) {
            return;
        }
        cVar.d();
    }

    @Override // ia.a
    public void setAdInfo(AdInfoEntry adInfoEntry) {
        if (adInfoEntry == null) {
            return;
        }
        this.f42011m = true;
        k.i(r.a()).n(adInfoEntry);
        AppApplication.adInfoEntry = adInfoEntry;
        if (o0.y() == 0) {
            o0.E0(1);
            p.a(this);
            finish();
        } else if (adInfoEntry.getAd_position_1() != null && adInfoEntry.getAd_position_1().size() > 0) {
            b.C(this, adInfoEntry.getAd_position_1());
        } else {
            p.a(this);
            finish();
        }
    }

    @Override // com.mgs.carparking.basecommon.ui.BarActivity, com.mgs.carparking.basecommon.ui.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        sl.b.b().c(1);
        super.onCreate(bundle);
        f.d(getWindow().getDecorView());
        setContentView(R.layout.acitivity_splash, false);
        if (isTaskRoot() && !e.i(this) && !e.o()) {
            c cVar = new c(this);
            this.f42013o = cVar;
            cVar.e();
            copyinit();
            return;
        }
        finish();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }
}
