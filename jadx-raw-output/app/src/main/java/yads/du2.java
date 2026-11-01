package yads;

import android.content.Context;
import io.appmetrica.analytics.AppMetricaLibraryAdapter;
import java.util.HashSet;
import kotlin.Result;

/* JADX INFO: loaded from: classes7.dex */
public final class du2 implements oo, uo2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xt2 f76800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tt2 f76801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5 f76802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f76803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final xy f76804e = xy.f84741c;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        this.f76802c.a(v5.f83753m);
        tt2 tt2Var = this.f76801b;
        xy xyVar = this.f76804e;
        if (tt2Var.f83173a.isActive()) {
            nk.l lVar = tt2Var.f83173a;
            Result.a aVar = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(new gu2(im3Var, xyVar)));
        }
    }

    @Override // yads.uo2
    public final void b() {
        this.f76802c.a(v5.f83752l);
        this.f76802c.a(v5.f83753m, null);
    }

    public du2(Context context, xt2 xt2Var, tt2 tt2Var, w5 w5Var) {
        this.f76800a = xt2Var;
        this.f76801b = tt2Var;
        this.f76802c = w5Var;
        this.f76803d = context.getApplicationContext();
    }

    @Override // yads.up2
    public final void a(Object obj) {
        HashSet<ot2> hashSet;
        Object objM3458constructorimpl;
        nt2 nt2Var = (nt2) obj;
        xt2 xt2Var = this.f76800a;
        Context context = this.f76803d;
        xt2Var.getClass();
        synchronized (xt2.f84686b) {
            hashSet = new HashSet(xt2Var.f84688a.keySet());
            Object obj2 = dw2.f76819j;
            cw2.a().a(context, nt2Var);
            mj.r rVar = mj.r.f64562a;
        }
        for (ot2 ot2Var : hashSet) {
            boolean z10 = !ot2Var.f81143a.f75821a.b(context);
            if (ot2Var.f81144b.f82998a.b()) {
                try {
                    Result.a aVar = Result.Companion;
                    AppMetricaLibraryAdapter.setAdvIdentifiersTracking(z10);
                    objM3458constructorimpl = Result.m3458constructorimpl(mj.r.f64562a);
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    objM3458constructorimpl = Result.m3458constructorimpl(kotlin.c.a(th2));
                }
                if (Result.m3461exceptionOrNullimpl(objM3458constructorimpl) != null) {
                    boolean z11 = ad1.f75480a;
                }
            }
        }
        this.f76802c.a(v5.f83753m);
        tt2 tt2Var = this.f76801b;
        xy xyVar = this.f76804e;
        if (tt2Var.f83173a.isActive()) {
            nk.l lVar = tt2Var.f83173a;
            Result.a aVar3 = Result.Companion;
            lVar.resumeWith(Result.m3458constructorimpl(new hu2(nt2Var, xyVar)));
        }
    }
}
