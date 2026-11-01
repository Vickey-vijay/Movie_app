package zk;

import ck.p;
import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class c implements kotlinx.serialization.descriptors.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlinx.serialization.descriptors.a f86455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.c<?> f86456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f86457c;

    @Override // kotlinx.serialization.descriptors.a
    public boolean b() {
        return this.f86455a.b();
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        p.j(str, "name");
        return this.f86455a.c(str);
    }

    @Override // kotlinx.serialization.descriptors.a
    public kotlinx.serialization.descriptors.a d(int i10) {
        return this.f86455a.d(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return this.f86455a.e();
    }

    @Override // kotlinx.serialization.descriptors.a
    public String f(int i10) {
        return this.f86455a.f(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> g(int i10) {
        return this.f86455a.g(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public List<Annotation> getAnnotations() {
        return this.f86455a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.a
    public g getKind() {
        return this.f86455a.getKind();
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean i(int i10) {
        return this.f86455a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.a
    public boolean isInline() {
        return this.f86455a.isInline();
    }

    public c(kotlinx.serialization.descriptors.a aVar, jk.c<?> cVar) {
        p.j(aVar, "original");
        p.j(cVar, "kClass");
        this.f86455a = aVar;
        this.f86456b = cVar;
        this.f86457c = aVar.h() + '<' + cVar.i() + '>';
    }

    public boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && p.e(this.f86455a, cVar.f86455a) && p.e(cVar.f86456b, this.f86456b);
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return this.f86457c;
    }

    public int hashCode() {
        return (this.f86456b.hashCode() * 31) + h().hashCode();
    }

    public String toString() {
        return "ContextDescriptor(kClass: " + this.f86456b + ", original: " + this.f86455a + ')';
    }
}
