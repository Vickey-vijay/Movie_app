package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C10567m {
    public static final C10567m A03;
    public final String A00;
    public final C10557l A01;
    public final Object A02;

    static {
        C10567m c10567m;
        if (AbstractC09664a.A02 < 31) {
            c10567m = new C10567m("");
        } else {
            c10567m = new C10567m(C10557l.A01, "");
        }
        A03 = c10567m;
    }

    public C10567m(C10557l c10557l, String str) {
        this.A01 = c10557l;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C10567m(String str) {
        C3M.A08(AbstractC09664a.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C10557l) C3M.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10567m)) {
            return false;
        }
        C10567m c10567m = (C10567m) obj;
        if (Objects.equals(this.A00, c10567m.A00) && Objects.equals(this.A01, c10567m.A01) && Objects.equals(this.A02, c10567m.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
