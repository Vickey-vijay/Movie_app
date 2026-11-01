package com.google.android.gms.internal.ads;

import android.util.Range;
import androidx.annotation.FloatRange;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
final class zzact {
    private long zza;
    private long zzb;
    private double zzc;
    private Range zzd;

    public final long zzb(long j10) {
        long j11 = this.zza;
        if (j11 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return (long) (this.zzb + ((j10 - j11) * this.zzc));
    }

    public final void zzc(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        zzgrc.zza(f10 > 0.0f);
        this.zzd = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / ((double) f10)));
        zzd();
    }

    public final void zzd() {
        this.zzc = ((Double) this.zzd.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    public zzact(@FloatRange(from = 0.0d, fromInclusive = false) float f10) {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.zzd = range;
        this.zzc = ((Double) range.getUpper()).doubleValue();
        this.zza = -9223372036854775807L;
        this.zzb = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0032  */
    public final void zza(long j10, long j11) {
        boolean z10;
        double dDoubleValue;
        boolean z11 = true;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzgrc.zza(z10);
        if (j11 == -9223372036854775807L) {
            z11 = false;
        }
        zzgrc.zza(z11);
        long j12 = this.zza;
        if (j12 != -9223372036854775807L) {
            long j13 = this.zzb;
            if (j13 != -9223372036854775807L && j10 != j12) {
                dDoubleValue = (j11 - j13) / (j10 - j12);
            } else {
                dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
            }
        } else {
            dDoubleValue = ((Double) this.zzd.getUpper()).doubleValue();
        }
        this.zzc = (this.zzc * 0.800000011920929d) + (((Double) this.zzd.clamp(Double.valueOf(dDoubleValue))).doubleValue() * 0.20000000298023224d);
        this.zza = j10;
        this.zzb = j11;
    }
}
