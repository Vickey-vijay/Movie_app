package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean addThrowable(Throwable th2) {
        return ExceptionHelper.a(this, th2);
    }

    public boolean isTerminated() {
        if (get() == ExceptionHelper.f61400a) {
            return true;
        }
        return false;
    }

    public Throwable terminate() {
        return ExceptionHelper.b(this);
    }
}
