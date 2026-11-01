package com.bytedance.sdk.openadsdk.zin;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class pno {
    private int ajl;

    /* JADX INFO: renamed from: ak, reason: collision with root package name */
    private boolean f13628ak;

    /* JADX INFO: renamed from: an, reason: collision with root package name */
    private final String f13629an;
    private String baa;
    public final String bly;
    public long bs;
    private int byv;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public int f13630cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public final String f13631cf;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    public String f13632cj;
    public boolean coz;
    private int cu;
    private int eay;
    private lh ehk;
    private int eot;
    public int euf;
    public long ex;
    public ouw ey;
    public JSONObject fak;

    /* JADX INFO: renamed from: fg, reason: collision with root package name */
    private String f13633fg;
    public final Handler fkw;

    /* JADX INFO: renamed from: fn, reason: collision with root package name */
    private int f13634fn;
    public WeakReference<View> fqk;
    public long fvf;
    public String fwd;

    /* JADX INFO: renamed from: gh, reason: collision with root package name */
    private final String f13635gh;
    private boolean hsa;
    public le hun;
    private String ixm;
    public int jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    public String f13636jg;
    public long jqy;

    @Nullable
    public WebView jvy;
    private String kfa;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f13637ki;

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    public JSONObject f13638kn;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public boolean f13639ko;
    private int kq;
    public int ksc;
    private int lai;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public vt f13640le;
    private boolean lgp;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public Runnable f13641lh;

    /* JADX INFO: renamed from: ln, reason: collision with root package name */
    private int f13642ln;
    private boolean lna;
    public JSONObject lso;
    public volatile boolean lvd;
    public boolean mq;
    private long ms;
    public String mt;
    private int mu;
    private long mwe;
    public final String mwh;
    public boolean myk;
    private int nbp;

    /* JADX INFO: renamed from: ng, reason: collision with root package name */
    public String f13643ng;
    public boolean njr;

    /* JADX INFO: renamed from: nn, reason: collision with root package name */
    private float f13644nn;
    private Set<String> npr;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public int f13645od;
    private Runnable odc;
    public int osn;
    public final Handler ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public boolean f13646pd;
    public boolean pno;
    public String pv;
    public long qbp;
    private String qld;
    private int qni;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public boolean f13647ra;

    /* JADX INFO: renamed from: rh, reason: collision with root package name */
    private String f13648rh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public boolean f13649rn;
    public Context rrs;
    public final String ryl;

    /* JADX INFO: renamed from: sd, reason: collision with root package name */
    public volatile boolean f13650sd;

    /* JADX INFO: renamed from: sm, reason: collision with root package name */
    private int f13651sm;
    private int smu;
    private boolean swm;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public long f13652tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f13653th;
    public final String tlj;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public String f13654ub;
    public String ucs;

    /* JADX INFO: renamed from: uj, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f13655uj;
    public int uoy;
    public String uq;
    public com.bytedance.sdk.openadsdk.zin.ouw ux;

    /* JADX INFO: renamed from: vf, reason: collision with root package name */
    private int f13656vf;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    public String f13657vh;

    /* JADX INFO: renamed from: vi, reason: collision with root package name */
    private boolean f13658vi;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public long f13659vm;
    public long vpp;
    private String vrp;
    public Runnable vt;
    private int wbf;
    public Map<String, String> wp;
    public boolean xdk;

    /* JADX INFO: renamed from: xn, reason: collision with root package name */
    private String f13660xn;
    private int xne;
    private int xwt;
    private Runnable ycd;
    public float yhj;
    public JSONObject yib;
    private String yiz;
    public Runnable yu;
    private long yw;
    public long zih;
    public long zin;
    private boolean zjp;
    private float zjq;
    private String zrz;
    private List<JSONObject> zu;
    public boolean zvq;

    public enum ouw {
        LAND_PAGE,
        FEED,
        OTHER,
        FEED_AWEME
    }

    public pno(Context context, WebView webView, lh lhVar, com.bytedance.sdk.openadsdk.zin.ouw ouwVar, ouw ouwVar2) {
        this.f13629an = "playable_stuck_check_ping";
        this.f13635gh = "playable_apply_media_permission_callback";
        this.ouw = new Handler(Looper.getMainLooper());
        this.fkw = new Handler(Looper.getMainLooper());
        this.f13647ra = true;
        this.pno = true;
        this.f13658vi = true;
        this.bly = "PL_sdk_playable_global_viewable";
        this.tlj = "PL_sdk_page_screen_blank";
        this.f13631cf = "PL_sdk_playable_destroy_analyze_summary";
        this.ryl = "PL_sdk_playable_hardware_dialog_cancel";
        this.mwh = "PL_sdk_playable_hardware_dialog_setting";
        this.npr = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f13660xn = null;
        this.f13636jg = "embeded_ad";
        this.f13639ko = true;
        this.f13649rn = true;
        this.zjp = false;
        this.kfa = "";
        this.zih = 10L;
        this.f13659vm = 10L;
        this.f13653th = 700;
        this.yw = 0L;
        this.ms = 0L;
        this.mwe = -1L;
        this.qbp = -1L;
        this.zin = -1L;
        this.vpp = -1L;
        this.jqy = -1L;
        this.ex = -1L;
        this.f13652tc = -1L;
        this.qld = "";
        this.yiz = "";
        this.ixm = "";
        this.zrz = "";
        this.ksc = 0;
        this.jae = 0;
        this.lgp = false;
        this.eay = 0;
        this.f13645od = -1;
        this.wbf = 0;
        this.f13642ln = 0;
        this.f13630cd = 0;
        this.uq = null;
        this.f13646pd = false;
        this.qni = 0;
        this.smu = 0;
        this.f13634fn = 0;
        this.byv = 0;
        this.fvf = 0L;
        this.bs = 0L;
        this.uoy = -2;
        this.osn = 0;
        this.f13637ki = 0;
        this.xwt = 0;
        this.lso = new JSONObject();
        this.wp = new HashMap();
        this.f13638kn = new JSONObject();
        this.baa = "";
        this.f13644nn = 0.0f;
        this.zjq = 0.0f;
        this.swm = false;
        this.f13628ak = false;
        this.lna = false;
        this.zu = new ArrayList();
        this.coz = true;
        this.lvd = true;
        this.f13650sd = true;
        this.f13655uj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.zin.pno.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                try {
                    View view = pno.this.fqk.get();
                    if (view == null) {
                        return;
                    }
                    pno.this.ouw(view);
                } catch (Throwable th2) {
                    ra.ouw("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.euf = -1;
        this.uoy = 0;
        this.ey = ouwVar2;
        this.jvy = webView;
        if (webView != null) {
            try {
                webView.removeJavascriptInterface("searchBoxJavaBridge_");
                webView.removeJavascriptInterface("accessibility");
                webView.removeJavascriptInterface("accessibilityTraversal");
            } catch (Throwable th2) {
                ra.ouw("WebViewSettings", "removeJavascriptInterfacesSafe error", th2);
            }
            WebSettings settings = webView.getSettings();
            try {
                settings.setMediaPlaybackRequiresUserGesture(false);
            } catch (Throwable th3) {
                ra.ouw("WebViewSettings", "allowMediaPlayWithoutUserGesture error", th3);
            }
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(true);
                } catch (Throwable th4) {
                    ra.ouw("WebViewSettings", "setJavaScriptEnabled error", th4);
                }
                try {
                    settings.setSupportZoom(false);
                } catch (Throwable th5) {
                    ra.ouw("WebViewSettings", "setSupportZoom error", th5);
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(true);
                settings.setDomStorageEnabled(true);
                settings.setAllowFileAccess(false);
                settings.setBlockNetworkImage(false);
                settings.setDisplayZoomControls(false);
                int i10 = Build.VERSION.SDK_INT;
                settings.setAllowFileAccessFromFileURLs(false);
                settings.setAllowUniversalAccessFromFileURLs(false);
                settings.setSavePassword(false);
                boolean z10 = i10 >= 28;
                try {
                    if (z10) {
                        if (z10) {
                            webView.setLayerType(2, null);
                        }
                        webView.getSettings().setMixedContentMode(0);
                    } else {
                        webView.setLayerType(0, null);
                    }
                } catch (Throwable th6) {
                    ra.ouw("WebViewSettings", "setLayerType error", th6);
                }
                webView.getSettings().setMixedContentMode(0);
            }
        }
        if (webView != null) {
            try {
                this.fqk = new WeakReference<>(webView);
                ouw(webView);
                webView.getViewTreeObserver().addOnGlobalLayoutListener(this.f13655uj);
            } catch (Throwable th7) {
                ra.ouw("PlayablePlugin", "setViewForScreenSize error", th7);
            }
        }
        ouw(context, lhVar, ouwVar);
    }

    public static JSONObject fkw() {
        boolean zOuw = true;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                fkw.ouw();
            } else {
                fkw.ouw();
                zOuw = fkw.ouw();
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isHasRead", false);
            jSONObject.put("isHasWrite", zOuw);
            jSONObject.put("result", false);
            return jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public static JSONObject lh() {
        try {
            fkw.ouw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", false);
            return jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    private void ouw(Context context, lh lhVar, com.bytedance.sdk.openadsdk.zin.ouw ouwVar) {
        this.f13660xn = UUID.randomUUID().toString();
        this.rrs = context;
        this.ux = ouwVar;
        this.ehk = lhVar;
        bly.ouw(ouwVar);
        this.hun = new le(this);
        rn();
        if (this.jvy == null) {
            this.euf = 4;
            this.ouw.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.4
                @Override // java.lang.Runnable
                public final void run() {
                    pno.this.ouw(5, "webview is null");
                }
            });
        }
    }

    private void vm() {
        this.f13637ki = 0;
        this.xwt = 0;
        this.yhj = 0.0f;
        this.eot = 0;
        this.mu = 0;
        this.xne = 0;
        this.lai = 0;
        this.ajl = 0;
        this.f13651sm = 0;
        this.f13656vf = 0;
        this.kq = 0;
        this.nbp = 0;
        this.cu = 0;
    }

    public final pno vt(String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("playable_style", str);
            this.yib = jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "setPlayableStyle error", th2);
        }
        return this;
    }

    private void rn() {
        this.f13640le = new vt(this, this.f13653th);
        this.vt = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.5
            @Override // java.lang.Runnable
            public final void run() {
                pno pnoVar = pno.this;
                if (pnoVar.f13639ko) {
                    pnoVar.f13639ko = false;
                    pnoVar.ouw.removeCallbacks(pnoVar.f13641lh);
                    pno.this.ouw(2, "ContainerLoadTimeOut");
                }
            }
        };
        this.f13641lh = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.6
            @Override // java.lang.Runnable
            public final void run() {
                pno pnoVar = pno.this;
                if (pnoVar.f13639ko) {
                    pnoVar.f13639ko = false;
                    pnoVar.lvd = false;
                    pno pnoVar2 = pno.this;
                    pnoVar2.ouw.removeCallbacks(pnoVar2.vt);
                    pno.this.ouw(3, "JSSDKLoadTimeOut");
                }
            }
        };
        this.ycd = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.7
            @Override // java.lang.Runnable
            public final void run() {
                ra.ouw("mCheckJSRunnable", " ====Scheduled Task=== " + System.currentTimeMillis());
                WebView webView = pno.this.jvy;
                if (webView != null) {
                    webView.evaluateJavascript("javascript:typeof playable_callJS === 'function' && playable_callJS()", new ValueCallback<String>() { // from class: com.bytedance.sdk.openadsdk.zin.pno.7.1
                        @Override // android.webkit.ValueCallback
                        public final /* synthetic */ void onReceiveValue(String str) {
                            vt vtVar = pno.this.f13640le;
                            if (vtVar != null) {
                                vtVar.f13662lh = System.currentTimeMillis();
                            }
                        }
                    });
                }
                Handler handler = pno.this.fkw;
                if (handler != null) {
                    handler.postDelayed(this, 500L);
                }
            }
        };
        this.odc = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.8
            @Override // java.lang.Runnable
            public final void run() {
                ra.ouw("mCheckJSRunnable", " ====Lynx detect scheduled tasks=== " + System.currentTimeMillis());
                pno.this.ouw("playable_stuck_check_ping", new JSONObject());
                Handler handler = pno.this.fkw;
                if (handler != null) {
                    handler.postDelayed(this, 500L);
                }
            }
        };
        this.yu = new Runnable() { // from class: com.bytedance.sdk.openadsdk.zin.pno.9
            @Override // java.lang.Runnable
            public final void run() {
                pno pnoVar = pno.this;
                long j10 = pnoVar.bs;
                if (j10 <= 0) {
                    pnoVar.vt(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                if (j10 - pnoVar.fvf > pnoVar.f13653th) {
                    pnoVar.vt(1, "Clicking on the hot zone causes the program to freeze.");
                    return;
                }
                pnoVar.ryl();
                pno pnoVar2 = pno.this;
                pnoVar2.fvf = 0L;
                pnoVar2.bs = 0L;
            }
        };
    }

    private void zih() {
        Runnable runnable;
        Runnable runnable2;
        this.f13640le.f13662lh = System.currentTimeMillis();
        Handler handler = this.fkw;
        if (handler != null) {
            int i10 = this.uoy;
            if (i10 == 0 && (runnable2 = this.ycd) != null) {
                handler.post(runnable2);
            } else if ((i10 == 1 || i10 == 2) && (runnable = this.odc) != null) {
                handler.post(runnable);
            }
            this.f13640le.ouw();
        }
    }

    public final void bly() {
        int i10;
        int i11 = this.uoy;
        if (i11 == 0 || i11 == 1 || i11 == 2) {
            if (this.lvd) {
                this.ouw.postDelayed(this.vt, this.zih * 1000);
            }
            if ((this.f13650sd && ouw(this.ucs)) || (i10 = this.uoy) == 1 || i10 == 2) {
                this.ouw.postDelayed(this.f13641lh, this.f13659vm * 1000);
            }
        }
    }

    public final void cf() {
        String str;
        if (this.f13638kn == null || (str = this.ucs) == null || str.contains("/cid_")) {
            return;
        }
        String strOptString = this.f13638kn.optString("cid");
        if (TextUtils.isEmpty(strOptString)) {
            return;
        }
        String host = Uri.parse(this.ucs).getHost();
        if (TextUtils.isEmpty(host)) {
            this.ucs += "/cid_" + strOptString;
            return;
        }
        this.ucs = this.ucs.replace(host, host + "/cid_" + strOptString);
    }

    public final void jg() {
        if (this.lna) {
            return;
        }
        this.lna = true;
        this.ms = 0L;
        this.pno = true;
        vm();
        try {
            View view = this.fqk.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this.f13655uj);
            }
        } catch (Throwable unused) {
        }
        try {
            le.lh();
        } catch (Throwable unused2) {
        }
        try {
            vt vtVar = this.f13640le;
            if (vtVar != null) {
                vtVar.vt();
                this.f13640le = null;
            }
            Handler handler = this.fkw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            ra.ouw("Playable_CrashMonitor", "crash -- ".concat(String.valueOf(th2)));
        }
        try {
            if (!TextUtils.isEmpty(this.ucs)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("playable_all_times", this.ksc);
                jSONObject.put("playable_hit_times", this.jae);
                int i10 = this.ksc;
                if (i10 > 0) {
                    jSONObject.put("playable_hit_ratio", ((double) this.jae) / (((double) i10) * 1.0d));
                } else {
                    jSONObject.put("playable_hit_ratio", 0);
                }
                vt("PL_sdk_preload_times", jSONObject);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (!TextUtils.isEmpty(this.ucs)) {
                if (this.mwe != -1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - this.mwe;
                    ra.ouw("PlayablePlugin", "playable show time +".concat(String.valueOf(jCurrentTimeMillis)));
                    this.yw += jCurrentTimeMillis;
                    this.mwe = -1L;
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("playable_user_play_duration", this.yw);
                vt("PL_sdk_user_play_duration", jSONObject2);
            }
        } catch (Throwable unused4) {
        }
        this.lvd = false;
        this.f13650sd = false;
        this.ouw.removeCallbacks(this.vt);
        this.ouw.removeCallbacks(this.f13641lh);
        this.ouw.removeCallbacksAndMessages(null);
    }

    public final int ko() {
        return (this.qbp == -1 || !this.zvq) ? 1 : 2;
    }

    public final JSONObject le() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("scene_type", this.ey.ordinal());
            jSONObject.put("safe_area_top_height", this.f13644nn);
            jSONObject.put("safe_area_bottom_height", this.zjq);
            jSONObject.put("playable_enter_from", this.f13642ln);
            jSONObject.put("playable_retry_count", this.wbf);
            jSONObject.put("playable_card_session", this.qld);
            jSONObject.put("playable_video_session", this.yiz);
            jSONObject.put("playable_network_type", ra());
            jSONObject.put("aweme_id", this.zrz);
            return jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "playableInfo error", th2);
            return new JSONObject();
        }
    }

    public final void mwh() {
        try {
            vt vtVar = this.f13640le;
            if (vtVar != null) {
                vtVar.vt();
            }
            Handler handler = this.fkw;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
        } catch (Throwable th2) {
            ra.ouw("Playable_CrashMonitor", "The stuttering detection has been paused due to a crash.-- ".concat(String.valueOf(th2)));
        }
    }

    public final JSONObject pno() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("devicePixelRatio", this.yhj);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", this.eot);
            jSONObject2.put("height", this.mu);
            jSONObject.put("screen", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put(VastAttributes.HORIZONTAL_POSITION, this.lai);
            jSONObject3.put(VastAttributes.VERTICAL_POSITION, this.xne);
            jSONObject3.put("width", this.ajl);
            jSONObject3.put("height", this.f13651sm);
            jSONObject.put(C3426d4.i.K, jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put(VastAttributes.HORIZONTAL_POSITION, this.kq);
            jSONObject4.put(VastAttributes.VERTICAL_POSITION, this.f13656vf);
            jSONObject4.put("width", this.nbp);
            jSONObject4.put("height", this.cu);
            jSONObject.put(VastAttributes.VISIBLE, jSONObject4);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "getViewport error", th2);
        }
        return jSONObject;
    }

    public final String ra() {
        com.bytedance.sdk.openadsdk.zin.ouw ouwVar;
        if (TextUtils.isEmpty(this.ixm) && (ouwVar = this.ux) != null) {
            this.ixm = ouwVar.ouw().toString();
        }
        return this.ixm;
    }

    public final void ryl() {
        if (this.f13649rn) {
            this.ex = System.currentTimeMillis();
            if (this.ey == ouw.FEED_AWEME) {
                if (this.zvq && this.osn == 3) {
                    vt vtVar = this.f13640le;
                    if (vtVar != null && vtVar.lh()) {
                        zih();
                        return;
                    } else {
                        if (this.f13640le == null) {
                            this.f13640le = new vt(this, this.f13653th);
                            zih();
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            if (this.zvq && this.osn == 2) {
                vt vtVar2 = this.f13640le;
                if (vtVar2 != null && vtVar2.lh()) {
                    zih();
                } else if (this.f13640le == null) {
                    this.f13640le = new vt(this, this.f13653th);
                    zih();
                }
            }
        }
    }

    public final String tlj() {
        String queryParameter;
        if (TextUtils.isEmpty(this.f13633fg) && !TextUtils.isEmpty(this.baa)) {
            Uri uri = Uri.parse(this.baa);
            String host = uri.getHost();
            String queryParameter2 = "";
            if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                queryParameter2 = uri.getQueryParameter("surl");
                queryParameter = uri.getQueryParameter("playable_hash");
            } else {
                queryParameter = "";
            }
            Uri.Builder builderAppendQueryParameter = new Uri.Builder().scheme(uri.getScheme()).authority(host).appendQueryParameter("surl", queryParameter2);
            if (!TextUtils.isEmpty(queryParameter)) {
                builderAppendQueryParameter.appendQueryParameter("playable_hash", queryParameter);
            }
            this.f13633fg = builderAppendQueryParameter.toString();
        }
        return this.f13633fg;
    }

    public static JSONObject yu() {
        try {
            fkw.ouw();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("result", false);
            return jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "getCameraPermission error", th2);
            return new JSONObject();
        }
    }

    public final pno vt(boolean z10) {
        if (this.euf == -1 || this.zvq == z10) {
            return this;
        }
        this.zvq = z10;
        JSONObject jSONObject = new JSONObject();
        try {
            if (!this.zvq) {
                jSONObject.put("playable_background_show_type", this.smu);
            }
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        vt(this.zvq ? "PL_sdk_viewable_true" : "PL_sdk_viewable_false", jSONObject);
        if (this.qbp == -1 && this.zvq) {
            this.qbp = System.currentTimeMillis();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("render_type", this.euf == 1 ? 1 : 2);
                int i10 = this.euf;
                if (i10 != -1) {
                    jSONObject2.put("webview_state", i10);
                }
            } catch (JSONException unused) {
            }
            vt("PL_sdk_page_show", jSONObject2);
        }
        if (this.qbp != -1 && !this.zvq && !this.swm) {
            this.swm = true;
        }
        if (this.zvq) {
            this.mwe = System.currentTimeMillis();
        } else if (this.mwe != -1) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.mwe;
            ra.ouw("PlayablePlugin", "playable show time +".concat(String.valueOf(jCurrentTimeMillis)));
            this.yw += jCurrentTimeMillis;
            this.mwe = -1L;
        }
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("viewStatus", this.zvq);
            ouw(C3426d4.h.V, jSONObject3);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "setViewable error", th2);
        }
        if (this.zvq) {
            ryl();
        } else {
            mwh();
        }
        return this;
    }

    public final pno lh(String str) {
        int iIndexOf;
        String strDecode;
        this.baa = str;
        try {
            Uri uri = Uri.parse(str);
            String scheme = uri.getScheme();
            if (!"http".equalsIgnoreCase(scheme) && !"https".equalsIgnoreCase(scheme)) {
                String host = uri.getHost();
                if (!C3426d4.i.K.equalsIgnoreCase(host) && (host == null || !host.contains(C3426d4.i.K))) {
                    if ("lynxview".equalsIgnoreCase(host) || (host != null && host.contains("lynxview"))) {
                        if (this.uoy == -1) {
                            this.uoy = 2;
                        } else {
                            this.uoy = 1;
                        }
                    }
                } else {
                    this.uoy = 0;
                    String queryParameter = uri.getQueryParameter("url");
                    if (!TextUtils.isEmpty(queryParameter) && (strDecode = Uri.decode(queryParameter)) != null) {
                        int iIndexOf2 = strDecode.indexOf("?");
                        str = iIndexOf2 != -1 ? strDecode.substring(0, iIndexOf2) : strDecode;
                    }
                }
            } else {
                this.uoy = 0;
                if (str != null && (iIndexOf = str.indexOf("?")) != -1) {
                    str = str.substring(0, iIndexOf);
                }
            }
        } catch (Throwable unused) {
        }
        this.ucs = str;
        return this;
    }

    public static boolean ouw(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("/union-fe/playable/") || str.contains("/union-fe-sg/playable/") || str.contains("/union-fe-i18n/playable/");
    }

    public final void ouw(View view) {
        if (view == null) {
            return;
        }
        try {
            if (this.f13637ki == view.getWidth() && this.xwt == view.getHeight()) {
                return;
            }
            this.f13637ki = view.getWidth();
            this.xwt = view.getHeight();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("width", this.f13637ki);
            jSONObject.put("height", this.xwt);
            ouw("resize", jSONObject);
            this.lso = jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "resetViewDataJsonByView error", th2);
        }
    }

    public final pno ouw(boolean z10) {
        this.xdk = z10;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", this.xdk);
            ouw("volumeChange", jSONObject);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "setIsMute error", th2);
        }
        return this;
    }

    public final pno ouw() {
        this.hsa = true;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.hsa);
            ouw("change_playable_click", jSONObject);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "setPlayableClick error", th2);
        }
        return this;
    }

    public final void ouw(String str, JSONObject jSONObject) {
        if (this.mq) {
            if (ra.ouw()) {
                ra.ouw("PlayablePlugin", "CALL JS [" + str + "] " + jSONObject.toString() + " cancelled, for backup view has show");
                return;
            }
            return;
        }
        if (ra.ouw()) {
            ra.ouw("PlayablePlugin", "CALL JS [" + str + "] " + jSONObject.toString());
        }
        lh lhVar = this.ehk;
        if (lhVar != null) {
            lhVar.ouw(str, jSONObject);
        }
    }

    public final JSONObject vt() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("send_click", this.hsa);
            return jSONObject;
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "getPlayableClickStatus error", th2);
            return new JSONObject();
        }
    }

    public final void ouw(String str, String str2) {
        Bitmap bitmapOuw;
        if (TextUtils.isEmpty(str2) || (bitmapOuw = fkw.ouw(str2)) == null) {
            return;
        }
        MediaStore.Images.Media.insertImage(this.rrs.getContentResolver(), bitmapOuw, str, "");
    }

    public final void vt(JSONObject jSONObject) {
        if (jSONObject != null) {
            boolean zOptBoolean = jSONObject.optBoolean("success", true);
            if (zOptBoolean) {
                this.osn = 3;
                ryl();
            } else {
                this.osn = -2;
            }
            if (zOptBoolean || !this.f13639ko) {
                return;
            }
            this.f13639ko = false;
            this.lvd = false;
            this.f13650sd = false;
            this.ouw.removeCallbacks(this.vt);
            this.ouw.removeCallbacks(this.f13641lh);
            ouw(4, "CaseRenderFail");
        }
    }

    public final JSONObject ouw(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new JSONObject();
        }
        int iOptInt = jSONObject.optInt("type", 0);
        JSONObject jSONObject2 = new JSONObject();
        try {
            if (iOptInt == 1) {
                jSONObject2.put("result", fkw.ouw(this.rrs, "android.permission.RECORD_AUDIO"));
            } else {
                if (iOptInt != 2) {
                    if (iOptInt == 3) {
                        jSONObject2.put("result", fkw.ouw(this.rrs));
                    }
                    return jSONObject2;
                }
                jSONObject2.put("result", fkw.ouw(this.rrs, "android.permission.CAMERA"));
            }
        } catch (JSONException unused) {
        }
        return jSONObject2;
    }

    private void ouw(int i10) {
        com.bytedance.sdk.openadsdk.zin.ouw ouwVar = this.ux;
        if (ouwVar != null) {
            ouwVar.ouw(i10);
        }
    }

    public final void ouw(int i10, String str) {
        mwh();
        ouw(i10);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "reportRenderFatal error", th2);
        }
        vt("PL_sdk_global_faild", jSONObject);
    }

    public final void vt(int i10, String str) {
        ra.ouw("Playable_CrashMonitor", "-- Detected that the page is stuck for more than 2s and needs to be reported ".concat(String.valueOf(i10)));
        this.f13645od = i10;
        if (this.fak == null) {
            this.fak = new JSONObject();
        }
        try {
            this.fak.put("playable_stuck_type", i10);
            this.fak.put("playable_stuck_reason", str);
            if (this.ex > 0) {
                this.fak.put("playable_stuck_duration", System.currentTimeMillis() - this.ex);
            } else {
                this.fak.put("playable_stuck_duration", 0L);
            }
        } catch (Throwable unused) {
        }
        vt("PL_sdk_page_stuck", this.fak);
        mwh();
        if (this.ux == null || i10 != 2) {
            return;
        }
        this.fak = new JSONObject();
    }

    public final void ouw(int i10, String str, String str2) {
        this.osn = -1;
        this.f13657vh = str2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("playable_code", i10);
            jSONObject.put("playable_msg", str);
            jSONObject.put("playable_fail_url", str2);
            jSONObject.put("playable_has_show", ko());
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "onWebReceivedError error", th2);
        }
        vt("PL_sdk_html_load_error", jSONObject);
        if (this.f13639ko) {
            this.f13639ko = false;
            this.lvd = false;
            this.f13650sd = false;
            this.ouw.removeCallbacks(this.vt);
            this.ouw.removeCallbacks(this.f13641lh);
            ouw(1, "ContainerLoadFail");
        }
    }

    public final String vt(String str, String str2) {
        String str3 = String.format("rubeex://playable-minigamelite?id=%1s&schema=%2s", str, Uri.encode(str2));
        this.ucs = str3;
        return str3;
    }

    public final void vt(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            if (!this.lgp && this.jae > 0) {
                this.lgp = true;
            }
            if ("PL_sdk_html_load_start".equals(str) || "PL_sdk_html_load_finish".equals(str) || "PL_sdk_html_load_error".equals(str)) {
                jSONObject.put("usecache", this.njr ? 1 : 0);
            }
            jSONObject.put("playable_event", str);
            jSONObject.put("playable_ts", System.currentTimeMillis());
            jSONObject.put("playable_viewable", this.zvq);
            jSONObject.put("playable_session_id", this.f13660xn);
            int i10 = this.uoy;
            if (i10 == 0) {
                if (this.ey != ouw.LAND_PAGE && !ouw(this.ucs)) {
                    cf();
                }
                jSONObject.put("playable_url", this.ucs);
            } else if (i10 == 3 || i10 == 4) {
                jSONObject.put("playable_url", vt(this.f13643ng, this.fwd));
            } else if (i10 == 1 || i10 == 2) {
                jSONObject.put("playable_url", tlj());
            }
            jSONObject.put("playable_full_url", this.baa);
            jSONObject.put("playable_replay_count", this.eay);
            jSONObject.put("playable_is_prerender", this.myk);
            jSONObject.put("playable_is_preload", this.lgp);
            jSONObject.put("playable_render_type", this.uoy);
            jSONObject.put("playable_scenes_type", this.ey.ordinal());
            String str2 = "";
            jSONObject.put("playable_gecko_key", TextUtils.isEmpty(this.f13648rh) ? "" : this.f13648rh);
            if (!TextUtils.isEmpty(this.vrp)) {
                str2 = this.vrp;
            }
            jSONObject.put("playable_gecko_channel", str2);
            jSONObject.put("playable_sdk_version", "6.6.0");
            jSONObject.put("playable_minigamelite_id", this.f13643ng);
            jSONObject.put("playable_minigamelite_schema", this.fwd);
            jSONObject.put("playable_is_debug", this.f13628ak);
            jSONObject.put("playable_retry_count", this.wbf);
            jSONObject.put("playable_enter_from", this.f13642ln);
            jSONObject.put("playable_sequence", this.f13630cd);
            jSONObject.put("playable_current_section", this.uq);
            jSONObject.put("is_playable_finish", this.f13646pd);
            jSONObject.put("playable_card_session", this.qld);
            jSONObject.put("playable_video_session", this.yiz);
            jSONObject.put("playable_network_type", ra());
            jSONObject.put("playable_lynx_version", this.kfa);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("adExtraData", jSONObject);
            jSONObject2.put("tag", this.f13636jg);
            jSONObject2.put("nt", 4);
            jSONObject2.put("category", "umeng");
            jSONObject2.put("is_ad_event", "1");
            jSONObject2.put("refer", "playable");
            jSONObject2.put("value", this.f13638kn.opt("cid"));
            jSONObject2.put("log_extra", this.f13638kn.opt("log_extra"));
            int i11 = this.uoy;
            if (i11 != -1 && i11 != -2) {
                if (this.ux != null) {
                    List<JSONObject> list = this.zu;
                    if (list != null && !list.isEmpty()) {
                        Iterator<JSONObject> it = this.zu.iterator();
                        while (it.hasNext()) {
                            JSONObject jSONObjectOptJSONObject = it.next().optJSONObject("adExtraData");
                            if (jSONObjectOptJSONObject != null) {
                                jSONObjectOptJSONObject.put("playable_render_type", this.uoy);
                                jSONObjectOptJSONObject.put("playable_url", this.ucs);
                            }
                            this.ux.ouw(jSONObjectOptJSONObject);
                        }
                        this.zu.clear();
                    }
                    if (this.uoy == 0 && (this.ey != ouw.LAND_PAGE || ouw(this.ucs))) {
                        ra.ouw("PlayablePlugin", "reportEvent by ActionProxy");
                        this.ux.ouw(jSONObject);
                        return;
                    } else if (this.uoy != 0) {
                        ra.ouw("PlayablePlugin", "reportEvent by ActionProxy");
                        this.ux.ouw(jSONObject);
                        return;
                    } else {
                        ra.ouw("PlayablePlugin", "reportEvent error no not playable url");
                        return;
                    }
                }
                ra.ouw("PlayablePlugin", "reportEvent error no impl");
                return;
            }
            if (this.zu == null) {
                this.zu = new ArrayList();
            }
            this.zu.add(jSONObject2);
        } catch (Throwable th2) {
            ra.ouw("PlayablePlugin", "reportEvent error", th2);
        }
    }

    public final void ouw(boolean z10, String str, int i10) {
        if (z10) {
            this.osn = -1;
            this.f13657vh = str;
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("playable_code", i10);
                jSONObject.put("playable_msg", "url load error");
                jSONObject.put("playable_fail_url", str);
                jSONObject.put("playable_has_show", ko());
            } catch (Throwable th2) {
                ra.ouw("PlayablePlugin", "onWebReceivedHttpError error", th2);
            }
            vt("PL_sdk_html_load_error", jSONObject);
            if (this.f13639ko) {
                this.f13639ko = false;
                this.lvd = false;
                this.f13650sd = false;
                this.ouw.removeCallbacks(this.vt);
                this.ouw.removeCallbacks(this.f13641lh);
                ouw(1, "ContainerLoadFail");
            }
        }
    }

    public pno(Context context, lh lhVar, com.bytedance.sdk.openadsdk.zin.ouw ouwVar) {
        this.f13629an = "playable_stuck_check_ping";
        this.f13635gh = "playable_apply_media_permission_callback";
        this.ouw = new Handler(Looper.getMainLooper());
        this.fkw = new Handler(Looper.getMainLooper());
        this.f13647ra = true;
        this.pno = true;
        this.f13658vi = true;
        this.bly = "PL_sdk_playable_global_viewable";
        this.tlj = "PL_sdk_page_screen_blank";
        this.f13631cf = "PL_sdk_playable_destroy_analyze_summary";
        this.ryl = "PL_sdk_playable_hardware_dialog_cancel";
        this.mwh = "PL_sdk_playable_hardware_dialog_setting";
        this.npr = new HashSet(Arrays.asList("adInfo", "appInfo", "subscribe_app_ad", "download_app_ad"));
        this.f13660xn = null;
        this.f13636jg = "embeded_ad";
        this.f13639ko = true;
        this.f13649rn = true;
        this.zjp = false;
        this.kfa = "";
        this.zih = 10L;
        this.f13659vm = 10L;
        this.f13653th = 700;
        this.yw = 0L;
        this.ms = 0L;
        this.mwe = -1L;
        this.qbp = -1L;
        this.zin = -1L;
        this.vpp = -1L;
        this.jqy = -1L;
        this.ex = -1L;
        this.f13652tc = -1L;
        this.qld = "";
        this.yiz = "";
        this.ixm = "";
        this.zrz = "";
        this.ksc = 0;
        this.jae = 0;
        this.lgp = false;
        this.eay = 0;
        this.f13645od = -1;
        this.wbf = 0;
        this.f13642ln = 0;
        this.f13630cd = 0;
        this.uq = null;
        this.f13646pd = false;
        this.qni = 0;
        this.smu = 0;
        this.f13634fn = 0;
        this.byv = 0;
        this.fvf = 0L;
        this.bs = 0L;
        this.uoy = -2;
        this.osn = 0;
        this.f13637ki = 0;
        this.xwt = 0;
        this.lso = new JSONObject();
        this.wp = new HashMap();
        this.f13638kn = new JSONObject();
        this.baa = "";
        this.f13644nn = 0.0f;
        this.zjq = 0.0f;
        this.swm = false;
        this.f13628ak = false;
        this.lna = false;
        this.zu = new ArrayList();
        this.coz = true;
        this.lvd = true;
        this.f13650sd = true;
        this.f13655uj = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.bytedance.sdk.openadsdk.zin.pno.1
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                try {
                    View view = pno.this.fqk.get();
                    if (view == null) {
                        return;
                    }
                    pno.this.ouw(view);
                } catch (Throwable th2) {
                    ra.ouw("PlayablePlugin", "onSizeChanged error", th2);
                }
            }
        };
        this.euf = -1;
        this.uoy = 0;
        this.ey = ouw.LAND_PAGE;
        ouw(context, lhVar, ouwVar);
    }
}
