package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziah extends zziak {
    private final byte[] zzb;
    private final int zzc;
    private final int zzd;

    public zziah(byte[] bArr, int i10, int i11) {
        super(null);
        zzian.zzC(i10, i10 + i11, bArr.length);
        this.zzb = bArr;
        this.zzc = i10;
        this.zzd = i11;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzc() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final String zzh(Charset charset) {
        return new String(this.zzb, this.zzc, this.zzd, charset);
    }

    public final /* synthetic */ byte[] zzn() {
        return this.zzb;
    }

    public final /* synthetic */ int zzo() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zza(int i10) {
        zzian.zzB(i10, this.zzd);
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final byte zzb(int i10) {
        return this.zzb[this.zzc + i10];
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zzian zzd(int i10, int i11) {
        int iZzC = zzian.zzC(i10, i11, this.zzd);
        return iZzC == 0 ? zzian.zza : new zziah(this.zzb, this.zzc + i10, iZzC);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zze(byte[] bArr, int i10, int i11, int i12) {
        System.arraycopy(this.zzb, this.zzc + i10, bArr, i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final ByteBuffer zzf() {
        return ByteBuffer.wrap(this.zzb, this.zzc, this.zzd).asReadOnlyBuffer();
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final void zzg(zziae zziaeVar) throws IOException {
        zziaeVar.zza(this.zzb, this.zzc, this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzi() {
        byte[] bArr = this.zzb;
        int i10 = this.zzc;
        return zzier.zzb(bArr, i10, this.zzd + i10);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final boolean zzj(zzian zzianVar) {
        return ((zzianVar instanceof zzial) || (zzianVar instanceof zziah)) ? zzk(zzianVar, 0, this.zzd) : zzianVar.zzj(this);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final int zzl(int i10, int i11, int i12) {
        return zzice.zzc(i10, this.zzb, this.zzc + i11, i12);
    }

    @Override // com.google.android.gms.internal.ads.zzian
    public final zziaq zzm() {
        return zziaq.zzG(this.zzb, this.zzc, this.zzd, true);
    }

    @Override // com.google.android.gms.internal.ads.zziak
    public final boolean zzk(zzian zzianVar, int i10, int i11) {
        if (i11 <= zzianVar.zzc()) {
            int i12 = i10 + i11;
            if (i12 <= zzianVar.zzc()) {
                if (zzianVar instanceof zzial) {
                    return zzian.zzD(this.zzb, this.zzc, ((zzial) zzianVar).zzn(), i10, i11);
                }
                if (zzianVar instanceof zziah) {
                    zziah zziahVar = (zziah) zzianVar;
                    return zzian.zzD(this.zzb, this.zzc, zziahVar.zzb, zziahVar.zzc + i10, i11);
                }
                zzian zzianVarZzd = zzianVar.zzd(i10, i12);
                int i13 = this.zzc;
                return zzianVarZzd.equals(zzd(i13, i11 + i13));
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
        int i14 = this.zzd;
        StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length() + 18 + String.valueOf(i14).length());
        sb3.append("Length too large: ");
        sb3.append(i11);
        sb3.append(i14);
        throw new IllegalArgumentException(sb3.toString());
    }
}
