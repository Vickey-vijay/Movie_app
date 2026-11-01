package io.appmetrica.analytics.modulesapi.internal.service.event;

import com.safedk.android.analytics.events.CrashEvent;
import io.appmetrica.analytics.coreapi.internal.event.CounterReportApi;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u0006\u001a\u00020\u00058&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/service/event/ModuleEventServiceHandlerReporter;", "", "Lio/appmetrica/analytics/coreapi/internal/event/CounterReportApi;", CrashEvent.f44624e, "Lmj/r;", "", "isMain", "()Z", "modules-api_release"}, k = 1, mv = {1, 6, 0})
public interface ModuleEventServiceHandlerReporter {
    boolean isMain();

    void report(CounterReportApi counterReportApi);
}
