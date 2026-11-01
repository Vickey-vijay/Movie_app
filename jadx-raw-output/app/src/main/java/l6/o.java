package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: compiled from: MultiFormatOneDReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q[] f63461b = new q[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q[] f63462a;

    @Override // l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        for (q qVar : this.f63462a) {
            try {
                return qVar.b(i10, aVar, map);
            } catch (ReaderException unused) {
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // l6.q, y5.h
    public void reset() {
        for (q qVar : this.f63462a) {
            qVar.reset();
        }
    }

    public o(Map<DecodeHintType, ?> map) {
        Collection collection;
        boolean z10;
        if (map == null) {
            collection = null;
        } else {
            collection = (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        }
        if (map != null && map.get(DecodeHintType.ASSUME_CODE_39_CHECK_DIGIT) != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(BarcodeFormat.EAN_13) || collection.contains(BarcodeFormat.UPC_A) || collection.contains(BarcodeFormat.EAN_8) || collection.contains(BarcodeFormat.UPC_E)) {
                arrayList.add(new p(map));
            }
            if (collection.contains(BarcodeFormat.CODE_39)) {
                arrayList.add(new d(z10));
            }
            if (collection.contains(BarcodeFormat.CODE_93)) {
                arrayList.add(new f());
            }
            if (collection.contains(BarcodeFormat.CODE_128)) {
                arrayList.add(new c());
            }
            if (collection.contains(BarcodeFormat.ITF)) {
                arrayList.add(new m());
            }
            if (collection.contains(BarcodeFormat.CODABAR)) {
                arrayList.add(new a());
            }
            if (collection.contains(BarcodeFormat.RSS_14)) {
                arrayList.add(new m6.e());
            }
            if (collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                arrayList.add(new n6.d());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new p(map));
            arrayList.add(new d());
            arrayList.add(new a());
            arrayList.add(new f());
            arrayList.add(new c());
            arrayList.add(new m());
            arrayList.add(new m6.e());
            arrayList.add(new n6.d());
        }
        this.f63462a = (q[]) arrayList.toArray(f63461b);
    }
}
