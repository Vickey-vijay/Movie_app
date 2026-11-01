package cl;

import dl.d0;
import dl.j0;
import dl.k0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: JvmStreams.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class x {
    public static final <T> T a(a aVar, xk.a<? extends T> aVar2, InputStream inputStream) {
        ck.p.j(aVar, "<this>");
        ck.p.j(aVar2, "deserializer");
        ck.p.j(inputStream, "stream");
        d0 d0Var = new d0(inputStream);
        try {
            return (T) j0.a(aVar, aVar2, d0Var);
        } finally {
            d0Var.b();
        }
    }

    public static final <T> void b(a aVar, xk.g<? super T> gVar, T t10, OutputStream outputStream) throws IOException {
        ck.p.j(aVar, "<this>");
        ck.p.j(gVar, "serializer");
        ck.p.j(outputStream, "stream");
        k0 k0Var = new k0(outputStream);
        try {
            j0.b(aVar, k0Var, gVar, t10);
        } finally {
            k0Var.g();
        }
    }
}
