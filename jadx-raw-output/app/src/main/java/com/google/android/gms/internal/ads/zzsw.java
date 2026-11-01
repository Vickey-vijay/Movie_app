package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzsw implements zzrj {
    private static final AtomicInteger zza = new AtomicInteger();
    private long zzA;
    private long zzB;
    private int zzC;
    private boolean zzD;
    private boolean zzE;
    private long zzF;
    private float zzG;

    @Nullable
    private ByteBuffer zzH;
    private int zzI;

    @Nullable
    private ByteBuffer zzJ;
    private boolean zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private int zzO;
    private boolean zzP;
    private zze zzQ;

    @Nullable
    private AudioDeviceInfo zzR;
    private int zzS;
    private long zzT;
    private boolean zzU;
    private boolean zzV;
    private long zzW;
    private long zzX;
    private Handler zzY;
    private final zzsr zzZ;

    @Nullable
    private final Context zzb;
    private final zzsl zzc;
    private final zzte zzd;
    private final zzcv zze;
    private final zztd zzf;
    private final zzguf zzg;
    private final ArrayDeque zzh;

    @Nullable
    private zzsn zzi;
    private final zzsv zzj;
    private final zzsv zzk;

    @Nullable
    private zzpq zzl;

    @Nullable
    private zzrg zzm;

    @Nullable
    private zzsq zzn;
    private zzsq zzo;
    private zzck zzp;
    private final zzqm zzq;
    private zzqj zzr;

    @Nullable
    private zzqc zzs;
    private zzd zzt;

    @Nullable
    private zzsu zzu;
    private zzsu zzv;
    private zzav zzw;
    private boolean zzx;
    private long zzy;
    private long zzz;

    private final void zzY(zzav zzavVar) {
        zzsu zzsuVar = new zzsu(zzavVar, -9223372036854775807L, -9223372036854775807L, null);
        if (zzab()) {
            this.zzu = zzsuVar;
        } else {
            this.zzv = zzsuVar;
        }
    }

    private final boolean zzab() {
        return this.zzs != null;
    }

    private static int zzaf(int i10) {
        if (i10 == 0 || i10 == -1) {
            return -1;
        }
        return i10;
    }

    public final /* synthetic */ zzsn zzI() {
        return this.zzi;
    }

    public final /* synthetic */ zzrg zzJ() {
        return this.zzm;
    }

    public final /* synthetic */ zzsq zzK() {
        return this.zzo;
    }

    public final /* synthetic */ zzqc zzL() {
        return this.zzs;
    }

    public final /* synthetic */ void zzM(boolean z10) {
        this.zzM = true;
    }

    public final /* synthetic */ boolean zzN() {
        return this.zzN;
    }

    public final /* synthetic */ long zzO() {
        return this.zzT;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zza(zzrg zzrgVar) {
        this.zzm = zzrgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzb(@Nullable zzpq zzpqVar) {
        this.zzl = zzpqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzi() {
        this.zzN = true;
        if (zzab()) {
            this.zzs.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzj() {
        this.zzD = true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzav zzp() {
        return this.zzw;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzz() {
        this.zzN = false;
        if (zzab()) {
            this.zzs.zzb();
        }
    }

    public static int zzD(int i10, ByteBuffer byteBuffer) {
        int i11;
        int i12;
        byte b10;
        int i13;
        int i14;
        if (i10 == 20) {
            return zzafu.zzb(byteBuffer);
        }
        if (i10 != 30) {
            switch (i10) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iZzb = zzafs.zzb(zzfj.zzJ(byteBuffer, byteBuffer.position()));
                    if (iZzb != -1) {
                        return iZzb;
                    }
                    throw new IllegalArgumentException();
                case 10:
                    return 1024;
                case 11:
                case 12:
                    return 2048;
                default:
                    switch (i10) {
                        case 14:
                            int i15 = zzadv.zza;
                            int iPosition = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition;
                            while (true) {
                                if (i16 > iLimit) {
                                    i14 = -1;
                                } else if ((zzfj.zzJ(byteBuffer, i16 + 4) & (-2)) == -126718022) {
                                    i14 = i16 - iPosition;
                                } else {
                                    i16++;
                                }
                            }
                            if (i14 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i14) + ((byteBuffer.get((byteBuffer.position() + i14) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case 16:
                            return 1024;
                        case 17:
                            int i17 = zzady.zza;
                            byte[] bArr = new byte[16];
                            int iPosition2 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition2);
                            return zzady.zzb(new zzeq(bArr, 16)).zzc;
                        case 18:
                            break;
                        default:
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 27);
                            sb2.append("Unexpected audio encoding: ");
                            sb2.append(i10);
                            throw new IllegalStateException(sb2.toString());
                    }
                    break;
            }
            return zzadv.zze(byteBuffer);
        }
        int i18 = zzaet.zza;
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition3 = byteBuffer.position();
        byte b11 = byteBuffer.get(iPosition3);
        if (b11 != -2) {
            if (b11 != -1) {
                if (b11 != 31) {
                    i12 = (byteBuffer.get(iPosition3 + 4) & 1) << 6;
                    i13 = byteBuffer.get(iPosition3 + 5) & 252;
                } else {
                    i12 = (byteBuffer.get(iPosition3 + 5) & 7) << 4;
                    b10 = byteBuffer.get(iPosition3 + 6);
                }
                i11 = (i13 >> 2) | i12;
            } else {
                i12 = (byteBuffer.get(iPosition3 + 4) & 7) << 4;
                b10 = byteBuffer.get(iPosition3 + 7);
            }
            i13 = b10 & 60;
            i11 = (i13 >> 2) | i12;
        } else {
            i11 = ((byteBuffer.get(iPosition3 + 5) & 1) << 6) | ((byteBuffer.get(iPosition3 + 4) & 252) >> 2);
        }
        return (i11 + 1) * 32;
    }

    public static /* synthetic */ boolean zzG() {
        return zza.get() > 0;
    }

    private final void zzP() {
        zzck zzckVarZzl = this.zzo.zzl();
        this.zzp = zzckVarZzl;
        zzckVarZzl.zzb(zzcm.zza);
    }

    private final zzqc zzQ(zzql zzqlVar) throws zzrf {
        try {
            return ((zzsi) this.zzq).zzf(zzqlVar);
        } catch (zzqi e10) {
            zzrf zzrfVar = new zzrf(0, zzqlVar.zzb, zzqlVar.zzc, zzqlVar.zza, zzqlVar.zze, this.zzo.zzg(), false, e10);
            zzrg zzrgVar = this.zzm;
            if (zzrgVar == null) {
                throw zzrfVar;
            }
            zzrgVar.zza(zzrfVar);
            throw zzrfVar;
        }
    }

    private final boolean zzS() throws Exception {
        ByteBuffer byteBuffer;
        if (!this.zzp.zzc()) {
            zzU(Long.MIN_VALUE);
            return this.zzJ == null;
        }
        this.zzp.zzf();
        zzR(Long.MIN_VALUE);
        return this.zzp.zzg() && ((byteBuffer = this.zzJ) == null || !byteBuffer.hasRemaining());
    }

    /* JADX WARN: Code duplicated, block: B:45:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x014c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x014e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0152  */
    /* JADX WARN: Code duplicated, block: B:51:0x0156  */
    /* JADX WARN: Code duplicated, block: B:53:0x015a  */
    /* JADX WARN: Code duplicated, block: B:55:0x015e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x0180  */
    /* JADX WARN: Code duplicated, block: B:61:0x0193  */
    /* JADX WARN: Code duplicated, block: B:62:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:73:0x020a  */
    /* JADX WARN: Code duplicated, block: B:79:0x017a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0059 A[SYNTHETIC] */
    private final void zzT(ByteBuffer byteBuffer) {
        ByteBuffer byteBuffer2;
        int i10;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        zzgrc.zzi(this.zzJ == null);
        if (byteBuffer.hasRemaining()) {
            if (this.zzo.zzf()) {
                int iZzs = (int) zzfj.zzs(zzfj.zzq(20L), this.zzo.zzk().zzb);
                long jZzac = zzac();
                long j10 = iZzs;
                if (jZzac < j10) {
                    int i21 = this.zzo.zzk().zza;
                    int iZzj = this.zzo.zzj();
                    ByteBuffer byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    int i22 = (int) jZzac;
                    while (byteBuffer.hasRemaining() && i22 < iZzs) {
                        if (i21 != 2) {
                            if (i21 == 3) {
                                i12 = (byteBuffer.get() & 255) << 24;
                            } else if (i21 != 4) {
                                if (i21 != 21) {
                                    if (i21 == 22) {
                                        i17 = byteBuffer.get() & 255;
                                        i18 = (byteBuffer.get() & 255) << 8;
                                        i19 = (byteBuffer.get() & 255) << 16;
                                        i20 = (byteBuffer.get() & 255) << 24;
                                    } else if (i21 == 268435456) {
                                        i10 = (byteBuffer.get() & 255) << 24;
                                        i11 = (byteBuffer.get() & 255) << 16;
                                    } else if (i21 == 1342177280) {
                                        i14 = (byteBuffer.get() & 255) << 24;
                                        i15 = (byteBuffer.get() & 255) << 16;
                                        i16 = (byteBuffer.get() & 255) << 8;
                                    } else {
                                        if (i21 != 1610612736) {
                                            throw new IllegalStateException();
                                        }
                                        i17 = (byteBuffer.get() & 255) << 24;
                                        i18 = (byteBuffer.get() & 255) << 16;
                                        i19 = (byteBuffer.get() & 255) << 8;
                                        i20 = byteBuffer.get() & 255;
                                    }
                                    i12 = i17 | i18 | i19 | i20;
                                } else {
                                    i14 = (byteBuffer.get() & 255) << 8;
                                    i15 = (byteBuffer.get() & 255) << 16;
                                    i16 = (byteBuffer.get() & 255) << 24;
                                }
                                i12 = i14 | i15 | i16;
                            } else {
                                float fMax = Math.max(-1.0f, Math.min(byteBuffer.getFloat(), 1.0f));
                                if (fMax < 0.0f) {
                                    fMax = -fMax;
                                    f10 = -2.14748365E9f;
                                } else {
                                    f10 = 2.14748365E9f;
                                }
                                i12 = (int) (fMax * f10);
                            }
                            i13 = (int) ((((long) i12) * ((long) i22)) / j10);
                            if (i21 != 2) {
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 3) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 4) {
                                if (i21 != 21) {
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i21 != 22) {
                                    byteBufferOrder.put((byte) i13);
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                } else if (i21 != 268435456) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                } else if (i21 != 1342177280) {
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                } else {
                                    if (i21 == 1610612736) {
                                        throw new IllegalStateException();
                                    }
                                    byteBufferOrder.put((byte) (i13 >> 24));
                                    byteBufferOrder.put((byte) (i13 >> 16));
                                    byteBufferOrder.put((byte) (i13 >> 8));
                                    byteBufferOrder.put((byte) i13);
                                }
                            } else if (i13 < 0) {
                                byteBufferOrder.putFloat((-i13) / (-2.14748365E9f));
                            } else {
                                byteBufferOrder.putFloat(i13 / 2.14748365E9f);
                            }
                            if (byteBuffer.position() == iPosition + iZzj) {
                                i22++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i10 = (byteBuffer.get() & 255) << 16;
                            i11 = (byteBuffer.get() & 255) << 24;
                        }
                        i12 = i10 | i11;
                        i13 = (int) ((((long) i12) * ((long) i22)) / j10);
                        if (i21 != 2) {
                            byteBufferOrder.put((byte) (i13 >> 16));
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i21 != 3) {
                            byteBufferOrder.put((byte) (i13 >> 24));
                        } else if (i21 != 4) {
                            if (i21 != 21) {
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 22) {
                                byteBufferOrder.put((byte) i13);
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 24));
                            } else if (i21 != 268435456) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                            } else if (i21 != 1342177280) {
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                            } else {
                                if (i21 == 1610612736) {
                                    throw new IllegalStateException();
                                }
                                byteBufferOrder.put((byte) (i13 >> 24));
                                byteBufferOrder.put((byte) (i13 >> 16));
                                byteBufferOrder.put((byte) (i13 >> 8));
                                byteBufferOrder.put((byte) i13);
                            }
                        } else if (i13 < 0) {
                            byteBufferOrder.putFloat((-i13) / (-2.14748365E9f));
                        } else {
                            byteBufferOrder.putFloat(i13 / 2.14748365E9f);
                        }
                        if (byteBuffer.position() == iPosition + iZzj) {
                            i22++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                    byteBuffer2 = byteBufferOrder;
                } else {
                    byteBuffer2 = byteBuffer;
                }
            } else {
                byteBuffer2 = byteBuffer;
            }
            this.zzJ = byteBuffer2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009d  */
    private final void zzU(long j10) throws Exception {
        zzrg zzrgVar;
        if (this.zzJ == null || this.zzk.zzb()) {
            return;
        }
        int iRemaining = this.zzJ.remaining();
        boolean z10 = true;
        try {
            boolean zZzc = this.zzs.zzc(this.zzJ, this.zzI, j10);
            this.zzT = SystemClock.elapsedRealtime();
            this.zzk.zzc();
            if (this.zzs.zzg()) {
                if (this.zzB > 0) {
                    this.zzV = false;
                }
                if (this.zzN && (zzrgVar = this.zzm) != null && !zZzc) {
                }
            }
            if (this.zzo.zzf()) {
                this.zzA += (long) (iRemaining - this.zzJ.remaining());
            }
            if (zZzc) {
                if (!this.zzo.zzf()) {
                    zzgrc.zzi(this.zzJ == this.zzH);
                    this.zzB += ((long) this.zzC) * ((long) this.zzI);
                }
                this.zzJ = null;
            }
        } catch (zzqb e10) {
            boolean z11 = e10.zzb;
            if (!z11) {
                z10 = false;
            } else if (zzac() <= 0) {
                if (this.zzs.zzg()) {
                    zzV();
                } else {
                    z10 = false;
                }
            }
            zzri zzriVar = new zzri(e10.zza, this.zzo.zzg(), z10);
            zzrg zzrgVar2 = this.zzm;
            if (zzrgVar2 != null) {
                zzrgVar2.zza(zzriVar);
            }
            if (z11) {
                throw zzriVar;
            }
            this.zzk.zza(zzriVar);
        }
    }

    private final void zzV() {
        this.zzo.zzk();
    }

    private final void zzX() {
        if (this.zzo != null) {
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            try {
                this.zzo = new zzsq(this.zzo.zzg(), this.zzo.zzh(), this.zzo.zzi(), this.zzo.zzj(), this.zzq.zzb(zzad(this.zzo.zzh(), -1)), this.zzo.zzl(), null);
            } catch (zzqd e10) {
                throw new IllegalStateException(new zzre(e10, this.zzo.zzg()));
            }
        }
        zzA();
    }

    private final boolean zzaa() {
        if (!this.zzo.zzf()) {
            return false;
        }
        int i10 = this.zzo.zzg().zzI;
        return true;
    }

    private final long zzac() {
        if (!this.zzo.zzf()) {
            return this.zzB;
        }
        long j10 = this.zzA;
        long jZzj = this.zzo.zzj();
        String str = zzfj.zza;
        return ((j10 + jZzj) - 1) / jZzj;
    }

    private final zzqf zzad(zzv zzvVar, int i10) {
        zzqe zzqeVar = new zzqe(zzvVar);
        zzqeVar.zza(this.zzt);
        zzqeVar.zzb(this.zzR);
        zzqeVar.zzc(this.zzO);
        zzqeVar.zze(-1);
        zzqeVar.zzd(this.zzS);
        return new zzqf(zzqeVar, null);
    }

    private final void zzae() {
        if (this.zzL) {
            return;
        }
        this.zzL = true;
        if (this.zzs.zzg()) {
            this.zzM = false;
        }
        this.zzs.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzC() {
        this.zzq.zze();
    }

    public final /* synthetic */ void zzE() {
        if (this.zzX >= 300000) {
            ((zzsz) this.zzm).zza.zzay(true);
            this.zzX = 0L;
        }
    }

    public final /* synthetic */ void zzF() {
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzR();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzc(zzdn zzdnVar) {
        this.zzq.zzd(zzdnVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final int zze(zzv zzvVar) {
        int i10 = this.zzq.zza(zzad(zzvVar, -1)).zzd;
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 0;
            }
        }
        return i11;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final zzpz zzf(zzv zzvVar) {
        if (this.zzU) {
            return zzpz.zza;
        }
        zzqh zzqhVarZza = this.zzq.zza(zzad(zzvVar, -1));
        zzpy zzpyVar = new zzpy();
        zzpyVar.zza(zzqhVarZza.zza);
        zzpyVar.zzb(zzqhVarZza.zzb);
        zzpyVar.zzc(zzqhVarZza.zzc);
        return zzpyVar.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzh(zzv zzvVar, int i10, @Nullable int[] iArr) throws zzre {
        zzv zzvVarZzM;
        zzck zzckVar;
        int iZzD;
        int iZzD2;
        if (this.zzr == null && this.zzb != null) {
            zzqj zzqjVar = new zzqj() { // from class: com.google.android.gms.internal.ads.zzss
                @Override // com.google.android.gms.internal.ads.zzqj
                public final /* synthetic */ void zza() {
                    this.zza.zzF();
                }
            };
            this.zzr = zzqjVar;
            this.zzq.zzc(zzqjVar);
        }
        if ("audio/raw".equals(zzvVar.zzo)) {
            int i11 = zzvVar.zzI;
            zzgrc.zza(zzfj.zzA(i11));
            int i12 = zzvVar.zzG;
            iZzD = zzfj.zzD(i11) * i12;
            zzguc zzgucVar = new zzguc();
            zzgucVar.zzh(this.zzg);
            zzgucVar.zzf(this.zze);
            zzgucVar.zzg(this.zzZ.zza());
            zzck zzckVar2 = new zzck(zzgucVar.zzi());
            if (zzckVar2.equals(this.zzp)) {
                zzckVar2 = this.zzp;
            }
            this.zzd.zzq(zzvVar.zzJ, zzvVar.zzK);
            this.zzc.zzq(iArr);
            try {
                zzcl zzclVarZza = zzckVar2.zza(new zzcl(zzvVar.zzH, i12, i11));
                zzt zztVarZza = zzvVar.zza();
                int i13 = zzclVarZza.zzd;
                zztVarZza.zzG(i13);
                zztVarZza.zzF(zzclVarZza.zzb);
                int i14 = zzclVarZza.zzc;
                zztVarZza.zzE(i14);
                zzvVarZzM = zztVarZza.zzM();
                iZzD2 = zzfj.zzD(i13) * i14;
                zzckVar = zzckVar2;
            } catch (zzcn e10) {
                throw new zzre(e10, zzvVar);
            }
        } else {
            zzvVarZzM = zzvVar;
            zzckVar = new zzck(zzguf.zzi());
            iZzD = -1;
            iZzD2 = -1;
        }
        zzqf zzqfVarZzad = zzad(zzvVarZzM, -1);
        try {
            zzql zzqlVarZzb = this.zzq.zzb(zzqfVarZzad);
            if (zzqlVarZzb.zza == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(false).length() + 36);
                sb2.append("Invalid output encoding (isOffload=");
                sb2.append(false);
                sb2.append(")");
                throw new zzre(sb2.toString(), zzqfVarZzad.zza);
            }
            if (zzqlVarZzb.zzc == 0) {
                StringBuilder sb3 = new StringBuilder(String.valueOf(false).length() + 42);
                sb3.append("Invalid output channel config (isOffload=");
                sb3.append(false);
                sb3.append(")");
                throw new zzre(sb3.toString(), zzqfVarZzad.zza);
            }
            this.zzU = false;
            zzsq zzsqVar = new zzsq(zzvVar, zzvVarZzM, iZzD, iZzD2, zzqlVarZzb, zzckVar, null);
            if (zzab()) {
                this.zzn = zzsqVar;
            } else {
                this.zzo = zzsqVar;
            }
        } catch (zzqd e11) {
            throw new zzre(e11, zzvVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzk(ByteBuffer byteBuffer, long j10, int i10) throws Exception {
        zzqc zzqcVarZzQ;
        ByteBuffer byteBuffer2 = this.zzH;
        zzgrc.zza(byteBuffer2 == null || byteBuffer == byteBuffer2);
        byte[] bArr = null;
        if (this.zzn != null) {
            if (!zzS()) {
                return false;
            }
            if (this.zzn.zzb(this.zzo)) {
                this.zzo = this.zzn;
                this.zzn = null;
                zzqc zzqcVar = this.zzs;
                if (zzqcVar != null && zzqcVar.zzg()) {
                    this.zzo.zzk();
                }
            } else {
                zzae();
                if (zzn()) {
                    return false;
                }
                zzA();
            }
            zzZ(j10);
        }
        if (!zzab()) {
            try {
                if (this.zzj.zzb()) {
                    return false;
                }
                try {
                    zzqcVarZzQ = zzQ(this.zzo.zzk());
                } catch (zzrf e10) {
                    if (this.zzo.zzk().zze > 1000000) {
                        zzqk zzqkVar = new zzqk(this.zzo.zzk(), null);
                        zzqkVar.zze(1000000);
                        zzql zzqlVar = new zzql(zzqkVar, null);
                        try {
                            zzqc zzqcVarZzQ2 = zzQ(zzqlVar);
                            this.zzo = this.zzo.zza(zzqlVar);
                            zzqcVarZzQ = zzqcVarZzQ2;
                        } catch (zzrf e11) {
                            e10.addSuppressed(e11);
                            zzV();
                            throw e10;
                        }
                    }
                    zzV();
                    throw e10;
                }
                this.zzs = zzqcVarZzQ;
                zzsn zzsnVar = new zzsn(this, this.zzo.zzk(), bArr);
                this.zzi = zzsnVar;
                this.zzs.zzm(zzsnVar);
                if (this.zzs.zzg()) {
                    this.zzo.zzk();
                }
                zzpq zzpqVar = this.zzl;
                if (zzpqVar != null) {
                    this.zzs.zzn(zzpqVar);
                }
                zzW();
                int i11 = this.zzQ.zza;
                AudioDeviceInfo audioDeviceInfo = this.zzR;
                if (audioDeviceInfo != null) {
                    this.zzs.zzo(audioDeviceInfo);
                }
                this.zzE = true;
                int iZzh = this.zzs.zzh();
                int i12 = this.zzO;
                this.zzO = iZzh;
                zzrg zzrgVar = this.zzm;
                if (zzrgVar != null) {
                    ((zzsz) zzrgVar).zza.zzaw().zzk(this.zzo.zze());
                    if (iZzh != i12) {
                        this.zzP = true;
                        zzsq zzsqVar = this.zzo;
                        zzqk zzqkVar2 = new zzqk(zzsqVar.zzk(), null);
                        zzqkVar2.zzg(this.zzO);
                        this.zzo = zzsqVar.zza(new zzql(zzqkVar2, null));
                        zzsq zzsqVar2 = this.zzn;
                        if (zzsqVar2 != null) {
                            zzqk zzqkVar3 = new zzqk(zzsqVar2.zzk(), null);
                            zzqkVar3.zzg(this.zzO);
                            this.zzn = zzsqVar2.zza(new zzql(zzqkVar3, null));
                        }
                        zzrg zzrgVar2 = this.zzm;
                        int i13 = this.zzO;
                        if (Build.VERSION.SDK_INT >= 35) {
                            zzta zztaVar = ((zzsz) zzrgVar2).zza;
                            if (zztaVar.zzax() != null) {
                                zztaVar.zzax().zza(i13);
                            }
                        }
                        ((zzsz) zzrgVar2).zza.zzaw().zzm(i13);
                    }
                }
            } catch (zzrf e12) {
                this.zzj.zza(e12);
                return false;
            }
        }
        this.zzj.zzc();
        if (this.zzE) {
            this.zzF = Math.max(0L, j10);
            this.zzD = false;
            this.zzE = false;
            zzZ(j10);
            if (this.zzN) {
                zzi();
            }
        }
        if (this.zzH == null) {
            zzgrc.zza(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            if (!this.zzo.zzf() && this.zzC == 0) {
                int iZzD = zzD(this.zzo.zzk().zza, byteBuffer);
                this.zzC = iZzD;
                if (iZzD == 0) {
                    return true;
                }
            }
            if (this.zzu != null) {
                if (!zzS()) {
                    return false;
                }
                zzZ(j10);
                this.zzu = null;
            }
            long j11 = this.zzF;
            zzsq zzsqVar3 = this.zzo;
            long jZzc = j11 + zzsqVar3.zzc((zzsqVar3.zzf() ? this.zzy / ((long) this.zzo.zzi()) : this.zzz) - this.zzd.zzs());
            if (!this.zzD && Math.abs(jZzc - j10) > 200000) {
                zzrg zzrgVar3 = this.zzm;
                if (zzrgVar3 != null) {
                    zzrgVar3.zza(new zzrh(j10, jZzc));
                }
                this.zzD = true;
            }
            if (this.zzD) {
                if (!zzS()) {
                    return false;
                }
                long j12 = j10 - jZzc;
                this.zzF += j12;
                this.zzD = false;
                zzZ(j10);
                zzrg zzrgVar4 = this.zzm;
                if (zzrgVar4 != null && j12 != 0) {
                    ((zzsz) zzrgVar4).zza.zzao();
                }
            }
            if (this.zzo.zzf()) {
                this.zzy += (long) byteBuffer.remaining();
            } else {
                this.zzz += ((long) this.zzC) * ((long) i10);
            }
            this.zzH = byteBuffer;
            this.zzI = i10;
        }
        zzR(j10);
        if (!this.zzH.hasRemaining()) {
            this.zzH = null;
            this.zzI = 0;
            return true;
        }
        if (!this.zzs.zzl()) {
            return false;
        }
        zzee.zzc("DefaultAudioSink", "Resetting stalled audio output");
        zzA();
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzl() throws zzri {
        if (!this.zzK && zzab() && zzS()) {
            zzae();
            this.zzK = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzo(zzav zzavVar) {
        float f10 = zzavVar.zzb;
        String str = zzfj.zza;
        this.zzw = new zzav(Math.max(0.1f, Math.min(f10, 8.0f)), Math.max(0.1f, Math.min(zzavVar.zzc, 8.0f)));
        zzY(zzavVar);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzq(boolean z10) {
        this.zzx = z10;
        zzY(this.zzw);
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzr(zzd zzdVar) {
        if (this.zzt.equals(zzdVar)) {
            return;
        }
        this.zzt = zzdVar;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzs(int i10) {
        if (this.zzP) {
            if (this.zzO != i10) {
                return;
            } else {
                this.zzP = false;
            }
        }
        if (this.zzO != i10) {
            this.zzO = i10;
            zzX();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzt(zze zzeVar) {
        if (this.zzQ.equals(zzeVar)) {
            return;
        }
        if (this.zzs != null) {
            int i10 = this.zzQ.zza;
        }
        this.zzQ = zzeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzu(@Nullable AudioDeviceInfo audioDeviceInfo) {
        this.zzR = audioDeviceInfo;
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzo(audioDeviceInfo);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzv(int i10) {
        int i11 = this.zzS;
        int iZzaf = zzaf(i10);
        if (i11 == iZzaf) {
            return;
        }
        this.zzS = iZzaf;
        zzX();
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    @RequiresApi(29)
    public final void zzx(int i10, int i11) {
        zzqc zzqcVar = this.zzs;
        if (zzqcVar != null) {
            zzqcVar.zzg();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzy(float f10) {
        if (this.zzG != f10) {
            this.zzG = f10;
            zzW();
        }
    }

    public /* synthetic */ zzsw(zzsp zzspVar, byte[] bArr) {
        Context applicationContext;
        if (zzspVar.zzb() == null) {
            applicationContext = null;
        } else {
            applicationContext = zzspVar.zzb().getApplicationContext();
        }
        this.zzb = applicationContext;
        this.zzt = zzd.zza;
        this.zzZ = zzspVar.zzd();
        this.zzq = zzspVar.zzc();
        zzsl zzslVar = new zzsl();
        this.zzc = zzslVar;
        zzte zzteVar = new zzte();
        this.zzd = zzteVar;
        this.zze = new zzcv();
        this.zzf = new zztd();
        this.zzg = zzguf.zzk(zzteVar, zzslVar);
        this.zzG = 1.0f;
        this.zzO = 0;
        this.zzQ = new zze(0, 0.0f);
        zzav zzavVar = zzav.zza;
        this.zzv = new zzsu(zzavVar, 0L, 0L, null);
        this.zzw = zzavVar;
        this.zzx = false;
        this.zzh = new ArrayDeque();
        this.zzj = new zzsv();
        this.zzk = new zzsv();
        int iZzaf = -1;
        if (Build.VERSION.SDK_INT >= 34 && zzspVar.zzb() != null) {
            iZzaf = zzaf(zzspVar.zzb().getDeviceId());
        }
        this.zzS = iZzaf;
    }

    private final void zzR(long j10) throws Exception {
        zzU(j10);
        if (this.zzJ == null) {
            if (this.zzp.zzc()) {
                while (!this.zzp.zzg()) {
                    do {
                        ByteBuffer byteBufferZze = this.zzp.zze();
                        if (byteBufferZze.hasRemaining()) {
                            zzT(byteBufferZze);
                            zzU(j10);
                        } else {
                            ByteBuffer byteBuffer = this.zzH;
                            if (byteBuffer != null && byteBuffer.hasRemaining()) {
                                this.zzp.zzd(this.zzH);
                            } else {
                                return;
                            }
                        }
                    } while (this.zzJ == null);
                    return;
                }
                return;
            }
            ByteBuffer byteBuffer2 = this.zzH;
            if (byteBuffer2 != null) {
                zzT(byteBuffer2);
                zzU(j10);
            }
        }
    }

    private final void zzW() {
        if (zzab()) {
            this.zzs.zzf(this.zzG);
        }
    }

    private final void zzZ(long j10) {
        zzav zzavVar;
        boolean z10;
        if (zzaa()) {
            zzsr zzsrVar = this.zzZ;
            zzavVar = this.zzw;
            zzsrVar.zzb(zzavVar);
        } else {
            zzavVar = zzav.zza;
        }
        zzav zzavVar2 = zzavVar;
        this.zzw = zzavVar2;
        if (zzaa()) {
            zzsr zzsrVar2 = this.zzZ;
            z10 = this.zzx;
            zzsrVar2.zzc(z10);
        } else {
            z10 = false;
        }
        this.zzx = z10;
        this.zzh.add(new zzsu(zzavVar2, Math.max(0L, j10), this.zzo.zzd(zzac()), null));
        zzP();
        zzrg zzrgVar = this.zzm;
        if (zzrgVar != null) {
            ((zzsz) zzrgVar).zza.zzaw().zzh(this.zzx);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzA() {
        if (zzab()) {
            this.zzy = 0L;
            this.zzz = 0L;
            this.zzA = 0L;
            this.zzB = 0L;
            this.zzV = false;
            this.zzC = 0;
            this.zzv = new zzsu(this.zzw, 0L, 0L, null);
            this.zzF = 0L;
            this.zzu = null;
            this.zzh.clear();
            this.zzH = null;
            this.zzI = 0;
            this.zzJ = null;
            this.zzL = false;
            this.zzK = false;
            this.zzM = false;
            this.zzd.zzr();
            zzP();
            this.zzi = null;
            zzsq zzsqVar = this.zzn;
            if (zzsqVar != null) {
                this.zzo = zzsqVar;
                this.zzn = null;
            }
            zza.incrementAndGet();
            this.zzs.zze();
            this.zzs = null;
        }
        this.zzk.zzc();
        this.zzj.zzc();
        this.zzW = 0L;
        this.zzX = 0L;
        Handler handler = this.zzY;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final void zzB() {
        zzA();
        zzguf zzgufVar = this.zzg;
        int size = zzgufVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((zzco) zzgufVar.get(i10)).zzj();
        }
        this.zze.zzj();
        this.zzf.zzj();
        zzck zzckVar = this.zzp;
        if (zzckVar != null) {
            zzckVar.zzh();
        }
        this.zzN = false;
        this.zzU = false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzd(zzv zzvVar) {
        if (zze(zzvVar) != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzg(boolean z10) {
        ArrayDeque arrayDeque;
        long j10;
        if (zzab() && !this.zzE) {
            long jMin = Math.min(this.zzs.zzk(), this.zzo.zzd(zzac()));
            while (true) {
                arrayDeque = this.zzh;
                if (arrayDeque.isEmpty() || jMin < ((zzsu) arrayDeque.getFirst()).zzc) {
                    break;
                }
                this.zzv = (zzsu) arrayDeque.remove();
            }
            zzsu zzsuVar = this.zzv;
            long j11 = jMin - zzsuVar.zzc;
            long jZzv = zzfj.zzv(j11, zzsuVar.zza.zzb);
            if (arrayDeque.isEmpty()) {
                long jZzd = this.zzZ.zzd(j11);
                zzsu zzsuVar2 = this.zzv;
                j10 = zzsuVar2.zzb + jZzd;
                zzsuVar2.zzd = jZzd - jZzv;
            } else {
                zzsu zzsuVar3 = this.zzv;
                j10 = zzsuVar3.zzb + jZzv + zzsuVar3.zzd;
            }
            long jZze = this.zzZ.zze();
            long jZzd2 = j10 + this.zzo.zzd(jZze);
            long j12 = this.zzW;
            if (jZze > j12) {
                long jZzd3 = this.zzo.zzd(jZze - j12);
                this.zzW = jZze;
                this.zzX += jZzd3;
                if (this.zzY == null) {
                    this.zzY = new Handler(Looper.myLooper());
                }
                this.zzY.removeCallbacksAndMessages(null);
                this.zzY.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzst
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzE();
                    }
                }, 100L);
            }
            return jZzd2;
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzm() {
        if (zzab() && (!this.zzK || zzn())) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final boolean zzn() {
        if (zzab()) {
            if (Build.VERSION.SDK_INT < 29 || !this.zzs.zzg() || !this.zzM) {
                long jZzac = zzac();
                long jZzk = this.zzs.zzk();
                zzqc zzqcVar = this.zzs;
                zzqcVar.getClass();
                if (jZzac > zzfj.zzs(jZzk, zzqcVar.zzi())) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzrj
    public final long zzw() {
        boolean z10;
        if (!zzab()) {
            return -9223372036854775807L;
        }
        if (this.zzo.zzf()) {
            return this.zzo.zzd(this.zzs.zzj());
        }
        long jZzj = this.zzs.zzj();
        int iZzf = zzaey.zzf(this.zzo.zzk().zza);
        if (iZzf != -2147483647) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zzi(z10);
        return zzfj.zzt(jZzj, 1000000L, iZzf, RoundingMode.DOWN);
    }
}
