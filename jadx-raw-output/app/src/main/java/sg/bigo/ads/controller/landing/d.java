package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.text.TextUtils;
import android.transition.Fade;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import sg.bigo.ads.api.b.h;
import sg.bigo.ads.common.u.g;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.landing.WebViewActivityImpl;

/* JADX INFO: loaded from: classes10.dex */
public class d extends WebViewActivityImpl implements h {
    private final ValueCallback<Boolean> F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f70983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f70984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f70986e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f70987f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f70988g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f70989h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private sg.bigo.ads.controller.landing.a f70990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f70991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f70992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<h.a> f70993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f70994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @IntRange(from = 0, to = 100)
    private int f70995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f70996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final String f70997p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @Nullable
    private WebHistoryItem f70998q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f70999r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.ad.c<?, ?> f71000s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.api.core.b f71001t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f71002u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f71003v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f71004w;

    public static class a implements h.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f71007a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f71008b;

        private a(int i10, long j10) {
            this.f71007a = i10;
            this.f71008b = System.currentTimeMillis() - j10;
        }

        public /* synthetic */ a(int i10, long j10, byte b10) {
            this(i10, j10);
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final int a() {
            return this.f71007a;
        }

        @Override // sg.bigo.ads.api.b.h.a
        public final long b() {
            return this.f71008b;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:11:0x008f. Please report as an issue. */
    public d(@NonNull Activity activity) {
        int intExtra;
        int i10;
        super(activity);
        this.f70982a = com.safedk.android.internal.d.f44769a;
        this.f70984c = -1L;
        this.f70985d = 0;
        this.f70987f = false;
        this.f70993l = new ArrayList();
        this.f70994m = 0;
        this.f70995n = 0;
        this.f70996o = 0;
        this.f71004w = false;
        this.F = new ValueCallback<Boolean>() { // from class: sg.bigo.ads.controller.landing.d.1
            @Override // android.webkit.ValueCallback
            public final /* synthetic */ void onReceiveValue(Boolean bool) {
                Boolean bool2 = bool;
                if (d.this.f71567z != null) {
                    if (bool2 == null || !bool2.booleanValue()) {
                        ViewParent parent = d.this.f71567z.getParent();
                        if (parent instanceof ViewGroup) {
                            TransitionSet transitionSet = new TransitionSet();
                            transitionSet.addTransition(new Fade(1));
                            transitionSet.setDuration(300L);
                            TransitionManager.beginDelayedTransition((ViewGroup) parent, transitionSet);
                        }
                    }
                    d.this.f71567z.setEnabled(true);
                    d.this.f71567z.setVisibility(0);
                }
            }
        };
        Intent intent = this.L.getIntent();
        int i11 = -1;
        if (intent != null) {
            int intExtra2 = intent.getIntExtra("ad_identifier", -1);
            this.f70992k = intent.getIntExtra("land_way", -1);
            intExtra = intent.getIntExtra("webview_force_time", -1);
            i11 = intExtra2;
        } else {
            this.f70992k = -1;
            intExtra = -1;
        }
        sg.bigo.ads.ad.c<?, ?> cVarB = e.b(i11);
        this.f71000s = cVarB;
        if (cVarB != null) {
            this.f71001t = cVarB.f();
            this.f70988g = this.f71000s.s();
            this.f70989h = this.f71000s.t();
            this.f70990i = this.f71000s.f67548m;
            this.f70983b = this.f71001t.N().e();
            this.f70986e = this.f71001t.d().f();
        } else {
            this.f70988g = 0;
            this.f70989h = System.currentTimeMillis();
        }
        switch (intExtra) {
            case -1:
                this.f70999r = false;
                this.f71002u = false;
                this.f71003v = 0;
                break;
            case 0:
            default:
                this.f70999r = true;
                this.f71002u = false;
                this.f71003v = 0;
                break;
            case 1:
            case 2:
            case 3:
            case 4:
                this.f70999r = false;
                this.f71002u = true;
                i10 = intExtra + 1;
                this.f71003v = i10;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                this.f70999r = true;
                this.f71002u = false;
                i10 = intExtra - 3;
                this.f71003v = i10;
                break;
        }
        this.f70997p = a(activity);
    }

    private static String a(Activity activity) {
        try {
            String packageName = activity.getPackageName();
            String str = activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).taskAffinity;
            if (TextUtils.equals(packageName, str)) {
                return null;
            }
            return str;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
        }
    }

    private void c(int i10) {
        a aVar = new a(i10, this.f70989h, (byte) 0);
        this.f70993l.add(0, aVar);
        sg.bigo.ads.api.core.b bVar = this.f71001t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(this, aVar, bVar, this.f71000s, this.f70997p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void F() {
        super.F();
        sg.bigo.ads.controller.landing.a aVar = this.f70990i;
        if (aVar != null) {
            aVar.f70941d = false;
            this.f70990i = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void T() {
        this.f70984c = SystemClock.elapsedRealtime();
        c(1);
        super.T();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(int i10) {
        super.a(i10);
        this.f70995n = Math.max(this.f70995n, i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(int i10, String str, String str2) {
        super.a(i10, str, str2);
        if (this.f70987f) {
            return;
        }
        c(6);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str) {
        super.a(str);
        if (!this.f70987f) {
            this.f70995n = 100;
            c(5);
            if (this.f71002u) {
                w();
            }
        }
        this.f70987f = true;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void a(String str, boolean z10) {
        super.a(str, z10);
        if (z10) {
            c(4);
        }
        int i10 = this.f70985d;
        if (i10 == 0) {
            this.C = str;
        }
        this.f70985d = i10 + 1;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(@NonNull sg.bigo.ads.api.core.d dVar) {
        sg.bigo.ads.ad.c<?, ?> cVar;
        int i10;
        sg.bigo.ads.api.core.b bVar = this.f71001t;
        if (bVar != null) {
            sg.bigo.ads.core.d.b.a(bVar, 2, dVar, this.f71000s);
            sg.bigo.ads.api.core.d dVar2 = this.E;
            if (dVar2 == null || (cVar = this.f71000s) == null || (i10 = dVar2.f69362d) < 0) {
                return;
            }
            if (!dVar2.f69364f && i10 == 1) {
                dVar2.f69362d = 4;
                cVar.a(new c(4, dVar2.f69363e));
            }
            if (!(i10 == 1 || i10 == 4) || this.E.f69364f) {
                if (i10 == 1) {
                    this.E.f69362d = 4;
                }
                sg.bigo.ads.api.core.b bVarF = this.f71000s.f();
                sg.bigo.ads.api.core.d dVar3 = this.E;
                sg.bigo.ads.core.d.b.b(bVarF, dVar3.f69362d, 2, dVar3.f69363e);
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    @CallSuper
    public void ah() {
        super.ah();
        if (this.f71000s != null) {
            e.a();
            this.f71000s = null;
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void b() {
        super.b();
        if (this.f70999r || this.f71002u) {
            q();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void c(String str) {
        super.c(str);
        this.f70996o++;
        this.f70994m = !URLUtil.isNetworkUrl(str) ? 1 : 0;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final String d(String str) {
        sg.bigo.ads.api.core.b bVar = this.f71001t;
        return bVar != null ? sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f71001t.N().i(), str) : super.d(str);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public void d() {
        super.d();
        if (this.f70999r) {
            w();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d(int i10) {
        if (u()) {
            return;
        }
        super.d(i10);
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e(int i10) {
        super.e(i10);
        String str = this.f70983b;
        if (!TextUtils.isEmpty(str)) {
            sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(sg.bigo.ads.common.y.a.a(), new sg.bigo.ads.common.u.b.d(str), this.L);
            aVar.f69951l = sg.bigo.ads.common.u.a.e.a();
            g.a(aVar, null);
        }
        if (this.f71001t != null) {
            sg.bigo.ads.core.d.b.a(this, this.f70993l.isEmpty() ? null : this.f70993l.get(0), System.currentTimeMillis() - this.f70989h, this.f70985d, this.f71001t, this.f71000s, this.f70997p);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void g(boolean z10) {
        if (z10) {
            aF();
        }
    }

    public int h() {
        return 0;
    }

    @Override // sg.bigo.ads.api.b.h
    public final String i() {
        return this.C;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int j() {
        return this.f70994m;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int k() {
        return this.f70996o;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int l() {
        return this.f70995n;
    }

    @Override // sg.bigo.ads.api.b.h
    public final boolean m() {
        sg.bigo.ads.controller.landing.a aVar = this.f70990i;
        return aVar != null && aVar.f70941d;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int n() {
        return this.f70988g;
    }

    @Override // sg.bigo.ads.api.b.h
    public final int o() {
        return this.f70992k;
    }

    @Override // sg.bigo.ads.api.b.h
    @Nullable
    public final Map<String, String> p() {
        return null;
    }

    public final void q() {
        ImageView imageView = this.f71567z;
        if (imageView != null) {
            imageView.setVisibility(4);
            this.f71567z.setEnabled(false);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    @Nullable
    public final WebView r() {
        sg.bigo.ads.core.h.e eVar;
        sg.bigo.ads.controller.landing.a aVar = this.f70990i;
        sg.bigo.ads.core.h.e eVar2 = null;
        if (aVar != null && aVar.b() && (eVar = aVar.f70943f) != null) {
            u.b(eVar);
            sg.bigo.ads.core.h.e eVar3 = aVar.f70943f;
            aVar.f70943f = null;
            eVar2 = eVar3;
        }
        if (eVar2 == null) {
            return super.r();
        }
        this.f70991j = true;
        return eVar2;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void s() {
        c(2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void t() {
        sg.bigo.ads.api.core.b bVar;
        if (this.B == null) {
            return;
        }
        sg.bigo.ads.controller.landing.a aVar = this.f70990i;
        if (aVar == null) {
            bVar = this.f71001t;
            if (bVar != null) {
                this.C = sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f71001t.N().i(), this.C);
            }
            super.t();
        } else if (aVar.f70940c != 2 || q.a((CharSequence) aVar.f70942e)) {
            int i10 = this.f70990i.f70940c;
            if (i10 == 3 && this.f70991j) {
                this.D = SystemClock.elapsedRealtime();
                b(this.B.getTitle());
                if (this.f70990i.f70941d) {
                    ProgressBar progressBar = this.f71566y;
                    if (progressBar != null) {
                        progressBar.setAlpha(0.0f);
                    }
                    a(this.C);
                    return;
                }
                return;
            }
            if (i10 == 4 && this.f70991j) {
                this.f70998q = this.B.copyBackForwardList().getCurrentItem();
            }
            bVar = this.f71001t;
            if (bVar != null) {
                this.C = sg.bigo.ads.core.landing.a.a(bVar.N().h(), this.f71001t.N().i(), this.C);
            }
            super.t();
        } else {
            this.B.loadDataWithBaseURL(this.C, this.f70990i.f70942e, "text/html", "UTF-8", null);
        }
        c(3);
    }

    public final boolean u() {
        int i10;
        if (this.f70999r || this.f71002u) {
            ImageView imageView = this.f71567z;
            return (imageView == null || imageView.isEnabled()) ? false : true;
        }
        if (!this.f70987f && (i10 = this.f70986e) > 0 && i10 <= 10000) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f70984c;
            if (jElapsedRealtime > 0 && jElapsedRealtime < i10) {
                return true;
            }
        }
        return false;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean v() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        if (this.f70998q != null) {
            WebBackForwardList webBackForwardListCopyBackForwardList = webView.copyBackForwardList();
            int currentIndex = webBackForwardListCopyBackForwardList.getCurrentIndex();
            if (currentIndex <= 0) {
                return super.v();
            }
            WebHistoryItem itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(currentIndex - 1);
            if (itemAtIndex != null) {
                return (TextUtils.equals(this.f70998q.getOriginalUrl(), itemAtIndex.getOriginalUrl()) || TextUtils.equals(this.f70998q.getUrl(), itemAtIndex.getUrl())) ? false : true;
            }
        }
        return super.v();
    }

    public final void w() {
        if (this.f71003v <= 0) {
            this.F.onReceiveValue(Boolean.TRUE);
            return;
        }
        WebView webView = this.B;
        if (webView != null) {
            webView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.d.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (d.this.F != null) {
                        d.this.F.onReceiveValue(Boolean.FALSE);
                    }
                }
            }, r.f70030a.a(this.f71003v));
        }
    }
}
