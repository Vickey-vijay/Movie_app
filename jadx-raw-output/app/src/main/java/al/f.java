package al;

import ck.p;
import xk.g;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes10.dex */
public interface f {

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        public static void b(f fVar) {
        }

        public static d a(f fVar, kotlinx.serialization.descriptors.a aVar, int i10) {
            p.j(aVar, "descriptor");
            return fVar.b(aVar);
        }

        public static <T> void c(f fVar, g<? super T> gVar, T t10) {
            p.j(gVar, "serializer");
            if (gVar.getDescriptor().b()) {
                fVar.F(gVar, t10);
            } else if (t10 == null) {
                fVar.A();
            } else {
                fVar.E();
                fVar.F(gVar, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(f fVar, g<? super T> gVar, T t10) {
            p.j(gVar, "serializer");
            gVar.serialize(fVar, t10);
        }
    }

    void A();

    void D(char c10);

    void E();

    <T> void F(g<? super T> gVar, T t10);

    el.c a();

    d b(kotlinx.serialization.descriptors.a aVar);

    void e(byte b10);

    void f(kotlinx.serialization.descriptors.a aVar, int i10);

    f g(kotlinx.serialization.descriptors.a aVar);

    void j(short s10);

    void k(boolean z10);

    void l(float f10);

    void s(int i10);

    void v(String str);

    void x(double d10);

    d y(kotlinx.serialization.descriptors.a aVar, int i10);

    void z(long j10);
}
