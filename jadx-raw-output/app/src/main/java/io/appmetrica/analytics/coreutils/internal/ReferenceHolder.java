package io.appmetrica.analytics.coreutils.internal;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import nj.b0;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\u000e\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0001J\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/ReferenceHolder;", "", "reference", "Lmj/r;", "storeReference", "removeReference", "", "peekReferences", "<init>", "()V", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class ReferenceHolder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f54713a = new LinkedHashSet();

    public final Set<Object> peekReferences() {
        return b0.T0(this.f54713a);
    }

    public final void removeReference(Object obj) {
        this.f54713a.remove(obj);
    }

    public final void storeReference(Object obj) {
        this.f54713a.add(obj);
    }
}
