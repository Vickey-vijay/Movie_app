package yads;

import android.os.ConditionVariable;

/* JADX INFO: loaded from: classes2.dex */
public final class uy2 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConditionVariable f83697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ vy2 f83698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy2(vy2 vy2Var, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.f83698c = vy2Var;
        this.f83697b = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.f83698c) {
            this.f83697b.open();
            this.f83698c.b();
            this.f83698c.f84048b.getClass();
        }
    }
}
