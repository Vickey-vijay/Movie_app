package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzial extends zziak {
    private final byte[] zzb;

    public zzial(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zzb = bArr;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzb.length;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(this.zzb, charset);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i10) {
        return this.zzb[i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i10, int i11) {
        byte[] bArr = this.zzb;
        int iZzC = zzian.zzC(i10, i11, bArr.length);
        return iZzC == 0 ? zzian.zza : new zziah(bArr, i10, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) throws IOException {
        byte[] bArr = this.zzb;
        zziaeVar.zza(bArr, 0, bArr.length);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        return zzier.zza(this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        if (zzianVar instanceof zzial) {
            return Arrays.equals(this.zzb, ((zzial) zzianVar).zzb);
        }
        return zzianVar instanceof zziah ? zzk(zzianVar, 0, this.zzb.length) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i10, int i11, int i12) {
        return zzice.zzc(i10, this.zzb, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        byte[] bArr = this.zzb;
        return zziaq.zzG(bArr, 0, bArr.length, true);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final boolean zzk(zzian zzianVar, int i10, int i11) {
        if (i11 <= zzianVar.zzc()) {
            int i12 = i10 + i11;
            if (i12 <= zzianVar.zzc()) {
                if (zzianVar instanceof zzial) {
                    return zzian.zzD(this.zzb, 0, ((zzial) zzianVar).zzb, i10, i11);
                }
                if (zzianVar instanceof zziah) {
                    zziah zziahVar = (zziah) zzianVar;
                    return zzian.zzD(this.zzb, 0, zziahVar.zzn(), zziahVar.zzo() + i10, i11);
                }
                return zzianVar.zzd(i10, i12).equals(zzd(0, i11));
            }
            int iZzc = zzianVar.zzc();
            int length = String.valueOf(i10).length();
            StringBuilder sb2 = new StringBuilder(length + 24 + String.valueOf(i11).length() + 2 + String.valueOf(iZzc).length());
            sb2.append("Ran off end of other: ");
            sb2.append(i10);
            sb2.append(", ");
            sb2.append(i11);
            sb2.append(", ");
            sb2.append(iZzc);
            throw new IllegalArgumentException(sb2.toString());
        }
        byte[] bArr = this.zzb;
        int length2 = String.valueOf(i11).length();
        int length3 = bArr.length;
        StringBuilder sb3 = new StringBuilder(length2 + 18 + String.valueOf(length3).length());
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(length3);
        throw new IllegalArgumentException(sb3.toString());
    }
}
