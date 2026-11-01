package yads;

import android.os.SystemClock;
import yads.lr0;

/* JADX INFO: loaded from: classes3.dex */
public final class lr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh1 f79891a;

    public final void a(final qu1 qu1Var, final ru1 ru1Var) {
        final long jElapsedRealtime = SystemClock.elapsedRealtime();
        nh1 nh1Var = this.f79891a;
        nh1Var.f80674a.post(new Runnable() { // from class: cp.g6
            @Override // java.lang.Runnable
            public final void run() {
                lr0.a(jElapsedRealtime, qu1Var, ru1Var);
            }
        });
    }

    public lr0(nh1 nh1Var) {
        this.f79891a = nh1Var;
    }

    public static final void a(long j10, bk.a aVar, bk.a aVar2) {
        if (SystemClock.elapsedRealtime() - j10 <= 5000) {
            aVar.invoke();
        } else {
            aVar2.invoke();
        }
    }
}
