package com.mbridge.msdk.thrid.okhttp;

import java.io.IOException;

/* JADX INFO: compiled from: RequestBody.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class z {

    /* JADX INFO: compiled from: RequestBody.java */
    public static class a extends z {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ u f38019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f38020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ byte[] f38021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f38022d;

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public long a() {
            return this.f38020b;
        }

        public a(u uVar, int i10, byte[] bArr, int i11) {
            this.f38019a = uVar;
            this.f38020b = i10;
            this.f38021c = bArr;
            this.f38022d = i11;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException {
            dVar.write(this.f38021c, this.f38022d, this.f38020b);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.z
        public u b() {
            return this.f38019a;
        }
    }

    public static z a(u uVar, byte[] bArr) {
        return a(uVar, bArr, 0, bArr.length);
    }

    public abstract long a() throws IOException;

    public abstract void a(com.mbridge.msdk.thrid.okio.d dVar) throws IOException;

    public abstract u b();

    public static z a(u uVar, byte[] bArr, int i10, int i11) {
        if (bArr == null) {
            throw new NullPointerException("content == null");
        }
        com.mbridge.msdk.thrid.okhttp.internal.c.a(bArr.length, i10, i11);
        return new a(uVar, i11, bArr, i10);
    }
}
