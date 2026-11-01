package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzcv extends zzcp {
    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int i10 = zzclVar.zzd;
        if (i10 != 3) {
            if (i10 == 2) {
                return zzcl.zza;
            }
            if (i10 != 268435456 && i10 != 21 && i10 != 1342177280 && i10 != 22 && i10 != 1610612736 && i10 != 4) {
                throw new zzcn("Unhandled input format:", zzclVar);
            }
        }
        return new zzcl(zzclVar.zzb, zzclVar.zzc, 2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0032  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        int i11 = this.zzb.zzd;
        if (i11 != 3) {
            if (i11 != 4) {
                if (i11 != 21) {
                    if (i11 != 22) {
                        if (i11 != 268435456) {
                            if (i11 != 1342177280) {
                                if (i11 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                                i10 /= 2;
                            }
                        }
                    } else {
                        i10 /= 2;
                    }
                }
                i10 /= 3;
                i10 += i10;
            } else {
                i10 /= 2;
            }
        } else {
            i10 += i10;
        }
        ByteBuffer byteBufferZzk = zzk(i10);
        int i12 = this.zzb.zzd;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 21) {
                    if (i12 != 22) {
                        if (i12 != 268435456) {
                            if (i12 != 1342177280) {
                                if (i12 == 1610612736) {
                                    while (iPosition < iLimit) {
                                        byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                                        byteBufferZzk.put(byteBuffer.get(iPosition));
                                        iPosition += 4;
                                    }
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                while (iPosition < iLimit) {
                                    byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                                    byteBufferZzk.put(byteBuffer.get(iPosition));
                                    iPosition += 3;
                                }
                            }
                        } else {
                            while (iPosition < iLimit) {
                                byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                                byteBufferZzk.put(byteBuffer.get(iPosition));
                                iPosition += 2;
                            }
                        }
                    } else {
                        while (iPosition < iLimit) {
                            byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                            byteBufferZzk.put(byteBuffer.get(iPosition + 3));
                            iPosition += 4;
                        }
                    }
                } else {
                    while (iPosition < iLimit) {
                        byteBufferZzk.put(byteBuffer.get(iPosition + 1));
                        byteBufferZzk.put(byteBuffer.get(iPosition + 2));
                        iPosition += 3;
                    }
                }
            } else {
                while (iPosition < iLimit) {
                    float f10 = byteBuffer.getFloat(iPosition);
                    String str = zzfj.zza;
                    short sMax = (short) (Math.max(-1.0f, Math.min(f10, 1.0f)) * 32767.0f);
                    byteBufferZzk.put((byte) (sMax & 255));
                    byteBufferZzk.put((byte) ((sMax >> 8) & 255));
                    iPosition += 4;
                }
            }
        } else {
            while (iPosition < iLimit) {
                byteBufferZzk.put((byte) 0);
                byteBufferZzk.put((byte) ((byteBuffer.get(iPosition) & 255) - 128));
                iPosition++;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        byteBufferZzk.flip();
    }
}
