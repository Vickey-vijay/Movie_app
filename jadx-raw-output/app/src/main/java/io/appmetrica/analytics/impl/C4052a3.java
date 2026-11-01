package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4052a3 extends N2 {
    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final byte[] a(@Nullable byte[] bArr) {
        if (bArr == null) {
            return bArr;
        }
        int length = bArr.length;
        int i10 = this.f55598a;
        if (length <= i10) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        this.f55600c.warning("\"%s\" %s exceeded limit of %d bytes", this.f55599b, bArr, Integer.valueOf(this.f55598a));
        return bArr2;
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f55598a;
    }

    public C4052a3(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f55599b;
    }
}
