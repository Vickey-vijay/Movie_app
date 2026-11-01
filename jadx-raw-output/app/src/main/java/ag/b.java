package ag;

import android.net.http.UploadDataProvider;
import android.net.http.UploadDataSink;
import androidx.annotation.RequiresApi;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: ByteArrayUploadDataProvider.java */
/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(34)
public final class b extends UploadDataProvider {
    private final byte[] data;
    private int position;

    @Override // android.net.http.UploadDataProvider
    public void rewind(UploadDataSink uploadDataSink) throws IOException {
        this.position = 0;
        uploadDataSink.onRewindSucceeded();
    }

    @Override // android.net.http.UploadDataProvider
    public long getLength() {
        return this.data.length;
    }

    public b(byte[] bArr) {
        this.data = bArr;
    }

    @Override // android.net.http.UploadDataProvider
    public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
        int iMin = Math.min(byteBuffer.remaining(), this.data.length - this.position);
        byteBuffer.put(this.data, this.position, iMin);
        this.position += iMin;
        uploadDataSink.onReadSucceeded(false);
    }
}
