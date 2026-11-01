package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager$OnChecksumsReadyListener;
import android.os.Build;
import androidx.exifinterface.media.ExifInterface;
import java.security.cert.CertificateEncodingException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzbcb {
    public static String zza(Context context, String str, List list, Executor executor) throws ExecutionException, InterruptedException, PackageManager.NameNotFoundException, CertificateEncodingException {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(ExifInterface.LATITUDE_SOUTH)) {
            return null;
        }
        final zzhah zzhahVarZze = zzhah.zze();
        context.getPackageManager().requestChecksums(str, false, 8, list, new PackageManager$OnChecksumsReadyListener() { // from class: com.google.android.gms.internal.ads.zzbca
            public final /* synthetic */ void onChecksumsReady(List list2) {
                zzhah zzhahVar = zzhahVarZze;
                if (list2 == null) {
                    zzhahVar.zza((Object) null);
                    return;
                }
                try {
                    int size = list2.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        ApkChecksum apkChecksum = (ApkChecksum) list2.get(i10);
                        if (apkChecksum.getType() == 8) {
                            zzhahVar.zza(zzban.zza(apkChecksum.getValue()));
                            return;
                        }
                    }
                    zzhahVar.zza((Object) null);
                } catch (Throwable unused) {
                    zzhahVar.zza((Object) null);
                }
            }
        });
        return (String) zzhahVarZze.get();
    }
}
