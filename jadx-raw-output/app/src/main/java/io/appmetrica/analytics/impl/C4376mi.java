package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4376mi implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f57290a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        return this.f57290a.containsKey(str) ? new ro(this, false, String.format("Failed to activate AppMetrica with provided apiKey ApiKey %s has already been used by another reporter.", str)) : new ro(this, true, "");
    }

    public C4376mi(@NonNull Map<String, ?> map) {
        this.f57290a = map;
    }
}
