package u3;

import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.video.ColorInfo;
import g5.k0;
import g5.m;
import g5.n;
import g5.p;
import g5.q;
import g5.t;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import q3.h;
import q3.i;
import q3.k;
import q3.r;
import q3.s;
import q3.u;

/* JADX INFO: compiled from: MatroskaExtractor.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements q3.g {

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final k f72554b0 = new k() { // from class: u3.d
        @Override // q3.k
        public final q3.g[] createExtractors() {
            return e.t();
        }
    };

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f72555c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f72556d0 = k0.c0("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f72557e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final UUID f72558f0 = new UUID(72057594037932032L, -9223371306706625679L);
    public long A;
    public long B;
    public n C;
    public n D;
    public boolean E;
    public boolean F;
    public int G;
    public long H;
    public long I;
    public int J;
    public int K;
    public int[] L;
    public int M;
    public int N;
    public int O;
    public int P;
    public boolean Q;
    public int R;
    public int S;
    public int T;
    public boolean U;
    public boolean V;
    public boolean W;
    public int X;
    public byte Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u3.c f72559a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public i f72560a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f72561b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray<c> f72562c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f72563d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f72564e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f72565f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t f72566g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f72567h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f72568i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f72569j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t f72570k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final t f72571l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final t f72572m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final t f72573n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f72574o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f72575p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f72576q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f72577r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f72578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f72579t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c f72580u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f72581v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f72582w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f72583x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f72584y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f72585z;

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public final class b implements u3.b {
        public b() {
        }

        @Override // u3.b
        public void a(int i10, int i11, h hVar) throws InterruptedException, IOException {
            e.this.g(i10, i11, hVar);
        }

        @Override // u3.b
        public void endMasterElement(int i10) throws ParserException {
            e.this.j(i10);
        }

        @Override // u3.b
        public void floatElement(int i10, double d10) throws ParserException {
            e.this.m(i10, d10);
        }

        @Override // u3.b
        public int getElementType(int i10) {
            return e.this.o(i10);
        }

        @Override // u3.b
        public void integerElement(int i10, long j10) throws ParserException {
            e.this.q(i10, j10);
        }

        @Override // u3.b
        public boolean isLevel1Element(int i10) {
            return e.this.s(i10);
        }

        @Override // u3.b
        public void startMasterElement(int i10, long j10, long j11) throws ParserException {
            e.this.z(i10, j10, j11);
        }

        @Override // u3.b
        public void stringElement(int i10, String str) throws ParserException {
            e.this.A(i10, str);
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class c {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public int M;
        public int N;
        public int O;
        public long P;
        public long Q;

        @Nullable
        public d R;
        public boolean S;
        public boolean T;
        public String U;
        public u V;
        public int W;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f72587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f72588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f72589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f72590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72592f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f72593g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public byte[] f72594h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public u.a f72595i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public byte[] f72596j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public DrmInitData f72597k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f72598l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f72599m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f72600n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f72601o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f72602p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f72603q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f72604r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f72605s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public float f72606t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public byte[] f72607u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f72608v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f72609w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f72610x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f72611y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f72612z;

        public c() {
            this.f72598l = -1;
            this.f72599m = -1;
            this.f72600n = -1;
            this.f72601o = -1;
            this.f72602p = 0;
            this.f72603q = -1;
            this.f72604r = 0.0f;
            this.f72605s = 0.0f;
            this.f72606t = 0.0f;
            this.f72607u = null;
            this.f72608v = -1;
            this.f72609w = false;
            this.f72610x = -1;
            this.f72611y = -1;
            this.f72612z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = 1;
            this.N = -1;
            this.O = 8000;
            this.P = 0L;
            this.Q = 0L;
            this.T = true;
            this.U = "eng";
        }

        public static Pair<String, List<byte[]>> e(t tVar) throws ParserException {
            try {
                tVar.M(16);
                long jO = tVar.o();
                if (jO == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (jO == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (jO != 826496599) {
                    m.h("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] bArr = tVar.f53154a;
                for (int iC = tVar.c() + 20; iC < bArr.length - 4; iC++) {
                    if (bArr[iC] == 0 && bArr[iC + 1] == 0 && bArr[iC + 2] == 1 && bArr[iC + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArr, iC, bArr.length)));
                    }
                }
                throw new ParserException("Failed to find FourCC VC1 initialization data");
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing FourCC private data");
            }
        }

        public static List<byte[]> g(byte[] bArr) throws ParserException {
            int i10;
            int i11;
            try {
                if (bArr[0] != 2) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i12 = 0;
                int i13 = 1;
                while (true) {
                    i10 = bArr[i13];
                    if (i10 != -1) {
                        break;
                    }
                    i12 += 255;
                    i13++;
                }
                int i14 = i13 + 1;
                int i15 = i12 + i10;
                int i16 = 0;
                while (true) {
                    i11 = bArr[i14];
                    if (i11 != -1) {
                        break;
                    }
                    i16 += 255;
                    i14++;
                }
                int i17 = i14 + 1;
                int i18 = i16 + i11;
                if (bArr[i17] != 1) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr2 = new byte[i15];
                System.arraycopy(bArr, i17, bArr2, 0, i15);
                int i19 = i17 + i15;
                if (bArr[i19] != 3) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                int i20 = i19 + i18;
                if (bArr[i20] != 5) {
                    throw new ParserException("Error parsing vorbis codec private");
                }
                byte[] bArr3 = new byte[bArr.length - i20];
                System.arraycopy(bArr, i20, bArr3, 0, bArr.length - i20);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing vorbis codec private");
            }
        }

        @Nullable
        public final byte[] b() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.C * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.K + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) this.A);
            byteBufferOrder.putShort((short) this.B);
            return bArr;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:139:0x024b A[PHI: r1
  0x024b: PHI (r1v91 int) = (r1v71 int), (r1v94 int) binds: [B:169:0x0306, B:137:0x022e] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:179:0x0350  */
        /* JADX WARN: Code duplicated, block: B:180:0x0352  */
        /* JADX WARN: Code duplicated, block: B:183:0x035a  */
        /* JADX WARN: Code duplicated, block: B:184:0x0380  */
        /* JADX WARN: Code duplicated, block: B:186:0x0386  */
        /* JADX WARN: Code duplicated, block: B:188:0x038a  */
        /* JADX WARN: Code duplicated, block: B:190:0x038f  */
        /* JADX WARN: Code duplicated, block: B:193:0x0397  */
        /* JADX WARN: Code duplicated, block: B:195:0x039c  */
        /* JADX WARN: Code duplicated, block: B:198:0x03a3  */
        /* JADX WARN: Code duplicated, block: B:203:0x03b6  */
        /* JADX WARN: Code duplicated, block: B:204:0x03c8  */
        /* JADX WARN: Code duplicated, block: B:207:0x03d8  */
        /* JADX WARN: Code duplicated, block: B:208:0x03da  */
        /* JADX WARN: Code duplicated, block: B:210:0x03e4  */
        /* JADX WARN: Code duplicated, block: B:211:0x03e6  */
        /* JADX WARN: Code duplicated, block: B:213:0x03f0  */
        /* JADX WARN: Code duplicated, block: B:214:0x03f2  */
        /* JADX WARN: Code duplicated, block: B:216:0x03fc  */
        /* JADX WARN: Code duplicated, block: B:217:0x03ff  */
        /* JADX WARN: Code duplicated, block: B:220:0x0404  */
        /* JADX WARN: Code duplicated, block: B:239:0x0452  */
        /* JADX WARN: Code duplicated, block: B:241:0x047d  */
        /* JADX WARN: Code duplicated, block: B:243:0x0483  */
        /* JADX WARN: Code duplicated, block: B:245:0x0492  */
        /* JADX WARN: Code duplicated, block: B:247:0x0498  */
        /* JADX WARN: Code duplicated, block: B:248:0x04cc  */
        /* JADX WARN: Code duplicated, block: B:250:0x04d2  */
        /* JADX WARN: Code duplicated, block: B:4:0x0014  */
        public void c(i iVar, int i10) throws ParserException {
            byte b10;
            List<byte[]> listSingletonList;
            String str;
            int iR;
            String str2;
            int i11;
            String str3;
            String str4;
            int i12;
            List<byte[]> list;
            int i13;
            int i14;
            int i15;
            Format formatR;
            int i16;
            float f10;
            int i17;
            ColorInfo colorInfo;
            int i18;
            int i19;
            int i20;
            int i21;
            int i22;
            String str5 = this.f72588b;
            str5.hashCode();
            int i23 = 1;
            int i24 = 0;
            switch (str5) {
                case "V_MPEG4/ISO/AP":
                    b10 = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b10 = 1;
                    break;
                case "A_MS/ACM":
                    b10 = 2;
                    break;
                case "A_TRUEHD":
                    b10 = 3;
                    break;
                case "A_VORBIS":
                    b10 = 4;
                    break;
                case "A_MPEG/L2":
                    b10 = 5;
                    break;
                case "A_MPEG/L3":
                    b10 = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b10 = 7;
                    break;
                case "S_DVBSUB":
                    b10 = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b10 = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b10 = 10;
                    break;
                case "S_VOBSUB":
                    b10 = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b10 = 12;
                    break;
                case "A_AAC":
                    b10 = 13;
                    break;
                case "A_AC3":
                    b10 = 14;
                    break;
                case "A_DTS":
                    b10 = 15;
                    break;
                case "V_AV1":
                    b10 = 16;
                    break;
                case "V_VP8":
                    b10 = 17;
                    break;
                case "V_VP9":
                    b10 = 18;
                    break;
                case "S_HDMV/PGS":
                    b10 = 19;
                    break;
                case "V_THEORA":
                    b10 = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b10 = 21;
                    break;
                case "A_PCM/INT/LIT":
                    b10 = 22;
                    break;
                case "S_TEXT/ASS":
                    b10 = 23;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b10 = 24;
                    break;
                case "S_TEXT/UTF8":
                    b10 = 25;
                    break;
                case "V_MPEG2":
                    b10 = 26;
                    break;
                case "A_EAC3":
                    b10 = 27;
                    break;
                case "A_FLAC":
                    b10 = 28;
                    break;
                case "A_OPUS":
                    b10 = 29;
                    break;
                default:
                    b10 = -1;
                    break;
            }
            String str6 = "audio/x-unknown";
            switch (b10) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr = this.f72596j;
                    listSingletonList = bArr == null ? null : Collections.singletonList(bArr);
                    str = "video/mp4v-es";
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i25 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i25 | i14;
                    if (!p.l(str6)) {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    } else if (p.n(str6)) {
                        if (this.f72602p == 0) {
                            i21 = this.f72600n;
                            i16 = -1;
                            if (i21 == -1) {
                                i21 = this.f72598l;
                            }
                            this.f72600n = i21;
                            i22 = this.f72601o;
                            if (i22 == -1) {
                                i22 = this.f72599m;
                            }
                            this.f72601o = i22;
                        } else {
                            i16 = -1;
                        }
                        f10 = -1.0f;
                        i17 = this.f72600n;
                        if (i17 != i16 && (i20 = this.f72601o) != i16) {
                            f10 = (this.f72599m * i17) / (this.f72598l * i20);
                        }
                        float f11 = f10;
                        if (this.f72609w) {
                            colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                        } else {
                            colorInfo = null;
                        }
                        if ("htc_video_rotA-000".equals(this.f72587a)) {
                            i18 = 0;
                        } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                            i18 = 90;
                        } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                            i18 = 180;
                        } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                            i18 = 270;
                        } else {
                            i18 = i16;
                        }
                        if (this.f72603q == 0 || Float.compare(this.f72604r, 0.0f) != 0 || Float.compare(this.f72605s, 0.0f) != 0) {
                            i19 = i18;
                        } else if (Float.compare(this.f72606t, 0.0f) == 0) {
                            i19 = i24;
                        } else if (Float.compare(this.f72605s, 90.0f) == 0) {
                            i19 = 90;
                        } else if (Float.compare(this.f72605s, -180.0f) == 0 || Float.compare(this.f72605s, 180.0f) == 0) {
                            i19 = 180;
                        } else if (Float.compare(this.f72605s, -90.0f) == 0) {
                            i24 = 270;
                            i19 = i24;
                        } else {
                            i19 = i18;
                        }
                        formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f11, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                        i23 = 2;
                    } else {
                        if ("application/x-subrip".equals(str6)) {
                            formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                        } else if ("text/x-ssa".equals(str6)) {
                            ArrayList arrayList = new ArrayList(2);
                            arrayList.add(e.f72556d0);
                            arrayList.add(this.f72596j);
                            formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList);
                        } else {
                            if ("application/vobsub".equals(str6) && !"application/pgs".equals(str6) && !"application/dvbsubs".equals(str6)) {
                                throw new ParserException("Unexpected MIME type.");
                            }
                            formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                        }
                        i23 = 3;
                    }
                    u uVarTrack = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack;
                    uVarTrack.a(formatR);
                    return;
                case 2:
                    if (f(new t(this.f72596j))) {
                        iR = k0.R(this.N);
                        if (iR == 0) {
                            m.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.N + ". Setting mimeType to audio/x-unknown");
                        } else {
                            i13 = iR;
                            str6 = "audio/raw";
                            listSingletonList = null;
                        }
                        i12 = -1;
                        int i26 = (this.T ? 1 : 0) | 0;
                        if (this.S) {
                            i14 = 2;
                        } else {
                            i14 = 0;
                        }
                        i15 = i26 | i14;
                        if (!p.l(str6)) {
                            if (p.n(str6)) {
                                if (this.f72602p == 0) {
                                    i21 = this.f72600n;
                                    i16 = -1;
                                    if (i21 == -1) {
                                        i21 = this.f72598l;
                                    }
                                    this.f72600n = i21;
                                    i22 = this.f72601o;
                                    if (i22 == -1) {
                                        i22 = this.f72599m;
                                    }
                                    this.f72601o = i22;
                                } else {
                                    i16 = -1;
                                }
                                f10 = -1.0f;
                                i17 = this.f72600n;
                                if (i17 != i16) {
                                    f10 = (this.f72599m * i17) / (this.f72598l * i20);
                                }
                                float f12 = f10;
                                if (this.f72609w) {
                                    colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                                } else {
                                    colorInfo = null;
                                }
                                if ("htc_video_rotA-000".equals(this.f72587a)) {
                                    i18 = 0;
                                } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                    i18 = 90;
                                } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                    i18 = 180;
                                } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                    i18 = 270;
                                } else {
                                    i18 = i16;
                                }
                                if (this.f72603q == 0) {
                                    i19 = i18;
                                } else {
                                    i19 = i18;
                                }
                                formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f12, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                                i23 = 2;
                            } else {
                                if ("application/x-subrip".equals(str6)) {
                                    formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                                } else if ("text/x-ssa".equals(str6)) {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    arrayList2.add(e.f72556d0);
                                    arrayList2.add(this.f72596j);
                                    formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList2);
                                } else {
                                    if ("application/vobsub".equals(str6)) {
                                    }
                                    formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                                }
                                i23 = 3;
                            }
                            break;
                        } else {
                            formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                        }
                        u uVarTrack2 = iVar.track(this.f72589c, i23);
                        this.V = uVarTrack2;
                        uVarTrack2.a(formatR);
                        return;
                    }
                    m.h("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i27 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i27 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f13 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f13, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList3 = new ArrayList(2);
                                arrayList3.add(e.f72556d0);
                                arrayList3.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList3);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack3 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack3;
                    uVarTrack3.a(formatR);
                    return;
                case 3:
                    this.R = new d();
                    str2 = "audio/true-hd";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i28 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i28 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f14 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f14, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList4 = new ArrayList(2);
                                arrayList4.add(e.f72556d0);
                                arrayList4.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList4);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack4 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack4;
                    uVarTrack4.a(formatR);
                    return;
                case 4:
                    i11 = 8192;
                    listSingletonList = g(this.f72596j);
                    str3 = "audio/vorbis";
                    str6 = str3;
                    i12 = i11;
                    i13 = -1;
                    int i29 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i29 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f15 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f15, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList5 = new ArrayList(2);
                                arrayList5.add(e.f72556d0);
                                arrayList5.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList5);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack5 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack5;
                    uVarTrack5.a(formatR);
                    return;
                case 5:
                    str4 = "audio/mpeg-L2";
                    str6 = str4;
                    i12 = 4096;
                    listSingletonList = null;
                    i13 = -1;
                    int i210 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i210 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f16 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f16, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList6 = new ArrayList(2);
                                arrayList6.add(e.f72556d0);
                                arrayList6.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList6);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack6 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack6;
                    uVarTrack6.a(formatR);
                    return;
                case 6:
                    str4 = "audio/mpeg";
                    str6 = str4;
                    i12 = 4096;
                    listSingletonList = null;
                    i13 = -1;
                    int i211 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i211 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f17 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f17, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList7 = new ArrayList(2);
                                arrayList7.add(e.f72556d0);
                                arrayList7.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList7);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack7 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack7;
                    uVarTrack7.a(formatR);
                    return;
                case 7:
                    Pair<String, List<byte[]>> pairE = e(new t(this.f72596j));
                    str = (String) pairE.first;
                    listSingletonList = (List) pairE.second;
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i212 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i212 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f18 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f18, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList8 = new ArrayList(2);
                                arrayList8.add(e.f72556d0);
                                arrayList8.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList8);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack8 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack8;
                    uVarTrack8.a(formatR);
                    return;
                case 8:
                    byte[] bArr2 = this.f72596j;
                    listSingletonList = Collections.singletonList(new byte[]{bArr2[0], bArr2[1], bArr2[2], bArr2[3]});
                    str6 = "application/dvbsubs";
                    i13 = -1;
                    i12 = -1;
                    int i213 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i213 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f19 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f19, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList9 = new ArrayList(2);
                                arrayList9.add(e.f72556d0);
                                arrayList9.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList9);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack9 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack9;
                    uVarTrack9.a(formatR);
                    return;
                case 10:
                    h5.a aVarB = h5.a.b(new t(this.f72596j));
                    list = aVarB.f53703a;
                    this.W = aVarB.f53704b;
                    str = "video/avc";
                    listSingletonList = list;
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i214 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i214 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f110 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f110, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList10 = new ArrayList(2);
                                arrayList10.add(e.f72556d0);
                                arrayList10.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList10);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack10 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack10;
                    uVarTrack10.a(formatR);
                    return;
                case 11:
                    listSingletonList = Collections.singletonList(this.f72596j);
                    str6 = "application/vobsub";
                    i13 = -1;
                    i12 = -1;
                    int i215 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i215 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f111 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f111, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList11 = new ArrayList(2);
                                arrayList11.add(e.f72556d0);
                                arrayList11.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList11);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack11 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack11;
                    uVarTrack11.a(formatR);
                    return;
                case 12:
                    str2 = "audio/vnd.dts.hd";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i216 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i216 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f112 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f112, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList12 = new ArrayList(2);
                                arrayList12.add(e.f72556d0);
                                arrayList12.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList12);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack12 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack12;
                    uVarTrack12.a(formatR);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(this.f72596j);
                    str = "audio/mp4a-latm";
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i217 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i217 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f113 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f113, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList13 = new ArrayList(2);
                                arrayList13.add(e.f72556d0);
                                arrayList13.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList13);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack13 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack13;
                    uVarTrack13.a(formatR);
                    return;
                case 14:
                    str2 = "audio/ac3";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i218 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i218 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f114 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f114, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList14 = new ArrayList(2);
                                arrayList14.add(e.f72556d0);
                                arrayList14.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList14);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack14 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack14;
                    uVarTrack14.a(formatR);
                    return;
                case 15:
                case 21:
                    str2 = "audio/vnd.dts";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i219 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i219 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f115 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f115, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList15 = new ArrayList(2);
                                arrayList15.add(e.f72556d0);
                                arrayList15.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList15);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack15 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack15;
                    uVarTrack15.a(formatR);
                    return;
                case 16:
                    str2 = "video/av01";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2110 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2110 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f116 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f116, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList16 = new ArrayList(2);
                                arrayList16.add(e.f72556d0);
                                arrayList16.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList16);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack16 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack16;
                    uVarTrack16.a(formatR);
                    return;
                case 17:
                    str2 = "video/x-vnd.on2.vp8";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2111 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2111 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f117 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f117, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList17 = new ArrayList(2);
                                arrayList17.add(e.f72556d0);
                                arrayList17.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList17);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack17 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack17;
                    uVarTrack17.a(formatR);
                    return;
                case 18:
                    str2 = "video/x-vnd.on2.vp9";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2112 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2112 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f118 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f118, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList18 = new ArrayList(2);
                                arrayList18.add(e.f72556d0);
                                arrayList18.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList18);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack18 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack18;
                    uVarTrack18.a(formatR);
                    return;
                case 19:
                    str6 = "application/pgs";
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2113 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2113 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f119 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f119, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList19 = new ArrayList(2);
                                arrayList19.add(e.f72556d0);
                                arrayList19.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList19);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack19 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack19;
                    uVarTrack19.a(formatR);
                    return;
                case 20:
                    str2 = "video/x-unknown";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2114 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2114 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1110 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1110, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList110 = new ArrayList(2);
                                arrayList110.add(e.f72556d0);
                                arrayList110.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList110);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack110 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack110;
                    uVarTrack110.a(formatR);
                    return;
                case 22:
                    iR = k0.R(this.N);
                    if (iR == 0) {
                        m.h("MatroskaExtractor", "Unsupported PCM bit depth: " + this.N + ". Setting mimeType to audio/x-unknown");
                        listSingletonList = null;
                        i13 = -1;
                    } else {
                        i13 = iR;
                        str6 = "audio/raw";
                        listSingletonList = null;
                    }
                    i12 = -1;
                    int i2115 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2115 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1111 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1111, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList111 = new ArrayList(2);
                                arrayList111.add(e.f72556d0);
                                arrayList111.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList111);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack111 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack111;
                    uVarTrack111.a(formatR);
                    return;
                case 23:
                    str6 = "text/x-ssa";
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2116 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2116 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1112 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1112, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList112 = new ArrayList(2);
                                arrayList112.add(e.f72556d0);
                                arrayList112.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList112);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack112 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack112;
                    uVarTrack112.a(formatR);
                    return;
                case 24:
                    h5.c cVarA = h5.c.a(new t(this.f72596j));
                    list = cVarA.f53711a;
                    this.W = cVarA.f53712b;
                    str = "video/hevc";
                    listSingletonList = list;
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i2117 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2117 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1113 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1113, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList113 = new ArrayList(2);
                                arrayList113.add(e.f72556d0);
                                arrayList113.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList113);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack113 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack113;
                    uVarTrack113.a(formatR);
                    return;
                case 25:
                    str6 = "application/x-subrip";
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2118 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2118 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1114 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1114, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList114 = new ArrayList(2);
                                arrayList114.add(e.f72556d0);
                                arrayList114.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList114);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack114 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack114;
                    uVarTrack114.a(formatR);
                    return;
                case 26:
                    str2 = "video/mpeg2";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i2119 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i2119 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1115 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1115, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList115 = new ArrayList(2);
                                arrayList115.add(e.f72556d0);
                                arrayList115.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList115);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack115 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack115;
                    uVarTrack115.a(formatR);
                    return;
                case 27:
                    str2 = "audio/eac3";
                    str6 = str2;
                    listSingletonList = null;
                    i13 = -1;
                    i12 = -1;
                    int i21110 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i21110 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1116 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1116, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList116 = new ArrayList(2);
                                arrayList116.add(e.f72556d0);
                                arrayList116.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList116);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack116 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack116;
                    uVarTrack116.a(formatR);
                    return;
                case 28:
                    listSingletonList = Collections.singletonList(this.f72596j);
                    str = "audio/flac";
                    str6 = str;
                    i13 = -1;
                    i12 = -1;
                    int i21111 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i21111 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1117 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1117, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList117 = new ArrayList(2);
                                arrayList117.add(e.f72556d0);
                                arrayList117.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList117);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack117 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack117;
                    uVarTrack117.a(formatR);
                    return;
                case 29:
                    i11 = 5760;
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(this.f72596j);
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.P).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.Q).array());
                    str3 = "audio/opus";
                    str6 = str3;
                    i12 = i11;
                    i13 = -1;
                    int i21112 = (this.T ? 1 : 0) | 0;
                    if (this.S) {
                        i14 = 2;
                    } else {
                        i14 = 0;
                    }
                    i15 = i21112 | i14;
                    if (!p.l(str6)) {
                        if (p.n(str6)) {
                            if (this.f72602p == 0) {
                                i21 = this.f72600n;
                                i16 = -1;
                                if (i21 == -1) {
                                    i21 = this.f72598l;
                                }
                                this.f72600n = i21;
                                i22 = this.f72601o;
                                if (i22 == -1) {
                                    i22 = this.f72599m;
                                }
                                this.f72601o = i22;
                            } else {
                                i16 = -1;
                            }
                            f10 = -1.0f;
                            i17 = this.f72600n;
                            if (i17 != i16) {
                                f10 = (this.f72599m * i17) / (this.f72598l * i20);
                            }
                            float f1118 = f10;
                            if (this.f72609w) {
                                colorInfo = new ColorInfo(this.f72610x, this.f72612z, this.f72611y, b());
                            } else {
                                colorInfo = null;
                            }
                            if ("htc_video_rotA-000".equals(this.f72587a)) {
                                i18 = 0;
                            } else if ("htc_video_rotA-090".equals(this.f72587a)) {
                                i18 = 90;
                            } else if ("htc_video_rotA-180".equals(this.f72587a)) {
                                i18 = 180;
                            } else if ("htc_video_rotA-270".equals(this.f72587a)) {
                                i18 = 270;
                            } else {
                                i18 = i16;
                            }
                            if (this.f72603q == 0) {
                                i19 = i18;
                            } else {
                                i19 = i18;
                            }
                            formatR = Format.C(Integer.toString(i10), str6, null, -1, i12, this.f72598l, this.f72599m, -1.0f, listSingletonList, i19, f1118, this.f72607u, this.f72608v, colorInfo, this.f72597k);
                            i23 = 2;
                        } else {
                            if ("application/x-subrip".equals(str6)) {
                                formatR = Format.x(Integer.toString(i10), str6, i15, this.U, this.f72597k);
                            } else if ("text/x-ssa".equals(str6)) {
                                ArrayList arrayList118 = new ArrayList(2);
                                arrayList118.add(e.f72556d0);
                                arrayList118.add(this.f72596j);
                                formatR = Format.y(Integer.toString(i10), str6, null, -1, i15, this.U, -1, this.f72597k, Long.MAX_VALUE, arrayList118);
                            } else {
                                if ("application/vobsub".equals(str6)) {
                                }
                                formatR = Format.r(Integer.toString(i10), str6, null, -1, i15, listSingletonList, this.U, this.f72597k);
                            }
                            i23 = 3;
                        }
                        break;
                    } else {
                        formatR = Format.o(Integer.toString(i10), str6, null, -1, i12, this.M, this.O, i13, listSingletonList, this.f72597k, i15, this.U);
                    }
                    u uVarTrack118 = iVar.track(this.f72589c, i23);
                    this.V = uVarTrack118;
                    uVarTrack118.a(formatR);
                    return;
                default:
                    throw new ParserException("Unrecognized codec identifier.");
            }
        }

        public void d() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void h() {
            d dVar = this.R;
            if (dVar != null) {
                dVar.b();
            }
        }

        public static boolean f(t tVar) throws ParserException {
            try {
                int iQ = tVar.q();
                if (iQ == 1) {
                    return true;
                }
                if (iQ != 65534) {
                    return false;
                }
                tVar.L(24);
                if (tVar.r() == e.f72558f0.getMostSignificantBits() && tVar.r() == e.f72558f0.getLeastSignificantBits()) {
                    return true;
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new ParserException("Error parsing MS/ACM codec private");
            }
        }
    }

    /* JADX INFO: compiled from: MatroskaExtractor.java */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final byte[] f72613a = new byte[10];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f72614b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f72615c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f72616d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f72617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f72618f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f72619g;

        public void b() {
            this.f72614b = false;
            this.f72615c = 0;
        }

        public void a(c cVar) {
            if (this.f72615c > 0) {
                cVar.V.d(this.f72616d, this.f72617e, this.f72618f, this.f72619g, cVar.f72595i);
                this.f72615c = 0;
            }
        }

        public void c(c cVar, long j10, int i10, int i11, int i12) {
            if (this.f72614b) {
                int i13 = this.f72615c;
                int i14 = i13 + 1;
                this.f72615c = i14;
                if (i13 == 0) {
                    this.f72616d = j10;
                    this.f72617e = i10;
                    this.f72618f = 0;
                }
                this.f72618f += i11;
                this.f72619g = i12;
                if (i14 >= 16) {
                    a(cVar);
                }
            }
        }

        public void d(h hVar) throws InterruptedException, IOException {
            if (this.f72614b) {
                return;
            }
            hVar.peekFully(this.f72613a, 0, 10);
            hVar.resetPeekPosition();
            if (m3.a.i(this.f72613a) == 0) {
                return;
            }
            this.f72614b = true;
        }
    }

    public e() {
        this(0);
    }

    public static /* synthetic */ q3.g[] t() {
        return new q3.g[]{new e()};
    }

    public final void C(h hVar, byte[] bArr, int i10) throws InterruptedException, IOException {
        int length = bArr.length + i10;
        if (this.f72570k.b() < length) {
            this.f72570k.f53154a = Arrays.copyOf(bArr, length + i10);
        } else {
            System.arraycopy(bArr, 0, this.f72570k.f53154a, 0, bArr.length);
        }
        hVar.readFully(this.f72570k.f53154a, bArr.length, i10);
        this.f72570k.H(length);
    }

    @Override // q3.g
    public final int a(h hVar, r rVar) throws InterruptedException, IOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f72559a.a(hVar);
            if (zA && u(rVar, hVar.getPosition())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f72562c.size(); i10++) {
            this.f72562c.valueAt(i10).d();
        }
        return -1;
    }

    @CallSuper
    public int o(int i10) {
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case AD_RESPONSE_EMPTY_VALUE:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public void p(c cVar, int i10, h hVar, int i11) throws InterruptedException, IOException {
        if (i10 != 4 || !"V_VP9".equals(cVar.f72588b)) {
            hVar.skipFully(i11);
        } else {
            this.f72573n.H(i11);
            hVar.readFully(this.f72573n.f53154a, 0, i11);
        }
    }

    @Override // q3.g
    public final void release() {
    }

    @CallSuper
    public boolean s(int i10) {
        return i10 == 357149030 || i10 == 524531317 || i10 == 475249515 || i10 == 374648427;
    }

    public final void w() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.f72569j.G();
    }

    public e(int i10) {
        this(new u3.a(), i10);
    }

    public static int[] k(int[] iArr, int i10) {
        if (iArr == null) {
            return new int[i10];
        }
        return iArr.length >= i10 ? iArr : new int[Math.max(iArr.length * 2, i10)];
    }

    public static boolean r(String str) {
        return "V_VP8".equals(str) || "V_VP9".equals(str) || "V_AV1".equals(str) || "V_MPEG2".equals(str) || "V_MPEG4/ISO/SP".equals(str) || "V_MPEG4/ISO/ASP".equals(str) || "V_MPEG4/ISO/AP".equals(str) || "V_MPEG4/ISO/AVC".equals(str) || "V_MPEGH/ISO/HEVC".equals(str) || "V_MS/VFW/FOURCC".equals(str) || "V_THEORA".equals(str) || "A_OPUS".equals(str) || "A_VORBIS".equals(str) || "A_AAC".equals(str) || "A_MPEG/L2".equals(str) || "A_MPEG/L3".equals(str) || "A_AC3".equals(str) || "A_EAC3".equals(str) || "A_TRUEHD".equals(str) || "A_DTS".equals(str) || "A_DTS/EXPRESS".equals(str) || "A_DTS/LOSSLESS".equals(str) || "A_FLAC".equals(str) || "A_MS/ACM".equals(str) || "A_PCM/INT/LIT".equals(str) || "S_TEXT/UTF8".equals(str) || "S_TEXT/ASS".equals(str) || "S_VOBSUB".equals(str) || "S_HDMV/PGS".equals(str) || "S_DVBSUB".equals(str);
    }

    @CallSuper
    public void A(int i10, String str) throws ParserException {
        if (i10 == 134) {
            this.f72580u.f72588b = str;
            return;
        }
        if (i10 != 17026) {
            if (i10 == 21358) {
                this.f72580u.f72587a = str;
                return;
            } else {
                if (i10 != 2274716) {
                    return;
                }
                this.f72580u.U = str;
                return;
            }
        }
        if ("webm".equals(str) || "matroska".equals(str)) {
            return;
        }
        throw new ParserException("DocType " + str + " not supported");
    }

    public final int B(h hVar, c cVar, int i10) throws InterruptedException, IOException {
        int i11;
        if ("S_TEXT/UTF8".equals(cVar.f72588b)) {
            C(hVar, f72555c0, i10);
            return l();
        }
        if ("S_TEXT/ASS".equals(cVar.f72588b)) {
            C(hVar, f72557e0, i10);
            return l();
        }
        u uVar = cVar.V;
        if (!this.U) {
            if (cVar.f72593g) {
                this.O &= -1073741825;
                if (!this.V) {
                    hVar.readFully(this.f72566g.f53154a, 0, 1);
                    this.R++;
                    byte b10 = this.f72566g.f53154a[0];
                    if ((b10 & 128) == 128) {
                        throw new ParserException("Extension bit is set in signal byte");
                    }
                    this.Y = b10;
                    this.V = true;
                }
                byte b11 = this.Y;
                if ((b11 & 1) == 1) {
                    boolean z10 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        hVar.readFully(this.f72571l.f53154a, 0, 8);
                        this.R += 8;
                        this.Z = true;
                        t tVar = this.f72566g;
                        tVar.f53154a[0] = (byte) ((z10 ? 128 : 0) | 8);
                        tVar.L(0);
                        uVar.c(this.f72566g, 1);
                        this.S++;
                        this.f72571l.L(0);
                        uVar.c(this.f72571l, 8);
                        this.S += 8;
                    }
                    if (z10) {
                        if (!this.W) {
                            hVar.readFully(this.f72566g.f53154a, 0, 1);
                            this.R++;
                            this.f72566g.L(0);
                            this.X = this.f72566g.y();
                            this.W = true;
                        }
                        int i12 = this.X * 4;
                        this.f72566g.H(i12);
                        hVar.readFully(this.f72566g.f53154a, 0, i12);
                        this.R += i12;
                        short s10 = (short) ((this.X / 2) + 1);
                        int i13 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f72574o;
                        if (byteBuffer == null || byteBuffer.capacity() < i13) {
                            this.f72574o = ByteBuffer.allocate(i13);
                        }
                        this.f72574o.position(0);
                        this.f72574o.putShort(s10);
                        int i14 = 0;
                        int i15 = 0;
                        while (true) {
                            i11 = this.X;
                            if (i14 >= i11) {
                                break;
                            }
                            int iC = this.f72566g.C();
                            if (i14 % 2 == 0) {
                                this.f72574o.putShort((short) (iC - i15));
                            } else {
                                this.f72574o.putInt(iC - i15);
                            }
                            i14++;
                            i15 = iC;
                        }
                        int i16 = (i10 - this.R) - i15;
                        if (i11 % 2 == 1) {
                            this.f72574o.putInt(i16);
                        } else {
                            this.f72574o.putShort((short) i16);
                            this.f72574o.putInt(0);
                        }
                        this.f72572m.J(this.f72574o.array(), i13);
                        uVar.c(this.f72572m, i13);
                        this.S += i13;
                    }
                }
            } else {
                byte[] bArr = cVar.f72594h;
                if (bArr != null) {
                    this.f72569j.J(bArr, bArr.length);
                }
            }
            if (cVar.f72592f > 0) {
                this.O |= 268435456;
                this.f72573n.G();
                this.f72566g.H(4);
                t tVar2 = this.f72566g;
                byte[] bArr2 = tVar2.f53154a;
                bArr2[0] = (byte) ((i10 >> 24) & 255);
                bArr2[1] = (byte) ((i10 >> 16) & 255);
                bArr2[2] = (byte) ((i10 >> 8) & 255);
                bArr2[3] = (byte) (i10 & 255);
                uVar.c(tVar2, 4);
                this.S += 4;
            }
            this.U = true;
        }
        int iD = i10 + this.f72569j.d();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.f72588b) && !"V_MPEGH/ISO/HEVC".equals(cVar.f72588b)) {
            if (cVar.R != null) {
                g5.a.f(this.f72569j.d() == 0);
                cVar.R.d(hVar);
            }
            while (true) {
                int i17 = this.R;
                if (i17 >= iD) {
                    break;
                }
                int iD2 = D(hVar, uVar, iD - i17);
                this.R += iD2;
                this.S += iD2;
            }
        } else {
            byte[] bArr3 = this.f72565f.f53154a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i18 = cVar.W;
            int i19 = 4 - i18;
            while (this.R < iD) {
                int i20 = this.T;
                if (i20 == 0) {
                    E(hVar, bArr3, i19, i18);
                    this.R += i18;
                    this.f72565f.L(0);
                    this.T = this.f72565f.C();
                    this.f72564e.L(0);
                    uVar.c(this.f72564e, 4);
                    this.S += 4;
                } else {
                    int iD3 = D(hVar, uVar, i20);
                    this.R += iD3;
                    this.S += iD3;
                    this.T -= iD3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.f72588b)) {
            this.f72567h.L(0);
            uVar.c(this.f72567h, 4);
            this.S += 4;
        }
        return l();
    }

    public final int D(h hVar, u uVar, int i10) throws InterruptedException, IOException {
        int iA = this.f72569j.a();
        if (iA <= 0) {
            return uVar.b(hVar, i10, false);
        }
        int iMin = Math.min(i10, iA);
        uVar.c(this.f72569j, iMin);
        return iMin;
    }

    public final void E(h hVar, byte[] bArr, int i10, int i11) throws InterruptedException, IOException {
        int iMin = Math.min(i11, this.f72569j.a());
        hVar.readFully(bArr, i10 + iMin, i11 - iMin);
        if (iMin > 0) {
            this.f72569j.h(bArr, i10, iMin);
        }
    }

    @Override // q3.g
    public final boolean b(h hVar) throws InterruptedException, IOException {
        return new f().b(hVar);
    }

    @Override // q3.g
    public final void c(i iVar) {
        this.f72560a0 = iVar;
    }

    @CallSuper
    public void g(int i10, int i11, h hVar) throws InterruptedException, IOException {
        int i12;
        int i13;
        int i14;
        int i15;
        if (i10 != 161 && i10 != 163) {
            if (i10 == 165) {
                if (this.G != 2) {
                    return;
                }
                p(this.f72562c.get(this.M), this.P, hVar, i11);
                return;
            }
            if (i10 == 16981) {
                byte[] bArr = new byte[i11];
                this.f72580u.f72594h = bArr;
                hVar.readFully(bArr, 0, i11);
                return;
            }
            if (i10 == 18402) {
                byte[] bArr2 = new byte[i11];
                hVar.readFully(bArr2, 0, i11);
                this.f72580u.f72595i = new u.a(1, bArr2, 0, 0);
                return;
            }
            if (i10 == 21419) {
                Arrays.fill(this.f72568i.f53154a, (byte) 0);
                hVar.readFully(this.f72568i.f53154a, 4 - i11, i11);
                this.f72568i.L(0);
                this.f72582w = (int) this.f72568i.A();
                return;
            }
            if (i10 == 25506) {
                byte[] bArr3 = new byte[i11];
                this.f72580u.f72596j = bArr3;
                hVar.readFully(bArr3, 0, i11);
                return;
            } else {
                if (i10 != 30322) {
                    throw new ParserException("Unexpected id: " + i10);
                }
                byte[] bArr4 = new byte[i11];
                this.f72580u.f72607u = bArr4;
                hVar.readFully(bArr4, 0, i11);
                return;
            }
        }
        if (this.G == 0) {
            this.M = (int) this.f72561b.d(hVar, false, true, 8);
            this.N = this.f72561b.b();
            this.I = -9223372036854775807L;
            this.G = 1;
            this.f72566g.G();
        }
        c cVar = this.f72562c.get(this.M);
        if (cVar == null) {
            hVar.skipFully(i11 - this.N);
            this.G = 0;
            return;
        }
        if (this.G == 1) {
            v(hVar, 3);
            int i16 = (this.f72566g.f53154a[2] & 6) >> 1;
            if (i16 == 0) {
                this.K = 1;
                int[] iArrK = k(this.L, 1);
                this.L = iArrK;
                iArrK[0] = (i11 - this.N) - 3;
            } else {
                int i17 = 4;
                v(hVar, 4);
                int i18 = (this.f72566g.f53154a[3] & 255) + 1;
                this.K = i18;
                int[] iArrK2 = k(this.L, i18);
                this.L = iArrK2;
                if (i16 == 2) {
                    int i19 = (i11 - this.N) - 4;
                    int i20 = this.K;
                    Arrays.fill(iArrK2, 0, i20, i19 / i20);
                } else if (i16 == 1) {
                    int i21 = 0;
                    int i22 = 0;
                    while (true) {
                        i13 = this.K;
                        if (i21 >= i13 - 1) {
                            break;
                        }
                        this.L[i21] = 0;
                        do {
                            i17++;
                            v(hVar, i17);
                            i14 = this.f72566g.f53154a[i17 - 1] & 255;
                            int[] iArr = this.L;
                            i15 = iArr[i21] + i14;
                            iArr[i21] = i15;
                        } while (i14 == 255);
                        i22 += i15;
                        i21++;
                    }
                    this.L[i13 - 1] = ((i11 - this.N) - i17) - i22;
                } else {
                    if (i16 != 3) {
                        throw new ParserException("Unexpected lacing value: " + i16);
                    }
                    int i23 = 0;
                    int i24 = 0;
                    while (true) {
                        int i25 = this.K;
                        if (i23 >= i25 - 1) {
                            this.L[i25 - 1] = ((i11 - this.N) - i17) - i24;
                            break;
                        }
                        this.L[i23] = 0;
                        i17++;
                        v(hVar, i17);
                        int i26 = i17 - 1;
                        if (this.f72566g.f53154a[i26] == 0) {
                            throw new ParserException("No valid varint length mask found");
                        }
                        long j10 = 0;
                        for (int i27 = 0; i27 < 8; i27++) {
                            int i28 = 1 << (7 - i27);
                            if ((this.f72566g.f53154a[i26] & i28) != 0) {
                                i17 += i27;
                                v(hVar, i17);
                                long j11 = (~i28) & this.f72566g.f53154a[i26] & 255;
                                int i29 = i26 + 1;
                                while (true) {
                                    j10 = j11;
                                    if (i29 >= i17) {
                                        break;
                                    }
                                    j11 = ((long) (this.f72566g.f53154a[i29] & 255)) | (j10 << 8);
                                    i29++;
                                }
                                if (i23 <= 0) {
                                    break;
                                }
                                j10 -= (1 << ((i27 * 7) + 6)) - 1;
                                break;
                            }
                        }
                        long j12 = j10;
                        if (j12 < -2147483648L || j12 > 2147483647L) {
                            throw new ParserException("EBML lacing sample size out of range.");
                        }
                        int i30 = (int) j12;
                        int[] iArr2 = this.L;
                        if (i23 != 0) {
                            i30 += iArr2[i23 - 1];
                        }
                        iArr2[i23] = i30;
                        i24 += i30;
                        i23++;
                    }
                }
            }
            byte[] bArr5 = this.f72566g.f53154a;
            this.H = this.B + x((bArr5[1] & 255) | (bArr5[0] << 8));
            byte b10 = this.f72566g.f53154a[2];
            this.O = ((cVar.f72590d == 2 || (i10 == 163 && (b10 & 128) == 128)) ? 1 : 0) | ((b10 & 8) == 8 ? Integer.MIN_VALUE : 0);
            this.G = 2;
            this.J = 0;
            i12 = 163;
        } else {
            i12 = 163;
        }
        if (i10 == i12) {
            while (true) {
                int i31 = this.J;
                if (i31 >= this.K) {
                    this.G = 0;
                    return;
                } else {
                    i(cVar, ((long) ((this.J * cVar.f72591e) / 1000)) + this.H, this.O, B(hVar, cVar, this.L[i31]), 0);
                    this.J++;
                }
            }
        } else {
            while (true) {
                int i32 = this.J;
                if (i32 >= this.K) {
                    return;
                }
                int[] iArr3 = this.L;
                iArr3[i32] = B(hVar, cVar, iArr3[i32]);
                this.J++;
            }
        }
    }

    public final s h() {
        n nVar;
        n nVar2;
        int i10;
        if (this.f72576q == -1 || this.f72579t == -9223372036854775807L || (nVar = this.C) == null || nVar.c() == 0 || (nVar2 = this.D) == null || nVar2.c() != this.C.c()) {
            this.C = null;
            this.D = null;
            return new s.b(this.f72579t);
        }
        int iC = this.C.c();
        int[] iArrCopyOf = new int[iC];
        long[] jArrCopyOf = new long[iC];
        long[] jArrCopyOf2 = new long[iC];
        long[] jArrCopyOf3 = new long[iC];
        int i11 = 0;
        for (int i12 = 0; i12 < iC; i12++) {
            jArrCopyOf3[i12] = this.C.b(i12);
            jArrCopyOf[i12] = this.f72576q + this.D.b(i12);
        }
        while (true) {
            i10 = iC - 1;
            if (i11 >= i10) {
                break;
            }
            int i13 = i11 + 1;
            iArrCopyOf[i11] = (int) (jArrCopyOf[i13] - jArrCopyOf[i11]);
            jArrCopyOf2[i11] = jArrCopyOf3[i13] - jArrCopyOf3[i11];
            i11 = i13;
        }
        iArrCopyOf[i10] = (int) ((this.f72576q + this.f72575p) - jArrCopyOf[i10]);
        long j10 = this.f72579t - jArrCopyOf3[i10];
        jArrCopyOf2[i10] = j10;
        if (j10 <= 0) {
            m.h("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j10);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i10);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i10);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i10);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i10);
        }
        this.C = null;
        this.D = null;
        return new q3.b(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    public final void i(c cVar, long j10, int i10, int i11, int i12) {
        d dVar = cVar.R;
        if (dVar != null) {
            dVar.c(cVar, j10, i10, i11, i12);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.f72588b) || "S_TEXT/ASS".equals(cVar.f72588b)) {
                if (this.K > 1) {
                    m.h("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        m.h("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        y(cVar.f72588b, j11, this.f72570k.f53154a);
                        u uVar = cVar.V;
                        t tVar = this.f72570k;
                        uVar.c(tVar, tVar.d());
                        i11 += this.f72570k.d();
                    }
                }
            }
            if ((268435456 & i10) != 0) {
                if (this.K > 1) {
                    i10 &= -268435457;
                } else {
                    int iD = this.f72573n.d();
                    cVar.V.c(this.f72573n, iD);
                    i11 += iD;
                }
            }
            cVar.V.d(j10, i10, i11, i12, cVar.f72595i);
        }
        this.F = true;
    }

    @CallSuper
    public void j(int i10) throws ParserException {
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            int i11 = 0;
            for (int i12 = 0; i12 < this.K; i12++) {
                i11 += this.L[i12];
            }
            c cVar = this.f72562c.get(this.M);
            for (int i13 = 0; i13 < this.K; i13++) {
                long j10 = ((long) ((cVar.f72591e * i13) / 1000)) + this.H;
                int i14 = this.O;
                if (i13 == 0 && !this.Q) {
                    i14 |= 1;
                }
                int i15 = this.L[i13];
                i11 -= i15;
                i(cVar, j10, i14, i15, i11);
            }
            this.G = 0;
            return;
        }
        if (i10 == 174) {
            if (r(this.f72580u.f72588b)) {
                c cVar2 = this.f72580u;
                cVar2.c(this.f72560a0, cVar2.f72589c);
                SparseArray<c> sparseArray = this.f72562c;
                c cVar3 = this.f72580u;
                sparseArray.put(cVar3.f72589c, cVar3);
            }
            this.f72580u = null;
            return;
        }
        if (i10 == 19899) {
            int i16 = this.f72582w;
            if (i16 != -1) {
                long j11 = this.f72583x;
                if (j11 != -1) {
                    if (i16 == 475249515) {
                        this.f72585z = j11;
                        return;
                    }
                    return;
                }
            }
            throw new ParserException("Mandatory element SeekID or SeekPosition not found");
        }
        if (i10 == 25152) {
            c cVar4 = this.f72580u;
            if (cVar4.f72593g) {
                if (cVar4.f72595i == null) {
                    throw new ParserException("Encrypted Track found but ContentEncKeyID was not found");
                }
                cVar4.f72597k = new DrmInitData(new DrmInitData.SchemeData(k3.k.f62189a, "video/webm", this.f72580u.f72595i.f66486b));
                return;
            }
            return;
        }
        if (i10 == 28032) {
            c cVar5 = this.f72580u;
            if (cVar5.f72593g && cVar5.f72594h != null) {
                throw new ParserException("Combining encryption and compression is not supported");
            }
            return;
        }
        if (i10 == 357149030) {
            if (this.f72577r == -9223372036854775807L) {
                this.f72577r = 1000000L;
            }
            long j12 = this.f72578s;
            if (j12 != -9223372036854775807L) {
                this.f72579t = x(j12);
                return;
            }
            return;
        }
        if (i10 == 374648427) {
            if (this.f72562c.size() == 0) {
                throw new ParserException("No valid tracks were found");
            }
            this.f72560a0.endTracks();
        } else if (i10 == 475249515 && !this.f72581v) {
            this.f72560a0.e(h());
            this.f72581v = true;
        }
    }

    public final int l() {
        int i10 = this.S;
        w();
        return i10;
    }

    @CallSuper
    public void m(int i10, double d10) throws ParserException {
        if (i10 == 181) {
            this.f72580u.O = (int) d10;
        }
        if (i10 == 17545) {
            this.f72578s = (long) d10;
            return;
        }
        switch (i10) {
            case 21969:
                this.f72580u.C = (float) d10;
                break;
            case 21970:
                this.f72580u.D = (float) d10;
                break;
            case 21971:
                this.f72580u.E = (float) d10;
                break;
            case 21972:
                this.f72580u.F = (float) d10;
                break;
            case 21973:
                this.f72580u.G = (float) d10;
                break;
            case 21974:
                this.f72580u.H = (float) d10;
                break;
            case 21975:
                this.f72580u.I = (float) d10;
                break;
            case 21976:
                this.f72580u.J = (float) d10;
                break;
            case 21977:
                this.f72580u.K = (float) d10;
                break;
            case 21978:
                this.f72580u.L = (float) d10;
                break;
            default:
                switch (i10) {
                    case 30323:
                        this.f72580u.f72604r = (float) d10;
                        break;
                    case 30324:
                        this.f72580u.f72605s = (float) d10;
                        break;
                    case 30325:
                        this.f72580u.f72606t = (float) d10;
                        break;
                }
                break;
        }
    }

    @CallSuper
    public void q(int i10, long j10) throws ParserException {
        if (i10 == 20529) {
            if (j10 == 0) {
                return;
            }
            throw new ParserException("ContentEncodingOrder " + j10 + " not supported");
        }
        if (i10 == 20530) {
            if (j10 == 1) {
                return;
            }
            throw new ParserException("ContentEncodingScope " + j10 + " not supported");
        }
        switch (i10) {
            case MRAID_JS_WRITE_FAILED_VALUE:
                this.f72580u.f72590d = (int) j10;
                return;
            case 136:
                this.f72580u.T = j10 == 1;
                return;
            case 155:
                this.I = x(j10);
                return;
            case 159:
                this.f72580u.M = (int) j10;
                return;
            case 176:
                this.f72580u.f72598l = (int) j10;
                return;
            case 179:
                this.C.a(x(j10));
                return;
            case 186:
                this.f72580u.f72599m = (int) j10;
                return;
            case AD_RESPONSE_EMPTY_VALUE:
                this.f72580u.f72589c = (int) j10;
                return;
            case 231:
                this.B = x(j10);
                return;
            case 238:
                this.P = (int) j10;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                this.D.a(j10);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16980:
                if (j10 == 3) {
                    return;
                }
                throw new ParserException("ContentCompAlgo " + j10 + " not supported");
            case 17029:
                if (j10 < 1 || j10 > 2) {
                    throw new ParserException("DocTypeReadVersion " + j10 + " not supported");
                }
                return;
            case 17143:
                if (j10 == 1) {
                    return;
                }
                throw new ParserException("EBMLReadVersion " + j10 + " not supported");
            case 18401:
                if (j10 == 5) {
                    return;
                }
                throw new ParserException("ContentEncAlgo " + j10 + " not supported");
            case 18408:
                if (j10 == 1) {
                    return;
                }
                throw new ParserException("AESSettingsCipherMode " + j10 + " not supported");
            case 21420:
                this.f72583x = j10 + this.f72576q;
                return;
            case 21432:
                int i11 = (int) j10;
                if (i11 == 0) {
                    this.f72580u.f72608v = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f72580u.f72608v = 2;
                    return;
                } else if (i11 == 3) {
                    this.f72580u.f72608v = 1;
                    return;
                } else {
                    if (i11 != 15) {
                        return;
                    }
                    this.f72580u.f72608v = 3;
                    return;
                }
            case 21680:
                this.f72580u.f72600n = (int) j10;
                return;
            case 21682:
                this.f72580u.f72602p = (int) j10;
                return;
            case 21690:
                this.f72580u.f72601o = (int) j10;
                return;
            case 21930:
                this.f72580u.S = j10 == 1;
                return;
            case 21998:
                this.f72580u.f72592f = (int) j10;
                return;
            case 22186:
                this.f72580u.P = j10;
                return;
            case 22203:
                this.f72580u.Q = j10;
                return;
            case 25188:
                this.f72580u.N = (int) j10;
                return;
            case 30321:
                int i12 = (int) j10;
                if (i12 == 0) {
                    this.f72580u.f72603q = 0;
                    return;
                }
                if (i12 == 1) {
                    this.f72580u.f72603q = 1;
                    return;
                } else if (i12 == 2) {
                    this.f72580u.f72603q = 2;
                    return;
                } else {
                    if (i12 != 3) {
                        return;
                    }
                    this.f72580u.f72603q = 3;
                    return;
                }
            case 2352003:
                this.f72580u.f72591e = (int) j10;
                return;
            case 2807729:
                this.f72577r = j10;
                return;
            default:
                switch (i10) {
                    case 21945:
                        int i13 = (int) j10;
                        if (i13 == 1) {
                            this.f72580u.f72612z = 2;
                            return;
                        } else {
                            if (i13 != 2) {
                                return;
                            }
                            this.f72580u.f72612z = 1;
                            return;
                        }
                    case 21946:
                        int i14 = (int) j10;
                        if (i14 != 1) {
                            if (i14 == 16) {
                                this.f72580u.f72611y = 6;
                                return;
                            } else if (i14 == 18) {
                                this.f72580u.f72611y = 7;
                                return;
                            } else if (i14 != 6 && i14 != 7) {
                                return;
                            }
                        }
                        this.f72580u.f72611y = 3;
                        return;
                    case 21947:
                        c cVar = this.f72580u;
                        cVar.f72609w = true;
                        int i15 = (int) j10;
                        if (i15 == 1) {
                            cVar.f72610x = 1;
                            return;
                        }
                        if (i15 == 9) {
                            cVar.f72610x = 6;
                            return;
                        } else {
                            if (i15 == 4 || i15 == 5 || i15 == 6 || i15 == 7) {
                                cVar.f72610x = 2;
                                return;
                            }
                            return;
                        }
                    case 21948:
                        this.f72580u.A = (int) j10;
                        return;
                    case 21949:
                        this.f72580u.B = (int) j10;
                        return;
                    default:
                        return;
                }
        }
    }

    public final boolean u(r rVar, long j10) {
        if (this.f72584y) {
            this.A = j10;
            rVar.f66477a = this.f72585z;
            this.f72584y = false;
            return true;
        }
        if (this.f72581v) {
            long j11 = this.A;
            if (j11 != -1) {
                rVar.f66477a = j11;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    public final void v(h hVar, int i10) throws InterruptedException, IOException {
        if (this.f72566g.d() >= i10) {
            return;
        }
        if (this.f72566g.b() < i10) {
            t tVar = this.f72566g;
            byte[] bArr = tVar.f53154a;
            tVar.J(Arrays.copyOf(bArr, Math.max(bArr.length * 2, i10)), this.f72566g.d());
        }
        t tVar2 = this.f72566g;
        hVar.readFully(tVar2.f53154a, tVar2.d(), i10 - this.f72566g.d());
        this.f72566g.K(i10);
    }

    public final long x(long j10) throws ParserException {
        long j11 = this.f72577r;
        if (j11 != -9223372036854775807L) {
            return k0.y0(j10, j11, 1000L);
        }
        throw new ParserException("Can't scale timecode prior to timecodeScale being set.");
    }

    @CallSuper
    public void z(int i10, long j10, long j11) throws ParserException {
        if (i10 == 160) {
            this.Q = false;
            return;
        }
        if (i10 == 174) {
            this.f72580u = new c();
            return;
        }
        if (i10 == 187) {
            this.E = false;
            return;
        }
        if (i10 == 19899) {
            this.f72582w = -1;
            this.f72583x = -1L;
            return;
        }
        if (i10 == 20533) {
            this.f72580u.f72593g = true;
            return;
        }
        if (i10 == 21968) {
            this.f72580u.f72609w = true;
            return;
        }
        if (i10 == 408125543) {
            long j12 = this.f72576q;
            if (j12 != -1 && j12 != j10) {
                throw new ParserException("Multiple Segment elements not supported");
            }
            this.f72576q = j10;
            this.f72575p = j11;
            return;
        }
        if (i10 == 475249515) {
            this.C = new n();
            this.D = new n();
        } else if (i10 == 524531317 && !this.f72581v) {
            if (this.f72563d && this.f72585z != -1) {
                this.f72584y = true;
            } else {
                this.f72560a0.e(new s.b(this.f72579t));
                this.f72581v = true;
            }
        }
    }

    public e(u3.c cVar, int i10) {
        this.f72576q = -1L;
        this.f72577r = -9223372036854775807L;
        this.f72578s = -9223372036854775807L;
        this.f72579t = -9223372036854775807L;
        this.f72585z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f72559a = cVar;
        cVar.b(new b());
        this.f72563d = (i10 & 1) == 0;
        this.f72561b = new g();
        this.f72562c = new SparseArray<>();
        this.f72566g = new t(4);
        this.f72567h = new t(ByteBuffer.allocate(4).putInt(-1).array());
        this.f72568i = new t(4);
        this.f72564e = new t(q.f53130a);
        this.f72565f = new t(4);
        this.f72569j = new t();
        this.f72570k = new t();
        this.f72571l = new t(8);
        this.f72572m = new t();
        this.f72573n = new t();
    }

    public static void y(String str, long j10, byte[] bArr) {
        byte[] bArrN;
        int i10;
        str.hashCode();
        if (!str.equals("S_TEXT/ASS")) {
            if (str.equals("S_TEXT/UTF8")) {
                bArrN = n(j10, "%02d:%02d:%02d,%03d", 1000L);
                i10 = 19;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            bArrN = n(j10, "%01d:%02d:%02d:%02d", 10000L);
            i10 = 21;
        }
        System.arraycopy(bArrN, 0, bArr, i10, bArrN.length);
    }

    public static byte[] n(long j10, String str, long j11) {
        boolean z10;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        g5.a.a(z10);
        int i10 = (int) (j10 / 3600000000L);
        long j12 = j10 - (((long) (i10 * 3600)) * 1000000);
        int i11 = (int) (j12 / 60000000);
        long j13 = j12 - (((long) (i11 * 60)) * 1000000);
        int i12 = (int) (j13 / 1000000);
        return k0.c0(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
    }

    @Override // q3.g
    @CallSuper
    public void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        this.f72559a.reset();
        this.f72561b.e();
        w();
        for (int i10 = 0; i10 < this.f72562c.size(); i10++) {
            this.f72562c.valueAt(i10).h();
        }
    }
}
