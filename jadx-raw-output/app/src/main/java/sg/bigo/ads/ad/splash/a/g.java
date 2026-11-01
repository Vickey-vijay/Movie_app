package sg.bigo.ads.ad.splash.a;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import java.util.List;
import sg.bigo.ads.api.AdOptionsView;
import sg.bigo.ads.api.MediaView;
import sg.bigo.ads.api.a.l;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.b f69192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public sg.bigo.ads.ad.interstitial.a.a f69193c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f69197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final sg.bigo.ads.ad.splash.b f69198h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f69191a = c.a.f69155a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f69194d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f69195e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f69196f = false;

    public static class a implements sg.bigo.ads.ad.banner.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f69201a = 13;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f69202b = 6;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final sg.bigo.ads.ad.splash.b f69203c;

        public a(@NonNull sg.bigo.ads.ad.splash.b bVar) {
            this.f69203c = bVar;
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a() {
            this.f69203c.c(this.f69202b);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(String str) {
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
            this.f69203c.f69249z.a(iVar, this.f69201a, this.f69202b, dVar);
        }

        @Override // sg.bigo.ads.ad.banner.h
        public final void b() {
        }
    }

    public g(@NonNull final sg.bigo.ads.ad.splash.b bVar, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar2) {
        int i10 = 0;
        int i11 = 1;
        this.f69197g = 0;
        this.f69198h = bVar;
        sg.bigo.ads.ad.b.b bVar3 = bVar.f69249z;
        boolean z10 = bVar3 instanceof sg.bigo.ads.ad.b.c;
        sg.bigo.ads.ad.interstitial.a.b bVar4 = new sg.bigo.ads.ad.interstitial.a.b(bVar3, lVar, bVar2, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).I : null, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).J : null);
        this.f69192b = bVar4;
        sg.bigo.ads.ad.interstitial.a.a aVar = new sg.bigo.ads.ad.interstitial.a.a(bVar4.f67856a, bVar3, lVar, bVar2, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).I : null, z10 ? ((sg.bigo.ads.ad.b.c) bVar3).J : null);
        this.f69193c = aVar;
        if (this.f69192b.f67856a) {
            i10 = 1;
        } else if (aVar.f67788a) {
            i10 = 2;
        }
        this.f69197g = i10;
        bVar2.d(i10);
        if (!this.f69192b.f67856a && !(this.f69193c.f67789b instanceof sg.bigo.ads.ad.interstitial.a.a.b)) {
            i11 = 2;
        }
        bVar2.e(i11);
        sg.bigo.ads.ad.interstitial.a.b bVar5 = this.f69192b;
        if (bVar5 != null) {
            bVar5.a(new a(bVar));
            this.f69192b.a(bVar.f67537b.f69381f);
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f69193c;
        if (aVar2 != null) {
            aVar2.a(new a(bVar));
            this.f69193c.a(new sg.bigo.ads.ad.interstitial.a.b.c.a() { // from class: sg.bigo.ads.ad.splash.a.g.1
                @Override // sg.bigo.ads.ad.interstitial.a.b.c.a
                public final void a(sg.bigo.ads.common.i iVar, sg.bigo.ads.api.core.d dVar) {
                    bVar.f69249z.a(iVar, 15, 9, dVar);
                }
            });
            this.f69193c.a(bVar.f67537b.f69381f);
        }
    }

    private boolean f() {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f69192b;
        if (bVar == null || !bVar.f67856a || !bVar.b()) {
            return false;
        }
        sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f69192b;
        return (bVar2.f67857b || bVar2.f67861f.f67801i == null) ? false : true;
    }

    private boolean g() {
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f69193c;
        return aVar != null && aVar.f67788a && aVar.b() && this.f69193c.a() != null;
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a() {
    }

    public final void a(Runnable runnable) {
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f69192b;
        if (bVar != null) {
            bVar.a(runnable);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10) {
        if (z10) {
            if (this.f69196f) {
                sg.bigo.ads.ad.interstitial.a.b bVar = this.f69192b;
                if (bVar != null) {
                    bVar.f67861f.c();
                    return;
                }
                return;
            }
            sg.bigo.ads.ad.interstitial.a.a aVar = this.f69193c;
            if (aVar != null) {
                aVar.c();
                return;
            }
            return;
        }
        if (this.f69196f) {
            sg.bigo.ads.ad.interstitial.a.b bVar2 = this.f69192b;
            if (bVar2 != null) {
                bVar2.f67861f.d();
                return;
            }
            return;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar2 = this.f69193c;
        if (aVar2 != null) {
            aVar2.d();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [sg.bigo.ads.api.core.b] */
    @Override // sg.bigo.ads.ad.splash.a.c
    public final void a(boolean z10, @NonNull ViewGroup viewGroup, int i10) {
        this.f69191a = z10 ? c.a.f69156b : c.a.f69157c;
        if (z10) {
            if (this.f69195e == 2) {
                viewGroup.removeViewAt(1);
            }
            int i11 = 5;
            if (f()) {
                View view = this.f69192b.f67861f.f67801i;
                viewGroup.addView(view, 1, new FrameLayout.LayoutParams(-1, -1));
                if (view != null) {
                    view.setTag(19);
                }
                this.f69192b.a(1);
                this.f69194d = true;
                this.f69196f = true;
            } else {
                View viewA = this.f69193c.a();
                viewGroup.addView(viewA, 1, new FrameLayout.LayoutParams(-1, -1));
                if (viewA != null) {
                    viewA.setTag(20);
                }
                this.f69193c.a(1);
                this.f69194d = true;
                i11 = 7;
            }
            int i12 = this.f69195e == 2 ? 9 : 8;
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) this.f69198h.f69249z.f(), i11, i10);
            this.f69198h.f69249z.a(viewGroup, (MediaView) null, (ImageView) null, (AdOptionsView) null, (List<View>) null, i12, null);
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void b() {
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    public final void c() {
        this.f69191a = c.a.f69158d;
        sg.bigo.ads.ad.interstitial.a.b bVar = this.f69192b;
        if (bVar != null) {
            bVar.e();
            this.f69192b = null;
        }
        sg.bigo.ads.ad.interstitial.a.a aVar = this.f69193c;
        if (aVar != null) {
            aVar.e();
            this.f69193c = null;
        }
    }

    @Override // sg.bigo.ads.ad.splash.a.c
    @NonNull
    public final int d() {
        return this.f69191a;
    }

    public final boolean e() {
        return f() || g();
    }
}
