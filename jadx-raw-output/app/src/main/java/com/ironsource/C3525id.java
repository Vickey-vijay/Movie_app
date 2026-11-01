package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: renamed from: com.ironsource.id, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3525id implements N7, N7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final K3 f29161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final S4 f29162b;

    /* JADX WARN: Multi-variable type inference failed */
    public C3525id() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.N7
    public synchronized M3 a(String str, LevelPlay.AdFormat adFormat) {
        ck.p.j(str, "placementName");
        ck.p.j(adFormat, "adFormat");
        String strA = new C3616nd(str, adFormat).a();
        M3 m3A = this.f29162b.a(strA);
        if (m3A.d()) {
            return m3A;
        }
        return this.f29161a.a(strA);
    }

    @Override // com.ironsource.N7.a
    public synchronized void b(String str, LevelPlay.AdFormat adFormat) {
        ck.p.j(str, "placementName");
        ck.p.j(adFormat, "adFormat");
        String strA = new C3616nd(str, adFormat).a();
        if (!this.f29162b.a(strA).d()) {
            this.f29161a.b(strA);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.id$a */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f29163a;

        static {
            int[] iArr = new int[O3.values().length];
            try {
                iArr[O3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29163a = iArr;
        }
    }

    public C3525id(K3 k10, S4 s10) {
        ck.p.j(k10, "cappingService");
        ck.p.j(s10, "deliveryHandler");
        this.f29161a = k10;
        this.f29162b = s10;
    }

    public /* synthetic */ C3525id(K3 k10, S4 s10, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? new K3(null, null, null, 7, null) : k10, (i10 & 2) != 0 ? new S4() : s10);
    }

    @Override // com.ironsource.N7.a
    public synchronized Object a(String str, LevelPlay.AdFormat adFormat, O3 o10, InterfaceC3679r7 interfaceC3679r7) {
        Object objA;
        ck.p.j(str, "placementName");
        ck.p.j(adFormat, "adFormat");
        ck.p.j(o10, "cappingType");
        ck.p.j(interfaceC3679r7, "cappingConfig");
        String strA = new C3616nd(str, adFormat).a();
        int i10 = a.f29163a[o10.ordinal()];
        if (i10 != 1) {
            if (i10 != 2 && i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            objA = this.f29161a.a(strA, o10, interfaceC3679r7);
        } else {
            objA = this.f29162b.a(strA, o10, interfaceC3679r7);
        }
        return objA;
    }
}
