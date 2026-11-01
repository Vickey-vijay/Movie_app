package com.yandex.div.core.view2.divs.widgets;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.NinePatch;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.core.view.ViewCompat;
import bk.a;
import bk.l;
import ck.i;
import com.yandex.div.R$dimen;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.ShadowCache;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.BorderParams;
import com.yandex.div.core.view2.divs.widgets.DivBorderDrawer.ShadowParams;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.TransientViewKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.DivBorder;
import com.yandex.div2.DivCornersRadius;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivStrokeStyle;
import ik.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import mj.g;
import mj.r;
import nj.n;
import vj.c;

/* JADX INFO: compiled from: DivBorderDrawer.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DivBorderDrawer implements ExpressionSubscriber {
    public static final Companion Companion = new Companion(null);
    private DivBorder border;
    private float[] cornerRadii;
    private final Div2View divView;
    private boolean hasBorder;
    private boolean hasCustomShadow;
    private boolean hasDifferentCornerRadii;
    private boolean hasShadow;
    private float strokeWidth;
    private final View view;
    private final ClipParams clipParams = new ClipParams();
    private final g borderParams$delegate = b.a(new a<BorderParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$borderParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final DivBorderDrawer.BorderParams invoke() {
            return this.this$0.new BorderParams();
        }
    });
    private final g shadowParams$delegate = b.a(new a<ShadowParams>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$shadowParams$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // bk.a
        public final DivBorderDrawer.ShadowParams invoke() {
            return this.this$0.new ShadowParams();
        }
    });
    private final RoundedRectOutlineProvider outlineProvider = new RoundedRectOutlineProvider(0.0f, 1, null);
    private boolean needClipping = true;
    private final List<Disposable> subscriptions = new ArrayList();

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public final class BorderParams {
        private final float defaultDashWidth;
        private final float defaultGapWidth;
        private final float halfDp;
        private boolean isDashed;
        private final Paint paint;
        private final Path path;
        private final RectF rect;

        private final float calculatePerimeter(float f10, float f11, float[] fArr) {
            float f12 = 2;
            float fSqrt = (f10 * f12) + (f12 * f11);
            if (fArr.length != 8) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.ERROR)) {
                    kLog.print(6, "DivBorderDrawer", "Wrong corner radii count " + fArr.length + ". Expected 8");
                }
                return fSqrt;
            }
            int i10 = 0;
            int iB = c.b(0, fArr.length - 1, 2);
            if (iB >= 0) {
                while (true) {
                    float f13 = fArr[i10];
                    float f14 = fArr[i10 + 1];
                    fSqrt = ((fSqrt - f13) - f14) + ((float) (Math.sqrt(((double) ((f13 * f13) + (f14 * f14))) / 8.0d) * 3.141592653589793d));
                    if (i10 == iB) {
                        break;
                    }
                    i10 += 2;
                }
            }
            return k.c(fSqrt, 0.0f);
        }

        private final DashPathEffect createDashPathEffect(float f10) {
            float f11;
            float f12;
            if (f10 > 0.0f) {
                float f13 = this.defaultDashWidth;
                float f14 = this.defaultGapWidth;
                float f15 = f13 + f14;
                float f16 = (int) (f10 / f15);
                float f17 = f10 - (f15 * f16);
                f11 = f13 + (((f17 * f13) / f15) / f16);
                f12 = f14 + (((f17 * f14) / f15) / f16);
            } else {
                f11 = this.defaultDashWidth;
                f12 = this.defaultGapWidth;
            }
            return new DashPathEffect(new float[]{f11, f12}, 0.0f);
        }

        public BorderParams() {
            Paint paint = new Paint();
            this.paint = paint;
            this.path = new Path();
            this.halfDp = BaseDivViewExtensionsKt.dpToPxF(Double.valueOf(0.5d), DivBorderDrawer.this.getDisplayMetrics());
            this.defaultDashWidth = BaseDivViewExtensionsKt.dpToPxF(6, DivBorderDrawer.this.getDisplayMetrics());
            this.defaultGapWidth = BaseDivViewExtensionsKt.dpToPxF(2, DivBorderDrawer.this.getDisplayMetrics());
            this.rect = new RectF();
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
        }

        private final float getStrokeOffset() {
            return Math.min(this.halfDp, Math.max(1.0f, DivBorderDrawer.this.strokeWidth * 0.1f));
        }

        public final Paint getPaint() {
            return this.paint;
        }

        public final Path getPath() {
            return this.path;
        }

        public final void invalidate(float[] fArr) {
            float strokeOffset = (DivBorderDrawer.this.strokeWidth - getStrokeOffset()) / 2.0f;
            this.rect.set(strokeOffset, strokeOffset, DivBorderDrawer.this.view.getWidth() - strokeOffset, DivBorderDrawer.this.view.getHeight() - strokeOffset);
            this.path.reset();
            this.path.addRoundRect(this.rect, fArr, Path.Direction.CW);
            this.path.close();
            this.paint.setPathEffect(this.isDashed ? createDashPathEffect(calculatePerimeter(this.rect.width(), this.rect.height(), fArr)) : null);
        }

        public final void setDashed(boolean z10) {
            this.isDashed = z10;
        }

        public final void setPaintParams(float f10, int i10) {
            this.paint.setStrokeWidth(f10 + getStrokeOffset());
            this.paint.setColor(i10);
        }
    }

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public final class ClipParams {
        private final Path path = new Path();
        private final RectF rect = new RectF();

        public ClipParams() {
        }

        public final Path getPath() {
            return this.path;
        }

        public final void invalidatePath(float[] fArr) {
            this.rect.set(0.0f, 0.0f, DivBorderDrawer.this.view.getWidth(), DivBorderDrawer.this.view.getHeight());
            this.path.reset();
            if (fArr != null) {
                this.path.addRoundRect(this.rect, (float[]) fArr.clone(), Path.Direction.CW);
                this.path.close();
            }
        }
    }

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public static final class RoundedRectOutlineProvider extends ViewOutlineProvider {
        private float cornerRadius;

        public /* synthetic */ RoundedRectOutlineProvider(float f10, int i10, i iVar) {
            this((i10 & 1) != 0 ? 0.0f : f10);
        }

        public RoundedRectOutlineProvider(float f10) {
            this.cornerRadius = f10;
        }

        public final void setCornerRadius(float f10) {
            this.cornerRadius = f10;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), DivBorderDrawer.Companion.clampCornerRadius(this.cornerRadius, view.getWidth(), view.getHeight()));
        }
    }

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public final class ShadowParams {
        private float alpha;
        private NinePatch cachedShadow;
        private int color;
        private final float defaultRadius;
        private float offsetX;
        private float offsetY;
        private final Paint paint;
        private float radius;
        private final Rect rect;

        public ShadowParams() {
            float dimension = DivBorderDrawer.this.view.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
            this.defaultRadius = dimension;
            this.radius = dimension;
            this.color = ViewCompat.MEASURED_STATE_MASK;
            this.alpha = 0.14f;
            this.paint = new Paint();
            this.rect = new Rect();
            this.offsetY = 0.5f;
        }

        public final NinePatch getCachedShadow() {
            return this.cachedShadow;
        }

        public final float getOffsetX() {
            return this.offsetX;
        }

        public final float getOffsetY() {
            return this.offsetY;
        }

        public final Paint getPaint() {
            return this.paint;
        }

        public final Rect getRect() {
            return this.rect;
        }

        public final void invalidateShadow(float[] fArr) {
            float f10 = 2;
            this.rect.set(0, 0, (int) (DivBorderDrawer.this.view.getWidth() + (this.radius * f10)), (int) (DivBorderDrawer.this.view.getHeight() + (this.radius * f10)));
            this.paint.setColor(this.color);
            this.paint.setAlpha((int) (this.alpha * DivBorderDrawer.this.view.getAlpha() * 255));
            this.cachedShadow = ShadowCache.INSTANCE.getShadow(fArr, this.radius, DivBorderDrawer.this.divView.getDiv2Component$div_release().getBitmapEffectHelper());
        }

        public final void set(DivShadow divShadow, ExpressionResolver expressionResolver) {
            DivPoint divPoint;
            DivDimension divDimension;
            DivPoint divPoint2;
            DivDimension divDimension2;
            Expression<Double> expression;
            Expression<Integer> expression2;
            Expression<Long> expression3;
            DisplayMetrics displayMetrics = DivBorderDrawer.this.getDisplayMetrics();
            this.radius = (divShadow == null || (expression3 = divShadow.f48768b) == null) ? this.defaultRadius : BaseDivViewExtensionsKt.dpToPxF(Long.valueOf(expression3.evaluate(expressionResolver).longValue()), displayMetrics);
            this.color = (divShadow == null || (expression2 = divShadow.f48769c) == null) ? ViewCompat.MEASURED_STATE_MASK : expression2.evaluate(expressionResolver).intValue();
            this.alpha = (divShadow == null || (expression = divShadow.f48767a) == null) ? 0.14f : (float) expression.evaluate(expressionResolver).doubleValue();
            this.offsetX = ((divShadow == null || (divPoint2 = divShadow.f48770d) == null || (divDimension2 = divPoint2.f48418a) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.0f), displayMetrics) : BaseDivViewExtensionsKt.toPx(divDimension2, displayMetrics, expressionResolver)) - this.radius;
            this.offsetY = ((divShadow == null || (divPoint = divShadow.f48770d) == null || (divDimension = divPoint.f48419b) == null) ? BaseDivViewExtensionsKt.dpToPx(Float.valueOf(0.5f), displayMetrics) : BaseDivViewExtensionsKt.toPx(divDimension, displayMetrics, expressionResolver)) - this.radius;
        }
    }

    /* JADX INFO: compiled from: DivBorderDrawer.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final float clampCornerRadius(float f10, float f11, float f12) {
            if (f12 <= 0.0f || f11 <= 0.0f) {
                return 0.0f;
            }
            float fMin = Math.min(f12, f11) / 2;
            if (f10 > fMin) {
                KLog kLog = KLog.INSTANCE;
                if (kLog.isAtLeast(Severity.WARNING)) {
                    kLog.print(5, "DivBorderDrawer", "Corner radius " + f10 + " is greater than half of the smallest side " + fMin);
                }
            }
            return Math.min(f10, fMin);
        }
    }

    private final BorderParams getBorderParams() {
        return (BorderParams) this.borderParams$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DisplayMetrics getDisplayMetrics() {
        return this.view.getResources().getDisplayMetrics();
    }

    private final ShadowParams getShadowParams() {
        return (ShadowParams) this.shadowParams$delegate.getValue();
    }

    private final void invalidatePaths() {
        float[] fArr;
        float[] fArr2 = this.cornerRadii;
        if (fArr2 == null || (fArr = (float[]) fArr2.clone()) == null) {
            return;
        }
        this.clipParams.invalidatePath(fArr);
        float f10 = this.strokeWidth / 2.0f;
        int length = fArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            fArr[i10] = Math.max(0.0f, fArr[i10] - f10);
        }
        if (this.hasBorder) {
            getBorderParams().invalidate(fArr);
        }
        if (this.hasCustomShadow) {
            getShadowParams().invalidateShadow(fArr);
        }
    }

    private final void observeBorder(final DivBorder divBorder, final ExpressionResolver expressionResolver) {
        DivPoint divPoint;
        DivDimension divDimension;
        Expression<Double> expression;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression<DivSizeUnit> expression2;
        DivPoint divPoint3;
        DivDimension divDimension3;
        Expression<Double> expression3;
        DivPoint divPoint4;
        DivDimension divDimension4;
        Expression<DivSizeUnit> expression4;
        Expression<Integer> expression5;
        Expression<Long> expression6;
        Expression<Double> expression7;
        Expression<DivSizeUnit> expression8;
        Expression<Double> expression9;
        Expression<Integer> expression10;
        Expression<Long> expression11;
        Expression<Long> expression12;
        Expression<Long> expression13;
        Expression<Long> expression14;
        if (divBorder == null || DivDataExtensionsKt.isConstant(divBorder)) {
            return;
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.widgets.DivBorderDrawer$observeBorder$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                this.this$0.applyBorder(divBorder, expressionResolver);
                this.this$0.view.invalidate();
            }
        };
        Expression<Long> expression15 = divBorder.f46537a;
        Disposable disposableObserve = null;
        addSubscription(expression15 != null ? expression15.observe(expressionResolver, lVar) : null);
        DivCornersRadius divCornersRadius = divBorder.f46538b;
        addSubscription((divCornersRadius == null || (expression14 = divCornersRadius.f46838c) == null) ? null : expression14.observe(expressionResolver, lVar));
        DivCornersRadius divCornersRadius2 = divBorder.f46538b;
        addSubscription((divCornersRadius2 == null || (expression13 = divCornersRadius2.f46839d) == null) ? null : expression13.observe(expressionResolver, lVar));
        DivCornersRadius divCornersRadius3 = divBorder.f46538b;
        addSubscription((divCornersRadius3 == null || (expression12 = divCornersRadius3.f46837b) == null) ? null : expression12.observe(expressionResolver, lVar));
        DivCornersRadius divCornersRadius4 = divBorder.f46538b;
        addSubscription((divCornersRadius4 == null || (expression11 = divCornersRadius4.f46836a) == null) ? null : expression11.observe(expressionResolver, lVar));
        addSubscription(divBorder.f46539c.observe(expressionResolver, lVar));
        DivStroke divStroke = divBorder.f46541e;
        addSubscription((divStroke == null || (expression10 = divStroke.f49131a) == null) ? null : expression10.observe(expressionResolver, lVar));
        DivStroke divStroke2 = divBorder.f46541e;
        addSubscription((divStroke2 == null || (expression9 = divStroke2.f49134d) == null) ? null : expression9.observe(expressionResolver, lVar));
        DivStroke divStroke3 = divBorder.f46541e;
        addSubscription((divStroke3 == null || (expression8 = divStroke3.f49133c) == null) ? null : expression8.observe(expressionResolver, lVar));
        DivShadow divShadow = divBorder.f46540d;
        addSubscription((divShadow == null || (expression7 = divShadow.f48767a) == null) ? null : expression7.observe(expressionResolver, lVar));
        DivShadow divShadow2 = divBorder.f46540d;
        addSubscription((divShadow2 == null || (expression6 = divShadow2.f48768b) == null) ? null : expression6.observe(expressionResolver, lVar));
        DivShadow divShadow3 = divBorder.f46540d;
        addSubscription((divShadow3 == null || (expression5 = divShadow3.f48769c) == null) ? null : expression5.observe(expressionResolver, lVar));
        DivShadow divShadow4 = divBorder.f46540d;
        addSubscription((divShadow4 == null || (divPoint4 = divShadow4.f48770d) == null || (divDimension4 = divPoint4.f48418a) == null || (expression4 = divDimension4.f46982a) == null) ? null : expression4.observe(expressionResolver, lVar));
        DivShadow divShadow5 = divBorder.f46540d;
        addSubscription((divShadow5 == null || (divPoint3 = divShadow5.f48770d) == null || (divDimension3 = divPoint3.f48418a) == null || (expression3 = divDimension3.f46983b) == null) ? null : expression3.observe(expressionResolver, lVar));
        DivShadow divShadow6 = divBorder.f46540d;
        addSubscription((divShadow6 == null || (divPoint2 = divShadow6.f48770d) == null || (divDimension2 = divPoint2.f48419b) == null || (expression2 = divDimension2.f46982a) == null) ? null : expression2.observe(expressionResolver, lVar));
        DivShadow divShadow7 = divBorder.f46540d;
        if (divShadow7 != null && (divPoint = divShadow7.f48770d) != null && (divDimension = divPoint.f48419b) != null && (expression = divDimension.f46983b) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        addSubscription(disposableObserve);
    }

    private final boolean shouldUseCanvasClipping() {
        return this.needClipping && (this.divView.getForceCanvasClipping() || this.hasCustomShadow || ((!this.hasShadow && (this.hasDifferentCornerRadii || this.hasBorder)) || TransientViewKt.isInTransientHierarchy(this.view)));
    }

    private final boolean shouldUseNinePatchShadows() {
        return this.hasCustomShadow || TransientViewKt.isInTransientHierarchy(this.view);
    }

    public final void drawBorder(Canvas canvas) {
        if (this.hasBorder) {
            canvas.drawPath(getBorderParams().getPath(), getBorderParams().getPaint());
        }
    }

    public final void drawShadow(Canvas canvas) {
        if ((!TransientViewKt.isInTransientHierarchy(this.view) || TransientViewKt.isInTransientHierarchy(this.view.getParent())) && this.hasCustomShadow) {
            float offsetX = getShadowParams().getOffsetX();
            float offsetY = getShadowParams().getOffsetY();
            int iSave = canvas.save();
            canvas.translate(offsetX, offsetY);
            try {
                NinePatch cachedShadow = getShadowParams().getCachedShadow();
                if (cachedShadow != null) {
                    cachedShadow.draw(canvas, getShadowParams().getRect(), getShadowParams().getPaint());
                }
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
    }

    @Override // com.yandex.div.internal.core.ExpressionSubscriber
    public List<Disposable> getSubscriptions() {
        return this.subscriptions;
    }

    public final void setBorder(DivBorder divBorder, ExpressionResolver expressionResolver) {
        if (DivDataExtensionsKt.equalsToConstant(divBorder, this.border)) {
            return;
        }
        release();
        this.border = divBorder;
        bindBorder(divBorder, expressionResolver);
    }

    public final void setNeedClipping(boolean z10) {
        if (this.needClipping == z10) {
            return;
        }
        this.needClipping = z10;
        invalidateOutline();
        this.view.invalidate();
    }

    public DivBorderDrawer(Div2View div2View, View view) {
        this.divView = div2View;
        this.view = view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:57:0x00cb  */
    public final void applyBorder(DivBorder divBorder, ExpressionResolver expressionResolver) {
        float fWidthPx;
        boolean z10;
        float[] cornerRadii;
        boolean z11;
        boolean zBooleanValue;
        DivShadow divShadow;
        DivShadow divShadow2;
        Expression<Boolean> expression;
        boolean z12;
        int iIntValue;
        DivStrokeStyle divStrokeStyle;
        DivStroke divStroke;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        DivStroke divStroke3;
        DisplayMetrics displayMetrics = getDisplayMetrics();
        float dimension = 0.0f;
        if (divBorder != null && (divStroke3 = divBorder.f46541e) != null) {
            fWidthPx = DivBorderDrawerKt.widthPx(divStroke3, expressionResolver, displayMetrics);
        } else {
            fWidthPx = 0.0f;
        }
        this.strokeWidth = fWidthPx;
        boolean z13 = true;
        if (fWidthPx > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.hasBorder = z10;
        View view = null;
        if (z10) {
            if (divBorder != null && (divStroke2 = divBorder.f46541e) != null && (expression2 = divStroke2.f49131a) != null) {
                iIntValue = expression2.evaluate(expressionResolver).intValue();
            } else {
                iIntValue = 0;
            }
            getBorderParams().setPaintParams(this.strokeWidth, iIntValue);
            BorderParams borderParams = getBorderParams();
            if (divBorder != null && (divStroke = divBorder.f46541e) != null) {
                divStrokeStyle = divStroke.f49132b;
            } else {
                divStrokeStyle = null;
            }
            borderParams.setDashed(divStrokeStyle instanceof DivStrokeStyle.b);
        }
        if (divBorder != null) {
            cornerRadii = DivUtilKt.getCornerRadii(divBorder, BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getWidth()), displayMetrics), BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(this.view.getHeight()), displayMetrics), displayMetrics, expressionResolver);
        } else {
            cornerRadii = null;
        }
        this.cornerRadii = cornerRadii;
        if (cornerRadii != null) {
            float fI = n.I(cornerRadii);
            int length = cornerRadii.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    if (!Float.valueOf(cornerRadii[i10]).equals(Float.valueOf(fI))) {
                        z12 = false;
                        break;
                    }
                    i10++;
                } else {
                    z12 = true;
                    break;
                }
            }
            z11 = !z12;
        } else {
            z11 = false;
        }
        this.hasDifferentCornerRadii = z11;
        boolean z14 = this.hasCustomShadow;
        if (divBorder != null && (expression = divBorder.f46539c) != null) {
            zBooleanValue = expression.evaluate(expressionResolver).booleanValue();
        } else {
            zBooleanValue = false;
        }
        this.hasShadow = zBooleanValue;
        if (zBooleanValue) {
            if (divBorder != null) {
                divShadow2 = divBorder.f46540d;
            } else {
                divShadow2 = null;
            }
            if (divShadow2 == null && !(this.view.getParent() instanceof DivFrameLayout)) {
                z13 = false;
            }
        } else {
            z13 = false;
        }
        this.hasCustomShadow = z13;
        View view2 = this.view;
        if (this.hasShadow && !z13) {
            dimension = view2.getContext().getResources().getDimension(R$dimen.div_shadow_elevation);
        }
        view2.setElevation(dimension);
        if (this.hasCustomShadow) {
            ShadowParams shadowParams = getShadowParams();
            if (divBorder != null) {
                divShadow = divBorder.f46540d;
            } else {
                divShadow = null;
            }
            shadowParams.set(divShadow, expressionResolver);
        }
        invalidateBorder();
        if (this.hasCustomShadow || z14) {
            Object parent = this.view.getParent();
            if (parent instanceof View) {
                view = (View) parent;
            }
            if (view != null) {
                view.invalidate();
            }
        }
    }

    private final void bindBorder(DivBorder divBorder, ExpressionResolver expressionResolver) {
        applyBorder(divBorder, expressionResolver);
        observeBorder(divBorder, expressionResolver);
    }

    private final void invalidateOutline() {
        float fI;
        boolean z10;
        ViewOutlineProvider viewOutlineProvider = null;
        if (shouldUseCanvasClipping()) {
            this.view.setClipToOutline(false);
            View view = this.view;
            if (!shouldUseNinePatchShadows()) {
                viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
            }
            view.setOutlineProvider(viewOutlineProvider);
            return;
        }
        float[] fArr = this.cornerRadii;
        if (fArr != null) {
            fI = n.I(fArr);
        } else {
            fI = 0.0f;
        }
        if (fI == 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            this.view.setClipToOutline(false);
            View view2 = this.view;
            if (!shouldUseNinePatchShadows()) {
                viewOutlineProvider = ViewOutlineProvider.BACKGROUND;
            }
            view2.setOutlineProvider(viewOutlineProvider);
            return;
        }
        this.outlineProvider.setCornerRadius(fI);
        this.view.setOutlineProvider(this.outlineProvider);
        this.view.setClipToOutline(this.needClipping);
    }

    public final void clipCorners(Canvas canvas) {
        if (!shouldUseCanvasClipping()) {
            return;
        }
        canvas.clipPath(this.clipParams.getPath());
    }

    public final void invalidateBorder() {
        invalidatePaths();
        invalidateOutline();
    }

    public final void onBoundsChanged(int i10, int i11) {
        invalidateBorder();
    }
}
