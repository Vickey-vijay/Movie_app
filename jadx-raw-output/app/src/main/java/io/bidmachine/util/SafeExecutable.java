package io.bidmachine.util;

import androidx.annotation.CallSuper;
import ck.p;
import kotlin.Metadata;
import mj.r;

/* JADX INFO: compiled from: SafeExecutable.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00028\u0000H&¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lio/bidmachine/util/SafeExecutable;", "T", "Lio/bidmachine/util/Executable;", "input", "Lmj/r;", "execute", "(Ljava/lang/Object;)V", "onExecute", "", "throwable", "onThrows", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1})
public interface SafeExecutable<T> extends Executable<T> {
    @Override // io.bidmachine.util.Executable
    /* bridge */ /* synthetic */ default boolean executeSafely(Object obj) {
        return super.executeSafely(obj);
    }

    void onExecute(T input) throws Throwable;

    default void onThrows(Throwable th2) throws Throwable {
        p.j(th2, "throwable");
    }

    @Override // io.bidmachine.util.Executable
    @CallSuper
    default void execute(T input) {
        try {
            onExecute(input);
        } catch (Throwable th2) {
            try {
                onThrows(th2);
                r rVar = r.f64562a;
            } catch (Throwable unused) {
            }
        }
    }
}
