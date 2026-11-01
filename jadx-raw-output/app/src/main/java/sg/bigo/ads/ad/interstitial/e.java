package sg.bigo.ads.ad.interstitial;

import androidx.annotation.CallSuper;

/* JADX INFO: loaded from: classes8.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f68304a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f68305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private sg.bigo.ads.common.utils.n f68306c;

    public interface a {
        boolean a(Runnable runnable);
    }

    public final void a() {
        this.f68304a = true;
        sg.bigo.ads.common.utils.n nVar = this.f68306c;
        if (nVar != null) {
            nVar.b();
        }
    }

    public final void a(int i10, final Runnable runnable) {
        sg.bigo.ads.common.utils.n nVar = this.f68306c;
        if (nVar != null) {
            nVar.b();
        }
        this.f68304a = false;
        sg.bigo.ads.common.utils.n nVar2 = new sg.bigo.ads.common.utils.n(((long) i10) * 1000) { // from class: sg.bigo.ads.ad.interstitial.e.1
            @Override // sg.bigo.ads.common.utils.n
            public final void a() {
                Runnable runnable2;
                e eVar = e.this;
                if (eVar.f68304a || (runnable2 = runnable) == null) {
                    return;
                }
                a aVar = eVar.f68305b;
                if (aVar != null) {
                    aVar.a(runnable2);
                } else {
                    runnable2.run();
                }
            }

            @Override // sg.bigo.ads.common.utils.n
            public final void a(long j10) {
            }
        };
        this.f68306c = nVar2;
        nVar2.c();
    }

    @CallSuper
    public void b() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f68304a || (nVar = this.f68306c) == null || nVar.f70019i) {
            return;
        }
        nVar.c();
    }

    @CallSuper
    public void c() {
        sg.bigo.ads.common.utils.n nVar;
        if (this.f68304a || (nVar = this.f68306c) == null || nVar.f70019i) {
            return;
        }
        nVar.d();
    }
}
