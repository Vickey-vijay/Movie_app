package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes10.dex */
public final class u03 implements zf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v22 f83287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kz f83288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z00 f83289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pu f83290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final io2 f83291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final iy1 f83292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mj f83293g;

    @Override // yads.zf0
    public final void a(ViewGroup viewGroup) {
        try {
            r12 r12VarA = this.f83293g.a((ExtendedNativeAdView) viewGroup, this.f83292f);
            v22 v22Var = this.f83287a;
            pu puVar = this.f83290d;
            v22Var.getClass();
            v22Var.a(r12VarA.f82072c, v22Var.Q, new z12(r12VarA), puVar);
            o43 o43Var = new o43(this.f83289c);
            Iterator it = this.f83287a.i().iterator();
            while (it.hasNext()) {
                ((w02) it.next()).a(o43Var);
            }
            this.f83287a.b(this.f83289c);
        } catch (j02 e10) {
            this.f83288b.e();
            this.f83291e.reportError("Failed to bind DivKit Slider Ad", e10);
        }
    }

    @Override // yads.zf0
    public final void c() {
        this.f83287a.b((z00) null);
        Iterator it = this.f83287a.i().iterator();
        while (it.hasNext()) {
            ((w02) it.next()).a((z00) null);
        }
    }

    public u03(v22 v22Var, kz kzVar, z00 z00Var, pu puVar, at1 at1Var, iy1 iy1Var, mj mjVar) {
        this.f83287a = v22Var;
        this.f83288b = kzVar;
        this.f83289c = z00Var;
        this.f83290d = puVar;
        this.f83291e = at1Var;
        this.f83292f = iy1Var;
        this.f83293g = mjVar;
    }
}
