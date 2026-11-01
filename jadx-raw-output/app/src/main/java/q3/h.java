package q3;

import java.io.IOException;

/* JADX INFO: compiled from: ExtractorInput.java */
/* JADX INFO: loaded from: classes4.dex */
public interface h {
    void advancePeekPosition(int i10) throws InterruptedException, IOException;

    boolean advancePeekPosition(int i10, boolean z10) throws InterruptedException, IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    void peekFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean peekFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    int read(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    void readFully(byte[] bArr, int i10, int i11) throws InterruptedException, IOException;

    boolean readFully(byte[] bArr, int i10, int i11, boolean z10) throws InterruptedException, IOException;

    void resetPeekPosition();

    int skip(int i10) throws InterruptedException, IOException;

    void skipFully(int i10) throws InterruptedException, IOException;
}
