package com.yandex.div.internal.widget.indicator;

import ck.i;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: IndicatorParams.kt */
/* JADX INFO: loaded from: classes6.dex */
public abstract class IndicatorParams$ItemSize {

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class Circle extends IndicatorParams$ItemSize {
        private float radius;

        public Circle(float f10) {
            super(null);
            this.radius = f10;
        }

        public final Circle copy(float f10) {
            return new Circle(f10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Circle) && Float.compare(this.radius, ((Circle) obj).radius) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.radius);
        }

        public String toString() {
            return "Circle(radius=" + this.radius + ')';
        }

        public final float getRadius() {
            return this.radius;
        }
    }

    /* JADX INFO: compiled from: IndicatorParams.kt */
    public static final class RoundedRect extends IndicatorParams$ItemSize {
        private float cornerRadius;
        private float itemHeight;
        private float itemWidth;

        public RoundedRect(float f10, float f11, float f12) {
            super(null);
            this.itemWidth = f10;
            this.itemHeight = f11;
            this.cornerRadius = f12;
        }

        public static /* synthetic */ RoundedRect copy$default(RoundedRect roundedRect, float f10, float f11, float f12, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                f10 = roundedRect.itemWidth;
            }
            if ((i10 & 2) != 0) {
                f11 = roundedRect.itemHeight;
            }
            if ((i10 & 4) != 0) {
                f12 = roundedRect.cornerRadius;
            }
            return roundedRect.copy(f10, f11, f12);
        }

        public final RoundedRect copy(float f10, float f11, float f12) {
            return new RoundedRect(f10, f11, f12);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RoundedRect)) {
                return false;
            }
            RoundedRect roundedRect = (RoundedRect) obj;
            return Float.compare(this.itemWidth, roundedRect.itemWidth) == 0 && Float.compare(this.itemHeight, roundedRect.itemHeight) == 0 && Float.compare(this.cornerRadius, roundedRect.cornerRadius) == 0;
        }

        public int hashCode() {
            return (((Float.hashCode(this.itemWidth) * 31) + Float.hashCode(this.itemHeight)) * 31) + Float.hashCode(this.cornerRadius);
        }

        public String toString() {
            return "RoundedRect(itemWidth=" + this.itemWidth + ", itemHeight=" + this.itemHeight + ", cornerRadius=" + this.cornerRadius + ')';
        }

        public final float getCornerRadius() {
            return this.cornerRadius;
        }

        public final float getItemHeight() {
            return this.itemHeight;
        }

        public final float getItemWidth() {
            return this.itemWidth;
        }
    }

    private IndicatorParams$ItemSize() {
    }

    public /* synthetic */ IndicatorParams$ItemSize(i iVar) {
        this();
    }

    public final float getHeight() {
        double dCeil;
        if (this instanceof RoundedRect) {
            dCeil = Math.ceil(((RoundedRect) this).getItemHeight());
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            dCeil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) dCeil;
    }

    public final float getWidth() {
        double dCeil;
        if (this instanceof RoundedRect) {
            dCeil = Math.ceil(((RoundedRect) this).getItemWidth());
        } else {
            if (!(this instanceof Circle)) {
                throw new NoWhenBranchMatchedException();
            }
            dCeil = Math.ceil(((Circle) this).getRadius() * 2);
        }
        return (float) dCeil;
    }
}
