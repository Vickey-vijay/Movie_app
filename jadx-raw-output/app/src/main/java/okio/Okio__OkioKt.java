package okio;

import bk.l;
import ck.n;
import ck.p;
import java.io.Closeable;
import mj.d;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes6.dex */
final /* synthetic */ class Okio__OkioKt {
    public static final BufferedSource buffer(Source source) {
        p.j(source, "<this>");
        return new RealBufferedSource(source);
    }

    public static final Sink blackhole() {
        return new BlackholeSink();
    }

    public static final BufferedSink buffer(Sink sink) {
        p.j(sink, "<this>");
        return new RealBufferedSink(sink);
    }

    public static final <T extends Closeable, R> R use(T t10, l<? super T, ? extends R> lVar) throws Throwable {
        R rInvoke;
        p.j(lVar, "block");
        Throwable th2 = null;
        try {
            rInvoke = lVar.invoke(t10);
            n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th3) {
                    th2 = th3;
                }
            }
            n.a(1);
        } catch (Throwable th4) {
            n.b(1);
            if (t10 != null) {
                try {
                    t10.close();
                } catch (Throwable th5) {
                    d.a(th4, th5);
                }
            }
            n.a(1);
            th2 = th4;
            rInvoke = null;
        }
        if (th2 != null) {
            throw th2;
        }
        p.g(rInvoke);
        return rInvoke;
    }
}
