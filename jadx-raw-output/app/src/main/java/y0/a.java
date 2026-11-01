package y0;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: LogConfiguration.java */
/* JADX INFO: loaded from: classes9.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f75154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f75155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f75156c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f75157d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f75158e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f75159f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f75160g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final c1.b f75161h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f1.b f75162i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final e1.b f75163j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final h1.b f75164k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g1.b f75165l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1.a f75166m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Map<Class<?>, Object> f75167n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<i1.a> f75168o;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LogConfiguration.java */
    public static class C0799a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f75169a = Integer.MIN_VALUE;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f75170b = "X-LOG";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f75171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f75172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f75173e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f75174f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f75175g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public c1.b f75176h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public f1.b f75177i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public e1.b f75178j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public h1.b f75179k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g1.b f75180l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public b1.a f75181m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Map<Class<?>, Object> f75182n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public List<i1.a> f75183o;

        public final void q() {
            if (this.f75176h == null) {
                this.f75176h = j1.a.g();
            }
            if (this.f75177i == null) {
                this.f75177i = j1.a.k();
            }
            if (this.f75178j == null) {
                this.f75178j = j1.a.j();
            }
            if (this.f75179k == null) {
                this.f75179k = j1.a.i();
            }
            if (this.f75180l == null) {
                this.f75180l = j1.a.h();
            }
            if (this.f75181m == null) {
                this.f75181m = j1.a.c();
            }
            if (this.f75182n == null) {
                this.f75182n = new HashMap(j1.a.a());
            }
        }

        public C0799a r(String str) {
            this.f75170b = str;
            return this;
        }

        public a p() {
            q();
            return new a(this);
        }
    }

    public a(C0799a c0799a) {
        this.f75154a = c0799a.f75169a;
        this.f75155b = c0799a.f75170b;
        this.f75156c = c0799a.f75171c;
        this.f75157d = c0799a.f75172d;
        this.f75158e = c0799a.f75173e;
        this.f75159f = c0799a.f75174f;
        this.f75160g = c0799a.f75175g;
        this.f75161h = c0799a.f75176h;
        this.f75162i = c0799a.f75177i;
        this.f75163j = c0799a.f75178j;
        this.f75164k = c0799a.f75179k;
        this.f75165l = c0799a.f75180l;
        this.f75166m = c0799a.f75181m;
        this.f75167n = c0799a.f75182n;
        this.f75168o = c0799a.f75183o;
    }
}
