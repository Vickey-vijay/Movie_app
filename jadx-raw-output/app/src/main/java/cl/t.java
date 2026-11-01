package cl;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonObject;

/* JADX INFO: compiled from: JsonElementSerializers.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class t implements xk.b<JsonObject> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t f6120a = new t();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final kotlinx.serialization.descriptors.a f6121b = a.f6122b;

    /* JADX INFO: compiled from: JsonElementSerializers.kt */
    public static final class a implements kotlinx.serialization.descriptors.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f6122b = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f6123c = "kotlinx.serialization.json.JsonObject";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ kotlinx.serialization.descriptors.a f6124a = yk.a.k(yk.a.C(ck.w.f6066a), JsonElementSerializer.f63284a).getDescriptor();

        @Override // kotlinx.serialization.descriptors.a
        public boolean b() {
            return this.f6124a.b();
        }

        @Override // kotlinx.serialization.descriptors.a
        public int c(String str) {
            ck.p.j(str, "name");
            return this.f6124a.c(str);
        }

        @Override // kotlinx.serialization.descriptors.a
        public kotlinx.serialization.descriptors.a d(int i10) {
            return this.f6124a.d(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public int e() {
            return this.f6124a.e();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String f(int i10) {
            return this.f6124a.f(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> g(int i10) {
            return this.f6124a.g(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public List<Annotation> getAnnotations() {
            return this.f6124a.getAnnotations();
        }

        @Override // kotlinx.serialization.descriptors.a
        public zk.g getKind() {
            return this.f6124a.getKind();
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean i(int i10) {
            return this.f6124a.i(i10);
        }

        @Override // kotlinx.serialization.descriptors.a
        public boolean isInline() {
            return this.f6124a.isInline();
        }

        @Override // kotlinx.serialization.descriptors.a
        public String h() {
            return f6123c;
        }
    }

    @Override // xk.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public JsonObject deserialize(al.e eVar) {
        ck.p.j(eVar, "decoder");
        j.g(eVar);
        return new JsonObject((Map) yk.a.k(yk.a.C(ck.w.f6066a), JsonElementSerializer.f63284a).deserialize(eVar));
    }

    @Override // xk.g
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(al.f fVar, JsonObject jsonObject) {
        ck.p.j(fVar, "encoder");
        ck.p.j(jsonObject, "value");
        j.h(fVar);
        yk.a.k(yk.a.C(ck.w.f6066a), JsonElementSerializer.f63284a).serialize(fVar, jsonObject);
    }

    @Override // xk.b, xk.g, xk.a
    public kotlinx.serialization.descriptors.a getDescriptor() {
        return f6121b;
    }
}
