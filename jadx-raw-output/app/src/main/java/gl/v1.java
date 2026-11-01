package gl;

import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes2.dex */
public final class v1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i1 f53601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f53602c;

    public v1(b1 b1Var, i1 i1Var) {
        this.f53602c = b1Var;
        this.f53601b = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b1 b1Var = this.f53602c;
        b1Var.f53456c += 200;
        AdLog.d(b1Var.f53457d, "interval_time " + this.f53602c.f53456c);
        i1 i1Var = this.f53601b;
        if (i1Var != null) {
            i1Var.b();
        }
    }
}
