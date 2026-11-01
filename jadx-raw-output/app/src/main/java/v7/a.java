package v7;

import java.io.IOException;

/* JADX INFO: compiled from: FileDownloadOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
public interface a {
    void close() throws IOException;

    void flushAndSync() throws IOException;

    void seek(long j10) throws IllegalAccessException, IOException;

    void setLength(long j10) throws IllegalAccessException, IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
