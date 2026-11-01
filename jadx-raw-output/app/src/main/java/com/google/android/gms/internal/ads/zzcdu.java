package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
public final class zzcdu {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcdz zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;

    @Nullable
    private zzbhj zzh;

    @Nullable
    private zzdxz zzi;

    @Nullable
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzcdt zzm;
    private final Object zzn;

    @GuardedBy("grantedPermissionLock")
    private q5.i zzo;
    private final AtomicBoolean zzp;

    public final /* synthetic */ VersionInfoParcel zzA() {
        return this.zzf;
    }

    public final /* synthetic */ zzbhj zzB() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzC() {
        return this.zzp;
    }

    @Nullable
    public final Context zzp() {
        return this.zze;
    }

    public final zzcdz zzr() {
        return this.zzc;
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdxz zzv() {
        return this.zzi;
    }

    public final /* synthetic */ Object zzy() {
        return this.zza;
    }

    public final /* synthetic */ Context zzz() {
        return this.zze;
    }

    @Nullable
    public final zzbhj zza() {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            zzbhjVar = this.zzh;
        }
        return zzbhjVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, @Nullable zzdxz zzdxzVar) {
        zzbhj zzbhjVar;
        synchronized (this.zza) {
            if (!this.zzd) {
                this.zze = context.getApplicationContext();
                this.zzf = versionInfoParcel;
                com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                this.zzb.zza(this.zze);
                zzbyp.zzb(this.zze, this.zzf);
                this.zzi = zzdxzVar;
                com.google.android.gms.ads.internal.zzt.zzm();
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcD)).booleanValue()) {
                    zzbhjVar = new zzbhj();
                } else {
                    com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    zzbhjVar = null;
                }
                this.zzh = zzbhjVar;
                if (zzbhjVar != null) {
                    zzcel.zza(new zzcdq(this).zzb(), "AppState.registerCsiReporter");
                }
                Context context2 = this.zze;
                if (PlatformVersion.isAtLeastO()) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjJ)).booleanValue()) {
                        try {
                            ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzcdr(this));
                        } catch (RuntimeException e10) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e10);
                            this.zzp.set(true);
                        }
                    }
                }
                this.zzd = true;
                zzq();
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzpr)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    @Nullable
    public final Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmq)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e10);
            return null;
        }
    }

    public final void zzg(Throwable th2, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzh(Throwable th2, String str) {
        zzbyp.zzb(this.zze, this.zzf).zzi(th2, str, ((Double) zzbjn.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th2, String str) {
        zzbyp.zzd(this.zze, this.zzf).zzh(th2, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final q5.i zzq() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdJ)).booleanValue()) {
                synchronized (this.zzn) {
                    q5.i iVar = this.zzo;
                    if (iVar != null) {
                        return iVar;
                    }
                    q5.i iVarSubmit = zzcei.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzcds
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzx();
                        }
                    });
                    this.zzo = iVarSubmit;
                    return iVarSubmit;
                }
            }
        }
        return zzgzo.zza(new ArrayList());
    }

    @Nullable
    public final ActivityManager.MemoryInfo zzw() {
        return com.google.android.gms.ads.internal.util.client.zzf.zze(this.zze);
    }

    public final /* synthetic */ ArrayList zzx() {
        Context contextZza = zzcae.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i10 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i10 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i10] & 2) != 0) {
                        arrayList.add(strArr[i10]);
                    }
                    i10++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public zzcdu() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcdz(com.google.android.gms.ads.internal.client.zzbb.zzf(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzcdt(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final boolean zzs(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjJ)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        return false;
    }
}
