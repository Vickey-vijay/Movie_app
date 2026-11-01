package om;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: compiled from: DirectNIOBuffer.java */
/* JADX INFO: loaded from: classes6.dex */
public class b extends mm.a implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final zm.c f65424s = zm.b.a(b.class);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ByteBuffer f65425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ReadableByteChannel f65426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InputStream f65427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public WritableByteChannel f65428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public OutputStream f65429r;

    public b(int i10) {
        super(2, false);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(i10);
        this.f65425n = byteBufferAllocateDirect;
        byteBufferAllocateDirect.position(0);
        byteBufferAllocateDirect.limit(byteBufferAllocateDirect.capacity());
    }

    @Override // mm.d
    public byte[] V() {
        return null;
    }

    @Override // mm.d
    public int J(int i10, byte[] bArr, int i11, int i12) {
        if ((i10 + i12 > e0() && (i12 = e0() - i10) == 0) || i12 < 0) {
            return -1;
        }
        try {
            this.f65425n.position(i10);
            this.f65425n.get(bArr, i11, i12);
            return i12;
        } finally {
            this.f65425n.position(0);
        }
    }

    @Override // mm.a, mm.d
    public int K(InputStream inputStream, int i10) throws IOException {
        ReadableByteChannel readableByteChannel = this.f65426o;
        if (readableByteChannel == null || !readableByteChannel.isOpen() || inputStream != this.f65427p) {
            this.f65426o = Channels.newChannel(inputStream);
            this.f65427p = inputStream;
        }
        if (i10 < 0 || i10 > L()) {
            i10 = L();
        }
        int iT = T();
        int i11 = i10;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < i10) {
            try {
                try {
                    this.f65425n.position(iT);
                    this.f65425n.limit(iT + i11);
                    i14 = this.f65426o.read(this.f65425n);
                    if (i14 < 0) {
                        this.f65426o = null;
                        this.f65427p = inputStream;
                        break;
                    }
                    if (i14 > 0) {
                        iT += i14;
                        i12 += i14;
                        i11 -= i14;
                        W(iT);
                        i13 = 0;
                    } else {
                        int i15 = i13 + 1;
                        if (i13 > 1) {
                            break;
                        }
                        i13 = i15;
                    }
                    if (inputStream.available() <= 0) {
                        break;
                    }
                } catch (IOException e10) {
                    this.f65426o = null;
                    this.f65427p = inputStream;
                    throw e10;
                }
            } catch (Throwable th2) {
                ReadableByteChannel readableByteChannel2 = this.f65426o;
                if (readableByteChannel2 != null && !readableByteChannel2.isOpen()) {
                    this.f65426o = null;
                    this.f65427p = inputStream;
                }
                this.f65425n.position(0);
                ByteBuffer byteBuffer = this.f65425n;
                byteBuffer.limit(byteBuffer.capacity());
                throw th2;
            }
        }
        if (i14 >= 0 || i12 != 0) {
            ReadableByteChannel readableByteChannel3 = this.f65426o;
            if (readableByteChannel3 != null && !readableByteChannel3.isOpen()) {
                this.f65426o = null;
                this.f65427p = inputStream;
            }
            this.f65425n.position(0);
            ByteBuffer byteBuffer2 = this.f65425n;
            byteBuffer2.limit(byteBuffer2.capacity());
            return i12;
        }
        ReadableByteChannel readableByteChannel4 = this.f65426o;
        if (readableByteChannel4 != null && !readableByteChannel4.isOpen()) {
            this.f65426o = null;
            this.f65427p = inputStream;
        }
        this.f65425n.position(0);
        ByteBuffer byteBuffer3 = this.f65425n;
        byteBuffer3.limit(byteBuffer3.capacity());
        return -1;
    }

    @Override // mm.d
    public byte Q(int i10) {
        return this.f65425n.get(i10);
    }

    @Override // om.d
    public ByteBuffer Z() {
        return this.f65425n;
    }

    @Override // mm.d
    public int e0() {
        return this.f65425n.capacity();
    }

    @Override // mm.a, mm.d
    public void writeTo(OutputStream outputStream) throws IOException {
        WritableByteChannel writableByteChannel;
        int iWrite;
        WritableByteChannel writableByteChannel2 = this.f65428q;
        if (writableByteChannel2 == null || !writableByteChannel2.isOpen() || outputStream != this.f65429r) {
            this.f65428q = Channels.newChannel(outputStream);
            this.f65429r = outputStream;
        }
        synchronized (this.f65425n) {
            loop0: while (true) {
                int i10 = 0;
                while (true) {
                    try {
                        try {
                            if (!hasContent() || !this.f65428q.isOpen()) {
                                break loop0;
                            }
                            this.f65425n.position(getIndex());
                            this.f65425n.limit(T());
                            iWrite = this.f65428q.write(this.f65425n);
                            if (iWrite < 0) {
                                break loop0;
                            }
                            if (iWrite > 0) {
                                break;
                            }
                            int i11 = i10 + 1;
                            if (i10 > 1) {
                                break loop0;
                            } else {
                                i10 = i11;
                            }
                            writableByteChannel = this.f65428q;
                            if (writableByteChannel != null && !writableByteChannel.isOpen()) {
                                this.f65428q = null;
                                this.f65429r = null;
                            }
                            this.f65425n.position(0);
                            ByteBuffer byteBuffer = this.f65425n;
                            byteBuffer.limit(byteBuffer.capacity());
                            throw th;
                        } catch (IOException e10) {
                            this.f65428q = null;
                            this.f65429r = null;
                            throw e10;
                        }
                    } catch (Throwable th2) {
                        writableByteChannel = this.f65428q;
                        if (writableByteChannel != null) {
                            this.f65428q = null;
                            this.f65429r = null;
                        }
                        this.f65425n.position(0);
                        ByteBuffer byteBuffer2 = this.f65425n;
                        byteBuffer2.limit(byteBuffer2.capacity());
                        throw th2;
                    }
                }
                skip(iWrite);
            }
            WritableByteChannel writableByteChannel3 = this.f65428q;
            if (writableByteChannel3 != null && !writableByteChannel3.isOpen()) {
                this.f65428q = null;
                this.f65429r = null;
            }
            this.f65425n.position(0);
            ByteBuffer byteBuffer3 = this.f65425n;
            byteBuffer3.limit(byteBuffer3.capacity());
        }
    }

    @Override // mm.d
    public void I(int i10, byte b10) {
        if (!isReadOnly()) {
            if (i10 >= 0) {
                if (i10 <= e0()) {
                    this.f65425n.put(i10, b10);
                    return;
                }
                throw new IllegalArgumentException("index>capacity(): " + i10 + ">" + e0());
            }
            throw new IllegalArgumentException("index<0: " + i10 + "<0");
        }
        throw new IllegalStateException("READONLY");
    }

    @Override // mm.a, mm.d
    public int M(int i10, byte[] bArr, int i11, int i12) {
        if (!isReadOnly()) {
            if (i10 >= 0) {
                if (i10 + i12 > e0() && (i12 = e0() - i10) < 0) {
                    throw new IllegalArgumentException("index>capacity(): " + i10 + ">" + e0());
                }
                try {
                    this.f65425n.position(i10);
                    int iRemaining = this.f65425n.remaining();
                    if (i12 > iRemaining) {
                        i12 = iRemaining;
                    }
                    if (i12 > 0) {
                        this.f65425n.put(bArr, i11, i12);
                    }
                    return i12;
                } finally {
                    this.f65425n.position(0);
                }
            }
            throw new IllegalArgumentException("index<0: " + i10 + "<0");
        }
        throw new IllegalStateException("READONLY");
    }

    @Override // mm.a, mm.d
    public int g0(int i10, mm.d dVar) {
        if (!isReadOnly()) {
            byte[] bArrV = dVar.V();
            if (bArrV != null) {
                return M(i10, bArrV, dVar.getIndex(), dVar.length());
            }
            mm.d dVarBuffer = dVar.buffer();
            if (dVarBuffer instanceof b) {
                ByteBuffer byteBufferDuplicate = ((b) dVarBuffer).f65425n;
                ByteBuffer byteBuffer = this.f65425n;
                if (byteBufferDuplicate == byteBuffer) {
                    byteBufferDuplicate = byteBuffer.duplicate();
                }
                try {
                    this.f65425n.position(i10);
                    int iRemaining = this.f65425n.remaining();
                    int length = dVar.length();
                    if (length <= iRemaining) {
                        iRemaining = length;
                    }
                    byteBufferDuplicate.position(dVar.getIndex());
                    byteBufferDuplicate.limit(dVar.getIndex() + iRemaining);
                    this.f65425n.put(byteBufferDuplicate);
                    return iRemaining;
                } finally {
                    this.f65425n.position(0);
                    byteBufferDuplicate.limit(byteBufferDuplicate.capacity());
                    byteBufferDuplicate.position(0);
                }
            }
            return super.g0(i10, dVar);
        }
        throw new IllegalStateException("READONLY");
    }

    public b(ByteBuffer byteBuffer, boolean z10) {
        super(z10 ? 0 : 2, false);
        if (byteBuffer.isDirect()) {
            this.f65425n = byteBuffer;
            i0(byteBuffer.position());
            W(byteBuffer.limit());
            return;
        }
        throw new IllegalArgumentException();
    }
}
