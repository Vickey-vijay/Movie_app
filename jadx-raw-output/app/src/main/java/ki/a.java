package ki;

import ii.s;
import java.util.concurrent.Callable;
import oi.o;

/* JADX INFO: compiled from: RxAndroidPlugins.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile o<Callable<s>, s> f62816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile o<s, s> f62817b;

    public static s d(Callable<s> callable) {
        if (callable == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<Callable<s>, s> oVar = f62816a;
        return oVar == null ? c(callable) : b(oVar, callable);
    }

    public static s e(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("scheduler == null");
        }
        o<s, s> oVar = f62817b;
        return oVar == null ? sVar : (s) a(oVar, sVar);
    }

    public static <T, R> R a(o<T, R> oVar, T t10) {
        try {
            return oVar.apply(t10);
        } catch (Throwable th2) {
            throw ni.a.a(th2);
        }
    }

    public static s b(o<Callable<s>, s> oVar, Callable<s> callable) {
        s sVar = (s) a(oVar, callable);
        if (sVar != null) {
            return sVar;
        }
        throw new NullPointerException("Scheduler Callable returned null");
    }

    public static s c(Callable<s> callable) {
        try {
            s sVarCall = callable.call();
            if (sVarCall != null) {
                return sVarCall;
            }
            throw new NullPointerException("Scheduler Callable returned null");
        } catch (Throwable th2) {
            throw ni.a.a(th2);
        }
    }
}
