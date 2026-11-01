package yads;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q82 {
    public static e82 a(po2 po2Var, long j10, List list) {
        lr lrVar = po2Var.f81502p;
        if (lrVar == null) {
            return new e82(304, null, e82.a(list), list, true);
        }
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                treeSet.add(((q01) it.next()).f81668a);
            }
        }
        ArrayList arrayList = new ArrayList(list);
        List list2 = lrVar.f79890h;
        if (list2 != null) {
            if (!list2.isEmpty()) {
                for (q01 q01Var : lrVar.f79890h) {
                    if (!treeSet.contains(q01Var.f81668a)) {
                        arrayList.add(q01Var);
                    }
                }
            }
        } else if (!lrVar.f79889g.isEmpty()) {
            for (Map.Entry entry : lrVar.f79889g.entrySet()) {
                if (!treeSet.contains(entry.getKey())) {
                    arrayList.add(new q01((String) entry.getKey(), (String) entry.getValue()));
                }
            }
        }
        return new e82(304, lrVar.f79883a, e82.a(arrayList), arrayList, true);
    }

    public static byte[] a(InputStream inputStream, int i10, gr grVar) throws Throwable {
        byte[] bArrA;
        cg2 cg2Var = new cg2(grVar, i10);
        try {
            bArrA = grVar.a(1024);
            while (true) {
                try {
                    int i11 = inputStream.read(bArrA);
                    if (i11 == -1) {
                        break;
                    }
                    cg2Var.write(bArrA, 0, i11);
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        inputStream.close();
                    } catch (IOException unused) {
                        boolean z10 = lm3.f79855a;
                        boolean z11 = ad1.f75480a;
                    }
                    grVar.a(bArrA);
                    cg2Var.close();
                    throw th;
                }
            }
            byte[] byteArray = cg2Var.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                boolean z12 = lm3.f79855a;
                boolean z13 = ad1.f75480a;
            }
            grVar.a(bArrA);
            cg2Var.close();
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            bArrA = null;
        }
    }
}
