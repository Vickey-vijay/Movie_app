package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.textclassifier.TextClassifier;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toolbar;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.ads.internal.client.zzbd;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbmx;
import com.google.android.gms.internal.ads.zzbmz;
import com.google.android.gms.internal.ads.zzbwx;
import com.google.android.gms.internal.ads.zzbxl;
import com.google.android.gms.internal.ads.zzbxr;
import com.google.android.gms.internal.ads.zzcjl;
import com.google.android.gms.internal.ads.zzckb;
import com.google.android.gms.internal.ads.zzclh;
import com.google.android.gms.internal.ads.zzclj;
import com.google.android.gms.internal.ads.zzclv;
import com.google.android.gms.internal.ads.zzdbs;
import com.google.android.gms.internal.ads.zzdjm;
import com.google.android.gms.internal.ads.zzdxy;
import com.google.android.gms.internal.ads.zzdxz;
import com.google.android.gms.internal.ads.zzejg;
import com.google.android.gms.internal.ads.zzejh;
import com.google.android.gms.internal.ads.zzejz;
import com.google.android.gms.internal.ads.zzekb;
import com.google.android.gms.internal.ads.zzfyn;
import com.google.android.gms.internal.ads.zzgrt;
import java.util.Collections;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzm extends zzbxr implements zzah {

    @VisibleForTesting
    public static final int zza = Color.argb(0, 0, 0, 0);
    public static final /* synthetic */ int zzo = 0;
    public final Activity zzb;

    @Nullable
    @VisibleForTesting
    public AdOverlayInfoParcel zzc;

    @VisibleForTesting
    public zzcjl zzd;

    @VisibleForTesting
    public zzj zze;

    @VisibleForTesting
    public zzu zzf;

    @VisibleForTesting
    public FrameLayout zzh;

    @VisibleForTesting
    public WebChromeClient.CustomViewCallback zzi;

    @VisibleForTesting
    public zzi zzl;
    private Runnable zzr;
    private boolean zzs;
    private boolean zzt;
    private Toolbar zzx;

    @VisibleForTesting
    public boolean zzg = false;

    @VisibleForTesting
    public boolean zzj = false;

    @VisibleForTesting
    public boolean zzk = false;

    @VisibleForTesting
    public boolean zzm = false;

    @VisibleForTesting
    public int zzn = 1;
    private final Object zzp = new Object();
    private final View.OnClickListener zzq = new zzd(this);
    private boolean zzu = false;
    private boolean zzv = false;
    private boolean zzw = true;

    public final void zzE() {
        this.zzl.zzb = true;
    }

    public final void zzb() {
        this.zzn = 3;
        Activity activity = this.zzb;
        activity.finish();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || adOverlayInfoParcel.zzk != 5) {
            return;
        }
        activity.overridePendingTransition(0, 0);
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzae(null);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzah
    public final void zzd() {
        this.zzn = 2;
        this.zzb.finish();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zze() {
        this.zzn = 1;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final boolean zzg() {
        this.zzn = 1;
        if (this.zzd == null) {
            return true;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue() && this.zzd.canGoBack()) {
            this.zzd.goBack();
            return false;
        }
        boolean zZzZ = this.zzd.zzZ();
        if (!zZzZ) {
            this.zzd.zze("onbackblocked", Collections.emptyMap());
        }
        return zZzZ;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzs() {
        this.zzt = true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0033 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0035  */
    /* JADX WARN: Code duplicated, block: B:19:0x0048  */
    private final void zzJ(Configuration configuration) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        boolean z10;
        boolean z11;
        com.google.android.gms.ads.internal.zzl zzlVar;
        boolean z12;
        int i10;
        int i11;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        boolean z13 = (adOverlayInfoParcel2 == null || (zzlVar2 = adOverlayInfoParcel2.zzo) == null || !zzlVar2.zzb) ? false : true;
        Activity activity = this.zzb;
        boolean zZzd = com.google.android.gms.ads.internal.zzt.zzf().zzd(activity, configuration);
        if (!this.zzk || z13) {
            if (zZzd) {
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbl)).booleanValue()) {
                    z10 = false;
                }
                z11 = z10;
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel == null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzg) {
                z10 = true;
                z11 = z10;
            } else {
                z10 = true;
                z11 = false;
            }
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbm)).booleanValue()) {
            if (zZzd) {
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbl)).booleanValue()) {
                    z10 = false;
                }
                z11 = z10;
            }
            adOverlayInfoParcel = this.zzc;
            if (adOverlayInfoParcel == null) {
            }
            z10 = true;
            z11 = false;
        } else {
            z10 = false;
            z11 = z10;
        }
        Window window = activity.getWindow();
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbL)).booleanValue()) {
            View decorView = window.getDecorView();
            if (z10) {
                i11 = z11 ? 5894 : 5380;
                z12 = true;
            } else {
                i11 = 256;
                z12 = false;
            }
            decorView.setSystemUiVisibility(i11);
        } else if (z10) {
            window.addFlags(1024);
            window.clearFlags(2048);
            if (z11) {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            }
            z12 = true;
        } else {
            window.addFlags(2048);
            window.clearFlags(1024);
            z12 = false;
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzoS)).booleanValue() || (i10 = Build.VERSION.SDK_INT) > 34 || i10 < 28 || !z12) {
            return;
        }
        window.getAttributes().layoutInDisplayCutoutMode = 1;
        WindowCompat.setDecorFitsSystemWindows(window, false);
    }

    private final void zzK(View view) {
        zzekb zzekbVarZzU;
        zzejz zzejzVarZzV;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgm)).booleanValue() && (zzejzVarZzV = zzcjlVar.zzV()) != null) {
            zzejzVarZzV.zzf(view);
        } else if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && (zzekbVarZzU = zzcjlVar.zzU()) != null && zzekbVarZzU.zzb()) {
            com.google.android.gms.ads.internal.zzt.zzu().zzg(zzekbVarZzU.zza(), view);
        }
    }

    private static final void zzL(@Nullable zzekb zzekbVar, @Nullable View view) {
        if (zzekbVar == null || view == null) {
            return;
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzgl)).booleanValue() && zzekbVar.zzb()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzu().zzh(zzekbVar.zza(), view);
    }

    public final void zzA() {
        AdOverlayInfoParcel adOverlayInfoParcel;
        zzr zzrVar;
        if (!this.zzb.isFinishing() || this.zzu) {
            return;
        }
        this.zzu = true;
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            zzcjlVar.zzH(this.zzn - 1);
            synchronized (this.zzp) {
                if (!this.zzs && this.zzd.zzaa()) {
                    if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfX)).booleanValue() && !this.zzv && (adOverlayInfoParcel = this.zzc) != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
                        zzrVar.zzdS();
                    }
                    Runnable runnable = new Runnable() { // from class: com.google.android.gms.ads.internal.overlay.zzf
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzB();
                        }
                    };
                    this.zzr = runnable;
                    com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(runnable, ((Long) zzbd.zzc().zzd(zzbhe.zzbE)).longValue());
                    return;
                }
            }
        }
        zzB();
    }

    @VisibleForTesting
    public final void zzB() {
        zzcjl zzcjlVar;
        zzr zzrVar;
        if (this.zzv) {
            return;
        }
        this.zzv = true;
        zzcjl zzcjlVar2 = this.zzd;
        if (zzcjlVar2 != null) {
            this.zzl.removeView(zzcjlVar2.zzE());
            zzj zzjVar = this.zze;
            if (zzjVar != null) {
                this.zzd.zzai(zzjVar.zzd);
                this.zzd.zzag(false);
                if (((Boolean) zzbd.zzc().zzd(zzbhe.zzof)).booleanValue() && this.zzd.getParent() != null) {
                    ((ViewGroup) this.zzd.getParent()).removeView(this.zzd.zzE());
                }
                ViewGroup viewGroup = this.zze.zzc;
                View viewZzE = this.zzd.zzE();
                zzj zzjVar2 = this.zze;
                viewGroup.addView(viewZzE, zzjVar2.zza, zzjVar2.zzb);
                this.zze = null;
            } else {
                Activity activity = this.zzb;
                if (activity.getApplicationContext() != null) {
                    this.zzd.zzai(activity.getApplicationContext());
                }
            }
            this.zzd = null;
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdT(this.zzn);
        }
        AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
        if (adOverlayInfoParcel2 == null || (zzcjlVar = adOverlayInfoParcel2.zzd) == null) {
            return;
        }
        zzL(zzcjlVar.zzU(), this.zzc.zzd.zzE());
    }

    public final void zzC() {
        if (this.zzm) {
            this.zzm = false;
            zzD();
        }
    }

    public final void zzD() {
        this.zzd.zzI();
    }

    public final void zzF() {
        synchronized (this.zzp) {
            this.zzs = true;
            Runnable runnable = this.zzr;
            if (runnable != null) {
                zzfyn zzfynVar = com.google.android.gms.ads.internal.util.zzs.zza;
                zzfynVar.removeCallbacks(runnable);
                zzfynVar.post(this.zzr);
            }
        }
    }

    public final void zzG(zzejh zzejhVar) throws RemoteException, zzh {
        zzbxl zzbxlVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzbxlVar = adOverlayInfoParcel.zzv) == null) {
            throw new zzh("noioou");
        }
        zzbxlVar.zzh(ObjectWrapper.wrap(zzejhVar));
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzH(int i10, String[] strArr, int[] iArr) {
        if (i10 == 12345) {
            Activity activity = this.zzb;
            zzejg zzejgVarZze = zzejh.zze();
            zzejgVarZze.zza(activity);
            zzejgVarZze.zzb(this.zzc.zzk == 5 ? this : null);
            try {
                this.zzc.zzv.zzi(strArr, iArr, ObjectWrapper.wrap(zzejgVarZze.zze()));
            } catch (RemoteException unused) {
            }
        }
    }

    public final void zzc() {
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && this.zzg) {
            zzw(adOverlayInfoParcel.zzj);
        }
        if (this.zzh != null) {
            this.zzb.setContentView(this.zzl);
            this.zzt = true;
            this.zzh.removeAllViews();
            this.zzh = null;
        }
        WebChromeClient.CustomViewCallback customViewCallback = this.zzi;
        if (customViewCallback != null) {
            customViewCallback.onCustomViewHidden();
            this.zzi = null;
        }
        this.zzg = false;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzf() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdv();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public void zzh(Bundle bundle) {
        zzr zzrVar;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        this.zzj = bundle != null && bundle.getBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", false);
        try {
            Activity activity = this.zzb;
            AdOverlayInfoParcel adOverlayInfoParcelZza = AdOverlayInfoParcel.zza(activity.getIntent());
            this.zzc = adOverlayInfoParcelZza;
            if (adOverlayInfoParcelZza == null) {
                throw new zzh("Could not get info for ad overlay.");
            }
            if (adOverlayInfoParcelZza.zzw) {
                if (Build.VERSION.SDK_INT >= 28) {
                    activity.setShowWhenLocked(true);
                } else {
                    activity.getWindow().addFlags(524288);
                }
            }
            if (this.zzc.zzm.clientJarVersion > 7500000) {
                this.zzn = 4;
            }
            if (activity.getIntent() != null) {
                this.zzw = activity.getIntent().getBooleanExtra("shouldCallOnOverlayOpened", true);
            }
            AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
            com.google.android.gms.ads.internal.zzl zzlVar = adOverlayInfoParcel.zzo;
            if (zzlVar != null) {
                boolean z10 = zzlVar.zza;
                this.zzk = z10;
                if (z10) {
                    if (adOverlayInfoParcel.zzk != 5 && zzlVar.zzf != -1) {
                        new zzl(this, null).zzb();
                    }
                }
            } else if (adOverlayInfoParcel.zzk == 5) {
                this.zzk = true;
                if (adOverlayInfoParcel.zzk != 5) {
                    new zzl(this, null).zzb();
                }
            } else {
                this.zzk = false;
            }
            if (bundle == null) {
                if (this.zzw) {
                    zzdbs zzdbsVar = this.zzc.zzt;
                    if (zzdbsVar != null) {
                        zzdbsVar.zza();
                    }
                    zzr zzrVar2 = this.zzc.zzc;
                    if (zzrVar2 != null) {
                        zzrVar2.zzh();
                    }
                }
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                if (adOverlayInfoParcel2.zzk != 1) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = adOverlayInfoParcel2.zzb;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                    }
                    zzdjm zzdjmVar = this.zzc.zzu;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                    }
                }
            }
            AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
            if (adOverlayInfoParcel3 != null && (zzrVar = adOverlayInfoParcel3.zzc) != null) {
                zzrVar.zzdo();
            }
            AdOverlayInfoParcel adOverlayInfoParcel4 = this.zzc;
            zzi zziVar = new zzi(activity, adOverlayInfoParcel4.zzn, adOverlayInfoParcel4.zzm.afmaVersion, adOverlayInfoParcel4.zzs);
            this.zzl = zziVar;
            zziVar.setId(1000);
            com.google.android.gms.ads.internal.zzt.zzf().zzj(activity);
            AdOverlayInfoParcel adOverlayInfoParcel5 = this.zzc;
            int i10 = adOverlayInfoParcel5.zzk;
            if (i10 == 1) {
                zzy(false);
                return;
            }
            if (i10 == 2) {
                this.zze = new zzj(adOverlayInfoParcel5.zzd);
                zzy(false);
            } else if (i10 == 3) {
                zzy(true);
            } else {
                if (i10 != 5) {
                    throw new zzh("Could not determine ad overlay type.");
                }
                zzy(false);
            }
        } catch (zzh e10) {
            String message = e10.getMessage();
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi(message);
            this.zzn = 4;
            this.zzb.finish();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzi() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdq();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzj() {
        zzr zzrVar;
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            zzcjl zzcjlVar = this.zzd;
            if (zzcjlVar == null || zzcjlVar.zzX()) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
            } else {
                this.zzd.onResume();
            }
        }
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel == null || (zzrVar = adOverlayInfoParcel.zzc) == null) {
            return;
        }
        zzrVar.zzdp();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzk() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdx();
        }
        zzJ(this.zzb.getResources().getConfiguration());
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue()) {
            return;
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null && !zzcjlVar.zzX()) {
            this.zzd.onResume();
        } else {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The webview does not exist. Ignoring action.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzm(int i10, int i11, Intent intent) {
        zzdxz zzdxzVarZzI;
        AdOverlayInfoParcel adOverlayInfoParcel;
        if (i10 == 236) {
            zzbgv zzbgvVar = zzbhe.zzoD;
            if (((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 66);
                sb2.append("Callback from intent launch with requestCode: 236 and resultCode: ");
                sb2.append(i11);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
                zzcjl zzcjlVar = this.zzd;
                if (zzcjlVar == null || zzcjlVar.zzP() == null || (zzdxzVarZzI = zzcjlVar.zzP().zzI()) == null || (adOverlayInfoParcel = this.zzc) == null || !((Boolean) zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                    return;
                }
                zzdxy zzdxyVarZza = zzdxzVarZzI.zza();
                zzdxyVarZza.zzc("action", "hilca");
                zzdxyVarZza.zzc("gqi", zzgrt.zza(adOverlayInfoParcel.zzq));
                StringBuilder sb3 = new StringBuilder(String.valueOf(i11).length());
                sb3.append(i11);
                zzdxyVarZza.zzc("hilr", sb3.toString());
                if (i11 == -1 && intent != null) {
                    String stringExtra = intent.getStringExtra("callerPackage");
                    String stringExtra2 = intent.getStringExtra("loadingStage");
                    if (stringExtra != null) {
                        zzdxyVarZza.zzc("hilcp", stringExtra);
                    }
                    if (stringExtra2 != null) {
                        zzdxyVarZza.zzc("hills", stringExtra2);
                    }
                }
                zzdxyVarZza.zzf();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzo(Bundle bundle) {
        bundle.putBoolean("com.google.android.gms.ads.internal.overlay.hasResumed", this.zzj);
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzp() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdy();
        }
        if (((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzq() {
        zzr zzrVar;
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdz();
        }
        zzcjl zzcjlVar = this.zzd;
        if (zzcjlVar != null) {
            try {
                this.zzl.removeView(zzcjlVar.zzE());
            } catch (NullPointerException unused) {
            }
        }
        zzA();
    }

    public final void zzr(boolean z10) {
        if (this.zzc.zzw) {
            return;
        }
        int iIntValue = ((Integer) zzbd.zzc().zzd(zzbhe.zzgc)).intValue();
        boolean z11 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbH)).booleanValue() || z10;
        zzt zztVar = new zzt();
        zztVar.zzd = 50;
        zztVar.zza = true != z11 ? 0 : iIntValue;
        zztVar.zzb = true != z11 ? iIntValue : 0;
        zztVar.zzc = iIntValue;
        this.zzf = new zzu(this.zzb, zztVar, this);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(10);
        layoutParams.addRule(true != z11 ? 9 : 11);
        zzt(z10, this.zzc.zzg);
        this.zzl.addView(this.zzf, layoutParams);
        zzK(this.zzf);
    }

    public final void zzt(boolean z10, boolean z11) {
        AdOverlayInfoParcel adOverlayInfoParcel;
        com.google.android.gms.ads.internal.zzl zzlVar;
        AdOverlayInfoParcel adOverlayInfoParcel2;
        com.google.android.gms.ads.internal.zzl zzlVar2;
        boolean z12 = true;
        boolean z13 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbF)).booleanValue() && (adOverlayInfoParcel2 = this.zzc) != null && (zzlVar2 = adOverlayInfoParcel2.zzo) != null && zzlVar2.zzh;
        boolean z14 = ((Boolean) zzbd.zzc().zzd(zzbhe.zzbG)).booleanValue() && (adOverlayInfoParcel = this.zzc) != null && (zzlVar = adOverlayInfoParcel.zzo) != null && zzlVar.zzi;
        if (z10 && z11 && z13 && !z14) {
            new zzbwx(this.zzd, "useCustomClose").zzg("Custom close has been disabled for interstitial ads in this ad slot.");
        }
        zzu zzuVar = this.zzf;
        if (zzuVar != null) {
            if (!z14 && (!z11 || z13)) {
                z12 = false;
            }
            zzuVar.zza(z12);
        }
    }

    public final void zzu(boolean z10) {
        if (z10) {
            this.zzl.setBackgroundColor(0);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
    }

    public final void zzv() {
        this.zzl.removeView(this.zzf);
        zzr(true);
    }

    public final void zzw(int i10) {
        Activity activity = this.zzb;
        if (activity.getApplicationInfo().targetSdkVersion >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgU)).intValue()) {
            if (activity.getApplicationInfo().targetSdkVersion <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgV)).intValue()) {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= ((Integer) zzbd.zzc().zzd(zzbhe.zzgW)).intValue()) {
                    if (i11 <= ((Integer) zzbd.zzc().zzd(zzbhe.zzgX)).intValue()) {
                        return;
                    }
                }
            }
        }
        try {
            activity.setRequestedOrientation(i10);
        } catch (Throwable th2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzh(th2, "AdOverlay.setRequestedOrientation");
        }
    }

    public final void zzx(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        Activity activity = this.zzb;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.zzh = frameLayout;
        frameLayout.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        this.zzh.addView(view, -1, -1);
        activity.setContentView(this.zzh);
        this.zzt = true;
        this.zzi = customViewCallback;
        this.zzg = true;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    public final void zzy(boolean z10) throws zzh {
        boolean z11;
        boolean z12;
        Resources.Theme theme;
        int i10;
        if (!this.zzt) {
            this.zzb.requestWindowFeature(1);
        }
        Activity activity = this.zzb;
        Window window = activity.getWindow();
        if (window == null) {
            throw new zzh("Invalid activity, no window available.");
        }
        zzcjl zzcjlVar = this.zzc.zzd;
        zzclj zzcljVarZzP = zzcjlVar != null ? zzcjlVar.zzP() : null;
        boolean z13 = zzcljVarZzP != null && zzcljVarZzP.zzk();
        this.zzm = false;
        if (z13) {
            int i11 = this.zzc.zzj;
            if (i11 == 6) {
                z11 = activity.getResources().getConfiguration().orientation == 1;
                this.zzm = z11;
            } else if (i11 == 7) {
                z11 = activity.getResources().getConfiguration().orientation == 2;
                this.zzm = z11;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(z11).length() + 41);
        sb2.append("Delay onShow to next orientation change: ");
        sb2.append(z11);
        String string = sb2.toString();
        int i12 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
        zzw(this.zzc.zzj);
        window.setFlags(16777216, 16777216);
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hardware acceleration on the AdActivity window enabled.");
        if (this.zzk) {
            this.zzl.setBackgroundColor(zza);
        } else {
            this.zzl.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        }
        activity.setContentView(this.zzl);
        this.zzt = true;
        if (z10) {
            try {
                com.google.android.gms.ads.internal.zzt.zzd();
                zzcjl zzcjlVar2 = this.zzc.zzd;
                zzclv zzclvVarZzN = zzcjlVar2 != null ? zzcjlVar2.zzN() : null;
                zzcjl zzcjlVar3 = this.zzc.zzd;
                String strZzO = zzcjlVar3 != null ? zzcjlVar3.zzO() : null;
                AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
                VersionInfoParcel versionInfoParcel = adOverlayInfoParcel.zzm;
                zzcjl zzcjlVar4 = adOverlayInfoParcel.zzd;
                z12 = z13;
                com.google.android.gms.ads.internal.zza zzaVarZzk = zzcjlVar4 != null ? zzcjlVar4.zzk() : null;
                theme = null;
                zzcjl zzcjlVarZza = zzckb.zza(activity, zzclvVarZzN, strZzO, true, z13, null, null, versionInfoParcel, null, null, zzaVarZzk, zzbgd.zza(), null, null, null, null, null);
                this.zzd = zzcjlVarZza;
                zzclj zzcljVarZzP2 = zzcjlVarZza.zzP();
                AdOverlayInfoParcel adOverlayInfoParcel2 = this.zzc;
                zzbmx zzbmxVar = adOverlayInfoParcel2.zzp;
                zzbmz zzbmzVar = adOverlayInfoParcel2.zze;
                zzad zzadVar = adOverlayInfoParcel2.zzi;
                zzcjl zzcjlVar5 = adOverlayInfoParcel2.zzd;
                zzcljVarZzP2.zzab(null, zzbmxVar, null, zzbmzVar, zzadVar, true, null, zzcjlVar5 != null ? zzcjlVar5.zzP().zzh() : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
                this.zzd.zzP().zzG(new zzclh() { // from class: com.google.android.gms.ads.internal.overlay.zzg
                    @Override // com.google.android.gms.internal.ads.zzclh
                    public final /* synthetic */ void zza(boolean z14, int i13, String str, String str2) {
                        zzcjl zzcjlVar6 = this.zza.zzd;
                        if (zzcjlVar6 != null) {
                            zzcjlVar6.zzI();
                        }
                    }
                });
                AdOverlayInfoParcel adOverlayInfoParcel3 = this.zzc;
                String str = adOverlayInfoParcel3.zzl;
                if (str != null) {
                    this.zzd.loadUrl(str);
                } else {
                    String str2 = adOverlayInfoParcel3.zzh;
                    if (str2 == null) {
                        throw new zzh("No URL or HTML to display in ad overlay.");
                    }
                    this.zzd.loadDataWithBaseURL(adOverlayInfoParcel3.zzf, str2, "text/html", "UTF-8", null);
                }
                zzcjl zzcjlVar6 = this.zzc.zzd;
                if (zzcjlVar6 != null) {
                    zzcjlVar6.zzan(this);
                }
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Error obtaining webview.", e10);
                throw new zzh("Could not obtain webview for the overlay.", e10);
            }
        } else {
            z12 = z13;
            theme = null;
            zzcjl zzcjlVar7 = this.zzc.zzd;
            this.zzd = zzcjlVar7;
            zzcjlVar7.zzai(this.zzb);
        }
        if (this.zzc.zzw) {
            i10 = 0;
            CookieManager.getInstance().setAcceptThirdPartyCookies(this.zzd.zzD(), false);
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbw)).booleanValue() && Build.VERSION.SDK_INT >= 27) {
                this.zzd.zzD().setTextClassifier(TextClassifier.NO_OP);
            }
            if (((Boolean) zzbd.zzc().zzd(zzbhe.zzbx)).booleanValue()) {
                this.zzd.zzD().setDownloadListener(new DownloadListener() { // from class: com.google.android.gms.ads.internal.overlay.zze
                    @Override // android.webkit.DownloadListener
                    public final /* synthetic */ void onDownloadStart(String str3, String str4, String str5, String str6, long j10) {
                        int i13 = zzm.zza;
                    }
                });
            }
        } else {
            i10 = 0;
        }
        this.zzd.zzae(this);
        zzcjl zzcjlVar8 = this.zzc.zzd;
        if (zzcjlVar8 != null) {
            zzL(zzcjlVar8.zzU(), this.zzl);
        }
        if (this.zzc.zzk != 5) {
            ViewParent parent = this.zzd.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.zzd.zzE());
            }
            if (this.zzk) {
                this.zzd.zzat();
            }
            if (this.zzc.zzw) {
                Toolbar toolbar = new Toolbar(this.zzb);
                this.zzx = toolbar;
                toolbar.setId(View.generateViewId());
                this.zzd.zzE().setId(View.generateViewId());
                this.zzx.setBackgroundColor(-12303292);
                this.zzx.setVisibility(i10);
                try {
                    this.zzx.setNavigationIcon(com.google.android.gms.ads.internal.zzt.zzh().zzf().getDrawable(R.drawable.admob_close_button_white_cross, theme));
                } catch (Resources.NotFoundException | NullPointerException e11) {
                    com.google.android.gms.ads.internal.util.zze.zzb("Error obtaining close icon.", e11);
                }
                this.zzx.setNavigationOnClickListener(this.zzq);
                this.zzx.setTitleMarginStart(i10);
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams.addRule(10);
                this.zzl.addView(this.zzx, layoutParams);
                RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
                layoutParams2.addRule(3, this.zzx.getId());
                layoutParams2.addRule(12);
                this.zzl.addView(this.zzd.zzE(), layoutParams2);
                zzK(this.zzx);
            } else {
                this.zzl.addView(this.zzd.zzE(), -1, -1);
            }
        }
        if (!z10 && !this.zzm) {
            zzD();
        }
        if (this.zzc.zzk != 5) {
            zzr(z12);
            if (this.zzd.zzR()) {
                zzt(z12, true);
                return;
            }
            return;
        }
        Activity activity2 = this.zzb;
        zzejg zzejgVarZze = zzejh.zze();
        zzejgVarZze.zza(activity2);
        zzejgVarZze.zzb(this);
        zzejgVarZze.zzc(this.zzc.zzq);
        zzejgVarZze.zzd(this.zzc.zzr);
        try {
            zzG(zzejgVarZze.zze());
        } catch (RemoteException | zzh e12) {
            throw new zzh(e12.getMessage(), e12);
        }
    }

    public final void zzz(String str) {
        Toolbar toolbar = this.zzx;
        if (toolbar != null) {
            toolbar.setSubtitle(str);
        }
    }

    public zzm(Activity activity) {
        this.zzb = activity;
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzl() {
        zzr zzrVar;
        zzc();
        AdOverlayInfoParcel adOverlayInfoParcel = this.zzc;
        if (adOverlayInfoParcel != null && (zzrVar = adOverlayInfoParcel.zzc) != null) {
            zzrVar.zzdw();
        }
        if (!((Boolean) zzbd.zzc().zzd(zzbhe.zzfZ)).booleanValue() && this.zzd != null && (!this.zzb.isFinishing() || this.zze == null)) {
            this.zzd.onPause();
        }
        zzA();
    }

    @Override // com.google.android.gms.internal.ads.zzbxs
    public final void zzn(IObjectWrapper iObjectWrapper) {
        zzJ((Configuration) ObjectWrapper.unwrap(iObjectWrapper));
    }
}
