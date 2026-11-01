package bj;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: EndConsumerHelper.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e {
    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        ej.a.s(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<mi.b> atomicReference, mi.b bVar, Class<?> cls) {
        qi.a.e(bVar, "next is null");
        if (androidx.lifecycle.e.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(mi.b bVar, mi.b bVar2, Class<?> cls) {
        qi.a.e(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }
}
