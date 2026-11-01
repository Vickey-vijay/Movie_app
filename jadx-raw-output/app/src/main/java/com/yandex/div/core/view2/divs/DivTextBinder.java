package com.yandex.div.core.view2.divs;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import bk.l;
import ck.p;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.util.DivDataExtensionsKt;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.util.ExpressionSubscribersKt;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTypefaceResolver;
import com.yandex.div.core.view2.DivViewBinder;
import com.yandex.div.core.view2.divs.widgets.DivLineHeightTextView;
import com.yandex.div.core.view2.spannable.ShadowData;
import com.yandex.div.core.view2.spannable.SpannedTextBuilder;
import com.yandex.div.core.view2.text.SelectableLinkMovementMethod;
import com.yandex.div.core.widget.AdaptiveMaxLines;
import com.yandex.div.core.widget.DivViewWrapper;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.drawable.LinearGradientDrawable;
import com.yandex.div.internal.drawable.RadialGradientDrawable;
import com.yandex.div.internal.graphics.Colormap;
import com.yandex.div.internal.graphics.ColormapKt;
import com.yandex.div.internal.widget.EllipsizedTextView;
import com.yandex.div.internal.widget.TextViewsKt;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionList;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.json.expressions.ExpressionsKt;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivExtension;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivLineStyle;
import com.yandex.div2.DivLinearGradient;
import com.yandex.div2.DivPoint;
import com.yandex.div2.DivRadialGradient;
import com.yandex.div2.DivRadialGradientCenter;
import com.yandex.div2.DivRadialGradientRadius;
import com.yandex.div2.DivRadialGradientRelativeRadius;
import com.yandex.div2.DivShadow;
import com.yandex.div2.DivSizeUnit;
import com.yandex.div2.DivSolidBackground;
import com.yandex.div2.DivStroke;
import com.yandex.div2.DivText;
import com.yandex.div2.DivTextAlignmentVertical;
import com.yandex.div2.DivTextGradient;
import com.yandex.div2.DivTextRangeBackground;
import com.yandex.div2.DivTextRangeBorder;
import com.yandex.div2.DivTextRangeMask;
import com.yandex.div2.DivTextRangeMaskParticles;
import com.yandex.div2.DivTextRangeMaskSolid;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import lk.a0;
import mj.r;
import nj.b0;
import nj.s;
import org.json.JSONObject;

/* JADX INFO: compiled from: DivTextBinder.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivTextBinder extends DivViewBinder<Div.q, DivText, DivLineHeightTextView> {
    private final boolean isHyphenationEnabled;
    private final SpannedTextBuilder spannedTextBuilder;
    private final DivTypefaceResolver typefaceResolver;

    /* JADX INFO: compiled from: DivTextBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[DivAlignmentHorizontal.values().length];
            try {
                iArr[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivAlignmentHorizontal.START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DivAlignmentHorizontal.END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivLineStyle.values().length];
            try {
                iArr2[DivLineStyle.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DivLineStyle.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[DivRadialGradientRelativeRadius.Value.values().length];
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_CORNER.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_CORNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.FARTHEST_SIDE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[DivRadialGradientRelativeRadius.Value.NEAREST_SIDE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[DivText.Truncate.values().length];
            try {
                iArr4[DivText.Truncate.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DivText.Truncate.START.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr4[DivText.Truncate.MIDDLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[DivText.Truncate.END.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyFontFeatureSettings(TextView textView, String str) {
        boolean z10 = false;
        if (str != null && (!a0.n0(str))) {
            z10 = true;
        }
        if (!z10) {
            str = null;
        }
        textView.setFontFeatureSettings(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextShadow(TextView textView, ShadowData shadowData) {
        DivViewWrapper divViewWrapper;
        if (shadowData == null) {
            ViewParent parent = textView.getParent();
            divViewWrapper = parent instanceof DivViewWrapper ? (DivViewWrapper) parent : null;
            if (divViewWrapper != null) {
                divViewWrapper.setClipChildren(true);
                divViewWrapper.setClipToPadding(true);
            }
            textView.setClipToOutline(true);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            return;
        }
        ViewParent parent2 = textView.getParent();
        divViewWrapper = parent2 instanceof DivViewWrapper ? (DivViewWrapper) parent2 : null;
        if (divViewWrapper != null) {
            divViewWrapper.setClipChildren(false);
            divViewWrapper.setClipToPadding(false);
        }
        textView.setClipToOutline(false);
        textView.setShadowLayer(shadowData.getRadius(), shadowData.getOffsetX(), shadowData.getOffsetY(), shadowData.getColor());
    }

    private final void bindPlainEllipsis(final DivLineHeightTextView divLineHeightTextView, DivText.Ellipsis ellipsis, DivText.Ellipsis ellipsis2, ExpressionResolver expressionResolver) {
        Expression<String> expression;
        Expression<String> expression2;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(ellipsis != null ? ellipsis.f49510d : null, ellipsis2 != null ? ellipsis2.f49510d : null)) {
            return;
        }
        applyPlainEllipsis(divLineHeightTextView, (ellipsis == null || (expression2 = ellipsis.f49510d) == null) ? null : expression2.evaluate(expressionResolver));
        if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.f49510d : null)) {
            if (ExpressionsKt.isConstantOrNull(ellipsis != null ? ellipsis.f49510d : null)) {
                return;
            }
        }
        if (ellipsis != null && (expression = ellipsis.f49510d) != null) {
            disposableObserve = expression.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindPlainEllipsis.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(String str) {
                    invoke2(str);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(String str) {
                    DivTextBinder.this.applyPlainEllipsis(divLineHeightTextView, str);
                }
            });
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindTypeface(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeTypeface(divLineHeightTextView, divText.f49498t, divText.f49503y, divText.f49504z, divText.f49502x, divText2 != null ? divText2.f49498t : null, divText2 != null ? divText2.f49503y : null, divText2 != null ? divText2.f49504z : null, divText2 != null ? divText2.f49502x : null, divText2, this.typefaceResolver, expressionResolver);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    public final void applyEllipsize(DivLineHeightTextView divLineHeightTextView, DivText divText, ExpressionResolver expressionResolver) {
        TextUtils.TruncateAt truncateAt;
        boolean z10;
        DivText.Truncate truncateEvaluate = divText.f49480j0.evaluate(expressionResolver);
        int i10 = WhenMappings.$EnumSwitchMapping$3[truncateEvaluate.ordinal()];
        if (i10 == 1) {
            truncateAt = null;
        } else if (i10 == 2) {
            truncateAt = TextUtils.TruncateAt.START;
        } else if (i10 == 3) {
            truncateAt = TextUtils.TruncateAt.MIDDLE;
        } else {
            if (i10 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            truncateAt = TextUtils.TruncateAt.END;
        }
        divLineHeightTextView.setEllipsisLocation(truncateAt);
        if (truncateEvaluate != DivText.Truncate.NONE) {
            Expression<Boolean> expression = divText.f49477i;
            z10 = expression != null ? expression.evaluate(expressionResolver).booleanValue() : false;
        }
        divLineHeightTextView.setAutoEllipsize(z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyMaxLines(DivLineHeightTextView divLineHeightTextView, Div2View div2View, Long l10, Long l11) {
        int i10;
        AdaptiveMaxLines adaptiveMaxLines$div_release = divLineHeightTextView.getAdaptiveMaxLines$div_release();
        if (adaptiveMaxLines$div_release != null) {
            adaptiveMaxLines$div_release.reset();
        }
        int i11 = Integer.MIN_VALUE;
        int i12 = Integer.MAX_VALUE;
        if (l10 == null || l11 == null) {
            if (l10 != null) {
                long jLongValue = l10.longValue();
                long j10 = jLongValue >> 31;
                if (j10 == 0 || j10 == -1) {
                    i11 = (int) jLongValue;
                } else {
                    KAssert kAssert = KAssert.INSTANCE;
                    if (Assert.isEnabled()) {
                        Assert.fail("Unable convert '" + jLongValue + "' to Int");
                    }
                    if (jLongValue > 0) {
                        i11 = Integer.MAX_VALUE;
                    }
                }
                i12 = i11;
            }
            divLineHeightTextView.setMaxLines(i12);
            return;
        }
        AdaptiveMaxLines adaptiveMaxLines = new AdaptiveMaxLines(divLineHeightTextView, div2View.getViewComponent$div_release().getDrawingPassOverrideStrategy());
        long jLongValue2 = l10.longValue();
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
        long jLongValue3 = l11.longValue();
        long j12 = jLongValue3 >> 31;
        if (j12 == 0 || j12 == -1) {
            i11 = (int) jLongValue3;
        } else {
            KAssert kAssert3 = KAssert.INSTANCE;
            if (Assert.isEnabled()) {
                Assert.fail("Unable convert '" + jLongValue3 + "' to Int");
            }
            if (jLongValue3 > 0) {
                i11 = Integer.MAX_VALUE;
            }
        }
        adaptiveMaxLines.apply(new AdaptiveMaxLines.Params(i10, i11));
        divLineHeightTextView.setAdaptiveMaxLines$div_release(adaptiveMaxLines);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainEllipsis(DivLineHeightTextView divLineHeightTextView, String str) {
        if (str == null) {
            str = "…";
        }
        divLineHeightTextView.setEllipsis(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyPlainText(TextView textView, BindingContext bindingContext, DivText divText) {
        textView.setText(this.spannedTextBuilder.buildPlainText(bindingContext, textView, divText));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichEllipsis(final EllipsizedTextView ellipsizedTextView, BindingContext bindingContext, DivText divText) {
        DivText.Ellipsis ellipsis = divText.f49491p;
        if (ellipsis == null) {
            ellipsizedTextView.setEllipsis("…");
        } else {
            this.spannedTextBuilder.buildEllipsis(bindingContext, ellipsizedTextView, divText, ellipsis, new l<Spanned, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichEllipsis.1
                {
                    super(1);
                }

                @Override // bk.l
                public /* bridge */ /* synthetic */ r invoke(Spanned spanned) {
                    invoke2(spanned);
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Spanned spanned) {
                    ellipsizedTextView.setEllipsis(spanned);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRichText(final TextView textView, BindingContext bindingContext, DivText divText) {
        this.spannedTextBuilder.buildText(bindingContext, textView, divText, new l<Spanned, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.applyRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Spanned spanned) {
                invoke2(spanned);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Spanned spanned) {
                textView.setText(spanned, TextView.BufferType.NORMAL);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyStrikethrough(TextView textView, DivLineStyle divLineStyle) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 16);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTextColor(TextView textView, int i10, Integer num) {
        int[][] iArr = {new int[]{R.attr.state_focused}, new int[0]};
        int[] iArr2 = new int[2];
        iArr2[0] = num != null ? num.intValue() : i10;
        iArr2[1] = i10;
        textView.setTextColor(new ColorStateList(iArr, iArr2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyUnderline(TextView textView, DivLineStyle divLineStyle) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[divLineStyle.ordinal()];
        if (i10 == 1) {
            textView.setPaintFlags(textView.getPaintFlags() | 8);
        } else {
            if (i10 != 2) {
                return;
            }
            textView.setPaintFlags(textView.getPaintFlags() & (-9));
        }
    }

    private final void bindEllipsis(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        DivText.Ellipsis ellipsis = divText.f49491p;
        if ((ellipsis != null ? ellipsis.f49509c : null) == null) {
            if ((ellipsis != null ? ellipsis.f49508b : null) == null) {
                if ((ellipsis != null ? ellipsis.f49507a : null) == null) {
                    bindPlainEllipsis(divLineHeightTextView, ellipsis, divText2 != null ? divText2.f49491p : null, bindingContext.getExpressionResolver());
                    return;
                }
            }
        }
        bindRichEllipsis(divLineHeightTextView, bindingContext, divText);
    }

    private final void bindEllipsize(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f49477i, divText2 != null ? divText2.f49477i : null)) {
            if (ExpressionsKt.equalsToConstant(divText.f49480j0, divText2 != null ? divText2.f49480j0 : null)) {
                return;
            }
        }
        applyEllipsize(divLineHeightTextView, divText, expressionResolver);
        if (ExpressionsKt.isConstantOrNull(divText.f49477i) && ExpressionsKt.isConstant(divText.f49480j0)) {
            return;
        }
        l<? super Boolean, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindEllipsize$callback$1
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
                this.this$0.applyEllipsize(divLineHeightTextView, divText, expressionResolver);
            }
        };
        Expression<Boolean> expression = divText.f49477i;
        if (expression != null) {
            divLineHeightTextView.addSubscription(expression.observe(expressionResolver, lVar));
        }
        divLineHeightTextView.addSubscription(divText.f49480j0.observe(expressionResolver, lVar));
    }

    private final void bindFontFeatureSettings(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f49499u, divText2 != null ? divText2.f49499u : null)) {
            return;
        }
        Expression<String> expression = divText.f49499u;
        applyFontFeatureSettings(divLineHeightTextView, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.f49499u)) {
            return;
        }
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindFontFeatureSettings$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Expression<String> expression2 = divText.f49499u;
                divTextBinder.applyFontFeatureSettings(divLineHeightTextView2, expression2 != null ? expression2.evaluate(expressionResolver) : null);
            }
        };
        Expression<String> expression2 = divText.f49499u;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
    }

    private final void bindFontSize(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeFontSize(divLineHeightTextView, divText.f49500v, divText.f49501w, divText2 != null ? divText2.f49500v : null, divText2 != null ? divText2.f49501w : null, expressionResolver, divLineHeightTextView);
    }

    private final void bindLetterSpacing(DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        TextViewExtensionsKt.observeLetterSpacing(divLineHeightTextView, divText.H, divText.f49500v, divText2 != null ? divText2.H : null, divText2 != null ? divText2.f49500v : null, expressionResolver, divLineHeightTextView);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    private final void bindLinearTextGradient(final DivLineHeightTextView divLineHeightTextView, final Div2View div2View, final DivLinearGradient divLinearGradient, DivTextGradient divTextGradient, final ExpressionResolver expressionResolver) {
        boolean z10;
        boolean z11;
        boolean z12;
        if (divTextGradient instanceof DivTextGradient.b) {
            DivTextGradient.b bVar = (DivTextGradient.b) divTextGradient;
            if (ExpressionsKt.equalsToConstant(divLinearGradient.f48038a, bVar.c().f48038a) && ExpressionsKt.equalsToConstant(divLinearGradient.f48040c, bVar.c().f48040c)) {
                List<DivLinearGradient.ColorPoint> list = divLinearGradient.f48039b;
                List<DivLinearGradient.ColorPoint> list2 = bVar.c().f48039b;
                if (list == null && list2 == null) {
                    z12 = true;
                } else {
                    if (list != null && list2 != null && list.size() == list2.size()) {
                        Iterator<T> it = list.iterator();
                        int i10 = 0;
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    s.u();
                                }
                                if (DivDataExtensionsKt.equalsToConstant((DivLinearGradient.ColorPoint) next, list2.get(i10))) {
                                    i10 = i11;
                                }
                            } else {
                                z12 = true;
                            }
                        }
                    }
                    z12 = false;
                }
                if (z12) {
                    return;
                }
            }
        }
        applyLinearTextGradientColor(divLineHeightTextView, divLinearGradient.f48038a.evaluate(expressionResolver).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(divLinearGradient, expressionResolver), div2View));
        if (ExpressionsKt.isConstant(divLinearGradient.f48038a) && ExpressionsKt.isConstantOrNull(divLinearGradient.f48040c)) {
            List<DivLinearGradient.ColorPoint> list3 = divLinearGradient.f48039b;
            if (list3 != null) {
                if (!list3.isEmpty()) {
                    Iterator<T> it2 = list3.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z11 = true;
                            break;
                        } else if (!DivDataExtensionsKt.isConstant((DivLinearGradient.ColorPoint) it2.next())) {
                            z11 = false;
                            break;
                        }
                    }
                } else {
                    z11 = true;
                    break;
                }
                z10 = z11 ? false : true;
            }
            if (!z10) {
                return;
            }
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindLinearTextGradient$callback$1
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
                this.this$0.applyLinearTextGradientColor(divLineHeightTextView, divLinearGradient.f48038a.evaluate(expressionResolver).longValue(), ColormapKt.checkIsNotEmpty(DivDataExtensionsKt.toColormap(divLinearGradient, expressionResolver), div2View));
            }
        };
        divLineHeightTextView.addSubscription(divLinearGradient.f48038a.observe(expressionResolver, lVar));
        ExpressionList<Integer> expressionList = divLinearGradient.f48040c;
        divLineHeightTextView.addSubscription(expressionList != null ? expressionList.observe(expressionResolver, lVar) : null);
        List<DivLinearGradient.ColorPoint> list4 = divLinearGradient.f48039b;
        if (list4 != null) {
            Iterator<T> it3 = list4.iterator();
            while (it3.hasNext()) {
                ExpressionSubscribersKt.observeColorPoint(divLineHeightTextView, (DivLinearGradient.ColorPoint) it3.next(), expressionResolver, lVar);
            }
        }
    }

    private final void bindMaxLines(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.L, divText2 != null ? divText2.L : null)) {
            if (ExpressionsKt.equalsToConstant(divText.M, divText2 != null ? divText2.M : null)) {
                return;
            }
        }
        Div2View divView = bindingContext.getDivView();
        Expression<Long> expression = divText.L;
        Long lEvaluate = expression != null ? expression.evaluate(expressionResolver) : null;
        Expression<Long> expression2 = divText.M;
        applyMaxLines(divLineHeightTextView, divView, lEvaluate, expression2 != null ? expression2.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstantOrNull(divText.L) && ExpressionsKt.isConstantOrNull(divText.M)) {
            return;
        }
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindMaxLines$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                Div2View divView2 = bindingContext.getDivView();
                Expression<Long> expression3 = divText.L;
                Long lEvaluate2 = expression3 != null ? expression3.evaluate(expressionResolver) : null;
                Expression<Long> expression4 = divText.M;
                divTextBinder.applyMaxLines(divLineHeightTextView2, divView2, lEvaluate2, expression4 != null ? expression4.evaluate(expressionResolver) : null);
            }
        };
        Expression<Long> expression3 = divText.L;
        divLineHeightTextView.addSubscription(expression3 != null ? expression3.observe(expressionResolver, lVar) : null);
        Expression<Long> expression4 = divText.M;
        divLineHeightTextView.addSubscription(expression4 != null ? expression4.observe(expressionResolver, lVar) : null);
    }

    private final void bindPlainText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText, DivText divText2) {
        if (ExpressionsKt.equalsToConstant(divText.W, divText2 != null ? divText2.W : null)) {
            if (ExpressionsKt.equalsToConstant(divText.I, divText2 != null ? divText2.I : null)) {
                if (ExpressionsKt.equalsToConstant(divText.f49501w, divText2 != null ? divText2.f49501w : null)) {
                    List<DivExtension> extensions = divText.getExtensions();
                    List<DivExtension> extensions2 = divText2 != null ? divText2.getExtensions() : null;
                    boolean z10 = true;
                    if (extensions != null || extensions2 != null) {
                        if (extensions == null || extensions2 == null || extensions.size() != extensions2.size()) {
                            z10 = false;
                            break;
                        }
                        int i10 = 0;
                        for (Object obj : extensions) {
                            int i11 = i10 + 1;
                            if (i10 < 0) {
                                s.u();
                            }
                            if (!p.e(((DivExtension) obj).f47095a, extensions2.get(i10).f47095a)) {
                                z10 = false;
                                break;
                            }
                            i10 = i11;
                        }
                    }
                    if (z10) {
                        return;
                    }
                }
            }
        }
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        String strEvaluate = divText.W.evaluate(expressionResolver);
        applyPlainText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, strEvaluate);
        if (ExpressionsKt.isConstant(divText.W) && ExpressionsKt.isConstantOrNull(divText.I) && ExpressionsKt.isConstantOrNull(divText.f49501w)) {
            return;
        }
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindPlainText$callback$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj2) {
                invoke2(obj2);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj2) {
                String strEvaluate2 = divText.W.evaluate(expressionResolver);
                this.applyPlainText(divLineHeightTextView, bindingContext, divText);
                this.applyHyphenation(divLineHeightTextView, strEvaluate2);
            }
        };
        divLineHeightTextView.addSubscription(divText.W.observe(expressionResolver, lVar));
        Expression<Long> expression = divText.I;
        divLineHeightTextView.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
        divLineHeightTextView.addSubscription(divText.f49501w.observe(expressionResolver, lVar));
    }

    private final void bindRadialTextGradient(final DivLineHeightTextView divLineHeightTextView, final DivRadialGradient divRadialGradient, DivTextGradient divTextGradient, final ExpressionResolver expressionResolver) {
        List<Integer> listK;
        if (divTextGradient instanceof DivTextGradient.c) {
            DivTextGradient.c cVar = (DivTextGradient.c) divTextGradient;
            if (p.e(divRadialGradient.f48434e, cVar.c().f48434e) && p.e(divRadialGradient.f48430a, cVar.c().f48430a) && p.e(divRadialGradient.f48431b, cVar.c().f48431b) && ExpressionsKt.equalsToConstant(divRadialGradient.f48433d, cVar.c().f48433d)) {
                return;
            }
        }
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        RadialGradientDrawable.Radius radialGradientDrawableRadius = toRadialGradientDrawableRadius(divRadialGradient.f48434e, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter = toRadialGradientDrawableCenter(divRadialGradient.f48430a, displayMetrics, expressionResolver);
        RadialGradientDrawable.Center radialGradientDrawableCenter2 = toRadialGradientDrawableCenter(divRadialGradient.f48431b, displayMetrics, expressionResolver);
        ExpressionList<Integer> expressionList = divRadialGradient.f48433d;
        if (expressionList == null || (listK = expressionList.evaluate(expressionResolver)) == null) {
            listK = s.k();
        }
        applyRadialTextGradientColor(divLineHeightTextView, radialGradientDrawableRadius, radialGradientDrawableCenter, radialGradientDrawableCenter2, listK);
        if (ExpressionsKt.isConstantOrNull(divRadialGradient.f48433d)) {
            return;
        }
        ExpressionList<Integer> expressionList2 = divRadialGradient.f48433d;
        divLineHeightTextView.addSubscription(expressionList2 != null ? expressionList2.observe(expressionResolver, new l<List<? extends Integer>, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRadialTextGradient.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(List<? extends Integer> list) {
                invoke2((List<Integer>) list);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(List<Integer> list) {
                DivTextBinder divTextBinder = DivTextBinder.this;
                divTextBinder.applyRadialTextGradientColor(divLineHeightTextView, divTextBinder.toRadialGradientDrawableRadius(divRadialGradient.f48434e, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.f48430a, displayMetrics, expressionResolver), DivTextBinder.this.toRadialGradientDrawableCenter(divRadialGradient.f48431b, displayMetrics, expressionResolver), list);
            }
        }) : null);
    }

    private final void bindSelectable(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.T, divText2 != null ? divText2.T : null)) {
            return;
        }
        applySelectable(divLineHeightTextView, divText.T.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(divText.T)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.T.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindSelectable.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applySelectable(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindStrikethrough(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.V, divText2 != null ? divText2.V : null)) {
            return;
        }
        applyStrikethrough(divLineHeightTextView, divText.V.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.V)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.V.observe(expressionResolver, new l<DivLineStyle, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindStrikethrough.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivLineStyle divLineStyle) {
                DivTextBinder.this.applyStrikethrough(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    private final void bindText(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        if (divText.Q == null && divText.F == null) {
            bindPlainText(divLineHeightTextView, bindingContext, divText, divText2);
        } else {
            bindRichText(divLineHeightTextView, bindingContext, divText);
        }
    }

    private final void bindTextAlignment(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.X, divText2 != null ? divText2.X : null)) {
            if (ExpressionsKt.equalsToConstant(divText.Y, divText2 != null ? divText2.Y : null)) {
                return;
            }
        }
        applyTextAlignment(divLineHeightTextView, divText.X.evaluate(expressionResolver), divText.Y.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.X) && ExpressionsKt.isConstant(divText.Y)) {
            return;
        }
        l<? super DivAlignmentHorizontal, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextAlignment$callback$1
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
                this.this$0.applyTextAlignment(divLineHeightTextView, divText.X.evaluate(expressionResolver), divText.Y.evaluate(expressionResolver));
            }
        };
        divLineHeightTextView.addSubscription(divText.X.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription(divText.Y.observe(expressionResolver, lVar));
    }

    private final void bindTextColor(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.Z, divText2 != null ? divText2.Z : null)) {
            if (ExpressionsKt.equalsToConstant(divText.f49497s, divText2 != null ? divText2.f49497s : null)) {
                return;
            }
        }
        int iIntValue = divText.Z.evaluate(expressionResolver).intValue();
        Expression<Integer> expression = divText.f49497s;
        applyTextColor(divLineHeightTextView, iIntValue, expression != null ? expression.evaluate(expressionResolver) : null);
        if (ExpressionsKt.isConstant(divText.Z) && ExpressionsKt.isConstantOrNull(divText.f49497s)) {
            return;
        }
        l<? super Integer, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextColor$callback$1
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
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                int iIntValue2 = divText.Z.evaluate(expressionResolver).intValue();
                Expression<Integer> expression2 = divText.f49497s;
                divTextBinder.applyTextColor(divLineHeightTextView2, iIntValue2, expression2 != null ? expression2.evaluate(expressionResolver) : null);
            }
        };
        divLineHeightTextView.addSubscription(divText.Z.observe(expressionResolver, lVar));
        Expression<Integer> expression2 = divText.f49497s;
        divLineHeightTextView.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
    }

    private final void bindTextGradient(DivLineHeightTextView divLineHeightTextView, Div2View div2View, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        DivTextGradient divTextGradient = divText.f49462a0;
        if (divTextGradient == null) {
            divLineHeightTextView.getPaint().setShader(null);
        } else if (divTextGradient instanceof DivTextGradient.b) {
            bindLinearTextGradient(divLineHeightTextView, div2View, ((DivTextGradient.b) divTextGradient).c(), divText2 != null ? divText2.f49462a0 : null, expressionResolver);
        } else if (divTextGradient instanceof DivTextGradient.c) {
            bindRadialTextGradient(divLineHeightTextView, ((DivTextGradient.c) divTextGradient).c(), divText2 != null ? divText2.f49462a0 : null, expressionResolver);
        }
    }

    private final void bindTextShadow(final DivLineHeightTextView divLineHeightTextView, final DivText divText, DivText divText2, final ExpressionResolver expressionResolver) {
        DivPoint divPoint;
        DivDimension divDimension;
        Expression<DivSizeUnit> expression;
        DivPoint divPoint2;
        DivDimension divDimension2;
        Expression<Double> expression2;
        DivPoint divPoint3;
        DivDimension divDimension3;
        Expression<DivSizeUnit> expression3;
        DivPoint divPoint4;
        DivDimension divDimension4;
        Expression<Double> expression4;
        Expression<Long> expression5;
        Expression<Integer> expression6;
        Expression<Double> expression7;
        DivPoint divPoint5;
        DivDimension divDimension5;
        DivPoint divPoint6;
        DivDimension divDimension6;
        DivPoint divPoint7;
        DivDimension divDimension7;
        DivPoint divPoint8;
        DivDimension divDimension8;
        DivShadow divShadow;
        DivPoint divPoint9;
        DivDimension divDimension9;
        DivPoint divPoint10;
        DivDimension divDimension10;
        DivShadow divShadow2;
        DivPoint divPoint11;
        DivDimension divDimension11;
        DivPoint divPoint12;
        DivDimension divDimension12;
        DivShadow divShadow3;
        DivPoint divPoint13;
        DivDimension divDimension13;
        DivPoint divPoint14;
        DivDimension divDimension14;
        DivShadow divShadow4;
        DivPoint divPoint15;
        DivDimension divDimension15;
        DivPoint divPoint16;
        DivDimension divDimension16;
        DivShadow divShadow5;
        DivShadow divShadow6;
        DivShadow divShadow7;
        DivShadow divShadow8 = divText.f49464b0;
        Disposable disposableObserve = null;
        if (ExpressionsKt.equalsToConstant(divShadow8 != null ? divShadow8.f48767a : null, (divText2 == null || (divShadow7 = divText2.f49464b0) == null) ? null : divShadow7.f48767a)) {
            DivShadow divShadow9 = divText.f49464b0;
            if (ExpressionsKt.equalsToConstant(divShadow9 != null ? divShadow9.f48768b : null, (divText2 == null || (divShadow6 = divText2.f49464b0) == null) ? null : divShadow6.f48768b)) {
                DivShadow divShadow10 = divText.f49464b0;
                if (ExpressionsKt.equalsToConstant(divShadow10 != null ? divShadow10.f48769c : null, (divText2 == null || (divShadow5 = divText2.f49464b0) == null) ? null : divShadow5.f48769c)) {
                    DivShadow divShadow11 = divText.f49464b0;
                    if (ExpressionsKt.equalsToConstant((divShadow11 == null || (divPoint16 = divShadow11.f48770d) == null || (divDimension16 = divPoint16.f48418a) == null) ? null : divDimension16.f46983b, (divText2 == null || (divShadow4 = divText2.f49464b0) == null || (divPoint15 = divShadow4.f48770d) == null || (divDimension15 = divPoint15.f48418a) == null) ? null : divDimension15.f46983b)) {
                        DivShadow divShadow12 = divText.f49464b0;
                        if (ExpressionsKt.equalsToConstant((divShadow12 == null || (divPoint14 = divShadow12.f48770d) == null || (divDimension14 = divPoint14.f48418a) == null) ? null : divDimension14.f46982a, (divText2 == null || (divShadow3 = divText2.f49464b0) == null || (divPoint13 = divShadow3.f48770d) == null || (divDimension13 = divPoint13.f48418a) == null) ? null : divDimension13.f46982a)) {
                            DivShadow divShadow13 = divText.f49464b0;
                            if (ExpressionsKt.equalsToConstant((divShadow13 == null || (divPoint12 = divShadow13.f48770d) == null || (divDimension12 = divPoint12.f48419b) == null) ? null : divDimension12.f46983b, (divText2 == null || (divShadow2 = divText2.f49464b0) == null || (divPoint11 = divShadow2.f48770d) == null || (divDimension11 = divPoint11.f48419b) == null) ? null : divDimension11.f46983b)) {
                                DivShadow divShadow14 = divText.f49464b0;
                                if (ExpressionsKt.equalsToConstant((divShadow14 == null || (divPoint10 = divShadow14.f48770d) == null || (divDimension10 = divPoint10.f48419b) == null) ? null : divDimension10.f46982a, (divText2 == null || (divShadow = divText2.f49464b0) == null || (divPoint9 = divShadow.f48770d) == null || (divDimension9 = divPoint9.f48419b) == null) ? null : divDimension9.f46982a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        final DivShadow divShadow15 = divText.f49464b0;
        final DisplayMetrics displayMetrics = divLineHeightTextView.getResources().getDisplayMetrics();
        applyTextShadow(divLineHeightTextView, divShadow15 != null ? getShadowData(divShadow15, expressionResolver, displayMetrics, divText.Z.evaluate(expressionResolver).intValue()) : null);
        DivShadow divShadow16 = divText.f49464b0;
        if (ExpressionsKt.isConstantOrNull(divShadow16 != null ? divShadow16.f48767a : null)) {
            DivShadow divShadow17 = divText.f49464b0;
            if (ExpressionsKt.isConstantOrNull(divShadow17 != null ? divShadow17.f48768b : null)) {
                DivShadow divShadow18 = divText.f49464b0;
                if (ExpressionsKt.isConstantOrNull(divShadow18 != null ? divShadow18.f48769c : null)) {
                    DivShadow divShadow19 = divText.f49464b0;
                    if (ExpressionsKt.isConstantOrNull((divShadow19 == null || (divPoint8 = divShadow19.f48770d) == null || (divDimension8 = divPoint8.f48418a) == null) ? null : divDimension8.f46983b)) {
                        DivShadow divShadow20 = divText.f49464b0;
                        if (ExpressionsKt.isConstantOrNull((divShadow20 == null || (divPoint7 = divShadow20.f48770d) == null || (divDimension7 = divPoint7.f48418a) == null) ? null : divDimension7.f46982a)) {
                            DivShadow divShadow21 = divText.f49464b0;
                            if (ExpressionsKt.isConstantOrNull((divShadow21 == null || (divPoint6 = divShadow21.f48770d) == null || (divDimension6 = divPoint6.f48419b) == null) ? null : divDimension6.f46983b)) {
                                DivShadow divShadow22 = divText.f49464b0;
                                if (ExpressionsKt.isConstantOrNull((divShadow22 == null || (divPoint5 = divShadow22.f48770d) == null || (divDimension5 = divPoint5.f48419b) == null) ? null : divDimension5.f46982a)) {
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        l<? super DivSizeUnit, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindTextShadow$callback$1
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
                ShadowData shadowData;
                DivTextBinder divTextBinder = this.this$0;
                DivLineHeightTextView divLineHeightTextView2 = divLineHeightTextView;
                DivShadow divShadow23 = divShadow15;
                if (divShadow23 != null) {
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    shadowData = divTextBinder.getShadowData(divShadow23, expressionResolver2, displayMetrics, divText.Z.evaluate(expressionResolver2).intValue());
                } else {
                    shadowData = null;
                }
                divTextBinder.applyTextShadow(divLineHeightTextView2, shadowData);
            }
        };
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression7 = divShadow15.f48767a) == null) ? null : expression7.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression6 = divShadow15.f48769c) == null) ? null : expression6.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (expression5 = divShadow15.f48768b) == null) ? null : expression5.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint4 = divShadow15.f48770d) == null || (divDimension4 = divPoint4.f48418a) == null || (expression4 = divDimension4.f46983b) == null) ? null : expression4.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint3 = divShadow15.f48770d) == null || (divDimension3 = divPoint3.f48418a) == null || (expression3 = divDimension3.f46982a) == null) ? null : expression3.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription((divShadow15 == null || (divPoint2 = divShadow15.f48770d) == null || (divDimension2 = divPoint2.f48419b) == null || (expression2 = divDimension2.f46983b) == null) ? null : expression2.observe(expressionResolver, lVar));
        if (divShadow15 != null && (divPoint = divShadow15.f48770d) != null && (divDimension = divPoint.f48419b) != null && (expression = divDimension.f46982a) != null) {
            disposableObserve = expression.observe(expressionResolver, lVar);
        }
        divLineHeightTextView.addSubscription(disposableObserve);
    }

    private final void bindTightenWidth(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f49466c0, divText2 != null ? divText2.f49466c0 : null)) {
            return;
        }
        applyTightenWidth(divLineHeightTextView, divText.f49466c0.evaluate(expressionResolver).booleanValue());
        if (ExpressionsKt.isConstant(divText.f49466c0)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.f49466c0.observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindTightenWidth.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return r.f64562a;
            }

            public final void invoke(boolean z10) {
                DivTextBinder.this.applyTightenWidth(divLineHeightTextView, z10);
            }
        }));
    }

    private final void bindUnderline(final DivLineHeightTextView divLineHeightTextView, DivText divText, DivText divText2, ExpressionResolver expressionResolver) {
        if (ExpressionsKt.equalsToConstant(divText.f49482k0, divText2 != null ? divText2.f49482k0 : null)) {
            return;
        }
        applyUnderline(divLineHeightTextView, divText.f49482k0.evaluate(expressionResolver));
        if (ExpressionsKt.isConstant(divText.f49482k0)) {
            return;
        }
        divLineHeightTextView.addSubscription(divText.f49482k0.observe(expressionResolver, new l<DivLineStyle, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindUnderline.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivLineStyle divLineStyle) {
                invoke2(divLineStyle);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivLineStyle divLineStyle) {
                DivTextBinder.this.applyUnderline(divLineHeightTextView, divLineStyle);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ShadowData getShadowData(DivShadow divShadow, ExpressionResolver expressionResolver, DisplayMetrics displayMetrics, int i10) {
        float fDpToPxF = BaseDivViewExtensionsKt.dpToPxF(divShadow.f48768b.evaluate(expressionResolver), displayMetrics);
        float px = BaseDivViewExtensionsKt.toPx(divShadow.f48770d.f48418a, displayMetrics, expressionResolver);
        float px2 = BaseDivViewExtensionsKt.toPx(divShadow.f48770d.f48419b, displayMetrics, expressionResolver);
        Paint paint = new Paint();
        paint.setColor(divShadow.f48769c.evaluate(expressionResolver).intValue());
        paint.setAlpha((int) (divShadow.f48767a.evaluate(expressionResolver).doubleValue() * ((double) (i10 >>> 24))));
        return new ShadowData(px, px2, fDpToPxF, paint.getColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Center toRadialGradientDrawableCenter(DivRadialGradientCenter divRadialGradientCenter, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.b) {
            return new RadialGradientDrawable.Center.Fixed(BaseDivViewExtensionsKt.dpToPxF(((DivRadialGradientCenter.b) divRadialGradientCenter).c().f48454b.evaluate(expressionResolver), displayMetrics));
        }
        if (divRadialGradientCenter instanceof DivRadialGradientCenter.c) {
            return new RadialGradientDrawable.Center.Relative((float) ((DivRadialGradientCenter.c) divRadialGradientCenter).c().f48478a.evaluate(expressionResolver).doubleValue());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RadialGradientDrawable.Radius toRadialGradientDrawableRadius(DivRadialGradientRadius divRadialGradientRadius, DisplayMetrics displayMetrics, ExpressionResolver expressionResolver) {
        RadialGradientDrawable.Radius.Relative.Type type;
        if (divRadialGradientRadius instanceof DivRadialGradientRadius.b) {
            return new RadialGradientDrawable.Radius.Fixed(BaseDivViewExtensionsKt.dpToPxF(((DivRadialGradientRadius.b) divRadialGradientRadius).c().f47188b.evaluate(expressionResolver), displayMetrics));
        }
        if (!(divRadialGradientRadius instanceof DivRadialGradientRadius.c)) {
            throw new NoWhenBranchMatchedException();
        }
        int i10 = WhenMappings.$EnumSwitchMapping$2[((DivRadialGradientRadius.c) divRadialGradientRadius).c().f48485a.evaluate(expressionResolver).ordinal()];
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

    @Override // com.yandex.div.core.view2.DivViewBinder
    public void bind(DivLineHeightTextView divLineHeightTextView, BindingContext bindingContext, DivText divText, DivText divText2) {
        configureView(bindingContext, divLineHeightTextView);
        BaseDivViewExtensionsKt.applyDivActions(divLineHeightTextView, bindingContext, divText.f49463b, divText.f49467d, divText.J, divText.f49489o, divText.D, divText.C, divText.P, divText.O, divText.f49465c, divText.f49483l);
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        bindTypeface(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextAlignment(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontSize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindLetterSpacing(divLineHeightTextView, divText, divText2, expressionResolver);
        bindFontFeatureSettings(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextColor(divLineHeightTextView, divText, divText2, expressionResolver);
        bindUnderline(divLineHeightTextView, divText, divText2, expressionResolver);
        bindStrikethrough(divLineHeightTextView, divText, divText2, expressionResolver);
        bindMaxLines(divLineHeightTextView, bindingContext, divText, divText2, expressionResolver);
        bindText(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsis(divLineHeightTextView, bindingContext, divText, divText2);
        bindEllipsize(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTextGradient(divLineHeightTextView, bindingContext.getDivView(), divText, divText2, expressionResolver);
        bindTextShadow(divLineHeightTextView, divText, divText2, expressionResolver);
        bindSelectable(divLineHeightTextView, divText, divText2, expressionResolver);
        bindTightenWidth(divLineHeightTextView, divText, divText2, expressionResolver);
        updateFocusableState(divLineHeightTextView, divText);
    }

    public DivTextBinder(DivBaseBinder divBaseBinder, DivTypefaceResolver divTypefaceResolver, SpannedTextBuilder spannedTextBuilder, boolean z10) {
        super(divBaseBinder);
        this.typefaceResolver = divTypefaceResolver;
        this.spannedTextBuilder = spannedTextBuilder;
        this.isHyphenationEnabled = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyHyphenation(TextView textView, String str) {
        if (!TextViewsKt.checkHyphenationSupported()) {
            return;
        }
        int hyphenationFrequency = textView.getHyphenationFrequency();
        int i10 = 0;
        if (this.isHyphenationEnabled && a0.W(str, (char) 173, false, 2, null)) {
            i10 = 1;
        }
        if (hyphenationFrequency != i10) {
            textView.setHyphenationFrequency(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyLinearTextGradientColor(final TextView textView, final long j10, final Colormap colormap) {
        if (ViewsKt.isActuallyLaidOut(textView) && !textView.isLayoutRequested()) {
            textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        } else {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyLinearTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(LinearGradientDrawable.Companion.createLinearGradient(j10, colormap.getColors(), colormap.getPositions(), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyRadialTextGradientColor(final TextView textView, final RadialGradientDrawable.Radius radius, final RadialGradientDrawable.Center center, final RadialGradientDrawable.Center center2, final List<Integer> list) {
        if (ViewsKt.isActuallyLaidOut(textView) && !textView.isLayoutRequested()) {
            textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, b0.N0(list), getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
            textView.invalidate();
        } else {
            textView.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$applyRadialTextGradientColor$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                    view.removeOnLayoutChangeListener(this);
                    textView.getPaint().setShader(RadialGradientDrawable.Companion.createRadialGradient(radius, center, center2, b0.N0(list), this.getRealTextWidth(textView), (textView.getHeight() - textView.getPaddingBottom()) - textView.getPaddingTop()));
                    textView.invalidate();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applySelectable(TextView textView, boolean z10) {
        MovementMethod movementMethod = textView.getMovementMethod();
        textView.setTextIsSelectable(z10);
        if (movementMethod instanceof SelectableLinkMovementMethod) {
            textView.setMovementMethod(movementMethod);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0022  */
    public final void applyTextAlignment(TextView textView, DivAlignmentHorizontal divAlignmentHorizontal, DivAlignmentVertical divAlignmentVertical) {
        textView.setGravity(DivUtilKt.evaluateGravity(divAlignmentHorizontal, divAlignmentVertical));
        int i10 = WhenMappings.$EnumSwitchMapping$0[divAlignmentHorizontal.ordinal()];
        int i11 = 6;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3 && (i10 == 4 || i10 != 5)) {
                    i11 = 5;
                }
            } else {
                i11 = 4;
            }
        } else {
            i11 = 5;
        }
        textView.setTextAlignment(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyTightenWidth(DivLineHeightTextView divLineHeightTextView, boolean z10) {
        divLineHeightTextView.setTightenWidth(z10);
    }

    private final void bindRichEllipsis(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        Disposable disposableObserve;
        Disposable disposableObserve2;
        Disposable disposableObserve3;
        Disposable disposableObserve4;
        Disposable disposableObserve5;
        Disposable disposableObserve6;
        Disposable disposableObserve7;
        Disposable disposableObserve8;
        Disposable disposableObserve9;
        Disposable disposableObserve10;
        Disposable disposableObserve11;
        Disposable disposableObserve12;
        Disposable disposableObserve13;
        Disposable disposableObserve14;
        Object objB;
        Object objB2;
        Disposable disposableObserve15;
        Disposable disposableObserve16;
        Disposable disposableObserve17;
        DivStroke divStroke;
        Expression<Double> expression;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
        DivText.Ellipsis ellipsis = divText.f49491p;
        if (ellipsis == null) {
            return;
        }
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        l<? super String, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichEllipsis$callback$1
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
                this.this$0.applyRichEllipsis(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(ellipsis.f49510d.observe(expressionResolver, lVar));
        List<DivText.Range> list = ellipsis.f49509c;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.f49558q.observe(expressionResolver, lVar));
                Expression<Long> expression3 = range.f49547f;
                if (expression3 != null) {
                    disposableObserve2 = expression3.observe(expressionResolver, lVar);
                } else {
                    disposableObserve2 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve2);
                Expression<DivTextAlignmentVertical> expression4 = range.f49543b;
                if (expression4 != null) {
                    disposableObserve3 = expression4.observe(expressionResolver, lVar);
                } else {
                    disposableObserve3 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve3);
                divLineHeightTextView.addSubscription(range.f49545d.observe(expressionResolver, lVar));
                Expression<Long> expression5 = range.f49550i;
                if (expression5 != null) {
                    disposableObserve4 = expression5.observe(expressionResolver, lVar);
                } else {
                    disposableObserve4 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve4);
                divLineHeightTextView.addSubscription(range.f49551j.observe(expressionResolver, lVar));
                Expression<String> expression6 = range.f49548g;
                if (expression6 != null) {
                    disposableObserve5 = expression6.observe(expressionResolver, lVar);
                } else {
                    disposableObserve5 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve5);
                Expression<DivFontWeight> expression7 = range.f49553l;
                if (expression7 != null) {
                    disposableObserve6 = expression7.observe(expressionResolver, lVar);
                } else {
                    disposableObserve6 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve6);
                Expression<Long> expression8 = range.f49554m;
                if (expression8 != null) {
                    disposableObserve7 = expression8.observe(expressionResolver, lVar);
                } else {
                    disposableObserve7 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve7);
                Expression<String> expression9 = range.f49549h;
                if (expression9 != null) {
                    disposableObserve8 = expression9.observe(expressionResolver, lVar);
                } else {
                    disposableObserve8 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve8);
                Expression<Double> expression10 = range.f49555n;
                if (expression10 != null) {
                    disposableObserve9 = expression10.observe(expressionResolver, lVar);
                } else {
                    disposableObserve9 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve9);
                Expression<Long> expression11 = range.f49556o;
                if (expression11 != null) {
                    disposableObserve10 = expression11.observe(expressionResolver, lVar);
                } else {
                    disposableObserve10 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve10);
                Expression<DivLineStyle> expression12 = range.f49559r;
                if (expression12 != null) {
                    disposableObserve11 = expression12.observe(expressionResolver, lVar);
                } else {
                    disposableObserve11 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve11);
                Expression<Integer> expression13 = range.f49560s;
                if (expression13 != null) {
                    disposableObserve12 = expression13.observe(expressionResolver, lVar);
                } else {
                    disposableObserve12 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve12);
                Expression<Long> expression14 = range.f49562u;
                if (expression14 != null) {
                    disposableObserve13 = expression14.observe(expressionResolver, lVar);
                } else {
                    disposableObserve13 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve13);
                Expression<DivLineStyle> expression15 = range.f49563v;
                if (expression15 != null) {
                    disposableObserve14 = expression15.observe(expressionResolver, lVar);
                } else {
                    disposableObserve14 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve14);
                DivTextRangeBackground divTextRangeBackground = range.f49544c;
                if (divTextRangeBackground != null) {
                    objB = divTextRangeBackground.b();
                } else {
                    objB = null;
                }
                if (objB instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) objB).f49006a.observe(expressionResolver, lVar));
                }
                DivTextRangeMask divTextRangeMask = range.f49557p;
                if (divTextRangeMask != null) {
                    objB2 = divTextRangeMask.b();
                } else {
                    objB2 = null;
                }
                if (objB2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f49696b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f49695a.observe(expressionResolver, lVar));
                } else if (objB2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49678d.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49675a.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49676b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49677c.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49679e.f47188b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49679e.f47187a.observe(expressionResolver, lVar));
                }
                DivTextRangeBorder divTextRangeBorder = range.f49546e;
                if (divTextRangeBorder != null && (divStroke2 = divTextRangeBorder.f49631b) != null && (expression2 = divStroke2.f49131a) != null) {
                    disposableObserve15 = expression2.observe(expressionResolver, lVar);
                } else {
                    disposableObserve15 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve15);
                DivTextRangeBorder divTextRangeBorder2 = range.f49546e;
                if (divTextRangeBorder2 != null && (divStroke = divTextRangeBorder2.f49631b) != null && (expression = divStroke.f49134d) != null) {
                    disposableObserve16 = expression.observe(expressionResolver, lVar);
                } else {
                    disposableObserve16 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve16);
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression16 = range.f49552k;
                    if (expression16 != null) {
                        disposableObserve17 = expression16.observe(expressionResolver, lVar);
                    } else {
                        disposableObserve17 = null;
                    }
                    divLineHeightTextView.addSubscription(disposableObserve17);
                }
            }
        }
        List<DivText.Image> list2 = ellipsis.f49508b;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.f49525f.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49528i.observe(expressionResolver, lVar));
                Expression<Integer> expression17 = image.f49526g;
                if (expression17 != null) {
                    disposableObserve = expression17.observe(expressionResolver, lVar);
                } else {
                    disposableObserve = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve);
                divLineHeightTextView.addSubscription(image.f49529j.f47188b.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49529j.f47187a.observe(expressionResolver, lVar));
            }
        }
    }

    private final void bindRichText(final DivLineHeightTextView divLineHeightTextView, final BindingContext bindingContext, final DivText divText) {
        Disposable disposableObserve;
        Disposable disposableObserve2;
        Disposable disposableObserve3;
        Disposable disposableObserve4;
        Disposable disposableObserve5;
        Disposable disposableObserve6;
        Disposable disposableObserve7;
        Disposable disposableObserve8;
        Disposable disposableObserve9;
        Disposable disposableObserve10;
        Disposable disposableObserve11;
        Disposable disposableObserve12;
        Disposable disposableObserve13;
        Disposable disposableObserve14;
        Disposable disposableObserve15;
        Disposable disposableObserve16;
        Object objB;
        Object objB2;
        Disposable disposableObserve17;
        Disposable disposableObserve18;
        Disposable disposableObserve19;
        DivStroke divStroke;
        Expression<Double> expression;
        DivStroke divStroke2;
        Expression<Integer> expression2;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        applyRichText(divLineHeightTextView, bindingContext, divText);
        applyHyphenation(divLineHeightTextView, divText.W.evaluate(expressionResolver));
        divLineHeightTextView.addSubscription(divText.W.observe(expressionResolver, new l<String, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder.bindRichText.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(String str) {
                invoke2(str);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String str) {
                DivTextBinder.this.applyRichText(divLineHeightTextView, bindingContext, divText);
                DivTextBinder.this.applyHyphenation(divLineHeightTextView, str);
            }
        }));
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivTextBinder$bindRichText$callback$1
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
                this.this$0.applyRichText(divLineHeightTextView, bindingContext, divText);
            }
        };
        divLineHeightTextView.addSubscription(divText.f49500v.observe(expressionResolver, lVar));
        divLineHeightTextView.addSubscription(divText.f49501w.observe(expressionResolver, lVar));
        Expression<String> expression3 = divText.f49498t;
        if (expression3 != null) {
            disposableObserve = expression3.observe(expressionResolver, lVar);
        } else {
            disposableObserve = null;
        }
        divLineHeightTextView.addSubscription(disposableObserve);
        Expression<Long> expression4 = divText.I;
        if (expression4 != null) {
            disposableObserve2 = expression4.observe(expressionResolver, lVar);
        } else {
            disposableObserve2 = null;
        }
        divLineHeightTextView.addSubscription(disposableObserve2);
        List<DivText.Range> list = divText.Q;
        if (list != null) {
            for (DivText.Range range : list) {
                divLineHeightTextView.addSubscription(range.f49558q.observe(expressionResolver, lVar));
                Expression<Long> expression5 = range.f49547f;
                if (expression5 != null) {
                    disposableObserve4 = expression5.observe(expressionResolver, lVar);
                } else {
                    disposableObserve4 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve4);
                Expression<DivTextAlignmentVertical> expression6 = range.f49543b;
                if (expression6 != null) {
                    disposableObserve5 = expression6.observe(expressionResolver, lVar);
                } else {
                    disposableObserve5 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve5);
                divLineHeightTextView.addSubscription(range.f49545d.observe(expressionResolver, lVar));
                Expression<Long> expression7 = range.f49550i;
                if (expression7 != null) {
                    disposableObserve6 = expression7.observe(expressionResolver, lVar);
                } else {
                    disposableObserve6 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve6);
                divLineHeightTextView.addSubscription(range.f49551j.observe(expressionResolver, lVar));
                Expression<String> expression8 = range.f49548g;
                if (expression8 != null) {
                    disposableObserve7 = expression8.observe(expressionResolver, lVar);
                } else {
                    disposableObserve7 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve7);
                Expression<DivFontWeight> expression9 = range.f49553l;
                if (expression9 != null) {
                    disposableObserve8 = expression9.observe(expressionResolver, lVar);
                } else {
                    disposableObserve8 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve8);
                Expression<Long> expression10 = range.f49554m;
                if (expression10 != null) {
                    disposableObserve9 = expression10.observe(expressionResolver, lVar);
                } else {
                    disposableObserve9 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve9);
                Expression<String> expression11 = range.f49549h;
                if (expression11 != null) {
                    disposableObserve10 = expression11.observe(expressionResolver, lVar);
                } else {
                    disposableObserve10 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve10);
                Expression<Double> expression12 = range.f49555n;
                if (expression12 != null) {
                    disposableObserve11 = expression12.observe(expressionResolver, lVar);
                } else {
                    disposableObserve11 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve11);
                Expression<Long> expression13 = range.f49556o;
                if (expression13 != null) {
                    disposableObserve12 = expression13.observe(expressionResolver, lVar);
                } else {
                    disposableObserve12 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve12);
                Expression<DivLineStyle> expression14 = range.f49559r;
                if (expression14 != null) {
                    disposableObserve13 = expression14.observe(expressionResolver, lVar);
                } else {
                    disposableObserve13 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve13);
                Expression<Integer> expression15 = range.f49560s;
                if (expression15 != null) {
                    disposableObserve14 = expression15.observe(expressionResolver, lVar);
                } else {
                    disposableObserve14 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve14);
                Expression<Long> expression16 = range.f49562u;
                if (expression16 != null) {
                    disposableObserve15 = expression16.observe(expressionResolver, lVar);
                } else {
                    disposableObserve15 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve15);
                Expression<DivLineStyle> expression17 = range.f49563v;
                if (expression17 != null) {
                    disposableObserve16 = expression17.observe(expressionResolver, lVar);
                } else {
                    disposableObserve16 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve16);
                DivTextRangeBackground divTextRangeBackground = range.f49544c;
                if (divTextRangeBackground != null) {
                    objB = divTextRangeBackground.b();
                } else {
                    objB = null;
                }
                if (objB instanceof DivSolidBackground) {
                    divLineHeightTextView.addSubscription(((DivSolidBackground) objB).f49006a.observe(expressionResolver, lVar));
                }
                DivTextRangeMask divTextRangeMask = range.f49557p;
                if (divTextRangeMask != null) {
                    objB2 = divTextRangeMask.b();
                } else {
                    objB2 = null;
                }
                if (objB2 instanceof DivTextRangeMaskSolid) {
                    DivTextRangeMaskSolid divTextRangeMaskSolid = (DivTextRangeMaskSolid) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f49696b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskSolid.f49695a.observe(expressionResolver, lVar));
                } else if (objB2 instanceof DivTextRangeMaskParticles) {
                    DivTextRangeMaskParticles divTextRangeMaskParticles = (DivTextRangeMaskParticles) objB2;
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49678d.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49675a.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49676b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49677c.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49679e.f47188b.observe(expressionResolver, lVar));
                    divLineHeightTextView.addSubscription(divTextRangeMaskParticles.f49679e.f47187a.observe(expressionResolver, lVar));
                }
                DivTextRangeBorder divTextRangeBorder = range.f49546e;
                if (divTextRangeBorder != null && (divStroke2 = divTextRangeBorder.f49631b) != null && (expression2 = divStroke2.f49131a) != null) {
                    disposableObserve17 = expression2.observe(expressionResolver, lVar);
                } else {
                    disposableObserve17 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve17);
                DivTextRangeBorder divTextRangeBorder2 = range.f49546e;
                if (divTextRangeBorder2 != null && (divStroke = divTextRangeBorder2.f49631b) != null && (expression = divStroke.f49134d) != null) {
                    disposableObserve18 = expression.observe(expressionResolver, lVar);
                } else {
                    disposableObserve18 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve18);
                if (TextViewExtensionsKt.getSupportFontVariations()) {
                    Expression<JSONObject> expression18 = range.f49552k;
                    if (expression18 != null) {
                        disposableObserve19 = expression18.observe(expressionResolver, lVar);
                    } else {
                        disposableObserve19 = null;
                    }
                    divLineHeightTextView.addSubscription(disposableObserve19);
                }
            }
        }
        List<DivText.Image> list2 = divText.F;
        if (list2 != null) {
            for (DivText.Image image : list2) {
                divLineHeightTextView.addSubscription(image.f49525f.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49523d.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49528i.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49521b.observe(expressionResolver, lVar));
                Expression<Integer> expression19 = image.f49526g;
                if (expression19 != null) {
                    disposableObserve3 = expression19.observe(expressionResolver, lVar);
                } else {
                    disposableObserve3 = null;
                }
                divLineHeightTextView.addSubscription(disposableObserve3);
                divLineHeightTextView.addSubscription(image.f49529j.f47188b.observe(expressionResolver, lVar));
                divLineHeightTextView.addSubscription(image.f49529j.f47187a.observe(expressionResolver, lVar));
            }
        }
    }

    private final void configureView(BindingContext bindingContext, DivLineHeightTextView divLineHeightTextView) {
        divLineHeightTextView.setDrawingPassOverrideStrategy$div_release(bindingContext.getDivView().getViewComponent$div_release().getDrawingPassOverrideStrategy());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getRealTextWidth(TextView textView) {
        return Math.min((textView.getWidth() - textView.getPaddingRight()) - textView.getPaddingLeft(), (int) textView.getPaint().measureText(textView.getText().toString()));
    }

    private final void updateFocusableState(View view, DivText divText) {
        boolean z10;
        if (!view.isFocusable() && divText.f49497s == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        view.setFocusable(z10);
    }
}
