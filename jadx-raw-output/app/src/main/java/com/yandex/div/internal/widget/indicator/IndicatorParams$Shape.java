package com.yandex.div.internal.widget.indicator;

import ck.i;
import ck.p;

/* JADX INFO: compiled from: IndicatorParams.kt */
/* JADX INFO: loaded from: classes8.dex */
public abstract class IndicatorParams$Shape {

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class Circle extends IndicatorParams$Shape {
        private final int color;
        private final IndicatorParams$ItemSize.Circle itemSize;

        public Circle(int i10, IndicatorParams$ItemSize.Circle circle) {
            super(null);
            this.color = i10;
            this.itemSize = circle;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Circle)) {
                return false;
            }
            Circle circle = (Circle) obj;
            return this.color == circle.color && p.e(this.itemSize, circle.itemSize);
        }

        public int hashCode() {
            return (Integer.hashCode(this.color) * 31) + this.itemSize.hashCode();
        }

        public String toString() {
            return "Circle(color=" + this.color + ", itemSize=" + this.itemSize + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public IndicatorParams$ItemSize.Circle getItemSize() {
            return this.itemSize;
        }
    }

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class RoundedRect extends IndicatorParams$Shape {
        private final int color;
        private final IndicatorParams$ItemSize.RoundedRect itemSize;
        private final int strokeColor;
        private final float strokeWidth;

        public RoundedRect(int i10, IndicatorParams$ItemSize.RoundedRect roundedRect, float f10, int i11) {
            super(null);
            this.color = i10;
            this.itemSize = roundedRect;
            this.strokeWidth = f10;
            this.strokeColor = i11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return this.color == roundedRect.color && p.e(this.itemSize, roundedRect.itemSize) && Float.compare(this.strokeWidth, roundedRect.strokeWidth) == 0 && this.strokeColor == roundedRect.strokeColor;
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.color) * 31) + this.itemSize.hashCode()) * 31) + Float.hashCode(this.strokeWidth)) * 31) + Integer.hashCode(this.strokeColor);
        }

        public String toString() {
            return "RoundedRect(color=" + this.color + ", itemSize=" + this.itemSize + ", strokeWidth=" + this.strokeWidth + ", strokeColor=" + this.strokeColor + ')';
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public int getColor() {
            return this.color;
        }

        @Override // com.yandex.div.internal.widget.indicator.IndicatorParams$Shape
        public IndicatorParams$ItemSize.RoundedRect getItemSize() {
            return this.itemSize;
        }

        public final int getStrokeColor() {
            return this.strokeColor;
        }

        public final float getStrokeWidth() {
            return this.strokeWidth;
        }
    }

    private IndicatorParams$Shape() {
    }

    public /* synthetic */ IndicatorParams$Shape(i iVar) {
        this();
    }

    public abstract int getColor();

    public abstract IndicatorParams$ItemSize getItemSize();

    public final int getBorderColor() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeColor();
        }
        return 0;
    }

    public final float getBorderWidth() {
        if (this instanceof RoundedRect) {
            return ((RoundedRect) this).getStrokeWidth();
        }
        return 0.0f;
    }
}
