package yads;

import com.ironsource.C3426d4;

/* JADX INFO: loaded from: classes11.dex */
public final class tw2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xw2 f83229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xw2 f83230b;

    public tw2(xw2 xw2Var) {
        this(xw2Var, xw2Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || tw2.class != obj.getClass()) {
            return false;
        }
        tw2 tw2Var = (tw2) obj;
        return this.f83229a.equals(tw2Var.f83229a) && this.f83230b.equals(tw2Var.f83230b);
    }

    public tw2(xw2 xw2Var, xw2 xw2Var2) {
        this.f83229a = (xw2) ni.a(xw2Var);
        this.f83230b = (xw2) ni.a(xw2Var2);
    }

    public final int hashCode() {
        return this.f83230b.hashCode() + (this.f83229a.hashCode() * 31);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder(C3426d4.j.f28586d);
        sb2.append(this.f83229a);
        if (this.f83229a.equals(this.f83230b)) {
            str = "";
        } else {
            str = ", " + this.f83230b;
        }
        sb2.append(str);
        sb2.append(C3426d4.j.f28588e);
        return sb2.toString();
    }
}
