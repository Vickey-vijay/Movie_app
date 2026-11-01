package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@UnstableApi
public class SystemClock implements Clock {
    @Override // io.bidmachine.media3.common.util.Clock
    public void onThreadBlocked() {
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public HandlerWrapper createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new a(new Handler(looper, callback));
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long elapsedRealtime() {
        return android.os.SystemClock.elapsedRealtime();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long nanoTime() {
        return System.nanoTime();
    }

    @Override // io.bidmachine.media3.common.util.Clock
    public long uptimeMillis() {
        return android.os.SystemClock.uptimeMillis();
    }
}
