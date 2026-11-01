package z1;

import ck.p;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import io.bidmachine.iab.vast.tags.VastAttributes;
import kotlin.Metadata;

/* JADX INFO: compiled from: Operator.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u001d\u0010\u0004\u001a\u00020\u00022\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0007¢\u0006\u0004\b\u0004\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J-\u0010\u0015\u001a\u00020\u00022\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\r2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0018\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\nH\u0007¨\u0006\u001e"}, d2 = {"Lz1/h;", "", "Lz1/a;", VastAttributes.HORIZONTAL_POSITION, "b", "Lmj/r;", "a", "w", "h", "i", "", "startDim", InneractiveMediationDefs.GENDER_FEMALE, "", "tensors", "([Lz1/a;)Lz1/a;", "j", "d", "", "texts", "seqLength", "e", "([Ljava/lang/String;ILz1/a;)Lz1/a;", CampaignEx.JSON_KEY_AD_K, "l", "c", "poolSize", "g", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f85893a = new h();

    public static final void a(a aVar, a aVar2) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            p.j(aVar, VastAttributes.HORIZONTAL_POSITION);
            p.j(aVar2, "b");
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            int iB3 = aVar.b(2);
            float[] data = aVar.getData();
            float[] data2 = aVar2.getData();
            if (iB <= 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                if (iB2 > 0) {
                    int i12 = 0;
                    while (true) {
                        int i13 = i12 + 1;
                        if (iB3 > 0) {
                            int i14 = 0;
                            while (true) {
                                int i15 = i14 + 1;
                                int i16 = (i10 * iB2 * iB3) + (i12 * iB3) + i14;
                                data[i16] = data[i16] + data2[i14];
                                if (i15 >= iB3) {
                                    break;
                                } else {
                                    i14 = i15;
                                }
                            }
                        }
                        if (i13 >= iB2) {
                            break;
                        } else {
                            i12 = i13;
                        }
                    }
                }
                if (i11 >= iB) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final a b(a[] tensors) {
        int iB;
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(tensors, "tensors");
            int i10 = 0;
            int iB2 = tensors[0].b(0);
            int length = tensors.length - 1;
            if (length >= 0) {
                int i11 = 0;
                iB = 0;
                while (true) {
                    int i12 = i11 + 1;
                    iB += tensors[i11].b(1);
                    if (i12 > length) {
                        break;
                    }
                    i11 = i12;
                }
            } else {
                iB = 0;
            }
            a aVar = new a(new int[]{iB2, iB});
            float[] data = aVar.getData();
            if (iB2 > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    int i15 = i13 * iB;
                    int length2 = tensors.length - 1;
                    if (length2 >= 0) {
                        int i16 = i10;
                        while (true) {
                            int i17 = i16 + 1;
                            float[] data2 = tensors[i16].getData();
                            int iB3 = tensors[i16].b(1);
                            System.arraycopy(data2, i13 * iB3, data, i15, iB3);
                            i15 += iB3;
                            if (i17 > length2) {
                                break;
                            }
                            i16 = i17;
                        }
                    }
                    if (i14 >= iB2) {
                        break;
                    }
                    i13 = i14;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final a c(a x10, a w10) {
        Class<h> cls;
        Class<h> cls2;
        a aVar;
        Class<h> cls3 = h.class;
        if (i2.a.d(cls3)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            p.j(w10, "w");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int iB4 = w10.b(0);
            int i11 = (iB2 - iB4) + 1;
            int iB5 = w10.b(2);
            a aVar2 = new a(new int[]{iB, i11, iB5});
            float[] data = x10.getData();
            float[] data2 = aVar2.getData();
            float[] data3 = w10.getData();
            if (iB <= 0) {
                return aVar2;
            }
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (iB5 > 0) {
                    int i14 = i10;
                    while (true) {
                        int i15 = i14 + 1;
                        if (i11 > 0) {
                            int i16 = 0;
                            while (true) {
                                int i17 = i16 + 1;
                                float f10 = 0.0f;
                                if (iB4 > 0) {
                                    int i18 = 0;
                                    while (true) {
                                        cls2 = cls3;
                                        int i19 = i18 + 1;
                                        if (iB3 > 0) {
                                            int i20 = 0;
                                            while (true) {
                                                aVar = aVar2;
                                                int i21 = i20 + 1;
                                                try {
                                                    f10 += data[(iB2 * iB3 * i12) + ((i18 + i16) * iB3) + i20] * data3[(((i18 * iB3) + i20) * iB5) + i14];
                                                    if (i21 >= iB3) {
                                                        break;
                                                    }
                                                    i20 = i21;
                                                    aVar2 = aVar;
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    cls = cls2;
                                                    i2.a.b(th, cls);
                                                    return null;
                                                }
                                            }
                                        } else {
                                            aVar = aVar2;
                                        }
                                        if (i19 >= iB4) {
                                            break;
                                        }
                                        i18 = i19;
                                        cls3 = cls2;
                                        aVar2 = aVar;
                                    }
                                } else {
                                    cls2 = cls3;
                                    aVar = aVar2;
                                }
                                data2[(i11 * iB5 * i12) + (i16 * iB5) + i14] = f10;
                                if (i17 >= i11) {
                                    break;
                                }
                                i16 = i17;
                                cls3 = cls2;
                                aVar2 = aVar;
                            }
                        } else {
                            cls2 = cls3;
                            aVar = aVar2;
                        }
                        if (i15 >= iB5) {
                            break;
                        }
                        i14 = i15;
                        cls3 = cls2;
                        aVar2 = aVar;
                    }
                } else {
                    cls2 = cls3;
                    aVar = aVar2;
                }
                if (i13 >= iB) {
                    return aVar;
                }
                i12 = i13;
                cls3 = cls2;
                aVar2 = aVar;
                i10 = 0;
            }
        } catch (Throwable th3) {
            th = th3;
            cls = cls3;
        }
    }

    public static final a d(a x10, a w10, a b10) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            p.j(w10, "w");
            p.j(b10, "b");
            int iB = x10.b(0);
            int iB2 = b10.b(0);
            a aVarH = h(x10, w10);
            float[] data = b10.getData();
            float[] data2 = aVarH.getData();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            int i14 = (i10 * iB2) + i12;
                            data2[i14] = data2[i14] + data[i12];
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVarH;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final a e(String[] texts, int seqLength, a w10) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(texts, "texts");
            p.j(w10, "w");
            int length = texts.length;
            int iB = w10.b(1);
            a aVar = new a(new int[]{length, seqLength, iB});
            float[] data = aVar.getData();
            float[] data2 = w10.getData();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    int[] iArrD = i.f85894a.d(texts[i10], seqLength);
                    if (seqLength > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            System.arraycopy(data2, iArrD[i12] * iB, data, (iB * seqLength * i10) + (i12 * iB), iB);
                            if (i13 >= seqLength) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final void f(a aVar, int i10) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            p.j(aVar, VastAttributes.HORIZONTAL_POSITION);
            if (i10 >= aVar.c()) {
                return;
            }
            int iC = aVar.c();
            int iB = 1;
            if (i10 < iC) {
                int i11 = i10;
                while (true) {
                    int i12 = i11 + 1;
                    iB *= aVar.b(i11);
                    if (i12 >= iC) {
                        break;
                    } else {
                        i11 = i12;
                    }
                }
            }
            int[] iArr = new int[i10 + 1];
            int i13 = 0;
            if (i10 > 0) {
                while (true) {
                    int i14 = i13 + 1;
                    iArr[i13] = aVar.b(i13);
                    if (i14 >= i10) {
                        break;
                    } else {
                        i13 = i14;
                    }
                }
            }
            iArr[i10] = iB;
            aVar.d(iArr);
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final a g(a x10, int poolSize) {
        int i10;
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            int i11 = 0;
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            int i12 = (iB2 - poolSize) + 1;
            a aVar = new a(new int[]{iB, i12, iB3});
            float[] data = x10.getData();
            float[] data2 = aVar.getData();
            if (iB > 0) {
                int i13 = 0;
                while (true) {
                    int i14 = i13 + 1;
                    if (iB3 > 0) {
                        int i15 = i11;
                        while (true) {
                            int i16 = i15 + 1;
                            if (i12 > 0) {
                                int i17 = i11;
                                while (true) {
                                    int i18 = i17 + 1;
                                    int i19 = i17 * iB3;
                                    int i20 = (i13 * i12 * iB3) + i19 + i15;
                                    int i21 = (i13 * iB2 * iB3) + i19 + i15;
                                    data2[i20] = Float.MIN_VALUE;
                                    if (poolSize > 0) {
                                        int i22 = 0;
                                        while (true) {
                                            int i23 = i22 + 1;
                                            i10 = iB2;
                                            data2[i20] = Math.max(data2[i20], data[i21 + (i22 * iB3)]);
                                            if (i23 >= poolSize) {
                                                break;
                                            }
                                            i22 = i23;
                                            iB2 = i10;
                                        }
                                    } else {
                                        i10 = iB2;
                                    }
                                    if (i18 >= i12) {
                                        break;
                                    }
                                    i17 = i18;
                                    iB2 = i10;
                                }
                            } else {
                                i10 = iB2;
                            }
                            if (i16 >= iB3) {
                                break;
                            }
                            i15 = i16;
                            iB2 = i10;
                            i11 = 0;
                        }
                    } else {
                        i10 = iB2;
                    }
                    if (i14 >= iB) {
                        break;
                    }
                    i13 = i14;
                    iB2 = i10;
                    i11 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final a h(a x10, a w10) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            p.j(w10, "w");
            int i10 = 0;
            int iB = x10.b(0);
            int iB2 = w10.b(0);
            int iB3 = w10.b(1);
            a aVar = new a(new int[]{iB, iB3});
            float[] data = x10.getData();
            float[] data2 = w10.getData();
            float[] data3 = aVar.getData();
            if (iB > 0) {
                int i11 = 0;
                while (true) {
                    int i12 = i11 + 1;
                    if (iB3 > 0) {
                        int i13 = i10;
                        while (true) {
                            int i14 = i13 + 1;
                            int i15 = (i11 * iB3) + i13;
                            data3[i15] = 0.0f;
                            if (iB2 > 0) {
                                int i16 = i10;
                                while (true) {
                                    int i17 = i16 + 1;
                                    data3[i15] = data3[i15] + (data[(i11 * iB2) + i16] * data2[(i16 * iB3) + i13]);
                                    if (i17 >= iB2) {
                                        break;
                                    }
                                    i16 = i17;
                                }
                            }
                            if (i14 >= iB3) {
                                break;
                            }
                            i13 = i14;
                            i10 = 0;
                        }
                    }
                    if (i12 >= iB) {
                        break;
                    }
                    i11 = i12;
                    i10 = 0;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final void i(a aVar) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            p.j(aVar, VastAttributes.HORIZONTAL_POSITION);
            float[] data = aVar.getData();
            int i10 = 0;
            int length = data.length - 1;
            if (length < 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                if (data[i10] < 0.0f) {
                    data[i10] = 0.0f;
                }
                if (i11 > length) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final void j(a aVar) {
        if (i2.a.d(h.class)) {
            return;
        }
        try {
            p.j(aVar, VastAttributes.HORIZONTAL_POSITION);
            int i10 = 0;
            int iB = aVar.b(0);
            int iB2 = aVar.b(1);
            float[] data = aVar.getData();
            if (iB <= 0) {
                return;
            }
            while (true) {
                int i11 = i10 + 1;
                int i12 = i10 * iB2;
                int i13 = i12 + iB2;
                float f10 = Float.MIN_VALUE;
                float f11 = 0.0f;
                if (i12 < i13) {
                    int i14 = i12;
                    while (true) {
                        int i15 = i14 + 1;
                        float f12 = data[i14];
                        if (f12 > f10) {
                            f10 = f12;
                        }
                        if (i15 >= i13) {
                            break;
                        } else {
                            i14 = i15;
                        }
                    }
                }
                if (i12 < i13) {
                    int i16 = i12;
                    while (true) {
                        int i17 = i16 + 1;
                        float fExp = (float) Math.exp(data[i16] - f10);
                        data[i16] = fExp;
                        f11 += fExp;
                        if (i17 >= i13) {
                            break;
                        } else {
                            i16 = i17;
                        }
                    }
                }
                if (i12 < i13) {
                    while (true) {
                        int i18 = i12 + 1;
                        data[i12] = data[i12] / f11;
                        if (i18 >= i13) {
                            break;
                        } else {
                            i12 = i18;
                        }
                    }
                }
                if (i11 >= iB) {
                    return;
                } else {
                    i10 = i11;
                }
            }
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
        }
    }

    public static final a k(a x10) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            a aVar = new a(new int[]{iB2, iB});
            float[] data = x10.getData();
            float[] data2 = aVar.getData();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            data2[(i12 * iB) + i10] = data[(i10 * iB2) + i12];
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }

    public static final a l(a x10) {
        if (i2.a.d(h.class)) {
            return null;
        }
        try {
            p.j(x10, VastAttributes.HORIZONTAL_POSITION);
            int iB = x10.b(0);
            int iB2 = x10.b(1);
            int iB3 = x10.b(2);
            a aVar = new a(new int[]{iB3, iB2, iB});
            float[] data = x10.getData();
            float[] data2 = aVar.getData();
            if (iB > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    if (iB2 > 0) {
                        int i12 = 0;
                        while (true) {
                            int i13 = i12 + 1;
                            if (iB3 > 0) {
                                int i14 = 0;
                                while (true) {
                                    int i15 = i14 + 1;
                                    data2[(i14 * iB * iB2) + (i12 * iB) + i10] = data[(i10 * iB2 * iB3) + (i12 * iB3) + i14];
                                    if (i15 >= iB3) {
                                        break;
                                    }
                                    i14 = i15;
                                }
                            }
                            if (i13 >= iB2) {
                                break;
                            }
                            i12 = i13;
                        }
                    }
                    if (i11 >= iB) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return aVar;
        } catch (Throwable th2) {
            i2.a.b(th2, h.class);
            return null;
        }
    }
}
