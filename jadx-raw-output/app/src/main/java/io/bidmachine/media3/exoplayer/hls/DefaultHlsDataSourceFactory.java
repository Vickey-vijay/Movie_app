package io.bidmachine.media3.exoplayer.hls;

import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.datasource.DataSource;

/* JADX INFO: loaded from: classes10.dex */
@UnstableApi
public final class DefaultHlsDataSourceFactory implements HlsDataSourceFactory {
    private final DataSource.Factory dataSourceFactory;

    @Override // io.bidmachine.media3.exoplayer.hls.HlsDataSourceFactory
    public DataSource createDataSource(int i10) {
        return this.dataSourceFactory.createDataSource();
    }

    public DefaultHlsDataSourceFactory(DataSource.Factory factory) {
        this.dataSourceFactory = factory;
    }
}
