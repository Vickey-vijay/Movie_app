package com.ironsource;

import com.applovin.sdk.AppLovinEventTypes;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.ironsource.o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3621o0 extends C3768wb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final IronSource.a f30327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3772wf.b f30328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final E5 f30329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final L8 f30330e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f30331f;

    /* JADX INFO: renamed from: com.ironsource.o0$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30332a = new a();

        public static final C3621o0 a(IronSource.a aVar, E0.b bVar) {
            ck.p.j(aVar, "adFormat");
            ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
            return new C3621o0(aVar, bVar);
        }

        private a() {
        }
    }

    public C3621o0(IronSource.a aVar, E0.b bVar) {
        ck.p.j(aVar, "adFormat");
        ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f30330e = Lb.f26968s.d().e();
        this.f30331f = TimeUnit.HOURS.toMillis(1L);
        this.f30327b = aVar;
        this.f30329d = new E5(aVar, bVar, null, null, 12, null);
        C3772wf.b bVarB = C3772wf.b(aVar);
        ck.p.i(bVarB, "createLogFactory(adFormat)");
        this.f30328c = bVarB;
    }

    public static /* synthetic */ String a(C3621o0 c3621o0, String str, String str2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLogMessage");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        return c3621o0.a(str, str2);
    }

    public final String b(String str) {
        return a(this, str, (String) null, 2, (Object) null);
    }

    public final String c() {
        return a(this, (String) null, (String) null, 3, (Object) null);
    }

    public final IronSource.a d() {
        return this.f30327b;
    }

    public final String a(String str, String str2) {
        String strA = this.f30328c.a(str, str2);
        ck.p.i(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final com.ironsource.lifecycle.b b() {
        com.ironsource.lifecycle.b bVarD = com.ironsource.lifecycle.b.d();
        ck.p.i(bVarD, "getInstance()");
        return bVarD;
    }

    public final C3489gd c(String str) {
        ck.p.j(str, "placementName");
        C3379ab c3379abA = this.f30330e.a();
        if (c3379abA == null) {
            throw new IllegalStateException("Error getting sdk configurations");
        }
        C3489gd c3489gdC = c3379abA.c(LevelPlay.AdFormat.NATIVE_AD, str);
        if (c3489gdC != null) {
            return c3489gdC;
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final Za.a d(String str) {
        ck.p.j(str, "adUnitId");
        C3379ab c3379abA = this.f30330e.a();
        if (c3379abA != null) {
            return c3379abA.a(str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final E5 e() {
        return this.f30329d;
    }

    public final int f() {
        return Lb.f26968s.d().s().a(this.f30327b);
    }

    public final boolean g() {
        return Lb.f26968s.d().e().c();
    }

    public final C3489gd a(String str) {
        ck.p.j(str, "placementName");
        C3379ab c3379abA = this.f30330e.a();
        if (c3379abA != null) {
            C3489gd c3489gdC = c3379abA.c(LevelPlay.AdFormat.BANNER, str);
            if (c3489gdC != null) {
                return c3489gdC;
            }
            throw new IllegalStateException("Error getting placement");
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final InterfaceC3797y6.a b(LevelPlay.AdFormat adFormat, String str) {
        ck.p.j(adFormat, "adFormat");
        ck.p.j(str, "adUnitId");
        C3379ab c3379abA = this.f30330e.a();
        if (c3379abA != null) {
            return c3379abA.b(adFormat, str);
        }
        throw new IllegalStateException("Error getting sdk configurations");
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        ck.p.j(adFormat, "adFormat");
        C3379ab c3379abA = this.f30330e.a();
        return c3379abA != null ? c3379abA.b(adFormat) : this.f30331f;
    }

    public C3621o0(C3621o0 c3621o0, E0.b bVar) {
        ck.p.j(c3621o0, "adTools");
        ck.p.j(bVar, AppLovinEventTypes.USER_COMPLETED_LEVEL);
        this.f30330e = Lb.f26968s.d().e();
        this.f30331f = TimeUnit.HOURS.toMillis(1L);
        IronSource.a aVar = c3621o0.f30327b;
        this.f30327b = aVar;
        this.f30328c = c3621o0.f30328c;
        this.f30329d = new E5(aVar, bVar, c3621o0.f30329d.c(), null, 8, null);
    }

    public final C3489gd a(LevelPlay.AdFormat adFormat, String str) {
        C3379ab c3379abA;
        ck.p.j(adFormat, "adFormat");
        if (str == null || (c3379abA = this.f30330e.a()) == null) {
            return null;
        }
        return c3379abA.c(adFormat, str);
    }

    public final void a(Map<String, Object> map, ISBannerSize iSBannerSize) {
        ck.p.j(map, "data");
        ck.p.j(iSBannerSize, "size");
        com.ironsource.mediationsdk.l.a(map, iSBannerSize);
    }

    public final ISBannerSize a(LevelPlayAdSize levelPlayAdSize) {
        ck.p.j(levelPlayAdSize, C3426d4.i.O);
        return new C3565l0().b(levelPlayAdSize);
    }
}
