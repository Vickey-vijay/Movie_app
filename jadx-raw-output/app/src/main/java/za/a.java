package za;

import com.bumptech.glide.disklrucache.DiskLruCache;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f86346p = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final OutputStream f86347q = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f86348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f86349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f86350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f86351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f86352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f86353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f86354h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Writer f86356j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f86358l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f86355i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinkedHashMap<String, d> f86357k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f86359m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ThreadPoolExecutor f86360n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Callable<Void> f86361o = new CallableC0808a();

    /* JADX INFO: renamed from: za.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public class CallableC0808a implements Callable<Void> {
        public CallableC0808a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (a.this) {
                if (a.this.f86356j == null) {
                    return null;
                }
                a.this.A();
                if (a.this.r()) {
                    a.this.x();
                    a.this.f86358l = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public class b extends OutputStream {
        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f86363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f86364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f86366d;

        /* JADX INFO: renamed from: za.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DiskLruCache.java */
        public class C0809a extends FilterOutputStream {
            public C0809a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    c.this.f86365c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    c.this.f86365c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    c.this.f86365c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    c.this.f86365c = true;
                }
            }
        }

        public c(d dVar) {
            this.f86363a = dVar;
            this.f86364b = dVar.f86371c ? null : new boolean[a.this.f86354h];
        }

        public void d() throws IOException {
            a.this.m(this, false);
        }

        public void e() throws IOException {
            if (this.f86365c) {
                a.this.m(this, false);
                a.this.y(this.f86363a.f86369a);
            } else {
                a.this.m(this, true);
            }
            this.f86366d = true;
        }

        public OutputStream f(int i10) throws IOException {
            FileOutputStream fileOutputStream;
            C0809a c0809a;
            if (i10 < 0 || i10 >= a.this.f86354h) {
                throw new IllegalArgumentException("Expected index " + i10 + " to be greater than 0 and less than the maximum value count of " + a.this.f86354h);
            }
            synchronized (a.this) {
                if (this.f86363a.f86372d != this) {
                    throw new IllegalStateException();
                }
                if (!this.f86363a.f86371c) {
                    this.f86364b[i10] = true;
                }
                File fileK = this.f86363a.k(i10);
                try {
                    fileOutputStream = new FileOutputStream(fileK);
                } catch (FileNotFoundException unused) {
                    a.this.f86348b.mkdirs();
                    try {
                        fileOutputStream = new FileOutputStream(fileK);
                    } catch (FileNotFoundException unused2) {
                        return a.f86347q;
                    }
                }
                c0809a = new C0809a(fileOutputStream);
            }
            return c0809a;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f86369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long[] f86370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f86371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c f86372d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f86373e;

        public d(String str) {
            this.f86369a = str;
            this.f86370b = new long[a.this.f86354h];
        }

        public final void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f86354h) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f86370b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return new File(a.this.f86348b, this.f86369a + "." + i10);
        }

        public File k(int i10) {
            return new File(a.this.f86348b, this.f86369a + "." + i10 + ".tmp");
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f86370b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        public final IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f86375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f86376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InputStream[] f86377d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final long[] f86378e;

        public e(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f86375b = str;
            this.f86376c = j10;
            this.f86377d = inputStreamArr;
            this.f86378e = jArr;
        }

        public InputStream a(int i10) {
            return this.f86377d[i10];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f86377d) {
                h.a(inputStream);
            }
        }
    }

    public a(File file, int i10, int i11, long j10) {
        this.f86348b = file;
        this.f86352f = i10;
        this.f86349c = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f86350d = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f86351e = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.f86354h = i11;
        this.f86353g = j10;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f86356j == null) {
            return;
        }
        for (d dVar : new ArrayList(this.f86357k.values())) {
            if (dVar.f86372d != null) {
                dVar.f86372d.d();
            }
        }
        A();
        this.f86356j.close();
        this.f86356j = null;
    }

    public synchronized void flush() throws IOException {
        l();
        A();
        this.f86356j.flush();
    }

    public final synchronized void m(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f86363a;
        if (dVar.f86372d != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f86371c) {
            for (int i10 = 0; i10 < this.f86354h; i10++) {
                if (!cVar.f86364b[i10]) {
                    cVar.d();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.d();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f86354h; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                n(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f86370b[i11];
                long length = fileJ.length();
                dVar.f86370b[i11] = length;
                this.f86355i = (this.f86355i - j10) + length;
            }
        }
        this.f86358l++;
        dVar.f86372d = null;
        if (dVar.f86371c || z10) {
            dVar.f86371c = true;
            this.f86356j.write("CLEAN " + dVar.f86369a + dVar.l() + '\n');
            if (z10) {
                long j11 = this.f86359m;
                this.f86359m = 1 + j11;
                dVar.f86373e = j11;
            }
        } else {
            this.f86357k.remove(dVar.f86369a);
            this.f86356j.write("REMOVE " + dVar.f86369a + '\n');
        }
        this.f86356j.flush();
        if (this.f86355i > this.f86353g || r()) {
            this.f86360n.submit(this.f86361o);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized c p(String str, long j10) throws IOException {
        h.e(str, "key can't be null");
        l();
        B(str);
        d dVar = this.f86357k.get(str);
        Object[] objArr = 0;
        if (j10 != -1 && (dVar == null || dVar.f86373e != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(str);
            this.f86357k.put(str, dVar);
        } else if (dVar.f86372d != null) {
            return null;
        }
        c cVar = new c(dVar);
        dVar.f86372d = cVar;
        this.f86356j.write("DIRTY " + str + '\n');
        this.f86356j.flush();
        return cVar;
    }

    public synchronized e q(String str) throws IOException {
        InputStream inputStream;
        h.e(str, "key can't be null");
        l();
        B(str);
        d dVar = this.f86357k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f86371c) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.f86354h];
        for (int i10 = 0; i10 < this.f86354h; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(dVar.j(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.f86354h && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    h.a(inputStream);
                }
                return null;
            }
        }
        this.f86358l++;
        this.f86356j.append((CharSequence) ("READ " + str + '\n'));
        if (r()) {
            this.f86360n.submit(this.f86361o);
        }
        return new e(str, dVar.f86373e, inputStreamArr, dVar.f86370b);
    }

    public final synchronized void x() throws IOException {
        try {
            Writer writer = this.f86356j;
            if (writer != null) {
                writer.close();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86350d), h.f86386a));
            try {
                bufferedWriter.write(DiskLruCache.MAGIC);
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f86352f));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f86354h));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f86357k.values()) {
                    if (dVar.f86372d != null) {
                        bufferedWriter.write("DIRTY " + dVar.f86369a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f86369a + dVar.l() + '\n');
                    }
                }
                bufferedWriter.close();
                if (this.f86349c.exists()) {
                    z(this.f86349c, this.f86351e, true);
                }
                z(this.f86350d, this.f86349c, false);
                this.f86351e.delete();
                this.f86356j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86349c, true), h.f86386a));
            } catch (Throwable th2) {
                bufferedWriter.close();
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public synchronized boolean y(String str) throws IOException {
        h.e(str, "key can't be null");
        l();
        B(str);
        d dVar = this.f86357k.get(str);
        if (dVar != null && dVar.f86372d == null) {
            for (int i10 = 0; i10 < this.f86354h; i10++) {
                File fileJ = dVar.j(i10);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f86355i -= dVar.f86370b[i10];
                dVar.f86370b[i10] = 0;
            }
            this.f86358l++;
            this.f86356j.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f86357k.remove(str);
            if (r()) {
                this.f86360n.submit(this.f86361o);
            }
            return true;
        }
        return false;
    }

    public static a s(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        System.out.println("......appVersion: " + i10 + "......");
        File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        if (file2.exists()) {
            File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
            if (file3.exists()) {
                file2.delete();
            } else {
                z(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f86349c.exists()) {
            try {
                aVar.v();
                aVar.t();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.delete();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.x();
        return aVar2;
    }

    public static void z(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            n(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final void A() throws IOException {
        while (this.f86355i > this.f86353g) {
            y(this.f86357k.entrySet().iterator().next().getKey());
        }
    }

    public final void B(String str) {
        if (f86346p.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public final void l() {
        if (this.f86356j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public c o(String str) throws IOException {
        return p(str, -1L);
    }

    public final boolean r() {
        int i10 = this.f86358l;
        return i10 >= 2000 && i10 >= this.f86357k.size();
    }

    public final void t() throws IOException {
        n(this.f86350d);
        Iterator<d> it = this.f86357k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f86372d == null) {
                while (i10 < this.f86354h) {
                    this.f86355i += next.f86370b[i10];
                    i10++;
                }
            } else {
                next.f86372d = null;
                while (i10 < this.f86354h) {
                    n(next.j(i10));
                    n(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    public final void v() throws IOException {
        g gVar = new g(new FileInputStream(this.f86349c), h.f86386a);
        try {
            String strK = gVar.k();
            String strK2 = gVar.k();
            String strK3 = gVar.k();
            String strK4 = gVar.k();
            String strK5 = gVar.k();
            if (!DiskLruCache.MAGIC.equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f86352f).equals(strK3) || !Integer.toString(this.f86354h).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + C3426d4.j.f28588e);
            }
            int i10 = 0;
            while (true) {
                try {
                    w(gVar.k());
                    i10++;
                } catch (EOFException unused) {
                    this.f86358l = i10 - this.f86357k.size();
                    if (gVar.h()) {
                        x();
                    } else {
                        this.f86356j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f86349c, true), h.f86386a));
                    }
                    h.a(gVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            h.a(gVar);
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void w(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f86357k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f86357k.get(strSubstring);
        Object[] objArr = 0;
        if (dVar == null) {
            dVar = new d(strSubstring);
            this.f86357k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(Z7.f27998r);
            dVar.f86371c = true;
            dVar.f86372d = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f86372d = new c(dVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public static void n(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public void delete() throws IOException {
        close();
        h.b(this.f86348b);
    }
}
