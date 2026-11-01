package com.google.android.gms.internal.ads;

import android.os.Binder;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzefr {
    private final zzgzy zza;
    private final zzeew zzb;
    private final zzika zzc;

    public zzefr(zzgzy zzgzyVar, zzeew zzeewVar, zzika zzikaVar) {
        this.zza = zzgzyVar;
        this.zzb = zzeewVar;
        this.zzc = zzikaVar;
    }

    private final q5.i zzg(final zzbzu zzbzuVar, zzefh zzefhVar, final zzefh zzefhVar2, final zzgyw zzgywVar) {
        q5.i iVarZzh;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            iVarZzh = zzgzo.zzc(new zzeff(1));
        } else {
            iVarZzh = zzgzo.zzh(zzefhVar.zza(zzbzuVar), ExecutionException.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefq
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ q5.i zza(Object obj) {
                    Throwable cause = (ExecutionException) obj;
                    if (cause.getCause() != null) {
                        cause = cause.getCause();
                    }
                    return zzgzo.zzc(cause);
                }
            }, this.zza);
        }
        zzgzy zzgzyVar = this.zza;
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzj(zzgzg.zzw(iVarZzh), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return zzgzo.zza(((zzefg) obj).zza());
            }
        }, zzgzyVar), zzgywVar, zzgzyVar), zzeff.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefk
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzc(zzefhVar2, zzbzuVar, zzgywVar, (zzeff) obj);
            }
        }, zzgzyVar);
    }

    public final q5.i zza(final zzbzu zzbzuVar) {
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefl
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                String str = new String(zzgxf.zza((InputStream) obj), StandardCharsets.UTF_8);
                zzbzu zzbzuVar2 = zzbzuVar;
                zzbzuVar2.zzj = str;
                return zzgzo.zza(zzbzuVar2);
            }
        };
        final zzeew zzeewVar = this.zzb;
        Objects.requireNonNull(zzeewVar);
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefi
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ q5.i zza(zzbzu zzbzuVar2) {
                return zzeewVar.zza(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefm
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ q5.i zza(zzbzu zzbzuVar2) {
                return this.zza.zzd(zzbzuVar2);
            }
        }, zzgywVar);
    }

    public final q5.i zzb(zzbzu zzbzuVar) {
        return zzg(zzbzuVar, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefo
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ q5.i zza(zzbzu zzbzuVar2) {
                return this.zza.zze(zzbzuVar2);
            }
        }, new zzefh() { // from class: com.google.android.gms.internal.ads.zzefp
            @Override // com.google.android.gms.internal.ads.zzefh
            public final /* synthetic */ q5.i zza(zzbzu zzbzuVar2) {
                return this.zza.zzf(zzbzuVar2);
            }
        }, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzefn
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return zzgzo.zza(null);
            }
        });
    }

    public final /* synthetic */ q5.i zzc(zzefh zzefhVar, zzbzu zzbzuVar, zzgyw zzgywVar, zzeff zzeffVar) {
        return zzgzo.zzj(zzefhVar.zza(zzbzuVar), zzgywVar, this.zza);
    }

    public final /* synthetic */ q5.i zzd(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzc(zzbzuVar, Binder.getCallingUid());
    }

    public final /* synthetic */ q5.i zze(zzbzu zzbzuVar) {
        return this.zzb.zzd(zzbzuVar.zzh);
    }

    public final /* synthetic */ q5.i zzf(zzbzu zzbzuVar) {
        return ((zzegw) this.zzc.zzb()).zzd(zzbzuVar.zzh);
    }
}
