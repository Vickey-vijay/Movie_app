package io.appmetrica.analytics.impl;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ICrashTransformer;

/* JADX INFO: loaded from: classes2.dex */
public final class Ch extends AbstractC4313k6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Xn f55110d;

    public Ch(@NonNull Context context, @NonNull Xn xn2, @NonNull InterfaceC4287j6 interfaceC4287j6, @Nullable ICrashTransformer iCrashTransformer) {
        this(xn2, interfaceC4287j6, iCrashTransformer, new N9(context));
    }

    public Ch(Xn xn2, InterfaceC4287j6 interfaceC4287j6, ICrashTransformer iCrashTransformer, N9 n10) {
        super(interfaceC4287j6, iCrashTransformer, n10);
        this.f55110d = xn2;
    }
}
