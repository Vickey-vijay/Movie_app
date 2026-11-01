package io.appmetrica.analytics.impl;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class Um extends Di {
    public Um(Context context, String str) {
        super(context, str, "array");
    }

    @Override // io.appmetrica.analytics.impl.Di
    public final Object a(int i10) {
        return this.f55143a.getResources().getStringArray(i10);
    }

    public final String[] b(int i10) {
        return this.f55143a.getResources().getStringArray(i10);
    }
}
