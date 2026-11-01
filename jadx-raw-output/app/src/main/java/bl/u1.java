package bl;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class u1 implements kotlinx.serialization.descriptors.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zk.e f5473b;

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return ck.p.e(h(), u1Var.h()) && ck.p.e(getKind(), u1Var.getKind());
    }

    public u1(String str, zk.e eVar) {
        ck.p.j(str, "serialName");
        ck.p.j(eVar, "kind");
        this.f5472a = str;
        this.f5473b = eVar;
    }

    public final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        ck.p.j(str, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f5472a;
    }

    @Override // kotlinx.serialization.descriptors.a
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public zk.e getKind() {
        return this.f5473b;
    }

    public String toString() {
        return "PrimitiveDescriptor(" + h() + ')';
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return kotlinx.serialization.descriptors.a.C0566a.c(this);
    }

    @Override // kotlinx.serialization.descriptors.a
    public kotlinx.serialization.descriptors.a d(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        return kotlinx.serialization.descriptors.a.C0566a.a(this);
    }

    public int hashCode() {
        return h().hashCode() + (getKind().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return kotlinx.serialization.descriptors.a.C0566a.b(this);
    }
}
