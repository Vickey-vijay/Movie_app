package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C2615oC implements C1S {
    public final C2620oH A00;
    public final AbstractC1121Am<Integer> A01;
    public static final String A04 = AbstractC09664a.A0h(0);
    public static final String A03 = AbstractC09664a.A0h(1);
    public static final C1R<C2615oC> A02 = new C1R() { // from class: com.facebook.ads.redexgen.X.oD
        @Override // com.facebook.ads.redexgen.core.C1R
        public final C1S A6X(Bundle bundle) {
            return C2615oC.A00(bundle);
        }
    };

    public C2615oC(C2620oH c2620oH, List<Integer> trackIndices) {
        if (trackIndices.isEmpty() || (((Integer) Collections.min(trackIndices)).intValue() >= 0 && ((Integer) Collections.max(trackIndices)).intValue() < c2620oH.A01)) {
            this.A00 = c2620oH;
            this.A01 = AbstractC1121Am.A05(trackIndices);
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public static /* synthetic */ C2615oC A00(Bundle bundle) {
        return new C2615oC((C2620oH) C2620oH.A06.A6X((Bundle) C3M.A01(bundle.getBundle(A04))), AD.A0A((int[]) C3M.A01(bundle.getIntArray(A03))));
    }

    public final int A01() {
        return this.A00.A02;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2615oC c2615oC = (C2615oC) obj;
        return this.A00.equals(c2615oC.A00) && this.A01.equals(c2615oC.A01);
    }

    public final int hashCode() {
        return this.A00.hashCode() + (this.A01.hashCode() * 31);
    }
}
