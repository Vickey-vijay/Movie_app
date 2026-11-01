package yads;

import java.util.concurrent.CopyOnWriteArrayList;
import yads.kb0;

/* JADX INFO: loaded from: classes11.dex */
public final class gm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f77853a = new CopyOnWriteArrayList();

    public final void a(final int i10, final long j10, final long j11) {
        for (final fm fmVar : this.f77853a) {
            if (!fmVar.f77440c) {
                fmVar.f77438a.post(new Runnable() { // from class: cp.d2
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((kb0) fmVar.f77439b).b(i10, j10, j11);
                    }
                });
            }
        }
    }
}
