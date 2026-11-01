package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import com.ironsource.C3426d4;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzbwr extends zzbwx {
    private String zza;
    private boolean zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private final Object zzi;
    private final zzcjl zzj;
    private final Activity zzk;
    private zzclv zzl;
    private ImageView zzm;
    private LinearLayout zzn;
    private final zzbwy zzo;
    private PopupWindow zzp;
    private RelativeLayout zzq;
    private ViewGroup zzr;

    public final void zze(int i10, int i11) {
        this.zzc = i10;
        this.zzd = i11;
    }

    static {
        CollectionUtils.setOf(C3426d4.e.f28477c, C3426d4.e.f28476b, "top-center", "center", C3426d4.e.f28479e, C3426d4.e.f28478d, "bottom-center");
    }

    public zzbwr(zzcjl zzcjlVar, zzbwy zzbwyVar) {
        super(zzcjlVar, "resize");
        this.zza = C3426d4.e.f28476b;
        this.zzb = true;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = -1;
        this.zzf = 0;
        this.zzg = 0;
        this.zzh = -1;
        this.zzi = new Object();
        this.zzj = zzcjlVar;
        this.zzk = zzcjlVar.zzj();
        this.zzo = zzbwyVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: zzm, reason: merged with bridge method [inline-methods] */
    public final void zzf(boolean z10) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmn)).booleanValue()) {
            this.zzq.removeView((View) this.zzj);
            this.zzp.dismiss();
        } else {
            this.zzp.dismiss();
            this.zzq.removeView((View) this.zzj);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmo)).booleanValue()) {
            View view = (View) this.zzj;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.zzr;
        if (viewGroup != null) {
            viewGroup.removeView(this.zzm);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmp)).booleanValue()) {
                try {
                    ViewGroup viewGroup2 = this.zzr;
                    zzcjl zzcjlVar = this.zzj;
                    viewGroup2.addView((View) zzcjlVar);
                    zzcjlVar.zzaf(this.zzl);
                } catch (IllegalStateException e10) {
                    int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzg("Unable to add webview back to view hierarchy.", e10);
                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "MraidCallResizeHandler.collapseInternal");
                }
            } else {
                ViewGroup viewGroup3 = this.zzr;
                zzcjl zzcjlVar2 = this.zzj;
                viewGroup3.addView((View) zzcjlVar2);
                zzcjlVar2.zzaf(this.zzl);
            }
        }
        if (z10) {
            zzk("default");
            zzbwy zzbwyVar = this.zzo;
            if (zzbwyVar != null) {
                zzbwyVar.zzb();
            }
        }
        this.zzp = null;
        this.zzq = null;
        this.zzr = null;
        this.zzn = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        int i10;
        byte b10;
        int i11;
        int i12;
        int i13;
        int i14;
        synchronized (this.zzi) {
            Activity activity = this.zzk;
            if (activity == null) {
                zzg("Not an activity context. Cannot resize.");
                return;
            }
            zzcjl zzcjlVar = this.zzj;
            if (zzcjlVar.zzN() == null) {
                zzg("Webview is not yet available, size is not set.");
                return;
            }
            if (zzcjlVar.zzN().zzg()) {
                zzg("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (zzcjlVar.zzW()) {
                zzg("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("width"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzh = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("width"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("height"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zze = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("height"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzf = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetX"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzt.zzc();
                this.zzg = com.google.android.gms.ads.internal.util.zzs.zzU((String) map.get("offsetY"));
            }
            if (!TextUtils.isEmpty((CharSequence) map.get("allowOffscreen"))) {
                this.zzb = Boolean.parseBoolean((String) map.get("allowOffscreen"));
            }
            String str = (String) map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zza = str;
            }
            if (this.zzh < 0 || this.zze < 0) {
                zzg("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = activity.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzac = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                com.google.android.gms.ads.internal.zzt.zzc();
                int[] iArrZzY = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                int i15 = iArrZzac[0];
                int i16 = iArrZzac[1];
                int i17 = this.zzh;
                int[] iArr = null;
                if (i17 < 50 || i17 > i15) {
                    int i18 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Width is too small or too large.");
                } else {
                    int i19 = this.zze;
                    if (i19 < 50 || i19 > i16) {
                        int i20 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Height is too small or too large.");
                    } else if (i19 == i16 && i17 == i15) {
                        int i21 = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzi("Cannot resize to a full-screen ad.");
                    } else if (this.zzb) {
                        switch (this.zza) {
                            case "center":
                                b10 = 2;
                                break;
                            case "top-left":
                                b10 = 0;
                                break;
                            case "bottom-left":
                                b10 = 3;
                                break;
                            case "bottom-right":
                                b10 = 5;
                                break;
                            case "bottom-center":
                                b10 = 4;
                                break;
                            case "top-center":
                                b10 = 1;
                                break;
                            default:
                                b10 = -1;
                                break;
                        }
                        if (b10 == 0) {
                            i11 = this.zzc + this.zzf;
                            i12 = this.zzd;
                        } else if (b10 != 1) {
                            if (b10 != 2) {
                                if (b10 == 3) {
                                    i11 = this.zzc + this.zzf;
                                    i14 = this.zzd;
                                } else if (b10 == 4) {
                                    i11 = ((this.zzc + this.zzf) + (i17 >> 1)) - 25;
                                    i14 = this.zzd;
                                } else if (b10 != 5) {
                                    i11 = ((this.zzc + this.zzf) + i17) - 50;
                                    i12 = this.zzd;
                                } else {
                                    i11 = ((this.zzc + this.zzf) + i17) - 50;
                                    i14 = this.zzd;
                                }
                                i13 = ((i14 + this.zzg) + i19) - 50;
                            } else {
                                i11 = ((this.zzc + this.zzf) + (i17 >> 1)) - 25;
                                i13 = ((this.zzd + this.zzg) + (i19 >> 1)) - 25;
                            }
                            if (i11 >= 0 && i11 + 50 <= i15 && i13 >= iArrZzY[0] && i13 + 50 <= iArrZzY[1]) {
                                iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                            }
                        } else {
                            i11 = ((this.zzc + this.zzf) + (i17 >> 1)) - 25;
                            i12 = this.zzd;
                        }
                        i13 = i12 + this.zzg;
                        if (i11 >= 0) {
                            iArr = new int[]{this.zzc + this.zzf, this.zzd + this.zzg};
                        }
                    } else {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        int[] iArrZzac2 = com.google.android.gms.ads.internal.util.zzs.zzac(activity);
                        com.google.android.gms.ads.internal.zzt.zzc();
                        int[] iArrZzY2 = com.google.android.gms.ads.internal.util.zzs.zzY(activity);
                        int i22 = iArrZzac2[0];
                        int i23 = this.zzc + this.zzf;
                        int i24 = this.zzd + this.zzg;
                        if (i23 < 0) {
                            i10 = 0;
                        } else {
                            int i25 = this.zzh;
                            i10 = i23 + i25 > i22 ? i22 - i25 : i23;
                        }
                        int i26 = iArrZzY2[0];
                        if (i24 < i26) {
                            i24 = i26;
                        } else {
                            int i27 = this.zze;
                            int i28 = i24 + i27;
                            int i29 = iArrZzY2[1];
                            if (i28 > i29) {
                                i24 = i29 - i27;
                            }
                        }
                        iArr = new int[]{i10, i24};
                    }
                }
                if (iArr == null) {
                    zzg("Resize location out of screen or close button is not visible.");
                    return;
                }
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int iZzC = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zzh);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int iZzC2 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, this.zze);
                ViewParent parent = ((View) zzcjlVar).getParent();
                if (!(parent instanceof ViewGroup)) {
                    zzg("Webview is detached, probably in the middle of a resize or expand.");
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                viewGroup.removeView((View) zzcjlVar);
                PopupWindow popupWindow = this.zzp;
                if (popupWindow == null) {
                    this.zzr = viewGroup;
                    com.google.android.gms.ads.internal.zzt.zzc();
                    ((View) zzcjlVar).setDrawingCacheEnabled(true);
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(((View) zzcjlVar).getDrawingCache());
                    ((View) zzcjlVar).setDrawingCacheEnabled(false);
                    ImageView imageView = new ImageView(activity);
                    this.zzm = imageView;
                    imageView.setImageBitmap(bitmapCreateBitmap);
                    this.zzl = zzcjlVar.zzN();
                    this.zzr.addView(this.zzm);
                } else {
                    popupWindow.dismiss();
                }
                RelativeLayout relativeLayout = new RelativeLayout(activity);
                this.zzq = relativeLayout;
                relativeLayout.setBackgroundColor(0);
                this.zzq.setLayoutParams(new ViewGroup.LayoutParams(iZzC, iZzC2));
                com.google.android.gms.ads.internal.zzt.zzc();
                PopupWindow popupWindow2 = new PopupWindow((View) this.zzq, iZzC, iZzC2, false);
                this.zzp = popupWindow2;
                popupWindow2.setOutsideTouchable(false);
                this.zzp.setTouchable(true);
                this.zzp.setClippingEnabled(!this.zzb);
                byte b11 = -1;
                this.zzq.addView((View) zzcjlVar, -1, -1);
                this.zzn = new LinearLayout(activity);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                int iZzC3 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50);
                com.google.android.gms.ads.internal.client.zzbb.zza();
                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iZzC3, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, 50));
                String str2 = this.zza;
                switch (str2.hashCode()) {
                    case -1364013995:
                        if (str2.equals("center")) {
                            b11 = 2;
                        }
                        break;
                    case -1012429441:
                        if (str2.equals(C3426d4.e.f28477c)) {
                            b11 = 0;
                        }
                        break;
                    case -655373719:
                        if (str2.equals(C3426d4.e.f28479e)) {
                            b11 = 3;
                        }
                        break;
                    case 1163912186:
                        if (str2.equals(C3426d4.e.f28478d)) {
                            b11 = 5;
                        }
                        break;
                    case 1288627767:
                        if (str2.equals("bottom-center")) {
                            b11 = 4;
                        }
                        break;
                    case 1755462605:
                        if (str2.equals("top-center")) {
                            b11 = 1;
                        }
                        break;
                }
                if (b11 == 0) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(9);
                } else if (b11 == 1) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(14);
                } else if (b11 == 2) {
                    layoutParams.addRule(13);
                } else if (b11 == 3) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(9);
                } else if (b11 == 4) {
                    layoutParams.addRule(12);
                    layoutParams.addRule(14);
                } else if (b11 != 5) {
                    layoutParams.addRule(10);
                    layoutParams.addRule(11);
                } else {
                    layoutParams.addRule(12);
                    layoutParams.addRule(11);
                }
                this.zzn.setOnClickListener(new zzbwp(this));
                this.zzn.setContentDescription("Close button");
                this.zzq.addView(this.zzn, layoutParams);
                try {
                    PopupWindow popupWindow3 = this.zzp;
                    View decorView = window.getDecorView();
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    int iZzC4 = com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[0]);
                    com.google.android.gms.ads.internal.client.zzbb.zza();
                    popupWindow3.showAtLocation(decorView, 0, iZzC4, com.google.android.gms.ads.internal.util.client.zzf.zzC(activity, iArr[1]));
                    int i30 = iArr[0];
                    int i31 = iArr[1];
                    zzbwy zzbwyVar = this.zzo;
                    if (zzbwyVar != null) {
                        zzbwyVar.zza(i30, i31, this.zzh, this.zze);
                    }
                    this.zzj.zzaf(zzclv.zzc(iZzC, iZzC2));
                    int i32 = iArr[0];
                    int i33 = iArr[1];
                    com.google.android.gms.ads.internal.zzt.zzc();
                    zzi(i32, i33 - com.google.android.gms.ads.internal.util.zzs.zzY(this.zzk)[0], this.zzh, this.zze);
                    zzk("resized");
                    return;
                } catch (RuntimeException e10) {
                    String message = e10.getMessage();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(message).length() + 26);
                    sb2.append("Cannot show popup window: ");
                    sb2.append(message);
                    zzg(sb2.toString());
                    RelativeLayout relativeLayout2 = this.zzq;
                    zzcjl zzcjlVar2 = this.zzj;
                    relativeLayout2.removeView((View) zzcjlVar2);
                    ViewGroup viewGroup2 = this.zzr;
                    if (viewGroup2 != null) {
                        viewGroup2.removeView(this.zzm);
                        this.zzr.addView((View) zzcjlVar2);
                        zzcjlVar2.zzaf(this.zzl);
                    }
                    return;
                }
            }
            zzg("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzb(final boolean z10) {
        synchronized (this.zzi) {
            if (this.zzp != null) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmm)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                    zzf(z10);
                } else {
                    zzcei.zzf.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbwq
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.zza.zzf(z10);
                        }
                    });
                }
            }
        }
    }

    public final void zzc(int i10, int i11, boolean z10) {
        synchronized (this.zzi) {
            this.zzc = i10;
            this.zzd = i11;
        }
    }

    public final boolean zzd() {
        boolean z10;
        synchronized (this.zzi) {
            z10 = this.zzp != null;
        }
        return z10;
    }
}
