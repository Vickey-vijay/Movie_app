package yads;

import android.os.SystemClock;
import android.text.TextUtils;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public final class tg0 implements mr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f83022a = new LinkedHashMap(16, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f83023b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg0 f83024c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f83025d;

    @Override // yads.mr
    public final synchronized void a() {
        File file = this.f83024c.f81848a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                file.getAbsolutePath();
                boolean z10 = lm3.f79855a;
                boolean z11 = ad1.f75480a;
            }
            return;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            return;
        }
        for (File file2 : fileArrListFiles) {
            try {
                try {
                    long length = file2.length();
                    sg0 sg0Var = new sg0(new BufferedInputStream(new FileInputStream(file2)), length);
                    try {
                        rg0 rg0VarA = rg0.a(sg0Var);
                        rg0VarA.f82254a = length;
                        String str = rg0VarA.f82255b;
                        if (this.f83022a.containsKey(str)) {
                            this.f83023b = (rg0VarA.f82254a - ((rg0) this.f83022a.get(str)).f82254a) + this.f83023b;
                        } else {
                            this.f83023b += rg0VarA.f82254a;
                        }
                        this.f83022a.put(str, rg0VarA);
                        sg0Var.close();
                    } catch (Throwable th2) {
                        sg0Var.close();
                        throw th2;
                    }
                } catch (Throwable unused) {
                }
            } catch (IOException unused2) {
                file2.delete();
            } catch (Throwable unused3) {
                file2.delete();
            }
        }
    }

    public final void b() {
        if (this.f83023b < this.f83025d) {
            return;
        }
        if (lm3.f79855a) {
            boolean z10 = ad1.f75480a;
        }
        SystemClock.elapsedRealtime();
        Iterator it = this.f83022a.entrySet().iterator();
        while (it.hasNext()) {
            rg0 rg0Var = (rg0) ((Map.Entry) it.next()).getValue();
            String str = rg0Var.f82255b;
            File file = this.f83024c.f81848a;
            int length = str.length() / 2;
            if (new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.f83023b -= rg0Var.f82254a;
            } else {
                String str2 = rg0Var.f82255b;
                int length2 = str2.length() / 2;
                String.valueOf(str2.substring(0, length2).hashCode());
                String.valueOf(str2.substring(length2).hashCode());
                boolean z11 = ad1.f75480a;
            }
            it.remove();
            if (this.f83023b < this.f83025d * 0.9f) {
                break;
            }
        }
        if (lm3.f79855a) {
            SystemClock.elapsedRealtime();
            boolean z12 = ad1.f75480a;
        }
    }

    @Override // yads.mr
    public final synchronized lr get(String str) {
        rg0 rg0Var = (rg0) this.f83022a.get(str);
        if (rg0Var == null) {
            return null;
        }
        File file = this.f83024c.f81848a;
        int length = str.length() / 2;
        File file2 = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            sg0 sg0Var = new sg0(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                if (TextUtils.equals(str, rg0.a(sg0Var).f82255b)) {
                    lr lrVarA = rg0Var.a(a(sg0Var, sg0Var.f82630a - sg0Var.f82631b));
                    sg0Var.close();
                    return lrVarA;
                }
                file2.getAbsolutePath();
                boolean z10 = lm3.f79855a;
                boolean z11 = ad1.f75480a;
                rg0 rg0Var2 = (rg0) this.f83022a.remove(str);
                if (rg0Var2 != null) {
                    this.f83023b -= rg0Var2.f82254a;
                }
                sg0Var.close();
                return null;
            } catch (Throwable th2) {
                sg0Var.close();
                throw th2;
            }
        } catch (IOException unused) {
            file2.getAbsolutePath();
            boolean z12 = lm3.f79855a;
            boolean z13 = ad1.f75480a;
            b(str);
            return null;
        }
    }

    public tg0(File file, int i10) {
        this.f83024c = new qg0(file);
        this.f83025d = i10;
    }

    @Override // yads.mr
    public final synchronized void a(String str) {
        lr lrVar = get(str);
        if (lrVar != null) {
            lrVar.f79888f = 0L;
            lrVar.f79887e = 0L;
            a(str, lrVar);
        }
    }

    public static long b(InputStream inputStream) {
        int i10 = inputStream.read();
        if (i10 != -1) {
            long j10 = ((long) i10) & 255;
            int i11 = inputStream.read();
            if (i11 != -1) {
                long j11 = j10 | ((((long) i11) & 255) << 8);
                int i12 = inputStream.read();
                if (i12 != -1) {
                    long j12 = j11 | ((((long) i12) & 255) << 16);
                    int i13 = inputStream.read();
                    if (i13 != -1) {
                        long j13 = j12 | ((((long) i13) & 255) << 24);
                        int i14 = inputStream.read();
                        if (i14 != -1) {
                            long j14 = j13 | ((((long) i14) & 255) << 32);
                            int i15 = inputStream.read();
                            if (i15 != -1) {
                                long j15 = j14 | ((((long) i15) & 255) << 40);
                                int i16 = inputStream.read();
                                if (i16 != -1) {
                                    long j16 = j15 | ((((long) i16) & 255) << 48);
                                    int i17 = inputStream.read();
                                    if (i17 != -1) {
                                        return ((((long) i17) & 255) << 56) | j16;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @Override // yads.mr
    public final synchronized void a(String str, lr lrVar) {
        File file;
        long j10 = this.f83023b;
        byte[] bArr = lrVar.f79883a;
        long length = j10 + ((long) bArr.length);
        int i10 = this.f83025d;
        if (length > i10 && bArr.length > i10 * 0.9f) {
            return;
        }
        File file2 = this.f83024c.f81848a;
        int length2 = str.length() / 2;
        File file3 = new File(file2, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode()));
        try {
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file3));
            file = file3;
            try {
                rg0 rg0Var = new rg0(str, lrVar.f79884b, lrVar.f79885c, lrVar.f79886d, lrVar.f79887e, lrVar.f79888f, rg0.a(lrVar));
                if (rg0Var.a(bufferedOutputStream)) {
                    bufferedOutputStream.write(lrVar.f79883a);
                    bufferedOutputStream.close();
                    rg0Var.f82254a = file.length();
                    if (!this.f83022a.containsKey(str)) {
                        this.f83023b += rg0Var.f82254a;
                    } else {
                        this.f83023b = (rg0Var.f82254a - ((rg0) this.f83022a.get(str)).f82254a) + this.f83023b;
                    }
                    this.f83022a.put(str, rg0Var);
                    b();
                    return;
                }
                bufferedOutputStream.close();
                file.getAbsolutePath();
                boolean z10 = lm3.f79855a;
                boolean z11 = ad1.f75480a;
                throw new IOException();
            } catch (IOException unused) {
                if (!file.delete()) {
                    file.getAbsolutePath();
                    boolean z12 = lm3.f79855a;
                    boolean z13 = ad1.f75480a;
                }
                if (!this.f83024c.f81848a.exists()) {
                    boolean z14 = lm3.f79855a;
                    boolean z15 = ad1.f75480a;
                    this.f83022a.clear();
                    this.f83023b = 0L;
                    a();
                }
            }
        } catch (IOException unused2) {
            file = file3;
        }
    }

    public final synchronized void b(String str) {
        File file = this.f83024c.f81848a;
        int length = str.length() / 2;
        boolean zDelete = new File(file, String.valueOf(str.substring(0, length).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
        rg0 rg0Var = (rg0) this.f83022a.remove(str);
        if (rg0Var != null) {
            this.f83023b -= rg0Var.f82254a;
        }
        if (!zDelete) {
            int length2 = str.length() / 2;
            String.valueOf(str.substring(0, length2).hashCode());
            String.valueOf(str.substring(length2).hashCode());
            boolean z10 = lm3.f79855a;
            boolean z11 = ad1.f75480a;
        }
    }

    public static int a(InputStream inputStream) {
        int i10 = inputStream.read();
        if (i10 != -1) {
            int i11 = inputStream.read();
            if (i11 != -1) {
                int i12 = i10 | (i11 << 8);
                int i13 = inputStream.read();
                if (i13 != -1) {
                    int i14 = i12 | (i13 << 16);
                    int i15 = inputStream.read();
                    if (i15 != -1) {
                        return (i15 << 24) | i14;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    public static byte[] a(sg0 sg0Var, long j10) throws IOException {
        long j11 = sg0Var.f82630a - sg0Var.f82631b;
        if (j10 >= 0 && j10 <= j11) {
            int i10 = (int) j10;
            if (i10 == j10) {
                byte[] bArr = new byte[i10];
                new DataInputStream(sg0Var).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j10 + ", maxLength=" + j11);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, int i10) {
        bufferedOutputStream.write(i10 & 255);
        bufferedOutputStream.write((i10 >> 8) & 255);
        bufferedOutputStream.write((i10 >> 16) & 255);
        bufferedOutputStream.write((i10 >> 24) & 255);
    }

    public static void a(BufferedOutputStream bufferedOutputStream, long j10) {
        bufferedOutputStream.write((byte) j10);
        bufferedOutputStream.write((byte) (j10 >>> 8));
        bufferedOutputStream.write((byte) (j10 >>> 16));
        bufferedOutputStream.write((byte) (j10 >>> 24));
        bufferedOutputStream.write((byte) (j10 >>> 32));
        bufferedOutputStream.write((byte) (j10 >>> 40));
        bufferedOutputStream.write((byte) (j10 >>> 48));
        bufferedOutputStream.write((byte) (j10 >>> 56));
    }
}
