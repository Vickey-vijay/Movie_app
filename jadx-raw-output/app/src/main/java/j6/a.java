package j6;

import c6.b;
import c6.d;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.Map;
import k6.c;
import y5.h;
import y5.i;
import y5.j;

/* JADX INFO: compiled from: MaxiCodeReader.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j[] f61712b = new j[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f61713a = new c();

    @Override // y5.h
    public void reset() {
    }

    public static b b(b bVar) throws NotFoundException {
        int[] iArrF = bVar.f();
        if (iArrF != null) {
            int i10 = iArrF[0];
            int i11 = iArrF[1];
            int i12 = iArrF[2];
            int i13 = iArrF[3];
            b bVar2 = new b(30, 33);
            for (int i14 = 0; i14 < 33; i14++) {
                int i15 = (((i14 * i13) + (i13 / 2)) / 33) + i11;
                for (int i16 = 0; i16 < 30; i16++) {
                    if (bVar.d(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15)) {
                        bVar2.l(i16, i14);
                    }
                }
            }
            return bVar2;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // y5.h
    public i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        d dVarB = this.f61713a.b(b(bVar.a()), map);
        i iVar = new i(dVarB.h(), dVarB.e(), f61712b, BarcodeFormat.MAXICODE);
        String strB = dVarB.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return iVar;
    }
}
