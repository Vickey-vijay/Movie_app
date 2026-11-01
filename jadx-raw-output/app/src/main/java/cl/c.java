package cl;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.json.JsonElementSerializer;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements xk.b<kotlinx.serialization.json.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f6078a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6079b = a.f6080b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements kotlinx.serialization.descriptors.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6080b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f6081c = "kotlinx.serialization.json.JsonArray";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f6082a = yk.a.h(JsonElementSerializer.f63284a).getDescriptor();

        @Override // kotlinx.serialization.descriptors.a
        public boolean b() {
            return this.f6082a.b();
        }

        @Override // kotlinx.serialization.descriptors.a
        public int c(String str) {
            ck.p.j(str, "name");
            return this.f6082a.c(str);
        }

        @Override // kotlinx.serialization.descriptors.a
        public kotlinx.serialization.descriptors.a d(int i10) {
            return this.f6082a.d(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public int e() {
            return this.f6082a.e();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String f(int i10) {
            return this.f6082a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> g(int i10) {
            return this.f6082a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> getAnnotations() {
            return this.f6082a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.a
        public zk.g getKind() {
            return this.f6082a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean i(int i10) {
            return this.f6082a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean isInline() {
            return this.f6082a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String h() {
            return f6081c;
        }
    }

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.json.a deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        j.g(eVar);
        return new kotlinx.serialization.json.a((List) yk.a.h(JsonElementSerializer.f63284a).deserialize(eVar));
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, kotlinx.serialization.json.a aVar) {
        ck.p.j(fVar, "encoder");
        ck.p.j(aVar, "value");
        j.h(fVar);
        yk.a.h(JsonElementSerializer.f63284a).serialize(fVar, aVar);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f6079b;
    }
}
