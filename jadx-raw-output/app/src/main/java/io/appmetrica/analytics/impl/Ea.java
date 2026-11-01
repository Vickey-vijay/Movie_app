package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.plugins.IPluginReporter;

/* JADX INFO: loaded from: classes5.dex */
public interface Ea extends Sa, IPluginReporter {
    void b(@NonNull String str);

    void b(@NonNull String str, @Nullable String str2);

    boolean b();
}
