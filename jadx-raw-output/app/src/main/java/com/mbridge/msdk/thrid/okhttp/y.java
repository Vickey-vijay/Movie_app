package com.mbridge.msdk.thrid.okhttp;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: Request.java */
/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f38008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r f38010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final z f38011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<Class<?>, Object> f38012e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f38013f;

    /* JADX INFO: compiled from: Request.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public s f38014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public r.a f38016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public z f38017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<Class<?>, Object> f38018e;

        public a() {
            this.f38018e = Collections.emptyMap();
            this.f38015b = "GET";
            this.f38016c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f38014a = sVar;
            return this;
        }

        public a b(String str) {
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str = "https:" + str.substring(4);
            }
            return a(s.b(str));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f38016c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f38016c.b(str);
            return this;
        }

        public a(y yVar) {
            this.f38018e = Collections.emptyMap();
            this.f38014a = yVar.f38008a;
            this.f38015b = yVar.f38009b;
            this.f38017d = yVar.f38011d;
            this.f38018e = yVar.f38012e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(yVar.f38012e);
            this.f38016c = yVar.f38010c.a();
        }

        public a a(r rVar) {
            this.f38016c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f38016c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f37508d);
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f38015b = str;
                    this.f38017d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f38014a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    public String a(String str) {
        return this.f38010c.b(str);
    }

    public z a() {
        return this.f38011d;
    }

    public c b() {
        c cVar = this.f38013f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f38010c);
        this.f38013f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f38010c;
    }

    public boolean d() {
        return this.f38008a.h();
    }

    public String e() {
        return this.f38009b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f38008a;
    }

    public String toString() {
        return "Request{method=" + this.f38009b + ", url=" + this.f38008a + ", tags=" + this.f38012e + '}';
    }

    public y(a aVar) {
        this.f38008a = aVar.f38014a;
        this.f38009b = aVar.f38015b;
        this.f38010c = aVar.f38016c.a();
        this.f38011d = aVar.f38017d;
        this.f38012e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f38018e);
    }
}
