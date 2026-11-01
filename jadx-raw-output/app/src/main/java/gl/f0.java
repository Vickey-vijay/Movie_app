package gl;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n f53483b;

    public f0(n nVar) {
        this.f53483b = nVar;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f53483b.f53541b.a(message.obj);
        return false;
    }
}
