package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.permission.PermissionStrategy;
import io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor;
import io.appmetrica.analytics.coreutils.internal.services.ContextPermissionChecker;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ul, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4578ul implements PermissionExtractor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f57774b = "[SimplePermissionExtractor]";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionStrategy f57775a;

    @NonNull
    @VisibleForTesting
    public final PermissionStrategy a() {
        return this.f57775a;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.system.PermissionExtractor
    public final boolean hasPermission(@NonNull Context context, @NonNull String str) {
        if (this.f57775a.forbidUsePermission(str)) {
            return false;
        }
        return ContextPermissionChecker.hasPermission(context, str);
    }

    public C4578ul(@NonNull PermissionStrategy permissionStrategy) {
        this.f57775a = permissionStrategy;
    }
}
