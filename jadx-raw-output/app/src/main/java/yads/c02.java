package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes10.dex */
public abstract class c02 {
    public static d02 a() {
        if (d02.f76498d == null) {
            synchronized (d02.f76497c) {
                if (d02.f76498d == null) {
                    d02.f76498d = new d02(new Handler(Looper.getMainLooper()));
                }
                mj.r rVar = mj.r.f64562a;
            }
        }
        d02 d02Var = d02.f76498d;
        if (d02Var != null) {
            return d02Var;
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }
}
