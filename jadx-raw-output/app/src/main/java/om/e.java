package om;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: RandomAccessFileBuffer.java */
/* JADX INFO: loaded from: classes6.dex */
public class e extends mm.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final RandomAccessFile f65431n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final FileChannel f65432o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final int f65433p;

    @Override // mm.d
    public byte[] V() {
        return null;
    }

    @Override // mm.d
    public void I(int i10, byte b10) {
        synchronized (this.f65431n) {
            try {
                try {
                    this.f65431n.seek(i10);
                    this.f65431n.writeByte(b10);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mm.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        synchronized (this.f65431n) {
            try {
                try {
                    this.f65431n.seek(i10);
                    i13 = this.f65431n.read(bArr, i11, i12);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i13;
    }

    @Override // mm.a, mm.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        synchronized (this.f65431n) {
            try {
                try {
                    this.f65431n.seek(i10);
                    this.f65431n.write(bArr, i11, i12);
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i12;
    }

    @Override // mm.d
    public byte Q(int i10) {
        byte b10;
        synchronized (this.f65431n) {
            try {
                try {
                    this.f65431n.seek(i10);
                    b10 = this.f65431n.readByte();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    @Override // mm.a, mm.d
    public void clear() {
        try {
            synchronized (this.f65431n) {
                super.clear();
                this.f65431n.setLength(0L);
            }
        } catch (Exception e10) {
            throw new RuntimeException(e10);
        }
    }

    public int d(WritableByteChannel writableByteChannel, int i10, int i11) throws IOException {
        int iTransferTo;
        synchronized (this.f65431n) {
            iTransferTo = (int) this.f65432o.transferTo(i10, i11, writableByteChannel);
        }
        return iTransferTo;
    }

    @Override // mm.d
    public int e0() {
        return this.f65433p;
    }

    @Override // mm.a, mm.d
    public byte peek() {
        byte b10;
        synchronized (this.f65431n) {
            try {
                try {
                    if (this.f64585d != this.f65431n.getFilePointer()) {
                        this.f65431n.seek(this.f64585d);
                    }
                    b10 = this.f65431n.readByte();
                } catch (Exception e10) {
                    throw new RuntimeException(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }
}
