package v6;

import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.common.reedsolomon.ReedSolomonException;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.Map;

/* JADX INFO: compiled from: Decoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6.c f73112a = new e6.c(e6.a.f52437l);

    public final void a(byte[] bArr, int i10) throws ChecksumException {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f73112a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (ReedSolomonException unused) {
            throw ChecksumException.getChecksumInstance();
        }
    }

    public c6.d b(c6.b bVar, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        ChecksumException e10;
        com.google.zxing.qrcode.decoder.a aVar = new com.google.zxing.qrcode.decoder.a(bVar);
        FormatException formatException = null;
        try {
            return c(aVar, map);
        } catch (ChecksumException e11) {
            e10 = e11;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                c6.d dVarC = c(aVar, map);
                dVarC.m(new e(true));
                return dVarC;
            } catch (ChecksumException | FormatException unused) {
                if (formatException != null) {
                    throw formatException;
                }
                throw e10;
            }
        } catch (FormatException e12) {
            e10 = null;
            formatException = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            c6.d dVarC2 = c(aVar, map);
            dVarC2.m(new e(true));
            return dVarC2;
        }
    }

    public final c6.d c(com.google.zxing.qrcode.decoder.a aVar, Map<DecodeHintType, ?> map) throws ChecksumException, FormatException {
        f fVarE = aVar.e();
        ErrorCorrectionLevel errorCorrectionLevelD = aVar.d().d();
        a[] aVarArrB = a.b(aVar.c(), fVarE, errorCorrectionLevelD);
        int iC = 0;
        for (a aVar2 : aVarArrB) {
            iC += aVar2.c();
        }
        byte[] bArr = new byte[iC];
        int i10 = 0;
        for (a aVar3 : aVarArrB) {
            byte[] bArrA = aVar3.a();
            int iC2 = aVar3.c();
            a(bArrA, iC2);
            int i11 = 0;
            while (i11 < iC2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        return b.a(bArr, fVarE, errorCorrectionLevelD, map);
    }
}
