package com.bytedance.adsdk.vt.lh.lh;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.util.LongSparseArray;
import com.bytedance.adsdk.vt.lh.ouw.cf;
import com.bytedance.adsdk.vt.lh.vt.rn;
import com.bytedance.adsdk.vt.ouw.vt.ko;
import com.bytedance.adsdk.vt.zin;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public final class bly extends com.bytedance.adsdk.vt.lh.lh.ouw {

    /* JADX INFO: renamed from: cd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11130cd;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private final StringBuilder f11131cf;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ex;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> jae;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final Paint f11132jg;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> jqy;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final Paint f11133ko;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ksc;
    private final Matrix mwh;

    /* JADX INFO: renamed from: od, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> f11134od;

    /* JADX INFO: renamed from: pd, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Typeface, Typeface> f11135pd;
    private final com.bytedance.adsdk.vt.bly qbp;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final Map<com.bytedance.adsdk.vt.lh.yu, List<com.bytedance.adsdk.vt.ouw.ouw.yu>> f11136rn;
    private final RectF ryl;

    /* JADX INFO: renamed from: tc, reason: collision with root package name */
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> f11137tc;

    /* JADX INFO: renamed from: th, reason: collision with root package name */
    private final ko f11138th;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> uq;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private final List<ouw> f11139vm;
    private com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> vpp;
    private final LongSparseArray<String> zih;
    private final com.bytedance.adsdk.vt.ra zin;

    public static class ouw {
        public String ouw;
        public float vt;

        private ouw() {
            this.ouw = "";
            this.vt = 0.0f;
        }

        public final void ouw(String str, float f10) {
            this.ouw = str;
            this.vt = f10;
        }

        public /* synthetic */ ouw(byte b10) {
            this();
        }
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.ouw, com.bytedance.adsdk.vt.ouw.ouw.fkw
    public final void ouw(RectF rectF, Matrix matrix, boolean z10) {
        super.ouw(rectF, matrix, z10);
        rectF.set(0.0f, 0.0f, this.zin.bly.width(), this.zin.bly.height());
    }

    /* JADX WARN: Code duplicated, block: B:52:0x0140  */
    /* JADX WARN: Code duplicated, block: B:54:0x014c  */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0167  */
    /* JADX WARN: Code duplicated, block: B:62:0x0180  */
    /* JADX WARN: Code duplicated, block: B:64:0x0198  */
    /* JADX WARN: Code duplicated, block: B:66:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3 A[LOOP:4: B:68:0x01c1->B:69:0x01c3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:76:0x022d  */
    /* JADX WARN: Code duplicated, block: B:77:0x0238  */
    /* JADX WARN: Code duplicated, block: B:80:0x0254  */
    @Override // com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        float fFloatValue;
        float f10;
        int i11;
        int i12;
        PointF pointF;
        float f11;
        List<ouw> listOuw;
        int i13;
        int i14;
        String str;
        int i15;
        com.bytedance.adsdk.vt.lh.yu yuVar;
        int i16;
        List<String> list;
        List<rn> list2;
        int size;
        ArrayList arrayList;
        int i17;
        List<com.bytedance.adsdk.vt.ouw.ouw.yu> list3;
        int i18;
        Path pathYu;
        super.vt(canvas, matrix, i10);
        com.bytedance.adsdk.vt.lh.vt vtVarLe = this.f11138th.le();
        com.bytedance.adsdk.vt.lh.lh lhVar = this.zin.yu.get(vtVarLe.vt);
        if (lhVar == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar = this.jqy;
        if (ouwVar != null) {
            this.f11132jg.setColor(ouwVar.le().intValue());
        } else {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar2 = this.vpp;
            if (ouwVar2 != null) {
                this.f11132jg.setColor(ouwVar2.le().intValue());
            } else {
                this.f11132jg.setColor(vtVarLe.pno);
            }
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar3 = this.f11137tc;
        if (ouwVar3 != null) {
            this.f11133ko.setColor(ouwVar3.le().intValue());
        } else {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar4 = this.ex;
            if (ouwVar4 != null) {
                this.f11133ko.setColor(ouwVar4.le().intValue());
            } else {
                this.f11133ko.setColor(vtVarLe.bly);
            }
        }
        com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVar5 = this.fkw.fkw;
        int iIntValue = ((ouwVar5 == null ? 100 : ouwVar5.le().intValue()) * 255) / 100;
        this.f11132jg.setAlpha(iIntValue);
        this.f11133ko.setAlpha(iIntValue);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar6 = this.jae;
        if (ouwVar6 != null) {
            this.f11133ko.setStrokeWidth(ouwVar6.le().floatValue());
        } else {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar7 = this.ksc;
            if (ouwVar7 != null) {
                this.f11133ko.setStrokeWidth(ouwVar7.le().floatValue());
            } else {
                this.f11133ko.setStrokeWidth(vtVarLe.tlj * com.bytedance.adsdk.vt.le.pno.ouw());
            }
        }
        com.bytedance.adsdk.vt.bly blyVar = this.qbp;
        if (blyVar.mwh == null && blyVar.f11086rn == null && blyVar.ouw.f11319le.size() > 0) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar8 = this.uq;
            float fFloatValue2 = (ouwVar8 != null ? ouwVar8.le().floatValue() : vtVarLe.f11194lh) / 100.0f;
            com.bytedance.adsdk.vt.le.pno.ouw(matrix);
            List<String> listOuw2 = ouw(vtVarLe.ouw);
            int size2 = listOuw2.size();
            float f12 = vtVarLe.fkw / 10.0f;
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar9 = this.f11130cd;
            if (ouwVar9 != null) {
                fFloatValue = ouwVar9.le().floatValue();
            } else {
                com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar10 = this.f11134od;
                if (ouwVar10 != null) {
                    fFloatValue = ouwVar10.le().floatValue();
                }
                f10 = f12;
                i11 = -1;
                i12 = 0;
                while (i12 < size2) {
                    String str2 = listOuw2.get(i12);
                    pointF = vtVarLe.mwh;
                    if (pointF == null) {
                        f11 = 0.0f;
                    } else {
                        f11 = pointF.x;
                    }
                    int i19 = i12;
                    listOuw = ouw(str2, f11, lhVar, fFloatValue2, f10, true);
                    i13 = 0;
                    while (i13 < listOuw.size()) {
                        ouw ouwVar11 = listOuw.get(i13);
                        i14 = i11 + 1;
                        canvas.save();
                        ouw(canvas, vtVarLe, i14, ouwVar11.vt);
                        str = ouwVar11.ouw;
                        i15 = 0;
                        while (i15 < str.length()) {
                            yuVar = this.zin.f11319le.get(com.bytedance.adsdk.vt.lh.yu.ouw(str.charAt(i15), lhVar.ouw, lhVar.f11129lh));
                            if (yuVar != null) {
                                if (this.f11136rn.containsKey(yuVar)) {
                                    list3 = this.f11136rn.get(yuVar);
                                    i16 = i14;
                                    list = listOuw2;
                                } else {
                                    list2 = yuVar.ouw;
                                    size = list2.size();
                                    arrayList = new ArrayList(size);
                                    i17 = 0;
                                    while (i17 < size) {
                                        arrayList.add(new com.bytedance.adsdk.vt.ouw.ouw.yu(this.qbp, this, list2.get(i17), this.zin));
                                        i17++;
                                        list2 = list2;
                                        i14 = i14;
                                        size = size;
                                        listOuw2 = listOuw2;
                                    }
                                    i16 = i14;
                                    list = listOuw2;
                                    this.f11136rn.put(yuVar, arrayList);
                                    list3 = arrayList;
                                }
                                for (i18 = 0; i18 < list3.size(); i18++) {
                                    pathYu = list3.get(i18).yu();
                                    pathYu.computeBounds(this.ryl, false);
                                    this.mwh.reset();
                                    this.mwh.preTranslate(0.0f, (-vtVarLe.f11195ra) * com.bytedance.adsdk.vt.le.pno.ouw());
                                    this.mwh.preScale(fFloatValue2, fFloatValue2);
                                    pathYu.transform(this.mwh);
                                    if (vtVarLe.f11192cf) {
                                        ouw(pathYu, this.f11132jg, canvas);
                                        ouw(pathYu, this.f11133ko, canvas);
                                    } else {
                                        ouw(pathYu, this.f11133ko, canvas);
                                        ouw(pathYu, this.f11132jg, canvas);
                                    }
                                }
                                canvas.translate((((float) yuVar.vt) * fFloatValue2 * com.bytedance.adsdk.vt.le.pno.ouw()) + f10, 0.0f);
                            } else {
                                listOuw = listOuw;
                                str = str;
                                i16 = i14;
                                list = listOuw2;
                            }
                            i15++;
                            listOuw = listOuw;
                            str = str;
                            i14 = i16;
                            listOuw2 = list;
                        }
                        canvas.restore();
                        i13++;
                        i11 = i14;
                    }
                    i12 = i19 + 1;
                }
            }
            f12 += fFloatValue;
            f10 = f12;
            i11 = -1;
            i12 = 0;
            while (i12 < size2) {
                String str3 = listOuw2.get(i12);
                pointF = vtVarLe.mwh;
                if (pointF == null) {
                    f11 = 0.0f;
                } else {
                    f11 = pointF.x;
                }
                int i110 = i12;
                listOuw = ouw(str3, f11, lhVar, fFloatValue2, f10, true);
                i13 = 0;
                while (i13 < listOuw.size()) {
                    ouw ouwVar12 = listOuw.get(i13);
                    i14 = i11 + 1;
                    canvas.save();
                    ouw(canvas, vtVarLe, i14, ouwVar12.vt);
                    str = ouwVar12.ouw;
                    i15 = 0;
                    while (i15 < str.length()) {
                        yuVar = this.zin.f11319le.get(com.bytedance.adsdk.vt.lh.yu.ouw(str.charAt(i15), lhVar.ouw, lhVar.f11129lh));
                        if (yuVar != null) {
                            if (this.f11136rn.containsKey(yuVar)) {
                                list3 = this.f11136rn.get(yuVar);
                                i16 = i14;
                                list = listOuw2;
                            } else {
                                list2 = yuVar.ouw;
                                size = list2.size();
                                arrayList = new ArrayList(size);
                                i17 = 0;
                                while (i17 < size) {
                                    arrayList.add(new com.bytedance.adsdk.vt.ouw.ouw.yu(this.qbp, this, list2.get(i17), this.zin));
                                    i17++;
                                    list2 = list2;
                                    i14 = i14;
                                    size = size;
                                    listOuw2 = listOuw2;
                                }
                                i16 = i14;
                                list = listOuw2;
                                this.f11136rn.put(yuVar, arrayList);
                                list3 = arrayList;
                            }
                            while (i18 < list3.size()) {
                                pathYu = list3.get(i18).yu();
                                pathYu.computeBounds(this.ryl, false);
                                this.mwh.reset();
                                this.mwh.preTranslate(0.0f, (-vtVarLe.f11195ra) * com.bytedance.adsdk.vt.le.pno.ouw());
                                this.mwh.preScale(fFloatValue2, fFloatValue2);
                                pathYu.transform(this.mwh);
                                if (vtVarLe.f11192cf) {
                                    ouw(pathYu, this.f11132jg, canvas);
                                    ouw(pathYu, this.f11133ko, canvas);
                                } else {
                                    ouw(pathYu, this.f11133ko, canvas);
                                    ouw(pathYu, this.f11132jg, canvas);
                                }
                            }
                            canvas.translate((((float) yuVar.vt) * fFloatValue2 * com.bytedance.adsdk.vt.le.pno.ouw()) + f10, 0.0f);
                        } else {
                            listOuw = listOuw;
                            str = str;
                            i16 = i14;
                            list = listOuw2;
                        }
                        i15++;
                        listOuw = listOuw;
                        str = str;
                        i14 = i16;
                        listOuw2 = list;
                    }
                    canvas.restore();
                    i13++;
                    i11 = i14;
                }
                i12 = i110 + 1;
            }
        } else {
            ouw(vtVarLe, lhVar, canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.vt.lh.lh.bly$3, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] ouw;

        static {
            int[] iArr = new int[com.bytedance.adsdk.vt.lh.vt.ouw.values().length];
            ouw = iArr;
            try {
                iArr[com.bytedance.adsdk.vt.lh.vt.ouw.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.ouw.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ouw[com.bytedance.adsdk.vt.lh.vt.ouw.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public bly(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar) {
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar;
        com.bytedance.adsdk.vt.lh.ouw.vt vtVar2;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar;
        com.bytedance.adsdk.vt.lh.ouw.ouw ouwVar2;
        super(blyVar, fkwVar);
        this.f11131cf = new StringBuilder(2);
        this.ryl = new RectF();
        this.mwh = new Matrix();
        this.f11132jg = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.1
            {
                setStyle(Paint.Style.FILL);
            }
        };
        this.f11133ko = new Paint() { // from class: com.bytedance.adsdk.vt.lh.lh.bly.2
            {
                setStyle(Paint.Style.STROKE);
            }
        };
        this.f11136rn = new HashMap();
        this.zih = new LongSparseArray<>();
        this.f11139vm = new ArrayList();
        this.qbp = blyVar;
        this.zin = fkwVar.vt;
        ko koVarOuw = fkwVar.zih.ouw();
        this.f11138th = koVarOuw;
        koVarOuw.ouw(this);
        ouw(koVarOuw);
        cf cfVar = fkwVar.f11148vm;
        if (cfVar != null && (ouwVar2 = cfVar.ouw) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw = ouwVar2.ouw();
            this.vpp = ouwVarOuw;
            ouwVarOuw.ouw(this);
            ouw(this.vpp);
        }
        if (cfVar != null && (ouwVar = cfVar.vt) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Integer, Integer> ouwVarOuw2 = ouwVar.ouw();
            this.ex = ouwVarOuw2;
            ouwVarOuw2.ouw(this);
            ouw(this.ex);
        }
        if (cfVar != null && (vtVar2 = cfVar.f11188lh) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw3 = vtVar2.ouw();
            this.ksc = ouwVarOuw3;
            ouwVarOuw3.ouw(this);
            ouw(this.ksc);
        }
        if (cfVar != null && (vtVar = cfVar.yu) != null) {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVarOuw4 = vtVar.ouw();
            this.f11134od = ouwVarOuw4;
            ouwVarOuw4.ouw(this);
            ouw(this.f11134od);
        }
    }

    private static void ouw(Canvas canvas, com.bytedance.adsdk.vt.lh.vt vtVar, int i10, float f10) {
        PointF pointF = vtVar.ryl;
        PointF pointF2 = vtVar.mwh;
        float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
        float f11 = (i10 * vtVar.f11193le * fOuw) + (pointF == null ? 0.0f : (vtVar.f11193le * 0.6f * fOuw) + pointF.y);
        float f12 = pointF == null ? 0.0f : pointF.x;
        float f13 = pointF2 != null ? pointF2.x : 0.0f;
        int i11 = AnonymousClass3.ouw[vtVar.yu.ordinal()];
        if (i11 == 1) {
            canvas.translate(f12, f11);
        } else if (i11 == 2) {
            canvas.translate((f12 + f13) - f10, f11);
        } else {
            if (i11 != 3) {
                return;
            }
            canvas.translate((f12 + (f13 / 2.0f)) - (f10 / 2.0f), f11);
        }
    }

    private static List<String> ouw(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
    }

    private List<ouw> ouw(String str, float f10, com.bytedance.adsdk.vt.lh.lh lhVar, float f11, float f12, boolean z10) {
        float fMeasureText;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        int i10 = 0;
        int i11 = 0;
        boolean z11 = false;
        int i12 = 0;
        for (int i13 = 0; i13 < str.length(); i13++) {
            char cCharAt = str.charAt(i13);
            if (z10) {
                com.bytedance.adsdk.vt.lh.yu yuVar = this.zin.f11319le.get(com.bytedance.adsdk.vt.lh.yu.ouw(cCharAt, lhVar.ouw, lhVar.f11129lh));
                if (yuVar != null) {
                    fMeasureText = ((float) yuVar.vt) * f11 * com.bytedance.adsdk.vt.le.pno.ouw();
                }
            } else {
                fMeasureText = this.f11132jg.measureText(str.substring(i13, i13 + 1));
            }
            float f16 = fMeasureText + f12;
            if (cCharAt == ' ') {
                z11 = true;
                f15 = f16;
            } else if (z11) {
                z11 = false;
                i12 = i13;
                f14 = f16;
            } else {
                f14 += f16;
            }
            f13 += f16;
            if (f10 > 0.0f && f13 >= f10 && cCharAt != ' ') {
                i10++;
                ouw ouwVarVt = vt(i10);
                if (i12 == i11) {
                    String strSubstring = str.substring(i11, i13);
                    String strTrim = strSubstring.trim();
                    ouwVarVt.ouw(strTrim, (f13 - f16) - ((strTrim.length() - strSubstring.length()) * f15));
                    i11 = i13;
                    i12 = i11;
                    f13 = f16;
                    f14 = f13;
                } else {
                    String strSubstring2 = str.substring(i11, i12 - 1);
                    String strTrim2 = strSubstring2.trim();
                    ouwVarVt.ouw(strTrim2, ((f13 - f14) - ((strSubstring2.length() - strTrim2.length()) * f15)) - f15);
                    f13 = f14;
                    i11 = i12;
                }
            }
        }
        if (f13 > 0.0f) {
            i10++;
            vt(i10).ouw(str.substring(i11), f13);
        }
        return this.f11139vm.subList(0, i10);
    }

    private static void ouw(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    private static void ouw(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:101:0x0205  */
    /* JADX WARN: Code duplicated, block: B:103:0x020e A[LOOP:4: B:102:0x020c->B:103:0x020e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x0238  */
    /* JADX WARN: Code duplicated, block: B:108:0x0243  */
    /* JADX WARN: Code duplicated, block: B:118:0x01ef A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01f1 A[EDGE_INSN: B:119:0x01f1->B:98:0x01f1 BREAK  A[LOOP:3: B:78:0x01a3->B:96:0x01e4], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0061  */
    /* JADX WARN: Code duplicated, block: B:20:0x0067  */
    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097  */
    /* JADX WARN: Code duplicated, block: B:29:0x0099 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:31:0x009d  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x0158  */
    /* JADX WARN: Code duplicated, block: B:69:0x0164  */
    /* JADX WARN: Code duplicated, block: B:70:0x0166  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x019a  */
    /* JADX WARN: Code duplicated, block: B:80:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:94:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:96:0x01e4 A[LOOP:3: B:78:0x01a3->B:96:0x01e4, LOOP_END] */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v0, types: [T, java.lang.String] */
    private void ouw(com.bytedance.adsdk.vt.lh.vt vtVar, com.bytedance.adsdk.vt.lh.lh lhVar, Canvas canvas) {
        com.bytedance.adsdk.vt.vt.ouw ouwVarBly;
        Typeface typefaceLe;
        Typeface typefaceOuw;
        boolean zContains;
        boolean zContains2;
        int i10;
        float fFloatValue;
        float fFloatValue2;
        float fOuw;
        List<String> listOuw;
        int size;
        int i11;
        int i12;
        PointF pointF;
        float f10;
        boolean z10;
        List<ouw> listOuw2;
        int i13;
        String str;
        int length;
        int iCodePointAt;
        int iCharCount;
        List<ouw> list;
        long j10;
        int iCharCount2;
        String str2;
        String string;
        int iCodePointAt2;
        boolean z11;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Typeface, Typeface> ouwVar = this.f11135pd;
        if (ouwVar == null || (typefaceLe = ouwVar.le()) == null) {
            com.bytedance.adsdk.vt.bly blyVar = this.qbp;
            Map<String, Typeface> map = blyVar.mwh;
            if (map != null) {
                String str3 = lhVar.ouw;
                if (map.containsKey(str3)) {
                    typefaceLe = map.get(str3);
                } else {
                    String str4 = lhVar.vt;
                    if (map.containsKey(str4)) {
                        typefaceLe = map.get(str4);
                    } else {
                        String str5 = lhVar.ouw + "-" + lhVar.f11129lh;
                        if (map.containsKey(str5)) {
                            typefaceLe = map.get(str5);
                        } else {
                            ouwVarBly = blyVar.bly();
                            if (ouwVarBly != null) {
                                com.bytedance.adsdk.vt.lh.ra<String> raVar = ouwVarBly.ouw;
                                ?? r10 = lhVar.ouw;
                                ?? r11 = lhVar.f11129lh;
                                raVar.ouw = r10;
                                raVar.vt = r11;
                                typefaceOuw = ouwVarBly.vt.get(raVar);
                                if (typefaceOuw == null) {
                                    typefaceOuw = ouwVarBly.ouw(lhVar);
                                    String str6 = lhVar.f11129lh;
                                    zContains = str6.contains("Italic");
                                    zContains2 = str6.contains("Bold");
                                    if (!zContains && zContains2) {
                                        i10 = 3;
                                    } else if (zContains) {
                                        i10 = 2;
                                    } else if (zContains2) {
                                        i10 = 1;
                                    } else {
                                        i10 = 0;
                                    }
                                    if (typefaceOuw.getStyle() != i10) {
                                        typefaceOuw = Typeface.create(typefaceOuw, i10);
                                    }
                                    ouwVarBly.vt.put(ouwVarBly.ouw, typefaceOuw);
                                }
                                typefaceLe = typefaceOuw;
                            } else {
                                typefaceLe = null;
                            }
                        }
                    }
                }
            } else {
                ouwVarBly = blyVar.bly();
                if (ouwVarBly != null) {
                    com.bytedance.adsdk.vt.lh.ra<String> raVar2 = ouwVarBly.ouw;
                    ?? r12 = lhVar.ouw;
                    ?? r13 = lhVar.f11129lh;
                    raVar2.ouw = r12;
                    raVar2.vt = r13;
                    typefaceOuw = ouwVarBly.vt.get(raVar2);
                    if (typefaceOuw == null) {
                        typefaceOuw = ouwVarBly.ouw(lhVar);
                        String str7 = lhVar.f11129lh;
                        zContains = str7.contains("Italic");
                        zContains2 = str7.contains("Bold");
                        if (!zContains) {
                            if (zContains) {
                                i10 = 2;
                            } else if (zContains2) {
                                i10 = 1;
                            } else {
                                i10 = 0;
                            }
                        } else if (zContains) {
                            i10 = 2;
                        } else if (zContains2) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (typefaceOuw.getStyle() != i10) {
                            typefaceOuw = Typeface.create(typefaceOuw, i10);
                        }
                        ouwVarBly.vt.put(ouwVarBly.ouw, typefaceOuw);
                    }
                    typefaceLe = typefaceOuw;
                } else {
                    typefaceLe = null;
                }
            }
            if (typefaceLe == null) {
                typefaceLe = lhVar.yu;
            }
        }
        if (typefaceLe == null) {
            return;
        }
        String str8 = vtVar.ouw;
        zin zinVar = this.qbp.f11086rn;
        if (zinVar != null) {
            if (zinVar.vt && zinVar.ouw.containsKey(str8)) {
                str8 = zinVar.ouw.get(str8);
            } else {
                String strOuw = zin.ouw(str8);
                if (zinVar.vt) {
                    zinVar.ouw.put(str8, strOuw);
                }
                str8 = strOuw;
            }
        }
        this.f11132jg.setTypeface(typefaceLe);
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar2 = this.uq;
        if (ouwVar2 != null) {
            fFloatValue = ouwVar2.le().floatValue();
        } else {
            fFloatValue = vtVar.f11194lh;
        }
        this.f11132jg.setTextSize(com.bytedance.adsdk.vt.le.pno.ouw() * fFloatValue);
        this.f11133ko.setTypeface(this.f11132jg.getTypeface());
        this.f11133ko.setTextSize(this.f11132jg.getTextSize());
        float f11 = vtVar.fkw / 10.0f;
        com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar3 = this.f11130cd;
        if (ouwVar3 != null) {
            fFloatValue2 = ouwVar3.le().floatValue();
        } else {
            com.bytedance.adsdk.vt.ouw.vt.ouw<Float, Float> ouwVar4 = this.f11134od;
            if (ouwVar4 != null) {
                fFloatValue2 = ouwVar4.le().floatValue();
            }
            fOuw = ((f11 * com.bytedance.adsdk.vt.le.pno.ouw()) * fFloatValue) / 100.0f;
            listOuw = ouw(str8);
            size = listOuw.size();
            i11 = -1;
            i12 = 0;
            while (i12 < size) {
                String str9 = listOuw.get(i12);
                pointF = vtVar.mwh;
                if (pointF == null) {
                    f10 = 0.0f;
                } else {
                    f10 = pointF.x;
                }
                z10 = false;
                int i14 = i12;
                listOuw2 = ouw(str9, f10, lhVar, 0.0f, fOuw, false);
                i13 = 0;
                while (i13 < listOuw2.size()) {
                    ouw ouwVar5 = listOuw2.get(i13);
                    int i15 = i11 + 1;
                    canvas.save();
                    ouw(canvas, vtVar, i15, ouwVar5.vt);
                    str = ouwVar5.ouw;
                    length = 0;
                    while (length < str.length()) {
                        iCodePointAt = str.codePointAt(length);
                        iCharCount = Character.charCount(iCodePointAt) + length;
                        while (true) {
                            if (iCharCount < str.length()) {
                                list = listOuw2;
                                break;
                            }
                            iCodePointAt2 = str.codePointAt(iCharCount);
                            list = listOuw2;
                            if (Character.getType(iCodePointAt2) != 16 || Character.getType(iCodePointAt2) == 27 || Character.getType(iCodePointAt2) == 6 || Character.getType(iCodePointAt2) == 28 || Character.getType(iCodePointAt2) == 8 || Character.getType(iCodePointAt2) == 19) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (z11) {
                                break;
                            }
                            iCharCount += Character.charCount(iCodePointAt2);
                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            listOuw2 = list;
                        }
                        j10 = iCodePointAt;
                        if (this.zih.indexOfKey(j10) >= 0) {
                            string = this.zih.get(j10);
                            str2 = str;
                        } else {
                            this.f11131cf.setLength(0);
                            iCharCount2 = length;
                            while (iCharCount2 < iCharCount) {
                                int iCodePointAt3 = str.codePointAt(iCharCount2);
                                this.f11131cf.appendCodePoint(iCodePointAt3);
                                iCharCount2 += Character.charCount(iCodePointAt3);
                                str = str;
                            }
                            str2 = str;
                            string = this.f11131cf.toString();
                            this.zih.put(j10, string);
                        }
                        length += string.length();
                        if (vtVar.f11192cf) {
                            ouw(string, this.f11132jg, canvas);
                            ouw(string, this.f11133ko, canvas);
                        } else {
                            ouw(string, this.f11133ko, canvas);
                            ouw(string, this.f11132jg, canvas);
                        }
                        canvas.translate(this.f11132jg.measureText(string) + fOuw, 0.0f);
                        z10 = false;
                        str = str2;
                        listOuw2 = list;
                    }
                    canvas.restore();
                    i13++;
                    i11 = i15;
                }
                i12 = i14 + 1;
            }
        }
        f11 += fFloatValue2;
        fOuw = ((f11 * com.bytedance.adsdk.vt.le.pno.ouw()) * fFloatValue) / 100.0f;
        listOuw = ouw(str8);
        size = listOuw.size();
        i11 = -1;
        i12 = 0;
        while (i12 < size) {
            String str10 = listOuw.get(i12);
            pointF = vtVar.mwh;
            if (pointF == null) {
                f10 = 0.0f;
            } else {
                f10 = pointF.x;
            }
            z10 = false;
            int i16 = i12;
            listOuw2 = ouw(str10, f10, lhVar, 0.0f, fOuw, false);
            i13 = 0;
            while (i13 < listOuw2.size()) {
                ouw ouwVar6 = listOuw2.get(i13);
                int i17 = i11 + 1;
                canvas.save();
                ouw(canvas, vtVar, i17, ouwVar6.vt);
                str = ouwVar6.ouw;
                length = 0;
                while (length < str.length()) {
                    iCodePointAt = str.codePointAt(length);
                    iCharCount = Character.charCount(iCodePointAt) + length;
                    while (true) {
                        if (iCharCount < str.length()) {
                            list = listOuw2;
                            break;
                        }
                        iCodePointAt2 = str.codePointAt(iCharCount);
                        list = listOuw2;
                        if (Character.getType(iCodePointAt2) != 16) {
                            z11 = true;
                        } else {
                            z11 = true;
                        }
                        if (z11) {
                            break;
                            break;
                        } else {
                            iCharCount += Character.charCount(iCodePointAt2);
                            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
                            listOuw2 = list;
                        }
                    }
                    j10 = iCodePointAt;
                    if (this.zih.indexOfKey(j10) >= 0) {
                        string = this.zih.get(j10);
                        str2 = str;
                    } else {
                        this.f11131cf.setLength(0);
                        iCharCount2 = length;
                        while (iCharCount2 < iCharCount) {
                            int iCodePointAt4 = str.codePointAt(iCharCount2);
                            this.f11131cf.appendCodePoint(iCodePointAt4);
                            iCharCount2 += Character.charCount(iCodePointAt4);
                            str = str;
                        }
                        str2 = str;
                        string = this.f11131cf.toString();
                        this.zih.put(j10, string);
                    }
                    length += string.length();
                    if (vtVar.f11192cf) {
                        ouw(string, this.f11132jg, canvas);
                        ouw(string, this.f11133ko, canvas);
                    } else {
                        ouw(string, this.f11133ko, canvas);
                        ouw(string, this.f11132jg, canvas);
                    }
                    canvas.translate(this.f11132jg.measureText(string) + fOuw, 0.0f);
                    z10 = false;
                    str = str2;
                    listOuw2 = list;
                }
                canvas.restore();
                i13++;
                i11 = i17;
            }
            i12 = i16 + 1;
        }
    }

    private ouw vt(int i10) {
        for (int size = this.f11139vm.size(); size < i10; size++) {
            this.f11139vm.add(new ouw((byte) 0));
        }
        return this.f11139vm.get(i10 - 1);
    }
}
