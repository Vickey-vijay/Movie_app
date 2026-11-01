package sk;

import java.util.Collection;
import java.util.ServiceLoader;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: CoroutineExceptionHandlerImpl.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Collection<nk.i0> f71944a = SequencesKt___SequencesKt.T(kk.r.g(ServiceLoader.load(nk.i0.class, nk.i0.class.getClassLoader()).iterator()));

    public static final Collection<nk.i0> a() {
        return f71944a;
    }

    public static final void b(Throwable th2) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
    }
}
