package e6;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ReedSolomonEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f52451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<b> f52452b;

    public final b a(int i10) {
        if (i10 >= this.f52452b.size()) {
            List<b> list = this.f52452b;
            b bVarI = list.get(list.size() - 1);
            for (int size = this.f52452b.size(); size <= i10; size++) {
                a aVar = this.f52451a;
                bVarI = bVarI.i(new b(aVar, new int[]{1, aVar.c((size - 1) + aVar.d())}));
                this.f52452b.add(bVarI);
            }
        }
        return this.f52452b.get(i10);
    }

    public void b(int[] iArr, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("No error correction bytes");
        }
        int length = iArr.length - i10;
        if (length <= 0) {
            throw new IllegalArgumentException("No data bytes provided");
        }
        b bVarA = a(i10);
        int[] iArr2 = new int[length];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        int[] iArrE = new b(this.f52451a, iArr2).j(i10, 1).b(bVarA)[1].e();
        int length2 = i10 - iArrE.length;
        for (int i11 = 0; i11 < length2; i11++) {
            iArr[length + i11] = 0;
        }
        System.arraycopy(iArrE, 0, iArr, length + length2, iArrE.length);
    }

    public d(a aVar) {
        this.f52451a = aVar;
        ArrayList arrayList = new ArrayList();
        this.f52452b = arrayList;
        arrayList.add(new b(aVar, new int[]{1}));
    }
}
