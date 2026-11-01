package g5;

import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: compiled from: PriorityTaskManager.java */
/* JADX INFO: loaded from: classes5.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f53161a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PriorityQueue<Integer> f53162b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f53163c = Integer.MIN_VALUE;

    public void a(int i10) {
        synchronized (this.f53161a) {
            this.f53162b.add(Integer.valueOf(i10));
            this.f53163c = Math.max(this.f53163c, i10);
        }
    }

    public void b(int i10) {
        synchronized (this.f53161a) {
            this.f53162b.remove(Integer.valueOf(i10));
            this.f53163c = this.f53162b.isEmpty() ? Integer.MIN_VALUE : ((Integer) k0.i(this.f53162b.peek())).intValue();
            this.f53161a.notifyAll();
        }
    }
}
