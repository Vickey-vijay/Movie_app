package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.k;
import com.applovin.impl.u4;
import com.applovin.impl.x4;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f9445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f9446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f9447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f9448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f9449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f9450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f9451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f9452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f9453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f9454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f9455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f9456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final boolean f9457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f9458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f9459o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final u4.a f9460p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f9461q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f9462r;

    /* JADX INFO: renamed from: com.applovin.impl.sdk.network.a$a, reason: collision with other inner class name */
    public static class C0048a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f9463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f9464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9465c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f9467e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public JSONObject f9468f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Object f9469g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f9471i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f9472j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f9473k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9475m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f9476n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f9477o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f9478p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public u4.a f9479q;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f9470h = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f9474l = true;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Map f9466d = new HashMap();

        public C0048a a(Map map) {
            this.f9467e = map;
            return this;
        }

        public C0048a b(String str) {
            this.f9464b = str;
            return this;
        }

        public C0048a c(String str) {
            this.f9463a = str;
            return this;
        }

        public C0048a a(JSONObject jSONObject) {
            this.f9468f = jSONObject;
            return this;
        }

        public C0048a b(Map map) {
            this.f9466d = map;
            return this;
        }

        public C0048a c(int i10) {
            this.f9471i = i10;
            return this;
        }

        public C0048a d(boolean z10) {
            this.f9474l = z10;
            return this;
        }

        public C0048a e(boolean z10) {
            this.f9475m = z10;
            return this;
        }

        public C0048a f(boolean z10) {
            this.f9477o = z10;
            return this;
        }

        public C0048a(k kVar) {
            this.f9471i = ((Integer) kVar.a(x4.T2)).intValue();
            this.f9472j = ((Integer) kVar.a(x4.S2)).intValue();
            this.f9475m = ((Boolean) kVar.a(x4.f10009p3)).booleanValue();
            this.f9476n = ((Boolean) kVar.a(x4.f9969k5)).booleanValue();
            this.f9479q = u4.a.a(((Integer) kVar.a(x4.f9978l5)).intValue());
            this.f9478p = ((Boolean) kVar.a(x4.K5)).booleanValue();
        }

        public C0048a a(String str) {
            this.f9465c = str;
            return this;
        }

        public C0048a b(int i10) {
            this.f9472j = i10;
            return this;
        }

        public C0048a c(boolean z10) {
            this.f9473k = z10;
            return this;
        }

        public C0048a a(Object obj) {
            this.f9469g = obj;
            return this;
        }

        public C0048a b(boolean z10) {
            this.f9478p = z10;
            return this;
        }

        public C0048a a(int i10) {
            this.f9470h = i10;
            return this;
        }

        public C0048a a(boolean z10) {
            this.f9476n = z10;
            return this;
        }

        public C0048a a(u4.a aVar) {
            this.f9479q = aVar;
            return this;
        }

        public a a() {
            return new a(this);
        }
    }

    public void a(String str) {
        this.f9445a = str;
    }

    public void b(String str) {
        this.f9446b = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        String str = this.f9445a;
        if (str == null ? aVar.f9445a != null : !str.equals(aVar.f9445a)) {
            return false;
        }
        Map map = this.f9447c;
        if (map == null ? aVar.f9447c != null : !map.equals(aVar.f9447c)) {
            return false;
        }
        Map map2 = this.f9448d;
        if (map2 == null ? aVar.f9448d != null : !map2.equals(aVar.f9448d)) {
            return false;
        }
        String str2 = this.f9450f;
        if (str2 == null ? aVar.f9450f != null : !str2.equals(aVar.f9450f)) {
            return false;
        }
        String str3 = this.f9446b;
        if (str3 == null ? aVar.f9446b != null : !str3.equals(aVar.f9446b)) {
            return false;
        }
        JSONObject jSONObject = this.f9449e;
        if (jSONObject == null ? aVar.f9449e != null : !jSONObject.equals(aVar.f9449e)) {
            return false;
        }
        Object obj2 = this.f9451g;
        if (obj2 == null ? aVar.f9451g == null : obj2.equals(aVar.f9451g)) {
            return this.f9452h == aVar.f9452h && this.f9453i == aVar.f9453i && this.f9454j == aVar.f9454j && this.f9455k == aVar.f9455k && this.f9456l == aVar.f9456l && this.f9457m == aVar.f9457m && this.f9458n == aVar.f9458n && this.f9459o == aVar.f9459o && this.f9460p == aVar.f9460p && this.f9461q == aVar.f9461q && this.f9462r == aVar.f9462r;
        }
        return false;
    }

    public String a() {
        return this.f9450f;
    }

    public JSONObject b() {
        return this.f9449e;
    }

    public int c() {
        return this.f9452h - this.f9453i;
    }

    public Object d() {
        return this.f9451g;
    }

    public u4.a e() {
        return this.f9460p;
    }

    public String f() {
        return this.f9445a;
    }

    public Map g() {
        return this.f9448d;
    }

    public String h() {
        return this.f9446b;
    }

    public Map i() {
        return this.f9447c;
    }

    public int j() {
        return this.f9453i;
    }

    public int k() {
        return this.f9455k;
    }

    public int l() {
        return this.f9454j;
    }

    public boolean m() {
        return this.f9459o;
    }

    public boolean n() {
        return this.f9456l;
    }

    public boolean o() {
        return this.f9462r;
    }

    public boolean p() {
        return this.f9457m;
    }

    public boolean q() {
        return this.f9458n;
    }

    public boolean r() {
        return this.f9461q;
    }

    public String toString() {
        return "HttpRequest {endpoint=" + this.f9445a + ", backupEndpoint=" + this.f9450f + ", httpMethod=" + this.f9446b + ", httpHeaders=" + this.f9448d + ", body=" + this.f9449e + ", emptyResponse=" + this.f9451g + ", initialRetryAttempts=" + this.f9452h + ", retryAttemptsLeft=" + this.f9453i + ", timeoutMillis=" + this.f9454j + ", retryDelayMillis=" + this.f9455k + ", exponentialRetries=" + this.f9456l + ", retryOnAllErrors=" + this.f9457m + ", retryOnNoConnection=" + this.f9458n + ", encodingEnabled=" + this.f9459o + ", encodingType=" + this.f9460p + ", trackConnectionSpeed=" + this.f9461q + ", gzipBodyEncoding=" + this.f9462r + '}';
    }

    public a(C0048a c0048a) {
        this.f9445a = c0048a.f9464b;
        this.f9446b = c0048a.f9463a;
        this.f9447c = c0048a.f9466d;
        this.f9448d = c0048a.f9467e;
        this.f9449e = c0048a.f9468f;
        this.f9450f = c0048a.f9465c;
        this.f9451g = c0048a.f9469g;
        int i10 = c0048a.f9470h;
        this.f9452h = i10;
        this.f9453i = i10;
        this.f9454j = c0048a.f9471i;
        this.f9455k = c0048a.f9472j;
        this.f9456l = c0048a.f9473k;
        this.f9457m = c0048a.f9474l;
        this.f9458n = c0048a.f9475m;
        this.f9459o = c0048a.f9476n;
        this.f9460p = c0048a.f9479q;
        this.f9461q = c0048a.f9477o;
        this.f9462r = c0048a.f9478p;
    }

    public void a(int i10) {
        this.f9453i = i10;
    }

    public int hashCode() {
        int iHashCode;
        int iHashCode2;
        int iHashCode3;
        int iHashCode4 = super.hashCode() * 31;
        String str = this.f9445a;
        int iHashCode5 = 0;
        if (str != null) {
            iHashCode = str.hashCode();
        } else {
            iHashCode = 0;
        }
        int i10 = (iHashCode4 + iHashCode) * 31;
        String str2 = this.f9450f;
        if (str2 != null) {
            iHashCode2 = str2.hashCode();
        } else {
            iHashCode2 = 0;
        }
        int i11 = (i10 + iHashCode2) * 31;
        String str3 = this.f9446b;
        if (str3 != null) {
            iHashCode3 = str3.hashCode();
        } else {
            iHashCode3 = 0;
        }
        int i12 = (i11 + iHashCode3) * 31;
        Object obj = this.f9451g;
        if (obj != null) {
            iHashCode5 = obj.hashCode();
        }
        int iB = ((((((((((((((((((((((i12 + iHashCode5) * 31) + this.f9452h) * 31) + this.f9453i) * 31) + this.f9454j) * 31) + this.f9455k) * 31) + (this.f9456l ? 1 : 0)) * 31) + (this.f9457m ? 1 : 0)) * 31) + (this.f9458n ? 1 : 0)) * 31) + (this.f9459o ? 1 : 0)) * 31) + this.f9460p.b()) * 31) + (this.f9461q ? 1 : 0)) * 31) + (this.f9462r ? 1 : 0);
        Map map = this.f9447c;
        if (map != null) {
            iB = (iB * 31) + map.hashCode();
        }
        Map map2 = this.f9448d;
        if (map2 != null) {
            iB = (iB * 31) + map2.hashCode();
        }
        JSONObject jSONObject = this.f9449e;
        if (jSONObject != null) {
            char[] charArray = jSONObject.toString().toCharArray();
            Arrays.sort(charArray);
            return (iB * 31) + new String(charArray).hashCode();
        }
        return iB;
    }

    public static C0048a a(k kVar) {
        return new C0048a(kVar);
    }
}
