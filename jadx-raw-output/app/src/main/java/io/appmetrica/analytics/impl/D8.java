package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class D8 implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f55132a;

    public D8() {
        this(new I8());
    }

    public D8(I8 i10) {
        this.f55132a = i10;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        String str = o10.f55674b;
        return ((H8) this.f55132a.f55340a.a(o10.f55687o)).a(str != null ? StringUtils.getUTF8Bytes(str) : new byte[0]);
    }
}
