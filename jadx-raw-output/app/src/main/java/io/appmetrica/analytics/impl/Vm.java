package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.io.UnsupportedEncodingException;

/* JADX INFO: loaded from: classes7.dex */
public final class Vm extends N2 {
    public Vm(int i10, @NonNull String str) {
        this(i10, str, PublicLogger.getAnonymousInstance());
    }

    public Vm(int i10, @NonNull String str, @NonNull PublicLogger publicLogger) {
        super(i10, str, publicLogger);
    }

    @NonNull
    @VisibleForTesting(otherwise = 3)
    public final String a() {
        return this.f55599b;
    }

    @VisibleForTesting(otherwise = 3)
    public final int b() {
        return this.f55598a;
    }

    @Override // io.appmetrica.analytics.impl.Mn
    @Nullable
    public final String a(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            byte[] bytes = str.getBytes("UTF-8");
            int length = bytes.length;
            int i10 = this.f55598a;
            if (length <= i10) {
                return str;
            }
            String str2 = new String(bytes, 0, i10, "UTF-8");
            try {
                this.f55600c.warning("\"%s\" %s exceeded limit of %d bytes", this.f55599b, str, Integer.valueOf(this.f55598a));
            } catch (UnsupportedEncodingException unused) {
            }
            return str2;
        } catch (UnsupportedEncodingException unused2) {
            return str;
        }
    }
}
