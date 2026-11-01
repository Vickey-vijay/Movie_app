package com.facebook.ads.redexgen.core;

import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.le, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2459le implements InterfaceC1213Ed {
    public final int A00;

    public C2459le() {
        this(-1);
    }

    public C2459le(int i10) {
        this.A00 = i10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1213Ed
    public final int A8R(int i10) {
        if (this.A00 == -1) {
            if (i10 == 7) {
                return 6;
            }
            return 3;
        }
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1213Ed
    public final long A8m(C1212Ec c1212Ec) {
        IOException iOException = c1212Ec.A03;
        if ((iOException instanceof C09222i) || (iOException instanceof FileNotFoundException) || (iOException instanceof C10909h) || (iOException instanceof C1223En) || C09914z.A00(iOException)) {
            return -9223372036854775807L;
        }
        return Math.min((c1212Ec.A00 - 1) * 1000, 5000);
    }
}
