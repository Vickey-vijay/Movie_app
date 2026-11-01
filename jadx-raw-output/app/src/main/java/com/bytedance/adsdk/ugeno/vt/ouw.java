package com.bytedance.adsdk.ugeno.vt;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.ra.ra;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class ouw<E extends ViewGroup> extends lh {
    public List<lh<View>> ouw;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.vt.ouw$ouw, reason: collision with other inner class name */
    public static class C0074ouw {
        public float bly;

        /* JADX INFO: renamed from: cf, reason: collision with root package name */
        public float f11004cf;
        public ViewGroup.LayoutParams ex;
        public float fkw;

        /* JADX INFO: renamed from: jg, reason: collision with root package name */
        public float f11005jg;
        public boolean jqy;

        /* JADX INFO: renamed from: ko, reason: collision with root package name */
        public boolean f11006ko;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        public float f11007le;
        public float mwh;
        public float pno;
        public boolean qbp;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        public float f11009ra;

        /* JADX INFO: renamed from: rn, reason: collision with root package name */
        public boolean f11010rn;
        public float ryl;

        /* JADX INFO: renamed from: tc, reason: collision with root package name */
        public ouw f11011tc;

        /* JADX INFO: renamed from: th, reason: collision with root package name */
        public boolean f11012th;
        public float tlj;

        /* JADX INFO: renamed from: vm, reason: collision with root package name */
        public boolean f11013vm;
        public boolean vpp;
        public boolean zih;
        public boolean zin;
        public float ouw = -2.0f;
        public float vt = -2.0f;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f11008lh = 0.0f;
        public float yu = 0.0f;

        public void ouw(Context context, String str, String str2) {
            if (TextUtils.isEmpty(str)) {
            }
            str.hashCode();
            switch (str) {
                case "paddingLeft":
                    this.f11004cf = ra.ouw(context, str2);
                    this.f11010rn = true;
                    break;
                case "minWidth":
                    this.f11008lh = ra.ouw(context, str2);
                    break;
                case "height":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.vt = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.vt = ra.ouw(context, str2);
                        } else {
                            this.vt = -2.0f;
                        }
                        break;
                    }
                    break;
                case "margin":
                    this.fkw = ra.ouw(context, str2);
                    break;
                case "marginTop":
                    this.pno = ra.ouw(context, str2);
                    this.vpp = true;
                    break;
                case "padding":
                    this.tlj = ra.ouw(context, str2);
                    this.f11006ko = true;
                    break;
                case "marginBottom":
                    this.bly = ra.ouw(context, str2);
                    this.jqy = true;
                    break;
                case "minHeight":
                    this.yu = ra.ouw(context, str2);
                    break;
                case "paddingTop":
                    this.ryl = ra.ouw(context, str2);
                    this.f11013vm = true;
                    break;
                case "width":
                    if (TextUtils.equals(str2, "match_parent")) {
                        this.ouw = -1.0f;
                        break;
                    } else {
                        if (!TextUtils.equals(str2, "wrap_content")) {
                            this.ouw = ra.ouw(context, str2);
                        } else {
                            this.ouw = -2.0f;
                        }
                        break;
                    }
                    break;
                case "paddingBottom":
                    this.f11005jg = ra.ouw(context, str2);
                    this.f11012th = true;
                    break;
                case "paddingRight":
                    this.mwh = ra.ouw(context, str2);
                    this.zih = true;
                    break;
                case "marginRight":
                    this.f11009ra = ra.ouw(context, str2);
                    this.zin = true;
                    break;
                case "marginLeft":
                    this.f11007le = ra.ouw(context, str2);
                    this.qbp = true;
                    break;
            }
        }

        public String toString() {
            return "LayoutParams{mWidth=" + this.ouw + ", mHeight=" + this.vt + ", mMargin=" + this.fkw + ", mMarginLeft=" + this.f11007le + ", mMarginRight=" + this.f11009ra + ", mMarginTop=" + this.pno + ", mMarginBottom=" + this.bly + ", mParams=" + this.ex + '}';
        }

        public C0074ouw(ouw ouwVar) {
            this.f11011tc = ouwVar;
        }

        public ViewGroup.LayoutParams ouw() {
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams((int) this.ouw, (int) this.vt);
            marginLayoutParams.leftMargin = (int) (this.qbp ? this.f11007le : this.fkw);
            marginLayoutParams.rightMargin = (int) (this.zin ? this.f11009ra : this.fkw);
            marginLayoutParams.topMargin = (int) (this.vpp ? this.pno : this.fkw);
            marginLayoutParams.bottomMargin = (int) (this.jqy ? this.bly : this.fkw);
            return marginLayoutParams;
        }
    }

    public ouw(Context context) {
        this(context, null);
    }

    public void ouw(lh lhVar) {
        if (lhVar == null) {
            return;
        }
        this.ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((ViewGroup) this.fkw).addView(view);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public void vt() {
        super.vt();
    }

    private ouw(Context context, ouw ouwVar) {
        super(context, ouwVar);
        this.ouw = new ArrayList();
    }

    public C0074ouw bly() {
        return new C0074ouw(this);
    }

    public final List<lh<View>> pno() {
        return this.ouw;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh vt(String str) {
        lh<T> lhVarLe;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.ryl)) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarLe = lhVar.le(str)) != 0) {
                return lhVarLe;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh lh(String str) {
        lh<T> lhVarRa;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.ryl) && this.xdk == 0) {
            return this;
        }
        if (this.xdk != 0) {
            return null;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarRa = lhVar.ra(str)) != 0) {
                return lhVarRa;
            }
        }
        return null;
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh yu(String str) {
        lh<T> lhVarPno;
        if (!TextUtils.isEmpty(str) && cf(str) != null) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarPno = lhVar.pno(str)) != 0) {
                return lhVarPno;
            }
        }
        return null;
    }

    public void ouw(lh lhVar, ViewGroup.LayoutParams layoutParams) {
        if (lhVar == null) {
            return;
        }
        this.ouw.add(lhVar);
        View view = lhVar.fkw;
        if (view != null) {
            ((ViewGroup) this.fkw).addView(view, layoutParams);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.vt.lh
    public final lh ouw(String str) {
        lh<T> lhVarFkw;
        if (!TextUtils.isEmpty(str) && TextUtils.equals(str, this.f10975cf)) {
            return this;
        }
        for (lh<View> lhVar : this.ouw) {
            if (lhVar != null && (lhVarFkw = lhVar.fkw(str)) != 0) {
                return lhVarFkw;
            }
        }
        return null;
    }
}
