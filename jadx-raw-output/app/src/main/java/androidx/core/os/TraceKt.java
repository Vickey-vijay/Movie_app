package androidx.core.os;

import android.os.Trace;
import ck.n;

/* JADX INFO: compiled from: Trace.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TraceKt {
    public static final <T> T trace(String str, bk.a<? extends T> aVar) {
        Trace.beginSection(str);
        try {
            return aVar.invoke();
        } finally {
            n.b(1);
            Trace.endSection();
            n.a(1);
        }
    }
}
