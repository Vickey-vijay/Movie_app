package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4099bo extends Sg {
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        String strJ = this.f55865a.f56201c.j();
        String str = q10.f55780h;
        this.f55865a.f56201c.j(str).b();
        if (TextUtils.equals(strJ, str)) {
            return false;
        }
        this.f55865a.a(N3.o());
        return false;
    }

    public C4099bo(Y4 y10) {
        super(y10);
    }
}
