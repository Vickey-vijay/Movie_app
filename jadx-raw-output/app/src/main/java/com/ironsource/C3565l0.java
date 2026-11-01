package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlayAdSize;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3565l0 extends C3768wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final E5 f29387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3772wf.b f29388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L8 f29389d;

    public static /* synthetic */ String a(C3565l0 c3565l0, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3565l0.a(str, str2);
    }

    private final ISBannerSize c(LevelPlayAdSize levelPlayAdSize) {
        if (ck.p.e(levelPlayAdSize, LevelPlayAdSize.LARGE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.l.f29839b, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (ck.p.e(levelPlayAdSize, LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new ISBannerSize(com.ironsource.mediationsdk.l.f29840c, levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
        }
        if (ck.p.e(levelPlayAdSize, LevelPlayAdSize.LEADERBOARD)) {
            return new ISBannerSize(com.ironsource.mediationsdk.l.f29842e, 0, 0);
        }
        return ck.p.e(levelPlayAdSize, LevelPlayAdSize.Companion.createCustomSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight())) ? new ISBannerSize(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()) : new ISBannerSize("BANNER", levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight());
    }

    public final List<LevelPlayAdSize> b() {
        C3379ab c3379abA = this.f29389d.a();
        if (c3379abA != null) {
            return c3379abA.i();
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final String a(String str, String str2) {
        String strA = this.f29388c.a(str, str2);
        ck.p.i(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final boolean d() {
        return Lb.f26968s.d().e().c();
    }

    public C3565l0() {
        IronSource.a aVar = IronSource.a.BANNER;
        this.f29387b = new E5(aVar, E0.b.MEDIATION, null, null, 12, null);
        C3772wf.b bVarB = C3772wf.b(aVar);
        ck.p.i(bVarB, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.f29388c = bVarB;
        this.f29389d = Lb.f26968s.d().e();
    }

    public final int a(int i10) {
        return com.ironsource.mediationsdk.l.a(i10);
    }

    private final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        LevelPlayAdSize fallbackAdSize$mediationsdk_release = levelPlayAdSize.getFallbackAdSize$mediationsdk_release();
        if (fallbackAdSize$mediationsdk_release == null) {
            fallbackAdSize$mediationsdk_release = LevelPlayAdSize.BANNER;
        }
        ISBannerSize iSBannerSizeB = b(fallbackAdSize$mediationsdk_release);
        iSBannerSizeB.setAdaptive(true);
        com.ironsource.mediationsdk.o.f29923a.a(iSBannerSizeB, new Y7(levelPlayAdSize.getWidth(), levelPlayAdSize.getHeight()));
        return iSBannerSizeB;
    }

    public final Integer b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Float fC = c();
        if (fC != null) {
            return Integer.valueOf(ek.b.c(fC.floatValue() * C3445e5.f28736a.a(context)));
        }
        return null;
    }

    public final ISBannerSize b(LevelPlayAdSize levelPlayAdSize) {
        ck.p.j(levelPlayAdSize, "size");
        boolean zIsAdaptive = levelPlayAdSize.isAdaptive();
        if (zIsAdaptive) {
            return a(levelPlayAdSize);
        }
        if (zIsAdaptive) {
            throw new NoWhenBranchMatchedException();
        }
        return c(levelPlayAdSize);
    }

    private final Float c() {
        C3379ab c3379abA = this.f29389d.a();
        Float fValueOf = c3379abA != null ? Float.valueOf(c3379abA.j()) : null;
        if (fValueOf != null) {
            return fValueOf;
        }
        this.f29387b.h().f("MaxScreenSizePercentageForBannerHeight is null: Error getting sdk configurations");
        return null;
    }
}
