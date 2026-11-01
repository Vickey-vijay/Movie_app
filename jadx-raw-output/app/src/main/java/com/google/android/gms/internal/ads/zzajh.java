package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.IOException;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzajh implements zzaeu {
    public static final /* synthetic */ int zza = 0;
    private static final byte[] zzb;
    private static final byte[] zzc;
    private static final byte[] zzd;
    private static final byte[] zze;
    private static final UUID zzf;
    private static final Map zzg;
    private long zzA;
    private long zzB;
    private boolean zzC;
    private boolean zzD;

    @Nullable
    private zzajg zzE;
    private boolean zzF;
    private int zzG;
    private long zzH;
    private final SparseArray zzI;
    private boolean zzJ;
    private long zzK;
    private int zzL;
    private long zzM;
    private long zzN;
    private int zzO;
    private boolean zzP;
    private long zzQ;
    private long zzR;
    private long zzS;
    private boolean zzT;
    private int zzU;
    private long zzV;
    private long zzW;
    private int zzX;
    private int zzY;
    private int[] zzZ;
    private int zzaa;
    private int zzab;
    private int zzac;
    private int zzad;
    private boolean zzae;
    private long zzaf;
    private int zzag;
    private int zzah;
    private int zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private int zzam;
    private byte zzan;
    private boolean zzao;
    private zzaex zzap;
    private final zzaja zzaq;
    private final zzajj zzh;
    private final SparseArray zzi;
    private final boolean zzj;
    private final boolean zzk;
    private final zzamd zzl;
    private final zzer zzm;
    private final zzer zzn;
    private final zzer zzo;
    private final zzer zzp;
    private final zzer zzq;
    private final zzer zzr;
    private final zzer zzs;
    private final zzer zzt;
    private final zzer zzu;
    private final zzer zzv;
    private ByteBuffer zzw;
    private long zzx;
    private long zzy;
    private long zzz;

    @Deprecated
    public zzajh() {
        this(new zzaja(), 2, zzamd.zza);
    }

    private final void zzv() {
        this.zzag = 0;
        this.zzah = 0;
        this.zzai = 0;
        this.zzaj = false;
        this.zzak = false;
        this.zzal = false;
        this.zzam = 0;
        this.zzan = (byte) 0;
        this.zzao = false;
        this.zzr.zza(0);
    }

    private final void zzw(zzaev zzaevVar, byte[] bArr, int i10) throws IOException {
        int length = bArr.length;
        int i11 = length + i10;
        zzer zzerVar = this.zzs;
        if (zzerVar.zzj() < i11) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i11 + i10);
            zzerVar.zzb(bArrCopyOf, bArrCopyOf.length);
        } else {
            System.arraycopy(bArr, 0, zzerVar.zzi(), 0, length);
        }
        zzaevVar.zzc(zzerVar.zzi(), length, i10);
        zzerVar.zzh(0);
        zzerVar.zzf(i11);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        int i10 = 0;
        this.zzT = false;
        while (!this.zzT) {
            if (this.zzaq.zzc(zzaevVar)) {
                long jZzn = zzaevVar.zzn();
                if (this.zzP) {
                    this.zzR = jZzn;
                    zzafvVar.zza = this.zzQ;
                    this.zzP = false;
                    return 1;
                }
                if (this.zzF) {
                    long j10 = this.zzR;
                    if (j10 != -1) {
                        zzafvVar.zza = j10;
                        this.zzR = -1L;
                        return 1;
                    }
                }
            } else {
                while (true) {
                    SparseArray sparseArray = this.zzi;
                    if (i10 >= sparseArray.size()) {
                        return -1;
                    }
                    zzajg zzajgVar = (zzajg) sparseArray.valueAt(i10);
                    zzajgVar.zzb();
                    zzagi zzagiVar = zzajgVar.zzU;
                    if (zzagiVar != null) {
                        zzagiVar.zzd(zzajgVar.zzY, zzajgVar.zzj);
                    }
                    i10++;
                }
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    static {
        int i10 = zzajd.zza;
        zzb = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        String str = zzfj.zza;
        zzc = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(StandardCharsets.UTF_8);
        zzd = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        zze = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        zzf = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", Integer.valueOf(BaseTransientBottomBar.ANIMATION_FADE_DURATION));
        map.put("htc_video_rotA-270", 270);
        zzg = Collections.unmodifiableMap(map);
    }

    public zzajh(zzaja zzajaVar, int i10, zzamd zzamdVar) {
        this.zzy = -1L;
        this.zzz = -9223372036854775807L;
        this.zzA = -9223372036854775807L;
        this.zzB = -9223372036854775807L;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        this.zzO = -1;
        this.zzQ = -1L;
        this.zzR = -1L;
        this.zzS = -9223372036854775807L;
        this.zzaq = zzajaVar;
        zzajaVar.zza(new zzajc(this, null));
        this.zzl = zzamdVar;
        this.zzI = new SparseArray();
        this.zzj = 1 == ((i10 & 1) ^ 1);
        this.zzk = (i10 & 2) == 0;
        this.zzh = new zzajj();
        this.zzi = new SparseArray();
        this.zzo = new zzer(4);
        this.zzp = new zzer(ByteBuffer.allocate(4).putInt(-1).array());
        this.zzq = new zzer(4);
        this.zzm = new zzer(zzgm.zza);
        this.zzn = new zzer(4);
        this.zzr = new zzer();
        this.zzs = new zzer();
        this.zzt = new zzer(8);
        this.zzu = new zzer();
        this.zzv = new zzer();
        this.zzZ = new int[1];
        this.zzD = true;
    }

    private static int[] zzA(@Nullable int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        int length = iArr.length;
        return length >= i10 ? iArr : new int[Math.max(length + length, i10)];
    }

    private final void zzB() {
        if (!this.zzD) {
            return;
        }
        int i10 = 0;
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 >= sparseArray.size()) {
                zzaex zzaexVar = this.zzap;
                zzaexVar.getClass();
                zzaexVar.zzv();
                this.zzD = false;
                return;
            }
            if (((zzajg) sparseArray.valueAt(i10)).zzV) {
                return;
            } else {
                i10++;
            }
        }
    }

    private final void zzq(int i10) throws zzat {
        if (this.zzE != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 32);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a TrackEntry");
        throw zzat.zzb(sb2.toString(), null);
    }

    private final void zzr(int i10) throws zzat {
        if (this.zzJ) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 26);
        sb2.append("Element ");
        sb2.append(i10);
        sb2.append(" must be in a Cues");
        throw zzat.zzb(sb2.toString(), null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    private final void zzs(zzajg zzajgVar, long j10, int i10, int i11, int i12) {
        byte b10;
        int i13;
        byte[] bArrZzx;
        int iZze;
        zzagi zzagiVar = zzajgVar.zzU;
        if (zzagiVar != null) {
            zzagiVar.zzc(zzajgVar.zzY, j10, i10, i11, i12, zzajgVar.zzj);
        } else {
            String str = zzajgVar.zzc;
            if ("S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str) || "S_TEXT/WEBVTT".equals(str)) {
                if (this.zzY > 1) {
                    zzee.zzc("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.zzW;
                    if (j11 == -9223372036854775807L) {
                        zzee.zzc("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        zzer zzerVar = this.zzs;
                        byte[] bArrZzi = zzerVar.zzi();
                        switch (str) {
                            case "S_TEXT/ASS":
                                b10 = 1;
                                break;
                            case "S_TEXT/SSA":
                                b10 = 2;
                                break;
                            case "S_TEXT/WEBVTT":
                                b10 = 3;
                                break;
                            case "S_TEXT/UTF8":
                                b10 = 0;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            i13 = 19;
                            bArrZzx = zzx(j11, "%02d:%02d:%02d,%03d", 1000L);
                        } else if (b10 == 1 || b10 == 2) {
                            i13 = 21;
                            bArrZzx = zzx(j11, "%01d:%02d:%02d:%02d", 10000L);
                        } else {
                            if (b10 != 3) {
                                throw new IllegalArgumentException();
                            }
                            i13 = 25;
                            bArrZzx = zzx(j11, "%02d:%02d:%02d.%03d", 1000L);
                        }
                        System.arraycopy(bArrZzx, 0, bArrZzi, i13, bArrZzx.length);
                        for (int iZzg = zzerVar.zzg(); iZzg < zzerVar.zze(); iZzg++) {
                            if (zzerVar.zzi()[iZzg] == 0) {
                                zzerVar.zzf(iZzg);
                                zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                                iZze = i11 + zzerVar.zze();
                            }
                        }
                        zzajgVar.zzY.zzc(zzerVar, zzerVar.zze());
                        iZze = i11 + zzerVar.zze();
                    }
                }
                iZze = i11;
            } else {
                iZze = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.zzY > 1) {
                    this.zzv.zza(0);
                } else {
                    zzer zzerVar2 = this.zzv;
                    int iZze2 = zzerVar2.zze();
                    zzajgVar.zzY.zzd(zzerVar2, iZze2, 2);
                    iZze += iZze2;
                }
            }
            zzajgVar.zzY.zze(j10, i10, iZze, i12, zzajgVar.zzj);
        }
        this.zzT = true;
    }

    private final void zzt(zzaev zzaevVar, int i10) throws IOException {
        zzer zzerVar = this.zzo;
        if (zzerVar.zze() >= i10) {
            return;
        }
        if (zzerVar.zzj() < i10) {
            int iZzj = zzerVar.zzj();
            zzerVar.zzc(Math.max(iZzj + iZzj, i10));
        }
        zzaevVar.zzc(zzerVar.zzi(), zzerVar.zze(), i10 - zzerVar.zze());
        zzerVar.zzf(i10);
    }

    private final int zzu(zzaev zzaevVar, zzajg zzajgVar, int i10, boolean z10) throws IOException {
        int i11;
        String str = zzajgVar.zzc;
        if ("S_TEXT/UTF8".equals(str)) {
            zzw(zzaevVar, zzb, i10);
            int i12 = this.zzah;
            zzv();
            return i12;
        }
        if ("S_TEXT/ASS".equals(str) || "S_TEXT/SSA".equals(str)) {
            zzw(zzaevVar, zzd, i10);
            int i13 = this.zzah;
            zzv();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(str)) {
            zzw(zzaevVar, zze, i10);
            int i14 = this.zzah;
            zzv();
            return i14;
        }
        if (zzajgVar.zzV) {
            zzajgVar.zzZ.getClass();
            int i15 = zzaet.zza;
            zzer zzerVar = new zzer(i10);
            if (zzaevVar.zzh(zzerVar.zzi(), 0, i10, true)) {
                zzaevVar.zzl();
                if (zzaet.zza(zzerVar.zzr()) == 1 && zzerVar.zzd() >= 10) {
                    byte[] bArr = new byte[10];
                    zzerVar.zzm(bArr, 0, 10);
                    zzerVar.zzh(0);
                    int iZzc = zzaet.zzc(bArr);
                    if (zzerVar.zzd() >= iZzc + 4) {
                        zzerVar.zzk(iZzc);
                        if (zzaet.zza(zzerVar.zzB()) == 2) {
                            zzt zztVarZza = zzajgVar.zzZ.zza();
                            zztVarZza.zzm("audio/vnd.dts.hd");
                            zzajgVar.zzZ = zztVarZza.zzM();
                        }
                    }
                }
            }
            zzajgVar.zzY.zzz(zzajgVar.zzZ);
            zzajgVar.zzV = false;
            zzB();
        }
        zzagh zzaghVar = zzajgVar.zzY;
        if (!this.zzaj) {
            if (zzajgVar.zzh) {
                this.zzac &= -1073741825;
                if (!this.zzak) {
                    zzer zzerVar2 = this.zzo;
                    zzaevVar.zzc(zzerVar2.zzi(), 0, 1);
                    this.zzag++;
                    if ((zzerVar2.zzi()[0] & 128) == 128) {
                        throw zzat.zzb("Extension bit is set in signal byte", null);
                    }
                    this.zzan = zzerVar2.zzi()[0];
                    this.zzak = true;
                }
                byte b10 = this.zzan;
                if ((b10 & 1) == 1) {
                    int i16 = b10 & 2;
                    this.zzac |= 1073741824;
                    if (!this.zzao) {
                        zzer zzerVar3 = this.zzt;
                        zzaevVar.zzc(zzerVar3.zzi(), 0, 8);
                        this.zzag += 8;
                        this.zzao = true;
                        zzer zzerVar4 = this.zzo;
                        zzerVar4.zzi()[0] = (byte) ((i16 != 2 ? 0 : 128) | 8);
                        zzerVar4.zzh(0);
                        zzaghVar.zzd(zzerVar4, 1, 1);
                        this.zzah++;
                        zzerVar3.zzh(0);
                        zzaghVar.zzd(zzerVar3, 8, 1);
                        this.zzah += 8;
                    }
                    if (i16 == 2) {
                        if (!this.zzal) {
                            zzer zzerVar5 = this.zzo;
                            zzaevVar.zzc(zzerVar5.zzi(), 0, 1);
                            this.zzag++;
                            zzerVar5.zzh(0);
                            this.zzam = zzerVar5.zzs();
                            this.zzal = true;
                        }
                        int i17 = this.zzam * 4;
                        zzer zzerVar6 = this.zzo;
                        zzerVar6.zza(i17);
                        zzaevVar.zzc(zzerVar6.zzi(), 0, i17);
                        this.zzag += i17;
                        int i18 = (this.zzam >> 1) + 1;
                        int i19 = (i18 * 6) + 2;
                        ByteBuffer byteBuffer = this.zzw;
                        if (byteBuffer == null || byteBuffer.capacity() < i19) {
                            this.zzw = ByteBuffer.allocate(i19);
                        }
                        this.zzw.position(0);
                        this.zzw.putShort((short) i18);
                        int i20 = 0;
                        int i21 = 0;
                        while (true) {
                            i11 = this.zzam;
                            if (i20 >= i11) {
                                break;
                            }
                            int iZzH = zzerVar6.zzH();
                            int i22 = iZzH - i21;
                            if (i20 % 2 == 0) {
                                this.zzw.putShort((short) i22);
                            } else {
                                this.zzw.putInt(i22);
                            }
                            i20++;
                            i21 = iZzH;
                        }
                        int i23 = (i10 - this.zzag) - i21;
                        if ((i11 & 1) == 1) {
                            this.zzw.putInt(i23);
                        } else {
                            this.zzw.putShort((short) i23);
                            this.zzw.putInt(0);
                        }
                        zzer zzerVar7 = this.zzu;
                        zzerVar7.zzb(this.zzw.array(), i19);
                        zzaghVar.zzd(zzerVar7, i19, 1);
                        this.zzah += i19;
                    }
                }
            } else {
                byte[] bArr2 = zzajgVar.zzi;
                if (bArr2 != null) {
                    this.zzr.zzb(bArr2, bArr2.length);
                }
            }
            if (!"A_OPUS".equals(zzajgVar.zzc) ? zzajgVar.zzg > 0 : z10) {
                this.zzac |= 268435456;
                this.zzv.zza(0);
                int iZze = (this.zzr.zze() + i10) - this.zzag;
                zzer zzerVar8 = this.zzo;
                zzerVar8.zza(4);
                zzerVar8.zzi()[0] = (byte) ((iZze >> 24) & 255);
                zzerVar8.zzi()[1] = (byte) ((iZze >> 16) & 255);
                zzerVar8.zzi()[2] = (byte) ((iZze >> 8) & 255);
                zzerVar8.zzi()[3] = (byte) (iZze & 255);
                zzaghVar.zzd(zzerVar8, 4, 2);
                this.zzah += 4;
            }
            this.zzaj = true;
        }
        zzer zzerVar9 = this.zzr;
        int iZze2 = i10 + zzerVar9.zze();
        String str2 = zzajgVar.zzc;
        if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
            if (zzajgVar.zzU != null) {
                zzgrc.zzi(zzerVar9.zze() == 0);
                zzajgVar.zzU.zzb(zzaevVar);
            }
            while (true) {
                int i24 = this.zzag;
                if (i24 >= iZze2) {
                    break;
                }
                int iZzy = zzy(zzaevVar, zzaghVar, iZze2 - i24);
                this.zzag += iZzy;
                this.zzah += iZzy;
            }
        } else {
            zzer zzerVar10 = this.zzn;
            byte[] bArrZzi = zzerVar10.zzi();
            bArrZzi[0] = 0;
            bArrZzi[1] = 0;
            bArrZzi[2] = 0;
            int i25 = zzajgVar.zzaa;
            int i26 = 4 - i25;
            while (this.zzag < iZze2) {
                int i27 = this.zzai;
                if (i27 == 0) {
                    int iMin = Math.min(i25, zzerVar9.zzd());
                    zzaevVar.zzc(bArrZzi, i26 + iMin, i25 - iMin);
                    if (iMin > 0) {
                        zzerVar9.zzm(bArrZzi, i26, iMin);
                    }
                    this.zzag += i25;
                    zzerVar10.zzh(0);
                    this.zzai = zzerVar10.zzH();
                    zzer zzerVar11 = this.zzm;
                    zzerVar11.zzh(0);
                    zzaghVar.zzc(zzerVar11, 4);
                    this.zzah += 4;
                } else {
                    int iZzy2 = zzy(zzaevVar, zzaghVar, i27);
                    this.zzag += iZzy2;
                    this.zzah += iZzy2;
                    this.zzai -= iZzy2;
                }
            }
        }
        if ("A_VORBIS".equals(zzajgVar.zzc)) {
            zzer zzerVar12 = this.zzp;
            zzerVar12.zzh(0);
            zzaghVar.zzc(zzerVar12, 4);
            this.zzah += 4;
        }
        int i28 = this.zzah;
        zzv();
        return i28;
    }

    private final int zzy(zzaev zzaevVar, zzagh zzaghVar, int i10) throws IOException {
        zzer zzerVar = this.zzr;
        int iZzd = zzerVar.zzd();
        if (iZzd <= 0) {
            return zzaghVar.zza(zzaevVar, i10, false);
        }
        int iMin = Math.min(i10, iZzd);
        zzaghVar.zzc(zzerVar, iMin);
        return iMin;
    }

    private final long zzz(long j10) throws zzat {
        long j11 = this.zzz;
        if (j11 != -9223372036854775807L) {
            return zzfj.zzt(j10, j11, 1000L, RoundingMode.DOWN);
        }
        throw zzat.zzb("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        return new zzaji().zza(zzaevVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        if (this.zzk) {
            zzaexVar = new zzamg(zzaexVar, this.zzl);
        }
        this.zzap = zzaexVar;
    }

    @CallSuper
    public final void zzh(int i10, long j10, long j11) throws zzat {
        zzaex zzaexVar = this.zzap;
        zzaexVar.getClass();
        if (i10 == 160) {
            this.zzae = false;
            this.zzaf = 0L;
            return;
        }
        if (i10 == 174) {
            zzajg zzajgVar = new zzajg();
            this.zzE = zzajgVar;
            zzajgVar.zza = this.zzC;
            return;
        }
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzL = -1;
            this.zzM = -1L;
            this.zzN = -1L;
            return;
        }
        if (i10 == 187) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            this.zzK = -9223372036854775807L;
            return;
        }
        if (i10 == 19899) {
            this.zzG = -1;
            this.zzH = -1L;
            return;
        }
        if (i10 == 20533) {
            zzq(i10);
            this.zzE.zzh = true;
            return;
        }
        if (i10 == 21968) {
            zzq(i10);
            this.zzE.zzy = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.zzy;
            if (j12 != -1 && j12 != j10) {
                throw zzat.zzb("Multiple Segment elements not supported", null);
            }
            this.zzy = j10;
            this.zzx = j11;
            return;
        }
        if (i10 == 475249515) {
            if (this.zzF) {
                return;
            }
            this.zzJ = true;
        } else if (i10 == 524531317 && !this.zzF) {
            if (this.zzj && this.zzQ != -1) {
                this.zzP = true;
            } else {
                zzaexVar.zzw(new zzafx(this.zzB, 0L));
                this.zzF = true;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:73:0x0195  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    @CallSuper
    public final void zzi(int i10) throws zzat {
        int i11;
        int i12;
        SparseArray sparseArray;
        List list;
        SparseArray sparseArray2;
        zzajg zzajgVar;
        long jZza;
        long jZzb;
        long jZzb2;
        long jZza2;
        zzajg zzajgVar2;
        zzap zzapVar;
        zzahx zzahxVar;
        zzap zzapVarZzg;
        this.zzap.getClass();
        byte b10 = 8;
        int i13 = 2;
        if (i10 == 160) {
            if (this.zzU == 2) {
                zzajg zzajgVar3 = (zzajg) this.zzi.get(this.zzaa);
                zzajgVar3.zzb();
                if (this.zzaf > 0 && "A_OPUS".equals(zzajgVar3.zzc)) {
                    zzer zzerVar = this.zzv;
                    byte[] bArrArray = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.zzaf).array();
                    zzerVar.zzb(bArrArray, bArrArray.length);
                }
                int i14 = 0;
                for (int i15 = 0; i15 < this.zzY; i15++) {
                    i14 += this.zzZ[i15];
                }
                int i16 = 0;
                while (i16 < this.zzY) {
                    long j10 = this.zzV + ((long) ((zzajgVar3.zzf * i16) / 1000));
                    int i17 = this.zzac;
                    if (i16 == 0) {
                        if (!this.zzae) {
                            i17 |= 1;
                        }
                        i11 = 0;
                    } else {
                        i11 = i16;
                    }
                    int i18 = this.zzZ[i11];
                    int i19 = i14 - i18;
                    zzs(zzajgVar3, j10, i17, i18, i19);
                    i16 = i11 + 1;
                    i14 = i19;
                }
                this.zzU = 0;
                return;
            }
            return;
        }
        int i20 = -1;
        if (i10 == 174) {
            zzajg zzajgVar4 = this.zzE;
            zzajgVar4.getClass();
            String str = zzajgVar4.zzc;
            if (str == null) {
                throw zzat.zzb("CodecId is missing in TrackEntry element", null);
            }
            switch (str.hashCode()) {
                case -2095576542:
                    b10 = str.equals("V_MPEG4/ISO/AP") ? (byte) 6 : (byte) -1;
                    break;
                case -2095575984:
                    b10 = str.equals("V_MPEG4/ISO/SP") ? (byte) 4 : (byte) -1;
                    break;
                case -1985379776:
                    b10 = str.equals("A_MS/ACM") ? (byte) 23 : (byte) -1;
                    break;
                case -1784763192:
                    b10 = str.equals("A_TRUEHD") ? (byte) 18 : (byte) -1;
                    break;
                case -1730367663:
                    b10 = str.equals("A_VORBIS") ? (byte) 12 : (byte) -1;
                    break;
                case -1482641358:
                    b10 = str.equals("A_MPEG/L2") ? (byte) 14 : (byte) -1;
                    break;
                case -1482641357:
                    b10 = str.equals("A_MPEG/L3") ? (byte) 15 : (byte) -1;
                    break;
                case -1373388978:
                    b10 = str.equals("V_MS/VFW/FOURCC") ? (byte) 9 : (byte) -1;
                    break;
                case -933872740:
                    b10 = str.equals("S_DVBSUB") ? (byte) 33 : (byte) -1;
                    break;
                case -538363189:
                    b10 = str.equals("V_MPEG4/ISO/ASP") ? (byte) 5 : (byte) -1;
                    break;
                case -538363109:
                    b10 = str.equals("V_MPEG4/ISO/AVC") ? (byte) 7 : (byte) -1;
                    break;
                case -425012669:
                    b10 = str.equals("S_VOBSUB") ? (byte) 31 : (byte) -1;
                    break;
                case -356037306:
                    b10 = str.equals("A_DTS/LOSSLESS") ? (byte) 21 : (byte) -1;
                    break;
                case 62923557:
                    b10 = str.equals("A_AAC") ? (byte) 13 : (byte) -1;
                    break;
                case 62923603:
                    b10 = str.equals("A_AC3") ? (byte) 16 : (byte) -1;
                    break;
                case 62927045:
                    b10 = str.equals("A_DTS") ? (byte) 19 : (byte) -1;
                    break;
                case 82318131:
                    b10 = str.equals("V_AV1") ? (byte) 2 : (byte) -1;
                    break;
                case 82338133:
                    b10 = str.equals("V_VP8") ? (byte) 0 : (byte) -1;
                    break;
                case 82338134:
                    b10 = str.equals("V_VP9") ? (byte) 1 : (byte) -1;
                    break;
                case 99146302:
                    b10 = str.equals("S_HDMV/PGS") ? (byte) 32 : (byte) -1;
                    break;
                case 444813526:
                    b10 = str.equals("V_THEORA") ? (byte) 10 : (byte) -1;
                    break;
                case 542569478:
                    b10 = str.equals("A_DTS/EXPRESS") ? (byte) 20 : (byte) -1;
                    break;
                case 635596514:
                    b10 = str.equals("A_PCM/FLOAT/IEEE") ? (byte) 26 : (byte) -1;
                    break;
                case 725948237:
                    b10 = str.equals("A_PCM/INT/BIG") ? (byte) 25 : (byte) -1;
                    break;
                case 725957860:
                    b10 = str.equals("A_PCM/INT/LIT") ? (byte) 24 : (byte) -1;
                    break;
                case 738597099:
                    b10 = str.equals("S_TEXT/ASS") ? (byte) 28 : (byte) -1;
                    break;
                case 738614379:
                    b10 = str.equals("S_TEXT/SSA") ? (byte) 29 : (byte) -1;
                    break;
                case 855502857:
                    if (!str.equals("V_MPEGH/ISO/HEVC")) {
                        b10 = -1;
                    }
                    break;
                case 1045209816:
                    b10 = str.equals("S_TEXT/WEBVTT") ? (byte) 30 : (byte) -1;
                    break;
                case 1422270023:
                    b10 = str.equals("S_TEXT/UTF8") ? (byte) 27 : (byte) -1;
                    break;
                case 1809237540:
                    b10 = str.equals("V_MPEG2") ? (byte) 3 : (byte) -1;
                    break;
                case 1950749482:
                    b10 = str.equals("A_EAC3") ? (byte) 17 : (byte) -1;
                    break;
                case 1950789798:
                    b10 = str.equals("A_FLAC") ? (byte) 22 : (byte) -1;
                    break;
                case 1951062397:
                    b10 = str.equals("A_OPUS") ? (byte) 11 : (byte) -1;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            switch (b10) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                    zzajgVar4.zza(zzajgVar4.zzd);
                    zzajgVar4.zzY = this.zzap.zzu(zzajgVar4.zzd, zzajgVar4.zze);
                    this.zzi.put(zzajgVar4.zzd, zzajgVar4);
                    break;
            }
            this.zzE = null;
            return;
        }
        long j11 = -9223372036854775807L;
        if (i10 == 183) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzK == -9223372036854775807L || (i12 = this.zzL) == -1 || this.zzM == -1) {
                return;
            }
            SparseArray sparseArray3 = this.zzI;
            List arrayList = (List) sparseArray3.get(i12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray3.put(this.zzL, arrayList);
            }
            arrayList.add(new zzaje(this.zzK, this.zzy + this.zzM, this.zzN, null));
            return;
        }
        if (i10 == 19899) {
            int i21 = this.zzG;
            if (i21 != -1) {
                long j12 = this.zzH;
                if (j12 != -1) {
                    if (i21 == 475249515) {
                        this.zzQ = j12;
                        return;
                    }
                    return;
                }
            }
            throw zzat.zzb("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i10 == 25152) {
            zzq(i10);
            zzajg zzajgVar5 = this.zzE;
            if (zzajgVar5.zzh) {
                if (zzajgVar5.zzj == null) {
                    throw zzat.zzb("Encrypted Track found but ContentEncKeyID was not found", null);
                }
                zzajgVar5.zzl = new zzq(null, new zzp(zzg.zza, null, "video/webm", this.zzE.zzj.zzb));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            zzq(i10);
            zzajg zzajgVar6 = this.zzE;
            if (zzajgVar6.zzh && zzajgVar6.zzi != null) {
                throw zzat.zzb("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.zzz == -9223372036854775807L) {
                this.zzz = 1000000L;
            }
            long j13 = this.zzA;
            if (j13 != -9223372036854775807L) {
                this.zzB = zzz(j13);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            SparseArray sparseArray4 = this.zzi;
            if (sparseArray4.size() == 0) {
                throw zzat.zzb("No valid tracks were found", null);
            }
            boolean z10 = !this.zzj || this.zzQ == -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            for (int i26 = 0; i26 < sparseArray4.size(); i26++) {
                zzajg zzajgVar7 = (zzajg) sparseArray4.valueAt(i26);
                int i27 = zzajgVar7.zze;
                if (i27 == 2) {
                    if (zzajgVar7.zzX) {
                        i22 = zzajgVar7.zzd;
                    }
                    if (i23 == -1) {
                        i23 = zzajgVar7.zzd;
                    }
                } else if (i27 == 1) {
                    if (zzajgVar7.zzX) {
                        i24 = zzajgVar7.zzd;
                    }
                    if (i25 == -1) {
                        i25 = zzajgVar7.zzd;
                    }
                }
                if (z10) {
                    zzajgVar7.zzb();
                    if (!zzajgVar7.zzV) {
                        zzagh zzaghVar = zzajgVar7.zzY;
                        zzv zzvVar = zzajgVar7.zzZ;
                        zzvVar.getClass();
                        zzaghVar.zzz(zzvVar);
                    }
                }
            }
            if (i22 != -1) {
                this.zzO = i22;
            } else if (i23 != -1) {
                this.zzO = i23;
            } else if (i24 != -1) {
                this.zzO = i24;
            } else if (i25 != -1) {
                this.zzO = i25;
            } else {
                this.zzO = sparseArray4.size() > 0 ? ((zzajg) sparseArray4.valueAt(0)).zzd : -1;
            }
            if (z10) {
                zzB();
                return;
            }
            return;
        }
        if (i10 != 475249515 || this.zzF) {
            return;
        }
        int i28 = 0;
        while (true) {
            sparseArray = this.zzI;
            if (i28 < sparseArray.size()) {
                if (!((List) sparseArray.valueAt(i28)).isEmpty()) {
                    if (this.zzB != j11) {
                        for (int i29 = 0; i29 < sparseArray.size(); i29++) {
                            Collections.sort((List) sparseArray.valueAt(i29));
                        }
                        this.zzap.zzw(new zzajf(sparseArray, this.zzB, this.zzO, this.zzy, this.zzx));
                        break;
                    }
                    break;
                }
                i28++;
                j11 = -9223372036854775807L;
            }
            this.zzap.zzw(new zzafx(this.zzB, 0L));
            break;
        }
        this.zzF = true;
        this.zzJ = false;
        int i30 = 0;
        while (true) {
            SparseArray sparseArray5 = this.zzi;
            if (i30 >= sparseArray5.size()) {
                zzB();
                return;
            }
            zzajg zzajgVar8 = (zzajg) sparseArray5.valueAt(i30);
            long j14 = this.zzB;
            long j15 = this.zzy;
            long j16 = this.zzx;
            if (zzajgVar8.zze != i13 || (list = (List) sparseArray.get(zzajgVar8.zzd)) == null || list.isEmpty()) {
                sparseArray2 = sparseArray;
                zzajgVar2 = zzajgVar8;
            } else {
                if (list.isEmpty()) {
                    sparseArray2 = sparseArray;
                    zzajgVar = zzajgVar8;
                } else {
                    int iMin = Math.min(list.size(), 20);
                    double d10 = 0.0d;
                    int i31 = i20;
                    int i32 = 0;
                    while (i32 < iMin) {
                        zzaje zzajeVar = (zzaje) list.get(i32);
                        if (zzajeVar.zza() > 10000000) {
                            break;
                        }
                        int i33 = i32 + 1;
                        SparseArray sparseArray6 = sparseArray;
                        if (i32 < list.size() - 1) {
                            zzaje zzajeVar2 = (zzaje) list.get(i33);
                            jZzb = zzajeVar2.zzb() + zzajeVar2.zzc();
                            jZzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            jZza2 = zzajeVar2.zza() - zzajeVar.zza();
                        } else {
                            jZzb = j15 + j16;
                            jZzb2 = zzajeVar.zzb() + zzajeVar.zzc();
                            jZza2 = j14 - zzajeVar.zza();
                        }
                        long j17 = jZzb - jZzb2;
                        zzajg zzajgVar9 = zzajgVar8;
                        long j18 = j15;
                        long j19 = jZza2;
                        if (j19 > 0) {
                            double d11 = j17 / j19;
                            if (d11 > d10) {
                                d10 = d11;
                                i31 = i32;
                            }
                        }
                        zzajgVar8 = zzajgVar9;
                        i32 = i33;
                        sparseArray = sparseArray6;
                        j15 = j18;
                        i20 = -1;
                    }
                    sparseArray2 = sparseArray;
                    zzajgVar = zzajgVar8;
                    if (i31 != i20) {
                        jZza = ((zzaje) list.get(i31)).zza();
                    }
                    zzajgVar2 = zzajgVar;
                    if (jZza != -9223372036854775807L) {
                        zzv zzvVar2 = zzajgVar2.zzZ;
                        zzvVar2.getClass();
                        zzapVar = zzvVar2.zzl;
                        zzahxVar = new zzahx(jZza);
                        if (zzapVar == null) {
                            zzapVarZzg = new zzap(-9223372036854775807L, zzahxVar);
                        } else {
                            zzapVarZzg = zzapVar.zzg(zzahxVar);
                        }
                        zzt zztVarZza = zzajgVar2.zzZ.zza();
                        zztVarZza.zzk(zzapVarZzg);
                        zzajgVar2.zzZ = zztVarZza.zzM();
                    }
                }
                jZza = -9223372036854775807L;
                zzajgVar2 = zzajgVar;
                if (jZza != -9223372036854775807L) {
                    zzv zzvVar3 = zzajgVar2.zzZ;
                    zzvVar3.getClass();
                    zzapVar = zzvVar3.zzl;
                    zzahxVar = new zzahx(jZza);
                    if (zzapVar == null) {
                        zzapVarZzg = new zzap(-9223372036854775807L, zzahxVar);
                    } else {
                        zzapVarZzg = zzapVar.zzg(zzahxVar);
                    }
                    zzt zztVarZza2 = zzajgVar2.zzZ.zza();
                    zztVarZza2.zzk(zzapVarZzg);
                    zzajgVar2.zzZ = zztVarZza2.zzM();
                }
            }
            if (!zzajgVar2.zzV) {
                zzajgVar2.zzb();
                zzagh zzaghVar2 = zzajgVar2.zzY;
                zzv zzvVar4 = zzajgVar2.zzZ;
                zzvVar4.getClass();
                zzaghVar2.zzz(zzvVar4);
            }
            i30++;
            sparseArray = sparseArray2;
            i13 = 2;
            i20 = -1;
        }
    }

    @CallSuper
    public final void zzj(int i10, long j10) throws zzat {
        boolean z10;
        if (i10 == 240) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzN == -1) {
                this.zzN = j10;
                return;
            }
            return;
        }
        if (i10 == 241) {
            if (this.zzF) {
                return;
            }
            zzr(i10);
            if (this.zzM == -1) {
                this.zzM = j10;
                return;
            }
            return;
        }
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb2.append("ContentEncodingOrder ");
            sb2.append(j10);
            sb2.append(" not supported");
            throw zzat.zzb(sb2.toString(), null);
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(j10).length() + 35);
            sb3.append("ContentEncodingScope ");
            sb3.append(j10);
            sb3.append(" not supported");
            throw zzat.zzb(sb3.toString(), null);
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                int i11 = (int) j10;
                if (i11 == 1) {
                    zzq(i10);
                    this.zzE.zze = 2;
                    return;
                }
                if (i11 == 2) {
                    zzq(i10);
                    this.zzE.zze = 1;
                    return;
                } else if (i11 == 17) {
                    zzq(i10);
                    this.zzE.zze = 3;
                    return;
                } else if (i11 != 33) {
                    zzq(i10);
                    this.zzE.zze = -1;
                    return;
                } else {
                    zzq(i10);
                    this.zzE.zze = 5;
                    return;
                }
            case 136:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzX = z10;
                return;
            case 155:
                this.zzW = zzz(j10);
                return;
            case 159:
                zzq(i10);
                this.zzE.zzP = (int) j10;
                return;
            case 176:
                zzq(i10);
                this.zzE.zzm = (int) j10;
                return;
            case 179:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzK = zzz(j10);
                return;
            case 186:
                zzq(i10);
                this.zzE.zzn = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                zzq(i10);
                this.zzE.zzd = (int) j10;
                return;
            case 231:
                this.zzS = zzz(j10);
                return;
            case 238:
                this.zzad = (int) j10;
                return;
            case 247:
                if (this.zzF) {
                    return;
                }
                zzr(i10);
                this.zzL = (int) j10;
                return;
            case 251:
                this.zzae = true;
                return;
            case 16871:
                zzq(i10);
                this.zzE.zzd((int) j10);
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb4.append("ContentCompAlgo ");
                sb4.append(j10);
                sb4.append(" not supported");
                throw zzat.zzb(sb4.toString(), null);
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    StringBuilder sb5 = new StringBuilder(String.valueOf(j10).length() + 33);
                    sb5.append("DocTypeReadVersion ");
                    sb5.append(j10);
                    sb5.append(" not supported");
                    throw zzat.zzb(sb5.toString(), null);
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb6 = new StringBuilder(String.valueOf(j10).length() + 30);
                sb6.append("EBMLReadVersion ");
                sb6.append(j10);
                sb6.append(" not supported");
                throw zzat.zzb(sb6.toString(), null);
            case 18401:
                if (j10 == 5) {
                    return;
                }
                StringBuilder sb7 = new StringBuilder(String.valueOf(j10).length() + 29);
                sb7.append("ContentEncAlgo ");
                sb7.append(j10);
                sb7.append(" not supported");
                throw zzat.zzb(sb7.toString(), null);
            case 18408:
                if (j10 == 1) {
                    return;
                }
                StringBuilder sb8 = new StringBuilder(String.valueOf(j10).length() + 36);
                sb8.append("AESSettingsCipherMode ");
                sb8.append(j10);
                sb8.append(" not supported");
                throw zzat.zzb(sb8.toString(), null);
            case 21420:
                this.zzH = j10 + this.zzy;
                return;
            case 21432:
                int i12 = (int) j10;
                zzq(i10);
                if (i12 == 0) {
                    this.zzE.zzx = 0;
                    return;
                }
                if (i12 == 1) {
                    this.zzE.zzx = 2;
                    return;
                } else if (i12 == 3) {
                    this.zzE.zzx = 1;
                    return;
                } else {
                    if (i12 != 15) {
                        return;
                    }
                    this.zzE.zzx = 3;
                    return;
                }
            case 21680:
                zzq(i10);
                this.zzE.zzp = (int) j10;
                return;
            case 21682:
                zzq(i10);
                this.zzE.zzr = (int) j10;
                return;
            case 21690:
                zzq(i10);
                this.zzE.zzq = (int) j10;
                return;
            case 21930:
                z10 = j10 == 1;
                zzq(i10);
                this.zzE.zzW = z10;
                return;
            case 21938:
                zzq(i10);
                zzajg zzajgVar = this.zzE;
                zzajgVar.zzy = true;
                zzajgVar.zzo = (int) j10;
                return;
            case 21998:
                zzq(i10);
                this.zzE.zzg = (int) j10;
                return;
            case 22186:
                zzq(i10);
                this.zzE.zzS = j10;
                return;
            case 22203:
                zzq(i10);
                this.zzE.zzT = j10;
                return;
            case 25188:
                zzq(i10);
                this.zzE.zzQ = (int) j10;
                return;
            case 30114:
                this.zzaf = j10;
                return;
            case 30321:
                int i13 = (int) j10;
                zzq(i10);
                if (i13 == 0) {
                    this.zzE.zzs = 0;
                    return;
                }
                if (i13 == 1) {
                    this.zzE.zzs = 1;
                    return;
                } else if (i13 == 2) {
                    this.zzE.zzs = 2;
                    return;
                } else {
                    if (i13 != 3) {
                        return;
                    }
                    this.zzE.zzs = 3;
                    return;
                }
            case 2352003:
                zzq(i10);
                this.zzE.zzf = (int) j10;
                return;
            case 2807729:
                this.zzz = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i14 = (int) j10;
                        zzq(i10);
                        if (i14 == 1) {
                            this.zzE.zzB = 2;
                            return;
                        } else {
                            if (i14 != 2) {
                                return;
                            }
                            this.zzE.zzB = 1;
                            return;
                        }
                    case 21946:
                        zzq(i10);
                        int iZzc = zzi.zzc((int) j10);
                        if (iZzc != -1) {
                            this.zzE.zzA = iZzc;
                            return;
                        }
                        return;
                    case 21947:
                        zzq(i10);
                        this.zzE.zzy = true;
                        int iZzb = zzi.zzb((int) j10);
                        if (iZzb != -1) {
                            this.zzE.zzz = iZzb;
                            return;
                        }
                        return;
                    case 21948:
                        zzq(i10);
                        this.zzE.zzC = (int) j10;
                        return;
                    case 21949:
                        zzq(i10);
                        this.zzE.zzD = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    @CallSuper
    public final void zzk(int i10, double d10) throws zzat {
        if (i10 == 181) {
            zzq(i10);
            this.zzE.zzR = (int) d10;
            return;
        }
        if (i10 == 17545) {
            this.zzA = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                zzq(i10);
                this.zzE.zzE = (float) d10;
                break;
            case 21970:
                zzq(i10);
                this.zzE.zzF = (float) d10;
                break;
            case 21971:
                zzq(i10);
                this.zzE.zzG = (float) d10;
                break;
            case 21972:
                zzq(i10);
                this.zzE.zzH = (float) d10;
                break;
            case 21973:
                zzq(i10);
                this.zzE.zzI = (float) d10;
                break;
            case 21974:
                zzq(i10);
                this.zzE.zzJ = (float) d10;
                break;
            case 21975:
                zzq(i10);
                this.zzE.zzK = (float) d10;
                break;
            case 21976:
                zzq(i10);
                this.zzE.zzL = (float) d10;
                break;
            case 21977:
                zzq(i10);
                this.zzE.zzM = (float) d10;
                break;
            case 21978:
                zzq(i10);
                this.zzE.zzN = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        zzq(i10);
                        this.zzE.zzt = (float) d10;
                        break;
                    case 30324:
                        zzq(i10);
                        this.zzE.zzu = (float) d10;
                        break;
                    case 30325:
                        zzq(i10);
                        this.zzE.zzv = (float) d10;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public final void zzl(int i10, String str) throws zzat {
        if (i10 == 134) {
            zzq(i10);
            this.zzE.zzc = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                zzq(i10);
                this.zzE.zzb = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                zzq(i10);
                this.zzE.zze(str);
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            this.zzC = Objects.equals(str, "webm");
            return;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + 22);
        sb2.append("DocType ");
        sb2.append(str);
        sb2.append(" not supported");
        throw zzat.zzb(sb2.toString(), null);
    }

    @CallSuper
    public final void zzm(int i10, int i11, zzaev zzaevVar) throws IOException {
        int i12;
        long j10;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = i10;
        Throwable th2 = null;
        int i19 = 1;
        int i20 = 0;
        if (i18 != 161 && i18 != 163) {
            if (i18 == 165) {
                if (this.zzU != 2) {
                    return;
                }
                zzajg zzajgVar = (zzajg) this.zzi.get(this.zzaa);
                if (this.zzad != 4 || !"V_VP9".equals(zzajgVar.zzc)) {
                    zzaevVar.zzf(i11);
                    return;
                }
                zzer zzerVar = this.zzv;
                zzerVar.zza(i11);
                zzaevVar.zzc(zzerVar.zzi(), 0, i11);
                return;
            }
            if (i18 == 16877) {
                zzq(i10);
                zzajg zzajgVar2 = this.zzE;
                if (zzajgVar2.zzc() != 1685485123 && zzajgVar2.zzc() != 1685480259) {
                    zzaevVar.zzf(i11);
                    return;
                }
                byte[] bArr = new byte[i11];
                zzajgVar2.zzO = bArr;
                zzaevVar.zzc(bArr, 0, i11);
                return;
            }
            if (i18 == 16981) {
                zzq(i10);
                byte[] bArr2 = new byte[i11];
                this.zzE.zzi = bArr2;
                zzaevVar.zzc(bArr2, 0, i11);
                return;
            }
            if (i18 == 18402) {
                byte[] bArr3 = new byte[i11];
                zzaevVar.zzc(bArr3, 0, i11);
                zzq(i10);
                this.zzE.zzj = new zzagg(1, bArr3, 0, 0);
                return;
            }
            if (i18 == 21419) {
                zzer zzerVar2 = this.zzq;
                Arrays.fill(zzerVar2.zzi(), (byte) 0);
                zzaevVar.zzc(zzerVar2.zzi(), 4 - i11, i11);
                zzerVar2.zzh(0);
                this.zzG = (int) zzerVar2.zzz();
                return;
            }
            if (i18 == 25506) {
                zzq(i10);
                byte[] bArr4 = new byte[i11];
                this.zzE.zzk = bArr4;
                zzaevVar.zzc(bArr4, 0, i11);
                return;
            }
            if (i18 != 30322) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 15);
                sb2.append("Unexpected id: ");
                sb2.append(i18);
                throw zzat.zzb(sb2.toString(), null);
            }
            zzq(i10);
            byte[] bArr5 = new byte[i11];
            this.zzE.zzw = bArr5;
            zzaevVar.zzc(bArr5, 0, i11);
            return;
        }
        int i21 = 8;
        if (this.zzU == 0) {
            zzajj zzajjVar = this.zzh;
            this.zzaa = (int) zzajjVar.zzb(zzaevVar, false, true, 8);
            this.zzab = zzajjVar.zzc();
            this.zzW = -9223372036854775807L;
            this.zzU = 1;
            this.zzo.zza(0);
        }
        zzajg zzajgVar3 = (zzajg) this.zzi.get(this.zzaa);
        if (zzajgVar3 == null) {
            zzaevVar.zzf(i11 - this.zzab);
            this.zzU = 0;
            return;
        }
        zzajgVar3.zzb();
        if (this.zzU == 1) {
            zzt(zzaevVar, 3);
            zzer zzerVar3 = this.zzo;
            int i22 = (zzerVar3.zzi()[2] & 6) >> 1;
            if (i22 == 0) {
                this.zzY = 1;
                int[] iArrZzA = zzA(this.zzZ, 1);
                this.zzZ = iArrZzA;
                iArrZzA[0] = (i11 - this.zzab) - 3;
            } else {
                zzt(zzaevVar, 4);
                int i23 = (zzerVar3.zzi()[3] & 255) + 1;
                this.zzY = i23;
                int[] iArrZzA2 = zzA(this.zzZ, i23);
                this.zzZ = iArrZzA2;
                if (i22 == 2) {
                    int i24 = (i11 - this.zzab) - 4;
                    int i25 = this.zzY;
                    Arrays.fill(iArrZzA2, 0, i25, i24 / i25);
                } else if (i22 == 1) {
                    int i26 = 0;
                    int i27 = 0;
                    int i28 = 4;
                    while (true) {
                        i13 = this.zzY - 1;
                        if (i26 >= i13) {
                            break;
                        }
                        this.zzZ[i26] = 0;
                        do {
                            i28++;
                            zzt(zzaevVar, i28);
                            i14 = zzerVar3.zzi()[i28 - 1] & 255;
                            int[] iArr = this.zzZ;
                            i15 = iArr[i26] + i14;
                            iArr[i26] = i15;
                        } while (i14 == 255);
                        i27 += i15;
                        i26++;
                    }
                    this.zzZ[i13] = ((i11 - this.zzab) - i28) - i27;
                } else {
                    if (i22 != 3) {
                        throw zzat.zzb("Unexpected lacing value: 2", null);
                    }
                    int i29 = 0;
                    int i30 = 0;
                    int i31 = 4;
                    while (true) {
                        int i32 = this.zzY - 1;
                        if (i29 >= i32) {
                            this.zzZ[i32] = ((i11 - this.zzab) - i31) - i30;
                            break;
                        }
                        this.zzZ[i29] = i20;
                        i31++;
                        zzt(zzaevVar, i31);
                        int i33 = i31 - 1;
                        if (zzerVar3.zzi()[i33] == 0) {
                            throw zzat.zzb("No valid varint length mask found", th2);
                        }
                        int i34 = i20;
                        while (true) {
                            if (i34 >= i21) {
                                j10 = 0;
                                break;
                            }
                            int i35 = i19 << (7 - i34);
                            if ((zzerVar3.zzi()[i33] & i35) != 0) {
                                int i36 = i31 + i34;
                                zzt(zzaevVar, i36);
                                j10 = (~i35) & zzerVar3.zzi()[i33] & 255;
                                int i37 = i33 + 1;
                                while (i37 < i36) {
                                    j10 = (j10 << 8) | ((long) (zzerVar3.zzi()[i37] & 255));
                                    i37++;
                                    i36 = i36;
                                }
                                int i38 = i36;
                                if (i29 > 0) {
                                    j10 -= (1 << ((i34 * 7) + 6)) - 1;
                                }
                                i31 = i38;
                                break;
                            }
                            i34++;
                            i19 = 1;
                            i21 = 8;
                        }
                        if (j10 < -2147483648L || j10 > 2147483647L) {
                            throw zzat.zzb("EBML lacing sample size out of range.", null);
                        }
                        int[] iArr2 = this.zzZ;
                        int i39 = (int) j10;
                        if (i29 != 0) {
                            i39 += iArr2[i29 - 1];
                        }
                        iArr2[i29] = i39;
                        i30 += i39;
                        i29++;
                        th2 = null;
                        i19 = 1;
                        i20 = 0;
                        i21 = 8;
                    }
                }
            }
            this.zzV = this.zzS + zzz((zzerVar3.zzi()[0] << 8) | (zzerVar3.zzi()[1] & 255));
            if (zzajgVar3.zze != 1) {
                if (i18 == 163) {
                    i16 = 2;
                    if ((zzerVar3.zzi()[2] & 128) == 128) {
                        i18 = 163;
                    } else {
                        i18 = 163;
                    }
                } else {
                    i16 = 2;
                }
                i17 = 0;
                this.zzac = i17;
                this.zzU = i16;
                this.zzX = 0;
                i12 = 163;
            } else {
                i16 = 2;
            }
            i17 = 1;
            this.zzac = i17;
            this.zzU = i16;
            this.zzX = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i18 == i12) {
            while (true) {
                int i40 = this.zzX;
                if (i40 >= this.zzY) {
                    this.zzU = 0;
                    return;
                }
                zzs(zzajgVar3, ((long) ((this.zzX * zzajgVar3.zzf) / 1000)) + this.zzV, this.zzac, zzu(zzaevVar, zzajgVar3, this.zzZ[i40], false), 0);
                this.zzX++;
            }
        } else {
            while (true) {
                int i41 = this.zzX;
                if (i41 >= this.zzY) {
                    return;
                }
                int[] iArr3 = this.zzZ;
                iArr3[i41] = zzu(zzaevVar, zzajgVar3, iArr3[i41], true);
                this.zzX++;
            }
        }
    }

    private static byte[] zzx(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) i10) * 3600000000L);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) i11) * 60000000);
        int i12 = (int) (j13 / 1000000);
        String str2 = String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11)));
        String str3 = zzfj.zza;
        return str2.getBytes(StandardCharsets.UTF_8);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    @CallSuper
    public final void zze(long j10, long j11) {
        this.zzS = -9223372036854775807L;
        int i10 = 0;
        this.zzU = 0;
        this.zzaq.zzb();
        this.zzh.zza();
        zzv();
        this.zzJ = false;
        this.zzK = -9223372036854775807L;
        this.zzL = -1;
        this.zzM = -1L;
        this.zzN = -1L;
        if (!this.zzF) {
            this.zzI.clear();
        }
        while (true) {
            SparseArray sparseArray = this.zzi;
            if (i10 < sparseArray.size()) {
                zzagi zzagiVar = ((zzajg) sparseArray.valueAt(i10)).zzU;
                if (zzagiVar != null) {
                    zzagiVar.zza();
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public zzajh(zzamd zzamdVar, int i10) {
        this(new zzaja(), 0, zzamdVar);
    }
}
