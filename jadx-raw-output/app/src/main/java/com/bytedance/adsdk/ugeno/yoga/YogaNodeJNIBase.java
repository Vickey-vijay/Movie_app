package com.bytedance.adsdk.ugeno.yoga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
@com.bytedance.adsdk.ugeno.yoga.ouw.ouw
public abstract class YogaNodeJNIBase extends tlj implements Cloneable {

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private float[] arr;
    private vt fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private Object f11017le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private List<YogaNodeJNIBase> f11018lh;

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private int mLayoutDirection;
    public long ouw;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private boolean f11019ra;
    private YogaNodeJNIBase vt;
    private ra yu;

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f11019ra = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.ouw = j10;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void bly(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void fkw() {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.ouw, 100.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void le() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i10)).f11018lh;
            if (list != null) {
                Iterator<YogaNodeJNIBase> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].ouw;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.ouw, Float.NaN, Float.NaN, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final int ouw() {
        List<YogaNodeJNIBase> list = this.f11018lh;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void pno() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.ouw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ra() {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.ouw, 100.0f);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void tlj(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void yu() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.ouw);
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List<YogaNodeJNIBase> list = this.f11018lh;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f11018lh.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.vt = this;
        return yogaNodeJNIBase.ouw;
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    public final float baseline(float f10, float f11) {
        return this.fkw.ouw();
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float bly() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float cf() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void fkw(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void jg() {
        YogaNative.jni_YGNodeSetAlwaysFormsContainingBlockJNI(this.ouw, true);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void le(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.ouw, f10);
    }

    @com.bytedance.adsdk.ugeno.yoga.ouw.ouw
    public final long measure(float f10, int i10, float f11, int i11) {
        ra raVar = this.yu;
        if (raVar != null) {
            return raVar.ouw(this, f10, pno.ouw(i10), f11, pno.ouw(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final Object mwh() {
        return this.f11017le;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(tlj tljVar, int i10) {
        if (tljVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) tljVar;
            if (yogaNodeJNIBase.vt != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f11018lh == null) {
                this.f11018lh = new ArrayList(4);
            }
            this.f11018lh.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.vt = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.ouw, yogaNodeJNIBase.ouw, i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void pno(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ra(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float ryl() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final float tlj() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void yu(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void vt(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.ouw, yuVar.tlj, f10);
    }

    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* bridge */ /* synthetic */ tlj vt() {
        return this.vt;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* synthetic */ tlj vt(int i10) {
        List<YogaNodeJNIBase> list = this.f11018lh;
        if (list != null) {
            YogaNodeJNIBase yogaNodeJNIBaseRemove = list.remove(i10);
            yogaNodeJNIBaseRemove.vt = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.ouw, yogaNodeJNIBaseRemove.ouw);
            return yogaNodeJNIBaseRemove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final int ouw(tlj tljVar) {
        List<YogaNodeJNIBase> list = this.f11018lh;
        if (list == null) {
            return -1;
        }
        return list.indexOf(tljVar);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(lh lhVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.ouw, lhVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(fkw fkwVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.ouw, fkwVar.fkw);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void lh(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.ouw, yuVar.tlj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(le leVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.ouw, leVar.f11024ra);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ouw ouwVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.ouw, ouwVar.tlj);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ryl rylVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.ouw, rylVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(mwh mwhVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.ouw, mwhVar.yu);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.ouw, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(yu yuVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.ouw, yuVar.tlj, f10);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(ra raVar) {
        this.yu = raVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.ouw, raVar != null);
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final void ouw(Object obj) {
        this.f11017le = obj;
    }

    @Override // com.bytedance.adsdk.ugeno.yoga.tlj
    public final /* synthetic */ tlj ouw(int i10) {
        List<YogaNodeJNIBase> list = this.f11018lh;
        if (list != null) {
            return list.get(i10);
        }
        throw new IllegalStateException("YogaNode does not have children");
    }
}
