package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.RoundedCorner;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.annotation.RequiresApi;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.safedk.android.analytics.brandsafety.ImpressionLog;
import io.bidmachine.iab.vast.tags.VastAttributes;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes.dex */
public final class zzeti implements zzfax {
    private final zzfax zza;
    private final zzfjk zzb;
    private final Context zzc;
    private final zzcdu zzd;

    public zzeti(zzevl zzevlVar, zzfjk zzfjkVar, Context context, zzcdu zzcduVar) {
        this.zza = zzevlVar;
        this.zzb = zzfjkVar;
        this.zzc = context;
        this.zzd = zzcduVar;
    }

    private static final int zze(int i10, float f10) {
        if (f10 == 0.0f) {
            return 0;
        }
        return (int) Math.ceil(i10 / f10);
    }

    private static final Insets zzf(Insets insets, float f10) {
        return f10 == 0.0f ? Insets.NONE : Insets.of((int) Math.ceil(insets.left / f10), (int) Math.ceil(insets.f3822top / f10), (int) Math.ceil(insets.right / f10), (int) Math.ceil(insets.bottom / f10));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 7;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final q5.i zza() {
        return zzgzo.zzk(this.zza.zza(), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzeth
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzc((zzfbg) obj);
            }
        }, zzcei.zzg);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:103:0x0207  */
    /* JADX WARN: Code duplicated, block: B:104:0x0222 A[PHI: r11
  0x0222: PHI (r11v6 androidx.core.graphics.Insets) = 
  (r11v5 androidx.core.graphics.Insets)
  (r11v5 androidx.core.graphics.Insets)
  (r11v10 androidx.core.graphics.Insets)
  (r11v10 androidx.core.graphics.Insets)
  (r11v15 androidx.core.graphics.Insets)
 binds: [B:100:0x01ed, B:106:0x0236, B:108:0x0254, B:110:0x025c, B:103:0x0207] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:105:0x0226  */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:27:0x0070  */
    /* JADX WARN: Code duplicated, block: B:82:0x018e  */
    /* JADX WARN: Code duplicated, block: B:84:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:87:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:97:0x01df  */
    public final /* synthetic */ zzetj zzc(zzfbg zzfbgVar) {
        boolean z10;
        String str;
        int i10;
        int i11;
        int i12;
        float f10;
        String strZzu;
        int iHeight;
        String str2;
        int i13;
        String str3;
        Window window;
        View decorView;
        WindowInsetsCompat rootWindowInsets;
        Insets insetsZzf;
        Insets insets;
        zzetg zzetgVar;
        WindowManager windowManager;
        Insets insetsOf;
        WindowManager windowManager2;
        WindowInsets windowInsets;
        WindowManager windowManager3;
        Context context;
        WindowManager windowManager4;
        Resources resources;
        DisplayMetrics displayMetrics;
        int i14;
        int i15;
        WindowManager windowManager5;
        DisplayMetrics displayMetrics2;
        com.google.android.gms.ads.internal.client.zzr zzrVar = this.zzb.zzf;
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr = zzrVar.zzg;
        if (zzrVarArr != null) {
            boolean z11 = false;
            boolean z12 = false;
            z10 = false;
            str = null;
            for (com.google.android.gms.ads.internal.client.zzr zzrVar2 : zzrVarArr) {
                boolean z13 = zzrVar2.zzi;
                if (!z13 && !z11) {
                    str = zzrVar2.zza;
                    z11 = true;
                }
                if (z13) {
                    if (z12) {
                        z12 = true;
                    } else {
                        z12 = true;
                        z10 = true;
                    }
                }
                if (z11 && z12) {
                    break;
                }
            }
        } else {
            str = zzrVar.zza;
            z10 = zzrVar.zzi;
        }
        Context context2 = this.zzc;
        Resources resources2 = context2.getResources();
        Activity activityZzd = com.google.android.gms.ads.internal.zzt.zzg().zzd();
        if (activityZzd == null) {
            i10 = -1;
        } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoV)).booleanValue()) {
            try {
                i10 = context2.getPackageManager().getActivityInfo(activityZzd.getComponentName(), 0).screenOrientation;
            } catch (PackageManager.NameNotFoundException e10) {
                com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "AdSizeParcelSignal.Source.readOrientationFromManifest");
                i10 = -1;
            }
        } else {
            i10 = -1;
        }
        if (resources2 == null || (displayMetrics2 = resources2.getDisplayMetrics()) == null) {
            i11 = 0;
            i12 = 0;
            f10 = 0.0f;
            strZzu = null;
        } else {
            zzcdu zzcduVar = this.zzd;
            float f11 = displayMetrics2.density;
            i12 = displayMetrics2.widthPixels;
            i11 = displayMetrics2.heightPixels;
            strZzu = zzcduVar.zzo().zzu();
            f10 = f11;
        }
        zzbgv zzbgvVar = zzbhe.zzoS;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() || (i15 = Build.VERSION.SDK_INT) > 34 || i15 < 28 || (windowManager5 = (WindowManager) this.zzc.getSystemService("window")) == null) {
            iHeight = i11;
        } else if (i15 >= 30) {
            WindowMetrics currentWindowMetrics = windowManager5.getCurrentWindowMetrics();
            int iWidth = currentWindowMetrics.getBounds().width();
            iHeight = currentWindowMetrics.getBounds().height();
            i12 = iWidth;
        } else {
            Point point = new Point();
            windowManager5.getDefaultDisplay().getRealSize(point);
            int i16 = point.x;
            i11 = point.y;
            i12 = i16;
            iHeight = i11;
        }
        StringBuilder sb2 = new StringBuilder();
        com.google.android.gms.ads.internal.client.zzr[] zzrVarArr2 = zzrVar.zzg;
        if (zzrVarArr2 != null) {
            int i17 = 0;
            boolean z14 = false;
            while (i17 < zzrVarArr2.length) {
                com.google.android.gms.ads.internal.client.zzr zzrVar3 = zzrVarArr2[i17];
                com.google.android.gms.ads.internal.client.zzr[] zzrVarArr3 = zzrVarArr2;
                if (zzrVar3.zzi) {
                    z14 = true;
                } else {
                    if (sb2.length() != 0) {
                        sb2.append(ImpressionLog.Q);
                    }
                    int i18 = zzrVar3.zze;
                    if (i18 == -1) {
                        i18 = f10 != 0.0f ? (int) (zzrVar3.zzf / f10) : -1;
                    }
                    sb2.append(i18);
                    sb2.append(VastAttributes.HORIZONTAL_POSITION);
                    int i19 = zzrVar3.zzb;
                    if (i19 == -2) {
                        i19 = f10 != 0.0f ? (int) (zzrVar3.zzc / f10) : -2;
                    }
                    sb2.append(i19);
                }
                i17++;
                zzrVarArr2 = zzrVarArr3;
            }
            if (z14) {
                if (sb2.length() != 0) {
                    i14 = 0;
                    sb2.insert(0, ImpressionLog.Q);
                } else {
                    i14 = 0;
                }
                sb2.insert(i14, "320x50");
            }
        }
        String string = sb2.toString();
        zzfjk zzfjkVar = this.zzb;
        int i20 = Build.VERSION.SDK_INT;
        if (i20 >= 35) {
            zzbgv zzbgvVar2 = zzbhe.zzoM;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar2)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoQ)).booleanValue()) {
                    context = this.zzc;
                    windowManager4 = (WindowManager) context.getSystemService("window");
                    if (windowManager4 == null) {
                        i13 = i10;
                    } else {
                        i13 = i10;
                        if (i20 >= 30) {
                            WindowMetrics currentWindowMetrics2 = windowManager4.getCurrentWindowMetrics();
                            int iWidth2 = currentWindowMetrics2.getBounds().width();
                            int iHeight2 = currentWindowMetrics2.getBounds().height();
                            resources = context.getResources();
                            if (resources == null) {
                            }
                        }
                    }
                    str3 = strZzu;
                } else {
                    i13 = i10;
                    str3 = strZzu;
                }
                Context context3 = this.zzc;
                insetsOf = Insets.NONE;
                windowManager2 = (WindowManager) context3.getSystemService("window");
                if (windowManager2 != null) {
                    windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar2)).booleanValue()) {
                        insetsOf = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets$Type.statusBars() | WindowInsets$Type.displayCutout() | WindowInsets$Type.navigationBars() | WindowInsets$Type.captionBar()));
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoN)).booleanValue()) {
                        insetsOf = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets$Type.displayCutout()));
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoO)).booleanValue()) {
                        }
                    }
                    str2 = string;
                } else {
                    str2 = string;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoP)).booleanValue()) {
                    int iMax = Math.max(insetsOf.left, insetsOf.right);
                    insetsOf = Insets.of(iMax, insetsOf.f3822top, iMax, insetsOf.bottom);
                }
                insetsZzf = zzf(insetsOf, f10);
                insets = insetsZzf;
            } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoN)).booleanValue()) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoQ)).booleanValue()) {
                    context = this.zzc;
                    windowManager4 = (WindowManager) context.getSystemService("window");
                    if (windowManager4 == null) {
                        i13 = i10;
                    } else {
                        i13 = i10;
                        if (i20 >= 30) {
                            WindowMetrics currentWindowMetrics3 = windowManager4.getCurrentWindowMetrics();
                            int iWidth3 = currentWindowMetrics3.getBounds().width();
                            int iHeight3 = currentWindowMetrics3.getBounds().height();
                            resources = context.getResources();
                            if (resources == null && (displayMetrics = resources.getDisplayMetrics()) != null) {
                                str3 = strZzu;
                                int i21 = displayMetrics.widthPixels;
                                int i22 = displayMetrics.heightPixels;
                                if (iWidth3 > i21 || iHeight3 > i22) {
                                    str2 = string;
                                }
                            }
                        }
                    }
                    str3 = strZzu;
                } else {
                    i13 = i10;
                    str3 = strZzu;
                }
                Context context4 = this.zzc;
                insetsOf = Insets.NONE;
                windowManager2 = (WindowManager) context4.getSystemService("window");
                if (windowManager2 != null) {
                    windowInsets = windowManager2.getCurrentWindowMetrics().getWindowInsets();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar2)).booleanValue()) {
                        insetsOf = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets$Type.statusBars() | WindowInsets$Type.displayCutout() | WindowInsets$Type.navigationBars() | WindowInsets$Type.captionBar()));
                    } else if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoN)).booleanValue()) {
                        insetsOf = Insets.toCompatInsets(windowInsets.getInsets(WindowInsets$Type.displayCutout()));
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoO)).booleanValue() && (windowManager3 = (WindowManager) context4.getSystemService("window")) != null) {
                            WindowInsets windowInsets2 = windowManager3.getCurrentWindowMetrics().getWindowInsets();
                            int iZzd = zzd(windowInsets2, 0);
                            int iZzd2 = zzd(windowInsets2, 1);
                            str2 = string;
                            int iZzd3 = zzd(windowInsets2, 3);
                            int iZzd4 = zzd(windowInsets2, 2);
                            insetsOf = iHeight >= i12 ? Insets.of(insetsOf.left, Math.max(insetsOf.f3822top, Math.max(iZzd, iZzd2)), insetsOf.right, Math.max(insetsOf.bottom, Math.max(iZzd3, iZzd4))) : Insets.of(Math.max(insetsOf.left, Math.max(iZzd, iZzd3)), insetsOf.f3822top, Math.max(insetsOf.right, Math.max(iZzd2, iZzd4)), insetsOf.bottom);
                        }
                    }
                    str2 = string;
                } else {
                    str2 = string;
                }
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoP)).booleanValue() && iHeight < i12) {
                    int iMax2 = Math.max(insetsOf.left, insetsOf.right);
                    insetsOf = Insets.of(iMax2, insetsOf.f3822top, iMax2, insetsOf.bottom);
                }
                insetsZzf = zzf(insetsOf, f10);
                insets = insetsZzf;
            } else {
                str2 = string;
                i13 = i10;
                str3 = strZzu;
            }
            insets = null;
        } else {
            str2 = string;
            i13 = i10;
            str3 = strZzu;
            if (i20 > 34 || i20 < 28 || !((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                insets = null;
            } else {
                Insets insets2 = Insets.NONE;
                if (i20 >= 30) {
                    WindowManager windowManager6 = (WindowManager) this.zzc.getSystemService("window");
                    if (windowManager6 != null) {
                        insets2 = Insets.toCompatInsets(windowManager6.getCurrentWindowMetrics().getWindowInsets().getInsets(WindowInsets$Type.statusBars() | WindowInsets$Type.displayCutout() | WindowInsets$Type.navigationBars() | WindowInsets$Type.captionBar()));
                    }
                } else {
                    Activity activityZzd2 = com.google.android.gms.ads.internal.zzt.zzg().zzd();
                    if (activityZzd2 != null && (window = activityZzd2.getWindow()) != null && (decorView = window.getDecorView()) != null && (rootWindowInsets = ViewCompat.getRootWindowInsets(decorView)) != null) {
                        insets2 = rootWindowInsets.getInsets(WindowInsetsCompat.Type.systemBars() | WindowInsetsCompat.Type.displayCutout());
                    }
                }
                insetsZzf = zzf(insets2, f10);
                insets = insetsZzf;
            }
        }
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzoR)).booleanValue() || i20 < 31 || f10 == 0.0f || (windowManager = (WindowManager) this.zzc.getSystemService("window")) == null) {
            zzetgVar = null;
        } else {
            WindowInsets windowInsets3 = windowManager.getCurrentWindowMetrics().getWindowInsets();
            zzetgVar = new zzetg(zze(zzd(windowInsets3, 0), f10), zze(zzd(windowInsets3, 1), f10), zze(zzd(windowInsets3, 3), f10), zze(zzd(windowInsets3, 2), f10));
        }
        return new zzetj(zzrVar, str, z10, str2, f10, i12, iHeight, str3, i13, zzfjkVar.zzr, insets, zzetgVar);
    }

    @RequiresApi(api = 31)
    private static final int zzd(WindowInsets windowInsets, int i10) {
        RoundedCorner roundedCorner = windowInsets.getRoundedCorner(i10);
        if (roundedCorner != null) {
            return roundedCorner.getRadius();
        }
        return 0;
    }
}
