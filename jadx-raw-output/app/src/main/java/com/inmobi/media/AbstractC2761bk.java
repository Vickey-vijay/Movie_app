package com.inmobi.media;

import android.content.Context;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.bk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC2761bk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ea f24079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f24080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Integer f24081c;

    static {
        Ea eaA;
        Context context = Ji.f22951a;
        if (context != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            eaA = Da.a(context, "imtelemetrydboverflow");
        } else {
            eaA = null;
        }
        f24079a = eaA;
        f24080b = -1;
    }

    public static int a() {
        if (f24080b == -1) {
            Ea ea2 = f24079a;
            int i10 = 0;
            if (ea2 != null) {
                ck.p.j("count", C3426d4.i.W);
                i10 = ea2.f22577a.getInt("count", 0);
            }
            f24080b = i10;
        }
        return f24080b;
    }
}
