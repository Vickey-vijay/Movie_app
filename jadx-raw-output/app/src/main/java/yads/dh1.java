package yads;

import android.content.Context;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class dh1 {
    public static ArrayList a(Context context) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new qe1(context, new eh1()));
        Object obj = dw2.f76819j;
        nt2 nt2VarA = cw2.a().a(context);
        if (nt2VarA != null && !nt2VarA.f80767g) {
            if (a01.f75351b == null) {
                synchronized (a01.f75350a) {
                    if (a01.f75351b == null) {
                        a01.f75351b = new xy0(context, "com.google.android.gms.location.LocationServices");
                    }
                    mj.r rVar = mj.r.f64562a;
                }
            }
            xy0 xy0Var = a01.f75351b;
            if (xy0Var == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            arrayList.add(xy0Var);
            arrayList.add(y01.a(context));
        }
        return arrayList;
    }
}
