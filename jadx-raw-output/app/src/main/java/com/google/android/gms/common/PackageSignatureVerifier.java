package com.google.android.gms.common;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.signatureverification.SignatureVerificationConfigurationProvider;
import com.google.android.gms.dynamite.DynamiteModule;
import com.ironsource.Y1;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
/* JADX INFO: loaded from: classes8.dex */
@ShowFirstParty
@KeepForSdk
public class PackageSignatureVerifier {

    @Nullable
    @VisibleForTesting
    public static volatile zzac zza;

    @Nullable
    private static zzad zzb;

    private static synchronized zzad zza(Context context) {
        if (zzb == null) {
            zzb = new zzad(context);
        }
        return zzb;
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerified(@NonNull Context context, @NonNull String str) {
        String str2;
        boolean zHonorsDebugCertificates = GooglePlayServicesUtilLight.honorsDebugCertificates(context);
        zza(context);
        zzm zzmVar = zzo.zza;
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            try {
                zzo.zzb();
                boolean zZzi = zzo.zzg.zzi();
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                if (zZzi) {
                    SignatureVerificationConfigurationProvider.zza().zza();
                    String strValueOf = String.valueOf(str);
                    if (true != zHonorsDebugCertificates) {
                        str2 = "-0";
                    } else {
                        str2 = Y1.f27894f;
                    }
                    String strConcat = strValueOf.concat(str2);
                    if (zza != null && zza.zza().equals(strConcat)) {
                        return zza.zzb();
                    }
                    str.isEmpty();
                    zza(context);
                    zzv zzvVar = new zzv(null);
                    zzvVar.zza(str);
                    zzvVar.zzb(zHonorsDebugCertificates);
                    zzvVar.zzc(false);
                    zzy zzyVarZzc = zzo.zzc(zzvVar.zzd());
                    if (zzyVarZzc.zza) {
                        PackageVerificationResult packageVerificationResultZzd = PackageVerificationResult.zzd(str, zzyVarZzc.zzd, null);
                        zza = new zzac(strConcat, packageVerificationResultZzd);
                        return packageVerificationResultZzd;
                    }
                    String str3 = zzyVarZzc.zzb;
                    Preconditions.checkNotNull(str3);
                    return PackageVerificationResult.zza(str, str3, zzyVarZzc.zzc, null);
                }
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                throw th2;
            }
        } catch (RemoteException | DynamiteModule.LoadingException e10) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e10);
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
        throw new zzae();
    }

    @NonNull
    @ShowFirstParty
    @KeepForSdk
    public PackageVerificationResult queryPackageSignatureVerifiedWithRetry(@NonNull Context context, @NonNull String str) {
        try {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified = queryPackageSignatureVerified(context, str);
            packageVerificationResultQueryPackageSignatureVerified.zzc();
            return packageVerificationResultQueryPackageSignatureVerified;
        } catch (SecurityException e10) {
            PackageVerificationResult packageVerificationResultQueryPackageSignatureVerified2 = queryPackageSignatureVerified(context, str);
            if (packageVerificationResultQueryPackageSignatureVerified2.zzb()) {
                Log.e("PkgSignatureVerifier", "Got flaky result during package signature verification", e10);
                return packageVerificationResultQueryPackageSignatureVerified2;
            }
            return packageVerificationResultQueryPackageSignatureVerified2;
        }
    }
}
