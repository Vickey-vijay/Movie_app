package com.google.android.gms.internal.ads;

import android.text.Layout;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzanv {
    public CharSequence zzc;
    public long zza = 0;
    public long zzb = 0;
    public int zzd = 2;
    public float zze = -3.4028235E38f;
    public int zzf = 1;
    public int zzg = 0;
    public float zzh = -3.4028235E38f;
    public int zzi = Integer.MIN_VALUE;
    public float zzj = 1.0f;
    public int zzk = Integer.MIN_VALUE;

    /* JADX WARN: Code duplicated, block: B:20:0x0032  */
    /* JADX WARN: Code duplicated, block: B:21:0x0034  */
    /* JADX WARN: Code duplicated, block: B:29:0x0068  */
    /* JADX WARN: Code duplicated, block: B:31:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    public final zzcw zza() {
        Layout.Alignment alignment;
        float f10 = this.zzh;
        float f11 = -3.4028235E38f;
        if (f10 == -3.4028235E38f) {
            int i10 = this.zzd;
            if (i10 != 4) {
                f10 = i10 != 5 ? 0.5f : 1.0f;
            } else {
                f10 = 0.0f;
            }
        }
        int i11 = this.zzi;
        if (i11 == Integer.MIN_VALUE) {
            int i12 = this.zzd;
            if (i12 == 1) {
                i11 = 0;
            } else if (i12 == 3) {
                i11 = 2;
            } else if (i12 == 4) {
                i11 = 0;
            } else if (i12 != 5) {
                i11 = 1;
            } else {
                i11 = 2;
            }
        }
        zzcw zzcwVar = new zzcw();
        int i13 = this.zzd;
        if (i13 == 1) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 == 2) {
            alignment = Layout.Alignment.ALIGN_CENTER;
        } else if (i13 == 3) {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        } else if (i13 == 4) {
            alignment = Layout.Alignment.ALIGN_NORMAL;
        } else if (i13 != 5) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i13).length() + 23);
            sb2.append("Unknown textAlignment: ");
            sb2.append(i13);
            zzee.zzc("WebvttCueParser", sb2.toString());
            alignment = null;
        } else {
            alignment = Layout.Alignment.ALIGN_OPPOSITE;
        }
        zzcwVar.zzd(alignment);
        float f12 = this.zze;
        int i14 = this.zzf;
        if (f12 != -3.4028235E38f && i14 == 0 && (f12 < 0.0f || f12 > 1.0f)) {
            f11 = 1.0f;
        } else if (f12 != -3.4028235E38f) {
            f11 = f12;
        } else if (i14 == 0) {
            f11 = 1.0f;
        }
        zzcwVar.zzf(f11, i14);
        zzcwVar.zzg(this.zzg);
        zzcwVar.zzi(f10);
        zzcwVar.zzj(i11);
        float f13 = this.zzj;
        if (i11 == 0) {
            f10 = 1.0f - f10;
        } else if (i11 != 1) {
            if (i11 != 2) {
                throw new IllegalStateException(String.valueOf(i11));
            }
        } else if (f10 <= 0.5f) {
            f10 += f10;
        } else {
            float f14 = 1.0f - f10;
            f10 = f14 + f14;
        }
        zzcwVar.zzm(Math.min(f13, f10));
        zzcwVar.zzo(this.zzk);
        CharSequence charSequence = this.zzc;
        if (charSequence != null) {
            zzcwVar.zza(charSequence);
        }
        return zzcwVar;
    }
}
