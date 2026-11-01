package yads;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes2.dex */
public final class f53 implements xv {
    public final i53 a(Looper looper, Handler.Callback callback) {
        return new i53(new Handler(looper, callback));
    }
}
