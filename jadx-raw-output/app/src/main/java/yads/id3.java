package yads;

import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class id3 extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd3 f78595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hd3 f78596c;

    /* JADX WARN: Illegal instructions before constructor call */
    public id3(gd3 gd3Var, hd3 hd3Var) {
        String lowerCase = hd3Var.name().toLowerCase(Locale.US);
        ck.p.i(lowerCase, "toLowerCase(...)");
        super("Verification not executed with reason = " + lowerCase);
        this.f78595b = gd3Var;
        this.f78596c = hd3Var;
    }
}
