package sg.bigo.ads.controller.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes6.dex */
public interface f extends c {

    public static class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a f70478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final sg.bigo.ads.controller.a.a.b f70479b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.common.g f70480c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final sg.bigo.ads.api.a.h f70481d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final String f70482e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f70483f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private j f70484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private j f70485h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final boolean f70486i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f70487j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f70488k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private String f70489l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private g f70490m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f70491n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final AtomicBoolean f70492o = new AtomicBoolean(false);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final AtomicBoolean f70493p = new AtomicBoolean(false);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final Runnable f70494q = new Runnable() { // from class: sg.bigo.ads.controller.a.f.a.1
            @Override // java.lang.Runnable
            public final void run() {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] run timeout task");
                a.this.b();
            }
        };

        public a(@NonNull sg.bigo.ads.controller.a.a aVar, @NonNull sg.bigo.ads.common.g gVar, @NonNull sg.bigo.ads.api.a.h hVar, @NonNull String str, String str2) {
            sg.bigo.ads.controller.a.a.b bVar;
            this.f70491n = null;
            boolean z10 = false;
            this.f70478a = aVar;
            this.f70480c = gVar;
            this.f70481d = hVar;
            this.f70482e = str;
            this.f70491n = str2;
            str.hashCode();
            if (str.equals("/Ad/GetSDKConfig")) {
                z10 = true;
                bVar = aVar.f70334g;
            } else {
                bVar = !str.equals("/Ad/ReportUniBaina") ? aVar.f70336i : aVar.f70335h;
            }
            this.f70479b = bVar;
            this.f70486i = z10;
        }

        @Override // sg.bigo.ads.common.u.a
        public final String a() {
            g gVar;
            g gVar2;
            String str = this.f70491n;
            if (str != null) {
                return sg.bigo.ads.b.a(str, this.f70482e);
            }
            if (q.a((CharSequence) this.f70483f)) {
                String strV = this.f70480c.v();
                e eVarA = this.f70479b.a(strV, this.f70481d.s());
                sg.bigo.ads.controller.a.a aVar = this.f70478a;
                this.f70487j = aVar.f70331a;
                this.f70488k = aVar.f70332e;
                this.f70489l = aVar.f70333f;
                this.f70484g = eVarA.f70475a;
                this.f70485h = this.f70479b.f70347a;
                sg.bigo.ads.controller.a.b.d.a.f70471a.a(this.f70482e, this.f70484g, this.f70485h);
                this.f70483f = sg.bigo.ads.b.a(this.f70484g.c() ? this.f70484g.b() : this.f70484g.a(), this.f70482e);
                if (eVarA.f70477c && (gVar2 = this.f70490m) != null) {
                    gVar2.a(this.f70482e);
                }
                if (eVarA.f70476b && (gVar = this.f70490m) != null) {
                    gVar.a(strV, this.f70486i);
                }
            }
            return this.f70483f;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(long j10) {
            if (this.f70493p.compareAndSet(false, true)) {
                sg.bigo.ads.common.n.d.a(3, this.f70494q, j10);
            }
        }

        @Override // sg.bigo.ads.controller.a.c
        public final void a(g gVar) {
            this.f70490m = gVar;
        }

        @Override // sg.bigo.ads.common.u.a
        public final void b() {
            g gVar;
            boolean zEquals = false;
            if (!this.f70492o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f70494q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark fail, url is " + this.f70483f);
            sg.bigo.ads.controller.a.a.b bVar = this.f70479b;
            sg.bigo.ads.controller.a.a.b.C0724b c0724b = bVar.f70348b;
            if (c0724b != null && (zEquals = TextUtils.equals(strD, c0724b.a()))) {
                bVar.f70349c++;
            }
            if (zEquals && (gVar = this.f70490m) != null) {
                gVar.a(this.f70482e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final void c() {
            g gVar;
            boolean z10 = false;
            if (!this.f70492o.compareAndSet(false, true)) {
                sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success do nth, it has marked.");
                return;
            }
            sg.bigo.ads.common.n.d.a(this.f70494q);
            String strD = d();
            sg.bigo.ads.common.t.a.a(0, 3, "AntiBan", "[bigo url] mark success, url is " + this.f70483f);
            sg.bigo.ads.controller.a.a.b bVar = this.f70479b;
            sg.bigo.ads.controller.a.a.b.C0724b c0724b = bVar.f70348b;
            if (c0724b != null) {
                boolean z11 = TextUtils.equals(strD, c0724b.a()) && bVar.f70349c > 0;
                if (z11) {
                    bVar.f70349c = 0;
                }
                z10 = z11;
            }
            if (z10 && (gVar = this.f70490m) != null) {
                gVar.a(this.f70482e);
            }
        }

        @Override // sg.bigo.ads.common.u.a
        public final String d() {
            j jVar = this.f70484g;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.common.u.a
        public final boolean e() {
            j jVar = this.f70484g;
            return jVar != null && jVar.c();
        }

        @Override // sg.bigo.ads.common.u.a
        public final String f() {
            j jVar = this.f70485h;
            return jVar != null ? jVar.a() : "";
        }

        @Override // sg.bigo.ads.controller.a.c
        @Nullable
        public final j g() {
            return this.f70484g;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final boolean h() {
            return this.f70488k;
        }

        @Override // sg.bigo.ads.controller.a.c
        public final String i() {
            return this.f70489l;
        }
    }
}
