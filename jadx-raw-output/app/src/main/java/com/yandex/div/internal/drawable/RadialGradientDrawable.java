package com.yandex.div.internal.drawable;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import bk.a;
import ck.i;
import ck.p;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b;
import mj.g;
import nj.n;

/* JADX INFO: compiled from: RadialGradientDrawable.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RadialGradientDrawable extends Drawable {
    public static final Companion Companion = new Companion(null);
    private Center centerX;
    private Center centerY;
    private int[] colors;
    private Radius radius;
    private final Paint paint = new Paint();
    private RectF rect = new RectF();

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static abstract class Center {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Center {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }

            public final float getValue() {
                return this.value;
            }
        }

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Center {
            private final float value;

            public Relative(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && Float.compare(this.value, ((Relative) obj).value) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return "Relative(value=" + this.value + ')';
            }

            public final float getValue() {
                return this.value;
            }
        }

        private Center() {
        }

        public /* synthetic */ Center(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static final class Companion {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Radius.Relative.Type.values().length];
                try {
                    iArr[Radius.Relative.Type.NEAREST_CORNER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_CORNER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Radius.Relative.Type.NEAREST_SIDE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Radius.Relative.Type.FARTHEST_SIDE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distTo(float f10, float f11, float f12, float f13) {
            double d10 = 2;
            return (float) Math.sqrt(((float) Math.pow(f10 - f12, d10)) + ((float) Math.pow(f11 - f13, d10)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToHorizontalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final float createRadialGradient$distToVerticalSide(float f10, float f11) {
            return Math.abs(f10 - f11);
        }

        private static final float createRadialGradient$value(Center center, int i10) {
            if (center instanceof Center.Fixed) {
                return ((Center.Fixed) center).getValue();
            }
            if (center instanceof Center.Relative) {
                return ((Center.Relative) center).getValue() * i10;
            }
            throw new NoWhenBranchMatchedException();
        }

        private static final Float[] createRadialGradient$lambda$0(g<Float[]> gVar) {
            return gVar.getValue();
        }

        private static final Float[] createRadialGradient$lambda$1(g<Float[]> gVar) {
            return gVar.getValue();
        }

        public final RadialGradient createRadialGradient(Radius radius, Center center, Center center2, int[] iArr, int i10, int i11) {
            float fFloatValue;
            final float fCreateRadialGradient$value = createRadialGradient$value(center, i10);
            final float fCreateRadialGradient$value2 = createRadialGradient$value(center2, i11);
            final float f10 = i10;
            final float f11 = i11;
            final float f12 = 0.0f;
            final float f13 = 0.0f;
            g gVarA = b.a(new a<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToCorners$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f13)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f10, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distTo(fCreateRadialGradient$value, fCreateRadialGradient$value2, f12, f11))};
                }
            });
            final float f14 = 0.0f;
            g gVarA2 = b.a(new a<Float[]>() { // from class: com.yandex.div.internal.drawable.RadialGradientDrawable$Companion$createRadialGradient$distancesToSides$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public final Float[] invoke() {
                    return new Float[]{Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f12)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToVerticalSide(fCreateRadialGradient$value, f10)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f11)), Float.valueOf(RadialGradientDrawable.Companion.createRadialGradient$distToHorizontalSide(fCreateRadialGradient$value2, f14))};
                }
            });
            if (radius instanceof Radius.Fixed) {
                fFloatValue = ((Radius.Fixed) radius).getValue();
            } else if (radius instanceof Radius.Relative) {
                int i12 = WhenMappings.$EnumSwitchMapping$0[((Radius.Relative) radius).getType().ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 == 4) {
                                Float fD0 = n.d0(createRadialGradient$lambda$1(gVarA2));
                                p.g(fD0);
                                fFloatValue = fD0.floatValue();
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            Float fE0 = n.e0(createRadialGradient$lambda$1(gVarA2));
                            p.g(fE0);
                            fFloatValue = fE0.floatValue();
                        }
                    } else {
                        Float fD1 = n.d0(createRadialGradient$lambda$0(gVarA));
                        p.g(fD1);
                        fFloatValue = fD1.floatValue();
                    }
                } else {
                    Float fE1 = n.e0(createRadialGradient$lambda$0(gVarA));
                    p.g(fE1);
                    fFloatValue = fE1.floatValue();
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
            if (fFloatValue <= 0.0f) {
                fFloatValue = 0.01f;
            }
            return new RadialGradient(fCreateRadialGradient$value, fCreateRadialGradient$value2, fFloatValue, iArr, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    /* JADX INFO: compiled from: RadialGradientDrawable.kt */
    public static abstract class Radius {

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Fixed extends Radius {
            private final float value;

            public Fixed(float f10) {
                super(null);
                this.value = f10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Fixed) && Float.compare(this.value, ((Fixed) obj).value) == 0;
            }

            public int hashCode() {
                return Float.hashCode(this.value);
            }

            public String toString() {
                return "Fixed(value=" + this.value + ')';
            }

            public final float getValue() {
                return this.value;
            }
        }

        /* JADX INFO: compiled from: RadialGradientDrawable.kt */
        public static final class Relative extends Radius {
            private final Type type;

            /* JADX INFO: compiled from: RadialGradientDrawable.kt */
            public enum Type {
                NEAREST_CORNER,
                FARTHEST_CORNER,
                NEAREST_SIDE,
                FARTHEST_SIDE
            }

            public Relative(Type type) {
                super(null);
                this.type = type;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Relative) && this.type == ((Relative) obj).type;
            }

            public int hashCode() {
                return this.type.hashCode();
            }

            public String toString() {
                return "Relative(type=" + this.type + ')';
            }

            public final Type getType() {
                return this.type;
            }
        }

        private Radius() {
        }

        public /* synthetic */ Radius(i iVar) {
            this();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        canvas.drawRect(this.rect, this.paint);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.paint.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i10) {
        this.paint.setAlpha(i10);
        invalidateSelf();
    }

    public RadialGradientDrawable(Radius radius, Center center, Center center2, int[] iArr) {
        this.radius = radius;
        this.centerX = center;
        this.centerY = center2;
        this.colors = iArr;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.paint.setShader(Companion.createRadialGradient(this.radius, this.centerX, this.centerY, this.colors, rect.width(), rect.height()));
        this.rect.set(rect);
    }
}
