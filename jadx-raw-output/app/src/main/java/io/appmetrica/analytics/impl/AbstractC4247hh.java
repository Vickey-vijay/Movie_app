package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.hh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4247hh implements InterfaceC4272ih {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public final DataSendingRestrictionController f56906a;

    @Override // io.appmetrica.analytics.impl.InterfaceC4272ih
    public boolean a(@Nullable Boolean bool) {
        return ((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue();
    }

    public AbstractC4247hh(@NonNull DataSendingRestrictionController dataSendingRestrictionController) {
        this.f56906a = dataSendingRestrictionController;
    }
}
