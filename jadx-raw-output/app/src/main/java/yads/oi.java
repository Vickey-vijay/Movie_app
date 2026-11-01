package yads;

/* JADX INFO: loaded from: classes10.dex */
public final class oi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f81048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f81049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f81050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final if1 f81051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f81052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f81053f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oi)) {
            return false;
        }
        oi oiVar = (oi) obj;
        return ck.p.e(this.f81048a, oiVar.f81048a) && ck.p.e(this.f81049b, oiVar.f81049b) && ck.p.e(this.f81050c, oiVar.f81050c) && ck.p.e(this.f81051d, oiVar.f81051d) && this.f81052e == oiVar.f81052e && this.f81053f == oiVar.f81053f;
    }

    public final if1 a() {
        return this.f81051d;
    }

    public final String b() {
        return this.f81048a;
    }

    public final Object c() {
        return this.f81050c;
    }

    public final int hashCode() {
        int iA = k4.a(this.f81049b, this.f81048a.hashCode() * 31, 31);
        Object obj = this.f81050c;
        int iHashCode = (iA + (obj == null ? 0 : obj.hashCode())) * 31;
        if1 if1Var = this.f81051d;
        return Boolean.hashCode(this.f81053f) + ((Boolean.hashCode(this.f81052e) + ((iHashCode + (if1Var != null ? if1Var.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "Asset(name=" + this.f81048a + ", type=" + this.f81049b + ", value=" + this.f81050c + ", link=" + this.f81051d + ", isClickable=" + this.f81052e + ", isRequired=" + this.f81053f + ")";
    }

    public oi(String str, String str2, Object obj, if1 if1Var, boolean z10, boolean z11) {
        this.f81048a = str;
        this.f81049b = str2;
        this.f81050c = obj;
        this.f81051d = if1Var;
        this.f81052e = z10;
        this.f81053f = z11;
    }
}
