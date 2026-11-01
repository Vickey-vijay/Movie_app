package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
public final class Mf implements uo, InterfaceC4690z8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC4690z8
    public final int a(@NonNull J8 j10) {
        return 2;
    }

    @Override // io.appmetrica.analytics.impl.uo
    @NonNull
    public final byte[] a(@NonNull O8 o10, @NonNull C4350lh c4350lh) {
        return TextUtils.isEmpty(o10.f55674b) ? new byte[0] : Base64.decode(o10.f55674b, 0);
    }
}
