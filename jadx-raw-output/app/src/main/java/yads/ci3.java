package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes10.dex */
public final class ci3 {
    public final di3 a(Context context) {
        di3 di3Var = di3.f76683d;
        if (di3Var == null) {
            synchronized (this) {
                di3Var = di3.f76683d;
                if (di3Var == null) {
                    di3Var = new di3(context);
                    di3.f76683d = di3Var;
                }
            }
        }
        return di3Var;
    }
}
