package g0;

import com.danikula.videocache.ProxyCacheException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: FileCache.java */
/* JADX INFO: loaded from: classes9.dex */
public class b implements f0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f53006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public File f53007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RandomAccessFile f53008c;

    @Override // f0.a
    public synchronized long available() throws ProxyCacheException {
        try {
        } catch (IOException e10) {
            throw new ProxyCacheException("Error reading length of file " + this.f53007b, e10);
        }
        return (int) this.f53008c.length();
    }

    @Override // f0.a
    public synchronized void close() throws ProxyCacheException {
        try {
            this.f53008c.close();
            this.f53006a.a(this.f53007b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error closing file " + this.f53007b, e10);
        }
    }

    @Override // f0.a
    public synchronized void complete() throws ProxyCacheException {
        if (d()) {
            return;
        }
        close();
        File file = new File(this.f53007b.getParentFile(), this.f53007b.getName().substring(0, this.f53007b.getName().length() - 9));
        if (!this.f53007b.renameTo(file)) {
            throw new ProxyCacheException("Error renaming file " + this.f53007b + " to " + file + " for completion!");
        }
        this.f53007b = file;
        try {
            this.f53008c = new RandomAccessFile(this.f53007b, "r");
            this.f53006a.a(this.f53007b);
        } catch (IOException e10) {
            throw new ProxyCacheException("Error opening " + this.f53007b + " as disc cache", e10);
        }
    }

    @Override // f0.a
    public synchronized boolean d() {
        return !a(this.f53007b);
    }

    @Override // f0.a
    public synchronized void e(byte[] bArr, int i10) throws ProxyCacheException {
        try {
            if (d()) {
                throw new ProxyCacheException("Error append cache: cache file " + this.f53007b + " is completed!");
            }
            this.f53008c.seek(available());
            this.f53008c.write(bArr, 0, i10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error writing %d bytes to %s from buffer with size %d", Integer.valueOf(i10), this.f53008c, Integer.valueOf(bArr.length)), e10);
        }
    }

    @Override // f0.a
    public synchronized int f(byte[] bArr, long j10, int i10) throws ProxyCacheException {
        try {
            this.f53008c.seek(j10);
        } catch (IOException e10) {
            throw new ProxyCacheException(String.format("Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", Integer.valueOf(i10), Long.valueOf(j10), Long.valueOf(available()), Integer.valueOf(bArr.length)), e10);
        }
        return this.f53008c.read(bArr, 0, i10);
    }

    public b(File file, a aVar) throws ProxyCacheException {
        File file2;
        String str;
        try {
            if (aVar != null) {
                this.f53006a = aVar;
                d.b(file.getParentFile());
                boolean zExists = file.exists();
                if (zExists) {
                    file2 = file;
                } else {
                    file2 = new File(file.getParentFile(), file.getName() + ".download");
                }
                this.f53007b = file2;
                File file3 = this.f53007b;
                if (zExists) {
                    str = "r";
                } else {
                    str = "rw";
                }
                this.f53008c = new RandomAccessFile(file3, str);
                return;
            }
            throw new NullPointerException();
        } catch (IOException e10) {
            throw new ProxyCacheException("Error using file " + file + " as disc cache", e10);
        }
    }

    public final boolean a(File file) {
        return file.getName().endsWith(".download");
    }
}
