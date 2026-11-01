package com.bytedance.adsdk.vt.lh.lh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.text.TextUtils;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.adsdk.vt.zin;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class lh extends yu {

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    public String f11155cf;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private final LinearLayout.LayoutParams f11156jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private final List<String> f11157ko;
    private LinearLayout mwh;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private final List<TextView> f11158rn;

    private static void ouw(TextView textView, com.bytedance.adsdk.vt.tlj.ouw ouwVar, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setText("");
        } else {
            textView.setText(str);
        }
        if (!TextUtils.isEmpty(ouwVar.f11346lh)) {
            textView.setTextColor(Color.parseColor(ouwVar.f11346lh));
        }
        if (!TextUtils.isEmpty(ouwVar.yu)) {
            textView.setBackgroundColor(Color.parseColor(ouwVar.yu));
        }
        textView.setGravity(17);
        textView.setTextSize(ouwVar.fkw);
    }

    private List<String> yu() {
        com.bytedance.adsdk.vt.bly blyVar;
        List<com.bytedance.adsdk.vt.tlj.ouw> list;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar == null || (blyVar = this.vt) == null || blyVar.f11086rn == null) {
            return null;
        }
        String str = tljVar.f11342le;
        if ((!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f11155cf)) && (list = ((yu) this).ryl.f11344ra) != null) {
            String strOuw = this.f11155cf;
            if (TextUtils.isEmpty(strOuw)) {
                strOuw = zin.ouw(str);
            }
            if (!TextUtils.isEmpty(strOuw)) {
                int length = strOuw.length();
                this.f11157ko.clear();
                for (int i10 = 0; i10 < list.size(); i10++) {
                    com.bytedance.adsdk.vt.tlj.ouw ouwVar = list.get(i10);
                    int iMax = ouwVar.ouw;
                    int iMax2 = ouwVar.vt;
                    if (iMax < 0) {
                        iMax = Math.max(iMax + length, 0);
                    }
                    if (iMax2 < 0) {
                        iMax2 = Math.max(iMax2 + length, 0);
                    }
                    if (iMax + iMax2 > length) {
                        this.f11157ko.add("");
                    } else {
                        if (list.size() == 1 && iMax == 0 && iMax2 == 0) {
                            iMax2 = length;
                        }
                        this.f11157ko.add(strOuw.substring(iMax, iMax2 + iMax));
                    }
                }
                return this.f11157ko;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.vt.lh.lh.yu, com.bytedance.adsdk.vt.lh.lh.ouw
    public final void vt(Canvas canvas, Matrix matrix, int i10) {
        List<com.bytedance.adsdk.vt.tlj.ouw> list;
        if (this.mwh == null) {
            super.vt(canvas, matrix, i10);
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        ouw(i10);
        float f10 = this.tlj;
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar != null && (list = tljVar.f11344ra) != null && list.size() > 0) {
            this.mwh.setOrientation(0);
            this.mwh.setGravity(17);
            if (this.mwh.getChildCount() > 0) {
                LinearLayout linearLayout = (LinearLayout) this.mwh.getChildAt(0);
                linearLayout.setOrientation(0);
                linearLayout.setGravity(80);
                this.mwh.removeAllViews();
                if (linearLayout.getChildCount() == list.size()) {
                    List<String> listYu = yu();
                    this.f11158rn.clear();
                    int i11 = 0;
                    while (i11 < list.size()) {
                        com.bytedance.adsdk.vt.tlj.ouw ouwVar = list.get(i11);
                        TextView textView = (TextView) linearLayout.getChildAt(i11);
                        this.f11158rn.add(textView);
                        ouw(textView, ouwVar, (listYu == null || i11 >= listYu.size()) ? "" : listYu.get(i11));
                        i11++;
                    }
                    linearLayout.removeAllViews();
                    for (int i12 = 0; i12 < list.size(); i12++) {
                        com.bytedance.adsdk.vt.tlj.ouw ouwVar2 = list.get(i12);
                        TextView textView2 = this.f11158rn.get(i12);
                        textView2.setAlpha(f10);
                        linearLayout.setAlpha(f10);
                        int i13 = ouwVar2.f11345le;
                        if (i13 != 0) {
                            this.f11156jg.bottomMargin = (int) (i13 * com.bytedance.adsdk.vt.le.pno.ouw());
                            linearLayout.addView(textView2, this.f11156jg);
                        } else {
                            linearLayout.addView(textView2);
                        }
                    }
                    this.mwh.setAlpha(f10);
                    this.mwh.addView(linearLayout);
                    float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
                    LinearLayout linearLayout2 = this.mwh;
                    com.bytedance.adsdk.vt.tlj tljVar2 = ((yu) this).ryl;
                    ouw(linearLayout2, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
                }
            }
        }
        this.mwh.draw(canvas);
        canvas.restore();
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0062  */
    public lh(com.bytedance.adsdk.vt.bly blyVar, fkw fkwVar, Context context) {
        List<com.bytedance.adsdk.vt.tlj.ouw> list;
        String str;
        super(blyVar, fkwVar);
        this.f11156jg = new LinearLayout.LayoutParams(-2, -2);
        this.f11157ko = new ArrayList();
        this.f11158rn = new ArrayList();
        com.bytedance.adsdk.vt.tlj tljVar = ((yu) this).ryl;
        if (tljVar != null && (list = tljVar.f11344ra) != null && list.size() > 0) {
            LinearLayout linearLayout = new LinearLayout(context);
            this.mwh = linearLayout;
            linearLayout.setOrientation(0);
            String str2 = list.get(0).f11347ra;
            if (!TextUtils.isEmpty(str2)) {
                str2.hashCode();
                if (!str2.equals("left")) {
                    if (str2.equals("right")) {
                        this.mwh.setGravity(5);
                    } else {
                        this.mwh.setGravity(17);
                    }
                } else {
                    this.mwh.setGravity(3);
                }
            } else {
                this.mwh.setGravity(17);
            }
            LinearLayout linearLayout2 = new LinearLayout(context);
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(80);
            this.mwh.addView(linearLayout2);
            List<String> listYu = yu();
            for (int i10 = 0; i10 < list.size(); i10++) {
                com.bytedance.adsdk.vt.tlj.ouw ouwVar = list.get(i10);
                TextView textView = new TextView(context);
                if (listYu != null && i10 < listYu.size()) {
                    str = listYu.get(i10);
                } else {
                    str = "";
                }
                ouw(textView, ouwVar, str);
                int i11 = ouwVar.f11345le;
                if (i11 != 0) {
                    this.f11156jg.bottomMargin = (int) (i11 * com.bytedance.adsdk.vt.le.pno.ouw());
                    linearLayout2.addView(textView, this.f11156jg);
                } else {
                    linearLayout2.addView(textView);
                }
            }
            float fOuw = com.bytedance.adsdk.vt.le.pno.ouw();
            LinearLayout linearLayout3 = this.mwh;
            com.bytedance.adsdk.vt.tlj tljVar2 = ((yu) this).ryl;
            ouw(linearLayout3, (int) (tljVar2.ouw * fOuw), (int) (tljVar2.vt * fOuw));
        }
    }

    private static void ouw(View view, int i10, int i11) {
        view.layout(0, 0, i10, i11);
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), View.MeasureSpec.makeMeasureSpec(i11, 1073741824));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
    }
}
