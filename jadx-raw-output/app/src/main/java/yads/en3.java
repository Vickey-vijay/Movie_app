package yads;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class en3 implements no2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f77144a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bq2 f77145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tr f77146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final BlockingQueue f77147d;

    public final synchronized boolean a(po2 po2Var) {
        String strC = po2Var.c();
        if (!this.f77144a.containsKey(strC)) {
            this.f77144a.put(strC, null);
            po2Var.a((no2) this);
            if (lm3.f79855a) {
                boolean z10 = ad1.f75480a;
            }
            return false;
        }
        List arrayList = (List) this.f77144a.get(strC);
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        po2Var.a("waiting-for-response");
        arrayList.add(po2Var);
        this.f77144a.put(strC, arrayList);
        if (lm3.f79855a) {
            boolean z11 = ad1.f75480a;
        }
        return true;
    }

    public final synchronized void b(po2 po2Var) {
        BlockingQueue blockingQueue;
        String strC = po2Var.c();
        List list = (List) this.f77144a.remove(strC);
        if (list != null && !list.isEmpty()) {
            if (lm3.f79855a) {
                list.size();
                boolean z10 = ad1.f75480a;
            }
            po2 po2Var2 = (po2) list.remove(0);
            this.f77144a.put(strC, list);
            po2Var2.a((no2) this);
            if (this.f77146c != null && (blockingQueue = this.f77147d) != null) {
                try {
                    blockingQueue.put(po2Var2);
                } catch (InterruptedException unused) {
                    boolean z11 = ad1.f75480a;
                    Thread.currentThread().interrupt();
                    tr trVar = this.f77146c;
                    trVar.f83148f = true;
                    trVar.interrupt();
                }
            }
        }
    }

    public en3(tr trVar, PriorityBlockingQueue priorityBlockingQueue, bq2 bq2Var) {
        this.f77145b = bq2Var;
        this.f77146c = trVar;
        this.f77147d = priorityBlockingQueue;
    }

    public final void a(po2 po2Var, vp2 vp2Var) {
        List list;
        lr lrVar = vp2Var.f83981b;
        if (lrVar != null) {
            if (lrVar.f79887e >= System.currentTimeMillis()) {
                String strC = po2Var.c();
                synchronized (this) {
                    list = (List) this.f77144a.remove(strC);
                }
                if (list != null) {
                    if (lm3.f79855a) {
                        list.size();
                        boolean z10 = ad1.f75480a;
                    }
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((gn0) this.f77145b).a((po2) it.next(), vp2Var, null);
                    }
                    return;
                }
                return;
            }
        }
        b(po2Var);
    }
}
