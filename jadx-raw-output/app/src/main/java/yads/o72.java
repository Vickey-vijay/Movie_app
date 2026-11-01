package yads;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class o72 implements ja2, vu1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArrayList f80956a = new CopyOnWriteArrayList();

    @Override // yads.vu1
    public final void a() {
        Iterator it = this.f80956a.iterator();
        while (it.hasNext()) {
            ((p72) it.next()).a();
        }
    }

    @Override // yads.ja2
    public final void c() {
    }

    @Override // yads.ja2
    public final void a(boolean z10) {
        Iterator it = this.f80956a.iterator();
        while (it.hasNext()) {
            ((p72) it.next()).a(z10);
        }
    }
}
