package l6;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.zxing.ChecksumException;
import com.google.zxing.DecodeHintType;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import com.google.zxing.ResultMetadataType;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: compiled from: OneDReader.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class q implements y5.h {
    public static float d(int[] iArr, int[] iArr2, float f10) {
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            i10 += iArr[i12];
            i11 += iArr2[i12];
        }
        if (i10 < i11) {
            return Float.POSITIVE_INFINITY;
        }
        float f11 = i10;
        float f12 = f11 / i11;
        float f13 = f10 * f12;
        float f14 = 0.0f;
        for (int i13 = 0; i13 < length; i13++) {
            int i14 = iArr[i13];
            float f15 = iArr2[i13] * f12;
            float f16 = i14;
            float f17 = f16 > f15 ? f16 - f15 : f15 - f16;
            if (f17 > f13) {
                return Float.POSITIVE_INFINITY;
            }
            f14 += f17;
        }
        return f14 / f11;
    }

    public static void e(c6.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        int i11 = 0;
        Arrays.fill(iArr, 0, length, 0);
        int iL = aVar.l();
        if (i10 >= iL) {
            throw NotFoundException.getNotFoundInstance();
        }
        boolean z10 = !aVar.g(i10);
        while (i10 < iL) {
            if (aVar.g(i10) == z10) {
                i11++;
                if (i11 == length) {
                    break;
                }
                iArr[i11] = 1;
                z10 = !z10;
            } else {
                iArr[i11] = iArr[i11] + 1;
            }
            i10++;
        }
        if (i11 != length) {
            if (i11 != length - 1 || i10 != iL) {
                throw NotFoundException.getNotFoundInstance();
            }
        }
    }

    public static void f(c6.a aVar, int i10, int[] iArr) throws NotFoundException {
        int length = iArr.length;
        boolean zG = aVar.g(i10);
        while (i10 > 0 && length >= 0) {
            i10--;
            if (aVar.g(i10) != zG) {
                length--;
                zG = !zG;
            }
        }
        if (length >= 0) {
            throw NotFoundException.getNotFoundInstance();
        }
        e(aVar, i10 + 1, iArr);
    }

    public abstract y5.i b(int i10, c6.a aVar, Map<DecodeHintType, ?> map) throws NotFoundException, ChecksumException, FormatException;

    @Override // y5.h
    public void reset() {
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    public final y5.i c(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException {
        Map<DecodeHintType, ?> map2;
        int i10;
        int i11;
        Map<DecodeHintType, ?> map3 = map;
        int iD = bVar.d();
        int iC = bVar.c();
        c6.a aVar = new c6.a(iD);
        int i12 = 0;
        int i13 = 1;
        boolean z10 = map3 != null && map3.containsKey(DecodeHintType.TRY_HARDER);
        int iMax = Math.max(1, iC >> (z10 ? 8 : 5));
        int i14 = z10 ? iC : 15;
        int i15 = iC / 2;
        int i16 = 0;
        while (i16 < i14) {
            int i17 = i16 + 1;
            int i18 = i17 / 2;
            if (((i16 & 1) == 0 ? i13 : i12) == 0) {
                i18 = -i18;
            }
            int i19 = (i18 * iMax) + i15;
            if (i19 < 0 || i19 >= iC) {
                break;
            }
            try {
                aVar = bVar.b(i19, aVar);
                int i20 = i12;
                while (i20 < 2) {
                    if (i20 == i13) {
                        aVar.p();
                        if (map3 != null) {
                            DecodeHintType decodeHintType = DecodeHintType.NEED_RESULT_POINT_CALLBACK;
                            if (map3.containsKey(decodeHintType)) {
                                EnumMap enumMap = new EnumMap(DecodeHintType.class);
                                enumMap.putAll(map3);
                                enumMap.remove(decodeHintType);
                                map3 = enumMap;
                            }
                        }
                    }
                    try {
                        y5.i iVarB = b(i19, aVar, map3);
                        if (i20 == i13) {
                            try {
                                iVarB.h(ResultMetadataType.ORIENTATION, Integer.valueOf(BaseTransientBottomBar.ANIMATION_FADE_DURATION));
                                y5.j[] jVarArrE = iVarB.e();
                                if (jVarArrE != null) {
                                    map2 = map3;
                                    float f10 = iD;
                                    try {
                                        i10 = iD;
                                        try {
                                            jVarArrE[0] = new y5.j((f10 - jVarArrE[i12].c()) - 1.0f, jVarArrE[i12].d());
                                            i11 = 1;
                                            try {
                                                jVarArrE[1] = new y5.j((f10 - jVarArrE[1].c()) - 1.0f, jVarArrE[1].d());
                                            } catch (ReaderException unused) {
                                                continue;
                                                i20++;
                                                i13 = i11;
                                                map3 = map2;
                                                iD = i10;
                                                i12 = 0;
                                            }
                                        } catch (ReaderException unused2) {
                                            i11 = 1;
                                            i20++;
                                            i13 = i11;
                                            map3 = map2;
                                            iD = i10;
                                            i12 = 0;
                                        }
                                    } catch (ReaderException unused3) {
                                        i10 = iD;
                                        i11 = 1;
                                        i20++;
                                        i13 = i11;
                                        map3 = map2;
                                        iD = i10;
                                        i12 = 0;
                                    }
                                }
                            } catch (ReaderException unused4) {
                                map2 = map3;
                            }
                        }
                        return iVarB;
                    } catch (ReaderException unused5) {
                        map2 = map3;
                        i10 = iD;
                        i11 = i13;
                    }
                }
            } catch (NotFoundException unused6) {
            }
            i16 = i17;
            i13 = i13;
            iD = iD;
            i12 = 0;
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // y5.h
    public y5.i a(y5.b bVar, Map<DecodeHintType, ?> map) throws NotFoundException, FormatException {
        boolean z10;
        try {
            return c(bVar, map);
        } catch (NotFoundException e10) {
            if (map != null && map.containsKey(DecodeHintType.TRY_HARDER)) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 && bVar.e()) {
                y5.b bVarF = bVar.f();
                y5.i iVarC = c(bVarF, map);
                Map<ResultMetadataType, Object> mapD = iVarC.d();
                int iIntValue = 270;
                if (mapD != null) {
                    ResultMetadataType resultMetadataType = ResultMetadataType.ORIENTATION;
                    if (mapD.containsKey(resultMetadataType)) {
                        iIntValue = (((Integer) mapD.get(resultMetadataType)).intValue() + 270) % 360;
                    }
                }
                iVarC.h(ResultMetadataType.ORIENTATION, Integer.valueOf(iIntValue));
                y5.j[] jVarArrE = iVarC.e();
                if (jVarArrE != null) {
                    int iC = bVarF.c();
                    for (int i10 = 0; i10 < jVarArrE.length; i10++) {
                        jVarArrE[i10] = new y5.j((iC - jVarArrE[i10].d()) - 1.0f, jVarArrE[i10].c());
                    }
                }
                return iVarC;
            }
            throw e10;
        }
    }
}
