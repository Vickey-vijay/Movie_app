package sg.bigo.ads.core.d.b;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import sg.bigo.ads.common.utils.p;

/* JADX INFO: loaded from: classes8.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f71245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Set<sg.bigo.ads.common.g.b.b> f71246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final sg.bigo.ads.core.d.a.a f71247c;

    public c(@NonNull sg.bigo.ads.core.d.a.a aVar) {
        this.f71247c = aVar;
        this.f71245a = p.a(aVar.f71220a);
        this.f71246b = p.a(aVar.f71220a);
        sg.bigo.ads.core.d.c.a.a(new Runnable() { // from class: sg.bigo.ads.core.d.b.c.1
            @Override // java.lang.Runnable
            public final void run() {
                c cVar = c.this;
                long jCurrentTimeMillis = System.currentTimeMillis();
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo");
                sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "clearStatInfo count = ".concat(String.valueOf(sg.bigo.ads.common.g.a.a.b("tb_stat", "expired_ts < ".concat(String.valueOf(jCurrentTimeMillis)), null))));
                cVar.f71245a.addAll(cVar.e());
            }
        });
    }

    public final synchronized List<sg.bigo.ads.common.g.b.b> a() {
        ArrayList arrayList;
        arrayList = new ArrayList(this.f71245a);
        Iterator<sg.bigo.ads.common.g.b.b> it = this.f71246b.iterator();
        while (it.hasNext()) {
            arrayList.remove(it.next());
        }
        this.f71245a.clear();
        this.f71246b.addAll(arrayList);
        return arrayList;
    }

    public final synchronized void a(List<sg.bigo.ads.common.g.b.b> list, boolean z10) {
        this.f71246b.removeAll(list);
        if (!z10) {
            this.f71245a.addAll(list);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<sg.bigo.ads.common.g.b.b> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(String.valueOf(it.next().f69644a));
        }
        sg.bigo.ads.common.g.c.b.a(arrayList);
    }

    public final synchronized void a(sg.bigo.ads.common.g.b.b bVar) {
        this.f71245a.add(bVar);
        sg.bigo.ads.common.t.a.a(0, 3, "StatsDbHelper", "insertStatInfo:" + bVar.toString());
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_id", bVar.f69645b);
        contentValues.put("event_info", bVar.f69646c);
        contentValues.put("expired_ts", Long.valueOf(bVar.f69647d));
        contentValues.put("ext", bVar.f69648e);
        long jCurrentTimeMillis = bVar.f69649f;
        if (jCurrentTimeMillis == 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        }
        contentValues.put("ctime", Long.valueOf(jCurrentTimeMillis));
        long jCurrentTimeMillis2 = bVar.f69650g;
        if (jCurrentTimeMillis2 == 0) {
            jCurrentTimeMillis2 = System.currentTimeMillis();
        }
        contentValues.put("mtime", Long.valueOf(jCurrentTimeMillis2));
        bVar.f69644a = sg.bigo.ads.common.g.a.a.a("tb_stat", contentValues);
    }

    public final synchronized int b() {
        return this.f71245a.size();
    }

    public final synchronized boolean c() {
        return this.f71245a.isEmpty();
    }

    public final synchronized void d() {
        if (this.f71245a.isEmpty()) {
            List<sg.bigo.ads.common.g.b.b> listE = e();
            Iterator<sg.bigo.ads.common.g.b.b> it = this.f71246b.iterator();
            while (it.hasNext()) {
                listE.remove(it.next());
            }
            this.f71245a.addAll(listE);
        }
    }

    public final List<sg.bigo.ads.common.g.b.b> e() {
        return sg.bigo.ads.common.g.c.b.a(this.f71247c.a());
    }

    public final synchronized void f() {
        this.f71246b.clear();
        this.f71245a.clear();
    }
}
