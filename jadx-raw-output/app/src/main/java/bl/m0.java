package bl;

/* JADX INFO: compiled from: InlineClassDescriptor.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class m0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: InlineClassDescriptor.kt */
    public static final class a<T> implements g0<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ xk.b<T> f5439a;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // bl.g0
        public xk.b<?>[] childSerializers() {
            return new xk.b[]{this.f5439a};
        }

        public a(xk.b<T> bVar) {
            this.f5439a = bVar;
        }

        @Override // xk.a
        public T deserialize(al.e eVar) {
            ck.p.j(eVar, "decoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // xk.b, xk.g, xk.a
        public kotlinx.serialization.descriptors.a getDescriptor() {
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // xk.g
        public void serialize(al.f fVar, T t10) {
            ck.p.j(fVar, "encoder");
            throw new IllegalStateException("unsupported".toString());
        }

        @Override // bl.g0
        public xk.b<?>[] typeParametersSerializers() {
            return g0.a.a(this);
        }
    }

    public static final <T> kotlinx.serialization.descriptors.a a(String str, xk.b<T> bVar) {
        ck.p.j(str, "name");
        ck.p.j(bVar, "primitiveSerializer");
        return new l0(str, new a(bVar));
    }
}
