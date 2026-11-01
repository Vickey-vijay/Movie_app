package vj;

import ck.p;
import java.lang.reflect.Method;
import kotlin.random.Random;
import nj.n;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes8.dex */
public class a {

    /* JADX INFO: renamed from: vj.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: PlatformImplementations.kt */
    public static final class C0767a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0767a f73173a = new C0767a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f73174b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f73175c;

        /* JADX WARN: Code duplicated, block: B:10:0x0039  */
        static {
            Method method;
            Method method2;
            boolean z10;
            Method[] methods = Throwable.class.getMethods();
            p.g(methods);
            int length = methods.length;
            int i10 = 0;
            while (true) {
                method = null;
                if (i10 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i10];
                if (p.e(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    p.i(parameterTypes, "getParameterTypes(...)");
                    if (p.e(n.h0(parameterTypes), Throwable.class)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                if (z10) {
                    break;
                } else {
                    i10++;
                }
            }
            f73174b = method2;
            for (Method method3 : methods) {
                if (p.e(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f73175c = method;
        }
    }

    public void a(Throwable th2, Throwable th3) {
        p.j(th2, "cause");
        p.j(th3, "exception");
        Method method = C0767a.f73174b;
        if (method != null) {
            method.invoke(th2, th3);
        }
    }

    public Random b() {
        return new gk.b();
    }
}
