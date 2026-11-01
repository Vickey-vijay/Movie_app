package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.UUID;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.h0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4230h0 implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return new ro(this, false, "ApiKey is empty. Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
        try {
            UUID.fromString(str);
            return new ro(this, true, "");
        } catch (Throwable unused) {
            return new ro(this, false, "Invalid ApiKey=" + str + ". Please, read official documentation how to obtain one: https://appmetrica.io/docs/mobile-sdk-dg/android/about/android-initialize.html");
        }
    }
}
