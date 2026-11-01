package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.MBridgeConstans;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes11.dex */
final class zzgkc implements zzgjf {
    private final zzgmu zza;
    private final zzgmg zzb;
    private final ExecutorService zzc;
    private final zzgmz zzd;
    private final zzgoe zze;
    private final Object zzf = new Object();
    private final String zzg;
    private final long zzh;
    private final long zzi;
    private zzgkb zzj;

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final int zzg() {
        return 4;
    }

    private final String zzq(Map map) throws zzatt, zzatp {
        String strZzb;
        zzgoe zzgoeVar = this.zze;
        zzgoc zzgocVarZza = zzgoeVar.zza(20110);
        try {
            zzgocVarZza.zza();
            synchronized (this.zzf) {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar == null) {
                    zzgoeVar.zzb(20109);
                    strZzb = "";
                } else {
                    strZzb = zzgkbVar.zzb(map);
                }
            }
            zzgocVarZza.zzc();
            return strZzb;
        } catch (Throwable th2) {
            try {
                zzgocVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgocVarZza.zzc();
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final String zza() {
        synchronized (this.zzf) {
            zzgkb zzgkbVar = this.zzj;
            if (zzgkbVar == null) {
                return "3.825731049.-1";
            }
            return zzgkbVar.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final q5.i zzb() {
        zzgzg zzgzgVarZzw = zzgzg.zzw(this.zzb.zzb());
        zzgka zzgkaVar = new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgka
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return null;
            }
        };
        ExecutorService executorService = this.zzc;
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzg(zzgzgVarZzw, Throwable.class, zzgkaVar, executorService), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgjs
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ q5.i zza(Object obj) {
                return this.zza.zzi((zzgdu) obj);
            }
        }, executorService);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final q5.i zzc(final Context context) {
        return zzgzo.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgjt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzj(context);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final q5.i zzd(final Context context, String str, final View view, final Activity activity) {
        final String str2 = null;
        return zzgzo.zzd(new Callable(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgju
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ View zzc;
            private final /* synthetic */ Activity zzd;

            {
                this.zzc = view;
                this.zzd = activity;
            }

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzk(this.zzb, null, this.zzc, this.zzd);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final q5.i zze(final Context context, final String str, final View view, Activity activity) {
        final Activity activity2 = null;
        return zzgzo.zzd(new Callable(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgjv
            private final /* synthetic */ Context zzb;
            private final /* synthetic */ String zzc;
            private final /* synthetic */ View zzd;

            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzl(this.zzb, this.zzc, this.zzd, null);
            }
        }, this.zzc);
    }

    @Override // com.google.android.gms.internal.ads.zzgjf
    public final void zzf(InputEvent inputEvent) {
        try {
            synchronized (this.zzf) {
                zzgkb zzgkbVar = this.zzj;
                if (zzgkbVar != null) {
                    HashMap map = new HashMap();
                    map.put("evt", inputEvent);
                    zzgkbVar.zzc(map);
                } else {
                    this.zze.zzb(20105);
                }
            }
        } catch (zzatp | zzatt e10) {
            this.zze.zzd(20104, e10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x008a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:50:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00ce  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zzh(Map map) {
        String strZzb;
        zzgoc zzgocVarZza;
        String str;
        map.put("v", this.zzg);
        q5.i iVar = (q5.i) map.get("gs");
        q5.i iVar2 = (q5.i) map.get("ai");
        byte[] bArrZzaN = null;
        long jZzd = -1;
        if (iVar != null) {
            zzgoc zzgocVarZza2 = this.zze.zza(20107);
            try {
                try {
                    zzgocVarZza2.zza();
                    zzaxg zzaxgVar = (zzaxg) iVar.get(this.zzi, TimeUnit.MILLISECONDS);
                    if (zzaxgVar != null) {
                        bArrZzaN = zzaxgVar.zzh().zzaN();
                        strZzb = zzaxgVar.zzb().length() > 1 ? zzaxgVar.zzb() : ExifInterface.LONGITUDE_EAST;
                        try {
                            if (zzaxgVar.zzc()) {
                                jZzd = zzaxgVar.zzd();
                            }
                        } catch (ClassCastException e10) {
                            e = e10;
                            zzgocVarZza2.zzb(e);
                        } catch (InterruptedException e11) {
                            e = e11;
                            zzgocVarZza2.zzb(e);
                        } catch (ExecutionException e12) {
                            e = e12;
                            Throwable cause = e.getCause();
                            if (cause != null) {
                                e = cause;
                            }
                            zzgocVarZza2.zzb(e);
                        } catch (TimeoutException e13) {
                            e = e13;
                            zzgocVarZza2.zzb(e);
                        }
                    } else {
                        strZzb = ExifInterface.LONGITUDE_EAST;
                    }
                } catch (Throwable th2) {
                    zzgocVarZza2.zzc();
                    throw th2;
                }
            } catch (ClassCastException e14) {
                e = e14;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgocVarZza2.zzb(e);
                zzgocVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgocVarZza = this.zze.zza(20108);
                    try {
                        try {
                            zzgocVarZza.zza();
                            str = (String) iVar2.get(this.zzh, TimeUnit.MILLISECONDS);
                            if (true != zzgrt.zzc(str)) {
                                strZzb = str;
                            }
                        } catch (ClassCastException e15) {
                            e = e15;
                            zzgocVarZza.zzb(e);
                        } catch (InterruptedException e16) {
                            e = e16;
                            zzgocVarZza.zzb(e);
                        } catch (ExecutionException e17) {
                            e = e17;
                            Throwable cause2 = e.getCause();
                            if (cause2 != null) {
                                e = cause2;
                            }
                            zzgocVarZza.zzb(e);
                        } catch (TimeoutException e18) {
                            e = e18;
                            zzgocVarZza.zzb(e);
                        }
                        zzgocVarZza.zzc();
                    } catch (Throwable th3) {
                        zzgocVarZza.zzc();
                        throw th3;
                    }
                }
                map.put(ImpressionLog.f43647w, strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (InterruptedException e19) {
                e = e19;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgocVarZza2.zzb(e);
                zzgocVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgocVarZza = this.zze.zza(20108);
                    zzgocVarZza.zza();
                    str = (String) iVar2.get(this.zzh, TimeUnit.MILLISECONDS);
                    if (true != zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                    zzgocVarZza.zzc();
                }
                map.put(ImpressionLog.f43647w, strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            } catch (ExecutionException e20) {
                e = e20;
                strZzb = ExifInterface.LONGITUDE_EAST;
            } catch (TimeoutException e21) {
                e = e21;
                strZzb = ExifInterface.LONGITUDE_EAST;
                zzgocVarZza2.zzb(e);
                zzgocVarZza2.zzc();
                if (strZzb.equals(ExifInterface.LONGITUDE_EAST)) {
                    zzgocVarZza = this.zze.zza(20108);
                    zzgocVarZza.zza();
                    str = (String) iVar2.get(this.zzh, TimeUnit.MILLISECONDS);
                    if (true != zzgrt.zzc(str)) {
                        strZzb = str;
                    }
                    zzgocVarZza.zzc();
                }
                map.put(ImpressionLog.f43647w, strZzb);
                if (bArrZzaN != null) {
                    map.put("att", bArrZzaN);
                }
                map.put("gv", Long.valueOf(jZzd));
            }
            zzgocVarZza2.zzc();
        } else {
            strZzb = ExifInterface.LONGITUDE_EAST;
        }
        if (strZzb.equals(ExifInterface.LONGITUDE_EAST) && iVar2 != null) {
            zzgocVarZza = this.zze.zza(20108);
            zzgocVarZza.zza();
            str = (String) iVar2.get(this.zzh, TimeUnit.MILLISECONDS);
            if (true != zzgrt.zzc(str)) {
                strZzb = str;
            }
            zzgocVarZza.zzc();
        }
        map.put(ImpressionLog.f43647w, strZzb);
        if (bArrZzaN != null) {
            map.put("att", bArrZzaN);
        }
        map.put("gv", Long.valueOf(jZzd));
    }

    public final /* synthetic */ q5.i zzi(zzgdu zzgduVar) {
        if (this.zza.zzb(zzgduVar)) {
            return zzgzo.zzk(this.zzb.zze(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgjw
                @Override // com.google.android.gms.internal.ads.zzgqt
                public final /* synthetic */ Object apply(Object obj) {
                    this.zza.zzm((byte[]) obj);
                    return null;
                }
            }, zzhaf.zza());
        }
        this.zze.zzb(20103);
        throw new zzgjg(1);
    }

    public final /* synthetic */ String zzj(final Context context) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        this.zze.zzf(20106, new Runnable() { // from class: com.google.android.gms.internal.ads.zzgjx
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzn(map, context);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzk(final Context context, String str, final View view, final Activity activity) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        final String str2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity, str2) { // from class: com.google.android.gms.internal.ads.zzgjy
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ Activity zze;

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzo(this.zzb, this.zzc, this.zzd, this.zze, null);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ String zzl(final Context context, final String str, final View view, Activity activity) throws zzatt, zzatp {
        final HashMap map = new HashMap();
        final Activity activity2 = null;
        this.zze.zzf(20106, new Runnable(map, context, view, activity2, str) { // from class: com.google.android.gms.internal.ads.zzgjz
            private final /* synthetic */ Map zzb;
            private final /* synthetic */ Context zzc;
            private final /* synthetic */ View zzd;
            private final /* synthetic */ String zze;

            {
                this.zze = str;
            }

            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzp(this.zzb, this.zzc, this.zzd, null, this.zze);
            }
        });
        String strZzq = zzq(map);
        map.clear();
        return strZzq;
    }

    public final /* synthetic */ void zzn(Map map, Context context) {
        map.putAll(this.zzd.zzb());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "q");
        map.put("ctx", context);
    }

    public final /* synthetic */ void zzo(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzc(context, view));
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "v");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", activity);
        map.put("bds", null);
    }

    public final /* synthetic */ void zzp(Map map, Context context, View view, Activity activity, String str) {
        map.putAll(this.zzd.zzd());
        zzh(map);
        map.put(InneractiveMediationDefs.GENDER_FEMALE, "c");
        map.put("ctx", context);
        map.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, view);
        map.put("act", null);
        map.put("bds", str);
    }

    public zzgkc(zzikv zzikvVar, zzgmu zzgmuVar, zzgmg zzgmgVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgbf zzgbfVar, ExecutorService executorService) {
        this.zza = zzgmuVar;
        this.zzb = zzgmgVar;
        this.zzc = executorService;
        this.zzd = zzgmzVar;
        this.zze = zzgoeVar;
        this.zzg = zzgbfVar.zzb();
        this.zzh = zzgbfVar.zzk();
        this.zzi = zzgbfVar.zzj();
    }

    public final /* synthetic */ Void zzm(byte[] bArr) {
        zzatr zzatrVarZzc = zzgkf.zzc();
        zzgoc zzgocVarZza = this.zze.zza(20102);
        try {
            try {
                zzgocVarZza.zza();
                synchronized (this.zzf) {
                    this.zzj = zzgkb.zza(zzatrVarZzc, bArr);
                }
                zzgocVarZza.zzc();
                return null;
            } catch (zzatp e10) {
                e = e10;
                zzgocVarZza.zzb(e);
                throw new zzgjg(2, e);
            } catch (zzatt e11) {
                e = e11;
                zzgocVarZza.zzb(e);
                throw new zzgjg(2, e);
            } catch (Throwable th2) {
                zzgocVarZza.zzb(th2);
                throw th2;
            }
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            throw th3;
        }
    }
}
