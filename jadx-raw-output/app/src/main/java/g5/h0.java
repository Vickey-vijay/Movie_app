package g5;

import android.annotation.TargetApi;
import android.os.Trace;

/* JADX INFO: compiled from: TraceUtil.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h0 {
    public static void a(String str) {
        if (k0.f53108a >= 18) {
            b(str);
        }
    }

    public static void c() {
        if (k0.f53108a >= 18) {
            d();
        }
    }

    @TargetApi(18)
    public static void b(String str) {
        Trace.beginSection(str);
    }

    @TargetApi(18)
    public static void d() {
        Trace.endSection();
    }
}
