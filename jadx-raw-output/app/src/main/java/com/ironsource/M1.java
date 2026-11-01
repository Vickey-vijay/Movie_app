package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;

/* JADX INFO: loaded from: classes6.dex */
public class M1 implements InterfaceC3628o7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I7 f27025a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private N1 f27026b;

    public static final class a {
        public final N1 a(K1 k10, I7 i10) {
            ck.p.j(i10, "featureAvailabilityService");
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + i10.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (k10 != null ? Boolean.valueOf(k10.k()) : null));
            boolean z10 = false;
            if (i10.a()) {
                C3400be.i().a(new C5(D5.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, IronSourceUtils.b(false)));
            }
            if ((k10 != null ? k10.k() : false) && i10.a()) {
                z10 = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z10);
            return z10 ? new C3741v1() : new X7();
        }
    }

    @Override // com.ironsource.InterfaceC3628o7
    public void a(K1 k10) {
        if (this.f27026b == null) {
            this.f27026b = new a().a(k10, this.f27025a);
        }
    }

    public M1(I7 i10) {
        ck.p.j(i10, "featureAvailabilityService");
        this.f27025a = i10;
    }

    @Override // com.ironsource.N1
    public void b(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        N1 n10 = this.f27026b;
        if (n10 != null) {
            n10.b(interfaceC3593ma);
        }
    }

    @Override // com.ironsource.N1
    public void a(InterfaceC3593ma interfaceC3593ma) {
        ck.p.j(interfaceC3593ma, "observer");
        N1 n10 = this.f27026b;
        if (n10 != null) {
            n10.a(interfaceC3593ma);
        }
    }
}
