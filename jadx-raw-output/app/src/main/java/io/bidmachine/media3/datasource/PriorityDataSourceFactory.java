package io.bidmachine.media3.datasource;

import io.bidmachine.media3.common.PriorityTaskManager;
import io.bidmachine.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: classes6.dex */
@UnstableApi
@Deprecated
public final class PriorityDataSourceFactory implements DataSource.Factory {
    private final int priority;
    private final PriorityTaskManager priorityTaskManager;
    private final DataSource.Factory upstreamFactory;

    @Override // io.bidmachine.media3.datasource.DataSource.Factory
    public PriorityDataSource createDataSource() {
        return new PriorityDataSource(this.upstreamFactory.createDataSource(), this.priorityTaskManager, this.priority);
    }

    public PriorityDataSourceFactory(DataSource.Factory factory, PriorityTaskManager priorityTaskManager, int i10) {
        this.upstreamFactory = factory;
        this.priorityTaskManager = priorityTaskManager;
        this.priority = i10;
    }
}
