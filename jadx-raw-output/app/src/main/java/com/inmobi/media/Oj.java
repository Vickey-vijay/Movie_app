package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.Oj;

/* JADX INFO: loaded from: classes6.dex */
public abstract class Oj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final mj.g f23299a = kotlin.b.a(new bk.a() { // from class: b7.t3
        @Override // bk.a
        public final Object invoke() {
            return Oj.a();
        }
    });

    public static final void a(Runnable runnable) {
        ck.p.j(runnable, "runnable");
        ((Handler) f23299a.getValue()).post(runnable);
    }

    public static final Handler a() {
        return new Handler(Looper.getMainLooper());
    }
}
