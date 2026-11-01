package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Collection;

/* JADX INFO: loaded from: classes8.dex */
public final class Zd implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56285a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable Collection<Object> collection) {
        if (!mo.a((Collection) collection)) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f56285a + " is null or empty.");
    }

    public Zd(@NonNull String str) {
        this.f56285a = str;
    }
}
