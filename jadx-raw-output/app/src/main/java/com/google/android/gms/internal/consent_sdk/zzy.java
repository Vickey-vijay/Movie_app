package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
import java.util.HashSet;

/* JADX INFO: compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    /* JADX WARN: Code duplicated, block: B:42:0x00ad  */
    public final zzab zza() throws zzg {
        String str;
        zzcl zzclVar = this.zzb;
        int i10 = zzclVar.zzf;
        boolean z10 = i10 == 8;
        zzz zzzVar = this.zza;
        zzzVar.zzc.zzh(z10);
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        }
        switch (i11) {
            case 1:
            case 2:
            case 3:
                this.zzc = 3;
                break;
            case 4:
                this.zzc = 2;
                break;
            case 5:
                this.zzc = 1;
                break;
            case 6:
                throw new zzg(1, "Invalid response from server: ".concat(String.valueOf(zzclVar.zzc)));
            case 7:
                throw new zzg(3, "Publisher misconfiguration: ".concat(String.valueOf(zzclVar.zzc)));
            default:
                throw new zzg(1, "Invalid response from server.");
        }
        int i12 = zzclVar.zzg;
        int i13 = i12 - 1;
        if (i12 == 0) {
            throw null;
        }
        if (i13 == 1) {
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED;
        } else {
            if (i13 != 2) {
                throw new zzg(1, "Invalid response from server.");
            }
            this.zzd = ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED;
        }
        String str2 = zzclVar.zza;
        zzbq zzbqVar = str2 == null ? null : new zzbq(zzclVar.zzb, str2);
        zzzVar.zzc.zzj(new HashSet(zzclVar.zzd));
        for (zzck zzckVar : zzclVar.zze) {
            int i14 = zzckVar.zzb;
            int i15 = i14 - 1;
            if (i14 == 0) {
                throw null;
            }
            if (i15 == 0) {
                str = null;
            } else if (i15 == 1) {
                str = "write";
            } else if (i15 != 2) {
                str = null;
            } else {
                str = "clear";
            }
            if (str != null) {
                zzzVar.zza.zzb(str, zzckVar.zza, zzzVar.zzb);
            }
        }
        return new zzab(this.zzc, this.zzd, zzbqVar, null);
    }

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }
}
