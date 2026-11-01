package androidx.media3.datasource;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@UnstableApi
public abstract class BaseDataSource implements DataSource {

    @Nullable
    private DataSpec dataSpec;
    private final boolean isNetwork;
    private int listenerCount;
    private final ArrayList<TransferListener> listeners = new ArrayList<>(1);

    public final void transferInitializing(DataSpec dataSpec) {
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).onTransferInitializing(this, dataSpec, this.isNetwork);
        }
    }

    public final void bytesTransferred(int i10) {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i11 = 0; i11 < this.listenerCount; i11++) {
            this.listeners.get(i11).onBytesTransferred(this, dataSpec, this.isNetwork, i10);
        }
    }

    public final void transferEnded() {
        DataSpec dataSpec = (DataSpec) Util.castNonNull(this.dataSpec);
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).onTransferEnd(this, dataSpec, this.isNetwork);
        }
        this.dataSpec = null;
    }

    public final void transferStarted(DataSpec dataSpec) {
        this.dataSpec = dataSpec;
        for (int i10 = 0; i10 < this.listenerCount; i10++) {
            this.listeners.get(i10).onTransferStart(this, dataSpec, this.isNetwork);
        }
    }

    public BaseDataSource(boolean z10) {
        this.isNetwork = z10;
    }

    @Override // androidx.media3.datasource.DataSource
    @UnstableApi
    public final void addTransferListener(TransferListener transferListener) {
        Assertions.checkNotNull(transferListener);
        if (!this.listeners.contains(transferListener)) {
            this.listeners.add(transferListener);
            this.listenerCount++;
        }
    }
}
