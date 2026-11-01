package com.mbridge.msdk.video.signal.container;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.mbsignalcommon.windvane.f;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.video.signal.b;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.video.signal.factory.a;
import com.mbridge.msdk.video.signal.i;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.j;
import com.mbridge.msdk.videocommon.setting.c;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.utils.g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractJSContainer extends FrameLayout implements IJSFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f39385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f39386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f39387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f39388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f39389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f39390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f39391g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.mbridge.msdk.videocommon.entity.c f39392h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f39393i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39394j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39395k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f39396l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f39397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f39398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f39399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f39400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public IJSFactory f39401q;

    public AbstractJSContainer(Context context) {
        super(context);
        this.f39385a = 0;
        this.f39386b = 1;
        this.f39394j = 2;
        this.f39395k = false;
        this.f39396l = false;
        this.f39400p = false;
        this.f39401q = new a();
    }

    @SuppressLint({"SourceLockedOrientationActivity"})
    private boolean i(int i10) {
        try {
            if (i10 != 1) {
                if (i10 == 2) {
                    this.f39387c.setRequestedOrientation(11);
                }
                return false;
            }
            this.f39387c.setRequestedOrientation(12);
            return true;
        } catch (Throwable th2) {
            q0.b("AbstractJSContainer", th2.getMessage(), th2);
        }
    }

    public void a(Object obj) {
        f.a().b(obj, h(this.f39385a));
    }

    public void b(Object obj, String str) {
        f.a().b(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent me2) {
        DetectTouchUtils.viewOnTouch(g.f44969o, this, me2);
        return super.dispatchTouchEvent(me2);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (1 == 0) {
            setMeasuredDimension(0, 0);
        } else {
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }
    }

    public void a(Object obj, String str) {
        f.a().a(obj, Base64.encodeToString(str.getBytes(), 2));
    }

    public void b(String str) {
        q0.b("AbstractJSContainer", str);
        Activity activity = this.f39387c;
        if (activity != null) {
            activity.finish();
        }
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public b getActivityProxy() {
        return this.f39401q.getActivityProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public i getIJSRewardVideoV1() {
        return this.f39401q.getIJSRewardVideoV1();
    }

    public String getInnerPlacementId() {
        c cVar;
        return (!TextUtils.isEmpty(this.f39389e) || (cVar = this.f39390f) == null || TextUtils.isEmpty(cVar.t())) ? this.f39389e : this.f39390f.t();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.c getJSBTModule() {
        return this.f39401q.getJSBTModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        return this.f39401q.getJSCommon();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.f getJSContainerModule() {
        return this.f39401q.getJSContainerModule();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.g getJSNotifyProxy() {
        return this.f39401q.getJSNotifyProxy();
    }

    @Override // com.mbridge.msdk.video.signal.factory.IJSFactory
    public j getJSVideoModule() {
        return this.f39401q.getJSVideoModule();
    }

    public String getPlacementId() {
        return this.f39389e;
    }

    public String getUnitId() {
        return this.f39388d;
    }

    public String h(int i10) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("code", i10);
            String string = jSONObject.toString();
            if (!TextUtils.isEmpty(string)) {
                return Base64.encodeToString(string.getBytes(), 2);
            }
        } catch (Throwable unused) {
            q0.b("AbstractJSContainer", "code to string is error");
        }
        return "";
    }

    public void onResume() {
        if (com.mbridge.msdk.foundation.feedback.b.f34851f) {
            return;
        }
        if (getJSCommon().a()) {
            getActivityProxy().d();
        }
        getActivityProxy().a(0);
    }

    public void registerJsFactory(IJSFactory iJSFactory) {
        this.f39401q = iJSFactory;
    }

    public void setActivity(Activity activity) {
        this.f39387c = activity;
    }

    public void setBidCampaign(boolean z10) {
        this.f39396l = z10;
    }

    public void setBigOffer(boolean z10) {
        this.f39400p = z10;
    }

    public void setIV(boolean z10) {
        this.f39395k = z10;
    }

    public void setIVRewardEnable(int i10, int i11, int i12) {
        this.f39397m = i10;
        this.f39398n = i11;
        this.f39399o = i12;
    }

    public void setMute(int i10) {
        this.f39394j = i10;
    }

    public void setPlacementId(String str) {
        this.f39389e = str;
    }

    public void setReward(com.mbridge.msdk.videocommon.entity.c cVar) {
        this.f39392h = cVar;
    }

    public void setRewardId(String str) {
        this.f39393i = str;
    }

    public void setRewardUnitSetting(c cVar) {
        this.f39390f = cVar;
    }

    public void setUnitId(String str) {
        this.f39388d = str;
    }

    public void setUserId(String str) {
        this.f39391g = str;
    }

    public int a(CampaignEx campaignEx) {
        k kVarB = b(campaignEx);
        if (kVarB != null) {
            return kVarB.n();
        }
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        if (getJSCommon().a()) {
            getActivityProxy().a(configuration);
        }
    }

    public void onDestroy() {
        if (getJSCommon().a()) {
            getActivityProxy().b();
        }
    }

    public void onPause() {
        if (getJSCommon().a()) {
            getActivityProxy().g();
        }
        getActivityProxy().a(1);
    }

    public void onRestart() {
        if (getJSCommon().a()) {
            getActivityProxy().f();
        }
        getActivityProxy().a(4);
    }

    public void onStart() {
        if (getJSCommon().a()) {
            getActivityProxy().h();
        }
        getActivityProxy().a(2);
    }

    public void onStop() {
        if (getJSCommon().a()) {
            getActivityProxy().c();
        }
        getActivityProxy().a(3);
    }

    public void a(c cVar, CampaignEx campaignEx) {
        CampaignEx.c rewardTemplateMode;
        if (a(campaignEx) == 1) {
            return;
        }
        boolean zI = false;
        if (campaignEx != null && (rewardTemplateMode = campaignEx.getRewardTemplateMode()) != null) {
            zI = i(rewardTemplateMode.g());
        }
        if (zI || cVar == null) {
            return;
        }
        i(this.f39390f.y());
    }

    public k b(CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        com.mbridge.msdk.videocommon.a.C0412a c0412aA = com.mbridge.msdk.videocommon.a.a(this.f39395k ? MBSupportMuteAdType.INTERSTITIAL_VIDEO : 94, campaignEx);
        if (c0412aA != null && c0412aA.c()) {
            WindVaneWebView windVaneWebViewB = c0412aA.b();
            if (windVaneWebViewB.getObject() instanceof k) {
                return (k) windVaneWebViewB.getObject();
            }
        }
        return null;
    }

    public AbstractJSContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39385a = 0;
        this.f39386b = 1;
        this.f39394j = 2;
        this.f39395k = false;
        this.f39396l = false;
        this.f39400p = false;
        this.f39401q = new a();
    }
}
