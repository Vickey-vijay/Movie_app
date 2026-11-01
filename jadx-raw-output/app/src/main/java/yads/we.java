package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class we {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dg f84176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ho2 f84177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zg f84178c;

    public /* synthetic */ we(Context context) {
        this(xe.a(context), new ho2(), new zg(context));
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public final void a(co2 co2Var, Map map, String str, j5 j5Var) {
        boolean z10;
        bg bgVar;
        zg zgVar = this.f84178c;
        nt2 nt2VarA = zgVar.f85383b.a(zgVar.f85384c);
        boolean z11 = !((nt2VarA == null || nt2VarA.f80786p0) ? false : true);
        dw2 dw2Var = zgVar.f85383b;
        dw2Var.getClass();
        synchronized (dw2.f76819j) {
            z10 = dw2Var.f76827g;
        }
        if (zgVar.a() && z11 && z10) {
            this.f84177b.getClass();
            bg bgVar2 = null;
            try {
                int iOrdinal = co2Var.ordinal();
                if (iOrdinal == 0) {
                    bgVar = new bg(cg.f76270e, ho2.c(str, map));
                } else if (iOrdinal == 4) {
                    bgVar = new bg(cg.f76269d, ho2.a(str, map));
                } else if (iOrdinal == 8) {
                    bgVar = new bg(cg.f76268c, ho2.a(map));
                } else if (iOrdinal == 21) {
                    bgVar = new bg(cg.f76271f, ho2.a(map, j5Var, str));
                } else {
                    if (iOrdinal != 26) {
                        if (iOrdinal == 36) {
                            bgVar = new bg(cg.f76273h, ho2.d(str, map));
                        }
                        if (bgVar2 != null) {
                            ((ve) this.f84176a).b(bgVar2);
                        }
                    }
                    bgVar = new bg(cg.f76272g, ho2.b(str, map));
                }
                bgVar2 = bgVar;
            } catch (Throwable unused) {
                boolean z12 = ad1.f75480a;
            }
            if (bgVar2 != null) {
                ((ve) this.f84176a).b(bgVar2);
            }
        }
    }

    public we(dg dgVar, ho2 ho2Var, zg zgVar) {
        this.f84176a = dgVar;
        this.f84177b = ho2Var;
        this.f84178c = zgVar;
    }
}
