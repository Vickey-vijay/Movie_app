package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;

/* JADX INFO: loaded from: classes.dex */
public class R4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f55816a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f55817b;

    public boolean d() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        R4 r10 = (R4) obj;
        String str = this.f55816a;
        if (str == null ? r10.f55816a != null : !str.equals(r10.f55816a)) {
            return false;
        }
        String str2 = this.f55817b;
        String str3 = r10.f55817b;
        if (str2 != null) {
            return str2.equals(str3);
        }
        return str3 == null;
    }

    @NonNull
    public final String a() {
        return ApiKeyUtils.createPartialApiKey(this.f55817b);
    }

    @Nullable
    public final String b() {
        return this.f55817b;
    }

    public final String c() {
        return this.f55816a;
    }

    public String e() {
        return this.f55816a + "_" + ApiKeyUtils.createPartialApiKey(this.f55817b);
    }

    public final int hashCode() {
        String str = this.f55816a;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f55817b;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return this.f55816a + "_" + this.f55817b;
    }

    public R4(String str, String str2) {
        this.f55816a = str;
        this.f55817b = str2;
    }
}
