package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.a0;
import com.mbridge.msdk.thrid.okhttp.o;
import com.mbridge.msdk.thrid.okhttp.t;
import com.mbridge.msdk.thrid.okhttp.y;
import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes8.dex */
public final class g implements t.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<t> f37596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.g f37597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f37598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.internal.connection.c f37599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f37600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f37601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okhttp.d f37602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f37603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f37604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f37605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f37606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f37607l;

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int a() {
        return this.f37604i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public a0 a(y yVar) throws IOException {
        return a(yVar, this.f37597b, this.f37598c, this.f37599d);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int b() {
        return this.f37605j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public int c() {
        return this.f37606k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.t.a
    public y d() {
        return this.f37601f;
    }

    public com.mbridge.msdk.thrid.okhttp.d e() {
        return this.f37602g;
    }

    public com.mbridge.msdk.thrid.okhttp.h f() {
        return this.f37599d;
    }

    public o g() {
        return this.f37603h;
    }

    public c h() {
        return this.f37598c;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.connection.g i() {
        return this.f37597b;
    }

    public g(List<t> list, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2, int i10, y yVar, com.mbridge.msdk.thrid.okhttp.d dVar, o oVar, int i11, int i12, int i13) {
        this.f37596a = list;
        this.f37599d = cVar2;
        this.f37597b = gVar;
        this.f37598c = cVar;
        this.f37600e = i10;
        this.f37601f = yVar;
        this.f37602g = dVar;
        this.f37603h = oVar;
        this.f37604i = i11;
        this.f37605j = i12;
        this.f37606k = i13;
    }

    public a0 a(y yVar, com.mbridge.msdk.thrid.okhttp.internal.connection.g gVar, c cVar, com.mbridge.msdk.thrid.okhttp.internal.connection.c cVar2) throws IOException {
        if (this.f37600e < this.f37596a.size()) {
            this.f37607l++;
            if (this.f37598c != null && !this.f37599d.a(yVar.g())) {
                throw new IllegalStateException("network interceptor " + this.f37596a.get(this.f37600e - 1) + " must retain the same host and port");
            }
            if (this.f37598c != null && this.f37607l > 1) {
                throw new IllegalStateException("network interceptor " + this.f37596a.get(this.f37600e - 1) + " must call proceed() exactly once");
            }
            g gVar2 = new g(this.f37596a, gVar, cVar, cVar2, this.f37600e + 1, yVar, this.f37602g, this.f37603h, this.f37604i, this.f37605j, this.f37606k);
            t tVar = this.f37596a.get(this.f37600e);
            a0 a0VarA = tVar.a(gVar2);
            if (cVar != null && this.f37600e + 1 < this.f37596a.size() && gVar2.f37607l != 1) {
                throw new IllegalStateException("network interceptor " + tVar + " must call proceed() exactly once");
            }
            if (a0VarA != null) {
                if (a0VarA.d() != null) {
                    return a0VarA;
                }
                throw new IllegalStateException("interceptor " + tVar + " returned a response with no body");
            }
            throw new NullPointerException("interceptor " + tVar + " returned null");
        }
        throw new AssertionError();
    }
}
