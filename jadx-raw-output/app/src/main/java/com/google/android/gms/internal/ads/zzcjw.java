package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.ViewCompat;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.Predicate;
import com.ironsource.G5;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.internal.partials.AdMobNetworkBridge;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@24.9.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzcjw extends WebViewClient implements zzclj {
    public static final /* synthetic */ int zzc = 0;

    @Nullable
    private zzdxz zzA;

    @Nullable
    private zzczz zzB;
    private boolean zzC;
    private boolean zzD;
    private int zzE;
    private boolean zzF;

    @Nullable
    private final zzejf zzH;
    private View.OnAttachStateChangeListener zzI;
    public final zzcjl zza;

    @Nullable
    public zzcce zzb;

    @Nullable
    private final zzbgd zzd;
    private com.google.android.gms.ads.internal.client.zza zzg;
    private com.google.android.gms.ads.internal.overlay.zzr zzh;
    private zzclh zzi;
    private zzcli zzj;
    private zzbmx zzk;
    private zzbmz zzl;
    private zzdjm zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzs;
    private boolean zzt;
    private boolean zzu;
    private boolean zzv;
    private com.google.android.gms.ads.internal.overlay.zzad zzw;

    @Nullable
    private zzbww zzx;
    private com.google.android.gms.ads.internal.zzb zzy;
    private final HashMap zze = new HashMap();
    private final Object zzf = new Object();
    private int zzp = 0;
    private String zzq = "";
    private String zzr = "";
    private zzbwr zzz = null;
    private final HashSet zzG = new HashSet(Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgG)).split(StringUtils.COMMA)));

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onLoadResource(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onResourceLoaded(com.safedk.android.utils.g.f44962h, webView, str);
        safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V");
        CreativeInfoManager.onWebViewPageFinished(com.safedk.android.utils.g.f44962h, webView, str);
        safedk_zzcjw_onPageFinished_2f8a035cbeaffdb9df79440b33ea614a(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        this.zzo = true;
        this.zzp = i10;
        this.zzq = str;
        this.zzr = str2;
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest webResourceRequest) {
        return CreativeInfoManager.onWebViewResponseWithHeaders(com.safedk.android.utils.g.f44962h, view, webResourceRequest, super.shouldInterceptRequest(view, webResourceRequest));
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse;");
        return CreativeInfoManager.onWebViewResponse(com.safedk.android.utils.g.f44962h, webView, str, safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(webView, str));
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        Logger.d("AdMob|SafeDK: Execution> Lcom/google/android/gms/internal/ads/zzcjw;->shouldOverrideUrlLoading(Landroid/webkit/WebView;Ljava/lang/String;)Z");
        boolean zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3 = safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(webView, str);
        BrandSafetyUtils.onShouldOverrideUrlLoading(com.safedk.android.utils.g.f44962h, webView, str, zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3);
        return zSafedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzG(zzclh zzclhVar) {
        this.zzi = zzclhVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzH(zzcli zzcliVar) {
        this.zzj = zzcliVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzdxz zzI() {
        return this.zzA;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzJ(zzczz zzczzVar) {
        this.zzB = zzczzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final zzczz zzK() {
        return this.zzB;
    }

    public final void zzM(boolean z10) {
        this.zzn = false;
    }

    public final void zzO(boolean z10) {
        this.zzF = z10;
    }

    public final /* synthetic */ void zzV(boolean z10, long j10) {
        zzY(true, j10);
    }

    public final /* synthetic */ void zzZ(View view, zzcce zzcceVar, int i10) {
        zzac(view, zzcceVar, 10);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzab(@Nullable com.google.android.gms.ads.internal.client.zza zzaVar, @Nullable zzbmx zzbmxVar, @Nullable com.google.android.gms.ads.internal.overlay.zzr zzrVar, @Nullable zzbmz zzbmzVar, @Nullable com.google.android.gms.ads.internal.overlay.zzad zzadVar, boolean z10, @Nullable zzbok zzbokVar, @Nullable com.google.android.gms.ads.internal.zzb zzbVar, @Nullable zzbwy zzbwyVar, @Nullable zzcce zzcceVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar, @Nullable zzdxz zzdxzVar, @Nullable zzbpc zzbpcVar, @Nullable zzdjm zzdjmVar, @Nullable zzbpb zzbpbVar, @Nullable zzbov zzbovVar, @Nullable zzboi zzboiVar, @Nullable zzcrv zzcrvVar, @Nullable zzdzc zzdzcVar, @Nullable zzdae zzdaeVar, @Nullable zzczz zzczzVar) {
        com.google.android.gms.ads.internal.zzb zzbVar2 = zzbVar == null ? new com.google.android.gms.ads.internal.zzb(this.zza.getContext(), zzcceVar, null) : zzbVar;
        zzcjl zzcjlVar = this.zza;
        this.zzz = new zzbwr(zzcjlVar, zzbwyVar);
        this.zzb = zzcceVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbz)).booleanValue()) {
            zzB("/adMetadata", new zzbmw(zzbmxVar));
        }
        if (zzbmzVar != null) {
            zzB("/appEvent", new zzbmy(zzbmzVar));
        }
        zzB("/backButton", zzbog.zzj);
        zzB("/refresh", zzbog.zzk);
        zzB("/canOpenApp", zzbog.zzb);
        zzB("/canOpenURLs", zzbog.zza);
        zzB("/canOpenIntents", zzbog.zzc);
        zzB("/close", zzbog.zzd);
        zzB("/customClose", zzbog.zze);
        zzB("/instrument", zzbog.zzn);
        zzB("/delayPageLoaded", zzbog.zzp);
        zzB("/delayPageClosed", zzbog.zzq);
        zzB("/getLocationInfo", zzbog.zzr);
        zzB("/log", zzbog.zzg);
        zzB("/mraid", new zzboo(zzbVar2, this.zzz, zzbwyVar));
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzB("/mraidLoaded", zzbwwVar);
        }
        com.google.android.gms.ads.internal.zzb zzbVar3 = zzbVar2;
        zzB("/open", new zzbou(zzbVar2, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, zzdaeVar));
        zzB("/precache", new zzchs());
        zzB("/touch", zzbog.zzi);
        zzB("/video", zzbog.zzl);
        zzB("/videoMeta", zzbog.zzm);
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(zzdjmVar, zzcrvVar));
            zzB("/httpTrack", zzbog.zzf);
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, zzdjmVar));
            zzB("/httpTrack", zzfjv.zzb(zzeiuVar, zzfqkVar));
        }
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            Map map = new HashMap();
            if (zzcjlVar.zzC() != null) {
                map = zzcjlVar.zzC().zzaw;
            }
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), map));
        }
        if (zzbokVar != null) {
            zzB("/setInterstitialProperties", new zzboj(zzbokVar));
        }
        if (zzbpcVar != null) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkq)).booleanValue()) {
                zzB("/inspectorNetworkExtras", zzbpcVar);
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkJ)).booleanValue() && zzbpbVar != null) {
            zzB("/shareSheet", zzbpbVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziP)).booleanValue() && zzdzcVar != null) {
            zzB("/onDeviceStorageEvent", new zzbop(zzdzcVar));
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkO)).booleanValue() && zzbovVar != null) {
            zzB("/inspectorOutOfContextTest", zzbovVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzkT)).booleanValue() && zzboiVar != null) {
            zzB("/inspectorStorage", zzboiVar);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzmW)).booleanValue()) {
            zzB("/bindPlayStoreOverlay", zzbog.zzu);
            zzB("/presentPlayStoreOverlay", zzbog.zzv);
            zzB("/expandPlayStoreOverlay", zzbog.zzw);
            zzB("/collapsePlayStoreOverlay", zzbog.zzx);
            zzB("/closePlayStoreOverlay", zzbog.zzy);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzee)).booleanValue()) {
            zzB("/setPAIDPersonalizationEnabled", zzbog.zzA);
            zzB("/resetPAID", zzbog.zzz);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznq)).booleanValue() && zzcjlVar.zzC() != null && zzcjlVar.zzC().zzar) {
            zzB("/writeToLocalStorage", zzbog.zzB);
            zzB("/clearLocalStorageKeys", zzbog.zzC);
        }
        this.zzg = zzaVar;
        this.zzh = zzrVar;
        this.zzk = zzbmxVar;
        this.zzl = zzbmzVar;
        this.zzw = zzadVar;
        this.zzy = zzbVar3;
        this.zzm = zzdjmVar;
        this.zzA = zzdxzVar;
        this.zzB = zzczzVar;
        this.zzn = z10;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final com.google.android.gms.ads.internal.zzb zzh() {
        return this.zzy;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzi(@Nullable com.google.android.gms.ads.internal.zzb zzbVar) {
        this.zzy = zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzj(zzcce zzcceVar) {
        this.zzb = zzcceVar;
    }

    private final void zzad() {
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.zzI;
        if (onAttachStateChangeListener == null) {
            return;
        }
        ((View) this.zza).removeOnAttachStateChangeListener(onAttachStateChangeListener);
    }

    @Nullable
    private static WebResourceResponse zzae() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzbq)).booleanValue()) {
            return new WebResourceResponse("", "", new ByteArrayInputStream(new byte[0]));
        }
        return null;
    }

    @Nullable
    private final WebResourceResponse zzaf(String str, Map map) throws Throwable {
        URL url = new URL(str);
        try {
            TrafficStats.setThreadStatsTag(264);
            int i10 = 0;
            while (true) {
                i10++;
                if (i10 > 20) {
                    TrafficStats.clearThreadStatsTag();
                    throw new IOException("Too many redirects (20)");
                }
                int i11 = zzfxs.zzb;
                URLConnection uRLConnectionOpenConnection = url.openConnection();
                uRLConnectionOpenConnection.setConnectTimeout(10000);
                uRLConnectionOpenConnection.setReadTimeout(10000);
                for (Map.Entry entry : map.entrySet()) {
                    uRLConnectionOpenConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (!(uRLConnectionOpenConnection instanceof HttpURLConnection)) {
                    throw new IOException("Invalid protocol.");
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                com.google.android.gms.ads.internal.util.zzs zzsVarZzc = com.google.android.gms.ads.internal.zzt.zzc();
                try {
                    zzcjl zzcjlVar = this.zza;
                    zzsVarZzc.zzb(zzcjlVar.getContext(), zzcjlVar.zzs().afmaVersion, false, httpURLConnection, false, 60000);
                    WebResourceResponse webResourceResponseZzc = null;
                    com.google.android.gms.ads.internal.util.client.zzl zzlVar = new com.google.android.gms.ads.internal.util.client.zzl(null);
                    zzlVar.zza(httpURLConnection, null);
                    int iHttpUrlConnectionGetResponseCode = AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection);
                    zzlVar.zzc(httpURLConnection, iHttpUrlConnectionGetResponseCode);
                    if (iHttpUrlConnectionGetResponseCode < 300 || iHttpUrlConnectionGetResponseCode >= 400) {
                        com.google.android.gms.ads.internal.zzt.zzc();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType = httpURLConnection.getContentType();
                        String strTrim = "";
                        String strTrim2 = TextUtils.isEmpty(contentType) ? "" : contentType.split(";")[0].trim();
                        com.google.android.gms.ads.internal.zzt.zzc();
                        String contentType2 = httpURLConnection.getContentType();
                        if (!TextUtils.isEmpty(contentType2)) {
                            String[] strArrSplit = contentType2.split(";");
                            if (strArrSplit.length != 1) {
                                for (int i12 = 1; i12 < strArrSplit.length; i12++) {
                                    if (strArrSplit[i12].trim().startsWith(G5.M)) {
                                        String[] strArrSplit2 = strArrSplit[i12].trim().split("=");
                                        if (strArrSplit2.length > 1) {
                                            strTrim = strArrSplit2[1].trim();
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                        String str2 = strTrim;
                        Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                        HashMap map2 = new HashMap(headerFields.size());
                        for (Map.Entry<String, List<String>> entry2 : headerFields.entrySet()) {
                            if (entry2.getKey() != null && entry2.getValue() != null && !entry2.getValue().isEmpty()) {
                                map2.put(entry2.getKey(), entry2.getValue().get(0));
                            }
                        }
                        webResourceResponseZzc = com.google.android.gms.ads.internal.zzt.zzf().zzc(strTrim2, str2, AdMobNetworkBridge.httpUrlConnectionGetResponseCode(httpURLConnection), httpURLConnection.getResponseMessage(), map2, AdMobNetworkBridge.urlConnectionGetInputStream(httpURLConnection));
                    } else {
                        String headerField = httpURLConnection.getHeaderField("Location");
                        if (headerField == null) {
                            throw new IOException("Missing Location header in redirect");
                        }
                        if (!headerField.startsWith("tel:")) {
                            URL url2 = new URL(url, headerField);
                            String protocol = url2.getProtocol();
                            if (protocol == null) {
                                int i13 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi("Protocol is null");
                                webResourceResponseZzc = zzae();
                            } else if (protocol.equals("http") || protocol.equals("https")) {
                                StringBuilder sb2 = new StringBuilder(headerField.length() + 15);
                                sb2.append("Redirecting to ");
                                sb2.append(headerField);
                                String string = sb2.toString();
                                int i14 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzd(string);
                                AdMobNetworkBridge.httpUrlConnectionDisconnect(httpURLConnection);
                                url = url2;
                            } else {
                                StringBuilder sb3 = new StringBuilder(protocol.length() + 20);
                                sb3.append("Unsupported scheme: ");
                                sb3.append(protocol);
                                String string2 = sb3.toString();
                                int i15 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzi(string2);
                                webResourceResponseZzc = zzae();
                            }
                        }
                    }
                    TrafficStats.clearThreadStatsTag();
                    return webResourceResponseZzc;
                } catch (Throwable th2) {
                    th = th2;
                    TrafficStats.clearThreadStatsTag();
                    throw th;
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzah, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final /* synthetic */ void zzY(boolean z10, long j10) {
        this.zza.zzu(z10, j10);
    }

    private static final boolean zzaj(boolean z10, zzcjl zzcjlVar) {
        return (!z10 || zzcjlVar.zzN().zzg() || zzcjlVar.zzO().equals("interstitial_mb")) ? false : true;
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
        if (zzaVar != null) {
            zzaVar.onAdClicked();
        }
    }

    public void safedk_zzcjw_onPageFinished_2f8a035cbeaffdb9df79440b33ea614a(WebView p10, String p11) {
        synchronized (this.zzf) {
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzX()) {
                com.google.android.gms.ads.internal.util.zze.zza("Blank page loaded, 1...");
                zzcjlVar.zzY();
                return;
            }
            this.zzC = true;
            zzcli zzcliVar = this.zzj;
            if (zzcliVar != null) {
                zzcliVar.zza();
                this.zzj = null;
            }
            zzu();
            zzcjl zzcjlVar2 = this.zza;
            if (zzcjlVar2.zzL() != null) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznr)).booleanValue()) {
                    zzcjlVar2.zzL().zzz(p11);
                }
            }
        }
    }

    public final void zzA(AdOverlayInfoParcel adOverlayInfoParcel) {
        com.google.android.gms.ads.internal.overlay.zzc zzcVar;
        zzbwr zzbwrVar = this.zzz;
        boolean zZzd = zzbwrVar != null ? zzbwrVar.zzd() : false;
        com.google.android.gms.ads.internal.zzt.zzb();
        com.google.android.gms.ads.internal.overlay.zzn.zza(this.zza.getContext(), adOverlayInfoParcel, !zZzd, this.zzA);
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            String str = adOverlayInfoParcel.zzl;
            if (str == null && (zzcVar = adOverlayInfoParcel.zza) != null) {
                str = zzcVar.zzb;
            }
            zzcceVar.zzb(str);
        }
    }

    public final void zzB(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            HashMap map = this.zze;
            List copyOnWriteArrayList = (List) map.get(str);
            if (copyOnWriteArrayList == null) {
                copyOnWriteArrayList = new CopyOnWriteArrayList();
                map.put(str, copyOnWriteArrayList);
            }
            copyOnWriteArrayList.add(zzbohVar);
        }
    }

    public final void zzC(String str, zzboh zzbohVar) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.remove(zzbohVar);
        }
    }

    public final void zzD(String str) {
        synchronized (this.zzf) {
            List list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            list.clear();
        }
    }

    public final void zzE(String str, Predicate predicate) {
        synchronized (this.zzf) {
            List<zzboh> list = (List) this.zze.get(str);
            if (list == null) {
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (zzboh zzbohVar : list) {
                if (predicate.apply(zzbohVar)) {
                    arrayList.add(zzbohVar);
                }
            }
            list.removeAll(arrayList);
        }
    }

    public final void zzF() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcceVar.zzf();
            this.zzb = null;
        }
        zzad();
        synchronized (this.zzf) {
            this.zze.clear();
            this.zzg = null;
            this.zzh = null;
            this.zzi = null;
            this.zzj = null;
            this.zzk = null;
            this.zzl = null;
            this.zzn = false;
            this.zzs = false;
            this.zzt = false;
            this.zzu = false;
            this.zzw = null;
            this.zzy = null;
            this.zzx = null;
            zzbwr zzbwrVar = this.zzz;
            if (zzbwrVar != null) {
                zzbwrVar.zzb(true);
                this.zzz = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0095  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f9 A[Catch: all -> 0x01df, TryCatch #11 {all -> 0x01df, blocks: (B:59:0x0189, B:61:0x019b, B:62:0x01a3, B:71:0x01e7, B:73:0x01f9, B:74:0x0200), top: B:105:0x00dd }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02bc A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:63:0x01ae, B:43:0x016e, B:88:0x02bc, B:76:0x0236, B:77:0x0269, B:75:0x0204, B:42:0x013d, B:27:0x00d1, B:78:0x026a, B:80:0x0274, B:82:0x027a, B:84:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:107:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x02d1 A[Catch: NoClassDefFoundError -> 0x02e6, Exception | NoClassDefFoundError -> 0x02e8, TryCatch #9 {Exception | NoClassDefFoundError -> 0x02e8, blocks: (B:3:0x000c, B:5:0x0019, B:6:0x001f, B:8:0x002f, B:10:0x0036, B:12:0x0044, B:14:0x0060, B:16:0x0079, B:18:0x0090, B:19:0x0093, B:21:0x0096, B:24:0x00b0, B:26:0x00c4, B:28:0x00dd, B:63:0x01ae, B:43:0x016e, B:88:0x02bc, B:76:0x0236, B:77:0x0269, B:75:0x0204, B:42:0x013d, B:27:0x00d1, B:78:0x026a, B:80:0x0274, B:82:0x027a, B:84:0x02ad, B:90:0x02cb, B:92:0x02d1, B:94:0x02df), top: B:107:0x000c }] */
    /* JADX WARN: Code duplicated, block: B:96:0x02e4 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v5 */
    @Nullable
    public final WebResourceResponse zzL(String str, Map map) {
        int i10;
        InputStream inputStreamZzb;
        InputStream inputStreamZzb2;
        Long l10;
        final boolean z10;
        final boolean z11;
        String string;
        try {
            Map map2 = new HashMap();
            zzcjl zzcjlVar = this.zza;
            if (zzcjlVar.zzC() != null) {
                map2 = zzcjlVar.zzC().zzaw;
            }
            String strZza = zzccs.zza(str, zzcjlVar.getContext(), this.zzF, map2);
            if (!strZza.equals(str)) {
                return zzaf(strZza, map);
            }
            Parcelable.Creator<zzbfp> creator = zzbfp.CREATOR;
            zzbfp zzbfpVarZza = zzbfp.zza(Uri.parse(str));
            if (zzbfpVarZza != null) {
                HashMap map3 = new HashMap();
                map3.put("Access-Control-Allow-Origin", "*");
                Uri uri = Uri.parse(str);
                if (uri.getQueryParameterNames().contains("range")) {
                    List listZze = zzgrr.zza(zzgqq.zzc('-')).zze(uri.getQueryParameter("range"));
                    if (listZze.size() == 2) {
                        int i11 = Integer.parseInt((String) listZze.get(0));
                        int i12 = Integer.parseInt((String) listZze.get(1)) + 1;
                        if (i11 > 0) {
                            zzbfpVarZza.zzh = i11;
                        }
                        i10 = i12 - i11;
                    } else {
                        i10 = -1;
                    }
                } else {
                    i10 = -1;
                }
                final boolean z12 = "X-Afma-Gcache-CachedBytes";
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfj)).booleanValue()) {
                    zzbfpVarZza.zzi = zzgrt.zza(zzcjlVar.zzn());
                    zzbfpVarZza.zzj = zzcjlVar.zzp();
                    if (zzbfpVarZza.zzg) {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfl);
                    } else {
                        l10 = (Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfk);
                    }
                    try {
                        String str2 = "AdWebViewClient.interceptRequest.gcache";
                        long jLongValue = l10.longValue();
                        long jElapsedRealtime = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime();
                        com.google.android.gms.ads.internal.zzt.zzz();
                        Future futureZza = zzbga.zza(zzcjlVar.getContext(), zzbfpVarZza);
                        try {
                            zzbgb zzbgbVar = (zzbgb) futureZza.get(jLongValue, TimeUnit.MILLISECONDS);
                            try {
                                try {
                                    map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbgbVar.zzc()));
                                    map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbgbVar.zzd()));
                                    map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbgbVar.zzf()));
                                    map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbgbVar.zze()));
                                    inputStreamZzb2 = zzbgbVar.zzb();
                                    if (i10 != -1) {
                                        try {
                                            inputStreamZzb2 = zzgxf.zzb(inputStreamZzb2, i10);
                                        } catch (InterruptedException e10) {
                                            e = e10;
                                            z11 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                            }
                                            futureZza.cancel(true);
                                            Thread.currentThread().interrupt();
                                            final long jElapsedRealtime2 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjq
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzX(z11, jElapsedRealtime2);
                                                }
                                            });
                                            StringBuilder sb2 = new StringBuilder(String.valueOf(jElapsedRealtime2).length() + 24);
                                            sb2.append("Cache connection took ");
                                            sb2.append(jElapsedRealtime2);
                                            sb2.append("ms");
                                            string = sb2.toString();
                                        } catch (ExecutionException e11) {
                                            e = e11;
                                            z10 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime3 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z10, jElapsedRealtime3);
                                                }
                                            });
                                            StringBuilder sb3 = new StringBuilder(String.valueOf(jElapsedRealtime3).length() + 24);
                                            sb3.append("Cache connection took ");
                                            sb3.append(jElapsedRealtime3);
                                            sb3.append("ms");
                                            string = sb3.toString();
                                        } catch (TimeoutException e12) {
                                            e = e12;
                                            z10 = true;
                                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                            }
                                            futureZza.cancel(true);
                                            final long jElapsedRealtime4 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                                @Override // java.lang.Runnable
                                                public final /* synthetic */ void run() {
                                                    this.zza.zzW(z10, jElapsedRealtime4);
                                                }
                                            });
                                            StringBuilder sb4 = new StringBuilder(String.valueOf(jElapsedRealtime4).length() + 24);
                                            sb4.append("Cache connection took ");
                                            sb4.append(jElapsedRealtime4);
                                            sb4.append("ms");
                                            string = sb4.toString();
                                        }
                                    }
                                    final long jElapsedRealtime5 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    final boolean z13 = true;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable(z13, jElapsedRealtime5) { // from class: com.google.android.gms.internal.ads.zzcjo
                                        private final /* synthetic */ long zzb;

                                        {
                                            this.zzb = jElapsedRealtime5;
                                        }

                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzV(true, this.zzb);
                                        }
                                    });
                                    StringBuilder sb5 = new StringBuilder(String.valueOf(jElapsedRealtime5).length() + 24);
                                    sb5.append("Cache connection took ");
                                    sb5.append(jElapsedRealtime5);
                                    sb5.append("ms");
                                    string = sb5.toString();
                                } catch (Throwable th2) {
                                    th = th2;
                                    z12 = 1;
                                    final long jElapsedRealtime6 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                    com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjr
                                        @Override // java.lang.Runnable
                                        public final /* synthetic */ void run() {
                                            this.zza.zzY(z12, jElapsedRealtime6);
                                        }
                                    });
                                    StringBuilder sb6 = new StringBuilder(String.valueOf(jElapsedRealtime6).length() + 24);
                                    sb6.append("Cache connection took ");
                                    sb6.append(jElapsedRealtime6);
                                    sb6.append("ms");
                                    com.google.android.gms.ads.internal.util.zze.zza(sb6.toString());
                                    throw th;
                                }
                            } catch (InterruptedException e13) {
                                e = e13;
                                inputStreamZzb2 = null;
                            } catch (ExecutionException e14) {
                                e = e14;
                                inputStreamZzb2 = null;
                                z10 = true;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime7 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z10, jElapsedRealtime7);
                                    }
                                });
                                StringBuilder sb7 = new StringBuilder(String.valueOf(jElapsedRealtime7).length() + 24);
                                sb7.append("Cache connection took ");
                                sb7.append(jElapsedRealtime7);
                                sb7.append("ms");
                                string = sb7.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStreamZzb = inputStreamZzb2;
                                if (inputStreamZzb != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    return null;
                                }
                                return null;
                            } catch (TimeoutException e15) {
                                e = e15;
                                inputStreamZzb2 = null;
                                z10 = true;
                                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                    com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                                }
                                futureZza.cancel(true);
                                final long jElapsedRealtime8 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                                com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                    @Override // java.lang.Runnable
                                    public final /* synthetic */ void run() {
                                        this.zza.zzW(z10, jElapsedRealtime8);
                                    }
                                });
                                StringBuilder sb8 = new StringBuilder(String.valueOf(jElapsedRealtime8).length() + 24);
                                sb8.append("Cache connection took ");
                                sb8.append(jElapsedRealtime8);
                                sb8.append("ms");
                                string = sb8.toString();
                                com.google.android.gms.ads.internal.util.zze.zza(string);
                                inputStreamZzb = inputStreamZzb2;
                                if (inputStreamZzb != null) {
                                    return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                                }
                                if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                    return null;
                                }
                                return null;
                            }
                        } catch (InterruptedException e16) {
                            e = e16;
                            inputStreamZzb2 = null;
                            z11 = false;
                        } catch (ExecutionException e17) {
                            e = e17;
                            str2 = str2;
                            inputStreamZzb2 = null;
                            z10 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime9 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z10, jElapsedRealtime9);
                                }
                            });
                            StringBuilder sb9 = new StringBuilder(String.valueOf(jElapsedRealtime9).length() + 24);
                            sb9.append("Cache connection took ");
                            sb9.append(jElapsedRealtime9);
                            sb9.append("ms");
                            string = sb9.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStreamZzb = inputStreamZzb2;
                            if (inputStreamZzb != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                return null;
                            }
                            return null;
                        } catch (TimeoutException e18) {
                            e = e18;
                            str2 = str2;
                            inputStreamZzb2 = null;
                            z10 = false;
                            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzfo)).booleanValue()) {
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, str2);
                            }
                            futureZza.cancel(true);
                            final long jElapsedRealtime10 = com.google.android.gms.ads.internal.zzt.zzk().elapsedRealtime() - jElapsedRealtime;
                            com.google.android.gms.ads.internal.util.zzs.zza.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjp
                                @Override // java.lang.Runnable
                                public final /* synthetic */ void run() {
                                    this.zza.zzW(z10, jElapsedRealtime10);
                                }
                            });
                            StringBuilder sb10 = new StringBuilder(String.valueOf(jElapsedRealtime10).length() + 24);
                            sb10.append("Cache connection took ");
                            sb10.append(jElapsedRealtime10);
                            sb10.append("ms");
                            string = sb10.toString();
                            com.google.android.gms.ads.internal.util.zze.zza(string);
                            inputStreamZzb = inputStreamZzb2;
                            if (inputStreamZzb != null) {
                                return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                            }
                            if (com.google.android.gms.ads.internal.util.client.zzl.zzj()) {
                                return null;
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            z12 = 0;
                        }
                        com.google.android.gms.ads.internal.util.zze.zza(string);
                    } catch (Throwable th4) {
                        th = th4;
                    }
                } else {
                    zzbfm zzbfmVarZzc = com.google.android.gms.ads.internal.zzt.zzj().zzc(zzbfpVarZza);
                    if (zzbfmVarZzc == null || !zzbfmVarZzc.zza()) {
                        inputStreamZzb = null;
                    } else {
                        map3.put("X-Afma-Gcache-HasAdditionalMetadataFromReadV2", Boolean.toString(zzbfmVarZzc.zzd()));
                        map3.put("X-Afma-Gcache-IsGcacheHit", Boolean.toString(zzbfmVarZzc.zzg()));
                        map3.put("X-Afma-Gcache-IsDownloaded", Boolean.toString(zzbfmVarZzc.zze()));
                        map3.put("X-Afma-Gcache-CachedBytes", Long.toString(zzbfmVarZzc.zzf()));
                        inputStreamZzb2 = zzbfmVarZzc.zzb();
                        if (i10 != -1) {
                            inputStreamZzb = zzgxf.zzb(inputStreamZzb2, i10);
                        }
                    }
                    if (inputStreamZzb != null) {
                        return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                    }
                }
                inputStreamZzb = inputStreamZzb2;
                if (inputStreamZzb != null) {
                    return new WebResourceResponse("", "", 200, "OK", map3, inputStreamZzb);
                }
            }
            if (com.google.android.gms.ads.internal.util.client.zzl.zzj() || !((Boolean) zzbja.zzb.zze()).booleanValue()) {
                return null;
            }
            return zzaf(str, map);
        } catch (Exception | NoClassDefFoundError e19) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e19, "AdWebViewClient.interceptRequest");
            return zzae();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzN() {
        synchronized (this.zzf) {
            this.zzn = false;
            this.zzs = true;
            zzcei.zzf.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjs
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    zzcjl zzcjlVar = this.zza.zza;
                    zzcjlVar.zzah();
                    com.google.android.gms.ads.internal.overlay.zzm zzmVarZzL = zzcjlVar.zzL();
                    if (zzmVarZzL != null) {
                        zzmVarZzL.zzv();
                    }
                }
            });
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzP(int i10, int i11) {
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zze(i10, i11);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzR(boolean z10) {
        synchronized (this.zzf) {
            this.zzt = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzS(boolean z10) {
        synchronized (this.zzf) {
            this.zzu = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzT(boolean z10) {
        synchronized (this.zzf) {
            this.zzv = z10;
        }
    }

    public final /* synthetic */ void zzU(View view, zzcce zzcceVar, int i10) {
        zzac(view, zzcceVar, i10 - 1);
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zza(int i10, int i11, boolean z10) {
        zzbww zzbwwVar = this.zzx;
        if (zzbwwVar != null) {
            zzbwwVar.zzb(i10, i11);
        }
        zzbwr zzbwrVar = this.zzz;
        if (zzbwrVar != null) {
            zzbwrVar.zzc(i10, i11, false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzb(zzfir zzfirVar) {
        zzcjl zzcjlVar = this.zza;
        if (com.google.android.gms.ads.internal.zzt.zzD().zza(zzcjlVar.getContext())) {
            zzD("/logScionEvent");
            new HashMap();
            zzB("/logScionEvent", new zzbon(zzcjlVar.getContext(), zzfirVar.zzaw));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzc(zzcrv zzcrvVar) {
        zzD("/click");
        zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzd(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzfqk zzfqkVar) {
        zzD("/click");
        if (zzeiuVar == null || zzfqkVar == null) {
            zzB("/click", zzbog.zzb(this.zzm, zzcrvVar));
        } else {
            zzB("/click", zzfjv.zza(zzeiuVar, zzfqkVar, zzcrvVar, this.zzm));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdQ() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdQ();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdjm
    public final void zzdu() {
        zzdjm zzdjmVar = this.zzm;
        if (zzdjmVar != null) {
            zzdjmVar.zzdu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zze(zzcrv zzcrvVar, @Nullable zzeiu zzeiuVar, @Nullable zzdxz zzdxzVar) {
        zzD("/open");
        zzB("/open", new zzbou(this.zzy, this.zzz, zzeiuVar, zzdxzVar, zzcrvVar, null));
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final boolean zzk() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzs;
        }
        return z10;
    }

    public final boolean zzl() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzt;
        }
        return z10;
    }

    public final boolean zzm() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzu;
        }
        return z10;
    }

    public final boolean zzn() {
        boolean z10;
        synchronized (this.zzf) {
            z10 = this.zzv;
        }
        return z10;
    }

    public final ViewTreeObserver.OnGlobalLayoutListener zzo() {
        synchronized (this.zzf) {
        }
        return null;
    }

    public final ViewTreeObserver.OnScrollChangedListener zzp() {
        synchronized (this.zzf) {
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzq() {
        zzcce zzcceVar = this.zzb;
        if (zzcceVar != null) {
            zzcjl zzcjlVar = this.zza;
            WebView webViewZzD = zzcjlVar.zzD();
            if (ViewCompat.isAttachedToWindow(webViewZzD)) {
                zzac(webViewZzD, zzcceVar, 10);
                return;
            }
            zzad();
            zzcjm zzcjmVar = new zzcjm(this, zzcceVar);
            this.zzI = zzcjmVar;
            ((View) zzcjlVar).addOnAttachStateChangeListener(zzcjmVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzr() {
        synchronized (this.zzf) {
        }
        this.zzE++;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzs() {
        this.zzE--;
        zzu();
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzt() {
        zzbgd zzbgdVar = this.zzd;
        if (zzbgdVar != null) {
            zzbgdVar.zzc(10005);
        }
        this.zzD = true;
        this.zzp = 10004;
        this.zzq = "Page loaded delay cancel.";
        zzu();
        this.zza.destroy();
    }

    public final void zzu() {
        if (this.zzi != null && ((this.zzC && this.zzE <= 0) || this.zzD || this.zzo)) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzcw)).booleanValue()) {
                zzcjl zzcjlVar = this.zza;
                if (zzcjlVar.zzq() != null) {
                    zzbhl.zza(zzcjlVar.zzq().zzc(), zzcjlVar.zzi(), "awfllc");
                }
            }
            zzclh zzclhVar = this.zzi;
            boolean z10 = false;
            if (!this.zzD && !this.zzo) {
                z10 = true;
            }
            zzclhVar.zza(z10, this.zzp, this.zzq, this.zzr);
            this.zzi = null;
        }
        this.zza.zzap();
    }

    public final void zzv(com.google.android.gms.ads.internal.overlay.zzc zzcVar, boolean z10, boolean z11, String str) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean z12 = zzaj(zZzW, zzcjlVar) || z11;
        zzA(new AdOverlayInfoParcel(zzcVar, z12 ? null : this.zzg, zZzW ? null : this.zzh, this.zzw, zzcjlVar.zzs(), zzcjlVar, z12 || !z10 ? null : this.zzm, str));
    }

    public final void zzw(String str, String str2, int i10) {
        zzejf zzejfVar = this.zzH;
        zzcjl zzcjlVar = this.zza;
        zzA(new AdOverlayInfoParcel(zzcjlVar, zzcjlVar.zzs(), str, str2, 14, zzejfVar));
    }

    public final void zzx(boolean z10, int i10, boolean z11) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzaj = zzaj(zzcjlVar.zzW(), zzcjlVar);
        boolean z12 = true;
        if (!zZzaj && z11) {
            z12 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, this.zzh, this.zzw, zzcjlVar, z10, i10, zzcjlVar.zzs(), z12 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }

    public final void zzy(boolean z10, int i10, String str, boolean z11, boolean z12) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z13 = true;
        if (!zZzaj && z11) {
            z13 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, zZzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z10, i10, str, zzcjlVar.zzs(), z13 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null, z12));
    }

    public final void zzz(boolean z10, int i10, String str, String str2, boolean z11) {
        zzcjl zzcjlVar = this.zza;
        boolean zZzW = zzcjlVar.zzW();
        boolean zZzaj = zzaj(zZzW, zzcjlVar);
        boolean z12 = true;
        if (!zZzaj && z11) {
            z12 = false;
        }
        zzA(new AdOverlayInfoParcel(zZzaj ? null : this.zzg, zZzW ? null : new zzcjv(zzcjlVar, this.zzh), this.zzk, this.zzl, this.zzw, zzcjlVar, z10, i10, str, str2, zzcjlVar.zzs(), z12 ? null : this.zzm, zzai(zzcjlVar) ? this.zzH : null));
    }

    @VisibleForTesting
    public zzcjw(zzcjl zzcjlVar, @Nullable zzbgd zzbgdVar, boolean z10, zzbww zzbwwVar, @Nullable zzbwr zzbwrVar, @Nullable zzejf zzejfVar) {
        this.zzd = zzbgdVar;
        this.zza = zzcjlVar;
        this.zzs = z10;
        this.zzx = zzbwwVar;
        this.zzH = zzejfVar;
    }

    private final void zzac(final View view, final zzcce zzcceVar, final int i10) {
        if (zzcceVar.zzc() && i10 > 0) {
            zzcceVar.zzd(view);
            if (zzcceVar.zzc()) {
                com.google.android.gms.ads.internal.util.zzs.zza.postDelayed(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcju
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzU(view, zzcceVar, i10);
                    }
                }, 100L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: zzag, reason: merged with bridge method [inline-methods] */
    public final void zzaa(Map map, List list, String str) {
        if (com.google.android.gms.ads.internal.util.zze.zzc()) {
            com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(str));
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 4 + String.valueOf(str3).length());
                sb2.append("  ");
                sb2.append(str2);
                sb2.append(": ");
                sb2.append(str3);
                com.google.android.gms.ads.internal.util.zze.zza(sb2.toString());
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((zzboh) it.next()).zza(this.zza, map);
        }
    }

    private static final boolean zzai(zzcjl zzcjlVar) {
        if (zzcjlVar.zzC() != null && zzcjlVar.zzC().zzb()) {
            return true;
        }
        return false;
    }

    public void safedk_zzcjw_onLoadResource_39e2883cec5d4d28e73317931cb8f527(WebView p10, String p11) {
        com.google.android.gms.ads.internal.util.zze.zza("Loading resource: ".concat(String.valueOf(p11)));
        Uri uri = Uri.parse(p11);
        if ("gmsg".equalsIgnoreCase(uri.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uri.getHost())) {
            zzQ(uri);
        }
    }

    @Nullable
    public WebResourceResponse safedk_zzcjw_shouldInterceptRequest_718453b31cb24262c2fef41a6d6e1da1(WebView p10, String p11) {
        return zzL(p11, Collections.emptyMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean safedk_zzcjw_shouldOverrideUrlLoading_594e3490da663458b1469ed0067b75b3(WebView p10, String p11) {
        String p12;
        com.google.android.gms.ads.internal.util.zze.zza("AdWebView shouldOverrideUrlLoading: ".concat(String.valueOf(p11)));
        Uri uriZzd = Uri.parse(p11);
        if ("gmsg".equalsIgnoreCase(uriZzd.getScheme()) && "mobileads.google.com".equalsIgnoreCase(uriZzd.getHost())) {
            zzQ(uriZzd);
        } else {
            if (this.zzn && p10 == this.zza.zzD()) {
                String scheme = uriZzd.getScheme();
                if ("http".equalsIgnoreCase(scheme) || "https".equalsIgnoreCase(scheme)) {
                    com.google.android.gms.ads.internal.client.zza zzaVar = this.zzg;
                    if (zzaVar != null) {
                        zzaVar.onAdClicked();
                        zzcce zzcceVar = this.zzb;
                        if (zzcceVar != null) {
                            zzcceVar.zzb(p11);
                        }
                        this.zzg = null;
                    }
                    zzdjm zzdjmVar = this.zzm;
                    if (zzdjmVar != null) {
                        zzdjmVar.zzdu();
                        this.zzm = null;
                    }
                    return super.shouldOverrideUrlLoading(p10, p11);
                }
            }
            zzcjl zzcjlVar = this.zza;
            if (!zzcjlVar.zzD().willNotDraw()) {
                try {
                    zzazh zzazhVarZzS = zzcjlVar.zzS();
                    zzfjo zzfjoVarZzT = zzcjlVar.zzT();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznv)).booleanValue() && zzfjoVarZzT != null) {
                        if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                            uriZzd = zzfjoVarZzT.zza(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                        }
                    } else if (zzazhVarZzS != null && zzazhVarZzS.zza(uriZzd)) {
                        uriZzd = zzazhVarZzS.zzd(uriZzd, zzcjlVar.getContext(), (View) zzcjlVar, zzcjlVar.zzj());
                    }
                } catch (zzazi unused) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzi("Unable to append parameter to URL: ".concat(String.valueOf(p11)));
                }
                com.google.android.gms.ads.internal.zzb zzbVar = this.zzy;
                if (zzbVar != null && !zzbVar.zzb()) {
                    zzbVar.zzc(p11);
                } else {
                    com.google.android.gms.ads.internal.overlay.zzc zzcVar = new com.google.android.gms.ads.internal.overlay.zzc("android.intent.action.VIEW", uriZzd.toString(), null, null, null, null, null, null);
                    zzcjl zzcjlVar2 = this.zza;
                    if (zzcjlVar2 != null) {
                        p12 = zzcjlVar2.zzn();
                    } else {
                        p12 = "";
                    }
                    zzv(zzcVar, true, false, p12);
                }
            } else {
                com.google.android.gms.ads.internal.util.client.zzo.zzi("AdWebView unable to handle URL: ".concat(String.valueOf(p11)));
            }
        }
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 79 || keyCode == 222) {
            return true;
        }
        switch (keyCode) {
            case 85:
            case 86:
            case 87:
            case 88:
            case 89:
            case 90:
            case 91:
                return true;
            default:
                switch (keyCode) {
                    case 126:
                    case 127:
                    case 128:
                    case 129:
                    case 130:
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzclj
    public final void zzQ(Uri uri) {
        final String strSubstring;
        com.google.android.gms.ads.internal.util.zze.zza("Received GMSG: ".concat(String.valueOf(uri)));
        HashMap map = this.zze;
        String path = uri.getPath();
        List list = (List) map.get(path);
        if (path != null && list != null) {
            String encodedQuery = uri.getEncodedQuery();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgF)).booleanValue() && this.zzG.contains(path) && encodedQuery != null) {
                if (encodedQuery.length() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgH)).intValue()) {
                    com.google.android.gms.ads.internal.util.zze.zza("Parsing gmsg query params on BG thread: ".concat(path));
                    zzgzo.zzr(com.google.android.gms.ads.internal.zzt.zzc().zzf(uri), new zzcjn(this, list, path, uri), zzcei.zzf);
                    return;
                }
            }
            com.google.android.gms.ads.internal.zzt.zzc();
            zzaa(com.google.android.gms.ads.internal.util.zzs.zzV(uri), list, path);
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("No GMSG handler found for GMSG: ".concat(String.valueOf(uri)));
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzhF)).booleanValue() && com.google.android.gms.ads.internal.zzt.zzh().zza() != null) {
            if (path != null && path.length() >= 2) {
                strSubstring = path.substring(1);
            } else {
                strSubstring = "null";
            }
            zzcei.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcjt
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() throws Throwable {
                    int i10 = zzcjw.zzc;
                    com.google.android.gms.ads.internal.zzt.zzh().zza().zze(strSubstring);
                }
            });
        }
    }
}
