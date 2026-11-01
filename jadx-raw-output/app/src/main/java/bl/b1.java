package bl;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes11.dex */
public abstract class b1 implements kotlinx.serialization.descriptors.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5388d;

    public b1(String str, kotlinx.serialization.descriptors.a aVar, kotlinx.serialization.descriptors.a aVar2) {
        this.f5385a = str;
        this.f5386b = aVar;
        this.f5387c = aVar2;
        this.f5388d = 2;
    }

    public /* synthetic */ b1(String str, kotlinx.serialization.descriptors.a aVar, kotlinx.serialization.descriptors.a aVar2, ck.i iVar) {
        this(str, aVar, aVar2);
    }

    @Override // kotlinx.serialization.descriptors.a
    public kotlinx.serialization.descriptors.a d(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f5386b;
            }
            if (i11 == 1) {
                return this.f5387c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + h() + " expects only non-negative indices").toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return ck.p.e(h(), b1Var.h()) && ck.p.e(this.f5386b, b1Var.f5386b) && ck.p.e(this.f5387c, b1Var.f5387c);
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
        throw new IllegalArgumentException(str + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return this.f5388d;
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
        return kotlinx.serialization.descriptors.b.c.f63248a;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f5385a;
    }

    public String toString() {
        return h() + '(' + this.f5386b + ", " + this.f5387c + ')';
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

    public int hashCode() {
        return (((h().hashCode() * 31) + this.f5386b.hashCode()) * 31) + this.f5387c.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return kotlinx.serialization.descriptors.a.C0566a.b(this);
    }
}
