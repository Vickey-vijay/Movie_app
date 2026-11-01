package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4699zh extends AbstractC4247hh {
    @Override // io.appmetrica.analytics.impl.AbstractC4247hh, io.appmetrica.analytics.impl.InterfaceC4272ih
    public final boolean a(@Nullable Boolean bool) {
        return !this.f56906a.isRestrictedForSdk() && ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }

    public C4699zh(F6 f10) {
        super(f10);
    }
}
