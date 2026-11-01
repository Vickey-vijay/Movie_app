package com.applovin.shadow.okhttp3.internal.cache2;

import ck.p;
import com.applovin.shadow.okio.Buffer;
import java.io.IOException;
import java.nio.channels.FileChannel;

/* JADX INFO: compiled from: FileOperator.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class FileOperator {
    private final FileChannel fileChannel;

    public FileOperator(FileChannel fileChannel) {
        p.j(fileChannel, "fileChannel");
        this.fileChannel = fileChannel;
    }

    public final void read(long j10, Buffer buffer, long j11) throws IOException {
        p.j(buffer, "sink");
        if (j11 < 0) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferTo = this.fileChannel.transferTo(j10, j11, buffer);
            j10 += jTransferTo;
            j11 -= jTransferTo;
        }
    }

    public final void write(long j10, Buffer buffer, long j11) throws IOException {
        p.j(buffer, "source");
        if (j11 < 0 || j11 > buffer.size()) {
            throw new IndexOutOfBoundsException();
        }
        while (j11 > 0) {
            long jTransferFrom = this.fileChannel.transferFrom(buffer, j10, j11);
            j10 += jTransferFrom;
            j11 -= jTransferFrom;
        }
    }
}
