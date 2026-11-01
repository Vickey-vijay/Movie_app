package m1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: compiled from: FilePrinter.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements l1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f63915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p1.b f63916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1.a f63917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o1.a f63918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z0.b f63919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f63920f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile d f63921g;

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f63922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public p1.b f63923b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public n1.a f63924c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public o1.a f63925d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public z0.b f63926e;

        public b b(p1.b bVar) {
            this.f63923b = bVar;
            return this;
        }

        public final void c() {
            if (this.f63923b == null) {
                this.f63923b = j1.a.e();
            }
            if (this.f63924c == null) {
                this.f63924c = j1.a.b();
            }
            if (this.f63925d == null) {
                this.f63925d = j1.a.d();
            }
            if (this.f63926e == null) {
                this.f63926e = j1.a.f();
            }
        }

        public b d(z0.b bVar) {
            this.f63926e = bVar;
            return this;
        }

        public b(String str) {
            this.f63922a = str;
        }

        public a a() {
            c();
            return new a(this);
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public BlockingQueue<c> f63931b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public volatile boolean f63932c;

        public d() {
            this.f63931b = new LinkedBlockingQueue();
        }

        public boolean c() {
            boolean z10;
            synchronized (this) {
                z10 = this.f63932c;
            }
            return z10;
        }

        public void d() {
            synchronized (this) {
                new Thread(this).start();
                this.f63932c = true;
            }
        }

        public void a(c cVar) {
            try {
                this.f63931b.put(cVar);
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    c cVarTake = this.f63931b.take();
                    if (cVarTake == null) {
                        return;
                    } else {
                        a.this.f(cVarTake.f63927a, cVarTake.f63928b, cVarTake.f63929c, cVarTake.f63930d);
                    }
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                    synchronized (this) {
                        this.f63932c = false;
                        return;
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f63934a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public File f63935b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public BufferedWriter f63936c;

        public e() {
        }

        public void a(String str) {
            try {
                this.f63936c.write(str);
                this.f63936c.newLine();
                this.f63936c.flush();
            } catch (IOException unused) {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public boolean b() {
            BufferedWriter bufferedWriter = this.f63936c;
            if (bufferedWriter == null) {
                return true;
            }
            try {
                bufferedWriter.close();
                return true;
            } catch (IOException e10) {
                e10.printStackTrace();
                Object[] objArr = objArr == true ? 1 : 0;
                Object[] objArr2 = objArr == true ? 1 : 0;
                return false;
            } finally {
                this.f63936c = null;
                this.f63934a = null;
                this.f63935b = null;
            }
        }

        public File c() {
            return this.f63935b;
        }

        public String d() {
            return this.f63934a;
        }

        public boolean e() {
            return this.f63936c != null;
        }

        public boolean f(String str) {
            this.f63934a = str;
            File file = new File(a.this.f63915a, str);
            this.f63935b = file;
            if (!file.exists()) {
                try {
                    File parentFile = this.f63935b.getParentFile();
                    if (!parentFile.exists()) {
                        parentFile.mkdirs();
                    }
                    this.f63935b.createNewFile();
                } catch (IOException e10) {
                    e10.printStackTrace();
                    this.f63934a = null;
                    this.f63935b = null;
                    return false;
                }
            }
            try {
                this.f63936c = new BufferedWriter(new FileWriter(this.f63935b, true));
                return true;
            } catch (Exception e11) {
                e11.printStackTrace();
                this.f63934a = null;
                this.f63935b = null;
                return false;
            }
        }
    }

    /* JADX INFO: compiled from: FilePrinter.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f63927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f63928b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f63929c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f63930d;

        public c(long j10, int i10, String str, String str2) {
            this.f63927a = j10;
            this.f63928b = i10;
            this.f63929c = str;
            this.f63930d = str2;
        }
    }

    public final void d() {
        File file = new File(this.f63915a);
        if (file.exists()) {
            return;
        }
        file.mkdirs();
    }

    public final void e() {
        File[] fileArrListFiles = new File(this.f63915a).listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file : fileArrListFiles) {
            if (this.f63918d.a(file)) {
                file.delete();
            }
        }
    }

    public final void f(long j10, int i10, String str, String str2) {
        String strD = this.f63920f.d();
        if (strD == null || this.f63916b.isFileNameChangeable()) {
            String strGenerateFileName = this.f63916b.generateFileName(i10, System.currentTimeMillis());
            if (strGenerateFileName == null || strGenerateFileName.trim().length() == 0) {
                throw new IllegalArgumentException("File name should not be empty.");
            }
            if (!strGenerateFileName.equals(strD)) {
                if (this.f63920f.e()) {
                    this.f63920f.b();
                }
                e();
                if (!this.f63920f.f(strGenerateFileName)) {
                    return;
                } else {
                    strD = strGenerateFileName;
                }
            }
        }
        File fileC = this.f63920f.c();
        if (this.f63917c.a(fileC)) {
            this.f63920f.b();
            File file = new File(this.f63915a, strD + ".bak");
            if (file.exists()) {
                file.delete();
            }
            fileC.renameTo(file);
            if (!this.f63920f.f(strD)) {
                return;
            }
        }
        this.f63920f.a(this.f63919e.flatten(j10, i10, str, str2).toString());
    }

    public a(b bVar) {
        this.f63915a = bVar.f63922a;
        this.f63916b = bVar.f63923b;
        this.f63917c = bVar.f63924c;
        this.f63918d = bVar.f63925d;
        this.f63919e = bVar.f63926e;
        this.f63920f = new e();
        this.f63921g = new d();
        d();
    }

    @Override // l1.b
    public void a(int i10, String str, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!this.f63921g.c()) {
            this.f63921g.d();
        }
        this.f63921g.a(new c(jCurrentTimeMillis, i10, str, str2));
    }
}
