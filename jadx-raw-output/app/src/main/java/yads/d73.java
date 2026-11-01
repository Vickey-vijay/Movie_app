package yads;

import android.os.Trace;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d73 {
    public static void a(String str) {
        if (ib3.f78556a >= 18) {
            Trace.beginSection(str);
        }
    }

    public static void a() {
        if (ib3.f78556a >= 18) {
            Trace.endSection();
        }
    }
}
