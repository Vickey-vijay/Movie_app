package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public abstract class zzazd implements zzazc {
    public static volatile zzbak zza;
    public MotionEvent zzb;
    public double zzk;
    public float zzl;
    public float zzm;
    public float zzn;
    public float zzo;
    public DisplayMetrics zzq;

    @Nullable
    public zzbac zzr;
    private double zzs;
    private double zzt;
    public final LinkedList zzc = new LinkedList();
    public long zzd = 0;
    public long zze = 0;
    public long zzf = 0;
    public long zzg = 0;
    public long zzh = 0;
    public long zzi = 0;
    public long zzj = 0;
    private boolean zzu = false;
    public boolean zzp = false;

    public abstract zzawg zza(Context context, zzavs zzavsVar);

    public abstract zzawg zzb(Context context, View view, Activity activity);

    public abstract zzawg zzc(Context context, View view, Activity activity);

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zzd(@Nullable MotionEvent motionEvent) {
        Long l10;
        if (this.zzu) {
            zzo();
            this.zzu = false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.zzk = 0.0d;
            this.zzs = motionEvent.getRawX();
            this.zzt = motionEvent.getRawY();
        } else if (action == 1 || action == 2) {
            double rawX = motionEvent.getRawX();
            double rawY = motionEvent.getRawY();
            double d10 = rawX - this.zzs;
            double d11 = rawY - this.zzt;
            this.zzk += Math.sqrt((d10 * d10) + (d11 * d11));
            this.zzs = rawX;
            this.zzt = rawY;
        }
        int action2 = motionEvent.getAction();
        if (action2 != 0) {
            try {
                if (action2 == 1) {
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    this.zzb = motionEventObtain;
                    LinkedList linkedList = this.zzc;
                    linkedList.add(motionEventObtain);
                    if (linkedList.size() > 6) {
                        ((MotionEvent) linkedList.remove()).recycle();
                    }
                    this.zzf++;
                    this.zzh = zzn(new Throwable().getStackTrace());
                } else if (action2 == 2) {
                    this.zze += (long) (motionEvent.getHistorySize() + 1);
                    zzbam zzbamVarZzm = zzm(motionEvent);
                    Long l11 = zzbamVarZzm.zzd;
                    if (l11 != null && zzbamVarZzm.zzg != null) {
                        this.zzi += l11.longValue() + zzbamVarZzm.zzg.longValue();
                    }
                    if (this.zzq != null && (l10 = zzbamVarZzm.zze) != null && zzbamVarZzm.zzh != null) {
                        this.zzj += l10.longValue() + zzbamVarZzm.zzh.longValue();
                    }
                } else if (action2 == 3) {
                    this.zzg++;
                }
            } catch (zzbaa unused) {
            }
        } else {
            this.zzl = motionEvent.getX();
            this.zzm = motionEvent.getY();
            this.zzn = motionEvent.getRawX();
            this.zzo = motionEvent.getRawY();
            this.zzd++;
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, @Nullable String str, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, str, 3, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzp(context, str, 3, view, null, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public void zzh(View view) {
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        return zzp(context, null, 2, view, activity, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    public abstract zzbam zzm(MotionEvent motionEvent) throws zzbaa;

    public abstract long zzn(StackTraceElement[] stackTraceElementArr) throws zzbaa;

    private final void zzo() {
        this.zzh = 0L;
        this.zzd = 0L;
        this.zze = 0L;
        this.zzf = 0L;
        this.zzg = 0L;
        this.zzi = 0L;
        this.zzj = 0L;
        LinkedList linkedList = this.zzc;
        if (linkedList.isEmpty()) {
            MotionEvent motionEvent = this.zzb;
            if (motionEvent != null) {
                motionEvent.recycle();
            }
        } else {
            Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((MotionEvent) it.next()).recycle();
            }
            linkedList.clear();
        }
        this.zzb = null;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b3 A[Catch: Exception -> 0x00ed, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e7 A[Catch: Exception -> 0x00ed, TRY_LEAVE, TryCatch #0 {Exception -> 0x00ed, blocks: (B:45:0x00a6, B:48:0x00b3, B:57:0x00d7, B:58:0x00e7), top: B:73:0x00a6 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final String zzp(Context context, String str, int i10, View view, Activity activity, byte[] bArr) {
        zzazb zzazbVarZzh;
        String str2;
        int i11;
        Exception exc;
        int i12;
        int i13;
        long jCurrentTimeMillis;
        String strZzb;
        int i14;
        int i15;
        zzawg zzawgVarZza;
        int i16;
        int i17;
        int i18 = i10;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        boolean zBooleanValue = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdm)).booleanValue();
        zzawg zzawgVarZzb = null;
        if (zBooleanValue) {
            zzazbVarZzh = zza != null ? zza.zzh() : null;
            str2 = "be";
        } else {
            zzazbVarZzh = null;
            str2 = null;
        }
        int i19 = 1;
        try {
            if (i18 == 3) {
                zzawgVarZzb = zzb(context, view, activity);
                try {
                    this.zzu = true;
                    i17 = 1002;
                } catch (Exception e10) {
                    exc = e10;
                    i11 = 3;
                    i19 = 1;
                    if (!zBooleanValue) {
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzawgVarZzb != null) {
                        try {
                            if (((zzaxg) zzawgVarZzb.zzbu()).zzbr() == 0) {
                                strZzb = Integer.toString(5);
                            } else {
                                zzaxg zzaxgVar = (zzaxg) zzawgVarZzb.zzbu();
                                boolean z10 = zzayg.zza;
                                strZzb = zzayg.zzb(zzaxgVar.zzaN(), str);
                                if (zBooleanValue) {
                                    if (i18 == i11) {
                                        i14 = 1006;
                                    } else if (i18 == i12) {
                                        i14 = 1010;
                                    } else {
                                        i14 = 1004;
                                    }
                                    zzazbVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                                }
                            }
                        } catch (Exception e11) {
                            strZzb = Integer.toString(7);
                            if (zBooleanValue && zzazbVarZzh != null) {
                                if (i18 == i11) {
                                    i15 = 1007;
                                } else {
                                    i15 = i18 == i12 ? 1011 : 1005;
                                }
                                zzazbVarZzh.zza(i15, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, e11);
                            }
                        }
                    } else {
                        strZzb = Integer.toString(5);
                    }
                    return strZzb;
                }
            } else {
                if (i18 == 2) {
                    zzawgVarZza = zzc(context, view, activity);
                    i16 = 1008;
                } else {
                    zzawgVarZza = zza(context, null);
                    i16 = 1000;
                }
                zzawgVarZzb = zzawgVarZza;
                i17 = i16;
            }
            if (!zBooleanValue || zzazbVarZzh == null) {
                i11 = 3;
            } else {
                i11 = 3;
                try {
                    zzazbVarZzh.zza(i17, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, null);
                } catch (Exception e12) {
                    e = e12;
                    exc = e;
                    if (!zBooleanValue && zzazbVarZzh != null) {
                        if (i18 == i11) {
                            i13 = 1003;
                            i12 = 2;
                        } else {
                            i12 = 2;
                            if (i18 == 2) {
                                i13 = 1009;
                            } else {
                                i13 = 1001;
                                i18 = i19;
                            }
                        }
                        zzazbVarZzh.zza(i13, -1, System.currentTimeMillis() - jCurrentTimeMillis2, str2, exc);
                    }
                    jCurrentTimeMillis = System.currentTimeMillis();
                    if (zzawgVarZzb != null) {
                        strZzb = Integer.toString(5);
                    } else if (((zzaxg) zzawgVarZzb.zzbu()).zzbr() == 0) {
                        strZzb = Integer.toString(5);
                    } else {
                        zzaxg zzaxgVar2 = (zzaxg) zzawgVarZzb.zzbu();
                        boolean z11 = zzayg.zza;
                        strZzb = zzayg.zzb(zzaxgVar2.zzaN(), str);
                        if (zBooleanValue) {
                            if (i18 == i11) {
                                i14 = 1006;
                            } else if (i18 == i12) {
                                i14 = 1010;
                            } else {
                                i14 = 1004;
                            }
                            zzazbVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
                        }
                    }
                    return strZzb;
                }
            }
        } catch (Exception e13) {
            e = e13;
            i11 = 3;
        }
        i12 = 2;
        jCurrentTimeMillis = System.currentTimeMillis();
        if (zzawgVarZzb != null) {
            strZzb = Integer.toString(5);
        } else if (((zzaxg) zzawgVarZzb.zzbu()).zzbr() == 0) {
            strZzb = Integer.toString(5);
        } else {
            zzaxg zzaxgVar3 = (zzaxg) zzawgVarZzb.zzbu();
            boolean z12 = zzayg.zza;
            strZzb = zzayg.zzb(zzaxgVar3.zzaN(), str);
            if (zBooleanValue && zzazbVarZzh != null) {
                if (i18 == i11) {
                    i14 = 1006;
                } else if (i18 == i12) {
                    i14 = 1010;
                } else {
                    i14 = 1004;
                }
                zzazbVarZzh.zza(i14, -1, System.currentTimeMillis() - jCurrentTimeMillis, str2, null);
            }
        }
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final synchronized void zze(int i10, int i11, int i12) {
        if (this.zzb != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdk)).booleanValue()) {
                zzo();
            } else {
                this.zzb.recycle();
            }
        }
        DisplayMetrics displayMetrics = this.zzq;
        if (displayMetrics != null) {
            float f10 = displayMetrics.density;
            this.zzb = MotionEvent.obtain(0L, i12, 1, i10 * f10, i11 * f10, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        } else {
            this.zzb = null;
        }
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue() || (zzbacVar = this.zzr) == null) {
            return;
        }
        zzbacVar.zza(Arrays.asList(stackTraceElementArr));
    }

    public zzazd(Context context) {
        try {
            zzayg.zza();
            this.zzq = context.getResources().getDisplayMetrics();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue()) {
                this.zzr = new zzbac();
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        if (!zzban.zzd()) {
            return zzp(context, null, 1, null, null, null);
        }
        throw new IllegalStateException("The caller must not be called from the UI thread.");
    }
}
