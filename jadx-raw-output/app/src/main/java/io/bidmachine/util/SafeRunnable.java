package io.bidmachine.util;

import androidx.annotation.CallSuper;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: SafeRunnable.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0017J\b\u0010\u0004\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/SafeRunnable;", "Ljava/lang/Runnable;", "Lmj/r;", "run", "onRun", "", "throwable", "onThrows", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface SafeRunnable extends Runnable {
    void onRun() throws Throwable;

    default void onThrows(Throwable th2) throws Throwable {
        p.j(th2, "throwable");
    }

    @Override // java.lang.Runnable
    @CallSuper
    default void run() {
        try {
            onRun();
        } catch (Throwable th2) {
            try {
                onThrows(th2);
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }
}
