package com.inmobi.ads;

import ck.p;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C2769c2;
import com.inmobi.media.C2820e2;
import com.inmobi.media.Kb;
import com.inmobi.media.Y1;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements PreloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2769c2 f22313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiBanner f22314b;

    public d(InMobiBanner inMobiBanner) {
        this.f22314b = inMobiBanner;
        this.f22313a = new C2769c2(inMobiBanner);
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void load() {
        try {
            C2820e2 mAdManager$media_release = this.f22314b.getMAdManager$media_release();
            if (mAdManager$media_release != null) {
                mAdManager$media_release.o();
            }
        } catch (IllegalStateException e10) {
            String strAccess$getTAG$cp = InMobiBanner.access$getTAG$cp();
            p.i(strAccess$getTAG$cp, "access$getTAG$cp(...)");
            Kb.a((byte) 1, strAccess$getTAG$cp, e10.getMessage());
            Y1 mPubListener$media_release = this.f22314b.getMPubListener$media_release();
            if (mPubListener$media_release != null) {
                mPubListener$media_release.a(this.f22314b, new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
            }
        }
    }

    @Override // com.inmobi.ads.PreloadManager
    public final void preload() {
        this.f22314b.setEnableAutoRefresh(false);
        this.f22314b.a((PublisherCallbacks) this.f22313a, "Preload", false);
    }
}
