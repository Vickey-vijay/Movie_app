package cl;

/* JADX INFO: compiled from: JsonConfiguration.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f6099c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f6100d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f6101e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f6102f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6103g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f6104h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f6105i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f6106j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f6107k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f6108l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q f6109m;

    public f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, q qVar) {
        ck.p.j(str, "prettyPrintIndent");
        ck.p.j(str2, "classDiscriminator");
        this.f6097a = z10;
        this.f6098b = z11;
        this.f6099c = z12;
        this.f6100d = z13;
        this.f6101e = z14;
        this.f6102f = z15;
        this.f6103g = str;
        this.f6104h = z16;
        this.f6105i = z17;
        this.f6106j = str2;
        this.f6107k = z18;
        this.f6108l = z19;
        this.f6109m = qVar;
    }

    public final boolean a() {
        return this.f6107k;
    }

    public final boolean b() {
        return this.f6100d;
    }

    public final String c() {
        return this.f6106j;
    }

    public final boolean d() {
        return this.f6104h;
    }

    public final boolean e() {
        return this.f6097a;
    }

    public final boolean f() {
        return this.f6102f;
    }

    public final boolean g() {
        return this.f6098b;
    }

    public final q h() {
        return this.f6109m;
    }

    public final boolean i() {
        return this.f6101e;
    }

    public final String j() {
        return this.f6103g;
    }

    public final boolean k() {
        return this.f6108l;
    }

    public final boolean l() {
        return this.f6105i;
    }

    public final boolean m() {
        return this.f6099c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f6097a + ", ignoreUnknownKeys=" + this.f6098b + ", isLenient=" + this.f6099c + ", allowStructuredMapKeys=" + this.f6100d + ", prettyPrint=" + this.f6101e + ", explicitNulls=" + this.f6102f + ", prettyPrintIndent='" + this.f6103g + "', coerceInputValues=" + this.f6104h + ", useArrayPolymorphism=" + this.f6105i + ", classDiscriminator='" + this.f6106j + "', allowSpecialFloatingPointValues=" + this.f6107k + ", useAlternativeNames=" + this.f6108l + ", namingStrategy=" + this.f6109m + ')';
    }

    public /* synthetic */ f(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, q qVar, int i10, ck.i iVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & 256) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) == 0 ? z18 : false, (i10 & 2048) == 0 ? z19 : true, (i10 & 4096) != 0 ? null : qVar);
    }
}
