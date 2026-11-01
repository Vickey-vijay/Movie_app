package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdtk {
    private final com.google.android.gms.ads.internal.zza zzb;
    private final Context zzc;
    private final zzdxz zzd;
    private final Executor zze;
    private final zzazh zzf;
    private final VersionInfoParcel zzg;
    private final zzeiu zzi;
    private final zzfqk zzj;
    private final zzejf zzk;
    private final zzfjo zzl;
    private q5.i zzm;
    private final zzdsy zza = new zzdsy();
    private final zzboy zzh = new zzboy();

    public final synchronized void zza() {
        String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzeE);
        zzazh zzazhVar = this.zzf;
        com.google.android.gms.ads.internal.zza zzaVar = this.zzb;
        zzejf zzejfVar = this.zzk;
        q5.i iVarZzk = zzgzo.zzk(zzckb.zzb(this.zzc, this.zzg, str, zzazhVar, zzaVar, zzejfVar, this.zzl, this.zzd), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzdth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzcjl zzcjlVar = (zzcjl) obj;
                this.zza.zzi(zzcjlVar);
                return zzcjlVar;
            }
        }, this.zze);
        this.zzm = iVarZzk;
        zzcel.zza(iVarZzk, "NativeJavascriptExecutor.initializeEngine");
    }

    public final synchronized void zzb() {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return;
        }
        zzgzo.zzr(iVar, new zzdsz(this), this.zze);
        this.zzm = null;
    }

    public final synchronized q5.i zzc(final String str, final JSONObject jSONObject) {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return zzgzo.zza(null);
        }
        return zzgzo.zzj(iVar, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzdtg
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzj(str, jSONObject, (zzcjl) obj);
            }
        }, this.zze);
    }

    public final synchronized void zzd(String str, zzboh zzbohVar) {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return;
        }
        zzgzo.zzr(iVar, new zzdta(this, str, zzbohVar), this.zze);
    }

    public final synchronized void zze(String str, zzboh zzbohVar) {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return;
        }
        zzgzo.zzr(iVar, new zzdtb(this, str, zzbohVar), this.zze);
    }

    public final synchronized void zzf(String str, Map map) {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return;
        }
        zzgzo.zzr(iVar, new zzdtc(this, "sendMessageToNativeJs", map), this.zze);
    }

    public final synchronized void zzg(zzfir zzfirVar, zzfiu zzfiuVar, zzcrv zzcrvVar) {
        q5.i iVar = this.zzm;
        if (iVar == null) {
            return;
        }
        zzgzo.zzr(iVar, new zzdtd(this, zzfirVar, zzfiuVar, zzcrvVar), this.zze);
    }

    public final /* synthetic */ zzdsy zzk() {
        return this.zza;
    }

    public final /* synthetic */ zzdxz zzl() {
        return this.zzd;
    }

    public final /* synthetic */ zzeiu zzm() {
        return this.zzi;
    }

    public final /* synthetic */ zzfqk zzn() {
        return this.zzj;
    }

    public final void zzh(WeakReference weakReference, String str, zzboh zzbohVar) {
        zzd(str, new zzdtj(this, weakReference, str, zzbohVar, null));
    }

    public final /* synthetic */ zzcjl zzi(zzcjl zzcjlVar) {
        zzcjlVar.zzab("/result", this.zzh);
        zzclj zzcljVarZzP = zzcjlVar.zzP();
        com.google.android.gms.ads.internal.zzb zzbVar = new com.google.android.gms.ads.internal.zzb(this.zzc, null, null);
        zzeiu zzeiuVar = this.zzi;
        zzfqk zzfqkVar = this.zzj;
        zzdxz zzdxzVar = this.zzd;
        zzdsy zzdsyVar = this.zza;
        zzcljVarZzP.zzab(null, zzdsyVar, zzdsyVar, zzdsyVar, zzdsyVar, false, null, zzbVar, null, null, zzeiuVar, zzfqkVar, zzdxzVar, null, null, null, null, null, null, null, null, null);
        return zzcjlVar;
    }

    public final /* synthetic */ q5.i zzj(String str, JSONObject jSONObject, zzcjl zzcjlVar) {
        return this.zzh.zzc(zzcjlVar, str, jSONObject);
    }

    public zzdtk(zzdti zzdtiVar) {
        this.zzc = zzdtiVar.zzb();
        this.zze = zzdtiVar.zze();
        this.zzf = zzdtiVar.zzf();
        this.zzg = zzdtiVar.zzg();
        this.zzb = zzdtiVar.zza();
        this.zzi = zzdtiVar.zzd();
        this.zzj = zzdtiVar.zzh();
        this.zzd = zzdtiVar.zzc();
        this.zzk = zzdtiVar.zzi();
        this.zzl = zzdtiVar.zzj();
    }
}
