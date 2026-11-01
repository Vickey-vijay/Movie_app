package y5;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import l6.o;

/* JADX INFO: compiled from: MultiFormatReader.java */
/* JADX INFO: loaded from: classes9.dex */
public final class e implements h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h[] f75279c = new h[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<DecodeHintType, ?> f75280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h[] f75281b;

    public final i b(b bVar) throws NotFoundException {
        h[] hVarArr = this.f75281b;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                try {
                    return hVar.a(bVar, this.f75280a);
                } catch (ReaderException unused) {
                }
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    public i c(b bVar) throws NotFoundException {
        if (this.f75281b == null) {
            d(null);
        }
        return b(bVar);
    }

    public void d(Map<DecodeHintType, ?> map) {
        this.f75280a = map;
        boolean z10 = true;
        boolean z11 = map != null && map.containsKey(DecodeHintType.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(DecodeHintType.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (!collection.contains(BarcodeFormat.UPC_A) && !collection.contains(BarcodeFormat.UPC_E) && !collection.contains(BarcodeFormat.EAN_13) && !collection.contains(BarcodeFormat.EAN_8) && !collection.contains(BarcodeFormat.CODABAR) && !collection.contains(BarcodeFormat.CODE_39) && !collection.contains(BarcodeFormat.CODE_93) && !collection.contains(BarcodeFormat.CODE_128) && !collection.contains(BarcodeFormat.ITF) && !collection.contains(BarcodeFormat.RSS_14) && !collection.contains(BarcodeFormat.RSS_EXPANDED)) {
                z10 = false;
            }
            if (z10 && !z11) {
                arrayList.add(new o(map));
            }
            if (collection.contains(BarcodeFormat.QR_CODE)) {
                arrayList.add(new u6.a());
            }
            if (collection.contains(BarcodeFormat.DATA_MATRIX)) {
                arrayList.add(new f6.a());
            }
            if (collection.contains(BarcodeFormat.AZTEC)) {
                arrayList.add(new z5.b());
            }
            if (collection.contains(BarcodeFormat.PDF_417)) {
                arrayList.add(new p6.b());
            }
            if (collection.contains(BarcodeFormat.MAXICODE)) {
                arrayList.add(new j6.a());
            }
            if (z10 && z11) {
                arrayList.add(new o(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z11) {
                arrayList.add(new o(map));
            }
            arrayList.add(new u6.a());
            arrayList.add(new f6.a());
            arrayList.add(new z5.b());
            arrayList.add(new p6.b());
            arrayList.add(new j6.a());
            if (z11) {
                arrayList.add(new o(map));
            }
        }
        this.f75281b = (h[]) arrayList.toArray(f75279c);
    }

    @Override // y5.h
    public void reset() {
        h[] hVarArr = this.f75281b;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                hVar.reset();
            }
        }
    }

    @Override // y5.h
    public i a(b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        d(map);
        return b(bVar);
    }
}
