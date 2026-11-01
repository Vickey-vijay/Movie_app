package com.bykv.vk.openvk.preload.geckox.e;

import com.bykv.vk.openvk.preload.geckox.e.a.c;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import com.bykv.vk.openvk.preload.geckox.utils.g;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: ChannelVerLoader.java */
/* JADX INFO: loaded from: classes10.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f10648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile File f10650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Long f10651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile com.bykv.vk.openvk.preload.geckox.e.a.a f10652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicBoolean f10653f = new AtomicBoolean(false);

    private synchronized com.bykv.vk.openvk.preload.geckox.e.a.a d(String str) throws Exception {
        if (this.f10652e != null) {
            return this.f10652e;
        }
        File fileE = e(str);
        if (fileE == null) {
            throw new FileNotFoundException("channel no exist，channel:".concat(String.valueOf(str)));
        }
        File file = new File(fileE, "res.macv");
        File file2 = new File(fileE, "res");
        if (file2.exists() && file2.isDirectory()) {
            this.f10652e = new c(fileE);
        } else {
            if (!file.exists() || !file.isFile()) {
                throw new RuntimeException("can not find res, dir:" + fileE.getAbsolutePath());
            }
            this.f10652e = new com.bykv.vk.openvk.preload.geckox.e.a.b(fileE);
        }
        return this.f10652e;
    }

    private synchronized File e(String str) throws Exception {
        if (this.f10650c != null) {
            return this.f10650c;
        }
        if (this.f10651d != null && this.f10651d.longValue() == -1) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10648a);
        String str2 = File.separator;
        sb2.append(str2);
        sb2.append(str);
        sb2.append(str2);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        try {
            if (this.f10651d == null) {
                this.f10651d = g.a(new File(this.f10648a, str));
            }
            if (this.f10651d == null) {
                this.f10651d = -1L;
                bVarA.a();
                return null;
            }
            File file = new File(this.f10648a, str2 + str + str2 + this.f10651d + str2 + "using.lock");
            this.f10650c = file.getParentFile();
            com.bykv.vk.openvk.preload.geckox.f.c.a(file.getAbsolutePath());
            File file2 = this.f10650c;
            bVarA.a();
            return file2;
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }

    public final InputStream a(String str) throws Exception {
        return d(this.f10649b).a(a(this.f10649b, str));
    }

    public final boolean b(String str) throws Exception {
        return d(this.f10649b).b(a(this.f10649b, str));
    }

    public final int c(String str) {
        int length;
        try {
            File file = new File(e(str), "res");
            if (file.exists() && file.isDirectory() && (length = file.listFiles().length) > 0) {
                return length - 1;
            }
            return 0;
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    private static String a(String str, String str2) {
        return str2.substring(str.length() + 1);
    }

    public final String b() {
        return this.f10649b;
    }

    public a(String str, String str2) {
        this.f10648a = str;
        this.f10649b = str2;
    }

    public final Long a() {
        return this.f10651d;
    }

    public final void c() throws Exception {
        if (this.f10653f.getAndSet(true)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f10648a);
        String str = File.separator;
        sb2.append(str);
        sb2.append(this.f10649b);
        sb2.append(str);
        sb2.append("select.lock");
        com.bykv.vk.openvk.preload.geckox.f.b bVarA = com.bykv.vk.openvk.preload.geckox.f.b.a(sb2.toString());
        GeckoLogger.d("gecko-file-lock", "channel version loader clean");
        try {
            if (this.f10650c == null) {
                bVarA.a();
                return;
            }
            com.bykv.vk.openvk.preload.geckox.f.c.b(this.f10650c.getAbsolutePath() + str + "using.lock");
            bVarA.a();
            com.bykv.vk.openvk.preload.geckox.a.c.a(this.f10648a + str + this.f10649b);
        } catch (Throwable th2) {
            bVarA.a();
            throw th2;
        }
    }
}
