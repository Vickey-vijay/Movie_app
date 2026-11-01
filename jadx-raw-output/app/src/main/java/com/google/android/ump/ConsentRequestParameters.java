package com.google.android.ump;

import androidx.annotation.Nullable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.annotation.KeepForSdk;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes.dex */
public class ConsentRequestParameters {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f20245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f20246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public final ConsentDebugSettings f20247c;

    /* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f20248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public String f20249b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public ConsentDebugSettings f20250c;

        @RecentlyNonNull
        public ConsentRequestParameters build() {
            return new ConsentRequestParameters(this, null);
        }

        @RecentlyNonNull
        @KeepForSdk
        public Builder setAdMobAppId(@Nullable String str) {
            this.f20249b = str;
            return this;
        }

        @RecentlyNonNull
        public Builder setConsentDebugSettings(@Nullable ConsentDebugSettings consentDebugSettings) {
            this.f20250c = consentDebugSettings;
            return this;
        }

        @RecentlyNonNull
        public Builder setTagForUnderAgeOfConsent(boolean z10) {
            this.f20248a = z10;
            return this;
        }
    }

    public /* synthetic */ ConsentRequestParameters(Builder builder, zzb zzbVar) {
        this.f20245a = builder.f20248a;
        this.f20246b = builder.f20249b;
        this.f20247c = builder.f20250c;
    }

    @RecentlyNullable
    public ConsentDebugSettings getConsentDebugSettings() {
        return this.f20247c;
    }

    public boolean isTagForUnderAgeOfConsent() {
        return this.f20245a;
    }

    @RecentlyNullable
    public final String zza() {
        return this.f20246b;
    }
}
