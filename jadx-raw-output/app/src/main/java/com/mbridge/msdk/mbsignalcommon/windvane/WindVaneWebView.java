package com.mbridge.msdk.mbsignalcommon.windvane;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.v0;
import com.mbridge.msdk.mbsignalcommon.base.BaseWebView;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.MintegralNetworkBridge;
import com.unity3d.ads.adplayer.AndroidWebViewClient;

/* JADX INFO: loaded from: classes7.dex */
public class WindVaneWebView extends BaseWebView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public j f36096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f36097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f36098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f36099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Object f36100h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f36101i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f36102j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f36103k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f36104l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CampaignEx f36105m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36106n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f36107o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float f36108p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f36109q;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            WindVaneWebView.this.f36107o = true;
            WindVaneWebView.this.destroy();
        }
    }

    public WindVaneWebView(Context context) {
        super(context);
        this.f36107o = false;
        this.f36108p = 0.0f;
        this.f36109q = 0.0f;
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(com.safedk.android.utils.g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView, android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    @Override // com.mbridge.msdk.mbsignalcommon.base.BaseWebView
    public void a() {
        super.a();
        getSettings().setSavePassword(false);
        getSettings().setUserAgentString(getSettings().getUserAgentString() + " WindVane/3.0.2");
        if (this.f36096d == null) {
            this.f36096d = new j(this);
        }
        setWebViewChromeClient(this.f36096d);
        k kVar = new k();
        this.mWebViewClient = kVar;
        setWebViewClient(kVar);
        if (this.f36097e == null) {
            b hVar = new h(this.f35996a);
            this.f36097e = hVar;
            setSignalCommunication(hVar);
        }
        this.f36098f = new e(this.f35996a, this);
    }

    public void clearWebView() {
        if (this.f36107o) {
            return;
        }
        MintegralNetworkBridge.webviewLoadUrl(this, AndroidWebViewClient.BLANK_PAGE);
    }

    public CampaignEx getCampaignEx() {
        return this.f36105m;
    }

    public String getCampaignId() {
        return this.f36101i;
    }

    public Object getJsObject(String str) {
        e eVar = this.f36098f;
        if (eVar == null) {
            return null;
        }
        return eVar.a(str);
    }

    public String getLocalRequestId() {
        return this.f36104l;
    }

    public Object getMraidObject() {
        return this.f36100h;
    }

    public Object getObject() {
        return this.f36099g;
    }

    public String getRid() {
        return this.f36103k;
    }

    public b getSignalCommunication() {
        return this.f36097e;
    }

    public c getWebViewListener() {
        return this.f36102j;
    }

    public boolean isDestoryed() {
        return this.f36107o;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null && (bVar.a() instanceof IntentFilter)) {
            String url = getUrl();
            if (!TextUtils.isEmpty(url) && url.contains("https://play.google.com")) {
                if (motionEvent.getAction() == 0) {
                    this.f36108p = motionEvent.getRawX();
                    this.f36109q = motionEvent.getRawY();
                } else {
                    float rawX = motionEvent.getRawX() - this.f36108p;
                    float y10 = motionEvent.getY() - this.f36109q;
                    if ((rawX >= 0.0f || rawX * (-1.0f) <= 48) && ((rawX <= 0.0f || rawX <= 48) && ((y10 >= 0.0f || (-1.0f) * y10 <= 48) && (y10 <= 0.0f || y10 <= 48)))) {
                        setClickable(false);
                        return true;
                    }
                }
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void registerWindVanePlugin(Class cls) {
        e eVar = this.f36098f;
        if (eVar == null) {
            return;
        }
        eVar.a(cls.getSimpleName(), cls);
    }

    public void release() {
        try {
            if (!this.f36107o) {
                com.mbridge.msdk.foundation.same.report.metrics.e eVar = new com.mbridge.msdk.foundation.same.report.metrics.e();
                eVar.a("type", Integer.valueOf(this.f36106n));
                if (this.f36105m != null) {
                    com.mbridge.msdk.foundation.same.report.metrics.d.b().a("2000135", this.f36105m, eVar);
                }
            }
        } catch (Exception unused) {
        }
        try {
            setVisibility(8);
            removeAllViews();
            setDownloadListener(null);
            this.f36099g = null;
            int iB = v0.b(getContext());
            if (iB == 0) {
                this.f36107o = true;
                destroy();
            } else {
                new Handler().postDelayed(new a(), iB * 1000);
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
    }

    public void setApiManagerContext(Context context) {
        e eVar = this.f36098f;
        if (eVar != null) {
            eVar.a(context);
        }
    }

    public void setApiManagerJSFactory(Object obj) {
        e eVar = this.f36098f;
        if (eVar != null) {
            eVar.a(obj);
        }
    }

    public void setCampaignEx(CampaignEx campaignEx) {
        this.f36105m = campaignEx;
    }

    public void setCampaignId(String str) {
        this.f36101i = str;
    }

    public void setLocalRequestId(String str) {
        this.f36104l = str;
    }

    public void setMraidObject(Object obj) {
        this.f36100h = obj;
    }

    public void setObject(Object obj) {
        this.f36099g = obj;
    }

    public void setRid(String str) {
        this.f36103k = str;
    }

    public void setSignalCommunication(b bVar) {
        this.f36097e = bVar;
        bVar.a(this);
    }

    public void setTempTypeForMetrics(int i10) {
        this.f36106n = i10;
    }

    public void setWebViewChromeClient(j jVar) {
        this.f36096d = jVar;
        setWebChromeClient(jVar);
    }

    public void setWebViewListener(c cVar) {
        this.f36102j = cVar;
        j jVar = this.f36096d;
        if (jVar != null) {
            jVar.a(cVar);
        }
        com.mbridge.msdk.mbsignalcommon.base.b bVar = this.mWebViewClient;
        if (bVar != null) {
            bVar.a(cVar);
        }
    }

    public void setWebViewTransparent() {
        super.setTransparent();
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36107o = false;
        this.f36108p = 0.0f;
        this.f36109q = 0.0f;
    }

    public WindVaneWebView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f36107o = false;
        this.f36108p = 0.0f;
        this.f36109q = 0.0f;
    }
}
