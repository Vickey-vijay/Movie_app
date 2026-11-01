package io.bidmachine.rendering.internal;

import androidx.annotation.CallSuper;
import io.bidmachine.util.SafeExecutable;

/* JADX INFO: loaded from: classes11.dex */
public interface m extends SafeExecutable {
    @Override // io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
    @CallSuper
    /* bridge */ /* synthetic */ default void execute(Object obj) {
        super.execute(obj);
    }

    @Override // io.bidmachine.util.SafeExecutable, io.bidmachine.util.Executable
    /* bridge */ /* synthetic */ default boolean executeSafely(Object obj) {
        return super.executeSafely(obj);
    }

    @Override // io.bidmachine.util.SafeExecutable
    /* synthetic */ void onExecute(Object obj) throws Throwable;

    @Override // io.bidmachine.util.SafeExecutable
    default void onThrows(Throwable th2) {
        o.b(th2);
    }
}
