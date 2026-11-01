package yads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes10.dex */
public final class uc2 {
    public final wc2 a(Context context) {
        wc2 wc2Var = wc2.f84160i;
        if (wc2Var == null) {
            synchronized (this) {
                Context applicationContext = context.getApplicationContext();
                Object obj = og1.f81031d;
                Executor executorA = ng1.a().a();
                wc2 wc2Var2 = wc2.f84160i;
                if (wc2Var2 == null) {
                    Object obj2 = dw2.f76819j;
                    wc2Var2 = new wc2(applicationContext, executorA, cw2.a(), new tc2(applicationContext.getApplicationContext()), new sc2());
                    wc2.f84160i = wc2Var2;
                }
                wc2Var = wc2Var2;
            }
        }
        return wc2Var;
    }
}
