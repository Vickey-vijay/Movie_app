package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzfs implements zzao {
    public final String zza;
    public final byte[] zzb;
    public final int zzc;
    public final int zzd;

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzfs.class == obj.getClass()) {
            zzfs zzfsVar = (zzfs) obj;
            if (this.zza.equals(zzfsVar.zza) && Arrays.equals(this.zzb, zzfsVar.zzb) && this.zzc == zzfsVar.zzc && this.zzd == zzfsVar.zzd) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.zza.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.zzb)) * 31) + this.zzc) * 31) + this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0089 A[LOOP:0: B:24:0x0086->B:26:0x0089, LOOP_END] */
    public final String toString() {
        String string;
        byte[] bArr;
        StringBuilder sb2;
        int i10 = this.zzd;
        if (i10 != 0) {
            if (i10 == 1) {
                string = zzfj.zzi(this.zzb);
            } else if (i10 == 23) {
                string = String.valueOf(Float.intBitsToFloat(zzgxz.zzd(this.zzb)));
            } else if (i10 == 67) {
                string = String.valueOf(zzgxz.zzd(this.zzb));
            } else if (i10 == 75) {
                string = String.valueOf(f.a(this.zzb[0]));
            } else if (i10 != 78) {
                bArr = this.zzb;
                String str = zzfj.zza;
                int length = bArr.length;
                sb2 = new StringBuilder(length + length);
                for (int i11 = 0; i11 < bArr.length; i11++) {
                    sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                    sb2.append(Character.forDigit(bArr[i11] & 15, 16));
                }
                string = sb2.toString();
            } else {
                string = String.valueOf(new zzer(this.zzb).zzJ());
            }
        } else if (this.zza.equals("auxiliary.tracks.map")) {
            List listZzb = zzb();
            StringBuilder sb3 = new StringBuilder();
            sb3.append("track types = ");
            zzgqw.zzb(sb3, listZzb, StringUtils.COMMA);
            string = sb3.toString();
        } else {
            bArr = this.zzb;
            String str2 = zzfj.zza;
            int length2 = bArr.length;
            sb2 = new StringBuilder(length2 + length2);
            while (i11 < bArr.length) {
                sb2.append(Character.forDigit((bArr[i11] >> 4) & 15, 16));
                sb2.append(Character.forDigit(bArr[i11] & 15, 16));
            }
            string = sb2.toString();
        }
        String str3 = this.zza;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str3).length() + 18 + String.valueOf(string).length());
        sb4.append("mdta: key=");
        sb4.append(str3);
        sb4.append(", value=");
        sb4.append(string);
        return sb4.toString();
    }

    public final List zzb() {
        zzgrc.zzj(this.zza.equals("auxiliary.tracks.map"), "Metadata is not an auxiliary tracks map");
        byte[] bArr = this.zzb;
        byte b10 = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < b10; i10++) {
            arrayList.add(Integer.valueOf(bArr[i10 + 2]));
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0042  */
    public zzfs(String str, byte[] bArr, int i10, int i11) {
        byte b10;
        byte b11;
        boolean z10 = true;
        switch (str) {
            case "com.android.capture.fps":
                b10 = 0;
                break;
            case "auxiliary.tracks.interleaved":
                b10 = 4;
                break;
            case "auxiliary.tracks.length":
                b10 = 2;
                break;
            case "auxiliary.tracks.offset":
                b10 = 1;
                break;
            case "auxiliary.tracks.map":
                b10 = 3;
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 != 0) {
            if (b10 != 1 && b10 != 2) {
                if (b10 != 3) {
                    if (b10 == 4) {
                        if (i11 == 75) {
                            if (bArr.length == 1 && ((b11 = bArr[0]) == 0 || b11 == 1)) {
                                i11 = 75;
                            } else {
                                i11 = 75;
                                z10 = false;
                            }
                        } else {
                            z10 = false;
                        }
                        zzgrc.zza(z10);
                    }
                } else {
                    zzgrc.zza(i11 == 0);
                }
            } else {
                if (i11 == 78) {
                    if (bArr.length == 8) {
                        i11 = 78;
                    } else {
                        i11 = 78;
                        z10 = false;
                    }
                } else {
                    z10 = false;
                }
                zzgrc.zza(z10);
            }
        } else {
            if (i11 == 23) {
                if (bArr.length == 4) {
                    i11 = 23;
                } else {
                    i11 = 23;
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            zzgrc.zza(z10);
        }
        this.zza = str;
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }
}
