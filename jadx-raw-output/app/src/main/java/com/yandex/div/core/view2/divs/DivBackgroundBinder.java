package com.yandex.div.core.view2.divs;

import android.R;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.PictureDrawable;
import android.graphics.drawable.StateListDrawable;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.util.StateSet;
import android.view.View;
import androidx.annotation.UiThread;
import androidx.core.content.ContextCompat;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.R$drawable;
import com.yandex.div.R$id;
import com.yandex.div.core.DivIdLoggingImageDownloadCallback;
import com.yandex.div.core.images.CachedBitmap;
import com.yandex.div.core.images.DivImageLoader;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ImageUtilsKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.NinePatchDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.drawable.ScalingDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivBackground;
import com.yandex.div2.DivFilter;
import com.yandex.div2.DivImageBackground;
import com.yandex.div2.DivImageScale;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mj.r;
import nj.b0;
import nj.s;
import nj.t;

/* JADX INFO: compiled from: DivBackgroundBinder.kt */
/* JADX INFO: loaded from: classes5.dex */
public class DivBackgroundBinder {
    private final DivImageLoader imageLoader;

    /* JADX INFO: compiled from: DivBackgroundBinder.kt */
    public static abstract class DivBackgroundState {

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class Image extends DivBackgroundState {
            private final double alpha;
            private final DivAlignmentHorizontal contentAlignmentHorizontal;
            private final DivAlignmentVertical contentAlignmentVertical;
            private final List<Filter> filters;
            private final Uri imageUrl;
            private final boolean isVectorCompatible;
            private final boolean preloadRequired;
            private final DivImageScale scale;

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Filter {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Blur extends Filter {
                    private final DivFilter.a div;
                    private final int radius;

                    public Blur(int i10, DivFilter.a aVar) {
                        super(null);
                        this.radius = i10;
                        this.div = aVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof Blur)) {
                            return false;
                        }
                        Blur blur = (Blur) obj;
                        return this.radius == blur.radius && p.e(this.div, blur.div);
                    }

                    public int hashCode() {
                        return (Integer.hashCode(this.radius) * 31) + this.div.hashCode();
                    }

                    public String toString() {
                        return "Blur(radius=" + this.radius + ", div=" + this.div + ')';
                    }

                    public final DivFilter.a getDiv() {
                        return this.div;
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class RtlMirror extends Filter {
                    private final DivFilter.c div;

                    public RtlMirror(DivFilter.c cVar) {
                        super(null);
                        this.div = cVar;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof RtlMirror) && p.e(this.div, ((RtlMirror) obj).div);
                    }

                    public int hashCode() {
                        return this.div.hashCode();
                    }

                    public String toString() {
                        return "RtlMirror(div=" + this.div + ')';
                    }

                    public final DivFilter.c getDiv() {
                        return this.div;
                    }
                }

                private Filter() {
                }

                public /* synthetic */ Filter(i iVar) {
                    this();
                }

                public final DivFilter toDiv() {
                    if (this instanceof Blur) {
                        return ((Blur) this).getDiv();
                    }
                    if (this instanceof RtlMirror) {
                        return ((RtlMirror) this).getDiv();
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                public static final /* synthetic */ int[] $EnumSwitchMapping$1;
                public static final /* synthetic */ int[] $EnumSwitchMapping$2;

                static {
                    int[] iArr = new int[DivImageScale.values().length];
                    try {
                        iArr[DivImageScale.FILL.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[DivImageScale.FIT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[DivImageScale.STRETCH.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                    int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                    try {
                        iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$1 = iArr2;
                    int[] iArr3 = new int[DivAlignmentVertical.values().length];
                    try {
                        iArr3[DivAlignmentVertical.CENTER.ordinal()] = 1;
                    } catch (NoSuchFieldError unused9) {
                    }
                    try {
                        iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 2;
                    } catch (NoSuchFieldError unused10) {
                    }
                    $EnumSwitchMapping$2 = iArr3;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Image(double d10, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical, Uri uri, boolean z10, DivImageScale divImageScale, List<? extends Filter> list, boolean z11) {
                super(null);
                this.alpha = d10;
                this.contentAlignmentHorizontal = divAlignmentHorizontal;
                this.contentAlignmentVertical = divAlignmentVertical;
                this.imageUrl = uri;
                this.preloadRequired = z10;
                this.scale = divImageScale;
                this.filters = list;
                this.isVectorCompatible = z11;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Double.compare(this.alpha, image.alpha) == 0 && this.contentAlignmentHorizontal == image.contentAlignmentHorizontal && this.contentAlignmentVertical == image.contentAlignmentVertical && p.e(this.imageUrl, image.imageUrl) && this.preloadRequired == image.preloadRequired && this.scale == image.scale && p.e(this.filters, image.filters) && this.isVectorCompatible == image.isVectorCompatible;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v15, types: [int] */
            /* JADX WARN: Type inference failed for: r0v9, types: [int] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            /* JADX WARN: Type inference failed for: r1v7, types: [int] */
            /* JADX WARN: Type inference failed for: r2v0 */
            /* JADX WARN: Type inference failed for: r2v1, types: [int] */
            /* JADX WARN: Type inference failed for: r2v2 */
            public int hashCode() {
                int iHashCode = ((((((Double.hashCode(this.alpha) * 31) + this.contentAlignmentHorizontal.hashCode()) * 31) + this.contentAlignmentVertical.hashCode()) * 31) + this.imageUrl.hashCode()) * 31;
                boolean z10 = this.preloadRequired;
                ?? r10 = z10;
                if (z10) {
                    r10 = 1;
                }
                int iHashCode2 = (((iHashCode + r10) * 31) + this.scale.hashCode()) * 31;
                List<Filter> list = this.filters;
                int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
                boolean z11 = this.isVectorCompatible;
                return iHashCode3 + (z11 ? 1 : z11);
            }

            public String toString() {
                return "Image(alpha=" + this.alpha + ", contentAlignmentHorizontal=" + this.contentAlignmentHorizontal + ", contentAlignmentVertical=" + this.contentAlignmentVertical + ", imageUrl=" + this.imageUrl + ", preloadRequired=" + this.preloadRequired + ", scale=" + this.scale + ", filters=" + this.filters + ", isVectorCompatible=" + this.isVectorCompatible + ')';
            }

            private final ScalingDrawable.AlignmentHorizontal toHorizontalAlignment(DivAlignmentHorizontal divAlignmentHorizontal, boolean z10) {
                int i10 = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
                if (i10 == 1) {
                    return ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 2) {
                    return ScalingDrawable.AlignmentHorizontal.CENTER;
                }
                if (i10 == 3) {
                    return ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                if (i10 == 4) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.RIGHT : ScalingDrawable.AlignmentHorizontal.LEFT;
                }
                if (i10 == 5) {
                    return z10 ? ScalingDrawable.AlignmentHorizontal.LEFT : ScalingDrawable.AlignmentHorizontal.RIGHT;
                }
                throw new NoWhenBranchMatchedException();
            }

            private final ScalingDrawable.ScaleType toScaleType(DivImageScale divImageScale) {
                int i10 = WhenMappings.$EnumSwitchMapping$0[divImageScale.ordinal()];
                if (i10 == 1) {
                    return ScalingDrawable.ScaleType.FILL;
                }
                if (i10 != 2) {
                    return i10 != 3 ? ScalingDrawable.ScaleType.NO_SCALE : ScalingDrawable.ScaleType.STRETCH;
                }
                return ScalingDrawable.ScaleType.FIT;
            }

            private final ScalingDrawable.AlignmentVertical toVerticalAlignment(DivAlignmentVertical divAlignmentVertical) {
                int i10 = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
                if (i10 != 1) {
                    return i10 != 2 ? ScalingDrawable.AlignmentVertical.TOP : ScalingDrawable.AlignmentVertical.BOTTOM;
                }
                return ScalingDrawable.AlignmentVertical.CENTER;
            }

            public final Drawable getDivImageBackground(final BindingContext bindingContext, final View view, DivImageLoader divImageLoader) {
                final ScalingDrawable scalingDrawable = new ScalingDrawable();
                scalingDrawable.setAlpha((int) (this.alpha * ((double) 255)));
                scalingDrawable.setCustomScaleType(toScaleType(this.scale));
                scalingDrawable.setAlignmentHorizontal(toHorizontalAlignment(this.contentAlignmentHorizontal, ViewsKt.isLayoutRtl(view)));
                scalingDrawable.setAlignmentVertical(toVerticalAlignment(this.contentAlignmentVertical));
                String string = this.imageUrl.toString();
                final Div2View divView = bindingContext.getDivView();
                bindingContext.getDivView().addLoadReference(divImageLoader.loadImage(string, new DivIdLoggingImageDownloadCallback(divView) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(CachedBitmap cachedBitmap) {
                        ArrayList arrayList;
                        View view2 = view;
                        BindingContext bindingContext2 = bindingContext;
                        Bitmap bitmap = cachedBitmap.getBitmap();
                        List<DivBackgroundBinder.DivBackgroundState.Image.Filter> filters = this.getFilters();
                        if (filters != null) {
                            arrayList = new ArrayList(t.v(filters, 10));
                            Iterator<T> it = filters.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((DivBackgroundBinder.DivBackgroundState.Image.Filter) it.next()).toDiv());
                            }
                        } else {
                            arrayList = null;
                        }
                        final ScalingDrawable scalingDrawable2 = scalingDrawable;
                        BaseDivViewExtensionsKt.applyBitmapFilters(view2, bindingContext2, bitmap, arrayList, new l<Bitmap, r>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$Image$getDivImageBackground$loadReference$1$onSuccess$2
                            {
                                super(1);
                            }

                            @Override // bk.l
                            public /* bridge */ /* synthetic */ r invoke(Bitmap bitmap2) {
                                invoke2(bitmap2);
                                return r.f64562a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(Bitmap bitmap2) {
                                scalingDrawable2.setBitmap(bitmap2);
                            }
                        });
                    }

                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(PictureDrawable pictureDrawable) {
                        if (!this.isVectorCompatible()) {
                            onSuccess(ImageUtilsKt.toCachedBitmap$default(pictureDrawable, this.getImageUrl(), null, 2, null));
                        } else {
                            scalingDrawable.setPicture(pictureDrawable.getPicture());
                        }
                    }
                }), view);
                return scalingDrawable;
            }

            public final List<Filter> getFilters() {
                return this.filters;
            }

            public final Uri getImageUrl() {
                return this.imageUrl;
            }

            public final boolean isVectorCompatible() {
                return this.isVectorCompatible;
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class LinearGradient extends DivBackgroundState {
            private final int angle;
            private final Colormap colormap;

            public LinearGradient(int i10, Colormap colormap) {
                super(null);
                this.angle = i10;
                this.colormap = colormap;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof LinearGradient)) {
                    return false;
                }
                LinearGradient linearGradient = (LinearGradient) obj;
                return this.angle == linearGradient.angle && p.e(this.colormap, linearGradient.colormap);
            }

            public int hashCode() {
                return (Integer.hashCode(this.angle) * 31) + this.colormap.hashCode();
            }

            public String toString() {
                return "LinearGradient(angle=" + this.angle + ", colormap=" + this.colormap + ')';
            }

            public final int getAngle() {
                return this.angle;
            }

            public final Colormap getColormap() {
                return this.colormap;
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class NinePatch extends DivBackgroundState {
            private final Uri imageUrl;
            private final Rect insets;

            public NinePatch(Uri uri, Rect rect) {
                super(null);
                this.imageUrl = uri;
                this.insets = rect;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof NinePatch)) {
                    return false;
                }
                NinePatch ninePatch = (NinePatch) obj;
                return p.e(this.imageUrl, ninePatch.imageUrl) && p.e(this.insets, ninePatch.insets);
            }

            public int hashCode() {
                return (this.imageUrl.hashCode() * 31) + this.insets.hashCode();
            }

            public String toString() {
                return "NinePatch(imageUrl=" + this.imageUrl + ", insets=" + this.insets + ')';
            }

            public final Rect getInsets() {
                return this.insets;
            }

            public final Drawable getNinePatchDrawable(final Div2View div2View, View view, DivImageLoader divImageLoader) {
                final NinePatchDrawable ninePatchDrawable = new NinePatchDrawable();
                div2View.addLoadReference(divImageLoader.loadImage(this.imageUrl.toString(), new DivIdLoggingImageDownloadCallback(div2View) { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$DivBackgroundState$NinePatch$getNinePatchDrawable$loadReference$1
                    @Override // com.yandex.div.core.images.DivImageDownloadCallback
                    @UiThread
                    public void onSuccess(CachedBitmap cachedBitmap) {
                        NinePatchDrawable ninePatchDrawable2 = ninePatchDrawable;
                        DivBackgroundBinder.DivBackgroundState.NinePatch ninePatch = this;
                        ninePatchDrawable2.setBottom(ninePatch.getInsets().bottom);
                        ninePatchDrawable2.setLeft(ninePatch.getInsets().left);
                        ninePatchDrawable2.setRight(ninePatch.getInsets().right);
                        ninePatchDrawable2.setTop(ninePatch.getInsets().top);
                        ninePatchDrawable2.setBitmap(cachedBitmap.getBitmap());
                    }
                }), view);
                return ninePatchDrawable;
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class RadialGradient extends DivBackgroundState {
            private final Center centerX;
            private final Center centerY;
            private final List<Integer> colors;
            private final Radius radius;

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Center {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Center {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
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

                public final RadialGradientDrawable.Center toRadialGradientDrawableCenter() {
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Center.Fixed(((Fixed) this).getValuePx());
                    }
                    if (this instanceof Relative) {
                        return new RadialGradientDrawable.Center.Relative(((Relative) this).getValue());
                    }
                    throw new NoWhenBranchMatchedException();
                }
            }

            /* JADX INFO: compiled from: DivBackgroundBinder.kt */
            public static abstract class Radius {

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Fixed extends Radius {
                    private final float valuePx;

                    public Fixed(float f10) {
                        super(null);
                        this.valuePx = f10;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Fixed) && Float.compare(this.valuePx, ((Fixed) obj).valuePx) == 0;
                    }

                    public int hashCode() {
                        return Float.hashCode(this.valuePx);
                    }

                    public String toString() {
                        return "Fixed(valuePx=" + this.valuePx + ')';
                    }

                    public final float getValuePx() {
                        return this.valuePx;
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public static final class Relative extends Radius {
                    private final DivRadialGradientRelativeRadius.Value value;

                    public Relative(DivRadialGradientRelativeRadius.Value value) {
                        super(null);
                        this.value = value;
                    }

                    public boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        return (obj instanceof Relative) && this.value == ((Relative) obj).value;
                    }

                    public int hashCode() {
                        return this.value.hashCode();
                    }

                    public String toString() {
                        return "Relative(value=" + this.value + ')';
                    }

                    public final DivRadialGradientRelativeRadius.Value getValue() {
                        return this.value;
                    }
                }

                /* JADX INFO: compiled from: DivBackgroundBinder.kt */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[DivRadialGradientRelativeRadius.Value.values().length];
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        try {
                            iArr[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
                        } catch (NoSuchFieldError unused4) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

                private Radius() {
                }

                public /* synthetic */ Radius(i iVar) {
                    this();
                }

                public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius() {
                    RadialGradientDrawable.Radius.Relative.Type type;
                    if (this instanceof Fixed) {
                        return new RadialGradientDrawable.Radius.Fixed(((Fixed) this).getValuePx());
                    }
                    if (!(this instanceof Relative)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i10 = WhenMappings.$EnumSwitchMapping$0[((Relative) this).getValue().ordinal()];
                    if (i10 == 1) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_CORNER;
                    } else if (i10 == 2) {
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_CORNER;
                    } else if (i10 == 3) {
                        type = RadialGradientDrawable.Radius.Relative.Type.FARTHEST_SIDE;
                    } else {
                        if (i10 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        type = RadialGradientDrawable.Radius.Relative.Type.NEAREST_SIDE;
                    }
                    return new RadialGradientDrawable.Radius.Relative(type);
                }
            }

            public RadialGradient(Center center, Center center2, List<Integer> list, Radius radius) {
                super(null);
                this.centerX = center;
                this.centerY = center2;
                this.colors = list;
                this.radius = radius;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RadialGradient)) {
                    return false;
                }
                RadialGradient radialGradient = (RadialGradient) obj;
                return p.e(this.centerX, radialGradient.centerX) && p.e(this.centerY, radialGradient.centerY) && p.e(this.colors, radialGradient.colors) && p.e(this.radius, radialGradient.radius);
            }

            public int hashCode() {
                return (((((this.centerX.hashCode() * 31) + this.centerY.hashCode()) * 31) + this.colors.hashCode()) * 31) + this.radius.hashCode();
            }

            public String toString() {
                return "RadialGradient(centerX=" + this.centerX + ", centerY=" + this.centerY + ", colors=" + this.colors + ", radius=" + this.radius + ')';
            }

            public final Center getCenterX() {
                return this.centerX;
            }

            public final Center getCenterY() {
                return this.centerY;
            }

            public final List<Integer> getColors() {
                return this.colors;
            }

            public final Radius getRadius() {
                return this.radius;
            }
        }

        /* JADX INFO: compiled from: DivBackgroundBinder.kt */
        public static final class Solid extends DivBackgroundState {
            private final int color;

            public Solid(int i10) {
                super(null);
                this.color = i10;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Solid) && this.color == ((Solid) obj).color;
            }

            public int hashCode() {
                return Integer.hashCode(this.color);
            }

            public String toString() {
                return "Solid(color=" + this.color + ')';
            }

            public final int getColor() {
                return this.color;
            }
        }

        private DivBackgroundState() {
        }

        public /* synthetic */ DivBackgroundState(i iVar) {
            this();
        }

        public final Drawable toDrawable(BindingContext bindingContext, View view, DivImageLoader divImageLoader) {
            if (this instanceof Image) {
                return ((Image) this).getDivImageBackground(bindingContext, view, divImageLoader);
            }
            if (this instanceof NinePatch) {
                return ((NinePatch) this).getNinePatchDrawable(bindingContext.getDivView(), view, divImageLoader);
            }
            if (this instanceof Solid) {
                return new ColorDrawable(((Solid) this).getColor());
            }
            if (this instanceof LinearGradient) {
                LinearGradient linearGradient = (LinearGradient) this;
                return new LinearGradientDrawable(linearGradient.getAngle(), linearGradient.getColormap());
            }
            if (!(this instanceof RadialGradient)) {
                throw new NoWhenBranchMatchedException();
            }
            RadialGradient radialGradient = (RadialGradient) this;
            return new RadialGradientDrawable(radialGradient.getRadius().toRadialGradientDrawableRadius(), radialGradient.getCenterX().toRadialGradientDrawableCenter(), radialGradient.getCenterY().toRadialGradientDrawableCenter(), b0.N0(radialGradient.getColors()));
        }
    }

    private void bindDefaultBackground(final BindingContext bindingContext, final View view, final Drawable drawable, final List<? extends DivBackground> list, List<? extends DivBackground> list2, ExpressionSubscriber expressionSubscriber) {
        boolean z10;
        List<? extends DivBackground> listK = list == null ? s.k() : list;
        List<? extends DivBackground> listK2 = list2 == null ? s.k() : list2;
        Drawable additionalLayer = getAdditionalLayer(view);
        boolean z11 = true;
        if (listK.size() == listK2.size()) {
            Iterator<T> it = listK.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next, listK2.get(i10))) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
        } else {
            z10 = false;
            break;
        }
        if (z10 && p.e(drawable, additionalLayer)) {
            return;
        }
        applyDefaultBackground(view, bindingContext, drawable, list);
        if (!listK.isEmpty()) {
            Iterator<T> it2 = listK.iterator();
            while (it2.hasNext()) {
                if (!DivDataExtensionsKt.isConstant((DivBackground) it2.next())) {
                    z11 = false;
                    break;
                }
            }
        }
        if (z11) {
            return;
        }
        addBackgroundSubscriptions(list, bindingContext.getExpressionResolver(), expressionSubscriber, new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindDefaultBackground$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyDefaultBackground(view, bindingContext, drawable, list);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    private void bindFocusBackground(final BindingContext bindingContext, final View view, final Drawable drawable, final List<? extends DivBackground> list, List<? extends DivBackground> list2, final List<? extends DivBackground> list3, List<? extends DivBackground> list4, ExpressionSubscriber expressionSubscriber) {
        boolean z10;
        boolean z11;
        boolean z12;
        List<? extends DivBackground> listK = list == null ? s.k() : list;
        List<? extends DivBackground> listK2 = list2 == null ? s.k() : list2;
        List<? extends DivBackground> listK3 = list4 == null ? s.k() : list4;
        Drawable additionalLayer = getAdditionalLayer(view);
        boolean z13 = true;
        if (listK.size() == listK2.size()) {
            Iterator<T> it = listK.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    s.u();
                }
                if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next, listK2.get(i10))) {
                    z10 = false;
                    break;
                }
                i10 = i11;
            }
        } else {
            z10 = false;
            break;
        }
        if (z10) {
            if (list3.size() == listK3.size()) {
                Iterator<T> it2 = list3.iterator();
                int i12 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        z12 = true;
                        break;
                    }
                    Object next2 = it2.next();
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        s.u();
                    }
                    if (!DivDataExtensionsKt.equalsToConstant((DivBackground) next2, listK3.get(i12))) {
                        z12 = false;
                        break;
                    }
                    i12 = i13;
                }
            } else {
                z12 = false;
                break;
            }
            if (z12) {
                if (p.e(drawable, additionalLayer)) {
                    return;
                }
            }
        }
        applyFocusedBackground(view, bindingContext, drawable, list, list3);
        if (!listK.isEmpty()) {
            Iterator<T> it3 = listK.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    z11 = true;
                    break;
                } else if (!DivDataExtensionsKt.isConstant((DivBackground) it3.next())) {
                    z11 = false;
                    break;
                }
            }
        } else {
            z11 = true;
            break;
        }
        if (z11) {
            if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                Iterator<T> it4 = list3.iterator();
                while (it4.hasNext()) {
                    if (!DivDataExtensionsKt.isConstant((DivBackground) it4.next())) {
                        z13 = false;
                        break;
                    }
                }
            }
            if (z13) {
                return;
            }
        }
        l<Object, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivBackgroundBinder$bindFocusBackground$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                this.this$0.applyFocusedBackground(view, bindingContext, drawable, list, list3);
            }
        };
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        addBackgroundSubscriptions(list, expressionResolver, expressionSubscriber, lVar);
        addBackgroundSubscriptions(list3, expressionResolver, expressionSubscriber, lVar);
    }

    private DivBackgroundState toBackgroundState(DivBackground divBackground, Div2View div2View, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        int i10;
        int i11;
        int i12;
        int i13;
        ArrayList arrayList;
        List<Integer> listK;
        int i14;
        if (divBackground instanceof DivBackground.c) {
            DivBackground.c cVar = (DivBackground.c) divBackground;
            long jLongValue = cVar.c().f48038a.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i14 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i14 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.LinearGradient(i14, ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(cVar.c(), expressionResolver), div2View));
        }
        if (divBackground instanceof DivBackground.e) {
            DivBackground.e eVar = (DivBackground.e) divBackground;
            DivBackgroundState.RadialGradient.Center backgroundState = toBackgroundState(eVar.c().f48430a, displayMetrics, expressionResolver);
            DivBackgroundState.RadialGradient.Center backgroundState2 = toBackgroundState(eVar.c().f48431b, displayMetrics, expressionResolver);
            ExpressionList<Integer> expressionList = eVar.c().f48433d;
            if (expressionList == null || (listK = expressionList.evaluate(expressionResolver)) == null) {
                listK = s.k();
            }
            return new DivBackgroundState.RadialGradient(backgroundState, backgroundState2, listK, toBackgroundState(eVar.c().f48434e, displayMetrics, expressionResolver));
        }
        if (divBackground instanceof DivBackground.b) {
            DivBackground.b bVar = (DivBackground.b) divBackground;
            double dDoubleValue = bVar.c().f47586a.evaluate(expressionResolver).doubleValue();
            DivAlignmentHorizontal divAlignmentHorizontalEvaluate = bVar.c().f47587b.evaluate(expressionResolver);
            DivAlignmentVertical divAlignmentVerticalEvaluate = bVar.c().f47588c.evaluate(expressionResolver);
            Uri uriEvaluate = bVar.c().f47590e.evaluate(expressionResolver);
            boolean zBooleanValue = bVar.c().f47591f.evaluate(expressionResolver).booleanValue();
            DivImageScale divImageScaleEvaluate = bVar.c().f47592g.evaluate(expressionResolver);
            List<DivFilter> list = bVar.c().f47589d;
            if (list != null) {
                arrayList = new ArrayList(t.v(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(toBackgroundState((DivFilter) it.next(), expressionResolver));
                }
            } else {
                arrayList = null;
            }
            return new DivBackgroundState.Image(dDoubleValue, divAlignmentHorizontalEvaluate, divAlignmentVerticalEvaluate, uriEvaluate, zBooleanValue, divImageScaleEvaluate, arrayList, isVectorCompatible(bVar.c(), expressionResolver));
        }
        if (divBackground instanceof DivBackground.f) {
            return new DivBackgroundState.Solid(((DivBackground.f) divBackground).c().f49006a.evaluate(expressionResolver).intValue());
        }
        if (!(divBackground instanceof DivBackground.d)) {
            throw new NoWhenBranchMatchedException();
        }
        DivBackground.d dVar = (DivBackground.d) divBackground;
        Uri uriEvaluate2 = dVar.c().f48077a.evaluate(expressionResolver);
        long jLongValue2 = dVar.c().f48078b.f45978b.evaluate(expressionResolver).longValue();
        long j11 = jLongValue2 >> 31;
        if (j11 == 0 || j11 == -1) {
            i10 = (int) jLongValue2;
        } else {
            KAssert kAssert2 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue2 + "' to Int");
            }
            i10 = jLongValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue3 = dVar.c().f48078b.f45980d.evaluate(expressionResolver).longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            i11 = jLongValue3 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue4 = dVar.c().f48078b.f45979c.evaluate(expressionResolver).longValue();
        long j13 = jLongValue4 >> 31;
        if (j13 == 0 || j13 == -1) {
            i12 = (int) jLongValue4;
        } else {
            KAssert kAssert4 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue4 + "' to Int");
            }
            i12 = jLongValue4 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        long jLongValue5 = dVar.c().f48078b.f45977a.evaluate(expressionResolver).longValue();
        long j14 = jLongValue5 >> 31;
        if (j14 == 0 || j14 == -1) {
            i13 = (int) jLongValue5;
        } else {
            KAssert kAssert5 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue5 + "' to Int");
            }
            i13 = jLongValue5 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }
        return new DivBackgroundState.NinePatch(uriEvaluate2, new Rect(i10, i11, i12, i13));
    }

    private void addBackgroundSubscriptions(List<? extends DivBackground> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, l<Object, r> lVar) {
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                ExpressionSubscribersKt.observeBackground(expressionSubscriber, (DivBackground) it.next(), expressionResolver, lVar);
            }
        }
    }

    private Drawable getAdditionalLayer(View view) {
        Object tag = view.getTag(R$id.div_additional_background_layer_tag);
        if (tag instanceof Drawable) {
            return (Drawable) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getDefaultBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_default_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private List<DivBackgroundState> getFocusedBackgroundList(View view) {
        Object tag = view.getTag(R$id.div_focused_background_list_tag);
        if (tag instanceof List) {
            return (List) tag;
        }
        return null;
    }

    private boolean isVectorCompatible(DivImageBackground divImageBackground, ExpressionResolver expressionResolver) {
        if (divImageBackground.f47586a.evaluate(expressionResolver).doubleValue() == 1.0d) {
            List<DivFilter> list = divImageBackground.f47589d;
            if (list == null || list.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    private void setAdditionalLayer(View view, Drawable drawable) {
        view.setTag(R$id.div_additional_background_layer_tag, drawable);
    }

    private void setDefaultBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_default_background_list_tag, list);
    }

    private void setFocusedBackgroundList(View view, List<? extends DivBackgroundState> list) {
        view.setTag(R$id.div_focused_background_list_tag, list);
    }

    private Drawable toDrawable(List<? extends DivBackgroundState> list, BindingContext bindingContext, View view, Drawable drawable) {
        if (drawable != null) {
            drawable.mutate();
        }
        if (list == null) {
            if (drawable != null) {
                return new LayerDrawable(new Drawable[]{drawable});
            }
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            Drawable drawableMutate = ((DivBackgroundState) it.next()).toDrawable(bindingContext, view, this.imageLoader).mutate();
            if (drawableMutate != null) {
                arrayList.add(drawableMutate);
            }
        }
        List listR0 = b0.R0(arrayList);
        if (drawable != null) {
            listR0.add(drawable);
        }
        if (!listR0.isEmpty()) {
            return new LayerDrawable((Drawable[]) listR0.toArray(new Drawable[0]));
        }
        return null;
    }

    private void updateBackground(View view, Drawable drawable) {
        boolean z10;
        ArrayList arrayList = new ArrayList();
        if (drawable != null) {
            arrayList.add(drawable);
        }
        Drawable background = view.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        if ((layerDrawable != null ? layerDrawable.findDrawableByLayerId(R$drawable.native_animation_background) : null) != null) {
            Drawable drawable2 = ContextCompat.getDrawable(view.getContext(), R$drawable.native_animation_background);
            if (drawable2 != null) {
                arrayList.add(drawable2);
            }
            z10 = true;
        } else {
            z10 = false;
        }
        view.setBackground(new LayerDrawable((Drawable[]) arrayList.toArray(new Drawable[0])));
        if (z10) {
            Drawable background2 = view.getBackground();
            p.h(background2, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            Drawable background3 = view.getBackground();
            p.h(background3, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
            ((LayerDrawable) background2).setId(((LayerDrawable) background3).getNumberOfLayers() - 1, R$drawable.native_animation_background);
        }
    }

    public void bindBackground(BindingContext bindingContext, View view, List<? extends DivBackground> list, List<? extends DivBackground> list2, List<? extends DivBackground> list3, List<? extends DivBackground> list4, ExpressionSubscriber expressionSubscriber, Drawable drawable) {
        if (list3 == null) {
            bindDefaultBackground(bindingContext, view, drawable, list, list2, expressionSubscriber);
        } else {
            bindFocusBackground(bindingContext, view, drawable, list, list2, list3, list4, expressionSubscriber);
        }
    }

    public DivBackgroundBinder(DivImageLoader divImageLoader) {
        this.imageLoader = divImageLoader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDefaultBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list) {
        List<? extends DivBackgroundState> listK;
        boolean z10;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            listK = new ArrayList<>(t.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listK.add(toBackgroundState((DivBackground) it.next(), bindingContext.getDivView(), displayMetrics, expressionResolver));
            }
        } else {
            listK = s.k();
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (p.e(defaultBackgroundList, listK) && p.e(additionalLayer, drawable)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            updateBackground(view, toDrawable(listK, bindingContext, view, drawable));
            setDefaultBackgroundList(view, listK);
            setFocusedBackgroundList(view, null);
            setAdditionalLayer(view, drawable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyFocusedBackground(View view, BindingContext bindingContext, Drawable drawable, List<? extends DivBackground> list, List<? extends DivBackground> list2) {
        List<? extends DivBackgroundState> listK;
        boolean z10;
        DisplayMetrics displayMetrics = view.getResources().getDisplayMetrics();
        Div2View divView = bindingContext.getDivView();
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        if (list != null) {
            listK = new ArrayList<>(t.v(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                listK.add(toBackgroundState((DivBackground) it.next(), divView, displayMetrics, expressionResolver));
            }
        } else {
            listK = s.k();
        }
        List<? extends DivBackgroundState> arrayList = new ArrayList<>(t.v(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList.add(toBackgroundState((DivBackground) it2.next(), divView, displayMetrics, expressionResolver));
        }
        List<DivBackgroundState> defaultBackgroundList = getDefaultBackgroundList(view);
        List<DivBackgroundState> focusedBackgroundList = getFocusedBackgroundList(view);
        Drawable additionalLayer = getAdditionalLayer(view);
        if (p.e(defaultBackgroundList, listK) && p.e(focusedBackgroundList, arrayList) && p.e(additionalLayer, drawable)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{R.attr.state_focused}, toDrawable(arrayList, bindingContext, view, drawable));
            if (list != null || drawable != null) {
                stateListDrawable.addState(StateSet.WILD_CARD, toDrawable(listK, bindingContext, view, drawable));
            }
            updateBackground(view, stateListDrawable);
            setDefaultBackgroundList(view, listK);
            setFocusedBackgroundList(view, arrayList);
            setAdditionalLayer(view, drawable);
        }
    }

    private DivBackgroundState.RadialGradient.Center toBackgroundState(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            DivRadialGradientCenter.b bVar = (DivRadialGradientCenter.b) divRadialGradientCenter;
            return new DivBackgroundState.RadialGradient.Center.Fixed(BaseDivViewExtensionsKt.toPxF(bVar.c().f48454b.evaluate(expressionResolver).longValue(), bVar.c().f48453a.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return new DivBackgroundState.RadialGradient.Center.Relative((float) ((DivRadialGradientCenter.c) divRadialGradientCenter).c().f48478a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.RadialGradient.Radius toBackgroundState(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return new DivBackgroundState.RadialGradient.Radius.Fixed(BaseDivViewExtensionsKt.toPxF(((DivRadialGradientRadius.b) divRadialGradientRadius).c(), displayMetrics, expressionResolver));
        }
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.c) {
            return new DivBackgroundState.RadialGradient.Radius.Relative(((DivRadialGradientRadius.c) divRadialGradientRadius).c().f48485a.evaluate(expressionResolver));
        }
        throw new NoWhenBranchMatchedException();
    }

    private DivBackgroundState.Image.Filter toBackgroundState(DivFilter divFilter, ExpressionResolver expressionResolver) {
        int i10;
        if (divFilter instanceof DivFilter.a) {
            DivFilter.a aVar = (DivFilter.a) divFilter;
            long jLongValue = aVar.c().f46529a.evaluate(expressionResolver).longValue();
            long j10 = jLongValue >> 31;
            if (j10 == 0 || j10 == -1) {
                i10 = (int) jLongValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable convert '" + jLongValue + "' to Int");
                }
                i10 = jLongValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            return new DivBackgroundState.Image.Filter.Blur(i10, aVar);
        }
        if (divFilter instanceof DivFilter.c) {
            return new DivBackgroundState.Image.Filter.RtlMirror((DivFilter.c) divFilter);
        }
        throw new NoWhenBranchMatchedException();
    }
}
