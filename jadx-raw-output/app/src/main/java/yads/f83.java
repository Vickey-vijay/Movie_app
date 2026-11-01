package yads;

import android.content.Context;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes7.dex */
public final class f83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4 f77335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f77336b;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f83(Context context, d4 d4Var, lu2 lu2Var) {
        iu3 iu3Var = (iu3) lu2Var;
        iu3Var.d();
        pu3 pu3Var = pu3.f81606a;
        this(d4Var, cf.a(context, iu3Var.b()));
    }

    public final void a(Map map, nt2 nt2Var) {
        co2 co2Var = co2.f76352c;
        if (nt2Var == null || !nt2Var.f80800w0) {
            return;
        }
        d4 d4Var = this.f77335a;
        Pair[] pairArr = new Pair[2];
        pairArr[0] = mj.h.a("ad_type", d4Var.f76559a.f76868b);
        String str = d4Var.f76561c.f78158a;
        if (str == null) {
            str = "";
        }
        pairArr[1] = mj.h.a("ad_unit_id", str);
        this.f77336b.a(new eo2("tracking_event", kotlin.collections.a.B(kotlin.collections.a.q(kotlin.collections.a.m(pairArr), map)), null));
    }

    public f83(d4 d4Var, io2 io2Var) {
        this.f77335a = d4Var;
        this.f77336b = io2Var;
    }
}
