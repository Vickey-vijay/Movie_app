package com.google.android.gms.common.signatureverification;

import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes2.dex */
@ShowFirstParty
@KeepForSdk
public class SignatureVerificationConfigurationProvider {
    private static final SignatureVerificationConfiguration zza = zzd.zzc();

    private SignatureVerificationConfigurationProvider() {
    }

    @NonNull
    public static SignatureVerificationConfiguration zza() {
        return zza;
    }
}
