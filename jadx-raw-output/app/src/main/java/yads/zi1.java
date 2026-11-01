package yads;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import yads.mq0;
import yads.zi1;

/* JADX INFO: loaded from: classes2.dex */
public final class zi1 implements mq0 {

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final byte[] f85404c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final byte[] f85405d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final byte[] f85406e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final byte[] f85407f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public static final UUID f85408g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final Map f85409h0;
    public long A;
    public long B;
    public kh1 C;
    public kh1 D;
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
    public long R;
    public int S;
    public int T;
    public int U;
    public boolean V;
    public boolean W;
    public boolean X;
    public int Y;
    public byte Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tl0 f85410a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f85411a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wb3 f85412b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public pq0 f85413b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseArray f85414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f85415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final jb2 f85416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jb2 f85417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f85418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jb2 f85419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jb2 f85420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final jb2 f85421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final jb2 f85422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final jb2 f85423l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final jb2 f85424m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final jb2 f85425n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ByteBuffer f85426o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f85427p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f85428q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f85429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f85430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f85431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public yi1 f85432u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f85433v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f85434w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f85435x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f85436y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public long f85437z;

    public zi1() {
        this(new jd0(), 0);
    }

    public final void a(int i10) {
        if (this.f85432u != null) {
            return;
        }
        throw new ob2("Element " + i10 + " must be in a TrackEntry", null, true, 1);
    }

    /* JADX WARN: Code duplicated, block: B:356:0x0507  */
    /* JADX WARN: Code duplicated, block: B:505:0x0866  */
    /* JADX WARN: Code duplicated, block: B:510:0x087d  */
    /* JADX WARN: Code duplicated, block: B:511:0x087f  */
    /* JADX WARN: Code duplicated, block: B:514:0x0892  */
    /* JADX WARN: Code duplicated, block: B:515:0x089f  */
    /* JADX WARN: Code duplicated, block: B:517:0x08ab  */
    /* JADX WARN: Code duplicated, block: B:519:0x08af  */
    /* JADX WARN: Code duplicated, block: B:521:0x08b4  */
    /* JADX WARN: Code duplicated, block: B:524:0x08bc  */
    /* JADX WARN: Code duplicated, block: B:526:0x08c1  */
    /* JADX WARN: Code duplicated, block: B:529:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:532:0x08d6  */
    /* JADX WARN: Code duplicated, block: B:535:0x08db  */
    /* JADX WARN: Code duplicated, block: B:537:0x08e1  */
    /* JADX WARN: Code duplicated, block: B:557:0x09a7  */
    /* JADX WARN: Code duplicated, block: B:559:0x09b4  */
    /* JADX WARN: Code duplicated, block: B:562:0x09b9  */
    /* JADX WARN: Code duplicated, block: B:564:0x09c1  */
    /* JADX WARN: Code duplicated, block: B:565:0x09ce  */
    /* JADX WARN: Code duplicated, block: B:568:0x09d3  */
    /* JADX WARN: Code duplicated, block: B:574:0x09ee  */
    /* JADX WARN: Code duplicated, block: B:575:0x09f0  */
    /* JADX WARN: Code duplicated, block: B:577:0x09fa  */
    /* JADX WARN: Code duplicated, block: B:578:0x09fd  */
    /* JADX WARN: Code duplicated, block: B:580:0x0a07  */
    /* JADX WARN: Code duplicated, block: B:586:0x0a1f  */
    /* JADX WARN: Code duplicated, block: B:588:0x0a39  */
    /* JADX WARN: Code duplicated, block: B:590:0x0a41  */
    /* JADX WARN: Code duplicated, block: B:605:0x0a78  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Type inference failed for: r2v0, types: [yads.pq0] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [boolean, int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(int i10) {
        List listSingletonList;
        String str;
        int i11;
        List list;
        Pair pair;
        List listSingletonList2;
        String str2;
        List list2;
        List list3;
        List listA;
        List list4;
        byte[] bArr;
        String str3;
        int i12;
        lx0 lx0Var;
        int i13;
        int i14;
        float f10;
        mx mxVar;
        String str4;
        int iIntValue;
        Map map;
        byte[] bArr2;
        int i15;
        int i16;
        int i17;
        String str5;
        yi1 yi1Var;
        dj0 dj0VarA;
        ArrayList arrayList;
        vw2 uw2Var;
        int i18;
        int i19;
        ?? r10 = this.f85413b0;
        if (r10 == 0) {
            throw new IllegalStateException();
        }
        if (i10 == 160) {
            if (this.G != 2) {
                return;
            }
            yi1 yi1Var2 = (yi1) this.f85414c.get(this.M);
            yi1Var2.X.getClass();
            if (this.R > 0 && "A_OPUS".equals(yi1Var2.f84974b)) {
                this.f85425n.a(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.R).array());
            }
            int i20 = 0;
            for (int i21 = 0; i21 < this.K; i21++) {
                i20 += this.L[i21];
            }
            int i22 = 0;
            while (i22 < this.K) {
                long j10 = this.H + ((long) ((yi1Var2.f84977e * i22) / 1000));
                int i23 = this.O;
                if (i22 == 0 && !this.Q) {
                    i23 |= 1;
                }
                int i24 = this.L[i22];
                int i25 = i20 - i24;
                a(yi1Var2, j10, i23, i24, i25);
                i22++;
                i20 = i25;
            }
            this.G = 0;
            return;
        }
        byte b10 = -1;
        if (i10 != 174) {
            if (i10 == 19899) {
                int i26 = this.f85434w;
                if (i26 != -1) {
                    long j11 = this.f85435x;
                    if (j11 != -1) {
                        if (i26 == 475249515) {
                            this.f85437z = j11;
                            return;
                        }
                        return;
                    }
                }
                throw new ob2("Mandatory element SeekID or SeekPosition not found", null, true, 1);
            }
            if (i10 == 25152) {
                a(i10);
                yi1 yi1Var3 = this.f85432u;
                if (yi1Var3.f84980h) {
                    l73 l73Var = yi1Var3.f84982j;
                    if (l73Var == null) {
                        throw new ob2("Encrypted Track found but ContentEncKeyID was not found", null, true, 1);
                    }
                    yi1Var3.f84984l = new kk0(null, true, new jk0(jr.f79149a, null, "video/webm", l73Var.f79726b));
                    return;
                }
                return;
            }
            if (i10 == 28032) {
                a(i10);
                yi1 yi1Var4 = this.f85432u;
                if (yi1Var4.f84980h && yi1Var4.f84981i != null) {
                    throw new ob2("Combining encryption and compression is not supported", null, true, 1);
                }
                return;
            }
            if (i10 == 357149030) {
                if (this.f85429r == -9223372036854775807L) {
                    this.f85429r = 1000000L;
                }
                long j12 = this.f85430s;
                if (j12 != -9223372036854775807L) {
                    this.f85431t = a(j12);
                    return;
                }
                return;
            }
            if (i10 == 374648427) {
                if (this.f85414c.size() == 0) {
                    throw new ob2("No valid tracks were found", null, true, 1);
                }
                this.f85413b0.a();
                return;
            }
            if (i10 != 475249515) {
                return;
            }
            if (!this.f85433v) {
                kh1 kh1Var = this.C;
                kh1 kh1Var2 = this.D;
                if (this.f85428q == -1 || this.f85431t == -9223372036854775807L || kh1Var == null || (i18 = kh1Var.f79412a) == 0 || kh1Var2 == null || kh1Var2.f79412a != i18) {
                    uw2Var = new uw2(this.f85431t, 0L);
                } else {
                    int[] iArrCopyOf = new int[i18];
                    long[] jArrCopyOf = new long[i18];
                    long[] jArrCopyOf2 = new long[i18];
                    long[] jArrCopyOf3 = new long[i18];
                    for (int i27 = 0; i27 < i18; i27++) {
                        jArrCopyOf3[i27] = kh1Var.a(i27);
                        jArrCopyOf[i27] = kh1Var2.a(i27) + this.f85428q;
                    }
                    int i28 = 0;
                    while (true) {
                        i19 = i18 - 1;
                        if (i28 >= i19) {
                            break;
                        }
                        int i29 = i28 + 1;
                        iArrCopyOf[i28] = (int) (jArrCopyOf[i29] - jArrCopyOf[i28]);
                        jArrCopyOf2[i28] = jArrCopyOf3[i29] - jArrCopyOf3[i28];
                        i28 = i29;
                    }
                    iArrCopyOf[i19] = (int) ((this.f85428q + this.f85427p) - jArrCopyOf[i19]);
                    long j13 = this.f85431t - jArrCopyOf3[i19];
                    jArrCopyOf2[i19] = j13;
                    if (j13 <= 0) {
                        ih1.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j13);
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i19);
                        jArrCopyOf = Arrays.copyOf(jArrCopyOf, i19);
                        jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i19);
                        jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i19);
                    }
                    uw2Var = new hu(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
                }
                r10.a(uw2Var);
                this.f85433v = true;
            }
            this.C = null;
            this.D = null;
            return;
        }
        yi1 yi1Var5 = this.f85432u;
        if (yi1Var5 == null) {
            throw new IllegalStateException();
        }
        String str6 = yi1Var5.f84974b;
        if (str6 == null) {
            throw new ob2("CodecId is missing in TrackEntry element", null, true, 1);
        }
        int iB = 4;
        int i30 = 3;
        switch (str6) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                int i31 = yi1Var5.f84975c;
                switch (str6.hashCode()) {
                    case -2095576542:
                        if (str6.equals("V_MPEG4/ISO/AP")) {
                            b10 = 0;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -2095575984:
                        if (str6.equals("V_MPEG4/ISO/SP")) {
                            b10 = 1;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1985379776:
                        if (str6.equals("A_MS/ACM")) {
                            b10 = 2;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1784763192:
                        if (str6.equals("A_TRUEHD")) {
                            b10 = 3;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1730367663:
                        if (str6.equals("A_VORBIS")) {
                            b10 = 4;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1482641358:
                        if (str6.equals("A_MPEG/L2")) {
                            b10 = 5;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1482641357:
                        if (str6.equals("A_MPEG/L3")) {
                            b10 = 6;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -1373388978:
                        if (str6.equals("V_MS/VFW/FOURCC")) {
                            b10 = 7;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -933872740:
                        if (str6.equals("S_DVBSUB")) {
                            b10 = 8;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -538363189:
                        if (str6.equals("V_MPEG4/ISO/ASP")) {
                            b10 = 9;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -538363109:
                        if (str6.equals("V_MPEG4/ISO/AVC")) {
                            b10 = 10;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -425012669:
                        if (str6.equals("S_VOBSUB")) {
                            b10 = 11;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case -356037306:
                        if (str6.equals("A_DTS/LOSSLESS")) {
                            b10 = 12;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 62923557:
                        if (str6.equals("A_AAC")) {
                            b10 = 13;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 62923603:
                        if (str6.equals("A_AC3")) {
                            b10 = 14;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 62927045:
                        if (str6.equals("A_DTS")) {
                            b10 = 15;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 82318131:
                        if (str6.equals("V_AV1")) {
                            b10 = 16;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 82338133:
                        if (str6.equals("V_VP8")) {
                            b10 = 17;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 82338134:
                        if (str6.equals("V_VP9")) {
                            b10 = 18;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 99146302:
                        if (str6.equals("S_HDMV/PGS")) {
                            b10 = 19;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 444813526:
                        if (str6.equals("V_THEORA")) {
                            b10 = 20;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 542569478:
                        if (str6.equals("A_DTS/EXPRESS")) {
                            b10 = 21;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 635596514:
                        if (str6.equals("A_PCM/FLOAT/IEEE")) {
                            b10 = 22;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 725948237:
                        if (str6.equals("A_PCM/INT/BIG")) {
                            b10 = 23;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 725957860:
                        if (str6.equals("A_PCM/INT/LIT")) {
                            b10 = 24;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 738597099:
                        if (str6.equals("S_TEXT/ASS")) {
                            b10 = 25;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 855502857:
                        if (str6.equals("V_MPEGH/ISO/HEVC")) {
                            b10 = 26;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1045209816:
                        if (str6.equals("S_TEXT/WEBVTT")) {
                            b10 = 27;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1422270023:
                        if (str6.equals("S_TEXT/UTF8")) {
                            b10 = 28;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1809237540:
                        if (str6.equals("V_MPEG2")) {
                            b10 = 29;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1950749482:
                        if (str6.equals("A_EAC3")) {
                            b10 = 30;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1950789798:
                        if (str6.equals("A_FLAC")) {
                            b10 = 31;
                        } else {
                            b10 = -1;
                        }
                        break;
                    case 1951062397:
                        if (str6.equals("A_OPUS")) {
                            b10 = 32;
                        } else {
                            b10 = -1;
                        }
                        break;
                }
                String str7 = "audio/raw";
                switch (b10) {
                    case 0:
                    case 1:
                    case 9:
                        byte[] bArr3 = yi1Var5.f84983k;
                        if (bArr3 == null) {
                            str = null;
                            listSingletonList = null;
                        } else {
                            listSingletonList = Collections.singletonList(bArr3);
                            str = null;
                        }
                        str7 = "video/mp4v-es";
                        list3 = listSingletonList;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null && (dj0VarA = dj0.a(new jb2(bArr))) != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z10 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i32 = (z10 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13 || (i15 = yi1Var5.f84988p) == i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = (yi1Var5.f84986n * i14) / (yi1Var5.f84985m * i15);
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f || yi1Var5.E == -1.0f || yi1Var5.F == -1.0f || yi1Var5.G == -1.0f || yi1Var5.H == -1.0f || yi1Var5.I == -1.0f || yi1Var5.J == -1.0f || yi1Var5.K == -1.0f || yi1Var5.L == -1.0f || yi1Var5.M == -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = new byte[25];
                                    ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr2).order(ByteOrder.LITTLE_ENDIAN);
                                    byteBufferOrder.put((byte) 0);
                                    byteBufferOrder.putShort((short) ((yi1Var5.D * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.E * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.F * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.G * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.H * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.I * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.J * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) ((yi1Var5.K * 50000.0f) + 0.5f));
                                    byteBufferOrder.putShort((short) (yi1Var5.L + 0.5f));
                                    byteBufferOrder.putShort((short) (yi1Var5.M + 0.5f));
                                    byteBufferOrder.putShort((short) yi1Var5.B);
                                    byteBufferOrder.putShort((short) yi1Var5.C);
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0 && Float.compare(yi1Var5.f84991s, 0.0f) == 0 && Float.compare(yi1Var5.f84992t, 0.0f) == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0 || Float.compare(yi1Var5.f84992t, 180.0f) == 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else if (Float.compare(yi1Var5.f84992t, -90.0f) == 0) {
                                    iIntValue = 270;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null && !f85409h0.containsKey(str5)) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i32;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var = new mx0(lx0Var);
                        m73 m73VarA = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA;
                        m73VarA.a(mx0Var);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 2:
                        jb2 jb2Var = new jb2(yi1Var5.a(str6));
                        try {
                            int iH = jb2Var.h();
                            if (iH != 1) {
                                if (iH == 65534) {
                                    jb2Var.e(24);
                                    long jI = jb2Var.i();
                                    UUID uuid = f85408g0;
                                    if (jI != uuid.getMostSignificantBits() || jb2Var.i() != uuid.getLeastSignificantBits()) {
                                    }
                                    str = null;
                                    list3 = null;
                                    str7 = "audio/x-unknown";
                                    i11 = -1;
                                    list = list3;
                                    iB = -1;
                                    list4 = list;
                                    bArr = yi1Var5.N;
                                    if (bArr != null) {
                                        str = dj0VarA.f76686a;
                                        str7 = "video/dolby-vision";
                                    }
                                    str3 = str7;
                                    boolean z11 = yi1Var5.V;
                                    if (yi1Var5.U) {
                                        i12 = 2;
                                    } else {
                                        i12 = 0;
                                    }
                                    int i33 = (z11 ? 1 : 0) | i12;
                                    lx0Var = new lx0();
                                    if ("audio".equals(ht1.c(str3))) {
                                        lx0Var.f79980x = yi1Var5.O;
                                        lx0Var.f79981y = yi1Var5.Q;
                                        lx0Var.f79982z = iB;
                                        i30 = 1;
                                    } else if ("video".equals(ht1.c(str3))) {
                                        if (yi1Var5.f84989q == 0) {
                                            i16 = yi1Var5.f84987o;
                                            i13 = -1;
                                            if (i16 == -1) {
                                                i16 = yi1Var5.f84985m;
                                            }
                                            yi1Var5.f84987o = i16;
                                            i17 = yi1Var5.f84988p;
                                            if (i17 == -1) {
                                                i17 = yi1Var5.f84986n;
                                            }
                                            yi1Var5.f84988p = i17;
                                        } else {
                                            i13 = -1;
                                        }
                                        i14 = yi1Var5.f84987o;
                                        if (i14 != i13) {
                                            f10 = -1.0f;
                                        } else {
                                            f10 = -1.0f;
                                        }
                                        if (yi1Var5.f84996x) {
                                            if (yi1Var5.D != -1.0f) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = null;
                                            }
                                            mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                        } else {
                                            mxVar = null;
                                        }
                                        str4 = yi1Var5.f84973a;
                                        if (str4 != null) {
                                            map = f85409h0;
                                            if (map.containsKey(str4)) {
                                                iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                            } else {
                                                iIntValue = -1;
                                            }
                                        } else {
                                            iIntValue = -1;
                                        }
                                        if (yi1Var5.f84990r == 0) {
                                            if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                                iIntValue = 0;
                                            } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                                iIntValue = 90;
                                            } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                            } else {
                                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                            }
                                        }
                                        lx0Var.f79972p = yi1Var5.f84985m;
                                        lx0Var.f79973q = yi1Var5.f84986n;
                                        lx0Var.f79976t = f10;
                                        lx0Var.f79975s = iIntValue;
                                        lx0Var.f79977u = yi1Var5.f84994v;
                                        lx0Var.f79978v = yi1Var5.f84995w;
                                        lx0Var.f79979w = mxVar;
                                        i30 = 2;
                                    } else if (!"application/x-subrip".equals(str3)) {
                                        throw new ob2("Unexpected MIME type.", null, true, 1);
                                    }
                                    str5 = yi1Var5.f84973a;
                                    if (str5 != null) {
                                        lx0Var.f79958b = yi1Var5.f84973a;
                                    }
                                    lx0Var.f79957a = Integer.toString(i31);
                                    lx0Var.f79967k = str3;
                                    lx0Var.f79968l = i11;
                                    lx0Var.f79959c = yi1Var5.W;
                                    lx0Var.f79960d = i33;
                                    lx0Var.f79969m = list4;
                                    lx0Var.f79964h = str;
                                    lx0Var.f79970n = yi1Var5.f84984l;
                                    mx0 mx0Var2 = new mx0(lx0Var);
                                    m73 m73VarA2 = r10.a(yi1Var5.f84975c, i30);
                                    yi1Var5.X = m73VarA2;
                                    m73VarA2.a(mx0Var2);
                                    this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                                    yi1Var = null;
                                }
                                ih1.d("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                                str = null;
                                list3 = null;
                                str7 = "audio/x-unknown";
                                i11 = -1;
                                list = list3;
                                iB = -1;
                                list4 = list;
                                bArr = yi1Var5.N;
                                if (bArr != null) {
                                    str = dj0VarA.f76686a;
                                    str7 = "video/dolby-vision";
                                }
                                str3 = str7;
                                boolean z12 = yi1Var5.V;
                                if (yi1Var5.U) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                int i34 = (z12 ? 1 : 0) | i12;
                                lx0Var = new lx0();
                                if ("audio".equals(ht1.c(str3))) {
                                    lx0Var.f79980x = yi1Var5.O;
                                    lx0Var.f79981y = yi1Var5.Q;
                                    lx0Var.f79982z = iB;
                                    i30 = 1;
                                } else if ("video".equals(ht1.c(str3))) {
                                    if (yi1Var5.f84989q == 0) {
                                        i16 = yi1Var5.f84987o;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = yi1Var5.f84985m;
                                        }
                                        yi1Var5.f84987o = i16;
                                        i17 = yi1Var5.f84988p;
                                        if (i17 == -1) {
                                            i17 = yi1Var5.f84986n;
                                        }
                                        yi1Var5.f84988p = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = yi1Var5.f84987o;
                                    if (i14 != i13) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (yi1Var5.f84996x) {
                                        if (yi1Var5.D != -1.0f) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = null;
                                        }
                                        mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                    } else {
                                        mxVar = null;
                                    }
                                    str4 = yi1Var5.f84973a;
                                    if (str4 != null) {
                                        map = f85409h0;
                                        if (map.containsKey(str4)) {
                                            iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                        } else {
                                            iIntValue = -1;
                                        }
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (yi1Var5.f84990r == 0) {
                                        if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                            iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                        } else {
                                            iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                        }
                                    }
                                    lx0Var.f79972p = yi1Var5.f84985m;
                                    lx0Var.f79973q = yi1Var5.f84986n;
                                    lx0Var.f79976t = f10;
                                    lx0Var.f79975s = iIntValue;
                                    lx0Var.f79977u = yi1Var5.f84994v;
                                    lx0Var.f79978v = yi1Var5.f84995w;
                                    lx0Var.f79979w = mxVar;
                                    i30 = 2;
                                } else if (!"application/x-subrip".equals(str3)) {
                                    throw new ob2("Unexpected MIME type.", null, true, 1);
                                }
                                str5 = yi1Var5.f84973a;
                                if (str5 != null) {
                                    lx0Var.f79958b = yi1Var5.f84973a;
                                }
                                lx0Var.f79957a = Integer.toString(i31);
                                lx0Var.f79967k = str3;
                                lx0Var.f79968l = i11;
                                lx0Var.f79959c = yi1Var5.W;
                                lx0Var.f79960d = i34;
                                lx0Var.f79969m = list4;
                                lx0Var.f79964h = str;
                                lx0Var.f79970n = yi1Var5.f84984l;
                                mx0 mx0Var3 = new mx0(lx0Var);
                                m73 m73VarA3 = r10.a(yi1Var5.f84975c, i30);
                                yi1Var5.X = m73VarA3;
                                m73VarA3.a(mx0Var3);
                                this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                                yi1Var = null;
                                break;
                            }
                            iB = ib3.b(yi1Var5.P);
                            if (iB == 0) {
                                ih1.d("MatroskaExtractor", "Unsupported PCM bit depth: " + yi1Var5.P + ". Setting mimeType to audio/x-unknown");
                                str = null;
                                list3 = null;
                                str7 = "audio/x-unknown";
                                i11 = -1;
                                list = list3;
                                iB = -1;
                                list4 = list;
                                bArr = yi1Var5.N;
                                if (bArr != null) {
                                    str = dj0VarA.f76686a;
                                    str7 = "video/dolby-vision";
                                }
                                str3 = str7;
                                boolean z13 = yi1Var5.V;
                                if (yi1Var5.U) {
                                    i12 = 2;
                                } else {
                                    i12 = 0;
                                }
                                int i35 = (z13 ? 1 : 0) | i12;
                                lx0Var = new lx0();
                                if ("audio".equals(ht1.c(str3))) {
                                    lx0Var.f79980x = yi1Var5.O;
                                    lx0Var.f79981y = yi1Var5.Q;
                                    lx0Var.f79982z = iB;
                                    i30 = 1;
                                } else if ("video".equals(ht1.c(str3))) {
                                    if (yi1Var5.f84989q == 0) {
                                        i16 = yi1Var5.f84987o;
                                        i13 = -1;
                                        if (i16 == -1) {
                                            i16 = yi1Var5.f84985m;
                                        }
                                        yi1Var5.f84987o = i16;
                                        i17 = yi1Var5.f84988p;
                                        if (i17 == -1) {
                                            i17 = yi1Var5.f84986n;
                                        }
                                        yi1Var5.f84988p = i17;
                                    } else {
                                        i13 = -1;
                                    }
                                    i14 = yi1Var5.f84987o;
                                    if (i14 != i13) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (yi1Var5.f84996x) {
                                        if (yi1Var5.D != -1.0f) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = null;
                                        }
                                        mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                    } else {
                                        mxVar = null;
                                    }
                                    str4 = yi1Var5.f84973a;
                                    if (str4 != null) {
                                        map = f85409h0;
                                        if (map.containsKey(str4)) {
                                            iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                        } else {
                                            iIntValue = -1;
                                        }
                                    } else {
                                        iIntValue = -1;
                                    }
                                    if (yi1Var5.f84990r == 0) {
                                        if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                            iIntValue = 0;
                                        } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                            iIntValue = 90;
                                        } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                            iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                        } else {
                                            iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                        }
                                    }
                                    lx0Var.f79972p = yi1Var5.f84985m;
                                    lx0Var.f79973q = yi1Var5.f84986n;
                                    lx0Var.f79976t = f10;
                                    lx0Var.f79975s = iIntValue;
                                    lx0Var.f79977u = yi1Var5.f84994v;
                                    lx0Var.f79978v = yi1Var5.f84995w;
                                    lx0Var.f79979w = mxVar;
                                    i30 = 2;
                                } else if (!"application/x-subrip".equals(str3)) {
                                    throw new ob2("Unexpected MIME type.", null, true, 1);
                                }
                                str5 = yi1Var5.f84973a;
                                if (str5 != null) {
                                    lx0Var.f79958b = yi1Var5.f84973a;
                                }
                                lx0Var.f79957a = Integer.toString(i31);
                                lx0Var.f79967k = str3;
                                lx0Var.f79968l = i11;
                                lx0Var.f79959c = yi1Var5.W;
                                lx0Var.f79960d = i35;
                                lx0Var.f79969m = list4;
                                lx0Var.f79964h = str;
                                lx0Var.f79970n = yi1Var5.f84984l;
                                mx0 mx0Var4 = new mx0(lx0Var);
                                m73 m73VarA4 = r10.a(yi1Var5.f84975c, i30);
                                yi1Var5.X = m73VarA4;
                                m73VarA4.a(mx0Var4);
                                this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                                yi1Var = null;
                            }
                            str = null;
                            list2 = null;
                            i11 = -1;
                            list4 = list2;
                            bArr = yi1Var5.N;
                            if (bArr != null) {
                                str = dj0VarA.f76686a;
                                str7 = "video/dolby-vision";
                            }
                            str3 = str7;
                            boolean z14 = yi1Var5.V;
                            if (yi1Var5.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i36 = (z14 ? 1 : 0) | i12;
                            lx0Var = new lx0();
                            if ("audio".equals(ht1.c(str3))) {
                                lx0Var.f79980x = yi1Var5.O;
                                lx0Var.f79981y = yi1Var5.Q;
                                lx0Var.f79982z = iB;
                                i30 = 1;
                            } else if ("video".equals(ht1.c(str3))) {
                                if (yi1Var5.f84989q == 0) {
                                    i16 = yi1Var5.f84987o;
                                    i13 = -1;
                                    if (i16 == -1) {
                                        i16 = yi1Var5.f84985m;
                                    }
                                    yi1Var5.f84987o = i16;
                                    i17 = yi1Var5.f84988p;
                                    if (i17 == -1) {
                                        i17 = yi1Var5.f84986n;
                                    }
                                    yi1Var5.f84988p = i17;
                                } else {
                                    i13 = -1;
                                }
                                i14 = yi1Var5.f84987o;
                                if (i14 != i13) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (yi1Var5.f84996x) {
                                    if (yi1Var5.D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                str4 = yi1Var5.f84973a;
                                if (str4 != null) {
                                    map = f85409h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (yi1Var5.f84990r == 0) {
                                    if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                lx0Var.f79972p = yi1Var5.f84985m;
                                lx0Var.f79973q = yi1Var5.f84986n;
                                lx0Var.f79976t = f10;
                                lx0Var.f79975s = iIntValue;
                                lx0Var.f79977u = yi1Var5.f84994v;
                                lx0Var.f79978v = yi1Var5.f84995w;
                                lx0Var.f79979w = mxVar;
                                i30 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ob2("Unexpected MIME type.", null, true, 1);
                            }
                            str5 = yi1Var5.f84973a;
                            if (str5 != null) {
                                lx0Var.f79958b = yi1Var5.f84973a;
                            }
                            lx0Var.f79957a = Integer.toString(i31);
                            lx0Var.f79967k = str3;
                            lx0Var.f79968l = i11;
                            lx0Var.f79959c = yi1Var5.W;
                            lx0Var.f79960d = i36;
                            lx0Var.f79969m = list4;
                            lx0Var.f79964h = str;
                            lx0Var.f79970n = yi1Var5.f84984l;
                            mx0 mx0Var5 = new mx0(lx0Var);
                            m73 m73VarA5 = r10.a(yi1Var5.f84975c, i30);
                            yi1Var5.X = m73VarA5;
                            m73VarA5.a(mx0Var5);
                            this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                            yi1Var = null;
                        } catch (ArrayIndexOutOfBoundsException unused) {
                            throw new ob2("Error parsing MS/ACM codec private", null, true, 1);
                        }
                        break;
                    case 3:
                        yi1Var5.T = new z83();
                        str7 = "audio/true-hd";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z15 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i37 = (z15 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i37;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var6 = new mx0(lx0Var);
                        m73 m73VarA6 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA6;
                        m73VarA6.a(mx0Var6);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 4:
                        byte[] bArrA = yi1Var5.a(str6);
                        try {
                            try {
                                if (bArrA[0] != 2) {
                                    throw new ob2("Error parsing vorbis codec private", null, true, 1);
                                }
                                int i38 = 0;
                                int i39 = 1;
                                while (true) {
                                    int i40 = bArrA[i39] & 255;
                                    if (i40 == 255) {
                                        i38 += 255;
                                        i39++;
                                    } else {
                                        int i41 = i39 + 1;
                                        int i42 = i38 + i40;
                                        int i43 = 0;
                                        while (true) {
                                            int i44 = bArrA[i41] & 255;
                                            if (i44 == 255) {
                                                i43 += 255;
                                                i41++;
                                            } else {
                                                int i45 = i41 + 1;
                                                int i46 = i43 + i44;
                                                try {
                                                    if (bArrA[i45] != 1) {
                                                        throw new ob2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    byte[] bArr4 = new byte[i42];
                                                    System.arraycopy(bArrA, i45, bArr4, 0, i42);
                                                    int i47 = i45 + i42;
                                                    if (bArrA[i47] != 3) {
                                                        throw new ob2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    int i48 = i47 + i46;
                                                    if (bArrA[i48] != 5) {
                                                        throw new ob2("Error parsing vorbis codec private", null, true, 1);
                                                    }
                                                    byte[] bArr5 = new byte[bArrA.length - i48];
                                                    System.arraycopy(bArrA, i48, bArr5, 0, bArrA.length - i48);
                                                    ArrayList arrayList2 = new ArrayList(2);
                                                    arrayList2.add(bArr4);
                                                    arrayList2.add(bArr5);
                                                    str7 = "audio/vorbis";
                                                    i11 = 8192;
                                                    arrayList = arrayList2;
                                                    str = null;
                                                    list = arrayList;
                                                    iB = -1;
                                                    list4 = list;
                                                    bArr = yi1Var5.N;
                                                    if (bArr != null) {
                                                        str = dj0VarA.f76686a;
                                                        str7 = "video/dolby-vision";
                                                    }
                                                    str3 = str7;
                                                    boolean z16 = yi1Var5.V;
                                                    if (yi1Var5.U) {
                                                        i12 = 2;
                                                    } else {
                                                        i12 = 0;
                                                    }
                                                    int i310 = (z16 ? 1 : 0) | i12;
                                                    lx0Var = new lx0();
                                                    if ("audio".equals(ht1.c(str3))) {
                                                        lx0Var.f79980x = yi1Var5.O;
                                                        lx0Var.f79981y = yi1Var5.Q;
                                                        lx0Var.f79982z = iB;
                                                        i30 = 1;
                                                    } else if ("video".equals(ht1.c(str3))) {
                                                        if (yi1Var5.f84989q == 0) {
                                                            i16 = yi1Var5.f84987o;
                                                            i13 = -1;
                                                            if (i16 == -1) {
                                                                i16 = yi1Var5.f84985m;
                                                            }
                                                            yi1Var5.f84987o = i16;
                                                            i17 = yi1Var5.f84988p;
                                                            if (i17 == -1) {
                                                                i17 = yi1Var5.f84986n;
                                                            }
                                                            yi1Var5.f84988p = i17;
                                                        } else {
                                                            i13 = -1;
                                                        }
                                                        i14 = yi1Var5.f84987o;
                                                        if (i14 != i13) {
                                                            f10 = -1.0f;
                                                        } else {
                                                            f10 = -1.0f;
                                                        }
                                                        if (yi1Var5.f84996x) {
                                                            if (yi1Var5.D != -1.0f) {
                                                                bArr2 = null;
                                                            } else {
                                                                bArr2 = null;
                                                            }
                                                            mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                                        } else {
                                                            mxVar = null;
                                                        }
                                                        str4 = yi1Var5.f84973a;
                                                        if (str4 != null) {
                                                            map = f85409h0;
                                                            if (map.containsKey(str4)) {
                                                                iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                                            } else {
                                                                iIntValue = -1;
                                                            }
                                                        } else {
                                                            iIntValue = -1;
                                                        }
                                                        if (yi1Var5.f84990r == 0) {
                                                            if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                                                iIntValue = 0;
                                                            } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                                                iIntValue = 90;
                                                            } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                                            } else {
                                                                iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                                            }
                                                        }
                                                        lx0Var.f79972p = yi1Var5.f84985m;
                                                        lx0Var.f79973q = yi1Var5.f84986n;
                                                        lx0Var.f79976t = f10;
                                                        lx0Var.f79975s = iIntValue;
                                                        lx0Var.f79977u = yi1Var5.f84994v;
                                                        lx0Var.f79978v = yi1Var5.f84995w;
                                                        lx0Var.f79979w = mxVar;
                                                        i30 = 2;
                                                    } else if (!"application/x-subrip".equals(str3)) {
                                                        throw new ob2("Unexpected MIME type.", null, true, 1);
                                                    }
                                                    str5 = yi1Var5.f84973a;
                                                    if (str5 != null) {
                                                        lx0Var.f79958b = yi1Var5.f84973a;
                                                    }
                                                    lx0Var.f79957a = Integer.toString(i31);
                                                    lx0Var.f79967k = str3;
                                                    lx0Var.f79968l = i11;
                                                    lx0Var.f79959c = yi1Var5.W;
                                                    lx0Var.f79960d = i310;
                                                    lx0Var.f79969m = list4;
                                                    lx0Var.f79964h = str;
                                                    lx0Var.f79970n = yi1Var5.f84984l;
                                                    mx0 mx0Var7 = new mx0(lx0Var);
                                                    m73 m73VarA7 = r10.a(yi1Var5.f84975c, i30);
                                                    yi1Var5.X = m73VarA7;
                                                    m73VarA7.a(mx0Var7);
                                                    this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                                                    yi1Var = null;
                                                } catch (ArrayIndexOutOfBoundsException unused2) {
                                                    r10 = 1;
                                                    throw new ob2("Error parsing vorbis codec private", null, r10, r10);
                                                }
                                            }
                                        }
                                    }
                                    break;
                                }
                            } catch (ArrayIndexOutOfBoundsException unused3) {
                            }
                        } catch (ArrayIndexOutOfBoundsException unused4) {
                            r10 = 1;
                        }
                        break;
                    case 5:
                        i11 = 4096;
                        str7 = "audio/mpeg-L2";
                        str = null;
                        list = null;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z17 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i311 = (z17 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i311;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var8 = new mx0(lx0Var);
                        m73 m73VarA8 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA8;
                        m73VarA8.a(mx0Var8);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 6:
                        i11 = 4096;
                        str7 = "audio/mpeg";
                        str = null;
                        list = null;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z18 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i312 = (z18 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i312;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var9 = new mx0(lx0Var);
                        m73 m73VarA9 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA9;
                        m73VarA9.a(mx0Var9);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 7:
                        byte[] bArrA2 = yi1Var5.a(str6);
                        try {
                            if (16 > bArrA2.length) {
                                throw new IllegalArgumentException();
                            }
                            long j14 = (((long) bArrA2[16]) & 255) | ((((long) bArrA2[17]) & 255) << 8) | ((((long) bArrA2[18]) & 255) << 16) | ((((long) bArrA2[19]) & 255) << 24);
                            if (j14 == 1482049860) {
                                pair = new Pair("video/divx", null);
                            } else if (j14 == 859189832) {
                                pair = new Pair("video/3gpp", null);
                            } else if (j14 == 826496599) {
                                int i49 = 40;
                                while (true) {
                                    if (i49 >= bArrA2.length - 4) {
                                        throw new ob2("Failed to find FourCC VC1 initialization data", null, true, 1);
                                    }
                                    if (bArrA2[i49] == 0 && bArrA2[i49 + 1] == 0 && bArrA2[i49 + 2] == 1 && bArrA2[i49 + 3] == 15) {
                                        pair = new Pair("video/wvc1", Collections.singletonList(Arrays.copyOfRange(bArrA2, i49, bArrA2.length)));
                                    } else {
                                        i49++;
                                    }
                                }
                            } else {
                                ih1.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                                pair = new Pair("video/x-unknown", null);
                            }
                            str7 = (String) pair.first;
                            listA = (List) pair.second;
                            list3 = listA;
                            str = null;
                            i11 = -1;
                            list = list3;
                            iB = -1;
                            list4 = list;
                            bArr = yi1Var5.N;
                            if (bArr != null) {
                                str = dj0VarA.f76686a;
                                str7 = "video/dolby-vision";
                            }
                            str3 = str7;
                            boolean z19 = yi1Var5.V;
                            if (yi1Var5.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i313 = (z19 ? 1 : 0) | i12;
                            lx0Var = new lx0();
                            if ("audio".equals(ht1.c(str3))) {
                                lx0Var.f79980x = yi1Var5.O;
                                lx0Var.f79981y = yi1Var5.Q;
                                lx0Var.f79982z = iB;
                                i30 = 1;
                            } else if ("video".equals(ht1.c(str3))) {
                                if (yi1Var5.f84989q == 0) {
                                    i16 = yi1Var5.f84987o;
                                    i13 = -1;
                                    if (i16 == -1) {
                                        i16 = yi1Var5.f84985m;
                                    }
                                    yi1Var5.f84987o = i16;
                                    i17 = yi1Var5.f84988p;
                                    if (i17 == -1) {
                                        i17 = yi1Var5.f84986n;
                                    }
                                    yi1Var5.f84988p = i17;
                                } else {
                                    i13 = -1;
                                }
                                i14 = yi1Var5.f84987o;
                                if (i14 != i13) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (yi1Var5.f84996x) {
                                    if (yi1Var5.D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                str4 = yi1Var5.f84973a;
                                if (str4 != null) {
                                    map = f85409h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (yi1Var5.f84990r == 0) {
                                    if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                lx0Var.f79972p = yi1Var5.f84985m;
                                lx0Var.f79973q = yi1Var5.f84986n;
                                lx0Var.f79976t = f10;
                                lx0Var.f79975s = iIntValue;
                                lx0Var.f79977u = yi1Var5.f84994v;
                                lx0Var.f79978v = yi1Var5.f84995w;
                                lx0Var.f79979w = mxVar;
                                i30 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ob2("Unexpected MIME type.", null, true, 1);
                            }
                            str5 = yi1Var5.f84973a;
                            if (str5 != null) {
                                lx0Var.f79958b = yi1Var5.f84973a;
                            }
                            lx0Var.f79957a = Integer.toString(i31);
                            lx0Var.f79967k = str3;
                            lx0Var.f79968l = i11;
                            lx0Var.f79959c = yi1Var5.W;
                            lx0Var.f79960d = i313;
                            lx0Var.f79969m = list4;
                            lx0Var.f79964h = str;
                            lx0Var.f79970n = yi1Var5.f84984l;
                            mx0 mx0Var10 = new mx0(lx0Var);
                            m73 m73VarA10 = r10.a(yi1Var5.f84975c, i30);
                            yi1Var5.X = m73VarA10;
                            m73VarA10.a(mx0Var10);
                            this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                            yi1Var = null;
                        } catch (ArrayIndexOutOfBoundsException unused5) {
                            throw new ob2("Error parsing FourCC private data", null, true, 1);
                        }
                        break;
                    case 8:
                        byte[] bArr6 = new byte[4];
                        System.arraycopy(yi1Var5.a(str6), 0, bArr6, 0, 4);
                        str7 = "application/dvbsubs";
                        listA = p51.a(bArr6);
                        list3 = listA;
                        str = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z110 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i314 = (z110 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i314;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var11 = new mx0(lx0Var);
                        m73 m73VarA11 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA11;
                        m73VarA11.a(mx0Var11);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 10:
                        ul ulVarA = ul.a(new jb2(yi1Var5.a(str6)));
                        listSingletonList2 = ulVarA.f83526a;
                        yi1Var5.Y = ulVarA.f83527b;
                        str2 = ulVarA.f83531f;
                        str7 = "video/avc";
                        list2 = listSingletonList2;
                        iB = -1;
                        str = str2;
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z111 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i315 = (z111 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i315;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var12 = new mx0(lx0Var);
                        m73 m73VarA12 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA12;
                        m73VarA12.a(mx0Var12);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 11:
                        str7 = "application/vobsub";
                        listA = p51.a(yi1Var5.a(str6));
                        list3 = listA;
                        str = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z112 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i316 = (z112 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i316;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var13 = new mx0(lx0Var);
                        m73 m73VarA13 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA13;
                        m73VarA13.a(mx0Var13);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 12:
                        str7 = "audio/vnd.dts.hd";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z113 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i317 = (z113 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i317;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var14 = new mx0(lx0Var);
                        m73 m73VarA14 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA14;
                        m73VarA14.a(mx0Var14);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 13:
                        listSingletonList2 = Collections.singletonList(yi1Var5.a(str6));
                        byte[] bArr7 = yi1Var5.f84983k;
                        a aVarA = b.a(new ib2(bArr7.length, bArr7), false);
                        yi1Var5.Q = aVarA.f75341a;
                        yi1Var5.O = aVarA.f75342b;
                        str2 = aVarA.f75343c;
                        str7 = "audio/mp4a-latm";
                        list2 = listSingletonList2;
                        iB = -1;
                        str = str2;
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z114 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i318 = (z114 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i318;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var15 = new mx0(lx0Var);
                        m73 m73VarA15 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA15;
                        m73VarA15.a(mx0Var15);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 14:
                        str7 = "audio/ac3";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z115 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i319 = (z115 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i319;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var16 = new mx0(lx0Var);
                        m73 m73VarA16 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA16;
                        m73VarA16.a(mx0Var16);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 15:
                    case 21:
                        str7 = "audio/vnd.dts";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z116 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3110 = (z116 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3110;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var17 = new mx0(lx0Var);
                        m73 m73VarA17 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA17;
                        m73VarA17.a(mx0Var17);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 16:
                        str7 = "video/av01";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z117 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3111 = (z117 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3111;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var18 = new mx0(lx0Var);
                        m73 m73VarA18 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA18;
                        m73VarA18.a(mx0Var18);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 17:
                        str7 = "video/x-vnd.on2.vp8";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z118 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3112 = (z118 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3112;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var19 = new mx0(lx0Var);
                        m73 m73VarA19 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA19;
                        m73VarA19.a(mx0Var19);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 18:
                        str7 = "video/x-vnd.on2.vp9";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z119 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3113 = (z119 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3113;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var110 = new mx0(lx0Var);
                        m73 m73VarA110 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA110;
                        m73VarA110.a(mx0Var110);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 19:
                        str7 = "application/pgs";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1110 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3114 = (z1110 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3114;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var111 = new mx0(lx0Var);
                        m73 m73VarA111 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA111;
                        m73VarA111.a(mx0Var111);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 20:
                        str7 = "video/x-unknown";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1111 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3115 = (z1111 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3115;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var112 = new mx0(lx0Var);
                        m73 m73VarA112 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA112;
                        m73VarA112.a(mx0Var112);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 22:
                        if (yi1Var5.P != 32) {
                            ih1.d("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + yi1Var5.P + ". Setting mimeType to audio/x-unknown");
                            str = null;
                            list3 = null;
                            str7 = "audio/x-unknown";
                            i11 = -1;
                            list = list3;
                            iB = -1;
                            list4 = list;
                            bArr = yi1Var5.N;
                            if (bArr != null) {
                                str = dj0VarA.f76686a;
                                str7 = "video/dolby-vision";
                            }
                            str3 = str7;
                            boolean z1112 = yi1Var5.V;
                            if (yi1Var5.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i3116 = (z1112 ? 1 : 0) | i12;
                            lx0Var = new lx0();
                            if ("audio".equals(ht1.c(str3))) {
                                lx0Var.f79980x = yi1Var5.O;
                                lx0Var.f79981y = yi1Var5.Q;
                                lx0Var.f79982z = iB;
                                i30 = 1;
                            } else if ("video".equals(ht1.c(str3))) {
                                if (yi1Var5.f84989q == 0) {
                                    i16 = yi1Var5.f84987o;
                                    i13 = -1;
                                    if (i16 == -1) {
                                        i16 = yi1Var5.f84985m;
                                    }
                                    yi1Var5.f84987o = i16;
                                    i17 = yi1Var5.f84988p;
                                    if (i17 == -1) {
                                        i17 = yi1Var5.f84986n;
                                    }
                                    yi1Var5.f84988p = i17;
                                } else {
                                    i13 = -1;
                                }
                                i14 = yi1Var5.f84987o;
                                if (i14 != i13) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (yi1Var5.f84996x) {
                                    if (yi1Var5.D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                str4 = yi1Var5.f84973a;
                                if (str4 != null) {
                                    map = f85409h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (yi1Var5.f84990r == 0) {
                                    if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                lx0Var.f79972p = yi1Var5.f84985m;
                                lx0Var.f79973q = yi1Var5.f84986n;
                                lx0Var.f79976t = f10;
                                lx0Var.f79975s = iIntValue;
                                lx0Var.f79977u = yi1Var5.f84994v;
                                lx0Var.f79978v = yi1Var5.f84995w;
                                lx0Var.f79979w = mxVar;
                                i30 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ob2("Unexpected MIME type.", null, true, 1);
                            }
                            str5 = yi1Var5.f84973a;
                            if (str5 != null) {
                                lx0Var.f79958b = yi1Var5.f84973a;
                            }
                            lx0Var.f79957a = Integer.toString(i31);
                            lx0Var.f79967k = str3;
                            lx0Var.f79968l = i11;
                            lx0Var.f79959c = yi1Var5.W;
                            lx0Var.f79960d = i3116;
                            lx0Var.f79969m = list4;
                            lx0Var.f79964h = str;
                            lx0Var.f79970n = yi1Var5.f84984l;
                            mx0 mx0Var113 = new mx0(lx0Var);
                            m73 m73VarA113 = r10.a(yi1Var5.f84975c, i30);
                            yi1Var5.X = m73VarA113;
                            m73VarA113.a(mx0Var113);
                            this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                            yi1Var = null;
                        }
                        str = null;
                        list2 = null;
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1113 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3117 = (z1113 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3117;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var114 = new mx0(lx0Var);
                        m73 m73VarA114 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA114;
                        m73VarA114.a(mx0Var114);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 23:
                        int i50 = yi1Var5.P;
                        if (i50 == 8) {
                            str = null;
                            list2 = null;
                            iB = 3;
                        } else if (i50 != 16) {
                            ih1.d("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + yi1Var5.P + ". Setting mimeType to audio/x-unknown");
                            str = null;
                            list3 = null;
                            str7 = "audio/x-unknown";
                            i11 = -1;
                            list = list3;
                            iB = -1;
                            list4 = list;
                            bArr = yi1Var5.N;
                            if (bArr != null) {
                                str = dj0VarA.f76686a;
                                str7 = "video/dolby-vision";
                            }
                            str3 = str7;
                            boolean z1114 = yi1Var5.V;
                            if (yi1Var5.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i3118 = (z1114 ? 1 : 0) | i12;
                            lx0Var = new lx0();
                            if ("audio".equals(ht1.c(str3))) {
                                lx0Var.f79980x = yi1Var5.O;
                                lx0Var.f79981y = yi1Var5.Q;
                                lx0Var.f79982z = iB;
                                i30 = 1;
                            } else if ("video".equals(ht1.c(str3))) {
                                if (yi1Var5.f84989q == 0) {
                                    i16 = yi1Var5.f84987o;
                                    i13 = -1;
                                    if (i16 == -1) {
                                        i16 = yi1Var5.f84985m;
                                    }
                                    yi1Var5.f84987o = i16;
                                    i17 = yi1Var5.f84988p;
                                    if (i17 == -1) {
                                        i17 = yi1Var5.f84986n;
                                    }
                                    yi1Var5.f84988p = i17;
                                } else {
                                    i13 = -1;
                                }
                                i14 = yi1Var5.f84987o;
                                if (i14 != i13) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (yi1Var5.f84996x) {
                                    if (yi1Var5.D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                str4 = yi1Var5.f84973a;
                                if (str4 != null) {
                                    map = f85409h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (yi1Var5.f84990r == 0) {
                                    if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                lx0Var.f79972p = yi1Var5.f84985m;
                                lx0Var.f79973q = yi1Var5.f84986n;
                                lx0Var.f79976t = f10;
                                lx0Var.f79975s = iIntValue;
                                lx0Var.f79977u = yi1Var5.f84994v;
                                lx0Var.f79978v = yi1Var5.f84995w;
                                lx0Var.f79979w = mxVar;
                                i30 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ob2("Unexpected MIME type.", null, true, 1);
                            }
                            str5 = yi1Var5.f84973a;
                            if (str5 != null) {
                                lx0Var.f79958b = yi1Var5.f84973a;
                            }
                            lx0Var.f79957a = Integer.toString(i31);
                            lx0Var.f79967k = str3;
                            lx0Var.f79968l = i11;
                            lx0Var.f79959c = yi1Var5.W;
                            lx0Var.f79960d = i3118;
                            lx0Var.f79969m = list4;
                            lx0Var.f79964h = str;
                            lx0Var.f79970n = yi1Var5.f84984l;
                            mx0 mx0Var115 = new mx0(lx0Var);
                            m73 m73VarA115 = r10.a(yi1Var5.f84975c, i30);
                            yi1Var5.X = m73VarA115;
                            m73VarA115.a(mx0Var115);
                            this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                            yi1Var = null;
                        } else {
                            iB = 268435456;
                            str = null;
                            list2 = null;
                        }
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1115 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i3119 = (z1115 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i3119;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var116 = new mx0(lx0Var);
                        m73 m73VarA116 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA116;
                        m73VarA116.a(mx0Var116);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 24:
                        iB = ib3.b(yi1Var5.P);
                        if (iB == 0) {
                            ih1.d("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + yi1Var5.P + ". Setting mimeType to audio/x-unknown");
                            str = null;
                            list3 = null;
                            str7 = "audio/x-unknown";
                            i11 = -1;
                            list = list3;
                            iB = -1;
                            list4 = list;
                            bArr = yi1Var5.N;
                            if (bArr != null) {
                                str = dj0VarA.f76686a;
                                str7 = "video/dolby-vision";
                            }
                            str3 = str7;
                            boolean z1116 = yi1Var5.V;
                            if (yi1Var5.U) {
                                i12 = 2;
                            } else {
                                i12 = 0;
                            }
                            int i31110 = (z1116 ? 1 : 0) | i12;
                            lx0Var = new lx0();
                            if ("audio".equals(ht1.c(str3))) {
                                lx0Var.f79980x = yi1Var5.O;
                                lx0Var.f79981y = yi1Var5.Q;
                                lx0Var.f79982z = iB;
                                i30 = 1;
                            } else if ("video".equals(ht1.c(str3))) {
                                if (yi1Var5.f84989q == 0) {
                                    i16 = yi1Var5.f84987o;
                                    i13 = -1;
                                    if (i16 == -1) {
                                        i16 = yi1Var5.f84985m;
                                    }
                                    yi1Var5.f84987o = i16;
                                    i17 = yi1Var5.f84988p;
                                    if (i17 == -1) {
                                        i17 = yi1Var5.f84986n;
                                    }
                                    yi1Var5.f84988p = i17;
                                } else {
                                    i13 = -1;
                                }
                                i14 = yi1Var5.f84987o;
                                if (i14 != i13) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (yi1Var5.f84996x) {
                                    if (yi1Var5.D != -1.0f) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = null;
                                    }
                                    mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                                } else {
                                    mxVar = null;
                                }
                                str4 = yi1Var5.f84973a;
                                if (str4 != null) {
                                    map = f85409h0;
                                    if (map.containsKey(str4)) {
                                        iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                    } else {
                                        iIntValue = -1;
                                    }
                                } else {
                                    iIntValue = -1;
                                }
                                if (yi1Var5.f84990r == 0) {
                                    if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                        iIntValue = 0;
                                    } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                        iIntValue = 90;
                                    } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    } else {
                                        iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                    }
                                }
                                lx0Var.f79972p = yi1Var5.f84985m;
                                lx0Var.f79973q = yi1Var5.f84986n;
                                lx0Var.f79976t = f10;
                                lx0Var.f79975s = iIntValue;
                                lx0Var.f79977u = yi1Var5.f84994v;
                                lx0Var.f79978v = yi1Var5.f84995w;
                                lx0Var.f79979w = mxVar;
                                i30 = 2;
                            } else if (!"application/x-subrip".equals(str3)) {
                                throw new ob2("Unexpected MIME type.", null, true, 1);
                            }
                            str5 = yi1Var5.f84973a;
                            if (str5 != null) {
                                lx0Var.f79958b = yi1Var5.f84973a;
                            }
                            lx0Var.f79957a = Integer.toString(i31);
                            lx0Var.f79967k = str3;
                            lx0Var.f79968l = i11;
                            lx0Var.f79959c = yi1Var5.W;
                            lx0Var.f79960d = i31110;
                            lx0Var.f79969m = list4;
                            lx0Var.f79964h = str;
                            lx0Var.f79970n = yi1Var5.f84984l;
                            mx0 mx0Var117 = new mx0(lx0Var);
                            m73 m73VarA117 = r10.a(yi1Var5.f84975c, i30);
                            yi1Var5.X = m73VarA117;
                            m73VarA117.a(mx0Var117);
                            this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                            yi1Var = null;
                        }
                        str = null;
                        list2 = null;
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1117 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31111 = (z1117 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31111;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var118 = new mx0(lx0Var);
                        m73 m73VarA118 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA118;
                        m73VarA118.a(mx0Var118);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 25:
                        str7 = "text/x-ssa";
                        listA = p51.a(f85405d0, yi1Var5.a(str6));
                        list3 = listA;
                        str = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1118 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31112 = (z1118 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31112;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var119 = new mx0(lx0Var);
                        m73 m73VarA119 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA119;
                        m73VarA119.a(mx0Var119);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 26:
                        w01 w01VarA = w01.a(new jb2(yi1Var5.a(str6)));
                        listSingletonList2 = w01VarA.f84063a;
                        yi1Var5.Y = w01VarA.f84064b;
                        str2 = w01VarA.f84066d;
                        str7 = "video/hevc";
                        list2 = listSingletonList2;
                        iB = -1;
                        str = str2;
                        i11 = -1;
                        list4 = list2;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z1119 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31113 = (z1119 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31113;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1110 = new mx0(lx0Var);
                        m73 m73VarA1110 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1110;
                        m73VarA1110.a(mx0Var1110);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 27:
                        str7 = "text/vtt";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11110 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31114 = (z11110 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31114;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1111 = new mx0(lx0Var);
                        m73 m73VarA1111 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1111;
                        m73VarA1111.a(mx0Var1111);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 28:
                        str7 = "application/x-subrip";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11111 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31115 = (z11111 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31115;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1112 = new mx0(lx0Var);
                        m73 m73VarA1112 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1112;
                        m73VarA1112.a(mx0Var1112);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 29:
                        str7 = "video/mpeg2";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11112 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31116 = (z11112 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31116;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1113 = new mx0(lx0Var);
                        m73 m73VarA1113 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1113;
                        m73VarA1113.a(mx0Var1113);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 30:
                        str7 = "audio/eac3";
                        str = null;
                        list3 = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11113 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31117 = (z11113 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31117;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1114 = new mx0(lx0Var);
                        m73 m73VarA1114 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1114;
                        m73VarA1114.a(mx0Var1114);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 31:
                        str7 = "audio/flac";
                        listA = Collections.singletonList(yi1Var5.a(str6));
                        list3 = listA;
                        str = null;
                        i11 = -1;
                        list = list3;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11114 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31118 = (z11114 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31118;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1115 = new mx0(lx0Var);
                        m73 m73VarA1115 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1115;
                        m73VarA1115.a(mx0Var1115);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    case 32:
                        i11 = 5760;
                        ArrayList arrayList3 = new ArrayList(3);
                        arrayList3.add(yi1Var5.a(yi1Var5.f84974b));
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                        arrayList3.add(byteBufferAllocate.order(byteOrder).putLong(yi1Var5.R).array());
                        arrayList3.add(ByteBuffer.allocate(8).order(byteOrder).putLong(yi1Var5.S).array());
                        str7 = "audio/opus";
                        arrayList = arrayList3;
                        str = null;
                        list = arrayList;
                        iB = -1;
                        list4 = list;
                        bArr = yi1Var5.N;
                        if (bArr != null) {
                            str = dj0VarA.f76686a;
                            str7 = "video/dolby-vision";
                        }
                        str3 = str7;
                        boolean z11115 = yi1Var5.V;
                        if (yi1Var5.U) {
                            i12 = 2;
                        } else {
                            i12 = 0;
                        }
                        int i31119 = (z11115 ? 1 : 0) | i12;
                        lx0Var = new lx0();
                        if ("audio".equals(ht1.c(str3))) {
                            lx0Var.f79980x = yi1Var5.O;
                            lx0Var.f79981y = yi1Var5.Q;
                            lx0Var.f79982z = iB;
                            i30 = 1;
                        } else if ("video".equals(ht1.c(str3))) {
                            if (yi1Var5.f84989q == 0) {
                                i16 = yi1Var5.f84987o;
                                i13 = -1;
                                if (i16 == -1) {
                                    i16 = yi1Var5.f84985m;
                                }
                                yi1Var5.f84987o = i16;
                                i17 = yi1Var5.f84988p;
                                if (i17 == -1) {
                                    i17 = yi1Var5.f84986n;
                                }
                                yi1Var5.f84988p = i17;
                            } else {
                                i13 = -1;
                            }
                            i14 = yi1Var5.f84987o;
                            if (i14 != i13) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (yi1Var5.f84996x) {
                                if (yi1Var5.D != -1.0f) {
                                    bArr2 = null;
                                } else {
                                    bArr2 = null;
                                }
                                mxVar = new mx(yi1Var5.f84997y, yi1Var5.A, yi1Var5.f84998z, bArr2);
                            } else {
                                mxVar = null;
                            }
                            str4 = yi1Var5.f84973a;
                            if (str4 != null) {
                                map = f85409h0;
                                if (map.containsKey(str4)) {
                                    iIntValue = ((Integer) map.get(yi1Var5.f84973a)).intValue();
                                } else {
                                    iIntValue = -1;
                                }
                            } else {
                                iIntValue = -1;
                            }
                            if (yi1Var5.f84990r == 0) {
                                if (Float.compare(yi1Var5.f84993u, 0.0f) == 0) {
                                    iIntValue = 0;
                                } else if (Float.compare(yi1Var5.f84992t, 90.0f) == 0) {
                                    iIntValue = 90;
                                } else if (Float.compare(yi1Var5.f84992t, -180.0f) != 0) {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                } else {
                                    iIntValue = BaseTransientBottomBar.ANIMATION_FADE_DURATION;
                                }
                            }
                            lx0Var.f79972p = yi1Var5.f84985m;
                            lx0Var.f79973q = yi1Var5.f84986n;
                            lx0Var.f79976t = f10;
                            lx0Var.f79975s = iIntValue;
                            lx0Var.f79977u = yi1Var5.f84994v;
                            lx0Var.f79978v = yi1Var5.f84995w;
                            lx0Var.f79979w = mxVar;
                            i30 = 2;
                        } else if (!"application/x-subrip".equals(str3)) {
                            throw new ob2("Unexpected MIME type.", null, true, 1);
                        }
                        str5 = yi1Var5.f84973a;
                        if (str5 != null) {
                            lx0Var.f79958b = yi1Var5.f84973a;
                        }
                        lx0Var.f79957a = Integer.toString(i31);
                        lx0Var.f79967k = str3;
                        lx0Var.f79968l = i11;
                        lx0Var.f79959c = yi1Var5.W;
                        lx0Var.f79960d = i31119;
                        lx0Var.f79969m = list4;
                        lx0Var.f79964h = str;
                        lx0Var.f79970n = yi1Var5.f84984l;
                        mx0 mx0Var1116 = new mx0(lx0Var);
                        m73 m73VarA1116 = r10.a(yi1Var5.f84975c, i30);
                        yi1Var5.X = m73VarA1116;
                        m73VarA1116.a(mx0Var1116);
                        this.f85414c.put(yi1Var5.f84975c, yi1Var5);
                        yi1Var = null;
                        break;
                    default:
                        throw new ob2("Unrecognized codec identifier.", null, true, 1);
                }
                break;
            default:
                yi1Var = null;
                break;
        }
        this.f85432u = yi1Var;
    }

    @Override // yads.mq0
    public final void release() {
    }

    static {
        new rq0() { // from class: cp.dd
            @Override // yads.rq0
            public final mq0[] createExtractors() {
                return zi1.a();
            }
        };
        f85404c0 = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f85405d0 = ib3.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f85406e0 = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f85407f0 = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f85408g0 = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        wi1.a(0, map, "htc_video_rotA-000", 90, "htc_video_rotA-090");
        wi1.a(BaseTransientBottomBar.ANIMATION_FADE_DURATION, map, "htc_video_rotA-180", 270, "htc_video_rotA-270");
        f85409h0 = Collections.unmodifiableMap(map);
    }

    public zi1(jd0 jd0Var, int i10) {
        this.f85428q = -1L;
        this.f85429r = -9223372036854775807L;
        this.f85430s = -9223372036854775807L;
        this.f85431t = -9223372036854775807L;
        this.f85437z = -1L;
        this.A = -1L;
        this.B = -9223372036854775807L;
        this.f85410a = jd0Var;
        jd0Var.a(new xi1(this));
        this.f85415d = (i10 & 1) == 0;
        this.f85412b = new wb3();
        this.f85414c = new SparseArray();
        this.f85418g = new jb2(4);
        this.f85419h = new jb2(ByteBuffer.allocate(4).putInt(-1).array());
        this.f85420i = new jb2(4);
        this.f85416e = new jb2(dy1.f76843a);
        this.f85417f = new jb2(4);
        this.f85421j = new jb2();
        this.f85422k = new jb2();
        this.f85423l = new jb2(8);
        this.f85424m = new jb2();
        this.f85425n = new jb2();
        this.L = new int[1];
    }

    public final void a(yi1 yi1Var, long j10, int i10, int i11, int i12) {
        byte[] bArrA;
        int i13;
        int i14;
        z83 z83Var = yi1Var.T;
        if (z83Var != null) {
            z83Var.a(yi1Var.X, j10, i10, i11, i12, yi1Var.f84982j);
        } else {
            if ("S_TEXT/UTF8".equals(yi1Var.f84974b) || "S_TEXT/ASS".equals(yi1Var.f84974b) || "S_TEXT/WEBVTT".equals(yi1Var.f84974b)) {
                if (this.K > 1) {
                    ih1.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j11 = this.I;
                    if (j11 == -9223372036854775807L) {
                        ih1.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        String str = yi1Var.f84974b;
                        byte[] bArr = this.f85422k.f78966a;
                        str.getClass();
                        switch (str) {
                            case "S_TEXT/ASS":
                                bArrA = a("%01d:%02d:%02d:%02d", j11, 10000L);
                                i13 = 21;
                                break;
                            case "S_TEXT/WEBVTT":
                                bArrA = a("%02d:%02d:%02d.%03d", j11, 1000L);
                                i13 = 25;
                                break;
                            case "S_TEXT/UTF8":
                                bArrA = a("%02d:%02d:%02d,%03d", j11, 1000L);
                                i13 = 19;
                                break;
                            default:
                                throw new IllegalArgumentException();
                        }
                        System.arraycopy(bArrA, 0, bArr, i13, bArrA.length);
                        int i15 = this.f85422k.f78967b;
                        while (true) {
                            jb2 jb2Var = this.f85422k;
                            if (i15 < jb2Var.f78968c) {
                                if (jb2Var.f78966a[i15] == 0) {
                                    jb2Var.d(i15);
                                } else {
                                    i15++;
                                }
                            }
                        }
                        m73 m73Var = yi1Var.X;
                        jb2 jb2Var2 = this.f85422k;
                        m73Var.a(jb2Var2.f78968c, jb2Var2);
                        i14 = i11 + this.f85422k.f78968c;
                    }
                }
                i14 = i11;
            } else {
                i14 = i11;
            }
            if ((i10 & 268435456) != 0) {
                if (this.K > 1) {
                    this.f85425n.c(0);
                } else {
                    jb2 jb2Var3 = this.f85425n;
                    int i16 = jb2Var3.f78968c;
                    yi1Var.X.a(i16, jb2Var3);
                    i14 += i16;
                }
            }
            yi1Var.X.a(j10, i10, i14, i12, yi1Var.f84982j);
        }
        this.F = true;
    }

    @Override // yads.mq0
    public final void seek(long j10, long j11) {
        this.B = -9223372036854775807L;
        this.G = 0;
        ((jd0) this.f85410a).a();
        wb3 wb3Var = this.f85412b;
        wb3Var.f84152b = 0;
        wb3Var.f84153c = 0;
        b();
        for (int i10 = 0; i10 < this.f85414c.size(); i10++) {
            z83 z83Var = ((yi1) this.f85414c.valueAt(i10)).T;
            if (z83Var != null) {
                z83Var.f85245b = false;
                z83Var.f85246c = 0;
            }
        }
    }

    public static byte[] a(String str, long j10, long j11) {
        if (j10 != -9223372036854775807L) {
            int i10 = (int) (j10 / 3600000000L);
            long j12 = j10 - (((long) i10) * 3600000000L);
            int i11 = (int) (j12 / 60000000);
            long j13 = j12 - (((long) i11) * 60000000);
            int i12 = (int) (j13 / 1000000);
            return ib3.c(String.format(Locale.US, str, Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf((int) ((j13 - (((long) i12) * 1000000)) / j11))));
        }
        throw new IllegalArgumentException();
    }

    @Override // yads.mq0
    public final void a(pq0 pq0Var) {
        this.f85413b0 = pq0Var;
    }

    @Override // yads.mq0
    public final int a(nq0 nq0Var, gg2 gg2Var) throws ob2, EOFException, InterruptedIOException {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            ld0 ld0Var = (ld0) nq0Var;
            zA = ((jd0) this.f85410a).a(ld0Var);
            if (zA) {
                long j10 = ld0Var.f79757d;
                if (this.f85436y) {
                    this.A = j10;
                    gg2Var.f77799a = this.f85437z;
                    this.f85436y = false;
                } else if (this.f85433v) {
                    long j11 = this.A;
                    if (j11 != -1) {
                        gg2Var.f77799a = j11;
                        this.A = -1L;
                    }
                } else {
                    continue;
                }
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i10 = 0; i10 < this.f85414c.size(); i10++) {
            yi1 yi1Var = (yi1) this.f85414c.valueAt(i10);
            yi1Var.X.getClass();
            z83 z83Var = yi1Var.T;
            if (z83Var != null) {
                m73 m73Var = yi1Var.X;
                l73 l73Var = yi1Var.f84982j;
                if (z83Var.f85246c > 0) {
                    m73Var.a(z83Var.f85247d, z83Var.f85248e, z83Var.f85249f, z83Var.f85250g, l73Var);
                    z83Var.f85246c = 0;
                }
            }
        }
        return -1;
    }

    public final void a(ld0 ld0Var, int i10) {
        jb2 jb2Var = this.f85418g;
        if (jb2Var.f78968c >= i10) {
            return;
        }
        byte[] bArr = jb2Var.f78966a;
        if (bArr.length < i10) {
            jb2Var.a(Math.max(bArr.length * 2, i10));
        }
        jb2 jb2Var2 = this.f85418g;
        byte[] bArr2 = jb2Var2.f78966a;
        int i11 = jb2Var2.f78968c;
        ld0Var.a(bArr2, i11, i10 - i11, false);
        this.f85418g.d(i10);
    }

    public final long a(long j10) throws ob2 {
        long j11 = this.f85429r;
        if (j11 != -9223372036854775807L) {
            return ib3.a(j10, j11, 1000L);
        }
        throw new ob2("Can't scale timecode prior to timecodeScale being set.", null, true, 1);
    }

    @Override // yads.mq0
    public final boolean a(nq0 nq0Var) throws EOFException, InterruptedIOException {
        t13 t13Var = new t13();
        ld0 ld0Var = (ld0) nq0Var;
        long j10 = ld0Var.f79756c;
        long j11 = 1024;
        if (j10 != -1 && j10 <= 1024) {
            j11 = j10;
        }
        int i10 = (int) j11;
        ld0Var.b(t13Var.f82866a.f78966a, 0, 4, false);
        t13Var.f82867b = 4;
        for (long jN = t13Var.f82866a.n(); jN != 440786851; jN = ((jN << 8) & (-256)) | ((long) (t13Var.f82866a.f78966a[0] & 255))) {
            int i11 = t13Var.f82867b + 1;
            t13Var.f82867b = i11;
            if (i11 == i10) {
                return false;
            }
            ld0Var.b(t13Var.f82866a.f78966a, 0, 1, false);
        }
        long jA = t13Var.a(ld0Var);
        long j12 = t13Var.f82867b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (j10 != -1 && j12 + jA >= j10) {
            return false;
        }
        while (true) {
            long j13 = t13Var.f82867b;
            long j14 = j12 + jA;
            if (j13 >= j14) {
                return j13 == j14;
            }
            if (t13Var.a(ld0Var) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = t13Var.a(ld0Var);
            if (jA2 < 0 || jA2 > 2147483647L) {
                return false;
            }
            if (jA2 != 0) {
                int i12 = (int) jA2;
                ld0Var.a(false, i12);
                t13Var.f82867b += i12;
            }
        }
    }

    public final int a(ld0 ld0Var, yi1 yi1Var, int i10, boolean z10) throws ob2, EOFException, InterruptedIOException {
        int iA;
        int iA2;
        int i11;
        if ("S_TEXT/UTF8".equals(yi1Var.f84974b)) {
            a(ld0Var, f85404c0, i10);
            int i12 = this.T;
            b();
            return i12;
        }
        if ("S_TEXT/ASS".equals(yi1Var.f84974b)) {
            a(ld0Var, f85406e0, i10);
            int i13 = this.T;
            b();
            return i13;
        }
        if ("S_TEXT/WEBVTT".equals(yi1Var.f84974b)) {
            a(ld0Var, f85407f0, i10);
            int i14 = this.T;
            b();
            return i14;
        }
        m73 m73Var = yi1Var.X;
        if (!this.V) {
            if (yi1Var.f84980h) {
                this.O &= -1073741825;
                if (!this.W) {
                    ld0Var.a(this.f85418g.f78966a, 0, 1, false);
                    this.S++;
                    byte b10 = this.f85418g.f78966a[0];
                    if ((b10 & 128) != 128) {
                        this.Z = b10;
                        this.W = true;
                    } else {
                        throw new ob2("Extension bit is set in signal byte", null, true, 1);
                    }
                }
                byte b11 = this.Z;
                if ((b11 & 1) == 1) {
                    boolean z11 = (b11 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.f85411a0) {
                        ld0Var.a(this.f85423l.f78966a, 0, 8, false);
                        this.S += 8;
                        this.f85411a0 = true;
                        jb2 jb2Var = this.f85418g;
                        jb2Var.f78966a[0] = (byte) ((z11 ? 128 : 0) | 8);
                        jb2Var.e(0);
                        m73Var.a(1, this.f85418g);
                        this.T++;
                        this.f85423l.e(0);
                        m73Var.a(8, this.f85423l);
                        this.T += 8;
                    }
                    if (z11) {
                        if (!this.X) {
                            ld0Var.a(this.f85418g.f78966a, 0, 1, false);
                            this.S++;
                            this.f85418g.e(0);
                            this.Y = this.f85418g.m();
                            this.X = true;
                        }
                        int i15 = this.Y * 4;
                        this.f85418g.c(i15);
                        ld0Var.a(this.f85418g.f78966a, 0, i15, false);
                        this.S += i15;
                        short s10 = (short) ((this.Y / 2) + 1);
                        int i16 = (s10 * 6) + 2;
                        ByteBuffer byteBuffer = this.f85426o;
                        if (byteBuffer == null || byteBuffer.capacity() < i16) {
                            this.f85426o = ByteBuffer.allocate(i16);
                        }
                        this.f85426o.position(0);
                        this.f85426o.putShort(s10);
                        int i17 = 0;
                        int i18 = 0;
                        while (true) {
                            i11 = this.Y;
                            if (i17 >= i11) {
                                break;
                            }
                            int iP = this.f85418g.p();
                            if (i17 % 2 == 0) {
                                this.f85426o.putShort((short) (iP - i18));
                            } else {
                                this.f85426o.putInt(iP - i18);
                            }
                            i17++;
                            i18 = iP;
                        }
                        int i19 = (i10 - this.S) - i18;
                        if (i11 % 2 == 1) {
                            this.f85426o.putInt(i19);
                        } else {
                            this.f85426o.putShort((short) i19);
                            this.f85426o.putInt(0);
                        }
                        jb2 jb2Var2 = this.f85424m;
                        jb2Var2.f78966a = this.f85426o.array();
                        jb2Var2.f78968c = i16;
                        jb2Var2.f78967b = 0;
                        m73Var.a(i16, this.f85424m);
                        this.T += i16;
                    }
                }
            } else {
                byte[] bArr = yi1Var.f84981i;
                if (bArr != null) {
                    jb2 jb2Var3 = this.f85421j;
                    int length = bArr.length;
                    jb2Var3.f78966a = bArr;
                    jb2Var3.f78968c = length;
                    jb2Var3.f78967b = 0;
                }
            }
            if (!"A_OPUS".equals(yi1Var.f84974b) ? yi1Var.f84978f > 0 : z10) {
                this.O |= 268435456;
                this.f85425n.c(0);
                int i20 = (this.f85421j.f78968c + i10) - this.S;
                this.f85418g.c(4);
                jb2 jb2Var4 = this.f85418g;
                byte[] bArr2 = jb2Var4.f78966a;
                bArr2[0] = (byte) ((i20 >> 24) & 255);
                bArr2[1] = (byte) ((i20 >> 16) & 255);
                bArr2[2] = (byte) ((i20 >> 8) & 255);
                bArr2[3] = (byte) (i20 & 255);
                m73Var.a(4, jb2Var4);
                this.T += 4;
            }
            this.V = true;
        }
        int i21 = i10 + this.f85421j.f78968c;
        if (!"V_MPEG4/ISO/AVC".equals(yi1Var.f84974b) && !"V_MPEGH/ISO/HEVC".equals(yi1Var.f84974b)) {
            z83 z83Var = yi1Var.T;
            if (z83Var != null) {
                if (this.f85421j.f78968c == 0) {
                    z83Var.a(ld0Var);
                } else {
                    throw new IllegalStateException();
                }
            }
            while (true) {
                int i22 = this.S;
                if (i22 >= i21) {
                    break;
                }
                int i23 = i21 - i22;
                jb2 jb2Var5 = this.f85421j;
                int i24 = jb2Var5.f78968c - jb2Var5.f78967b;
                if (i24 > 0) {
                    iA2 = Math.min(i23, i24);
                    m73Var.a(iA2, this.f85421j);
                } else {
                    iA2 = m73Var.a(ld0Var, i23, false);
                }
                this.S += iA2;
                this.T += iA2;
            }
        } else {
            byte[] bArr3 = this.f85417f.f78966a;
            bArr3[0] = 0;
            bArr3[1] = 0;
            bArr3[2] = 0;
            int i25 = yi1Var.Y;
            int i26 = 4 - i25;
            while (this.S < i21) {
                int i27 = this.U;
                if (i27 == 0) {
                    jb2 jb2Var6 = this.f85421j;
                    int iMin = Math.min(i25, jb2Var6.f78968c - jb2Var6.f78967b);
                    ld0Var.a(bArr3, i26 + iMin, i25 - iMin, false);
                    if (iMin > 0) {
                        this.f85421j.a(bArr3, i26, iMin);
                    }
                    this.S += i25;
                    this.f85417f.e(0);
                    this.U = this.f85417f.p();
                    this.f85416e.e(0);
                    m73Var.a(4, this.f85416e);
                    this.T += 4;
                } else {
                    jb2 jb2Var7 = this.f85421j;
                    int i28 = jb2Var7.f78968c - jb2Var7.f78967b;
                    if (i28 > 0) {
                        iA = Math.min(i27, i28);
                        m73Var.a(iA, this.f85421j);
                    } else {
                        iA = m73Var.a(ld0Var, i27, false);
                    }
                    this.S += iA;
                    this.T += iA;
                    this.U -= iA;
                }
            }
        }
        if ("A_VORBIS".equals(yi1Var.f84974b)) {
            this.f85419h.e(0);
            m73Var.a(4, this.f85419h);
            this.T += 4;
        }
        int i29 = this.T;
        b();
        return i29;
    }

    public final void b() {
        this.S = 0;
        this.T = 0;
        this.U = 0;
        this.V = false;
        this.W = false;
        this.X = false;
        this.Y = 0;
        this.Z = (byte) 0;
        this.f85411a0 = false;
        this.f85421j.c(0);
    }

    public final void a(ld0 ld0Var, byte[] bArr, int i10) throws EOFException, InterruptedIOException {
        int length = bArr.length + i10;
        jb2 jb2Var = this.f85422k;
        byte[] bArr2 = jb2Var.f78966a;
        if (bArr2.length < length) {
            jb2Var.a(Arrays.copyOf(bArr, length + i10));
        } else {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
        ld0Var.a(this.f85422k.f78966a, bArr.length, i10, false);
        this.f85422k.e(0);
        this.f85422k.d(length);
    }

    public static mq0[] a() {
        return new mq0[]{new zi1(new jd0(), 0)};
    }
}
