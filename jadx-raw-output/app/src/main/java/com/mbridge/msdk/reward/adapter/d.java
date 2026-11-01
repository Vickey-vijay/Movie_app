package com.mbridge.msdk.reward.adapter;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: RewardVideoCampaignState.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<CampaignEx> f36631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private CampaignEx f36632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f36633c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f36634d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36635e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f36636f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36637g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f36638h = 0;

    public void a(CopyOnWriteArrayList<CampaignEx> copyOnWriteArrayList) {
        this.f36631a = copyOnWriteArrayList;
    }

    public void a(boolean z10) {
        this.f36633c = z10;
    }

    public CopyOnWriteArrayList<CampaignEx> b() {
        return this.f36631a;
    }

    public int c() {
        return this.f36637g;
    }

    public int d() {
        return this.f36636f;
    }

    public boolean e() {
        return this.f36633c;
    }

    public void a(CampaignEx campaignEx) {
        if (campaignEx != null) {
            this.f36632b = campaignEx;
            this.f36634d = campaignEx.getSecondRequestIndex();
            this.f36635e = campaignEx.getSecondShowIndex();
            this.f36636f = campaignEx.getFilterCallBackState();
            this.f36638h = campaignEx.getFilterAdsShowCallState();
            this.f36637g = campaignEx.getFilterAdsVideoCallState();
        }
    }

    public boolean a() {
        return this.f36634d == 1 && this.f36633c;
    }
}
