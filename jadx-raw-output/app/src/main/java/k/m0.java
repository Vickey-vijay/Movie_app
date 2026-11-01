package k;

import java.util.TimerTask;

/* JADX INFO: loaded from: classes2.dex */
public final class m0 extends TimerTask {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ x f62017b;

    public m0(x xVar) {
        this.f62017b = xVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f62017b.Q.sendEmptyMessage(1);
    }
}
