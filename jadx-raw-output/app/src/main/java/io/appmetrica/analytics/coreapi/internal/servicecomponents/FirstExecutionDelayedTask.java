package io.appmetrica.analytics.coreapi.internal.servicecomponents;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/servicecomponents/FirstExecutionDelayedTask;", "", "", "delay", "Lmj/r;", "setInitialDelaySeconds", "launchDelaySeconds", "", "tryExecute", "core-api_release"}, k = 1, mv = {1, 6, 0})
public interface FirstExecutionDelayedTask {
    void setInitialDelaySeconds(long j10);

    boolean tryExecute(long launchDelaySeconds);
}
