package com.google.android.gms.internal.ads;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzank implements zzamf {
    private final zzer zza = new zzer();
    private final boolean zzb;
    private final int zzc;
    private final int zzd;
    private final String zze;
    private final float zzf;
    private final int zzg;

    private static void zzb(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            int i15 = i14 | 33;
            int i16 = i10 & 1;
            int i17 = i10 & 2;
            boolean z10 = true;
            if (i16 != 0) {
                if (i17 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                    z10 = false;
                }
            } else if (i17 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            } else {
                z10 = false;
            }
            if ((i10 & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            } else {
                if (i16 != 0 || z10) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    private static void zzc(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzamf
    public final void zza(byte[] bArr, int i10, int i11, zzame zzameVar, zzdr zzdrVar) {
        String strZzK;
        int i12;
        int length;
        zzer zzerVar = this.zza;
        zzerVar.zzb(bArr, i10 + i11);
        zzerVar.zzh(i10);
        int i13 = 1;
        int i14 = 2;
        int i15 = 0;
        zzgrc.zza(zzerVar.zzd() >= 2);
        int iZzt = zzerVar.zzt();
        if (iZzt == 0) {
            strZzK = "";
        } else {
            int iZzg = zzerVar.zzg();
            Charset charsetZzR = zzerVar.zzR();
            int iZzg2 = zzerVar.zzg() - iZzg;
            if (charsetZzR == null) {
                charsetZzR = StandardCharsets.UTF_8;
            }
            strZzK = zzerVar.zzK(iZzt - iZzg2, charsetZzR);
        }
        if (strZzK.isEmpty()) {
            zzdrVar.zza(new zzalx(zzguf.zzi(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strZzK);
        int i16 = this.zzc;
        zzb(spannableStringBuilder, i16, 0, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        int i17 = this.zzd;
        zzc(spannableStringBuilder, i17, -1, 0, spannableStringBuilder.length(), ItemTouchHelper.ACTION_MODE_DRAG_MASK);
        String str = this.zze;
        int length2 = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length2, 16711713);
        }
        float fMax = this.zzf;
        while (zzerVar.zzd() >= 8) {
            int iZzg3 = zzerVar.zzg();
            int iZzB = zzerVar.zzB();
            int iZzB2 = zzerVar.zzB();
            if (iZzB2 == 1937013100) {
                zzgrc.zza(zzerVar.zzd() >= i14 ? i13 : i15);
                int iZzt2 = zzerVar.zzt();
                int i18 = i15;
                while (i18 < iZzt2) {
                    zzgrc.zza(zzerVar.zzd() >= 12 ? i13 : i15);
                    int iZzt3 = zzerVar.zzt();
                    int iZzt4 = zzerVar.zzt();
                    zzerVar.zzk(i14);
                    int iZzs = zzerVar.zzs();
                    zzerVar.zzk(i13);
                    int iZzB3 = zzerVar.zzB();
                    if (iZzt4 > spannableStringBuilder.length()) {
                        int length3 = spannableStringBuilder.length();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(iZzt4).length() + 44 + String.valueOf(length3).length() + 2);
                        sb2.append("Truncating styl end (");
                        sb2.append(iZzt4);
                        sb2.append(") to cueText.length() (");
                        sb2.append(length3);
                        sb2.append(").");
                        zzee.zzc("Tx3gParser", sb2.toString());
                        length = spannableStringBuilder.length();
                    } else {
                        length = iZzt4;
                    }
                    if (iZzt3 >= length) {
                        StringBuilder sb3 = new StringBuilder(String.valueOf(iZzt3).length() + 36 + String.valueOf(length).length() + 2);
                        sb3.append("Ignoring styl with start (");
                        sb3.append(iZzt3);
                        sb3.append(") >= end (");
                        sb3.append(length);
                        sb3.append(").");
                        zzee.zzc("Tx3gParser", sb3.toString());
                    } else {
                        int i19 = length;
                        zzb(spannableStringBuilder, iZzs, i16, iZzt3, i19, 0);
                        zzc(spannableStringBuilder, iZzB3, i17, iZzt3, i19, 0);
                    }
                    i18++;
                    iZzt2 = iZzt2;
                    i13 = 1;
                    i14 = 2;
                    i15 = 0;
                }
                i12 = i14;
            } else if (iZzB2 == 1952608120 && this.zzb) {
                i12 = 2;
                zzgrc.zza(zzerVar.zzd() >= 2);
                float fZzt = zzerVar.zzt();
                int i20 = this.zzg;
                String str2 = zzfj.zza;
                fMax = Math.max(0.0f, Math.min(fZzt / i20, 0.95f));
            } else {
                i12 = 2;
            }
            zzerVar.zzh(iZzg3 + iZzB);
            i14 = i12;
            i13 = 1;
            i15 = 0;
        }
        zzcw zzcwVar = new zzcw();
        zzcwVar.zza(spannableStringBuilder);
        zzcwVar.zzf(fMax, 0);
        zzcwVar.zzg(0);
        zzdrVar.zza(new zzalx(zzguf.zzj(zzcwVar.zzr()), -9223372036854775807L, -9223372036854775807L));
    }

    public zzank(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.zzc = bArr[24];
            this.zzd = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.zze = true == "Serif".equals(zzfj.zzj(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.zzg = i10;
            boolean z10 = (bArr[0] & 32) != 0;
            this.zzb = z10;
            if (z10) {
                this.zzf = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, 0.95f));
                return;
            } else {
                this.zzf = 0.85f;
                return;
            }
        }
        this.zzc = 0;
        this.zzd = -1;
        this.zze = "sans-serif";
        this.zzb = false;
        this.zzf = 0.85f;
        this.zzg = -1;
    }
}
