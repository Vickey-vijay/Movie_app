package sg.bigo.ads.ad.splash;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.R;
import sg.bigo.ads.ad.interstitial.AdCountDownButton;
import sg.bigo.ads.ad.interstitial.v;
import sg.bigo.ads.ad.interstitial.w;
import sg.bigo.ads.ad.splash.a.d;
import sg.bigo.ads.ad.splash.a.e;
import sg.bigo.ads.ad.splash.a.g;
import sg.bigo.ads.ad.splash.a.h;
import sg.bigo.ads.ad.splash.a.j;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.NativeAd;
import sg.bigo.ads.api.SplashAd;
import sg.bigo.ads.api.SplashAdInteractionListener;
import sg.bigo.ads.api.a.i;
import sg.bigo.ads.api.a.m;
import sg.bigo.ads.api.core.f;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.common.utils.n;
import sg.bigo.ads.common.utils.u;

/* JADX INFO: loaded from: classes5.dex */
public final class b extends sg.bigo.ads.ad.c<SplashAd, sg.bigo.ads.core.a.a> implements SplashAd {
    public boolean A;

    @NonNull
    public final c B;

    @Nullable
    public final m C;
    public final f D;
    private h E;
    private sg.bigo.ads.ad.splash.a.a F;
    private long G;

    @NonNull
    private final m H;
    private ViewGroup I;
    private AdCountDownButton J;
    private n K;
    private Runnable L;
    private Runnable M;
    private Runnable N;
    private Runnable O;
    private n P;
    private long Q;
    private long R;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public g f69248y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.b.b f69249z;

    public b(@NonNull sg.bigo.ads.ad.b.b bVar, f fVar, @NonNull m mVar, @Nullable m mVar2) {
        h bVar2;
        super(fVar);
        this.A = false;
        this.Q = 0L;
        this.R = 0L;
        this.H = mVar;
        this.C = mVar2;
        this.D = fVar;
        a((sg.bigo.ads.api.b.a) bVar);
        this.f69249z = bVar;
        c cVar = new c() { // from class: sg.bigo.ads.ad.splash.b.1
            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdClicked() {
                super.onAdClicked();
                if (b.this.E != null) {
                    b.this.E.b();
                }
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.SplashAdInteractionListener
            public final void onAdFinished() {
                super.onAdFinished();
            }

            @Override // sg.bigo.ads.ad.splash.c, sg.bigo.ads.api.AdInteractionListener
            public final void onAdImpression() {
                super.onAdImpression();
                b.this.G = SystemClock.elapsedRealtime();
                if (b.this.E != null) {
                    b.this.E.a();
                }
                b.this.A();
            }
        };
        this.B = cVar;
        bVar.setAdInteractionListener(cVar);
        int iAs = fVar.f69376a.as();
        int iA = mVar2 != null ? mVar2.a("video_play_page.interactive_method", 0) : 0;
        if (1 == iAs && iA != 0) {
            bVar2 = new d(fVar, mVar, mVar2, this);
        } else if (mVar2 == null || a.b(mVar) || a.b()) {
            bVar2 = new sg.bigo.ads.ad.splash.a.b(fVar, mVar, mVar2, this);
        } else {
            int iA2 = mVar2.a("video_play_page.ad_component_layout");
            bVar2 = iA2 != 3 ? (iA2 == 4 || iA2 == 5) ? new sg.bigo.ads.ad.splash.a.f(iA2, fVar, mVar, mVar2, this) : new sg.bigo.ads.ad.splash.a.b(fVar, mVar, mVar2, this) : new e(fVar, mVar, mVar2, this);
        }
        this.E = bVar2;
    }

    private boolean I() {
        return f().aS() && S();
    }

    private void J() {
        ViewGroup viewGroup;
        if (this.C == null || !F()) {
            return;
        }
        if (this.F == null && (viewGroup = this.I) != null) {
            this.F = new sg.bigo.ads.ad.splash.a.a(viewGroup, this, this.C);
        }
        int iA = this.C.a("endpage.endpage_timing", 0);
        if (iA >= 3) {
            int i10 = 3000;
            if (iA == 4) {
                i10 = 5000;
            } else if (iA == 5) {
                i10 = 10000;
            }
            if (this.P == null && !K()) {
                this.P = new n(i10) { // from class: sg.bigo.ads.ad.splash.b.10
                    @Override // sg.bigo.ads.common.utils.n
                    public final void a() {
                        b bVar = b.this;
                        if (bVar.f67544i || bVar.K()) {
                            return;
                        }
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.10.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                b.this.a(8, 12);
                            }
                        });
                    }

                    @Override // sg.bigo.ads.common.utils.n
                    public final void a(long j10) {
                    }
                };
            }
            this.P.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        return aVar != null && aVar.f69107c == sg.bigo.ads.ad.splash.a.c.a.f69156b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        g gVar = this.f69248y;
        if (gVar != null) {
            gVar.a(this.O);
            sg.bigo.ads.common.n.d.a(this.N);
            this.f69248y.c();
            this.f69248y = null;
            this.O = null;
            this.N = null;
        }
    }

    private void M() {
        int iA;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            return;
        }
        adCountDownButton.e();
        m mVar = this.C;
        if (mVar == null || (iA = mVar.a("endpage.close_click_seconds", 0)) <= 0) {
            return;
        }
        this.J.clearAnimation();
        this.J.setVisibility(4);
        if (this.M == null) {
            this.M = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (b.this.D() || b.this.J.getVisibility() == 0) {
                        return;
                    }
                    b.this.J.setVisibility(0);
                    sg.bigo.ads.ad.interstitial.c.b((View) b.this.J);
                }
            };
        }
        sg.bigo.ads.common.n.d.a(2, this.M, ((long) iA) * 1000);
    }

    private boolean N() {
        m mVar = this.C;
        return (mVar == null || 1 != mVar.a("video_play_page.is_auto_close", 0) || S()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean S() {
        m mVar = this.C;
        return mVar != null && 6 == mVar.a("video_play_page.ad_component_layout", 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T() {
        m mVar;
        return F() && (mVar = this.C) != null && 2 == mVar.a("endpage.ad_component_layout", 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.app.Activity] */
    private void a(Activity activity, boolean z10) {
        sg.bigo.ads.api.a.h hVar;
        if (I()) {
            this.E = new j(this.D, this.H, this.C, this);
        }
        a(activity == 0, z10);
        if (activity != 0) {
            this.f69249z.b(activity);
        }
        this.f69249z.c(1);
        this.f69249z.a(true);
        sg.bigo.ads.core.d.b.a(f());
        if (activity != 0) {
            a(1);
        }
        if (activity == 0 && (hVar = i.f69318a) != null && hVar.n().a(16)) {
            activity = sg.bigo.ads.common.f.b.b();
            a(2);
        }
        if (activity == 0) {
            activity = this.f67537b.f69380e;
        }
        if (activity != 0) {
            int iA = this.Y.a();
            this.Z = iA;
            sg.bigo.ads.api.b.a aVar = this.f69340aa;
            if (aVar != null) {
                aVar.g(iA);
            }
            AdSplashActivity.a(activity, this);
        }
    }

    public static /* synthetic */ void a(b bVar, ViewGroup viewGroup) {
        g gVar;
        View viewFindViewById;
        sg.bigo.ads.ad.splash.a.a aVar = bVar.F;
        if (aVar != null && (viewFindViewById = aVar.f69106b.findViewById(R.id.layout_playable_loading)) != null && viewFindViewById.getVisibility() == 0) {
            viewFindViewById.setVisibility(4);
        }
        if (!bVar.T() || (gVar = bVar.f69248y) == null || !gVar.e() || bVar.f69248y.f69194d) {
            return;
        }
        sg.bigo.ads.ad.splash.a.a aVar2 = bVar.F;
        if (aVar2 != null) {
            aVar2.a(false, viewGroup, -1);
        }
        g gVar2 = bVar.f69248y;
        gVar2.f69195e = 2;
        gVar2.a(true, viewGroup, 14);
    }

    public static /* synthetic */ void a(b bVar, boolean z10) {
        h hVar = bVar.E;
        if (hVar != null) {
            hVar.a(z10);
        }
        sg.bigo.ads.ad.splash.a.a aVar = bVar.F;
        if (aVar != null) {
            aVar.a(z10);
        }
        g gVar = bVar.f69248y;
        if (gVar != null) {
            gVar.a(z10);
        }
        if (!z10) {
            n nVar = bVar.P;
            if (nVar != null) {
                nVar.d();
                return;
            }
            return;
        }
        n nVar2 = bVar.P;
        if (nVar2 == null || !nVar2.e()) {
            return;
        }
        bVar.P.c();
    }

    private void b(@NonNull final ViewGroup viewGroup) {
        ImageView imageView = new ImageView(viewGroup.getContext());
        imageView.setTag("adview_background_main_tag");
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        u.a(imageView, viewGroup, null, 0);
        m mVar = this.C;
        if (mVar != null && 5 != mVar.a("video_play_page.background_colour")) {
            a.a(this.C.a("video_play_page.background_colour"), this.f69249z, viewGroup);
            return;
        }
        v vVar = new v() { // from class: sg.bigo.ads.ad.splash.b.3
            @Override // sg.bigo.ads.ad.interstitial.v
            public final void a() {
                final Bitmap bitmap = sg.bigo.ads.ad.splash.a.b.f69118j;
                if (b.this.f67544i || bitmap == null) {
                    return;
                }
                sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.3.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        View viewFindViewWithTag = viewGroup.findViewWithTag("adview_background_main_tag");
                        final ImageView imageView2 = null;
                        if (viewFindViewWithTag instanceof ImageView) {
                            imageView2 = (ImageView) viewFindViewWithTag;
                        } else {
                            Context context = viewGroup.getContext();
                            if (context != null) {
                                ImageView imageView3 = new ImageView(context);
                                imageView3.setTag("adview_background_main_tag");
                                imageView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                                u.a(imageView3, viewGroup, null, 0);
                                imageView2 = imageView3;
                            }
                        }
                        if (imageView2 != null) {
                            imageView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                            sg.bigo.ads.common.utils.d.a(imageView2.getContext(), bitmap, new ValueCallback<Bitmap>() { // from class: sg.bigo.ads.ad.splash.b.3.1.1
                                @Override // android.webkit.ValueCallback
                                public final /* synthetic */ void onReceiveValue(Bitmap bitmap2) {
                                    Bitmap bitmap3 = bitmap2;
                                    if (bitmap3 != null) {
                                        imageView2.setImageBitmap(bitmap3);
                                    }
                                }
                            });
                        }
                    }
                });
            }
        };
        h hVar = this.E;
        if (hVar != null) {
            hVar.a(vVar);
        }
    }

    public final void A() {
        m mVar;
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton == null) {
            this.A = true;
            this.B.onAdFinished();
            return;
        }
        adCountDownButton.setVisibility(0);
        m mVar2 = this.C;
        a.a(this.J, mVar2 == null ? 1 : mVar2.a("video_play_page.close_button_style"));
        int iMax = Math.max(0, this.H.a("splash_duration"));
        h hVar = this.E;
        if (hVar != null && hVar.i().get() && f().bh() == null && (mVar = this.C) != null) {
            iMax = w.b(mVar.a("video_play_page.time_for_show_backup", -1));
        }
        this.K = new n(((long) iMax) * 1000) { // from class: sg.bigo.ads.ad.splash.b.5
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                if (b.this.J.f67721c) {
                    if (!(!b.this.F() && b.this.D())) {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.5.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                if (b.this.E != null) {
                                    b.this.E.j();
                                }
                            }
                        });
                    }
                    b.this.J.e();
                }
                b bVar = b.this;
                bVar.A = true;
                bVar.B.onAdFinished();
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
                b.this.J.a(j10);
            }
        };
        int iMax2 = Math.max(0, this.H.a("splash_close"));
        this.J.setWithUnit(true);
        this.J.setTakeoverTickEvent(true);
        this.J.setOnCloseListener(new AdCountDownButton.a() { // from class: sg.bigo.ads.ad.splash.b.6
            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a() {
                int i10;
                if (b.this.C == null) {
                    b.this.c(8);
                    return;
                }
                if (!b.this.F()) {
                    b.this.c(8);
                    return;
                }
                if (b.this.T()) {
                    i10 = 5;
                    if (1 == ((sg.bigo.ads.core.a.a) b.this.f69249z.f()).ad()) {
                        i10 = 4;
                    }
                } else {
                    i10 = 2;
                }
                b.this.a(i10, 2);
            }

            @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.a
            public final void a(Rect rect) {
            }
        });
        h hVar2 = this.E;
        if (hVar2 != null && hVar2.i().get() && f().bh() == null) {
            this.J.g();
        } else {
            this.J.a(iMax2, new AdCountDownButton.b() { // from class: sg.bigo.ads.ad.splash.b.7
                @Override // sg.bigo.ads.ad.interstitial.AdCountDownButton.b
                public final void a() {
                    b.this.A = true;
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.7.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            if (b.this.E != null) {
                                b.this.E.j();
                            }
                        }
                    });
                }
            });
        }
        this.K.c();
        final ViewTreeObserver viewTreeObserver = this.J.getViewTreeObserver();
        final ViewTreeObserver.OnWindowFocusChangeListener onWindowFocusChangeListener = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.ad.splash.b.8
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z10) {
                b bVar = b.this;
                if (bVar.f69249z.f67544i) {
                    return;
                }
                boolean zIsAttachedToWindow = bVar.J.isAttachedToWindow();
                if (z10 && zIsAttachedToWindow) {
                    b.a(b.this, true);
                    b.this.C();
                } else {
                    b.a(b.this, false);
                    b.this.B();
                }
            }
        };
        viewTreeObserver.addOnWindowFocusChangeListener(onWindowFocusChangeListener);
        this.L = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.9
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    viewTreeObserver.removeOnWindowFocusChangeListener(onWindowFocusChangeListener);
                } catch (Throwable unused) {
                }
            }
        };
    }

    public final void B() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.f67721c) {
            adCountDownButton.b();
        }
        n nVar = this.K;
        if (nVar != null && !nVar.e()) {
            this.K.d();
            this.Q += SystemClock.elapsedRealtime() - this.R;
        }
        if (this.f69249z.getVideoController() == null || !this.f69249z.getVideoController().isPlaying()) {
            return;
        }
        this.f69249z.getVideoController().pause();
    }

    public final void C() {
        AdCountDownButton adCountDownButton = this.J;
        if (adCountDownButton != null && !adCountDownButton.f67721c) {
            adCountDownButton.c();
        }
        n nVar = this.K;
        if (nVar != null && nVar.e()) {
            this.K.c();
        }
        if (this.f69249z.getVideoController() != null && this.f69249z.getVideoController().isPaused()) {
            this.f69249z.getVideoController().play();
        }
        this.R = SystemClock.elapsedRealtime();
    }

    public final boolean D() {
        ViewGroup viewGroup;
        if (!N() || (viewGroup = this.I) == null || !(viewGroup.getContext() instanceof AdSplashActivity)) {
            return false;
        }
        c(9);
        return true;
    }

    public final boolean F() {
        m mVar;
        if (a.b() || (mVar = this.C) == null || mVar.a("endpage.endpage_timing", 0) <= 0) {
            return false;
        }
        return !N() || this.C.a("endpage.close_click_seconds", 0) > 0;
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.a
    @NonNull
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public final sg.bigo.ads.core.a.a f() {
        return (sg.bigo.ads.core.a.a) this.f69249z.f();
    }

    public final void H() {
        sg.bigo.ads.ad.interstitial.a.b bVar;
        g gVar = this.f69248y;
        if (gVar == null || gVar.f69191a != sg.bigo.ads.ad.splash.a.c.a.f69156b) {
            this.f69249z.a((sg.bigo.ads.common.i) null, 8, 22);
            return;
        }
        Context context = this.f67537b.f69380e;
        if (gVar.f69196f && (bVar = gVar.f69192b) != null) {
            bVar.f67861f.a(context, null, null);
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = gVar.f69193c;
        if (aVar != null) {
            sg.bigo.ads.ad.interstitial.a.b.a aVar2 = aVar.f67789b;
            if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.b) {
                ((sg.bigo.ads.ad.interstitial.a.a.b) aVar2).a(context, null, null);
            } else if (aVar2 instanceof sg.bigo.ads.ad.interstitial.a.a.c) {
                ((sg.bigo.ads.ad.interstitial.a.a.c) aVar2).a(context, (sg.bigo.ads.common.i) null);
            }
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(int i10) {
        super.a(i10);
        this.f69249z.a(i10);
    }

    public final void a(int i10, int i11) {
        g gVar;
        g gVar2;
        final ViewGroup viewGroup = this.I;
        h hVar = this.E;
        if (hVar == null || viewGroup == null) {
            return;
        }
        if (this.F != null && hVar.d() == sg.bigo.ads.ad.splash.a.c.a.f69156b) {
            this.E.a(false, viewGroup, -1);
        }
        if (T() && (gVar2 = this.f69248y) != null && gVar2.e()) {
            g gVar3 = this.f69248y;
            if (!gVar3.f69194d) {
                gVar3.f69195e = 2;
                gVar3.a(true, viewGroup, i11);
                M();
                return;
            }
        }
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        if (aVar == null || aVar.f69107c != sg.bigo.ads.ad.splash.a.c.a.f69157c || ((gVar = this.f69248y) != null && gVar.f69195e == 2)) {
            c(i10);
            return;
        }
        aVar.a(true, viewGroup, i11);
        M();
        if (this.f69248y == null || !i.f69318a.p().a()) {
            L();
            return;
        }
        g gVar4 = this.f69248y;
        Runnable runnable = this.O;
        if (runnable == null) {
            runnable = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.11
                @Override // java.lang.Runnable
                public final void run() {
                    b bVar = b.this;
                    if (bVar.f67544i) {
                        return;
                    }
                    sg.bigo.ads.common.n.d.a(bVar.N);
                    if (b.this.f69248y != null) {
                        b.this.f69248y.a(this);
                    }
                    sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.splash.b.11.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            AnonymousClass11 anonymousClass11 = AnonymousClass11.this;
                            b.a(b.this, viewGroup);
                        }
                    });
                }
            };
            this.O = runnable;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar = gVar4.f69192b;
        if (bVar != null) {
            bVar.f67858c = runnable;
        }
        int iB = i.f69318a.p().b();
        if (iB > 0) {
            Runnable runnable2 = this.N;
            if (runnable2 == null) {
                runnable2 = new Runnable() { // from class: sg.bigo.ads.ad.splash.b.12
                    @Override // java.lang.Runnable
                    public final void run() {
                        b bVar2 = b.this;
                        if (bVar2.f67544i) {
                            return;
                        }
                        bVar2.L();
                        b.a(b.this, viewGroup);
                    }
                };
                this.N = runnable2;
            }
            sg.bigo.ads.common.n.d.a(2, runnable2, ((long) iB) * 1000);
        }
    }

    public final void a(@NonNull ViewGroup viewGroup) {
        g gVar;
        String str;
        if (this.E != null) {
            f fVar = this.D;
            if (fVar != null) {
                sg.bigo.ads.core.d.b.a(fVar.f69376a, this);
            }
            if (isExpired()) {
                str = "The ad is expired.";
            } else {
                if (!this.f67544i) {
                    ViewGroup viewGroup2 = (ViewGroup) sg.bigo.ads.common.utils.a.a(viewGroup.getContext(), R.layout.bigo_ad_splash_style_root, null, false);
                    u.a(viewGroup2, viewGroup, new ViewGroup.LayoutParams(-1, -1), -1);
                    ViewGroup viewGroup3 = (ViewGroup) viewGroup2.findViewById(R.id.bigo_ad_splash_ad_container);
                    this.I = viewGroup3;
                    this.J = (AdCountDownButton) viewGroup2.findViewById(R.id.bigo_ad_splash_btn_skip);
                    b(viewGroup3);
                    if (S() && (gVar = this.f69248y) != null && gVar.e()) {
                        g gVar2 = this.f69248y;
                        gVar2.f69195e = 1;
                        gVar2.a(true, viewGroup3, 11);
                    } else {
                        this.E.a(true, viewGroup3, -1);
                    }
                    J();
                    return;
                }
                str = "The ad is destroyed.";
            }
            b(2000, 1, str);
        }
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.b.d
    public final void a(@NonNull final sg.bigo.ads.api.b.d.a<SplashAd> aVar) {
        super.a(aVar);
        m mVar = this.C;
        if (mVar != null && mVar.a("video_play_page.background_colour") == 4) {
            this.f69249z.b(true);
        }
        this.f69249z.a(new sg.bigo.ads.api.b.d.a<NativeAd>() { // from class: sg.bigo.ads.ad.splash.b.4
            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2) {
                b bVar = b.this;
                if (bVar.f67540e || bVar.f67541f) {
                    return;
                }
                aVar.a(bVar);
                sg.bigo.ads.common.n.d.a(2, new Runnable() { // from class: sg.bigo.ads.ad.splash.b.4.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        if ((b.this.S() || b.this.T()) && b.this.f69248y == null) {
                            b bVar2 = b.this;
                            m unused = bVar2.H;
                            m unused2 = b.this.C;
                            b bVar3 = b.this;
                            bVar2.f69248y = new g(bVar3, bVar3.D.f69377b, b.this.D.f69376a);
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, int i10, int i11, String str) {
                b bVar = b.this;
                if (bVar.f67540e || bVar.f67541f) {
                    return;
                }
                if (i10 == 1006) {
                    sg.bigo.ads.controller.c.a.a(bVar.D == null ? "" : b.this.D.f69377b.l());
                }
                aVar.a(b.this, i10, i11, str);
            }

            @Override // sg.bigo.ads.api.b.d.a
            public final /* synthetic */ void a(Ad ad2, boolean z10, int i10, int i11, String str, boolean z11) {
                NativeAd nativeAd = (NativeAd) ad2;
                b bVar = b.this;
                if (bVar.f67540e || bVar.f67541f || !(nativeAd instanceof sg.bigo.ads.ad.b.c)) {
                    return;
                }
                if (((sg.bigo.ads.core.a.a) ((sg.bigo.ads.ad.b.c) nativeAd).f()).bh() != null || z10) {
                    aVar.a(b.this);
                } else {
                    aVar.a(b.this, i10, i11, str);
                }
            }
        });
    }

    @Override // sg.bigo.ads.ad.c
    public final void a(sg.bigo.ads.controller.landing.c cVar) {
        super.a(cVar);
        sg.bigo.ads.ad.b.b bVar = this.f69249z;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    @Override // sg.bigo.ads.api.b.a
    public final void a(boolean z10, boolean z11) {
        super.a(z10, z11);
        this.f69249z.a(z10, z11);
    }

    @Override // sg.bigo.ads.ad.c
    @NonNull
    public final <ValueType> ValueType b(String str, ValueType valuetype) {
        return (ValueType) this.f69249z.b(str, valuetype);
    }

    @Override // sg.bigo.ads.api.b.a
    public final o b_() {
        sg.bigo.ads.ad.b.b bVar = this.f69249z;
        return bVar != null ? bVar.b_() : this.f69342ac;
    }

    public final void c(int i10) {
        this.B.onAdSkipped();
        if (this.D != null) {
            this.Q += SystemClock.elapsedRealtime() - this.R;
            sg.bigo.ads.core.d.b.a(this.D.f69376a, i10, this.G > 0 ? SystemClock.elapsedRealtime() - this.G : 0L, this.Q, this);
        }
    }

    @Override // sg.bigo.ads.ad.c
    public final void destroyInMainThread() {
        a.f69077b = false;
        a.f69076a = false;
        super.destroyInMainThread();
        this.f69249z.destroy();
        n nVar = this.P;
        if (nVar != null) {
            nVar.b();
            this.P = null;
        }
        Runnable runnable = this.L;
        if (runnable != null) {
            sg.bigo.ads.common.n.d.b(runnable);
            this.L = null;
        }
        Runnable runnable2 = this.M;
        if (runnable2 != null) {
            sg.bigo.ads.common.n.d.a(runnable2);
            this.M = null;
        }
        h hVar = this.E;
        if (hVar != null) {
            hVar.c();
            this.E = null;
        }
        sg.bigo.ads.ad.splash.a.a aVar = this.F;
        if (aVar != null) {
            aVar.c();
            this.F = null;
        }
        a.a();
        L();
        this.I = null;
    }

    @Override // sg.bigo.ads.api.Ad
    @Nullable
    public final String getCreativeId() {
        return this.f69249z.getCreativeId();
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    @Nullable
    public final String getExtraInfo(String str) {
        return null;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final SplashAd.Style getStyle() {
        return a.c(this.H);
    }

    @Override // sg.bigo.ads.ad.c, sg.bigo.ads.api.Ad
    public final boolean isExpired() {
        return false;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final boolean isSkippable() {
        return this.A || isExpired() || this.f67544i;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void setAdInteractionListener(SplashAdInteractionListener splashAdInteractionListener) {
        super.setAdInteractionListener((AdInteractionListener) splashAdInteractionListener);
        this.B.f69278b = splashAdInteractionListener;
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show() {
        a((Activity) null, true);
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void show(Activity activity) {
        a(activity, false);
    }

    @Override // sg.bigo.ads.api.SplashAd
    public final void showInAdContainer(@NonNull ViewGroup viewGroup) {
        this.f69249z.c(2);
        a(viewGroup);
    }

    @Override // sg.bigo.ads.ad.c
    public final sg.bigo.ads.controller.landing.c y() {
        sg.bigo.ads.ad.b.b bVar = this.f69249z;
        return bVar != null ? bVar.y() : super.y();
    }
}
