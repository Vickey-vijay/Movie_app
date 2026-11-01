package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public final class zzfrj {
    private final zzfsb zzc;
    private final zzfrf zzd;
    private final Context zze;

    @Nullable
    private volatile ConnectivityManager zzf;
    private final Clock zzh;
    private AtomicInteger zzi;
    private final AtomicBoolean zzg = new AtomicBoolean(false);
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzk, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzi(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzy)).booleanValue()) {
            zzj(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzl, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzj(boolean z10) {
        try {
            if (z10) {
                Iterator it = this.zza.values().iterator();
                while (it.hasNext()) {
                    ((zzfsa) it.next()).zzj();
                }
            } else {
                Iterator it2 = this.zza.values().iterator();
                while (it2.hasNext()) {
                    ((zzfsa) it2.next()).zzi();
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f5 A[Catch: all -> 0x0104, TryCatch #0 {, blocks: (B:3:0x0001, B:4:0x000f, B:6:0x0015, B:8:0x0034, B:10:0x003c, B:11:0x0048, B:12:0x004e, B:14:0x0056, B:16:0x0064, B:17:0x0073, B:18:0x0077, B:19:0x007b, B:20:0x0085, B:22:0x008b, B:24:0x009d, B:25:0x00b2, B:26:0x00bc, B:28:0x00c2, B:30:0x00e3, B:33:0x00f8, B:35:0x00fe, B:32:0x00f5), top: B:42:0x0001 }] */
    private final synchronized List zzm(List list) {
        ArrayList arrayList;
        HashSet hashSet = new HashSet();
        arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.ads.internal.client.zzft zzftVar = (com.google.android.gms.ads.internal.client.zzft) it.next();
            String strZzh = zzh(zzftVar.zza, AdFormat.getAdFormat(zzftVar.zzb));
            hashSet.add(strZzh);
            ConcurrentMap concurrentMap = this.zza;
            zzfsa zzfsaVar = (zzfsa) concurrentMap.get(strZzh);
            if (zzfsaVar == null) {
                ConcurrentMap concurrentMap2 = this.zzb;
                if (concurrentMap2.containsKey(strZzh)) {
                    zzfsa zzfsaVar2 = (zzfsa) concurrentMap2.get(strZzh);
                    if (zzfsaVar2.zze.equals(zzftVar)) {
                        zzfsaVar2.zzw(zzftVar.zzd);
                        zzfsaVar2.zzj();
                        concurrentMap.put(strZzh, zzfsaVar2);
                        concurrentMap2.remove(strZzh);
                    } else {
                        arrayList.add(zzftVar);
                    }
                } else {
                    arrayList.add(zzftVar);
                }
            } else if (zzfsaVar.zze.equals(zzftVar)) {
                zzfsaVar.zzw(zzftVar.zzd);
            } else {
                this.zzb.put(strZzh, zzfsaVar);
                concurrentMap.remove(strZzh);
                arrayList.add(zzftVar);
            }
        }
        Iterator it2 = this.zza.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (!hashSet.contains((String) entry.getKey())) {
                this.zzb.put((String) entry.getKey(), (zzfsa) entry.getValue());
                it2.remove();
            }
        }
        Iterator it3 = this.zzb.entrySet().iterator();
        while (it3.hasNext()) {
            zzfsa zzfsaVar3 = (zzfsa) ((Map.Entry) it3.next()).getValue();
            zzfsaVar3.zzh();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzA)).booleanValue()) {
                zzfsaVar3.zzr();
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzB)).booleanValue()) {
                    zzfsaVar3.zzr();
                }
            }
            if (!zzfsaVar3.zzf()) {
                it3.remove();
            }
        }
        return arrayList;
    }

    private final synchronized void zzn(String str, zzfsa zzfsaVar) {
        zzfsaVar.zzd();
        this.zza.put(str, zzfsaVar);
    }

    private final synchronized boolean zzo(String str, AdFormat adFormat) {
        boolean z10;
        Clock clock = this.zzh;
        long jCurrentTimeMillis = clock.currentTimeMillis();
        zzfsa zzfsaVarZzq = zzq(str, adFormat);
        z10 = zzfsaVarZzq != null && zzfsaVarZzq.zzf();
        this.zzd.zzd(zzfsaVarZzq == null ? 0 : zzfsaVarZzq.zze.zzd, zzfsaVarZzq == null ? 0 : zzfsaVarZzq.zzp(), jCurrentTimeMillis, z10 ? Long.valueOf(clock.currentTimeMillis()) : null, zzfsaVarZzq == null ? null : zzfsaVarZzq.zzk(), new zzfrm(new zzfrl(str, adFormat), null), "1");
        return z10;
    }

    @Nullable
    private final synchronized Object zzp(Class cls, String str, AdFormat adFormat) {
        zzfrm zzfrmVar = new zzfrm(new zzfrl(str, adFormat), null);
        zzfrf zzfrfVar = this.zzd;
        Clock clock = this.zzh;
        zzfrfVar.zzf(clock.currentTimeMillis(), zzfrmVar, -1, -1, "1");
        zzfsa zzfsaVarZzq = zzq(str, adFormat);
        if (zzfsaVarZzq == null) {
            return null;
        }
        try {
            String strZzk = zzfsaVarZzq.zzk();
            Object objZzg = zzfsaVarZzq.zzg();
            Object objCast = objZzg == null ? null : cls.cast(objZzg);
            if (objCast != null) {
                zzfrfVar.zzh(clock.currentTimeMillis(), zzfsaVarZzq.zze.zzd, zzfsaVarZzq.zzp(), strZzk, zzfrmVar, "1");
            }
            return objCast;
        } catch (ClassCastException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(cls.getName()), e10);
            return null;
        }
    }

    @Nullable
    private final synchronized zzfsa zzq(String str, AdFormat adFormat) {
        return (zzfsa) this.zza.get(zzh(str, adFormat));
    }

    public final synchronized void zza(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        if (!this.zzg.getAndSet(true)) {
            if (this.zzf == null) {
                synchronized (this) {
                    if (this.zzf == null) {
                        try {
                            this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                        } catch (ClassCastException e10) {
                            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                            com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to get connectivity manager", e10);
                        }
                    }
                }
            }
            if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
                this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
            } else {
                try {
                    this.zzf.registerDefaultNetworkCallback(new zzfri(this));
                } catch (RuntimeException e11) {
                    int i11 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e11);
                    this.zzi = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzI)).intValue());
                }
            }
            com.google.android.gms.ads.internal.zzt.zzg().zzb(new zzfrh(this));
        }
        List<com.google.android.gms.ads.internal.client.zzft> listZzm = zzm(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzft zzftVar : listZzm) {
            String str = zzftVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzftVar.zzb);
            zzfsa zzfsaVarZza = this.zzc.zza(zzftVar, zzceVar);
            if (adFormat != null && zzfsaVarZza != null) {
                AtomicInteger atomicInteger = this.zzi;
                if (atomicInteger != null) {
                    zzfsaVarZza.zzm(atomicInteger.get());
                }
                zzfrf zzfrfVar = this.zzd;
                zzfsaVarZza.zzl(zzfrfVar);
                zzn(zzh(str, adFormat), zzfsaVarZza);
                enumMap.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat, 0)).intValue() + 1));
                zzfrfVar.zza(zzftVar.zzd, this.zzh.currentTimeMillis(), new zzfrm(new zzfrl(str, adFormat), null), "1");
            }
        }
        this.zzd.zzb(enumMap, this.zzh.currentTimeMillis(), "1");
    }

    public final synchronized boolean zzb(String str) {
        return zzo(str, AdFormat.REWARDED);
    }

    @Nullable
    public final synchronized zzcaz zzc(String str) {
        return (zzcaz) zzp(zzcaz.class, str, AdFormat.REWARDED);
    }

    public final synchronized boolean zzd(String str) {
        return zzo(str, AdFormat.APP_OPEN_AD);
    }

    @Nullable
    public final synchronized zzbex zze(String str) {
        return (zzbex) zzp(zzbex.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzf(String str) {
        return zzo(str, AdFormat.INTERSTITIAL);
    }

    @Nullable
    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzg(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzp(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    public static String zzh(String str, @Nullable AdFormat adFormat) {
        String strName = adFormat == null ? "NULL" : adFormat.name();
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(strName).length());
        sb2.append(str);
        sb2.append("#");
        sb2.append(strName);
        return sb2.toString();
    }

    public zzfrj(zzfsb zzfsbVar, zzfrf zzfrfVar, Context context, Clock clock) {
        this.zzc = zzfsbVar;
        this.zzd = zzfrfVar;
        this.zze = context;
        this.zzh = clock;
    }
}
