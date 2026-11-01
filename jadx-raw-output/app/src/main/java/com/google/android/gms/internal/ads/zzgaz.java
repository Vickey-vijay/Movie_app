package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzgaz {
    private final zzgdf zza;
    private final zzgeg zzb;
    private final zzgmz zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final long zzf;
    private final zzika zzg;
    private final long zzh;
    private final long zzi = System.currentTimeMillis();
    private final boolean zzj;
    private final long zzk;

    public final q5.i zza() {
        return this.zza.zza();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzb(final Context context) {
        String string;
        boolean z10 = false;
        if (this.zzj) {
            if (System.currentTimeMillis() - this.zzi <= this.zzk) {
                z10 = true;
            }
        }
        zzgoc zzgocVarZza = this.zzd.zza(3);
        try {
            try {
                try {
                    zzgocVarZza.zza();
                    string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgay
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ q5.i zza(Object obj) {
                            return this.zza.zzg(context, (Void) obj);
                        }
                    }, zzhaf.zza()).get(z10 ? this.zzh : this.zzf, TimeUnit.MILLISECONDS);
                } catch (InterruptedException e10) {
                    Thread.currentThread().interrupt();
                    zzgocVarZza.zzb(e10);
                    string = "";
                } catch (ExecutionException e11) {
                    e = e11;
                    Throwable cause = e.getCause();
                    if (cause != null) {
                        e = cause;
                    }
                    zzgocVarZza.zzb(e);
                    string = Integer.toString(3);
                }
            } catch (TimeoutException unused) {
                if (z10) {
                    string = ((zzghi) this.zzg.zzb()).zza(true, this.zzi);
                } else {
                    this.zzd.zzb(56);
                    string = Integer.toString(17);
                }
            } catch (Throwable th2) {
                zzgocVarZza.zzb(th2);
                throw th2;
            }
            zzgocVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzc(final Context context, String str, final View view, final Activity activity) {
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(4);
        try {
            try {
                try {
                    try {
                        zzgocVarZza.zza();
                        final String str2 = null;
                        string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str2, view, activity) { // from class: com.google.android.gms.internal.ads.zzgaw
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ View zzc;
                            private final /* synthetic */ Activity zzd;

                            {
                                this.zzc = view;
                                this.zzd = activity;
                            }

                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ q5.i zza(Object obj) {
                                return this.zza.zzh(this.zzb, null, this.zzc, this.zzd, (Void) obj);
                            }
                        }, zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e10) {
                        e = e10;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zzgocVarZza.zzb(e);
                        string = Integer.toString(3);
                    }
                } catch (Throwable th2) {
                    zzgocVarZza.zzb(th2);
                    throw th2;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                zzgocVarZza.zzb(e11);
                string = "";
            } catch (TimeoutException unused) {
                this.zzd.zzb(57);
                string = Integer.toString(17);
            }
            zzgocVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String zzd(final Context context, final String str, final View view, Activity activity) {
        String string;
        zzgoc zzgocVarZza = this.zzd.zza(5);
        try {
            try {
                try {
                    try {
                        zzgocVarZza.zza();
                        final Activity activity2 = null;
                        string = (String) zzgzo.zzj(this.zza.zzb(), new zzgyw(context, str, view, activity2) { // from class: com.google.android.gms.internal.ads.zzgax
                            private final /* synthetic */ Context zzb;
                            private final /* synthetic */ String zzc;
                            private final /* synthetic */ View zzd;

                            @Override // com.google.android.gms.internal.ads.zzgyw
                            public final /* synthetic */ q5.i zza(Object obj) {
                                return this.zza.zzi(this.zzb, this.zzc, this.zzd, null, (Void) obj);
                            }
                        }, zzhaf.zza()).get(this.zzf, TimeUnit.MILLISECONDS);
                    } catch (ExecutionException e10) {
                        e = e10;
                        Throwable cause = e.getCause();
                        if (cause != null) {
                            e = cause;
                        }
                        zzgocVarZza.zzb(e);
                        string = Integer.toString(3);
                    }
                } catch (Throwable th2) {
                    zzgocVarZza.zzb(th2);
                    throw th2;
                }
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                zzgocVarZza.zzb(e11);
                string = "";
            } catch (TimeoutException unused) {
                this.zzd.zzb(58);
                string = Integer.toString(17);
            }
            zzgocVarZza.zzc();
            this.zze.zzb();
            return string;
        } catch (Throwable th3) {
            zzgocVarZza.zzc();
            this.zze.zzb();
            throw th3;
        }
    }

    public final void zze(List list) {
        this.zzc.zza(list);
    }

    public final void zzf(InputEvent inputEvent) {
        this.zzb.zze(inputEvent);
    }

    public final /* synthetic */ q5.i zzg(Context context, Void r10) {
        return this.zzb.zzb(context);
    }

    public final /* synthetic */ q5.i zzh(Context context, String str, View view, Activity activity, Void r10) {
        return this.zzb.zzc(context, null, view, activity);
    }

    public final /* synthetic */ q5.i zzi(Context context, String str, View view, Activity activity, Void r10) {
        return this.zzb.zzd(context, str, view, null);
    }

    public final int zzj() {
        return this.zzb.zzh();
    }

    public zzgaz(zzgdf zzgdfVar, zzgeg zzgegVar, zzgmz zzgmzVar, zzgoe zzgoeVar, zzgcl zzgclVar, zzika zzikaVar, zzgbf zzgbfVar) {
        this.zza = zzgdfVar;
        this.zzb = zzgegVar;
        this.zzc = zzgmzVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = zzgbfVar.zzh();
        this.zzg = zzikaVar;
        this.zzh = zzgbfVar.zzg();
        this.zzj = zzgbfVar.zzq();
        this.zzk = zzgbfVar.zzp();
    }
}
