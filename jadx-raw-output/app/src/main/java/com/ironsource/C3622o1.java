package com.ironsource;

import com.ironsource.mediationsdk.IronSource;

/* JADX INFO: renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C3622o1 implements InterfaceC3640p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IronSource.a f30333a;

    /* JADX INFO: renamed from: com.ironsource.o1$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30334a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30334a = iArr;
        }
    }

    public C3622o1(IronSource.a aVar) {
        ck.p.j(aVar, "adFormat");
        this.f30333a = aVar;
    }

    @Override // com.ironsource.InterfaceC3640p1
    public InterfaceC3657q1 a(InterfaceC3566l1 interfaceC3566l1) {
        ck.p.j(interfaceC3566l1, "eventBaseData");
        int i10 = a.f30334a[this.f30333a.ordinal()];
        if (i10 == 1) {
            return new G9(interfaceC3566l1);
        }
        if (i10 == 2) {
            return new Yd(interfaceC3566l1);
        }
        if (i10 == 3) {
            return new R2(interfaceC3566l1);
        }
        throw new IllegalArgumentException("Unsupported ad format: " + this.f30333a);
    }
}
