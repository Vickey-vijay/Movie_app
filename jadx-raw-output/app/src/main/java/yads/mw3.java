package yads;

import java.util.ArrayDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class mw3 implements xv3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque f80410b = new ArrayDeque();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public gw3 f80411c = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f80409a = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue());

    public final void a() {
        gw3 gw3Var = (gw3) this.f80410b.poll();
        this.f80411c = gw3Var;
        if (gw3Var != null) {
            gw3Var.a(this.f80409a);
        }
    }

    public final void a(gw3 gw3Var) {
        gw3Var.f77962a = this;
        this.f80410b.add(gw3Var);
        if (this.f80411c == null) {
            a();
        }
    }
}
