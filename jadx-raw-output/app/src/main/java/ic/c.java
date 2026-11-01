package ic;

import com.squareup.wire.FieldEncoding;
import java.io.IOException;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: ProtoWriter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BufferedSink f54117a;

    public static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    public static int c(int i10) {
        return (i10 >> 31) ^ (i10 << 1);
    }

    public static long d(long j10) {
        return (j10 >> 63) ^ (j10 << 1);
    }

    public static int i(int i10) {
        if ((i10 & (-128)) == 0) {
            return 1;
        }
        if ((i10 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i10) == 0) {
            return 3;
        }
        return (i10 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int j(long j10) {
        if (((-128) & j10) == 0) {
            return 1;
        }
        if (((-16384) & j10) == 0) {
            return 2;
        }
        if (((-2097152) & j10) == 0) {
            return 3;
        }
        if (((-268435456) & j10) == 0) {
            return 4;
        }
        if (((-34359738368L) & j10) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j10) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j10) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j10) == 0) {
            return 8;
        }
        return (j10 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int e(int i10) {
        if (i10 >= 0) {
            return i(i10);
        }
        return 10;
    }

    public static int f(int i10, FieldEncoding fieldEncoding) {
        return (i10 << 3) | fieldEncoding.value;
    }

    public static int g(int i10) {
        return i(f(i10, FieldEncoding.VARINT));
    }

    public void k(ByteString byteString) throws IOException {
        this.f54117a.write(byteString);
    }

    public void l(int i10) throws IOException {
        this.f54117a.writeIntLe(i10);
    }

    public void m(long j10) throws IOException {
        this.f54117a.writeLongLe(j10);
    }

    public void n(int i10) throws IOException {
        if (i10 >= 0) {
            q(i10);
        } else {
            r(i10);
        }
    }

    public void o(String str) throws IOException {
        this.f54117a.writeUtf8(str);
    }

    public void q(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f54117a.writeByte((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f54117a.writeByte(i10);
    }

    public void r(long j10) throws IOException {
        while (((-128) & j10) != 0) {
            this.f54117a.writeByte((((int) j10) & 127) | 128);
            j10 >>>= 7;
        }
        this.f54117a.writeByte((int) j10);
    }

    public c(BufferedSink bufferedSink) {
        this.f54117a = bufferedSink;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    public static int h(String str) {
        int i10;
        int length = str.length();
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                i12++;
            } else if (cCharAt < 2048) {
                i12 += 2;
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                if (cCharAt > 56319 || (i10 = i11 + 1) >= length || str.charAt(i10) < 56320 || str.charAt(i10) > 57343) {
                    i12++;
                } else {
                    i12 += 4;
                    i11 = i10;
                }
            } else {
                i12 += 3;
            }
            i11++;
        }
        return i12;
    }

    public void p(int i10, FieldEncoding fieldEncoding) throws IOException {
        q(f(i10, fieldEncoding));
    }
}
