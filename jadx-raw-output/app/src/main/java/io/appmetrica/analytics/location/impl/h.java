package io.appmetrica.analytics.location.impl;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f58100a;

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void consume(@Nullable Location location) {
        if (location != null) {
            this.f58100a.updateData(location);
        }
    }

    public h(@NonNull m mVar) {
        this.f58100a = mVar;
    }
}
