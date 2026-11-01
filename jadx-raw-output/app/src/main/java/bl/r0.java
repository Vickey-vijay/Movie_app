package bl;

import java.util.List;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class r0 implements jk.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.n f5461b;

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        jk.n nVar = this.f5461b;
        r0 r0Var = obj instanceof r0 ? (r0) obj : null;
        if (!ck.p.e(nVar, r0Var != null ? r0Var.f5461b : null)) {
            return false;
        }
        jk.e eVarH = h();
        if (eVarH instanceof jk.c) {
            jk.n nVar2 = obj instanceof jk.n ? (jk.n) obj : null;
            jk.e eVarH2 = nVar2 != null ? nVar2.h() : null;
            if (eVarH2 != null && (eVarH2 instanceof jk.c)) {
                return ck.p.e(ak.a.a((jk.c) eVarH), ak.a.a((jk.c) eVarH2));
            }
        }
        return false;
    }

    public r0(jk.n nVar) {
        ck.p.j(nVar, "origin");
        this.f5461b = nVar;
    }

    @Override // jk.n
    public boolean g() {
        return this.f5461b.g();
    }

    @Override // jk.n
    public List<jk.o> getArguments() {
        return this.f5461b.getArguments();
    }

    @Override // jk.n
    public jk.e h() {
        return this.f5461b.h();
    }

    public int hashCode() {
        return this.f5461b.hashCode();
    }

    public String toString() {
        return "KTypeWrapper: " + this.f5461b;
    }
}
