package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.AbstractC3252v9;
import com.ironsource.C3426d4;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.inmobi.media.v9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC3252v9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f25556a = kotlin.b.a(new bk.a() { // from class: b7.va
        @Override // bk.a
        public final Object invoke() {
            return AbstractC3252v9.b();
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f25557b;

    public static String a() {
        Ea ea2 = (Ea) f25556a.getValue();
        String string = null;
        if (ea2 != null) {
            ck.p.j("cip", C3426d4.i.W);
            string = ea2.f22577a.getString("cip", null);
        }
        ck.p.i(f25557b, "TAG");
        return string;
    }

    static {
        String simpleName = AbstractC3252v9.class.getSimpleName();
        f25557b = simpleName;
        ck.p.g(simpleName);
    }

    public static final Ea b() {
        Context context = Ji.f22951a;
        if (context == null) {
            return null;
        }
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        return Da.a(context, "inmobi_store");
    }

    public static void a(String str) {
        Ea ea2 = (Ea) f25556a.getValue();
        if (ea2 != null) {
            ConcurrentHashMap concurrentHashMap = Ea.f22576b;
            ea2.a("cip", str, false);
            mj.r rVar = mj.r.f64562a;
        }
        ck.p.g(f25557b);
    }
}
