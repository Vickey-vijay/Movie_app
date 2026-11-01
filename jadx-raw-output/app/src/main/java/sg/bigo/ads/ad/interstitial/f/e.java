package sg.bigo.ads.ad.interstitial.f;

import android.app.Activity;
import android.graphics.PointF;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.webkit.URLUtil;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import sg.bigo.ads.R;
import sg.bigo.ads.common.h;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.u;
import sg.bigo.ads.common.view.RoundedFrameLayout;
import sg.bigo.ads.controller.landing.LandingPageStyleConfig;

/* JADX INFO: loaded from: classes8.dex */
public class e extends d {
    private final a F;
    private final a G;
    private final AtomicBoolean H;
    private boolean I;
    private final b.a J;
    private boolean K;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f68446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f68447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f68448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f68449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f68450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f68451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RoundedFrameLayout f68452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public RelativeLayout f68453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f68454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public LinearLayout f68455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f68456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TextView f68457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public RelativeLayout f68458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ImageView f68459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageView f68460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageView f68461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ImageView f68462r;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$10, reason: invalid class name */
    public class AnonymousClass10 implements ValueCallback<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ViewGroup.MarginLayoutParams f68464a;

        public AnonymousClass10(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f68464a = marginLayoutParams;
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Integer num) {
            this.f68464a.topMargin = num.intValue();
            e.this.f68452h.requestLayout();
            e.this.f68452h.getMeasuredWidth();
            e eVar = e.this;
            eVar.f(eVar.f68447c - this.f68464a.topMargin);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.f.e$2, reason: invalid class name */
    public class AnonymousClass2 implements ValueCallback<Void> {
        public AnonymousClass2() {
        }

        @Override // android.webkit.ValueCallback
        public final /* synthetic */ void onReceiveValue(Void r10) {
            e.e(e.this);
        }
    }

    public class a implements View.OnTouchListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f68477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f68478c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f68479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f68480e;

        private a() {
            this.f68477b = ViewConfiguration.get(e.this.L).getScaledTouchSlop();
        }

        public /* synthetic */ a(e eVar, byte b10) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0065  */
        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            if (e.this.f() || !e.this.H.get()) {
                return false;
            }
            int action = motionEvent.getAction();
            if (action == 0) {
                this.f68478c = motionEvent.getRawX();
                this.f68479d = motionEvent.getRawY();
                if (!e.this.f() || e.this.f68446b == null) {
                    e.this.f();
                    if (e.this.K) {
                        this.f68480e = (int) motionEvent.getRawY();
                    }
                }
                return false;
            }
            if (action == 1) {
                float rawX = motionEvent.getRawX();
                float rawY = motionEvent.getRawY();
                if (Math.abs(this.f68478c - rawX) >= this.f68477b || Math.abs(this.f68479d - rawY) >= this.f68477b) {
                    e.this.g();
                } else {
                    e eVar = e.this;
                    eVar.g(eVar.f68449e);
                }
            } else if (action == 2) {
                int rawY2 = (int) motionEvent.getRawY();
                int i10 = rawY2 - this.f68480e;
                this.f68480e = rawY2;
                e.this.c(i10);
            } else if (action == 3) {
                e.this.g();
            }
            return true;
        }
    }

    public e(@NonNull Activity activity) {
        b bVar;
        int i10;
        super(activity);
        this.H = new AtomicBoolean(true);
        byte b10 = 0;
        this.I = false;
        this.J = new b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.1
            @Override // sg.bigo.ads.ad.interstitial.f.b.a
            public final boolean a() {
                if (e.this.u()) {
                    return false;
                }
                e.this.d(0);
                return true;
            }
        };
        this.K = true;
        LandingPageStyleConfig landingPageStyleConfig = ((d) this).f68438a;
        if (landingPageStyleConfig != null) {
            int i11 = landingPageStyleConfig.f70931a;
            switch (i11) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                    bVar = new b(landingPageStyleConfig.f70933c, i11, landingPageStyleConfig.f70935e, landingPageStyleConfig.f70936f);
                    break;
                default:
                    bVar = new b(0, 1, landingPageStyleConfig.f70935e, landingPageStyleConfig.f70936f);
                    break;
            }
        } else {
            bVar = null;
        }
        this.f68446b = bVar;
        int iA = sg.bigo.ads.common.utils.e.a(this.L, 20);
        this.f68448d = iA;
        LandingPageStyleConfig landingPageStyleConfig2 = ((d) this).f68438a;
        this.f68447c = ((landingPageStyleConfig2 == null || (i10 = landingPageStyleConfig2.f70934d) <= 0) ? sg.bigo.ads.common.utils.e.c(this.L) - sg.bigo.ads.common.utils.e.a(this.L, 48) : i10) - iA;
        this.f68449e = 0;
        this.f68450f = (int) (this.f68447c * (1.0f - (bVar != null ? bVar.e() : 1.0f)));
        this.f68451g = sg.bigo.ads.common.utils.e.a(activity, 3);
        this.F = new a(this, b10);
        this.G = new a(this, b10);
        activity.setTheme(R.style.LandingPageStyle);
        aF();
        Window window = this.L.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = this.f68447c;
        attributes.gravity = 80;
        window.setAttributes(attributes);
        activity.overridePendingTransition(0, 0);
    }

    public static /* synthetic */ void d(e eVar) {
        if (eVar.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((eVar.f68447c - ((ViewGroup.MarginLayoutParams) eVar.f68452h.getLayoutParams()).topMargin) * 1.5f) / eVar.f68451g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.4
                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i10, int i11) {
                    e.this.f((int) (i11 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    e.this.H.set(true);
                }
            };
            aVar.setDuration(jAbs);
            eVar.f68452h.startAnimation(aVar);
        }
    }

    public static /* synthetic */ boolean e(e eVar) {
        eVar.K = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i10) {
        View view;
        int i11 = this.f68447c;
        int i12 = i11 - this.f68450f;
        int i13 = this.f68448d;
        if (i10 == i11 && (view = this.f68454j) != null && !this.I) {
            this.I = true;
            view.postDelayed(new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.3
                @Override // java.lang.Runnable
                public final void run() {
                    TransitionSet transitionSet = new TransitionSet();
                    transitionSet.addTransition(new sg.bigo.ads.common.utils.b.a());
                    transitionSet.addTransition(new Fade(2));
                    transitionSet.setDuration(300L);
                    TransitionManager.beginDelayedTransition(e.this.f68452h, transitionSet);
                    e.this.f68454j.setVisibility(8);
                }
            }, 500L);
        }
        b bVar = this.f68446b;
        if (bVar != null) {
            bVar.a(i10, i12, i11, i13);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(int i10) {
        int iMax = Math.max(this.f68449e, Math.min(this.f68450f, i10));
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams();
        int i11 = marginLayoutParams.topMargin;
        if (i11 == iMax) {
            return;
        }
        long jAbs = (long) Math.abs(((iMax - i11) * 2.0f) / this.f68451g);
        this.K = false;
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition(new sg.bigo.ads.common.utils.b.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.8
            @Override // sg.bigo.ads.common.utils.b.a
            public final void a(Object obj, Object obj2) {
                RoundedFrameLayout roundedFrameLayout = e.this.f68452h;
                if (obj == roundedFrameLayout && (obj2 instanceof PointF)) {
                    PointF pointF = (PointF) obj2;
                    roundedFrameLayout.getMeasuredWidth();
                    float f10 = pointF.x;
                    e eVar = e.this;
                    eVar.f((int) (eVar.f68447c - pointF.y));
                }
            }
        });
        transitionSet.setDuration(jAbs);
        transitionSet.addListener((Transition.TransitionListener) new h() { // from class: sg.bigo.ads.ad.interstitial.f.e.9
            @Override // sg.bigo.ads.common.h, android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition) {
                super.onTransitionEnd(transition);
                e.e(e.this);
            }
        });
        TransitionManager.beginDelayedTransition(this.f68452h, transitionSet);
        marginLayoutParams.topMargin = iMax;
        this.f68452h.requestLayout();
    }

    private boolean x() {
        WebView webView = this.B;
        if (webView == null) {
            return false;
        }
        return webView.canGoForward();
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final int a() {
        return R.layout.bigo_ad_activity_interstitial_landingpage;
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str) {
        super.a(str);
        this.A.setEnabled(v());
        this.f68459o.setEnabled(x());
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void a(String str, boolean z10) {
        super.a(str, z10);
        this.A.setEnabled(v());
        this.f68459o.setEnabled(x());
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final boolean a(MotionEvent motionEvent) {
        return this.F.onTouch(this.B, motionEvent);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl, sg.bigo.ads.api.core.BaseAdActivityImpl
    public final void ah() {
        super.ah();
        this.L.overridePendingTransition(0, 0);
        b bVar = this.f68446b;
        if (bVar != null) {
            bVar.c();
        }
    }

    @Override // sg.bigo.ads.ad.interstitial.f.d, sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b() {
        String host;
        ImageView imageView;
        super.b();
        this.f68452h = (RoundedFrameLayout) p(R.id.inter_landpage_webview_page);
        this.f68453i = (RelativeLayout) p(R.id.inter_webview_top_bar);
        this.f68455k = (LinearLayout) p(R.id.inter_webview_top_action_bar);
        this.f68456l = (ImageView) p(R.id.inter_webview_open);
        this.f68457m = (TextView) p(R.id.inter_webview_host);
        this.f68462r = (ImageView) p(R.id.inter_webview_safe);
        this.f68454j = p(R.id.inter_webview_top_indicator);
        this.f68458n = (RelativeLayout) p(R.id.inter_webview_bottom_bar);
        this.f68459o = (ImageView) p(R.id.inter_webview_forward);
        this.f68460p = (ImageView) p(R.id.inter_webview_copy);
        this.f68461q = (ImageView) p(R.id.inter_webview_refresh);
        this.f68456l.setOnClickListener(this);
        this.f68459o.setOnClickListener(this);
        this.f68460p.setOnClickListener(this);
        this.f68461q.setOnClickListener(this);
        View viewP = p(R.id.inter_webview_top_middle);
        int i10 = 8;
        this.f68456l.setVisibility(c() ? 8 : 0);
        this.f68459o.setVisibility(c() ? 8 : 0);
        this.f68460p.setVisibility(c() ? 8 : 0);
        this.f68461q.setVisibility(c() ? 8 : 0);
        this.f68458n.setVisibility(c() ? 8 : 0);
        ImageView imageView2 = this.A;
        if (imageView2 != null) {
            imageView2.setVisibility(c() ? 8 : 0);
        }
        View view = this.f68454j;
        if (view != null) {
            view.setVisibility(c() ? 8 : 0);
        }
        if (viewP != null) {
            viewP.setVisibility(c() ? 8 : 0);
        }
        b bVar = this.f68446b;
        if (bVar != null) {
            this.f68453i.setLayoutDirection(bVar.f() ? 1 : 0);
        }
        this.f68455k.setLayoutDirection(this.f68453i.getLayoutDirection());
        this.f71567z.setLayoutDirection(0);
        this.f68456l.setLayoutDirection(0);
        this.f71566y.setLayoutDirection(0);
        this.f71565x.setLayoutDirection(0);
        this.f68457m.setLayoutDirection(0);
        this.f71565x.setMaxLines(1);
        float fA = sg.bigo.ads.common.utils.e.a(this.L, 16);
        this.f68452h.a(fA, fA, 0.0f, 0.0f);
        this.f71565x.setVisibility(8);
        this.f68457m.setVisibility(8);
        String str = this.C;
        boolean zIsHttpsUrl = URLUtil.isHttpsUrl(str);
        try {
            host = Uri.parse(str).getHost();
        } catch (Exception unused) {
            host = "";
        }
        this.f68457m.setText(host);
        if (q.a((CharSequence) host)) {
            this.f68457m.setVisibility(8);
            imageView = this.f68462r;
        } else {
            this.f68457m.setVisibility(0);
            imageView = this.f68462r;
            if (zIsHttpsUrl) {
                i10 = 0;
            }
        }
        imageView.setVisibility(i10);
        this.f68453i.setOnTouchListener(this.G);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams();
        b bVar2 = this.f68446b;
        if (bVar2 != null) {
            marginLayoutParams.topMargin = bVar2.g() ? this.f68449e : this.f68450f;
        }
        this.f68452h.requestLayout();
        u.a(this.f68452h, new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sg.bigo.ads.ad.interstitial.f.e.7
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                e.d(e.this);
            }
        });
        b bVar3 = this.f68446b;
        if ((bVar3 == null || bVar3.d() != 0) && !c()) {
            Drawable progressDrawable = this.f71566y.getProgressDrawable();
            if (progressDrawable instanceof LayerDrawable) {
                Drawable drawable = ((ClipDrawable) ((LayerDrawable) progressDrawable).findDrawableByLayerId(android.R.id.progress)).getDrawable();
                if (drawable instanceof GradientDrawable) {
                    GradientDrawable gradientDrawable = (GradientDrawable) drawable;
                    b bVar4 = this.f68446b;
                    gradientDrawable.setColors(new int[]{bVar4 != null ? bVar4.d() : -1, -1312769});
                }
            }
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(final int i10) {
        sg.bigo.ads.api.core.d dVar = this.E;
        if (dVar != null && dVar.f69362d == 4) {
            super.b(i10);
            return;
        }
        final Runnable runnable = new Runnable() { // from class: sg.bigo.ads.ad.interstitial.f.e.6
            @Override // java.lang.Runnable
            public final void run() {
                e.super.b(i10);
            }
        };
        if (this.H.compareAndSet(true, false)) {
            long jAbs = (long) Math.abs(((this.f68447c - ((ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams()).topMargin) * 1.5f) / this.f68451g);
            sg.bigo.ads.common.a.a aVar = new sg.bigo.ads.common.a.a() { // from class: sg.bigo.ads.ad.interstitial.f.e.5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0.0f, 1.0f);
                }

                @Override // sg.bigo.ads.common.a.a
                public final void a(float f10, float f11, int i11, int i12) {
                    e.this.f((int) (i12 - f11));
                }

                @Override // sg.bigo.ads.common.a.a, android.view.animation.Animation.AnimationListener
                public final void onAnimationEnd(Animation animation) {
                    super.onAnimationEnd(animation);
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }
            };
            aVar.setFillAfter(true);
            aVar.setDuration(jAbs);
            this.f68452h.startAnimation(aVar);
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void b(String str) {
        super.b(str);
        TextView textView = this.f71565x;
        if (textView != null) {
            textView.setVisibility(q.a((CharSequence) str) ? 8 : 0);
        }
    }

    @Override // sg.bigo.ads.api.core.BaseAdActivityImpl
    public final boolean b(MotionEvent motionEvent) {
        b bVar = this.f68446b;
        if (bVar != null) {
            return bVar.a(motionEvent, this.J) || super.b(motionEvent);
        }
        return super.b(motionEvent);
    }

    public final void c(int i10) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams();
        int iMin = Math.min(Math.max(this.f68449e, marginLayoutParams.topMargin + i10), this.f68450f);
        marginLayoutParams.topMargin = iMin;
        this.f68452h.requestLayout();
        this.f68452h.getMeasuredWidth();
        f(this.f68447c - iMin);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void d() {
        super.d();
        b bVar = this.f68446b;
        if (bVar != null) {
            bVar.a();
        }
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl
    public final void e() {
        super.e();
        b bVar = this.f68446b;
        if (bVar != null) {
            bVar.b();
        }
    }

    public final boolean f() {
        return ((ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams()).topMargin <= this.f68449e;
    }

    public final void g() {
        float f10 = ((ViewGroup.MarginLayoutParams) this.f68452h.getLayoutParams()).topMargin;
        int i10 = this.f68450f;
        if (f10 <= i10 * 0.8f) {
            i10 = 0;
        }
        g(i10);
    }

    @Override // sg.bigo.ads.controller.landing.d, sg.bigo.ads.api.b.h
    public final int h() {
        b bVar = this.f68446b;
        if (bVar == null) {
            return 0;
        }
        return bVar.f68435c;
    }

    @Override // sg.bigo.ads.core.landing.WebViewActivityImpl, android.view.View.OnClickListener
    public void onClick(View view) {
        WebView webView;
        super.onClick(view);
        if (view == this.f68456l) {
            sg.bigo.ads.core.landing.a.a(this.L, this.C, (JSONArray) null);
            return;
        }
        if (view == this.f68459o) {
            WebView webView2 = this.B;
            if (webView2 == null || !webView2.canGoForward()) {
                return;
            }
            this.B.goForward();
            return;
        }
        if (view == this.f68460p) {
            if (sg.bigo.ads.common.utils.c.g(this.L, this.C)) {
                Activity activity = this.L;
                Toast.makeText(activity, sg.bigo.ads.common.utils.a.a(activity, R.string.bigo_ad_link_copied, new Object[0]), 0).show();
                return;
            }
            return;
        }
        if (view != this.f68461q || (webView = this.B) == null) {
            return;
        }
        webView.reload();
    }
}
