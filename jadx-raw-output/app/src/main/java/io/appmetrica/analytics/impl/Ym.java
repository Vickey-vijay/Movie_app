package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;

/* JADX INFO: loaded from: classes7.dex */
public final class Ym extends N2 {
    public Ym(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    public Ym(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final String a(@Nullable String str) {
        if (str != null) {
            int length = str.length();
            int i10 = this.f55598a;
            if (length > i10) {
                String strSubstring = str.substring(0, i10);
                this.f55600c.warning("\"%s\" %s size exceeded limit of %d characters", this.f55599b, str, Integer.valueOf(this.f55598a));
                return strSubstring;
            }
        }
        return str;
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f55598a;
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f55599b;
    }
}
