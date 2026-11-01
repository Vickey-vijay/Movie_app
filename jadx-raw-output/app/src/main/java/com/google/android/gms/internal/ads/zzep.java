package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes8.dex */
public final class zzep {

    @Nullable
    private static zzep zza;
    private final Executor zzb;
    private final CopyOnWriteArrayList zzc;
    private final Object zzd;

    @GuardedBy("lock")
    private int zze;

    @GuardedBy("lock")
    private boolean zzf;

    public final /* synthetic */ Executor zzf() {
        return this.zzb;
    }

    public static synchronized zzep zza(Context context) {
        if (zza == null) {
            zza = new zzep(context);
        }
        return zza;
    }

    private final void zzg() {
        CopyOnWriteArrayList<zzel> copyOnWriteArrayList = this.zzc;
        for (zzel zzelVar : copyOnWriteArrayList) {
            if (zzelVar.zza()) {
                copyOnWriteArrayList.remove(zzelVar);
            }
        }
    }

    public final int zzc() {
        int i10;
        synchronized (this.zzd) {
            i10 = this.zze;
        }
        return i10;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0036  */
    /* JADX WARN: Code duplicated, block: B:20:0x0038  */
    /* JADX WARN: Code duplicated, block: B:22:0x003f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0041  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047  */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:4:0x0012  */
    public final /* synthetic */ void zzd(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 2;
        if (connectivityManager == null) {
            i10 = 0;
        } else {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
                    i10 = 1;
                } else {
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        switch (activeNetworkInfo.getSubtype()) {
                            case 1:
                            case 2:
                                i10 = 3;
                                break;
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                            case 11:
                            case 12:
                            case 14:
                            case 15:
                            case 17:
                                i10 = 4;
                                break;
                            case 13:
                                i10 = 5;
                                break;
                            case 16:
                            case 19:
                            default:
                                i10 = 6;
                                break;
                            case 18:
                                break;
                            case 20:
                                if (Build.VERSION.SDK_INT >= 29) {
                                    i10 = 0;
                                } else {
                                    i10 = 9;
                                }
                                break;
                        }
                    } else if (type != 1) {
                        if (type == 4 || type == 5) {
                            switch (activeNetworkInfo.getSubtype()) {
                                case 1:
                                case 2:
                                    i10 = 3;
                                    break;
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 14:
                                case 15:
                                case 17:
                                    i10 = 4;
                                    break;
                                case 13:
                                    i10 = 5;
                                    break;
                                case 16:
                                case 19:
                                default:
                                    i10 = 6;
                                    break;
                                case 18:
                                    break;
                                case 20:
                                    if (Build.VERSION.SDK_INT >= 29) {
                                        i10 = 0;
                                    } else {
                                        i10 = 9;
                                    }
                                    break;
                            }
                        } else if (type != 6) {
                            i10 = type != 9 ? 8 : 7;
                        } else {
                            i10 = 5;
                        }
                    }
                }
            } catch (SecurityException unused) {
            }
        }
        if (Build.VERSION.SDK_INT < 31 || i10 != 5) {
            zze(i10);
            return;
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            zzei zzeiVar = new zzei(this);
            telephonyManager.registerTelephonyCallback(this.zzb, zzeiVar);
            telephonyManager.unregisterTelephonyCallback(zzeiVar);
        } catch (RuntimeException unused2) {
            zze(5);
        }
    }

    private zzep(final Context context) {
        Executor executorZza = zzdh.zza();
        this.zzb = executorZza;
        this.zzc = new CopyOnWriteArrayList();
        this.zzd = new Object();
        this.zze = 0;
        executorZza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzem
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                context.registerReceiver(new zzeo(this.zza, null), intentFilter);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final void zze(int i10) {
        zzg();
        synchronized (this.zzd) {
            if (this.zzf && this.zze == i10) {
                return;
            }
            this.zzf = true;
            this.zze = i10;
            Iterator it = this.zzc.iterator();
            while (it.hasNext()) {
                ((zzel) it.next()).zzb();
            }
        }
    }

    public final void zzb(zzej zzejVar, Executor executor) {
        boolean z10;
        zzg();
        zzel zzelVar = new zzel(this, zzejVar, executor);
        synchronized (this.zzd) {
            this.zzc.add(zzelVar);
            z10 = this.zzf;
        }
        if (z10) {
            zzelVar.zzb();
        }
    }
}
