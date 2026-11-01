package m7;

import android.os.Handler;
import android.util.SparseArray;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: QueuesHandler.java */
/* JADX INFO: loaded from: classes2.dex */
public class d0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SparseArray<Handler> f64215a = new SparseArray<>();

    @Override // m7.x
    public void c() {
        for (int i10 = 0; i10 < this.f64215a.size(); i10++) {
            e(this.f64215a.get(this.f64215a.keyAt(i10)));
        }
    }

    public final void e(Handler handler) {
        handler.sendEmptyMessage(2);
    }

    public final void f(Handler handler) {
        handler.sendEmptyMessage(3);
    }

    @Override // m7.x
    public boolean a(int i10) {
        return this.f64215a.get(i10) != null;
    }

    @Override // m7.x
    public int b() {
        return this.f64215a.size();
    }

    @Override // m7.x
    public void d(List<Integer> list) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            f(this.f64215a.get(it.next().intValue()));
        }
    }
}
