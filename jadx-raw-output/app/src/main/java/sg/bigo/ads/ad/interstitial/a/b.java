package sg.bigo.ads.ad.interstitial.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import sg.bigo.ads.ad.banner.h;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.core.f.a.p;
import sg.bigo.ads.core.player.c;

/* JADX INFO: loaded from: classes7.dex */
public final class b implements sg.bigo.ads.ad.interstitial.a.b.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f67856a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Runnable f67858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC0667b f67859d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    public final sg.bigo.ads.ad.interstitial.a.a.b f67861f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f67857b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sg.bigo.ads.ad.interstitial.a.b.a.C0668a f67860e = new sg.bigo.ads.ad.interstitial.a.b.a.C0668a();

    public final class a implements sg.bigo.ads.ad.interstitial.a.b.b.a {
        private a() {
        }

        public /* synthetic */ a(b bVar, byte b10) {
            this();
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a() {
            Runnable runnable = b.this.f67858c;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar) {
            b.this.f67860e.a(bVar, 6, 0L);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void a(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f67860e.a(bVar, 0, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b() {
            InterfaceC0667b interfaceC0667b = b.this.f67859d;
            if (interfaceC0667b != null) {
                interfaceC0667b.a();
            }
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void b(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f67860e.a(bVar, 2, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void c(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f67860e.a(bVar, 1, j10);
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final boolean c() {
            return false;
        }

        @Override // sg.bigo.ads.ad.interstitial.a.b.b.a
        public final void d(@NonNull sg.bigo.ads.api.core.b bVar, long j10) {
            b.this.f67860e.a(bVar, 5, j10);
        }
    }

    /* JADX INFO: renamed from: sg.bigo.ads.ad.interstitial.a.b$b, reason: collision with other inner class name */
    public interface InterfaceC0667b {
        void a();
    }

    public b(@NonNull Ad ad2, @NonNull l lVar, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable c cVar, @Nullable p pVar) {
        sg.bigo.ads.core.f.a.a next;
        byte b10 = 0;
        sg.bigo.ads.core.f.a.a.C0736a c0736aA = null;
        if (pVar != null) {
            Iterator<sg.bigo.ads.core.f.a.a> it = pVar.A.iterator();
            while (it.hasNext() && ((next = it.next()) == null || (c0736aA = next.a()) == null || !c0736aA.a())) {
            }
        }
        sg.bigo.ads.core.f.a.a.C0736a c0736a = c0736aA;
        boolean zS = lVar.s();
        boolean zAc = bVar.ac();
        boolean z10 = c0736a != null && c0736a.a();
        int iX = bVar.x();
        boolean z11 = (zS || bVar.ar()) && zAc && z10 && (iX == 3 || iX == 4 || iX == 12 || iX == 20);
        this.f67856a = z11;
        if (z11) {
            this.f67861f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, cVar, pVar, c0736a, new a(this, b10));
        } else {
            this.f67861f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, null, null, null, null);
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z11);
    }

    public b(@NonNull Ad ad2, @NonNull l lVar, @NonNull sg.bigo.ads.core.f.a.a.C0736a c0736a, @NonNull sg.bigo.ads.api.core.b bVar, @Nullable c cVar, @Nullable p pVar) {
        byte b10 = 0;
        boolean z10 = bVar.x() == 3 || bVar.x() == 4 || bVar.x() == 20;
        this.f67856a = z10;
        if (z10) {
            this.f67861f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, cVar, pVar, c0736a, new a(this, b10));
        } else {
            this.f67861f = new sg.bigo.ads.ad.interstitial.a.a.b(ad2, bVar, null, null, null, null);
        }
        sg.bigo.ads.common.t.a.a(0, 3, "PlayableAdCompanion", "The ad with slot: " + lVar.l() + ", pid: " + lVar.n() + " is playable: " + z10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    @Nullable
    public final View a() {
        return this.f67861f.f67801i;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10) {
        if (i10 == 1) {
            this.f67857b = true;
        }
        this.f67861f.a(i10);
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void a(int i10, int i11) {
        this.f67861f.a(i10, i11);
    }

    public final void a(Runnable runnable) {
        if (this.f67858c == runnable) {
            this.f67858c = null;
        }
    }

    public final void a(h hVar) {
        this.f67861f.f67799g = hVar;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean a(Context context) {
        if (this.f67856a) {
            return this.f67861f.a(context);
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final boolean b() {
        if (this.f67856a) {
            return this.f67861f.b();
        }
        return false;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void c() {
        this.f67861f.c();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void d() {
        this.f67861f.d();
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void e() {
        this.f67861f.e();
        this.f67859d = null;
    }

    @Override // sg.bigo.ads.ad.interstitial.a.b.a
    public final void f() {
        this.f67861f.f();
    }
}
