package bl;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class x0 implements kotlinx.serialization.descriptors.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5485b;

    public x0(kotlinx.serialization.descriptors.a aVar) {
        this.f5484a = aVar;
        this.f5485b = 1;
    }

    public /* synthetic */ x0(kotlinx.serialization.descriptors.a aVar, ck.i iVar) {
        this(aVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj;
        return ck.p.e(this.f5484a, x0Var.f5484a) && ck.p.e(h(), x0Var.h());
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        ck.p.j(str, "name");
        Integer numR = lk.w.r(str);
        if (numR != null) {
            return numR.intValue();
        }
        throw new IllegalArgumentException(str + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.a
    public kotlinx.serialization.descriptors.a d(int i10) {
        if (i10 >= 0) {
            return this.f5484a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return this.f5485b;
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        if (i10 >= 0) {
            return nj.s.k();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.a
    public zk.g getKind() {
        return kotlinx.serialization.descriptors.b.C0567b.f63247a;
    }

    public int hashCode() {
        return (this.f5484a.hashCode() * 31) + h().hashCode();
    }

    public String toString() {
        return h() + '(' + this.f5484a + ')';
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return kotlinx.serialization.descriptors.a.C0566a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        return String.valueOf(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        return kotlinx.serialization.descriptors.a.C0566a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return kotlinx.serialization.descriptors.a.C0566a.b(this);
    }
}
