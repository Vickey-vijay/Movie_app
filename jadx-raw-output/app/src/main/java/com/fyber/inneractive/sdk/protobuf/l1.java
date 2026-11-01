package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f18232a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f18233b;

    public static String a(byte[] bArr) {
        return new String(bArr, f18232a);
    }

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f18233b = bArr;
        ByteBuffer.wrap(bArr);
    }

    public static z0 a(Object obj, Object obj2) {
        d2 d2Var = (d2) obj2;
        t0 t0Var = (t0) ((d2) obj).toBuilder();
        if (!t0Var.f18285a.getClass().isInstance(d2Var)) {
            throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
        }
        t0Var.c();
        t0.a(t0Var.f18286b, (z0) ((b) d2Var));
        return t0Var.b();
    }
}
