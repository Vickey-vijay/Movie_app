package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class W2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final V2 f56060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final GZIPCompressor f56061b;

    public W2() {
        this(new V2(), new GZIPCompressor());
    }

    public W2(V2 v10, GZIPCompressor gZIPCompressor) {
        this.f56060a = v10;
        this.f56061b = gZIPCompressor;
    }

    public final byte[] a(byte[] bArr) {
        try {
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 16);
            V2 v10 = this.f56060a;
            byte[] bytes = "hBnBQbZrmjPXEWVJ".getBytes();
            v10.getClass();
            AESEncrypter aESEncrypter = new AESEncrypter(AESEncrypter.DEFAULT_ALGORITHM, bytes, bArrCopyOfRange);
            if (bArr != null && bArr.length != 0) {
                return this.f56061b.uncompress(aESEncrypter.decrypt(bArr, 16, bArr.length - 16));
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
