package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class w83 implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        Handler handler = x83.f84486i;
        if (handler != null) {
            handler.post(x83.f84487j);
            x83.f84486i.postDelayed(x83.f84488k, 200L);
        }
    }
}
