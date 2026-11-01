package al;

import ck.p;
import xk.g;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface d {

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        public static boolean a(d dVar, kotlinx.serialization.descriptors.a aVar, int i10) {
            p.j(aVar, "descriptor");
            return true;
        }
    }

    void B(kotlinx.serialization.descriptors.a aVar, int i10, float f10);

    <T> void C(kotlinx.serialization.descriptors.a aVar, int i10, g<? super T> gVar, T t10);

    void G(kotlinx.serialization.descriptors.a aVar, int i10, double d10);

    void c(kotlinx.serialization.descriptors.a aVar);

    void h(kotlinx.serialization.descriptors.a aVar, int i10, char c10);

    void i(kotlinx.serialization.descriptors.a aVar, int i10, byte b10);

    <T> void m(kotlinx.serialization.descriptors.a aVar, int i10, g<? super T> gVar, T t10);

    void n(kotlinx.serialization.descriptors.a aVar, int i10, int i11);

    void o(kotlinx.serialization.descriptors.a aVar, int i10, boolean z10);

    void p(kotlinx.serialization.descriptors.a aVar, int i10, String str);

    boolean q(kotlinx.serialization.descriptors.a aVar, int i10);

    void t(kotlinx.serialization.descriptors.a aVar, int i10, short s10);

    void u(kotlinx.serialization.descriptors.a aVar, int i10, long j10);

    f w(kotlinx.serialization.descriptors.a aVar, int i10);
}
