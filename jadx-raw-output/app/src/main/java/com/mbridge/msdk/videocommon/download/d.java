package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import androidx.multidex.MultiDexExtractor;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: H5DownLoadManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static d f39515h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CopyOnWriteArrayList<String> f39516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ConcurrentMap<String, Object> f39517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f39518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private f f39519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f39520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f39521f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f39522g = "down_type";

    public static synchronized d a() {
        if (f39515h == null) {
            f39515h = new d();
        }
        return f39515h;
    }

    private String b(String str) {
        f fVar = this.f39519d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String c(String str) {
        i iVar = this.f39518c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    private d() {
        this.f39520e = false;
        try {
            this.f39518c = i.a();
            this.f39519d = f.a();
            this.f39516a = new CopyOnWriteArrayList<>();
            this.f39517b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g gVarD = com.mbridge.msdk.setting.h.b().d(com.mbridge.msdk.foundation.controller.c.n().b());
            if (gVarD != null) {
                this.f39520e = gVarD.b(1);
            }
        } catch (Throwable th2) {
            q0.b("H5DownLoadManager", th2.getMessage(), th2);
        }
    }

    public String a(String str) {
        try {
            if (Patterns.WEB_URL.matcher(str).matches() || URLUtil.isValidUrl(str)) {
                Uri uri = Uri.parse(str);
                String path = uri.getPath();
                if (TextUtils.isEmpty(path) || !TextUtils.isEmpty(uri.getQueryParameter("urlDebug"))) {
                    return str;
                }
                if (path.toLowerCase().endsWith(MultiDexExtractor.EXTRACTED_SUFFIX)) {
                    return c(str);
                }
                return b(str);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        return str;
    }
}
