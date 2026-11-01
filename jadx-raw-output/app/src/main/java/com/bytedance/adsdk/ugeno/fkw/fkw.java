package com.bytedance.adsdk.ugeno.fkw;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class fkw extends ViewGroup implements com.bytedance.adsdk.ugeno.fkw.ouw {
    private Drawable bly;

    /* JADX INFO: renamed from: cf, reason: collision with root package name */
    private int f10850cf;
    private int fkw;

    /* JADX INFO: renamed from: jg, reason: collision with root package name */
    private int[] f10851jg;

    /* JADX INFO: renamed from: ko, reason: collision with root package name */
    private SparseIntArray f10852ko;

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    private int f10853le;

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private int f10854lh;
    private int mwh;
    public com.bytedance.adsdk.ugeno.yu ouw;
    private Drawable pno;

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private int f10855ra;

    /* JADX INFO: renamed from: rn, reason: collision with root package name */
    private yu f10856rn;
    private int ryl;
    private int tlj;

    /* JADX INFO: renamed from: vm, reason: collision with root package name */
    private yu.ouw f10857vm;
    private int vt;
    private int yu;
    private List<lh> zih;

    public static class ouw extends ViewGroup.MarginLayoutParams implements vt {
        public static final Parcelable.Creator<ouw> CREATOR = new Parcelable.Creator<ouw>() { // from class: com.bytedance.adsdk.ugeno.fkw.fkw.ouw.1
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ ouw createFromParcel(Parcel parcel) {
                return new ouw(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ ouw[] newArray(int i10) {
                return new ouw[i10];
            }
        };
        private int bly;
        public float fkw;

        /* JADX INFO: renamed from: le, reason: collision with root package name */
        private int f10858le;

        /* JADX INFO: renamed from: lh, reason: collision with root package name */
        public float f10859lh;
        public int ouw;
        private int pno;

        /* JADX INFO: renamed from: ra, reason: collision with root package name */
        private int f10860ra;
        private boolean tlj;
        public float vt;
        public int yu;

        public ouw(ouw ouwVar) {
            super((ViewGroup.MarginLayoutParams) ouwVar);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f10859lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f10858le = -1;
            this.f10860ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
            this.ouw = ouwVar.ouw;
            this.vt = ouwVar.vt;
            this.f10859lh = ouwVar.f10859lh;
            this.yu = ouwVar.yu;
            this.fkw = ouwVar.fkw;
            this.f10858le = ouwVar.f10858le;
            this.f10860ra = ouwVar.f10860ra;
            this.pno = ouwVar.pno;
            this.bly = ouwVar.bly;
            this.tlj = ouwVar.tlj;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ouw() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int vt() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int bly() {
            return this.pno;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final boolean cf() {
            return this.tlj;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float fkw() {
            return this.f10859lh;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int jg() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ko() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int le() {
            return this.yu;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int lh() {
            return this.ouw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int mwh() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void ouw(int i10) {
            this.f10858le = i10;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int pno() {
            return this.f10860ra;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int ra() {
            return this.f10858le;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int rn() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float ryl() {
            return this.fkw;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final int tlj() {
            return this.bly;
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final void vt(int i10) {
            this.f10860ra = i10;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.ouw);
            parcel.writeFloat(this.vt);
            parcel.writeFloat(this.f10859lh);
            parcel.writeInt(this.yu);
            parcel.writeFloat(this.fkw);
            parcel.writeInt(this.f10858le);
            parcel.writeInt(this.f10860ra);
            parcel.writeInt(this.pno);
            parcel.writeInt(this.bly);
            parcel.writeByte(this.tlj ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.bytedance.adsdk.ugeno.fkw.vt
        public final float yu() {
            return this.vt;
        }

        public ouw(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f10859lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f10858le = -1;
            this.f10860ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.ouw = 1;
            this.vt = 0.0f;
            this.f10859lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f10858le = -1;
            this.f10860ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f10859lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f10858le = -1;
            this.f10860ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
        }

        public ouw(Parcel parcel) {
            super(0, 0);
            this.ouw = 1;
            this.vt = 0.0f;
            this.f10859lh = 0.0f;
            this.yu = -1;
            this.fkw = -1.0f;
            this.f10858le = -1;
            this.f10860ra = -1;
            this.pno = ViewCompat.MEASURED_SIZE_MASK;
            this.bly = ViewCompat.MEASURED_SIZE_MASK;
            this.ouw = parcel.readInt();
            this.vt = parcel.readFloat();
            this.f10859lh = parcel.readFloat();
            this.yu = parcel.readInt();
            this.fkw = parcel.readFloat();
            this.f10858le = parcel.readInt();
            this.f10860ra = parcel.readInt();
            this.pno = parcel.readInt();
            this.bly = parcel.readInt();
            this.tlj = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }
    }

    public fkw(Context context) {
        super(context, null);
        this.f10855ra = -1;
        this.f10856rn = new yu(this);
        this.zih = new ArrayList();
        this.f10857vm = new yu.ouw();
    }

    private boolean fkw(int i10, int i11) {
        if (le(i10, i11)) {
            if (ouw()) {
                return (this.f10850cf & 1) != 0;
            }
            return (this.tlj & 1) != 0;
        }
        if (ouw()) {
            return (this.f10850cf & 2) != 0;
        }
        return (this.tlj & 2) != 0;
    }

    private boolean le(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewLh = lh(i10 - i12);
            if (viewLh != null && viewLh.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private View lh(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f10851jg;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    private void vt(int i10, int i11) {
        if (this.f10852ko == null) {
            this.f10852ko = new SparseIntArray(getChildCount());
        }
        if (this.f10856rn.vt(this.f10852ko)) {
            this.f10851jg = this.f10856rn.ouw(this.f10852ko);
        }
        int i12 = this.vt;
        if (i12 == 0 || i12 == 1) {
            lh(i10, i11);
        } else if (i12 == 2 || i12 == 3) {
            yu(i10, i11);
        } else {
            throw new IllegalStateException("Invalid value for the flex direction is set: " + this.vt);
        }
    }

    private void yu(int i10, int i11) {
        this.zih.clear();
        this.f10857vm.ouw();
        this.f10856rn.ouw(this.f10857vm, i10, i11);
        this.zih = this.f10857vm.ouw;
        this.f10856rn.ouw(i10, i11);
        this.f10856rn.ouw(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f10856rn.ouw();
        ouw(this.vt, i10, i11, this.f10857vm.vt);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View ouw(int i10) {
        return getChildAt(i10);
    }

    private void ouw(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: ".concat(String.valueOf(i10)));
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: ".concat(String.valueOf(mode)));
            }
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: ".concat(String.valueOf(mode2)));
            }
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f10852ko == null) {
            this.f10852ko = new SparseIntArray(getChildCount());
        }
        this.f10851jg = this.f10856rn.ouw(view, i10, layoutParams, this.f10852ko);
        super.addView(view, i10, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ouw;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ouw) {
            return new ouw((ouw) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new ouw((ViewGroup.MarginLayoutParams) layoutParams) : new ouw(layoutParams);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignContent() {
        return this.f10853le;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getAlignItems() {
        return this.fkw;
    }

    public final Drawable getDividerDrawableHorizontal() {
        return this.pno;
    }

    public final Drawable getDividerDrawableVertical() {
        return this.bly;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexDirection() {
        return this.vt;
    }

    public final List<lh> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.zih.size());
        for (lh lhVar : this.zih) {
            if (lhVar.ouw() != 0) {
                arrayList.add(lhVar);
            }
        }
        return arrayList;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final List<lh> getFlexLinesInternal() {
        return this.zih;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexWrap() {
        return this.f10854lh;
    }

    public final int getJustifyContent() {
        return this.yu;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getLargestMainSize() {
        Iterator<lh> it = this.zih.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().fkw);
        }
        return iMax;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getMaxLine() {
        return this.f10855ra;
    }

    public final int getShowDividerHorizontal() {
        return this.tlj;
    }

    public final int getShowDividerVertical() {
        return this.f10850cf;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getSumOfCrossSize() {
        int size = this.zih.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            lh lhVar = this.zih.get(i11);
            if (yu(i11)) {
                i10 += ouw() ? this.ryl : this.mwh;
            }
            if (le(i11)) {
                i10 += ouw() ? this.ryl : this.mwh;
            }
            i10 += lhVar.f10871ra;
        }
        return i10;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.bly == null && this.pno == null) {
            return;
        }
        if (this.tlj == 0 && this.f10850cf == 0) {
            return;
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i10 = this.vt;
        if (i10 == 0) {
            ouw(canvas, iOuw == 1, this.f10854lh == 2);
            return;
        }
        if (i10 == 1) {
            ouw(canvas, iOuw != 1, this.f10854lh == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iOuw == 1;
            if (this.f10854lh == 2) {
                z10 = !z10;
            }
            vt(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iOuw == 1;
        if (this.f10854lh == 2) {
            z11 = !z11;
        }
        vt(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.yu();
        }
        int iOuw = com.bytedance.adsdk.ugeno.ra.le.ouw(this);
        int i14 = this.vt;
        if (i14 == 0) {
            ouw(iOuw == 1, i10, i11, i12, i13);
        } else if (i14 == 1) {
            ouw(iOuw != 1, i10, i11, i12, i13);
        } else if (i14 == 2) {
            z11 = iOuw == 1;
            ouw(this.f10854lh == 2 ? !z11 : z11, false, i10, i11, i12, i13);
        } else {
            if (i14 != 3) {
                throw new IllegalStateException("Invalid flex direction is set: " + this.vt);
            }
            z11 = iOuw == 1;
            ouw(this.f10854lh == 2 ? !z11 : z11, true, i10, i11, i12, i13);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.fkw();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            int[] iArrOuw = yuVar.ouw(i10, i11);
            vt(iArrOuw[0], iArrOuw[1]);
        } else {
            vt(i10, i11);
        }
        com.bytedance.adsdk.ugeno.yu yuVar2 = this.ouw;
        if (yuVar2 != null) {
            yuVar2.lh();
        }
    }

    public final void setAlignContent(int i10) {
        if (this.f10853le != i10) {
            this.f10853le = i10;
            requestLayout();
        }
    }

    public final void setAlignItems(int i10) {
        if (this.fkw != i10) {
            this.fkw = i10;
            requestLayout();
        }
    }

    public final void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.pno) {
            return;
        }
        this.pno = drawable;
        if (drawable != null) {
            this.ryl = drawable.getIntrinsicHeight();
        } else {
            this.ryl = 0;
        }
        vt();
        requestLayout();
    }

    public final void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.bly) {
            return;
        }
        this.bly = drawable;
        if (drawable != null) {
            this.mwh = drawable.getIntrinsicWidth();
        } else {
            this.mwh = 0;
        }
        vt();
        requestLayout();
    }

    public final void setFlexDirection(int i10) {
        if (this.vt != i10) {
            this.vt = i10;
            requestLayout();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void setFlexLines(List<lh> list) {
        this.zih = list;
    }

    public final void setFlexWrap(int i10) {
        if (this.f10854lh != i10) {
            this.f10854lh = i10;
            requestLayout();
        }
    }

    public final void setJustifyContent(int i10) {
        if (this.yu != i10) {
            this.yu = i10;
            requestLayout();
        }
    }

    public final void setMaxLine(int i10) {
        if (this.f10855ra != i10) {
            this.f10855ra = i10;
            requestLayout();
        }
    }

    public final void setShowDividerHorizontal(int i10) {
        if (i10 != this.tlj) {
            this.tlj = i10;
            requestLayout();
        }
    }

    public final void setShowDividerVertical(int i10) {
        if (i10 != this.f10850cf) {
            this.f10850cf = i10;
            requestLayout();
        }
    }

    private boolean le(int i10) {
        if (i10 >= 0 && i10 < this.zih.size()) {
            for (int i11 = i10 + 1; i11 < this.zih.size(); i11++) {
                if (this.zih.get(i11).ouw() > 0) {
                    return false;
                }
            }
            if (ouw()) {
                return (this.tlj & 4) != 0;
            }
            if ((this.f10850cf & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    private void lh(int i10, int i11) {
        this.zih.clear();
        this.f10857vm.ouw();
        this.f10856rn.ouw(this.f10857vm, i10, i11, (List<lh>) null);
        this.zih = this.f10857vm.ouw;
        this.f10856rn.ouw(i10, i11);
        if (this.fkw == 3) {
            for (lh lhVar : this.zih) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < lhVar.pno; i12++) {
                    View viewLh = lh(lhVar.f10868ko + i12);
                    if (viewLh != null && viewLh.getVisibility() != 8) {
                        ouw ouwVar = (ouw) viewLh.getLayoutParams();
                        if (this.f10854lh != 2) {
                            iMax = Math.max(iMax, viewLh.getMeasuredHeight() + Math.max(lhVar.ryl - viewLh.getBaseline(), ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin);
                        } else {
                            iMax = Math.max(iMax, viewLh.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) ouwVar).topMargin + Math.max((lhVar.ryl - viewLh.getMeasuredHeight()) + viewLh.getBaseline(), ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin));
                        }
                    }
                }
                lhVar.f10871ra = iMax;
            }
        }
        this.f10856rn.ouw(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f10856rn.ouw();
        ouw(this.vt, i10, i11, this.f10857vm.vt);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int getFlexItemCount() {
        return getChildCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.le();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.ra();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.bytedance.adsdk.ugeno.yu yuVar = this.ouw;
        if (yuVar != null) {
            yuVar.vt(i10, i11);
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
    }

    public final void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public final void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    private boolean fkw(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.zih.get(i11).ouw() > 0) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final View vt(int i10) {
        return lh(i10);
    }

    private void vt(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int bottom;
        int top2;
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.zih.size();
        for (int i12 = 0; i12 < size; i12++) {
            lh lhVar = this.zih.get(i12);
            for (int i13 = 0; i13 < lhVar.pno; i13++) {
                int i14 = lhVar.f10868ko + i13;
                View viewLh = lh(i14);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i14, i13)) {
                        if (z11) {
                            top2 = viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                        } else {
                            top2 = (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl;
                        }
                        vt(canvas, lhVar.ouw, top2, lhVar.f10871ra);
                    }
                    if (i13 == lhVar.pno - 1 && (this.tlj & 4) > 0) {
                        if (z11) {
                            bottom = (viewLh.getTop() - ((ViewGroup.MarginLayoutParams) ouwVar).topMargin) - this.ryl;
                        } else {
                            bottom = viewLh.getBottom() + ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                        }
                        vt(canvas, lhVar.ouw, bottom, lhVar.f10871ra);
                    }
                }
            }
            if (yu(i12)) {
                if (z10) {
                    i11 = lhVar.f10870lh;
                } else {
                    i11 = lhVar.ouw - this.mwh;
                }
                ouw(canvas, i11, paddingTop, iMax);
            }
            if (le(i12) && (this.f10850cf & 4) > 0) {
                if (z10) {
                    i10 = lhVar.ouw - this.mwh;
                } else {
                    i10 = lhVar.f10870lh;
                }
                ouw(canvas, i10, paddingTop, iMax);
            }
        }
    }

    private boolean yu(int i10) {
        if (i10 >= 0 && i10 < this.zih.size()) {
            if (fkw(i10)) {
                if (ouw()) {
                    return (this.tlj & 1) != 0;
                }
                return (this.f10850cf & 1) != 0;
            }
            if (ouw()) {
                return (this.tlj & 2) != 0;
            }
            if ((this.f10850cf & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final boolean ouw() {
        int i10 = this.vt;
        return i10 == 0 || i10 == 1;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00da  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x0101  */
    /* JADX WARN: Code duplicated, block: B:51:0x010a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0112  */
    /* JADX WARN: Code duplicated, block: B:54:0x0117  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153  */
    /* JADX WARN: Code duplicated, block: B:61:0x017d  */
    /* JADX WARN: Code duplicated, block: B:63:0x018a  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:71:0x0207  */
    private void ouw(boolean z10, int i10, int i11, int i12, int i13) {
        float measuredWidth;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        View viewLh;
        int i16;
        int i17;
        int i18;
        char c10;
        ouw ouwVar;
        float f12;
        float f13;
        float f14;
        int i19;
        char c11;
        int i20;
        ouw ouwVar2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = i12 - i10;
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.zih.size();
        int i22 = 0;
        while (i22 < size) {
            lh lhVar = this.zih.get(i22);
            if (yu(i22)) {
                int i23 = this.ryl;
                paddingBottom -= i23;
                paddingTop += i23;
            }
            int i24 = this.yu;
            char c12 = 4;
            int i25 = 1;
            if (i24 == 0) {
                measuredWidth = paddingLeft;
                f10 = i21 - paddingRight;
            } else if (i24 == 1) {
                int i26 = lhVar.fkw;
                f10 = i26 - paddingLeft;
                measuredWidth = (i21 - i26) + paddingRight;
            } else {
                if (i24 == 2) {
                    int i27 = lhVar.fkw;
                    measuredWidth = paddingLeft + ((i21 - i27) / 2.0f);
                    f10 = (i21 - paddingRight) - ((i21 - i27) / 2.0f);
                } else if (i24 == 3) {
                    measuredWidth = paddingLeft;
                    int iOuw = lhVar.ouw();
                    f11 = (i21 - lhVar.fkw) / (iOuw != 1 ? iOuw - 1 : 1.0f);
                    f10 = i21 - paddingRight;
                } else if (i24 == 4) {
                    int iOuw2 = lhVar.ouw();
                    f11 = iOuw2 != 0 ? (i21 - lhVar.fkw) / iOuw2 : 0.0f;
                    float f15 = f11 / 2.0f;
                    measuredWidth = paddingLeft + f15;
                    f10 = (i21 - paddingRight) - f15;
                } else if (i24 == 5) {
                    int iOuw3 = lhVar.ouw();
                    f11 = iOuw3 != 0 ? (i21 - lhVar.fkw) / (iOuw3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f10 = (i21 - paddingRight) - f11;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.yu);
                }
                fMax = Math.max(f11, 0.0f);
                i14 = 0;
                while (i14 < lhVar.pno) {
                    i15 = lhVar.f10868ko + i14;
                    viewLh = lh(i15);
                    if (viewLh != null) {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        c10 = c12;
                    } else if (viewLh.getVisibility() != 8) {
                        ouwVar = (ouw) viewLh.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                        if (fkw(i15, i14)) {
                            int i28 = this.mwh;
                            float f16 = i28;
                            f12 += f16;
                            i19 = i28;
                            f14 = f13 - f16;
                        } else {
                            f14 = f13;
                            i19 = 0;
                        }
                        if (i14 == lhVar.pno - i25) {
                            c11 = 4;
                            i20 = (this.f10850cf & 4) > 0 ? this.mwh : 0;
                            if (this.f10854lh == 2) {
                                i16 = paddingLeft;
                                i17 = i25;
                                i18 = i14;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                if (z10) {
                                    this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewLh.getMeasuredHeight());
                                } else {
                                    this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingTop, Math.round(f12) + viewLh.getMeasuredWidth(), paddingTop + viewLh.getMeasuredHeight());
                                }
                            } else if (z10) {
                                i17 = i25;
                                i18 = i14;
                                i16 = paddingLeft;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f14), paddingBottom);
                            } else {
                                i16 = paddingLeft;
                                i17 = i25;
                                i18 = i14;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f12) + viewLh.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f12 + viewLh.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar2).rightMargin;
                            float measuredWidth2 = f14 - ((viewLh.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar2).leftMargin);
                            if (z10) {
                                lhVar.ouw(viewLh, i20, 0, i19, 0);
                            } else {
                                lhVar.ouw(viewLh, i19, 0, i20, 0);
                            }
                            f10 = measuredWidth2;
                        } else {
                            c11 = 4;
                        }
                        if (this.f10854lh == 2) {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            if (z10) {
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewLh.getMeasuredHeight());
                            } else {
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingTop, Math.round(f12) + viewLh.getMeasuredWidth(), paddingTop + viewLh.getMeasuredHeight());
                            }
                        } else if (z10) {
                            i17 = i25;
                            i18 = i14;
                            i16 = paddingLeft;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f14), paddingBottom);
                        } else {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f12) + viewLh.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f12 + viewLh.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar2).rightMargin;
                        float measuredWidth3 = f14 - ((viewLh.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar2).leftMargin);
                        if (z10) {
                            lhVar.ouw(viewLh, i20, 0, i19, 0);
                        } else {
                            lhVar.ouw(viewLh, i19, 0, i20, 0);
                        }
                        f10 = measuredWidth3;
                    } else {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        c10 = 4;
                    }
                    i14 = i18 + 1;
                    paddingLeft = i16;
                    i25 = i17;
                    c12 = c10;
                }
                int i29 = paddingLeft;
                int i30 = lhVar.f10871ra;
                paddingTop += i30;
                paddingBottom -= i30;
                i22++;
                paddingLeft = i29;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i14 = 0;
            while (i14 < lhVar.pno) {
                i15 = lhVar.f10868ko + i14;
                viewLh = lh(i15);
                if (viewLh != null) {
                    i16 = paddingLeft;
                    i17 = i25;
                    i18 = i14;
                    c10 = c12;
                } else if (viewLh.getVisibility() != 8) {
                    ouwVar = (ouw) viewLh.getLayoutParams();
                    f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin;
                    f13 = f10 - ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                    if (fkw(i15, i14)) {
                        int i210 = this.mwh;
                        float f17 = i210;
                        f12 += f17;
                        i19 = i210;
                        f14 = f13 - f17;
                    } else {
                        f14 = f13;
                        i19 = 0;
                    }
                    if (i14 == lhVar.pno - i25) {
                        c11 = 4;
                        if ((this.f10850cf & 4) > 0) {
                        }
                        if (this.f10854lh == 2) {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            if (z10) {
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewLh.getMeasuredHeight());
                            } else {
                                this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingTop, Math.round(f12) + viewLh.getMeasuredWidth(), paddingTop + viewLh.getMeasuredHeight());
                            }
                        } else if (z10) {
                            i17 = i25;
                            i18 = i14;
                            i16 = paddingLeft;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f14), paddingBottom);
                        } else {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f12) + viewLh.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f12 + viewLh.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar2).rightMargin;
                        float measuredWidth4 = f14 - ((viewLh.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar2).leftMargin);
                        if (z10) {
                            lhVar.ouw(viewLh, i20, 0, i19, 0);
                        } else {
                            lhVar.ouw(viewLh, i19, 0, i20, 0);
                        }
                        f10 = measuredWidth4;
                    } else {
                        c11 = 4;
                    }
                    if (this.f10854lh == 2) {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        if (z10) {
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewLh.getMeasuredHeight());
                        } else {
                            this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingTop, Math.round(f12) + viewLh.getMeasuredWidth(), paddingTop + viewLh.getMeasuredHeight());
                        }
                    } else if (z10) {
                        i17 = i25;
                        i18 = i14;
                        i16 = paddingLeft;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        this.f10856rn.ouw(viewLh, lhVar, Math.round(f14) - viewLh.getMeasuredWidth(), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f14), paddingBottom);
                    } else {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        this.f10856rn.ouw(viewLh, lhVar, Math.round(f12), paddingBottom - viewLh.getMeasuredHeight(), Math.round(f12) + viewLh.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f12 + viewLh.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar2).rightMargin;
                    float measuredWidth5 = f14 - ((viewLh.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar2).leftMargin);
                    if (z10) {
                        lhVar.ouw(viewLh, i20, 0, i19, 0);
                    } else {
                        lhVar.ouw(viewLh, i19, 0, i20, 0);
                    }
                    f10 = measuredWidth5;
                } else {
                    i16 = paddingLeft;
                    i17 = i25;
                    i18 = i14;
                    c10 = 4;
                }
                i14 = i18 + 1;
                paddingLeft = i16;
                i25 = i17;
                c12 = c10;
            }
            int i211 = paddingLeft;
            int i31 = lhVar.f10871ra;
            paddingTop += i31;
            paddingBottom -= i31;
            i22++;
            paddingLeft = i211;
        }
    }

    private void vt(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.pno;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.ryl + i11);
        this.pno.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int vt(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    private void vt() {
        if (this.pno == null && this.bly == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:52:0x010d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:55:0x011a  */
    /* JADX WARN: Code duplicated, block: B:58:0x0120 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0151  */
    /* JADX WARN: Code duplicated, block: B:61:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x0183  */
    /* JADX WARN: Code duplicated, block: B:64:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:67:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:70:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0201  */
    private void ouw(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        float f10;
        int i14;
        float f11;
        float f12;
        float fMax;
        int i15;
        int i16;
        View viewLh;
        int i17;
        boolean z12;
        char c10;
        ouw ouwVar;
        float f13;
        float f14;
        float f15;
        float f16;
        int i18;
        char c11;
        int i19;
        ouw ouwVar2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i20 = i13 - i11;
        int i21 = (i12 - i10) - paddingRight;
        int size = this.zih.size();
        for (int i22 = 0; i22 < size; i22++) {
            lh lhVar = this.zih.get(i22);
            if (yu(i22)) {
                int i23 = this.mwh;
                paddingLeft += i23;
                i21 -= i23;
            }
            int i24 = this.yu;
            char c12 = 4;
            boolean z13 = true;
            if (i24 != 0) {
                if (i24 == 1) {
                    int i25 = lhVar.fkw;
                    f10 = (i20 - i25) + paddingBottom;
                    i14 = i25 - paddingTop;
                } else if (i24 == 2) {
                    int i26 = lhVar.fkw;
                    f11 = (i20 - paddingBottom) - ((i20 - i26) / 2.0f);
                    f10 = paddingTop + ((i20 - i26) / 2.0f);
                    f12 = 0.0f;
                } else if (i24 == 3) {
                    f10 = paddingTop;
                    int iOuw = lhVar.ouw();
                    f12 = (i20 - lhVar.fkw) / (iOuw != 1 ? iOuw - 1 : 1.0f);
                    f11 = i20 - paddingBottom;
                } else if (i24 == 4) {
                    int iOuw2 = lhVar.ouw();
                    f12 = iOuw2 != 0 ? (i20 - lhVar.fkw) / iOuw2 : 0.0f;
                    float f17 = f12 / 2.0f;
                    f10 = paddingTop + f17;
                    f11 = (i20 - paddingBottom) - f17;
                } else if (i24 == 5) {
                    int iOuw3 = lhVar.ouw();
                    f12 = iOuw3 != 0 ? (i20 - lhVar.fkw) / (iOuw3 + 1) : 0.0f;
                    f10 = paddingTop + f12;
                    f11 = (i20 - paddingBottom) - f12;
                } else {
                    throw new IllegalStateException("Invalid justifyContent is set: " + this.yu);
                }
                fMax = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < lhVar.pno) {
                    i16 = lhVar.f10868ko + i15;
                    viewLh = lh(i16);
                    if (viewLh != null) {
                        i17 = i15;
                        z12 = z13;
                        c10 = c12;
                    } else if (viewLh.getVisibility() != 8) {
                        ouwVar = (ouw) viewLh.getLayoutParams();
                        f13 = f10 + ((ViewGroup.MarginLayoutParams) ouwVar).topMargin;
                        f14 = f11 - ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                        if (fkw(i16, i15)) {
                            int i27 = this.ryl;
                            float f18 = i27;
                            f15 = f13 + f18;
                            i18 = i27;
                            f16 = f14 - f18;
                        } else {
                            f15 = f13;
                            f16 = f14;
                            i18 = 0;
                        }
                        if (i15 == lhVar.pno - 1) {
                            c11 = 4;
                            i19 = (this.tlj & 4) > 0 ? this.ryl : 0;
                            if (z10) {
                                i17 = i15;
                                z12 = true;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                if (z11) {
                                    this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f16) - viewLh.getMeasuredHeight(), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f16));
                                } else {
                                    this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f15), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f15) + viewLh.getMeasuredHeight());
                                }
                            } else if (z11) {
                                i17 = i15;
                                z12 = true;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f16) - viewLh.getMeasuredHeight(), i21, Math.round(f16));
                            } else {
                                i17 = i15;
                                z12 = true;
                                ouwVar2 = ouwVar;
                                c10 = c11;
                                this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewLh.getMeasuredHeight());
                            }
                            ouw ouwVar3 = ouwVar2;
                            float measuredHeight = f15 + viewLh.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar3).bottomMargin;
                            float measuredHeight2 = f16 - ((viewLh.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar3).topMargin);
                            if (z11) {
                                lhVar.ouw(viewLh, 0, i19, 0, i18);
                            } else {
                                lhVar.ouw(viewLh, 0, i18, 0, i19);
                            }
                            f10 = measuredHeight;
                            f11 = measuredHeight2;
                        } else {
                            c11 = 4;
                        }
                        if (z10) {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            if (z11) {
                                this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f16) - viewLh.getMeasuredHeight(), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f16));
                            } else {
                                this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f15), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f15) + viewLh.getMeasuredHeight());
                            }
                        } else if (z11) {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f16) - viewLh.getMeasuredHeight(), i21, Math.round(f16));
                        } else {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewLh.getMeasuredHeight());
                        }
                        ouw ouwVar4 = ouwVar2;
                        float measuredHeight3 = f15 + viewLh.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar4).bottomMargin;
                        float measuredHeight4 = f16 - ((viewLh.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar4).topMargin);
                        if (z11) {
                            lhVar.ouw(viewLh, 0, i19, 0, i18);
                        } else {
                            lhVar.ouw(viewLh, 0, i18, 0, i19);
                        }
                        f10 = measuredHeight3;
                        f11 = measuredHeight4;
                    } else {
                        i17 = i15;
                        z12 = true;
                        c10 = 4;
                    }
                    i15 = i17 + 1;
                    z13 = z12;
                    c12 = c10;
                }
                int i28 = lhVar.f10871ra;
                paddingLeft += i28;
                i21 -= i28;
            } else {
                f10 = paddingTop;
                i14 = i20 - paddingBottom;
            }
            f11 = i14;
            f12 = 0.0f;
            fMax = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < lhVar.pno) {
                i16 = lhVar.f10868ko + i15;
                viewLh = lh(i16);
                if (viewLh != null) {
                    i17 = i15;
                    z12 = z13;
                    c10 = c12;
                } else if (viewLh.getVisibility() != 8) {
                    ouwVar = (ouw) viewLh.getLayoutParams();
                    f13 = f10 + ((ViewGroup.MarginLayoutParams) ouwVar).topMargin;
                    f14 = f11 - ((ViewGroup.MarginLayoutParams) ouwVar).bottomMargin;
                    if (fkw(i16, i15)) {
                        int i29 = this.ryl;
                        float f19 = i29;
                        f15 = f13 + f19;
                        i18 = i29;
                        f16 = f14 - f19;
                    } else {
                        f15 = f13;
                        f16 = f14;
                        i18 = 0;
                    }
                    if (i15 == lhVar.pno - 1) {
                        c11 = 4;
                        if ((this.tlj & 4) > 0) {
                        }
                        if (z10) {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            if (z11) {
                                this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f16) - viewLh.getMeasuredHeight(), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f16));
                            } else {
                                this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f15), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f15) + viewLh.getMeasuredHeight());
                            }
                        } else if (z11) {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f16) - viewLh.getMeasuredHeight(), i21, Math.round(f16));
                        } else {
                            i17 = i15;
                            z12 = true;
                            ouwVar2 = ouwVar;
                            c10 = c11;
                            this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewLh.getMeasuredHeight());
                        }
                        ouw ouwVar5 = ouwVar2;
                        float measuredHeight5 = f15 + viewLh.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar5).bottomMargin;
                        float measuredHeight6 = f16 - ((viewLh.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar5).topMargin);
                        if (z11) {
                            lhVar.ouw(viewLh, 0, i19, 0, i18);
                        } else {
                            lhVar.ouw(viewLh, 0, i18, 0, i19);
                        }
                        f10 = measuredHeight5;
                        f11 = measuredHeight6;
                    } else {
                        c11 = 4;
                    }
                    if (z10) {
                        i17 = i15;
                        z12 = true;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        if (z11) {
                            this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f16) - viewLh.getMeasuredHeight(), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f16));
                        } else {
                            this.f10856rn.ouw(viewLh, lhVar, false, paddingLeft, Math.round(f15), paddingLeft + viewLh.getMeasuredWidth(), Math.round(f15) + viewLh.getMeasuredHeight());
                        }
                    } else if (z11) {
                        i17 = i15;
                        z12 = true;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f16) - viewLh.getMeasuredHeight(), i21, Math.round(f16));
                    } else {
                        i17 = i15;
                        z12 = true;
                        ouwVar2 = ouwVar;
                        c10 = c11;
                        this.f10856rn.ouw(viewLh, lhVar, true, i21 - viewLh.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewLh.getMeasuredHeight());
                    }
                    ouw ouwVar6 = ouwVar2;
                    float measuredHeight7 = f15 + viewLh.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) ouwVar6).bottomMargin;
                    float measuredHeight8 = f16 - ((viewLh.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) ouwVar6).topMargin);
                    if (z11) {
                        lhVar.ouw(viewLh, 0, i19, 0, i18);
                    } else {
                        lhVar.ouw(viewLh, 0, i18, 0, i19);
                    }
                    f10 = measuredHeight7;
                    f11 = measuredHeight8;
                } else {
                    i17 = i15;
                    z12 = true;
                    c10 = 4;
                }
                i15 = i17 + 1;
                z13 = z12;
                c12 = c10;
            }
            int i210 = lhVar.f10871ra;
            paddingLeft += i210;
            i21 -= i210;
        }
    }

    private void ouw(Canvas canvas, boolean z10, boolean z11) {
        int i10;
        int i11;
        int right;
        int left;
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.zih.size();
        for (int i12 = 0; i12 < size; i12++) {
            lh lhVar = this.zih.get(i12);
            for (int i13 = 0; i13 < lhVar.pno; i13++) {
                int i14 = lhVar.f10868ko + i13;
                View viewLh = lh(i14);
                if (viewLh != null && viewLh.getVisibility() != 8) {
                    ouw ouwVar = (ouw) viewLh.getLayoutParams();
                    if (fkw(i14, i13)) {
                        if (z10) {
                            left = viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                        } else {
                            left = (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh;
                        }
                        ouw(canvas, left, lhVar.vt, lhVar.f10871ra);
                    }
                    if (i13 == lhVar.pno - 1 && (this.f10850cf & 4) > 0) {
                        if (z10) {
                            right = (viewLh.getLeft() - ((ViewGroup.MarginLayoutParams) ouwVar).leftMargin) - this.mwh;
                        } else {
                            right = viewLh.getRight() + ((ViewGroup.MarginLayoutParams) ouwVar).rightMargin;
                        }
                        ouw(canvas, right, lhVar.vt, lhVar.f10871ra);
                    }
                }
            }
            if (yu(i12)) {
                if (z11) {
                    i11 = lhVar.yu;
                } else {
                    i11 = lhVar.vt - this.ryl;
                }
                vt(canvas, paddingLeft, i11, iMax);
            }
            if (le(i12) && (this.tlj & 4) > 0) {
                if (z11) {
                    i10 = lhVar.vt - this.ryl;
                } else {
                    i10 = lhVar.yu;
                }
                vt(canvas, paddingLeft, i10, iMax);
            }
        }
    }

    private void ouw(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.bly;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.mwh + i10, i12 + i11);
        this.bly.draw(canvas);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i10, int i11) {
        int i12;
        int i13;
        if (ouw()) {
            i12 = fkw(i10, i11) ? 0 + this.mwh : 0;
            if ((this.f10850cf & 4) <= 0) {
                return i12;
            }
            i13 = this.mwh;
        } else {
            i12 = fkw(i10, i11) ? 0 + this.ryl : 0;
            if ((this.tlj & 4) <= 0) {
                return i12;
            }
            i13 = this.ryl;
        }
        return i12 + i13;
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(lh lhVar) {
        if (ouw()) {
            if ((this.f10850cf & 4) > 0) {
                int i10 = lhVar.fkw;
                int i11 = this.mwh;
                lhVar.fkw = i10 + i11;
                lhVar.f10869le += i11;
                return;
            }
            return;
        }
        if ((this.tlj & 4) > 0) {
            int i12 = lhVar.fkw;
            int i13 = this.ryl;
            lhVar.fkw = i12 + i13;
            lhVar.f10869le += i13;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final int ouw(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.bytedance.adsdk.ugeno.fkw.ouw
    public final void ouw(int i10, int i11, lh lhVar) {
        if (fkw(i10, i11)) {
            if (ouw()) {
                int i12 = lhVar.fkw;
                int i13 = this.mwh;
                lhVar.fkw = i12 + i13;
                lhVar.f10869le += i13;
                return;
            }
            int i14 = lhVar.fkw;
            int i15 = this.ryl;
            lhVar.fkw = i14 + i15;
            lhVar.f10869le += i15;
        }
    }
}
