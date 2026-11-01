package okio;

import ck.p;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: NioFileSystemFileHandle.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class NioFileSystemFileHandle extends FileHandle {
    private final FileChannel fileChannel;

    @Override // okio.FileHandle
    public synchronized void protectedClose() {
        this.fileChannel.close();
    }

    @Override // okio.FileHandle
    public synchronized void protectedFlush() {
        this.fileChannel.force(true);
    }

    @Override // okio.FileHandle
    public synchronized int protectedRead(long j10, byte[] bArr, int i10, int i11) {
        p.j(bArr, "array");
        this.fileChannel.position(j10);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr, i10, i11);
        int i12 = 0;
        while (i12 < i11) {
            int i13 = this.fileChannel.read(byteBufferWrap);
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
            this.fileChannel.truncate(j10);
        }
    }

    @Override // okio.FileHandle
    public synchronized long protectedSize() {
        return this.fileChannel.size();
    }

    @Override // okio.FileHandle
    public synchronized void protectedWrite(long j10, byte[] bArr, int i10, int i11) {
        p.j(bArr, "array");
        this.fileChannel.position(j10);
        this.fileChannel.write(ByteBuffer.wrap(bArr, i10, i11));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NioFileSystemFileHandle(boolean z10, FileChannel fileChannel) {
        super(z10);
        p.j(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }
}
