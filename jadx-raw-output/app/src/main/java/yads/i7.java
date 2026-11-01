package yads;

import android.net.Uri;
import java.util.Iterator;

/* JADX INFO: loaded from: classes11.dex */
public final class i7 implements ph0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e03 f78509a;

    public i7(e03 e03Var) {
        this.f78509a = e03Var;
    }

    @Override // yads.ph0
    public final boolean a(Uri uri) {
        p03 p03Var;
        k7 k7Var;
        if (ck.p.e(uri.getHost(), "showNextAd")) {
            g7 g7Var = (g7) this.f78509a;
            int i10 = g7Var.f77661m - 1;
            if (i10 == g7Var.f77652d.f76195c && !g7Var.f77662n) {
                g7Var.f77662n = true;
                g7Var.f77650b.b();
            }
            if (g7Var.f77661m >= g7Var.f77658j.size()) {
                return true;
            }
            xe1 xe1Var = (xe1) nj.b0.i0(g7Var.f77658j, i10);
            if (xe1Var != null) {
                xe1Var.b();
            }
            j7 j7Var = (j7) nj.b0.i0(g7Var.f77659k, i10);
            if (j7Var != null && (k7Var = j7Var.f78927b) != null) {
                p03Var = k7Var.f79321a;
            } else {
                p03Var = null;
            }
            if (p03Var == p03.f81197c) {
                int size = g7Var.f77658j.size() - 1;
                g7Var.f77661m = size;
                Iterator it = g7Var.f77659k.subList(i10, size).iterator();
                long j10 = 0;
                while (it.hasNext()) {
                    j10 += ((j7) it.next()).f78926a;
                }
                g7Var.f77655g.f82669a += j10;
                lw lwVar = g7Var.f77656h;
                lwVar.f79948a += lwVar.f79949b;
                lwVar.f79949b = 0L;
                int i11 = g7Var.f77661m;
                g7Var.f77661m = i11 + 1;
                if (!((xe1) g7Var.f77658j.get(i11)).a()) {
                    if (g7Var.f77661m >= g7Var.f77658j.size()) {
                        g7Var.f77651c.e();
                        return true;
                    }
                    g7Var.b();
                    return true;
                }
                g7Var.a();
                g7Var.f77657i.a(g7Var.f77653e, g7Var.f77660l, g7Var.f77655g.f82669a);
                return true;
            }
            g7Var.b();
            return true;
        }
        return false;
    }
}
