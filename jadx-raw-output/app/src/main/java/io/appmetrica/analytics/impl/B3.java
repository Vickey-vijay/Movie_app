package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes2.dex */
public final class B3 extends S7 {
    @Override // io.appmetrica.analytics.impl.S7
    public final boolean a(C4510s3 c4510s3, C4510s3 c4510s4) {
        if (!mo.a(c4510s4.f57645a)) {
            if (mo.a(c4510s3.f57645a)) {
                return false;
            }
            T7 t10 = c4510s3.f57646b;
            if (t10 == T7.f55911c) {
                if (((Number) this.f55854a.a(t10)).intValue() < ((Number) this.f55854a.a(c4510s4.f57646b)).intValue()) {
                    return false;
                }
            } else if (((Number) this.f55854a.a(t10)).intValue() <= ((Number) this.f55854a.a(c4510s4.f57646b)).intValue()) {
                return false;
            }
        }
        return true;
    }
}
