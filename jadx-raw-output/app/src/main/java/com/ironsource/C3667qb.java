package com.ironsource;

import android.app.Activity;
import androidx.appcompat.widget.ActivityChooserModel;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.rewarded.LevelPlayRewardedAdListener;

/* JADX INFO: renamed from: com.ironsource.qb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3667qb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C3415cb f30551a;

    /* JADX INFO: renamed from: com.ironsource.qb$a */
    public static final class a implements InterfaceC3774x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ L7 f30552a;

        public a(L7 l10) {
            this.f30552a = l10;
        }

        @Override // com.ironsource.InterfaceC3774x0
        public AbstractC3757w0 a(boolean z10, C3476g0 c3476g0) {
            ck.p.j(c3476g0, "adProperties");
            return Td.f27711z.a(c3476g0, this.f30552a.e().a(), z10);
        }
    }

    public C3667qb(String str, C3415cb.b bVar, C3621o0 c3621o0, C3518i6 c3518i6, L7 l10, InterfaceC3710t4 interfaceC3710t4, C3815z7 c3815z7) {
        ck.p.j(str, "adUnitId");
        ck.p.j(bVar, "config");
        ck.p.j(c3621o0, "adTools");
        ck.p.j(c3518i6, "adControllerFactory");
        ck.p.j(l10, IronSourceConstants.EVENTS_PROVIDER);
        ck.p.j(interfaceC3710t4, "currentTimeProvider");
        ck.p.j(c3815z7, "idFactory");
        this.f30551a = new C3415cb(LevelPlay.AdFormat.REWARDED, str, bVar, c3621o0, c3518i6, a(l10), l10, interfaceC3710t4, c3815z7);
    }

    public final String a() {
        String string = this.f30551a.e().toString();
        ck.p.i(string, "fullScreenAdInternal.adId.toString()");
        return string;
    }

    public final void a(Activity activity, String str) {
        ck.p.j(activity, ActivityChooserModel.ATTRIBUTE_ACTIVITY);
        IronLog.API.info("LevelPlayRewardedAd.showAd() placementName: " + str);
        this.f30551a.a(activity, str);
    }

    public final boolean b() {
        IronLog.API.info("LevelPlayRewardedAd.isAdReady()");
        return this.f30551a.m();
    }

    public final void c() {
        IronLog.API.info("LevelPlayRewardedAd.loadAd()");
        this.f30551a.n();
    }

    public final void a(LevelPlayRewardedAdListener levelPlayRewardedAdListener) {
        IronLog.API.info("LevelPlayRewardedAd.setListener()");
        this.f30551a.a(levelPlayRewardedAdListener != null ? C3683rb.b(levelPlayRewardedAdListener) : null);
    }

    private final a a(L7 l10) {
        return new a(l10);
    }
}
