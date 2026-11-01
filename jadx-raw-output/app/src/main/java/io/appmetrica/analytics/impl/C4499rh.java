package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4499rh extends Sg {
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        ((C4338l5) this.f55865a.f56214p).e();
        Sk sk2 = this.f55865a.f56208j;
        synchronized (sk2) {
            Ek ekB = sk2.b(q10);
            if (ekB.f55196g) {
                ekB.f55196g = false;
                Vk vk2 = ekB.f55191b;
                vk2.a(Vk.f56040i, Boolean.FALSE);
                vk2.b();
            }
            if (sk2.f55874g != 1) {
                sk2.b(sk2.f55873f, q10);
            }
            sk2.f55874g = 1;
        }
        return true;
    }

    public C4499rh(Y4 y10) {
        super(y10);
    }
}
