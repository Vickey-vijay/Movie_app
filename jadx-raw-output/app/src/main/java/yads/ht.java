package yads;

import androidx.core.internal.view.SupportMenu;
import androidx.core.view.InputDeviceCompat;
import com.explorestack.protobuf.openrtb.LossReason;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class ht extends pt {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f78353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f78354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f78355j;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public List f78359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public List f78360o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f78361p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f78362q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f78363r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f78364s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public byte f78365t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public byte f78366u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f78368w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f78369x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int[] f78350y = {11, 1, 3, 12, 14, 5, 7, 9};

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int[] f78351z = {0, 4, 8, 12, 16, 20, 24, 28};
    public static final int[] A = {-1, -16711936, -16776961, -16711681, SupportMenu.CATEGORY_MASK, InputDeviceCompat.SOURCE_ANY, -65281};
    public static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    public static final int[] C = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, Sdk.SDKError.Reason.PRIVACY_ICON_FALLBACK_ERROR_VALUE, 234, 238, 244, 251};
    public static final int[] D = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, Sdk.SDKError.Reason.MRAID_JS_DOES_NOT_EXIST_VALUE, Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, 202, 203, 235, 206, 207, 239, 212, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE, 249, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 171, 187};
    public static final int[] E = {195, 227, 205, 204, 236, 210, 242, Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, Sdk.SDKError.Reason.INVALID_GZIP_BID_PAYLOAD_VALUE, 246, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, 165, 164, 9474, 197, 229, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE, 248, 9484, 9488, 9492, 9496};
    public static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final jb2 f78352g = new jb2();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ArrayList f78357l = new ArrayList();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gt f78358m = new gt(0, 4);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f78367v = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f78356k = 16000000;

    /* JADX WARN: Code duplicated, block: B:132:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:134:0x01dc A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:139:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:142:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:145:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:148:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:149:0x020a  */
    /* JADX WARN: Code duplicated, block: B:150:0x0215  */
    /* JADX WARN: Code duplicated, block: B:151:0x0220 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x0222  */
    /* JADX WARN: Code duplicated, block: B:154:0x0227  */
    /* JADX WARN: Code duplicated, block: B:155:0x0232  */
    /* JADX WARN: Code duplicated, block: B:156:0x0237 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:157:0x0239  */
    /* JADX WARN: Code duplicated, block: B:159:0x0243  */
    /* JADX WARN: Code duplicated, block: B:164:0x0255  */
    /* JADX WARN: Code duplicated, block: B:167:0x027a A[LOOP:1: B:165:0x0272->B:167:0x027a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x0280  */
    /* JADX WARN: Code duplicated, block: B:170:0x028a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:171:0x028c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0291  */
    /* JADX WARN: Code duplicated, block: B:173:0x0298  */
    /* JADX WARN: Code duplicated, block: B:174:0x029d  */
    /* JADX WARN: Code duplicated, block: B:175:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:177:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:180:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:182:0x02cd  */
    /* JADX WARN: Code duplicated, block: B:200:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x008b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:202:0x0089 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:203:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:204:0x00c8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:209:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:210:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x0018 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x0121  */
    /* JADX WARN: Code duplicated, block: B:97:0x0153  */
    /* JADX WARN: Code duplicated, block: B:99:0x0157  */
    @Override // yads.pt
    public final void a(nt ntVar) {
        boolean z10;
        int i10;
        gt gtVar;
        int[] iArr;
        char c10;
        gt gtVar2;
        char c11;
        int i11;
        int i12;
        int i13;
        int i14;
        gt gtVar3;
        gt gtVar4;
        int iMin;
        ByteBuffer byteBuffer = ntVar.f82568d;
        byteBuffer.getClass();
        jb2 jb2Var = this.f78352g;
        byte[] bArrArray = byteBuffer.array();
        int iLimit = byteBuffer.limit();
        jb2Var.f78966a = bArrArray;
        jb2Var.f78968c = iLimit;
        jb2Var.f78967b = 0;
        boolean z11 = false;
        while (true) {
            jb2 jb2Var2 = this.f78352g;
            int i15 = jb2Var2.f78968c - jb2Var2.f78967b;
            int i16 = this.f78353h;
            if (i15 < i16) {
                if (z11) {
                    int i17 = this.f78361p;
                    if (i17 == 1 || i17 == 3) {
                        this.f78359n = g();
                        this.f78369x = this.f81586e;
                        return;
                    }
                    return;
                }
                return;
            }
            byte bM = i16 == 2 ? (byte) -4 : (byte) jb2Var2.m();
            int iM = this.f78352g.m();
            int iM2 = this.f78352g.m();
            if ((bM & 2) == 0 && (bM & 1) == this.f78354i) {
                byte b10 = (byte) (iM & 127);
                byte b11 = (byte) (iM2 & 127);
                if (b10 != 0 || b11 != 0) {
                    boolean z12 = this.f78363r;
                    if ((bM & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iM] && zArr[iM2]) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                    this.f78363r = z10;
                    if (!z10 || (b10 & 240) != 16) {
                        this.f78364s = false;
                        if (!z10) {
                            if (1 > b10 && b10 <= 15) {
                                this.f78368w = false;
                            } else if ((b10 & 247) == 20) {
                                if (b11 == 32 && b11 != 47) {
                                    switch (b11) {
                                        default:
                                            switch (b11) {
                                                case 42:
                                                case 43:
                                                    this.f78368w = false;
                                                    break;
                                            }
                                        case 37:
                                        case 38:
                                        case 39:
                                            this.f78368w = true;
                                            break;
                                    }
                                } else {
                                    this.f78368w = true;
                                }
                            }
                            if (this.f78368w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f78367v = (b10 >> 3) & 1;
                                }
                                if (this.f78367v != this.f78355j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17 || (b11 & 240) != 48) {
                                            i12 = b10 & 246;
                                            if (i12 != 18 && (b11 & 224) == 32) {
                                                this.f78358m.a();
                                                gt gtVar5 = this.f78358m;
                                                char c12 = (char) ((b10 & 1) == 0 ? D[b11 & 31] : E[b11 & 31]);
                                                if (gtVar5.f77924c.length() < 32) {
                                                    gtVar5.f77924c.append(c12);
                                                }
                                            } else if (i11 != 17 && (b11 & 240) == 32) {
                                                gt gtVar6 = this.f78358m;
                                                if (gtVar6.f77924c.length() < 32) {
                                                    gtVar6.f77924c.append(' ');
                                                }
                                                boolean z13 = (b11 & 1) == 1;
                                                gt gtVar7 = this.f78358m;
                                                gtVar7.f77922a.add(new ft((b11 >> 1) & 7, gtVar7.f77924c.length(), z13));
                                            } else if ((b10 & 240) != 16 && (b11 & 192) == 64) {
                                                int i18 = f78350y[b10 & 7];
                                                if ((b11 & 32) != 0) {
                                                    i18++;
                                                }
                                                gt gtVar8 = this.f78358m;
                                                if (i18 != gtVar8.f77925d) {
                                                    if (this.f78361p != 1 && (!gtVar8.f77922a.isEmpty() || !gtVar8.f77923b.isEmpty() || gtVar8.f77924c.length() != 0)) {
                                                        gt gtVar9 = new gt(this.f78361p, this.f78362q);
                                                        this.f78358m = gtVar9;
                                                        this.f78357l.add(gtVar9);
                                                    }
                                                    this.f78358m.f77925d = i18;
                                                }
                                                boolean z14 = (b11 & 16) == 16;
                                                boolean z15 = (b11 & 1) == 1;
                                                int i19 = (b11 >> 1) & 7;
                                                gt gtVar10 = this.f78358m;
                                                gtVar10.f77922a.add(new ft(z14 ? 8 : i19, gtVar10.f77924c.length(), z15));
                                                if (z14) {
                                                    this.f78358m.f77926e = f78351z[i19];
                                                }
                                            } else if (i11 != 23 && b11 >= 33 && b11 <= 35) {
                                                this.f78358m.f77927f = b11 - 32;
                                            } else if (i12 == 20 && (b11 & 240) == 32) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f78362q = 2;
                                                            this.f78358m.f77929h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f78362q = 3;
                                                            this.f78358m.f77929h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f78362q = 4;
                                                            this.f78358m.f77929h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f78361p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f78359n = Collections.emptyList();
                                                                            i14 = this.f78361p;
                                                                            if (i14 != 1 || i14 == 3) {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f78358m;
                                                                                if (gtVar3.f77922a.isEmpty() || !gtVar3.f77923b.isEmpty() || gtVar3.f77924c.length() != 0) {
                                                                                    gtVar4 = this.f78358m;
                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                    gtVar4.f77924c.setLength(0);
                                                                                    gtVar4.f77922a.clear();
                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                        gtVar4.f77923b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f78359n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f78358m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        } else {
                                            gt gtVar11 = this.f78358m;
                                            char c13 = (char) C[b11 & 15];
                                            if (gtVar11.f77924c.length() < 32) {
                                                gtVar11.f77924c.append(c13);
                                            }
                                        }
                                    } else {
                                        gtVar = this.f78358m;
                                        iArr = B;
                                        c10 = (char) iArr[(b10 & 127) - 32];
                                        if (gtVar.f77924c.length() < 32) {
                                            gtVar.f77924c.append(c10);
                                        }
                                        if ((b11 & 224) != 0) {
                                            gtVar2 = this.f78358m;
                                            c11 = (char) iArr[(b11 & 127) - 32];
                                            if (gtVar2.f77924c.length() < 32) {
                                                gtVar2.f77924c.append(c11);
                                            }
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    } else if (this.f78364s && this.f78365t == b10 && this.f78366u == b11) {
                        this.f78364s = false;
                    } else {
                        this.f78364s = true;
                        this.f78365t = b10;
                        this.f78366u = b11;
                        if (!z10) {
                            if (1 > b10) {
                                if ((b10 & 247) == 20) {
                                    if (b11 == 32) {
                                        this.f78368w = true;
                                    } else {
                                        this.f78368w = true;
                                    }
                                }
                            } else if ((b10 & 247) == 20) {
                                if (b11 == 32) {
                                    this.f78368w = true;
                                } else {
                                    this.f78368w = true;
                                }
                            }
                            if (this.f78368w) {
                                i10 = b10 & 224;
                                if (i10 == 0) {
                                    this.f78367v = (b10 >> 3) & 1;
                                }
                                if (this.f78367v != this.f78355j) {
                                    if (i10 == 0) {
                                        i11 = b10 & 247;
                                        if (i11 == 17) {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    a(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            a(1);
                                                                            this.f78362q = 2;
                                                                            this.f78358m.f77929h = 2;
                                                                            break;
                                                                        case 38:
                                                                            a(1);
                                                                            this.f78362q = 3;
                                                                            this.f78358m.f77929h = 3;
                                                                            break;
                                                                        case 39:
                                                                            a(1);
                                                                            this.f78362q = 4;
                                                                            this.f78358m.f77929h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f78361p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f78359n = Collections.emptyList();
                                                                                            i14 = this.f78361p;
                                                                                            if (i14 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                gtVar3 = this.f78358m;
                                                                                                if (gtVar3.f77922a.isEmpty()) {
                                                                                                    gtVar4 = this.f78358m;
                                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                                    gtVar4.f77924c.setLength(0);
                                                                                                    gtVar4.f77922a.clear();
                                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                                        gtVar4.f77923b.remove(0);
                                                                                                    }
                                                                                                } else {
                                                                                                    gtVar4 = this.f78358m;
                                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                                    gtVar4.f77924c.setLength(0);
                                                                                                    gtVar4.f77922a.clear();
                                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                                        gtVar4.f77923b.remove(0);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            h();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f78359n = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f78358m.a();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    a(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f78362q = 2;
                                                            this.f78358m.f77929h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f78362q = 3;
                                                            this.f78358m.f77929h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f78362q = 4;
                                                            this.f78358m.f77929h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f78361p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f78359n = Collections.emptyList();
                                                                            i14 = this.f78361p;
                                                                            if (i14 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f78358m;
                                                                                if (gtVar3.f77922a.isEmpty()) {
                                                                                    gtVar4 = this.f78358m;
                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                    gtVar4.f77924c.setLength(0);
                                                                                    gtVar4.f77922a.clear();
                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                        gtVar4.f77923b.remove(0);
                                                                                    }
                                                                                } else {
                                                                                    gtVar4 = this.f78358m;
                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                    gtVar4.f77924c.setLength(0);
                                                                                    gtVar4.f77922a.clear();
                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                        gtVar4.f77923b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f78359n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f78358m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        } else {
                                            i12 = b10 & 246;
                                            if (i12 != 18) {
                                                if (i11 != 17) {
                                                    if ((b10 & 240) != 16) {
                                                        if (i11 != 23) {
                                                            if (i12 == 20) {
                                                                if (b11 == 32) {
                                                                    a(2);
                                                                } else if (b11 != 41) {
                                                                    switch (b11) {
                                                                        case 37:
                                                                            a(1);
                                                                            this.f78362q = 2;
                                                                            this.f78358m.f77929h = 2;
                                                                            break;
                                                                        case 38:
                                                                            a(1);
                                                                            this.f78362q = 3;
                                                                            this.f78358m.f77929h = 3;
                                                                            break;
                                                                        case 39:
                                                                            a(1);
                                                                            this.f78362q = 4;
                                                                            this.f78358m.f77929h = 4;
                                                                            break;
                                                                        default:
                                                                            i13 = this.f78361p;
                                                                            if (i13 != 0) {
                                                                                if (b11 != 33) {
                                                                                    switch (b11) {
                                                                                        case 44:
                                                                                            this.f78359n = Collections.emptyList();
                                                                                            i14 = this.f78361p;
                                                                                            if (i14 != 1) {
                                                                                                h();
                                                                                            } else {
                                                                                                h();
                                                                                            }
                                                                                            break;
                                                                                        case 45:
                                                                                            if (i13 == 1) {
                                                                                                gtVar3 = this.f78358m;
                                                                                                if (gtVar3.f77922a.isEmpty()) {
                                                                                                    gtVar4 = this.f78358m;
                                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                                    gtVar4.f77924c.setLength(0);
                                                                                                    gtVar4.f77922a.clear();
                                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                                        gtVar4.f77923b.remove(0);
                                                                                                    }
                                                                                                } else {
                                                                                                    gtVar4 = this.f78358m;
                                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                                    gtVar4.f77924c.setLength(0);
                                                                                                    gtVar4.f77922a.clear();
                                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                                        gtVar4.f77923b.remove(0);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            break;
                                                                                        case 46:
                                                                                            h();
                                                                                            break;
                                                                                        case 47:
                                                                                            this.f78359n = g();
                                                                                            h();
                                                                                            break;
                                                                                    }
                                                                                } else {
                                                                                    this.f78358m.a();
                                                                                    break;
                                                                                }
                                                                            }
                                                                            break;
                                                                    }
                                                                } else {
                                                                    a(3);
                                                                }
                                                            }
                                                        } else if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 17) {
                                                if ((b10 & 240) != 16) {
                                                    if (i11 != 23) {
                                                        if (i12 == 20) {
                                                            if (b11 == 32) {
                                                                a(2);
                                                            } else if (b11 != 41) {
                                                                switch (b11) {
                                                                    case 37:
                                                                        a(1);
                                                                        this.f78362q = 2;
                                                                        this.f78358m.f77929h = 2;
                                                                        break;
                                                                    case 38:
                                                                        a(1);
                                                                        this.f78362q = 3;
                                                                        this.f78358m.f77929h = 3;
                                                                        break;
                                                                    case 39:
                                                                        a(1);
                                                                        this.f78362q = 4;
                                                                        this.f78358m.f77929h = 4;
                                                                        break;
                                                                    default:
                                                                        i13 = this.f78361p;
                                                                        if (i13 != 0) {
                                                                            if (b11 != 33) {
                                                                                switch (b11) {
                                                                                    case 44:
                                                                                        this.f78359n = Collections.emptyList();
                                                                                        i14 = this.f78361p;
                                                                                        if (i14 != 1) {
                                                                                            h();
                                                                                        } else {
                                                                                            h();
                                                                                        }
                                                                                        break;
                                                                                    case 45:
                                                                                        if (i13 == 1) {
                                                                                            gtVar3 = this.f78358m;
                                                                                            if (gtVar3.f77922a.isEmpty()) {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            } else {
                                                                                                gtVar4 = this.f78358m;
                                                                                                gtVar4.f77923b.add(gtVar4.b());
                                                                                                gtVar4.f77924c.setLength(0);
                                                                                                gtVar4.f77922a.clear();
                                                                                                iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                                while (gtVar4.f77923b.size() >= iMin) {
                                                                                                    gtVar4.f77923b.remove(0);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        break;
                                                                                    case 46:
                                                                                        h();
                                                                                        break;
                                                                                    case 47:
                                                                                        this.f78359n = g();
                                                                                        h();
                                                                                        break;
                                                                                }
                                                                            } else {
                                                                                this.f78358m.a();
                                                                                break;
                                                                            }
                                                                        }
                                                                        break;
                                                                }
                                                            } else {
                                                                a(3);
                                                            }
                                                        }
                                                    } else if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if ((b10 & 240) != 16) {
                                                if (i11 != 23) {
                                                    if (i12 == 20) {
                                                        if (b11 == 32) {
                                                            a(2);
                                                        } else if (b11 != 41) {
                                                            switch (b11) {
                                                                case 37:
                                                                    a(1);
                                                                    this.f78362q = 2;
                                                                    this.f78358m.f77929h = 2;
                                                                    break;
                                                                case 38:
                                                                    a(1);
                                                                    this.f78362q = 3;
                                                                    this.f78358m.f77929h = 3;
                                                                    break;
                                                                case 39:
                                                                    a(1);
                                                                    this.f78362q = 4;
                                                                    this.f78358m.f77929h = 4;
                                                                    break;
                                                                default:
                                                                    i13 = this.f78361p;
                                                                    if (i13 != 0) {
                                                                        if (b11 != 33) {
                                                                            switch (b11) {
                                                                                case 44:
                                                                                    this.f78359n = Collections.emptyList();
                                                                                    i14 = this.f78361p;
                                                                                    if (i14 != 1) {
                                                                                        h();
                                                                                    } else {
                                                                                        h();
                                                                                    }
                                                                                    break;
                                                                                case 45:
                                                                                    if (i13 == 1) {
                                                                                        gtVar3 = this.f78358m;
                                                                                        if (gtVar3.f77922a.isEmpty()) {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        } else {
                                                                                            gtVar4 = this.f78358m;
                                                                                            gtVar4.f77923b.add(gtVar4.b());
                                                                                            gtVar4.f77924c.setLength(0);
                                                                                            gtVar4.f77922a.clear();
                                                                                            iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                            while (gtVar4.f77923b.size() >= iMin) {
                                                                                                gtVar4.f77923b.remove(0);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    break;
                                                                                case 46:
                                                                                    h();
                                                                                    break;
                                                                                case 47:
                                                                                    this.f78359n = g();
                                                                                    h();
                                                                                    break;
                                                                            }
                                                                        } else {
                                                                            this.f78358m.a();
                                                                            break;
                                                                        }
                                                                    }
                                                                    break;
                                                            }
                                                        } else {
                                                            a(3);
                                                        }
                                                    }
                                                } else if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i11 != 23) {
                                                if (i12 == 20) {
                                                    if (b11 == 32) {
                                                        a(2);
                                                    } else if (b11 != 41) {
                                                        switch (b11) {
                                                            case 37:
                                                                a(1);
                                                                this.f78362q = 2;
                                                                this.f78358m.f77929h = 2;
                                                                break;
                                                            case 38:
                                                                a(1);
                                                                this.f78362q = 3;
                                                                this.f78358m.f77929h = 3;
                                                                break;
                                                            case 39:
                                                                a(1);
                                                                this.f78362q = 4;
                                                                this.f78358m.f77929h = 4;
                                                                break;
                                                            default:
                                                                i13 = this.f78361p;
                                                                if (i13 != 0) {
                                                                    if (b11 != 33) {
                                                                        switch (b11) {
                                                                            case 44:
                                                                                this.f78359n = Collections.emptyList();
                                                                                i14 = this.f78361p;
                                                                                if (i14 != 1) {
                                                                                    h();
                                                                                } else {
                                                                                    h();
                                                                                }
                                                                                break;
                                                                            case 45:
                                                                                if (i13 == 1) {
                                                                                    gtVar3 = this.f78358m;
                                                                                    if (gtVar3.f77922a.isEmpty()) {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    } else {
                                                                                        gtVar4 = this.f78358m;
                                                                                        gtVar4.f77923b.add(gtVar4.b());
                                                                                        gtVar4.f77924c.setLength(0);
                                                                                        gtVar4.f77922a.clear();
                                                                                        iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                        while (gtVar4.f77923b.size() >= iMin) {
                                                                                            gtVar4.f77923b.remove(0);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                break;
                                                                            case 46:
                                                                                h();
                                                                                break;
                                                                            case 47:
                                                                                this.f78359n = g();
                                                                                h();
                                                                                break;
                                                                        }
                                                                    } else {
                                                                        this.f78358m.a();
                                                                        break;
                                                                    }
                                                                }
                                                                break;
                                                        }
                                                    } else {
                                                        a(3);
                                                    }
                                                }
                                            } else if (i12 == 20) {
                                                if (b11 == 32) {
                                                    a(2);
                                                } else if (b11 != 41) {
                                                    switch (b11) {
                                                        case 37:
                                                            a(1);
                                                            this.f78362q = 2;
                                                            this.f78358m.f77929h = 2;
                                                            break;
                                                        case 38:
                                                            a(1);
                                                            this.f78362q = 3;
                                                            this.f78358m.f77929h = 3;
                                                            break;
                                                        case 39:
                                                            a(1);
                                                            this.f78362q = 4;
                                                            this.f78358m.f77929h = 4;
                                                            break;
                                                        default:
                                                            i13 = this.f78361p;
                                                            if (i13 != 0) {
                                                                if (b11 != 33) {
                                                                    switch (b11) {
                                                                        case 44:
                                                                            this.f78359n = Collections.emptyList();
                                                                            i14 = this.f78361p;
                                                                            if (i14 != 1) {
                                                                                h();
                                                                            } else {
                                                                                h();
                                                                            }
                                                                            break;
                                                                        case 45:
                                                                            if (i13 == 1) {
                                                                                gtVar3 = this.f78358m;
                                                                                if (gtVar3.f77922a.isEmpty()) {
                                                                                    gtVar4 = this.f78358m;
                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                    gtVar4.f77924c.setLength(0);
                                                                                    gtVar4.f77922a.clear();
                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                        gtVar4.f77923b.remove(0);
                                                                                    }
                                                                                } else {
                                                                                    gtVar4 = this.f78358m;
                                                                                    gtVar4.f77923b.add(gtVar4.b());
                                                                                    gtVar4.f77924c.setLength(0);
                                                                                    gtVar4.f77922a.clear();
                                                                                    iMin = Math.min(gtVar4.f77929h, gtVar4.f77925d);
                                                                                    while (gtVar4.f77923b.size() >= iMin) {
                                                                                        gtVar4.f77923b.remove(0);
                                                                                    }
                                                                                }
                                                                            }
                                                                            break;
                                                                        case 46:
                                                                            h();
                                                                            break;
                                                                        case 47:
                                                                            this.f78359n = g();
                                                                            h();
                                                                            break;
                                                                    }
                                                                } else {
                                                                    this.f78358m.a();
                                                                    break;
                                                                }
                                                            }
                                                            break;
                                                    }
                                                } else {
                                                    a(3);
                                                }
                                            }
                                        }
                                    } else {
                                        gtVar = this.f78358m;
                                        iArr = B;
                                        c10 = (char) iArr[(b10 & 127) - 32];
                                        if (gtVar.f77924c.length() < 32) {
                                            gtVar.f77924c.append(c10);
                                        }
                                        if ((b11 & 224) != 0) {
                                            gtVar2 = this.f78358m;
                                            c11 = (char) iArr[(b11 & 127) - 32];
                                            if (gtVar2.f77924c.length() < 32) {
                                                gtVar2.f77924c.append(c11);
                                            }
                                        }
                                    }
                                    z11 = true;
                                }
                            }
                        } else if (z12) {
                            h();
                            z11 = true;
                        }
                    }
                }
            }
        }
    }

    @Override // yads.pt, yads.oa0
    public final void release() {
    }

    @Override // yads.pt
    public final qt c() {
        List list = this.f78359n;
        this.f78360o = list;
        list.getClass();
        return new qt(list);
    }

    @Override // yads.pt
    public final boolean f() {
        return this.f78359n != this.f78360o;
    }

    public final ArrayList g() {
        int size = this.f78357l.size();
        ArrayList arrayList = new ArrayList(size);
        int iMin = 2;
        for (int i10 = 0; i10 < size; i10++) {
            o20 o20VarA = ((gt) this.f78357l.get(i10)).a(Integer.MIN_VALUE);
            arrayList.add(o20VarA);
            if (o20VarA != null) {
                iMin = Math.min(iMin, o20VarA.f80912j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            o20 o20VarA2 = (o20) arrayList.get(i11);
            if (o20VarA2 != null) {
                if (o20VarA2.f80912j != iMin) {
                    o20VarA2 = ((gt) this.f78357l.get(i11)).a(iMin);
                    o20VarA2.getClass();
                }
                arrayList2.add(o20VarA2);
            }
        }
        return arrayList2;
    }

    public final void h() {
        this.f78358m.b(this.f78361p);
        this.f78357l.clear();
        this.f78357l.add(this.f78358m);
    }

    public ht(String str, int i10) {
        int i11;
        if ("application/x-mp4-cea-608".equals(str)) {
            i11 = 2;
        } else {
            i11 = 3;
        }
        this.f78353h = i11;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        ih1.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                        this.f78355j = 0;
                        this.f78354i = 0;
                    } else {
                        this.f78355j = 1;
                        this.f78354i = 1;
                    }
                } else {
                    this.f78355j = 0;
                    this.f78354i = 1;
                }
            } else {
                this.f78355j = 1;
                this.f78354i = 0;
            }
        } else {
            this.f78355j = 0;
            this.f78354i = 0;
        }
        a(0);
        h();
        this.f78368w = true;
        this.f78369x = -9223372036854775807L;
    }

    @Override // yads.pt, yads.oa0
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final x43 a() {
        x43 x43VarE;
        x43 x43VarA = super.a();
        if (x43VarA != null) {
            return x43VarA;
        }
        long j10 = this.f78356k;
        if (j10 != -9223372036854775807L) {
            long j11 = this.f78369x;
            if (j11 != -9223372036854775807L && this.f81586e - j11 >= j10 && (x43VarE = e()) != null) {
                this.f78359n = Collections.emptyList();
                this.f78369x = -9223372036854775807L;
                qt qtVarC = c();
                long j12 = this.f81586e;
                x43VarE.f83403c = j12;
                x43VarE.f84450d = qtVarC;
                x43VarE.f84451e = j12;
                return x43VarE;
            }
            return null;
        }
        return null;
    }

    @Override // yads.pt, yads.oa0
    public final void flush() {
        super.flush();
        this.f78359n = null;
        this.f78360o = null;
        a(0);
        this.f78362q = 4;
        this.f78358m.f77929h = 4;
        h();
        this.f78363r = false;
        this.f78364s = false;
        this.f78365t = (byte) 0;
        this.f78366u = (byte) 0;
        this.f78367v = 0;
        this.f78368w = true;
        this.f78369x = -9223372036854775807L;
    }

    public final void a(int i10) {
        int i11 = this.f78361p;
        if (i11 == i10) {
            return;
        }
        this.f78361p = i10;
        if (i10 == 3) {
            for (int i12 = 0; i12 < this.f78357l.size(); i12++) {
                ((gt) this.f78357l.get(i12)).f77928g = i10;
            }
            return;
        }
        h();
        if (i11 == 3 || i10 == 1 || i10 == 0) {
            this.f78359n = Collections.emptyList();
        }
    }
}
