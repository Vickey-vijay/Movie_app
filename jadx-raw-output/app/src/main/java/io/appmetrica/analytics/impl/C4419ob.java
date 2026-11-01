package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.backport.Consumer;
import io.appmetrica.analytics.coreapi.internal.backport.Function;
import java.io.File;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ob, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4419ob implements Function, Consumer {
    @Override // io.appmetrica.analytics.coreapi.internal.backport.Function
    @Nullable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C4318kb apply(@NonNull File file) {
        String strA = Ka.a(file);
        if (!TextUtils.isEmpty(strA)) {
            try {
                return new C4318kb(strA);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.Consumer
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final void consume(@NonNull File file) {
        try {
            file.delete();
        } catch (Throwable unused) {
        }
    }
}
