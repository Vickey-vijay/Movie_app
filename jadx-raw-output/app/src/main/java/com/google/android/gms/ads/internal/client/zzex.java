package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdInspectorError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnAdInspectorClosedListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.preload.PreloadCallback;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbjc;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbqo;
import com.google.android.gms.internal.ads.zzbqp;
import com.google.android.gms.internal.ads.zzbtp;
import com.google.android.gms.internal.ads.zzgrt;
import com.ironsource.mediationsdk.metadata.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class zzex {
    public static final Set zza = new HashSet(Arrays.asList(AdFormat.APP_OPEN_AD, AdFormat.INTERSTITIAL, AdFormat.REWARDED));
    private static zzex zze;

    @Nullable
    private zzep zzb;

    @Nullable
    private zzfb zzc;

    @Nullable
    private zzeo zzd;

    @Nullable
    private zzdb zzl;
    private final Object zzf = new Object();
    private final Object zzg = new Object();
    private boolean zzi = false;
    private boolean zzj = false;
    private final Object zzk = new Object();

    @Nullable
    private OnAdInspectorClosedListener zzm = null;

    @NonNull
    private RequestConfiguration zzn = new RequestConfiguration.Builder().build();
    private final ArrayList zzh = new ArrayList();

    public final /* synthetic */ OnAdInspectorClosedListener zzA() {
        return this.zzm;
    }

    public final void zzf(float f10) {
        boolean z10 = true;
        Preconditions.checkArgument(f10 >= 0.0f && f10 <= 1.0f, "The app volume must be a value between 0 and 1 inclusive.");
        synchronized (this.zzk) {
            if (this.zzl == null) {
                z10 = false;
            }
            Preconditions.checkState(z10, "MobileAds.initialize() must be called prior to setting the app volume.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzf(f10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app volume.", e10);
            }
        }
    }

    @NonNull
    public final RequestConfiguration zzp() {
        return this.zzn;
    }

    public final /* synthetic */ Object zzw() {
        return this.zzf;
    }

    public final /* synthetic */ ArrayList zzx() {
        return this.zzh;
    }

    public final /* synthetic */ void zzy(boolean z10) {
        this.zzi = false;
    }

    public final /* synthetic */ void zzz(boolean z10) {
        this.zzj = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InitializationStatus zzB(List list) {
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzbqg zzbqgVar = (zzbqg) it.next();
            map.put(zzbqgVar.zza, new zzbqo(zzbqgVar.zzb ? AdapterStatus.State.READY : AdapterStatus.State.NOT_READY, zzbqgVar.zzd, zzbqgVar.zzc));
        }
        return new zzbqp(map);
    }

    private final void zzC(@NonNull RequestConfiguration requestConfiguration) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zzr(new zzfv(requestConfiguration));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set request configuration parcel.", e10);
        }
    }

    private final void zzD(Context context) {
        if (this.zzl == null) {
            this.zzl = (zzdb) new zzau(zzbb.zzb(), context).zzd(context, false);
        }
    }

    private final void zzE(@Nullable String str) {
        zzdb zzdbVar = this.zzl;
        if (zzdbVar == null) {
            return;
        }
        try {
            zzdbVar.zze();
            this.zzl.zzj(null, ObjectWrapper.wrap(null));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
        }
    }

    public static zzex zzb() {
        zzex zzexVar;
        synchronized (zzex.class) {
            if (zze == null) {
                zze = new zzex();
            }
            zzexVar = zze;
        }
        return zzexVar;
    }

    @Nullable
    public final com.google.android.gms.ads.preload.zzb zza(AdFormat adFormat) {
        AdFormat adFormat2 = AdFormat.BANNER;
        int iOrdinal = adFormat.ordinal();
        if (iOrdinal == 1) {
            return this.zzb;
        }
        if (iOrdinal == 2) {
            return this.zzc;
        }
        if (iOrdinal != 5) {
            return null;
        }
        return this.zzd;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x009c A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:24:0x0030, B:26:0x0037, B:27:0x0049, B:29:0x0052, B:37:0x0069, B:39:0x007a, B:41:0x008c, B:48:0x00cf, B:49:0x00e4, B:42:0x009c, B:44:0x00aa, B:46:0x00bc, B:47:0x00c7, B:31:0x005a, B:36:0x0064), top: B:58:0x0030, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00aa A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:24:0x0030, B:26:0x0037, B:27:0x0049, B:29:0x0052, B:37:0x0069, B:39:0x007a, B:41:0x008c, B:48:0x00cf, B:49:0x00e4, B:42:0x009c, B:44:0x00aa, B:46:0x00bc, B:47:0x00c7, B:31:0x005a, B:36:0x0064), top: B:58:0x0030, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00bc A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:24:0x0030, B:26:0x0037, B:27:0x0049, B:29:0x0052, B:37:0x0069, B:39:0x007a, B:41:0x008c, B:48:0x00cf, B:49:0x00e4, B:42:0x009c, B:44:0x00aa, B:46:0x00bc, B:47:0x00c7, B:31:0x005a, B:36:0x0064), top: B:58:0x0030, inners: #2 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00c7 A[Catch: all -> 0x0060, TryCatch #0 {, blocks: (B:24:0x0030, B:26:0x0037, B:27:0x0049, B:29:0x0052, B:37:0x0069, B:39:0x007a, B:41:0x008c, B:48:0x00cf, B:49:0x00e4, B:42:0x009c, B:44:0x00aa, B:46:0x00bc, B:47:0x00c7, B:31:0x005a, B:36:0x0064), top: B:58:0x0030, inners: #2 }] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzc(Context context, @Nullable String str, @Nullable OnInitializationCompleteListener onInitializationCompleteListener) {
        synchronized (this.zzf) {
            if (this.zzi) {
                if (onInitializationCompleteListener != null) {
                    this.zzh.add(onInitializationCompleteListener);
                }
                return;
            }
            if (this.zzj) {
                if (onInitializationCompleteListener != null) {
                    onInitializationCompleteListener.onInitializationComplete(zzl());
                }
                return;
            }
            this.zzi = true;
            if (onInitializationCompleteListener != null) {
                this.zzh.add(onInitializationCompleteListener);
            }
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null.");
            }
            synchronized (this.zzk) {
                byte[] bArr = null;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                try {
                    zzD(context);
                    zzdb zzdbVar = this.zzl;
                    if (zzdbVar != null) {
                        zzdbVar.zzp(new zzew(this, bArr));
                        this.zzl.zzo(new zzbtp());
                    }
                    if (this.zzn.getTagForChildDirectedTreatment() != -1 || this.zzn.getTagForUnderAgeOfConsent() != -1) {
                        zzC(this.zzn);
                    }
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzj("MobileAdsSettingManager initialization failed", e10);
                }
                zzbhe.zza(context);
                if (((Boolean) zzbjc.zza.zze()).booleanValue()) {
                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmE)).booleanValue()) {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on bg thread");
                        ThreadPoolExecutor threadPoolExecutor = com.google.android.gms.ads.internal.util.client.zzb.zza;
                        final Object[] objArr3 = objArr2 == true ? 1 : 0;
                        threadPoolExecutor.execute(new Runnable(objArr3) { // from class: com.google.android.gms.ads.internal.client.zzeu
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzt(null);
                            }
                        });
                    } else if (((Boolean) zzbjc.zzb.zze()).booleanValue()) {
                        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmE)).booleanValue()) {
                            ExecutorService executorService = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                            final Object[] objArr4 = objArr == true ? 1 : 0;
                            executorService.execute(new Runnable(objArr4) { // from class: com.google.android.gms.ads.internal.client.zzes
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzu(null);
                                }
                            });
                        } else {
                            com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                            zzE(null);
                        }
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                        zzE(null);
                    }
                } else if (((Boolean) zzbjc.zzb.zze()).booleanValue()) {
                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzmE)).booleanValue()) {
                        ExecutorService executorService2 = com.google.android.gms.ads.internal.util.client.zzb.zzb;
                        final String objArr5 = objArr == true ? 1 : 0;
                        executorService2.execute(new Runnable(objArr5) { // from class: com.google.android.gms.ads.internal.client.zzes
                            @Override // java.lang.Runnable
                            public final /* synthetic */ void run() {
                                this.zza.zzu(null);
                            }
                        });
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                        zzE(null);
                    }
                } else {
                    com.google.android.gms.ads.internal.util.client.zzo.zzd("Initializing on calling thread");
                    zzE(null);
                }
                this.zzb = new zzep(context);
                this.zzc = new zzfb(context);
                this.zzd = new zzeo(context);
            }
        }
    }

    public final void zzd() {
        synchronized (this.zzf) {
            this.zzj = false;
            this.zzi = false;
            this.zzh.clear();
        }
        synchronized (this.zzk) {
            try {
                zzdb zzdbVar = this.zzl;
                if (zzdbVar != null) {
                    zzdbVar.zzw();
                }
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to stop the SDK.", e10);
            }
            this.zzl = null;
            zzep zzepVar = this.zzb;
            if (zzepVar != null) {
                zzepVar.zzg();
                this.zzb = null;
            }
            zzfb zzfbVar = this.zzc;
            if (zzfbVar != null) {
                zzfbVar.zzg();
                this.zzc = null;
            }
            zzeo zzeoVar = this.zzd;
            if (zzeoVar != null) {
                zzeoVar.zzg();
                this.zzd = null;
            }
        }
    }

    public final float zzg() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            float fZzk = 1.0f;
            if (zzdbVar == null) {
                return 1.0f;
            }
            try {
                fZzk = zzdbVar.zzk();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app volume.", e10);
            }
            return fZzk;
        }
    }

    public final void zzh(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting app muted state.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzh(z10);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set app mute state.", e10);
            }
        }
    }

    public final boolean zzi() {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            boolean zZzl = false;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zZzl = zzdbVar.zzl();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get app mute state.", e10);
            }
            return zZzl;
        }
    }

    public final void zzj(Context context, String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to opening debug menu.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzi(ObjectWrapper.wrap(context), str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to open debug menu.", e10);
            }
        }
    }

    public final void zzk(Class cls) {
        synchronized (this.zzk) {
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzn(cls.getCanonicalName());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to register RtbAdapter", e10);
            }
        }
    }

    public final InitializationStatus zzl() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting initialization status.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzer(this.zza));
                        return map;
                    }
                };
            }
            try {
                return zzB(zzdbVar.zzq());
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to get Initialization status.");
                return new InitializationStatus() { // from class: com.google.android.gms.ads.internal.client.zzet
                    @Override // com.google.android.gms.ads.initialization.InitializationStatus
                    public final /* synthetic */ Map getAdapterStatusMap() {
                        HashMap map = new HashMap();
                        map.put("com.google.android.gms.ads.MobileAds", new zzer(this.zza));
                        return map;
                    }
                };
            }
        }
    }

    public final void zzm(Context context) {
        synchronized (this.zzk) {
            zzD(context);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzs();
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to disable mediation adapter initialization.");
            }
        }
    }

    public final void zzn(Context context, OnAdInspectorClosedListener onAdInspectorClosedListener) {
        synchronized (this.zzk) {
            zzD(context);
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            this.zzm = onAdInspectorClosedListener;
            try {
                zzdbVar.zzt(new zzev(null));
            } catch (RemoteException unused) {
                com.google.android.gms.ads.internal.util.client.zzo.zzf("Unable to open the ad inspector.");
                if (onAdInspectorClosedListener != null) {
                    onAdInspectorClosedListener.onAdInspectorClosed(new AdInspectorError(0, "Ad inspector had an internal error.", MobileAds.ERROR_DOMAIN));
                }
            }
        }
    }

    public final String zzo() {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to getting version string.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return "";
            }
            try {
                return zzgrt.zza(zzdbVar.zzm());
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to get internal version.", e10);
                return "";
            }
        }
    }

    public final void zzq(@NonNull RequestConfiguration requestConfiguration) {
        Preconditions.checkArgument(requestConfiguration != null, "Null passed to setRequestConfiguration.");
        synchronized (this.zzk) {
            RequestConfiguration requestConfiguration2 = this.zzn;
            this.zzn = requestConfiguration;
            if (this.zzl == null) {
                return;
            }
            if (requestConfiguration2.getTagForChildDirectedTreatment() != requestConfiguration.getTagForChildDirectedTreatment() || requestConfiguration2.getTagForUnderAgeOfConsent() != requestConfiguration.getTagForUnderAgeOfConsent()) {
                zzC(requestConfiguration);
            }
        }
    }

    public final boolean zzr(boolean z10) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to enable/disable the publisher first-party ID.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return false;
            }
            try {
                zzdbVar.zzu(z10);
                return true;
            } catch (RemoteException e10) {
                String str = z10 ? a.f29888j : "disable";
                StringBuilder sb2 = new StringBuilder(str.length() + 40);
                sb2.append("Unable to ");
                sb2.append(str);
                sb2.append(" the publisher first-party ID.");
                com.google.android.gms.ads.internal.util.client.zzo.zzg(sb2.toString(), e10);
                return false;
            }
        }
    }

    public final void zzs(String str) {
        synchronized (this.zzk) {
            Preconditions.checkState(this.zzl != null, "MobileAds.initialize() must be called prior to setting the plugin.");
            zzdb zzdbVar = this.zzl;
            if (zzdbVar == null) {
                return;
            }
            try {
                zzdbVar.zzv(str);
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to set plugin.", e10);
            }
        }
    }

    public final /* synthetic */ void zzt(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    public final /* synthetic */ void zzu(String str) {
        synchronized (this.zzk) {
            zzE(null);
        }
    }

    private zzex() {
    }

    public final Status zze(@NonNull Context context, @NonNull List list, @NonNull PreloadCallback preloadCallback) {
        boolean z10;
        Status status;
        zzbhe.zza(context);
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PreloadConfiguration preloadConfiguration = (PreloadConfiguration) it.next();
            String strValueOf = String.valueOf(preloadConfiguration.getAdFormat());
            String adUnitId = preloadConfiguration.getAdUnitId();
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(adUnitId).length());
            sb2.append(strValueOf);
            sb2.append("#");
            sb2.append(adUnitId);
            String string = sb2.toString();
            map.put(string, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map, string, 0)).intValue() + 1));
        }
        Iterator it2 = map.entrySet().iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((Integer) ((Map.Entry) it2.next()).getValue()).intValue() > 1) {
                    hashSet.add("Preload configurations include duplicated ad unit IDs and ad format combinations");
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        HashMap map2 = new HashMap();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            PreloadConfiguration preloadConfiguration2 = (PreloadConfiguration) it3.next();
            AdFormat adFormat = preloadConfiguration2.getAdFormat();
            if (!zza.contains(preloadConfiguration2.getAdFormat())) {
                hashSet.add("PreloadConfiguration ad format is not supported:".concat(String.valueOf(preloadConfiguration2.getAdFormat())));
            } else {
                map2.put(adFormat, Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(map2, adFormat, 0)).intValue() + 1));
                if (preloadConfiguration2.getBufferSize() > 15) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size exceeds the maximum limit %d for %s", 15, adFormat.name()));
                } else if (preloadConfiguration2.getBufferSize() < 0) {
                    hashSet.add(String.format(Locale.US, "Preload configurations' buffer size less than 0 for %s", adFormat.name()));
                }
            }
            z10 = true;
        }
        EnumMap enumMap = new EnumMap(AdFormat.class);
        enumMap.put(AdFormat.APP_OPEN_AD, (Integer) zzbd.zzc().zzd(zzbhe.zzfu));
        enumMap.put(AdFormat.INTERSTITIAL, (Integer) zzbd.zzc().zzd(zzbhe.zzfs));
        enumMap.put(AdFormat.REWARDED, (Integer) zzbd.zzc().zzd(zzbhe.zzft));
        for (Map.Entry entry : map2.entrySet()) {
            AdFormat adFormat2 = (AdFormat) entry.getKey();
            int iIntValue = ((Integer) entry.getValue()).intValue();
            int iIntValue2 = ((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzd(enumMap, adFormat2, 0)).intValue();
            if (iIntValue > iIntValue2) {
                hashSet.add(String.format(Locale.US, "Preload configurations' size exceeds the maximum limit %d for %s", Integer.valueOf(iIntValue2), adFormat2.name()));
                z10 = true;
            }
        }
        if (z10) {
            StringBuilder sb3 = new StringBuilder();
            Iterator it4 = hashSet.iterator();
            while (it4.hasNext()) {
                sb3.append((String) it4.next());
                if (it4.hasNext()) {
                    sb3.append(", ");
                }
            }
            String string2 = sb3.toString();
            com.google.android.gms.ads.internal.util.client.zzo.zzf(string2);
            status = new Status(13, string2);
        } else {
            status = Status.RESULT_SUCCESS;
        }
        String statusMessage = status.getStatusMessage();
        if (statusMessage == null) {
            statusMessage = "";
        }
        Preconditions.checkArgument(status.isSuccess(), statusMessage);
        synchronized (this.zzg) {
            ArrayList arrayList = new ArrayList();
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                arrayList.add(com.google.android.gms.ads.internal.util.client.zzf.zzt(context, (PreloadConfiguration) it5.next(), 1));
            }
            try {
                com.google.android.gms.ads.zzb.zza(context).zze(arrayList, new zzeq(this, preloadCallback));
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to start preload.", e10);
                return Status.RESULT_INTERNAL_ERROR;
            }
        }
        return Status.RESULT_SUCCESS;
    }
}
