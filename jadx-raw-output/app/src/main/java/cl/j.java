package cl;

import java.lang.annotation.Annotation;
import java.util.List;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements kotlinx.serialization.descriptors.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mj.g f6111a;

        public final kotlinx.serialization.descriptors.a a() {
            return (kotlinx.serialization.descriptors.a) this.f6111a.getValue();
        }

        @Override // kotlinx.serialization.descriptors.a
        public int c(String str) {
            ck.p.j(str, "name");
            return a().c(str);
        }

        public a(bk.a<? extends kotlinx.serialization.descriptors.a> aVar) {
            this.f6111a = kotlin.b.a(aVar);
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean b() {
            return kotlinx.serialization.descriptors.a.C0566a.c(this);
        }

        @Override // kotlinx.serialization.descriptors.a
        public kotlinx.serialization.descriptors.a d(int i10) {
            return a().d(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public int e() {
            return a().e();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String f(int i10) {
            return a().f(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> g(int i10) {
            return a().g(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> getAnnotations() {
            return kotlinx.serialization.descriptors.a.C0566a.a(this);
        }

        @Override // kotlinx.serialization.descriptors.a
        public zk.g getKind() {
            return a().getKind();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String h() {
            return a().h();
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean i(int i10) {
            return a().i(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean isInline() {
            return kotlinx.serialization.descriptors.a.C0566a.b(this);
        }
    }

    public static final g d(al.e eVar) {
        ck.p.j(eVar, "<this>");
        g gVar = eVar instanceof g ? (g) eVar : null;
        if (gVar != null) {
            return gVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + ck.s.b(eVar.getClass()));
    }

    public static final k e(al.f fVar) {
        ck.p.j(fVar, "<this>");
        k kVar = fVar instanceof k ? (k) fVar : null;
        if (kVar != null) {
            return kVar;
        }
        throw new IllegalStateException("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + ck.s.b(fVar.getClass()));
    }

    public static final kotlinx.serialization.descriptors.a f(bk.a<? extends kotlinx.serialization.descriptors.a> aVar) {
        return new a(aVar);
    }

    public static final void g(al.e eVar) {
        d(eVar);
    }

    public static final void h(al.f fVar) {
        e(fVar);
    }
}
