package com.inmobi.media;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.InMobiFilesBridge;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public final class H5 implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f22770p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final A5 f22771q = new A5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f22773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f22774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f22775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f22776e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F5 f22778g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f22781j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public BufferedWriter f22783l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f22784m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadPoolExecutor f22772a = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final LinkedHashMap f22780i = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f22782k = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f22785n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final B5 f22786o = new B5(this);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f22777f = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f22779h = 2;

    public final void a() throws IOException {
        File file = this.f22775d;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f22780i.values().iterator();
        while (it.hasNext()) {
            E5 e10 = (E5) it.next();
            int i10 = 0;
            if (e10.f22568d == null) {
                while (i10 < this.f22779h) {
                    this.f22782k += e10.f22566b[i10];
                    i10++;
                }
            } else {
                e10.f22568d = null;
                while (i10 < this.f22779h) {
                    File fileA = e10.a(i10);
                    if (fileA.exists() && !fileA.delete()) {
                        throw new IOException();
                    }
                    File fileB = e10.b(i10);
                    if (fileB.exists() && !fileB.delete()) {
                        throw new IOException();
                    }
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void b() {
        Gj gj2 = new Gj(new FileInputStream(this.f22774c), AbstractC2762bl.f24082a);
        try {
            String strA = gj2.a();
            String strA2 = gj2.a();
            String strA3 = gj2.a();
            String strA4 = gj2.a();
            String strA5 = gj2.a();
            if (!DiskLruCache.MAGIC.equals(strA) || !"1".equals(strA2) || !Integer.toString(this.f22777f).equals(strA3) || !Integer.toString(this.f22779h).equals(strA4) || !"".equals(strA5)) {
                throw new IOException("unexpected journal header: [" + strA + ", " + strA2 + ", " + strA4 + ", " + strA5 + C3426d4.j.f28588e);
            }
            int i10 = 0;
            while (true) {
                try {
                    c(gj2.a());
                    i10++;
                } catch (EOFException unused) {
                    this.f22784m = i10 - this.f22780i.size();
                    AbstractC2762bl.a(gj2);
                    return;
                }
            }
        } catch (Throwable th2) {
            AbstractC2762bl.a(gj2);
            throw th2;
        }
    }

    public final void c(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: ".concat(str));
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f22780i.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        E5 e10 = (E5) this.f22780i.get(strSubstring);
        if (e10 == null) {
            e10 = new E5(this, strSubstring);
            this.f22780i.put(strSubstring, e10);
        }
        if (iIndexOf2 == -1 || iIndexOf != 5 || !str.startsWith("CLEAN")) {
            if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
                e10.f22568d = new D5(this, e10);
                return;
            } else {
                if (iIndexOf2 != -1 || iIndexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException("unexpected journal line: ".concat(str));
                }
                return;
            }
        }
        String[] strArrSplit = str.substring(iIndexOf2 + 1).split(com.ironsource.Z7.f27998r);
        e10.f22567c = true;
        e10.f22568d = null;
        if (strArrSplit.length != e10.f22569e.f22779h) {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
        }
        for (int i11 = 0; i11 < strArrSplit.length; i11++) {
            try {
                e10.f22566b[i11] = Long.parseLong(strArrSplit[i11]);
            } catch (NumberFormatException unused) {
                throw new IOException("unexpected journal line: " + Arrays.toString(strArrSplit));
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f22783l == null) {
            return;
        }
        Iterator it = new ArrayList(this.f22780i.values()).iterator();
        while (it.hasNext()) {
            D5 d10 = ((E5) it.next()).f22568d;
            if (d10 != null) {
                d10.f22505d.a(d10, false);
            }
        }
        while (this.f22782k > this.f22781j) {
            d((String) ((Map.Entry) this.f22780i.entrySet().iterator().next()).getKey());
        }
        this.f22783l.close();
        this.f22783l = null;
    }

    public final synchronized void d(String str) {
        if (this.f22783l == null) {
            throw new IllegalStateException("cache is closed");
        }
        if (!f22770p.matcher(str).matches()) {
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        E5 e10 = (E5) this.f22780i.get(str);
        if (e10 != null && e10.f22568d == null) {
            for (int i10 = 0; i10 < this.f22779h; i10++) {
                File fileA = e10.a(i10);
                if (this.f22778g != null) {
                    ck.p.j(fileA, C3426d4.i.f28530b);
                    if (str != null && i10 == 0) {
                        String str2 = "";
                        try {
                            String strA = AbstractC2762bl.a(new InputStreamReader(new FileInputStream(fileA), AbstractC2762bl.f24083b));
                            ck.p.i(strA, "readFully(...)");
                            str2 = strA;
                        } catch (Exception unused) {
                        }
                        Map mapO = kotlin.collections.a.o(mj.h.a("urlKey", str), mj.h.a("url", str2));
                        Wj wj2 = Wj.f23753a;
                        Wj.b("ResourceDiskCacheFileEvicted", mapO, EnumC2735ak.SDK);
                    }
                }
                if (fileA.exists() && !fileA.delete()) {
                    throw new IOException("failed to delete " + fileA);
                }
                long j10 = this.f22782k;
                long[] jArr = e10.f22566b;
                this.f22782k = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f22784m++;
            this.f22783l.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f22780i.remove(str);
            int i11 = this.f22784m;
            if (i11 >= 2000 && i11 >= this.f22780i.size()) {
                this.f22772a.submit(this.f22786o);
            }
        }
    }

    public H5(File file, long j10, F5 f10) {
        this.f22773b = file;
        this.f22774c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f22775d = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f22776e = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f22781j = j10;
        this.f22778g = f10;
    }

    public final D5 a(String str) {
        synchronized (this) {
            if (this.f22783l != null) {
                if (f22770p.matcher(str).matches()) {
                    E5 e10 = (E5) this.f22780i.get(str);
                    if (e10 == null) {
                        e10 = new E5(this, str);
                        this.f22780i.put(str, e10);
                    } else if (e10.f22568d != null) {
                        return null;
                    }
                    D5 d10 = new D5(this, e10);
                    e10.f22568d = d10;
                    this.f22783l.write("DIRTY " + str + '\n');
                    this.f22783l.flush();
                    return d10;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    public final synchronized G5 b(String str) {
        InputStream inputStream;
        if (this.f22783l != null) {
            if (f22770p.matcher(str).matches()) {
                E5 e10 = (E5) this.f22780i.get(str);
                if (e10 == null) {
                    return null;
                }
                if (!e10.f22567c) {
                    return null;
                }
                InputStream[] inputStreamArr = new InputStream[this.f22779h];
                for (int i10 = 0; i10 < this.f22779h; i10++) {
                    try {
                        inputStreamArr[i10] = new FileInputStream(e10.a(i10));
                    } catch (FileNotFoundException unused) {
                        if (this.f22778g != null) {
                            ck.p.j(str, C3426d4.i.W);
                            Map mapO = kotlin.collections.a.o(mj.h.a("urlKey", str));
                            Wj wj2 = Wj.f23753a;
                            Wj.b("ResourceDiskCacheFileMissing", mapO, EnumC2735ak.SDK);
                        }
                        for (int i11 = 0; i11 < this.f22779h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                            AbstractC2762bl.a(inputStream);
                        }
                        return null;
                    }
                }
                this.f22784m++;
                this.f22783l.append((CharSequence) ("READ " + str + '\n'));
                int i12 = this.f22784m;
                if (i12 >= 2000 && i12 >= this.f22780i.size()) {
                    this.f22772a.submit(this.f22786o);
                }
                return new G5(inputStreamArr);
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    public final synchronized void c() {
        BufferedWriter bufferedWriter = this.f22783l;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(InMobiFilesBridge.fileOutputStreamCtor(this.f22775d), AbstractC2762bl.f24082a));
        try {
            bufferedWriter2.write(DiskLruCache.MAGIC);
            bufferedWriter2.write("\n");
            bufferedWriter2.write("1");
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f22777f));
            bufferedWriter2.write("\n");
            bufferedWriter2.write(Integer.toString(this.f22779h));
            bufferedWriter2.write("\n");
            bufferedWriter2.write("\n");
            for (E5 e10 : this.f22780i.values()) {
                if (e10.f22568d != null) {
                    bufferedWriter2.write("DIRTY " + e10.f22565a + '\n');
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("CLEAN ");
                    sb2.append(e10.f22565a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j10 : e10.f22566b) {
                        sb3.append(' ');
                        sb3.append(j10);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter2.write(sb2.toString());
                }
            }
            bufferedWriter2.close();
            if (this.f22774c.exists()) {
                File file = this.f22774c;
                File file2 = this.f22776e;
                if (file2.exists() && !file2.delete()) {
                    throw new IOException();
                }
                if (!file.renameTo(file2)) {
                    throw new IOException();
                }
            }
            if (this.f22775d.renameTo(this.f22774c)) {
                this.f22776e.delete();
                this.f22783l = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f22774c, true), AbstractC2762bl.f24082a));
            } else {
                throw new IOException();
            }
        } catch (Throwable th2) {
            bufferedWriter2.close();
            throw th2;
        }
    }

    public final synchronized void a(D5 d10, boolean z10) {
        int i10;
        E5 e10 = d10.f22502a;
        if (e10.f22568d == d10) {
            if (z10 && !e10.f22567c) {
                for (int i11 = 0; i11 < this.f22779h; i11++) {
                    if (d10.f22503b[i11]) {
                        if (!e10.b(i11).exists()) {
                            d10.f22505d.a(d10, false);
                            return;
                        }
                    } else {
                        d10.f22505d.a(d10, false);
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                    }
                }
            }
            for (int i12 = 0; i12 < this.f22779h; i12++) {
                File fileB = e10.b(i12);
                if (z10) {
                    if (fileB.exists()) {
                        File fileA = e10.a(i12);
                        fileB.renameTo(fileA);
                        long j10 = e10.f22566b[i12];
                        long length = fileA.length();
                        e10.f22566b[i12] = length;
                        this.f22782k = (this.f22782k - j10) + length;
                    }
                } else if (fileB.exists() && !fileB.delete()) {
                    throw new IOException();
                }
            }
            this.f22784m++;
            e10.f22568d = null;
            if (e10.f22567c | z10) {
                e10.f22567c = true;
                BufferedWriter bufferedWriter = this.f22783l;
                StringBuilder sb2 = new StringBuilder("CLEAN ");
                sb2.append(e10.f22565a);
                StringBuilder sb3 = new StringBuilder();
                for (long j11 : e10.f22566b) {
                    sb3.append(' ');
                    sb3.append(j11);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter.write(sb2.toString());
                if (z10) {
                    this.f22785n++;
                }
            } else {
                this.f22780i.remove(e10.f22565a);
                this.f22783l.write("REMOVE " + e10.f22565a + '\n');
            }
            this.f22783l.flush();
            if (this.f22782k > this.f22781j || ((i10 = this.f22784m) >= 2000 && i10 >= this.f22780i.size())) {
                this.f22772a.submit(this.f22786o);
                return;
            }
            return;
        }
        throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
    }
}
