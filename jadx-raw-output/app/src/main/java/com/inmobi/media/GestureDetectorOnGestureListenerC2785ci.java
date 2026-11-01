package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.SystemClock;
import android.util.Base64;
import android.util.SparseArray;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.webkit.CookieManager;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import androidx.appcompat.widget.ActivityChooserModel;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.webkit.Profile;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.iab.omid.library.inmobi.Omid;
import com.iab.omid.library.inmobi.adsession.AdSession;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.FriendlyObstructionPurpose;
import com.iab.omid.library.inmobi.adsession.media.InteractionType;
import com.inmobi.ads.WatermarkData;
import com.inmobi.ads.rendering.InMobiAdActivity;
import com.inmobi.media.C2987ki;
import com.inmobi.media.GestureDetectorOnGestureListenerC2785ci;
import com.inmobi.media.ads.network.common.model.AdQualityControl;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.inmobi.media.videoPlayer.model.HtmlOmidTracker;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import com.inmobi.media.videoPlayer.model.HtmlVideoPlayerConfig;
import com.ironsource.C3426d4;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.safedk.android.internal.partials.InMobiNetworkBridge;
import com.safedk.android.utils.Logger;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;
import kotlin.text.Regex;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class GestureDetectorOnGestureListenerC2785ci extends AbstractC3320y2 implements C, F2, GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, Gf, InterfaceC3061nh {

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final Mh f24139e1 = new Mh();

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final Lh f24140f1 = new Lh();

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final String f24141g1 = GestureDetectorOnGestureListenerC2785ci.class.getSimpleName();

    /* JADX INFO: renamed from: h1, reason: collision with root package name */
    public static final I1 f24142h1 = new I1(Boolean.FALSE, new bk.a() { // from class: b7.e6
        @Override // bk.a
        public final Object invoke() {
            return Boolean.valueOf(GestureDetectorOnGestureListenerC2785ci.y());
        }
    }, false, true);
    public C3280wc A;
    public final C3263vk A0;
    public boolean B;
    public boolean B0;
    public JSONObject C;
    public boolean C0;
    public JSONObject D;
    public U5 D0;
    public boolean E;
    public S5 E0;
    public boolean F;
    public String F0;
    public boolean G;
    public Ff G0;
    public boolean H;
    public L0 H0;
    public Hn I;
    public final AtomicBoolean I0;
    public boolean J;
    public boolean J0;
    public boolean K;
    public U K0;
    public String L;
    public String L0;
    public final AtomicBoolean M;
    public boolean M0;
    public final Object N;
    public xo N0;
    public final Object O;
    public boolean O0;
    public boolean P;
    public Map P0;
    public final boolean Q;
    public final Qh Q0;
    public View R;
    public final C2759bi R0;
    public WebChromeClient.CustomViewCallback S;
    public String S0;
    public int T;
    public final Th T0;
    public boolean U;
    public final Rh U0;
    public boolean V;
    public final Oh V0;
    public long W;
    public boolean W0;
    public D4 X0;
    public C3251v8 Y0;
    public boolean Z0;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f24143a0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public C2733ai f24144a1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f24145b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final AtomicBoolean f24146b0;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public final Vh f24147b1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f24148c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public ViewTreeObserver.OnGlobalLayoutListener f24149c0;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public final Kh f24150c1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f24151d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public C3037mi f24152d0;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public vo f24153d1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f24154e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final mj.g f24155e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f24156f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public C2834eg f24157f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f24158g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final mj.g f24159g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2888gi f24160h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f24161h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC3028m9 f24162i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Map f24163i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Di f24164j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public E2 f24165j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ko f24166k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C f24167k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C3069o0 f24168l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f24169l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AdConfig f24170m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public InterfaceC3268w0 f24171m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile boolean f24172n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public Fn f24173n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile boolean f24174o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final boolean f24175o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f24176p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f24177p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public InterfaceC2757bg f24178q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f24179q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte f24180r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int[] f24181r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final C2889gj f24182s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public long f24183s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mj.g f24184t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f24185t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public WeakReference f24186u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final Ph f24187u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public WeakReference f24188v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final Sh f24189v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public WeakReference f24190w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f24191w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public AbstractC2836ei f24192x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int f24193x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final wk.a f24194y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public C3081oc f24195y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f24196z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final GestureDetector f24197z0;

    public /* synthetic */ GestureDetectorOnGestureListenerC2785ci(Context context, byte b10, LinkedHashSet linkedHashSet, String str, String str2, long j10, C2888gi c2888gi, InterfaceC3028m9 interfaceC3028m9, Di di2, ko koVar, C3069o0 c3069o0, AdConfig adConfig, int i10) {
        this(context, b10, (i10 & 4) != 0 ? null : linkedHashSet, (i10 & 8) != 0 ? null : str, (i10 & 16) == 0, (i10 & 32) != 0 ? "DEFAULT" : str2, (i10 & 64) != 0 ? -1L : j10, (i10 & 128) != 0 ? null : c2888gi, interfaceC3028m9, di2, koVar, c3069o0, adConfig);
    }

    public static final Ti c(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        return new Ti(gestureDetectorOnGestureListenerC2785ci.f24166k, gestureDetectorOnGestureListenerC2785ci.f24162i);
    }

    public static final mj.r f() {
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = InMobiAdActivity.f22318l;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.D();
        }
        return mj.r.f64562a;
    }

    public static /* synthetic */ void getAdType$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getCloseAssetArea$annotations() {
    }

    public static /* synthetic */ void getImpressionType$annotations() {
    }

    public static /* synthetic */ void getMarkupType$annotations() {
    }

    public static /* synthetic */ void getMarkupTypeAdUnit$annotations() {
    }

    public static /* synthetic */ void getPlacementType$annotations() {
    }

    public static /* synthetic */ void getViewState$annotations() {
    }

    @VisibleForTesting(otherwise = 2)
    public static /* synthetic */ void getWindowInsetListener$annotations() {
    }

    public static final short l(String str) {
        ck.p.g(str);
        return Short.parseShort(str);
    }

    public final void a(C3081oc c3081oc) {
        ck.p.j(c3081oc, "movementGestureDetector");
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(2)) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Pan gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            JSONArray jSONArray = c3081oc.f24990j;
            Integer numValueOf = jSONArray != null ? Integer.valueOf(jSONArray.length()) : null;
            ((C3053n9) interfaceC3028m10).a(str2, lk.q.j("onPanDetected\n " + numValueOf + " \n " + c3081oc.f24990j));
        }
        g("window.imraidview.onGestureDetected('2', '" + c3081oc.f24990j + "');");
    }

    public final void b(C3081oc c3081oc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        ck.p.j(c3081oc, "rotationDetector");
        ck.p.j(motionEvent, "initialEvent");
        ck.p.j(motionEvent2, "endEvent");
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(3)) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Rotation gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, lk.q.j(" Rotation detected " + c3081oc.f24989i + " \n " + motionEvent + " \n " + motionEvent2));
        }
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
        jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent.getX(1))), Integer.valueOf(F3.c(motionEvent.getY(1))))));
        jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
        jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent2.getX(1))), Integer.valueOf(F3.c(motionEvent2.getY(1))))));
        g("window.imraidview.onGestureDetected('3', '" + jSONArray + "');");
    }

    public final void d(boolean z10) {
        Hn hn2 = z10 ? Hn.VISIBLE : Hn.HIDDEN;
        if (this.I != hn2) {
            if (!this.P) {
                this.I = hn2;
                if (z10) {
                    getListener().j(this);
                }
                c(z10);
                L0 l10 = this.H0;
                if (l10 != null) {
                    Hn hn3 = this.I;
                    ck.p.j(hn3, "adViewableStatus");
                    l10.f23042h = hn3;
                }
                o();
            }
            C3251v8 c3251v8 = this.Y0;
            if (c3251v8 == null || c3251v8.f25545g.get() || !C3251v8.a(c3251v8, new EnumC3176s8[]{EnumC3176s8.LOADED, EnumC3176s8.PLAYING, EnumC3176s8.PAUSED}, null, null, null, 14) || c3251v8.f25550l == z10) {
                return;
            }
            c3251v8.f25550l = z10;
            if (!z10) {
                if (!c3251v8.f25545g.get() && c3251v8.f25549k.f23211p.isPlaying()) {
                    c3251v8.f25549k.f();
                    N7 n10 = c3251v8.f25549k;
                    EnumC3184sg enumC3184sg = EnumC3184sg.STATE_PAUSED;
                    n10.getClass();
                    ck.p.j(enumC3184sg, "state");
                    n10.f23215t = enumC3184sg;
                    return;
                }
                return;
            }
            if (c3251v8.f25545g.get()) {
                return;
            }
            N7 n11 = c3251v8.f25549k;
            if (n11.f23215t == EnumC3184sg.STATE_PAUSED) {
                n11.e();
                N7 n12 = c3251v8.f25549k;
                EnumC3184sg enumC3184sg2 = EnumC3184sg.STATE_PLAYING;
                n12.getClass();
                ck.p.j(enumC3184sg2, "state");
                n12.f23215t = enumC3184sg2;
            }
        }
    }

    @Override // com.inmobi.media.AbstractC3320y2, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        Logger.d("InMobi|SafeDK: Execution> Lcom/inmobi/media/ci;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z");
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44963i, this, motionEvent);
        return safedk_ci_dispatchTouchEvent_57035176a7617922c0477832317fe02d(motionEvent);
    }

    public final void e() {
        int audioNetworkLoadsLimit;
        WebViewClient webViewClient;
        if (this.f24154e) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "view is in-app browser. Using EmbeddedBrowserViewClient.");
            }
            U5 u10 = new U5("IN_CUSTOM_BROWSER", new bk.a() { // from class: b7.j6
                @Override // bk.a
                public final Object invoke() {
                    return GestureDetectorOnGestureListenerC2785ci.f();
                }
            }, new bk.l() { // from class: b7.k6
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC2785ci.a((JSONObject) obj);
                }
            }, new bk.p() { // from class: b7.l6
                @Override // bk.p
                /* JADX INFO: renamed from: invoke */
                public final Object mo1invoke(Object obj, Object obj2) {
                    return GestureDetectorOnGestureListenerC2785ci.a((String) obj, (Map) obj2);
                }
            }, this.f24162i);
            this.D0 = u10;
            webViewClient = u10;
        } else {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "view is ad. Using RenderViewClient");
            }
            C2811di c2811di = new C2811di(this.f24152d0, this.f24162i, new bk.l() { // from class: b7.m6
                @Override // bk.l
                public final Object invoke(Object obj) {
                    return GestureDetectorOnGestureListenerC2785ci.a(this.f5057b, ((Boolean) obj).booleanValue());
                }
            });
            String adType = getAdType();
            if (ck.p.e(adType, "banner")) {
                audioNetworkLoadsLimit = getAdConfig().getRendering().getBannerNetworkLoadsLimit();
            } else {
                audioNetworkLoadsLimit = ck.p.e(adType, "audio") ? getAdConfig().getRendering().getAudioNetworkLoadsLimit() : getAdConfig().getRendering().getOtherNetworkLoadsLimit();
            }
            c2811di.f25823b = audioNetworkLoadsLimit;
            webViewClient = c2811di;
        }
        setWebViewClient(webViewClient);
    }

    public final void g(final String str) {
        ck.p.j(str, "js");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "injectJavaScript " + this + " - " + str);
        }
        ck.p.j(str, "value");
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.y5
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC2785ci.d(this.f5260b, str);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.postAtFrontOfQueue(runnable);
    }

    public Object getDataModel() {
        return null;
    }

    public View getVideoContainerView() {
        return null;
    }

    public final void h(String str) {
        ck.p.j(str, "content");
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            c3037mi.b();
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "loadDataInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadDataWithBaseURL(this, "", str, "text/html", "UTF-8", null);
    }

    public final void i() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "deferredDestroy " + this);
        }
        super.destroy();
    }

    public final void j() throws JSONException {
        if (this.M.get()) {
            return;
        }
        if (!this.H) {
            this.H = true;
            return;
        }
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.f24149c0;
        if (onGlobalLayoutListener != null) {
            getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            this.f24149c0 = null;
        }
        this.M.set(true);
        this.f24166k.a(this.f24164j.f22535b);
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        D4 d10 = this.X0;
        if (d10 != null) {
            d10.b();
        }
        this.P = true;
        this.T = -1;
        C3251v8 c3251v8 = this.Y0;
        if (c3251v8 != null) {
            InterfaceC3028m9 interfaceC3028m9 = c3251v8.f25541c;
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("HybridVideoPlayerHandler", "destroy");
            }
            c3251v8.a();
            C3333yf c3333yf = c3251v8.f25554p;
            if (c3333yf != null) {
                InterfaceC3028m9 interfaceC3028m10 = c3333yf.f25797g;
                if (interfaceC3028m10 != null) {
                    ck.p.i("yf", "TAG");
                    ((C3053n9) interfaceC3028m10).c("yf", "stopOmidSession");
                }
                Ae ae2 = c3333yf.f25795e;
                if (ae2 != null) {
                    if (ae2.f24279c == null) {
                        InterfaceC3028m9 interfaceC3028m11 = ae2.f24278b;
                        if (interfaceC3028m11 != null) {
                            ((C3053n9) interfaceC3028m11).a(AbstractC2819e1.f24276f, "Failed to stopAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3028m9 interfaceC3028m12 = ae2.f24278b;
                        if (interfaceC3028m12 != null) {
                            ((C3053n9) interfaceC3028m12).a(AbstractC2819e1.f24276f, "stopAdSession");
                        }
                        AdSession adSession = ae2.f24279c;
                        if (adSession != null) {
                            adSession.finish();
                        }
                        ae2.f24279c = null;
                    }
                }
            }
            c3251v8.f25554p = null;
            F3.a(c3251v8.f25542d);
        }
        this.Y0 = null;
        removeJavascriptInterface("sdkController");
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            C2727ac c2727ac = c3280wc.f25636d;
            if (c2727ac != null) {
                c2727ac.a();
            }
            c3280wc.f25636d = null;
            C2727ac c2727ac2 = c3280wc.f25637e;
            if (c2727ac2 != null) {
                c2727ac2.a();
            }
            c3280wc.f25637e = null;
            C2727ac c2727ac3 = c3280wc.f25638f;
            if (c2727ac3 != null) {
                c2727ac3.a();
            }
            c3280wc.f25638f = null;
        }
        this.f24186u.clear();
        this.f24188v.clear();
        WeakReference weakReference = this.f24190w;
        if (weakReference != null) {
            weakReference.clear();
        }
        Fn fn2 = this.f24173n0;
        if (fn2 != null) {
            fn2.d();
        }
        Fn fn3 = this.f24173n0;
        if (fn3 != null) {
            fn3.a();
        }
        C2834eg c2834eg = this.f24157f0;
        if (c2834eg != null) {
            F8 f10 = Uf.f23647b;
            if (f10 != null) {
                String str = c2834eg.f24315c;
                ck.p.j(str, "id");
                f10.f24559b.remove(str);
                Iterator it = f10.f24559b.entrySet().iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    ck.p.i(next, "next(...)");
                    if (((WeakReference) ((Map.Entry) next).getValue()).get() == null) {
                        it.remove();
                    }
                }
            }
            C3099p5 c3099p5 = Uf.f23648c;
            if (c3099p5 != null) {
                String str2 = c2834eg.f24315c;
                ck.p.j(str2, "id");
                c3099p5.f24559b.remove(str2);
                Iterator it2 = c3099p5.f24559b.entrySet().iterator();
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    ck.p.i(next2, "next(...)");
                    if (((WeakReference) ((Map.Entry) next2).getValue()).get() == null) {
                        it2.remove();
                    }
                }
            }
            c2834eg.f24316d.set(true);
        }
        this.f24157f0 = null;
        T();
        S();
        Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
        if (friendlyViews != null) {
            friendlyViews.clear();
        }
        setFriendlyViews(null);
        this.E0 = null;
        this.f24192x = null;
        this.f24167k0 = null;
        this.f24171m0 = null;
        this.B0 = false;
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    public final void k(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "registerBackButtonPressedEventListener " + this);
        }
        this.L = str;
    }

    public void m() {
        InterfaceC3268w0 interfaceC3268w0;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "dismissCurrentViewContainer " + this);
        }
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            C2907hc c2907hc = c3280wc.f25635c;
            if (c2907hc != null) {
                c2907hc.b();
            }
            c3280wc.f25635c = null;
        }
        if (ck.p.e(Profile.DEFAULT_PROFILE_NAME, this.f24196z)) {
            setAndUpdateViewState("Hidden");
            ViewParent parent = getParent();
            boolean z10 = parent instanceof ViewGroup;
            if (z10) {
                this.f24166k.b(new bk.l() { // from class: b7.c6
                    @Override // bk.l
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC2785ci.c((C2987ki) obj);
                    }
                });
            }
            if (1 == this.f24145b) {
                n();
            } else if (z10) {
                ((ViewGroup) parent).removeAllViews();
            }
        }
        if (this.I != Hn.VISIBLE || (interfaceC3268w0 = this.f24171m0) == null) {
            return;
        }
        interfaceC3268w0.a(this, getFullScreenActivity());
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        return false;
    }

    @Override // com.inmobi.media.AbstractC3320y2, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
    }

    public final void setPreloadView(boolean z10) {
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public GestureDetectorOnGestureListenerC2785ci(Context context, byte b10, Set set, String str, boolean z10, String str2, long j10, C2888gi c2888gi, InterfaceC3028m9 interfaceC3028m9, Di di2, ko koVar, C3069o0 c3069o0, AdConfig adConfig) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(str2, "landingScheme");
        ck.p.j(di2, "route");
        ck.p.j(koVar, "webViewFactory");
        ck.p.j(adConfig, "adConfig");
        Context applicationContext = context.getApplicationContext();
        ck.p.i(applicationContext, "getApplicationContext(...)");
        super(applicationContext);
        this.f24145b = b10;
        this.f24148c = set;
        this.f24151d = str;
        this.f24154e = z10;
        this.f24156f = str2;
        this.f24158g = j10;
        this.f24160h = c2888gi;
        this.f24162i = interfaceC3028m9;
        this.f24164j = di2;
        this.f24166k = koVar;
        this.f24168l = c3069o0;
        this.f24170m = adConfig;
        this.f24176p = true;
        this.f24178q = new Yh(this);
        this.f24182s = new C2889gj(interfaceC3028m9);
        this.f24184t = kotlin.b.a(new bk.a() { // from class: b7.g6
            @Override // bk.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2785ci.c(this.f4943b);
            }
        });
        this.f24186u = new WeakReference(null);
        this.f24188v = new WeakReference(null);
        this.f24194y = wk.g.b(false, 1, null);
        this.f24196z = Profile.DEFAULT_PROFILE_NAME;
        this.E = true;
        this.F = true;
        this.H = true;
        this.I = Hn.UNKNOWN;
        this.M = new AtomicBoolean(false);
        this.N = new Object();
        this.O = new Object();
        this.Q = true;
        this.T = -1;
        this.W = Long.MIN_VALUE;
        this.f24146b0 = new AtomicBoolean(false);
        this.f24155e0 = kotlin.b.b(LazyThreadSafetyMode.PUBLICATION, new bk.a() { // from class: b7.h6
            @Override // bk.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2785ci.b(this.f4957b);
            }
        });
        this.f24159g0 = kotlin.b.a(new bk.a() { // from class: b7.i6
            @Override // bk.a
            public final Object invoke() {
                return GestureDetectorOnGestureListenerC2785ci.A();
            }
        });
        this.f24187u0 = new Ph(this);
        this.f24189v0 = new Sh(this);
        this.f24191w0 = Integer.MIN_VALUE;
        this.f24193x0 = Integer.MIN_VALUE;
        this.I0 = new AtomicBoolean(true);
        this.Q0 = new Qh(this);
        this.R0 = new C2759bi(this);
        this.S0 = CreativeInfo.f44315al;
        this.T0 = new Th(this, context);
        this.U0 = new Rh(this);
        this.V0 = new Oh(this);
        ck.p.i(f24141g1, "TAG");
        toString();
        f24139e1.getClass();
        f24142h1.a();
        this.f24167k0 = this;
        this.f24175o0 = true;
        this.G0 = new Ff();
        GestureDetector gestureDetector = new GestureDetector(context, this);
        gestureDetector.setOnDoubleTapListener(this);
        gestureDetector.setIsLongpressEnabled(b10 == 1);
        this.f24197z0 = gestureDetector;
        this.A0 = new C3263vk(this);
        if (this.f24172n && this.f24195y0 == null) {
            this.f24195y0 = new C3081oc(this);
        }
        if (c2888gi != null) {
            this.f24152d0 = new C3037mi(c2888gi);
        }
        Jh.a(this, interfaceC3028m9);
        if (c3069o0 != null) {
            setAdType(c3069o0.f24917a);
            this.W0 = c3069o0.f24918b;
            this.W = c3069o0.f24919c;
            this.f24169l0 = c3069o0.f24920d;
            setCreativeId(c3069o0.f24921e);
            this.f24171m0 = c3069o0.f24925i;
            this.f24179q0 = c3069o0.f24926j;
            this.S0 = c3069o0.f24923g;
            String str3 = c3069o0.f24924h;
            if (str3 != null) {
                setAdSize(str3);
            }
            setTelemetryManagerMap(c3069o0.f24927k);
            b(c3069o0.f24922f);
        }
        this.f24144a1 = new C2733ai(this);
        this.f24147b1 = new Vh(this);
        this.f24150c1 = getAdConfig().getRendering().getDisableShowCustomView() ? new Kh(this) : new Nh(this);
        this.f24153d1 = (this.W0 || F3.a(context)) ? new vo(0, 44, 44, 0) : new vo(0, 0, 0, 0);
    }

    public static final TelemetryConfig.LandingPageConfig A() {
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(TelemetryConfig.class, "clazz");
        return ((TelemetryConfig) Y3.f23815a.a(TelemetryConfig.class)).getLpConfig();
    }

    private final TelemetryConfig.LandingPageConfig getLandingPageConfig() {
        return (TelemetryConfig.LandingPageConfig) this.f24159g0.getValue();
    }

    private final C3014lk getScrollThrottler() {
        return (C3014lk) this.f24155e0.getValue();
    }

    private final void setAdSize(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "setAdSize " + this);
        }
        L5 l10 = J5.f22893a;
        this.f24177p0 = (int) (J5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[0]));
        this.f24183s0 = ((int) (J5.b() * Integer.parseInt(((String[]) new Regex(VastAttributes.HORIZONTAL_POSITION).split(str, 0).toArray(new String[0]))[1]))) * this.f24177p0;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0113  */
    private final void setOmidViewableAd(C3288wk c3288wk) {
        boolean z10;
        En c3258vf = null;
        c3258vf = null;
        c3258vf = null;
        if (this.Z0) {
            C3251v8 c3251v8 = this.Y0;
            if (c3251v8 != null) {
                Fn fn2 = this.f24173n0;
                ck.p.g(fn2);
                String str = this.f24179q0;
                ck.p.j(this, "adContainer");
                ck.p.j(fn2, "viewableAd");
                ck.p.j(c3288wk, "trackerAttr");
                Context context = (Context) c3251v8.f25546h.get();
                if (context != null) {
                    c3251v8.f25547i = getAdConfig().getViewability().getOmidConfig().getOmidEnabled();
                    nk.l0 l0Var = c3251v8.f25542d;
                    Ae ae2 = new Ae(c3251v8.f25542d, c3251v8.f25541c);
                    HashMap map = c3288wk.f25667b;
                    Object obj = map.get("customReferenceData");
                    String str2 = obj instanceof String ? (String) obj : null;
                    Object obj2 = map.get("isolateVerificationScripts");
                    Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                    Object obj3 = map.get("macros");
                    Map map2 = obj3 instanceof Map ? (Map) obj3 : null;
                    List<HtmlOmidTracker> omidTrackers = c3251v8.f25539a.getOmidTrackers();
                    ArrayList arrayList = new ArrayList(nj.t.v(omidTrackers, 10));
                    for (Iterator it = omidTrackers.iterator(); it.hasNext(); it = it) {
                        HtmlOmidTracker htmlOmidTracker = (HtmlOmidTracker) it.next();
                        arrayList.add(new C3358zf(htmlOmidTracker.getVendor(), htmlOmidTracker.getVerificationParams(), htmlOmidTracker.getUrl()));
                    }
                    C3333yf c3333yf = new C3333yf(context, this, fn2, l0Var, ae2, new C3151r8(arrayList, map2 == null ? kotlin.collections.a.j() : map2, str2 == null ? "" : str2, str, ck.p.e(bool, Boolean.TRUE)), c3251v8.f25541c);
                    c3251v8.f25554p = c3333yf;
                    c3258vf = c3333yf;
                }
            }
        } else {
            Object obj4 = c3288wk.f25667b.get("omidAdSession");
            InterfaceC2845f1 interfaceC2845f1 = obj4 instanceof InterfaceC2845f1 ? (InterfaceC2845f1) obj4 : null;
            if (c3288wk.f25667b.containsKey("deferred")) {
                Object obj5 = c3288wk.f25667b.get("deferred");
                ck.p.h(obj5, "null cannot be cast to non-null type kotlin.Boolean");
                if (((Boolean) obj5).booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            Object obj6 = c3288wk.f25667b.get("customReferenceData");
            String str3 = obj6 instanceof String ? (String) obj6 : null;
            if (z10 && interfaceC2845f1 != null) {
                String str4 = this.f24179q0;
                Cf cf2 = Bf.f22423a;
                cf2.getClass();
                ck.p.j(this, "webView");
                AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf2.f22471b, this, str4, str3);
                ck.p.i(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
                C2959jf c2959jf = (C2959jf) interfaceC2845f1;
                if (adSessionContextCreateHtmlAdSessionContext != null) {
                    c2959jf.f24610c = adSessionContextCreateHtmlAdSessionContext;
                }
            }
            if (interfaceC2845f1 != null) {
                Fn fn3 = this.f24173n0;
                ck.p.g(fn3);
                c3258vf = new C3258vf(this, fn3, interfaceC2845f1, this.f24162i);
            }
        }
        if (c3258vf != null) {
            this.f24173n0 = c3258vf;
            return;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str5 = f24141g1;
            ck.p.i(str5, "TAG");
            ((C3053n9) interfaceC3028m9).b(str5, this.Z0 ? "Failed to create OMID tracked hybrid video ad." : "Did not find a OMID ad session; the IAB decorator will not be applied.");
        }
    }

    public static final boolean y() {
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Context context = Ji.f22951a;
        ck.p.g(context);
        Ea eaA = Da.a(context, "default");
        ck.p.j("enableImraidLogs", C3426d4.i.W);
        return eaA.f22577a.getBoolean("enableImraidLogs", false);
    }

    public void C() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onImpressionFired " + this);
        }
        F();
        C3251v8 c3251v8 = this.Y0;
        if (c3251v8 != null) {
            HtmlVideoPlayerConfig htmlVideoPlayerConfig = c3251v8.f25548j;
            C3333yf c3333yf = c3251v8.f25554p;
            if (c3333yf != null) {
                boolean skippable = htmlVideoPlayerConfig.getSkippable();
                float skipOffset = htmlVideoPlayerConfig.getSkipOffset();
                boolean autoplay = htmlVideoPlayerConfig.getAutoplay();
                if (skippable) {
                    Ae ae2 = c3333yf.f25795e;
                    if (ae2 != null) {
                        ae2.a(skipOffset, autoplay);
                    }
                } else {
                    Ae ae3 = c3333yf.f25795e;
                    if (ae3 != null) {
                        ae3.a(autoplay);
                    }
                }
                Ae ae4 = c3333yf.f25795e;
                if (ae4 != null) {
                    if (ae4.f24281e == null) {
                        InterfaceC3028m9 interfaceC3028m10 = ae4.f24278b;
                        if (interfaceC3028m10 != null) {
                            ((C3053n9) interfaceC3028m10).a(AbstractC2819e1.f24276f, "Failed to registerImpression: AdEvent is null");
                        }
                    } else {
                        InterfaceC3028m9 interfaceC3028m11 = ae4.f24278b;
                        if (interfaceC3028m11 != null) {
                            ((C3053n9) interfaceC3028m11).a(AbstractC2819e1.f24276f, "registerImpression");
                        }
                        P4.a(ae4.f24277a, new Z0(ae4, null));
                    }
                }
            }
        }
        getListener().a(getTelemetryOnAdImpression());
    }

    public final void D() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onUserLandingCompleted " + this);
        }
        g("window.imraid.broadcastEvent('onUserLandingCompleted');");
    }

    public final void E() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "processUnload " + this);
        }
        if (this.M.get()) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).b(str2, "unload called on destroyed view");
                return;
            }
            return;
        }
        if (!z()) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).b(str3, "mraid 3.0 is not enabled");
                return;
            }
            return;
        }
        if (this.C0) {
            InterfaceC3028m9 interfaceC3028m12 = this.f24162i;
            if (interfaceC3028m12 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m12).b(str4, "unload called on failed view");
                return;
            }
            return;
        }
        if (this.O0) {
            return;
        }
        this.O0 = true;
        Wb wb2 = (Wb) AbstractC3075o6.f24960e.getValue();
        Runnable runnable = new Runnable() { // from class: b7.d6
            @Override // java.lang.Runnable
            public final void run() {
                GestureDetectorOnGestureListenerC2785ci.a(this.f4888b);
            }
        };
        wb2.getClass();
        ck.p.j(runnable, "runnable");
        wb2.f23740a.post(runnable);
    }

    public final void F() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "recordContextualData " + this);
        }
        D4 d10 = this.X0;
        if (d10 != null) {
            d10.a();
        }
    }

    public final void G() {
        String str;
        C3243v0 c3243v0;
        String str2;
        String str3;
        String str4;
        C3243v0 c3243v1;
        String str5;
        C3120q1 c3120q1;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str6 = f24141g1;
            ck.p.i(str6, "TAG");
            ((C3053n9) interfaceC3028m9).a(str6, "sendTelemetryEventForNetworkLoad " + this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            linkedHashMap.put("creativeId", creativeId);
        }
        String impressionId = getImpressionId();
        if (impressionId != null) {
            linkedHashMap.put("impressionId", impressionId);
        }
        linkedHashMap.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(this.B0 ? (short) 2212 : (short) 2211));
        C2888gi c2888gi = this.f24160h;
        if (c2888gi != null && (c3120q1 = c2888gi.f24443j) != null) {
            linkedHashMap.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - c3120q1.f25129a.f25219c));
        }
        C2888gi c2888gi2 = this.f24160h;
        if (c2888gi2 != null && (c3243v1 = c2888gi2.f24434a) != null && (str5 = c3243v1.f25510f) != null) {
            linkedHashMap.put("plType", str5);
        }
        C2888gi c2888gi3 = this.f24160h;
        if (c2888gi3 != null && (str4 = c2888gi3.f24439f) != null) {
            linkedHashMap.put("creativeType", str4);
        }
        C2888gi c2888gi4 = this.f24160h;
        if (c2888gi4 != null && (str3 = c2888gi4.f24435b) != null) {
            linkedHashMap.put("markupType", str3);
        }
        C2888gi c2888gi5 = this.f24160h;
        if (c2888gi5 != null && (c3243v0 = c2888gi5.f24434a) != null && (str2 = c3243v0.f25509e) != null) {
            linkedHashMap.put("adType", str2);
        }
        C2888gi c2888gi6 = this.f24160h;
        if (c2888gi6 != null && (str = c2888gi6.f24437d) != null) {
            linkedHashMap.put("metadataBlob", str);
        }
        C2888gi c2888gi7 = this.f24160h;
        if (c2888gi7 != null) {
            linkedHashMap.put("isRewarded", Boolean.valueOf(c2888gi7.f24441h));
        }
        a("NetworkLoadLimitExceeded", (HashMap) linkedHashMap);
    }

    public final void H() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setCurrentPosition " + this);
        }
        this.D = new JSONObject();
        int[] iArr = new int[2];
        getLocationOnScreen(iArr);
        try {
            JSONObject jSONObject = this.D;
            if (jSONObject != null) {
                jSONObject.put(VastAttributes.HORIZONTAL_POSITION, F3.b(iArr[0] / J5.b()));
            }
            JSONObject jSONObject2 = this.D;
            if (jSONObject2 != null) {
                jSONObject2.put(VastAttributes.VERTICAL_POSITION, F3.b(iArr[1] / J5.b()));
            }
            int iB = F3.b(getWidth() / J5.b());
            int iB2 = F3.b(getHeight() / J5.b());
            JSONObject jSONObject3 = this.D;
            if (jSONObject3 != null) {
                jSONObject3.put("width", iB);
            }
            JSONObject jSONObject4 = this.D;
            if (jSONObject4 != null) {
                jSONObject4.put("height", iB2);
            }
        } catch (JSONException unused) {
        }
        synchronized (this.O) {
            this.F = false;
            this.O.notifyAll();
            mj.r rVar = mj.r.f64562a;
        }
    }

    public final void I() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setDefaultPosition " + this);
        }
        int[] iArr = new int[2];
        this.C = new JSONObject();
        if (this.f24190w == null) {
            ViewParent parent = getParent();
            this.f24190w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        WeakReference weakReference = this.f24190w;
        if ((weakReference != null ? (ViewGroup) weakReference.get() : null) != null) {
            WeakReference weakReference2 = this.f24190w;
            if (weakReference2 != null && (viewGroup3 = (ViewGroup) weakReference2.get()) != null) {
                viewGroup3.getLocationOnScreen(iArr);
            }
            try {
                JSONObject jSONObject = this.C;
                if (jSONObject != null) {
                    jSONObject.put(VastAttributes.HORIZONTAL_POSITION, F3.b(iArr[0] / J5.b()));
                }
                JSONObject jSONObject2 = this.C;
                if (jSONObject2 != null) {
                    jSONObject2.put(VastAttributes.VERTICAL_POSITION, F3.b(iArr[1] / J5.b()));
                }
                WeakReference weakReference3 = this.f24190w;
                int iB = F3.b(((weakReference3 == null || (viewGroup2 = (ViewGroup) weakReference3.get()) == null) ? 0 : viewGroup2.getWidth()) / J5.b());
                WeakReference weakReference4 = this.f24190w;
                int iB2 = F3.b(((weakReference4 == null || (viewGroup = (ViewGroup) weakReference4.get()) == null) ? 0 : viewGroup.getHeight()) / J5.b());
                JSONObject jSONObject3 = this.C;
                if (jSONObject3 != null) {
                    jSONObject3.put("width", iB);
                }
                JSONObject jSONObject4 = this.C;
                if (jSONObject4 != null) {
                    jSONObject4.put("height", iB2);
                }
            } catch (JSONException unused) {
                mj.r rVar = mj.r.f64562a;
            }
        } else {
            try {
                JSONObject jSONObject5 = this.C;
                if (jSONObject5 != null) {
                    jSONObject5.put(VastAttributes.HORIZONTAL_POSITION, 0);
                }
                JSONObject jSONObject6 = this.C;
                if (jSONObject6 != null) {
                    jSONObject6.put(VastAttributes.VERTICAL_POSITION, 0);
                }
                JSONObject jSONObject7 = this.C;
                if (jSONObject7 != null) {
                    jSONObject7.put("width", 0);
                }
                JSONObject jSONObject8 = this.C;
                if (jSONObject8 != null) {
                    jSONObject8.put("height", 0);
                }
            } catch (JSONException unused2) {
                mj.r rVar2 = mj.r.f64562a;
            }
        }
        synchronized (this.N) {
            this.E = false;
            this.N.notifyAll();
            mj.r rVar3 = mj.r.f64562a;
        }
    }

    public final void J() {
        int webImpressionMinPercentageViewed;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setFallbackImpressionMinPercentageViewed " + this);
        }
        if (ck.p.e("video", this.F0)) {
            webImpressionMinPercentageViewed = getAdConfig().getViewability().getVideoImpressionMinPercentageViewed();
        } else {
            webImpressionMinPercentageViewed = (ck.p.e("audio", this.F0) && ck.p.e("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinPercentageViewed() : getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
        }
        this.f24193x0 = webImpressionMinPercentageViewed;
    }

    public final void K() {
        int webImpressionMinTimeViewed;
        if (ck.p.e("video", this.F0)) {
            webImpressionMinTimeViewed = getAdConfig().getViewability().getVideoImpressionMinTimeViewed();
        } else {
            webImpressionMinTimeViewed = (ck.p.e("audio", this.F0) && ck.p.e("audio", getAdType())) ? getAdConfig().getViewability().getAudioImpressionMinTimeViewed() : getAdConfig().getViewability().getWebImpressionMinTimeViewed();
        }
        this.f24191w0 = webImpressionMinTimeViewed;
    }

    public final void L() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setFallbackImpressionParams " + this);
        }
        K();
        J();
        M();
    }

    public final void M() {
        byte audioImpressionType;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setFallbackImpressionType " + this);
        }
        String adType = getAdType();
        if (ck.p.e(adType, "banner")) {
            audioImpressionType = getAdConfig().getViewability().getBannerImpressionType();
        } else {
            audioImpressionType = ck.p.e(adType, "audio") ? getAdConfig().getViewability().getAudioImpressionType() : getAdConfig().getViewability().getInterstitialImpressionType();
        }
        this.f24180r = audioImpressionType;
    }

    public final void N() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setImpressionParams " + this);
        }
        if (this.f24148c == null) {
            L();
            return;
        }
        try {
            L();
            for (C3288wk c3288wk : this.f24148c) {
                if (c3288wk.f25666a == 2) {
                    if (c3288wk.f25667b.containsKey("type")) {
                        Object obj = c3288wk.f25667b.get("type");
                        ck.p.h(obj, "null cannot be cast to non-null type kotlin.Int");
                        this.f24180r = (byte) ((Integer) obj).intValue();
                    } else {
                        M();
                    }
                    if (c3288wk.f25667b.containsKey("time")) {
                        Object obj2 = c3288wk.f25667b.get("time");
                        ck.p.h(obj2, "null cannot be cast to non-null type kotlin.Int");
                        this.f24191w0 = ((Integer) obj2).intValue();
                    } else {
                        K();
                    }
                    if (c3288wk.f25667b.containsKey(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW)) {
                        Object obj3 = c3288wk.f25667b.get(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
                        ck.p.h(obj3, "null cannot be cast to non-null type kotlin.Int");
                        this.f24193x0 = ((Integer) obj3).intValue();
                    } else {
                        J();
                    }
                    if (this.f24180r == 2) {
                        if (c3288wk.f25667b.containsKey(com.ironsource.Ne.f27116a1)) {
                            Object obj4 = c3288wk.f25667b.get(com.ironsource.Ne.f27116a1);
                            ck.p.h(obj4, "null cannot be cast to non-null type kotlin.Int");
                            this.f24185t0 = ((Integer) obj4).intValue();
                        } else {
                            M();
                        }
                        if (c3288wk.f25667b.containsKey(TypedValues.AttributesType.S_FRAME)) {
                            Object obj5 = c3288wk.f25667b.get(TypedValues.AttributesType.S_FRAME);
                            this.f24181r0 = obj5 instanceof int[] ? (int[]) obj5 : null;
                        } else {
                            M();
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).b(str2, "Exception in parsing the impressionType and pixel frame");
            }
            L();
        } catch (Exception unused2) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).b(str3, "SDK encountered an unexpected error in parsing impression parameters");
            }
            L();
        }
    }

    public final void O() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setIsViewHardwareAccelerated " + this);
        }
        this.B = isHardwareAccelerated();
    }

    public final void P() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "skipFromInterActive " + this);
        }
        D4 d10 = this.X0;
        if (d10 != null) {
            d10.h();
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "skipFromInterActive");
        }
    }

    public final void Q() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "startTrackingAudioVolume " + this);
        }
        if (!z() || this.f24154e) {
            return;
        }
        C3118q c3118q = C3118q.f25117a;
        Ph ph2 = this.f24187u0;
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        ck.p.j(ph2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        nk.j.d(C3118q.f25123g, null, null, new C2993l(interfaceC3028m10, ph2, null), 3, null);
    }

    public final void R() {
        Set linkedHashSet;
        Set<View> setKeySet;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "startTrackingExposure " + this);
        }
        if (!z() || this.f24154e) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).b(str2, "exposureTracker is already initialized");
            }
        } else {
            Map<View, FriendlyObstructionPurpose> friendlyViews = getFriendlyViews();
            if (friendlyViews == null || (setKeySet = friendlyViews.keySet()) == null || (linkedHashSet = nj.b0.S0(setKeySet)) == null) {
                linkedHashSet = new LinkedHashSet();
            }
            this.K0 = new U(this, linkedHashSet, getAdConfig().getMraid3Config().getExposureChangeInterval(), this.f24189v0, this.f24162i);
        }
        U u10 = this.K0;
        if (u10 != null) {
            u10.a();
        }
    }

    public final void S() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "stopTrackingAudioVolume " + this);
        }
        C3118q c3118q = C3118q.f25117a;
        Ph ph2 = this.f24187u0;
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        ck.p.j(ph2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        nk.j.d(C3118q.f25123g, null, null, new C3043n(interfaceC3028m10, ph2, null), 3, null);
    }

    public final void T() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "stopTrackingExposure " + this);
        }
        U u10 = this.K0;
        if (u10 != null) {
            u10.b();
        }
    }

    public final void U() {
        new C3321y3(this, !this.G, !this.J, this.f24162i).a(this.f24153d1);
    }

    public final long V() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "timeSincePodShow " + this);
        }
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        if (interfaceC3268w0 != null) {
            return ((AbstractC2995l1) interfaceC3268w0).T();
        }
        return 0L;
    }

    public final void X() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "unregisterBackButtonPressedEventListener " + this);
        }
        this.L = null;
    }

    public final void Y() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "updateActivitiesOrientationProperties " + this);
        }
        Activity activity = (Activity) this.f24186u.get();
        if (activity == null || !(activity instanceof InMobiAdActivity)) {
            return;
        }
        Ff ff2 = this.G0;
        ck.p.j(ff2, "orientationProperties");
        O8 o10 = ((InMobiAdActivity) activity).f22319a;
        if (o10 == null) {
            ck.p.B("orientationHandler");
            o10 = null;
        }
        o10.a(ff2);
    }

    public AdConfig getAdConfig() {
        return this.f24170m;
    }

    public final C3069o0 getAdMetaData() {
        return this.f24168l;
    }

    public final InterfaceC3268w0 getAdPodHandler() {
        return this.f24171m0;
    }

    public final L0 getAdQualityManager() {
        L0 l10 = this.H0;
        if (l10 != null) {
            return l10;
        }
        ck.p.B("adQualityManager");
        return null;
    }

    public String getAdType() {
        return this.f24161h0;
    }

    public final boolean getAllowAutoRedirection() {
        return this.f24169l0;
    }

    public final WeakReference<Activity> getBannerHolderActivity() {
        return this.f24188v;
    }

    public final String getBeaconUrl() {
        return this.L0;
    }

    public final vo getCloseAssetArea() {
        return this.f24153d1;
    }

    public final long getConfiguredArea() {
        return this.f24183s0;
    }

    public Context getContainerContext() {
        Activity activity = (Activity) this.f24186u.get();
        if (activity != null) {
            return activity;
        }
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        return context;
    }

    public final String getContentURL() {
        return this.f24179q0;
    }

    public final D4 getContextualDataHandler() {
        return this.X0;
    }

    public String getCreativeId() {
        return this.f24143a0;
    }

    public final String getCurrentPosition() {
        String string;
        JSONObject jSONObject = this.D;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getCurrentPositionMonitor() {
        return this.O;
    }

    @WorkerThread
    public final int getCurrentRenderingPodAdIndex() {
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        if (interfaceC3268w0 != null) {
            return ((AbstractC2995l1) interfaceC3268w0).n(this);
        }
        return 0;
    }

    public final String getDefaultPosition() {
        String string;
        JSONObject jSONObject = this.C;
        return (jSONObject == null || (string = jSONObject.toString()) == null) ? "" : string;
    }

    public final Object getDefaultPositionMonitor() {
        return this.N;
    }

    public final S5 getEmbeddedBrowserJsCallbacks() {
        return this.E0;
    }

    public final U getExposureTracker() {
        return this.K0;
    }

    public Map<View, FriendlyObstructionPurpose> getFriendlyViews() {
        return this.f24163i0;
    }

    public final Activity getFullScreenActivity() {
        return (Activity) this.f24186u.get();
    }

    public B getFullScreenEventsListener() {
        return this.f24147b1;
    }

    public String getImpressionId() {
        return this.f24151d;
    }

    public final byte getImpressionType() {
        return this.f24180r;
    }

    public final String getLandingScheme() {
        return this.f24156f;
    }

    public final AbstractC2836ei getListener() {
        AbstractC2836ei abstractC2836ei = this.f24192x;
        if (abstractC2836ei != null) {
            return abstractC2836ei;
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "listener getter " + this);
        }
        Lh lh2 = f24140f1;
        this.f24192x = lh2;
        return lh2;
    }

    public final String getMCreativeType() {
        return this.F0;
    }

    public final int getMImpressionMinPercentageViewed() {
        return this.f24193x0;
    }

    public final int getMImpressionMinTimeViewed() {
        return this.f24191w0;
    }

    public final Fn getMViewableAd() {
        return this.f24173n0;
    }

    public String getMarkupType() {
        return this.S0;
    }

    public final String getMarkupTypeAdUnit() {
        return this.S0;
    }

    public final C3280wc getMediaProcessor() {
        return this.A;
    }

    public final int getMinimumPixelsPainted() {
        return this.f24185t0;
    }

    public final String getMraidJsString() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "mraidJsString getter " + this);
        }
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j("mraid_js_store", "sharePrefFile");
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "mraid_js_store");
        ck.p.j("mraid_js_string", C3426d4.i.W);
        ck.p.j("mraid_js_string", C3426d4.i.W);
        String string = eaA.f22577a.getString("mraid_js_string", null);
        if (string == null) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).a(str2, "Returning default Mraid Js string.");
            }
            return "var imIsObjValid=function(a){return\"undefined\"!=typeof a&&null!=a?!0:!1},EventListeners=function(a){if(\"undefined\"===typeof a)throw Error(\"EventListeners constructor requires an event name\");this.event=a;this.count=0;var b=[];this.shouldRemember=-1!==[\"exposureChange\"].indexOf(a);this.lastArgs=null;this.add=function(a){b.push(a);++this.count;if(this.shouldRemember&&this.lastArgs)try{a.apply({},this.lastArgs)}catch(d){}};this.remove=function(a){var d=!1,f=this;b=b.filter(function(b){if(b=b===a)--f.count,\nd=!0;return!b});return d};this.removeAll=function(){b=[];this.count=0};this.broadcast=function(a){this.shouldRemember&&(this.lastArgs=a);b.forEach(function(d){try{d.apply({},a)}catch(b){}})};this.toString=function(){var c=[a,\":\"];b.forEach(function(d){c.push(\"|\",String(d),\"|\")});return c.join(\"\")}},InmobiObj=function(){this.listeners=[];this.addEventListener=function(a,b){try{if(imIsObjValid(b)&&imIsObjValid(a)){var c=this.listeners;c[a]||(c[a]=new EventListeners(a));c[a].add(b);\"micIntensityChange\"==\na&&window.imraidview.startListeningMicIntensity();\"deviceMuted\"==a&&window.imraidview.startListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&window.imraidview.startListeningDeviceVolumeChange();\"volumeChange\"==a&&window.imraidview.startListeningVolumeChange();\"headphones\"==a&&window.imraidview.startListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&window.imraidview.startListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&window.imraidview.registerDownloaderCallbacks()}}catch(d){this.log(d)}};\nthis.removeEventListener=function(a,b){if(imIsObjValid(a)){var c=this.listeners;imIsObjValid(c[a])&&(imIsObjValid(b)?c[a].remove(b):c[a].removeAll());\"micIntensityChange\"==a&&0==c[a].count&&window.imraidview.stopListeningMicIntensity();\"deviceMuted\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceMuteEvents();\"deviceVolumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningDeviceVolumeChange();\"volumeChange\"==a&&0==c[a].count&&window.imraidview.stopListeningVolumeChange();\"headphones\"==\na&&0==c[a].count&&window.imraidview.stopListeningHeadphonePluggedEvents();\"backButtonPressed\"==a&&0==c[a].count&&window.imraidview.stopListeningForBackButtonPressedEvent();\"downloadStatusChanged\"==a&&0==c[a].count&&window.imraidview.unregisterDownloaderCallbacks()}};this.broadcastEvent=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)b[c]=arguments[c];c=b.shift();try{var d=this.listeners;d[c]||(d[c]=new EventListeners(c));d[c].broadcast(b)}catch(f){}}};\nthis.sendSaveContentResult=function(a){if(imIsObjValid(a)){for(var b=Array(arguments.length),c=0;c<arguments.length;c++)if(2==c){var d=arguments[c],d=JSON.parse(d);b[c]=d}else b[c]=arguments[c];d=b[1];\"success\"!=d&&(c=b[0].substring(b[0].indexOf(\"_\")+1),imraid.saveContentIDMap[c]&&delete imraid.saveContentIDMap[c]);window.imraid.broadcastEvent(b[0],b[1],b[2])}}},__im__iosNativeMessageHandler=void 0;\nwindow.webkit&&(window.webkit.messageHandlers&&window.webkit.messageHandlers.nativeMessageHandler)&&(__im__iosNativeMessageHandler=window.webkit.messageHandlers.nativeMessageHandler);\nvar __im__iosNativeCall={nativeCallInFlight:!1,nativeCallQueue:[],executeNativeCall:function(a){this.nativeCallInFlight?this.nativeCallQueue.push(a):(this.nativeCallInFlight=!0,imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=a)},nativeCallComplete:function(a){0==this.nativeCallQueue.length?this.nativeCallInFlight=!1:(a=this.nativeCallQueue.shift(),imIsObjValid(__im__iosNativeMessageHandler)?__im__iosNativeMessageHandler.postMessage(a):window.location=\na)}},IOSNativeCall=function(){this.urlScheme=\"\";this.executeNativeCall=function(a){if(imIsObjValid(__im__iosNativeMessageHandler)){d={};d.command=a;d.scheme=this.urlScheme;for(var b={},c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b[arguments[c]]=\"\"+f);d.params=b}else for(var d=this.urlScheme+\"://\"+a,f,b=!0,c=1;c<arguments.length;c+=2)f=arguments[c+1],null!=f&&(b?(d+=\"?\",b=!1):d+=\"&\",d+=arguments[c]+\"=\"+escape(f));__im__iosNativeCall.executeNativeCall(d);return\"OK\"};this.nativeCallComplete=\nfunction(a){__im__iosNativeCall.nativeCallComplete(a);return\"OK\"};this.updateKV=function(a,b){this[a]=b;var c=this.broadcastMap[a];c&&this.broadcastEvent(c,b)}};\n(function(){var a=window.mraidview={};a.orientationProperties={allowOrientationChange:!0,forceOrientation:\"none\",direction:\"right\"};var b=[],c=!1;a.detectAndBlockFraud=function(d){a.isPossibleFraud()&&a.fireRedirectFraudBeacon(d);return!1};a.popupBlocked=function(d){a.firePopupBlockedBeacon(d)};a.zeroPad=function(d){var a=\"\";10>d&&(a+=\"0\");return a+d};a.supports=function(d){console.log(\"bridge: supports (MRAID)\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\n\"supports\");else return\"false\"!=sdkController.supports(\"window.mraidview\",d)};a.useCustomClose=function(d){try{sdkController.useCustomClose(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"use CustomClose: \"+a)}};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};a.stackCommands=function(d,a){c?b.push(d):(eval(d),a&&(c=!0))};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(a.orientationProperties.allowOrientationChange=\nd.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(a.orientationProperties.forceOrientation=d.forceOrientation)):d=null,sdkController.setOrientationProperties(\"window.mraidview\",a.stringify(a.orientationProperties))}catch(b){imraidview.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return{forceOrientation:a.orientationProperties.forceOrientation,allowOrientationChange:a.orientationProperties.allowOrientationChange}};a.resizeProps=null;\na.open=function(d){\"undefined\"==typeof d&&(d=null);try{sdkController.open(\"window.mraidview\",d)}catch(a){imraidview.showAlert(\"open: \"+a)}};a.getScreenSize=function(){try{return eval(\"(\"+sdkController.getScreenSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getScreenSize: \"+d)}};a.getMaxSize=function(){try{return eval(\"(\"+sdkController.getMaxSize(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getMaxSize: \"+d)}};a.getCurrentPosition=function(){try{return eval(\"(\"+sdkController.getCurrentPosition(\"window.mraidview\")+\n\")\")}catch(d){imraidview.showAlert(\"getCurrentPosition: \"+d)}};a.getDefaultPosition=function(){try{return eval(\"(\"+sdkController.getDefaultPosition(\"window.mraidview\")+\")\")}catch(d){imraidview.showAlert(\"getDefaultPosition: \"+d)}};a.getState=function(){try{return String(sdkController.getState(\"window.mraidview\"))}catch(d){imraidview.showAlert(\"getState: \"+d)}};a.isViewable=function(){if(imraidview.fallbackViewabilityEnabled())return imraidview.checkFallbackViewable();try{return sdkController.isViewable(\"window.mraidview\")}catch(d){imraidview.showAlert(\"isViewable: \"+\nd)}};a.getPlacementType=function(){return sdkController.getPlacementType(\"window.mraidview\")};a.close=function(){try{sdkController.close(\"window.mraidview\")}catch(d){imraidview.showAlert(\"close: \"+d)}};\"function\"!=typeof String.prototype.startsWith&&(String.prototype.startsWith=function(d){return 0==this.indexOf(d)});a.playVideo=function(d){var a=\"\";null!=d&&(a=d);try{sdkController.playVideo(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"playVideo: \"+b)}};a.stringify=function(d){if(\"undefined\"===\ntypeof JSON){var b=\"\",c;if(\"undefined\"==typeof d.length)return a.stringifyArg(d);for(c=0;c<d.length;c++)0<c&&(b+=\",\"),b+=a.stringifyArg(d[c]);return b+\"]\"}return JSON.stringify(d)};a.stringifyArg=function(a){var b,c,e;c=typeof a;b=\"\";if(\"number\"===c||\"boolean\"===c)b+=args;else if(a instanceof Array)b=b+\"[\"+a+\"]\";else if(a instanceof Object){c=!0;b+=\"{\";for(e in a)null!==a[e]&&(c||(b+=\",\"),b=b+'\"'+e+'\":',c=typeof a[e],b=\"number\"===c||\"boolean\"===c?b+a[e]:\"function\"===typeof a[e]?b+'\"\"':a[e]instanceof\nObject?b+this.stringify(args[i][e]):b+'\"'+a[e]+'\"',c=!1);b+=\"}\"}else a=a.replace(/\\\\/g,\"\\\\\\\\\"),a=a.replace(/\"/g,'\\\\\"'),b=b+'\"'+a+'\"';imraidview.showAlert(\"json:\"+b);return b};getPID=function(a){var b=\"\";null!=a&&(\"undefined\"!=typeof a.id&&null!=a.id)&&(b=a.id);return b};a.storePicture=function(d){console.log(\"bridge: storePicture\");if(\"string\"!=typeof d)window.mraid.broadcastEvent(\"error\",\"storePicture method expects url as string parameter\",\"storePicture\");else{if(a.supports(\"storePicture\"))return!window.confirm(\"Do you want to download the file?\")?\n(window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled by user.\",\"storePicture\"),!1):sdkController.storePicture(\"window.mraidview\",d);window.mraid.broadcastEvent(\"error\",\"Store picture on \"+d+\" was cancelled because it is unsupported in this device/app.\",\"storePicture\")}};a.fireMediaTrackingEvent=function(a,b){};a.fireMediaErrorEvent=function(a,b){};a.fireMediaTimeUpdateEvent=function(a,b,c){};a.fireMediaCloseEvent=function(a,b,c){};a.fireMediaVolumeChangeEvent=function(a,b,c){};\na.broadcastEvent=function(){window.mraid.broadcastEvent.apply(window.mraid,arguments)};a.unload=function(){try{sdkController.unload(\"window.mraidview\")}catch(a){}};a.getCurrentAppOrientation=function(){var d;switch(a.orientation){case 0:case 180:d=\"portrait\";break;case 90:case 270:d=\"landscape\";break;default:d=\"none\"}return{orientation:d,locked:!1}};a.expand=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.expand(\"window.mraidview\",a)}catch(b){imraidview.showAlert(\"executeNativeExpand: \"+\nb+\", URL = \"+a)}};a.setExpandProperties=function(d){try{d?this.props=d:d=null;if(\"undefined\"!=typeof d.lockOrientation&&null!=d.lockOrientation&&\"undefined\"!=typeof d.orientation&&null!=d.orientation){var b={};b.allowOrientationChange=!d.lockOrientation;b.forceOrientation=d.orientation;a.setOrientationProperties(b)}sdkController.setExpandProperties(\"window.mraidview\",a.stringify(d))}catch(c){imraidview.showAlert(\"executeNativesetExpandProperties: \"+c+\", props = \"+d)}};a.getExpandProperties=function(){try{return eval(\"(\"+\nsdkController.getExpandProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getExpandProperties: \"+a)}};a.resizeProps=null;a.setResizeProperties=function(d){var b,c;try{b=parseInt(d.width);c=parseInt(d.height);if(isNaN(b)||isNaN(c)||1>b||1>c)throw\"Invalid\";d.width=b;d.height=c;a.resizeProps=d;sdkController.setResizeProperties(\"window.mraidview\",a.stringify(d))}catch(e){window.mraid.broadcastEvent(\"error\",\"Invalid properties.\",\"setResizeProperties\")}};a.getResizeProperties=function(){try{return eval(\"(\"+\nsdkController.getResizeProperties(\"window.mraidview\")+\")\")}catch(a){imraidview.showAlert(\"getResizeProperties: \"+a)}};a.resize=function(){if(null==a.resizeProps)window.mraid.broadcastEvent(\"error\",\"Valid resize dimensions must be provided before calling resize\",\"resize\");else try{sdkController.resize(\"window.mraidview\")}catch(d){imraidview.showAlert(\"resize called in bridge\")}}})();\n(function(){var a=window.mraid=new InmobiObj,b=window.mraidview,c=!1;b.isAdShownToUser=!1;b.onUserInteraction=function(){imraidview.onUserInteraction();c=!0};b.isPossibleFraud=function(){return a.supports(\"redirectFraudDetection\")&&(!b.isAdShownToUser||!c)};b.fireRedirectFraudBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var f={};f.trigger=a;f.isAdShown=b.isAdShownToUser.toString();inmobi.recordEvent(135,f)}};b.getSdkVersionInt=function(){for(var a=imraid.getSdkVersion().split(\".\"),\nb=a.length,c=\"\",e=0;e<b;e++)c+=a[e];return parseInt(c)};b.firePopupBlockedBeacon=function(a){if(\"undefined\"!=typeof inmobi&&inmobi.recordEvent){var b={};b.trigger=a;inmobi.recordEvent(136,b)}};window.onbeforeunload=function(){b.detectAndBlockFraud(\"redirect\")};a.addEventListener(\"viewableChange\",function(a){a&&!b.isAdShownToUser&&(b.isAdShownToUser=!0)});a.useCustomClose=b.useCustomClose;a.close=b.close;a.getExpandProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\n\"Method not supported\",\"getExpandProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getExpandProperties is deprecated\",\"getExpandProperties\");return b.getExpandProperties()};a.setExpandProperties=function(d){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"setExpandProperties\"):(\"undefined\"!=typeof d&&(\"useCustomClose\"in d&&\"undefined\"!=typeof a.getState()&&\"expanded\"!=a.getState())&&a.useCustomClose(d.useCustomClose),window.mraid.broadcastEvent(\"error\",\n\"MRAID setExpandProperties is deprecated\",\"setExpandProperties\"),b.setExpandProperties(d))};a.getResizeProperties=function(){if(1083<=b.getSdkVersionInt())return window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"getResizeProperties\"),null;window.mraid.broadcastEvent(\"error\",\"MRAID getResizeProperties is deprecated\",\"getResizeProperties\");return b.getResizeProperties()};a.setResizeProperties=function(a){1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"Method not supported\",\n\"setResizeProperties\"):(window.mraid.broadcastEvent(\"error\",\"MRAID setResizeProperties is deprecated\",\"setResizeProperties\"),b.setResizeProperties(a))};a.getOrientationProperties=b.getOrientationProperties;a.setOrientationProperties=b.setOrientationProperties;a.expand=function(a){try{1083<=b.getSdkVersionInt()?\"string\"===typeof a&&\"\"!==a.trim()?b.open(a):window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"expand\"):(window.mraid.broadcastEvent(\"error\",\"MRAID expand is deprecated\",\"expand\"),\nb.expand(a))}catch(f){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getMaxSize=b.getMaxSize;a.getState=b.getState;a.isViewable=b.isViewable;a.createCalendarEvent=function(a){window.mraid.broadcastEvent(\"error\",\"Method not supported\",\"createCalendarEvent\")};a.open=function(d){b.detectAndBlockFraud(\"mraid.open\")||(\"string\"!=typeof d?a.broadcastEvent(\"error\",\"URL is required.\",\"open\"):b.open(d))};a.resize=function(){try{1083<=b.getSdkVersionInt()?window.mraid.broadcastEvent(\"error\",\"MRAID resize not supported\",\n\"resize\"):(window.mraid.broadcastEvent(\"error\",\"MRAID resize is deprecated\",\"resize\"),b.expand())}catch(a){window.mraid.broadcastEvent(\"error\",\"error\",\"expand\")}};a.getVersion=function(){return\"3.0\"};a.getPlacementType=b.getPlacementType;a.playVideo=function(a){b.playVideo(a)};a.getScreenSize=b.getScreenSize;a.getCurrentPosition=b.getCurrentPosition;a.getDefaultPosition=b.getDefaultPosition;a.supports=function(a){return b.supports(a)};a.storePicture=function(d){\"string\"!=typeof d?a.broadcastEvent(\"error\",\n\"Request must specify a valid URL\",\"storePicture\"):b.storePicture(d)};a.unload=function(){b.unload()};a.getCurrentAppOrientation=b.getCurrentAppOrientation;a.getLocation=function(){return null};a.getAudioVolume=b.getAudioVolume})();\n(function(){var a=window.imraidview={},b=!1,c={RESUME:\"resume\",PAUSE:\"pause\",MUTE:\"mute\",UNMUTE:\"unmute\",SHOW:\"show\",HIDE:\"hide\",SKIP:\"skip\"};a.setOrientationProperties=function(d){try{d?(\"undefined\"!=typeof d.allowOrientationChange&&(mraidview.orientationProperties.allowOrientationChange=d.allowOrientationChange),\"undefined\"!=typeof d.forceOrientation&&(mraidview.orientationProperties.forceOrientation=d.forceOrientation),\"undefined\"!=typeof d.direction&&(mraidview.orientationProperties.direction=\nd.direction)):d=null,sdkController.setOrientationProperties(\"window.imraidview\",mraidview.stringify(mraidview.orientationProperties))}catch(b){a.showAlert(\"setOrientationProperties: \"+b+\", props = \"+d)}};a.getOrientationProperties=function(){return mraidview.orientationProperties};a.firePostStatusEvent=function(a){window.imraid.broadcastEvent(\"postStatus\",a)};a.fireMediaTrackingEvent=function(a,b){var c={};c.name=a;var e=\"inmobi_media_\"+a;\"undefined\"!=typeof b&&(null!=b&&\"\"!=b)&&(e=e+\"_\"+b);window.imraid.broadcastEvent(e,\nc)};a.fireMediaErrorEvent=function(a,b){var c={name:\"error\"};c.code=b;var e=\"inmobi_media_\"+c.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(e=e+\"_\"+a);window.imraid.broadcastEvent(e,c)};a.fireMediaTimeUpdateEvent=function(a,b,c){var e={name:\"timeupdate\",target:{}};e.target.currentTime=b;e.target.duration=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.saveContent=function(a,b,c){window.imraid.addEventListener(\"saveContent_\"+a,c);\nsdkController.saveContent(\"window.imraidview\",a,b)};a.cancelSaveContent=function(a){sdkController.cancelSaveContent(\"window.imraidview\",a)};a.disableCloseRegion=function(a){sdkController.disableCloseRegion(\"window.imraidview\",a)};a.fireGalleryImageSelectedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+a;e.width=b;e.height=c;window.imraid.broadcastEvent(\"galleryImageSelected\",e)};a.fireCameraPictureCatpturedEvent=function(a,b,c){var e=new Image;e.src=\"data:image/jpeg;base64,\"+\na;e.width=b;e.height=c;window.imraid.broadcastEvent(\"cameraPictureCaptured\",e)};a.fireMediaCloseEvent=function(a,b,c){var e={name:\"close\"};e.viaUserInteraction=b;e.target={};e.target.currentTime=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+a);window.imraid.broadcastEvent(b,e)};a.fireMediaVolumeChangeEvent=function(a,b,c){var e={name:\"volumechange\",target:{}};e.target.volume=b;e.target.muted=c;b=\"inmobi_media_\"+e.name;\"undefined\"!=typeof a&&(null!=a&&\"\"!=a)&&(b=b+\"_\"+\na);window.imraid.broadcastEvent(b,e)};a.fireDeviceMuteChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceMuted\",a)};a.fireDeviceVolumeChangeEvent=function(a){window.imraid.broadcastEvent(\"deviceVolumeChange\",a)};a.fireHeadphonePluggedEvent=function(a){window.imraid.broadcastEvent(\"headphones\",a)};a.showAlert=function(a){sdkController.showAlert(\"window.imraidview\",a)};a.openExternal=function(d,b){try{600<=getSdkVersionInt()?sdkController.openExternal(\"window.imraidview\",d,b):sdkController.openExternal(\"window.imraidview\",\nd)}catch(c){a.showAlert(\"openExternal: \"+c)}};a.log=function(b){try{sdkController.log(\"window.imraidview\",b)}catch(c){a.showAlert(\"log: \"+c)}};a.getPlatform=function(){return\"android\"};a.asyncPing=function(b){try{sdkController.asyncPing(\"window.imraidview\",b)}catch(c){a.showAlert(\"asyncPing: \"+c)}};a.startListeningDeviceMuteEvents=function(){sdkController.registerDeviceMuteEventListener(\"window.imraidview\")};a.stopListeningDeviceMuteEvents=function(){sdkController.unregisterDeviceMuteEventListener(\"window.imraidview\")};\na.startListeningDeviceVolumeChange=function(){sdkController.registerDeviceVolumeChangeEventListener(\"window.imraidview\")};a.stopListeningDeviceVolumeChange=function(){sdkController.unregisterDeviceVolumeChangeEventListener(\"window.imraidview\")};a.startListeningHeadphonePluggedEvents=function(){sdkController.registerHeadphonePluggedEventListener(\"window.imraidview\")};a.stopListeningHeadphonePluggedEvents=function(){sdkController.unregisterHeadphonePluggedEventListener(\"window.imraidview\")};getSdkVersionInt=\nfunction(){for(var b=a.getSdkVersion().split(\".\"),c=b.length,g=\"\",e=0;e<c;e++)g+=b[e];return parseInt(g)};a.getSdkVersionInt=getSdkVersionInt;a.getSdkVersion=function(){return window._im_imaiview.getSdkVersion()};a.supports=function(a){console.log(\"bridge: supports (IMRAID)\");if(\"string\"!=typeof a)window.imraid.broadcastEvent(\"error\",\"Supports method expects string parameter\",\"supports\");else return\"false\"!=sdkController.supports(\"window.imraidview\",a)};a.postToSocial=function(b,c,g,e){window.imraid.broadcastEvent(\"error\",\n\"Method not supported\",\"postToSocial\");a.log(\"Method postToSocial not supported\")};a.incentCompleted=function(a){if(\"object\"!=typeof a||null==a)sdkController.incentCompleted(\"window.imraidview\",null);else try{sdkController.incentCompleted(\"window.imraidview\",JSON.stringify(a))}catch(b){sdkController.incentCompleted(\"window.imraidview\",null)}};a.getOrientation=function(){try{return String(sdkController.getOrientation(\"window.imraidview\"))}catch(b){a.showAlert(\"getOrientation: \"+b)}};a.acceptAction=\nfunction(b){try{sdkController.acceptAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"acceptAction: \"+c+\", params = \"+b)}};a.rejectAction=function(b){try{sdkController.rejectAction(\"window.imraidview\",mraidview.stringify(b))}catch(c){a.showAlert(\"rejectAction: \"+c+\", params = \"+b)}};a.updateToPassbook=function(b){window.imraid.broadcastEvent(\"error\",\"Method not supported\",\"updateToPassbook\");a.log(\"Method not supported\")};a.isDeviceMuted=function(){return\"false\"!=sdkController.isDeviceMuted(\"window.imraidview\")};\na.getDeviceVolume=function(){return 603>=getSdkVersionInt()?-1:sdkController.getDeviceVolume(\"window.imraidview\")};a.isHeadPhonesPlugged=function(){return\"false\"!=sdkController.isHeadphonePlugged(\"window.imraidview\")};a.sendSaveContentResult=function(){window.imraid.sendSaveContentResult.apply(window.imraid,arguments)};a.broadcastEvent=function(){window.imraid.broadcastEvent.apply(window.imraid,arguments)};a.disableBackButton=function(a){void 0==a||\"boolean\"!=typeof a?console.log(\"disableBackButton called with invalid params\"):\nsdkController.disableBackButton(\"window.imraidview\",a)};a.isBackButtonDisabled=function(){return sdkController.isBackButtonDisabled(\"window.imraidview\")};a.startListeningForBackButtonPressedEvent=function(){sdkController.registerBackButtonPressedEventListener(\"window.imraidview\")};a.stopListeningForBackButtonPressedEvent=function(){sdkController.unregisterBackButtonPressedEventListener(\"window.imraidview\")};a.hideStatusBar=function(){};a.setOpaqueBackground=function(){};a.startDownloader=function(a,\nb,c){682<=getSdkVersionInt()&&sdkController.startDownloader(\"window.imraidview\",a,b,c)};a.registerDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.registerDownloaderCallbacks(\"window.imraidview\")};a.unregisterDownloaderCallbacks=function(){682<=getSdkVersionInt()&&sdkController.unregisterDownloaderCallbacks(\"window.imraidview\")};a.getDownloadProgress=function(){return 682<=getSdkVersionInt()?sdkController.getDownloadProgress(\"window.imraidview\"):-1};a.getDownloadStatus=function(){return 682<=\ngetSdkVersionInt()?sdkController.getDownloadStatus(\"window.imraidview\"):-1};a.fireEvent=function(a){700<=getSdkVersionInt()&&(\"fireSkip\"===a?sdkController.fireSkip(\"window.imraidview\"):\"fireComplete\"===a?sdkController.fireComplete(\"window.imraidview\"):\"showEndCard\"===a&&sdkController.showEndCard(\"window.imraidview\"))};a.saveBlob=function(a){700<=getSdkVersionInt()&&sdkController.saveBlob(\"window.imraidview\",a)};a.getBlob=function(a,b){700<=getSdkVersionInt()&&sdkController.getBlob(a,b)};a.setCloseEndCardTracker=\nfunction(a){700<=getSdkVersionInt()&&sdkController.setCloseEndCardTracker(\"window.imraidview\",a)};a.getRenderableAdIndexes=function(){try{if(917<=getSdkVersionInt())return sdkController.getRenderableAdIndexes(\"window.imraidview\")}catch(a){}return\"[]\"};a.getCurrentRenderingIndex=function(){try{if(917<=getSdkVersionInt())return sdkController.getCurrentRenderingIndex(\"window.imraidview\")}catch(a){}return-1};a.showAd=function(a){try{917<=getSdkVersionInt()&&sdkController.showAd(\"window.imraidview\",a)}catch(b){}};\na.timeSinceShow=function(){try{if(917<=getSdkVersionInt())return sdkController.timeSinceShow(\"window.imraidview\")}catch(a){}return-1};a.getShowTimeStamp=function(){try{if(917<=getSdkVersionInt())return sdkController.getShowTimeStamp(\"window.imraidview\")}catch(a){}return-1};a.closeAll=function(){try{917<=getSdkVersionInt()&&sdkController.closeAll(\"window.imraidview\")}catch(a){}};a.loadAd=function(a){try{917<=getSdkVersionInt()&&sdkController.loadAd(\"window.imraidview\",a)}catch(b){}};a.setAdContext=\nfunction(a){try{917<=getSdkVersionInt()&&sdkController.setAdContext(\"window.imraidview\",a)}catch(b){}};a.getAdContext=function(){try{if(917<=getSdkVersionInt())return sdkController.getAdContext(\"window.imraidview\")}catch(a){}return\"\"};a.openWithoutTracker=function(a){try{\"undefined\"==typeof a&&(a=null),sdkController.openWithoutTracker(\"window.imraidview\",a)}catch(b){}};a.impressionRendered=function(){window.imraid.broadcastEvent(\"impressionRendered\")};a.customExpandInNative=function(a,b,c){try{void 0==\na||\"string\"!=typeof a?console.log(\"url called with invalid params\"):void 0==b||\"number\"!=typeof b?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"boolean\"!=typeof c?console.log(\"hideCloseButton called with invalid params\"):sdkController.customExpandInNative(\"window.imraidview\",a,b,c)}catch(e){}};a.customExpand=function(b,c,g,e,h){try{void 0==g||\"number\"!=typeof g?console.log(\"screenPercentage called with invalid params\"):void 0==c||\"number\"!=typeof c?console.log(\"inputType called with invalid params\"):\nvoid 0==e||\"boolean\"!=typeof e?console.log(\"topNavBarVisible called with invalid params\"):void 0==h||\"boolean\"!=typeof h?console.log(\"bottomNavBarVisible called with invalid params\"):sdkController.customExpand(\"window.imraidview\",b,c,g,e,h)}catch(k){a.showAlert(\"executeNativeCustomExpand: \"+k+\", input = \"+b+\", inputType = \"+c+\", screenPercentage = \"+g+\", bottomNavBarVisible = \"+h+\", topNavBarVisible = \"+e)}};a.closeCustomExpand=function(){try{sdkController.closeCustomExpand(\"window.imraidview\")}catch(a){}};\na.onGestureDetected=function(a,b){window.imraid.broadcastEvent(\"onGestureDetected\",a,b)};a.onUserLandingCompleted=function(){window.imraid.broadcastEvent(\"onUserLandingCompleted\")};a.onUserInteraction=function(){window.imraid.broadcastEvent(\"onUserInteraction\")};a.impressionFired=function(){try{sdkController.impressionFired(\"window.imraidview\")}catch(a){}};a.getMaxDeviceVolume=function(){try{return sdkController.getMaxDeviceVolume(\"window.imraidview\")}catch(a){return 15}};a.zoom=function(a){try{sdkController.zoom(\"window.imraidview\",\na)}catch(b){}};a.onAudioStateChanged=function(a){try{sdkController.onAudioStateChanged(\"window.imraidview\",a)}catch(b){}};a.submitAdReport=function(a){try{sdkController.submitAdReport(\"window.imraidview\",void 0!=a.adQualityUrl?a.adQualityUrl:null,void 0!=a.enableUserAdReportScreenshot?a.enableUserAdReportScreenshot:null,void 0!=a.templateInfo?a.templateInfo:null)}catch(b){}};a.logTelemetryEvent=function(a){try{var b=void 0!=a.eventType?a.eventType:null,c=void 0!=a.payload?a.payload:null;a=null;null!=\nc&&(a=mraidview.stringify(c));sdkController.logTelemetryEvent(\"window.imraidview\",b,a)}catch(e){}};a.onUserAudioMuteInteraction=function(a){try{sdkController.onUserAudioMuteInteraction(\"window.imraidview\",a)}catch(b){}};a.enableFallbackViewabilityFunctionality=function(){b=!0;a.checkFallbackViewable()&&window.mraid.broadcastEvent(\"viewableChange\",!0);mraid.addEventListener(\"sizeChange\",function(){window.mraid.broadcastEvent(\"viewableChange\",a.checkFallbackViewable())})};a.checkFallbackViewable=function(){try{var b=\nmraidview.getCurrentPosition(),c=b.height;return 40<=b.width&&40<=c?!0:!1}catch(g){a.showAlert(\"checkFallbackViewable: \"+g)}};a.fallbackViewabilityEnabled=function(){return b};a.getSafeArea=function(){try{return JSON.parse(sdkController.getSafeArea(\"window.imraidview\"))}catch(a){return null}};a.loadWebView=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"loadWebView: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"loadWebView: html parameter should be a string\"):sdkController.loadWebView(\"window.imraidview\",\nb,c)}catch(g){a.showAlert(\"loadWebView: \"+g)}};a.showWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"showWebView: id parameter should be a string\"):sdkController.showWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"showWebView: \"+c)}};a.sendMessage=function(b,c){try{\"string\"!==typeof b?a.showAlert(\"sendMessage: id parameter should be a string\"):\"string\"!==typeof c?a.showAlert(\"sendMessage: message parameter should be a string\"):sdkController.sendMessage(\"window.imraidview\",b,c)}catch(g){a.showAlert(\"sendMessage: \"+\ng)}};a.destroyWebView=function(b){try{\"string\"!==typeof b?a.showAlert(\"destroyWebView: id parameter should be a string\"):sdkController.destroyWebView(\"window.imraidview\",b)}catch(c){a.showAlert(\"destroyWebView: \"+c)}};a.pingV2=function(b){if(\"object\"===typeof b&&null!==b)try{sdkController.pingV2(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"pingV2: \"+c)}else a.showAlert(\"pingV2: pingJson is not a valid JSON object\")};a.enableNativeGestures=function(b){try{\"boolean\"!==typeof b?a.log(\"enableNativeGestures: 'enabled' must be a boolean.\"):\nsdkController.enableNativeGestures(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableNativeGestures: \"+c)}};a.enableTouchBeginCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchBeginCallback(\"window.imraidview\",b)}catch(c){a.showAlert(\"enableTouchBeginCallback: \"+c)}};a.enableTouchEndCallback=function(b){try{\"boolean\"!==typeof b?a.log(\"enableTouchEndCallback: 'enabled' must be a boolean.\"):sdkController.enableTouchEndCallback(\"window.imraidview\",\nb)}catch(c){a.showAlert(\"enableTouchEndCallback: \"+c)}};a.createVideoPlayer=function(b){try{sdkController.createVideoPlayer(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"createVideoPlayer: \"+c)}};a.updateVideoPosition=function(b){try{sdkController.updateVideoPosition(\"window.imraidview\",JSON.stringify(b))}catch(c){a.showAlert(\"updateVideoPosition: \"+c)}};a.executeVideoPlayerActions=function(b,f){try{if(!Object.values(c).includes(b))throw Error(\"Invalid videoCommand\");sdkController.executeVideoPlayerActions(\"window.imraidview\",\nb,JSON.stringify(f))}catch(g){a.showAlert(\"executeVideoPlayerActions: \"+g)}};a.getPlaybackState=function(){try{return sdkController.getPlaybackState(\"window.imraidview\")}catch(b){return a.showAlert(\"getPlaybackState: \"+b),null}};a.destroyVideoPlayer=function(){try{sdkController.destroyVideoPlayer(\"window.imraidview\")}catch(b){a.showAlert(\"destroyVideoPlayer: \"+b)}}})();\n(function(){var a=window.imraid=new InmobiObj,b=window.imraidview;a.getOrientation=b.getOrientation;a.setOrientationProperties=b.setOrientationProperties;a.getOrientationProperties=b.getOrientationProperties;a.saveContentIDMap={};a.saveContent=function(c,f,g){var e=arguments.length,h,k=null;if(3>e){if(\"function\"===typeof arguments[e-1])h=arguments[e-1];else return;k={reason:1}}else a.saveContentIDMap[c]&&(h=arguments[2],k={reason:11,url:arguments[1]});\"function\"!==!h&&(k?(window.imraid.addEventListener(\"saveContent_failed_\"+\nc,h),window.imraid.sendSaveContentResult(\"saveContent_failed_\"+c,\"failed\",JSON.stringify(k))):(a.removeEventListener(\"saveContent_\"+c),a.saveContentIDMap[c]=!0,b.saveContent(c,f,g)))};a.cancelSaveContent=function(a){b.cancelSaveContent(a)};a.asyncPing=function(c){\"string\"!=typeof c?a.broadcastEvent(\"error\",\"URL is required.\",\"asyncPing\"):b.asyncPing(c)};a.disableCloseRegion=b.disableCloseRegion;a.getSdkVersion=b.getSdkVersion;a.log=function(c){\"undefined\"==typeof c?a.broadcastEvent(\"error\",\"message is required.\",\n\"log\"):\"string\"==typeof c?b.log(c):b.log(JSON.stringify(c))};a.getInMobiAIVersion=function(){return\"2.0\"};a.getVendorName=function(){return\"inmobi\"};a.openExternal=function(a,c){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imraid.openExternal\")||b.openExternal(a,c)};a.updateToPassbook=function(c){mraidview.detectAndBlockFraud(\"imraid.updateToPassbook\")||(\"string\"!=typeof c?a.broadcastEvent(\"error\",\"Request must specify a valid URL\",\"updateToPassbook\"):\nb.updateToPassbook(c))};a.postToSocial=function(a,c,g,e){mraidview.detectAndBlockFraud(\"imraid.postToSocial\")||b.postToSocial(a,c,g,e)};a.getPlatform=b.getPlatform;a.incentCompleted=b.incentCompleted;a.loadSKStore=b.loadSKStore;a.showSKStore=function(a){mraidview.detectAndBlockFraud(\"imraid.showSKStore\")||b.showSKStore(a)};a.pingV2=b.pingV2;a.enableHitTest=b.enableHitTest;a.enableNativeGestures=b.enableNativeGestures;a.enableTouchBeginCallback=b.enableTouchBeginCallback;a.enableTouchEndCallback=b.enableTouchEndCallback;\na.skoverlay=b.skoverlay;a.skoverlayWithSkan=b.skoverlayWithSkan;a.zoom=b.zoom;a.dismissSKOverlay=b.dismissSKOverlay;a.supports=function(a){return b.supports(a)};a.isDeviceMuted=function(){return!imIsObjValid(a.listeners.deviceMuted)?-1:b.isDeviceMuted()};a.isHeadPhonesPlugged=function(){return!imIsObjValid(a.listeners.headphones)?!1:b.isHeadPhonesPlugged()};a.getDeviceVolume=function(){return b.getDeviceVolume()};a.setDeviceVolume=function(a){b.setDeviceVolume(a)};a.hideStatusBar=function(){b.hideStatusBar()};\na.setOpaqueBackground=function(){b.setOpaqueBackground()};a.getRenderableAdIndexes=b.getRenderableAdIndexes;a.getCurrentRenderingIndex=b.getCurrentRenderingIndex;a.showAd=b.showAd;a.timeSinceShow=b.timeSinceShow;a.closeAll=b.closeAll;a.loadAd=b.loadAd;a.setAdContext=b.setAdContext;a.getAdContext=b.getAdContext;a.getShowTimeStamp=b.getShowTimeStamp;a.disableBackButton=b.disableBackButton;a.isBackButtonDisabled=b.isBackButtonDisabled;a.startDownloader=b.startDownloader;a.getDownloadProgress=b.getDownloadProgress;\na.getDownloadStatus=b.getDownloadStatus;a.fireEvent=b.fireEvent;a.saveBlob=b.saveBlob;a.getBlob=b.getBlob;a.setCloseEndCardTracker=b.setCloseEndCardTracker;a.openWithoutTracker=b.openWithoutTracker;a.impressionRendered=b.impressionRendered;a.onGestureDetected=b.onGestureDetected;a.onUserLandingCompleted=b.onUserLandingCompleted;a.customExpand=b.customExpand;a.closeCustomExpand=b.closeCustomExpand;a.customExpandInNative=b.customExpandInNative;a.impressionFired=b.impressionFired;a.getImraidVersion=\nb.getImraidVersion;a.getMaxDeviceVolume=b.getMaxDeviceVolume;a.onAudioStateChanged=b.onAudioStateChanged;a.onUserAudioMuteInteraction=b.onUserAudioMuteInteraction;a.submitAdReport=b.submitAdReport;a.enableFallbackViewabilityFunctionality=b.enableFallbackViewabilityFunctionality;a.logTelemetryEvent=b.logTelemetryEvent;a.getSafeArea=b.getSafeArea;a.onReceviedSKANCallback=b.onReceviedSKANCallback;a.getOpenMode=b.getOpenMode;a.loadWebView=b.loadWebView;a.showWebView=b.showWebView;a.sendMessage=b.sendMessage;\na.destroyWebView=b.destroyWebView;a.createVideoPlayer=function(a){b.createVideoPlayer(a)};a.updateVideoPosition=function(a){b.updateVideoPosition(a)};a.executeVideoPlayerActions=function(a,c){b.executeVideoPlayerActions(a,c)};a.getPlaybackState=function(){return b.getPlaybackState()};a.destroyVideoPlayer=function(){b.destroyVideoPlayer()};try{a.addEventListener(\"onUserLandingCompleted\",function(){1080>b.getSdkVersionInt()&&a.broadcastEvent(\"onUserLandingInitialized\")})}catch(c){}})();\n(function(){var a=window._im_imaiview={ios:{}};window.imaiview=a;a.broadcastEvent=function(){for(var a=Array(arguments.length),c=0;c<arguments.length;c++)a[c]=arguments[c];c=a.shift();try{window.mraid.broadcastEvent(c,a)}catch(d){}};a.getPlatform=function(){return\"android\"};a.getPlatformVersion=function(){return sdkController.getPlatformVersion(\"window.imaiview\")};a.log=function(a){sdkController.log(\"window.imaiview\",a)};a.openEmbedded=function(a){sdkController.openEmbedded(\"window.imaiview\",a)};\na.openExternal=function(a,c){600<=getSdkVersionInt()?sdkController.openExternal(\"window.imaiview\",a,c):sdkController.openExternal(\"window.imaiview\",a)};a.ping=function(a,c){sdkController.ping(\"window.imaiview\",a,c)};a.pingInWebView=function(a,c){sdkController.pingInWebView(\"window.imaiview\",a,c)};a.getSdkVersion=function(){try{var a=sdkController.getSdkVersion(\"window.imaiview\");if(\"string\"==typeof a&&null!=a)return a}catch(c){return\"3.7.0\"}};a.onUserInteraction=function(a){if(\"object\"!=typeof a||\nnull==a)sdkController.onUserInteraction(\"window.imaiview\",null);else try{sdkController.onUserInteraction(\"window.imaiview\",JSON.stringify(a))}catch(c){sdkController.onUserInteraction(\"window.imaiview\",null)}};a.fireAdReady=function(){sdkController.fireAdReady(\"window.imaiview\")};a.fireAdFailed=function(){sdkController.fireAdFailed(\"window.imaiview\")};a.broadcastEvent=function(){window.imai.broadcastEvent.apply(window.imai,arguments)}})();\n(function(){var a=window._im_imaiview;window._im_imai=new InmobiObj;window._im_imai.ios=new InmobiObj;var b=window._im_imai;window.imai=window._im_imai;b.matchString=function(a,b){if(\"string\"!=typeof a||null==a||null==b)return-1;var f=-1;try{f=a.indexOf(b)}catch(g){}return f};b.isHttpUrl=function(a){return\"string\"!=typeof a||null==a?!1:0==b.matchString(a,\"http://\")?!0:0==b.matchString(a,\"https://\")?!0:!1};b.appendTapParams=function(a,d,f){if(!imIsObjValid(d)||!imIsObjValid(f))return a;b.isHttpUrl(a)&&\n(a=-1==b.matchString(a,\"?\")?a+(\"?u-tap-o=\"+d+\",\"+f):a+(\"&u-tap-o=\"+d+\",\"+f));return a};b.performAdClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;if(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null,l=null,q=null,p=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(r){n=\nm=0}imIsObjValid(g)?imIsObjValid(f)?(l=g.url,q=g.fallbackUrl,p=g.urlType,e=f.url,h=f.pingWV,k=f.fr):(l=g.url,p=g.urlType):(l=f.url,p=f.urlType);f=b.getPlatform();try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=!0;if(0>h||1<h)h=!0;if(\"number\"!=typeof p||null==p)p=0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");if(imIsObjValid(l))switch(imIsObjValid(e)||\n(l=b.appendTapParams(l,m,n)),p){case 1:b.openEmbedded(l);break;case 2:\"ios\"==f?b.ios.openItunesProductView(l):this.broadcastEvent(\"error\",\"Cannot process openItunesProductView for os\"+f);break;default:b.openExternal(l,q)}else b.log(\"Landing url provided is null.\")}catch(s){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.performActionClick=function(a,d){d=d||event;if(imIsObjValid(a)){var f=a.clickConfig,g=a.landingConfig;\nif(!imIsObjValid(f)&&!imIsObjValid(g))b.log(\"click/landing config are invalid, Nothing to process .\"),this.broadcastEvent(\"error\",\"click/landing config are invalid, Nothing to process .\");else{var e=null,h=null,k=null,m=null,n=null;if(imIsObjValid(d))try{m=d.changedTouches[0].pageX,n=d.changedTouches[0].pageY}catch(l){n=m=0}imIsObjValid(f)&&(e=f.url,h=f.pingWV,k=f.fr);try{if(\"boolean\"!=typeof k&&\"number\"!=typeof k||null==k)k=!0;if(0>k||1<k)k=!0;if(\"boolean\"!=typeof h&&\"number\"!=typeof h||null==h)h=\n!0;if(0>h||1<h)h=!0;e=b.appendTapParams(e,m,n);imIsObjValid(e)?!0==h?b.pingInWebView(e,k):b.ping(e,k):b.log(\"clickurl provided is null.\");b.onUserInteraction(g)}catch(q){}}}else b.log(\" invalid config, nothing to process .\"),this.broadcastEvent(\"error\",\"invalid config, nothing to process .\")};b.getVersion=function(){return\"1.0\"};b.getPlatform=a.getPlatform;b.getPlatformVersion=a.getPlatformVersion;b.log=a.log;b.openEmbedded=function(b){console.log(\"openEmbedded is deprecated, will be removed in future version\");\nmraidview.detectAndBlockFraud(\"imai.openEmbedded\")||a.openEmbedded(b)};b.openExternal=function(b,d){console.log(\"openExternal is deprecated, will be removed in future version\");mraidview.detectAndBlockFraud(\"imai.openExternal\")||a.openExternal(b,d)};b.ping=a.ping;b.pingInWebView=a.pingInWebView;b.onUserInteraction=a.onUserInteraction;b.getSdkVersion=a.getSdkVersion;b.loadSKStore=a.loadSKStore;b.showSKStore=function(b){mraidview.detectAndBlockFraud(\"imai.showSKStore\")||a.showSKStore(b)};b.ios.openItunesProductView=\nfunction(b){mraidview.detectAndBlockFraud(\"imai.ios.openItunesProductView\")||a.ios.openItunesProductView(b)};b.fireAdReady=a.fireAdReady;b.fireAdFailed=a.fireAdFailed})();";
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m11).a(str3, "Returning fetched Mraid Js string.");
        }
        return string;
    }

    public final Ff getOrientationProperties() {
        return this.G0;
    }

    public final long getPlacementId() {
        return this.W;
    }

    public byte getPlacementType() {
        return this.f24145b;
    }

    public final HtmlVideoPlaybackState getPlaybackState() {
        C3251v8 c3251v8 = this.Y0;
        if (c3251v8 == null) {
            return null;
        }
        if (c3251v8.f25545g.get()) {
            return new HtmlVideoPlaybackState();
        }
        if (c3251v8.f25555q.get() == EnumC3176s8.INIT) {
            EnumC2723a8[] enumC2723a8Arr = EnumC2723a8.f23967a;
            c3251v8.a("getVideoPlayerState", "Playback state requested before load", (String) null);
        }
        return c3251v8.f25549k.a();
    }

    public C getReferenceContainer() {
        return this.f24167k0;
    }

    public final C3037mi getRenderViewTelemetry() {
        return this.f24152d0;
    }

    @WorkerThread
    public final JSONArray getRenderableAdIndexes() {
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        return interfaceC3268w0 != null ? ((AbstractC2995l1) interfaceC3268w0).v() : new JSONArray();
    }

    public final Di getRoute() {
        return this.f24164j;
    }

    public final JSONObject getSafeArea() {
        xo xoVar = this.N0;
        if (xoVar != null) {
            Integer numF = J5.f();
            wo woVar = (numF == null && (numF = J5.f22899g) == null) ? null : (wo) xoVar.f25751d.get(Integer.valueOf(numF.intValue()));
            if (woVar != null) {
                return woVar.a();
            }
        }
        return null;
    }

    public final boolean getShouldFireLandingPageBeacons() {
        return this.M0;
    }

    @WorkerThread
    public final long getShowTimeStamp() {
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        if (interfaceC3268w0 != null) {
            return ((AbstractC2995l1) interfaceC3268w0).w();
        }
        return 0L;
    }

    public final Ti getSiblingWebviewManager() {
        return (Ti) this.f24184t.getValue();
    }

    public Map<String, C3144r1> getTelemetryManagerMap() {
        return this.P0;
    }

    public C2890gk getTelemetryOnAdImpression() {
        Map<String, C3144r1> telemetryManagerMap = getTelemetryManagerMap();
        return new C2890gk(telemetryManagerMap != null ? telemetryManagerMap.get("AdImpressionSuccessful") : null, this.F0, getCreativeId(), getImpressionId(), getMarkupType());
    }

    @VisibleForTesting
    public final boolean getUnloaded() {
        return this.O0;
    }

    public final Ln getVISIBILITY_CHANGE_LISTENER() {
        return this.V0;
    }

    public final String getViewState() {
        return this.f24196z;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public long getViewTouchTimestamp() {
        return this.f24158g;
    }

    @Override // com.inmobi.media.C
    public Fn getViewableAd() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "viewableAd getter " + this);
        }
        if (this.f24173n0 == null) {
            this.f24173n0 = new C9(this, new Gn(this), new C3126q7(this.f24180r, this.F0, this.f24191w0, this.f24193x0, getVisibilityTrackingMinPercentage(), this.f24162i), this.f24162i);
            Set<C3288wk> set = this.f24148c;
            if (set != null) {
                for (C3288wk c3288wk : set) {
                    try {
                        if (c3288wk.f25666a == 3) {
                            setOmidViewableAd(c3288wk);
                        }
                        mj.r rVar = mj.r.f64562a;
                    } catch (Exception e10) {
                        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
                        if (interfaceC3028m10 != null) {
                            String str2 = f24141g1;
                            ck.p.i(str2, "TAG");
                            ((C3053n9) interfaceC3028m10).b(str2, "Exception occurred while creating the HTML viewable ad : " + e10.getMessage());
                            mj.r rVar2 = mj.r.f64562a;
                        }
                    }
                }
            }
        }
        Fn fn2 = this.f24173n0;
        ck.p.g(fn2);
        return fn2;
    }

    public final int[] getViewableFrameArray() {
        return this.f24181r0;
    }

    public final ko getWebViewFactory() {
        return this.f24166k;
    }

    public final uo getWindowInsetListener() {
        return this.R0;
    }

    public final C2889gj getWvStateMachine() {
        return this.f24182s;
    }

    public final void l() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "dismissCurrentIntAdViewContainerInShowNextPodFlow " + this);
        }
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            C2907hc c2907hc = c3280wc.f25635c;
            if (c2907hc != null) {
                c2907hc.b();
            }
            c3280wc.f25635c = null;
        }
        if (ck.p.e(Profile.DEFAULT_PROFILE_NAME, this.f24196z)) {
            setAndUpdateViewState("Hidden");
            if (getParent() instanceof ViewGroup) {
                this.f24166k.b(new bk.l() { // from class: b7.a6
                    @Override // bk.l
                    public final Object invoke(Object obj) {
                        return GestureDetectorOnGestureListenerC2785ci.b((C2987ki) obj);
                    }
                });
            }
            SparseArray sparseArray = InMobiAdActivity.f22317k;
            ck.p.j(this, "container");
            InMobiAdActivity.f22317k.remove(hashCode());
        }
    }

    public final void n() {
        Activity fullScreenActivity;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "finishFullScreenActivity " + this);
        }
        SparseArray sparseArray = InMobiAdActivity.f22317k;
        ck.p.j(this, "container");
        InMobiAdActivity.f22317k.remove(hashCode());
        if (getFullScreenActivity() == null) {
            if (ck.p.e(Profile.DEFAULT_PROFILE_NAME, this.f24196z)) {
                setAndUpdateViewState("Hidden");
            }
            W();
            return;
        }
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        if (interfaceC3268w0 == null || !interfaceC3268w0.a(this)) {
            Activity fullScreenActivity2 = getFullScreenActivity();
            ck.p.h(fullScreenActivity2, "null cannot be cast to non-null type com.inmobi.ads.rendering.InMobiAdActivity");
            ((InMobiAdActivity) fullScreenActivity2).f22323e = true;
            Activity fullScreenActivity3 = getFullScreenActivity();
            if (fullScreenActivity3 != null) {
                fullScreenActivity3.finish();
            }
            if (this.T == -1 || (fullScreenActivity = getFullScreenActivity()) == null) {
                return;
            }
            fullScreenActivity.overridePendingTransition(0, this.T);
        }
    }

    public final void o() {
        L0 l10;
        AdQualityControl adQualityControl;
        Activity activity;
        L0 l11;
        AdQualityControl adQualityControl2;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireAQSession - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
        }
        if (!ck.p.e(getAdType(), ImpressionLog.f43647w) || Build.VERSION.SDK_INT < 29 || (activity = (Activity) this.f24186u.get()) == null) {
            L0 l12 = this.H0;
            if (l12 == null) {
                ck.p.B("adQualityManager");
                l10 = null;
            } else {
                l10 = l12;
            }
            l10.getClass();
            ck.p.j(this, "adView");
            if (!l10.a()) {
                l10.a("session state invalid");
                return;
            }
            l10.a("session start trigger...");
            l10.f23037c.set(true);
            AdQualityControl adQualityControl3 = l10.f23041g;
            if (adQualityControl3 == null || !adQualityControl3.getTakeScreenshot() || (adQualityControl = l10.f23041g) == null) {
                return;
            }
            l10.a(this, (long) (adQualityControl.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
            return;
        }
        L0 l13 = this.H0;
        if (l13 == null) {
            ck.p.B("adQualityManager");
            l11 = null;
        } else {
            l11 = l13;
        }
        l11.getClass();
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        if (!l11.a()) {
            l11.a("session state invalid");
            return;
        }
        l11.a("session start trigger...");
        l11.f23037c.set(true);
        AdQualityControl adQualityControl4 = l11.f23041g;
        if (adQualityControl4 == null || !adQualityControl4.getTakeScreenshot() || (adQualityControl2 = l11.f23041g) == null) {
            return;
        }
        l11.a(activity, (long) (adQualityControl2.getScreenshotDelayInSeconds() * 1000), false, (Qh) null);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        Gh gh2;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onAttachedToWindow " + this);
        }
        super.onAttachedToWindow();
        if (!this.f24154e) {
            if (ck.p.e(this.f24164j.f22535b, "default")) {
                getListener().d(this);
            }
            if (getAdConfig().getRendering().getEnableActivityContextOnBannerAttach()) {
                B();
            }
        }
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            C2727ac c2727ac = c3280wc.f25636d;
            if (c2727ac != null) {
                c2727ac.b();
            }
            C2727ac c2727ac2 = c3280wc.f25637e;
            if (c2727ac2 != null) {
                c2727ac2.b();
            }
            C2727ac c2727ac3 = c3280wc.f25638f;
            if (c2727ac3 != null) {
                c2727ac3.b();
            }
        }
        O();
        if (this.f24190w == null) {
            ViewParent parent = getParent();
            this.f24190w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        }
        U();
        R();
        Q();
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "==== CHECKPOINT REACHED - VISIBLE ====");
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 == null || (gh2 = ((C3053n9) interfaceC3028m11).f24879a) == null) {
            return;
        }
        gh2.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onDetachedFromWindow " + this);
        }
        U5 u10 = this.D0;
        if (u10 != null) {
            U5.a(u10, 8, true, null, 12);
        }
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            C2727ac c2727ac = c3280wc.f25636d;
            if (c2727ac != null) {
                c2727ac.a();
            }
            C2727ac c2727ac2 = c3280wc.f25637e;
            if (c2727ac2 != null) {
                c2727ac2.a();
            }
            C2727ac c2727ac3 = c3280wc.f25638f;
            if (c2727ac3 != null) {
                c2727ac3.a();
            }
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "Detached from window");
        }
        L0 l10 = this.H0;
        if (l10 == null) {
            ck.p.B("adQualityManager");
            l10 = null;
        }
        if (l10.f23038d.get()) {
            l10.a("session end is already triggered");
        } else if (!l10.f23035a.getEnabled()) {
            l10.a("config kill switch - false. ad quality will skip");
        } else if (l10.f23041g == null) {
            l10.a("setup not done. ignore trigger");
        } else {
            l10.f23038d.set(true);
            l10.a(false);
        }
        if (this.I0.get()) {
            nk.j.d(A9.f22351c, null, null, new Wh(this, null), 3, null);
        }
        U();
        T();
        S();
        try {
            super.onDetachedFromWindow();
        } catch (IllegalArgumentException e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).b(str3, "Detaching WebView from window encountered an error ( " + e10.getMessage() + " )");
            }
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        if (!this.f24172n) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "DoubleTap gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(1)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "Double tap gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m11).a(str3, "onDoubleTapEvent detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        if (motionEvent.getAction() == 0) {
            JSONArray jSONArray = new JSONArray();
            try {
                jSONArray.put(F3.c(motionEvent.getX()));
                jSONArray.put(F3.c(motionEvent.getY()));
            } catch (JSONException e10) {
                InterfaceC3028m9 interfaceC3028m12 = this.f24162i;
                if (interfaceC3028m12 != null) {
                    String str4 = f24141g1;
                    ck.p.i(str4, "TAG");
                    ((C3053n9) interfaceC3028m12).a(str4, "Exception in onDoubleTap", e10);
                }
            }
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(jSONArray);
            g("window.imraidview.onGestureDetected('1', '" + jSONArray2 + "');");
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ck.p.j(motionEvent2, "e2");
        if (!this.f24172n) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Fling gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(6)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "fling gesture is disabled from config");
            }
            return false;
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
            jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
            jSONArray.put(new JSONArray((Collection) nj.s.n(Float.valueOf(f10), Float.valueOf(f11))));
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).a(str3, "Exception in onFling", e10);
            }
        }
        g("window.imraidview.onGestureDetected('6', '" + jSONArray + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        if (!this.f24172n) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Long Press gesture is disabled via enableNativeGestures API");
                return;
            }
            return;
        }
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(5)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "LongPress gesture is disabled from config");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m11).a(str3, "onLongPress detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(motionEvent.getX()));
            jSONArray.put(F3.c(motionEvent.getY()));
        } catch (JSONException e10) {
            InterfaceC3028m9 interfaceC3028m12 = this.f24162i;
            if (interfaceC3028m12 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m12).a(str4, "Exception in onLongPress", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('5', '" + jSONArray2 + "');");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f10, float f11) {
        ck.p.j(motionEvent2, "e2");
        if (this.f24154e && !this.V) {
            this.V = true;
            SparseArray sparseArray = InMobiAdActivity.f22317k;
            f24139e1.getClass();
            JSONObject jSONObjectA = Mh.a("IN_CUSTOM_BROWSER", "onScroll");
            ck.p.j(jSONObjectA, "jsonObject");
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = InMobiAdActivity.f22318l;
            if (gestureDetectorOnGestureListenerC2785ci != null) {
                gestureDetectorOnGestureListenerC2785ci.c(jSONObjectA);
            }
            return false;
        }
        if (!this.f24172n) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Scroll gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "onScroll detected \n " + motionEvent + " \n " + motionEvent2);
        }
        if (!this.f24154e) {
            C3014lk scrollThrottler = getScrollThrottler();
            scrollThrottler.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - scrollThrottler.f24786b < scrollThrottler.f24785a) {
                scrollThrottler.f24786b = jElapsedRealtime;
            } else {
                scrollThrottler.f24786b = jElapsedRealtime;
                if (getRenderingConfig().getSupportedGestures().contains(8)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray.put(motionEvent == null ? new JSONArray() : new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent.getX())), Integer.valueOf(F3.c(motionEvent.getY())))));
                        jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c(motionEvent2.getX())), Integer.valueOf(F3.c(motionEvent2.getY())))));
                    } catch (Exception e10) {
                        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
                        if (interfaceC3028m11 != null) {
                            String str3 = f24141g1;
                            ck.p.i(str3, "TAG");
                            ((C3053n9) interfaceC3028m11).a(str3, "Exception in onScroll", e10);
                        }
                    }
                    g("window.imraidview.onGestureDetected('8', '" + jSONArray + "');");
                }
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        if (!this.f24172n) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "SingleTapConfirmed gesture is disabled via enableNativeGestures API");
            }
            return false;
        }
        if (this.f24154e || !getRenderingConfig().getSupportedGestures().contains(0)) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "Click gesture is disabled from config");
            }
            return false;
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m11).a(str3, "onSingleTapConfirmed detected \n " + motionEvent);
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(motionEvent.getX()));
            jSONArray.put(F3.c(motionEvent.getY()));
        } catch (JSONException e10) {
            InterfaceC3028m9 interfaceC3028m12 = this.f24162i;
            if (interfaceC3028m12 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m12).a(str4, "Exception in onSingleTapConfirmed", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('0', '" + jSONArray2 + "');");
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "e");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onSingleTapUp detected \n " + motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return false;
    }

    @Override // android.webkit.WebView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "onSizeChanged " + this);
        }
        super.onSizeChanged(i10, i11, i12, i13);
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "onSizeChanged (" + i10 + ", " + i11 + ")");
        }
        if (i10 == 0 || i11 == 0) {
            return;
        }
        a(F3.b(i10 / J5.b()), F3.b(i11 / J5.b()));
    }

    @Override // android.webkit.WebView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ck.p.j(motionEvent, "event");
        if (Float.isNaN(motionEvent.getX()) || Float.isNaN(motionEvent.getY())) {
            if (!this.J0) {
                InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
                if (interfaceC3028m9 != null) {
                    String str = f24141g1;
                    ck.p.i(str, "TAG");
                    ((C3053n9) interfaceC3028m9).b(str, "onTouchEvent Invalid Coordinates " + motionEvent);
                }
                this.J0 = true;
            }
            return super.onTouchEvent(motionEvent);
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "onTouchEvent " + this);
        }
        if (!getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(motionEvent);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    @Override // android.webkit.WebView, android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onWindowFocusChanged " + this + " - " + z10);
        }
        super.onWindowFocusChanged(z10);
        if (z10) {
            if (isShown()) {
                C3051n7 c3051n7 = C3126q7.f25145k;
                if (c3051n7.b(this, this, this.f24193x0) && c3051n7.a(this, this, this.f24193x0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        }
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity == null || !fullScreenActivity.isInMultiWindowMode()) {
            d(z10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004e  */
    @Override // android.webkit.WebView, android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "onWindowVisibilityChanged " + this + com.ironsource.Z7.f27998r + i10);
        }
        super.onWindowVisibilityChanged(i10);
        boolean z10 = true;
        boolean z11 = i10 == 0;
        if (z11) {
            int visibilityTrackingMinPercentage = getVisibilityTrackingMinPercentage();
            if (isShown()) {
                C3051n7 c3051n7 = C3126q7.f25145k;
                if (!c3051n7.b(this, this, visibilityTrackingMinPercentage) || !c3051n7.a(this, this, visibilityTrackingMinPercentage)) {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
        } else {
            z10 = z11;
        }
        d(z10);
    }

    public final void p() {
        if (this.O0) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).a(str, "fireAdFailed " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        this.C0 = true;
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            long j10 = c3037mi.f24837c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
            String strA = c3037mi.a("FireAdFailed");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        getListener().h(this);
    }

    public final void q() {
        if (this.M.get()) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).b(str, "fireAdReady called on destroyed view");
                return;
            }
            return;
        }
        if (this.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).a(str2, "fireAdReady " + this + " - Ad is already unloaded");
                return;
            }
            return;
        }
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            Map mapA = c3037mi.a();
            long j10 = c3037mi.f24837c;
            nk.l0 l0Var = AbstractC2940il.f24565a;
            long jElapsedRealtime = SystemClock.elapsedRealtime() - j10;
            mapA.put("latency", Long.valueOf(jElapsedRealtime));
            c3037mi.f24842h = jElapsedRealtime;
            String strA = c3037mi.a("FireAdReady");
            Wj wj2 = Wj.f23753a;
            Wj.b(strA, mapA, EnumC2735ak.SDK);
        }
        InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
        if (interfaceC3028m11 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m11).a(str3, "fireAdReady " + this);
        }
        this.B0 = true;
        if (this.f24180r == 0) {
            u();
        }
        nk.j.d(A9.f22351c, null, null, new Zh(this, null), 3, null);
        getListener().i(this);
    }

    public final void r() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireBackButtonPressedEvent " + this);
        }
        String str2 = this.L;
        if (str2 != null) {
            a(str2, "broadcastEvent('backButtonPressed')");
        }
    }

    public final void s() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireClickTrackers " + this);
        }
        D4 d10 = this.X0;
        if (d10 != null) {
            d10.f();
        }
        v();
        getListener().b(this);
    }

    public boolean safedk_ci_dispatchTouchEvent_57035176a7617922c0477832317fe02d(MotionEvent p10) {
        ck.p.j(p10, "event");
        if (Float.isNaN(p10.getX()) || Float.isNaN(p10.getY())) {
            if (!this.J0) {
                InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
                if (interfaceC3028m9 != null) {
                    String str = f24141g1;
                    ck.p.i(str, "TAG");
                    ((C3053n9) interfaceC3028m9).b(str, "dispatchTouchEvent Invalid Coordinates " + p10);
                }
                this.J0 = true;
            }
            return super.dispatchTouchEvent(p10);
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "dispatchTouchEvent " + this);
        }
        this.A0.a(p10);
        if (getAdConfig().getRendering().getUseDispatchTouchEvent()) {
            a(p10);
        }
        setViewTouchTimestamp(SystemClock.elapsedRealtime());
        return super.dispatchTouchEvent(p10);
    }

    public final void setAdPodHandler(InterfaceC3268w0 interfaceC3268w0) {
        this.f24171m0 = interfaceC3268w0;
    }

    public void setAdType(String str) {
        this.f24161h0 = str;
    }

    public final void setAllowAutoRedirection(boolean z10) {
        this.f24169l0 = z10;
    }

    public final void setAndUpdateViewState(String str) {
        ck.p.j(str, "state");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "setAndUpdateViewState " + this);
        }
        this.f24196z = str;
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m10).a(str3, "set state:" + this.f24196z);
        }
        Locale locale = Locale.ENGLISH;
        ck.p.i(locale, "ENGLISH");
        String lowerCase = str.toLowerCase(locale);
        ck.p.i(lowerCase, "toLowerCase(...)");
        e(lowerCase);
    }

    public final void setBackButtonDisabled(boolean z10) {
        this.K = z10;
    }

    public final void setBannerHolderActivity(WeakReference<Activity> weakReference) {
        ck.p.j(weakReference, "<set-?>");
        this.f24188v = weakReference;
    }

    public final void setBeaconUrl(String str) {
        this.L0 = str;
    }

    public final void setBlobProvider(E2 e10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setBlobProvider " + this);
        }
        this.f24165j0 = e10;
    }

    public final void setCloseAssetArea(vo voVar) {
        ck.p.j(voVar, "value");
        if (!this.W0) {
            Context context = getContext();
            ck.p.i(context, "getContext(...)");
            if (!F3.a(context)) {
                return;
            }
        }
        this.f24153d1 = new vo(0, voVar.f25598b, voVar.f25599c, 0);
    }

    public final void setContentURL(String str) {
        this.f24179q0 = str;
    }

    public final void setContextualDataHandler(D4 d10) {
        this.X0 = d10;
    }

    public void setCreativeId(String str) {
        this.f24143a0 = str;
    }

    public final void setDisableBackButton(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setDisableBackButton " + this);
        }
        this.K = z10;
    }

    public final void setEmbeddedBrowserJsCallbacks(S5 s10) {
        this.E0 = s10;
    }

    public final void setEnableNativeGestures(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "enableNativeGestures " + this + com.ironsource.Z7.f27998r + z10);
        }
        boolean z11 = this.f24172n;
        this.f24172n = z10;
        if (z10 && !z11) {
            if (this.f24195y0 == null) {
                this.f24195y0 = new C3081oc(this);
            }
        } else {
            if (z10 || !z11) {
                return;
            }
            this.f24195y0 = null;
        }
    }

    public final void setEnableTouchBeginCallback(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setEnableTouchBeginCallback " + this + com.ironsource.Z7.f27998r + z10);
        }
        this.f24176p = z10;
    }

    public final void setEnableTouchEndCallback(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setEnableTouchEndCallback " + this + com.ironsource.Z7.f27998r + z10);
        }
        this.f24174o = z10;
    }

    public void setExitAnimation(int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setExitAnimation " + this);
        }
        this.T = i10;
    }

    public final void setExposureTracker(U u10) {
        this.K0 = u10;
    }

    public void setFriendlyViews(Map<View, FriendlyObstructionPurpose> map) {
        this.f24163i0 = map;
    }

    public void setFullScreenActivityContext(Activity activity) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setFullScreenActivityContext " + this);
        }
        this.f24186u = new WeakReference(activity);
        Y();
        if (this.f24154e || activity == null) {
            return;
        }
        xo xoVar = this.N0;
        if (xoVar != null) {
            xoVar.a();
        }
        this.N0 = new xo(activity, this.R0, this.f24162i);
    }

    public final void setImmersiveMode(boolean z10) {
        this.W0 = z10;
    }

    public void setImpressionId(String str) {
        this.f24151d = str;
    }

    public final void setLandingPageTelemetryControlInfoOnWebViewClient(Ya ya2) {
        U5 u10 = this.D0;
        if (u10 != null) {
            u10.f23619j = ya2;
            u10.f23620k = new Wa(ya2, u10);
        }
    }

    public final void setLandingScheme(String str) {
        ck.p.j(str, "<set-?>");
        this.f24156f = str;
    }

    public final void setMCreativeType(String str) {
        this.F0 = str;
    }

    public final void setMImpressionMinPercentageViewed(int i10) {
        this.f24193x0 = i10;
    }

    public final void setMImpressionMinTimeViewed(int i10) {
        this.f24191w0 = i10;
    }

    public final void setMViewableAd(Fn fn2) {
        this.f24173n0 = fn2;
    }

    public final void setMarkupTypeAdUnit(String str) {
        ck.p.j(str, "<set-?>");
        this.S0 = str;
    }

    public final void setOrientationProperties(Ff ff2) {
        ck.p.j(ff2, "<set-?>");
        this.G0 = ff2;
    }

    @VisibleForTesting
    public final void setPingAckListener(InterfaceC2757bg interfaceC2757bg) {
        ck.p.j(interfaceC2757bg, "pingAckListener");
        this.f24178q = interfaceC2757bg;
    }

    @VisibleForTesting
    public final void setPingManager(C2834eg c2834eg) {
        ck.p.j(c2834eg, "pingManager");
        this.f24157f0 = c2834eg;
    }

    public final void setPlacementId(long j10) {
        this.W = j10;
    }

    public void setReferenceContainer(C c10) {
        this.f24167k0 = c10;
    }

    public final void setRenderViewEventListener(AbstractC2836ei abstractC2836ei) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setRenderViewEventListener " + this);
        }
        this.f24192x = abstractC2836ei;
    }

    public final void setRenderViewTelemetry(C3037mi c3037mi) {
        this.f24152d0 = c3037mi;
    }

    public final void setScrollable(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "setScrollable " + this);
        }
        setScrollContainer(z10);
        setVerticalScrollBarEnabled(z10);
        setHorizontalScrollBarEnabled(z10);
    }

    public final void setShouldFireLandingPageBeacons(boolean z10) {
        this.M0 = z10;
    }

    public void setTelemetryManagerMap(Map<String, C3144r1> map) {
        this.P0 = map;
    }

    @VisibleForTesting
    public final void setUnloaded(boolean z10) {
        this.O0 = z10;
    }

    public final void setUseCustomClose(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setUseCustomClose " + this + com.ironsource.Z7.f27998r + z10);
        }
        this.G = z10;
    }

    public void setViewTouchTimestamp(long j10) {
        this.f24158g = j10;
    }

    public final void setWatermark(final WatermarkData watermarkData) {
        ck.p.j(watermarkData, "watermarkData");
        if (!getAdConfig().getWatermarkEnabled()) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Watermark disabled from config. ignoring...");
                return;
            }
            return;
        }
        final byte[] bArrDecode = Base64.decode(watermarkData.getWatermarkBase64EncodedString(), 0);
        ck.p.i(bArrDecode, "decode(...)");
        if (!this.f24146b0.get()) {
            this.f24146b0.set(true);
            this.f24149c0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: b7.b6
                @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                public final void onGlobalLayout() {
                    GestureDetectorOnGestureListenerC2785ci.a(this.f4856b, bArrDecode, watermarkData);
                }
            };
            getViewTreeObserver().addOnGlobalLayoutListener(this.f24149c0);
        } else {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m10).c(str2, "Watermark layout listener already set; ignoring duplicate setWatermark call");
            }
        }
    }

    @Override // android.webkit.WebView
    public final void stopLoading() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "stopLoading " + this);
        }
        if (this.M.get()) {
            return;
        }
        super.stopLoading();
    }

    public final void t() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireEvent " + this + com.ironsource.Z7.f27998r + 2);
        }
    }

    public void u() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireImpression " + this);
        }
        if (ck.p.e("video", this.F0) || ck.p.e("audio", this.F0)) {
            return;
        }
        F();
        g("window.imraidview.impressionRendered();");
        getListener().c(this);
    }

    public final void v() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireOnUserInteraction " + this);
        }
        g("window.imraidview.onUserInteraction();");
    }

    public final void w() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "firePopupBlockedEvent " + this);
        }
        g("window.mraidview.popupBlocked('popupBlocked')");
    }

    private final AdConfig.MraidConfig getMraidConfig() {
        return getAdConfig().getMraidConfig();
    }

    public final void B() {
        Activity activity;
        if (getPlacementType() == 0) {
            ck.p.i(f24141g1, "TAG");
            toString();
            if (((Activity) this.f24188v.get()) == null) {
                int upperBoundForActivityContext = getAdConfig().getRendering().getUpperBoundForActivityContext();
                ck.p.j(this, "<this>");
                int i10 = 0;
                View view = this;
                loop0: while (true) {
                    activity = null;
                    if (view == null || i10 >= upperBoundForActivityContext) {
                        break;
                    }
                    Context context = view.getContext();
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    while (context instanceof ContextWrapper) {
                        if (context instanceof Activity) {
                            activity = (Activity) context;
                            break loop0;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Object parent = view.getParent();
                    if (parent != null && (parent instanceof View)) {
                        view = (View) parent;
                    } else {
                        view = null;
                    }
                    i10++;
                }
                if (activity != null) {
                    this.f24188v = new WeakReference(activity);
                    mj.r rVar = mj.r.f64562a;
                }
            }
        }
    }

    public final void W() {
        getListener().e(this);
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "ad dismissed");
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            ((C3053n9) interfaceC3028m10).a();
        }
        L0 l10 = this.H0;
        if (l10 == null) {
            ck.p.B("adQualityManager");
            l10 = null;
        }
        if (l10.f23038d.get()) {
            l10.a("session end is already triggered");
            return;
        }
        if (!l10.f23035a.getEnabled()) {
            l10.a("config kill switch - false. ad quality will skip");
        } else if (l10.f23041g == null) {
            l10.a("setup not done. ignore trigger");
        } else {
            l10.f23038d.set(true);
            l10.a(false);
        }
    }

    public final int getArea() {
        return getHeight() * getWidth();
    }

    public final String getCreativeID() {
        String creativeId = getCreativeId();
        if (creativeId == null) {
            return "";
        }
        return creativeId;
    }

    public final AdConfig.RenderingConfig getRenderingConfig() {
        return getAdConfig().getRendering();
    }

    public final int getVisibilityTrackingMinPercentage() {
        if (ck.p.e("audio", getAdType())) {
            return getAdConfig().getViewability().getAudioImpressionMinPercentageViewed();
        }
        return getAdConfig().getViewability().getWebImpressionMinPercentageViewed();
    }

    public final void i(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "loadScript " + this);
        }
        InMobiNetworkBridge.webviewLoadUrl(this, str);
    }

    public final void k() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "disableHardwareAcceleration called. " + this);
        }
        try {
            setLayerType(1, null);
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            AbstractC2929i9.a(e10);
        }
    }

    public final void setConfiguredArea(long j10) {
        this.f24183s0 = ((long) getWidth()) * ((long) getHeight());
    }

    public final void x() {
        InMobiAdActivity inMobiAdActivity;
        Activity fullScreenActivity = getFullScreenActivity();
        if (fullScreenActivity != null) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "fullScreenActivity is not null and finishing");
            }
            if (fullScreenActivity instanceof InMobiAdActivity) {
                inMobiAdActivity = (InMobiAdActivity) fullScreenActivity;
            } else {
                inMobiAdActivity = null;
            }
            if (inMobiAdActivity != null) {
                inMobiAdActivity.a();
            } else {
                fullScreenActivity.finish();
            }
        }
    }

    public final boolean z() {
        if (!ck.p.e(getAdType(), "banner") || !getAdConfig().getMraid3Config().getBannerEnabled()) {
            if (ck.p.e(getAdType(), ImpressionLog.f43647w) && getAdConfig().getMraid3Config().getInterstitialEnabled()) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void f(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "processUseCustomCloseRequest " + this + com.ironsource.Z7.f27998r + z10);
        }
        setUseCustomClose(z10);
        U();
    }

    public final void c(String str, String str2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m9).c(str3, "sendTelemetryForAutoRedirectFraud " + this + com.ironsource.Z7.f27998r + str + com.ironsource.Z7.f27998r + str2);
        }
        HashMap map = new HashMap();
        String creativeId = getCreativeId();
        if (creativeId != null) {
            map.put("creativeId", creativeId);
        }
        map.put("trigger", str);
        String impressionId = getImpressionId();
        if (impressionId != null) {
            map.put("impressionId", impressionId);
        }
        map.put("adType", str2);
        a("BlockAutoRedirection", map);
    }

    public final void h() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "completeFromInterActive " + this);
        }
        D4 d10 = this.X0;
        if (d10 != null) {
            d10.g();
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "completeFromInterActive");
        }
    }

    public final void f(String str) {
        ck.p.j(str, "json");
        if (getAdConfig().getPingsV2Config().getEnabled()) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str2 = f24141g1;
                ck.p.i(str2, "TAG");
                ((C3053n9) interfaceC3028m9).a(str2, "handlePing " + this);
            }
            if (this.f24157f0 == null) {
                this.f24157f0 = new C2834eg(this.f24178q, this.f24152d0);
            }
            C2834eg c2834eg = this.f24157f0;
            ck.p.g(c2834eg);
            c2834eg.getClass();
            ck.p.j(str, "json");
            nk.j.d(A9.f22352d, null, null, new C2783cg(c2834eg, str, null), 3, null);
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m10).a(str3, "pings v2 is disabled " + this);
        }
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            ck.p.j("unknown", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY);
            Map mapA = c3037mi.a();
            mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, (short) 2257);
            mapA.put("trigger", "unknown");
            mapA.put("retryCount", String.valueOf(0));
            AbstractC2960jg.a("PingFailed", mapA);
        }
        InterfaceC2757bg interfaceC2757bg = this.f24178q;
        Z5[] z5Arr = Z5.f23890a;
        ((Yh) interfaceC2757bg).a("", -100, "Ping V2 is disabled from SDK config", System.currentTimeMillis(), 0);
    }

    public final void g() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "closeAll " + this);
        }
        InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
        if (interfaceC3268w0 != null) {
            interfaceC3268w0.b();
        }
        x();
    }

    public final void c(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireViewableChange " + this + com.ironsource.Z7.f27998r + z10);
        }
        g("window.mraidview.broadcastEvent('viewableChange'," + z10 + ");");
    }

    public final void a(C3081oc c3081oc, MotionEvent motionEvent, MotionEvent motionEvent2) {
        ck.p.j(c3081oc, "movementGestureDetector");
        ck.p.j(motionEvent, "initialEvent");
        ck.p.j(motionEvent2, "endEvent");
        if (!this.f24154e && getRenderingConfig().getSupportedGestures().contains(4)) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).a(str, lk.q.j(" onScaleDetected\n " + motionEvent + " \n " + motionEvent2));
            }
            JSONArray jSONArray = new JSONArray();
            float f10 = 2;
            jSONArray.put(new JSONArray((Collection) nj.s.n(Integer.valueOf(F3.c((motionEvent2.getX(1) + motionEvent2.getX()) / f10)), Integer.valueOf(F3.c((motionEvent2.getY(1) + motionEvent2.getY()) / f10)))));
            g("window.imraidview.onGestureDetected('4', '" + jSONArray + "');");
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).c(str2, "Pinch gesture is disabled from config");
        }
    }

    public static final mj.r c(C2987ki c2987ki) {
        ck.p.j(c2987ki, "it");
        c2987ki.m();
        return mj.r.f64562a;
    }

    public final void b(float f10, float f11) {
        if (!this.f24174o) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Touch End is disabled via enableTouchEnd API");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "onTouchEnd detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).a(str3, "Exception in onTouchEnd", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('10', '" + jSONArray2 + "');");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:75:0x0150 A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0080, code lost:
    
        if (r6.equals("html5video") == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x011b, code lost:
    
        if (r6.equals(io.bidmachine.iab.mraid.MraidNativeFeature.FEATURE_INLINE_VIDEO) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0120, code lost:
    
        if (r5.B == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0124, code lost:
    
        if (r5.Q == false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0126, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r6 = r5.f24162i;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0129, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012b, code lost:
    
        r2 = com.inmobi.media.GestureDetectorOnGestureListenerC2785ci.f24141g1;
        ck.p.i(r2, "TAG");
        ((com.inmobi.media.C3053n9) r6).c(r2, "HTML5 video supported:" + r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0146, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m(java.lang.String r6) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.GestureDetectorOnGestureListenerC2785ci.m(java.lang.String):boolean");
    }

    public final void c(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "evaluateScript " + this);
        }
        evaluateJavascript(str, null);
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean c() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "canRedirectExternally Called");
        }
        if (getRenderingConfig().getAutoRedirectionEnforcement()) {
            return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
        }
        return true;
    }

    public final void e(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "fireStateChange " + this + com.ironsource.Z7.f27998r + str);
        }
        g("window.mraidview.broadcastEvent('stateChange','" + str + "');");
    }

    public final void c(String str, String str2, String str3) {
        ck.p.j(str, "jsCallbackNamespace");
        ck.p.j(str2, "callback");
        ck.p.j(str3, "blob");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str4 = f24141g1;
            ck.p.i(str4, "TAG");
            ((C3053n9) interfaceC3028m9).a(str4, "retrievedBlob");
        }
        a(str, str2 + "(" + str3 + ");");
    }

    public final void e(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "processDisableCloseRegionRequest " + this + com.ironsource.Z7.f27998r + z10);
        }
        this.J = z10;
        U();
    }

    public final void c(int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "showPodAdAtIndex " + this + com.ironsource.Z7.f27998r + i10);
        }
        if (this.I == Hn.VISIBLE && this.f24171m0 != null && !this.M.get()) {
            InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
            if (interfaceC3268w0 != null) {
                interfaceC3268w0.a(i10, this, getFullScreenActivity());
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).b(str2, "Cannot show index pod ad as the current ad is not viewable");
        }
        b(false);
    }

    public static final C3014lk b(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        return new C3014lk(gestureDetectorOnGestureListenerC2785ci.getAdConfig().getRendering().getScrollThrottleInterval());
    }

    public final void a(float f10, float f11) {
        if (!this.f24176p) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).c(str, "Touch Begin is disabled via enableTouchBegin API");
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).a(str2, "onTouchBegin detected");
        }
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(F3.c(f10));
            jSONArray.put(F3.c(f11));
        } catch (JSONException e10) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m11).a(str3, "Exception in onTouchBegin", e10);
            }
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(jSONArray);
        g("window.imraidview.onGestureDetected('9', '" + jSONArray2 + "');");
    }

    @Override // com.inmobi.media.C
    public void b() throws JSONException {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "destroyContainer " + this);
        }
        j();
        this.f24166k.b(new bk.l() { // from class: b7.z5
            @Override // bk.l
            public final Object invoke(Object obj) {
                return GestureDetectorOnGestureListenerC2785ci.a((C2987ki) obj);
            }
        });
        removeAllViews();
        AdConfig.OmidConfig omidConfig = getAdConfig().getViewability().getOmidConfig();
        if (this.f24175o0 && omidConfig.isOmidEnabled()) {
            Bf.f22423a.getClass();
            if (Omid.isActive()) {
                new C2913hi(this, omidConfig.getWebViewRetainTime()).a();
                return;
            }
        }
        super.destroy();
    }

    public final void c(JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        if (getLandingPageConfig().getEnableOnLpLifeCycleEvent()) {
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str = f24141g1;
                ck.p.i(str, "TAG");
                ((C3053n9) interfaceC3028m9).a(str, "onLpLifeCycleEvent " + this);
            }
            g("window.imraid.broadcastEvent('onLpLifeCycleEvent', " + jSONObject + ");");
        }
    }

    public final void c(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) throws JSONException {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "sourceView");
        ck.p.j(str, "targetId");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "fireShowWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC2785ci.g("window.imraidview.broadcastEvent('webViewShown'," + jSONObject + ");");
    }

    @Override // com.inmobi.media.AbstractC3320y2
    public final Ua d() {
        Za za2;
        String str;
        String str2;
        String str3;
        C3243v0 c3243v0;
        String str4;
        C3243v0 c3243v1;
        String str5;
        C3243v0 c3243v2;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str6 = f24141g1;
            ck.p.i(str6, "TAG");
            ((C3053n9) interfaceC3028m9).a(str6, "initLandingPageHandler " + this);
        }
        boolean z10 = this.f24154e;
        String str7 = this.f24156f;
        boolean zIsCCTEnabled = getAdConfig().isCCTEnabled();
        boolean partialTabsEnabled = getAdConfig().getPartialTabsEnabled();
        C2888gi c2888gi = this.f24160h;
        Va va2 = new Va(z10, str7, zIsCCTEnabled, partialTabsEnabled, c2888gi != null ? c2888gi.f24446m : null);
        Context context = getContext();
        ck.p.i(context, "getContext(...)");
        Rh rh2 = this.U0;
        Th th2 = this.T0;
        if (this.f24154e) {
            za2 = null;
        } else {
            C2888gi c2888gi2 = this.f24160h;
            long j10 = (c2888gi2 == null || (c3243v2 = c2888gi2.f24434a) == null) ? 0L : c3243v2.f25505a;
            String impressionId = getImpressionId();
            String str8 = impressionId == null ? "" : impressionId;
            C2888gi c2888gi3 = this.f24160h;
            za2 = new Za(j10, str8, (c2888gi3 == null || (c3243v1 = c2888gi3.f24434a) == null || (str5 = c3243v1.f25510f) == null) ? "" : str5, (c2888gi3 == null || (c3243v0 = c2888gi3.f24434a) == null || (str4 = c3243v0.f25509e) == null) ? "" : str4, (c2888gi3 == null || (str3 = c2888gi3.f24435b) == null) ? "" : str3, (c2888gi3 == null || (str2 = c2888gi3.f24439f) == null) ? "" : str2, (c2888gi3 == null || (str = c2888gi3.f24437d) == null) ? "" : str, c2888gi3 != null ? c2888gi3.f24441h : false, this.f24156f);
        }
        return new Ua(context, va2, rh2, th2, this, za2, this.f24162i, new WeakReference(this));
    }

    public static final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, byte[] bArr, WatermarkData watermarkData) {
        InterfaceC3028m9 interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "adding overlay to renderview");
        }
        Context context = gestureDetectorOnGestureListenerC2785ci.getContext();
        ck.p.i(context, "getContext(...)");
        FrameLayout frameLayoutA = Zn.a(context, bArr, watermarkData.getAlpha());
        ck.p.j(frameLayoutA, "overlayLayout");
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "renderView");
        if (gestureDetectorOnGestureListenerC2785ci.getParent() != null) {
            ViewParent parent = gestureDetectorOnGestureListenerC2785ci.getParent();
            ck.p.h(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).addView(frameLayoutA, 0);
        }
        gestureDetectorOnGestureListenerC2785ci.getViewableAd().a(frameLayoutA, FriendlyObstructionPurpose.NOT_VISIBLE);
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = gestureDetectorOnGestureListenerC2785ci.f24149c0;
        if (onGlobalLayoutListener != null) {
            gestureDetectorOnGestureListenerC2785ci.getViewTreeObserver().removeOnGlobalLayoutListener(onGlobalLayoutListener);
            gestureDetectorOnGestureListenerC2785ci.f24149c0 = null;
        }
    }

    public final void b(Df df2) {
        ck.p.j(df2, "orientation");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "handle orientationChange " + this + com.ironsource.Z7.f27998r + df2);
        }
        a(Ef.a(df2));
    }

    public final void b(String str, String str2) {
        ck.p.j(str2, "url");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m9).a(str3, "processMediaPlaybackRequest " + this);
        }
        if (this.O0) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m10).b(str4, "Media playback is not allowed after unload! Ignoring request ...");
                return;
            }
            return;
        }
        if (1 != this.f24145b) {
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                String str5 = f24141g1;
                ck.p.i(str5, "TAG");
                ((C3053n9) interfaceC3028m11).b(str5, "Media playback is only supported on full screen ads! Ignoring request ...");
                return;
            }
            return;
        }
        Activity activity = (Activity) this.f24186u.get();
        if (activity == null) {
            InterfaceC3028m9 interfaceC3028m12 = this.f24162i;
            if (interfaceC3028m12 != null) {
                String str6 = f24141g1;
                ck.p.i(str6, "TAG");
                ((C3053n9) interfaceC3028m12).b(str6, "Media playback is  not allowed before it is visible! Ignoring request ...");
            }
            a(str, "Media playback is  not allowed before it is visible! Ignoring request ...", "playVideo");
            return;
        }
        C3280wc c3280wc = this.A;
        if (c3280wc != null) {
            c3280wc.a(str2, activity);
        }
    }

    public final void a(String str, String str2, boolean z10) {
        Activity activity;
        ck.p.j(str, "url");
        ck.p.j(str2, "templateInfoStr");
        try {
            JSONObject jSONObject = new JSONObject(str2);
            InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
            if (interfaceC3028m9 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m9).a(str3, "report - " + getAdType() + " type - sdk - " + Build.VERSION.SDK_INT);
            }
            if (ck.p.e(getAdType(), ImpressionLog.f43647w) && Build.VERSION.SDK_INT >= 29 && (activity = (Activity) this.f24186u.get()) != null) {
                mj.g gVar = E0.f22556a;
                E0.a(activity, this, str, z10, jSONObject, this.Q0);
            } else {
                mj.g gVar2 = E0.f22556a;
                E0.a(this, this, str, z10, jSONObject, this.Q0);
            }
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
            if (interfaceC3028m10 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m10).a(str4, "issue wile reporting ad", e10);
            }
        }
    }

    public static final mj.r b(C2987ki c2987ki) {
        ck.p.j(c2987ki, "it");
        c2987ki.m();
        return mj.r.f64562a;
    }

    public final void b(int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "loadPodAd " + this);
        }
        if (this.I == Hn.VISIBLE && this.f24171m0 != null && !this.M.get()) {
            InterfaceC3268w0 interfaceC3268w0 = this.f24171m0;
            if (interfaceC3268w0 != null) {
                interfaceC3268w0.a(i10, this);
                return;
            }
            return;
        }
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).b(str2, "Cannot load index pod ad as the current ad is not viewable");
        }
        a(false);
    }

    public final void a(MotionEvent motionEvent) {
        C3081oc c3081oc;
        if (this.f24154e && !this.U) {
            this.U = true;
            SparseArray sparseArray = InMobiAdActivity.f22317k;
            f24139e1.getClass();
            JSONObject jSONObjectA = Mh.a("IN_CUSTOM_BROWSER", "onInteraction");
            ck.p.j(jSONObjectA, "jsonObject");
            GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = InMobiAdActivity.f22318l;
            if (gestureDetectorOnGestureListenerC2785ci != null) {
                gestureDetectorOnGestureListenerC2785ci.c(jSONObjectA);
            }
        }
        if (this.f24145b == 1 && (c3081oc = this.f24195y0) != null) {
            c3081oc.a(motionEvent);
        }
        this.f24197z0.onTouchEvent(motionEvent);
    }

    public final void b(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "fireNextAdShowComplete " + this);
        }
        String str2 = "window.imraidview.broadcastEvent('adShowSuccess'," + z10 + ");";
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m10).a(str3, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str2);
    }

    public final void b(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "creativeType " + this + com.ironsource.Z7.f27998r + str);
        }
        this.F0 = str;
    }

    public final void a(AbstractC2836ei abstractC2836ei) {
        WatermarkData watermarkData;
        AdQualityControl adQualityControl;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "initialize " + this);
        }
        int i10 = Build.VERSION.SDK_INT;
        if (ck.p.e(this.S0, "htmlUrl")) {
            getSettings().setMixedContentMode(2);
        }
        N();
        this.f24192x = abstractC2836ei;
        ViewParent parent = getParent();
        this.f24190w = new WeakReference(parent instanceof ViewGroup ? (ViewGroup) parent : null);
        setBackgroundColor(getRenderingConfig().getWebviewBackgroundColor());
        String url = getMraidConfig().getUrl();
        int maxRetries = getMraidConfig().getMaxRetries();
        int retryInterval = getMraidConfig().getRetryInterval();
        long expiry = getMraidConfig().getExpiry();
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        C3131qc c3131qc = new C3131qc(url, maxRetries, retryInterval, expiry, interfaceC3028m10);
        if (url != null) {
            nk.j.d(A9.f22351c, null, null, new C3106pc(c3131qc, null), 3, null);
        } else if (interfaceC3028m10 != null) {
            String str2 = c3131qc.f25172f;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m10).b(str2, "MRAID Js Url provided is invalid.");
        }
        setImportantForAccessibility(2);
        setScrollable(false);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(getAdConfig().getRendering().getEnableDomStorage());
        getSettings().setGeolocationEnabled(true);
        e();
        if (this.f24154e && getAdConfig().getEnableCookiesOnInAppBrowser()) {
            CookieManager cookieManager = CookieManager.getInstance();
            cookieManager.setAcceptCookie(true);
            cookieManager.setAcceptThirdPartyCookies(this, true);
        }
        setWebChromeClient(this.f24150c1);
        if (!this.f24154e) {
            C3253va c3253va = new C3253va(this.f24145b, this);
            InterfaceC3028m9 interfaceC3028m11 = this.f24162i;
            if (interfaceC3028m11 != null) {
                ck.p.j(interfaceC3028m11, "logger");
                c3253va.f25560c = interfaceC3028m11;
            }
            InMobiNetworkBridge.onAddedJavascriptInterface(this, c3253va, "sdkController");
        }
        this.A = new C3280wc(this, this.f24162i);
        this.H0 = new L0(getAdConfig().getAdQuality(), this.f24162i);
        if (i10 >= 29) {
            C2937ii c2937ii = new C2937ii(this.f24162i, this.f24152d0);
            Object value = AbstractC3075o6.f24958c.getValue();
            ck.p.i(value, "getValue(...)");
            setWebViewRenderProcessClient((ExecutorService) value, c2937ii);
        }
        C3069o0 c3069o0 = this.f24168l;
        if (c3069o0 != null && (adQualityControl = c3069o0.f24930n) != null) {
            L0 l10 = this.H0;
            if (l10 == null) {
                ck.p.B("adQualityManager");
                l10 = null;
            }
            l10.getClass();
            ck.p.j(adQualityControl, "adQualityControl");
            l10.a("adQuality session setup");
            if (!l10.f23035a.getEnabled()) {
                l10.a("config kill switch while setup - false. ad quality will skip");
            } else if (l10.f23037c.get()) {
                l10.a("session already started. skip");
            } else {
                l10.a("verifying control flags");
                String beacon = adQualityControl.getBeacon();
                if (beacon != null && beacon.length() == 0) {
                    l10.a("no beacon received. aborting...");
                    nk.l0 l0Var = E0.f22560e;
                    if (l0Var != null) {
                        kotlinx.coroutines.d.c(l0Var, new CancellationException("Shutdown"));
                    }
                    E0.f22560e = null;
                    l10.a("session end - cleanup");
                    l10.f23041g = null;
                    l10.f23040f.clear();
                    l10.f23037c.set(false);
                    l10.f23038d.set(false);
                    l10.a("ad quality session is already in progress. skipping...");
                } else {
                    l10.f23041g = adQualityControl;
                }
            }
        }
        C3069o0 c3069o1 = this.f24168l;
        if (c3069o1 != null && (watermarkData = c3069o1.f24929m) != null) {
            setWatermark(watermarkData);
        }
        C3069o0 c3069o2 = this.f24168l;
        if (c3069o2 != null ? ck.p.e(c3069o2.f24928l, Boolean.TRUE) : false) {
            k();
        }
    }

    public final void d(String str) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "fireDetectAutoRedirectFraud " + this + com.ironsource.Z7.f27998r + str);
        }
        g("window.mraidview.fireRedirectFraudBeacon('" + str + "')");
    }

    public final void b(String str, String str2, String str3) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str4 = f24141g1;
            ck.p.i(str4, "TAG");
            ((C3053n9) interfaceC3028m9).a(str4, "onUserLandingInitialized " + this + " isInAppBrowser: " + this.f24154e);
        }
        g("window.imraid.broadcastEvent('onUserLandingInitialized');");
        if (str2 == null) {
            return;
        }
        a(str2, "broadcastEvent('" + str + "Successful','" + str3 + "');");
    }

    public final void d(JSONObject jSONObject) {
        short s10;
        final String strOptString = jSONObject.optString(IronSourceConstants.EVENTS_ERROR_CODE);
        Object objA = H3.a(new bk.a() { // from class: b7.f6
            @Override // bk.a
            public final Object invoke() {
                return Short.valueOf(GestureDetectorOnGestureListenerC2785ci.l(strOptString));
            }
        });
        if (Result.m3464isSuccessimpl(objA)) {
            short sShortValue = ((Number) objA).shortValue();
            C3037mi c3037mi = this.f24152d0;
            if (c3037mi != null) {
                Map mapA = c3037mi.a();
                switch (sShortValue) {
                    case 101:
                        s10 = 2261;
                        break;
                    case 102:
                        s10 = 2262;
                        break;
                    case 103:
                        s10 = 2263;
                        break;
                    case 104:
                        s10 = 2267;
                        break;
                    case 105:
                        s10 = 2266;
                        break;
                    case 106:
                        s10 = 2265;
                        break;
                    case 107:
                        s10 = 2264;
                        break;
                    default:
                        switch (sShortValue) {
                            case 301:
                                s10 = 2268;
                                break;
                            case 302:
                                s10 = 2269;
                                break;
                            case 303:
                                s10 = 2270;
                                break;
                            case 304:
                                s10 = 2271;
                                break;
                            case 305:
                                s10 = 2272;
                                break;
                            case 306:
                                s10 = 2273;
                                break;
                            case 307:
                                s10 = 2274;
                                break;
                            case 308:
                                s10 = 2275;
                                break;
                            case 309:
                                s10 = 2276;
                                break;
                            case 310:
                                s10 = 2277;
                                break;
                            case 311:
                                s10 = 2278;
                                break;
                            case 312:
                                s10 = 2280;
                                break;
                            case 313:
                                s10 = 2281;
                                break;
                            default:
                                s10 = sShortValue;
                                break;
                        }
                        break;
                }
                mapA.put(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(s10));
                long j10 = c3037mi.f24837c;
                nk.l0 l0Var = AbstractC2940il.f24565a;
                mapA.put("latency", Long.valueOf(SystemClock.elapsedRealtime() - j10));
                Wj wj2 = Wj.f23753a;
                Wj.b("CompanionWebViewLoadFailed", mapA, EnumC2735ak.SDK);
            }
        }
    }

    public final void b(JSONObject jSONObject) {
        ck.p.j(jSONObject, "jsonObject");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onCTLifeCycleEvent " + this);
        }
        g("window.imraid.broadcastEvent('onCTLifeCycleEvent', " + jSONObject + ");");
    }

    public final void j(String str) {
        ck.p.j(str, "url");
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            c3037mi.b();
        }
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "loadUrlInWebView " + this);
        }
        this.P = false;
        if (this.M.get()) {
            return;
        }
        InMobiNetworkBridge.webviewLoadUrl(this, str);
    }

    public final void b(String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "fireLandingPageTracker " + this);
        }
        getListener().a(this, str, map);
    }

    public final void b(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) throws JSONException {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "sourceView");
        ck.p.j(str, "targetId");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "fireLoadWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        C3037mi c3037mi = this.f24152d0;
        jSONObject.put("latency", c3037mi != null ? c3037mi.f24842h : 0L);
        gestureDetectorOnGestureListenerC2785ci.g("window.imraidview.broadcastEvent('webViewLoaded', " + jSONObject + ");");
    }

    public static final void d(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) {
        try {
            if (gestureDetectorOnGestureListenerC2785ci.M.get()) {
                return;
            }
            String str2 = "javascript:try{" + str + "}catch(e){}";
            InterfaceC3028m9 interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
            if (interfaceC3028m9 != null) {
                String str3 = f24141g1;
                ck.p.i(str3, "TAG");
                ((C3053n9) interfaceC3028m9).a(str3, "Injecting javascript");
            }
            gestureDetectorOnGestureListenerC2785ci.c(str2);
        } catch (Exception e10) {
            InterfaceC3028m9 interfaceC3028m10 = gestureDetectorOnGestureListenerC2785ci.f24162i;
            if (interfaceC3028m10 != null) {
                String str4 = f24141g1;
                ck.p.i(str4, "TAG");
                ((C3053n9) interfaceC3028m10).b(str4, "SDK encountered an unexpected error injecting JavaScript in the Ad container; " + e10.getMessage());
            }
        }
    }

    public final void a(RelativeLayout relativeLayout) {
        C3333yf c3333yf;
        ck.p.j(relativeLayout, "adBackgroundView");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            ((C3053n9) interfaceC3028m9).b("HtmlVideoPlayer", "inflateVideoPlayer " + this);
        }
        C3251v8 c3251v8 = this.Y0;
        if (c3251v8 != null) {
            ck.p.j(relativeLayout, "parentView");
            if (c3251v8.f25545g.get()) {
                return;
            }
            InterfaceC3028m9 interfaceC3028m10 = c3251v8.f25541c;
            if (interfaceC3028m10 != null) {
                ((C3053n9) interfaceC3028m10).b("HybridVideoPlayerHandler", "Inflate called");
            }
            if (c3251v8.f25547i && (c3333yf = c3251v8.f25554p) != null) {
                ck.p.j(relativeLayout, "parentView");
                InterfaceC3028m9 interfaceC3028m11 = c3333yf.f25797g;
                if (interfaceC3028m11 != null) {
                    ck.p.i("yf", "TAG");
                    ((C3053n9) interfaceC3028m11).c("yf", "startOmidSession");
                }
                Ae ae2 = c3333yf.f25795e;
                if (ae2 != null) {
                    ck.p.j(relativeLayout, "adView");
                    if (ae2.f24279c == null) {
                        InterfaceC3028m9 interfaceC3028m12 = ae2.f24278b;
                        if (interfaceC3028m12 != null) {
                            ((C3053n9) interfaceC3028m12).a(AbstractC2819e1.f24276f, "Failed to registerAdView. adSession is null");
                        }
                    } else {
                        InterfaceC3028m9 interfaceC3028m13 = ae2.f24278b;
                        if (interfaceC3028m13 != null) {
                            ((C3053n9) interfaceC3028m13).a(AbstractC2819e1.f24276f, "registerAdView");
                        }
                        P4.a(ae2.f24277a, new Y0(ae2, relativeLayout, null));
                    }
                }
                Ae ae3 = c3333yf.f25795e;
                if (ae3 != null) {
                    if (ae3.f24279c == null) {
                        InterfaceC3028m9 interfaceC3028m14 = ae3.f24278b;
                        if (interfaceC3028m14 != null) {
                            ((C3053n9) interfaceC3028m14).a(AbstractC2819e1.f24276f, "Failed to startAdSession. adSession is null");
                        }
                    } else {
                        InterfaceC3028m9 interfaceC3028m15 = ae3.f24278b;
                        if (interfaceC3028m15 != null) {
                            ((C3053n9) interfaceC3028m15).a(AbstractC2819e1.f24276f, "startAdSession");
                        }
                        P4.a(ae3.f24277a, new C2742b1(ae3, null));
                    }
                }
            }
            c3251v8.f25549k.a(relativeLayout);
            c3251v8.f25549k.e();
            c3251v8.f25553o = true;
        }
    }

    public final void a(EnumC3102p8 enumC3102p8, Object obj) {
        if (obj instanceof String) {
            obj = "'" + obj + "'";
        }
        String str = "window.imraid.broadcastEvent('" + enumC3102p8.f25060a + "', " + obj + ");";
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).b(str2, "fireHtmlVideoEvents: " + str);
        }
        g(str);
    }

    public final void a(HashMap map) {
        C3333yf c3333yf;
        Ae ae2;
        ck.p.j(map, "params");
        getListener().a(map);
        C3251v8 c3251v8 = this.Y0;
        if (c3251v8 == null || (c3333yf = c3251v8.f25554p) == null || (ae2 = c3333yf.f25795e) == null) {
            return;
        }
        ae2.a(InteractionType.CLICK);
    }

    public static final mj.r a(JSONObject jSONObject) {
        ck.p.j(jSONObject, "it");
        SparseArray sparseArray = InMobiAdActivity.f22317k;
        ck.p.j(jSONObject, "jsonObject");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = InMobiAdActivity.f22318l;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.c(jSONObject);
        }
        return mj.r.f64562a;
    }

    public static final mj.r a(String str, Map map) {
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        SparseArray sparseArray = InMobiAdActivity.f22317k;
        ck.p.j(str, "trackerName");
        ck.p.j(map, "macros");
        GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci = InMobiAdActivity.f22318l;
        if (gestureDetectorOnGestureListenerC2785ci != null) {
            gestureDetectorOnGestureListenerC2785ci.b(str, map);
        }
        return mj.r.f64562a;
    }

    public final void a(com.inmobi.media.ads.network.common.model.Ad ad2) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "initContextualData " + this);
        }
        this.X0 = new D4(ad2 != null ? ad2.getContextData() : null, this.W);
    }

    public static final mj.r a(C2987ki c2987ki) {
        ck.p.j(c2987ki, "it");
        c2987ki.b();
        return mj.r.f64562a;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final void a(String str) {
        ck.p.j(str, "mraidApi");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "sendFraudBeaconAndTelemetryEvent " + this);
        }
        d(str);
        String adType = getAdType();
        if (adType == null) {
            adType = "banner";
        }
        c(str, adType);
    }

    public final void a(boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireNextAdLoadComplete " + this);
        }
        String str2 = "window.imraidview.broadcastEvent('adLoadSuccess'," + z10 + ");";
        InterfaceC3028m9 interfaceC3028m10 = this.f24162i;
        if (interfaceC3028m10 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m10).c(str3, str2 + " Index: " + getCurrentRenderingPodAdIndex());
        }
        g(str2);
    }

    public final void a(int i10, int i11) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireSizeChanged " + this + " w-" + i10 + " h-" + i11);
        }
        g("window.mraidview.broadcastEvent('sizeChange'," + i10 + StringUtils.COMMA + i11 + ");");
    }

    public final void a(int i10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "fireOrientationChange " + this + com.ironsource.Z7.f27998r + i10);
        }
        g("window.imraid.broadcastEvent('orientationChange','" + i10 + "');");
    }

    public final void a(String str, JSONObject jSONObject) {
        ck.p.j(jSONObject, "message");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "fireError " + this + " - " + jSONObject);
        }
        g("window.imraidview.broadcastEvent('error','" + jSONObject + "', '" + str + "');");
        d(jSONObject);
    }

    public final void a(String str, String str2, String str3) {
        ck.p.j(str2, "message");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str4 = f24141g1;
            ck.p.i(str4, "TAG");
            ((C3053n9) interfaceC3028m9).a(str4, "fireError " + this + " - " + str2 + " - " + str3);
        }
        if (str == null || str3 == null) {
            return;
        }
        a(str, "broadcastEvent('error',\"" + str2 + "\", \"" + str3 + "\")");
    }

    public final void a(String str, String str2) {
        ck.p.j(str2, "callback");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str3 = f24141g1;
            ck.p.i(str3, "TAG");
            ((C3053n9) interfaceC3028m9).a(str3, "fireJavaScriptCallback " + this);
        }
        if (str == null) {
            return;
        }
        g(str + "." + str2);
    }

    public final void a(String str, HashMap map) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).a(str2, "processTelemetryEvent " + this);
        }
        getListener().a(str, map);
    }

    public void a(Ff ff2) {
        ck.p.j(ff2, "orientationProperties");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "setOrientationProperties " + this);
        }
        this.G0 = ff2;
        Y();
    }

    public static final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci) {
        gestureDetectorOnGestureListenerC2785ci.getListener().k(gestureDetectorOnGestureListenerC2785ci);
    }

    @Override // com.inmobi.media.Gf
    public final void a(Df df2) {
        ck.p.j(df2, "orientation");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "onOrientationUpdate " + this);
        }
    }

    public final void a(Df df2, wo woVar) {
        JSONObject jSONObjectA;
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "fireOnSafeAreaChanged " + this);
        }
        ck.p.j(woVar, "<this>");
        ck.p.j(df2, "orientation");
        try {
            woVar.getClass();
            ck.p.j(df2, "orientation");
            vo voVar = (vo) woVar.f25675a.get(df2);
            if (voVar != null) {
                jSONObjectA = voVar.a();
                jSONObjectA.put("orientation", Ef.a(df2));
            } else {
                jSONObjectA = null;
            }
        } catch (Exception unused) {
        }
        g("window.imraid.broadcastEvent('onSafeAreaChange', " + jSONObjectA + ")");
    }

    public final boolean a(JsResult jsResult) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "shouldRenderPopup " + this);
        }
        if (getRenderingConfig().shouldRenderPopup()) {
            return true;
        }
        jsResult.cancel();
        w();
        return false;
    }

    @Override // com.inmobi.media.InterfaceC3061nh
    public final boolean a() {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "hasUserInteracted " + getViewTouchTimestamp() + com.ironsource.Z7.f27998r + getRenderingConfig().getUserTouchResetTime());
        }
        if (!getRenderingConfig().getAutoRedirectionEnforcement() || this.f24169l0) {
            return true;
        }
        return getViewTouchTimestamp() != -1 && SystemClock.elapsedRealtime() - getViewTouchTimestamp() < getRenderingConfig().getUserTouchResetTime();
    }

    public final void a(Exception exc) {
        ck.p.j(exc, "e");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).a(str, "handlePingException " + this, exc);
        }
        InterfaceC2757bg interfaceC2757bg = this.f24178q;
        Z5[] z5Arr = Z5.f23890a;
        ((Yh) interfaceC2757bg).a("", -107, "Ping exception occurred", System.currentTimeMillis(), 0);
        mj.g gVar = P9.f23321a;
        AbstractC2929i9.a(exc);
    }

    public static final mj.r a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, boolean z10) {
        InterfaceC3028m9 interfaceC3028m9 = gestureDetectorOnGestureListenerC2785ci.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "onRenderProcessGone");
        }
        gestureDetectorOnGestureListenerC2785ci.getListener().a(gestureDetectorOnGestureListenerC2785ci, z10);
        return mj.r.f64562a;
    }

    public final void a(boolean z10, short s10) {
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str = f24141g1;
            ck.p.i(str, "TAG");
            ((C3053n9) interfaceC3028m9).c(str, "fireRenderProcessGoneTelemetry");
        }
        C3037mi c3037mi = this.f24152d0;
        if (c3037mi != null) {
            c3037mi.a(z10, s10);
        }
    }

    public final void a(GestureDetectorOnGestureListenerC2785ci gestureDetectorOnGestureListenerC2785ci, String str) throws JSONException {
        ck.p.j(gestureDetectorOnGestureListenerC2785ci, "sourceView");
        ck.p.j(str, "targetId");
        InterfaceC3028m9 interfaceC3028m9 = this.f24162i;
        if (interfaceC3028m9 != null) {
            String str2 = f24141g1;
            ck.p.i(str2, "TAG");
            ((C3053n9) interfaceC3028m9).c(str2, "fireDestroyWebViewSuccess " + this);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", str);
        gestureDetectorOnGestureListenerC2785ci.g("window.imraidview.broadcastEvent('destroyWebView'," + jSONObject + ");");
    }
}
