package com.bytedance.adsdk.ugeno.fkw;

import android.graphics.drawable.Drawable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
class yu {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public static final /* synthetic */ boolean f10874lh = true;
    private boolean[] fkw;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private long[] f10875le;
    public int[] ouw;
    public long[] vt;
    private final com.bytedance.adsdk.ugeno.fkw.ouw yu;

    public static class ouw {
        public List<lh> ouw;
        public int vt;

        public final void ouw() {
            this.ouw = null;
            this.vt = 0;
        }
    }

    public static class vt implements Comparable<vt> {
        public int ouw;
        public int vt;

        private vt() {
        }

        @Override // java.lang.Comparable
        public final /* bridge */ /* synthetic */ int compareTo(vt vtVar) {
            vt vtVar2 = vtVar;
            int i10 = this.vt;
            int i11 = vtVar2.vt;
            return i10 != i11 ? i10 - i11 : this.ouw - vtVar2.ouw;
        }

        public final String toString() {
            return "Order{order=" + this.vt + ", index=" + this.ouw + '}';
        }

        public /* synthetic */ vt(byte b10) {
            this();
        }
    }

    private int lh(boolean z10) {
        return z10 ? this.yu.getPaddingTop() : this.yu.getPaddingStart();
    }

    private static long vt(int i10, int i11) {
        return (((long) i10) & 4294967295L) | (((long) i11) << 32);
    }

    private int yu(boolean z10) {
        return z10 ? this.yu.getPaddingBottom() : this.yu.getPaddingEnd();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int[] ouw(View view, int i10, ViewGroup.LayoutParams layoutParams, SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        List<vt> listOuw = ouw(flexItemCount);
        vt vtVar = new vt((byte) 0);
        if (view == null || !(layoutParams instanceof com.bytedance.adsdk.ugeno.fkw.vt)) {
            vtVar.vt = 1;
        } else {
            vtVar.vt = ((com.bytedance.adsdk.ugeno.fkw.vt) layoutParams).lh();
        }
        if (i10 == -1 || i10 == flexItemCount || i10 >= this.yu.getFlexItemCount()) {
            vtVar.ouw = flexItemCount;
        } else {
            vtVar.ouw = i10;
            while (i10 < flexItemCount) {
                listOuw.get(i10).ouw++;
                i10++;
            }
        }
        listOuw.add(vtVar);
        return ouw(flexItemCount + 1, listOuw, sparseIntArray);
    }

    public final boolean vt(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        if (sparseIntArray.size() != flexItemCount) {
            return true;
        }
        for (int i10 = 0; i10 < flexItemCount; i10++) {
            View viewOuw = this.yu.ouw(i10);
            if (viewOuw != null && ((com.bytedance.adsdk.ugeno.fkw.vt) viewOuw.getLayoutParams()).lh() != sparseIntArray.get(i10)) {
                return true;
            }
        }
        return false;
    }

    private static int fkw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.jg() : vtVar.mwh();
    }

    private static int le(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        return z10 ? vtVar.rn() : vtVar.ko();
    }

    public yu(com.bytedance.adsdk.ugeno.fkw.ouw ouwVar) {
        this.yu = ouwVar;
    }

    private static int lh(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        if (z10) {
            return vtVar.mwh();
        }
        return vtVar.jg();
    }

    private static int yu(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        if (z10) {
            return vtVar.ko();
        }
        return vtVar.rn();
    }

    private int vt(boolean z10) {
        if (z10) {
            return this.yu.getPaddingEnd();
        }
        return this.yu.getPaddingBottom();
    }

    private static int vt(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredHeight();
        }
        return view.getMeasuredWidth();
    }

    private static int vt(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        if (z10) {
            return vtVar.vt();
        }
        return vtVar.ouw();
    }

    private void vt(int i10, int i11, lh lhVar, int i12, int i13, boolean z10) {
        int i14;
        int i15 = 1;
        boolean z11 = z10;
        while (true) {
            int i16 = lhVar.fkw;
            float f10 = lhVar.f10866cf;
            float f11 = 0.0f;
            if (f10 <= 0.0f || i12 > i16) {
                return;
            }
            float f12 = (i16 - i12) / f10;
            lhVar.fkw = i13 + lhVar.f10869le;
            if (!z11) {
                lhVar.f10871ra = Integer.MIN_VALUE;
            }
            float f13 = 0.0f;
            int i17 = 0;
            boolean z12 = false;
            int i18 = 0;
            while (i17 < lhVar.pno) {
                int i19 = lhVar.f10868ko + i17;
                View viewVt = this.yu.vt(i19);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    i14 = i16;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != i15) {
                        int measuredHeight = viewVt.getMeasuredHeight();
                        long[] jArr = this.f10875le;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i19] >> 32);
                        }
                        int measuredWidth = viewVt.getMeasuredWidth();
                        long[] jArr2 = this.f10875le;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i19];
                        }
                        if (!this.fkw[i19] && vtVar.fkw() > f11) {
                            float fFkw = measuredHeight - (vtVar.fkw() * f12);
                            if (i17 == lhVar.pno - 1) {
                                fFkw += f13;
                                f13 = f11;
                            }
                            int iRound = Math.round(fFkw);
                            if (iRound < vtVar.pno()) {
                                iRound = vtVar.pno();
                                this.fkw[i19] = true;
                                lhVar.f10866cf -= vtVar.fkw();
                                z12 = true;
                            } else {
                                f13 += fFkw - iRound;
                                double d10 = f13;
                                if (d10 > 1.0d) {
                                    iRound++;
                                    f13 -= 1.0f;
                                } else if (d10 < -1.0d) {
                                    iRound--;
                                    f13 += 1.0f;
                                }
                            }
                            int iOuw = ouw(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewVt.measure(iOuw, iMakeMeasureSpec);
                            int measuredWidth2 = viewVt.getMeasuredWidth();
                            measuredHeight = viewVt.getMeasuredHeight();
                            ouw(i19, iOuw, iMakeMeasureSpec, viewVt);
                            measuredWidth = measuredWidth2;
                        }
                        int iMax = Math.max(i18, measuredWidth + vtVar.mwh() + vtVar.ko() + 0);
                        lhVar.fkw += measuredHeight + vtVar.jg() + vtVar.rn();
                        i18 = iMax;
                        i14 = i16;
                    } else {
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr3 = this.f10875le;
                        if (jArr3 != null) {
                            measuredWidth3 = (int) jArr3[i19];
                        }
                        int measuredHeight2 = viewVt.getMeasuredHeight();
                        long[] jArr4 = this.f10875le;
                        if (jArr4 != null) {
                            measuredHeight2 = (int) (jArr4[i19] >> 32);
                        }
                        if (this.fkw[i19] || vtVar.fkw() <= 0.0f) {
                            i14 = i16;
                        } else {
                            float fFkw2 = measuredWidth3 - (vtVar.fkw() * f12);
                            if (i17 == lhVar.pno - 1) {
                                fFkw2 += f13;
                                f13 = 0.0f;
                            }
                            int iRound2 = Math.round(fFkw2);
                            if (iRound2 < vtVar.ra()) {
                                iRound2 = vtVar.ra();
                                this.fkw[i19] = true;
                                lhVar.f10866cf -= vtVar.fkw();
                                z12 = true;
                                i14 = i16;
                            } else {
                                f13 += fFkw2 - iRound2;
                                i14 = i16;
                                double d11 = f13;
                                if (d11 > 1.0d) {
                                    iRound2++;
                                    f13 -= 1.0f;
                                } else if (d11 < -1.0d) {
                                    iRound2--;
                                    f13 += 1.0f;
                                }
                            }
                            int iVt = vt(i11, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iMakeMeasureSpec2, iVt);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            int measuredHeight3 = viewVt.getMeasuredHeight();
                            ouw(i19, iMakeMeasureSpec2, iVt, viewVt);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight2 = measuredHeight3;
                        }
                        int iMax2 = Math.max(i18, measuredHeight2 + vtVar.jg() + vtVar.rn() + 0);
                        lhVar.fkw += measuredWidth3 + vtVar.mwh() + vtVar.ko();
                        i18 = iMax2;
                    }
                    lhVar.f10871ra = Math.max(lhVar.f10871ra, i18);
                }
                i17++;
                i16 = i14;
                i15 = 1;
                f11 = 0.0f;
            }
            int i20 = i16;
            if (!z12 || i20 == lhVar.fkw) {
                return;
            }
            i15 = 1;
            z11 = true;
        }
    }

    public final int[] ouw(SparseIntArray sparseIntArray) {
        int flexItemCount = this.yu.getFlexItemCount();
        return ouw(flexItemCount, ouw(flexItemCount), sparseIntArray);
    }

    private List<vt> ouw(int i10) {
        ArrayList arrayList = new ArrayList(i10);
        byte b10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) this.yu.ouw(i11).getLayoutParams();
            vt vtVar2 = new vt(b10);
            vtVar2.vt = vtVar.lh();
            vtVar2.ouw = i11;
            arrayList.add(vtVar2);
        }
        return arrayList;
    }

    private static int[] ouw(int i10, List<vt> list, SparseIntArray sparseIntArray) {
        Collections.sort(list);
        sparseIntArray.clear();
        int[] iArr = new int[i10];
        int i11 = 0;
        for (vt vtVar : list) {
            int i12 = vtVar.ouw;
            iArr[i11] = i12;
            sparseIntArray.append(i12, vtVar.vt);
            i11++;
        }
        return iArr;
    }

    public final void ouw(ouw ouwVar, int i10, int i11) {
        ouw(ouwVar, i11, i10, (List<lh>) null);
    }

    public final void ouw(ouw ouwVar, int i10, int i11, List<lh> list) {
        int i12;
        int i13;
        boolean z10;
        List<lh> list2;
        View view;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        boolean zOuw = this.yu.ouw();
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        List<lh> arrayList = list == null ? new ArrayList() : list;
        ouwVar.ouw = arrayList;
        int iOuw = ouw(zOuw);
        int iVt = vt(zOuw);
        int iLh = lh(zOuw);
        int iYu = yu(zOuw);
        lh lhVar = new lh();
        lhVar.f10868ko = 0;
        int i19 = iOuw + iVt;
        lhVar.fkw = i19;
        int flexItemCount = this.yu.getFlexItemCount();
        lh lhVar2 = lhVar;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = Integer.MIN_VALUE;
        while (i22 < flexItemCount) {
            View viewVt = this.yu.vt(i22);
            if (viewVt == null) {
                if (ouw(i22, flexItemCount, lhVar2)) {
                    ouw(arrayList, lhVar2, i22, i21);
                }
                i12 = i20;
            } else {
                i12 = i20;
                if (viewVt.getVisibility() == 8) {
                    lhVar2.bly++;
                    lhVar2.pno++;
                    if (ouw(i22, flexItemCount, lhVar2)) {
                        ouw(arrayList, lhVar2, i22, i21);
                    }
                } else {
                    if (viewVt instanceof CompoundButton) {
                        ouw((CompoundButton) viewVt);
                    }
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    if (vtVar.le() == 4) {
                        lhVar2.f10867jg.add(Integer.valueOf(i22));
                    }
                    int iOuw2 = ouw(vtVar, zOuw);
                    if (vtVar.ryl() != -1.0f && mode == 1073741824) {
                        iOuw2 = Math.round(size * vtVar.ryl());
                    }
                    if (zOuw) {
                        int iOuw3 = this.yu.ouw(i10, i19 + lh(vtVar, true) + yu(vtVar, true), iOuw2);
                        int iVt2 = this.yu.vt(i11, iLh + iYu + fkw(vtVar, true) + le(vtVar, true) + i21, vt(vtVar, true));
                        viewVt.measure(iOuw3, iVt2);
                        ouw(i22, iOuw3, iVt2, viewVt);
                        i13 = iOuw3;
                    } else {
                        int iOuw4 = this.yu.ouw(i11, iLh + iYu + fkw(vtVar, false) + le(vtVar, false) + i21, vt(vtVar, false));
                        int iVt3 = this.yu.vt(i10, lh(vtVar, false) + i19 + yu(vtVar, false), iOuw2);
                        viewVt.measure(iOuw4, iVt3);
                        ouw(i22, iOuw4, iVt3, viewVt);
                        i13 = iVt3;
                    }
                    ouw(viewVt, i22);
                    int iCombineMeasuredStates = View.combineMeasuredStates(i12, viewVt.getMeasuredState());
                    int i25 = lhVar2.fkw;
                    int iOuw5 = ouw(viewVt, zOuw) + lh(vtVar, zOuw);
                    int i26 = mode;
                    int i27 = i21;
                    int i28 = i22;
                    lh lhVar3 = lhVar2;
                    int i29 = flexItemCount;
                    int i30 = i19;
                    z10 = false;
                    list2 = arrayList;
                    if (ouw(i26, size, i25, yu(vtVar, zOuw) + iOuw5, vtVar, i28, i23, arrayList.size())) {
                        i14 = i28;
                        if (lhVar3.ouw() > 0) {
                            ouw(list2, r23, i14 > 0 ? i14 - 1 : 0, i27);
                            i21 = i27 + lhVar3.f10871ra;
                        } else {
                            i21 = i27;
                        }
                        if (zOuw) {
                            if (vtVar.vt() == -1) {
                                com.bytedance.adsdk.ugeno.fkw.ouw ouwVar2 = this.yu;
                                view = viewVt;
                                view.measure(i13, ouwVar2.vt(i11, ouwVar2.getPaddingTop() + this.yu.getPaddingBottom() + vtVar.jg() + vtVar.rn() + i21, vtVar.vt()));
                                ouw(view, i14);
                            } else {
                                view = viewVt;
                            }
                        } else if (vtVar.ouw() == -1) {
                            view = viewVt;
                            com.bytedance.adsdk.ugeno.fkw.ouw ouwVar3 = this.yu;
                            view.measure(ouwVar3.ouw(i11, ouwVar3.getPaddingLeft() + this.yu.getPaddingRight() + vtVar.mwh() + vtVar.ko() + i21, vtVar.ouw()), i13);
                            ouw(view, i14);
                        }
                        view = viewVt;
                        lhVar2 = new lh();
                        z11 = true;
                        lhVar2.pno = 1;
                        i15 = i30;
                        lhVar2.fkw = i15;
                        lhVar2.f10868ko = i14;
                        i17 = Integer.MIN_VALUE;
                        i16 = 0;
                    } else {
                        view = viewVt;
                        i14 = i28;
                        i15 = i30;
                        z11 = true;
                        lhVar3.pno++;
                        i16 = i23 + 1;
                        i17 = i24;
                        lhVar2 = lhVar3;
                        i21 = i27;
                    }
                    lhVar2.zih |= vtVar.yu() != 0.0f ? z11 : false;
                    boolean z12 = lhVar2.f10873vm;
                    if (vtVar.fkw() == 0.0f) {
                        z11 = false;
                    }
                    lhVar2.f10873vm = z11 | z12;
                    int[] iArr = this.ouw;
                    if (iArr != null) {
                        iArr[i14] = list2.size();
                    }
                    lhVar2.fkw += ouw(view, zOuw) + lh(vtVar, zOuw) + yu(vtVar, zOuw);
                    lhVar2.tlj += vtVar.yu();
                    lhVar2.f10866cf += vtVar.fkw();
                    this.yu.ouw(i14, i16, lhVar2);
                    int iMax = Math.max(i17, vt(view, zOuw) + fkw(vtVar, zOuw) + le(vtVar, zOuw) + 0);
                    lhVar2.f10871ra = Math.max(lhVar2.f10871ra, iMax);
                    if (zOuw) {
                        if (this.yu.getFlexWrap() != 2) {
                            lhVar2.ryl = Math.max(lhVar2.ryl, view.getBaseline() + vtVar.jg());
                        } else {
                            lhVar2.ryl = Math.max(lhVar2.ryl, (view.getMeasuredHeight() - view.getBaseline()) + vtVar.rn());
                        }
                    }
                    i18 = i29;
                    if (ouw(i14, i18, lhVar2)) {
                        ouw(list2, lhVar2, i14, i21);
                        i21 += lhVar2.f10871ra;
                    }
                    if (i21 > Integer.MAX_VALUE) {
                        i20 = iCombineMeasuredStates;
                        break;
                    } else {
                        i24 = iMax;
                        i23 = i16;
                        i20 = iCombineMeasuredStates;
                    }
                }
                i19 = i15;
                i22 = i14 + 1;
                arrayList = list2;
                size = size;
                mode = mode;
                flexItemCount = i18;
            }
            i14 = i22;
            i18 = flexItemCount;
            i15 = i19;
            mode = mode;
            size = size;
            i20 = i12;
            z10 = false;
            list2 = arrayList;
            i19 = i15;
            i22 = i14 + 1;
            arrayList = list2;
            size = size;
            mode = mode;
            flexItemCount = i18;
        }
        ouwVar.vt = i20;
    }

    private int vt(int i10, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i11) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iVt = ouwVar.vt(i10, ouwVar.getPaddingTop() + this.yu.getPaddingBottom() + vtVar.jg() + vtVar.rn() + i11, vtVar.vt());
        int size = View.MeasureSpec.getSize(iVt);
        if (size > vtVar.tlj()) {
            return View.MeasureSpec.makeMeasureSpec(vtVar.tlj(), View.MeasureSpec.getMode(iVt));
        }
        return size < vtVar.pno() ? View.MeasureSpec.makeMeasureSpec(vtVar.pno(), View.MeasureSpec.getMode(iVt)) : iVt;
    }

    private void vt(View view, int i10, int i11) {
        int measuredHeight;
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - vtVar.mwh()) - vtVar.ko()) + 0, vtVar.ra()), vtVar.bly());
        long[] jArr = this.f10875le;
        if (jArr != null) {
            measuredHeight = (int) (jArr[i11] >> 32);
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        ouw(i11, iMakeMeasureSpec2, iMakeMeasureSpec, view);
    }

    private static void ouw(CompoundButton compoundButton) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) compoundButton.getLayoutParams();
        int iRa = vtVar.ra();
        int iPno = vtVar.pno();
        Drawable drawableOuw = com.bytedance.adsdk.ugeno.ra.fkw.ouw(compoundButton);
        int minimumWidth = drawableOuw == null ? 0 : drawableOuw.getMinimumWidth();
        int minimumHeight = drawableOuw != null ? drawableOuw.getMinimumHeight() : 0;
        if (iRa == -1) {
            iRa = minimumWidth;
        }
        vtVar.ouw(iRa);
        if (iPno == -1) {
            iPno = minimumHeight;
        }
        vtVar.vt(iPno);
    }

    private int ouw(boolean z10) {
        if (z10) {
            return this.yu.getPaddingStart();
        }
        return this.yu.getPaddingTop();
    }

    private static int ouw(View view, boolean z10) {
        if (z10) {
            return view.getMeasuredWidth();
        }
        return view.getMeasuredHeight();
    }

    private static int ouw(com.bytedance.adsdk.ugeno.fkw.vt vtVar, boolean z10) {
        if (z10) {
            return vtVar.ouw();
        }
        return vtVar.vt();
    }

    private boolean ouw(int i10, int i11, int i12, int i13, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i14, int i15, int i16) {
        if (this.yu.getFlexWrap() == 0) {
            return false;
        }
        if (vtVar.cf()) {
            return true;
        }
        if (i10 == 0) {
            return false;
        }
        int maxLine = this.yu.getMaxLine();
        if (maxLine != -1 && maxLine <= i16 + 1) {
            return false;
        }
        int iOuw = this.yu.ouw(i14, i15);
        if (iOuw > 0) {
            i13 += iOuw;
        }
        return i11 < i12 + i13;
    }

    private static boolean ouw(int i10, int i11, lh lhVar) {
        return i10 == i11 - 1 && lhVar.ouw() != 0;
    }

    private void ouw(List<lh> list, lh lhVar, int i10, int i11) {
        lhVar.mwh = i11;
        this.yu.ouw(lhVar);
        lhVar.f10872rn = i10;
        list.add(lhVar);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x002d  */
    /* JADX WARN: Code duplicated, block: B:13:0x0032  */
    /* JADX WARN: Code duplicated, block: B:15:0x0038  */
    /* JADX WARN: Code duplicated, block: B:16:0x003d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0040  */
    /* JADX WARN: Code duplicated, block: B:20:? A[RETURN, SYNTHETIC] */
    private void ouw(View view, int i10) {
        boolean z10;
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        boolean z11 = true;
        if (measuredWidth < vtVar.ra()) {
            measuredWidth = vtVar.ra();
        } else {
            if (measuredWidth > vtVar.bly()) {
                measuredWidth = vtVar.bly();
            } else {
                z10 = false;
            }
            if (measuredHeight < vtVar.pno()) {
                measuredHeight = vtVar.pno();
            } else if (measuredHeight > vtVar.tlj()) {
                measuredHeight = vtVar.tlj();
            } else {
                z11 = z10;
            }
            if (z11) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                ouw(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
            }
        }
        z10 = true;
        if (measuredHeight < vtVar.pno()) {
            measuredHeight = vtVar.pno();
        } else if (measuredHeight > vtVar.tlj()) {
            measuredHeight = vtVar.tlj();
        } else {
            z11 = z10;
        }
        if (z11) {
            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
            int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
            view.measure(iMakeMeasureSpec3, iMakeMeasureSpec4);
            ouw(i10, iMakeMeasureSpec3, iMakeMeasureSpec4, view);
        }
    }

    private void ouw(int i10, int i11, lh lhVar, int i12, int i13, boolean z10) {
        int i14;
        int i15;
        double d10;
        double d11;
        int i16 = 1;
        boolean z11 = z10;
        while (true) {
            float f10 = lhVar.tlj;
            float f11 = 0.0f;
            if (f10 <= 0.0f || i12 < (i14 = lhVar.fkw)) {
                return;
            }
            float f12 = (i12 - i14) / f10;
            lhVar.fkw = i13 + lhVar.f10869le;
            if (!z11) {
                lhVar.f10871ra = Integer.MIN_VALUE;
            }
            float f13 = 0.0f;
            int i17 = 0;
            boolean z12 = false;
            int i18 = 0;
            while (i17 < lhVar.pno) {
                int i19 = lhVar.f10868ko + i17;
                View viewVt = this.yu.vt(i19);
                if (viewVt == null || viewVt.getVisibility() == 8) {
                    i15 = i17;
                } else {
                    com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                    int flexDirection = this.yu.getFlexDirection();
                    if (flexDirection != 0 && flexDirection != i16) {
                        int measuredHeight = viewVt.getMeasuredHeight();
                        long[] jArr = this.f10875le;
                        if (jArr != null) {
                            measuredHeight = (int) (jArr[i19] >> 32);
                        }
                        int measuredWidth = viewVt.getMeasuredWidth();
                        long[] jArr2 = this.f10875le;
                        if (jArr2 != null) {
                            measuredWidth = (int) jArr2[i19];
                        }
                        if (!this.fkw[i19] && vtVar.yu() > f11) {
                            float fYu = measuredHeight + (vtVar.yu() * f12);
                            if (i17 == lhVar.pno - 1) {
                                fYu += f13;
                                f13 = f11;
                            }
                            int iRound = Math.round(fYu);
                            if (iRound > vtVar.tlj()) {
                                iRound = vtVar.tlj();
                                this.fkw[i19] = true;
                                lhVar.tlj -= vtVar.yu();
                                z12 = true;
                            } else {
                                f13 += fYu - iRound;
                                double d12 = f13;
                                if (d12 > 1.0d) {
                                    iRound++;
                                    d11 = d12 - 1.0d;
                                } else if (d12 < -1.0d) {
                                    iRound--;
                                    d11 = d12 + 1.0d;
                                }
                                f13 = (float) d11;
                            }
                            int iOuw = ouw(i10, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                            viewVt.measure(iOuw, iMakeMeasureSpec);
                            int measuredWidth2 = viewVt.getMeasuredWidth();
                            measuredHeight = viewVt.getMeasuredHeight();
                            ouw(i19, iOuw, iMakeMeasureSpec, viewVt);
                            measuredWidth = measuredWidth2;
                        }
                        int iMax = Math.max(i18, measuredWidth + vtVar.mwh() + vtVar.ko() + 0);
                        lhVar.fkw += measuredHeight + vtVar.jg() + vtVar.rn();
                        i18 = iMax;
                        i15 = i17;
                    } else {
                        int measuredWidth3 = viewVt.getMeasuredWidth();
                        long[] jArr3 = this.f10875le;
                        if (jArr3 != null) {
                            measuredWidth3 = (int) jArr3[i19];
                        }
                        int measuredHeight2 = viewVt.getMeasuredHeight();
                        long[] jArr4 = this.f10875le;
                        if (jArr4 != null) {
                            measuredHeight2 = (int) (jArr4[i19] >> 32);
                        }
                        if (this.fkw[i19] || vtVar.yu() <= 0.0f) {
                            i15 = i17;
                        } else {
                            float fYu2 = measuredWidth3 + (vtVar.yu() * f12);
                            if (i17 == lhVar.pno - 1) {
                                fYu2 += f13;
                                f13 = 0.0f;
                            }
                            int iRound2 = Math.round(fYu2);
                            if (iRound2 > vtVar.bly()) {
                                iRound2 = vtVar.bly();
                                this.fkw[i19] = true;
                                lhVar.tlj -= vtVar.yu();
                                z12 = true;
                                i15 = i17;
                            } else {
                                f13 += fYu2 - iRound2;
                                i15 = i17;
                                double d13 = f13;
                                if (d13 > 1.0d) {
                                    iRound2++;
                                    d10 = d13 - 1.0d;
                                } else if (d13 < -1.0d) {
                                    iRound2--;
                                    d10 = d13 + 1.0d;
                                }
                                f13 = (float) d10;
                            }
                            int iVt = vt(i11, vtVar, lhVar.mwh);
                            int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                            viewVt.measure(iMakeMeasureSpec2, iVt);
                            int measuredWidth4 = viewVt.getMeasuredWidth();
                            int measuredHeight3 = viewVt.getMeasuredHeight();
                            ouw(i19, iMakeMeasureSpec2, iVt, viewVt);
                            measuredWidth3 = measuredWidth4;
                            measuredHeight2 = measuredHeight3;
                        }
                        int iMax2 = Math.max(i18, measuredHeight2 + vtVar.jg() + vtVar.rn() + 0);
                        lhVar.fkw += measuredWidth3 + vtVar.mwh() + vtVar.ko();
                        i18 = iMax2;
                    }
                    lhVar.f10871ra = Math.max(lhVar.f10871ra, i18);
                }
                i17 = i15 + 1;
                i16 = 1;
                f11 = 0.0f;
            }
            if (!z12 || i14 == lhVar.fkw) {
                return;
            }
            i16 = 1;
            z11 = true;
        }
    }

    private int ouw(int i10, com.bytedance.adsdk.ugeno.fkw.vt vtVar, int i11) {
        com.bytedance.adsdk.ugeno.fkw.ouw ouwVar = this.yu;
        int iOuw = ouwVar.ouw(i10, ouwVar.getPaddingLeft() + this.yu.getPaddingRight() + vtVar.mwh() + vtVar.ko() + i11, vtVar.ouw());
        int size = View.MeasureSpec.getSize(iOuw);
        if (size > vtVar.bly()) {
            return View.MeasureSpec.makeMeasureSpec(vtVar.bly(), View.MeasureSpec.getMode(iOuw));
        }
        return size < vtVar.ra() ? View.MeasureSpec.makeMeasureSpec(vtVar.ra(), View.MeasureSpec.getMode(iOuw)) : iOuw;
    }

    public final void ouw(int i10, int i11, int i12) {
        int mode;
        int size;
        int flexDirection = this.yu.getFlexDirection();
        if (flexDirection != 0 && flexDirection != 1) {
            if (flexDirection != 2 && flexDirection != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
            }
            mode = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
        } else {
            int mode2 = View.MeasureSpec.getMode(i11);
            int size2 = View.MeasureSpec.getSize(i11);
            mode = mode2;
            size = size2;
        }
        List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
        if (mode == 1073741824) {
            int sumOfCrossSize = this.yu.getSumOfCrossSize() + i12;
            int i13 = 0;
            if (flexLinesInternal.size() == 1) {
                flexLinesInternal.get(0).f10871ra = size - i12;
                return;
            }
            if (flexLinesInternal.size() >= 2) {
                int alignContent = this.yu.getAlignContent();
                if (alignContent == 1) {
                    int i14 = size - sumOfCrossSize;
                    lh lhVar = new lh();
                    lhVar.f10871ra = i14;
                    flexLinesInternal.add(0, lhVar);
                    return;
                }
                if (alignContent == 2) {
                    this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                    return;
                }
                if (alignContent == 3) {
                    if (sumOfCrossSize < size) {
                        float size3 = (size - sumOfCrossSize) / (flexLinesInternal.size() - 1);
                        ArrayList arrayList = new ArrayList();
                        int size4 = flexLinesInternal.size();
                        float f10 = 0.0f;
                        while (i13 < size4) {
                            arrayList.add(flexLinesInternal.get(i13));
                            if (i13 != flexLinesInternal.size() - 1) {
                                lh lhVar2 = new lh();
                                if (i13 == flexLinesInternal.size() - 2) {
                                    lhVar2.f10871ra = Math.round(f10 + size3);
                                    f10 = 0.0f;
                                } else {
                                    lhVar2.f10871ra = Math.round(size3);
                                }
                                int i15 = lhVar2.f10871ra;
                                f10 += size3 - i15;
                                if (f10 > 1.0f) {
                                    lhVar2.f10871ra = i15 + 1;
                                    f10 -= 1.0f;
                                } else if (f10 < -1.0f) {
                                    lhVar2.f10871ra = i15 - 1;
                                    f10 += 1.0f;
                                }
                                arrayList.add(lhVar2);
                            }
                            i13++;
                        }
                        this.yu.setFlexLines(arrayList);
                        return;
                    }
                    return;
                }
                if (alignContent == 4) {
                    if (sumOfCrossSize >= size) {
                        this.yu.setFlexLines(ouw(flexLinesInternal, size, sumOfCrossSize));
                        return;
                    }
                    int size5 = (size - sumOfCrossSize) / (flexLinesInternal.size() * 2);
                    ArrayList arrayList2 = new ArrayList();
                    lh lhVar3 = new lh();
                    lhVar3.f10871ra = size5;
                    for (lh lhVar4 : flexLinesInternal) {
                        arrayList2.add(lhVar3);
                        arrayList2.add(lhVar4);
                        arrayList2.add(lhVar3);
                    }
                    this.yu.setFlexLines(arrayList2);
                    return;
                }
                if (alignContent == 5 && sumOfCrossSize < size) {
                    float size6 = (size - sumOfCrossSize) / flexLinesInternal.size();
                    int size7 = flexLinesInternal.size();
                    float f11 = 0.0f;
                    while (i13 < size7) {
                        lh lhVar5 = flexLinesInternal.get(i13);
                        float f12 = lhVar5.f10871ra + size6;
                        if (i13 == flexLinesInternal.size() - 1) {
                            f12 += f11;
                            f11 = 0.0f;
                        }
                        int iRound = Math.round(f12);
                        f11 += f12 - iRound;
                        if (f11 > 1.0f) {
                            iRound++;
                            f11 -= 1.0f;
                        } else if (f11 < -1.0f) {
                            iRound--;
                            f11 += 1.0f;
                        }
                        lhVar5.f10871ra = iRound;
                        i13++;
                    }
                }
            }
        }
    }

    private static List<lh> ouw(List<lh> list, int i10, int i11) {
        int i12 = (i10 - i11) / 2;
        ArrayList arrayList = new ArrayList();
        lh lhVar = new lh();
        lhVar.f10871ra = i12;
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (i13 == 0) {
                arrayList.add(lhVar);
            }
            arrayList.add(list.get(i13));
            if (i13 == list.size() - 1) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    private void ouw(View view, int i10, int i11) {
        int measuredWidth;
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i10 - vtVar.jg()) - vtVar.rn()) + 0, vtVar.pno()), vtVar.tlj());
        long[] jArr = this.f10875le;
        if (jArr != null) {
            measuredWidth = (int) jArr[i11];
        } else {
            measuredWidth = view.getMeasuredWidth();
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        ouw(i11, iMakeMeasureSpec, iMakeMeasureSpec2, view);
    }

    public final void ouw(View view, lh lhVar, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i14 = lhVar.f10871ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (this.yu.getFlexWrap() != 2) {
                    int i15 = i11 + i14;
                    view.layout(i10, (i15 - view.getMeasuredHeight()) - vtVar.rn(), i12, i15 - vtVar.rn());
                    return;
                } else {
                    view.layout(i10, (i11 - i14) + view.getMeasuredHeight() + vtVar.jg(), i12, (i13 - i14) + view.getMeasuredHeight() + vtVar.jg());
                    return;
                }
            }
            if (alignItems == 2) {
                int measuredHeight = (((i14 - view.getMeasuredHeight()) + vtVar.jg()) - vtVar.rn()) / 2;
                if (this.yu.getFlexWrap() != 2) {
                    int i16 = i11 + measuredHeight;
                    view.layout(i10, i16, i12, view.getMeasuredHeight() + i16);
                    return;
                } else {
                    int i17 = i11 - measuredHeight;
                    view.layout(i10, i17, i12, view.getMeasuredHeight() + i17);
                    return;
                }
            }
            if (alignItems == 3) {
                if (this.yu.getFlexWrap() != 2) {
                    int iMax = Math.max(lhVar.ryl - view.getBaseline(), vtVar.jg());
                    view.layout(i10, i11 + iMax, i12, i13 + iMax);
                    return;
                } else {
                    int iMax2 = Math.max((lhVar.ryl - view.getMeasuredHeight()) + view.getBaseline(), vtVar.rn());
                    view.layout(i10, i11 - iMax2, i12, i13 - iMax2);
                    return;
                }
            }
            if (alignItems != 4) {
                return;
            }
        }
        if (this.yu.getFlexWrap() != 2) {
            view.layout(i10, i11 + vtVar.jg(), i12, i13 + vtVar.jg());
        } else {
            view.layout(i10, i11 - vtVar.rn(), i12, i13 - vtVar.rn());
        }
    }

    public final void ouw(View view, lh lhVar, boolean z10, int i10, int i11, int i12, int i13) {
        com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) view.getLayoutParams();
        int alignItems = this.yu.getAlignItems();
        if (vtVar.le() != -1) {
            alignItems = vtVar.le();
        }
        int i14 = lhVar.f10871ra;
        if (alignItems != 0) {
            if (alignItems == 1) {
                if (!z10) {
                    view.layout(((i10 + i14) - view.getMeasuredWidth()) - vtVar.ko(), i11, ((i12 + i14) - view.getMeasuredWidth()) - vtVar.ko(), i13);
                    return;
                } else {
                    view.layout((i10 - i14) + view.getMeasuredWidth() + vtVar.mwh(), i11, (i12 - i14) + view.getMeasuredWidth() + vtVar.mwh(), i13);
                    return;
                }
            }
            if (alignItems == 2) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                int measuredWidth = (((i14 - view.getMeasuredWidth()) + marginLayoutParams.getMarginStart()) - marginLayoutParams.getMarginEnd()) / 2;
                if (!z10) {
                    view.layout(i10 + measuredWidth, i11, i12 + measuredWidth, i13);
                    return;
                } else {
                    view.layout(i10 - measuredWidth, i11, i12 - measuredWidth, i13);
                    return;
                }
            }
            if (alignItems != 3 && alignItems != 4) {
                return;
            }
        }
        if (!z10) {
            view.layout(i10 + vtVar.mwh(), i11, i12 + vtVar.mwh(), i13);
        } else {
            view.layout(i10 - vtVar.ko(), i11, i12 - vtVar.ko(), i13);
        }
    }

    private void ouw(int i10, int i11, int i12, View view) {
        long[] jArr = this.vt;
        if (jArr != null) {
            jArr[i10] = vt(i11, i12);
        }
        long[] jArr2 = this.f10875le;
        if (jArr2 != null) {
            jArr2[i10] = vt(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void ouw(int i10, int i11) {
        int size;
        int paddingLeft;
        int paddingRight;
        int flexItemCount = this.yu.getFlexItemCount();
        boolean[] zArr = this.fkw;
        if (zArr == null) {
            this.fkw = new boolean[Math.max(flexItemCount, 10)];
        } else if (zArr.length < flexItemCount) {
            this.fkw = new boolean[Math.max(zArr.length * 2, flexItemCount)];
        } else {
            Arrays.fill(zArr, false);
        }
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            int flexDirection2 = this.yu.getFlexDirection();
            if (flexDirection2 != 0 && flexDirection2 != 1) {
                if (flexDirection2 != 2 && flexDirection2 != 3) {
                    throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                }
                int mode = View.MeasureSpec.getMode(i11);
                size = View.MeasureSpec.getSize(i11);
                if (mode != 1073741824) {
                    size = this.yu.getLargestMainSize();
                }
                paddingLeft = this.yu.getPaddingTop();
                paddingRight = this.yu.getPaddingBottom();
            } else {
                int mode2 = View.MeasureSpec.getMode(i10);
                size = View.MeasureSpec.getSize(i10);
                int largestMainSize = this.yu.getLargestMainSize();
                if (mode2 != 1073741824) {
                    size = Math.min(largestMainSize, size);
                }
                paddingLeft = this.yu.getPaddingLeft();
                paddingRight = this.yu.getPaddingRight();
            }
            int i12 = paddingLeft + paddingRight;
            int[] iArr = this.ouw;
            List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
            int size2 = flexLinesInternal.size();
            for (int i13 = iArr != null ? iArr[0] : 0; i13 < size2; i13++) {
                lh lhVar = flexLinesInternal.get(i13);
                int i14 = lhVar.fkw;
                if (i14 < size && lhVar.zih) {
                    ouw(i10, i11, lhVar, size, i12, false);
                } else if (i14 > size && lhVar.f10873vm) {
                    vt(i10, i11, lhVar, size, i12, false);
                }
            }
        }
    }

    public final void ouw() {
        View viewVt;
        if (this.yu.getFlexItemCount() > 0) {
            int flexDirection = this.yu.getFlexDirection();
            if (this.yu.getAlignItems() == 4) {
                int[] iArr = this.ouw;
                int i10 = 0;
                int i11 = iArr != null ? iArr[0] : 0;
                List<lh> flexLinesInternal = this.yu.getFlexLinesInternal();
                int size = flexLinesInternal.size();
                while (i11 < size) {
                    lh lhVar = flexLinesInternal.get(i11);
                    int i12 = lhVar.pno;
                    for (int i13 = i10; i13 < i12; i13++) {
                        int i14 = lhVar.f10868ko + i13;
                        if (i13 < this.yu.getFlexItemCount() && (viewVt = this.yu.vt(i14)) != null && viewVt.getVisibility() != 8) {
                            com.bytedance.adsdk.ugeno.fkw.vt vtVar = (com.bytedance.adsdk.ugeno.fkw.vt) viewVt.getLayoutParams();
                            if (vtVar.le() == -1 || vtVar.le() == 4) {
                                if (flexDirection != 0 && flexDirection != 1) {
                                    if (flexDirection != 2 && flexDirection != 3) {
                                        throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                                    }
                                    vt(viewVt, lhVar.f10871ra, i14);
                                } else {
                                    ouw(viewVt, lhVar.f10871ra, i14);
                                }
                            }
                        }
                    }
                    i11++;
                    i10 = 0;
                }
                return;
            }
            for (lh lhVar2 : this.yu.getFlexLinesInternal()) {
                for (Integer num : lhVar2.f10867jg) {
                    View viewVt2 = this.yu.vt(num.intValue());
                    if (flexDirection != 0 && flexDirection != 1) {
                        if (flexDirection != 2 && flexDirection != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(flexDirection)));
                        }
                        vt(viewVt2, lhVar2.f10871ra, num.intValue());
                    } else {
                        ouw(viewVt2, lhVar2.f10871ra, num.intValue());
                    }
                }
            }
        }
    }
}
