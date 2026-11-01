package p6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import java.util.ArrayList;
import java.util.Map;
import y5.h;
import y5.i;
import y5.j;

/* JADX INFO: compiled from: PDF417Reader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i[] f66011a = new i[0];

    public static int c(j[] jVarArr) {
        return Math.max(Math.max(d(jVarArr[0], jVarArr[4]), (d(jVarArr[6], jVarArr[2]) * 17) / 18), Math.max(d(jVarArr[1], jVarArr[5]), (d(jVarArr[7], jVarArr[3]) * 17) / 18));
    }

    public static int e(j[] jVarArr) {
        return Math.min(Math.min(f(jVarArr[0], jVarArr[4]), (f(jVarArr[6], jVarArr[2]) * 17) / 18), Math.min(f(jVarArr[1], jVarArr[5]), (f(jVarArr[7], jVarArr[3]) * 17) / 18));
    }

    @Override // y5.h
    public i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException {
        i iVar;
        i[] iVarArrB = b(bVar, map, false);
        if (iVarArrB.length == 0 || (iVar = iVarArrB[0]) == null) {
            throw NotFoundException.getNotFoundInstance();
        }
        return iVar;
    }

    @Override // y5.h
    public void reset() {
    }

    public static i[] b(y5.b bVar, Map<DecodeHintType, ?> map, boolean z10) throws NotFoundException, ChecksumException, FormatException {
        ArrayList arrayList = new ArrayList();
        s6.b bVarC = s6.a.c(bVar, map, z10);
        for (j[] jVarArr : bVarC.b()) {
            c6.d dVarI = q6.i.i(bVarC.a(), jVarArr[4], jVarArr[5], jVarArr[6], jVarArr[7], e(jVarArr), c(jVarArr));
            i iVar = new i(dVarI.h(), dVarI.e(), jVarArr, BarcodeFormat.PDF_417);
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, dVarI.b());
            c cVar = (c) dVarI.d();
            if (cVar != null) {
                iVar.h(ResultMetadataType.PDF417_EXTRA_METADATA, cVar);
            }
            arrayList.add(iVar);
        }
        return (i[]) arrayList.toArray(f66011a);
    }

    public static int d(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return 0;
        }
        return (int) Math.abs(jVar.c() - jVar2.c());
    }

    public static int f(j jVar, j jVar2) {
        if (jVar == null || jVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(jVar.c() - jVar2.c());
    }
}
