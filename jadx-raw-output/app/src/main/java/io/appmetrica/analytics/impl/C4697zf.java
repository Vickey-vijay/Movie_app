package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4697zf extends C4492ra {
    @Override // io.appmetrica.analytics.impl.C4492ra
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int b(@Nullable Z z10) {
        if (z10 == null) {
            return 0;
        }
        return StringUtils.getUtf8BytesLength(z10.f56261b) + 12;
    }

    public C4697zf(int i10) {
        super(i10);
    }
}
