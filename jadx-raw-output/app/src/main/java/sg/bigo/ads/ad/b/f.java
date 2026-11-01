package sg.bigo.ads.ad.b;

import android.content.Context;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.core.f.a.p;

/* JADX INFO: loaded from: classes5.dex */
public final class f<T extends Ad> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public T f67438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public Context f67439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.core.a.a f67440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public p f67441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    public sg.bigo.ads.api.b.d.a<T> f67442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final sg.bigo.ads.core.g.c f67443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.a f67444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.core.player.b.d f67445h;

    /* JADX INFO: renamed from: sg.bigo.ads.ad.b.f$1, reason: invalid class name */
    public class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f67446a;

        public AnonymousClass1(int i10) {
            this.f67446a = i10;
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i10 = this.f67446a;
            if (i10 != 0) {
                f fVar = f.this;
                fVar.f67442e.a(fVar.f67438a, 1006, i10, "Invalid VPAID media files.");
                return;
            }
            f.this.f67444g = new sg.bigo.ads.core.player.b.a() { // from class: sg.bigo.ads.ad.b.f.1.1
                @Override // sg.bigo.ads.core.player.b.a
                public final void a() {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(int i11) {
                    f fVar2 = f.this;
                    if (fVar2.f67441d == null) {
                        fVar2.f67442e.a(fVar2.f67438a, 1006, 10075, "VPAID video config is empty.");
                    } else {
                        sg.bigo.ads.common.n.d.b(new Runnable() { // from class: sg.bigo.ads.ad.b.f.1.1.1
                            @Override // java.lang.Runnable
                            public final void run() {
                                sg.bigo.ads.api.c.b bVarB = sg.bigo.ads.api.c.b.b(f.this.f67440c.x());
                                bVarB.f69350c = false;
                                f fVar3 = f.this;
                                p pVar = fVar3.f67441d;
                                int i12 = pVar.f71483x;
                                int i13 = pVar.f71482w;
                                f fVar4 = f.this;
                                fVar3.f67445h = new sg.bigo.ads.core.player.b.d(fVar4.f67439b, i12, i13, bVarB, fVar4.f67440c);
                                f fVar5 = f.this;
                                fVar5.f67445h.setOnEventListener(fVar5.f67443f);
                            }
                        });
                    }
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void a(String str, sg.bigo.ads.common.h.a aVar) {
                }

                @Override // sg.bigo.ads.core.player.b.a
                public final void b(int i11) {
                    f fVar2 = f.this;
                    fVar2.f67442e.a(fVar2.f67438a, 1006, i11, "Failed to download VPAID.");
                }
            };
            sg.bigo.ads.core.player.b bVarA = sg.bigo.ads.core.player.b.a();
            f fVar2 = f.this;
            bVarA.a(fVar2.f67439b, fVar2.f67440c, fVar2.f67444g);
        }
    }

    public f(@NonNull Context context, sg.bigo.ads.core.g.c cVar, @NonNull sg.bigo.ads.core.a.a aVar, p pVar, @NonNull sg.bigo.ads.api.b.d.a<T> aVar2, @NonNull T t10) {
        this.f67439b = context;
        this.f67443f = cVar;
        this.f67440c = aVar;
        this.f67441d = pVar;
        this.f67442e = aVar2;
        this.f67438a = t10;
    }

    public final boolean a() {
        return this.f67440c.at() == 1;
    }
}
