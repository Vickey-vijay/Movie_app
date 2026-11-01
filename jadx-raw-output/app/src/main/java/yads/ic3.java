package yads;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ic3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nm3 f78587a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ed3 f78588b;

    public /* synthetic */ ic3(Context context, at1 at1Var) {
        this(d82.a(), new ed3(context, at1Var));
    }

    public final ec3 a(e82 e82Var) {
        String strC;
        nm3 nm3Var = this.f78587a;
        nm3Var.f80709a.getClass();
        int i10 = e82Var.f76976a;
        xp2 xp2Var = new xp2(e82Var.f76977b);
        Map mapJ = e82Var.f76978c;
        if (mapJ == null) {
            mapJ = kotlin.collections.a.j();
        }
        String strA = ((h82) nm3Var.f80710b).a(new wp2(i10, xp2Var, mapJ));
        Map mapJ2 = e82Var.f76978c;
        if (mapJ2 == null) {
            mapJ2 = kotlin.collections.a.j();
        }
        kn knVar = new kn(mapJ2);
        if (strA != null && strA.length() != 0) {
            try {
                zb3 zb3VarA = this.f78588b.a(strA, knVar);
                if (zb3VarA != null) {
                    Map map = e82Var.f76978c;
                    if (map == null || (strC = t01.c(map, u11.B)) == null || !Boolean.parseBoolean(strC)) {
                        strA = null;
                    }
                    return new ec3(zb3VarA, strA);
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public ic3(nm3 nm3Var, ed3 ed3Var) {
        this.f78587a = nm3Var;
        this.f78588b = ed3Var;
    }
}
