package com.mbridge.msdk.video.signal.factory;

import android.app.Activity;
import android.webkit.WebView;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.bt.module.MBridgeBTContainer;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.c;
import com.mbridge.msdk.video.signal.d;
import com.mbridge.msdk.video.signal.f;
import com.mbridge.msdk.video.signal.g;
import com.mbridge.msdk.video.signal.impl.i;
import com.mbridge.msdk.video.signal.impl.j;
import com.mbridge.msdk.video.signal.impl.k;
import com.mbridge.msdk.video.signal.impl.m;
import com.mbridge.msdk.video.signal.impl.n;
import com.mbridge.msdk.video.signal.impl.o;
import com.mbridge.msdk.video.signal.impl.q;
import java.util.List;

/* JADX INFO: compiled from: JSFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class b extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Activity f39409h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private WebView f39410i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private MBridgeVideoView f39411j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private MBridgeContainerView f39412k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private CampaignEx f39413l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MBridgeBTContainer f39414m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.mbridge.msdk.video.signal.a.InterfaceC0410a f39415n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f39416o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private List<CampaignEx> f39417p;

    public b(Activity activity) {
        this.f39409h = activity;
    }

    public void a(k kVar) {
        this.f39403b = kVar;
    }

    public void a(List<CampaignEx> list) {
        this.f39417p = list;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.b getActivityProxy() {
        WebView webView = this.f39410i;
        if (webView == null) {
            return super.getActivityProxy();
        }
        if (this.f39402a == null) {
            this.f39402a = new i(webView);
        }
        return this.f39402a;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.i getIJSRewardVideoV1() {
        Activity activity;
        MBridgeContainerView mBridgeContainerView = this.f39412k;
        if (mBridgeContainerView == null || (activity = this.f39409h) == null) {
            return super.getIJSRewardVideoV1();
        }
        if (this.f39407f == null) {
            this.f39407f = new o(activity, mBridgeContainerView);
        }
        return this.f39407f;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public c getJSBTModule() {
        if (this.f39409h == null || this.f39414m == null) {
            return super.getJSBTModule();
        }
        if (this.f39408g == null) {
            this.f39408g = new j(this.f39409h, this.f39414m);
        }
        return this.f39408g;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public d getJSCommon() {
        CampaignEx campaignEx;
        List<CampaignEx> list;
        Activity activity = this.f39409h;
        if (activity == null || (campaignEx = this.f39413l) == null) {
            return super.getJSCommon();
        }
        if (this.f39403b == null) {
            this.f39403b = new k(activity, campaignEx);
        }
        if (this.f39413l.getDynamicTempCode() == 5 && (list = this.f39417p) != null) {
            d dVar = this.f39403b;
            if (dVar instanceof k) {
                ((k) dVar).a(list);
            }
        }
        this.f39403b.setActivity(this.f39409h);
        this.f39403b.setUnitId(this.f39416o);
        this.f39403b.a(this.f39415n);
        return this.f39403b;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public f getJSContainerModule() {
        MBridgeContainerView mBridgeContainerView = this.f39412k;
        if (mBridgeContainerView == null) {
            return super.getJSContainerModule();
        }
        if (this.f39406e == null) {
            this.f39406e = new m(mBridgeContainerView);
        }
        return this.f39406e;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public g getJSNotifyProxy() {
        WebView webView = this.f39410i;
        if (webView == null) {
            return super.getJSNotifyProxy();
        }
        if (this.f39405d == null) {
            this.f39405d = new n(webView);
        }
        return this.f39405d;
    }

    @Override // com.mbridge.msdk.video.signal.factory.a, com.mbridge.msdk.video.signal.factory.IJSFactory
    public com.mbridge.msdk.video.signal.j getJSVideoModule() {
        MBridgeVideoView mBridgeVideoView = this.f39411j;
        if (mBridgeVideoView == null) {
            return super.getJSVideoModule();
        }
        if (this.f39404c == null) {
            this.f39404c = new q(mBridgeVideoView);
        }
        return this.f39404c;
    }

    public b(Activity activity, MBridgeBTContainer mBridgeBTContainer, WebView webView) {
        this.f39409h = activity;
        this.f39414m = mBridgeBTContainer;
        this.f39410i = webView;
    }

    public b(Activity activity, WebView webView, MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, com.mbridge.msdk.video.signal.a.InterfaceC0410a interfaceC0410a) {
        this.f39409h = activity;
        this.f39410i = webView;
        this.f39411j = mBridgeVideoView;
        this.f39412k = mBridgeContainerView;
        this.f39413l = campaignEx;
        this.f39415n = interfaceC0410a;
        this.f39416o = mBridgeVideoView.getUnitId();
    }
}
