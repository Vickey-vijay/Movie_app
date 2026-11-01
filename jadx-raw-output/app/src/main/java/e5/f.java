package e5;

import java.io.IOException;

/* JADX INFO: compiled from: DataSink.java */
/* JADX INFO: loaded from: classes10.dex */
public interface f {

    /* JADX INFO: compiled from: DataSink.java */
    public interface a {
        f createDataSink();
    }

    void a(h hVar) throws IOException;

    void close() throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
