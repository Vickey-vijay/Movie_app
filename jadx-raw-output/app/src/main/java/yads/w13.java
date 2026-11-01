package yads;

/* JADX INFO: loaded from: classes2.dex */
public final class w13 implements bg1 {
    @Override // yads.bg1
    public final void b() {
    }

    @Override // yads.bg1
    public final void a() {
        synchronized (x13.f84420a) {
            Object obj = x13.f84421b;
            synchronized (obj) {
                if (x13.f84422c) {
                    return;
                }
                long jA = x13.a();
                synchronized (obj) {
                    x13.f84423d = jA;
                    x13.f84422c = true;
                }
            }
        }
    }
}
