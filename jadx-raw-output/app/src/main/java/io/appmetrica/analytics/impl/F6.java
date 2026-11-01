package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import java.util.HashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class F6 implements DataSendingRestrictionController {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D6 f55223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f55224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashSet f55225c = new HashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f55226d = new HashSet();

    public final synchronized void a(@Nullable Boolean bool) {
        if (mo.a(bool) || this.f55224b == null) {
            Boolean boolValueOf = Boolean.valueOf(Boolean.FALSE.equals(bool));
            this.f55224b = boolValueOf;
            D6 d10 = this.f55223a;
            ((E6) d10).f55160a.c(boolValueOf.booleanValue()).b();
        }
    }

    public final synchronized void b(@Nullable Boolean bool) {
        if (this.f55224b == null) {
            a(bool);
        }
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForMainReporter() {
        return Boolean.TRUE.equals(this.f55224b);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForReporter(@NonNull String str) {
        boolean z10;
        if (this.f55225c.contains(str)) {
            z10 = true;
        } else {
            if (Boolean.TRUE.equals(this.f55224b)) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.control.DataSendingRestrictionController
    public final synchronized boolean isRestrictedForSdk() {
        Boolean bool;
        bool = this.f55224b;
        return bool == null ? this.f55226d.isEmpty() : bool.booleanValue();
    }

    public F6(@NonNull D6 d10) {
        this.f55223a = d10;
        this.f55224b = ((E6) d10).a();
    }

    public final synchronized void a(@NonNull String str, @Nullable Boolean bool) {
        if (mo.a(bool) || (!this.f55226d.contains(str) && !this.f55225c.contains(str))) {
            if (((Boolean) WrapUtils.getOrDefault(bool, Boolean.TRUE)).booleanValue()) {
                this.f55226d.add(str);
                this.f55225c.remove(str);
            } else {
                this.f55225c.add(str);
                this.f55226d.remove(str);
            }
        }
    }
}
