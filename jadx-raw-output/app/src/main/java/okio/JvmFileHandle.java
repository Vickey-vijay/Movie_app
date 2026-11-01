package okio;

import ck.p;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: JvmFileHandle.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class JvmFileHandle extends FileHandle {
    private final RandomAccessFile randomAccessFile;

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.randomAccessFile.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.randomAccessFile.getFD().sync();
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j10, byte[] bArr, int i10, int i11) {
        p.j(bArr, "array");
        this.randomAccessFile.seek(j10);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.randomAccessFile.read(bArr, i10, i11 - i12);
            if (i13 == -1) {
                if (i12 != 0) {
                    break;
                }
                return -1;
            }
            i12 += i13;
        }
        return i12;
    }

    @Override // okio.FileHandle
    public synchronized void protectedResize(long j10) {
        long size = size();
        long j11 = j10 - size;
        if (j11 > 0) {
            int i10 = (int) j11;
            protectedWrite(size, new byte[i10], 0, i10);
        } else {
            this.randomAccessFile.setLength(j10);
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.randomAccessFile.length();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j10, byte[] bArr, int i10, int i11) {
        p.j(bArr, "array");
        this.randomAccessFile.seek(j10);
        this.randomAccessFile.write(bArr, i10, i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JvmFileHandle(boolean z10, RandomAccessFile randomAccessFile) {
        super(z10);
        p.j(randomAccessFile, "randomAccessFile");
        this.randomAccessFile = randomAccessFile;
    }
}
