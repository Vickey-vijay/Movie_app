package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.backport.Function;
import io.appmetrica.analytics.coreutils.internal.io.Base64Utils;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: loaded from: classes5.dex */
public final class Gd implements Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Id f55266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Fd f55267b;

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String apply(File file) {
        byte[] bArrC;
        FileInputStream fileInputStream;
        try {
            String absolutePath = file.getAbsolutePath();
            if (absolutePath != null) {
                try {
                    fileInputStream = new FileInputStream(new File(absolutePath));
                    try {
                        bArrC = yj.a.c(fileInputStream);
                        mo.a((Closeable) fileInputStream);
                    } catch (Throwable unused) {
                        mo.a((Closeable) fileInputStream);
                        bArrC = null;
                    }
                } catch (Throwable unused2) {
                    fileInputStream = null;
                }
            } else {
                bArrC = null;
            }
            if (bArrC == null) {
                return null;
            }
            if (!(!(bArrC.length == 0))) {
                bArrC = null;
            }
            if (bArrC != null) {
                return Base64Utils.compressBase64(MessageNano.toByteArray(this.f55267b.fromModel(new Ld(bArrC, this.f55266a))));
            }
            return null;
        } catch (Throwable unused3) {
            return null;
        }
    }

    public Gd(Id id2, Fd fd2) {
        this.f55266a = id2;
        this.f55267b = fd2;
    }
}
