package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzald {
    public final boolean zza;

    @Nullable
    public final String zzb;
    public final zzagg zzc;
    public final int zzd;

    @Nullable
    public final byte[] zze;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:27:0x0051  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public zzald(boolean z10, @Nullable String str, int i10, byte[] bArr, int i11, int i12, @Nullable byte[] bArr2) {
        boolean z11;
        boolean z12;
        byte b10 = 0;
        int i13 = 1;
        if (i10 == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (bArr2 == null) {
            z12 = true;
        } else {
            z12 = false;
        }
        zzgrc.zza(z11 ^ z12);
        this.zza = z10;
        this.zzb = str;
        this.zzd = i10;
        this.zze = bArr2;
        if (str != null) {
            switch (str.hashCode()) {
                case 3046605:
                    if (str.equals("cbc1")) {
                        b10 = 2;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 3046671:
                    if (str.equals("cbcs")) {
                        b10 = 3;
                    } else {
                        b10 = -1;
                    }
                    break;
                case 3049879:
                    if (!str.equals("cenc")) {
                        b10 = -1;
                    }
                    break;
                case 3049895:
                    if (str.equals("cens")) {
                        b10 = 1;
                    } else {
                        b10 = -1;
                    }
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 != 0 && b10 != 1) {
                if (b10 != 2 && b10 != 3) {
                    StringBuilder sb2 = new StringBuilder(str.length() + 68);
                    sb2.append("Unsupported protection scheme type '");
                    sb2.append(str);
                    sb2.append("'. Assuming AES-CTR crypto mode.");
                    zzee.zzc("TrackEncryptionBox", sb2.toString());
                } else {
                    i13 = 2;
                }
            }
        }
        this.zzc = new zzagg(i13, bArr, i11, i12);
    }
}
