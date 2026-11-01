package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes7.dex */
public final class Wi extends Sg {
    @Override // io.appmetrica.analytics.impl.Sg
    public final boolean a(@NonNull Q5 q10) {
        String str = q10.f55780h;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        this.f55865a.f56201c.j(str).b();
        return false;
    }

    public Wi(@NonNull Y4 y10) {
        super(y10);
    }
}
