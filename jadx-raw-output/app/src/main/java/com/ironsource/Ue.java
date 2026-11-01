package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.unity3d.mediation.LevelPlay;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
class Ue implements P8, P8.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f27757c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<IronSource.a, Integer> f27758a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C3468fa f27759b = new C3468fa();

    private void a(IronSource.a aVar, int i10) {
        this.f27758a.put(aVar, Integer.valueOf(i10));
        int i11 = a.f27760a[aVar.ordinal()];
        if (i11 == 1) {
            this.f27759b.d(i10);
            return;
        }
        if (i11 == 2) {
            this.f27759b.b(i10);
        } else if (i11 == 3) {
            this.f27759b.a(i10);
        } else {
            if (i11 != 4) {
                return;
            }
            this.f27759b.c(i10);
        }
    }

    @Override // com.ironsource.P8.a
    public synchronized void b(IronSource.a aVar) {
        if (aVar == null) {
            return;
        }
        a(aVar, this.f27758a.get(aVar).intValue() + 1);
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27760a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            f27760a = iArr;
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27760a[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27760a[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27760a[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public Ue() {
        for (IronSource.a aVar : IronSource.a.values()) {
            a(aVar, 1);
        }
    }

    @Override // com.ironsource.P8
    public synchronized int a(IronSource.a aVar) {
        int iIntValue = -1;
        if (aVar == null) {
            return -1;
        }
        Integer num = this.f27758a.get(aVar);
        if (num != null) {
            iIntValue = num.intValue();
        }
        return iIntValue;
    }

    @Override // com.ironsource.P8
    public int a(LevelPlay.AdFormat adFormat) {
        if (adFormat == null) {
            return -1;
        }
        return a(com.unity3d.mediation.a.a(adFormat)) - 1;
    }
}
