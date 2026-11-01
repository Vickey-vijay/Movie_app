package com.google.android.gms.internal.ads;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzehy implements zzgzl {
    public final /* synthetic */ boolean zza;
    public final /* synthetic */ zzehz zzb;

    public zzehy(zzehz zzehzVar, boolean z10) {
        this.zza = z10;
        Objects.requireNonNull(zzehzVar);
        this.zzb = zzehzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzl
    public final void zza(Throwable th2) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzf("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:22:0x005d  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x0078  */
    /* JADX WARN: Code duplicated, block: B:30:0x0080  */
    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x008a  */
    /* JADX WARN: Code duplicated, block: B:34:0x008c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0094  */
    /* JADX WARN: Code duplicated, block: B:37:0x0096  */
    /* JADX WARN: Code duplicated, block: B:39:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x009f  */
    /* JADX WARN: Code duplicated, block: B:43:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00ab  */
    @Override // com.google.android.gms.internal.ads.zzgzl
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List listEmptyList;
        List listAsList;
        final ArrayList arrayList;
        Iterator it;
        byte b10;
        zzbgj.zzd.zza zzaVar;
        zzehz zzehzVar = this.zzb;
        zzdah zzdahVar = (zzdah) obj;
        if (zzehzVar.zzf()) {
            return;
        }
        Bundle bundle = zzdahVar.zza;
        Object obj2 = bundle.get("ad_types");
        if (!(obj2 instanceof List)) {
            if (obj2 instanceof String[]) {
                listAsList = Arrays.asList((String[]) obj2);
            } else {
                listEmptyList = Collections.emptyList();
            }
            arrayList = new ArrayList();
            it = listEmptyList.iterator();
            while (it.hasNext()) {
                switch ((String) it.next()) {
                    case "banner":
                        b10 = 0;
                        break;
                    case "native":
                        b10 = 2;
                        break;
                    case "rewarded":
                        b10 = 3;
                        break;
                    case "interstitial":
                        b10 = 1;
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 != 0) {
                    zzaVar = zzbgj.zzd.zza.BANNER;
                } else if (b10 != 1) {
                    zzaVar = zzbgj.zzd.zza.INTERSTITIAL;
                } else if (b10 != 2) {
                    zzaVar = zzbgj.zzd.zza.NATIVE_APP_INSTALL;
                } else if (b10 != 3) {
                    zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
                } else {
                    zzaVar = zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD;
                }
                arrayList.add(zzaVar);
            }
            final zzbgj.zzaf.zzd zzdVarZze = zzehz.zze(bundle);
            final zzbgj.zzab zzabVarZzb = zzehzVar.zzb(bundle);
            final boolean z10 = this.zza;
            zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
                @Override // com.google.android.gms.internal.ads.zzfmu
                public final /* synthetic */ Object zza(Object obj3) {
                    zzehz zzehzVar2 = this.zza.zzb;
                    SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj3;
                    if (zzehzVar2.zzf()) {
                        return null;
                    }
                    zzbgj.zzaf.zzd zzdVar = zzdVarZze;
                    zzbgj.zzab zzabVar = zzabVarZzb;
                    ArrayList arrayList2 = arrayList;
                    boolean z11 = z10;
                    byte[] bArrZzc = zzehzVar2.zzc(z11, arrayList2, zzabVar, zzdVar);
                    zzeic.zzf(sQLiteDatabase, z11, true);
                    zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), bArrZzc);
                    return null;
                }
            });
        }
        listAsList = (List) obj2;
        ArrayList arrayList2 = new ArrayList(listAsList.size());
        for (Object obj3 : listAsList) {
            if (obj3 instanceof String) {
                arrayList2.add((String) obj3);
            }
        }
        listEmptyList = Collections.unmodifiableList(arrayList2);
        arrayList = new ArrayList();
        it = listEmptyList.iterator();
        while (it.hasNext()) {
            switch ((String) it.next()) {
                case -1396342996:
                    if (!r2.equals("banner")) {
                        b10 = 0;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -1052618729:
                    if (!r2.equals("native")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case -239580146:
                    if (!r2.equals("rewarded")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 604727084:
                    if (!r2.equals("interstitial")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0) {
                zzaVar = zzbgj.zzd.zza.BANNER;
            } else if (b10 != 1) {
                zzaVar = zzbgj.zzd.zza.INTERSTITIAL;
            } else if (b10 != 2) {
                zzaVar = zzbgj.zzd.zza.NATIVE_APP_INSTALL;
            } else if (b10 != 3) {
                zzaVar = zzbgj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED;
            } else {
                zzaVar = zzbgj.zzd.zza.REWARD_BASED_VIDEO_AD;
            }
            arrayList.add(zzaVar);
        }
        final zzbgj.zzaf.zzd zzdVarZze2 = zzehz.zze(bundle);
        final zzbgj.zzab zzabVarZzb2 = zzehzVar.zzb(bundle);
        final boolean z11 = this.zza;
        zzehzVar.zza.zza(new zzfmu() { // from class: com.google.android.gms.internal.ads.zzehx
            @Override // com.google.android.gms.internal.ads.zzfmu
            public final /* synthetic */ Object zza(Object obj4) {
                zzehz zzehzVar2 = this.zza.zzb;
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj4;
                if (zzehzVar2.zzf()) {
                    return null;
                }
                zzbgj.zzaf.zzd zzdVar = zzdVarZze2;
                zzbgj.zzab zzabVar = zzabVarZzb2;
                ArrayList arrayList3 = arrayList;
                boolean z12 = z11;
                byte[] bArrZzc = zzehzVar2.zzc(z12, arrayList3, zzabVar, zzdVar);
                zzeic.zzf(sQLiteDatabase, z12, true);
                zzeic.zze(sQLiteDatabase, zzehzVar2.zzd().zzb(), bArrZzc);
                return null;
            }
        });
    }
}
