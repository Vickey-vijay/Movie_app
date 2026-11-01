package com.fyber.inneractive.sdk.player.cache;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.safedk.android.internal.partials.DTExchangeFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f16159p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final b f16160q = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f16161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f16162b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f16163c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f16164d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f16166f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BufferedWriter f16169i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16171k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public f f16172l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f16168h = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LinkedHashMap f16170j = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16173m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f16174n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final a f16175o = new a(this);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f16165e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16167g = 1;

    public g(File file, long j10) {
        this.f16161a = file;
        this.f16162b = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f16163c = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f16164d = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f16166f = j10;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0108 A[Catch: all -> 0x0117, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:7:0x000a, B:10:0x000f, B:12:0x0013, B:14:0x0019, B:16:0x0023, B:20:0x002e, B:21:0x0046, B:23:0x0048, B:25:0x004c, B:27:0x0052, B:29:0x0058, B:31:0x0075, B:30:0x0072, B:32:0x0078, B:34:0x0088, B:36:0x00a3, B:37:0x00b0, B:39:0x00c3, B:41:0x00ea, B:43:0x00f7, B:45:0x00fd, B:49:0x0108, B:40:0x00cb, B:52:0x0111, B:53:0x0116), top: B:57:0x0001 }] */
    public static void a(g gVar, d dVar, boolean z10) {
        synchronized (gVar) {
            e eVar = dVar.f16150a;
            if (eVar.f16157d != dVar) {
                throw new IllegalStateException();
            }
            boolean z11 = false;
            if (z10 && !eVar.f16156c) {
                for (int i10 = 0; i10 < gVar.f16167g; i10++) {
                    if (!dVar.f16151b[i10]) {
                        a(dVar.f16153d, dVar, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                    }
                    if (!eVar.b(i10).exists()) {
                        a(dVar.f16153d, dVar, false);
                        return;
                    }
                }
            }
            for (int i11 = 0; i11 < gVar.f16167g; i11++) {
                File fileB = eVar.b(i11);
                if (!z10) {
                    a(fileB);
                } else if (fileB.exists()) {
                    File fileA = eVar.a(i11);
                    fileB.renameTo(fileA);
                    long j10 = eVar.f16155b[i11];
                    long length = fileA.length();
                    eVar.f16155b[i11] = length;
                    gVar.f16168h = (gVar.f16168h - j10) + length;
                }
            }
            gVar.f16171k++;
            eVar.f16157d = null;
            if (eVar.f16156c || z10) {
                eVar.f16156c = true;
                BufferedWriter bufferedWriter = gVar.f16169i;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(eVar.f16154a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : eVar.f16155b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    gVar.f16173m++;
                }
            } else {
                gVar.f16170j.remove(eVar.f16154a);
                gVar.f16169i.write("REMOVE " + eVar.f16154a + '\n');
            }
            gVar.f16169i.flush();
            if (gVar.f16168h > gVar.f16166f) {
                gVar.f16174n.submit(gVar.f16175o);
            } else {
                int i12 = gVar.f16171k;
                if (i12 >= 2000 && i12 >= gVar.f16170j.size()) {
                    z11 = true;
                }
                if (z11) {
                    gVar.f16174n.submit(gVar.f16175o);
                }
            }
        }
    }

    public final void b() {
        FileInputStream fileInputStream = new FileInputStream(this.f16162b);
        Charset charset = l.f16183a;
        k kVar = new k(fileInputStream);
        try {
            String strA = kVar.a();
            String strA2 = kVar.a();
            String strA3 = kVar.a();
            String strA4 = kVar.a();
            String strA5 = kVar.a();
            if (!DiskLruCache.MAGIC.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f16165e).equals(strA3) || !Integer.toString(this.f16167g).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3426d4.j.f28588e);
            }
            int i10 = 0;
            while (true) {
                try {
                    b(kVar.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f16171k = i10 - this.f16170j.size();
                    if (kVar.f16182e == -1) {
                        c();
                    } else {
                        this.f16169i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16162b, true), l.f16183a));
                    }
                    try {
                        kVar.close();
                        return;
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th2) {
            try {
                kVar.close();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception unused3) {
            }
            throw th2;
        }
    }

    public final synchronized void c() {
        BufferedWriter bufferedWriter = this.f16169i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(DTExchangeFilesBridge.fileOutputStreamCtor(this.f16163c), l.f16183a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f16165e));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f16167g));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (e eVar : this.f16170j.values()) {
                if (eVar.f16157d != null) {
                    bufferedWriter2.write("DIRTY " + eVar.f16154a + '\n');
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(eVar.f16154a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j10 : eVar.f16155b) {
                        sb3.append(' ');
                        sb3.append(j10);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter2.write(sb2.toString());
                }
            }
            bufferedWriter2.close();
            if (this.f16162b.exists()) {
                File file = this.f16162b;
                File file2 = this.f16164d;
                a(file2);
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (!this.f16163c.renameTo(this.f16162b)) {
                throw new IOException();
            }
            this.f16164d.delete();
            this.f16169i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f16162b, true), l.f16183a));
        } catch (Throwable th2) {
            bufferedWriter2.close();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f16169i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f16170j.values()).iterator();
        while (it.hasNext()) {
            d dVar = ((e) it.next()).f16157d;
            if (dVar != null) {
                a(dVar.f16153d, dVar, false);
            }
        }
        d();
        this.f16169i.close();
        this.f16169i = null;
    }

    public final void d() {
        while (this.f16168h > this.f16166f) {
            String str = (String) ((Map.Entry) this.f16170j.entrySet().iterator().next()).getKey();
            f fVar = this.f16172l;
            if (fVar == null) {
                c(str);
            } else if (fVar.a(str)) {
                c(str);
            } else {
                boolean zC = false;
                for (String str2 : this.f16170j.keySet()) {
                    if (this.f16172l.a(str2)) {
                        zC |= c(str2);
                    }
                }
                if (!zC) {
                    return;
                }
            }
        }
    }

    public final void b(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf != -1) {
            int i10 = iIndexOf + 1;
            int iIndexOf2 = str.indexOf(32, i10);
            if (iIndexOf2 == -1) {
                strSubstring = str.substring(i10);
                if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                    this.f16170j.remove(strSubstring);
                    return;
                }
            } else {
                strSubstring = str.substring(i10, iIndexOf2);
            }
            e eVar = (e) this.f16170j.get(strSubstring);
            if (eVar == null) {
                eVar = new e(this, strSubstring);
                this.f16170j.put(strSubstring, eVar);
            }
            if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
                String[] strArrSplit = str.substring(iIndexOf2 + 1).split(Z7.f27998r);
                eVar.f16156c = true;
                eVar.f16157d = null;
                if (strArrSplit.length == eVar.f16158e.f16167g) {
                    for (int i11 = 0; i11 < strArrSplit.length; i11++) {
                        try {
                            eVar.f16155b[i11] = Long.parseLong(strArrSplit[i11]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                eVar.f16157d = new d(this, eVar);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized boolean c(String str) {
        IAlog.e("DiskLruCache remove %s", str);
        if (this.f16169i != null) {
            if (f16159p.matcher(str).matches()) {
                e eVar = (e) this.f16170j.get(str);
                if (eVar != null && eVar.f16157d == null) {
                    for (int i10 = 0; i10 < this.f16167g; i10++) {
                        File fileA = eVar.a(i10);
                        if (fileA.exists() && !fileA.delete()) {
                            throw new IOException("failed to delete " + fileA);
                        }
                        long j10 = this.f16168h;
                        long[] jArr = eVar.f16155b;
                        this.f16168h = j10 - jArr[i10];
                        jArr[i10] = 0;
                    }
                    this.f16171k++;
                    this.f16169i.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f16170j.remove(str);
                    int i11 = this.f16171k;
                    if (i11 >= 2000 && i11 >= this.f16170j.size()) {
                        this.f16174n.submit(this.f16175o);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public static g a(File file, long j10) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else if (!file2.renameTo(file3)) {
                    throw new IOException();
                }
            }
            g gVar = new g(file, j10);
            if (gVar.f16162b.exists()) {
                try {
                    gVar.b();
                    gVar.a();
                    return gVar;
                } catch (IOException e10) {
                    System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                    IAlog.e("DiskLruCache delete cache", new Object[0]);
                    gVar.close();
                    l.a(gVar.f16161a);
                }
            }
            file.mkdirs();
            g gVar2 = new g(file, j10);
            gVar2.c();
            return gVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final void a() throws IOException {
        a(this.f16163c);
        Iterator it = this.f16170j.values().iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            int i10 = 0;
            if (eVar.f16157d == null) {
                while (i10 < this.f16167g) {
                    this.f16168h += eVar.f16155b[i10];
                    i10++;
                }
            } else {
                eVar.f16157d = null;
                while (i10 < this.f16167g) {
                    a(eVar.a(i10));
                    a(eVar.b(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public static void a(File file) throws IOException {
        IAlog.e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public final d a(String str) {
        synchronized (this) {
            if (this.f16169i != null) {
                if (f16159p.matcher(str).matches()) {
                    e eVar = (e) this.f16170j.get(str);
                    if (eVar == null) {
                        eVar = new e(this, str);
                        this.f16170j.put(str, eVar);
                    } else if (eVar.f16157d != null) {
                        return null;
                    }
                    d dVar = new d(this, eVar);
                    eVar.f16157d = dVar;
                    this.f16169i.write("DIRTY " + str + '\n');
                    this.f16169i.flush();
                    return dVar;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }
}
