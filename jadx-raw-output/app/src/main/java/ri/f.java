package ri;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: ScalarCallable.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f<T> extends Callable<T> {
    @Override // java.util.concurrent.Callable
    T call();
}
