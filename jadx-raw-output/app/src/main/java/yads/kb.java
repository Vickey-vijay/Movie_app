package yads;

import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class kb {
    public static List a(y90 y90Var) {
        String str;
        String strD;
        List listC = nj.r.c();
        listC.add(v90.f83835a);
        listC.add(new w90("Info"));
        if (y90Var.f() == c50.f76167c && y90Var.a() != null) {
            String strD2 = y90Var.d();
            if (strD2 != null && !lk.a0.n0(strD2)) {
                strD = y90Var.d();
            } else {
                strD = "ID";
            }
            listC.add(new x90(strD, y90Var.a()));
        }
        listC.add(new x90("Type", y90Var.f().a()));
        List<d80> listE = y90Var.e();
        if (listE != null) {
            for (d80 d80Var : listE) {
                listC.add(new x90(d80Var.a(), d80Var.b()));
            }
        }
        List listB = y90Var.b();
        if (listB != null && !listB.isEmpty()) {
            listC.add(v90.f83835a);
            listC.add(new w90("CPM floors"));
            String strD3 = y90Var.d();
            if (strD3 != null && !lk.a0.n0(strD3)) {
                str = y90Var.d() + ": ";
            } else {
                str = "";
            }
            for (ha0 ha0Var : y90Var.b()) {
                listC.add(new x90(str + ha0Var.b(), "cpm: " + ha0Var.a()));
            }
        }
        return nj.r.a(listC);
    }
}
