package sg.bigo.ads.core.b.b;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sg.bigo.ads.core.b.a.a f71172a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f71173b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f71174c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f71175d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final f f71176e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.common.g f71177f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public c f71178g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f71179h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f71180i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final f.a f71181j;

    public j(Context context, sg.bigo.ads.core.b.a.a aVar, sg.bigo.ads.common.j jVar, sg.bigo.ads.common.j jVar2, sg.bigo.ads.common.g gVar) {
        f.a aVar2 = new f.a() { // from class: sg.bigo.ads.core.b.b.j.1
            @Override // sg.bigo.ads.core.b.b.f.a
            public final void a() {
                j.this.f71174c.f();
                j.this.f71176e.b();
            }

            @Override // sg.bigo.ads.core.b.b.f.a
            public final void b() {
                j.this.f71176e.d();
            }
        };
        this.f71181j = aVar2;
        this.f71180i = context;
        i iVar = new i(aVar);
        this.f71173b = iVar;
        e eVar = new e(aVar);
        this.f71174c = eVar;
        this.f71172a = aVar;
        this.f71177f = gVar;
        this.f71175d = new h(iVar, jVar2, aVar2, context, aVar.f71120b);
        this.f71176e = new d(eVar, jVar, context, aVar.f71120b);
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.2
            @Override // java.lang.Runnable
            public final void run() {
                j.this.f71179h = sg.bigo.ads.common.x.a.j();
                j jVar3 = j.this;
                if (jVar3.f71179h == 0) {
                    jVar3.f71179h = System.currentTimeMillis();
                }
                j.this.f71178g = c.a();
                j.a(j.this);
            }
        });
    }

    public static /* synthetic */ void a(j jVar) {
        c cVar = jVar.f71178g;
        if (cVar == null || cVar.b()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = jVar.f71179h;
        if (jCurrentTimeMillis - j10 >= 300000) {
            c cVar2 = jVar.f71178g;
            sg.bigo.ads.core.d.b.a(j10, cVar2.f71153a, cVar2.f71154b, cVar2.f71155c, cVar2.f71156d);
            jVar.f71179h = jCurrentTimeMillis;
            sg.bigo.ads.common.x.a.d(jCurrentTimeMillis);
            jVar.f71178g.c();
        }
    }

    public final void a(@NonNull final String str, @NonNull final JSONObject jSONObject) {
        sg.bigo.ads.core.b.c.b.a(new Runnable() { // from class: sg.bigo.ads.core.b.b.j.3
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.g.b.a aVar = new sg.bigo.ads.common.g.b.a(str, jSONObject.toString());
                String str2 = str;
                ("impression".equals(str2) || "clicked".equals(str2) ? j.this.f71174c : j.this.f71173b).a(aVar);
                j.a(j.this);
                c cVar = j.this.f71178g;
                if (cVar != null) {
                    cVar.a(str);
                }
                if (TextUtils.isEmpty(j.this.f71177f.P())) {
                    return;
                }
                j.this.f71176e.b();
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                int iD = j.this.f71173b.d();
                j jVar = j.this;
                if (iD >= jVar.f71172a.f71119a) {
                    jVar.f71175d.b();
                    sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendImmediately -> action=" + str + ", eventInfo=" + aVar.toString());
                    return;
                }
                if (jVar.f71173b.e()) {
                    return;
                }
                j.this.f71175d.d();
                sg.bigo.ads.common.t.a.a(0, 3, "Callback", "SendDefer -> action=" + str + ", eventInfo=" + aVar.toString());
            }
        });
    }
}
