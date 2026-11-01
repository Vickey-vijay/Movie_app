package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ll2 implements qf3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yj3 f79844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f79845b = nj.s.q(new kl2(xj3.f84611b, 0.25f), new kl2(xj3.f84612c, 0.5f), new kl2(xj3.f84613d, 0.75f));

    @Override // yads.qf3
    public final void a(long j10, long j11) {
        if (j10 != 0) {
            Iterator it = this.f79845b.iterator();
            while (it.hasNext()) {
                kl2 kl2Var = (kl2) it.next();
                if (kl2Var.f79469b * j10 <= j11) {
                    this.f79844a.a(kl2Var.f79468a);
                    it.remove();
                }
            }
        }
    }

    public ll2(zj3 zj3Var) {
        this.f79844a = zj3Var;
    }
}
