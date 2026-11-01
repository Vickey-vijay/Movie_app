package io.appmetrica.analytics.screenshot.impl;

import android.os.Bundle;
import io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter;

/* JADX INFO: renamed from: io.appmetrica.analytics.screenshot.impl.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C4713h implements BundleToServiceConfigConverter {
    @Override // io.appmetrica.analytics.modulesapi.internal.client.BundleToServiceConfigConverter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final D fromBundle(Bundle bundle) {
        bundle.setClassLoader(D.class.getClassLoader());
        D d10 = (D) bundle.getParcelable("config");
        return d10 == null ? new D(new j0()) : d10;
    }
}
