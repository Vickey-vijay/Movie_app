package com.ironsource;

import android.os.Looper;
import android.util.Log;

/* JADX INFO: loaded from: classes6.dex */
public final class P1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f27308a = new a(null);

    public static final class a {
        public /* synthetic */ a(ck.i iVar) {
            this();
        }

        private a() {
        }

        public final void a() {
            if (ck.p.e(Looper.myLooper(), Looper.getMainLooper())) {
                Log.e("AssertThread", "ALERT UI THREAD: " + Thread.currentThread().getStackTrace()[4].getMethodName());
            }
        }
    }

    public static final void a() {
        f27308a.a();
    }
}
