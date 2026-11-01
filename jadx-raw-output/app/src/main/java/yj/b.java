package yj;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: compiled from: Closeable.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b {
    public static final void a(Closeable closeable, Throwable th2) throws IOException {
        if (closeable != null) {
            if (th2 == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th3) {
                mj.d.a(th2, th3);
            }
        }
    }
}
