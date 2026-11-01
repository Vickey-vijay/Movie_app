package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgwx extends zzgwz {
    private zzgwx(zzgwv zzgwvVar, Character ch2) {
        super(zzgwvVar, ch2);
        zzgrc.zza(zzgwvVar.zzf().length == 64);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        zzgrc.zzo(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = i12 + 1;
            int i15 = bArr[i12] & 255;
            int i16 = bArr[i14] & 255;
            int i17 = i14 + 1;
            int i18 = bArr[i17] & 255;
            zzgwv zzgwvVar = this.zzb;
            int i19 = (i15 << 16) | (i16 << 8) | i18;
            appendable.append(zzgwvVar.zza(i19 >>> 18));
            appendable.append(zzgwvVar.zza((i19 >>> 12) & 63));
            appendable.append(zzgwvVar.zza((i19 >>> 6) & 63));
            appendable.append(zzgwvVar.zza(i19 & 63));
            i12 = i17 + 1;
        }
        if (i12 < i11) {
            zze(appendable, bArr, i12, i11 - i12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgxa zzc(zzgwv zzgwvVar, Character ch2) {
        return new zzgwx(zzgwvVar, ch2);
    }

    public zzgwx(String str, String str2, Character ch2) {
        this(new zzgwv(str, str2.toCharArray()), ch2);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        CharSequence charSequenceZzg = zzg(charSequence);
        int length = charSequenceZzg.length();
        zzgwv zzgwvVar = this.zzb;
        if (zzgwvVar.zzb(length)) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequenceZzg.length()) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                int iZzc = (zzgwvVar.zzc(charSequenceZzg.charAt(i10)) << 18) | (zzgwvVar.zzc(charSequenceZzg.charAt(i12)) << 12);
                bArr[i11] = (byte) (iZzc >>> 16);
                int i14 = i12 + 1;
                if (i14 < charSequenceZzg.length()) {
                    int i15 = i14 + 1;
                    int iZzc2 = iZzc | (zzgwvVar.zzc(charSequenceZzg.charAt(i14)) << 6);
                    i11 = i13 + 1;
                    bArr[i13] = (byte) ((iZzc2 >>> 8) & 255);
                    if (i15 < charSequenceZzg.length()) {
                        bArr[i11] = (byte) ((iZzc2 | zzgwvVar.zzc(charSequenceZzg.charAt(i15))) & 255);
                        i11++;
                        i10 = i15 + 1;
                    } else {
                        i10 = i15;
                    }
                } else {
                    i10 = i14;
                    i11 = i13;
                }
            }
            return i11;
        }
        int length2 = charSequenceZzg.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(length2).length() + 21);
        sb2.append("Invalid input length ");
        sb2.append(length2);
        throw new zzgwy(sb2.toString());
    }
}
