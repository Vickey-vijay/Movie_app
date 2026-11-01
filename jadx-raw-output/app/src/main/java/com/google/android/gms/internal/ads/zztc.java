package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zztc extends zzcp {
    private int zzd;
    private boolean zze;
    private int zzf;
    private long zzg;
    private byte[] zzi;
    private byte[] zzl;
    private int zzh = 0;
    private int zzj = 0;
    private int zzk = 0;

    private static int zzv(byte b10, byte b11) {
        return (b10 << 8) | (b11 & 255);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = false;
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    public final void zzq(boolean z10) {
        this.zze = z10;
    }

    public final long zzr() {
        return this.zzg;
    }

    private final void zzs(boolean z10) {
        int i10;
        int length;
        int i11 = this.zzk;
        int length2 = this.zzi.length;
        if (i11 != length2) {
            if (!z10) {
                return;
            } else {
                z10 = true;
            }
        }
        if (this.zzh == 0) {
            if (z10) {
                zzu(i11, 3);
                length = i11;
            } else {
                zzgrc.zzi(i11 >= (length2 >> 1));
                length = this.zzi.length >> 1;
                zzu(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z10) {
                int iZzt = zzt(i13) + (this.zzi.length >> 1);
                zzu(iZzt, 2);
                int i14 = i12 + i13;
                i10 = iZzt;
                length = i14;
            } else {
                int iZzt2 = zzt(i13);
                zzu(iZzt2, 1);
                i10 = iZzt2;
                length = i13;
            }
        }
        if (length % this.zzd != 0) {
            throw new IllegalStateException(zzgrt.zzd("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        zzgrc.zzi(i11 >= i10);
        this.zzk -= length;
        int i15 = this.zzj + length;
        this.zzj = i15;
        this.zzj = i15 % this.zzi.length;
        int i16 = this.zzh;
        int i17 = this.zzd;
        this.zzh = i16 + (i10 / i17);
        this.zzg += (long) ((length - i10) / i17);
    }

    private final void zzu(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        zzgrc.zza(this.zzk >= i10);
        if (i11 == 2) {
            int i12 = this.zzj;
            int i13 = this.zzk;
            int i14 = i12 + i13;
            byte[] bArr = this.zzi;
            int length = bArr.length;
            if (i14 <= length) {
                System.arraycopy(bArr, i14 - i10, this.zzl, 0, i10);
            } else {
                int i15 = i13 - (length - i12);
                if (i15 >= i10) {
                    System.arraycopy(bArr, i15 - i10, this.zzl, 0, i10);
                } else {
                    int i16 = i10 - i15;
                    System.arraycopy(bArr, length - i16, this.zzl, 0, i16);
                    System.arraycopy(this.zzi, 0, this.zzl, i16, i15);
                }
            }
        } else {
            int i17 = this.zzj;
            int i18 = i17 + i10;
            byte[] bArr2 = this.zzi;
            int length2 = bArr2.length;
            if (i18 <= length2) {
                System.arraycopy(bArr2, i17, this.zzl, 0, i10);
            } else {
                int i19 = length2 - i17;
                System.arraycopy(bArr2, i17, this.zzl, 0, i19);
                System.arraycopy(this.zzi, 0, this.zzl, i19, i10 - i19);
            }
        }
        zzgrc.zzd(i10 % this.zzd == 0, "sizeToOutput is not aligned to frame size: %s", i10);
        zzgrc.zzi(this.zzj < this.zzi.length);
        byte[] bArr3 = this.zzl;
        zzgrc.zzd(i10 % this.zzd == 0, "byteOutput size is not aligned to frame size %s", i10);
        if (i11 != 3) {
            for (int i20 = 0; i20 < i10; i20 += 2) {
                int i21 = i20 + 1;
                int iZzv = zzv(bArr3[i21], bArr3[i20]);
                int i22 = 10;
                if (i11 == 0) {
                    i22 = ((((i20 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else if (i11 == 2) {
                    i22 = 10 + (((90000 * i20) / (i10 - 1)) / 1000);
                }
                int i23 = (iZzv * i22) / 100;
                if (i23 >= 32767) {
                    bArr3[i20] = -1;
                    bArr3[i21] = 127;
                } else if (i23 <= -32768) {
                    bArr3[i20] = 0;
                    bArr3[i21] = -128;
                } else {
                    bArr3[i20] = (byte) (i23 & 255);
                    bArr3[i21] = (byte) (i23 >> 8);
                }
            }
        }
        zzk(i10).put(bArr3, 0, i10).flip();
    }

    private final int zzw(long j10) {
        return (int) ((j10 * ((long) this.zzb.zzb)) / 1000000);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        if (zzclVar.zzd == 2) {
            return zzclVar.zzb == -1 ? zzcl.zza : zzclVar;
        }
        throw new zzcn("Unhandled input format:", zzclVar);
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzn() {
        if (this.zzk > 0) {
            zzs(true);
            this.zzh = 0;
        }
    }

    public zztc() {
        byte[] bArr = zzfj.zzb;
        this.zzi = bArr;
        this.zzl = bArr;
    }

    private final int zzt(int i10) {
        boolean z10 = true;
        int iZzw = ((zzw(2000000L) - this.zzh) * this.zzd) - (this.zzi.length >> 1);
        if (iZzw < 0) {
            z10 = false;
        }
        zzgrc.zzi(z10);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, iZzw);
        int i11 = this.zzd;
        return (iMin / i11) * i11;
    }

    private static final boolean zzx(byte b10, byte b11) {
        if (Math.abs(zzv(b10, b11)) > 1024) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzcp, com.google.android.gms.internal.ads.zzco
    public final boolean zzc() {
        if (super.zzc() && this.zze) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        boolean z10;
        int iLimit;
        int i10;
        boolean z11;
        int iPosition;
        while (byteBuffer.hasRemaining() && !zzl()) {
            boolean z12 = true;
            if (this.zzf != 0) {
                if (this.zzj < this.zzi.length) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zzgrc.zzi(z10);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 < byteBuffer.limit()) {
                        if (zzx(byteBuffer.get(iPosition2), byteBuffer.get(iPosition2 - 1))) {
                            int i11 = this.zzd;
                            iLimit = i11 * (iPosition2 / i11);
                            break;
                        }
                        iPosition2 += 2;
                    } else {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.zzj;
                int i13 = this.zzk;
                int i14 = i12 + i13;
                int length = this.zzi.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.zzi, i14, iMin);
                int i15 = this.zzk + iMin;
                this.zzk = i15;
                if (i15 <= this.zzi.length) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                zzgrc.zzi(z11);
                if (iLimit >= iLimit2 || iPosition3 >= i10) {
                    z12 = false;
                }
                zzs(z12);
                if (z12) {
                    this.zzf = 0;
                    this.zzh = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.zzi.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 >= byteBuffer.position()) {
                        if (zzx(byteBuffer.get(iLimit4), byteBuffer.get(iLimit4 - 1))) {
                            int i16 = this.zzd;
                            iPosition = ((iLimit4 / i16) * i16) + i16;
                            break;
                        }
                        iLimit4 -= 2;
                    } else {
                        iPosition = byteBuffer.position();
                        break;
                    }
                }
                if (iPosition == byteBuffer.position()) {
                    this.zzf = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    zzk(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        if (zzc()) {
            int i10 = this.zzb.zzc;
            this.zzd = i10 + i10;
            int iZzw = zzw(100000L) / 2;
            int i11 = this.zzd;
            int i12 = (iZzw / i11) * i11;
            int i13 = i12 + i12;
            if (this.zzi.length != i13) {
                this.zzi = new byte[i13];
                this.zzl = new byte[i13];
            }
        }
        this.zzf = 0;
        this.zzg = 0L;
        this.zzh = 0;
        this.zzj = 0;
        this.zzk = 0;
    }
}
