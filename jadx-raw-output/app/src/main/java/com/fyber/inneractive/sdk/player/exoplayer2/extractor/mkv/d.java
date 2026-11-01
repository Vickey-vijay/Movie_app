package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.r;
import com.fyber.inneractive.sdk.player.exoplayer2.o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.i;
import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.z;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes9.dex */
public final class d {
    public boolean L;
    public r O;
    public int P;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f16717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f16718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f16719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f16720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public byte[] f16721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public byte[] f16722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public byte[] f16723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.drm.d f16724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f16725j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f16726k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f16727l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16728m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f16729n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public byte[] f16730o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f16731p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f16732q = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16733r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f16734s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f16735t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16736u = 1000;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16737v = 200;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f16738w = -1.0f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public float f16739x = -1.0f;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f16740y = -1.0f;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f16741z = -1.0f;
    public float A = -1.0f;
    public float B = -1.0f;
    public float C = -1.0f;
    public float D = -1.0f;
    public float E = -1.0f;
    public float F = -1.0f;
    public int G = 1;
    public int H = -1;
    public int I = 8000;
    public long J = 0;
    public long K = 0;
    public boolean M = true;
    public String N = "eng";

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:238:0x042c  */
    /* JADX WARN: Code duplicated, block: B:239:0x042e  */
    /* JADX WARN: Code duplicated, block: B:242:0x043c  */
    /* JADX WARN: Code duplicated, block: B:243:0x0467  */
    /* JADX WARN: Code duplicated, block: B:245:0x0473  */
    /* JADX WARN: Code duplicated, block: B:247:0x0477  */
    /* JADX WARN: Code duplicated, block: B:249:0x047c  */
    /* JADX WARN: Code duplicated, block: B:252:0x0484  */
    /* JADX WARN: Code duplicated, block: B:254:0x0489  */
    /* JADX WARN: Code duplicated, block: B:257:0x0490  */
    /* JADX WARN: Code duplicated, block: B:260:0x04a0  */
    /* JADX WARN: Code duplicated, block: B:263:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:265:0x04ac  */
    /* JADX WARN: Code duplicated, block: B:285:0x0558  */
    /* JADX WARN: Code duplicated, block: B:287:0x0568  */
    /* JADX WARN: Code duplicated, block: B:289:0x0591  */
    /* JADX WARN: Code duplicated, block: B:291:0x0599  */
    /* JADX WARN: Code duplicated, block: B:293:0x05ba  */
    /* JADX WARN: Code duplicated, block: B:295:0x05c2  */
    /* JADX WARN: Code duplicated, block: B:4:0x0021  */
    public final void a(j jVar, int i10) {
        byte b10;
        List listSingletonList;
        int iA;
        List list;
        int i11;
        int i12;
        List listSingletonList2;
        List list2;
        String str;
        String str2;
        int i13;
        int i14;
        int i15;
        o oVar;
        int i16;
        int i17;
        int i18;
        float f10;
        com.fyber.inneractive.sdk.player.exoplayer2.video.c cVar;
        byte[] bArr;
        int i19;
        int i20;
        int i21;
        String str3 = this.f16716a;
        str3.getClass();
        int i22 = 3;
        int i23 = 2;
        switch (str3) {
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
            case "V_VP8":
                b10 = 16;
                break;
            case "V_VP9":
                b10 = 17;
                break;
            case "S_HDMV/PGS":
                b10 = 18;
                break;
            case "V_THEORA":
                b10 = 19;
                break;
            case "A_DTS/EXPRESS":
                b10 = 20;
                break;
            case "A_PCM/INT/LIT":
                b10 = 21;
                break;
            case "V_MPEGH/ISO/HEVC":
                b10 = 22;
                break;
            case "S_TEXT/UTF8":
                b10 = 23;
                break;
            case "V_MPEG2":
                b10 = 24;
                break;
            case "A_EAC3":
                b10 = 25;
                break;
            case "A_FLAC":
                b10 = 26;
                break;
            case "A_OPUS":
                b10 = 27;
                break;
            default:
                b10 = -1;
                break;
        }
        String str4 = "audio/x-unknown";
        switch (b10) {
            case 0:
            case 1:
            case 9:
                byte[] bArr2 = this.f16723h;
                listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                str4 = "video/mp4v-es";
                i13 = -1;
                list2 = listSingletonList;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z10 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z10 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                } else if ("video".equals(i.b(str4))) {
                    if (this.f16729n == 0) {
                        i20 = this.f16727l;
                        i17 = -1;
                        if (i20 == -1) {
                            i20 = this.f16725j;
                        }
                        this.f16727l = i20;
                        i21 = this.f16728m;
                        if (i21 == -1) {
                            i21 = this.f16726k;
                        }
                        this.f16728m = i21;
                    } else {
                        i17 = -1;
                    }
                    i18 = this.f16727l;
                    if (i18 != i17 || (i19 = this.f16728m) == i17) {
                        f10 = -1.0f;
                    } else {
                        f10 = (this.f16726k * i18) / (this.f16725j * i19);
                    }
                    if (this.f16732q) {
                        if (this.f16738w != -1.0f || this.f16739x == -1.0f || this.f16740y == -1.0f || this.f16741z == -1.0f || this.A == -1.0f || this.B == -1.0f || this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f) {
                            bArr = null;
                        } else {
                            bArr = new byte[25];
                            ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
                            byteBufferWrap.put((byte) 0);
                            byteBufferWrap.putShort((short) ((this.f16738w * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.f16739x * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.f16740y * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.f16741z * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.A * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.B * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.C * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) ((this.D * 50000.0f) + 0.5f));
                            byteBufferWrap.putShort((short) (this.E + 0.5f));
                            byteBufferWrap.putShort((short) (this.F + 0.5f));
                            byteBufferWrap.putShort((short) this.f16736u);
                            byteBufferWrap.putShort((short) this.f16737v);
                        }
                        cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                    } else {
                        cVar = null;
                    }
                    oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                    i16 = i23;
                } else {
                    if ("application/x-subrip".equals(str4)) {
                        oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                    } else {
                        if ("application/vobsub".equals(str4) && !"application/pgs".equals(str4) && !"application/dvbsubs".equals(str4)) {
                            throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unexpected MIME type.");
                        }
                        oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                    }
                    i16 = i22;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA = jVar.a(this.f16717b, i16);
                this.O = gVarA;
                gVarA.a(oVar);
                return;
            case 2:
                i22 = 3;
                i23 = 2;
                n nVar = new n(this.f16723h);
                try {
                    int iF = nVar.f();
                    if (iF != 1) {
                        if (iF == 65534) {
                            nVar.e(24);
                            long jG = nVar.g();
                            UUID uuid = e.f16743b0;
                            if (jG != uuid.getMostSignificantBits() || nVar.g() != uuid.getLeastSignificantBits()) {
                            }
                            list2 = null;
                            iA = -1;
                            i13 = iA;
                            list = list2;
                            i11 = i13;
                            i12 = -1;
                            boolean z11 = this.M;
                            if (this.L) {
                                i14 = i23;
                            } else {
                                i14 = 0;
                            }
                            i15 = (z11 ? 1 : 0) | i14;
                            if ("audio".equals(i.b(str4))) {
                                if ("video".equals(i.b(str4))) {
                                    if (this.f16729n == 0) {
                                        i20 = this.f16727l;
                                        i17 = -1;
                                        if (i20 == -1) {
                                            i20 = this.f16725j;
                                        }
                                        this.f16727l = i20;
                                        i21 = this.f16728m;
                                        if (i21 == -1) {
                                            i21 = this.f16726k;
                                        }
                                        this.f16728m = i21;
                                    } else {
                                        i17 = -1;
                                    }
                                    i18 = this.f16727l;
                                    if (i18 != i17) {
                                        f10 = -1.0f;
                                    } else {
                                        f10 = -1.0f;
                                    }
                                    if (this.f16732q) {
                                        if (this.f16738w != -1.0f) {
                                            bArr = null;
                                        } else {
                                            bArr = null;
                                        }
                                        cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                                    } else {
                                        cVar = null;
                                    }
                                    oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                                    i16 = i23;
                                } else {
                                    if ("application/x-subrip".equals(str4)) {
                                        oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                                    } else {
                                        if ("application/vobsub".equals(str4)) {
                                        }
                                        oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                                    }
                                    i16 = i22;
                                }
                                break;
                            } else {
                                oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                                i16 = 1;
                            }
                            com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA2 = jVar.a(this.f16717b, i16);
                            this.O = gVarA2;
                            gVarA2.a(oVar);
                            return;
                        }
                        Log.w("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                        list2 = null;
                        iA = -1;
                        i13 = iA;
                        list = list2;
                        i11 = i13;
                        i12 = -1;
                        boolean z12 = this.M;
                        if (this.L) {
                            i14 = i23;
                        } else {
                            i14 = 0;
                        }
                        i15 = (z12 ? 1 : 0) | i14;
                        if ("audio".equals(i.b(str4))) {
                            if ("video".equals(i.b(str4))) {
                                if (this.f16729n == 0) {
                                    i20 = this.f16727l;
                                    i17 = -1;
                                    if (i20 == -1) {
                                        i20 = this.f16725j;
                                    }
                                    this.f16727l = i20;
                                    i21 = this.f16728m;
                                    if (i21 == -1) {
                                        i21 = this.f16726k;
                                    }
                                    this.f16728m = i21;
                                } else {
                                    i17 = -1;
                                }
                                i18 = this.f16727l;
                                if (i18 != i17) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f16732q) {
                                    if (this.f16738w != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                                } else {
                                    cVar = null;
                                }
                                oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                                i16 = i23;
                            } else {
                                if ("application/x-subrip".equals(str4)) {
                                    oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                                } else {
                                    if ("application/vobsub".equals(str4)) {
                                    }
                                    oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                                }
                                i16 = i22;
                            }
                            break;
                        } else {
                            oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                            i16 = 1;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA3 = jVar.a(this.f16717b, i16);
                        this.O = gVarA3;
                        gVarA3.a(oVar);
                        return;
                    }
                    iA = z.a(this.H);
                    if (iA != 0) {
                        str4 = "audio/raw";
                        list2 = null;
                        i13 = iA;
                        list = list2;
                        i11 = i13;
                        i12 = -1;
                        boolean z13 = this.M;
                        if (this.L) {
                            i14 = i23;
                        } else {
                            i14 = 0;
                        }
                        i15 = (z13 ? 1 : 0) | i14;
                        if ("audio".equals(i.b(str4))) {
                            if ("video".equals(i.b(str4))) {
                                if (this.f16729n == 0) {
                                    i20 = this.f16727l;
                                    i17 = -1;
                                    if (i20 == -1) {
                                        i20 = this.f16725j;
                                    }
                                    this.f16727l = i20;
                                    i21 = this.f16728m;
                                    if (i21 == -1) {
                                        i21 = this.f16726k;
                                    }
                                    this.f16728m = i21;
                                } else {
                                    i17 = -1;
                                }
                                i18 = this.f16727l;
                                if (i18 != i17) {
                                    f10 = -1.0f;
                                } else {
                                    f10 = -1.0f;
                                }
                                if (this.f16732q) {
                                    if (this.f16738w != -1.0f) {
                                        bArr = null;
                                    } else {
                                        bArr = null;
                                    }
                                    cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                                } else {
                                    cVar = null;
                                }
                                oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                                i16 = i23;
                            } else {
                                if ("application/x-subrip".equals(str4)) {
                                    oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                                } else {
                                    if ("application/vobsub".equals(str4)) {
                                    }
                                    oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                                }
                                i16 = i22;
                            }
                            break;
                        } else {
                            oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                            i16 = 1;
                        }
                        com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA4 = jVar.a(this.f16717b, i16);
                        this.O = gVarA4;
                        gVarA4.a(oVar);
                        return;
                    }
                    Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                    list2 = null;
                    iA = -1;
                    i13 = iA;
                    list = list2;
                    i11 = i13;
                    i12 = -1;
                    boolean z14 = this.M;
                    if (this.L) {
                        i14 = i23;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z14 ? 1 : 0) | i14;
                    if ("audio".equals(i.b(str4))) {
                        if ("video".equals(i.b(str4))) {
                            if (this.f16729n == 0) {
                                i20 = this.f16727l;
                                i17 = -1;
                                if (i20 == -1) {
                                    i20 = this.f16725j;
                                }
                                this.f16727l = i20;
                                i21 = this.f16728m;
                                if (i21 == -1) {
                                    i21 = this.f16726k;
                                }
                                this.f16728m = i21;
                            } else {
                                i17 = -1;
                            }
                            i18 = this.f16727l;
                            if (i18 != i17) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f16732q) {
                                if (this.f16738w != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                            } else {
                                cVar = null;
                            }
                            oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                            i16 = i23;
                        } else {
                            if ("application/x-subrip".equals(str4)) {
                                oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                            }
                            i16 = i22;
                        }
                        break;
                    } else {
                        oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                        i16 = 1;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA5 = jVar.a(this.f16717b, i16);
                    this.O = gVarA5;
                    gVarA5.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing MS/ACM codec private");
                }
            case 3:
                i22 = 3;
                i23 = 2;
                str4 = "audio/true-hd";
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z15 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z15 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA6 = jVar.a(this.f16717b, i16);
                this.O = gVarA6;
                gVarA6.a(oVar);
                return;
            case 4:
                byte[] bArr3 = this.f16723h;
                try {
                    if (bArr3[0] != 2) {
                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                    }
                    int i24 = 1;
                    int i25 = 0;
                    while (true) {
                        int i26 = bArr3[i24];
                        if (i26 == -1) {
                            i25 += 255;
                            i24++;
                        } else {
                            int i27 = i24 + 1;
                            int i28 = i25 + i26;
                            int i29 = 0;
                            while (true) {
                                int i30 = bArr3[i27];
                                if (i30 != -1) {
                                    int i31 = i27 + 1;
                                    int i32 = i29 + i30;
                                    if (bArr3[i31] != 1) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr4 = new byte[i28];
                                    System.arraycopy(bArr3, i31, bArr4, 0, i28);
                                    int i33 = i31 + i28;
                                    i22 = 3;
                                    if (bArr3[i33] != 3) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    int i34 = i33 + i32;
                                    if (bArr3[i34] != 5) {
                                        throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                                    }
                                    byte[] bArr5 = new byte[bArr3.length - i34];
                                    System.arraycopy(bArr3, i34, bArr5, 0, bArr3.length - i34);
                                    i23 = 2;
                                    ArrayList arrayList = new ArrayList(2);
                                    arrayList.add(bArr4);
                                    arrayList.add(bArr5);
                                    list = arrayList;
                                    i11 = -1;
                                    str4 = "audio/vorbis";
                                    i12 = 8192;
                                    boolean z16 = this.M;
                                    if (this.L) {
                                        i14 = i23;
                                    } else {
                                        i14 = 0;
                                    }
                                    i15 = (z16 ? 1 : 0) | i14;
                                    if ("audio".equals(i.b(str4))) {
                                        if ("video".equals(i.b(str4))) {
                                            if (this.f16729n == 0) {
                                                i20 = this.f16727l;
                                                i17 = -1;
                                                if (i20 == -1) {
                                                    i20 = this.f16725j;
                                                }
                                                this.f16727l = i20;
                                                i21 = this.f16728m;
                                                if (i21 == -1) {
                                                    i21 = this.f16726k;
                                                }
                                                this.f16728m = i21;
                                            } else {
                                                i17 = -1;
                                            }
                                            i18 = this.f16727l;
                                            if (i18 != i17) {
                                                f10 = -1.0f;
                                            } else {
                                                f10 = -1.0f;
                                            }
                                            if (this.f16732q) {
                                                if (this.f16738w != -1.0f) {
                                                    bArr = null;
                                                } else {
                                                    bArr = null;
                                                }
                                                cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                                            } else {
                                                cVar = null;
                                            }
                                            oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                                            i16 = i23;
                                        } else {
                                            if ("application/x-subrip".equals(str4)) {
                                                oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                                            } else {
                                                if ("application/vobsub".equals(str4)) {
                                                }
                                                oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                                            }
                                            i16 = i22;
                                        }
                                        break;
                                    } else {
                                        oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                                        i16 = 1;
                                    }
                                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA7 = jVar.a(this.f16717b, i16);
                                    this.O = gVarA7;
                                    gVarA7.a(oVar);
                                    return;
                                }
                                i29 += 255;
                                i27++;
                            }
                        }
                    }
                } catch (ArrayIndexOutOfBoundsException unused2) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing vorbis codec private");
                }
                break;
            case 5:
                i12 = 4096;
                str4 = "audio/mpeg-L2";
                list = null;
                i23 = 2;
                i22 = 3;
                i11 = -1;
                boolean z17 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z17 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA8 = jVar.a(this.f16717b, i16);
                this.O = gVarA8;
                gVarA8.a(oVar);
                return;
            case 6:
                i12 = 4096;
                str4 = "audio/mpeg";
                list = null;
                i23 = 2;
                i22 = 3;
                i11 = -1;
                boolean z18 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z18 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA9 = jVar.a(this.f16717b, i16);
                this.O = gVarA9;
                gVarA9.a(oVar);
                return;
            case 7:
                byte[] bArr6 = this.f16723h;
                try {
                    if (16 > bArr6.length) {
                        throw new IllegalArgumentException();
                    }
                    if (((((long) bArr6[16]) & 255) | ((((long) bArr6[17]) & 255) << 8) | ((((long) bArr6[18]) & 255) << 16) | ((((long) bArr6[19]) & 255) << 24)) != 826496599) {
                        listSingletonList2 = null;
                    } else {
                        int i35 = 40;
                        while (true) {
                            if (i35 >= bArr6.length - 4) {
                                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Failed to find FourCC VC1 initialization data");
                            }
                            if (bArr6[i35] == 0 && bArr6[i35 + 1] == 0 && bArr6[i35 + 2] == 1) {
                                if (bArr6[i35 + 3] == 15) {
                                    listSingletonList2 = Collections.singletonList(Arrays.copyOfRange(bArr6, i35, bArr6.length));
                                }
                            }
                            i35++;
                        }
                    }
                    if (listSingletonList2 != null) {
                        str4 = "video/wvc1";
                    } else {
                        Log.w("MatroskaExtractor", "Unsupported FourCC. Setting mimeType to video/x-unknown");
                        str4 = "video/x-unknown";
                    }
                    list2 = listSingletonList2;
                    iA = -1;
                    i23 = 2;
                    i22 = 3;
                    i13 = iA;
                    list = list2;
                    i11 = i13;
                    i12 = -1;
                    boolean z19 = this.M;
                    if (this.L) {
                        i14 = i23;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z19 ? 1 : 0) | i14;
                    if ("audio".equals(i.b(str4))) {
                        if ("video".equals(i.b(str4))) {
                            if (this.f16729n == 0) {
                                i20 = this.f16727l;
                                i17 = -1;
                                if (i20 == -1) {
                                    i20 = this.f16725j;
                                }
                                this.f16727l = i20;
                                i21 = this.f16728m;
                                if (i21 == -1) {
                                    i21 = this.f16726k;
                                }
                                this.f16728m = i21;
                            } else {
                                i17 = -1;
                            }
                            i18 = this.f16727l;
                            if (i18 != i17) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f16732q) {
                                if (this.f16738w != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                            } else {
                                cVar = null;
                            }
                            oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                            i16 = i23;
                        } else {
                            if ("application/x-subrip".equals(str4)) {
                                oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                            }
                            i16 = i22;
                        }
                        break;
                    } else {
                        oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                        i16 = 1;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA10 = jVar.a(this.f16717b, i16);
                    this.O = gVarA10;
                    gVarA10.a(oVar);
                    return;
                } catch (ArrayIndexOutOfBoundsException unused3) {
                    throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Error parsing FourCC VC1 codec private");
                }
            case 8:
                byte[] bArr7 = this.f16723h;
                listSingletonList = Collections.singletonList(new byte[]{bArr7[0], bArr7[1], bArr7[2], bArr7[3]});
                str = "application/dvbsubs";
                str4 = str;
                i13 = -1;
                list2 = listSingletonList;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z110 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z110 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA11 = jVar.a(this.f16717b, i16);
                this.O = gVarA11;
                gVarA11.a(oVar);
                return;
            case 10:
                com.fyber.inneractive.sdk.player.exoplayer2.video.a aVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.a.a(new n(this.f16723h));
                list2 = aVarA.f17903a;
                this.P = aVarA.f17904b;
                str2 = "video/avc";
                str4 = str2;
                i22 = 3;
                i23 = 2;
                i13 = -1;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z111 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z111 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA12 = jVar.a(this.f16717b, i16);
                this.O = gVarA12;
                gVarA12.a(oVar);
                return;
            case 11:
                listSingletonList = Collections.singletonList(this.f16723h);
                str = "application/vobsub";
                str4 = str;
                i13 = -1;
                list2 = listSingletonList;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z112 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z112 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA13 = jVar.a(this.f16717b, i16);
                this.O = gVarA13;
                gVarA13.a(oVar);
                return;
            case 12:
                str4 = "audio/vnd.dts.hd";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z113 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z113 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA14 = jVar.a(this.f16717b, i16);
                this.O = gVarA14;
                gVarA14.a(oVar);
                return;
            case 13:
                listSingletonList = Collections.singletonList(this.f16723h);
                str = "audio/mp4a-latm";
                str4 = str;
                i13 = -1;
                list2 = listSingletonList;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z114 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z114 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA15 = jVar.a(this.f16717b, i16);
                this.O = gVarA15;
                gVarA15.a(oVar);
                return;
            case 14:
                str4 = "audio/ac3";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z115 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z115 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA16 = jVar.a(this.f16717b, i16);
                this.O = gVarA16;
                gVarA16.a(oVar);
                return;
            case 15:
            case 20:
                str4 = "audio/vnd.dts";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z116 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z116 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA17 = jVar.a(this.f16717b, i16);
                this.O = gVarA17;
                gVarA17.a(oVar);
                return;
            case 16:
                str4 = "video/x-vnd.on2.vp8";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z117 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z117 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA18 = jVar.a(this.f16717b, i16);
                this.O = gVarA18;
                gVarA18.a(oVar);
                return;
            case 17:
                str4 = "video/x-vnd.on2.vp9";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z118 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z118 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA19 = jVar.a(this.f16717b, i16);
                this.O = gVarA19;
                gVarA19.a(oVar);
                return;
            case 18:
                str4 = "application/pgs";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z119 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z119 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA110 = jVar.a(this.f16717b, i16);
                this.O = gVarA110;
                gVarA110.a(oVar);
                return;
            case 19:
                str4 = "video/x-unknown";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1110 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1110 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA111 = jVar.a(this.f16717b, i16);
                this.O = gVarA111;
                gVarA111.a(oVar);
                return;
            case 21:
                iA = z.a(this.H);
                if (iA != 0) {
                    str4 = "audio/raw";
                    i22 = 3;
                    i23 = 2;
                    list2 = null;
                    i13 = iA;
                    list = list2;
                    i11 = i13;
                    i12 = -1;
                    boolean z1111 = this.M;
                    if (this.L) {
                        i14 = i23;
                    } else {
                        i14 = 0;
                    }
                    i15 = (z1111 ? 1 : 0) | i14;
                    if ("audio".equals(i.b(str4))) {
                        if ("video".equals(i.b(str4))) {
                            if (this.f16729n == 0) {
                                i20 = this.f16727l;
                                i17 = -1;
                                if (i20 == -1) {
                                    i20 = this.f16725j;
                                }
                                this.f16727l = i20;
                                i21 = this.f16728m;
                                if (i21 == -1) {
                                    i21 = this.f16726k;
                                }
                                this.f16728m = i21;
                            } else {
                                i17 = -1;
                            }
                            i18 = this.f16727l;
                            if (i18 != i17) {
                                f10 = -1.0f;
                            } else {
                                f10 = -1.0f;
                            }
                            if (this.f16732q) {
                                if (this.f16738w != -1.0f) {
                                    bArr = null;
                                } else {
                                    bArr = null;
                                }
                                cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                            } else {
                                cVar = null;
                            }
                            oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                            i16 = i23;
                        } else {
                            if ("application/x-subrip".equals(str4)) {
                                oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                            } else {
                                if ("application/vobsub".equals(str4)) {
                                }
                                oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                            }
                            i16 = i22;
                        }
                        break;
                    } else {
                        oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                        i16 = 1;
                    }
                    com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA112 = jVar.a(this.f16717b, i16);
                    this.O = gVarA112;
                    gVarA112.a(oVar);
                    return;
                }
                Log.w("MatroskaExtractor", "Unsupported PCM bit depth: " + this.H + ". Setting mimeType to audio/x-unknown");
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1112 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1112 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA113 = jVar.a(this.f16717b, i16);
                this.O = gVarA113;
                gVarA113.a(oVar);
                return;
            case 22:
                com.fyber.inneractive.sdk.player.exoplayer2.video.d dVarA = com.fyber.inneractive.sdk.player.exoplayer2.video.d.a(new n(this.f16723h));
                list2 = dVarA.f17913a;
                this.P = dVarA.f17914b;
                str2 = "video/hevc";
                str4 = str2;
                i22 = 3;
                i23 = 2;
                i13 = -1;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1113 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1113 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA114 = jVar.a(this.f16717b, i16);
                this.O = gVarA114;
                gVarA114.a(oVar);
                return;
            case 23:
                str4 = "application/x-subrip";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1114 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1114 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA115 = jVar.a(this.f16717b, i16);
                this.O = gVarA115;
                gVarA115.a(oVar);
                return;
            case 24:
                str4 = "video/mpeg2";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1115 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1115 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA116 = jVar.a(this.f16717b, i16);
                this.O = gVarA116;
                gVarA116.a(oVar);
                return;
            case 25:
                str4 = "audio/eac3";
                i22 = 3;
                i23 = 2;
                list2 = null;
                iA = -1;
                i13 = iA;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1116 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1116 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA117 = jVar.a(this.f16717b, i16);
                this.O = gVarA117;
                gVarA117.a(oVar);
                return;
            case 26:
                listSingletonList = Collections.singletonList(this.f16723h);
                str = "audio/flac";
                str4 = str;
                i13 = -1;
                list2 = listSingletonList;
                list = list2;
                i11 = i13;
                i12 = -1;
                boolean z1117 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1117 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA118 = jVar.a(this.f16717b, i16);
                this.O = gVarA118;
                gVarA118.a(oVar);
                return;
            case 27:
                i12 = 5760;
                ArrayList arrayList2 = new ArrayList(3);
                arrayList2.add(this.f16723h);
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.J).array());
                arrayList2.add(ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(this.K).array());
                str4 = "audio/opus";
                list = arrayList2;
                i22 = 3;
                i23 = 2;
                i11 = -1;
                boolean z1118 = this.M;
                if (this.L) {
                    i14 = i23;
                } else {
                    i14 = 0;
                }
                i15 = (z1118 ? 1 : 0) | i14;
                if ("audio".equals(i.b(str4))) {
                    if ("video".equals(i.b(str4))) {
                        if (this.f16729n == 0) {
                            i20 = this.f16727l;
                            i17 = -1;
                            if (i20 == -1) {
                                i20 = this.f16725j;
                            }
                            this.f16727l = i20;
                            i21 = this.f16728m;
                            if (i21 == -1) {
                                i21 = this.f16726k;
                            }
                            this.f16728m = i21;
                        } else {
                            i17 = -1;
                        }
                        i18 = this.f16727l;
                        if (i18 != i17) {
                            f10 = -1.0f;
                        } else {
                            f10 = -1.0f;
                        }
                        if (this.f16732q) {
                            if (this.f16738w != -1.0f) {
                                bArr = null;
                            } else {
                                bArr = null;
                            }
                            cVar = new com.fyber.inneractive.sdk.player.exoplayer2.video.c(this.f16733r, this.f16735t, this.f16734s, bArr);
                        } else {
                            cVar = null;
                        }
                        oVar = o.a(Integer.toString(i10), str4, i12, this.f16725j, this.f16726k, list, -1, f10, this.f16730o, this.f16731p, cVar, this.f16724i);
                        i16 = i23;
                    } else {
                        if ("application/x-subrip".equals(str4)) {
                            oVar = o.a(Integer.toString(i10), str4, i15, this.N, -1, this.f16724i, Long.MAX_VALUE, Collections.emptyList());
                        } else {
                            if ("application/vobsub".equals(str4)) {
                            }
                            oVar = new o(Integer.toString(i10), null, str4, null, -1, -1, -1, -1, -1.0f, -1, -1.0f, null, -1, null, -1, -1, -1, -1, -1, 0, this.N, -1, Long.MAX_VALUE, list, this.f16724i, null);
                        }
                        i16 = i22;
                    }
                    break;
                } else {
                    oVar = o.a(Integer.toString(i10), str4, -1, i12, this.G, this.I, i11, -1, -1, list, this.f16724i, i15, this.N, null);
                    i16 = 1;
                }
                com.fyber.inneractive.sdk.player.exoplayer2.extractor.g gVarA119 = jVar.a(this.f16717b, i16);
                this.O = gVarA119;
                gVarA119.a(oVar);
                return;
            default:
                throw new com.fyber.inneractive.sdk.player.exoplayer2.r("Unrecognized codec identifier.");
        }
    }
}
