package bl;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class h1 implements kotlinx.serialization.descriptors.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h1 f5412a = new h1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zk.g f5413b = kotlinx.serialization.descriptors.b.d.f63249a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f5414c = "kotlin.Nothing";

    @Override // kotlinx.serialization.descriptors.a
    public int e() {
        return 0;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public String toString() {
        return "NothingSerialDescriptor";
    }

    public final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.a
    public int c(String str) {
        ck.p.j(str, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.a
    public zk.g getKind() {
        return f5413b;
    }

    @Override // kotlinx.serialization.descriptors.a
    public String h() {
        return f5414c;
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
