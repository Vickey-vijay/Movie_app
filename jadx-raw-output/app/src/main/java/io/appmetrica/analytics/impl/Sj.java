package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class Sj extends AbstractC4247hh {
    @Override // io.appmetrica.analytics.impl.AbstractC4247hh, io.appmetrica.analytics.impl.InterfaceC4272ih
    public final boolean a(@Nullable Boolean bool) {
        return !this.f56906a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }

    public Sj(@NonNull F6 f10) {
        super(f10);
    }
}
