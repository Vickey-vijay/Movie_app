package com.google.android.gms.ads.nonagon.signalgeneration;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.browser.customtabs.CustomTabsClient;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzazh;
import com.google.android.gms.internal.ads.zzazi;
import com.google.android.gms.internal.ads.zzbgv;
import com.google.android.gms.internal.ads.zzbhe;
import com.google.android.gms.internal.ads.zzbij;
import com.google.android.gms.internal.ads.zzbix;
import com.google.android.gms.internal.ads.zzbjj;
import com.google.android.gms.internal.ads.zzbyh;
import com.google.android.gms.internal.ads.zzbyk;
import com.google.android.gms.internal.ads.zzcda;
import com.google.android.gms.internal.ads.zzcdc;
import com.google.android.gms.internal.ads.zzcdh;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcma;
import com.google.android.gms.internal.ads.zzdan;
import com.google.android.gms.internal.ads.zzdhe;
import com.google.android.gms.internal.ads.zzdtk;
import com.google.android.gms.internal.ads.zzdxh;
import com.google.android.gms.internal.ads.zzdye;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjo;
import com.google.android.gms.internal.ads.zzfkj;
import com.google.android.gms.internal.ads.zzfoe;
import com.google.android.gms.internal.ads.zzfoo;
import com.google.android.gms.internal.ads.zzfor;
import com.google.android.gms.internal.ads.zzfqk;
import com.google.android.gms.internal.ads.zzgqt;
import com.google.android.gms.internal.ads.zzgrt;
import com.google.android.gms.internal.ads.zzgyv;
import com.google.android.gms.internal.ads.zzgyw;
import com.google.android.gms.internal.ads.zzgzg;
import com.google.android.gms.internal.ads.zzgzo;
import com.google.android.gms.internal.ads.zzgzy;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;
import q5.i;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzau extends zzcdc {
    public static final List zza = new ArrayList(Arrays.asList("/aclk", "/pcs/click", "/dbm/clk"));
    public static final List zzb = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com"));
    public static final List zzc = new ArrayList(Arrays.asList("/pagead/adview", "/pcs/view", "/pagead/conversion", "/dbm/ad"));
    public static final List zzd = new ArrayList(Arrays.asList(".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"));
    public static final /* synthetic */ int zze = 0;
    private final List zzB;
    private final List zzC;
    private final List zzD;
    private final List zzE;
    private final zzbij zzI;
    private final zzo zzJ;
    private final zzf zzK;
    private final zzcma zzf;
    private Context zzg;
    private final zzazh zzh;
    private final zzfjo zzi;
    private final zzfkj zzj;
    private final zzgzy zzk;
    private final ScheduledExecutorService zzl;

    @Nullable
    private zzbyk zzm;
    private final zzdye zzp;
    private final zzfqk zzq;
    private final VersionInfoParcel zzy;
    private String zzz;
    private Point zzn = new Point();
    private Point zzo = new Point();
    private final AtomicInteger zzx = new AtomicInteger(0);
    private final AtomicBoolean zzF = new AtomicBoolean(false);
    private final AtomicBoolean zzG = new AtomicBoolean(false);
    private final AtomicInteger zzH = new AtomicInteger(0);
    private final boolean zzr = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzii)).booleanValue();
    private final boolean zzs = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzih)).booleanValue();
    private final boolean zzt = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzik)).booleanValue();
    private final boolean zzu = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzim)).booleanValue();
    private final String zzv = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzil);
    private final String zzw = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzin);
    private final String zzA = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzio);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    private final zzac zzW(Context context, String str, String str2, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, int i10, @Nullable String str3, Bundle bundle, @Nullable zzcdh zzcdhVar) {
        com.google.android.gms.ads.internal.client.zzr zzrVar2;
        byte b10;
        zzfjj zzfjjVar = new zzfjj();
        if (BrandSafetyUtils.f43548k.equals(str2)) {
            zzfjjVar.zzj().zza(2);
        } else if ("REWARDED_INTERSTITIAL".equals(str2)) {
            zzfjjVar.zzj().zza(3);
        }
        zzab zzabVarZzr = this.zzf.zzr();
        zzdan zzdanVar = new zzdan();
        zzdanVar.zza(context);
        zzfjjVar.zzg(str == null ? "adUnitId" : str);
        zzfjjVar.zza(zzmVar == null ? new com.google.android.gms.ads.internal.client.zzn().zza() : zzmVar);
        if (zzrVar == null) {
            switch (str2) {
                case "NATIVE":
                    b10 = 3;
                    break;
                case "APP_OPEN_AD":
                    b10 = 4;
                    break;
                case "REWARDED":
                    b10 = 1;
                    break;
                case "REWARDED_INTERSTITIAL":
                    b10 = 2;
                    break;
                case "BANNER":
                    b10 = 0;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            if (b10 == 0) {
                zzrVar2 = new com.google.android.gms.ads.internal.client.zzr(context, AdSize.BANNER);
            } else if (b10 == 1 || b10 == 2) {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.zzc();
            } else if (b10 != 3) {
                zzrVar2 = b10 != 4 ? new com.google.android.gms.ads.internal.client.zzr() : com.google.android.gms.ads.internal.client.zzr.zzd();
            } else {
                zzrVar2 = com.google.android.gms.ads.internal.client.zzr.zzb();
            }
        } else {
            zzrVar2 = zzrVar;
        }
        zzfjjVar.zzc(zzrVar2);
        zzfjjVar.zzu(true);
        zzfjjVar.zzv(bundle);
        zzdanVar.zzb(zzfjjVar.zzA());
        zzdanVar.zzh(i10);
        zzabVarZzr.zzc(zzdanVar.zze());
        zzax zzaxVar = new zzax();
        zzaxVar.zza(str2);
        zzaxVar.zzb(str3);
        zzaxVar.zzc(zzcdhVar);
        zzabVarZzr.zzb(new zzay(zzaxVar, null));
        new zzdhe();
        return zzabVarZzr.zza();
    }

    private final i zzX(final String str) {
        final zzdtk[] zzdtkVarArr = new zzdtk[1];
        i iVarZzb = this.zzj.zzb();
        zzgyw zzgywVar = new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzas
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ i zza(Object obj) {
                return this.zza.zzu(zzdtkVarArr, str, (zzdtk) obj);
            }
        };
        zzgzy zzgzyVar = this.zzk;
        i iVarZzj = zzgzo.zzj(iVarZzb, zzgywVar, zzgzyVar);
        iVarZzj.addListener(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaj
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzv(zzdtkVarArr);
            }
        }, zzgzyVar);
        return (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzi(zzgzg.zzw(iVarZzj), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziG)).intValue(), TimeUnit.MILLISECONDS, this.zzl), new zzgqt() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzaq
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                List list = zzau.zza;
                return ((JSONObject) obj).optString("nas");
            }
        }, zzgzyVar), Exception.class, new zzgqt() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzar
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                List list = zzau.zza;
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", (Exception) obj);
                return null;
            }
        }, zzgzyVar);
    }

    public final /* synthetic */ zzdye zzA() {
        return this.zzp;
    }

    public final /* synthetic */ zzfqk zzB() {
        return this.zzq;
    }

    public final /* synthetic */ boolean zzC() {
        return this.zzr;
    }

    public final /* synthetic */ boolean zzD() {
        return this.zzs;
    }

    public final /* synthetic */ boolean zzE() {
        return this.zzt;
    }

    public final /* synthetic */ boolean zzF() {
        return this.zzu;
    }

    public final /* synthetic */ String zzG() {
        return this.zzv;
    }

    public final /* synthetic */ String zzH() {
        return this.zzw;
    }

    public final /* synthetic */ AtomicInteger zzI() {
        return this.zzx;
    }

    public final /* synthetic */ VersionInfoParcel zzJ() {
        return this.zzy;
    }

    public final /* synthetic */ String zzK() {
        return this.zzz;
    }

    public final /* synthetic */ void zzL(String str) {
        this.zzz = str;
    }

    public final /* synthetic */ String zzM() {
        return this.zzA;
    }

    public final /* synthetic */ AtomicBoolean zzN() {
        return this.zzG;
    }

    public final /* synthetic */ AtomicInteger zzO() {
        return this.zzH;
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzR(list, iObjectWrapper, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzS(list, iObjectWrapper, zzbyhVar, false);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzR(list, iObjectWrapper, zzbyhVar, true);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbyh zzbyhVar) {
        zzS(list, iObjectWrapper, zzbyhVar, true);
    }

    public final /* synthetic */ i zzu(zzdtk[] zzdtkVarArr, String str, zzdtk zzdtkVar) throws JSONException {
        zzdtkVarArr[0] = zzdtkVar;
        Context context = this.zzg;
        zzbyk zzbykVar = this.zzm;
        Map map = zzbykVar.zzb;
        JSONObject jSONObjectZze = com.google.android.gms.ads.internal.util.zzbs.zze(context, map, map, zzbykVar.zza, null);
        JSONObject jSONObjectZzb = com.google.android.gms.ads.internal.util.zzbs.zzb(this.zzg, this.zzm.zza);
        JSONObject jSONObjectZzc = com.google.android.gms.ads.internal.util.zzbs.zzc(this.zzm.zza);
        JSONObject jSONObjectZzd = com.google.android.gms.ads.internal.util.zzbs.zzd(this.zzg, this.zzm.zza);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("asset_view_signal", jSONObjectZze);
        jSONObject.put("ad_view_signal", jSONObjectZzb);
        jSONObject.put("scroll_view_signal", jSONObjectZzc);
        jSONObject.put("lock_screen_signal", jSONObjectZzd);
        if ("google.afma.nativeAds.getPublisherCustomRenderedClickSignals".equals(str)) {
            jSONObject.put("click_signal", com.google.android.gms.ads.internal.util.zzbs.zzf(null, this.zzg, this.zzo, this.zzn));
        }
        return zzdtkVar.zzc(str, jSONObject);
    }

    public final /* synthetic */ void zzv(zzdtk[] zzdtkVarArr) {
        zzdtk zzdtkVar = zzdtkVarArr[0];
        if (zzdtkVar != null) {
            this.zzj.zzc(zzgzo.zza(zzdtkVar));
        }
    }

    public final /* synthetic */ Context zzz() {
        return this.zzg;
    }

    private final void zzR(final List list, final IObjectWrapper iObjectWrapper, zzbyh zzbyhVar, boolean z10) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        zzgzy zzgzyVar = this.zzk;
        i iVarSubmit = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzai
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzo(list, iObjectWrapper);
            }
        });
        if (zzY()) {
            iVarSubmit = zzgzo.zzj(iVarSubmit, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzak
                @Override // com.google.android.gms.internal.ads.zzgyw
                public final /* synthetic */ i zza(Object obj) {
                    return this.zza.zzp((ArrayList) obj);
                }
            }, zzgzyVar);
        } else {
            int i11 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
        }
        zzgzo.zzr(iVarSubmit, new zzae(this, zzbyhVar, z10), this.zzf.zzb());
    }

    private final void zzS(List list, final IObjectWrapper iObjectWrapper, zzbyh zzbyhVar, boolean z10) {
        i iVarSubmit;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("The updating URL feature is not enabled.");
            try {
                zzbyhVar.zzf("The updating URL feature is not enabled.");
                return;
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("", e10);
                return;
            }
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                i11++;
            }
        }
        if (i11 > 1) {
            String strValueOf = String.valueOf(list);
            int i12 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Multiple google urls found: ".concat(strValueOf));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            final Uri uri = (Uri) it2.next();
            if (zzd(uri)) {
                zzgzy zzgzyVar = this.zzk;
                iVarSubmit = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzal
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzq(uri, iObjectWrapper);
                    }
                });
                if (zzY()) {
                    iVarSubmit = zzgzo.zzj(iVarSubmit, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzam
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ i zza(Object obj) {
                            return this.zza.zzr((Uri) obj);
                        }
                    }, zzgzyVar);
                } else {
                    int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Asset view map is empty.");
                }
            } else {
                String strValueOf2 = String.valueOf(uri);
                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf2));
                iVarSubmit = zzgzo.zza(uri);
            }
            arrayList.add(iVarSubmit);
        }
        zzgzo.zzr(zzgzo.zzm(arrayList), new zzaf(this, zzbyhVar, z10), this.zzf.zzb());
    }

    private final void zzT() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkZ)).booleanValue()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlc)).booleanValue()) {
                return;
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlg)).booleanValue() && this.zzF.getAndSet(true)) {
                return;
            }
            zzx();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzU, reason: merged with bridge method [inline-methods] */
    public final void zzx() {
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        } else {
            zzgzo.zzr(((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue() ? zzgzo.zzf(new zzgyv() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzan
                @Override // com.google.android.gms.internal.ads.zzgyv
                public final /* synthetic */ i zza() {
                    return this.zza.zzs();
                }
            }, zzcei.zza) : zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza(), new zzag(this), this.zzf.zzb());
        }
    }

    private final boolean zzY() {
        Map map;
        zzbyk zzbykVar = this.zzm;
        return (zzbykVar == null || (map = zzbykVar.zzb) == null || map.isEmpty()) ? false : true;
    }

    private static final List zzaa(String str) {
        String[] strArrSplit = TextUtils.split(str, StringUtils.COMMA);
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArrSplit) {
            if (!zzgrt.zzc(str2)) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    @VisibleForTesting
    public final boolean zzc(@NonNull Uri uri) {
        return zzV(uri, this.zzD, this.zzE);
    }

    @VisibleForTesting
    public final boolean zzd(@NonNull Uri uri) {
        return zzV(uri, this.zzB, this.zzC);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0094  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:31:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:32:0x0111  */
    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zze(IObjectWrapper iObjectWrapper, final zzcdh zzcdhVar, @Nullable zzcda zzcdaVar) {
        final int i10;
        i iVarZza;
        i iVarZza2;
        i iVarZzc;
        final Bundle bundle = new Bundle();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcK)).booleanValue()) {
            bundle.putLong(zzdxh.PUBLIC_API_CALL.zza(), zzcdhVar.zzd.zzz);
            bundle.putLong(zzdxh.DYNAMITE_ENTER.zza(), com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis());
        }
        this.zzg = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcZ)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzbb.zzc();
        }
        zzfoe zzfoeVarZzn = zzfoe.zzn(this.zzg, 22);
        zzfoeVarZzn.zza();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziy)).booleanValue()) {
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
            if (zzmVar.zzc.getBoolean("optimize_for_app_start", false) && Objects.equals(zzaa.zzc(zzmVar), "requester_type_8")) {
                i10 = zzcdhVar.zze == 2 ? 2 : 1;
            } else {
                i10 = 0;
            }
        } else {
            i10 = 0;
        }
        String str = zzcdhVar.zzb;
        if ("UNKNOWN".equals(str)) {
            List arrayList = new ArrayList();
            zzbgv zzbgvVar = zzbhe.zzix;
            if (!((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).isEmpty()) {
                arrayList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).split(StringUtils.COMMA));
            }
            if (arrayList.contains(zzaa.zzc(zzcdhVar.zzd))) {
                iVarZzc = zzgzo.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
                iVarZza2 = zzgzo.zzc(new IllegalArgumentException("Unknown format is no longer supported."));
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
                    zzgzy zzgzyVar = zzcei.zza;
                    iVarZza = zzgzyVar.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzat
                        @Override // java.util.concurrent.Callable
                        public final /* synthetic */ Object call() {
                            return this.zza.zzn(zzcdhVar, i10, bundle);
                        }
                    });
                    iVarZza2 = zzgzo.zzj(iVarZza, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                        @Override // com.google.android.gms.internal.ads.zzgyw
                        public final /* synthetic */ i zza(Object obj) {
                            return ((zzac) obj).zza();
                        }
                    }, zzgzyVar);
                } else {
                    zzac zzacVarZzW = zzW(this.zzg, zzcdhVar.zza, str, zzcdhVar.zzc, zzcdhVar.zzd, i10, zzcdhVar.zzf, bundle, zzcdhVar);
                    iVarZza = zzgzo.zza(zzacVarZzW);
                    iVarZza2 = zzacVarZzW.zza();
                }
                iVarZzc = iVarZza;
            }
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmA)).booleanValue()) {
                zzgzy zzgzyVar2 = zzcei.zza;
                iVarZza = zzgzyVar2.submit(new Callable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzat
                    @Override // java.util.concurrent.Callable
                    public final /* synthetic */ Object call() {
                        return this.zza.zzn(zzcdhVar, i10, bundle);
                    }
                });
                iVarZza2 = zzgzo.zzj(iVarZza, new zzgyw() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzah
                    @Override // com.google.android.gms.internal.ads.zzgyw
                    public final /* synthetic */ i zza(Object obj) {
                        return ((zzac) obj).zza();
                    }
                }, zzgzyVar2);
            } else {
                zzac zzacVarZzW2 = zzW(this.zzg, zzcdhVar.zza, str, zzcdhVar.zzc, zzcdhVar.zzd, i10, zzcdhVar.zzf, bundle, zzcdhVar);
                iVarZza = zzgzo.zza(zzacVarZzW2);
                iVarZza2 = zzacVarZzW2.zza();
            }
            iVarZzc = iVarZza;
        }
        zzgzo.zzr(iVarZza2, new zzad(this, iVarZzc, zzcdhVar, zzcdaVar, zzfoeVarZzn), this.zzf.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzf(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziF)).booleanValue()) {
            MotionEvent motionEvent = (MotionEvent) ObjectWrapper.unwrap(iObjectWrapper);
            zzbyk zzbykVar = this.zzm;
            this.zzn = com.google.android.gms.ads.internal.util.zzbs.zzh(motionEvent, zzbykVar == null ? null : zzbykVar.zza);
            if (motionEvent.getAction() == 0) {
                this.zzo = this.zzn;
            }
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            Point point = this.zzn;
            motionEventObtain.setLocation(point.x, point.y);
            this.zzh.zzc(motionEventObtain);
            motionEventObtain.recycle();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final void zzi(zzbyk zzbykVar) {
        this.zzm = zzbykVar;
        this.zzj.zza(1);
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    @SuppressLint({"AddJavascriptInterface"})
    public final void zzj(IObjectWrapper iObjectWrapper) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkY)).booleanValue()) {
            zzbgv zzbgvVar = zzbhe.zziw;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
            WebView webView = (WebView) ObjectWrapper.unwrap(iObjectWrapper);
            if (webView == null) {
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzf("The webView cannot be null.");
                return;
            }
            zzf zzfVar = this.zzK;
            final zzj zzjVar = new zzj(webView, zzfVar, zzcei.zzf);
            AdMobNetworkBridge.onAddedJavascriptInterface(webView, new TaggingLibraryJsInterface(webView, this.zzh, this.zzp, this.zzq, this.zzi, this.zzJ, zzfVar, zzjVar), "gmaSdk");
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzli)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zzh().zzm();
            }
            if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
                zzfVar.zza(webView);
                if (((Boolean) zzbjj.zzd.zze()).booleanValue()) {
                    zzcei.zzd.scheduleWithFixedDelay(new Runnable() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzi
                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            zzjVar.zza();
                        }
                    }, 0L, ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlj)).intValue(), TimeUnit.MILLISECONDS);
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgvVar)).booleanValue()) {
                zzT();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcdd
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzlm)).booleanValue()) {
            return ObjectWrapper.wrap(null);
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        CustomTabsClient customTabsClient = (CustomTabsClient) ObjectWrapper.unwrap(iObjectWrapper2);
        CustomTabsCallback customTabsCallback = (CustomTabsCallback) ObjectWrapper.unwrap(iObjectWrapper3);
        zzbij zzbijVar = this.zzI;
        zzbijVar.zza(context, customTabsClient, str, customTabsCallback);
        if (((Boolean) zzbjj.zze.zze()).booleanValue()) {
            this.zzJ.zza();
        }
        if (((Boolean) zzbjj.zzc.zze()).booleanValue()) {
            this.zzK.zza(null);
        }
        return ObjectWrapper.wrap(zzbijVar.zzb());
    }

    public final /* synthetic */ zzac zzn(zzcdh zzcdhVar, int i10, Bundle bundle) {
        return zzW(this.zzg, zzcdhVar.zza, zzcdhVar.zzb, zzcdhVar.zzc, zzcdhVar.zzd, i10, zzcdhVar.zzf, bundle, zzcdhVar);
    }

    public final /* synthetic */ ArrayList zzo(List list, IObjectWrapper iObjectWrapper) throws Exception {
        zzazh zzazhVar = this.zzh;
        String strZzj = zzazhVar.zzb() != null ? zzazhVar.zzb().zzj(this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : "";
        if (TextUtils.isEmpty(strZzj)) {
            throw new Exception("Failed to get view signals.");
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (zzc(uri)) {
                arrayList.add(zzZ(uri, "ms", strZzj));
            } else {
                String strValueOf = String.valueOf(uri);
                int i10 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzi("Not a Google URL: ".concat(strValueOf));
                arrayList.add(uri);
            }
        }
        if (arrayList.isEmpty()) {
            throw new Exception("Empty impression URLs result.");
        }
        return arrayList;
    }

    public final /* synthetic */ i zzp(final ArrayList arrayList) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedImpressionSignals"), new zzgqt() { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzao
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzt(arrayList, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ Uri zzq(Uri uri, IObjectWrapper iObjectWrapper) throws Exception {
        zzfjo zzfjoVar;
        try {
            uri = (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() || (zzfjoVar = this.zzi) == null) ? this.zzh.zzd(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null) : zzfjoVar.zza(uri, this.zzg, (View) ObjectWrapper.unwrap(iObjectWrapper), null);
        } catch (zzazi e10) {
            int i10 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("", e10);
        }
        if (uri.getQueryParameter("ms") != null) {
            return uri;
        }
        throw new Exception("Failed to append spam signals to click url.");
    }

    public final /* synthetic */ i zzr(final Uri uri) {
        return zzgzo.zzk(zzX("google.afma.nativeAds.getPublisherCustomRenderedClickSignals"), new zzgqt(this) { // from class: com.google.android.gms.ads.nonagon.signalgeneration.zzap
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return zzau.zzQ(uri, (String) obj);
            }
        }, this.zzk);
    }

    public final /* synthetic */ i zzs() {
        return zzW(this.zzg, null, AdFormat.BANNER.name(), null, null, 0, null, new Bundle(), null).zza();
    }

    public final /* synthetic */ ArrayList zzt(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            if (!zzc(uri) || TextUtils.isEmpty(str)) {
                arrayList.add(uri);
            } else {
                arrayList.add(zzZ(uri, "nas", str));
            }
        }
        return arrayList;
    }

    public zzau(zzcma zzcmaVar, Context context, zzazh zzazhVar, zzfkj zzfkjVar, zzgzy zzgzyVar, ScheduledExecutorService scheduledExecutorService, zzdye zzdyeVar, zzfqk zzfqkVar, VersionInfoParcel versionInfoParcel, zzbij zzbijVar, zzfjo zzfjoVar, zzo zzoVar, zzf zzfVar) {
        List listZzaa;
        this.zzf = zzcmaVar;
        this.zzg = context;
        this.zzh = zzazhVar;
        this.zzi = zzfjoVar;
        this.zzj = zzfkjVar;
        this.zzk = zzgzyVar;
        this.zzl = scheduledExecutorService;
        this.zzp = zzdyeVar;
        this.zzq = zzfqkVar;
        this.zzy = versionInfoParcel;
        this.zzI = zzbijVar;
        this.zzJ = zzoVar;
        this.zzK = zzfVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzip)).booleanValue()) {
            this.zzB = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziq));
            this.zzC = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzir));
            this.zzD = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzis));
            listZzaa = zzaa((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzit));
        } else {
            this.zzB = zza;
            this.zzC = zzb;
            this.zzD = zzc;
            listZzaa = zzd;
        }
        this.zzE = listZzaa;
    }

    public static final /* synthetic */ Uri zzQ(Uri uri, String str) {
        if (!TextUtils.isEmpty(str)) {
            return zzZ(uri, "nas", str);
        }
        return uri;
    }

    private static boolean zzV(@NonNull Uri uri, List list, List list2) {
        String host = uri.getHost();
        String path = uri.getPath();
        if (host != null && path != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (path.contains((String) it.next())) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (host.endsWith((String) it2.next())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Uri zzZ(Uri uri, String str, String str2) {
        String string = uri.toString();
        int iIndexOf = string.indexOf("&adurl=");
        if (iIndexOf == -1) {
            iIndexOf = string.indexOf("?adurl=");
        }
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            return Uri.parse(string.substring(0, i10) + str + "=" + str2 + C3426d4.j.f28584c + string.substring(i10));
        }
        return uri.buildUpon().appendQueryParameter(str, str2).build();
    }

    public static /* synthetic */ zzfoo zzy(i iVar, zzcdh zzcdhVar) {
        String str;
        if (!zzfor.zza() || !((Boolean) zzbix.zze.zze()).booleanValue()) {
            return null;
        }
        try {
            zzfoo zzfooVarZzb = ((zzac) zzgzo.zzs(iVar)).zzb();
            zzfooVarZzb.zzb(new ArrayList(Collections.singletonList(zzcdhVar.zzb)));
            com.google.android.gms.ads.internal.client.zzm zzmVar = zzcdhVar.zzd;
            if (zzmVar == null) {
                str = "";
            } else {
                str = zzmVar.zzp;
            }
            zzfooVarZzb.zzc(str);
            zzfooVarZzb.zzd(zzmVar.zzm);
            return zzfooVarZzb;
        } catch (ExecutionException e10) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e10, "SignalGeneratorImpl.getConfiguredCriticalUserJourney");
            return null;
        }
    }

    public final /* synthetic */ void zzw(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (zzd((Uri) it.next())) {
                this.zzx.getAndIncrement();
                return;
            }
        }
    }
}
