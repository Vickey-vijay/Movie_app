package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdSize;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.ab, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3379ab extends C3579le {
    public final boolean a(String str, LevelPlay.AdFormat adFormat) {
        Map<String, C3770wd.b> mapA;
        ck.p.j(str, "adUnitId");
        ck.p.j(adFormat, "adFormat");
        C3770wd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || !mapA.containsKey(str)) ? false : true;
    }

    public final InterfaceC3797y6.a b(LevelPlay.AdFormat adFormat, String str) {
        ck.p.j(adFormat, "adFormat");
        ck.p.j(str, "adUnitId");
        return new InterfaceC3797y6.a(a(adFormat, str));
    }

    public final List<C3803yc> c(LevelPlay.AdFormat adFormat) {
        Map<String, C3770wd.b> mapA;
        Set<String> setKeySet;
        List<C3803yc> listW;
        ck.p.j(adFormat, "adFormat");
        C3770wd.a aVar = g().d().a().get(adFormat);
        if (aVar != null && (mapA = aVar.a()) != null && (setKeySet = mapA.keySet()) != null) {
            ArrayList arrayList = new ArrayList(nj.t.v(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(d(adFormat, (String) it.next()));
            }
            List listX = nj.t.x(arrayList);
            if (listX != null && (listW = nj.b0.W(listX)) != null) {
                return listW;
            }
        }
        return nj.s.k();
    }

    /* JADX INFO: renamed from: com.ironsource.ab$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f28149a;

        static {
            int[] iArr = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LevelPlay.AdFormat.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f28149a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3379ab(C3579le c3579le) {
        super(c3579le);
        ck.p.j(c3579le, "sdkConfig");
    }

    public final List<C3803yc> d(LevelPlay.AdFormat adFormat, String str) {
        Map<String, C3770wd.b> mapA;
        C3770wd.b bVar;
        List<String> listA;
        ck.p.j(adFormat, "adFormat");
        ck.p.j(str, "adUnitId");
        C3770wd.a aVar = g().d().a().get(adFormat);
        if (aVar == null || (mapA = aVar.a()) == null || (bVar = mapA.get(str)) == null || (listA = bVar.a()) == null) {
            return nj.s.k();
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            C3803yc c3803yc = g().e().a().get((String) it.next());
            if (c3803yc != null) {
                arrayList.add(c3803yc);
            }
        }
        return arrayList;
    }

    public final C3542jd b(C3768wb c3768wb) {
        ck.p.j(c3768wb, "tools");
        return new C3542jd(c3768wb, g().a().a());
    }

    public final String h() {
        return g().a().b().c().a();
    }

    public final List<LevelPlayAdSize> i() {
        List<String> listA = g().a().c().b().a();
        ArrayList arrayList = new ArrayList(nj.t.v(listA, 10));
        Iterator<T> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release((String) it.next()));
        }
        return arrayList;
    }

    public final float j() {
        return g().a().c().b().b();
    }

    public final boolean k() {
        com.ironsource.mediationsdk.adquality.a aVarA = d().c().a();
        if (aVarA != null && aVarA.b()) {
            return true;
        }
        return false;
    }

    public final boolean l() {
        return g().a().b().e();
    }

    public final long b(LevelPlay.AdFormat adFormat) {
        C3688s.d dVarB;
        Long lD;
        ck.p.j(adFormat, "adFormat");
        C3688s c3688s = g().a().a().get(adFormat);
        long jLongValue = (c3688s == null || (dVarB = c3688s.b()) == null || (lD = dVarB.d()) == null) ? 60L : lD.longValue();
        return jLongValue > 0 ? TimeUnit.MINUTES.toMillis(jLongValue) : jLongValue;
    }

    public final Za.a a(String str) {
        long jD;
        ck.p.j(str, "adUnitId");
        T2 t2C = g().a().c();
        T2.b bVar = t2C.a().get(str);
        int iC = bVar != null ? bVar.c() : t2C.b().c();
        boolean zE = bVar != null ? bVar.e() : t2C.b().e();
        if (bVar != null) {
            jD = bVar.d();
        } else {
            jD = t2C.b().d();
        }
        return new Za.a(zE, iC, jD);
    }

    public final List<String> a(LevelPlay.AdFormat adFormat) {
        Map<String, C3770wd.b> mapA;
        Set<String> setKeySet;
        List<String> listO0;
        ck.p.j(adFormat, "adFormat");
        C3770wd.a aVar = g().d().a().get(adFormat);
        return (aVar == null || (mapA = aVar.a()) == null || (setKeySet = mapA.keySet()) == null || (listO0 = nj.b0.O0(setKeySet)) == null) ? nj.s.k() : listO0;
    }

    public final C3489gd c(LevelPlay.AdFormat adFormat, String str) {
        C3489gd c3489gdA;
        M9 m9A;
        String str2;
        ck.p.j(adFormat, "adFormat");
        int i10 = a.f28149a[adFormat.ordinal()];
        if (i10 == 1) {
            Zd zdF = d().c().f();
            if (zdF == null || (c3489gdA = zdF.a(str)) == null) {
                return null;
            }
            ck.p.i(c3489gdA, "getRewardedVideoPlacement(placementName)");
            return new C3489gd(c3489gdA.b(), c3489gdA.c(), c3489gdA.d(), c3489gdA.f(), c3489gdA.e(), c3489gdA.a());
        }
        if (i10 == 2) {
            H9 h9D = d().c().d();
            if (h9D == null || (m9A = h9D.a(str)) == null) {
                return null;
            }
            ck.p.i(m9A, "getInterstitialPlacement(placementName)");
            return new C3489gd(m9A);
        }
        if (i10 == 3) {
            U2 u2C = d().c().c();
            if (u2C != null) {
                C3497h3 c3497h3A = u2C.a(str);
                if (c3497h3A == null) {
                    c3497h3A = u2C.i();
                    str2 = "config.defaultBannerPlacement";
                } else {
                    str2 = "config.getBannerPlacemen…ig.defaultBannerPlacement";
                }
                ck.p.i(c3497h3A, str2);
                return new C3489gd(c3497h3A);
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        if (i10 == 4) {
            Qb qbE = d().c().e();
            if (qbE != null && str != null) {
                C3398bc c3398bcA = qbE.a(str);
                if (c3398bcA == null) {
                    c3398bcA = qbE.e();
                }
                if (c3398bcA != null) {
                    return new C3489gd(c3398bcA);
                }
            }
            throw new IllegalStateException("Error getting " + adFormat + " configurations");
        }
        throw new NoWhenBranchMatchedException();
    }

    public final C3723u0 a(C3768wb c3768wb) {
        ck.p.j(c3768wb, "tools");
        return new C3723u0(c3768wb, g().a().a());
    }

    private final InterfaceC3797y6.c a(LevelPlay.AdFormat adFormat, String str) {
        C3688s.d dVarB;
        C3702sd c3702sdG;
        Map<String, C3688s.d> mapA;
        C3688s.d dVar;
        C3702sd c3702sdG2;
        boolean z10 = adFormat == LevelPlay.AdFormat.REWARDED;
        C3688s c3688s = g().a().a().get(adFormat);
        InterfaceC3797y6.c cVarA = null;
        InterfaceC3797y6.c cVarA2 = (c3688s == null || (mapA = c3688s.a()) == null || (dVar = mapA.get(str)) == null || (c3702sdG2 = dVar.g()) == null) ? null : c3702sdG2.a();
        if (c3688s != null && (dVarB = c3688s.b()) != null && (c3702sdG = dVarB.g()) != null) {
            cVarA = c3702sdG.a();
        }
        if (cVarA2 == null) {
            cVarA2 = cVarA;
        }
        if (cVarA2 != null) {
            return cVarA2;
        }
        if (z10) {
            return InterfaceC3797y6.c.PROGRESSIVE_ON_SHOW_SUCCESS;
        }
        return InterfaceC3797y6.c.SINGLE;
    }

    public final Jd c(C3768wb c3768wb) {
        ck.p.j(c3768wb, "tools");
        C3688s c3688s = g().a().a().get(LevelPlay.AdFormat.REWARDED);
        return new Jd(c3768wb, c3688s != null ? c3688s.a() : null, c3688s != null ? c3688s.c() : null);
    }
}
