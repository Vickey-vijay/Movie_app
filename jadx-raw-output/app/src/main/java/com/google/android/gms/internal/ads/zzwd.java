package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzwd extends zzvy {
    public static final Object zzc = new Object();

    @Nullable
    private final Object zzd;

    @Nullable
    private final Object zze;

    public static zzwd zzq(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        return new zzwd(zzbfVar, obj, obj2);
    }

    public final zzwd zzr(zzbf zzbfVar) {
        return new zzwd(zzbfVar, this.zzd, this.zze);
    }

    public final /* synthetic */ Object zzs() {
        return this.zze;
    }

    public static zzwd zzp(zzak zzakVar) {
        return new zzwd(new zzwe(zzakVar), zzbe.zza, zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbe zzb(int i10, zzbe zzbeVar, long j10) {
        this.zzb.zzb(i10, zzbeVar, j10);
        if (Objects.equals(zzbeVar.zzb, this.zzd)) {
            zzbeVar.zzb = zzbe.zza;
        }
        return zzbeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final zzbd zzd(int i10, zzbd zzbdVar, boolean z10) {
        this.zzb.zzd(i10, zzbdVar, z10);
        if (Objects.equals(zzbdVar.zzb, this.zze) && z10) {
            zzbdVar.zzb = zzc;
        }
        return zzbdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final int zze(Object obj) {
        Object obj2;
        if (zzc.equals(obj) && (obj2 = this.zze) != null) {
            obj = obj2;
        }
        return this.zzb.zze(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzvy, com.google.android.gms.internal.ads.zzbf
    public final Object zzf(int i10) {
        Object objZzf = this.zzb.zzf(i10);
        return Objects.equals(objZzf, this.zze) ? zzc : objZzf;
    }

    private zzwd(zzbf zzbfVar, @Nullable Object obj, @Nullable Object obj2) {
        super(zzbfVar);
        this.zzd = obj;
        this.zze = obj2;
    }
}
