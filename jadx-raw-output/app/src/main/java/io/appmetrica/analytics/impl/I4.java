package io.appmetrica.analytics.impl;

import com.ironsource.C3426d4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
public final class I4 implements Y6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55337b;

    @Override // io.appmetrica.analytics.impl.Y6
    public final String a() {
        return this.f55337b;
    }

    @Override // io.appmetrica.analytics.impl.Y6
    public final String b() {
        return this.f55336a;
    }

    public I4(R4 r10) {
        String strB;
        Object[] objArr = new Object[1];
        if (r10.d()) {
            strB = C3426d4.i.Z;
        } else {
            strB = r10.b();
        }
        objArr[0] = strB;
        this.f55336a = String.format("component_%s.db", Arrays.copyOf(objArr, 1));
        this.f55337b = "db_metrica_" + r10;
    }
}
