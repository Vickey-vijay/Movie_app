package io.appmetrica.analytics.impl;

import androidx.annotation.Nullable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.rb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4493rb implements to {
    @Override // io.appmetrica.analytics.impl.to
    public final ro a(@Nullable String str) {
        if (str == null) {
            return new ro(this, false, "key is null");
        }
        if (str.startsWith(H7.f55295b)) {
            return new ro(this, false, "key starts with appmetrica");
        }
        return str.length() > 200 ? new ro(this, false, "key length more then 200 characters") : new ro(this, true, "");
    }
}
