package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.List;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ef, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4167ef implements R7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final C4497rf f56668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final List<C4142df> f56669b;

    @Override // io.appmetrica.analytics.impl.R7
    @NonNull
    public final List<C4142df> a() {
        return this.f56669b;
    }

    @Override // io.appmetrica.analytics.impl.R7
    @Nullable
    public final Object b() {
        return this.f56668a;
    }

    @Nullable
    public final C4497rf c() {
        return this.f56668a;
    }

    public final String toString() {
        return "PreloadInfoData{chosenPreloadInfo=" + this.f56668a + ", candidates=" + this.f56669b + '}';
    }

    public C4167ef(@NonNull C4497rf c4497rf, @NonNull List<C4142df> list) {
        this.f56668a = c4497rf;
        this.f56669b = list;
    }
}
