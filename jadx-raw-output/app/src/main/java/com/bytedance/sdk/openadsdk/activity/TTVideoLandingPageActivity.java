package com.bytedance.sdk.openadsdk.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.DownloadListener;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.Nullable;
import com.bykv.vk.openvk.preload.falconx.loader.ILoader;
import com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel;
import com.bytedance.sdk.component.utils.ko;
import com.bytedance.sdk.component.utils.ksc;
import com.bytedance.sdk.component.utils.qbp;
import com.bytedance.sdk.openadsdk.ApmHelper;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.common.rn;
import com.bytedance.sdk.openadsdk.core.bs;
import com.bytedance.sdk.openadsdk.core.ey;
import com.bytedance.sdk.openadsdk.core.jg;
import com.bytedance.sdk.openadsdk.core.model.vpp;
import com.bytedance.sdk.openadsdk.core.od;
import com.bytedance.sdk.openadsdk.core.settings.cf;
import com.bytedance.sdk.openadsdk.core.zih;
import com.bytedance.sdk.openadsdk.utils.osn;
import com.bytedance.sdk.openadsdk.utils.th;
import com.bytedance.sdk.openadsdk.utils.uoy;
import com.bytedance.sdk.openadsdk.utils.zin;
import com.bytedance.sdk.openadsdk.yu.mwh;
import com.bytedance.sdk.openadsdk.yu.ryl;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;
import com.safedk.android.utils.g;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public abstract class TTVideoLandingPageActivity extends TTBaseLandingPageActivity implements com.bytedance.sdk.openadsdk.cf.yu {
    public int bly;

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh f12061cd;

    /* JADX INFO: renamed from: cj, reason: collision with root package name */
    private ILoader f12063cj;
    public com.bytedance.sdk.openadsdk.core.widget.ouw ex;
    public com.bytedance.sdk.openadsdk.multipro.vt.ouw ey;
    public Context fkw;
    public String hun;
    public rn jae;
    public TextView jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    public long f12065ko;
    public TextView ksc;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public String f12066le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public ImageView f12067lh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    public Button f12068od;
    public int osn;
    public com.bytedance.sdk.component.bly.le ouw;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    public String f12069pd;
    public bs pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    public String f12070ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    public vpp f12071rn;
    public mwh rrs;
    public com.bytedance.sdk.openadsdk.core.mwh.vt.le ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    public TextView f12072tc;
    public FrameLayout tlj;
    private int ucs;
    public com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ux;

    /* JADX INFO: renamed from: vh, reason: collision with root package name */
    private int f12075vh;
    public RelativeLayout vpp;
    public ImageView vt;
    public TextView yu;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public int f12062cf = -1;
    public int zih = 0;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    public int f12076vm = 0;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    public int f12073th = 0;
    public int qbp = 0;
    public String zin = "ダウンロード";
    public boolean uq = false;
    public boolean fvf = false;
    public boolean bs = true;
    public boolean fak = false;
    public String uoy = null;
    public AtomicBoolean jvy = new AtomicBoolean(true);
    public JSONArray fqk = null;
    private final AtomicInteger pv = new AtomicInteger(0);
    private final AtomicInteger wp = new AtomicInteger(0);

    /* JADX INFO: renamed from: kn, reason: collision with root package name */
    private final AtomicInteger f12064kn = new AtomicInteger(0);
    public int lso = -1;

    /* JADX INFO: renamed from: ub, reason: collision with root package name */
    public com.bytedance.sdk.openadsdk.core.lh.ouw f12074ub = null;
    private final com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt yib = new com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.11
        @Override // com.bykv.vk.openvk.ouw.ouw.ouw.yu.lh.vt
        public final void ouw(boolean z10) {
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity.uq = z10;
            if (tTVideoLandingPageActivity.isFinishing()) {
                return;
            }
            if (!z10) {
                osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 0);
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                marginLayoutParams.width = tTVideoLandingPageActivity2.f12073th;
                marginLayoutParams.height = tTVideoLandingPageActivity2.qbp;
                marginLayoutParams.leftMargin = tTVideoLandingPageActivity2.f12076vm;
                marginLayoutParams.topMargin = tTVideoLandingPageActivity2.zih;
                tTVideoLandingPageActivity2.tlj.setLayoutParams(marginLayoutParams);
                return;
            }
            osn.ouw((View) TTVideoLandingPageActivity.this.ouw, 8);
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) TTVideoLandingPageActivity.this.tlj.getLayoutParams();
            TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
            tTVideoLandingPageActivity3.f12076vm = marginLayoutParams2.leftMargin;
            tTVideoLandingPageActivity3.zih = marginLayoutParams2.topMargin;
            tTVideoLandingPageActivity3.f12073th = marginLayoutParams2.width;
            tTVideoLandingPageActivity3.qbp = marginLayoutParams2.height;
            marginLayoutParams2.width = -1;
            marginLayoutParams2.height = -1;
            marginLayoutParams2.topMargin = 0;
            marginLayoutParams2.leftMargin = 0;
            tTVideoLandingPageActivity3.tlj.setLayoutParams(marginLayoutParams2);
        }
    };
    private final ksc.ouw yhj = new ksc.ouw() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2
        @Override // com.bytedance.sdk.component.utils.ksc.ouw
        public final void ouw(boolean z10, final int i10) {
            com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.2.1
                @Override // java.lang.Runnable
                public final void run() {
                    AnonymousClass2.ouw(AnonymousClass2.this, i10);
                }
            });
        }

        public static /* synthetic */ void ouw(AnonymousClass2 anonymousClass2, int i10) {
            com.bytedance.sdk.component.bly.le leVar;
            String str;
            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
            if (tTVideoLandingPageActivity.osn == 0 && i10 != 0 && (leVar = tTVideoLandingPageActivity.ouw) != null && (str = tTVideoLandingPageActivity.uoy) != null) {
                leVar.a_(str);
            }
            com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
            if (leVar2 != null && leVar2.getNativeVideoController() != null) {
                TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                if (!tTVideoLandingPageActivity2.fvf && tTVideoLandingPageActivity2.osn != i10) {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = tTVideoLandingPageActivity2.ryl.getNativeVideoController();
                    nativeVideoController.yu(i10);
                    if (i10 == 4) {
                        nativeVideoController.zih = false;
                        nativeVideoController.ryl();
                    }
                }
            }
            TTVideoLandingPageActivity.this.osn = i10;
        }
    };

    @SuppressLint({"StaticFieldLeak"})
    public static class ouw extends AsyncTask<Void, Void, Drawable> {
        private final Bitmap ouw;
        private final WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt> vt;

        public /* synthetic */ ouw(Bitmap bitmap, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vtVar, byte b10) {
            this(bitmap, vtVar);
        }

        private Drawable ouw() {
            try {
                Bitmap bitmapOuw = com.bytedance.sdk.component.adexpress.yu.ouw.ouw(zih.ouw(), this.ouw, 25);
                if (bitmapOuw == null) {
                    return null;
                }
                return new BitmapDrawable(zih.ouw().getResources(), bitmapOuw);
            } catch (Throwable th2) {
                qbp.lh("TTVideoLandingPage", th2.getMessage());
                return null;
            }
        }

        private ouw(Bitmap bitmap, com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt vtVar) {
            this.ouw = bitmap;
            this.vt = new WeakReference<>(vtVar);
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Drawable drawable) {
            WeakReference<com.bykv.vk.openvk.ouw.ouw.ouw.yu.vt> weakReference;
            Drawable drawable2 = drawable;
            if (drawable2 == null || (weakReference = this.vt) == null || weakReference.get() == null) {
                return;
            }
            this.vt.get().ouw(drawable2);
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ Drawable doInBackground(Void[] voidArr) {
            return ouw();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.activityOnTouch(g.f44975u, me2);
        return super.dispatchTouchEvent(me2);
    }

    public abstract View lh();

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!jg.fkw()) {
            finish();
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            getWindow().addFlags(16777216);
        } catch (Throwable unused) {
        }
        try {
            zih.vt(this);
        } catch (Throwable unused2) {
        }
        this.osn = ksc.ouw(getApplicationContext(), 60000L);
        try {
            setContentView(lh());
            this.fkw = this;
            Intent intent = getIntent();
            String stringExtra = null;
            this.fak = intent.getBooleanExtra("video_is_auto_play", true);
            if (bundle != null && bundle.getLong("video_play_position") > 0) {
                this.f12065ko = bundle.getLong("video_play_position", 0L);
            }
            String stringExtra2 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_DATA);
            if (com.bytedance.sdk.openadsdk.multipro.vt.lh()) {
                String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra3 != null) {
                    try {
                        this.f12071rn = com.bytedance.sdk.openadsdk.core.vt.ouw(new JSONObject(stringExtra3));
                    } catch (Exception unused3) {
                    }
                }
                vpp vppVar = this.f12071rn;
                if (vppVar != null) {
                    this.f12062cf = vppVar.ucs;
                }
                this.f12066le = intent.getStringExtra("adid");
                this.f12070ra = intent.getStringExtra("log_extra");
                stringExtra = intent.getStringExtra("web_title");
                this.hun = intent.getStringExtra("gecko_id");
                this.f12069pd = intent.getStringExtra("event_tag");
                this.bly = intent.getIntExtra("source", -1);
                this.uoy = intent.getStringExtra("url");
            } else {
                vpp vppVarOuw = od.ouw().ouw(od.ouw(intent));
                this.f12071rn = vppVarOuw;
                if (vppVarOuw != null) {
                    this.f12062cf = vppVarOuw.ucs;
                    this.f12066le = vppVarOuw.pv;
                    this.f12070ra = vppVarOuw.yhj;
                    stringExtra = vppVarOuw.fqk;
                    this.hun = vppVarOuw.f12856ki;
                    this.uoy = vppVarOuw.f12878th;
                    this.bly = vppVarOuw.zin;
                    this.f12069pd = vppVarOuw.qbp;
                }
            }
            String strOuw = stringExtra;
            if (this.f12071rn == null) {
                finish();
                return;
            }
            if (!TextUtils.isEmpty(this.hun)) {
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                this.f12063cj = com.bytedance.sdk.openadsdk.ra.vt.vt();
                com.bytedance.sdk.openadsdk.ra.vt.ouw();
                int iOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12063cj, this.hun);
                this.ucs = iOuw;
                this.f12075vh = iOuw > 0 ? 2 : 0;
            }
            if (stringExtra2 != null) {
                try {
                    this.ey = com.bytedance.sdk.openadsdk.multipro.vt.ouw.ouw(new JSONObject(stringExtra2));
                } catch (Exception unused4) {
                }
                com.bytedance.sdk.openadsdk.multipro.vt.ouw ouwVar = this.ey;
                if (ouwVar != null) {
                    this.f12065ko = ouwVar.f13267ra;
                }
            }
            if (bundle != null) {
                this.f12071rn = od.ouw().ouw(bundle.getInt("meta_index", -1));
                long j10 = bundle.getLong("video_play_position");
                if (j10 > 0) {
                    this.f12065ko = j10;
                }
            }
            le();
            cf();
            bs bsVar = new bs(this);
            this.pno = bsVar;
            bs bsVarVt = bsVar.vt(this.ouw);
            bsVarVt.f12584lh = this.f12066le;
            bsVarVt.fkw = this.f12070ra;
            bsVarVt.f12583le = this.bly;
            bs bsVarOuw = bsVarVt.ouw(this.f12071rn);
            bsVarOuw.pno = this.f12071rn.f12884vi;
            bs bsVarOuw2 = bsVarOuw.ouw(this.ouw);
            bsVarOuw2.ouw = "landingpage_split_screen";
            bsVarOuw2.f12587ra = this.f12071rn.hun();
            ouw(4);
            if (this.ouw != null) {
                com.bytedance.sdk.openadsdk.core.widget.ouw.lh lhVarOuw = com.bytedance.sdk.openadsdk.core.widget.ouw.lh.ouw(this.fkw);
                lhVarOuw.vt = true;
                lhVarOuw.ouw = false;
                lhVarOuw.ouw(this.ouw.getWebView());
                mwh mwhVar = new mwh(this.f12071rn, this.ouw.getWebView(), new ryl() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.1
                    @Override // com.bytedance.sdk.openadsdk.yu.ryl
                    public final void ouw(int i10) {
                        com.bytedance.sdk.openadsdk.yu.lh.ouw.ouw(TTVideoLandingPageActivity.this.ucs, TTVideoLandingPageActivity.this.f12064kn.get(), TTVideoLandingPageActivity.this.wp.get(), TTVideoLandingPageActivity.this.pv.get() - TTVideoLandingPageActivity.this.wp.get(), TTVideoLandingPageActivity.this.f12071rn, "landingpage_split_screen", i10);
                    }
                }, this.f12075vh);
                mwhVar.jae = true;
                this.rrs = mwhVar;
                this.ux = mwhVar.ryl;
                mwhVar.ouw("landingpage_split_screen");
            }
            com.bytedance.sdk.component.bly.le leVar = this.ouw;
            if (leVar != null) {
                leVar.setLandingPage(true);
                this.ouw.setTag("landingpage_split_screen");
                this.ouw.setMaterialMeta(this.f12071rn.bs());
                this.ouw.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.fkw(this.fkw, this.pno, this.f12066le, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.4
                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onLoadResource(WebView view, String url) {
                        super.onLoadResource(view, url);
                        CreativeInfoManager.onResourceLoaded(g.f44975u, view, url);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        CreativeInfoManager.onWebViewPageFinished(g.f44975u, view, url);
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
                        return CreativeInfoManager.onWebViewResponseWithHeaders(g.f44975u, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
                    }

                    @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.fkw, com.bytedance.sdk.component.bly.le.ouw, android.webkit.WebViewClient
                    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                        Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$4;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
                        return CreativeInfoManager.onWebViewResponse(g.f44975u, webView, str, safedk_TTVideoLandingPageActivity$4_shouldInterceptRequest_70bacd8d18e5c7fb197b2b534026d60a(webView, str));
                    }

                    public WebResourceResponse safedk_TTVideoLandingPageActivity$4_shouldInterceptRequest_70bacd8d18e5c7fb197b2b534026d60a(WebView p10, String p11) {
                        try {
                            if (TextUtils.isEmpty(TTVideoLandingPageActivity.this.hun)) {
                                return super.shouldInterceptRequest(p10, p11);
                            }
                            TTVideoLandingPageActivity.this.pv.incrementAndGet();
                            com.bytedance.sdk.openadsdk.ra.vt.ouw();
                            WebResourceResponseModel webResourceResponseModelOuw = com.bytedance.sdk.openadsdk.ra.vt.ouw(TTVideoLandingPageActivity.this.f12063cj, TTVideoLandingPageActivity.this.hun, p11);
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getWebResourceResponse() != null) {
                                TTVideoLandingPageActivity.this.wp.incrementAndGet();
                                ko.vt("TTVideoLandingPage", "GeckoLog: hit++");
                                return webResourceResponseModelOuw.getWebResourceResponse();
                            }
                            if (webResourceResponseModelOuw != null && webResourceResponseModelOuw.getMsg() == 2) {
                                TTVideoLandingPageActivity.this.f12064kn.incrementAndGet();
                            }
                            return super.shouldInterceptRequest(p10, p11);
                        } catch (Throwable th2) {
                            qbp.ouw("TTVideoLandingPage", "shouldInterceptRequest url error", th2);
                            return super.shouldInterceptRequest(p10, p11);
                        }
                    }
                });
                com.bytedance.sdk.component.bly.le leVar2 = this.ouw;
                leVar2.setUserAgentString(th.ouw(leVar2.getWebView()));
            }
            com.bytedance.sdk.component.bly.le leVar3 = this.ouw;
            if (leVar3 != null) {
                leVar3.setMixedContentMode(0);
            }
            com.bytedance.sdk.openadsdk.yu.lh.ouw(this.f12071rn, "landingpage_split_screen", this.f12075vh);
            zin.ouw(this.ouw, this.uoy);
            this.ouw.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.ouw.yu(this.pno, this.rrs) { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.5
                @Override // com.bytedance.sdk.openadsdk.core.widget.ouw.yu, android.webkit.WebChromeClient
                public final void onProgressChanged(WebView webView, int i10) {
                    super.onProgressChanged(webView, i10);
                }
            });
            this.ouw.setDownloadListener(new DownloadListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.6
                @Override // android.webkit.DownloadListener
                public final void onDownloadStart(String str, String str2, String str3, String str4, long j11) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    com.bytedance.sdk.openadsdk.qbp.ouw.ouw.lh lhVar = tTVideoLandingPageActivity.f12061cd;
                    if (lhVar != null) {
                        lhVar.ouw(tTVideoLandingPageActivity.f12071rn);
                    }
                }
            });
            TextView textView = this.yu;
            if (textView != null) {
                if (TextUtils.isEmpty(strOuw)) {
                    strOuw = com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_web_title_default");
                }
                textView.setText(strOuw);
            }
            ksc.ouw(this.yhj, this.fkw);
            ra();
            ryl();
            com.bytedance.sdk.openadsdk.yu.lh.ouw.ouw(SystemClock.elapsedRealtime() - jElapsedRealtime, this.f12071rn, "landingpage_split_screen", this.f12063cj, this.hun);
        } catch (Throwable unused5) {
            finish();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final boolean ouw() {
        return true;
    }

    public abstract boolean pno();

    private boolean jg() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return true;
        }
        return this.ryl.getNativeVideoController().f12909jg;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ko() {
        return !TextUtils.isEmpty(this.uoy) && this.uoy.contains("__luban_sdk");
    }

    private void mwh() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        if (this.uq && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().le();
            this.uq = false;
        } else if (!ko() || this.jvy.getAndSet(true)) {
            super.onBackPressed();
        } else {
            rn();
            ouw(0);
        }
    }

    private void ouw(final String str) {
        Button button;
        if (TextUtils.isEmpty(str) || (button = this.f12068od) == null) {
            return;
        }
        button.post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.7
            @Override // java.lang.Runnable
            public final void run() {
                TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                if (tTVideoLandingPageActivity.f12068od == null || tTVideoLandingPageActivity.isFinishing()) {
                    return;
                }
                TTVideoLandingPageActivity.this.f12068od.setText(str);
            }
        });
    }

    private void rn() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", true);
            this.pno.ouw("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ryl() {
        vpp vppVar = this.f12071rn;
        if (vppVar == null || vppVar.f12868pd != 4) {
            return;
        }
        this.jae.setVisibility(0);
        Button button = (Button) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13413gh);
        this.f12068od = button;
        if (button != null) {
            ouw(yu());
            this.f12068od.setOnClickListener(this.f12074ub);
            this.f12068od.setOnTouchListener(this.f12074ub);
        }
    }

    public final long bly() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0L;
        }
        return this.ryl.getNativeVideoController().th();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void cf() {
        if (this.f12071rn == null) {
            return;
        }
        this.f12061cd = com.bytedance.sdk.openadsdk.qbp.ouw.ouw.yu.ouw(this, this.f12069pd);
        com.bytedance.sdk.openadsdk.core.lh.ouw ouwVar = new com.bytedance.sdk.openadsdk.core.lh.ouw(this, this.f12071rn, this.f12069pd, this.bly);
        this.f12074ub = ouwVar;
        ouwVar.yu = false;
        ouwVar.f12718le = true;
        this.ksc.setOnClickListener(ouwVar);
        this.ksc.setOnTouchListener(this.f12074ub);
        this.f12074ub.ouw(this.f12061cd);
    }

    public void le() {
        String str;
        this.jae = (rn) findViewById(com.bytedance.sdk.openadsdk.utils.rn.f13440vh);
        this.ouw = (com.bytedance.sdk.component.bly.le) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ux);
        ImageView imageView = (ImageView) findViewById(520093720);
        this.vt = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$8;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_TTVideoLandingPageActivity$8_onClick_8becff8855aaffa33f686ea19bcfc1c9(view);
                }

                public void safedk_TTVideoLandingPageActivity$8_onClick_8becff8855aaffa33f686ea19bcfc1c9(View p10) {
                    TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                    if (tTVideoLandingPageActivity.ouw != null) {
                        com.bytedance.sdk.openadsdk.core.widget.ouw.le.ouw ouwVar = tTVideoLandingPageActivity.ux;
                        if (ouwVar != null) {
                            ouwVar.ouw();
                        }
                        if (TTVideoLandingPageActivity.this.ouw.lh()) {
                            TTVideoLandingPageActivity.this.ouw.yu();
                            return;
                        }
                        if (TTVideoLandingPageActivity.this.ko()) {
                            TTVideoLandingPageActivity.this.onBackPressed();
                            return;
                        }
                        JSONObject jSONObjectOuw = null;
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = TTVideoLandingPageActivity.this.ryl;
                        if (leVar != null && leVar.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity2.f12071rn, tTVideoLandingPageActivity2.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f12911le);
                        }
                        JSONObject jSONObject = jSONObjectOuw;
                        TTVideoLandingPageActivity tTVideoLandingPageActivity3 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity3.f12071rn, "embeded_ad", "detail_back", tTVideoLandingPageActivity3.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObject, (com.bytedance.sdk.openadsdk.yu.ra) null);
                        TTVideoLandingPageActivity.this.finish();
                    }
                }
            });
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null) {
            leVar.setIsAutoPlay(this.fak);
        }
        ImageView imageView2 = (ImageView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.osn);
        this.f12067lh = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.9
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Logger.d("Pangle|SafeDK: Execution> Lcom/bytedance/sdk/openadsdk/activity/TTVideoLandingPageActivity$9;->onClick(Landroid/view/View;)V");
                    CreativeInfoManager.onViewClicked(g.f44975u, view);
                    safedk_TTVideoLandingPageActivity$9_onClick_df389c5d78bce6f751d1ca8c5d18117f(view);
                }

                public void safedk_TTVideoLandingPageActivity$9_onClick_df389c5d78bce6f751d1ca8c5d18117f(View p10) {
                    com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = TTVideoLandingPageActivity.this.ryl;
                    if (leVar2 != null) {
                        JSONObject jSONObjectOuw = null;
                        if (leVar2.getNativeVideoController() != null) {
                            TTVideoLandingPageActivity tTVideoLandingPageActivity = TTVideoLandingPageActivity.this;
                            jSONObjectOuw = uoy.ouw(tTVideoLandingPageActivity.f12071rn, tTVideoLandingPageActivity.ryl.getNativeVideoController().zih(), TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f12911le);
                        }
                        TTVideoLandingPageActivity tTVideoLandingPageActivity2 = TTVideoLandingPageActivity.this;
                        com.bytedance.sdk.openadsdk.yu.lh.ouw(tTVideoLandingPageActivity2.f12071rn, "embeded_ad", "detail_skip", tTVideoLandingPageActivity2.bly(), TTVideoLandingPageActivity.this.tlj(), jSONObjectOuw, (com.bytedance.sdk.openadsdk.yu.ra) null);
                    }
                    TTVideoLandingPageActivity.this.finish();
                }
            });
        }
        this.yu = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.odc);
        this.tlj = (FrameLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.uoy);
        this.vpp = (RelativeLayout) findViewById(com.bytedance.sdk.openadsdk.utils.rn.ey);
        this.jqy = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.jvy);
        this.f12072tc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.fqk);
        this.ksc = (TextView) findViewById(com.bytedance.sdk.openadsdk.utils.rn.hun);
        this.ex = (com.bytedance.sdk.openadsdk.core.widget.ouw) findViewById(com.bytedance.sdk.openadsdk.utils.rn.rrs);
        vpp vppVar = this.f12071rn;
        if (vppVar == null || vppVar.f12868pd != 4) {
            return;
        }
        osn.ouw((View) this.vpp, 0);
        if (!TextUtils.isEmpty(this.f12071rn.fqk)) {
            str = this.f12071rn.fqk;
        } else if (TextUtils.isEmpty(this.f12071rn.hun)) {
            str = !TextUtils.isEmpty(this.f12071rn.f12883vh) ? this.f12071rn.f12883vh : "";
        } else {
            str = this.f12071rn.hun;
        }
        com.bytedance.sdk.openadsdk.core.model.zih zihVar = this.f12071rn.fak;
        if (zihVar != null && zihVar.ouw != null) {
            osn.ouw((View) this.ex, 0);
            osn.ouw((View) this.jqy, 4);
            com.bytedance.sdk.openadsdk.th.vt.ouw();
            vpp vppVar2 = this.f12071rn;
            com.bytedance.sdk.openadsdk.th.vt.ouw(vppVar2.fak, this.ex, vppVar2);
        } else if (!TextUtils.isEmpty(str)) {
            osn.ouw((View) this.ex, 4);
            osn.ouw((View) this.jqy, 0);
            this.jqy.setText(str.substring(0, 1));
        }
        if (!TextUtils.isEmpty(this.f12071rn.vpp())) {
            this.ksc.setText(this.f12071rn.vpp());
        }
        if (!TextUtils.isEmpty(str)) {
            this.f12072tc.setText(str);
        }
        osn.ouw((View) this.f12072tc, 0);
        osn.ouw((View) this.ksc, 0);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        int iOuw = this.f12071rn != null ? od.ouw().ouw(this.f12071rn) : -1;
        this.lso = iOuw;
        bundle.putInt("meta_index", iOuw);
        bundle.putLong("video_play_position", this.f12065ko);
        bundle.putBoolean("is_complete", this.fvf);
        long j10 = this.f12065ko;
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null && leVar.getNativeVideoController() != null) {
            j10 = this.ryl.getNativeVideoController().bly;
        }
        bundle.putLong("video_play_position", j10);
        super.onSaveInstanceState(bundle);
    }

    public final int tlj() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar == null || leVar.getNativeVideoController() == null) {
            return 0;
        }
        return this.ryl.getNativeVideoController().qbp();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity
    public final void vt() {
        mwh();
    }

    public final String yu() {
        vpp vppVar = this.f12071rn;
        if (vppVar != null && !TextUtils.isEmpty(vppVar.vpp())) {
            this.zin = this.f12071rn.vpp();
        }
        return this.zin;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        mwh();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ryl();
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        try {
            ksc.ouw(this.yhj);
        } catch (Exception unused) {
        }
        try {
            if (getWindow() != null) {
                ((ViewGroup) getWindow().getDecorView()).removeAllViews();
            }
            this.f12071rn.f12844cd = false;
        } catch (Throwable unused2) {
        }
        com.bytedance.sdk.component.bly.le leVar = this.ouw;
        if (leVar != null) {
            ey.ouw(leVar.getWebView());
        }
        this.ouw = null;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.lh();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
        if (leVar2 != null && leVar2.getNativeVideoController() != null) {
            this.ryl.getNativeVideoController().ko();
        }
        this.ryl = null;
        this.f12071rn = null;
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.ouw(true);
        }
        if (!TextUtils.isEmpty(this.hun)) {
            com.bytedance.sdk.openadsdk.yu.lh.ouw.ouw(this.wp.get(), this.pv.get(), this.f12071rn);
        }
        com.bytedance.sdk.openadsdk.ra.vt.ouw();
        com.bytedance.sdk.openadsdk.ra.vt.ouw(this.f12063cj);
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onPause() {
        boolean z10;
        super.onPause();
        if (this.ryl != null && !jg()) {
            this.ryl.cf();
        }
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = this.ryl;
        if (leVar != null && leVar.getNativeVideoController() != null) {
            com.bytedance.sdk.openadsdk.core.mwh.vt.lh nativeVideoController = this.ryl.getNativeVideoController();
            if (!this.fvf && !nativeVideoController.jqy()) {
                z10 = false;
            } else {
                z10 = true;
            }
            this.fvf = z10;
            Boolean bool = Boolean.TRUE;
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_is_update_flag", bool);
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_isfromvideodetailpage", bool);
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_native_video_complete", Boolean.valueOf(this.fvf));
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_current_play_position", Long.valueOf(nativeVideoController.rn()));
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_total_play_duration", Long.valueOf(nativeVideoController.th() + nativeVideoController.zih()));
            com.bytedance.sdk.openadsdk.multipro.yu.ouw.ouw("sp_multi_native_video_data", "key_video_duration", Long.valueOf(nativeVideoController.th()));
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseLandingPageActivity, com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    public void onResume() {
        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar;
        super.onResume();
        if (!this.bs && (leVar = this.ryl) != null && leVar.getNativeVideoController() != null && !jg()) {
            this.ryl.cf();
        }
        this.bs = false;
        bs bsVar = this.pno;
        if (bsVar != null) {
            bsVar.vt();
        }
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.fkw();
        }
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        if (this.lso >= 0) {
            od.ouw().vt(this.lso);
            this.lso = -1;
        }
        com.bytedance.sdk.openadsdk.utils.yu.ouw(this, this.f12071rn);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        mwh mwhVar = this.rrs;
        if (mwhVar != null) {
            mwhVar.le();
        }
    }

    public void ra() {
        if (pno()) {
            try {
                com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar = new com.bytedance.sdk.openadsdk.core.mwh.vt.le(this.fkw, this.f12071rn, true, (com.bytedance.sdk.openadsdk.yu.ra) null);
                this.ryl = leVar;
                if (leVar.getNativeVideoController() != null) {
                    this.ryl.getNativeVideoController().vt(false);
                }
                if (this.fvf) {
                    this.tlj.setVisibility(0);
                    this.tlj.removeAllViews();
                    this.tlj.addView(this.ryl);
                    this.ryl.bly();
                } else {
                    if (!this.fak) {
                        this.f12065ko = 0L;
                    }
                    if (this.ey != null && this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().uoy = this.ey.f13267ra;
                        this.ryl.getNativeVideoController().bs = this.ey.fkw;
                        int iFqk = this.f12071rn.fqk();
                        com.bytedance.sdk.openadsdk.core.mwh.vt.le leVar2 = this.ryl;
                        zih.yu();
                        leVar2.ouw(cf.vt(String.valueOf(iFqk)), "landingPageInit");
                    }
                    if (this.ryl.ouw(this.f12065ko, this.bs, this.fvf)) {
                        this.tlj.setVisibility(0);
                        this.tlj.removeAllViews();
                        this.tlj.addView(this.ryl);
                    }
                    if (this.ryl.getNativeVideoController() != null) {
                        this.ryl.getNativeVideoController().vt(false);
                        this.ryl.getNativeVideoController().ouw(this.yib);
                    }
                }
                String str = this.f12071rn.f12877tc.get(0).ouw;
                com.bytedance.sdk.openadsdk.tlj.yu.ouw.vt.ouw(str).ouw(this.f12071rn.f12877tc.get(0).vt).vt(this.f12071rn.f12877tc.get(0).f12895lh).fkw(osn.le(zih.ouw())).yu(osn.yu(zih.ouw())).lh(2).ouw(new com.bytedance.sdk.openadsdk.tlj.vt(this.f12071rn, str, new com.bytedance.sdk.component.fkw.rn() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.10
                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(int i10, String str2, @Nullable Throwable th2) {
                    }

                    @Override // com.bytedance.sdk.component.fkw.rn
                    public final void ouw(com.bytedance.sdk.component.fkw.cf cfVar) {
                        try {
                            Object objVt = cfVar.vt();
                            if (objVt instanceof Bitmap) {
                                new ouw((Bitmap) objVt, TTVideoLandingPageActivity.this.ryl.getNativeVideoController().f12915ra, (byte) 0).execute(new Void[0]);
                            }
                        } catch (Exception unused) {
                        }
                    }
                }));
                this.ryl.findViewById(520093726).setOnTouchListener(null);
                this.ryl.findViewById(520093726).setOnClickListener(null);
            } catch (Exception e10) {
                qbp.lh("TTVideoLandingPage", e10.getMessage());
                if (this.ryl == null) {
                    ApmHelper.reportCustomError("mNativeVideoTsView is null", "FUNCTION EXCEPTION", e10);
                }
            }
            if (this.osn == 0) {
                try {
                    Toast.makeText(this, com.bytedance.sdk.component.utils.vpp.ouw(this, "tt_no_network"), 0).show();
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void ouw(final int i10) {
        if (this.f12067lh == null || !ko()) {
            return;
        }
        com.bytedance.sdk.openadsdk.utils.bs.ouw(new Runnable() { // from class: com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity.3
            @Override // java.lang.Runnable
            public final void run() {
                osn.ouw((View) TTVideoLandingPageActivity.this.f12067lh, i10);
            }
        });
    }

    @Override // com.bytedance.sdk.openadsdk.cf.yu
    public final void ouw(boolean z10, JSONArray jSONArray) {
        if (!z10 || jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        this.fqk = jSONArray;
    }
}
