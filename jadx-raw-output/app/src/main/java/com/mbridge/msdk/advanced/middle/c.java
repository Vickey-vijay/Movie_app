package com.mbridge.msdk.advanced.middle;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.WebView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedView;
import com.mbridge.msdk.advanced.view.MBNativeAdvancedWebview;
import com.mbridge.msdk.advanced.view.MBOutNativeAdvancedViewGroup;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBridgeIds;
import com.mbridge.msdk.out.NativeAdvancedAdListener;
import com.mbridge.msdk.setting.h;
import com.mbridge.msdk.setting.j;
import com.mbridge.msdk.setting.l;
import org.json.JSONObject;

/* JADX INFO: compiled from: NativeAdvancedProvider.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {
    private static String G = "NativeAdvancedProvider";
    private boolean A;
    private boolean B;
    private boolean C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f32671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f32672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private MBridgeIds f32673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.b f32674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.advanced.manager.c f32675e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f32676f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private NativeAdvancedAdListener f32677g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d f32678h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MBNativeAdvancedView f32679i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBNativeAdvancedWebview f32680j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private com.mbridge.msdk.advanced.view.a f32681k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f32682l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f32683m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private j f32684n;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private JSONObject f32694x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private MBOutNativeAdvancedViewGroup f32696z;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f32685o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f32686p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f32687q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f32688r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f32689s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f32690t = false;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f32691u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f32692v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Object f32693w = new Object();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f32695y = false;
    private boolean D = true;
    public boolean E = false;
    private ViewTreeObserver.OnScrollChangedListener F = new a();

    /* JADX INFO: compiled from: NativeAdvancedProvider.java */
    public class a implements ViewTreeObserver.OnScrollChangedListener {

        /* JADX INFO: renamed from: com.mbridge.msdk.advanced.middle.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NativeAdvancedProvider.java */
        public class RunnableC0302a implements Runnable {
            public RunnableC0302a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c.this.D = true;
            }
        }

        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (c.this.D) {
                c.this.D = false;
                if (c.this.f32696z != null) {
                    c.this.f32696z.postDelayed(new RunnableC0302a(), 1000L);
                }
                try {
                    c.this.i();
                } catch (Exception e10) {
                    q0.b(c.G, e10.getMessage());
                }
            }
        }
    }

    private void e(int i10) {
        MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
        if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
            return;
        }
        try {
            if (this.f32680j != null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("netstat", i10);
                f.a().a((WebView) this.f32680j, "onNetstatChanged", Base64.encodeToString(jSONObject.toString().getBytes(), 2));
            }
        } catch (Throwable th2) {
            q0.a(G, th2.getMessage());
        }
    }

    public MBOutNativeAdvancedViewGroup d() {
        return this.f32696z;
    }

    public int f() {
        return this.f32685o;
    }

    public boolean g() {
        return this.f32683m;
    }

    public void h(int i10) {
        this.f32690t = true;
        g(i10);
    }

    public void i(int i10) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3) {
                    if (this.C) {
                        return;
                    } else {
                        this.C = true;
                    }
                }
            } else if (this.B) {
                return;
            } else {
                this.B = true;
            }
        } else if (this.A) {
            return;
        } else {
            this.A = true;
        }
        try {
            i();
        } catch (Exception e10) {
            q0.b(G, e10.getMessage());
        }
    }

    private void g(int i10) {
        if (this.f32690t) {
            this.f32689s = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f32680j, "setVideoPlayMode", "autoPlay", Integer.valueOf(i10));
        }
    }

    private void j() {
        a(this.f32685o);
        c(this.f32687q);
        g(this.f32689s);
        a(this.f32694x);
        e(m0.s(com.mbridge.msdk.foundation.controller.c.n().d()));
    }

    public void b(JSONObject jSONObject) {
        this.f32695y = true;
        a(jSONObject);
    }

    public void c(String str) {
        b bVar = new b(this, this.f32673c);
        this.f32676f = bVar;
        bVar.a(this.f32677g);
        this.f32676f.a(str);
        a(str, 2);
    }

    public void d(String str) {
        if (!TextUtils.isEmpty(str)) {
            c(str);
            return;
        }
        NativeAdvancedAdListener nativeAdvancedAdListener = this.f32677g;
        if (nativeAdvancedAdListener != null) {
            nativeAdvancedAdListener.onLoadFailed(this.f32673c, "bid  token is null or empty");
        }
    }

    public void f(int i10) {
        if (i10 == 1) {
            this.A = false;
        } else if (i10 == 2) {
            this.B = false;
        } else if (i10 == 3) {
            this.C = false;
        }
        h();
    }

    public c(String str, String str2, Activity activity) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            str3 = "";
        } else {
            str3 = str;
        }
        this.f32672b = str3;
        this.f32671a = str2;
        this.f32673c = new MBridgeIds(str, str2);
        a(activity);
    }

    private void h() {
        com.mbridge.msdk.advanced.manager.c cVar = this.f32675e;
        if (cVar != null) {
            cVar.e();
        }
    }

    public void a(boolean z10) {
        this.f32683m = z10;
    }

    public boolean b(String str) {
        return (this.f32696z == null || com.mbridge.msdk.advanced.manager.d.a(this.f32679i, this.f32672b, this.f32671a, str, this.f32685o, false, true) == null) ? false : true;
    }

    private void a(JSONObject jSONObject) {
        if (this.f32695y) {
            this.f32694x = jSONObject;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f32680j, "setStyleList", "", jSONObject);
        }
    }

    public void b(int i10) {
        this.f32686p = true;
        a(i10);
    }

    private void c(int i10) {
        if (this.f32688r) {
            this.f32687q = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            com.mbridge.msdk.advanced.signal.a.a(this.f32680j, "setVolume", CampaignEx.JSON_NATIVE_VIDEO_MUTE, Integer.valueOf(i10));
        }
    }

    public void d(int i10) {
        this.f32688r = true;
        c(i10);
    }

    public void b(int i10, int i11) {
        a(i10, i11);
    }

    public String e() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f32675e;
            return cVar != null ? cVar.c() : "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f32674d;
        return bVar != null ? bVar.d() : "";
    }

    public void b(CampaignEx campaignEx) {
        if (campaignEx != null) {
            if (this.f32682l == null) {
                this.f32682l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32671a);
            }
            this.f32678h = new d(this, this.f32677g, campaignEx);
            q0.a(G, "show start");
            if (this.f32691u != 0 && this.f32692v != 0) {
                a(campaignEx, false);
                return;
            }
            d dVar = this.f32678h;
            if (dVar != null) {
                dVar.a(this.f32673c, "width or height is 0  or width or height is too small");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.A && this.B && this.C) {
            CampaignEx campaignExA = com.mbridge.msdk.advanced.manager.d.a(this.f32679i, this.f32672b, this.f32671a, "", this.f32685o, true, true);
            com.mbridge.msdk.advanced.manager.c cVar = this.f32675e;
            if (cVar != null) {
                cVar.f();
            }
            b(campaignExA);
        }
    }

    public void a(NativeAdvancedAdListener nativeAdvancedAdListener) {
        this.f32677g = nativeAdvancedAdListener;
    }

    private void a(int i10) {
        if (this.f32686p) {
            this.f32685o = i10;
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
            if (mBNativeAdvancedWebview == null || mBNativeAdvancedWebview.isDestoryed()) {
                return;
            }
            int i11 = this.f32685o;
            if (i11 == 1) {
                this.f32675e.a(true);
                com.mbridge.msdk.advanced.signal.a.a(this.f32680j, "showCloseButton", "", null);
            } else if (i11 == 0) {
                this.f32675e.a(false);
                com.mbridge.msdk.advanced.signal.a.a(this.f32680j, "hideCloseButton", "", null);
            }
        }
    }

    public String c() {
        if (this.E) {
            com.mbridge.msdk.advanced.manager.c cVar = this.f32675e;
            return cVar != null ? cVar.a() : "";
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f32674d;
        return bVar != null ? bVar.c() : "";
    }

    public void b() {
        if (this.f32677g != null) {
            this.f32677g = null;
        }
        if (this.f32676f != null) {
            this.f32676f = null;
        }
        if (this.f32678h != null) {
            this.f32678h = null;
        }
        com.mbridge.msdk.advanced.manager.b bVar = this.f32674d;
        if (bVar != null) {
            bVar.a((MBNativeAdvancedView) null);
            this.f32674d.e();
        }
        com.mbridge.msdk.advanced.manager.c cVar = this.f32675e;
        if (cVar != null) {
            cVar.g();
        }
        MBNativeAdvancedView mBNativeAdvancedView = this.f32679i;
        if (mBNativeAdvancedView != null) {
            mBNativeAdvancedView.destroy();
        }
        com.mbridge.msdk.advanced.common.c.b(this.f32672b + this.f32671a + e());
        com.mbridge.msdk.advanced.view.a aVar = this.f32681k;
        if (aVar != null) {
            aVar.b();
        }
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f32696z;
        if (mBOutNativeAdvancedViewGroup != null) {
            mBOutNativeAdvancedViewGroup.getViewTreeObserver().removeOnScrollChangedListener(this.F);
            this.f32696z.removeAllViews();
            this.f32696z = null;
        }
    }

    public void a(CampaignEx campaignEx, boolean z10) {
        j();
        MBOutNativeAdvancedViewGroup mBOutNativeAdvancedViewGroup = this.f32696z;
        if (mBOutNativeAdvancedViewGroup == null || mBOutNativeAdvancedViewGroup.getParent() == null) {
            return;
        }
        if (campaignEx != null && z10) {
            if (this.f32682l == null) {
                this.f32682l = h.b().c(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32671a);
            }
            this.f32678h = new d(this, this.f32677g, campaignEx);
        }
        if (this.f32675e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32672b, this.f32671a);
            this.f32675e = cVar;
            cVar.a(this);
        }
        a(campaignEx);
    }

    private void a(CampaignEx campaignEx) {
        if (com.mbridge.msdk.advanced.manager.d.a(this.f32679i, campaignEx, this.f32672b, this.f32671a)) {
            this.f32675e.a(this.f32678h);
            q0.b(G, "start show process");
            this.f32675e.a(campaignEx, this.f32679i, true);
        }
    }

    private void a(String str, int i10) {
        this.D = true;
        synchronized (this.f32693w) {
            if (this.f32683m) {
                if (this.f32676f != null) {
                    this.f32676f.a(new com.mbridge.msdk.foundation.error.b(880016, "current unit is loading"), i10);
                    this.f32683m = true;
                }
                return;
            }
            this.f32683m = true;
            if (this.f32691u != 0 && this.f32692v != 0) {
                if (this.f32679i == null) {
                    if (this.f32676f != null) {
                        this.f32676f.a(new com.mbridge.msdk.foundation.error.b(880030), i10);
                        return;
                    }
                    return;
                }
                boolean zB = false;
                try {
                    zB = com.mbridge.msdk.mbsignalcommon.webEnvCheck.a.b(com.mbridge.msdk.foundation.controller.c.n().d());
                } catch (Exception e10) {
                    q0.b(G, e10.getMessage());
                }
                if (!zB) {
                    if (this.f32676f != null) {
                        this.f32676f.a(new com.mbridge.msdk.foundation.error.b(880029), i10);
                        return;
                    }
                    return;
                }
                this.f32679i.clearResStateAndRemoveClose();
                l lVarA = h.b().a(com.mbridge.msdk.foundation.controller.c.n().b(), this.f32671a);
                this.f32682l = lVarA;
                if (lVarA == null) {
                    this.f32682l = l.k(this.f32671a);
                }
                if (this.f32674d == null) {
                    this.f32674d = new com.mbridge.msdk.advanced.manager.b(this.f32672b, this.f32671a, 0L);
                }
                b bVar = this.f32676f;
                if (bVar != null) {
                    bVar.a(str);
                    this.f32674d.a(this.f32676f);
                }
                this.f32679i.resetLoadState();
                this.f32674d.a(this.f32679i);
                this.f32674d.a(this.f32682l);
                this.f32674d.a(this.f32691u, this.f32692v);
                this.f32674d.a(this.f32685o);
                this.f32674d.b(str, i10);
                return;
            }
            if (this.f32676f != null) {
                this.f32676f.a(new com.mbridge.msdk.foundation.error.b(880028), i10);
            }
        }
    }

    private void a(Activity activity) {
        com.mbridge.msdk.advanced.view.a aVar;
        ViewGroup.LayoutParams layoutParams;
        Context context;
        if (this.f32675e == null) {
            com.mbridge.msdk.advanced.manager.c cVar = new com.mbridge.msdk.advanced.manager.c(com.mbridge.msdk.foundation.controller.c.n().d(), this.f32672b, this.f32671a);
            this.f32675e = cVar;
            cVar.a(this);
        }
        if (this.f32680j == null) {
            try {
                this.f32680j = new MBNativeAdvancedWebview(com.mbridge.msdk.foundation.controller.c.n().d());
            } catch (Exception e10) {
                q0.b(G, e10.getMessage());
            }
            if (this.f32681k == null) {
                try {
                    this.f32681k = new com.mbridge.msdk.advanced.view.a(this.f32671a, this.f32675e.b(), this);
                } catch (Exception e11) {
                    q0.b(G, e11.getMessage());
                }
            }
            MBNativeAdvancedWebview mBNativeAdvancedWebview = this.f32680j;
            if (mBNativeAdvancedWebview != null && (aVar = this.f32681k) != null) {
                mBNativeAdvancedWebview.setWebViewClient(aVar);
            }
        }
        if (this.f32679i == null) {
            Context contextD = com.mbridge.msdk.foundation.controller.c.n().d();
            if (activity == null) {
                context = activity;
                context = contextD;
            }
            context = activity;
            MBNativeAdvancedView mBNativeAdvancedView = new MBNativeAdvancedView(context);
            this.f32679i = mBNativeAdvancedView;
            mBNativeAdvancedView.setAdvancedNativeWebview(this.f32680j);
            MBNativeAdvancedWebview mBNativeAdvancedWebview2 = this.f32680j;
            if (mBNativeAdvancedWebview2 != null && mBNativeAdvancedWebview2.getParent() == null) {
                this.f32679i.addView(this.f32680j, new ViewGroup.LayoutParams(-1, -1));
            }
        }
        if (this.f32696z == null) {
            this.f32696z = new MBOutNativeAdvancedViewGroup(com.mbridge.msdk.foundation.controller.c.n().d());
            if (this.f32691u != 0 && this.f32692v != 0) {
                layoutParams = new ViewGroup.LayoutParams(this.f32691u, this.f32692v);
            } else {
                layoutParams = new ViewGroup.LayoutParams(-1, -1);
            }
            this.f32696z.setLayoutParams(layoutParams);
            this.f32696z.setProvider(this);
            this.f32696z.addView(this.f32679i);
            this.f32696z.getViewTreeObserver().addOnScrollChangedListener(this.F);
        }
        if (this.f32684n == null) {
            this.f32684n = new j();
        }
        this.f32684n.a(com.mbridge.msdk.foundation.controller.c.n().d(), com.mbridge.msdk.foundation.controller.c.n().b(), com.mbridge.msdk.foundation.controller.c.n().c(), this.f32671a);
    }

    public String a(String str) {
        com.mbridge.msdk.advanced.manager.b bVar = this.f32674d;
        return bVar != null ? bVar.a(str) : "";
    }

    private void a(int i10, int i11) {
        if (i10 <= 0 || i11 <= 0) {
            return;
        }
        this.f32692v = i10;
        this.f32691u = i11;
        this.f32696z.setLayoutParams(new ViewGroup.LayoutParams(i11, i10));
    }
}
