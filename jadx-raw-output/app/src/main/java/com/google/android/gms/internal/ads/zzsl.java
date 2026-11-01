package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.ItemTouchHelper;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsl extends zzcp {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable int[] iArr) {
        this.zzd = iArr;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x0085  */
    /* JADX WARN: Code duplicated, block: B:32:0x0097  */
    /* JADX WARN: Code duplicated, block: B:39:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:43:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:0x010f  */
    @Override // com.google.android.gms.internal.ads.zzco
    public final void zzd(ByteBuffer byteBuffer) {
        ByteOrder byteOrderOrder;
        ByteOrder byteOrder;
        int i10;
        int i11;
        boolean z10;
        int i12;
        int[] iArr = this.zze;
        iArr.getClass();
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        ByteBuffer byteBufferZzk = zzk(((iLimit - iPosition) / this.zzb.zze) * this.zzc.zze);
        while (iPosition < iLimit) {
            for (int i13 : iArr) {
                int iZzD = (zzfj.zzD(this.zzb.zzd) * i13) + iPosition;
                int i14 = this.zzb.zzd;
                if (i14 == 2) {
                    byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                } else if (i14 == 3) {
                    byteBufferZzk.put(byteBuffer.get(iZzD));
                } else if (i14 == 4) {
                    byteBufferZzk.putFloat(byteBuffer.getFloat(iZzD));
                } else if (i14 == 21) {
                    byteOrderOrder = byteBuffer.order();
                    byteOrder = ByteOrder.BIG_ENDIAN;
                    if (byteOrderOrder == byteOrder) {
                        i10 = iZzD;
                    } else {
                        i10 = iZzD + 2;
                    }
                    byte b10 = byteBuffer.get(i10);
                    byte b11 = byteBuffer.get(iZzD + 1);
                    if (byteBuffer.order() == byteOrder) {
                        iZzD += 2;
                    }
                    i11 = ((((b10 << 24) & ViewCompat.MEASURED_STATE_MASK) | ((b11 << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK)) | ((byteBuffer.get(iZzD) << 8) & 65280)) >> 8;
                    if ((i11 & ViewCompat.MEASURED_STATE_MASK) != 0 || (i11 & (-8388608)) == -8388608) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    zzgrc.zzf(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                    zzgrc.zza(byteBufferZzk.remaining() >= 3);
                    if (byteBufferZzk.order() == byteOrder) {
                        i12 = (i11 >> 16) & 255;
                    } else {
                        i12 = i11 & 255;
                    }
                    byte b12 = (byte) i12;
                    int i15 = (i11 >> 8) & 255;
                    if (byteBufferZzk.order() != byteOrder) {
                        i11 >>= 16;
                    }
                    byteBufferZzk.put(b12).put((byte) i15).put((byte) (i11 & 255));
                } else {
                    if (i14 != 22) {
                        if (i14 == 268435456) {
                            byteBufferZzk.putShort(byteBuffer.getShort(iZzD));
                        } else if (i14 == 1342177280) {
                            byteOrderOrder = byteBuffer.order();
                            byteOrder = ByteOrder.BIG_ENDIAN;
                            if (byteOrderOrder == byteOrder) {
                                i10 = iZzD;
                            } else {
                                i10 = iZzD + 2;
                            }
                            byte b13 = byteBuffer.get(i10);
                            byte b14 = byteBuffer.get(iZzD + 1);
                            if (byteBuffer.order() == byteOrder) {
                                iZzD += 2;
                            }
                            i11 = ((((b13 << 24) & ViewCompat.MEASURED_STATE_MASK) | ((b14 << 16) & ItemTouchHelper.ACTION_MODE_DRAG_MASK)) | ((byteBuffer.get(iZzD) << 8) & 65280)) >> 8;
                            if ((i11 & ViewCompat.MEASURED_STATE_MASK) != 0) {
                                z10 = true;
                            } else {
                                z10 = true;
                            }
                            zzgrc.zzf(z10, "Value out of range of 24-bit integer: %s", Integer.toHexString(i11));
                            zzgrc.zza(byteBufferZzk.remaining() >= 3);
                            if (byteBufferZzk.order() == byteOrder) {
                                i12 = (i11 >> 16) & 255;
                            } else {
                                i12 = i11 & 255;
                            }
                            byte b15 = (byte) i12;
                            int i16 = (i11 >> 8) & 255;
                            if (byteBufferZzk.order() != byteOrder) {
                                i11 >>= 16;
                            }
                            byteBufferZzk.put(b15).put((byte) i16).put((byte) (i11 & 255));
                        } else if (i14 != 1610612736) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i14).length() + 21);
                            sb2.append("Unexpected encoding: ");
                            sb2.append(i14);
                            throw new IllegalStateException(sb2.toString());
                        }
                    }
                    byteBufferZzk.putInt(byteBuffer.getInt(iZzD));
                }
            }
            iPosition += this.zzb.zze;
        }
        byteBuffer.position(iLimit);
        byteBufferZzk.flip();
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i10 = zzclVar.zzd;
        if (!zzfj.zzA(i10)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i11 = zzclVar.zzc;
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            if (i12 >= length) {
                return z10 ? new zzcl(zzclVar.zzb, length, i10) : zzcl.zza;
            }
            int i13 = iArr[i12];
            if (i13 >= i11) {
                String string = Arrays.toString(iArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 59);
                sb2.append("Channel map (");
                sb2.append(string);
                sb2.append(") trying to access non-existent input channel.");
                throw new zzcn(sb2.toString(), zzclVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
    }
}
