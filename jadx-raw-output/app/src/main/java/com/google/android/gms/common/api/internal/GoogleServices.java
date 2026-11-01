package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.StringResourceValueReader;
import com.google.android.gms.common.internal.zzae;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes9.dex */
@KeepForSdk
@Deprecated
public final class GoogleServices {
    private static final Object zza = new Object();

    @Nullable
    private static GoogleServices zzb;

    @Nullable
    private final String zzc;
    private final Status zzd;
    private final boolean zze;
    private final boolean zzf;

    @KeepForSdk
    @VisibleForTesting
    public GoogleServices(String str, boolean z10) {
        this.zzc = str;
        this.zzd = Status.RESULT_SUCCESS;
        this.zze = z10;
        this.zzf = !z10;
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context) {
        Status status;
        Preconditions.checkNotNull(context, "Context must not be null.");
        synchronized (zza) {
            if (zzb == null) {
                zzb = new GoogleServices(context);
            }
            status = zzb.zzd;
        }
        return status;
    }

    @KeepForSdk
    private static GoogleServices checkInitialized(String str) {
        GoogleServices googleServices;
        synchronized (zza) {
            googleServices = zzb;
            if (googleServices == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 34);
                sb2.append("Initialize must be called before ");
                sb2.append(str);
                sb2.append(".");
                throw new IllegalStateException(sb2.toString());
            }
        }
        return googleServices;
    }

    @KeepForSdk
    @VisibleForTesting
    public static void clearInstanceForTest() {
        synchronized (zza) {
            zzb = null;
        }
    }

    @Nullable
    @KeepForSdk
    public static String getGoogleAppId() {
        return checkInitialized("getGoogleAppId").zzc;
    }

    @KeepForSdk
    public static boolean isMeasurementEnabled() {
        GoogleServices googleServicesCheckInitialized = checkInitialized("isMeasurementEnabled");
        return googleServicesCheckInitialized.zzd.isSuccess() && googleServicesCheckInitialized.zze;
    }

    @KeepForSdk
    public static boolean isMeasurementExplicitlyDisabled() {
        return checkInitialized("isMeasurementExplicitlyDisabled").zzf;
    }

    @KeepForSdk
    @VisibleForTesting
    public Status checkGoogleAppId(String str) {
        String str2 = this.zzc;
        if (str2 == null || str2.equals(str)) {
            return Status.RESULT_SUCCESS;
        }
        StringBuilder sb2 = new StringBuilder(str2.length() + 97);
        sb2.append("Initialize was called with two different Google App IDs.  Only the first app ID will be used: '");
        sb2.append(str2);
        sb2.append("'.");
        return new Status(10, sb2.toString());
    }

    @KeepForSdk
    @VisibleForTesting
    public GoogleServices(Context context) {
        boolean z10;
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("google_app_measurement_enable", TypedValues.Custom.S_INT, resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue));
        boolean z11 = true;
        if (identifier != 0) {
            int integer = resources.getInteger(identifier);
            if (integer != 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            z11 = integer != 0;
            this.zzf = z10;
        } else {
            this.zzf = false;
        }
        this.zze = z11;
        String strZza = zzae.zza(context);
        strZza = strZza == null ? new StringResourceValueReader(context).getString("google_app_id") : strZza;
        if (TextUtils.isEmpty(strZza)) {
            this.zzd = new Status(10, "Missing google app id value from from string resources with name google_app_id.");
            this.zzc = null;
        } else {
            this.zzc = strZza;
            this.zzd = Status.RESULT_SUCCESS;
        }
    }

    @NonNull
    @KeepForSdk
    public static Status initialize(@NonNull Context context, @NonNull String str, boolean z10) {
        Preconditions.checkNotNull(context, "Context must not be null.");
        Preconditions.checkNotEmpty(str, "App ID must be nonempty.");
        synchronized (zza) {
            GoogleServices googleServices = zzb;
            if (googleServices != null) {
                return googleServices.checkGoogleAppId(str);
            }
            GoogleServices googleServices2 = new GoogleServices(str, z10);
            zzb = googleServices2;
            return googleServices2.zzd;
        }
    }
}
