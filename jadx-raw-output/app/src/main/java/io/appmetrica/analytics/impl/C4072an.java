package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.an, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4072an implements uo {
    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        return !TextUtils.isEmpty(o10.f55674b) ? StringUtils.getUTF8Bytes(o10.f55674b) : new byte[0];
    }
}
