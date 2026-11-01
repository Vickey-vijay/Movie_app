package com.google.android.gms.internal.ads;

import java.io.IOException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
final class zzgww extends zzgwz {
    public final char[] zza;

    private zzgww(zzgwv zzgwvVar) {
        super(zzgwvVar, null);
        this.zza = new char[512];
        zzgrc.zza(zzgwvVar.zzf().length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.zza[i10] = zzgwvVar.zza(i10 >>> 4);
            this.zza[i10 | 256] = zzgwvVar.zza(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final void zza(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        zzgrc.zzo(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            char[] cArr = this.zza;
            appendable.append(cArr[i13]);
            appendable.append(cArr[i13 | 256]);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgwz
    public final zzgxa zzc(zzgwv zzgwvVar, Character ch2) {
        return new zzgww(zzgwvVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgwz, com.google.android.gms.internal.ads.zzgxa
    public final int zzb(byte[] bArr, CharSequence charSequence) throws zzgwy {
        if (charSequence.length() % 2 != 1) {
            int i10 = 0;
            int i11 = 0;
            while (i10 < charSequence.length()) {
                zzgwv zzgwvVar = this.zzb;
                bArr[i11] = (byte) (zzgwvVar.zzc(charSequence.charAt(i10 + 1)) | (zzgwvVar.zzc(charSequence.charAt(i10)) << 4));
                i10 += 2;
                i11++;
            }
            return i11;
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(String.valueOf(length).length() + 21);
        sb2.append("Invalid input length ");
        sb2.append(length);
        throw new zzgwy(sb2.toString());
    }

    public zzgww(String str, String str2) {
        this(new zzgwv("base16()", "0123456789ABCDEF".toCharArray()));
    }
}
