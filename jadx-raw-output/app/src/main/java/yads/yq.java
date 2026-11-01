package yads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public abstract class yq {
    public static sm2 a(wq wqVar, ArrayList arrayList) {
        m51 m51Var = p51.f81258c;
        kx.a(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i10 = 0;
        int i11 = 0;
        while (i10 < arrayList.size()) {
            Bundle bundle = (Bundle) arrayList.get(i10);
            bundle.getClass();
            xq xqVarFromBundle = wqVar.fromBundle(bundle);
            xqVarFromBundle.getClass();
            int i12 = i11 + 1;
            if (objArrCopyOf.length < i12) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
            }
            objArrCopyOf[i11] = xqVarFromBundle;
            i10++;
            i11 = i12;
        }
        return p51.b(i11, objArrCopyOf);
    }
}
