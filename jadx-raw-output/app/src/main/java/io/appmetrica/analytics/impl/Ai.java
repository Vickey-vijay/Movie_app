package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public final class Ai extends B4 {
    @Override // io.appmetrica.analytics.impl.B4
    public final boolean a(@NonNull Q5 q10, @NonNull C4586v4 c4586v4) {
        Bundle bundle = q10.f55785m;
        this.f55001a.f58006k.a(new C4636x4(bundle != null ? (ResultReceiver) bundle.getParcelable("io.appmetrica.analytics.impl.referrer.common.ReferrerResultReceiver") : null));
        return false;
    }

    public Ai(C4661y4 c4661y4) {
        super(c4661y4);
    }
}
