package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: loaded from: classes2.dex */
public abstract class qf1 {
    public static ArrayList a(Object... objArr) {
        objArr.getClass();
        int length = objArr.length;
        kx.a(length, "arraySize");
        ArrayList arrayList = new ArrayList(td1.b(((long) length) + 5 + ((long) (length / 10))));
        Collections.addAll(arrayList, objArr);
        return arrayList;
    }
}
