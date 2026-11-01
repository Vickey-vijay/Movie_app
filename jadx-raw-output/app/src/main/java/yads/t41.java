package yads;

/* JADX INFO: loaded from: classes5.dex */
public final class t41 {
    public static s41 a(byte[] bArr) {
        if (bArr.length < 12) {
            return s41.f82522e;
        }
        if (bArr.length >= 8 && bArr[0] == -119 && bArr[1] == 80 && bArr[2] == 78 && bArr[3] == 71 && bArr[4] == 13 && bArr[5] == 10 && bArr[6] == 26 && bArr[7] == 10) {
            return s41.f82519b;
        }
        if (bArr.length >= 3 && bArr[0] == -1 && bArr[1] == -40 && bArr[2] == -1) {
            return s41.f82520c;
        }
        return (bArr.length >= 4 && bArr[0] == 71 && bArr[1] == 73 && bArr[2] == 70 && bArr[3] == 56) ? s41.f82521d : s41.f82522e;
    }
}
