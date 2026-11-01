package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzgrc {
    private static String zzp(int i10, int i11, String str) {
        if (i10 < 0) {
            return zzgrt.zzd("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return zzgrt.zzd("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static void zza(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    public static void zzb(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static void zzc(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Character.valueOf(c10)));
        }
    }

    public static void zzd(boolean z10, String str, int i10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i10)));
        }
    }

    public static void zze(boolean z10, String str, long j10) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Long.valueOf(j10)));
        }
    }

    public static void zzf(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj));
        }
    }

    public static void zzg(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    public static void zzh(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(zzgrt.zzd(str, obj, obj2));
        }
    }

    public static void zzi(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void zzj(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static Object zzk(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzl(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzgrt.zzd(str, obj2));
    }

    public static int zzm(int i10, int i11, String str) {
        String strZzd;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strZzd = zzgrt.zzd("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            strZzd = zzgrt.zzd("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strZzd);
    }

    public static int zzn(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(zzp(i10, i11, "index"));
        }
        return i10;
    }

    public static void zzo(int i10, int i11, int i12) {
        String strZzp;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strZzp = zzp(i10, i12, "start index");
            } else {
                strZzp = (i11 < 0 || i11 > i12) ? zzp(i11, i12, "end index") : zzgrt.zzd("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strZzp);
        }
    }
}
