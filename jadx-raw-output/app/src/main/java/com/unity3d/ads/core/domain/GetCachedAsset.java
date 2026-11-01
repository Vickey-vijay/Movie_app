package com.unity3d.ads.core.domain;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebResourceResponse;
import androidx.annotation.RequiresApi;
import androidx.core.app.NotificationCompat;
import ck.p;
import com.ironsource.G5;
import com.ironsource.Y5;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.StringExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.Result;
import kotlin.c;
import lk.a0;
import nk.i;

/* JADX INFO: compiled from: GetCachedAsset.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class GetCachedAsset {
    private final CacheRepository cacheRepository;
    private final CacheWebViewAssets cacheWebViewAssets;
    private final Context context;

    public GetCachedAsset(CacheRepository cacheRepository, Context context, CacheWebViewAssets cacheWebViewAssets) {
        p.j(cacheRepository, "cacheRepository");
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(cacheWebViewAssets, "cacheWebViewAssets");
        this.cacheRepository = cacheRepository;
        this.context = context;
        this.cacheWebViewAssets = cacheWebViewAssets;
    }

    @RequiresApi(21)
    private final WebResourceResponse getNotFoundResponse() {
        return new WebResourceResponse("text/html", G5.N, 404, "Not Found", kotlin.collections.a.j(), new ByteArrayInputStream(new byte[0]));
    }

    public static /* synthetic */ WebResourceResponse invoke$default(GetCachedAsset getCachedAsset, Uri uri, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = "";
        }
        return getCachedAsset.invoke(uri, str);
    }

    private final WebResourceResponse tryGetWebViewAsset(Uri uri, String str) {
        Object objM3458constructorimpl;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        String string = uri.toString();
        p.i(string, "uri.toString()");
        sb2.append(a0.a1(a0.e1(string, "?", null, 2, null), "/", null, 2, null));
        String string2 = sb2.toString();
        File file = this.cacheWebViewAssets.getCached().get(string2);
        if (file == null) {
            return null;
        }
        try {
            Result.a aVar = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(new FileInputStream(file));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
        }
        if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
            objM3458constructorimpl = null;
        }
        FileInputStream fileInputStream = (FileInputStream) objM3458constructorimpl;
        if (fileInputStream == null) {
            return null;
        }
        return new WebResourceResponse(StringExtensionsKt.guessMimeType(string2), null, fileInputStream);
    }

    @RequiresApi(21)
    private final WebResourceResponse getBundledAsset(Uri uri) {
        String strW0 = a0.W0(String.valueOf(uri.getPath()), "/", null, 2, null);
        try {
            InputStream inputStreamOpen = this.context.getAssets().open(strW0);
            p.i(inputStreamOpen, "context.assets.open(fileName)");
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(strW0), null, inputStreamOpen);
        } catch (Exception unused) {
            return getNotFoundResponse();
        }
    }

    @RequiresApi(21)
    private final WebResourceResponse getCachedAsset(Uri uri) {
        Object objM3458constructorimpl;
        String string = uri.toString();
        p.i(string, "uri.toString()");
        CacheResult cacheResult = (CacheResult) i.b(null, new GetCachedAsset$getCachedAsset$result$1(this, a0.a1(string, "/", null, 2, null), null), 1, null);
        if (cacheResult instanceof CacheResult.Success) {
            File file = ((CacheResult.Success) cacheResult).getCachedFile().getFile();
            if (file == null) {
                return null;
            }
            try {
                Result.a aVar = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(new FileInputStream(file));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                objM3458constructorimpl = Result.m3458constructorimpl(c.a(th2));
            }
            if (Result.m3463isFailureimpl(objM3458constructorimpl)) {
                objM3458constructorimpl = null;
            }
            FileInputStream fileInputStream = (FileInputStream) objM3458constructorimpl;
            if (fileInputStream == null) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            p.i(absolutePath, Y5.c.f27929c);
            return new WebResourceResponse(StringExtensionsKt.guessMimeType(absolutePath), null, fileInputStream);
        }
        return getNotFoundResponse();
    }

    @RequiresApi(21)
    public final WebResourceResponse invoke(Uri uri, String str) {
        p.j(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        p.j(str, "webviewType");
        String host = uri.getHost();
        if (host != null) {
            int iHashCode = host.hashCode();
            if (iHashCode != -1921537799) {
                if (iHashCode == -1920242293 && host.equals(UnityAdsConstants.DefaultUrls.AD_CACHE_DOMAIN)) {
                    return getCachedAsset(uri);
                }
            } else if (host.equals(UnityAdsConstants.DefaultUrls.AD_ASSET_DOMAIN)) {
                return getBundledAsset(uri);
            }
        }
        return tryGetWebViewAsset(uri, str);
    }
}
