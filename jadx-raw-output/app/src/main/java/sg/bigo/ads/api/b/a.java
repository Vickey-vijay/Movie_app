package sg.bigo.ads.api.b;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdBid;
import sg.bigo.ads.api.core.b;
import sg.bigo.ads.api.core.o;
import sg.bigo.ads.api.core.p;

/* JADX INFO: loaded from: classes11.dex */
public abstract class a<T extends Ad, U extends sg.bigo.ads.api.core.b> implements Ad, d<T> {

    @NonNull
    public final sg.bigo.ads.api.b X;

    @NonNull
    public sg.bigo.ads.common.v.a Y;

    /* JADX INFO: renamed from: aa, reason: collision with root package name */
    public a f69340aa;
    public int U = 0;
    public int V = 0;
    public int W = 0;
    public int Z = sg.bigo.ads.common.v.a.f70047a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public int f69341ab = 0;

    /* JADX INFO: renamed from: ac, reason: collision with root package name */
    public final o f69342ac = new o();

    /* JADX INFO: renamed from: sg.bigo.ads.api.b.a$a, reason: collision with other inner class name */
    public interface InterfaceC0697a {
        void a(sg.bigo.ads.api.core.c cVar);

        void b();
    }

    public a(@NonNull sg.bigo.ads.api.b bVar) {
        this.X = bVar;
    }

    public final a O() {
        return this.f69340aa;
    }

    @Nullable
    public final p P() {
        sg.bigo.ads.api.core.b bVarF = f();
        if (bVarF != null) {
            return bVarF.Y();
        }
        return null;
    }

    public final int Q() {
        return this.Z;
    }

    @NonNull
    public final sg.bigo.ads.api.b R() {
        return this.X;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(Ad ad2) {
        if (ad2 == null) {
            return 1;
        }
        return g() >= (ad2 instanceof a ? ((a) ad2).g() : 0.0d) ? 1 : -1;
    }

    public void a(int i10) {
        this.V = i10;
    }

    public abstract void a(int i10, int i11, String str);

    public void a(String str, String str2, int i10) {
    }

    public void a(boolean z10, boolean z11) {
        int i10;
        if (z11) {
            i10 = 1;
        } else {
            i10 = !z10 ? 2 : 3;
        }
        this.U = i10;
    }

    public abstract void b();

    public void b(int i10) {
        this.W = i10;
    }

    public o b_() {
        return this.f69342ac;
    }

    public abstract void c();

    public abstract String d();

    public abstract long e();

    @NonNull
    public abstract U f();

    public double g() {
        AdBid bid = getBid();
        return bid != null ? bid.getPrice() : (sg.bigo.ads.common.j.a.a(d(), e()) * 1.0d) / 1.0E8d;
    }

    public final void g(int i10) {
        this.Z = i10;
    }

    public int z() {
        int i10 = this.f69341ab + 1;
        this.f69341ab = i10;
        return i10;
    }
}
