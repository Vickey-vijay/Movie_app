package io.appmetrica.analytics.coreutils.internal.toggle;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u000b"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/toggle/OuterStateToggle;", "Lio/appmetrica/analytics/coreutils/internal/toggle/SimpleThreadSafeToggle;", "", "state", "Lmj/r;", "update", "initialState", "", "tag", "<init>", "(ZLjava/lang/String;)V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class OuterStateToggle extends SimpleThreadSafeToggle {
    public OuterStateToggle(boolean z10, String str) {
        super(z10, str);
    }

    public final void update(boolean z10) {
        super.updateState(z10);
    }
}
