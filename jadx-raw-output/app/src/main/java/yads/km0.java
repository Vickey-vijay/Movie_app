package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class km0 {
    public static lm0 a(Context context) {
        lm0 lm0Var;
        lm0 lm0Var2 = lm0.f79847c;
        if (lm0Var2 != null) {
            return lm0Var2;
        }
        synchronized (lm0.f79848d) {
            lm0Var = lm0.f79847c;
            if (lm0Var == null) {
                lm0Var = new lm0(new jm0(), xg.a(context.getApplicationContext()));
                lm0.f79847c = lm0Var;
            }
        }
        return lm0Var;
    }
}
