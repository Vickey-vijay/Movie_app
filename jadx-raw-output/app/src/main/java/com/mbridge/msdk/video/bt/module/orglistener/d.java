package com.mbridge.msdk.video.bt.module.orglistener;

import android.content.Context;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: compiled from: ProxyShowRewardListener.java */
/* JADX INFO: loaded from: classes8.dex */
public class d extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h f38558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.mbridge.msdk.videocommon.setting.c f38559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f38560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f38561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f38562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f38563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f38564i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f38565j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f38566k = false;

    /* JADX WARN: Code duplicated, block: B:9:0x002c  */
    private void a(com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx) {
        long jB0;
        try {
            String strB = com.mbridge.msdk.foundation.controller.c.n().b();
            if (TextUtils.isEmpty(strB)) {
                jB0 = 0;
            } else {
                com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(strB);
                if (gVarD == null) {
                    gVarD = com.mbridge.msdk.setting.h.b().a();
                }
                if (gVarD != null) {
                    jB0 = gVarD.b0() * 1000;
                } else {
                    jB0 = 0;
                }
            }
            com.mbridge.msdk.videocommon.setting.a aVarC = com.mbridge.msdk.videocommon.setting.b.b().c();
            long jE = aVarC != null ? aVarC.e() : 0L;
            if (campaignEx != null) {
                if (!campaignEx.isSpareOffer(jE, jB0)) {
                    campaignEx.setSpareOfferFlag(0);
                    campaignEx.setCbt(0);
                    return;
                }
                campaignEx.setSpareOfferFlag(1);
                if (cVar.A() == 1) {
                    campaignEx.setCbt(1);
                } else {
                    campaignEx.setCbt(0);
                }
            }
        } catch (Exception unused) {
        }
    }

    public d(Context context, boolean z10, com.mbridge.msdk.videocommon.setting.c cVar, CampaignEx campaignEx, h hVar, String str, String str2) {
        this.f38558c = hVar;
        this.f38559d = cVar;
        this.f38560e = str2;
        this.f38561f = str;
        this.f38562g = z10;
        this.f38563h = context;
        a(cVar, campaignEx);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void b(String str, String str2) {
        super.b(str, str2);
        h hVar = this.f38558c;
        if (hVar != null) {
            hVar.b(str, str2);
            this.f38558c.a(5, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar) {
        super.a(cVar);
        if (this.f38558c == null || this.f38564i) {
            return;
        }
        this.f38564i = true;
        b();
        this.f38558c.a(cVar);
        this.f38558c.a(2, this.f38561f, this.f38560e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, boolean z10, com.mbridge.msdk.videocommon.entity.c cVar2) {
        super.a(cVar, z10, cVar2);
        h hVar = this.f38558c;
        if (hVar == null || this.f38566k) {
            return;
        }
        this.f38566k = true;
        hVar.a(7, this.f38561f, this.f38560e);
        this.f38558c.a(cVar, z10, cVar2);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, int i10) {
        super.a(z10, i10);
        h hVar = this.f38558c;
        if (hVar == null || this.f38566k) {
            return;
        }
        hVar.a(z10, i10);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(com.mbridge.msdk.foundation.same.report.metrics.c cVar, String str) {
        super.a(cVar, str);
        if (this.f38558c == null || this.f38565j) {
            return;
        }
        this.f38565j = true;
        a();
        this.f38558c.a(cVar, str);
        this.f38558c.a(4, this.f38561f, this.f38560e);
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(boolean z10, String str, String str2) {
        super.a(z10, str, str2);
        h hVar = this.f38558c;
        if (hVar != null) {
            hVar.a(z10, str, str2);
        }
    }

    @Override // com.mbridge.msdk.video.bt.module.orglistener.b, com.mbridge.msdk.video.bt.module.orglistener.h
    public void a(String str, String str2) {
        super.a(str, str2);
        h hVar = this.f38558c;
        if (hVar != null) {
            hVar.a(str, str2);
            this.f38558c.a(6, str, str2);
        }
    }
}
