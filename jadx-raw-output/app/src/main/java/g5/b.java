package g5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f53042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f53043b;

    /* JADX INFO: compiled from: AtomicFile.java */
    public static final class a extends OutputStream {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final FileOutputStream f53044b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f53045c = false;

        @Override // java.io.OutputStream
        public void write(int i10) throws IOException {
            this.f53044b.write(i10);
        }

        @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f53045c) {
                return;
            }
            this.f53045c = true;
            flush();
            try {
                this.f53044b.getFD().sync();
            } catch (IOException e10) {
                m.i("AtomicFile", "Failed to sync file descriptor:", e10);
            }
            this.f53044b.close();
        }

        @Override // java.io.OutputStream, java.io.Flushable
        public void flush() throws IOException {
            this.f53044b.flush();
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f53044b.write(bArr);
        }

        public a(File file) throws FileNotFoundException {
            this.f53044b = new FileOutputStream(file);
        }

        @Override // java.io.OutputStream
        public void write(byte[] bArr, int i10, int i11) throws IOException {
            this.f53044b.write(bArr, i10, i11);
        }
    }

    public boolean b() {
        return this.f53042a.exists() || this.f53043b.exists();
    }

    public final void d() {
        if (this.f53043b.exists()) {
            this.f53042a.delete();
            this.f53043b.renameTo(this.f53042a);
        }
    }

    public void delete() {
        this.f53042a.delete();
        this.f53043b.delete();
    }

    public OutputStream e() throws IOException {
        if (this.f53042a.exists()) {
            if (this.f53043b.exists()) {
                this.f53042a.delete();
            } else if (!this.f53042a.renameTo(this.f53043b)) {
                m.h("AtomicFile", "Couldn't rename file " + this.f53042a + " to backup file " + this.f53043b);
            }
        }
        try {
            return new a(this.f53042a);
        } catch (FileNotFoundException e10) {
            File parentFile = this.f53042a.getParentFile();
            if (parentFile == null || !parentFile.mkdirs()) {
                throw new IOException("Couldn't create " + this.f53042a, e10);
            }
            try {
                return new a(this.f53042a);
            } catch (FileNotFoundException e11) {
                throw new IOException("Couldn't create " + this.f53042a, e11);
            }
        }
    }

    public b(File file) {
        this.f53042a = file;
        this.f53043b = new File(file.getPath() + ".bak");
    }

    public void a(OutputStream outputStream) throws IOException {
        outputStream.close();
        this.f53043b.delete();
    }

    public InputStream c() throws FileNotFoundException {
        d();
        return new FileInputStream(this.f53042a);
    }
}
