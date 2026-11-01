package yads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class gx1 {
    public static double a(List list) {
        Object next;
        ArrayList arrayList = new ArrayList(nj.t.v(list, 10));
        Iterator it = list.iterator();
        while (true) {
            double d10 = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            u41 u41Var = (u41) it.next();
            int i10 = u41Var.f83367b;
            if (i10 != 0) {
                d10 = ((double) u41Var.f83366a) / ((double) i10);
            }
            arrayList.add(Double.valueOf(d10));
        }
        ArrayList arrayList2 = new ArrayList(nj.t.v(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Integer.valueOf(ek.b.b(((Number) it2.next()).doubleValue() * ((double) 1000))));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int iIntValue = 1;
            if (!it3.hasNext()) {
                break;
            }
            int iIntValue2 = ((Number) it3.next()).intValue();
            Integer numValueOf = Integer.valueOf(iIntValue2);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(iIntValue2));
            if (num != null) {
                iIntValue = 1 + num.intValue();
            }
            linkedHashMap.put(numValueOf, Integer.valueOf(iIntValue));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        if (it4.hasNext()) {
            next = it4.next();
            if (it4.hasNext()) {
                int iIntValue3 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int iIntValue4 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (iIntValue3 < iIntValue4) {
                        next = next2;
                        iIntValue3 = iIntValue4;
                    }
                } while (it4.hasNext());
            }
        } else {
            next = null;
        }
        Map.Entry entry = (Map.Entry) next;
        Integer num2 = entry != null ? (Integer) entry.getValue() : null;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int iIntValue5 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && iIntValue5 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        Iterator it5 = linkedHashMap2.entrySet().iterator();
        while (it5.hasNext()) {
            arrayList3.add(Double.valueOf(((double) ((Number) ((Map.Entry) it5.next()).getKey()).intValue()) / ((double) 1000)));
        }
        List listG0 = nj.b0.G0(arrayList3);
        int size = listG0.size();
        int i11 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i12 = size % 2;
        if (i12 + ((((i12 ^ 2) & ((-i12) | i12)) >> 31) & 2) == 1) {
            return ((Number) listG0.get(i11)).doubleValue();
        }
        return (((Number) listG0.get(i11 - 1)).doubleValue() + ((Number) listG0.get(i11)).doubleValue()) / ((double) 2);
    }
}
