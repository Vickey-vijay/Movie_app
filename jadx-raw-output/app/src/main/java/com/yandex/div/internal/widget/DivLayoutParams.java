package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import ck.i;
import ck.s;
import com.google.android.material.badge.BadgeDrawable;
import com.yandex.div.internal.util.PositiveNumberDelegate;
import jk.k;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: compiled from: DivLayoutParams.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.f(new MutablePropertyReference1Impl(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0)), s.f(new MutablePropertyReference1Impl(DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0))};
    public static final Companion Companion = new Companion(null);
    private final PositiveNumberDelegate columnSpan$delegate;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;
    private final PositiveNumberDelegate rowSpan$delegate;
    private float verticalWeight;

    /* JADX INFO: compiled from: DivLayoutParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public DivLayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = BadgeDrawable.TOP_START;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DivLayoutParams.class != obj.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        if (((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan()) {
            if (this.verticalWeight == divLayoutParams.verticalWeight) {
                if ((this.horizontalWeight == divLayoutParams.horizontalWeight) && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int getColumnSpan() {
        return this.columnSpan$delegate.getValue(this, $$delegatedProperties[0]).intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final float getHorizontalWeight() {
        return this.horizontalWeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getRowSpan() {
        return this.rowSpan$delegate.getValue(this, $$delegatedProperties[1]).intValue();
    }

    public final int getVerticalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final float getVerticalWeight() {
        return this.verticalWeight;
    }

    public final boolean isBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z10) {
        this.isBaselineAligned = z10;
    }

    public final void setColumnSpan(int i10) {
        this.columnSpan$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setGravity(int i10) {
        this.gravity = i10;
    }

    public final void setHorizontalWeight(float f10) {
        this.horizontalWeight = f10;
    }

    public final void setMaxHeight(int i10) {
        this.maxHeight = i10;
    }

    public final void setMaxWidth(int i10) {
        this.maxWidth = i10;
    }

    public final void setRowSpan(int i10) {
        this.rowSpan$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i10));
    }

    public final void setVerticalWeight(float f10) {
        this.verticalWeight = f10;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((super.hashCode() * 31) + this.gravity) * 31) + (this.isBaselineAligned ? 1 : 0)) * 31) + getColumnSpan()) * 31) + getRowSpan()) * 31) + Float.floatToIntBits(this.verticalWeight)) * 31) + Float.floatToIntBits(this.horizontalWeight)) * 31;
        int i10 = this.maxHeight;
        int i11 = 0;
        if (i10 == Integer.MAX_VALUE) {
            i10 = 0;
        }
        int i12 = (iHashCode + i10) * 31;
        int i13 = this.maxWidth;
        if (i13 != Integer.MAX_VALUE) {
            i11 = i13;
        }
        return i12 + i11;
    }

    public DivLayoutParams(int i10, int i11) {
        super(i10, i11);
        this.gravity = BadgeDrawable.TOP_START;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = BadgeDrawable.TOP_START;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = BadgeDrawable.TOP_START;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(DivLayoutParams divLayoutParams) {
        super((ViewGroup.MarginLayoutParams) divLayoutParams);
        this.gravity = BadgeDrawable.TOP_START;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.gravity = divLayoutParams.gravity;
        this.isBaselineAligned = divLayoutParams.isBaselineAligned;
        this.verticalWeight = divLayoutParams.verticalWeight;
        this.horizontalWeight = divLayoutParams.horizontalWeight;
        setColumnSpan(divLayoutParams.getColumnSpan());
        setRowSpan(divLayoutParams.getRowSpan());
        this.maxHeight = divLayoutParams.maxHeight;
        this.maxWidth = divLayoutParams.maxWidth;
    }
}
