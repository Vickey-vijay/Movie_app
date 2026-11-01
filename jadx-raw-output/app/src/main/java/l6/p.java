package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultiFormatUPCEANReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class p extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final x[] f63463b = new x[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x[] f63464a;

    @Override // l6.q, y5.h
    public void reset() {
        for (x xVar : this.f63464a) {
            xVar.reset();
        }
    }

    public p(Map<DecodeHintType, ?> map) {
        Collection collection;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13)) {
                arrayList.add(new h());
            } else if (collection.contains(BarcodeFormat.UPC_A)) {
                arrayList.add(new s());
            }
            if (collection.contains(BarcodeFormat.EAN_8)) {
                arrayList.add(new j());
            }
            if (collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new z());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new h());
            arrayList.add(new j());
            arrayList.add(new z());
        }
        this.f63464a = (x[]) arrayList.toArray(f63463b);
    }

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        boolean z10;
        Collection collection;
        boolean z11;
        int[] iArrO = x.o(aVar);
        for (x xVar : this.f63464a) {
            try {
                y5.i iVarL = xVar.l(i10, aVar, iArrO, map);
                if (iVarL.b() == BarcodeFormat.EAN_13 && iVarL.f().charAt(0) == '0') {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (map == null) {
                    collection = null;
                } else {
                    collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
                }
                if (collection != null && !collection.contains(BarcodeFormat.UPC_A)) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (z10 && z11) {
                    y5.i iVar = new y5.i(iVarL.f().substring(1), iVarL.c(), iVarL.e(), BarcodeFormat.UPC_A);
                    iVar.g(iVarL.d());
                    return iVar;
                }
                return iVarL;
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }
}
