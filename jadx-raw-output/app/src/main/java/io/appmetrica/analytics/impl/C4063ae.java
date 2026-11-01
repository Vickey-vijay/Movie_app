package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C4063ae implements to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f56355a;

    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        if (!TextUtils.isEmpty(str)) {
            return new ro(this, true, "");
        }
        return new ro(this, false, this.f56355a + " is empty.");
    }

    public C4063ae(@NonNull String str) {
        this.f56355a = str;
    }
}
