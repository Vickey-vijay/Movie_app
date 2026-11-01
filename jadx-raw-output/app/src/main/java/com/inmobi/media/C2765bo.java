package com.inmobi.media;

import android.content.Context;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.inmobi.media.C2765bo;
import com.inmobi.media.core.config.models.AdConfig;
import com.ironsource.C3426d4;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;
import kotlin.Pair;

/* JADX INFO: renamed from: com.inmobi.media.bo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2765bo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public H5 f24094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2739ao f24095b;

    public final InputStream a(String str, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(str, "url");
        H5 h10 = this.f24094a;
        if (h10 == null) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed readFromCache: " + str);
            }
            return null;
        }
        try {
            G5 g5B = h10.b(String.valueOf(str.hashCode()));
            if (g5B != null && ck.p.e(str, AbstractC2762bl.a(new InputStreamReader(g5B.f22717a[0], AbstractC2762bl.f24083b)))) {
                return g5B.f22717a[1];
            }
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "did not find any valid cache entry for " + str);
            }
            return null;
        } catch (Exception e10) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "Failed to read from cache with: " + e10.getMessage() + " for " + str);
            }
        }
    }

    public C2765bo(final Context context, final AdConfig.WebAssetCacheConfig webAssetCacheConfig) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(webAssetCacheConfig, "webAssetCacheConfig");
        this.f24095b = new C2739ao();
        Runnable runnable = new Runnable() { // from class: b7.t5
            @Override // java.lang.Runnable
            public final void run() {
                C2765bo.a(webAssetCacheConfig, this, context);
            }
        };
        Context context2 = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public final boolean a(String str, String str2, InterfaceC3028m9 interfaceC3028m9) throws Throwable {
        ck.p.j(str, "url");
        ck.p.j(str2, "data");
        if (this.f24094a == null) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "Disk Cache Failed to Initialize. Failed writeToCache: " + str);
            }
            return false;
        }
        try {
            String strValueOf = String.valueOf(str.hashCode());
            H5 h10 = this.f24094a;
            OutputStreamWriter outputStreamWriter = null;
            if (h10 == null) {
                ck.p.B("diskLruCache");
                h10 = null;
            }
            D5 d5A = h10.a(strValueOf);
            if (d5A == null) {
                if (interfaceC3028m9 != null) {
                    ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: diskLruCache.editor is null for " + str);
                }
                return false;
            }
            try {
                OutputStream outputStreamA = d5A.a(0);
                Charset charset = AbstractC2762bl.f24083b;
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(outputStreamA, charset);
                try {
                    outputStreamWriter2.write(str);
                    AbstractC2762bl.a(outputStreamWriter2);
                    try {
                        OutputStreamWriter outputStreamWriter3 = new OutputStreamWriter(d5A.a(1), charset);
                        try {
                            outputStreamWriter3.write(str2);
                            AbstractC2762bl.a(outputStreamWriter3);
                            if (d5A.f22504c) {
                                d5A.f22505d.a(d5A, false);
                                d5A.f22505d.d(d5A.f22502a.f22565a);
                            } else {
                                d5A.f22505d.a(d5A, true);
                            }
                            return true;
                        } catch (Throwable th2) {
                            th = th2;
                            outputStreamWriter = outputStreamWriter3;
                            AbstractC2762bl.a(outputStreamWriter);
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    outputStreamWriter = outputStreamWriter2;
                    AbstractC2762bl.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception e10) {
            if (interfaceC3028m9 != null) {
                ((C3053n9) interfaceC3028m9).a("WebAssetLRUCacheHelper", "Failed to write to cache diskLruCache with: " + e10.getMessage() + " for " + str);
            }
        }
    }

    public static final void a(AdConfig.WebAssetCacheConfig webAssetCacheConfig, C2765bo c2765bo, Context context) {
        try {
            C3298x5.f25687a.getClass();
            long j10 = C3298x5.f25689c;
            if (j10 < webAssetCacheConfig.getMinAvailableDiskSpace()) {
                c2765bo.getClass();
                a(context, j10);
                ConcurrentHashMap concurrentHashMap = Ea.f22576b;
                Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", false);
                return;
            }
            c2765bo.a(context, webAssetCacheConfig, j10);
            ConcurrentHashMap concurrentHashMap2 = Ea.f22576b;
            Ea.a(Da.a(context, "web_asset_file_key"), "cache_enabled", true);
        } catch (Exception e10) {
            mj.g gVar = P9.f23321a;
            P9.a(new L2(e10));
            e10.getMessage();
        }
    }

    public final void a(Context context, AdConfig.WebAssetCacheConfig webAssetCacheConfig, long j10) throws IOException {
        File file = new File(context.getFilesDir(), "inmobiwebassetcache");
        ck.p.j(webAssetCacheConfig, "webAssetCacheConfig");
        long jMin = ((long) (j10 == -1 ? 0 : Math.min(webAssetCacheConfig.getCacheSize(), (int) ((j10 * ((long) webAssetCacheConfig.getCacheSizeToDiskSpaceMaxPercent())) / ((long) 100))))) * 1024 * ((long) 1024);
        C2739ao c2739ao = this.f24095b;
        Pattern pattern = H5.f22770p;
        if (jMin > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            H5 h10 = new H5(file, jMin, c2739ao);
            if (h10.f22774c.exists()) {
                try {
                    h10.b();
                    h10.a();
                    h10.f22783l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(h10.f22774c, true), AbstractC2762bl.f24082a));
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    h10.close();
                    AbstractC2762bl.a(h10.f22773b);
                    file.mkdirs();
                    h10 = new H5(file, jMin, c2739ao);
                    h10.c();
                }
            } else {
                file.mkdirs();
                h10 = new H5(file, jMin, c2739ao);
                h10.c();
            }
            this.f24094a = h10;
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void a(Context context, long j10) {
        Pair pairA = mj.h.a("size", Long.valueOf(j10));
        ConcurrentHashMap concurrentHashMap = Ea.f22576b;
        Ea eaA = Da.a(context, "web_asset_file_key");
        ck.p.j("cache_enabled", C3426d4.i.W);
        Map mapO = kotlin.collections.a.o(pairA, mj.h.a("state", Boolean.valueOf(eaA.f22577a.getBoolean("cache_enabled", false))));
        Wj wj2 = Wj.f23753a;
        Wj.b("LowAvailableSpaceForCache", mapO, EnumC2735ak.SDK);
    }
}
