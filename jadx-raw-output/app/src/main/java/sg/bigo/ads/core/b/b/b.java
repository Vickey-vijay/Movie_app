package sg.bigo.ads.core.b.b;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f71147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.a> f71148b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.b.a.a f71149c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f71150d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f71151e;

    public b(@NonNull sg.bigo.ads.core.b.a.a aVar) {
        this.f71149c = aVar;
        this.f71147a = p.a(aVar.f71119a);
        this.f71148b = p.a(aVar.f71119a);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.b.1
            @Override // java.lang.Runnable
            public final void run() {
                b.a(b.this);
            }
        });
    }

    public static /* synthetic */ void a(b bVar) {
        sg.bigo.ads.common.g.c.a.a(System.currentTimeMillis() - ((long) bVar.f71149c.f71121c));
        bVar.f71147a.addAll(bVar.g());
        long j10 = sg.bigo.ads.common.x.a.j();
        bVar.f71150d = j10;
        if (j10 == 0) {
            bVar.f71150d = System.currentTimeMillis();
        }
        bVar.f71151e = c.a();
        bVar.f();
    }

    private void f() {
        c cVar = this.f71151e;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f71150d;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = this.f71151e;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f71153a, cVar2.f71154b, cVar2.f71155c, cVar2.f71156d);
            this.f71150d = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            this.f71151e.c();
        }
    }

    private List<sg.bigo.ads.common.g.b.a> g() {
        return sg.bigo.ads.common.g.c.a.a(this.f71149c.a());
    }

    public final synchronized List<sg.bigo.ads.common.g.b.a> a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f71147a);
        Iterator<sg.bigo.ads.common.g.b.a> it = this.f71148b.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f71147a.clear();
        this.f71148b.addAll(arrayList);
        return arrayList;
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.a> list, boolean z10) {
        this.f71148b.removeAll(list);
        if (!z10) {
            this.f71147a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<sg.bigo.ads.common.g.b.a> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f69637a));
        }
        sg.bigo.ads.common.g.c.a.a(arrayList);
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.a aVar) {
        this.f71147a.add(aVar);
        aVar.f69637a = sg.bigo.ads.common.g.c.a.a(aVar);
        f();
        this.f71151e.a(aVar.f69638b);
    }

    public final synchronized int b() {
        return this.f71147a.size();
    }

    public final synchronized boolean c() {
        return this.f71147a.isEmpty();
    }

    public final synchronized void d() {
        if (this.f71147a.isEmpty()) {
            List<sg.bigo.ads.common.g.b.a> listG = g();
            Iterator<sg.bigo.ads.common.g.b.a> it = this.f71148b.iterator();
            while (it.hasNext()) {
                listG.remove(it.next());
            }
            this.f71147a.addAll(listG);
        }
    }

    public final synchronized void e() {
        this.f71148b.clear();
        this.f71147a.clear();
    }
}
