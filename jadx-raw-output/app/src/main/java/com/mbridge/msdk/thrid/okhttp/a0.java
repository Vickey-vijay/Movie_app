package com.mbridge.msdk.thrid.okhttp;

import java.io.Closeable;

/* JADX INFO: compiled from: Response.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a0 implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f37354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f37355b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f37356c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f37357d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q f37358e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final r f37359f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b0 f37360g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a0 f37361h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final a0 f37362i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final a0 f37363j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f37364k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f37365l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private volatile c f37366m;

    /* JADX INFO: compiled from: Response.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y f37367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public w f37368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f37369c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f37370d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public q f37371e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public r.a f37372f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public b0 f37373g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public a0 f37374h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public a0 f37375i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public a0 f37376j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f37377k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f37378l;

        public a() {
            this.f37369c = -1;
            this.f37372f = new r.a();
        }

        public a a(y yVar) {
            this.f37367a = yVar;
            return this;
        }

        public a b(String str, String str2) {
            this.f37372f.c(str, str2);
            return this;
        }

        private void b(a0 a0Var) {
            if (a0Var.f37360g != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public a a(w wVar) {
            this.f37368b = wVar;
            return this;
        }

        public a c(a0 a0Var) {
            if (a0Var != null) {
                a("networkResponse", a0Var);
            }
            this.f37374h = a0Var;
            return this;
        }

        public a d(a0 a0Var) {
            if (a0Var != null) {
                b(a0Var);
            }
            this.f37376j = a0Var;
            return this;
        }

        public a a(int i10) {
            this.f37369c = i10;
            return this;
        }

        public a(a0 a0Var) {
            this.f37369c = -1;
            this.f37367a = a0Var.f37354a;
            this.f37368b = a0Var.f37355b;
            this.f37369c = a0Var.f37356c;
            this.f37370d = a0Var.f37357d;
            this.f37371e = a0Var.f37358e;
            this.f37372f = a0Var.f37359f.a();
            this.f37373g = a0Var.f37360g;
            this.f37374h = a0Var.f37361h;
            this.f37375i = a0Var.f37362i;
            this.f37376j = a0Var.f37363j;
            this.f37377k = a0Var.f37364k;
            this.f37378l = a0Var.f37365l;
        }

        public a a(String str) {
            this.f37370d = str;
            return this;
        }

        public a b(long j10) {
            this.f37377k = j10;
            return this;
        }

        public a a(q qVar) {
            this.f37371e = qVar;
            return this;
        }

        public a a(String str, String str2) {
            this.f37372f.a(str, str2);
            return this;
        }

        public a a(r rVar) {
            this.f37372f = rVar.a();
            return this;
        }

        public a a(b0 b0Var) {
            this.f37373g = b0Var;
            return this;
        }

        public a a(a0 a0Var) {
            if (a0Var != null) {
                a("cacheResponse", a0Var);
            }
            this.f37375i = a0Var;
            return this;
        }

        private void a(String str, a0 a0Var) {
            if (a0Var.f37360g == null) {
                if (a0Var.f37361h == null) {
                    if (a0Var.f37362i == null) {
                        if (a0Var.f37363j == null) {
                            return;
                        }
                        throw new IllegalArgumentException(str + ".priorResponse != null");
                    }
                    throw new IllegalArgumentException(str + ".cacheResponse != null");
                }
                throw new IllegalArgumentException(str + ".networkResponse != null");
            }
            throw new IllegalArgumentException(str + ".body != null");
        }

        public a a(long j10) {
            this.f37378l = j10;
            return this;
        }

        public a0 a() {
            if (this.f37367a != null) {
                if (this.f37368b != null) {
                    if (this.f37369c >= 0) {
                        if (this.f37370d != null) {
                            return new a0(this);
                        }
                        throw new IllegalStateException("message == null");
                    }
                    throw new IllegalStateException("code < 0: " + this.f37369c);
                }
                throw new IllegalStateException("protocol == null");
            }
            throw new IllegalStateException("request == null");
        }
    }

    public String b(String str) {
        return a(str, null);
    }

    public String a(String str, String str2) {
        String strB = this.f37359f.b(str);
        return strB != null ? strB : str2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        b0 b0Var = this.f37360g;
        if (b0Var == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        b0Var.close();
    }

    public b0 d() {
        return this.f37360g;
    }

    public c h() {
        c cVar = this.f37366m;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f37359f);
        this.f37366m = cVarA;
        return cVarA;
    }

    public int k() {
        return this.f37356c;
    }

    public q l() {
        return this.f37358e;
    }

    public r m() {
        return this.f37359f;
    }

    public boolean n() {
        int i10 = this.f37356c;
        return i10 >= 200 && i10 < 300;
    }

    public String o() {
        return this.f37357d;
    }

    public a p() {
        return new a(this);
    }

    public a0 q() {
        return this.f37363j;
    }

    public long r() {
        return this.f37365l;
    }

    public y s() {
        return this.f37354a;
    }

    public long t() {
        return this.f37364k;
    }

    public String toString() {
        return "Response{protocol=" + this.f37355b + ", code=" + this.f37356c + ", message=" + this.f37357d + ", url=" + this.f37354a.g() + '}';
    }

    public a0(a aVar) {
        this.f37354a = aVar.f37367a;
        this.f37355b = aVar.f37368b;
        this.f37356c = aVar.f37369c;
        this.f37357d = aVar.f37370d;
        this.f37358e = aVar.f37371e;
        this.f37359f = aVar.f37372f.a();
        this.f37360g = aVar.f37373g;
        this.f37361h = aVar.f37374h;
        this.f37362i = aVar.f37375i;
        this.f37363j = aVar.f37376j;
        this.f37364k = aVar.f37377k;
        this.f37365l = aVar.f37378l;
    }
}
