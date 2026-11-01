package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
public final class zzdqc {
    private final zzduv zza;
    private final zzdtk zzb;
    private ViewTreeObserver.OnScrollChangedListener zzc = null;

    public zzdqc(zzduv zzduvVar, zzdtk zzdtkVar) {
        this.zza = zzduvVar;
        this.zzb = zzdtkVar;
    }

    public final View zza(@NonNull final View view, @NonNull final WindowManager windowManager) throws zzcka {
        zzcjl zzcjlVarZza = this.zza.zza(com.google.android.gms.ads.internal.client.zzr.zzb(), null, null);
        zzcjlVarZza.zzE().setVisibility(4);
        zzcjlVarZza.zzE().setContentDescription("policy_validator");
        zzcjlVarZza.zzab("/sendMessageToSdk", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdqb
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzb((zzcjl) obj, map);
            }
        });
        zzcjlVarZza.zzab("/hideValidatorOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpw
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzc(windowManager, view, (zzcjl) obj, map);
            }
        });
        zzcjlVarZza.zzab("/open", new zzbou(null, null, null, null, null, null));
        WeakReference weakReference = new WeakReference(zzcjlVarZza);
        zzboh zzbohVar = new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpx
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                this.zza.zzd(view, windowManager, (zzcjl) obj, map);
            }
        };
        zzdtk zzdtkVar = this.zzb;
        zzdtkVar.zzh(weakReference, "/loadNativeAdPolicyViolations", zzbohVar);
        zzdtkVar.zzh(new WeakReference(zzcjlVarZza), "/showValidatorOverlay", new zzboh() { // from class: com.google.android.gms.internal.ads.zzdpy
            @Override // com.google.android.gms.internal.ads.zzboh
            public final /* synthetic */ void zza(Object obj, Map map) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzd("Show native ad policy validator overlay.");
                ((zzcjl) obj).zzE().setVisibility(0);
            }
        });
        return zzcjlVarZza.zzE();
    }

    public final /* synthetic */ void zzb(zzcjl zzcjlVar, Map map) {
        this.zzb.zzf("sendMessageToNativeJs", map);
    }

    public final /* synthetic */ void zzc(WindowManager windowManager, View view, zzcjl zzcjlVar, Map map) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Hide native ad policy validator overlay.");
        zzcjlVar.zzE().setVisibility(8);
        if (zzcjlVar.zzE().getWindowToken() != null) {
            windowManager.removeView(zzcjlVar.zzE());
        }
        zzcjlVar.destroy();
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (this.zzc == null || viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            return;
        }
        viewTreeObserver.removeOnScrollChangedListener(this.zzc);
    }

    public final /* synthetic */ void zze(Map map, boolean z10, int i10, String str, String str2) {
        HashMap map2 = new HashMap();
        map2.put("messageType", "validatorHtmlLoaded");
        map2.put("id", (String) map.get("id"));
        this.zzb.zzf("sendMessageToNativeJs", map2);
    }

    private static final int zzf(Context context, String str, int i10) {
        try {
            i10 = Integer.parseInt(str);
        } catch (NumberFormatException unused) {
        }
        com.google.android.gms.ads.internal.client.zzbb.zza();
        return com.google.android.gms.ads.internal.util.client.zzf.zzC(context, i10);
    }

    public final /* synthetic */ void zzd(final View view, final WindowManager windowManager, final zzcjl zzcjlVar, final Map map) {
        int i10;
        zzcjlVar.zzP().zzG(new zzclh() { // from class: com.google.android.gms.internal.ads.zzdqa
            @Override // com.google.android.gms.internal.ads.zzclh
            public final /* synthetic */ void zza(boolean z10, int i11, String str, String str2) {
                this.zza.zze(map, z10, i11, str, str2);
            }
        });
        if (map != null) {
            Context context = view.getContext();
            int iZzf = zzf(context, (String) map.get("validator_width"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjs)).intValue());
            int iZzf2 = zzf(context, (String) map.get("validator_height"), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjt)).intValue());
            int iZzf3 = zzf(context, (String) map.get("validator_x"), 0);
            int iZzf4 = zzf(context, (String) map.get("validator_y"), 0);
            zzcjlVar.zzaf(zzclv.zzc(iZzf, iZzf2));
            try {
                zzcjlVar.zzD().getSettings().setUseWideViewPort(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzju)).booleanValue());
                zzcjlVar.zzD().getSettings().setLoadWithOverviewMode(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzjv)).booleanValue());
            } catch (NullPointerException unused) {
            }
            final WindowManager.LayoutParams layoutParamsZzk = com.google.android.gms.ads.internal.util.zzbs.zzk();
            layoutParamsZzk.x = iZzf3;
            layoutParamsZzk.y = iZzf4;
            windowManager.updateViewLayout(zzcjlVar.zzE(), layoutParamsZzk);
            final String str = (String) map.get("orientation");
            Rect rect = new Rect();
            if (view.getGlobalVisibleRect(rect)) {
                if (!"1".equals(str) && !"2".equals(str)) {
                    i10 = rect.top;
                } else {
                    i10 = rect.bottom;
                }
                final int i11 = i10 - iZzf4;
                this.zzc = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.google.android.gms.internal.ads.zzdpz
                    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                    public final /* synthetic */ void onScrollChanged() {
                        Rect rect2 = new Rect();
                        if (view.getGlobalVisibleRect(rect2)) {
                            zzcjl zzcjlVar2 = zzcjlVar;
                            if (zzcjlVar2.zzE().getWindowToken() == null) {
                                return;
                            }
                            int i12 = i11;
                            WindowManager.LayoutParams layoutParams = layoutParamsZzk;
                            String str2 = str;
                            if ("1".equals(str2) || "2".equals(str2)) {
                                layoutParams.y = rect2.bottom - i12;
                            } else {
                                layoutParams.y = rect2.top - i12;
                            }
                            windowManager.updateViewLayout(zzcjlVar2.zzE(), layoutParams);
                        }
                    }
                };
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.addOnScrollChangedListener(this.zzc);
                }
            }
            String str2 = (String) map.get("overlay_url");
            if (!TextUtils.isEmpty(str2)) {
                zzcjlVar.loadUrl(str2);
            }
        }
    }
}
