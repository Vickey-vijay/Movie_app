package u3;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.ArrayDeque;
import q3.h;

/* JADX INFO: compiled from: DefaultEbmlReader.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f72545a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayDeque<b> f72546b = new ArrayDeque<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f72547c = new g();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public u3.b f72548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f72549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f72550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f72551g;

    /* JADX INFO: compiled from: DefaultEbmlReader.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f72552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f72553b;

        public b(int i10, long j10) {
            this.f72552a = i10;
            this.f72553b = j10;
        }
    }

    @Override // u3.c
    public void reset() {
        this.f72549e = 0;
        this.f72546b.clear();
        this.f72547c.e();
    }

    @Override // u3.c
    public boolean a(h hVar) throws InterruptedException, IOException {
        g5.a.e(this.f72548d);
        while (true) {
            if (!this.f72546b.isEmpty() && hVar.getPosition() >= this.f72546b.peek().f72553b) {
                this.f72548d.endMasterElement(this.f72546b.pop().f72552a);
                return true;
            }
            if (this.f72549e == 0) {
                long jD = this.f72547c.d(hVar, true, false, 4);
                if (jD == -2) {
                    jD = c(hVar);
                }
                if (jD == -1) {
                    return false;
                }
                this.f72550f = (int) jD;
                this.f72549e = 1;
            }
            if (this.f72549e == 1) {
                this.f72551g = this.f72547c.d(hVar, false, true, 8);
                this.f72549e = 2;
            }
            int elementType = this.f72548d.getElementType(this.f72550f);
            if (elementType != 0) {
                if (elementType == 1) {
                    long position = hVar.getPosition();
                    this.f72546b.push(new b(this.f72550f, this.f72551g + position));
                    this.f72548d.startMasterElement(this.f72550f, position, this.f72551g);
                    this.f72549e = 0;
                    return true;
                }
                if (elementType == 2) {
                    long j10 = this.f72551g;
                    if (j10 <= 8) {
                        this.f72548d.integerElement(this.f72550f, e(hVar, (int) j10));
                        this.f72549e = 0;
                        return true;
                    }
                    throw new ParserException("Invalid integer size: " + this.f72551g);
                }
                if (elementType == 3) {
                    long j11 = this.f72551g;
                    if (j11 <= 2147483647L) {
                        this.f72548d.stringElement(this.f72550f, f(hVar, (int) j11));
                        this.f72549e = 0;
                        return true;
                    }
                    throw new ParserException("String element size: " + this.f72551g);
                }
                if (elementType == 4) {
                    this.f72548d.a(this.f72550f, (int) this.f72551g, hVar);
                    this.f72549e = 0;
                    return true;
                }
                if (elementType != 5) {
                    throw new ParserException("Invalid element type " + elementType);
                }
                long j12 = this.f72551g;
                if (j12 == 4 || j12 == 8) {
                    this.f72548d.floatElement(this.f72550f, d(hVar, (int) j12));
                    this.f72549e = 0;
                    return true;
                }
                throw new ParserException("Invalid float size: " + this.f72551g);
            }
            hVar.skipFully((int) this.f72551g);
            this.f72549e = 0;
        }
    }

    @Override // u3.c
    public void b(u3.b bVar) {
        this.f72548d = bVar;
    }

    public final long e(h hVar, int i10) throws InterruptedException, IOException {
        hVar.readFully(this.f72545a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | ((long) (this.f72545a[i11] & 255));
        }
        return j10;
    }

    public final String f(h hVar, int i10) throws InterruptedException, IOException {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        hVar.readFully(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    public final long c(h hVar) throws InterruptedException, IOException {
        hVar.resetPeekPosition();
        while (true) {
            hVar.peekFully(this.f72545a, 0, 4);
            int iC = g.c(this.f72545a[0]);
            if (iC != -1 && iC <= 4) {
                int iA = (int) g.a(this.f72545a, iC, false);
                if (this.f72548d.isLevel1Element(iA)) {
                    hVar.skipFully(iC);
                    return iA;
                }
            }
            hVar.skipFully(1);
        }
    }

    public final double d(h hVar, int i10) throws InterruptedException, IOException {
        long jE = e(hVar, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) jE);
        }
        return Double.longBitsToDouble(jE);
    }
}
