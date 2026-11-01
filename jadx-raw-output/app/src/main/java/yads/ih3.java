package yads;

import android.content.Context;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public abstract class ih3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile mj0 f78662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f78663b = new Object();

    public static mj0 b(Context context) {
        mj0 mj0VarA;
        mj0 mj0Var = f78662a;
        if (mj0Var != null) {
            return mj0Var;
        }
        synchronized (f78663b) {
            mj0 mj0Var2 = f78662a;
            if (mj0Var2 != null) {
                return mj0Var2;
            }
            try {
                mj0VarA = a(context);
                f78662a = mj0VarA;
            } catch (Throwable th2) {
                th2.toString();
                boolean z10 = ad1.f75480a;
                mj0VarA = null;
            }
            return mj0VarA;
        }
    }

    public static mj0 a(Context context) {
        Context applicationContext = context.getApplicationContext();
        i33 i33Var = new i33(applicationContext);
        Object obj = dp0.f76765c;
        nr nrVarA = bp0.a().a(applicationContext);
        oc0 oc0Var = new oc0(applicationContext, new nu2(((l53) ne.a().f77342a).a(), cs2.a().a(applicationContext)));
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(4);
        rc0 rc0Var = new rc0(i33Var, 0);
        qr qrVar = new qr();
        qrVar.f81942a = nrVarA;
        qrVar.f81945d = oc0Var;
        return new mj0(applicationContext, rc0Var, new sc0(qrVar, executorServiceNewFixedThreadPool));
    }
}
