package io.bidmachine.media3.datasource;

import android.net.Uri;
import androidx.annotation.Nullable;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;
import io.bidmachine.media3.datasource.PlaceholderDataSource;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
@UnstableApi
public final class PlaceholderDataSource implements DataSource {
    public static final PlaceholderDataSource INSTANCE = new PlaceholderDataSource();
    public static final DataSource.Factory FACTORY = new DataSource.Factory() { // from class: ag.i
        @Override // io.bidmachine.media3.datasource.DataSource.Factory
        public final DataSource createDataSource() {
            return PlaceholderDataSource.b();
        }
    };

    private PlaceholderDataSource() {
    }

    public static /* synthetic */ PlaceholderDataSource b() {
        return new PlaceholderDataSource();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void addTransferListener(TransferListener transferListener) {
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public void close() {
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @UnstableApi
    public /* bridge */ /* synthetic */ Map getResponseHeaders() {
        return super.getResponseHeaders();
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // io.bidmachine.media3.datasource.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // io.bidmachine.media3.datasource.DataSource, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }
}
