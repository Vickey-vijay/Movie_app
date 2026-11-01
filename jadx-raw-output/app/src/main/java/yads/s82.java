package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class s82 {
    public final w82 a(Context context) {
        w82 w82Var = w82.f84126e;
        if (w82Var == null) {
            synchronized (this) {
                w82Var = w82.f84126e;
                if (w82Var == null) {
                    w82Var = new w82(context, new k31());
                    w82.f84126e = w82Var;
                }
            }
        }
        return w82Var;
    }
}
