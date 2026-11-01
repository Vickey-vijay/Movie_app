package io.bidmachine.iab.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import io.bidmachine.iab.IabError;
import io.bidmachine.iab.IabSettings;
import io.bidmachine.iab.bridge.JsBridgeHandler;
import io.bidmachine.iab.utils.Utils;
import io.bidmachine.rendering.model.PrivacySheetParams;
import io.bidmachine.rendering.utils.PrivacySheetParamsParser;
import io.bidmachine.util.Executable;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
@SuppressLint({"ViewConstructor"})
public class MraidAdView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MraidPlacementType f59156a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f59157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f59158c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f59159d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f59160e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f59161f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f59162g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f59163h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final AtomicBoolean f59164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final AtomicBoolean f59165j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final AtomicBoolean f59166k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final GestureDetector f59167l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final MraidScreenMetrics f59168m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ViewOnScreenObserver f59169n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final MraidNativeFeatureManager f59170o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final MraidNativeFeatureSchemeValidator f59171p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final tf.g f59172q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final MraidWebViewController f59173r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Listener f59174s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private MraidWebViewController f59175t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private MraidViewState f59176u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Runnable f59177v;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f59178a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final MraidPlacementType f59179b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Listener f59180c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f59181d = IabSettings.DEF_BASE_URL;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private List f59182e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f59183f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f59184g;

        public Builder(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @NonNull Listener listener) {
            this.f59178a = context;
            this.f59179b = mraidPlacementType;
            this.f59180c = listener;
        }

        public MraidAdView build() {
            return new MraidAdView(this.f59178a, this.f59179b, this.f59181d, this.f59184g, this.f59182e, this.f59183f, this.f59180c);
        }

        public Builder setAllowedNativeFeatures(@Nullable List<String> list) {
            this.f59182e = list;
            return this;
        }

        public Builder setBaseUrl(@Nullable String str) {
            this.f59181d = str;
            return this;
        }

        public Builder setPageFinishedScript(@Nullable String str) {
            this.f59183f = str;
            return this;
        }

        public Builder setProductLink(@Nullable String str) {
            this.f59184g = str;
            return this;
        }

        public Builder setAllowedNativeFeatures(@Nullable String[] strArr) {
            this.f59182e = strArr != null ? Arrays.asList(strArr) : null;
            return this;
        }
    }

    public interface Listener {
        void onCalendarEventIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onChangeOrientationIntention(@NonNull MraidAdView mraidAdView, @NonNull MraidOrientationProperties mraidOrientationProperties);

        void onCloseIntention(@NonNull MraidAdView mraidAdView);

        boolean onExpandIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @Nullable MraidOrientationProperties mraidOrientationProperties, boolean z10);

        void onExpanded(@NonNull MraidAdView mraidAdView);

        void onMraidAdViewExpired(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewLoadFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewPageLoaded(@NonNull MraidAdView mraidAdView, @NonNull String str, @NonNull WebView webView, boolean z10);

        void onMraidAdViewShowFailed(@NonNull MraidAdView mraidAdView, @NonNull IabError iabError);

        void onMraidAdViewShown(@NonNull MraidAdView mraidAdView);

        void onMraidLoadedIntention(@NonNull MraidAdView mraidAdView);

        void onOpenPrivacySheet(@NonNull MraidAdView mraidAdView, @NonNull PrivacySheetParams privacySheetParams);

        void onOpenUrlIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onPlayVideoIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        boolean onResizeIntention(@NonNull MraidAdView mraidAdView, @NonNull WebView webView, @NonNull MraidResizeProperties mraidResizeProperties, @NonNull MraidScreenMetrics mraidScreenMetrics);

        void onStorePictureIntention(@NonNull MraidAdView mraidAdView, @NonNull String str);

        void onSyncCustomCloseIntention(@NonNull MraidAdView mraidAdView, boolean z10);
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f59185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f59186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f59187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f59188d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ MraidWebViewController f59189e;

        /* JADX INFO: renamed from: io.bidmachine.iab.mraid.MraidAdView$a$a, reason: collision with other inner class name */
        public class RunnableC0498a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Point f59191a;

            /* JADX INFO: renamed from: io.bidmachine.iab.mraid.MraidAdView$a$a$a, reason: collision with other inner class name */
            public class RunnableC0499a implements Runnable {
                public RunnableC0499a() {
                }

                @Override // java.lang.Runnable
                public void run() {
                    MraidAdView.this.c();
                }
            }

            public RunnableC0498a(Point point) {
                this.f59191a = point;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC0499a runnableC0499a = new RunnableC0499a();
                a aVar = a.this;
                MraidAdView mraidAdView = MraidAdView.this;
                Point point = this.f59191a;
                mraidAdView.b(point.x, point.y, aVar.f59189e, runnableC0499a);
            }
        }

        public a(int i10, int i11, int i12, int i13, MraidWebViewController mraidWebViewController) {
            this.f59185a = i10;
            this.f59186b = i11;
            this.f59187c = i12;
            this.f59188d = i13;
            this.f59189e = mraidWebViewController;
        }

        @Override // java.lang.Runnable
        public void run() {
            Point clickPoint = Utils.getClickPoint(this.f59185a, this.f59186b, this.f59187c, this.f59188d);
            MraidAdView.this.a(clickPoint.x, clickPoint.y, this.f59189e, new RunnableC0498a(clickPoint));
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f59194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Runnable f59195b;

        public b(View view, Runnable runnable) {
            this.f59194a = view;
            this.f59195b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidAdView.this.a(this.f59194a);
            Runnable runnable = this.f59195b;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            MraidAdView.this.f59175t.applySupportedServices(MraidAdView.this.f59170o);
            if (MraidAdView.this.f59156a != null) {
                MraidAdView.this.f59175t.applyPlacement(MraidAdView.this.f59156a);
            }
            MraidAdView.this.f59175t.applyViewable(MraidAdView.this.f59175t.isViewable());
            MraidAdView.this.f59175t.applyState(MraidAdView.this.f59176u);
            MraidAdView.this.f59175t.b(MraidAdView.this.f59158c);
            MraidAdView.this.f59175t.notifyReady();
        }
    }

    public static class d extends GestureDetector.SimpleOnGestureListener {
        private d() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onScroll(@Nullable MotionEvent motionEvent, @NonNull MotionEvent motionEvent2, float f10, float f11) {
            return true;
        }

        public /* synthetic */ d(a aVar) {
            this();
        }
    }

    public abstract class e implements MraidWebViewController.Callback {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a(String str) {
            MraidAdView.this.f59174s.onCalendarEventIntention(MraidAdView.this, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(String str) {
            MraidAdView.this.f59174s.onStorePictureIntention(MraidAdView.this, str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onCalendarEvent(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onCalendarEvent: %s", str);
            String strA = MraidAdView.this.f59172q.a(str);
            if (TextUtils.isEmpty(strA)) {
                return;
            }
            MraidAdView.this.a(strA, new Executable() { // from class: tf.b
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    this.f72377a.a((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onClose() {
            MraidLog.d("MraidAdView", "Callback - onClose", new Object[0]);
            MraidAdView.this.a();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onError(@NonNull IabError iabError) {
            MraidLog.d("MraidAdView", "Callback - onError: %s", iabError);
            MraidAdView.this.a(iabError);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onExpand(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onExpand: %s", str);
            if (MraidAdView.this.isInterstitial()) {
                return;
            }
            MraidAdView.this.a(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onLoaded() {
            MraidLog.d("MraidAdView", "Callback - onLoaded", new Object[0]);
            MraidAdView.this.b();
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpen(@NonNull String str) {
            MraidLog.d("MraidAdView", "Callback - onOpen: %s", str);
            MraidAdView.this.c(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOpenPrivacySheet(@NonNull String str) {
            MraidLog.d("MraidAdView", "Callback - onOpenPrivacySheet: %s", str);
            MraidAdView.this.b(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onOrientation(@NonNull MraidOrientationProperties mraidOrientationProperties) {
            MraidLog.d("MraidAdView", "Callback - onOrientation: %s", mraidOrientationProperties);
            if (MraidAdView.this.isInterstitial() || MraidAdView.this.f59176u == MraidViewState.EXPANDED) {
                MraidAdView.this.f59174s.onChangeOrientationIntention(MraidAdView.this, mraidOrientationProperties);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onPageFinished(@NonNull String str);

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPlayVideo(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onPlayVideo: %s", str);
            if (TextUtils.isEmpty(str)) {
                return;
            }
            try {
                MraidAdView.this.f59174s.onPlayVideoIntention(MraidAdView.this, URLDecoder.decode(str, "UTF-8"));
            } catch (UnsupportedEncodingException e10) {
                MraidLog.e("MraidAdView", e10);
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onResize(@NonNull MraidResizeProperties mraidResizeProperties) {
            MraidLog.d("MraidAdView", "Callback - onResize: %s", mraidResizeProperties);
            MraidAdView.this.a(mraidResizeProperties);
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onStorePicture(@Nullable String str) {
            MraidLog.d("MraidAdView", "Callback - onStorePicture: %s", str);
            String strB = MraidAdView.this.f59172q.b(str);
            if (TextUtils.isEmpty(strB)) {
                return;
            }
            MraidAdView.this.a(strB, new Executable() { // from class: tf.c
                @Override // io.bidmachine.util.Executable
                public final void execute(Object obj) {
                    this.f72378a.b((String) obj);
                }
            });
        }

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onUseCustomClose(boolean z10);

        @Override // io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public abstract /* synthetic */ void onViewableChanged(boolean z10);

        public /* synthetic */ e(MraidAdView mraidAdView, a aVar) {
            this();
        }
    }

    public class f extends e {
        private f() {
            super(MraidAdView.this, null);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.d(str);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z10) {
            Listener listener = MraidAdView.this.f59174s;
            MraidAdView mraidAdView = MraidAdView.this;
            listener.onSyncCustomCloseIntention(mraidAdView, mraidAdView.f59173r.isUseCustomClose());
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onViewableChanged(boolean z10) {
            if (z10) {
                MraidAdView.this.f();
                MraidAdView.this.g();
            }
        }

        public /* synthetic */ f(MraidAdView mraidAdView, a aVar) {
            this();
        }
    }

    public class g extends e {
        private g() {
            super(MraidAdView.this, null);
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onPageFinished(@NonNull String str) {
            MraidAdView.this.d();
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onUseCustomClose(boolean z10) {
            if (MraidAdView.this.f59175t != null) {
                Listener listener = MraidAdView.this.f59174s;
                MraidAdView mraidAdView = MraidAdView.this;
                listener.onSyncCustomCloseIntention(mraidAdView, mraidAdView.f59175t.isUseCustomClose());
            }
        }

        @Override // io.bidmachine.iab.mraid.MraidAdView.e, io.bidmachine.iab.mraid.MraidWebViewController.Callback
        public void onViewableChanged(boolean z10) {
        }

        public /* synthetic */ g(MraidAdView mraidAdView, a aVar) {
            this();
        }
    }

    public MraidAdView(@NonNull Context context, @Nullable MraidPlacementType mraidPlacementType, @Nullable String str, @Nullable String str2, @Nullable List<String> list, @Nullable String str3, @NonNull Listener listener) {
        super(context);
        this.f59172q = new tf.g();
        this.f59156a = mraidPlacementType;
        this.f59157b = str;
        this.f59159d = str2;
        this.f59158c = str3;
        this.f59174s = listener;
        this.f59160e = new AtomicBoolean(false);
        this.f59161f = new AtomicBoolean(false);
        this.f59162g = new AtomicBoolean(false);
        this.f59163h = new AtomicBoolean(false);
        this.f59164i = new AtomicBoolean(false);
        this.f59165j = new AtomicBoolean(false);
        this.f59166k = new AtomicBoolean(false);
        a aVar = null;
        this.f59167l = new GestureDetector(context, new d(aVar));
        this.f59168m = new MraidScreenMetrics(context);
        this.f59169n = new ViewOnScreenObserver();
        MraidNativeFeatureManager mraidNativeFeatureManager = new MraidNativeFeatureManager(context, list);
        this.f59170o = mraidNativeFeatureManager;
        this.f59171p = new MraidNativeFeatureSchemeValidator(mraidNativeFeatureManager);
        MraidWebViewController mraidWebViewController = new MraidWebViewController(context, new f(this, aVar));
        this.f59173r = mraidWebViewController;
        addView(mraidWebViewController.getWebView(), new FrameLayout.LayoutParams(-1, -1, 17));
        this.f59176u = MraidViewState.LOADING;
    }

    @NonNull
    private MraidWebViewController getCurrentMraidWebViewController() {
        MraidWebViewController mraidWebViewController = this.f59175t;
        return mraidWebViewController != null ? mraidWebViewController : this.f59173r;
    }

    public void close() {
        setViewState(MraidViewState.HIDDEN);
    }

    public void closeExpanded() {
        MraidWebViewController mraidWebViewController = this.f59175t;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
            this.f59175t = null;
        } else {
            addView(this.f59173r.getWebView());
        }
        setViewState(MraidViewState.DEFAULT);
    }

    public void closeResized() {
        addView(this.f59173r.getWebView());
        setViewState(MraidViewState.DEFAULT);
    }

    public void destroy() {
        this.f59169n.cancelLastRequest();
        this.f59173r.destroy();
        MraidWebViewController mraidWebViewController = this.f59175t;
        if (mraidWebViewController != null) {
            mraidWebViewController.destroy();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch("io.bidmachine", this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Nullable
    public String getBaseUrl() {
        return this.f59157b;
    }

    @Nullable
    public MraidOrientationProperties getLastOrientationProperties() {
        return this.f59173r.getLastOrientationProperties();
    }

    @NonNull
    public MraidViewState getMraidViewState() {
        return this.f59176u;
    }

    @NonNull
    public WebView getWebView() {
        return this.f59173r.getWebView();
    }

    public void handleRedirect(int i10, int i11, int i12, int i13) {
        a(getCurrentMraidWebViewController(), i10, i11, i12, i13);
    }

    public void handleRedirectScreen(int i10, int i11) {
        Rect rectE = this.f59168m.e();
        handleRedirect(rectE.width(), rectE.height(), i10, i11);
    }

    public void handleRedirectView() {
        MraidWebView webView = getCurrentMraidWebViewController().getWebView();
        handleRedirect(webView.getMeasuredWidth(), webView.getMeasuredHeight(), 17, 17);
    }

    public boolean isInterstitial() {
        return this.f59156a == MraidPlacementType.INTERSTITIAL;
    }

    public boolean isLoaded() {
        return this.f59160e.get();
    }

    public boolean isOpenNotified() {
        return this.f59164i.get();
    }

    public boolean isReceivedJsError() {
        return this.f59173r.isReceivedJsError();
    }

    public boolean isRedirectProcessed() {
        return this.f59166k.get();
    }

    public boolean isUseCustomClose() {
        return this.f59173r.isUseCustomClose();
    }

    public void load(@Nullable String str) {
        if (str == null) {
            a(IabError.noRequiredArguments("Html data are null"));
        } else {
            this.f59173r.load(this.f59157b, String.format("<script type='application/javascript'>%s</script>%s%s", MraidUtils.b(), JsBridgeHandler.obtainJs(), MraidUtils.processRawHtml(str)), "text/html", "UTF-8");
            this.f59173r.applyLogLevel(MraidLog.getLoggingLevel());
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f59167l.onTouchEvent(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @VisibleForTesting
    public void setViewState(@NonNull MraidViewState mraidViewState) {
        this.f59176u = mraidViewState;
        this.f59173r.applyState(mraidViewState);
        MraidWebViewController mraidWebViewController = this.f59175t;
        if (mraidWebViewController != null) {
            mraidWebViewController.applyState(mraidViewState);
        }
        if (mraidViewState != MraidViewState.HIDDEN) {
            updateMetrics(null);
        }
    }

    public void show() {
        if (this.f59162g.compareAndSet(false, true) && isLoaded()) {
            f();
        }
    }

    public void updateMetrics(@Nullable Runnable runnable) {
        MraidWebViewController mraidWebViewController = this.f59175t;
        if (mraidWebViewController == null) {
            mraidWebViewController = this.f59173r;
        }
        MraidWebView webView = mraidWebViewController.getWebView();
        this.f59169n.wait(this, webView).start(new b(webView, runnable));
    }

    private boolean e() {
        return this.f59162g.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f59161f.compareAndSet(false, true)) {
            this.f59173r.notifyReady();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if (this.f59163h.compareAndSet(false, true)) {
            this.f59174s.onMraidAdViewShown(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        if (isRedirectProcessed() || TextUtils.isEmpty(this.f59159d)) {
            return;
        }
        c(this.f59159d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str) {
        if (this.f59176u == MraidViewState.LOADING && this.f59160e.compareAndSet(false, true)) {
            this.f59173r.applySupportedServices(this.f59170o);
            MraidPlacementType mraidPlacementType = this.f59156a;
            if (mraidPlacementType != null) {
                this.f59173r.applyPlacement(mraidPlacementType);
            }
            MraidWebViewController mraidWebViewController = this.f59173r;
            mraidWebViewController.applyViewable(mraidWebViewController.isViewable());
            this.f59173r.b(this.f59158c);
            a(this.f59173r.getWebView());
            setViewState(MraidViewState.DEFAULT);
            f();
            this.f59174s.onMraidAdViewPageLoaded(this, str, this.f59173r.getWebView(), this.f59173r.isUseCustomClose());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void e(String str) {
        this.f59174s.onOpenUrlIntention(this, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        this.f59174s.onMraidLoadedIntention(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        a(str, new Executable() { // from class: tf.a
            @Override // io.bidmachine.util.Executable
            public final void execute(Object obj) {
                this.f72376a.e((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        if (this.f59175t == null) {
            return;
        }
        updateMetrics(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str) {
        PrivacySheetParams json = PrivacySheetParamsParser.parseJson(str);
        if (json == null) {
            MraidLog.e("MraidAdView", "Callback - can't parse privacy sheet", new Object[0]);
        } else {
            this.f59174s.onOpenPrivacySheet(this, json);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i10, int i11, MraidWebViewController mraidWebViewController, Runnable runnable) {
        if (isRedirectProcessed()) {
            return;
        }
        mraidWebViewController.applyClick(i10, i11);
        this.f59177v = runnable;
        postDelayed(runnable, 150L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        this.f59174s.onCloseIntention(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IabError iabError) {
        if (!isLoaded()) {
            this.f59174s.onMraidAdViewLoadFailed(this, iabError);
        } else if (e()) {
            this.f59174s.onMraidAdViewShowFailed(this, iabError);
        } else {
            this.f59174s.onMraidAdViewExpired(this, iabError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        MraidWebViewController mraidWebViewController;
        if (isInterstitial()) {
            return;
        }
        MraidViewState mraidViewState = this.f59176u;
        if (mraidViewState == MraidViewState.DEFAULT || mraidViewState == MraidViewState.RESIZED) {
            if (str == null) {
                mraidWebViewController = this.f59173r;
            } else {
                try {
                    String strDecode = URLDecoder.decode(str, "UTF-8");
                    if (!io.bidmachine.util.Utils.isHttpUrl(strDecode)) {
                        strDecode = this.f59157b + strDecode;
                    }
                    MraidWebViewController mraidWebViewController2 = new MraidWebViewController(getContext(), new g(this, null));
                    this.f59175t = mraidWebViewController2;
                    mraidWebViewController2.load(strDecode);
                    mraidWebViewController = mraidWebViewController2;
                } catch (UnsupportedEncodingException unused) {
                    return;
                }
            }
            if (this.f59174s.onExpandIntention(this, mraidWebViewController.getWebView(), mraidWebViewController.getLastOrientationProperties(), mraidWebViewController.isUseCustomClose())) {
                setViewState(MraidViewState.EXPANDED);
                this.f59174s.onExpanded(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i10, int i11, MraidWebViewController mraidWebViewController, Runnable runnable) {
        if (isRedirectProcessed()) {
            return;
        }
        a(mraidWebViewController.getWebView(), i10, i11);
        this.f59177v = runnable;
        postDelayed(runnable, 150L);
    }

    private void a(MraidWebView mraidWebView, int i10, int i11) {
        mraidWebView.dispatchTouchEvent(Utils.obtainMotionEvent(0, i10, i11));
        mraidWebView.dispatchTouchEvent(Utils.obtainMotionEvent(1, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, Executable executable) {
        this.f59164i.set(true);
        this.f59165j.set(false);
        this.f59166k.set(true);
        removeCallbacks(this.f59177v);
        if (this.f59171p.a(str)) {
            executable.execute(str);
        }
    }

    private void a(MraidWebViewController mraidWebViewController, int i10, int i11, int i12, int i13) {
        if (this.f59165j.compareAndSet(false, true)) {
            this.f59166k.set(false);
            a aVar = new a(i10, i11, i12, i13, mraidWebViewController);
            Point defaultClickPoint = Utils.getDefaultClickPoint(i10, i11);
            a(defaultClickPoint.x, defaultClickPoint.y, mraidWebViewController, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MraidResizeProperties mraidResizeProperties) {
        MraidViewState mraidViewState = this.f59176u;
        if (mraidViewState == MraidViewState.LOADING || mraidViewState == MraidViewState.HIDDEN || mraidViewState == MraidViewState.EXPANDED || isInterstitial()) {
            MraidLog.d("MraidAdView", "Callback: onResize (invalidate state: %s)", this.f59176u);
        } else if (this.f59174s.onResizeIntention(this, this.f59173r.getWebView(), mraidResizeProperties, this.f59168m)) {
            setViewState(MraidViewState.RESIZED);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(View view) {
        Context context = getContext();
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f59168m.a(displayMetrics.widthPixels, displayMetrics.heightPixels);
        int[] iArr = new int[2];
        View viewObtainRootView = MraidUtils.obtainRootView(context, this);
        viewObtainRootView.getLocationOnScreen(iArr);
        this.f59168m.c(iArr[0], iArr[1], viewObtainRootView.getWidth(), viewObtainRootView.getHeight());
        getLocationOnScreen(iArr);
        this.f59168m.b(iArr[0], iArr[1], getWidth(), getHeight());
        view.getLocationOnScreen(iArr);
        this.f59168m.a(iArr[0], iArr[1], view.getWidth(), view.getHeight());
        this.f59173r.applyScreenMetrics(this.f59168m);
        MraidWebViewController mraidWebViewController = this.f59175t;
        if (mraidWebViewController != null) {
            mraidWebViewController.applyScreenMetrics(this.f59168m);
        }
    }
}
