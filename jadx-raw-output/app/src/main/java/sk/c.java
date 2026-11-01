package sk;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: Concurrent.common.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class c {
    public static final <T> T a(AtomicReference<T> atomicReference) {
        return atomicReference.get();
    }

    public static final <T> void b(AtomicReference<T> atomicReference, T t10) {
        atomicReference.set(t10);
    }
}
