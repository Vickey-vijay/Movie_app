package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.ClientApi;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzfsa {
    public final ClientApi zza;
    public final Context zzb;
    public final int zzc;
    public final zzfkg zzd;
    public com.google.android.gms.ads.internal.client.zzft zze;

    @Nullable
    public final zzfqr zzf;
    public AtomicBoolean zzg;

    @Nullable
    public com.google.android.gms.ads.internal.client.zzch zzh;

    @Nullable
    private com.google.android.gms.ads.internal.client.zzce zzi;
    private final Queue zzj;
    private final zzfra zzk;
    private final String zzl;
    private AtomicBoolean zzm;
    private final ScheduledExecutorService zzn;
    private final zzfmy zzo;
    private AtomicBoolean zzp;
    private AtomicBoolean zzq;
    private zzfrf zzr;
    private final Clock zzs;
    private final zzfrm zzt;

    public zzfsa(ClientApi clientApi, Context context, int i10, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzce zzceVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock) {
        this("none", clientApi, context, i10, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, null);
        this.zzi = zzceVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzM, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzB(Object obj) {
        this.zzm.set(false);
        if (obj != null) {
            this.zzk.zza();
            this.zzq.set(true);
            zzP(obj);
        }
        if (obj == null || this.zzf == null) {
            zzQ(obj == null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzN, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzC(Throwable th2) {
        this.zzm.set(false);
        if ((th2 instanceof zzfqs) && ((zzfqs) th2).zza() == 0) {
            throw null;
        }
        zzQ(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzO, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzD(com.google.android.gms.ads.internal.client.zze zzeVar) {
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrt(this, zzeVar));
        }
        this.zzm.set(false);
        int i10 = zzeVar.zza;
        if (i10 != 1 && i10 != 8 && i10 != 10 && i10 != 11) {
            zzQ(true);
            return;
        }
        com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
        int i11 = zzftVar.zzb;
        String str = zzftVar.zza;
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 26 + String.valueOf(str).length() + 61);
        sb2.append("Preloading ");
        sb2.append(i11);
        sb2.append(", for adUnitId:");
        sb2.append(str);
        sb2.append(", Ad load failed. Stop preloading due to non-retriable error:");
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh(string);
        this.zzg.set(false);
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            zzfqrVar.zza(this);
        }
        zzfrl zzfrlVar = new zzfrl(this.zze.zza, zzo());
        zzfrlVar.zza(this.zzl);
        this.zzr.zzk(this.zzs.currentTimeMillis(), new zzfrm(zzfrlVar, null), zzeVar, this.zze.zzd, zzp(), zzH());
    }

    private final synchronized void zzP(Object obj) {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzc = zzc(obj);
        double dZzl = !(zzeaVarZzc instanceof zzday) ? 0.0d : ((zzday) zzeaVarZzc).zzl();
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzc2 = zzc(obj);
        int iZzm = zzeaVarZzc2 instanceof zzday ? ((zzday) zzeaVarZzc2).zzm() : 2;
        Clock clock = this.zzs;
        zzfro zzfroVar = new zzfro(obj, clock, dZzl, iZzm);
        this.zzj.add(zzfroVar);
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzc3 = zzc(obj);
        long jCurrentTimeMillis = clock.currentTimeMillis();
        if (this.zzp.get()) {
            com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfrr(this, zzeaVarZzc3));
        }
        ScheduledExecutorService scheduledExecutorService = this.zzn;
        scheduledExecutorService.execute(new zzfrs(this, jCurrentTimeMillis, zzeaVarZzc3));
        if (this.zzf != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
                this.zzo.zzb(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfry
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzA();
                    }
                }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                return;
            } else {
                scheduledExecutorService.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrx
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzz();
                    }
                }, zzfroVar.zzc(), TimeUnit.MILLISECONDS);
                return;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzE)).booleanValue()) {
            this.zzo.zzb(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
        } else {
            scheduledExecutorService.schedule(new zzfrq(this), zzfroVar.zzc(), TimeUnit.MILLISECONDS);
        }
    }

    private final synchronized void zzQ(boolean z10) {
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            if (z10) {
                this.zzk.zzc();
            }
            zzfqrVar.zza(this);
        } else {
            zzfra zzfraVar = this.zzk;
            if (zzfraVar.zze()) {
                return;
            }
            if (z10) {
                zzfraVar.zzc();
            }
            this.zzn.schedule(new zzfrq(this), zzfraVar.zzb(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzR, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final synchronized void zzz() {
        Iterator it = this.zzj.iterator();
        while (it.hasNext()) {
            if (((zzfro) it.next()).zzb()) {
                it.remove();
                zzfqr zzfqrVar = this.zzf;
                if (zzfqrVar != null) {
                    zzfqrVar.zza(this);
                } else {
                    continue;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzS, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzE(com.google.android.gms.ads.internal.client.zze zzeVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzg(this.zzl, zzeVar);
            } catch (RemoteException unused) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdFailedToPreload");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0026 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0026, please report this as an issue */
    /* JADX INFO: renamed from: zzT, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzF(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar == null) {
            zzchVar = this.zzh;
            if (zzchVar != null) {
                zzchVar.zze(this.zzl, zzeaVar);
                return;
            }
            return;
        }
        try {
            zzceVar.zze(this.zze);
        } catch (RemoteException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsAvailable");
        }
        zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zze(this.zzl, zzeaVar);
                return;
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdPreloaded");
                return;
            }
        }
        return;
        throw th;
    }

    private final synchronized void zzU() {
        if (this.zzq.get() && this.zzj.isEmpty()) {
            this.zzq.set(false);
            if (this.zzp.get()) {
                com.google.android.gms.ads.internal.util.zzs.zza.post(new zzfru(this));
            }
            this.zzn.execute(new zzfrv(this));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:16:0x0026 A[DONT_GENERATE] */
    /* JADX WARN: Code duplicated, block: B:21:0x0016 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:16:0x0026, please report this as an issue */
    /* JADX INFO: renamed from: zzV, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzG() {
        com.google.android.gms.ads.internal.client.zzch zzchVar;
        com.google.android.gms.ads.internal.client.zzce zzceVar = this.zzi;
        if (zzceVar == null) {
            zzchVar = this.zzh;
            if (zzchVar != null) {
                zzchVar.zzf(this.zzl);
                return;
            }
            return;
        }
        try {
            zzceVar.zzf(this.zze);
        } catch (RemoteException unused) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
        }
        zzchVar = this.zzh;
        if (zzchVar != null) {
            try {
                zzchVar.zzf(this.zzl);
                return;
            } catch (RemoteException unused2) {
                int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Failed to call onAdsExhausted");
                return;
            }
        }
        return;
        throw th;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzW, reason: merged with bridge method [inline-methods] */
    public final String zzH() {
        return true != "none".equals(this.zzl) ? "2" : "1";
    }

    public final /* synthetic */ zzfrf zzI() {
        return this.zzr;
    }

    public final /* synthetic */ Clock zzJ() {
        return this.zzs;
    }

    public final /* synthetic */ zzfrm zzK() {
        return this.zzt;
    }

    public abstract q5.i zza(Context context);

    public long zzb() {
        throw null;
    }

    @Nullable
    public abstract com.google.android.gms.ads.internal.client.zzea zzc(Object obj);

    public final synchronized zzfsa zzd() {
        this.zzn.submit(new zzfrq(this));
        return this;
    }

    public final synchronized void zze() {
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            this.zzn.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfrz
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzv();
                }
            });
        }
    }

    public final synchronized boolean zzf() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzK)).booleanValue()) {
            this.zzk.zza();
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzD)).booleanValue() && this.zzf == null) {
            zzu();
        } else {
            zzz();
        }
        return !this.zzj.isEmpty();
    }

    @Nullable
    public final synchronized Object zzg() {
        boolean z10 = true;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzN)).booleanValue()) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzL)).booleanValue() || this.zzj.size() == 1) {
                this.zzk.zza();
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzM)).booleanValue()) {
            zzz();
        }
        Queue queue = this.zzj;
        zzfro zzfroVar = (zzfro) queue.poll();
        AtomicBoolean atomicBoolean = this.zzq;
        if (zzfroVar == null) {
            z10 = false;
        }
        atomicBoolean.set(z10);
        if (zzfroVar == null) {
            zzfroVar = null;
        } else if (!queue.isEmpty()) {
            zzfro zzfroVar2 = (zzfro) queue.peek();
            AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
            String strZzX = zzX(zzc(zzfroVar.zza()));
            if (zzfroVar2 != null && adFormat != null && strZzX != null && zzfroVar2.zzd() < zzfroVar.zzd()) {
                this.zzr.zzg(this.zzs.currentTimeMillis(), this.zze.zzd, zzp(), strZzX, this.zzt, zzH());
            }
        }
        zzfqr zzfqrVar = this.zzf;
        if (zzfqrVar != null) {
            zzfqrVar.zzb(this);
        } else {
            long jZzy = zzy();
            if (jZzy > 0) {
                this.zzn.schedule(new zzfrq(this), jZzy, TimeUnit.MILLISECONDS);
            } else {
                zzu();
            }
        }
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    public final synchronized void zzj() {
        this.zzg.set(true);
        this.zzp.set(true);
        if (this.zzf == null) {
            this.zzn.submit(new zzfrq(this));
        }
    }

    @Nullable
    public final synchronized String zzk() {
        Object objZzs;
        objZzs = zzs();
        return zzX(objZzs == null ? null : zzc(objZzs));
    }

    public final void zzl(zzfrf zzfrfVar) {
        this.zzr = zzfrfVar;
    }

    public final synchronized void zzm(int i10) {
        Preconditions.checkArgument(i10 >= 5);
        this.zzk.zzf(i10);
    }

    public final String zzn() {
        return this.zzl;
    }

    public final synchronized int zzp() {
        return this.zzj.size();
    }

    public final synchronized void zzr() {
        this.zzj.clear();
    }

    @Nullable
    public final synchronized Object zzs() {
        zzfro zzfroVar = (zzfro) this.zzj.peek();
        if (zzfroVar == null) {
            return null;
        }
        return zzfroVar.zza();
    }

    public final synchronized void zzu() {
        zzz();
        zzU();
        if (!this.zzm.get() && this.zzg.get() && this.zzj.size() < this.zze.zzd) {
            this.zzm.set(true);
            zzv();
        }
    }

    public final synchronized void zzv() {
        q5.i iVarZza;
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            String strValueOf = String.valueOf(this.zze.zza);
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Empty activity context at preloading: ".concat(strValueOf));
            iVarZza = zza(this.zzb);
        } else {
            iVarZza = zza(activityZzd);
        }
        zzgzo.zzr(iVarZza, new zzfrp(this), this.zzn);
    }

    public final void zzw(int i10) {
        zzfqr zzfqrVar;
        Preconditions.checkArgument(i10 > 0);
        AdFormat adFormat = AdFormat.getAdFormat(this.zze.zzb);
        int i11 = this.zze.zzd;
        int size = this.zzj.size();
        synchronized (this) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = this.zze;
            this.zze = new com.google.android.gms.ads.internal.client.zzft(zzftVar.zza, zzftVar.zzb, zzftVar.zzc, i10 > 0 ? i10 : zzftVar.zzd);
            Queue queue = this.zzj;
            if (queue.size() > i10) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzx)).booleanValue()) {
                    ArrayList arrayList = new ArrayList();
                    for (int i12 = 0; i12 < i10; i12++) {
                        zzfro zzfroVar = (zzfro) queue.poll();
                        if (zzfroVar != null) {
                            arrayList.add(zzfroVar);
                        }
                    }
                    queue.clear();
                    queue.addAll(arrayList);
                    if (size > arrayList.size() && (zzfqrVar = this.zzf) != null) {
                        int size2 = size - arrayList.size();
                        if (arrayList.isEmpty()) {
                            size2--;
                        }
                        zzfqrVar.zzc(this, size2);
                    }
                }
            }
        }
        zzfrf zzfrfVar = this.zzr;
        if (zzfrfVar == null || adFormat == null) {
            return;
        }
        zzfrfVar.zzc(i11, i10, this.zzs.currentTimeMillis(), new zzfrm(new zzfrl(this.zze.zza, adFormat), null));
    }

    public zzfsa(String str, ClientApi clientApi, Context context, int i10, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @Nullable com.google.android.gms.ads.internal.client.zzch zzchVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        this(str, clientApi, context, i10, zzfkgVar, zzftVar, scheduledExecutorService, zzfmyVar, zzfraVar, clock, zzfqrVar);
        this.zzh = zzchVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    public static final String zzX(@Nullable com.google.android.gms.ads.internal.client.zzea zzeaVar) {
        if (zzeaVar instanceof zzday) {
            return ((zzday) zzeaVar).zzk();
        }
        return null;
    }

    public final void zzh() {
        this.zzg.set(false);
        this.zzp.set(false);
    }

    public final void zzi() {
        this.zzg.set(false);
    }

    @Nullable
    public final AdFormat zzo() {
        return AdFormat.getAdFormat(this.zze.zzb);
    }

    public final boolean zzq() {
        return this.zzg.get() && !this.zzm.get() && zzp() < this.zze.zzd && !this.zzk.zzd();
    }

    public final boolean zzt() {
        return this.zzm.get();
    }

    public final void zzx(com.google.android.gms.ads.internal.client.zzm zzmVar) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzC)).booleanValue()) {
            Bundle bundle = zzmVar.zzB;
            bundle.putInt("plcs", zzp());
            bundle.putInt("plbs", this.zze.zzd);
            bundle.putString("plid", this.zzl);
        }
    }

    private zzfsa(String str, ClientApi clientApi, Context context, int i10, zzfkg zzfkgVar, @NonNull com.google.android.gms.ads.internal.client.zzft zzftVar, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull zzfmy zzfmyVar, zzfra zzfraVar, Clock clock, @Nullable zzfqr zzfqrVar) {
        Queue priorityQueue;
        this.zzl = str;
        this.zza = clientApi;
        this.zzb = context;
        this.zzc = i10;
        this.zzd = zzfkgVar;
        this.zze = zzftVar;
        int iMax = Math.max(1, zzftVar.zzd);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzX)).booleanValue()) {
            priorityQueue = new zzfsd();
        } else {
            priorityQueue = new PriorityQueue(iMax, new Comparator() { // from class: com.google.android.gms.internal.ads.zzfrw
                @Override // java.util.Comparator
                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    zzfro zzfroVar = (zzfro) obj2;
                    zzfro zzfroVar2 = (zzfro) obj;
                    int iCompare = Double.compare(zzfroVar.zze(), zzfroVar2.zze());
                    return iCompare == 0 ? Long.compare(zzfroVar2.zzd(), zzfroVar.zzd()) : iCompare;
                }
            });
        }
        this.zzj = priorityQueue;
        this.zzg = new AtomicBoolean(true);
        this.zzm = new AtomicBoolean(false);
        this.zzn = scheduledExecutorService;
        this.zzo = zzfmyVar;
        this.zzk = zzfraVar;
        this.zzp = new AtomicBoolean(true);
        this.zzq = new AtomicBoolean(false);
        this.zzs = clock;
        zzfrl zzfrlVar = new zzfrl(zzftVar.zza, AdFormat.getAdFormat(this.zze.zzb));
        zzfrlVar.zza(str);
        this.zzt = new zzfrm(zzfrlVar, null);
        this.zzf = zzfqrVar;
    }

    public final long zzy() {
        long jZzb = zzb();
        if (jZzb < 0) {
            return ((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzP)).longValue();
        }
        return jZzb;
    }
}
