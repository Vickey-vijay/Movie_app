package io.bidmachine.media3.datasource;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
@UnstableApi
public interface DataSink {

    public interface Factory {
        DataSink createDataSink();
    }

    void close() throws IOException;

    void open(DataSpec dataSpec) throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;
}
