package sg.bigo.ads.controller.a.b;

import sg.bigo.ads.api.a.i;
import sg.bigo.ads.common.g;
import sg.bigo.ads.controller.a.j;
import sg.bigo.ads.controller.b.h;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private sg.bigo.ads.controller.a.b f70463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f70464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.controller.b.d f70465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f70466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private sg.bigo.ads.controller.e.e f70467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private c f70468f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f70469g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private c f70470h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final d f70471a = new d();
    }

    public final void a(String str, j jVar, j jVar2) {
        c cVar;
        if (str == null || jVar == null || jVar2 == null) {
            return;
        }
        if (!(i.f69318a.x() && i.f69318a.y() > 0 && i.f69318a.z() > 0 && i.f69318a.A() > 0) || this.f70463a == null) {
            return;
        }
        if (str.equals("/Ad/GetSDKConfig")) {
            if (jVar.d() == 1) {
                return;
            }
            if (this.f70468f == null) {
                this.f70468f = new e(this.f70463a, this.f70464b, this.f70465c, this.f70466d);
            }
            cVar = this.f70468f;
        } else {
            if (!str.equals("/Ad/ReportUniBaina")) {
                if (jVar.d() != 1) {
                    if (this.f70470h == null) {
                        this.f70470h = new sg.bigo.ads.controller.a.b.a(this.f70463a, this.f70464b, this.f70465c, this.f70466d);
                    }
                    c cVar2 = this.f70470h;
                    ((sg.bigo.ads.controller.a.b.a) cVar2).f70448a = this.f70467e;
                    cVar2.c();
                    return;
                }
                return;
            }
            if (jVar.d() == 1) {
                return;
            }
            if (this.f70469g == null) {
                this.f70469g = new b(this.f70463a, this.f70464b, this.f70465c, this.f70466d);
            }
            cVar = this.f70469g;
        }
        cVar.c();
    }

    public final void a(sg.bigo.ads.controller.a.b bVar, g gVar, sg.bigo.ads.controller.b.d dVar, h hVar, sg.bigo.ads.controller.e.e eVar) {
        this.f70463a = bVar;
        this.f70464b = gVar;
        this.f70465c = dVar;
        this.f70466d = hVar;
        this.f70467e = eVar;
    }
}
