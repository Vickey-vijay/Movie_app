package com.mbridge.msdk.mbbanner.common.listener;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.setting.l;
import java.util.List;

/* JADX INFO: compiled from: ProxyBannerShowListener.java */
/* JADX INFO: loaded from: classes11.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f35623a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f35624b;

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(List<CampaignEx> list) {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.a(list);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void b() {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.b();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void c() {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.c();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void d() {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.d();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void onLeaveApp() {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.onLeaveApp();
        }
    }

    public e(c cVar, l lVar) {
        this.f35624b = lVar;
        this.f35623a = cVar;
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(com.mbridge.msdk.foundation.error.b bVar) {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.a(bVar);
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a() {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.a();
        }
    }

    @Override // com.mbridge.msdk.mbbanner.common.listener.c
    public void a(CampaignEx campaignEx) {
        c cVar = this.f35623a;
        if (cVar != null) {
            cVar.a(campaignEx);
        }
    }
}
