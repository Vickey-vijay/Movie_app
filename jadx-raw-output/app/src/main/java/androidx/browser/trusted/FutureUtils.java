package androidx.browser.trusted;

import androidx.annotation.NonNull;
import androidx.concurrent.futures.ResolvableFuture;
import q5.i;

/* JADX INFO: loaded from: classes9.dex */
class FutureUtils {
    private FutureUtils() {
    }

    @NonNull
    public static <T> i<T> immediateFailedFuture(@NonNull Throwable th2) {
        ResolvableFuture resolvableFutureCreate = ResolvableFuture.create();
        resolvableFutureCreate.setException(th2);
        return resolvableFutureCreate;
    }
}
