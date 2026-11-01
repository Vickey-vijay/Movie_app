package com.ironsource;

/* JADX INFO: loaded from: classes7.dex */
public final class Db {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final EnumC3648p9 f26333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f26334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f26335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f26336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f26337e;

    public Db(EnumC3648p9 enumC3648p9, String str, long j10, boolean z10, boolean z11) {
        ck.p.j(enumC3648p9, "instanceType");
        ck.p.j(str, "adSourceNameForEvents");
        this.f26333a = enumC3648p9;
        this.f26334b = str;
        this.f26335c = j10;
        this.f26336d = z10;
        this.f26337e = z11;
    }

    public final EnumC3648p9 a() {
        return this.f26333a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Db)) {
            return false;
        }
        Db db2 = (Db) obj;
        return this.f26333a == db2.f26333a && ck.p.e(this.f26334b, db2.f26334b) && this.f26335c == db2.f26335c && this.f26336d == db2.f26336d && this.f26337e == db2.f26337e;
    }

    public final Db a(EnumC3648p9 enumC3648p9, String str, long j10, boolean z10, boolean z11) {
        ck.p.j(enumC3648p9, "instanceType");
        ck.p.j(str, "adSourceNameForEvents");
        return new Db(enumC3648p9, str, j10, z10, z11);
    }

    public final String b() {
        return this.f26334b;
    }

    public final long c() {
        return this.f26335c;
    }

    public final boolean d() {
        return this.f26336d;
    }

    public final boolean e() {
        return this.f26337e;
    }

    public final String f() {
        return this.f26334b;
    }

    public final EnumC3648p9 g() {
        return this.f26333a;
    }

    public final long h() {
        return this.f26335c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((((this.f26333a.hashCode() * 31) + this.f26334b.hashCode()) * 31) + Long.hashCode(this.f26335c)) * 31;
        boolean z10 = this.f26336d;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = (iHashCode + r10) * 31;
        boolean z11 = this.f26337e;
        return i10 + (z11 ? 1 : z11);
    }

    public final boolean i() {
        return this.f26337e;
    }

    public final boolean j() {
        return this.f26336d;
    }

    public String toString() {
        return "LoadTaskConfig(instanceType=" + this.f26333a + ", adSourceNameForEvents=" + this.f26334b + ", loadTimeoutInMills=" + this.f26335c + ", isOneFlow=" + this.f26336d + ", isMultipleAdObjects=" + this.f26337e + ")";
    }

    public static /* synthetic */ Db a(Db db2, EnumC3648p9 enumC3648p9, String str, long j10, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            enumC3648p9 = db2.f26333a;
        }
        if ((i10 & 2) != 0) {
            str = db2.f26334b;
        }
        String str2 = str;
        if ((i10 & 4) != 0) {
            j10 = db2.f26335c;
        }
        long j11 = j10;
        if ((i10 & 8) != 0) {
            z10 = db2.f26336d;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = db2.f26337e;
        }
        return db2.a(enumC3648p9, str2, j11, z12, z11);
    }

    public /* synthetic */ Db(EnumC3648p9 enumC3648p9, String str, long j10, boolean z10, boolean z11, int i10, ck.i iVar) {
        this(enumC3648p9, str, j10, z10, (i10 & 16) != 0 ? true : z11);
    }
}
