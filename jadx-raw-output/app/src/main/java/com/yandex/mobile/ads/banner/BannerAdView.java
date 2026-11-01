package com.yandex.mobile.ads.banner;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.MainThread;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.common.AdRequest;
import com.yandex.mobile.ads.common.AdTheme;
import com.yandex.mobile.ads.common.VideoController;
import java.util.ArrayList;
import java.util.List;
import nj.t;
import yads.aq3;
import yads.c00;
import yads.d4;
import yads.e00;
import yads.er3;
import yads.g9;
import yads.gc;
import yads.gp2;
import yads.h00;
import yads.i00;
import yads.i12;
import yads.ip2;
import yads.iu3;
import yads.jm;
import yads.km;
import yads.lc1;
import yads.lh3;
import yads.lm;
import yads.mm;
import yads.ri0;
import yads.sm;
import yads.tc1;
import yads.tm;
import yads.tq3;
import yads.w5;
import yads.xp3;

/* JADX INFO: loaded from: classes9.dex */
@MainThread
public final class BannerAdView extends tc1 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final aq3 f50959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final tm f50960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final xp3 f50961m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f50962n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final VideoController f50963o;

    public BannerAdView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44979y, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public BannerAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // yads.tc1
    public final km a(Context context, d4 d4Var, jm jmVar, w5 w5Var) {
        return new km(context, this, jmVar, w5Var, new lh3(), new mm(), new lm(getSdkEnvironmentModule$mobileads_externalRelease()), new i12(d4Var), new ri0());
    }

    public final AdInfo getAdInfo() {
        String str = this.f50962n;
        if (str == null) {
            str = "";
        }
        c00 c00VarA = a(str);
        this.f50961m.getClass();
        return xp3.a(c00VarA);
    }

    public final VideoController getVideoController() {
        return this.f50963o;
    }

    public final void loadAd(AdRequest adRequest) {
        gp2 gp2VarA;
        String str = this.f50962n;
        if (str == null || str.length() <= 0) {
            lc1.a("Failed to load ad with empty ad unit id", new Object[0]);
            return;
        }
        aq3 aq3Var = this.f50959k;
        aq3Var.getClass();
        AdTheme preferredTheme = adRequest.getPreferredTheme();
        if (preferredTheme != null) {
            aq3Var.f75596a.getClass();
            gp2VarA = ip2.a(preferredTheme);
        } else {
            gp2VarA = null;
        }
        String age = adRequest.getAge();
        String biddingData = adRequest.getBiddingData();
        a(new g9(str, age, adRequest.getGender(), adRequest.getContextQuery(), adRequest.getContextTags(), adRequest.getLocation(), adRequest.getParameters(), biddingData, null, gp2VarA, false, null));
    }

    @Override // yads.tc1
    public void setAdUnitId(String str) {
        this.f50962n = str;
        super.setAdUnitId(str);
    }

    public final void setBannerAdEventListener(BannerAdEventListener bannerAdEventListener) {
        h00 tq3Var;
        if (bannerAdEventListener instanceof ClosableBannerAdEventListener) {
            tq3Var = new er3((ClosableBannerAdEventListener) bannerAdEventListener);
        } else {
            tq3Var = bannerAdEventListener != null ? new tq3(bannerAdEventListener) : null;
        }
        a(tq3Var);
    }

    public BannerAdView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10, new d4(e00.f76859d), new iu3(context));
        this.f50959k = new aq3();
        this.f50960l = new tm();
        this.f50961m = new xp3();
        this.f50963o = new VideoController(e());
    }

    @Override // yads.tc1
    public void destroy() {
        super.destroy();
    }

    public final List<Object> getAdAttributes() {
        List<gc> listB = b();
        ArrayList arrayList = new ArrayList(t.v(listB, 10));
        for (gc gcVar : listB) {
            this.f50960l.getClass();
            arrayList.add(new sm(gcVar));
        }
        return arrayList;
    }

    public final BannerAdSize getAdSize() {
        i00 i00VarC = c();
        if (i00VarC != null) {
            return new BannerAdSize(i00VarC.f75579a);
        }
        return null;
    }

    public final String getInfo() {
        return d();
    }

    public final void setAdSize(BannerAdSize bannerAdSize) {
        a(a.a(bannerAdSize));
    }
}
