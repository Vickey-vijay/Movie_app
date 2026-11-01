package com.bykv.vk.openvk.preload.geckox.e;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import java.io.File;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: VersionedResLoader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, a> f10655a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicBoolean f10656b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f10657c;

    public final String a() {
        return this.f10657c;
    }

    public final int b(String str) throws Exception {
        if (this.f10656b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).c(str);
    }

    public final boolean c(String str) throws Exception {
        if (this.f10656b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).b(str);
    }

    private a d(String str) {
        a aVar;
        int iIndexOf = str.indexOf("/");
        if (iIndexOf == -1) {
            new RuntimeException("channel：".concat(str));
        }
        String strSubstring = str.substring(0, iIndexOf);
        synchronized (this.f10655a) {
            aVar = this.f10655a.get(strSubstring);
            if (aVar == null) {
                aVar = new a(this.f10657c, strSubstring);
                this.f10655a.put(strSubstring, aVar);
            }
        }
        return aVar;
    }

    public final InputStream a(String str) throws Exception {
        if (this.f10656b.get()) {
            throw new RuntimeException("released");
        }
        if (TextUtils.isEmpty(str)) {
            throw new RuntimeException("relativePath empty");
        }
        return d(str.trim()).a(str);
    }

    public b(Context context, String str, File file) {
        if (!TextUtils.isEmpty(str)) {
            if (file == null) {
                this.f10657c = new File(context.getFilesDir(), "gecko_offline_res_x" + File.separator + str).getAbsolutePath();
                return;
            }
            this.f10657c = new File(file, str).getAbsolutePath();
            return;
        }
        throw new RuntimeException("access key empty");
    }

    public final Map<String, Long> b() {
        HashMap map = new HashMap();
        synchronized (this.f10655a) {
            Collection<a> collectionValues = this.f10655a.values();
            if (collectionValues == null) {
                return map;
            }
            for (a aVar : collectionValues) {
                map.put(aVar.b(), aVar.a());
            }
            return map;
        }
    }

    public final void c() throws Exception {
        if (this.f10656b.getAndSet(true)) {
            return;
        }
        GeckoLogger.d("Loader", "release version res loader");
        synchronized (this.f10655a) {
            Iterator<a> it = this.f10655a.values().iterator();
            while (it.hasNext()) {
                it.next().c();
            }
            this.f10655a.clear();
        }
    }
}
