package com.google.android.gms.internal.ads;

import androidx.exifinterface.media.ExifInterface;
import java.util.HashMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzayb extends zzaxz {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzayb() {
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
    }

    @Override // com.google.android.gms.internal.ads.zzaxz
    public final HashMap zza() {
        HashMap map = new HashMap();
        map.put(0, this.zza);
        map.put(4, this.zze);
        map.put(3, this.zzd);
        map.put(2, this.zzc);
        map.put(1, Long.valueOf(this.zzb));
        return map;
    }

    public zzayb(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = ExifInterface.LONGITUDE_EAST;
        this.zza = ExifInterface.LONGITUDE_EAST;
        this.zzb = -1L;
        this.zzc = ExifInterface.LONGITUDE_EAST;
        this.zzd = ExifInterface.LONGITUDE_EAST;
        this.zze = ExifInterface.LONGITUDE_EAST;
        HashMap mapZzb = zzaxz.zzb(str);
        if (mapZzb != null) {
            if (mapZzb.get(0) == null) {
                str2 = ExifInterface.LONGITUDE_EAST;
            } else {
                str2 = (String) mapZzb.get(0);
            }
            this.zza = str2;
            this.zzb = mapZzb.get(1) != null ? ((Long) mapZzb.get(1)).longValue() : -1L;
            if (mapZzb.get(2) == null) {
                str3 = ExifInterface.LONGITUDE_EAST;
            } else {
                str3 = (String) mapZzb.get(2);
            }
            this.zzc = str3;
            if (mapZzb.get(3) == null) {
                str4 = ExifInterface.LONGITUDE_EAST;
            } else {
                str4 = (String) mapZzb.get(3);
            }
            this.zzd = str4;
            this.zze = mapZzb.get(4) != null ? (String) mapZzb.get(4) : str5;
        }
    }
}
