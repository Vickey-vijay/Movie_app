package com.google.android.gms.internal.ads;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzfbw implements zzfax {
    private final Context zza;
    private final ScheduledExecutorService zzb;
    private final Executor zzc;
    private final int zzd;
    private final boolean zze;
    private final boolean zzf;
    private final zzcdm zzg;

    public zzfbw(zzcdm zzcdmVar, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i10, boolean z10, boolean z11) {
        this.zzg = zzcdmVar;
        this.zza = context;
        this.zzb = scheduledExecutorService;
        this.zzc = executor;
        this.zzd = i10;
        this.zze = z10;
        this.zzf = z11;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 40;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        zzgzg zzgzgVarZzw = zzgzg.zzw(this.zzg.zza(this.zza, this.zzd));
        zzgqt zzgqtVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbv
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((AdvertisingIdClient.Info) obj);
            }
        };
        Executor executor = this.zzc;
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzi((zzgzg) zzgzo.zzk(zzgzgVarZzw, zzgqtVar, executor), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbC)).longValue(), TimeUnit.MILLISECONDS, this.zzb), Throwable.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzfbu
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((Throwable) obj);
            }
        }, executor);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final /* synthetic */ zzfbx zzc(AdvertisingIdClient.Info info) {
        zzgah zzgahVar = new zzgah();
        if (this.zze) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdX)).booleanValue()) {
                Context context = this.zza;
                zzgal zzgalVarZzh = zzgal.zzh(context);
                Objects.requireNonNull(info);
                String id2 = info.getId();
                Objects.requireNonNull(id2);
                zzgahVar = zzgalVarZzh.zzj(id2, context.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), this.zzf);
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdW)).booleanValue()) {
                try {
                    Context context2 = this.zza;
                    zzgal zzgalVarZzh2 = zzgal.zzh(context2);
                    Objects.requireNonNull(info);
                    String id3 = info.getId();
                    Objects.requireNonNull(id3);
                    zzgahVar = zzgalVarZzh2.zzj(id3, context2.getPackageName(), ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzec)).longValue(), this.zzf);
                } catch (IOException | IllegalArgumentException e10) {
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdIdInfoSignalSource.getPaidV1");
                    zzgahVar = new zzgah();
                }
            }
        }
        return new zzfbx(info, null, zzgahVar);
    }

    public final /* synthetic */ zzfbx zzd(Throwable th2) {
        String string;
        com.google.android.gms.ads.internal.client.zzbb.zza();
        ContentResolver contentResolver = this.zza.getContentResolver();
        if (contentResolver == null) {
            string = null;
        } else {
            string = Settings.Secure.getString(contentResolver, "android_id");
        }
        return new zzfbx(null, string, new zzgah());
    }
}
