package sg.bigo.ads.core.b.b;

import android.content.Context;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f71157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final sg.bigo.ads.common.j f71158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f71159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f71160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public sg.bigo.ads.core.b.c.b.AbstractRunnableC0732b f71161e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f71162f;

    public interface a {
        void a();

        void b();
    }

    public f(g gVar, sg.bigo.ads.common.j jVar, a aVar, Context context, long j10) {
        this.f71162f = aVar;
        this.f71160d = context;
        this.f71159c = j10;
        this.f71157a = gVar;
        this.f71158b = jVar;
    }

    public void a() {
        if (this.f71157a.e()) {
            return;
        }
        d();
    }

    public final void b() {
        g gVar = this.f71157a;
        if (gVar == null) {
            sg.bigo.ads.common.t.a.b("Callback", "sendEventsRightNow but EventStorage null!!");
            return;
        }
        final List<sg.bigo.ads.common.g.b.a> listC = gVar.c();
        if (listC.isEmpty()) {
            sg.bigo.ads.common.t.a.a(0, 3, "Callback", "sendEventsRightNow but event list is empty!!");
            return;
        }
        c();
        JSONArray jSONArray = new JSONArray();
        Iterator<sg.bigo.ads.common.g.b.a> it = listC.iterator();
        while (it.hasNext()) {
            try {
                jSONArray.put(new JSONObject(it.next().f69639c));
            } catch (JSONException unused) {
            }
        }
        HashMap map = new HashMap();
        map.put("events", jSONArray);
        this.f71158b.a(map, new sg.bigo.ads.common.j.a() { // from class: sg.bigo.ads.core.b.b.f.1
            @Override // sg.bigo.ads.common.j.a
            public final void a() {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.2
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f71157a.a(listC, true);
                        f.this.f71157a.f();
                        f.this.a();
                        a aVar = f.this.f71162f;
                        if (aVar != null) {
                            aVar.a();
                        }
                    }
                });
            }

            @Override // sg.bigo.ads.common.j.a
            public final void a(int i10, int i11, String str) {
                sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                        f.this.f71157a.a(listC, false);
                        f.this.d();
                        a aVar = f.this.f71162f;
                        if (aVar != null) {
                            aVar.b();
                        }
                    }
                });
            }
        });
    }

    public final void c() {
        sg.bigo.ads.core.b.c.b.a(this.f71161e);
        this.f71161e = null;
    }

    public final void d() {
        if (this.f71161e != null) {
            return;
        }
        this.f71161e = sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.f.2
            @Override // java.lang.Runnable
            public final void run() {
                if (sg.bigo.ads.common.aa.c.b(f.this.f71160d)) {
                    f.this.b();
                } else {
                    f.this.c();
                    f.this.d();
                }
            }
        }, this.f71159c);
    }
}
