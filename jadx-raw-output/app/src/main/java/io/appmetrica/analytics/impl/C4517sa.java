package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4517sa extends C4492ra {
    public C4517sa(int i10, int i11) {
        this(i10, new C4542ta(i11));
    }

    @VisibleForTesting
    public C4517sa(int i10, @NonNull C4542ta c4542ta) {
        super(i10, c4542ta);
    }

    @Override // io.appmetrica.analytics.impl.C4492ra
    public final int b(@Nullable Object obj) {
        return StringUtils.getUTF8Bytes((String) obj).length;
    }

    public final int a(@Nullable String str) {
        return StringUtils.getUTF8Bytes(str).length;
    }
}
