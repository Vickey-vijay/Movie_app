package com.bytedance.sdk.component.fkw.lh.ouw.ouw;

import android.util.Log;
import com.bumptech.glide.disklrucache.DiskLruCache;
import com.bytedance.sdk.component.utils.tlj;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.safedk.android.internal.partials.PangleFilesBridge;
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
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class ouw implements Closeable {
    private long bly;
    private final File fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int f11706jg;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private final File f11708le;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final File f11709ra;
    private Writer ryl;
    public final ExecutorService vt;
    private final File yu;
    public static final Pattern ouw = Pattern.compile("[a-z0-9_-]{1,120}");

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final OutputStream f11704lh = new OutputStream() { // from class: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw.2
        @Override // java.io.OutputStream
        public final void write(int i10) throws IOException {
        }
    };

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private long f11705cf = 0;
    private final LinkedHashMap<String, vt> mwh = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private long f11707ko = -1;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private long f11710rn = 0;
    private final Callable<Void> zih = new Callable<Void>() { // from class: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw.1
        /* JADX INFO: Access modifiers changed from: private */
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: ouw, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (ouw.this) {
                if (ouw.this.ryl == null) {
                    return null;
                }
                ouw.this.ra();
                if (ouw.this.fkw()) {
                    ouw.this.yu();
                    ouw.fkw(ouw.this);
                }
                return null;
            }
        }
    };
    private final int pno = 20210302;
    private final int tlj = 1;

    public final class lh implements Closeable {
        private final long[] fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        private final String f11711lh;
        public final InputStream[] ouw;
        private final long yu;

        public /* synthetic */ lh(ouw ouwVar, String str, long j10, InputStream[] inputStreamArr, long[] jArr, byte b10) {
            this(str, j10, inputStreamArr, jArr);
        }

        private lh(String str, long j10, InputStream[] inputStreamArr, long[] jArr) {
            this.f11711lh = str;
            this.yu = j10;
            this.ouw = inputStreamArr;
            this.fkw = jArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            for (InputStream inputStream : this.ouw) {
                tlj.ouw(inputStream);
            }
        }
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw$ouw, reason: collision with other inner class name */
    public final class C0088ouw {

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f11712lh;
        public final vt ouw;
        public final boolean[] vt;
        public boolean yu;

        /* JADX INFO: renamed from: com.bytedance.sdk.component.fkw.lh.ouw.ouw.ouw$ouw$ouw, reason: collision with other inner class name */
        public class C0089ouw extends FilterOutputStream {
            public /* synthetic */ C0089ouw(C0088ouw c0088ouw, OutputStream outputStream, byte b10) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(int i10) {
                try {
                    ((FilterOutputStream) this).out.write(i10);
                } catch (IOException unused) {
                    C0088ouw.this.f11712lh = true;
                }
            }

            private C0089ouw(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C0088ouw.this.f11712lh = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public final void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C0088ouw.this.f11712lh = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public final void write(byte[] bArr, int i10, int i11) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i10, i11);
                } catch (IOException unused) {
                    C0088ouw.this.f11712lh = true;
                }
            }
        }

        public /* synthetic */ C0088ouw(ouw ouwVar, vt vtVar, byte b10) {
            this(vtVar);
        }

        private C0088ouw(vt vtVar) {
            this.ouw = vtVar;
            this.vt = vtVar.f11714lh ? null : new boolean[ouw.this.tlj];
        }

        public final OutputStream ouw() throws IOException {
            FileOutputStream fileOutputStreamFileOutputStreamCtor;
            C0089ouw c0089ouw;
            if (ouw.this.tlj <= 0) {
                throw new IllegalArgumentException("Expected index 0 to be greater than 0 and less than the maximum value count of " + ouw.this.tlj);
            }
            synchronized (ouw.this) {
                vt vtVar = this.ouw;
                if (vtVar.yu != this) {
                    throw new IllegalStateException();
                }
                byte b10 = 0;
                if (!vtVar.f11714lh) {
                    this.vt[0] = true;
                }
                File fileVt = vtVar.vt(0);
                try {
                    fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileVt);
                } catch (FileNotFoundException unused) {
                    ouw.this.yu.mkdirs();
                    try {
                        fileOutputStreamFileOutputStreamCtor = PangleFilesBridge.fileOutputStreamCtor(fileVt);
                    } catch (FileNotFoundException unused2) {
                        return ouw.f11704lh;
                    }
                }
                c0089ouw = new C0089ouw(this, fileOutputStreamFileOutputStreamCtor, b10);
            }
            return c0089ouw;
        }

        public final void vt() throws IOException {
            ouw.this.ouw(this, false);
        }
    }

    public final class vt {
        public long fkw;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public boolean f11714lh;
        public final String ouw;
        public final long[] vt;
        public C0088ouw yu;

        public /* synthetic */ vt(ouw ouwVar, String str, byte b10) {
            this(str);
        }

        private static IOException vt(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public final String ouw() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.vt) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private vt(String str) {
            this.ouw = str;
            this.vt = new long[ouw.this.tlj];
        }

        public final File vt(int i10) {
            return new File(ouw.this.yu, this.ouw + "." + i10 + ".tmp");
        }

        public final void ouw(String[] strArr) throws IOException {
            if (strArr.length == ouw.this.tlj) {
                for (int i10 = 0; i10 < strArr.length; i10++) {
                    try {
                        this.vt[i10] = Long.parseLong(strArr[i10]);
                    } catch (NumberFormatException unused) {
                        throw vt(strArr);
                    }
                }
                return;
            }
            throw vt(strArr);
        }

        public final File ouw(int i10) {
            return new File(ouw.this.yu, this.ouw + "." + i10);
        }
    }

    public static /* synthetic */ int fkw(ouw ouwVar) {
        ouwVar.f11706jg = 0;
        return 0;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (this.ryl == null) {
            return;
        }
        Iterator it = new ArrayList(this.mwh.values()).iterator();
        while (it.hasNext()) {
            C0088ouw c0088ouw = ((vt) it.next()).yu;
            if (c0088ouw != null) {
                c0088ouw.vt();
            }
        }
        ra();
        this.ryl.close();
        this.ryl = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean fkw() {
        int i10 = this.f11706jg;
        return i10 >= 2000 && i10 >= this.mwh.size();
    }

    private void le() {
        if (this.ryl == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void lh() throws IOException {
        ouw(this.f11708le);
        Iterator<vt> it = this.mwh.values().iterator();
        while (it.hasNext()) {
            vt next = it.next();
            int i10 = 0;
            if (next.yu == null) {
                while (i10 < this.tlj) {
                    this.f11705cf += next.vt[i10];
                    i10++;
                }
            } else {
                next.yu = null;
                while (i10 < this.tlj) {
                    ouw(next.ouw(i10));
                    ouw(next.vt(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ra() throws IOException {
        long j10 = this.bly;
        long j11 = this.f11707ko;
        if (j11 >= 0) {
            j10 = j11;
        }
        while (this.f11705cf > j10) {
            lh(this.mwh.entrySet().iterator().next().getKey());
        }
        this.f11707ko = -1L;
    }

    private void vt() throws IOException {
        String strSubstring;
        com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh lhVar = new com.bytedance.sdk.component.fkw.lh.ouw.ouw.lh(new FileInputStream(this.fkw), yu.ouw);
        try {
            String strOuw = lhVar.ouw();
            String strOuw2 = lhVar.ouw();
            String strOuw3 = lhVar.ouw();
            String strOuw4 = lhVar.ouw();
            String strOuw5 = lhVar.ouw();
            if (!DiskLruCache.MAGIC.equals(strOuw) || !"1".equals(strOuw2) || !Integer.toString(this.pno).equals(strOuw3) || !Integer.toString(this.tlj).equals(strOuw4) || !"".equals(strOuw5)) {
                throw new IOException("unexpected journal header: [" + strOuw + ", " + strOuw2 + ", " + strOuw4 + ", " + strOuw5 + C3426d4.j.f28588e);
            }
            byte b10 = 0;
            int i10 = 0;
            while (true) {
                try {
                    String strOuw6 = lhVar.ouw();
                    int iIndexOf = strOuw6.indexOf(32);
                    if (iIndexOf == -1) {
                        throw new IOException("unexpected journal line: ".concat(strOuw6));
                    }
                    int i11 = iIndexOf + 1;
                    int iIndexOf2 = strOuw6.indexOf(32, i11);
                    if (iIndexOf2 == -1) {
                        strSubstring = strOuw6.substring(i11);
                        if (iIndexOf == 6 && strOuw6.startsWith("REMOVE")) {
                            this.mwh.remove(strSubstring);
                        }
                        i10++;
                    } else {
                        strSubstring = strOuw6.substring(i11, iIndexOf2);
                    }
                    vt vtVar = this.mwh.get(strSubstring);
                    if (vtVar == null) {
                        vtVar = new vt(this, strSubstring, b10);
                        this.mwh.put(strSubstring, vtVar);
                    }
                    if (iIndexOf2 != -1 && iIndexOf == 5 && strOuw6.startsWith("CLEAN")) {
                        String[] strArrSplit = strOuw6.substring(iIndexOf2 + 1).split(Z7.f27998r);
                        vtVar.f11714lh = true;
                        vtVar.yu = null;
                        vtVar.ouw(strArrSplit);
                    } else if (iIndexOf2 == -1 && iIndexOf == 5 && strOuw6.startsWith("DIRTY")) {
                        vtVar.yu = new C0088ouw(this, vtVar, b10);
                    } else if (iIndexOf2 != -1 || iIndexOf != 4 || !strOuw6.startsWith("READ")) {
                        throw new IOException("unexpected journal line: ".concat(strOuw6));
                    }
                    i10++;
                } catch (EOFException unused) {
                    this.f11706jg = i10 - this.mwh.size();
                    if ((lhVar.vt == -1 ? (byte) 1 : (byte) 0) != 0) {
                        yu();
                    } else {
                        this.ryl = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.fkw, true), yu.ouw));
                    }
                    tlj.ouw(lhVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            tlj.ouw(lhVar);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void yu() throws IOException {
        Writer writer = this.ryl;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(PangleFilesBridge.fileOutputStreamCtor(this.f11708le), yu.ouw));
        try {
            bufferedWriter.write(DiskLruCache.MAGIC);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.pno));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.tlj));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (vt vtVar : this.mwh.values()) {
                if (vtVar.yu != null) {
                    bufferedWriter.write("DIRTY " + vtVar.ouw + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + vtVar.ouw + vtVar.ouw() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.fkw.exists()) {
                ouw(this.fkw, this.f11709ra, true);
            }
            ouw(this.f11708le, this.fkw, false);
            this.f11709ra.delete();
            this.ryl = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.fkw, true), yu.ouw));
        } catch (Throwable th2) {
            bufferedWriter.close();
            throw th2;
        }
    }

    private ouw(File file, long j10, ExecutorService executorService) {
        this.yu = file;
        this.fkw = new File(file, DiskLruCache.JOURNAL_FILE);
        this.f11708le = new File(file, DiskLruCache.JOURNAL_FILE_TEMP);
        this.f11709ra = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
        this.bly = j10;
        this.vt = executorService;
    }

    public static ouw ouw(File file, long j10, ExecutorService executorService) throws IOException {
        if (j10 > 0) {
            File file2 = new File(file, DiskLruCache.JOURNAL_FILE_BACKUP);
            if (file2.exists()) {
                File file3 = new File(file, DiskLruCache.JOURNAL_FILE);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    ouw(file2, file3, false);
                }
            }
            ouw ouwVar = new ouw(file, j10, executorService);
            if (ouwVar.fkw.exists()) {
                try {
                    ouwVar.vt();
                    ouwVar.lh();
                    return ouwVar;
                } catch (IOException e10) {
                    Log.w("DiskLruCache ", file + " is corrupt: " + e10.getMessage() + ", removing");
                    ouwVar.close();
                    yu.ouw(ouwVar.yu);
                }
            }
            file.mkdirs();
            ouw ouwVar2 = new ouw(file, j10, executorService);
            ouwVar2.yu();
            return ouwVar2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final synchronized boolean lh(String str) throws IOException {
        le();
        yu(str);
        vt vtVar = this.mwh.get(str);
        if (vtVar != null && vtVar.yu == null) {
            for (int i10 = 0; i10 < this.tlj; i10++) {
                File fileOuw = vtVar.ouw(i10);
                if (fileOuw.exists() && !fileOuw.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(fileOuw)));
                }
                long j10 = this.f11705cf;
                long[] jArr = vtVar.vt;
                this.f11705cf = j10 - jArr[i10];
                jArr[i10] = 0;
            }
            this.f11706jg++;
            this.ryl.append((CharSequence) ("REMOVE " + str + '\n'));
            this.mwh.remove(str);
            if (fkw()) {
                this.vt.submit(this.zih);
            }
            return true;
        }
        return false;
    }

    private static void ouw(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private static void ouw(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            ouw(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    public final synchronized lh ouw(String str) throws IOException {
        InputStream inputStream;
        le();
        yu(str);
        vt vtVar = this.mwh.get(str);
        if (vtVar == null) {
            return null;
        }
        if (!vtVar.f11714lh) {
            return null;
        }
        InputStream[] inputStreamArr = new InputStream[this.tlj];
        for (int i10 = 0; i10 < this.tlj; i10++) {
            try {
                inputStreamArr[i10] = new FileInputStream(vtVar.ouw(i10));
            } catch (FileNotFoundException unused) {
                for (int i11 = 0; i11 < this.tlj && (inputStream = inputStreamArr[i11]) != null; i11++) {
                    tlj.ouw(inputStream);
                }
                return null;
            }
        }
        this.f11706jg++;
        this.ryl.append((CharSequence) ("READ " + str + '\n'));
        if (fkw()) {
            this.vt.submit(this.zih);
        }
        return new lh(this, str, vtVar.fkw, inputStreamArr, vtVar.vt, (byte) 0);
    }

    private static void yu(String str) {
        if (ouw.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    public final synchronized C0088ouw vt(String str) throws IOException {
        le();
        yu(str);
        vt vtVar = this.mwh.get(str);
        byte b10 = 0;
        if (vtVar == null) {
            vtVar = new vt(this, str, b10);
            this.mwh.put(str, vtVar);
        } else if (vtVar.yu != null) {
            return null;
        }
        C0088ouw c0088ouw = new C0088ouw(this, vtVar, b10);
        vtVar.yu = c0088ouw;
        this.ryl.write("DIRTY " + str + '\n');
        this.ryl.flush();
        return c0088ouw;
    }

    public final synchronized void ouw() throws IOException {
        le();
        ra();
        this.ryl.flush();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ouw(C0088ouw c0088ouw, boolean z10) throws IOException {
        vt vtVar = c0088ouw.ouw;
        if (vtVar.yu == c0088ouw) {
            if (z10 && !vtVar.f11714lh) {
                for (int i10 = 0; i10 < this.tlj; i10++) {
                    if (c0088ouw.vt[i10]) {
                        if (!vtVar.vt(i10).exists()) {
                            c0088ouw.vt();
                            return;
                        }
                    } else {
                        c0088ouw.vt();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i10)));
                    }
                }
            }
            for (int i11 = 0; i11 < this.tlj; i11++) {
                File fileVt = vtVar.vt(i11);
                if (z10) {
                    if (fileVt.exists()) {
                        File fileOuw = vtVar.ouw(i11);
                        fileVt.renameTo(fileOuw);
                        long j10 = vtVar.vt[i11];
                        long length = fileOuw.length();
                        vtVar.vt[i11] = length;
                        this.f11705cf = (this.f11705cf - j10) + length;
                    }
                } else {
                    ouw(fileVt);
                }
            }
            this.f11706jg++;
            vtVar.yu = null;
            if (vtVar.f11714lh | z10) {
                vtVar.f11714lh = true;
                this.ryl.write("CLEAN " + vtVar.ouw + vtVar.ouw() + '\n');
                if (z10) {
                    long j11 = this.f11710rn;
                    this.f11710rn = 1 + j11;
                    vtVar.fkw = j11;
                }
            } else {
                this.mwh.remove(vtVar.ouw);
                this.ryl.write("REMOVE " + vtVar.ouw + '\n');
            }
            this.ryl.flush();
            if (this.f11705cf > this.bly || fkw()) {
                this.vt.submit(this.zih);
            }
            return;
        }
        throw new IllegalStateException();
    }
}
