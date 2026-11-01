package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.CacheControl;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.measurer.MraidAdMeasurer;
import io.bidmachine.iab.utils.Assets;
import io.bidmachine.iab.utils.IabClickCallback;
import io.bidmachine.iab.utils.IabElementStyle;
import io.bidmachine.iab.utils.IabLoadingWrapper;
import io.bidmachine.iab.utils.IabProgressWrapper;
import io.bidmachine.iab.utils.IabTimerHelper;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.iab.view.CloseableLayout;
import io.bidmachine.rendering.model.PrivacySheetParams;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes7.dex */
@SuppressLint({"ViewConstructor"})
public class MraidView extends CloseableLayout implements CloseableLayout.OnCloseClickListener, IabClickCallback {
    private final IabElementStyle A;
    private final IabElementStyle B;
    private final IabElementStyle C;
    private final IabElementStyle D;
    private boolean E;
    private IabTimerHelper F;
    private IabProgressWrapper G;
    private Integer H;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final MutableContextWrapper f59246h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final MraidAdView f59247i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CloseableLayout f59248j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CloseableLayout f59249k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private IabLoadingWrapper f59250l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private WeakReference f59251m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f59252n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private MraidViewListener f59253o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MraidAdMeasurer f59254p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final CacheControl f59255q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final float f59256r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final float f59257s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final float f59258t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final boolean f59259u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f59260v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final boolean f59261w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final boolean f59262x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final AtomicBoolean f59263y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final CloseableLayout.OnCloseClickListener f59264z;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MraidPlacementType f59265a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CacheControl f59266b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f59267c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f59268d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f59269e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String[] f59270f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private IabElementStyle f59271g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private IabElementStyle f59272h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private IabElementStyle f59273i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private IabElementStyle f59274j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private float f59275k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private float f59276l;

        @VisibleForTesting
        public MraidViewListener listener;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private float f59277m;
        public MraidAdMeasurer mraidAdMeasurer;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f59278n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f59279o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f59280p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private boolean f59281q;

        public Builder() {
            this(MraidPlacementType.INLINE);
        }

        public MraidView build(@NonNull Context context) {
            return new MraidView(context, this, null);
        }

        public Builder forceUseNativeCloseButton(boolean z10) {
            this.f59279o = z10;
            return this;
        }

        public Builder setAdMeasurer(@Nullable MraidAdMeasurer mraidAdMeasurer) {
            this.mraidAdMeasurer = mraidAdMeasurer;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f59270f = strArr;
            return this;
        }

        public Builder setBaseUrl(String str) {
            this.f59267c = str;
            return this;
        }

        public Builder setCacheControl(@NonNull CacheControl cacheControl) {
            this.f59266b = cacheControl;
            return this;
        }

        public Builder setCloseStyle(IabElementStyle iabElementStyle) {
            this.f59271g = iabElementStyle;
            return this;
        }

        public Builder setCloseTimeSec(float f10) {
            this.f59276l = f10;
            return this;
        }

        public Builder setCountDownStyle(IabElementStyle iabElementStyle) {
            this.f59272h = iabElementStyle;
            return this;
        }

        public Builder setDurationSec(float f10) {
            this.f59277m = f10;
            return this;
        }

        public Builder setIsTag(boolean z10) {
            this.f59278n = z10;
            return this;
        }

        public Builder setListener(MraidViewListener mraidViewListener) {
            this.listener = mraidViewListener;
            return this;
        }

        public Builder setLoadingStyle(IabElementStyle iabElementStyle) {
            this.f59273i = iabElementStyle;
            return this;
        }

        public Builder setPageFinishedScript(String str) {
            this.f59269e = str;
            return this;
        }

        public Builder setPlaceholderTimeoutSec(float f10) {
            this.f59275k = f10;
            return this;
        }

        public Builder setProductLink(String str) {
            this.f59268d = str;
            return this;
        }

        public Builder setProgressStyle(IabElementStyle iabElementStyle) {
            this.f59274j = iabElementStyle;
            return this;
        }

        public Builder setR1(boolean z10) {
            this.f59280p = z10;
            return this;
        }

        public Builder setR2(boolean z10) {
            this.f59281q = z10;
            return this;
        }

        public Builder(MraidPlacementType mraidPlacementType) {
            this.f59270f = null;
            this.f59275k = 3.0f;
            this.f59276l = 0.0f;
            this.f59277m = 0.0f;
            this.f59265a = mraidPlacementType;
            this.f59266b = CacheControl.FullLoad;
            this.f59267c = IabSettings.DEF_BASE_URL;
        }
    }

    public class a implements IabTimerHelper.TimerHelperCallback {
        public a() {
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerFinish() {
            if (MraidView.this.G != null) {
                MraidView.this.G.detach();
            }
            if (MraidView.this.f59247i.isOpenNotified() || !MraidView.this.f59262x || MraidView.this.f59258t <= 0.0f) {
                return;
            }
            MraidView.this.g();
        }

        @Override // io.bidmachine.iab.utils.IabTimerHelper.TimerHelperCallback
        public void onTimerTick(float f10, long j10, long j11) {
            int i10 = (int) (j11 / 1000);
            int i11 = (int) (j10 / 1000);
            if (MraidView.this.G != null) {
                MraidView.this.G.changePercentage(f10, i11, i10);
            }
        }
    }

    public class b implements CloseableLayout.OnCloseClickListener {
        public b() {
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCloseClick() {
            MraidView.this.c(IabError.placeholder("Close button clicked"));
            MraidView.this.j();
        }

        @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
        public void onCountDownFinish() {
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidViewState mraidViewState = MraidView.this.f59247i.getMraidViewState();
            if (mraidViewState == MraidViewState.RESIZED) {
                MraidView.this.e();
                return;
            }
            if (mraidViewState == MraidViewState.EXPANDED) {
                MraidView.this.d();
            } else if (MraidView.this.h()) {
                MraidView.this.f59247i.close();
                MraidView.this.j();
            }
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidView.this.f59247i.updateMetrics(null);
        }
    }

    public static /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f59286a;

        static {
            int[] iArr = new int[CacheControl.values().length];
            f59286a = iArr;
            try {
                iArr[CacheControl.FullLoad.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f59286a[CacheControl.Stream.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f59286a[CacheControl.PartialLoad.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class f implements MraidAdView.Listener {
        private f() {
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCalendarEventIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onChangeOrientationIntention(MraidAdView mraidAdView, MraidOrientationProperties mraidOrientationProperties) {
            MraidView.this.a(mraidOrientationProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onCloseIntention(MraidAdView mraidAdView) {
            MraidView.this.f();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onExpandIntention(MraidAdView mraidAdView, WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
            return MraidView.this.a(webView, mraidOrientationProperties, z10);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onExpanded(MraidAdView mraidAdView) {
            MraidView.this.k();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewExpired(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewLoadFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.b(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewPageLoaded(MraidAdView mraidAdView, String str, WebView webView, boolean z10) {
            MraidView.this.a(str, webView, z10);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShowFailed(MraidAdView mraidAdView, IabError iabError) {
            MraidView.this.c(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidAdViewShown(MraidAdView mraidAdView) {
            MraidView.this.m();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onMraidLoadedIntention(MraidAdView mraidAdView) {
            MraidView.this.l();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenPrivacySheet(MraidAdView mraidAdView, PrivacySheetParams privacySheetParams) {
            MraidView.this.a(privacySheetParams);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onOpenUrlIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onPlayVideoIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public boolean onResizeIntention(MraidAdView mraidAdView, WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
            return MraidView.this.a(webView, mraidResizeProperties, mraidScreenMetrics);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onStorePictureIntention(MraidAdView mraidAdView, String str) {
            MraidView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.Listener
        public void onSyncCustomCloseIntention(MraidAdView mraidAdView, boolean z10) {
            if (MraidView.this.f59260v) {
                return;
            }
            if (z10 && !MraidView.this.E) {
                MraidView.this.E = true;
            }
            MraidView.this.a(z10);
        }

        public /* synthetic */ f(MraidView mraidView, a aVar) {
            this();
        }
    }

    private MraidView(@NonNull Context context, @NonNull Builder builder) {
        super(context);
        this.f59263y = new AtomicBoolean(false);
        this.E = false;
        this.f59246h = new MutableContextWrapper(context);
        this.f59253o = builder.listener;
        this.f59255q = builder.f59266b;
        this.f59256r = builder.f59275k;
        this.f59257s = builder.f59276l;
        float f10 = builder.f59277m;
        this.f59258t = f10;
        this.f59259u = builder.f59278n;
        this.f59260v = builder.f59279o;
        this.f59261w = builder.f59280p;
        this.f59262x = builder.f59281q;
        MraidAdMeasurer mraidAdMeasurer = builder.mraidAdMeasurer;
        this.f59254p = mraidAdMeasurer;
        this.A = builder.f59271g;
        this.B = builder.f59272h;
        this.C = builder.f59273i;
        IabElementStyle iabElementStyle = builder.f59274j;
        this.D = iabElementStyle;
        MraidAdView mraidAdViewBuild = new MraidAdView.Builder(context.getApplicationContext(), builder.f59265a, new f(this, null)).setBaseUrl(builder.f59267c).setProductLink(builder.f59268d).setAllowedNativeFeatures(builder.f59270f).setPageFinishedScript(builder.f59269e).build();
        this.f59247i = mraidAdViewBuild;
        addView(mraidAdViewBuild, new FrameLayout.LayoutParams(-1, -1, 17));
        if (f10 > 0.0f) {
            IabProgressWrapper iabProgressWrapper = new IabProgressWrapper(null);
            this.G = iabProgressWrapper;
            iabProgressWrapper.attach(context, this, iabElementStyle);
            IabTimerHelper iabTimerHelper = new IabTimerHelper(this, new a());
            this.F = iabTimerHelper;
            iabTimerHelper.setTime(f10);
        }
        this.f59264z = new b();
        setCloseClickListener(this);
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.registerAdContainer(this);
            mraidAdMeasurer.registerAdView(mraidAdViewBuild.getWebView());
        }
    }

    private void n() {
        setCloseClickListener(this.f59264z);
        setCloseVisibility(true, this.f59256r);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout
    public boolean canBeClosed() {
        if (getOnScreenTimeMs() > MraidUtils.MAX_ON_SCREEN_TIME_MS || this.f59247i.isReceivedJsError()) {
            return true;
        }
        if (this.f59260v || !this.f59247i.isUseCustomClose()) {
            return super.canBeClosed();
        }
        return false;
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleCanceled() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandleError() {
        setLoadingVisible(false);
    }

    @Override // io.bidmachine.iab.utils.IabClickCallback
    public void clickHandled() {
        setLoadingVisible(false);
    }

    public void destroy() {
        this.f59253o = null;
        this.f59251m = null;
        Activity activityPeekActivity = peekActivity();
        if (activityPeekActivity != null) {
            a(activityPeekActivity);
        }
        a((View) this.f59248j);
        a((View) this.f59249k);
        this.f59247i.destroy();
        IabTimerHelper iabTimerHelper = this.F;
        if (iabTimerHelper != null) {
            iabTimerHelper.detach();
        }
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    public void load(@Nullable String str) {
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null && str != null) {
            str = mraidAdMeasurer.prepareCreativeForMeasure(str);
        }
        int i10 = e.f59286a[this.f59255q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                this.f59252n = str;
                l();
                return;
            } else if (i10 != 3) {
                return;
            } else {
                l();
            }
        }
        e(str);
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCloseClick() {
        f();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        MraidLog.d("MraidView", "onConfigurationChanged: %s", Utils.orientationToString(configuration.orientation));
        Utils.onUiThread(new d());
    }

    @Override // io.bidmachine.iab.view.CloseableLayout.OnCloseClickListener
    public void onCountDownFinish() {
        if (!this.f59247i.isOpenNotified() && this.f59262x && this.f59258t == 0.0f) {
            g();
        }
    }

    @Override // io.bidmachine.iab.view.CloseableLayout, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Nullable
    public Activity peekActivity() {
        WeakReference weakReference = this.f59251m;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @NonNull
    public Context peekContext() {
        Activity activityPeekActivity = peekActivity();
        return activityPeekActivity == null ? getContext() : activityPeekActivity;
    }

    public void setLastInteractedActivity(@Nullable Activity activity) {
        if (activity != null) {
            this.f59251m = new WeakReference(activity);
            this.f59246h.setBaseContext(activity);
        }
    }

    public void setLoadingVisible(boolean z10) {
        if (!z10) {
            IabLoadingWrapper iabLoadingWrapper = this.f59250l;
            if (iabLoadingWrapper != null) {
                iabLoadingWrapper.setVisibility(8);
                return;
            }
            return;
        }
        if (this.f59250l == null) {
            IabLoadingWrapper iabLoadingWrapper2 = new IabLoadingWrapper(null);
            this.f59250l = iabLoadingWrapper2;
            iabLoadingWrapper2.attach(getContext(), this, this.C);
        }
        this.f59250l.setVisibility(0);
        this.f59250l.bringToFront();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    public void show(@Nullable Activity activity) {
        int i10 = e.f59286a[this.f59255q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (h()) {
                    n();
                }
                e(this.f59252n);
                this.f59252n = null;
            } else if (i10 == 3) {
                if (i()) {
                    if (h()) {
                        a((CloseableLayout) this, this.f59247i.isUseCustomClose());
                    }
                } else if (h()) {
                    n();
                }
            }
        } else if (h()) {
            a((CloseableLayout) this, this.f59247i.isUseCustomClose());
        }
        this.f59247i.show();
        setLastInteractedActivity(activity);
        a(this.f59247i.getLastOrientationProperties());
    }

    public /* synthetic */ MraidView(Context context, Builder builder, a aVar) {
        this(context, builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        a((View) this.f59248j);
        this.f59248j = null;
        this.f59247i.closeResized();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        IabElementStyle iabElementStyleResolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.A);
        this.f59247i.handleRedirectScreen(iabElementStyleResolveDefCloseStyle.getHorizontalPosition().intValue(), iabElementStyleResolveDefCloseStyle.getVerticalPosition().intValue());
    }

    private boolean i() {
        return this.f59247i.isLoaded();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onClose(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpand(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        MraidViewListener mraidViewListener;
        if (this.f59263y.getAndSet(true) || (mraidViewListener = this.f59253o) == null) {
            return;
        }
        mraidViewListener.onLoaded(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdShown();
        }
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onShown(this);
        }
    }

    public void f() {
        if (this.f59247i.isOpenNotified() || !this.f59261w) {
            Utils.onUiThread(new c());
        } else {
            g();
        }
    }

    public boolean h() {
        return this.f59247i.isInterstitial();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        a((View) this.f59249k);
        this.f59249k = null;
        Activity activityPeekActivity = peekActivity();
        if (activityPeekActivity != null) {
            a(activityPeekActivity);
        }
        this.f59247i.closeExpanded();
    }

    private void e(String str) {
        this.f59247i.load(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onShowFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f59253o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f59253o.onStorePicture(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onLoadFailed(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        if (this.f59253o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f59253o.onOpenUrl(this, str, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        if (this.f59253o == null) {
            return;
        }
        setLoadingVisible(true);
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdClicked();
        }
        this.f59253o.onCalendarEvent(this, str, this);
    }

    private void b(Activity activity) {
        this.H = Integer.valueOf(activity.getRequestedOrientation());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidOrientationProperties mraidOrientationProperties) {
        if (mraidOrientationProperties == null) {
            return;
        }
        Activity activityPeekActivity = peekActivity();
        MraidLog.d("MraidView", "applyOrientation: %s", mraidOrientationProperties);
        if (activityPeekActivity == null) {
            MraidLog.d("MraidView", "no any interacted activities", new Object[0]);
        } else {
            b(activityPeekActivity);
            activityPeekActivity.setRequestedOrientation(mraidOrientationProperties.obtainTargetActivityOrientation(activityPeekActivity));
        }
    }

    private void a(View view) {
        if (view == null) {
            return;
        }
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).removeAllViews();
        }
        Utils.removeFromParent(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onError(iabError);
        }
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onExpired(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener != null) {
            mraidViewListener.onPlayVideo(this, str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidOrientationProperties mraidOrientationProperties, boolean z10) {
        CloseableLayout closeableLayout = this.f59249k;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.f59249k = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.f59249k);
        }
        Utils.removeFromParent(webView);
        this.f59249k.addView(webView);
        a(this.f59249k, z10);
        a(mraidOrientationProperties);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, WebView webView, boolean z10) {
        setLoadingVisible(false);
        if (h()) {
            a((CloseableLayout) this, z10);
        }
        MraidAdMeasurer mraidAdMeasurer = this.f59254p;
        if (mraidAdMeasurer != null) {
            mraidAdMeasurer.onAdViewReady(webView);
        }
        if (this.f59255q != CacheControl.FullLoad || this.f59259u || str.equals("data:text/html,<html></html>")) {
            return;
        }
        l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(PrivacySheetParams privacySheetParams) {
        MraidViewListener mraidViewListener = this.f59253o;
        if (mraidViewListener == null) {
            return;
        }
        mraidViewListener.onOpenPrivacySheet(this, privacySheetParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(WebView webView, MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        CloseableLayout closeableLayout = this.f59248j;
        if (closeableLayout == null || closeableLayout.getParent() == null) {
            View topmostView = MraidUtils.getTopmostView(peekContext(), this);
            if (!(topmostView instanceof ViewGroup)) {
                MraidLog.e("MraidView", "Can't add resized view because can't find required parent", new Object[0]);
                return false;
            }
            CloseableLayout closeableLayout2 = new CloseableLayout(getContext());
            this.f59248j = closeableLayout2;
            closeableLayout2.setCloseClickListener(this);
            ((ViewGroup) topmostView).addView(this.f59248j);
        }
        Utils.removeFromParent(webView);
        this.f59248j.addView(webView);
        IabElementStyle iabElementStyleResolveDefCloseStyle = Assets.resolveDefCloseStyle(getContext(), this.A);
        iabElementStyleResolveDefCloseStyle.setHorizontalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 7));
        iabElementStyleResolveDefCloseStyle.setVerticalPosition(Integer.valueOf(mraidResizeProperties.customClosePosition.getGravity() & 112));
        this.f59248j.setCloseStyle(iabElementStyleResolveDefCloseStyle);
        this.f59248j.setCloseVisibility(false, this.f59257s);
        a(mraidResizeProperties, mraidScreenMetrics);
        return true;
    }

    private void a(CloseableLayout closeableLayout, boolean z10) {
        setCloseClickListener(this);
        closeableLayout.setCloseStyle(this.A);
        closeableLayout.setCountDownStyle(this.B);
        a(z10);
    }

    private void a(Activity activity) {
        Integer num = this.H;
        if (num != null) {
            activity.setRequestedOrientation(num.intValue());
            this.H = null;
        }
    }

    private void a(MraidResizeProperties mraidResizeProperties, MraidScreenMetrics mraidScreenMetrics) {
        MraidLog.d("MraidView", "setResizedViewSizeAndPosition: %s", mraidResizeProperties);
        if (this.f59248j == null) {
            return;
        }
        int iDpToPx = Utils.dpToPx(getContext(), mraidResizeProperties.width);
        int iDpToPx2 = Utils.dpToPx(getContext(), mraidResizeProperties.height);
        int iDpToPx3 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetX);
        int iDpToPx4 = Utils.dpToPx(getContext(), mraidResizeProperties.offsetY);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(iDpToPx, iDpToPx2);
        Rect rectB = mraidScreenMetrics.b();
        int i10 = rectB.left + iDpToPx3;
        int i11 = rectB.top + iDpToPx4;
        layoutParams.leftMargin = i10;
        layoutParams.topMargin = i11;
        this.f59248j.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(boolean z10) {
        boolean z11 = !z10 || this.f59260v;
        CloseableLayout closeableLayout = this.f59248j;
        if (closeableLayout != null || (closeableLayout = this.f59249k) != null) {
            closeableLayout.setCloseVisibility(z11, this.f59257s);
        } else if (h()) {
            setCloseVisibility(z11, this.E ? 0.0f : this.f59257s);
        }
    }
}
