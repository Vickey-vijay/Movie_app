package bl;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class x1 implements kotlinx.serialization.descriptors.a, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f5486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f5487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<String> f5488c;

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        ck.p.j(str, "name");
        return this.f5486a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.a
    public kotlinx.serialization.descriptors.a d(int i10) {
        return this.f5486a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return this.f5486a.e();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x1) && ck.p.e(this.f5486a, ((x1) obj).f5486a);
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        return this.f5486a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        return this.f5486a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        return this.f5486a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.a
    public zk.g getKind() {
        return this.f5486a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        return this.f5486a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return this.f5486a.isInline();
    }

    public x1(kotlinx.serialization.descriptors.a aVar) {
        ck.p.j(aVar, "original");
        this.f5486a = aVar;
        this.f5487b = aVar.h() + '?';
        this.f5488c = n1.a(aVar);
    }

    @Override // bl.n
    public Set<String> a() {
        return this.f5488c;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f5487b;
    }

    public int hashCode() {
        return this.f5486a.hashCode() * 31;
    }

    public final kotlinx.serialization.descriptors.a j() {
        return this.f5486a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f5486a);
        sb2.append('?');
        return sb2.toString();
    }
}
