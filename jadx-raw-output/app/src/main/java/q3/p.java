package q3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: Id3Peeker.java */
/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g5.t f66462a = new g5.t(10);

    @Nullable
    public Metadata a(h hVar, @Nullable f4.b.a aVar) throws InterruptedException, IOException {
        Metadata metadataD = null;
        int i10 = 0;
        while (true) {
            try {
                hVar.peekFully(this.f66462a.f53154a, 0, 10);
                this.f66462a.L(0);
                if (this.f66462a.B() != 4801587) {
                    break;
                }
                this.f66462a.M(3);
                int iX = this.f66462a.x();
                int i11 = iX + 10;
                if (metadataD == null) {
                    byte[] bArr = new byte[i11];
                    System.arraycopy(this.f66462a.f53154a, 0, bArr, 0, 10);
                    hVar.peekFully(bArr, 10, iX);
                    metadataD = new f4.b(aVar).d(bArr, i11);
                } else {
                    hVar.advancePeekPosition(iX);
                }
                i10 += i11;
            } catch (EOFException unused) {
            }
        }
        hVar.resetPeekPosition();
        hVar.advancePeekPosition(i10);
        return metadataD;
    }
}
