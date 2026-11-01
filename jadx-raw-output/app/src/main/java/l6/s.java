package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import java.util.Map;

/* JADX INFO: compiled from: UPCAReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class s extends x {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final x f63466i = new h();

    @Override // l6.q, y5.h
    public y5.i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        return r(this.f63466i.a(bVar, map));
    }

    @Override // l6.x, l6.q
    public y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.f63466i.b(i10, aVar, map));
    }

    @Override // l6.x
    public int k(c6.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        return this.f63466i.k(aVar, iArr, sb2);
    }

    @Override // l6.x
    public y5.i l(int i10, c6.a aVar, int[] iArr, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        return r(this.f63466i.l(i10, aVar, iArr, map));
    }

    @Override // l6.x
    public BarcodeFormat p() {
        return BarcodeFormat.UPC_A;
    }

    public static y5.i r(y5.i iVar) throws FormatException {
        String strF = iVar.f();
        if (strF.charAt(0) == '0') {
            y5.i iVar2 = new y5.i(strF.substring(1), null, iVar.e(), BarcodeFormat.UPC_A);
            if (iVar.d() != null) {
                iVar2.g(iVar.d());
            }
            return iVar2;
        }
        throw FormatException.getFormatInstance();
    }
}
