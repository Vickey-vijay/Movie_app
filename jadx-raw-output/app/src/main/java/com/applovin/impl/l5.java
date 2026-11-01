package com.applovin.impl;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdkUtils;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.safedk.android.analytics.brandsafety.creatives.infos.CreativeInfo;
import com.vungle.ads.internal.model.AdPayload;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public abstract class l5 extends i5 implements v3.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.b f7882g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AppLovinAdLoadListener f7883h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f7884i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final com.applovin.impl.sdk.m f7885j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Collection f7886k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f7887l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ExecutorService f7888m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ExecutorService f7889n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f7890o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private d0 f7891p;

    public class a implements e0.a {
        public a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f7882g.a(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f7707c.a(l5Var.f7706b, "Ad updated with muteImageUri = " + uri);
            }
        }
    }

    public class b implements e0.a {
        public b() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            l5.this.f7882g.b(uri);
            com.applovin.impl.sdk.o oVar = l5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var = l5.this;
                l5Var.f7707c.a(l5Var.f7706b, "Ad updated with unmuteImageUri = " + uri);
            }
        }
    }

    public class c implements e0.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e0.a f7894a;

        public c(e0.a aVar) {
            this.f7894a = aVar;
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri == null) {
                com.applovin.impl.sdk.o oVar = l5.this.f7707c;
                if (com.applovin.impl.sdk.o.a()) {
                    l5 l5Var = l5.this;
                    l5Var.f7707c.b(l5Var.f7706b, "Failed to cache video");
                }
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
                Bundle bundle = new Bundle();
                bundle.putLong(CreativeInfo.f44321c, l5.this.f7882g.getAdIdNumber());
                l5.this.f7705a.t().a(bundle, "video_caching_failed");
                return;
            }
            com.applovin.impl.sdk.o oVar2 = l5.this.f7707c;
            if (com.applovin.impl.sdk.o.a()) {
                l5 l5Var2 = l5.this;
                l5Var2.f7707c.a(l5Var2.f7706b, "Finish caching video for ad #" + l5.this.f7882g.getAdIdNumber() + ". Updating ad with cachedVideoURL = " + uri);
            }
            this.f7894a.a(uri);
        }
    }

    public class d implements d0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e f7896a;

        public d(e eVar) {
            this.f7896a = eVar;
        }

        @Override // com.applovin.impl.d0.c
        public void a(String str, boolean z10) {
            if (z10) {
                l5.this.a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                return;
            }
            e eVar = this.f7896a;
            if (eVar != null) {
                eVar.a(str);
            }
        }
    }

    public interface e {
        void a(String str);
    }

    @Override // com.applovin.impl.v3.a
    public void a(y2 y2Var) {
        if (y2Var.Q().equalsIgnoreCase(this.f7882g.getMediationServeId())) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Updating flag for timeout...");
            }
            g();
        }
        this.f7705a.Z().b(this);
    }

    public e0 b(String str, e0.a aVar) {
        return a(str, this.f7882g.S(), true, aVar);
    }

    public Uri c(String str) {
        return b(str, this.f7882g.S(), true);
    }

    public List e() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching mute images...");
        }
        ArrayList arrayList = new ArrayList();
        if (this.f7882g.G() != null) {
            arrayList.add(a(this.f7882g.G().toString(), new a()));
        }
        if (this.f7882g.Y() != null) {
            arrayList.add(a(this.f7882g.Y().toString(), new b()));
        }
        return arrayList;
    }

    public void g() {
        this.f7887l = true;
        List list = this.f7890o;
        if (list != null && !list.isEmpty()) {
            Iterator it = this.f7890o.iterator();
            while (it.hasNext()) {
                ((c0) it.next()).a(true);
            }
        }
        if (this.f7705a.q0().e()) {
            d0 d0Var = this.f7891p;
            if (d0Var != null) {
                d0Var.c();
                return;
            }
            return;
        }
        ExecutorService executorService = this.f7888m;
        if (executorService != null) {
            executorService.shutdown();
            this.f7888m = null;
        }
        ExecutorService executorService2 = this.f7889n;
        if (executorService2 != null) {
            executorService2.shutdown();
            this.f7889n = null;
        }
    }

    private Collection h() {
        HashSet hashSet = new HashSet();
        for (char c10 : ((String) this.f7705a.a(x4.D0)).toCharArray()) {
            hashSet.add(Character.valueOf(c10));
        }
        hashSet.add('\"');
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        AppLovinAdLoadListener appLovinAdLoadListener = this.f7883h;
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f7882g);
            this.f7883h = null;
        }
    }

    public Uri b(String str, List list, boolean z10) {
        if (!StringUtils.isValidString(str)) {
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching video " + str + "...");
        }
        int iA = this.f7705a.G().a(str, this.f7882g);
        Map mapA = f2.a((AppLovinAdImpl) this.f7882g);
        String strA = this.f7885j.a(a(), str, this.f7882g.getCachePrefix(), list, z10, iA, this.f7884i, mapA);
        if (!StringUtils.isValidString(strA)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Failed to cache video: " + str);
            }
            a(str, "cacheVideo", mapA);
            a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
            return null;
        }
        File fileA = this.f7885j.a(strA, a());
        if (fileA == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to retrieve File from cached video filename = " + strA);
            }
            a(strA, "retrieveVideoFile", mapA);
            return null;
        }
        Uri uriFromFile = Uri.fromFile(fileA);
        if (uriFromFile == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Unable to create URI from cached video file = " + fileA);
            }
            a(strA, "extractUriFromVideoFile", mapA);
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Finish caching video for ad #" + this.f7882g.getAdIdNumber() + ". Updating ad with cachedVideoFilename = " + strA);
        }
        return uriFromFile;
    }

    public String c(String str, List list, boolean z10) {
        try {
            InputStream inputStreamA = this.f7885j.a(str, list, z10, f2.a((AppLovinAdImpl) this.f7882g));
            if (inputStreamA == null) {
                if (inputStreamA != null) {
                    inputStreamA.close();
                }
                return null;
            }
            try {
                String strA = this.f7885j.a(inputStreamA);
                inputStreamA.close();
                return strA;
            } catch (Throwable th2) {
                try {
                    inputStreamA.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (Throwable th4) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Unknown failure to read input stream.", th4);
            }
            this.f7707c.a(this.f7706b, th4);
            this.f7705a.D().a(this.f7706b, "readInputStreamAsString", th4);
            return null;
        }
    }

    public void k() {
        this.f7705a.Z().b(this);
        if (!this.f7705a.q0().e()) {
            ExecutorService executorService = this.f7888m;
            if (executorService != null) {
                executorService.shutdown();
                this.f7888m = null;
            }
            ExecutorService executorService2 = this.f7889n;
            if (executorService2 != null) {
                executorService2.shutdown();
                this.f7889n = null;
            }
        }
        MaxAdFormat maxAdFormatD = this.f7882g.getAdZone().d();
        if (((Boolean) this.f7705a.a(x4.X0)).booleanValue() && maxAdFormatD != null && maxAdFormatD.isFullscreenAd()) {
            this.f7705a.h().b(this.f7882g);
        }
        this.f7705a.d0().a(this.f7884i);
    }

    public boolean l() {
        return this.f7887l;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f7882g.b1()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Subscribing to timeout events...");
            }
            this.f7705a.Z().a(this);
        }
    }

    public l5(String str, com.applovin.impl.sdk.ad.b bVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        String string;
        super(str, kVar);
        this.f7884i = UUID.randomUUID().toString();
        if (bVar != null) {
            this.f7882g = bVar;
            this.f7883h = appLovinAdLoadListener;
            this.f7885j = kVar.G();
            this.f7886k = h();
            if (((Boolean) kVar.a(x4.I0)).booleanValue()) {
                if (kVar.q0().e()) {
                    this.f7888m = kVar.q0().a();
                    this.f7889n = kVar.q0().d();
                    return;
                }
                if (StringUtils.isValidString(bVar.getMediationServeId())) {
                    string = bVar.getMediationServeId();
                } else {
                    string = UUID.randomUUID().toString();
                }
                this.f7888m = kVar.q0().a("com.applovin.sdk.caching." + string, ((Integer) kVar.a(x4.K0)).intValue());
                this.f7889n = kVar.q0().a("com.applovin.sdk.caching.html." + string, ((Integer) kVar.a(x4.L0)).intValue());
                return;
            }
            return;
        }
        throw new IllegalArgumentException("No ad specified.");
    }

    public void f() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Rendered new ad:" + this.f7882g);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.zb
            @Override // java.lang.Runnable
            public final void run() {
                this.f10280b.i();
            }
        });
    }

    public void j() {
        if (o0.d()) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching mute images...");
        }
        Uri uriA = a(this.f7882g.G(), CampaignEx.JSON_NATIVE_VIDEO_MUTE);
        if (uriA != null) {
            this.f7882g.a(uriA);
        }
        Uri uriA2 = a(this.f7882g.Y(), CampaignEx.JSON_NATIVE_VIDEO_UNMUTE);
        if (uriA2 != null) {
            this.f7882g.b(uriA2);
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Ad updated with muteImageFilename = " + this.f7882g.G() + ", unmuteImageFilename = " + this.f7882g.Y());
        }
    }

    public List a(List list) {
        this.f7890o = list;
        return this.f7705a.q0().a(list, this.f7888m);
    }

    public e0 a(String str, e0.a aVar) {
        return new e0(str, this.f7882g, this.f7884i, this.f7705a, aVar);
    }

    public e0 a(String str, List list, boolean z10, e0.a aVar) {
        if (TextUtils.isEmpty(str)) {
            if (!com.applovin.impl.sdk.o.a()) {
                return null;
            }
            this.f7707c.a(this.f7706b, "No video to cache, skipping...");
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching video " + str + "...");
        }
        return new e0(str, this.f7882g, list, z10, this.f7884i, this.f7705a, new c(aVar));
    }

    public d0 a(String str, List list, e eVar) {
        d0 d0Var = new d0(str, this.f7882g, list, this.f7889n, this.f7884i, this.f7705a, new d(eVar));
        this.f7891p = d0Var;
        return d0Var;
    }

    public Uri a(Uri uri, String str) {
        if (uri == null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "No " + str + " image to cache");
            }
            return null;
        }
        String string = uri.toString();
        if (TextUtils.isEmpty(string)) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to cache " + str + " image");
            }
            return null;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f7707c.a(this.f7706b, "Caching " + str + " image...");
        }
        return b(string);
    }

    public Uri b(String str) {
        return a(str, this.f7882g.S(), true);
    }

    public Uri a(String str, List list, boolean z10) {
        try {
            int iA = this.f7705a.G().a(str, this.f7882g);
            Map mapA = f2.a((AppLovinAdImpl) this.f7882g);
            String strA = this.f7885j.a(a(), str, this.f7882g.getCachePrefix(), list, z10, iA, this.f7884i, mapA);
            if (StringUtils.isValidString(strA)) {
                File fileA = this.f7885j.a(strA, a());
                if (fileA != null) {
                    Uri uriFromFile = Uri.fromFile(fileA);
                    if (uriFromFile != null) {
                        return uriFromFile;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.b(this.f7706b, "Unable to extract Uri from image file");
                    }
                    a(strA, "extractUriFromImageFile", mapA);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f7707c.b(this.f7706b, "Unable to retrieve File from cached image filename = " + strA);
                }
                a(strA, "retrieveImageFile", mapA);
                return null;
            }
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.b(this.f7706b, "Failed to cache image: " + str);
            }
            a(str, "cacheImageResource", mapA);
            return null;
        } catch (Throwable th2) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Failed to cache image at url = " + str, th2);
            }
            Map mapA2 = f2.a((AppLovinAdImpl) this.f7882g);
            CollectionUtils.putStringIfValid("url", str, mapA2);
            this.f7705a.D().a(this.f7706b, "cacheImageResource", th2, mapA2);
            return null;
        }
    }

    public void a(com.applovin.impl.sdk.ad.b bVar) {
        String strA0 = bVar.a0();
        if (bVar.J0() && StringUtils.isValidString(strA0)) {
            String strA = a(strA0, bVar.S(), bVar);
            bVar.c(strA);
            this.f7707c.f(this.f7706b, "Ad updated with video button HTML assets cached = " + strA);
        }
    }

    public String a(String str, List list, com.applovin.impl.sdk.ad.b bVar) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (!((Boolean) this.f7705a.a(x4.E0)).booleanValue()) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Resource caching is disabled, skipping cache...");
            }
            return str;
        }
        StringBuilder sb2 = new StringBuilder(str);
        List listQ = bVar.Q();
        List listH = bVar.H();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int iIndexOf = 0;
            int i10 = 0;
            while (iIndexOf < sb2.length()) {
                if (l()) {
                    return str;
                }
                iIndexOf = sb2.indexOf(str2, i10);
                if (iIndexOf == -1) {
                    break;
                }
                int length = sb2.length();
                int i11 = iIndexOf;
                while (!this.f7886k.contains(Character.valueOf(sb2.charAt(i11))) && i11 < length) {
                    i11++;
                }
                if (i11 > iIndexOf && i11 != length) {
                    String strSubstring = sb2.substring(str2.length() + iIndexOf, i11);
                    String str3 = str2 + strSubstring;
                    if (StringUtils.isValidString(strSubstring) && !listH.contains(str3)) {
                        Uri uriA = a(str2, strSubstring);
                        if (uriA != null) {
                            sb2.replace(iIndexOf, i11, uriA.toString());
                            bVar.a(uriA.toString(), str3);
                        } else {
                            if (listQ.contains(str3)) {
                                a(AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES);
                                this.f7887l = true;
                            }
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f7707c.b(this.f7706b, "Failed to cache HTML Resource: " + str3);
                            }
                            a(str3, "cacheHtmlResource", f2.a((AppLovinAdImpl) bVar));
                        }
                    } else if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.a(this.f7706b, "Skip caching of optional or non-resource: " + strSubstring);
                    }
                    i10 = i11;
                } else {
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f7707c.b(this.f7706b, "Unable to cache resource; ad HTML is invalid.");
                    }
                    return str;
                }
            }
        }
        return sb2.toString();
    }

    private Uri a(String str, String str2) {
        File fileA = this.f7885j.a(n7.a(Uri.parse(str2), this.f7882g.getCachePrefix(), this.f7705a), com.applovin.impl.sdk.k.o());
        if (fileA == null) {
            return null;
        }
        if (!((Boolean) this.f7705a.a(x4.Q6)).booleanValue() && this.f7885j.a(fileA)) {
            return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
        }
        String str3 = str + str2;
        if (!this.f7885j.a(fileA, str3, Arrays.asList(str), this.f7705a.G().a(str3, this.f7882g), this.f7884i, f2.a((AppLovinAdImpl) this.f7882g))) {
            return null;
        }
        return Uri.parse(AdPayload.FILE_SCHEME + fileA.getAbsolutePath());
    }

    public void a(int i10) {
        if (this.f7883h != null) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f7707c.a(this.f7706b, "Calling back ad load failed with error code: " + i10);
            }
            this.f7883h.failedToReceiveAd(i10);
            this.f7883h = null;
        }
        g();
    }

    public void a(String str, String str2, Map map) {
        HashMap map2 = new HashMap(map);
        CollectionUtils.putStringIfValid("url", str, map2);
        this.f7705a.D().a(d2.M0, str2, map2);
    }
}
