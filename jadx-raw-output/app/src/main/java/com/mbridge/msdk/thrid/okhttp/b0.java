package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ResponseBody.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b0 implements Closeable {

    /* JADX INFO: compiled from: ResponseBody.java */
    public static class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f37380a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f37381b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.thrid.okio.e f37382c;

        public a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
            this.f37380a = uVar;
            this.f37381b = j10;
            this.f37382c = eVar;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public long k() {
            return this.f37381b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public u l() {
            return this.f37380a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.b0
        public com.mbridge.msdk.thrid.okio.e m() {
            return this.f37382c;
        }
    }

    public static b0 a(u uVar, byte[] bArr) {
        return a(uVar, bArr.length, new com.mbridge.msdk.thrid.okio.c().write(bArr));
    }

    public abstract long k();

    public abstract u l();

    public abstract com.mbridge.msdk.thrid.okio.e m();

    public static b0 a(u uVar, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        if (eVar != null) {
            return new a(uVar, j10, eVar);
        }
        throw new NullPointerException("source == null");
    }

    private Charset h() {
        u uVarL = l();
        if (uVarL != null) {
            return uVarL.a(com.mbridge.msdk.thrid.okhttp.internal.c.f37514j);
        }
        return com.mbridge.msdk.thrid.okhttp.internal.c.f37514j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        com.mbridge.msdk.thrid.okhttp.internal.c.a(m());
    }

    public final InputStream d() {
        return m().j();
    }

    public final String n() throws IOException {
        com.mbridge.msdk.thrid.okio.e eVarM = m();
        try {
            return eVarM.a(com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM, h()));
        } finally {
            com.mbridge.msdk.thrid.okhttp.internal.c.a(eVarM);
        }
    }
}
