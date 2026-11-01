package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes8.dex */
public enum ErrorCorrectionLevel {
    L(1),
    M(0),
    Q(3),
    H(2);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ErrorCorrectionLevel[] f20884b;
    private final int bits;

    static {
        ErrorCorrectionLevel errorCorrectionLevel = L;
        ErrorCorrectionLevel errorCorrectionLevel2 = M;
        ErrorCorrectionLevel errorCorrectionLevel3 = Q;
        f20884b = new ErrorCorrectionLevel[]{errorCorrectionLevel2, errorCorrectionLevel, H, errorCorrectionLevel3};
    }

    public static ErrorCorrectionLevel forBits(int i10) {
        if (i10 >= 0) {
            ErrorCorrectionLevel[] errorCorrectionLevelArr = f20884b;
            if (i10 < errorCorrectionLevelArr.length) {
                return errorCorrectionLevelArr[i10];
            }
        }
        throw new IllegalArgumentException();
    }

    public int getBits() {
        return this.bits;
    }

    ErrorCorrectionLevel(int i10) {
        this.bits = i10;
    }
}
