package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: compiled from: Header.java */
/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37657d = com.mbridge.msdk.thrid.okio.f.c(StringUtils.PROCESS_POSTFIX_DELIMITER);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37658e = com.mbridge.msdk.thrid.okio.f.c(":status");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37659f = com.mbridge.msdk.thrid.okio.f.c(":method");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37660g = com.mbridge.msdk.thrid.okio.f.c(":path");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37661h = com.mbridge.msdk.thrid.okio.f.c(":scheme");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final com.mbridge.msdk.thrid.okio.f f37662i = com.mbridge.msdk.thrid.okio.f.c(":authority");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f37663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.mbridge.msdk.thrid.okio.f f37664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37665c;

    /* JADX INFO: compiled from: Header.java */
    public interface a {
    }

    public c(String str, String str2) {
        this(com.mbridge.msdk.thrid.okio.f.c(str), com.mbridge.msdk.thrid.okio.f.c(str2));
    }

    public String toString() {
        return com.mbridge.msdk.thrid.okhttp.internal.c.a("%s: %s", this.f37663a.m(), this.f37664b.m());
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, String str) {
        this(fVar, com.mbridge.msdk.thrid.okio.f.c(str));
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f37663a.equals(cVar.f37663a) && this.f37664b.equals(cVar.f37664b);
    }

    public int hashCode() {
        return ((this.f37663a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f37664b.hashCode();
    }

    public c(com.mbridge.msdk.thrid.okio.f fVar, com.mbridge.msdk.thrid.okio.f fVar2) {
        this.f37663a = fVar;
        this.f37664b = fVar2;
        this.f37665c = fVar.j() + 32 + fVar2.j();
    }
}
