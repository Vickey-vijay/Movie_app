package q3;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorUtil.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j {
    public static int a(h hVar, byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int i12 = 0;
        while (i12 < i11) {
            int iPeek = hVar.peek(bArr, i10 + i12, i11 - i12);
            if (iPeek == -1) {
                break;
            }
            i12 += iPeek;
        }
        return i12;
    }
}
