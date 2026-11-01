package m3;

import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.vungle.ads.internal.protos.Sdk;
import g5.s;
import g5.t;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: Ac3Util.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f63946a = {1, 2, 3, 6};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f63947b = {48000, 44100, 32000};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f63948c = {24000, 22050, 16000};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f63949d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f63950e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 384, 448, 512, 576, 640};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f63951f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, TTAdConstant.DOWNLOAD_URL_AND_PACKAGE_NAME, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* JADX INFO: compiled from: Ac3Util.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final String f63952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f63953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f63954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f63955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f63956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f63957f;

        public b(@Nullable String str, int i10, int i11, int i12, int i13, int i14) {
            this.f63952a = str;
            this.f63953b = i10;
            this.f63955d = i11;
            this.f63954c = i12;
            this.f63956e = i13;
            this.f63957f = i14;
        }
    }

    public static int f(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b10 = bArr[4];
        return b((b10 & 192) >> 6, b10 & 63);
    }

    public static Format g(t tVar, String str, String str2, @Nullable DrmInitData drmInitData) {
        tVar.M(2);
        int i10 = f63947b[(tVar.y() & 192) >> 6];
        int iY = tVar.y();
        int i11 = f63949d[(iY & 14) >> 1];
        if ((iY & 1) != 0) {
            i11++;
        }
        if (((tVar.y() & 30) >> 1) > 0 && (2 & tVar.y()) != 0) {
            i11 += 2;
        }
        return Format.p(str, (tVar.a() <= 0 || (tVar.y() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    public static int i(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b10 = bArr[7];
            if ((b10 & 254) == 186) {
                return 40 << ((bArr[(b10 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int b(int i10, int i11) {
        int i12 = i11 / 2;
        if (i10 < 0) {
            return -1;
        }
        int[] iArr = f63947b;
        if (i10 >= iArr.length || i11 < 0) {
            return -1;
        }
        int[] iArr2 = f63951f;
        if (i12 >= iArr2.length) {
            return -1;
        }
        int i13 = iArr[i10];
        if (i13 == 44100) {
            return (iArr2[i12] + (i11 % 2)) * 2;
        }
        int i14 = f63950e[i12];
        return i13 == 32000 ? i14 * 6 : i14 * 4;
    }

    public static b e(s sVar) {
        int iB;
        int i10;
        int i11;
        int i12;
        int i13;
        String str;
        int iH;
        int i14;
        int i15;
        int i16;
        int i17;
        int iE = sVar.e();
        sVar.q(40);
        boolean z10 = sVar.h(5) > 10;
        sVar.o(iE);
        int i18 = -1;
        if (z10) {
            sVar.q(16);
            int iH2 = sVar.h(2);
            if (iH2 == 0) {
                i18 = 0;
            } else if (iH2 == 1) {
                i18 = 1;
            } else if (iH2 == 2) {
                i18 = 2;
            }
            sVar.q(3);
            iB = (sVar.h(11) + 1) * 2;
            int iH3 = sVar.h(2);
            if (iH3 == 3) {
                i10 = f63948c[sVar.h(2)];
                i14 = 6;
                iH = 3;
            } else {
                iH = sVar.h(2);
                i14 = f63946a[iH];
                i10 = f63947b[iH3];
            }
            i11 = i14 * 256;
            int iH4 = sVar.h(3);
            boolean zG = sVar.g();
            i12 = f63949d[iH4] + (zG ? 1 : 0);
            sVar.q(10);
            if (sVar.g()) {
                sVar.q(8);
            }
            if (iH4 == 0) {
                sVar.q(5);
                if (sVar.g()) {
                    sVar.q(8);
                }
            }
            if (i18 == 1 && sVar.g()) {
                sVar.q(16);
            }
            if (sVar.g()) {
                if (iH4 > 2) {
                    sVar.q(2);
                }
                if ((iH4 & 1) == 0 || iH4 <= 2) {
                    i16 = 6;
                } else {
                    i16 = 6;
                    sVar.q(6);
                }
                if ((iH4 & 4) != 0) {
                    sVar.q(i16);
                }
                if (zG && sVar.g()) {
                    sVar.q(5);
                }
                if (i18 == 0) {
                    if (sVar.g()) {
                        i17 = 6;
                        sVar.q(6);
                    } else {
                        i17 = 6;
                    }
                    if (iH4 == 0 && sVar.g()) {
                        sVar.q(i17);
                    }
                    if (sVar.g()) {
                        sVar.q(i17);
                    }
                    int iH5 = sVar.h(2);
                    if (iH5 == 1) {
                        sVar.q(5);
                    } else if (iH5 == 2) {
                        sVar.q(12);
                    } else if (iH5 == 3) {
                        int iH6 = sVar.h(5);
                        if (sVar.g()) {
                            sVar.q(5);
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                sVar.q(4);
                            }
                            if (sVar.g()) {
                                if (sVar.g()) {
                                    sVar.q(4);
                                }
                                if (sVar.g()) {
                                    sVar.q(4);
                                }
                            }
                        }
                        if (sVar.g()) {
                            sVar.q(5);
                            if (sVar.g()) {
                                sVar.q(7);
                                if (sVar.g()) {
                                    sVar.q(8);
                                }
                            }
                        }
                        sVar.q((iH6 + 2) * 8);
                        sVar.c();
                    }
                    if (iH4 < 2) {
                        if (sVar.g()) {
                            sVar.q(14);
                        }
                        if (iH4 == 0 && sVar.g()) {
                            sVar.q(14);
                        }
                    }
                    if (sVar.g()) {
                        if (iH == 0) {
                            sVar.q(5);
                        } else {
                            for (int i19 = 0; i19 < i14; i19++) {
                                if (sVar.g()) {
                                    sVar.q(5);
                                }
                            }
                        }
                    }
                }
            }
            if (sVar.g()) {
                sVar.q(5);
                if (iH4 == 2) {
                    sVar.q(4);
                }
                if (iH4 >= 6) {
                    sVar.q(2);
                }
                if (sVar.g()) {
                    sVar.q(8);
                }
                if (iH4 == 0 && sVar.g()) {
                    sVar.q(8);
                }
                if (iH3 < 3) {
                    sVar.p();
                }
            }
            if (i18 == 0 && iH != 3) {
                sVar.p();
            }
            if (i18 == 2 && (iH == 3 || sVar.g())) {
                i15 = 6;
                sVar.q(6);
            } else {
                i15 = 6;
            }
            str = (sVar.g() && sVar.h(i15) == 1 && sVar.h(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i13 = i18;
        } else {
            sVar.q(32);
            int iH7 = sVar.h(2);
            String str2 = iH7 == 3 ? null : "audio/ac3";
            iB = b(iH7, sVar.h(6));
            sVar.q(8);
            int iH8 = sVar.h(3);
            if ((iH8 & 1) != 0 && iH8 != 1) {
                sVar.q(2);
            }
            if ((iH8 & 4) != 0) {
                sVar.q(2);
            }
            if (iH8 == 2) {
                sVar.q(2);
            }
            int[] iArr = f63947b;
            i10 = iH7 < iArr.length ? iArr[iH7] : -1;
            i11 = 1536;
            i12 = f63949d[iH8] + (sVar.g() ? 1 : 0);
            i13 = -1;
            str = str2;
        }
        return new b(str, i13, i12, i10, iB, i11);
    }

    public static int a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit() - 10;
        for (int i10 = iPosition; i10 <= iLimit; i10++) {
            if ((byteBuffer.getInt(i10 + 4) & (-16777217)) == -1167101192) {
                return i10 - iPosition;
            }
        }
        return -1;
    }

    public static Format c(t tVar, String str, String str2, @Nullable DrmInitData drmInitData) {
        int i10 = f63947b[(tVar.y() & 192) >> 6];
        int iY = tVar.y();
        int i11 = f63949d[(iY & 56) >> 3];
        if ((iY & 4) != 0) {
            i11++;
        }
        return Format.p(str, "audio/ac3", null, -1, -1, i11, i10, null, drmInitData, 0, str2);
    }

    public static int d(ByteBuffer byteBuffer) {
        boolean z10;
        int i10 = 3;
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
                i10 = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
            }
            return f63946a[i10] * 256;
        }
        return 1536;
    }

    public static int h(ByteBuffer byteBuffer, int i10) {
        boolean z10;
        int i11;
        if ((byteBuffer.get(byteBuffer.position() + i10 + 7) & 255) == 187) {
            z10 = true;
        } else {
            z10 = false;
        }
        int iPosition = byteBuffer.position() + i10;
        if (z10) {
            i11 = 9;
        } else {
            i11 = 8;
        }
        return 40 << ((byteBuffer.get(iPosition + i11) >> 4) & 7);
    }
}
