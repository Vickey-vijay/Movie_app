package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import java.util.Iterator;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfog implements zzfoe {
    private final Context zza;
    private final int zzp;
    private long zzb = 0;
    private long zzc = -1;
    private boolean zzd = false;
    private int zzq = 2;
    private int zzr = 2;
    private int zze = 0;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private zzfot zzj = zzfot.SCAR_REQUEST_TYPE_UNSPECIFIED;
    private String zzk = "";
    private String zzl = "";
    private String zzm = "";
    private boolean zzn = false;
    private boolean zzo = false;

    public final /* synthetic */ long zzA() {
        return this.zzb;
    }

    public final /* synthetic */ long zzB() {
        return this.zzc;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzd;
    }

    public final /* synthetic */ int zzD() {
        return this.zze;
    }

    public final /* synthetic */ String zzE() {
        return this.zzf;
    }

    public final /* synthetic */ String zzF() {
        return this.zzg;
    }

    public final /* synthetic */ String zzG() {
        return this.zzh;
    }

    public final /* synthetic */ String zzH() {
        return this.zzi;
    }

    public final /* synthetic */ zzfot zzI() {
        return this.zzj;
    }

    public final /* synthetic */ String zzJ() {
        return this.zzk;
    }

    public final /* synthetic */ String zzK() {
        return this.zzl;
    }

    public final /* synthetic */ String zzL() {
        return this.zzm;
    }

    public final synchronized zzfog zzM(int i10) {
        this.zzq = i10;
        return this;
    }

    public final /* synthetic */ int zzN() {
        return this.zzp;
    }

    public final /* synthetic */ int zzO() {
        return this.zzq;
    }

    public final /* synthetic */ int zzP() {
        return this.zzr;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final synchronized boolean zzb() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    @Nullable
    public final synchronized zzfoh zzm() {
        if (this.zzn) {
            return null;
        }
        this.zzn = true;
        if (!this.zzo) {
            zzq();
        }
        if (this.zzc < 0) {
            zzr();
        }
        return new zzfoh(this, null);
    }

    public final synchronized zzfog zzq() {
        Configuration configuration;
        com.google.android.gms.ads.internal.util.zzz zzzVarZzf = com.google.android.gms.ads.internal.zzt.zzf();
        Context context = this.zza;
        this.zze = zzzVarZzf.zzm(context);
        Resources resources = context.getResources();
        int i10 = 2;
        if (resources != null && (configuration = resources.getConfiguration()) != null) {
            i10 = configuration.orientation == 2 ? 4 : 3;
        }
        this.zzr = i10;
        this.zzb = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        this.zzo = true;
        return this;
    }

    public final synchronized zzfog zzr() {
        this.zzc = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
        return this;
    }

    public final synchronized zzfog zzs(boolean z10) {
        this.zzd = z10;
        return this;
    }

    public final synchronized zzfog zzt(String str) {
        this.zzi = str;
        return this;
    }

    public final synchronized zzfog zzu(zzfot zzfotVar) {
        this.zzj = zzfotVar;
        return this;
    }

    public final synchronized zzfog zzv(zzfjb zzfjbVar) {
        String str = zzfjbVar.zzb.zzb;
        if (!TextUtils.isEmpty(str)) {
            this.zzf = str;
        }
        Iterator it = zzfjbVar.zza.iterator();
        while (it.hasNext()) {
            String str2 = ((zzfir) it.next()).zzab;
            if (!TextUtils.isEmpty(str2)) {
                this.zzg = str2;
                break;
            }
        }
        return this;
    }

    public final synchronized zzfog zzw(com.google.android.gms.ads.internal.client.zze zzeVar) {
        IBinder iBinder = zzeVar.zze;
        if (iBinder != null) {
            zzday zzdayVar = (zzday) iBinder;
            String strZzk = zzdayVar.zzk();
            if (!TextUtils.isEmpty(strZzk)) {
                this.zzf = strZzk;
            }
            String strZzf = zzdayVar.zzf();
            if (!TextUtils.isEmpty(strZzf)) {
                this.zzg = strZzf;
            }
        }
        return this;
    }

    public final synchronized zzfog zzx(String str) {
        this.zzh = str;
        return this;
    }

    public final synchronized zzfog zzy(Throwable th2) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzl = zzbyp.zzf(th2);
            this.zzk = (String) zzgrr.zza(zzgqq.zzc('\n')).zzd(zzbyp.zze(th2)).iterator().next();
        }
        return this;
    }

    public final synchronized zzfog zzz(String str) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkf)).booleanValue()) {
            this.zzm = str;
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final boolean zzl() {
        return !TextUtils.isEmpty(this.zzh);
    }

    public zzfog(Context context, int i10) {
        this.zza = context;
        this.zzp = i10;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zza() {
        zzq();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzc() {
        zzr();
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzd(boolean z10) {
        zzs(z10);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zze(String str) {
        zzt(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzf(zzfot zzfotVar) {
        zzu(zzfotVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzg(zzfjb zzfjbVar) {
        zzv(zzfjbVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzh(com.google.android.gms.ads.internal.client.zze zzeVar) {
        zzw(zzeVar);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzi(String str) {
        zzx(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzj(Throwable th2) {
        zzy(th2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzk(String str) {
        zzz(str);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfoe
    public final /* bridge */ /* synthetic */ zzfoe zzp(int i10) {
        zzM(i10);
        return this;
    }
}
