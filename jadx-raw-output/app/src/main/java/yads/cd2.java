package yads;

import java.util.Locale;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class cd2 implements oo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nt2 f76230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f83 f76231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k83 f76232c;

    @Override // yads.tp2
    public final void a(im3 im3Var) {
        im3Var.getClass();
        boolean z10 = ad1.f75480a;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = mj.h.a("tracking_result", "failure");
        String lowerCase = this.f76232c.name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        pairArr[1] = mj.h.a("tracking_url_type", lowerCase);
        String message = im3Var.getMessage();
        if (message == null) {
            message = "Unknown Volley error";
        }
        pairArr[2] = mj.h.a("error_message", message);
        Map mapO = kotlin.collections.a.o(pairArr);
        f83 f83Var = this.f76231b;
        co2 co2Var = co2.f76352c;
        f83Var.a(mapO, this.f76230a);
    }

    public cd2(String str, nt2 nt2Var, f83 f83Var, k83 k83Var) {
        this.f76230a = nt2Var;
        this.f76231b = f83Var;
        this.f76232c = k83Var;
    }

    @Override // yads.up2
    public final void a(Object obj) {
        int i10 = ((e82) obj).f76976a;
        boolean z10 = ad1.f75480a;
        Pair pairA = mj.h.a("tracking_result", "success");
        String lowerCase = this.f76232c.name().toLowerCase(Locale.ROOT);
        ck.p.i(lowerCase, "toLowerCase(...)");
        Map mapO = kotlin.collections.a.o(pairA, mj.h.a("tracking_url_type", lowerCase), mj.h.a("code", Integer.valueOf(i10)));
        f83 f83Var = this.f76231b;
        co2 co2Var = co2.f76352c;
        f83Var.a(mapO, this.f76230a);
    }
}
