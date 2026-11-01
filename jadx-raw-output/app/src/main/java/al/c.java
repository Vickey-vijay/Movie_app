package al;

import ck.p;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface c {

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {
        public static int a(c cVar, kotlinx.serialization.descriptors.a aVar) {
            p.j(aVar, "descriptor");
            return -1;
        }

        public static boolean b(c cVar) {
            return false;
        }

        public static /* synthetic */ Object c(c cVar, kotlinx.serialization.descriptors.a aVar, int i10, xk.a aVar2, Object obj, int i11, Object obj2) {
            if (obj2 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: decodeSerializableElement");
            }
            if ((i11 & 8) != 0) {
                obj = null;
            }
            return cVar.v(aVar, i10, aVar2, obj);
        }
    }

    float A(kotlinx.serialization.descriptors.a aVar, int i10);

    byte C(kotlinx.serialization.descriptors.a aVar, int i10);

    boolean D(kotlinx.serialization.descriptors.a aVar, int i10);

    short F(kotlinx.serialization.descriptors.a aVar, int i10);

    double G(kotlinx.serialization.descriptors.a aVar, int i10);

    el.c a();

    void c(kotlinx.serialization.descriptors.a aVar);

    long e(kotlinx.serialization.descriptors.a aVar, int i10);

    int f(kotlinx.serialization.descriptors.a aVar, int i10);

    String i(kotlinx.serialization.descriptors.a aVar, int i10);

    boolean j();

    e k(kotlinx.serialization.descriptors.a aVar, int i10);

    <T> T p(kotlinx.serialization.descriptors.a aVar, int i10, xk.a<? extends T> aVar2, T t10);

    char q(kotlinx.serialization.descriptors.a aVar, int i10);

    <T> T v(kotlinx.serialization.descriptors.a aVar, int i10, xk.a<? extends T> aVar2, T t10);

    int w(kotlinx.serialization.descriptors.a aVar);

    int x(kotlinx.serialization.descriptors.a aVar);
}
