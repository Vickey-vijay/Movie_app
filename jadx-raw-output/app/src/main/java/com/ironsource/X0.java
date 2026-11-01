package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes5.dex */
public final class X0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X0 f27846a = new X0();

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27847a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[IronSource.a.NATIVE_AD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f27847a = iArr;
        }
    }

    public static final Q6.a a(IronSource.a aVar) {
        ck.p.j(aVar, "adUnit");
        int i10 = a.f27847a[aVar.ordinal()];
        if (i10 == 1) {
            return Q6.a.REWARDED_VIDEO;
        }
        if (i10 == 2) {
            return Q6.a.INTERSTITIAL;
        }
        if (i10 == 3) {
            return Q6.a.BANNER;
        }
        if (i10 == 4) {
            return Q6.a.NATIVE_AD;
        }
        throw new NoWhenBranchMatchedException();
    }

    private X0() {
    }
}
