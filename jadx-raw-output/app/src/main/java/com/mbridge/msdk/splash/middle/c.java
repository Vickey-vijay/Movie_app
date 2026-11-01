package com.mbridge.msdk.splash.middle;

import android.R;
import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.f1;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.ZoomOutTypeEnum;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import com.mbridge.msdk.splash.manager.e;
import com.mbridge.msdk.splash.manager.f;
import com.mbridge.msdk.splash.view.BaseSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashPopView;
import com.mbridge.msdk.splash.view.MBSplashView;

/* JADX INFO: compiled from: SplashProvider.java */
/* JADX INFO: loaded from: classes5.dex */
public class c {
    private static String D = "SplashProvider";
    private CampaignEx A;
    private MBSplashPopView B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f37122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37123b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f37124c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f37126e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private e f37127f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private f f37128g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f37129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBSplashShowListener f37130i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private d f37131j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBSplashView f37132k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ViewGroup f37133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f37134m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private l f37135n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f37136o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ViewGroup f37137p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private j f37138q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f37139r;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Activity f37146y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f37147z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37125d = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f37140s = 1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f37141t = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f37142u = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Object f37143v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f37144w = new Object();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37145x = false;
    private boolean C = false;

    /* JADX INFO: compiled from: SplashProvider.java */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ CampaignEx f37148a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f37149b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f37150c;

        public a(CampaignEx campaignEx, int i10, boolean z10) {
            this.f37148a = campaignEx;
            this.f37149b = i10;
            this.f37150c = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f37148a, this.f37149b - 1, this.f37150c);
        }
    }

    public void b(boolean z10) {
        this.f37136o = z10;
    }

    public void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            b(str);
        } else if (this.f37129h != null) {
            this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
        }
    }

    public int d() {
        return this.f37125d;
    }

    public void j() {
        this.C = true;
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.startCountDown();
        }
    }

    public void k() {
        this.C = false;
        MBSplashShowListener mBSplashShowListener = this.f37130i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onZoomOutPlayFinish(new MBridgeIds(this.f37123b, this.f37122a));
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView != null) {
            mBSplashPopView.release();
        }
    }

    public void a(ViewGroup viewGroup) {
        this.f37137p = viewGroup;
    }

    public void b(String str) {
        a(str, 1);
    }

    public void d(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA != null) {
            d(str, viewGroupA);
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f37130i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f37124c, "activity is except,please check it");
        }
    }

    public long e() {
        return this.f37126e;
    }

    public boolean f() {
        return this.f37139r;
    }

    public boolean g() {
        return this.f37136o;
    }

    public void h() {
        f fVar = this.f37128g;
        if (fVar != null) {
            fVar.f();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.pauseCountDown();
    }

    public void i() {
        f fVar = this.f37128g;
        if (fVar != null) {
            fVar.g();
        }
        MBSplashPopView mBSplashPopView = this.B;
        if (mBSplashPopView == null || !this.C) {
            return;
        }
        mBSplashPopView.reStartCountDown();
    }

    public c(Activity activity, String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = str;
        }
        this.f37123b = str3;
        this.f37122a = str2;
        this.f37124c = new MBridgeIds(str, str2);
        this.f37146y = activity;
        b(activity);
    }

    public void a(int i10) {
        this.f37140s = i10;
    }

    public void b(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f37129h != null) {
                this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        b(str, viewGroupA);
    }

    public void a(long j10) {
        this.f37126e = j10;
    }

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        if (this.f37129h == null) {
            this.f37129h = new b(this, this.f37124c);
        }
        this.f37129h.a(mBSplashLoadListener);
    }

    public void c(boolean z10) {
        this.f37139r = z10;
    }

    public void d(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            MBSplashShowListener mBSplashShowListener = this.f37130i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f37124c, "token is null or empty");
                return;
            }
            return;
        }
        c(str, viewGroup);
    }

    public String c() {
        if (!this.f37145x) {
            e eVar = this.f37127f;
            return eVar != null ? eVar.d() : "";
        }
        f fVar = this.f37128g;
        return fVar != null ? fVar.d() : "";
    }

    public void a(MBSplashShowListener mBSplashShowListener) {
        this.f37130i = mBSplashShowListener;
    }

    public void b(String str, ViewGroup viewGroup) {
        if (TextUtils.isEmpty(str)) {
            if (this.f37129h != null) {
                this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880035), 1);
                return;
            }
            return;
        }
        a(str, viewGroup);
    }

    public void a(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            if (this.f37129h != null) {
                this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880036), 1);
                return;
            }
            return;
        }
        a(str, viewGroupA);
    }

    public void d(boolean z10) {
        this.f37147z = z10;
    }

    public void c(String str, Activity activity) {
        ViewGroup viewGroupA = a(activity);
        if (viewGroupA == null) {
            MBSplashShowListener mBSplashShowListener = this.f37130i;
            if (mBSplashShowListener != null) {
                mBSplashShowListener.onShowFailed(this.f37124c, "activity is except,please check it");
                return;
            }
            return;
        }
        c(str, viewGroupA);
    }

    public void b(int i10) {
        this.f37125d = i10;
    }

    public void a(String str, ViewGroup viewGroup) {
        this.f37133l = viewGroup;
        MBSplashView mBSplashView = this.f37132k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        a(str, 2);
    }

    public void b(int i10, int i11) {
        a(i11, i10);
    }

    public String b() {
        if (!this.f37145x) {
            e eVar = this.f37127f;
            return eVar != null ? eVar.c() : "";
        }
        f fVar = this.f37128g;
        return fVar != null ? fVar.c() : "";
    }

    public void c(String str, ViewGroup viewGroup) {
        this.f37133l = viewGroup;
        MBSplashView mBSplashView = this.f37132k;
        if (mBSplashView != null) {
            mBSplashView.setDevContainer(viewGroup);
        }
        CampaignEx campaignExA = com.mbridge.msdk.splash.manager.d.a(this.f37132k, this.f37123b, this.f37122a, str, this.f37139r, this.f37125d, true, false);
        if (campaignExA != null) {
            if (this.f37135n == null) {
                this.f37135n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f37122a);
            }
            d dVar = new d(this, this.f37130i, campaignExA);
            this.f37131j = dVar;
            if (this.f37141t != 0 && this.f37142u != 0) {
                int i10 = this.f37125d;
                if (i10 >= 2 && i10 <= 10) {
                    b(campaignExA, this.f37135n.E(), false);
                    return;
                }
                dVar.a(this.f37124c, "countDownTime must in 2 - 10 ,but now is " + this.f37125d);
                return;
            }
            dVar.a(this.f37124c, "width or height is 0  or width or height is too small");
            return;
        }
        MBSplashShowListener mBSplashShowListener = this.f37130i;
        if (mBSplashShowListener != null) {
            mBSplashShowListener.onShowFailed(this.f37124c, "campaignEx is vali");
        }
    }

    public boolean a(String str) {
        return com.mbridge.msdk.splash.manager.d.a(this.f37132k, this.f37123b, this.f37122a, str, this.f37139r, this.f37125d, false, true) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(CampaignEx campaignEx, int i10, boolean z10) {
        if (!com.mbridge.msdk.splash.manager.d.a(this.f37132k, campaignEx)) {
            if (i10 > 0) {
                this.f37128g.f37023y.postDelayed(new a(campaignEx, i10, z10), 1L);
                return;
            }
            d dVar = this.f37131j;
            if (dVar != null) {
                dVar.a(this.f37124c, "campaignEx is not ready");
                return;
            }
            return;
        }
        a(true);
        ViewGroup.LayoutParams layoutParams = this.f37133l.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -1);
        } else {
            layoutParams.height = -1;
            layoutParams.width = -1;
        }
        this.f37133l.setLayoutParams(layoutParams);
        this.f37133l.removeAllViews();
        this.f37128g.c(this.f37125d);
        this.f37128g.a(this.f37137p);
        this.f37128g.a(this.f37131j);
        q0.b(D, "start show process");
        ViewGroup viewGroup = this.f37133l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            f1.a(this.f37132k);
            this.f37133l.addView(this.f37132k);
        }
        this.f37128g.a(this.f37139r);
        this.f37128g.a(campaignEx, this.f37132k);
    }

    public void b(CampaignEx campaignEx, int i10, boolean z10) {
        if (campaignEx != null && z10) {
            if (this.f37135n == null) {
                this.f37135n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f37122a);
            }
            this.f37131j = new d(this, this.f37130i, campaignEx);
        }
        ViewGroup viewGroup = this.f37133l;
        if (viewGroup == null) {
            d dVar = this.f37131j;
            if (dVar != null) {
                dVar.a(this.f37124c, "container is null");
                return;
            }
            return;
        }
        if (this.f37128g == null) {
            this.f37128g = new f(viewGroup.getContext(), this.f37123b, this.f37122a);
        }
        this.A = campaignEx;
        a(campaignEx, i10, z10);
    }

    private void b(Activity activity) {
        if (this.f37128g == null) {
            if (activity != null) {
                this.f37128g = new f(activity, this.f37123b, this.f37122a);
            } else {
                this.f37128g = new f(com.mbridge.msdk.foundation.controller.c.n().d(), this.f37123b, this.f37122a);
            }
        }
        if (this.f37132k == null) {
            if (activity != null) {
                this.f37132k = new MBSplashView(activity);
            } else {
                this.f37132k = new MBSplashView(com.mbridge.msdk.foundation.controller.c.n().d());
            }
        }
        if (this.f37138q == null) {
            this.f37138q = new j();
        }
        this.f37138q.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f37122a);
    }

    private void a(String str, int i10) {
        synchronized (this.f37143v) {
            if (this.f37136o) {
                if (this.f37129h != null) {
                    this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                    this.f37136o = true;
                }
                return;
            }
            this.f37136o = true;
            int i11 = this.f37125d;
            if (i11 >= 2 && i11 <= 10) {
                if (this.f37141t != 0 && this.f37142u != 0) {
                    boolean zB = false;
                    try {
                        zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                    } catch (Exception unused) {
                    }
                    if (!zB) {
                        if (this.f37129h != null) {
                            this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                            return;
                        }
                        return;
                    }
                    this.f37132k.clearResState();
                    this.f37135n = h.b().d(com.mbridge.msdk.foundation.controller.c.n().b(), this.f37122a);
                    if (this.f37127f == null) {
                        this.f37127f = new e(this.f37123b, this.f37122a, this.f37126e * 1000);
                    }
                    b bVar = this.f37129h;
                    if (bVar != null) {
                        bVar.a(str);
                        this.f37127f.a(this.f37129h);
                    }
                    this.f37132k.resetLoadState();
                    this.f37127f.a(this.f37125d);
                    this.f37127f.a(this.f37132k);
                    this.f37127f.a(this.f37135n);
                    this.f37127f.a(this.f37141t, this.f37142u);
                    this.f37127f.a(this.f37139r);
                    this.f37127f.b(this.f37140s);
                    this.f37127f.a(str, i10);
                    return;
                }
                if (this.f37129h != null) {
                    this.f37129h.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
                    return;
                }
                return;
            }
            if (this.f37129h != null) {
                com.mbridge.msdk.foundation.error.b bVar2 = new com.mbridge.msdk.foundation.error.b(880037);
                bVar2.c("countDownTime must in 2 - 10");
                this.f37129h.a(bVar2, i10);
            }
        }
    }

    public void a(View view, RelativeLayout.LayoutParams layoutParams) {
        this.f37134m = view;
        if (view != null) {
            a(layoutParams.width, layoutParams.height);
            MBSplashView mBSplashView = this.f37132k;
            if (mBSplashView != null) {
                mBSplashView.setIconVg(view, layoutParams);
            }
        }
    }

    public ViewGroup a(ZoomOutTypeEnum zoomOutTypeEnum) {
        MBSplashPopView mBSplashPopView = new MBSplashPopView(com.mbridge.msdk.foundation.controller.c.n().d(), new BaseSplashPopView.i(this.f37123b, this.f37122a, zoomOutTypeEnum.getIndex(), this.A), this.f37131j);
        this.B = mBSplashPopView;
        return mBSplashPopView;
    }

    private void a(int i10, int i11) {
        int iN = m0.n(com.mbridge.msdk.foundation.controller.c.n().d());
        int iM = m0.m(com.mbridge.msdk.foundation.controller.c.n().d());
        int i12 = this.f37140s;
        if (i12 == 1) {
            if (iM >= i11 * 4) {
                this.f37142u = iM - i11;
                this.f37141t = iN;
                return;
            } else {
                this.f37142u = 0;
                this.f37141t = 0;
                return;
            }
        }
        if (i12 == 2) {
            if (iN >= i10 * 4) {
                this.f37141t = iN - i10;
                this.f37142u = iM;
            } else {
                this.f37142u = 0;
                this.f37141t = 0;
            }
        }
    }

    public void a(boolean z10) {
        MBSplashView mBSplashView = this.f37132k;
        if (mBSplashView != null) {
            mBSplashView.setAllowClickSplash(z10);
        }
    }

    private ViewGroup a(Activity activity) {
        Throwable th2;
        ViewGroup viewGroup;
        if (activity != null && activity.isFinishing()) {
            activity = null;
        }
        if (activity == null) {
            q0.d(D, "splash can't show because, activity is null or activity is finishing");
            return null;
        }
        try {
            viewGroup = (ViewGroup) activity.getWindow().getDecorView().findViewById(R.id.content);
            try {
                try {
                    return (ViewGroup) viewGroup.getChildAt(0);
                } catch (Exception e10) {
                    e10.printStackTrace();
                    return viewGroup;
                }
            } catch (Throwable th3) {
                th2 = th3;
                th2.printStackTrace();
                return viewGroup;
            }
        } catch (Throwable th4) {
            th2 = th4;
            viewGroup = null;
        }
    }

    public void a(int i10, int i11, int i12, int i13) {
        try {
            MBSplashView mBSplashView = this.f37132k;
            if (mBSplashView != null) {
                mBSplashView.setNotchPadding(i10, i11, i12, i13);
            }
        } catch (Throwable th2) {
            q0.b(D, th2.getMessage());
        }
    }

    public void a() {
        this.A = null;
        if (this.f37130i != null) {
            this.f37130i = null;
        }
        if (this.f37129h != null) {
            this.f37129h = null;
        }
        if (this.f37131j != null) {
            this.f37131j = null;
        }
        e eVar = this.f37127f;
        if (eVar != null) {
            eVar.e();
        }
        f fVar = this.f37128g;
        if (fVar != null) {
            fVar.h();
        }
        if (this.f37146y != null) {
            this.f37146y = null;
        }
    }
}
