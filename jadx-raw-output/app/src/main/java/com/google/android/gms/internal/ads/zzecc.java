package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import android.view.ViewGroup;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.OutOfContextTestingActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes6.dex */
public final class zzecc extends com.google.android.gms.ads.internal.client.zzdv {

    @VisibleForTesting
    public final Map zza = new HashMap();
    private final Context zzb;
    private final WeakReference zzc;
    private final zzebq zzd;
    private final zzgzy zze;
    private zzebf zzf;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzj, reason: merged with bridge method [inline-methods] */
    public final synchronized void zzg(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzebx(this), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OutOfContextTester.setAdAsOutOfContext");
            this.zzd.zzn();
        }
    }

    private final synchronized void zzk(String str) {
        try {
            zzgzo.zzr(this.zzf.zzn(str), new zzeby(this), this.zze);
        } catch (NullPointerException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "OutOfContextTester.setAdAsShown");
            this.zzd.zzn();
        }
    }

    public final void zzb(zzebf zzebfVar) {
        this.zzf = zzebfVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final synchronized void zzc(zzecd zzecdVar) {
        byte b10;
        String strZzb = zzecdVar.zzb();
        switch (strZzb.hashCode()) {
            case -1999289321:
                if (!strZzb.equals("NATIVE")) {
                    b10 = -1;
                } else {
                    b10 = 3;
                }
                break;
            case -1372958932:
                if (!strZzb.equals("INTERSTITIAL")) {
                    b10 = -1;
                } else {
                    b10 = 2;
                }
                break;
            case -428325382:
                if (!strZzb.equals("APP_OPEN_AD")) {
                    b10 = -1;
                } else {
                    b10 = 0;
                }
                break;
            case 543046670:
                if (!strZzb.equals(BrandSafetyUtils.f43548k)) {
                    b10 = -1;
                } else {
                    b10 = 4;
                }
                break;
            case 1854800829:
                if (!strZzb.equals("REWARDED_INTERSTITIAL")) {
                    b10 = -1;
                } else {
                    b10 = 5;
                }
                break;
            case 1951953708:
                if (!strZzb.equals("BANNER")) {
                    b10 = -1;
                } else {
                    b10 = 1;
                }
                break;
            default:
                b10 = -1;
                break;
        }
        if (b10 == 0) {
            String strZza = zzecdVar.zza();
            AppOpenAd.load(zzl(), strZza, zzecdVar.zzc(), new zzebr(this, strZza));
            return;
        }
        if (b10 == 1) {
            String strZza2 = zzecdVar.zza();
            zzbgv zzbgvVar = zzbhe.zzkQ;
            BaseAdView adManagerAdView = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg()) ? new AdManagerAdView(zzl()) : new AdView(zzl());
            adManagerAdView.setAdSize(zzecdVar.zzd());
            adManagerAdView.setAdUnitId(strZza2);
            adManagerAdView.setAdListener(new zzebs(this, strZza2, adManagerAdView));
            VideoOptions videoOptionsZzf = zzecdVar.zzf();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && zzecdVar.zzg() && videoOptionsZzf != null) {
                ((AdManagerAdView) adManagerAdView).setVideoOptions(videoOptionsZzf);
            }
            adManagerAdView.loadAd(zzecdVar.zzc());
            return;
        }
        if (b10 == 2) {
            String strZza3 = zzecdVar.zza();
            InterstitialAd.load(zzl(), strZza3, zzecdVar.zzc(), new zzebt(this, strZza3));
            return;
        }
        if (b10 != 3) {
            if (b10 == 4) {
                String strZza4 = zzecdVar.zza();
                RewardedAd.load(zzl(), strZza4, zzecdVar.zzc(), new zzebu(this, strZza4));
                return;
            } else {
                if (b10 != 5) {
                    return;
                }
                String strZza5 = zzecdVar.zza();
                RewardedInterstitialAd.load(zzl(), strZza5, zzecdVar.zzc(), new zzebv(this, strZza5));
                return;
            }
        }
        final String strZza6 = zzecdVar.zza();
        AdLoader.Builder builder = new AdLoader.Builder(zzl(), strZza6);
        builder.forNativeAd(new NativeAd.OnNativeAdLoadedListener() { // from class: com.google.android.gms.internal.ads.zzeca
            @Override // com.google.android.gms.ads.nativead.NativeAd.OnNativeAdLoadedListener
            public final /* synthetic */ void onNativeAdLoaded(NativeAd nativeAd) {
                this.zza.zzf(strZza6, nativeAd);
            }
        });
        builder.withAdListener(new zzebw(this));
        NativeAdOptions nativeAdOptionsZze = zzecdVar.zze();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkQ)).booleanValue() && nativeAdOptionsZze != null) {
            builder.withNativeAdOptions(nativeAdOptionsZze);
        }
        builder.build().loadAd(zzecdVar.zzc());
    }

    public final synchronized void zzd(String str) {
        Map map;
        Object obj;
        Activity activityZzo = this.zzd.zzo();
        if (activityZzo != null && (obj = (map = this.zza).get(str)) != null) {
            zzbgv zzbgvVar = zzbhe.zzkP;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() || (obj instanceof AppOpenAd) || (obj instanceof InterstitialAd) || (obj instanceof RewardedAd) || (obj instanceof RewardedInterstitialAd)) {
                map.remove(str);
            }
            zzk(zzm(obj));
            if (obj instanceof AppOpenAd) {
                ((AppOpenAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof InterstitialAd) {
                ((InterstitialAd) obj).show(activityZzo);
                return;
            }
            if (obj instanceof RewardedAd) {
                ((RewardedAd) obj).show(activityZzo, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzecb
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (obj instanceof RewardedInterstitialAd) {
                ((RewardedInterstitialAd) obj).show(activityZzo, new OnUserEarnedRewardListener() { // from class: com.google.android.gms.internal.ads.zzebz
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public final /* synthetic */ void onUserEarnedReward(RewardItem rewardItem) {
                    }
                });
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue() && ((obj instanceof AdView) || (obj instanceof NativeAd))) {
                Intent intent = new Intent();
                Context contextZzl = zzl();
                intent.setClassName(contextZzl, OutOfContextTestingActivity.CLASS_NAME);
                intent.putExtra("adUnit", str);
                com.google.android.gms.ads.internal.zzt.zzc();
                com.google.android.gms.ads.internal.util.zzs.zzaa(contextZzl, intent);
            }
        }
    }

    public final synchronized void zzf(String str, Object obj) {
        this.zza.put(str, obj);
        zzg(zzm(obj));
    }

    public final /* synthetic */ zzebq zzi() {
        return this.zzd;
    }

    private final Context zzl() {
        Context context = (Context) this.zzc.get();
        return context == null ? this.zzb : context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzm(Object obj) {
        ResponseInfo responseInfo;
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzd;
        if (obj instanceof LoadAdError) {
            responseInfo = ((LoadAdError) obj).getResponseInfo();
        } else if (obj instanceof AppOpenAd) {
            responseInfo = ((AppOpenAd) obj).getResponseInfo();
        } else if (obj instanceof InterstitialAd) {
            responseInfo = ((InterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedAd) {
            responseInfo = ((RewardedAd) obj).getResponseInfo();
        } else if (obj instanceof RewardedInterstitialAd) {
            responseInfo = ((RewardedInterstitialAd) obj).getResponseInfo();
        } else if (obj instanceof AdView) {
            responseInfo = ((AdView) obj).getResponseInfo();
        } else {
            if (!(obj instanceof NativeAd)) {
                return "";
            }
            responseInfo = ((NativeAd) obj).getResponseInfo();
        }
        if (responseInfo == null || (zzeaVarZzd = responseInfo.zzd()) == null) {
            return "";
        }
        try {
            return zzeaVarZzd.zzj();
        } catch (RemoteException unused) {
            return "";
        }
    }

    public zzecc(Context context, WeakReference weakReference, zzebq zzebqVar, zzece zzeceVar, zzgzy zzgzyVar) {
        this.zzb = context;
        this.zzc = weakReference;
        this.zzd = zzebqVar;
        this.zze = zzgzyVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdw
    public final void zze(String str, IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        ViewGroup viewGroup = (ViewGroup) ObjectWrapper.unwrap(iObjectWrapper2);
        if (context != null && viewGroup != null) {
            Map map = this.zza;
            Object obj = map.get(str);
            if (obj != null) {
                map.remove(str);
            }
            if (obj instanceof AdView) {
                zzece.zza(context, viewGroup, (AdView) obj);
            } else if (obj instanceof NativeAd) {
                zzece.zzb(context, viewGroup, (NativeAd) obj);
            }
        }
    }
}
