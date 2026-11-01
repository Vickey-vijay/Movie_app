package io.appmetrica.analytics.coreapi.internal.control;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&R\u0014\u0010\u000b\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/appmetrica/analytics/coreapi/internal/control/Toggle;", "", "Lio/appmetrica/analytics/coreapi/internal/control/ToggleObserver;", "toggleObserver", "", "sticky", "Lmj/r;", "registerObserver", "removeObserver", "getActualState", "()Z", "actualState", "core-api_release"}, k = 1, mv = {1, 6, 0})
public interface Toggle {
    boolean getActualState();

    void registerObserver(ToggleObserver toggleObserver, boolean z10);

    void removeObserver(ToggleObserver toggleObserver);
}
