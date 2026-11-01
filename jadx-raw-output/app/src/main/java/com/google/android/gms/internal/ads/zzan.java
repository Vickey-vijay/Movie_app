package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzan {
    public static final zzan zza = new zzan(new zzam());

    @Nullable
    public final Integer zzA;
    public final zzguf zzB;

    @Nullable
    public final CharSequence zzb;

    @Nullable
    public final CharSequence zzc;

    @Nullable
    public final CharSequence zzd;

    @Nullable
    public final CharSequence zze;

    @Nullable
    public final CharSequence zzf;

    @Nullable
    public final byte[] zzg;

    @Nullable
    public final Integer zzh;

    @Nullable
    public final Integer zzi;

    @Nullable
    public final Integer zzj;

    @Nullable
    @Deprecated
    public final Integer zzk;

    @Nullable
    public final Boolean zzl;

    @Nullable
    @Deprecated
    public final Integer zzm;

    @Nullable
    public final Integer zzn;

    @Nullable
    public final Integer zzo;

    @Nullable
    public final Integer zzp;

    @Nullable
    public final Integer zzq;

    @Nullable
    public final Integer zzr;

    @Nullable
    public final Integer zzs;

    @Nullable
    public final CharSequence zzt;

    @Nullable
    public final CharSequence zzu;

    @Nullable
    public final CharSequence zzv;

    @Nullable
    public final Integer zzw;

    @Nullable
    public final Integer zzx;

    @Nullable
    public final CharSequence zzy;

    @Nullable
    public final CharSequence zzz;

    public /* synthetic */ zzan(zzam zzamVar, byte[] bArr) {
        this(zzamVar);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzan.class == obj.getClass()) {
            zzan zzanVar = (zzan) obj;
            if (Objects.equals(this.zzb, zzanVar.zzb) && Objects.equals(this.zzc, zzanVar.zzc) && Objects.equals(this.zzd, zzanVar.zzd) && Objects.equals(this.zze, zzanVar.zze) && Objects.equals(this.zzf, zzanVar.zzf) && Arrays.equals(this.zzg, zzanVar.zzg) && Objects.equals(this.zzh, zzanVar.zzh) && Objects.equals(this.zzi, zzanVar.zzi) && Objects.equals(this.zzj, zzanVar.zzj) && Objects.equals(this.zzk, zzanVar.zzk) && Objects.equals(this.zzl, zzanVar.zzl) && Objects.equals(this.zzn, zzanVar.zzn) && Objects.equals(this.zzo, zzanVar.zzo) && Objects.equals(this.zzp, zzanVar.zzp) && Objects.equals(this.zzq, zzanVar.zzq) && Objects.equals(this.zzr, zzanVar.zzr) && Objects.equals(this.zzs, zzanVar.zzs) && Objects.equals(this.zzt, zzanVar.zzt) && Objects.equals(this.zzu, zzanVar.zzu) && Objects.equals(this.zzv, zzanVar.zzv) && Objects.equals(this.zzw, zzanVar.zzw) && Objects.equals(this.zzx, zzanVar.zzx) && Objects.equals(this.zzy, zzanVar.zzy) && Objects.equals(this.zzz, zzanVar.zzz) && Objects.equals(this.zzA, zzanVar.zzA) && Objects.equals(this.zzB, zzanVar.zzB)) {
                return true;
            }
        }
        return false;
    }

    public final zzam zza() {
        return new zzam(this, null);
    }

    static {
        String str = zzfj.zza;
        Integer.toString(0, 36);
        Integer.toString(1, 36);
        Integer.toString(2, 36);
        Integer.toString(3, 36);
        Integer.toString(4, 36);
        Integer.toString(5, 36);
        Integer.toString(6, 36);
        Integer.toString(8, 36);
        Integer.toString(9, 36);
        Integer.toString(10, 36);
        Integer.toString(11, 36);
        Integer.toString(12, 36);
        Integer.toString(13, 36);
        Integer.toString(14, 36);
        Integer.toString(15, 36);
        Integer.toString(16, 36);
        Integer.toString(17, 36);
        Integer.toString(18, 36);
        Integer.toString(19, 36);
        Integer.toString(20, 36);
        Integer.toString(21, 36);
        Integer.toString(22, 36);
        Integer.toString(23, 36);
        Integer.toString(24, 36);
        Integer.toString(25, 36);
        Integer.toString(26, 36);
        Integer.toString(27, 36);
        Integer.toString(28, 36);
        Integer.toString(29, 36);
        Integer.toString(30, 36);
        Integer.toString(31, 36);
        Integer.toString(32, 36);
        Integer.toString(33, 36);
        Integer.toString(34, 36);
        Integer.toString(1000, 36);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, this.zzc, this.zzd, this.zze, null, null, this.zzf, null, null, null, Integer.valueOf(Arrays.hashCode(this.zzg)), this.zzh, null, this.zzi, this.zzj, this.zzk, this.zzl, null, this.zzn, this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, this.zzv, this.zzw, this.zzx, this.zzy, null, this.zzz, this.zzA, Boolean.TRUE, this.zzB);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    private zzan(zzam zzamVar) {
        Boolean boolZzH = zzamVar.zzH();
        Integer numZzV = zzamVar.zzV();
        Integer numZzG = zzamVar.zzG();
        int i10 = 1;
        int i11 = 0;
        if (boolZzH != null) {
            if (!boolZzH.booleanValue()) {
                numZzG = -1;
            } else if (numZzG == null || numZzG.intValue() == -1) {
                if (numZzV != null) {
                    switch (numZzV.intValue()) {
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
                            break;
                        case 20:
                        default:
                            i10 = 0;
                            break;
                        case 21:
                            i10 = 2;
                            break;
                        case 22:
                            i10 = 3;
                            break;
                        case 23:
                            i10 = 4;
                            break;
                        case 24:
                            i10 = 5;
                            break;
                        case 25:
                            i10 = 6;
                            break;
                    }
                } else {
                    i10 = 0;
                }
                numZzG = Integer.valueOf(i10);
            }
        } else if (numZzG != null) {
            boolZzH = Boolean.valueOf(numZzG.intValue() != -1);
            if (boolZzH.booleanValue() && numZzV == null) {
                switch (numZzG.intValue()) {
                    case 1:
                        break;
                    case 2:
                        i11 = 21;
                        break;
                    case 3:
                        i11 = 22;
                        break;
                    case 4:
                        i11 = 23;
                        break;
                    case 5:
                        i11 = 24;
                        break;
                    case 6:
                        i11 = 25;
                        break;
                    default:
                        i11 = 20;
                        break;
                }
                numZzV = Integer.valueOf(i11);
            }
        } else {
            numZzG = null;
        }
        this.zzb = zzamVar.zzx();
        this.zzc = zzamVar.zzy();
        this.zzd = zzamVar.zzz();
        this.zze = zzamVar.zzA();
        this.zzf = zzamVar.zzB();
        this.zzg = zzamVar.zzC();
        this.zzh = zzamVar.zzD();
        this.zzi = zzamVar.zzE();
        this.zzj = zzamVar.zzF();
        this.zzk = numZzG;
        this.zzl = boolZzH;
        this.zzm = zzamVar.zzI();
        this.zzn = zzamVar.zzI();
        this.zzo = zzamVar.zzJ();
        this.zzp = zzamVar.zzK();
        this.zzq = zzamVar.zzL();
        this.zzr = zzamVar.zzM();
        this.zzs = zzamVar.zzN();
        this.zzt = zzamVar.zzO();
        this.zzu = zzamVar.zzP();
        this.zzv = zzamVar.zzQ();
        this.zzw = zzamVar.zzR();
        this.zzx = zzamVar.zzS();
        this.zzy = zzamVar.zzT();
        this.zzz = zzamVar.zzU();
        this.zzA = numZzV;
        this.zzB = zzamVar.zzW();
    }
}
