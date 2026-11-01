package al;

import ck.p;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface e {

    /* JADX INFO: compiled from: Decoding.kt */
    public static final class a {
        public static <T> T a(e eVar, xk.a<? extends T> aVar) {
            p.j(aVar, "deserializer");
            return aVar.deserialize(eVar);
        }
    }

    boolean B();

    boolean E();

    byte H();

    el.c a();

    c b(kotlinx.serialization.descriptors.a aVar);

    Void g();

    long h();

    short l();

    double m();

    char n();

    String o();

    <T> T r(xk.a<? extends T> aVar);

    int s(kotlinx.serialization.descriptors.a aVar);

    int u();

    e y(kotlinx.serialization.descriptors.a aVar);

    float z();
}
