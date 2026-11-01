package ic;

import com.squareup.wire.FieldEncoding;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: ProtoReader.java */
/* JADX INFO: loaded from: classes11.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSource f54109a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f54112d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public FieldEncoding f54116h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f54110b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f54111c = Long.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f54113e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54114f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f54115g = -1;

    public final void a(int i10) throws IOException {
        if (this.f54113e == i10) {
            this.f54113e = 6;
            return;
        }
        long j10 = this.f54110b;
        long j11 = this.f54111c;
        if (j10 > j11) {
            throw new IOException("Expected to end at " + this.f54111c + " but was " + this.f54110b);
        }
        if (j10 != j11) {
            this.f54113e = 7;
            return;
        }
        this.f54111c = this.f54115g;
        this.f54115g = -1L;
        this.f54113e = 6;
    }

    public final long b() throws IOException {
        if (this.f54113e != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f54113e);
        }
        long j10 = this.f54111c - this.f54110b;
        this.f54109a.require(j10);
        this.f54113e = 6;
        this.f54110b = this.f54111c;
        this.f54111c = this.f54115g;
        this.f54115g = -1L;
        return j10;
    }

    public long c() throws IOException {
        if (this.f54113e != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i10 = this.f54112d + 1;
        this.f54112d = i10;
        if (i10 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j10 = this.f54115g;
        this.f54115g = -1L;
        this.f54113e = 6;
        return j10;
    }

    public void d(long j10) throws IOException {
        if (this.f54113e != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i10 = this.f54112d - 1;
        this.f54112d = i10;
        if (i10 < 0 || this.f54115g != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f54110b == this.f54111c || i10 == 0) {
            this.f54111c = j10;
            return;
        }
        throw new IOException("Expected to end at " + this.f54111c + " but was " + this.f54110b);
    }

    public final int e() throws IOException {
        int i10;
        this.f54109a.require(1L);
        this.f54110b++;
        byte b10 = this.f54109a.readByte();
        if (b10 >= 0) {
            return b10;
        }
        int i11 = b10 & 127;
        this.f54109a.require(1L);
        this.f54110b++;
        byte b11 = this.f54109a.readByte();
        if (b11 >= 0) {
            i10 = b11 << 7;
        } else {
            i11 |= (b11 & 127) << 7;
            this.f54109a.require(1L);
            this.f54110b++;
            byte b12 = this.f54109a.readByte();
            if (b12 >= 0) {
                i10 = b12 << 14;
            } else {
                i11 |= (b12 & 127) << 14;
                this.f54109a.require(1L);
                this.f54110b++;
                byte b13 = this.f54109a.readByte();
                if (b13 < 0) {
                    int i12 = i11 | ((b13 & 127) << 21);
                    this.f54109a.require(1L);
                    this.f54110b++;
                    byte b14 = this.f54109a.readByte();
                    int i13 = i12 | (b14 << 28);
                    if (b14 >= 0) {
                        return i13;
                    }
                    for (int i14 = 0; i14 < 5; i14++) {
                        this.f54109a.require(1L);
                        this.f54110b++;
                        if (this.f54109a.readByte() >= 0) {
                            return i13;
                        }
                    }
                    throw new ProtocolException("Malformed VARINT");
                }
                i10 = b13 << 21;
            }
        }
        return i11 | i10;
    }

    public int f() throws IOException {
        int i10 = this.f54113e;
        if (i10 == 7) {
            this.f54113e = 2;
            return this.f54114f;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f54110b < this.f54111c && !this.f54109a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iE >> 3;
            this.f54114f = i11;
            int i12 = iE & 7;
            if (i12 == 0) {
                this.f54116h = FieldEncoding.VARINT;
                this.f54113e = 0;
                return i11;
            }
            if (i12 == 1) {
                this.f54116h = FieldEncoding.FIXED64;
                this.f54113e = 1;
                return i11;
            }
            if (i12 == 2) {
                this.f54116h = FieldEncoding.LENGTH_DELIMITED;
                this.f54113e = 2;
                int iE2 = e();
                if (iE2 < 0) {
                    throw new ProtocolException("Negative length: " + iE2);
                }
                if (this.f54115g != -1) {
                    throw new IllegalStateException();
                }
                long j10 = this.f54111c;
                this.f54115g = j10;
                long j11 = this.f54110b + ((long) iE2);
                this.f54111c = j11;
                if (j11 <= j10) {
                    return this.f54114f;
                }
                throw new EOFException();
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 == 5) {
                    this.f54116h = FieldEncoding.FIXED32;
                    this.f54113e = 5;
                    return i11;
                }
                throw new ProtocolException("Unexpected field encoding: " + i12);
            }
            n(i11);
        }
        return -1;
    }

    public FieldEncoding g() {
        return this.f54116h;
    }

    public int i() throws IOException {
        int i10 = this.f54113e;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f54113e);
        }
        this.f54109a.require(4L);
        this.f54110b += 4;
        int intLe = this.f54109a.readIntLe();
        a(5);
        return intLe;
    }

    public long j() throws IOException {
        int i10 = this.f54113e;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f54113e);
        }
        this.f54109a.require(8L);
        this.f54110b += 8;
        long longLe = this.f54109a.readLongLe();
        a(1);
        return longLe;
    }

    public int l() throws IOException {
        int i10 = this.f54113e;
        if (i10 == 0 || i10 == 2) {
            int iE = e();
            a(0);
            return iE;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f54113e);
    }

    public long m() throws IOException {
        int i10 = this.f54113e;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f54113e);
        }
        long j10 = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.f54109a.require(1L);
            this.f54110b++;
            byte b10 = this.f54109a.readByte();
            j10 |= ((long) (b10 & 127)) << i11;
            if ((b10 & 128) == 0) {
                a(0);
                return j10;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final void n(int i10) throws IOException {
        while (this.f54110b < this.f54111c && !this.f54109a.exhausted()) {
            int iE = e();
            if (iE == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iE >> 3;
            int i12 = iE & 7;
            if (i12 == 0) {
                this.f54113e = 0;
                m();
            } else if (i12 == 1) {
                this.f54113e = 1;
                j();
            } else if (i12 == 2) {
                long jE = e();
                this.f54110b += jE;
                this.f54109a.skip(jE);
            } else if (i12 == 3) {
                n(i11);
            } else if (i12 == 4) {
                if (i11 != i10) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: " + i12);
                }
                this.f54113e = 5;
                i();
            }
        }
        throw new EOFException();
    }

    public b(BufferedSource bufferedSource) {
        this.f54109a = bufferedSource;
    }

    public ByteString h() throws IOException {
        long jB = b();
        this.f54109a.require(jB);
        return this.f54109a.readByteString(jB);
    }

    public String k() throws IOException {
        long jB = b();
        this.f54109a.require(jB);
        return this.f54109a.readUtf8(jB);
    }
}
