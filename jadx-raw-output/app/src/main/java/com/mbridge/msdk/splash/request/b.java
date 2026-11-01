package com.mbridge.msdk.splash.request;

import com.mbridge.msdk.foundation.entity.CampaignUnit;
import com.mbridge.msdk.out.Frame;
import com.mbridge.msdk.tracker.network.g;
import java.util.List;

/* JADX INFO: compiled from: SplashLoadResponseHandler.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37155d;

    public abstract void a(CampaignUnit campaignUnit, int i10);

    @Override // com.mbridge.msdk.splash.request.d
    public void a(List<Frame> list) {
    }

    @Override // com.mbridge.msdk.splash.request.d
    public void a(List<g> list, CampaignUnit campaignUnit) {
        a(campaignUnit, this.f37155d);
    }

    public abstract void b(int i10, String str);

    @Override // com.mbridge.msdk.splash.request.d
    public void a(int i10, String str) {
        b(i10, str);
    }

    public b(int i10) {
        this.f37155d = i10;
    }
}
