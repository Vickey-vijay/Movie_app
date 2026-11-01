package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.b0;
import com.mbridge.msdk.thrid.okhttp.u;

/* JADX INFO: compiled from: RealResponseBody.java */
/* JADX INFO: loaded from: classes8.dex */
public final class h extends b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f37608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f37609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.e f37610c;

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public long k() {
        return this.f37609b;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public u l() {
        String str = this.f37608a;
        if (str != null) {
            return u.b(str);
        }
        return null;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.b0
    public com.mbridge.msdk.thrid.okio.e m() {
        return this.f37610c;
    }

    public h(String str, long j10, com.mbridge.msdk.thrid.okio.e eVar) {
        this.f37608a = str;
        this.f37609b = j10;
        this.f37610c = eVar;
    }
}
