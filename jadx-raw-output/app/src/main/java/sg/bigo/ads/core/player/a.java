package sg.bigo.ads.core.player;

import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f71744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, b> f71745b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map<String, RunnableC0745a> f71746c = new HashMap();

    /* JADX INFO: renamed from: sg.bigo.ads.core.player.a$a, reason: collision with other inner class name */
    public class RunnableC0745a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference<sg.bigo.ads.common.h.a> f71747a;

        public RunnableC0745a(sg.bigo.ads.common.h.a aVar) {
            this.f71747a = new WeakReference<>(aVar);
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    WeakReference<sg.bigo.ads.common.h.a> weakReference = RunnableC0745a.this.f71747a;
                    if (weakReference == null || weakReference.get() == null) {
                        return;
                    }
                    RunnableC0745a runnableC0745a = RunnableC0745a.this;
                    a.this.f71746c.remove(runnableC0745a.f71747a.get().f69659a);
                    RunnableC0745a runnableC0745a2 = RunnableC0745a.this;
                    a.this.f71744a.c(runnableC0745a2.f71747a.get());
                }
            });
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public sg.bigo.ads.common.h.a f71750a;

        public b(sg.bigo.ads.common.h.a aVar) {
            this.f71750a = aVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.core.player.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    String str;
                    b bVar = b.this;
                    sg.bigo.ads.common.h.a aVar = bVar.f71750a;
                    if (aVar != null) {
                        a.this.f71745b.remove(aVar.f69659a);
                        b bVar2 = b.this;
                        a.this.f71744a.b(bVar2.f71750a);
                        str = "call onDownloadFillTime";
                    } else {
                        str = "downloadInfo is null, not call onDownloadFillTime";
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", str);
                }
            });
        }
    }

    public interface c {
        void b(sg.bigo.ads.common.h.a aVar);

        void c(sg.bigo.ads.common.h.a aVar);
    }

    public a(c cVar) {
        this.f71744a = cVar;
    }

    public final void a(sg.bigo.ads.common.h.a aVar) {
        if (aVar.c()) {
            if (aVar.e() > 0) {
                c(aVar);
            }
            if (aVar.f() > 0) {
                if (this.f71746c.containsKey(aVar.f69659a)) {
                    sg.bigo.ads.common.n.d.a(this.f71746c.remove(aVar.f69659a));
                }
                RunnableC0745a runnableC0745a = new RunnableC0745a(aVar);
                this.f71746c.put(aVar.f69659a, runnableC0745a);
                sg.bigo.ads.common.n.d.a(3, runnableC0745a, ((long) aVar.f()) * 1000);
            }
        }
    }

    public final void b(sg.bigo.ads.common.h.a aVar) {
        if (this.f71746c.containsKey(aVar.f69659a)) {
            sg.bigo.ads.common.n.d.a(this.f71746c.get(aVar.f69659a));
            this.f71746c.remove(aVar.f69659a);
        }
    }

    public final void c(sg.bigo.ads.common.h.a aVar) {
        if (this.f71745b.containsKey(aVar.f69659a)) {
            sg.bigo.ads.common.n.d.a(this.f71745b.remove(aVar.f69659a));
            sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "fillTimeRunnableList.containsKey: " + aVar.f69659a);
        }
        b bVar = new b(aVar);
        this.f71745b.put(aVar.f69659a, bVar);
        sg.bigo.ads.common.n.d.a(3, bVar, ((long) aVar.e()) * 1000);
        sg.bigo.ads.common.t.a.a(0, 3, "AdFillStrategyManager", "startFillTimeRunnable at: " + aVar.e());
    }
}
