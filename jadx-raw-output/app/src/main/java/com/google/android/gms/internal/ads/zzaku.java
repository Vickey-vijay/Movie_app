package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaku implements zzafy {
    private final long zza;
    private final zzakv[] zzb;
    private final int zzc;

    public zzaku(long j10, zzakv[] zzakvVarArr, int i10) {
        this.zza = j10;
        this.zzb = zzakvVarArr;
        this.zzc = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzafy
    public final boolean zzb() {
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:27:0x0077 A[PHI: r10
  0x0077: PHI (r10v2 long) = (r10v1 long), (r10v4 long) binds: [B:23:0x0060, B:25:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x0091  */
    /* JADX WARN: Code duplicated, block: B:32:0x0098  */
    @Override // com.google.android.gms.internal.ads.zzafy
    public final zzafw zzc(long j10) {
        long j11;
        long j12;
        long j13;
        long j14;
        int i10;
        long jZzh;
        long jZzh2;
        zzalf zzalfVar;
        int iZzb;
        zzakv[] zzakvVarArr = this.zzb;
        if (zzakvVarArr.length == 0) {
            zzafz zzafzVar = zzafz.zza;
            return new zzafw(zzafzVar, zzafzVar);
        }
        int i11 = this.zzc;
        long j15 = -9223372036854775807L;
        if (i11 != -1) {
            zzalf zzalfVar2 = zzakvVarArr[i11].zzb;
            int iZzl = zzakw.zzl(zzalfVar2, j10);
            if (iZzl == -1) {
                zzafz zzafzVar2 = zzafz.zza;
                return new zzafw(zzafzVar2, zzafzVar2);
            }
            long[] jArr = zzalfVar2.zzf;
            j12 = jArr[iZzl];
            long[] jArr2 = zzalfVar2.zzc;
            j11 = jArr2[iZzl];
            if (j12 < j10 && iZzl < zzalfVar2.zzb - 1 && (iZzb = zzalfVar2.zzb(j10)) != -1 && iZzb != iZzl) {
                j13 = jArr[iZzb];
                j14 = jArr2[iZzb];
            }
            i10 = 0;
            jZzh = j11;
            jZzh2 = j14;
            while (i10 < zzakvVarArr.length) {
                if (i10 != i11) {
                    zzalfVar = zzakvVarArr[i10].zzb;
                    jZzh = zzakw.zzh(zzalfVar, j12, jZzh);
                    if (j13 != j15) {
                        jZzh2 = zzakw.zzh(zzalfVar, j13, jZzh2);
                    }
                }
                i10++;
                j15 = -9223372036854775807L;
            }
            long j16 = jZzh2;
            zzafz zzafzVar3 = new zzafz(j12, jZzh);
            return j13 == -9223372036854775807L ? new zzafw(zzafzVar3, zzafzVar3) : new zzafw(zzafzVar3, new zzafz(j13, j16));
        }
        j11 = Long.MAX_VALUE;
        j12 = j10;
        j13 = -9223372036854775807L;
        j14 = -1;
        i10 = 0;
        jZzh = j11;
        jZzh2 = j14;
        while (i10 < zzakvVarArr.length) {
            if (i10 != i11) {
                zzalfVar = zzakvVarArr[i10].zzb;
                jZzh = zzakw.zzh(zzalfVar, j12, jZzh);
                if (j13 != j15) {
                    jZzh2 = zzakw.zzh(zzalfVar, j13, jZzh2);
                }
            }
            i10++;
            j15 = -9223372036854775807L;
        }
        long j17 = jZzh2;
        zzafz zzafzVar4 = new zzafz(j12, jZzh);
        if (j13 == -9223372036854775807L) {
        }
    }
}
