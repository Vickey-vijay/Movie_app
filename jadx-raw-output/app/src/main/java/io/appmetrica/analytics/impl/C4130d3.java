package io.appmetrica.analytics.impl;

import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4130d3 implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f56550a;

    public C4130d3() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        byte[] bArrDecode = new byte[0];
        String str = o10.f55674b;
        if (str != null) {
            try {
                bArrDecode = Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        I8 i10 = this.f56550a;
        return ((H8) i10.f55340a.a(o10.f55687o)).a(bArrDecode);
    }

    public C4130d3(I8 i10) {
        this.f56550a = i10;
    }
}
