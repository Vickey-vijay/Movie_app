package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;

/* JADX INFO: loaded from: classes.dex */
public final class Qn implements uo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final I8 f55812a;

    public Qn() {
        this(new I8());
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        byte[] bArrDecompressBase64GzipAsBytes = new byte[0];
        try {
            bArrDecompressBase64GzipAsBytes = Base64Utils.decompressBase64GzipAsBytes(o10.f55674b);
        } catch (Throwable unused) {
        }
        byte[] bArrA = ((H8) this.f55812a.f55340a.a(o10.f55687o)).a(bArrDecompressBase64GzipAsBytes);
        return bArrA == null ? new byte[0] : bArrA;
    }

    public Qn(I8 i10) {
        this.f55812a = i10;
    }

    @NonNull
    @VisibleForTesting
    public final I8 a() {
        return this.f55812a;
    }
}
