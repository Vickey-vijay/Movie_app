package sg.bigo.ads.ad.banner;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.UiThread;
import com.google.android.material.badge.BadgeDrawable;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.R;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.AdSize;
import sg.bigo.ads.api.BannerAdRequest;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.core.mraid.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c<T extends Ad> implements sg.bigo.ads.ad.banner.b.InterfaceC0656b {
    private AdSize A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WebView f67457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f67458b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f67460d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f67464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public sg.bigo.ads.core.c.b f67465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public h f67466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f67467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T f67468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final sg.bigo.ads.api.core.h f67469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f67470n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public WeakReference<Activity> f67472p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public a f67473q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g f67474r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @Nullable
    public AdOptionsView f67475s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @Nullable
    public LinearLayout f67476t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f67477u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public sg.bigo.ads.common.view.c f67478v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private sg.bigo.ads.core.mraid.e f67479w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @NonNull
    private final n f67480x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private BannerAdRequest f67482z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f67459c = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f67461e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67462f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67463g = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f67481y = false;
    private final View.OnAttachStateChangeListener B = new View.OnAttachStateChangeListener() { // from class: sg.bigo.ads.ad.banner.c.1
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            sg.bigo.ads.ad.banner.b.e(c.this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            sg.bigo.ads.ad.banner.b.f(c.this);
            view.removeOnAttachStateChangeListener(this);
        }
    };

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final AtomicBoolean f67471o = new AtomicBoolean(false);

    public interface a {
        void a(int i10, int i11);
    }

    public static class b implements sg.bigo.ads.api.b.a.InterfaceC0697a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private sg.bigo.ads.api.b.a.InterfaceC0697a f67509c;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f67508b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Handler f67507a = new Handler();

        public b(sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a) {
            this.f67509c = interfaceC0697a;
        }

        private boolean c() {
            if (this.f67508b) {
                return true;
            }
            this.f67507a.removeCallbacks(null);
            this.f67508b = true;
            return false;
        }

        public final void a() {
            a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error because of destroying before loaded"));
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
        public final void a(sg.bigo.ads.api.core.c cVar) {
            sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a;
            if (c() || (interfaceC0697a = this.f67509c) == null) {
                return;
            }
            interfaceC0697a.a(cVar);
        }

        @Override // sg.bigo.ads.api.b.a.InterfaceC0697a
        public final void b() {
            sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a;
            if (c() || (interfaceC0697a = this.f67509c) == null) {
                return;
            }
            interfaceC0697a.b();
        }
    }

    public c(Context context, sg.bigo.ads.api.core.f fVar, T t10, sg.bigo.ads.api.core.h hVar, @NonNull n nVar, h hVar2, boolean z10) {
        this.f67467k = context;
        this.f67468l = t10;
        this.f67469m = hVar;
        this.f67480x = nVar;
        this.f67466j = hVar2;
        this.f67470n = z10;
        if (fVar != null) {
            sg.bigo.ads.api.b bVar = fVar.f69378c;
            if (bVar instanceof BannerAdRequest) {
                this.f67482z = (BannerAdRequest) bVar;
            }
        }
        if (fVar == null || !q.b((CharSequence) fVar.f69378c.f69325g)) {
            return;
        }
        this.f67478v = new sg.bigo.ads.common.view.c(context, fVar.f69378c.f69325g);
    }

    public static /* synthetic */ View a(c cVar, View view) {
        LinearLayout linearLayout = new LinearLayout(cVar.f67467k);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(17);
        if (view != null) {
            linearLayout.addView(view);
        }
        if (cVar.f67475s == null) {
            cVar.f67475s = new AdOptionsView(cVar.f67467k);
        }
        AdOptionsView adOptionsView = cVar.f67475s;
        sg.bigo.ads.api.core.h hVar = cVar.f67469m;
        adOptionsView.a(hVar, hVar.l());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(sg.bigo.ads.common.utils.e.a(cVar.f67467k, 16), sg.bigo.ads.common.utils.e.a(cVar.f67467k, 16), BadgeDrawable.TOP_START);
        layoutParams.leftMargin = sg.bigo.ads.common.utils.e.a(cVar.f67467k, 10);
        cVar.f67475s.setLayoutParams(layoutParams);
        linearLayout.addView(cVar.f67475s);
        return linearLayout;
    }

    public static /* synthetic */ TextView a(Context context, boolean z10) {
        if (!z10) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(sg.bigo.ads.common.utils.a.a(context, R.string.bigo_ad_tag, new Object[0]));
        textView.setBackgroundResource(R.drawable.bigo_ad_bg_ad_tag_white_border);
        textView.setTextColor(q.b("#B2FFFFFF", -1));
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 3), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    public static /* synthetic */ TextView a(Context context, boolean z10, String str) {
        if (!z10 || q.a((CharSequence) str)) {
            return null;
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.bigo_ad_banner_advertiser_background);
        textView.setTextColor(-1);
        textView.setTextSize(9.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxWidth(sg.bigo.ads.common.utils.e.a(context, 240));
        textView.setBackgroundColor(q.b("#FFD6D9DB", -7829368));
        textView.setPadding(sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1), sg.bigo.ads.common.utils.e.a(context, 4), sg.bigo.ads.common.utils.e.a(context, 1));
        return textView;
    }

    private void a(FrameLayout.LayoutParams layoutParams, int i10, int i11) {
        layoutParams.width = i10;
        layoutParams.height = i11;
        layoutParams.gravity = 17;
        this.f67458b.setMinimumHeight(i11);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ProcessVariables
        jadx.core.utils.exceptions.JadxRuntimeException: Method arg registers not loaded: sg.bigo.ads.core.h.a.1.<init>(sg.bigo.ads.core.h.a, android.content.Context):void, class status: GENERATED_AND_UNLOADED
        	at jadx.core.dex.nodes.MethodNode.getArgRegs(MethodNode.java:309)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isArgUnused(ProcessVariables.java:146)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.lambda$isVarUnused$0(ProcessVariables.java:131)
        	at jadx.core.utils.ListUtils.allMatch(ListUtils.java:224)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.isVarUnused(ProcessVariables.java:131)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:82)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    @androidx.annotation.UiThread
    private boolean c(@androidx.annotation.Nullable final sg.bigo.ads.api.b.a.InterfaceC0697a r14) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.ad.banner.c.c(sg.bigo.ads.api.b.a$a):boolean");
    }

    public final void a() {
        if (sg.bigo.ads.common.n.d.b()) {
            b();
        } else {
            sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.4
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.b();
                }
            });
        }
    }

    public final void a(final sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a) {
        sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.3
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                if (cVar.f67459c != 0) {
                    if (cVar.b(interfaceC0697a)) {
                        return;
                    }
                    interfaceC0697a.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
                    return;
                }
                b bVar = cVar.f67460d;
                if (bVar != null) {
                    bVar.a();
                }
                c.this.f67460d = new b(interfaceC0697a);
                final b bVar2 = c.this.f67460d;
                bVar2.f67507a.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.banner.c.b.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        b.this.b();
                    }
                }, 15000L);
                c cVar2 = c.this;
                if (cVar2.b(cVar2.f67460d)) {
                    return;
                }
                c.this.f67460d.a(new sg.bigo.ads.api.core.c(3001, 10102, "Adx media load error when preload"));
            }
        });
    }

    public final void b() {
        try {
            sg.bigo.ads.ad.banner.b.h(this);
            sg.bigo.ads.core.c.b bVar = this.f67465i;
            if (bVar != null) {
                bVar.b();
            }
            b bVar2 = this.f67460d;
            if (bVar2 != null) {
                bVar2.a();
            }
            if (this.f67464h != null) {
                this.f67464h = null;
            }
            sg.bigo.ads.core.mraid.e eVar = this.f67479w;
            if (eVar != null) {
                eVar.e();
                this.f67479w = null;
            }
            View view = this.f67458b;
            if (view != null) {
                view.removeOnAttachStateChangeListener(this.B);
                this.f67458b = null;
            }
            WebView webView = this.f67457a;
            if (webView != null) {
                u.b(webView);
                this.f67457a = null;
            }
        } catch (Throwable unused) {
        }
    }

    @UiThread
    public final boolean b(@Nullable sg.bigo.ads.api.b.a.InterfaceC0697a interfaceC0697a) {
        if (this.f67477u) {
            return true;
        }
        boolean zC = c(interfaceC0697a);
        this.f67477u = zC;
        return zC;
    }

    @NonNull
    public final View c() {
        if (this.f67458b == null) {
            sg.bigo.ads.common.t.a.a(2, "BannerAd", "The banner ad is not ready, an empty view will be retrieved.");
            this.f67458b = new FrameLayout(this.f67467k);
        }
        sg.bigo.ads.ad.banner.b.d(this);
        this.f67458b.addOnAttachStateChangeListener(this.B);
        return this.f67458b;
    }

    public final String d() {
        sg.bigo.ads.api.core.h hVar = this.f67469m;
        return hVar != null ? hVar.z() : "";
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[PHI: r0 r1
  0x0053: PHI (r0v11 android.app.Activity) = (r0v6 android.app.Activity), (r0v13 android.app.Activity) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r1v3 T extends sg.bigo.ads.api.Ad) = (r1v1 T extends sg.bigo.ads.api.Ad), (r1v6 T extends sg.bigo.ads.api.Ad) binds: [B:37:0x0094, B:21:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    @NonNull
    public final Context e() {
        Activity activityB;
        T t10;
        String str;
        WeakReference<Activity> weakReference = this.f67472p;
        if (weakReference == null || (activityB = weakReference.get()) == null) {
            activityB = null;
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Interstitial/Reward Video banner ad get activity context from show(Activity activity).");
            T t11 = this.f67468l;
            if (t11 instanceof sg.bigo.ads.ad.c) {
                ((sg.bigo.ads.ad.c) t11).b(1);
            }
        }
        if (activityB == null) {
            sg.bigo.ads.api.a.h hVar = sg.bigo.ads.api.a.i.f69318a;
            if (this.f67480x == n.INTERSTITIAL) {
                if (hVar != null && hVar.n().a(16)) {
                    activityB = sg.bigo.ads.common.f.b.b();
                    if (activityB == null) {
                        str = "Interstitial/Reward Video banner ad failed to get activity context.";
                        sg.bigo.ads.common.t.a.a(0, "BannerAd", str);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Interstitial/Reward Video banner ad get activity context from current activity.");
                        t10 = this.f67468l;
                        if (t10 instanceof sg.bigo.ads.ad.c) {
                            ((sg.bigo.ads.ad.c) t10).b(2);
                        }
                    }
                }
            } else if (hVar != null && hVar.n().a(17)) {
                try {
                    Activity activityA = sg.bigo.ads.common.utils.c.a(this.f67458b);
                    if (activityA != null) {
                        try {
                            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner ad get activity context from view.");
                            T t12 = this.f67468l;
                            if (t12 instanceof sg.bigo.ads.ad.c) {
                                ((sg.bigo.ads.ad.c) t12).b(3);
                            }
                        } catch (Exception unused) {
                        }
                        activityB = activityA;
                    }
                } catch (Exception unused2) {
                }
                if (activityB == null) {
                    activityB = sg.bigo.ads.common.f.b.b();
                    if (activityB == null) {
                        str = "Banner ad failed to get activity context.";
                        sg.bigo.ads.common.t.a.a(0, "BannerAd", str);
                    } else {
                        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Banner ad get activity context from current activity.");
                        t10 = this.f67468l;
                        if (t10 instanceof sg.bigo.ads.ad.c) {
                            ((sg.bigo.ads.ad.c) t10).b(2);
                        }
                    }
                }
            }
        }
        return activityB == null ? this.f67467k : activityB;
    }

    public final void f() {
        sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "performImpression");
        sg.bigo.ads.ad.banner.b.g(this);
        T t10 = this.f67468l;
        if (t10 instanceof e) {
            ((e) t10).a(sg.bigo.ads.ad.banner.b.i(this));
        }
        if (this.f67461e) {
            return;
        }
        this.f67461e = true;
        if (this.f67462f) {
            h();
            g();
            sg.bigo.ads.core.c.b bVar = this.f67465i;
            if (bVar != null) {
                bVar.a();
            }
        }
    }

    public final void g() {
        if (this.f67457a != null) {
            sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "javascript:onViewImpression()");
            this.f67457a.loadUrl("javascript:onViewImpression()");
        }
    }

    public final void h() {
        final WebView webView = this.f67457a;
        if (this.f67481y || !(webView instanceof sg.bigo.ads.core.h.b)) {
            return;
        }
        this.f67481y = true;
        sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.ad.banner.c.2
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.core.h.b.C0738b c0738b;
                long j10;
                long jA;
                long j11;
                long jA2;
                long j12;
                sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Notify webView performance stat.");
                sg.bigo.ads.core.h.b bVar = (sg.bigo.ads.core.h.b) webView;
                if (sg.bigo.ads.api.a.i.f69318a.n().a(0) || sg.bigo.ads.api.a.i.f69318a.n().a(1)) {
                    sg.bigo.ads.core.h.b.C0738b c0738b2 = bVar.f71538h;
                    sg.bigo.ads.core.h.b.a(c0738b2);
                    if (sg.bigo.ads.api.a.i.f69318a.n().a(1)) {
                        if (bVar.f71539i == null) {
                            bVar.f71539i = new sg.bigo.ads.core.h.b.c(bVar, (byte) 0);
                        }
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        c0738b2.f71545d = bVar.f71539i.a();
                        c0738b2.f71548g = SystemClock.elapsedRealtime() - jElapsedRealtime;
                        c0738b2.f71547f = SystemClock.elapsedRealtime();
                    }
                    c0738b = c0738b2;
                } else {
                    c0738b = null;
                }
                if (c0738b != null) {
                    Boolean bool = c0738b.f71544c;
                    if (bool == null && c0738b.f71545d == null) {
                        return;
                    }
                    Boolean bool2 = c0738b.f71545d;
                    if (bool != null) {
                        long j13 = bool.booleanValue() ? 1L : 0L;
                        jA = sg.bigo.ads.ad.banner.b.a(c.this, c0738b.f71546e);
                        j10 = j13;
                    } else {
                        j10 = -1;
                        jA = -1;
                    }
                    if (bool2 != null) {
                        long j14 = bool2.booleanValue() ? 1L : 0L;
                        long j15 = c0738b.f71548g;
                        jA2 = sg.bigo.ads.ad.banner.b.a(c.this, c0738b.f71547f);
                        j11 = j14;
                        j12 = j15;
                    } else {
                        j11 = -1;
                        jA2 = -1;
                        j12 = -1;
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "BannerAd", "Stat check blank resutl.");
                    sg.bigo.ads.core.d.b.a(c.this.f67469m, j10, jA, j11, jA2, j12);
                }
            }
        });
    }

    public final AdSize i() {
        List<AdSize> list;
        if (this.A == null) {
            BannerAdRequest bannerAdRequest = this.f67482z;
            if (bannerAdRequest != null && (list = bannerAdRequest.f69284i) != null) {
                for (AdSize adSize : list) {
                    if (!adSize.f69283a.equals(AdSize.ADAPTIVE)) {
                        this.A = adSize;
                        break;
                    }
                }
            }
            if (this.A == null) {
                Context context = this.f67467k;
                this.A = sg.bigo.ads.common.utils.e.c(context, context.getResources().getDisplayMetrics().widthPixels) > 720 ? AdSize.LEADERBOARD : AdSize.BANNER;
            }
        }
        return this.A;
    }
}
