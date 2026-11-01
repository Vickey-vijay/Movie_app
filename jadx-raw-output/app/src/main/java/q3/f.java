package q3;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: compiled from: DummyTrackOutput.java */
/* JADX INFO: loaded from: classes4.dex */
public final class f implements u {
    @Override // q3.u
    public void a(Format format) {
    }

    @Override // q3.u
    public void d(long j10, int i10, int i11, int i12, @Nullable u.a aVar) {
    }

    @Override // q3.u
    public int b(h hVar, int i10, boolean z10) throws InterruptedException, IOException {
        int iSkip = hVar.skip(i10);
        if (iSkip == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        return iSkip;
    }

    @Override // q3.u
    public void c(g5.t tVar, int i10) {
        tVar.M(i10);
    }
}
