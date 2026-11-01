package com.mbridge.msdk.splash.middle;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.j;
import com.mbridge.msdk.out.MBSplashLoadListener;
import com.mbridge.msdk.out.MBridgeIds;
import java.util.ArrayList;

/* JADX INFO: compiled from: SplashLoadListenerImpl.java */
/* JADX INFO: loaded from: classes5.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MBSplashLoadListener f37117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f37118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f37119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f37120d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private MBridgeIds f37121e;

    public void a(MBSplashLoadListener mBSplashLoadListener) {
        this.f37117a = mBSplashLoadListener;
    }

    public void a(String str) {
        this.f37120d = str;
    }

    public b(c cVar, MBridgeIds mBridgeIds) {
        this.f37118b = cVar;
        this.f37121e = mBridgeIds;
        if (mBridgeIds != null) {
            this.f37119c = mBridgeIds.getUnitId();
        }
    }

    public void a(CampaignEx campaignEx, int i10) {
        c cVar;
        c cVar2 = this.f37118b;
        if (cVar2 == null || !cVar2.g() || campaignEx == null) {
            return;
        }
        MBSplashLoadListener mBSplashLoadListener = this.f37117a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadSuccessed(this.f37121e, i10);
            this.f37117a.isSupportZoomOut(this.f37121e, campaignEx.getFlb() == 1);
        }
        this.f37118b.b(false);
        ArrayList arrayList = new ArrayList();
        arrayList.add(campaignEx);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), arrayList, this.f37119c, campaignEx.isBidCampaign());
        if (i10 != 2 || (cVar = this.f37118b) == null) {
            return;
        }
        cVar.b(campaignEx, 0, true);
    }

    public void a(com.mbridge.msdk.foundation.error.b bVar, int i10) {
        c cVar = this.f37118b;
        if (cVar == null || !cVar.g()) {
            return;
        }
        String str = "";
        if (bVar != null) {
            String strL = bVar.l();
            if (!TextUtils.isEmpty(strL)) {
                str = strL;
            }
        }
        MBSplashLoadListener mBSplashLoadListener = this.f37117a;
        if (mBSplashLoadListener != null) {
            mBSplashLoadListener.onLoadFailed(this.f37121e, str, i10);
        }
        this.f37118b.b(false);
        j.a(com.mbridge.msdk.foundation.controller.c.n().d(), str, this.f37119c, !TextUtils.isEmpty(this.f37120d), bVar != null ? bVar.d() : null);
    }
}
