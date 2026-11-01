package q7;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.Executor;
import w7.d;

/* JADX INFO: compiled from: DownloadEventPoolImpl.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f66553a = w7.b.a(10, "EventPool");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap<String, LinkedList<c>> f66554b = new HashMap<>();

    /* JADX INFO: renamed from: q7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DownloadEventPoolImpl.java */
    public class RunnableC0620a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ b f66555b;

        public RunnableC0620a(b bVar) {
            this.f66555b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.c(this.f66555b);
        }
    }

    public boolean a(String str, c cVar) {
        boolean zAdd;
        if (d.f73535a) {
            d.h(this, "setListener %s", str);
        }
        if (cVar == null) {
            throw new IllegalArgumentException("listener must not be null!");
        }
        LinkedList<c> linkedList = this.f66554b.get(str);
        if (linkedList == null) {
            synchronized (str.intern()) {
                linkedList = this.f66554b.get(str);
                if (linkedList == null) {
                    HashMap<String, LinkedList<c>> map = this.f66554b;
                    LinkedList<c> linkedList2 = new LinkedList<>();
                    map.put(str, linkedList2);
                    linkedList = linkedList2;
                }
            }
        }
        synchronized (str.intern()) {
            zAdd = linkedList.add(cVar);
        }
        return zAdd;
    }

    public void b(b bVar) {
        if (d.f73535a) {
            d.h(this, "asyncPublishInNewThread %s", bVar.a());
        }
        if (bVar == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        this.f66553a.execute(new RunnableC0620a(bVar));
    }

    public boolean c(b bVar) {
        if (d.f73535a) {
            d.h(this, "publish %s", bVar.a());
        }
        if (bVar == null) {
            throw new IllegalArgumentException("event must not be null!");
        }
        String strA = bVar.a();
        LinkedList<c> linkedList = this.f66554b.get(strA);
        if (linkedList == null) {
            synchronized (strA.intern()) {
                linkedList = this.f66554b.get(strA);
                if (linkedList == null) {
                    if (d.f73535a) {
                        d.a(this, "No listener for this event %s", strA);
                    }
                    return false;
                }
            }
        }
        d(linkedList, bVar);
        return true;
    }

    public final void d(LinkedList<c> linkedList, b bVar) {
        for (Object obj : linkedList.toArray()) {
            if (obj != null && ((c) obj).d(bVar)) {
                break;
            }
        }
        Runnable runnable = bVar.f66557a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
