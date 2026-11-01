package z5;

import c6.d;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ResultMetadataType;
import com.google.zxing.aztec.decoder.Decoder;
import java.util.List;
import java.util.Map;
import y5.h;
import y5.i;
import y5.j;
import y5.k;

/* JADX INFO: compiled from: AztecReader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b implements h {
    @Override // y5.h
    public void reset() {
    }

    @Override // y5.h
    public i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        j[] jVarArrB;
        j[] jVarArrB2;
        FormatException formatException;
        k kVar;
        a6.a aVar = new a6.a(bVar.a());
        d dVarC = null;
        try {
            a aVarA = aVar.a(false);
            jVarArrB = aVarA.b();
            try {
                jVarArrB2 = jVarArrB;
                formatException = null;
                dVarC = new Decoder().c(aVarA);
                e = null;
            } catch (FormatException e10) {
                e = e10;
                jVarArrB2 = jVarArrB;
                formatException = e;
                e = null;
            } catch (NotFoundException e11) {
                e = e11;
                jVarArrB2 = jVarArrB;
                formatException = null;
            }
        } catch (FormatException e12) {
            e = e12;
            jVarArrB = null;
        } catch (NotFoundException e13) {
            e = e13;
            jVarArrB = null;
        }
        if (dVarC == null) {
            try {
                a aVarA2 = aVar.a(true);
                jVarArrB2 = aVarA2.b();
                dVarC = new Decoder().c(aVarA2);
            } catch (FormatException | NotFoundException e14) {
                if (e != null) {
                    throw e;
                }
                if (formatException != null) {
                    throw formatException;
                }
                throw e14;
            }
        }
        j[] jVarArr = jVarArrB2;
        if (map != null && (kVar = (k) map.get(DecodeHintType.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (j jVar : jVarArr) {
                kVar.a(jVar);
            }
        }
        i iVar = new i(dVarC.h(), dVarC.e(), dVarC.c(), jVarArr, BarcodeFormat.AZTEC, System.currentTimeMillis());
        List<byte[]> listA = dVarC.a();
        if (listA != null) {
            iVar.h(ResultMetadataType.BYTE_SEGMENTS, listA);
        }
        String strB = dVarC.b();
        if (strB != null) {
            iVar.h(ResultMetadataType.ERROR_CORRECTION_LEVEL, strB);
        }
        return iVar;
    }
}
