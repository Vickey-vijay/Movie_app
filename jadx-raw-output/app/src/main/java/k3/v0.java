package k3;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: compiled from: Timeline.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v0 f62325a = new a();

    /* JADX INFO: compiled from: Timeline.java */
    public class a extends v0 {
        @Override // k3.v0
        public int b(Object obj) {
            return -1;
        }

        @Override // k3.v0
        public int i() {
            return 0;
        }

        @Override // k3.v0
        public int p() {
            return 0;
        }

        @Override // k3.v0
        public b g(int i10, b bVar, boolean z10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // k3.v0
        public Object m(int i10) {
            throw new IndexOutOfBoundsException();
        }

        @Override // k3.v0
        public c o(int i10, c cVar, long j10) {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public Object f62326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f62327b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f62328c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f62329d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f62330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public l4.a f62331f = l4.a.f63417f;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !b.class.equals(obj.getClass())) {
                return false;
            }
            b bVar = (b) obj;
            return g5.k0.c(this.f62326a, bVar.f62326a) && g5.k0.c(this.f62327b, bVar.f62327b) && this.f62328c == bVar.f62328c && this.f62329d == bVar.f62329d && this.f62330e == bVar.f62330e && g5.k0.c(this.f62331f, bVar.f62331f);
        }

        public int a(int i10) {
            return this.f62331f.f63420c[i10].f63423a;
        }

        public long b(int i10, int i11) {
            l4.a.C0572a c0572a = this.f62331f.f63420c[i10];
            if (c0572a.f63423a != -1) {
                return c0572a.f63426d[i11];
            }
            return -9223372036854775807L;
        }

        public int c() {
            return this.f62331f.f63418a;
        }

        public int d(long j10) {
            return this.f62331f.a(j10, this.f62329d);
        }

        public int e(long j10) {
            return this.f62331f.b(j10, this.f62329d);
        }

        public long f(int i10) {
            return this.f62331f.f63419b[i10];
        }

        public long g() {
            return this.f62331f.f63421d;
        }

        public long h() {
            return k.b(this.f62329d);
        }

        public int hashCode() {
            Object obj = this.f62326a;
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f62327b;
            int iHashCode2 = (((iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31) + this.f62328c) * 31;
            long j10 = this.f62329d;
            int i10 = (iHashCode2 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f62330e;
            int i11 = (i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            l4.a aVar = this.f62331f;
            return i11 + (aVar != null ? aVar.hashCode() : 0);
        }

        public long i() {
            return this.f62329d;
        }

        public int j(int i10) {
            return this.f62331f.f63420c[i10].a();
        }

        public int k(int i10, int i11) {
            return this.f62331f.f63420c[i10].b(i11);
        }

        public long l() {
            return k.b(this.f62330e);
        }

        public long m() {
            return this.f62330e;
        }

        public boolean n(int i10) {
            return !this.f62331f.f63420c[i10].c();
        }

        public boolean o(int i10, int i11) {
            l4.a.C0572a c0572a = this.f62331f.f63420c[i10];
            return (c0572a.f63423a == -1 || c0572a.f63425c[i11] == 0) ? false : true;
        }

        public b p(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11) {
            return q(obj, obj2, i10, j10, j11, l4.a.f63417f);
        }

        public b q(@Nullable Object obj, @Nullable Object obj2, int i10, long j10, long j11, l4.a aVar) {
            this.f62326a = obj;
            this.f62327b = obj2;
            this.f62328c = i10;
            this.f62329d = j10;
            this.f62330e = j11;
            this.f62331f = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: Timeline.java */
    public static final class c {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Object f62332n = new Object();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f62333a = f62332n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Object f62334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public Object f62335c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f62336d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f62337e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f62338f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f62339g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f62340h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f62341i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f62342j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f62343k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f62344l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public long f62345m;

        public c e(Object obj, @Nullable Object obj2, @Nullable Object obj3, long j10, long j11, boolean z10, boolean z11, boolean z12, long j12, long j13, int i10, int i11, long j14) {
            this.f62333a = obj;
            this.f62334b = obj2;
            this.f62335c = obj3;
            this.f62336d = j10;
            this.f62337e = j11;
            this.f62338f = z10;
            this.f62339g = z11;
            this.f62340h = z12;
            this.f62343k = j12;
            this.f62344l = j13;
            this.f62341i = i10;
            this.f62342j = i11;
            this.f62345m = j14;
            return this;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !c.class.equals(obj.getClass())) {
                return false;
            }
            c cVar = (c) obj;
            return g5.k0.c(this.f62333a, cVar.f62333a) && g5.k0.c(this.f62334b, cVar.f62334b) && g5.k0.c(this.f62335c, cVar.f62335c) && this.f62336d == cVar.f62336d && this.f62337e == cVar.f62337e && this.f62338f == cVar.f62338f && this.f62339g == cVar.f62339g && this.f62340h == cVar.f62340h && this.f62343k == cVar.f62343k && this.f62344l == cVar.f62344l && this.f62341i == cVar.f62341i && this.f62342j == cVar.f62342j && this.f62345m == cVar.f62345m;
        }

        public long a() {
            return k.b(this.f62343k);
        }

        public long b() {
            return this.f62343k;
        }

        public long c() {
            return k.b(this.f62344l);
        }

        public long d() {
            return this.f62345m;
        }

        public int hashCode() {
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.f62333a.hashCode()) * 31;
            Object obj = this.f62334b;
            int iHashCode2 = (iHashCode + (obj == null ? 0 : obj.hashCode())) * 31;
            Object obj2 = this.f62335c;
            int iHashCode3 = (iHashCode2 + (obj2 != null ? obj2.hashCode() : 0)) * 31;
            long j10 = this.f62336d;
            int i10 = (iHashCode3 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f62337e;
            int i11 = (((((((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f62338f ? 1 : 0)) * 31) + (this.f62339g ? 1 : 0)) * 31) + (this.f62340h ? 1 : 0)) * 31;
            long j12 = this.f62343k;
            int i12 = (i11 + ((int) (j12 ^ (j12 >>> 32)))) * 31;
            long j13 = this.f62344l;
            int i13 = (((((i12 + ((int) (j13 ^ (j13 >>> 32)))) * 31) + this.f62341i) * 31) + this.f62342j) * 31;
            long j14 = this.f62345m;
            return i13 + ((int) (j14 ^ (j14 >>> 32)));
        }
    }

    public abstract int b(Object obj);

    public int e(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == c(z10)) {
                return -1;
            }
            return i10 + 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == c(z10) ? a(z10) : i10 + 1;
        }
        throw new IllegalStateException();
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        if (v0Var.p() != p() || v0Var.i() != i()) {
            return false;
        }
        c cVar = new c();
        b bVar = new b();
        c cVar2 = new c();
        b bVar2 = new b();
        for (int i10 = 0; i10 < p(); i10++) {
            if (!n(i10, cVar).equals(v0Var.n(i10, cVar2))) {
                return false;
            }
        }
        for (int i11 = 0; i11 < i(); i11++) {
            if (!g(i11, bVar, true).equals(v0Var.g(i11, bVar2, true))) {
                return false;
            }
        }
        return true;
    }

    public final b f(int i10, b bVar) {
        return g(i10, bVar, false);
    }

    public abstract b g(int i10, b bVar, boolean z10);

    public abstract int i();

    public int l(int i10, int i11, boolean z10) {
        if (i11 == 0) {
            if (i10 == a(z10)) {
                return -1;
            }
            return i10 - 1;
        }
        if (i11 == 1) {
            return i10;
        }
        if (i11 == 2) {
            return i10 == a(z10) ? c(z10) : i10 - 1;
        }
        throw new IllegalStateException();
    }

    public abstract Object m(int i10);

    public abstract c o(int i10, c cVar, long j10);

    public abstract int p();

    public int hashCode() {
        c cVar = new c();
        b bVar = new b();
        int iP = Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + p();
        for (int i10 = 0; i10 < p(); i10++) {
            iP = (iP * 31) + n(i10, cVar).hashCode();
        }
        int i11 = (iP * 31) + i();
        for (int i12 = 0; i12 < i(); i12++) {
            i11 = (i11 * 31) + g(i12, bVar, true).hashCode();
        }
        return i11;
    }

    public final Pair<Object, Long> j(c cVar, b bVar, int i10, long j10) {
        return (Pair) g5.a.e(k(cVar, bVar, i10, j10, 0L));
    }

    public final c n(int i10, c cVar) {
        return o(i10, cVar, 0L);
    }

    public int a(boolean z10) {
        if (q()) {
            return -1;
        }
        return 0;
    }

    public int c(boolean z10) {
        if (q()) {
            return -1;
        }
        return p() - 1;
    }

    public final int d(int i10, b bVar, c cVar, int i11, boolean z10) {
        int i12 = f(i10, bVar).f62328c;
        if (n(i12, cVar).f62342j == i10) {
            int iE = e(i12, i11, z10);
            if (iE == -1) {
                return -1;
            }
            return n(iE, cVar).f62341i;
        }
        return i10 + 1;
    }

    public b h(Object obj, b bVar) {
        return g(b(obj), bVar, true);
    }

    @Nullable
    public final Pair<Object, Long> k(c cVar, b bVar, int i10, long j10, long j11) {
        g5.a.c(i10, 0, p());
        o(i10, cVar, j11);
        if (j10 == -9223372036854775807L) {
            j10 = cVar.b();
            if (j10 == -9223372036854775807L) {
                return null;
            }
        }
        int i11 = cVar.f62341i;
        long jD = cVar.d() + j10;
        long jI = g(i11, bVar, true).i();
        while (jI != -9223372036854775807L && jD >= jI && i11 < cVar.f62342j) {
            jD -= jI;
            i11++;
            jI = g(i11, bVar, true).i();
        }
        return Pair.create(g5.a.e(bVar.f62327b), Long.valueOf(jD));
    }

    public final boolean q() {
        if (p() == 0) {
            return true;
        }
        return false;
    }

    public final boolean r(int i10, b bVar, c cVar, int i11, boolean z10) {
        if (d(i10, bVar, cVar, i11, z10) == -1) {
            return true;
        }
        return false;
    }
}
