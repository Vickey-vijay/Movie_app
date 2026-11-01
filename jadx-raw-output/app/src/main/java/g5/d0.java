package g5;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SystemClock.java */
/* JADX INFO: loaded from: classes4.dex */
public class d0 implements c {
    @Override // g5.c
    public l createHandler(Looper looper, @Nullable Handler.Callback callback) {
        return new e0(new Handler(looper, callback));
    }

    @Override // g5.c
    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    @Override // g5.c
    public long uptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
