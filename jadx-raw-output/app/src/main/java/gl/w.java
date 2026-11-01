package gl;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class w implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w1 f53603b;

    public w(w1 w1Var) {
        this.f53603b = w1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        r rVar = this.f53603b.f53605a;
        if (rVar == null) {
            return false;
        }
        rVar.a(String.valueOf(message.obj));
        return false;
    }
}
