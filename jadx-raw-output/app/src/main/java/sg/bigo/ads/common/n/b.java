package sg.bigo.ads.common.n;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends Handler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f69758a;

    public b(String str, Looper looper) {
        super(looper);
        this.f69758a = str;
    }

    @Override // android.os.Handler
    public final void dispatchMessage(Message message) {
        super.dispatchMessage(message);
    }

    @Override // android.os.Handler
    public final boolean sendMessageAtTime(Message message, long j10) {
        return super.sendMessageAtTime(message, j10);
    }

    @Override // android.os.Handler
    public final String toString() {
        return "HandlerEx (" + this.f69758a + ") {}";
    }
}
