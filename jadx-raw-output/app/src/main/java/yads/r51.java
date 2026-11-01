package yads;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class r51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f82104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f82105c;

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.f82104b;
        int i10 = 0;
        if (objArr instanceof u51) {
            u51 u51Var = (u51) objArr;
            j51 j51Var = (j51) this.f82105c;
            Object[] objArrCopyOf = new Object[u51Var.size() * 2];
            ja3 it = u51Var.iterator();
            ja3 it2 = j51Var.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                Object next2 = it2.next();
                int i11 = i10 + 1;
                int i12 = i11 * 2;
                if (i12 > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i51.a(objArrCopyOf.length, i12));
                }
                kx.a(next, next2);
                int i13 = i10 * 2;
                objArrCopyOf[i13] = next;
                objArrCopyOf[i13 + 1] = next2;
                i10 = i11;
            }
            return xm2.a(i10, objArrCopyOf);
        }
        Object[] objArr2 = this.f82105c;
        Object[] objArrCopyOf2 = new Object[objArr.length * 2];
        int i14 = 0;
        while (i10 < objArr.length) {
            Object[] objArr3 = objArr[i10];
            Object obj = objArr2[i10];
            int i15 = i14 + 1;
            int i16 = i15 * 2;
            if (i16 > objArrCopyOf2.length) {
                objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, i51.a(objArrCopyOf2.length, i16));
            }
            kx.a(objArr3, obj);
            int i17 = i14 * 2;
            objArrCopyOf2[i17] = objArr3;
            objArrCopyOf2[i17 + 1] = obj;
            i10++;
            i14 = i15;
            objArrCopyOf2 = objArrCopyOf2;
        }
        return xm2.a(i14, objArrCopyOf2);
    }

    public r51(s51 s51Var) {
        xm2 xm2Var = (xm2) s51Var;
        Object[] objArr = new Object[xm2Var.size()];
        Object[] objArr2 = new Object[xm2Var.size()];
        ja3 it = xm2Var.entrySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            objArr[i10] = entry.getKey();
            objArr2[i10] = entry.getValue();
            i10++;
        }
        this.f82104b = objArr;
        this.f82105c = objArr2;
    }
}
