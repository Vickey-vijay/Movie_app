package yads;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public abstract class pc1 {
    /* JADX WARN: Code duplicated, block: B:17:0x0041  */
    public static oc1 a(j52 j52Var, List list) {
        int iIntValue;
        Integer num;
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            if (!it.hasNext()) {
                num = null;
            } else {
                Integer numValueOf = Integer.valueOf(((py2) it.next()).f81651c);
                while (it.hasNext()) {
                    Integer numValueOf2 = Integer.valueOf(((py2) it.next()).f81651c);
                    if (numValueOf.compareTo(numValueOf2) < 0) {
                        numValueOf = numValueOf2;
                    }
                }
                num = numValueOf;
            }
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 50;
            }
        } else {
            iIntValue = 50;
        }
        return new oc1(j52Var, iIntValue);
    }
}
