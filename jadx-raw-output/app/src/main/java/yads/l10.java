package yads;

import android.R;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewManager;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import com.ironsource.C3426d4;
import com.monetization.ads.nativeads.CustomizableMediaView;
import com.yandex.mobile.ads.R$drawable;
import com.yandex.mobile.ads.nativeads.template.SizeConstraint;
import com.yandex.mobile.ads.nativeads.template.appearance.NativeTemplateAppearance;
import io.bidmachine.iab.vast.tags.VastAttributes;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
public abstract class l10 extends FrameLayout {
    private ImageView A;
    private LinearLayout B;
    private CustomizableMediaView C;
    private LinearLayout D;
    private y00 E;
    private c42 F;
    private q32 G;
    private h02 H;
    private w02 I;
    private final k10 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final og0 f79652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m10 f79653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io2 f79654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f79655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f79656e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f79657f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private p10 f79658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private TextView f79659h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private TextView f79660i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Button f79661j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private TextView f79662k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private ImageView f79663l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final ImageView f79664m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private a33 f79665n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private TextView f79666o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private TextView f79667p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private ImageView f79668q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private wl2 f79669r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f79670s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ImageView f79671t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ImageView f79672u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private LinearLayout f79673v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private FrameLayout f79674w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private LinearLayout f79675x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private LinearLayout f79676y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private LinearLayout f79677z;

    public l10(Context context, AttributeSet attributeSet, int i10, NativeTemplateAppearance nativeTemplateAppearance, og0 og0Var, m10 m10Var, io2 io2Var) {
        super(context, attributeSet, i10);
        this.f79652a = og0Var;
        this.f79653b = m10Var;
        this.f79654c = io2Var;
        Context context2 = getContext();
        og0Var.getClass();
        this.f79655d = og0.a(context2, 4.0f);
        this.f79656e = og0.a(getContext(), 8.0f);
        this.f79657f = og0.a(getContext(), 12.0f);
        this.f79658g = nativeTemplateAppearance;
        this.f79664m = d();
        this.J = new k10(this);
        c();
    }

    private final void a() {
        float borderWidth = this.f79658g.getBannerAppearance().getBorderWidth();
        og0 og0Var = this.f79652a;
        Context context = getContext();
        og0Var.getClass();
        int iA = og0.a(context, borderWidth);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setShape(new RectShape());
        Paint paint = shapeDrawable.getPaint();
        paint.setColor(this.f79658g.getBannerAppearance().getBackgroundColor());
        paint.setStyle(Paint.Style.FILL);
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        shapeDrawable2.setShape(new RectShape());
        Paint paint2 = shapeDrawable2.getPaint();
        paint2.setColor(this.f79658g.getBannerAppearance().getBorderColor());
        paint2.setStrokeWidth(iA * 2.0f);
        Paint.Style style = Paint.Style.STROKE;
        paint2.setStyle(style);
        setBackground(new LayerDrawable(new Drawable[]{shapeDrawable, shapeDrawable2}));
        setPadding(iA, iA, iA, iA);
        c52 contentPadding = this.f79658g.getBannerAppearance().getContentPadding();
        a33 a33Var = null;
        if (contentPadding != null) {
            og0 og0Var2 = this.f79652a;
            Context context2 = getContext();
            float left = contentPadding.getLeft();
            og0Var2.getClass();
            int iA2 = og0.a(context2, left);
            og0 og0Var3 = this.f79652a;
            Context context3 = getContext();
            float right = contentPadding.getRight();
            og0Var3.getClass();
            int iA3 = og0.a(context3, right);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(iA2, this.f79656e, iA3, this.f79655d);
            LinearLayout linearLayout = this.f79675x;
            if (linearLayout == null) {
                ck.p.B("topContainer");
                linearLayout = null;
            }
            linearLayout.setLayoutParams(layoutParams);
            LinearLayout linearLayout2 = this.f79675x;
            if (linearLayout2 == null) {
                ck.p.B("topContainer");
                linearLayout2 = null;
            }
            linearLayout2.invalidate();
        }
        c52 contentPadding2 = this.f79658g.getBannerAppearance().getContentPadding();
        if (contentPadding2 != null) {
            og0 og0Var4 = this.f79652a;
            Context context4 = getContext();
            float left2 = contentPadding2.getLeft();
            og0Var4.getClass();
            int iA4 = og0.a(context4, left2);
            og0 og0Var5 = this.f79652a;
            Context context5 = getContext();
            float right2 = contentPadding2.getRight();
            og0Var5.getClass();
            int iA5 = og0.a(context5, right2);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.leftMargin = iA4;
            layoutParams2.rightMargin = iA5;
            layoutParams2.bottomMargin = this.f79655d;
            LinearLayout linearLayout3 = this.f79676y;
            if (linearLayout3 == null) {
                ck.p.B("centerContainer");
                linearLayout3 = null;
            }
            linearLayout3.setLayoutParams(layoutParams2);
            LinearLayout linearLayout4 = this.f79676y;
            if (linearLayout4 == null) {
                ck.p.B("centerContainer");
                linearLayout4 = null;
            }
            linearLayout4.invalidate();
        }
        c52 contentPadding3 = this.f79658g.getBannerAppearance().getContentPadding();
        if (contentPadding3 != null) {
            og0 og0Var6 = this.f79652a;
            Context context6 = getContext();
            float left3 = contentPadding3.getLeft();
            og0Var6.getClass();
            int iA6 = og0.a(context6, left3);
            og0 og0Var7 = this.f79652a;
            Context context7 = getContext();
            float right3 = contentPadding3.getRight();
            og0Var7.getClass();
            int iA7 = og0.a(context7, right3);
            TextView warningView = getWarningView();
            int i10 = this.f79655d;
            warningView.setPadding(iA6, i10, iA7, i10);
            getWarningView().invalidate();
        }
        i52 textAppearance = this.f79658g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance != null) {
            getCallToActionView().setTextColor(textAppearance.getTextColor());
        }
        i52 textAppearance2 = this.f79658g.getCallToActionAppearance().getTextAppearance();
        if (textAppearance2 != null) {
            getCallToActionView().setTextSize(textAppearance2.getTextSize());
            Button callToActionView = getCallToActionView();
            i52 textAppearance3 = this.f79658g.getCallToActionAppearance().getTextAppearance();
            callToActionView.setTypeface(Typeface.create(textAppearance3 != null ? textAppearance3.getFontFamilyName() : null, textAppearance2.getFontStyle()));
        }
        og0 og0Var8 = this.f79652a;
        Context context8 = getContext();
        og0Var8.getClass();
        float fA = og0.a(context8, 5.0f);
        float[] fArr = new float[8];
        Arrays.fill(fArr, fA);
        RoundRectShape roundRectShape = new RoundRectShape(fArr, null, fArr);
        ShapeDrawable shapeDrawable3 = new ShapeDrawable(roundRectShape);
        shapeDrawable3.getPaint().setColor(this.f79658g.getCallToActionAppearance().getPressedColor());
        ShapeDrawable shapeDrawable4 = new ShapeDrawable(roundRectShape);
        shapeDrawable4.getPaint().setColor(this.f79658g.getCallToActionAppearance().getNormalColor());
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_selected}, shapeDrawable3);
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable3);
        stateListDrawable.addState(new int[0], shapeDrawable4);
        og0 og0Var9 = this.f79652a;
        Context context9 = getContext();
        float borderWidth2 = this.f79658g.getCallToActionAppearance().getBorderWidth();
        og0Var9.getClass();
        int iA8 = og0.a(context9, borderWidth2);
        ShapeDrawable shapeDrawable5 = new ShapeDrawable();
        shapeDrawable5.setShape(roundRectShape);
        Paint paint3 = shapeDrawable5.getPaint();
        paint3.setColor(this.f79658g.getCallToActionAppearance().getBorderColor());
        paint3.setStrokeWidth(iA8);
        paint3.setStyle(style);
        getCallToActionView().setBackground(new LayerDrawable(new Drawable[]{stateListDrawable, shapeDrawable5}));
        wl2 wl2Var = this.f79669r;
        if (wl2Var == null) {
            ck.p.B("_ratingView");
            wl2Var = null;
        }
        Drawable progressDrawable = wl2Var.getProgressDrawable();
        ck.p.h(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
        LayerDrawable layerDrawable = (LayerDrawable) progressDrawable;
        Drawable drawable = layerDrawable.getDrawable(2);
        int progressStarColor = this.f79658g.getRatingAppearance().getProgressStarColor();
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_ATOP;
        drawable.setColorFilter(progressStarColor, mode);
        layerDrawable.getDrawable(1).setColorFilter(this.f79658g.getRatingAppearance().getBackgroundStarColor(), mode);
        layerDrawable.getDrawable(0).setColorFilter(this.f79658g.getRatingAppearance().getBackgroundStarColor(), mode);
        getAgeView().setTypeface(Typeface.create(this.f79658g.getAgeAppearance().getFontFamilyName(), this.f79658g.getAgeAppearance().getFontStyle()));
        getAgeView().setTextColor(this.f79658g.getAgeAppearance().getTextColor());
        getAgeView().setTextSize(2, this.f79658g.getAgeAppearance().getTextSize());
        getBodyView().setTypeface(Typeface.create(this.f79658g.getBodyAppearance().getFontFamilyName(), this.f79658g.getBodyAppearance().getFontStyle()));
        getBodyView().setTextColor(this.f79658g.getBodyAppearance().getTextColor());
        getBodyView().setTextSize(2, this.f79658g.getBodyAppearance().getTextSize());
        getDomainView().setTypeface(Typeface.create(this.f79658g.getDomainAppearance().getFontFamilyName(), this.f79658g.getDomainAppearance().getFontStyle()));
        getDomainView().setTextColor(this.f79658g.getDomainAppearance().getTextColor());
        getDomainView().setTextSize(2, this.f79658g.getDomainAppearance().getTextSize());
        getReviewCountView().setTypeface(Typeface.create(this.f79658g.getReviewCountAppearance().getFontFamilyName(), this.f79658g.getReviewCountAppearance().getFontStyle()));
        getReviewCountView().setTextColor(this.f79658g.getReviewCountAppearance().getTextColor());
        getReviewCountView().setTextSize(2, this.f79658g.getReviewCountAppearance().getTextSize());
        a33 a33Var2 = this.f79665n;
        if (a33Var2 == null) {
            ck.p.B("_sponsoredView");
            a33Var2 = null;
        }
        a33Var2.setTypeface(Typeface.create(this.f79658g.getSponsoredAppearance().getFontFamilyName(), this.f79658g.getSponsoredAppearance().getFontStyle()));
        a33 a33Var3 = this.f79665n;
        if (a33Var3 == null) {
            ck.p.B("_sponsoredView");
            a33Var3 = null;
        }
        a33Var3.setTextColor(this.f79658g.getSponsoredAppearance().getTextColor());
        a33 a33Var4 = this.f79665n;
        if (a33Var4 == null) {
            ck.p.B("_sponsoredView");
        } else {
            a33Var = a33Var4;
        }
        a33Var.setTextSize(2, this.f79658g.getSponsoredAppearance().getTextSize());
        getTitleView().setTypeface(Typeface.create(this.f79658g.getTitleAppearance().getFontFamilyName(), this.f79658g.getTitleAppearance().getFontStyle()));
        getTitleView().setTextColor(this.f79658g.getTitleAppearance().getTextColor());
        getTitleView().setTextSize(2, this.f79658g.getTitleAppearance().getTextSize());
        getWarningView().setTypeface(Typeface.create(this.f79658g.getWarningAppearance().getFontFamilyName(), this.f79658g.getWarningAppearance().getFontStyle()));
        getWarningView().setTextColor(this.f79658g.getWarningAppearance().getTextColor());
        getWarningView().setTextSize(2, this.f79658g.getWarningAppearance().getTextSize());
        invalidate();
        requestLayout();
    }

    private final void c() {
        this.f79672u = d();
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(getContext());
        this.f79675x = linearLayout2;
        linearLayout2.setOrientation(0);
        LinearLayout linearLayout3 = this.f79675x;
        if (linearLayout3 == null) {
            ck.p.B("topContainer");
            linearLayout3 = null;
        }
        linearLayout3.setGravity(17);
        LinearLayout linearLayout4 = this.f79675x;
        if (linearLayout4 == null) {
            ck.p.B("topContainer");
            linearLayout4 = null;
        }
        linearLayout4.setWeightSum(4.0f);
        View view = new View(getContext());
        view.setLayoutParams(new LinearLayout.LayoutParams(0, 0, 1.0f));
        LinearLayout linearLayout5 = new LinearLayout(getContext());
        linearLayout5.setGravity(17);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        a33 a33Var = new a33(getContext());
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        a33Var.setEllipsize(truncateAt);
        a33Var.setMaxLines(1);
        a33Var.setGravity(17);
        og0 og0Var = this.f79652a;
        Context context = getContext();
        og0Var.getClass();
        a33Var.setPadding(0, 0, 0, og0.a(context, 4.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        a33Var.setLayoutParams(layoutParams);
        this.f79665n = a33Var;
        linearLayout5.addView(a33Var);
        LinearLayout linearLayout6 = new LinearLayout(getContext());
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(getContext());
        textView.setEllipsize(truncateAt);
        textView.setMaxLines(1);
        textView.setGravity(GravityCompat.START);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.rightMargin = this.f79655d;
        textView.setLayoutParams(layoutParams2);
        this.f79659h = textView;
        linearLayout6.addView(getAgeView());
        LinearLayout linearLayout7 = this.f79675x;
        if (linearLayout7 == null) {
            ck.p.B("topContainer");
            linearLayout7 = null;
        }
        linearLayout7.addView(linearLayout6);
        ViewGroup viewGroup = this.f79675x;
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup == null) {
            ck.p.B("topContainer");
            viewGroup2 = null;
        }
        viewGroup2.addView(linearLayout5);
        LinearLayout linearLayout8 = this.f79675x;
        if (linearLayout8 == null) {
            ck.p.B("topContainer");
            linearLayout8 = null;
        }
        linearLayout8.addView(view);
        LinearLayout linearLayout9 = this.f79675x;
        if (linearLayout9 == null) {
            ck.p.B("topContainer");
            linearLayout9 = null;
        }
        LinearLayout linearLayout10 = new LinearLayout(getContext());
        this.f79676y = linearLayout10;
        linearLayout10.setOrientation(0);
        LinearLayout linearLayout11 = this.f79676y;
        if (linearLayout11 == null) {
            ck.p.B("centerContainer");
            linearLayout11 = null;
        }
        linearLayout11.setBaselineAligned(false);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = this.f79655d;
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(layoutParams3);
        this.f79668q = d();
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        this.f79671t = imageView;
        frameLayout.addView(getIconView());
        frameLayout.addView(this.f79664m);
        frameLayout.addView(getFaviconView());
        LinearLayout linearLayout12 = new LinearLayout(getContext());
        linearLayout12.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        linearLayout12.setOrientation(1);
        TextView textView2 = new TextView(getContext());
        textView2.setEllipsize(truncateAt);
        textView2.setMaxLines(2);
        textView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f79666o = textView2;
        TextView textView3 = new TextView(getContext());
        textView3.setEllipsize(truncateAt);
        textView3.setMaxLines(3);
        textView3.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f79660i = textView3;
        TextView textView4 = new TextView(getContext());
        textView4.setEllipsize(truncateAt);
        textView4.setMaxLines(1);
        textView4.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f79662k = textView4;
        linearLayout12.addView(getTitleView());
        linearLayout12.addView(getBodyView());
        linearLayout12.addView(getDomainView());
        LinearLayout linearLayout13 = new LinearLayout(getContext());
        this.f79677z = linearLayout13;
        linearLayout13.setOrientation(0);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = this.f79656e;
        LinearLayout linearLayout14 = this.f79677z;
        if (linearLayout14 == null) {
            ck.p.B("callToActionContainer");
            linearLayout14 = null;
        }
        linearLayout14.setLayoutParams(layoutParams4);
        LinearLayout linearLayout15 = new LinearLayout(getContext());
        linearLayout15.setOrientation(1);
        linearLayout15.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        wl2 wl2Var = new wl2(getContext(), null, R.attr.ratingBarStyleSmall);
        wl2Var.setNumStars(5);
        wl2Var.setStepSize(0.5f);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams5.rightMargin = this.f79656e;
        wl2Var.setLayoutParams(layoutParams5);
        this.f79669r = wl2Var;
        TextView textView5 = new TextView(getContext());
        textView5.setEllipsize(truncateAt);
        textView5.setMaxLines(1);
        textView5.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        this.f79670s = textView5;
        wl2 wl2Var2 = this.f79669r;
        if (wl2Var2 == null) {
            ck.p.B("_ratingView");
            wl2Var2 = null;
        }
        linearLayout15.addView(wl2Var2);
        linearLayout15.addView(getReviewCountView());
        LinearLayout linearLayout16 = new LinearLayout(getContext());
        linearLayout16.setOrientation(0);
        linearLayout16.setGravity(5);
        linearLayout16.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        Button button = new Button(getContext(), null, R.attr.borderlessButtonStyle);
        button.setEllipsize(truncateAt);
        button.setMaxLines(1);
        button.setTransformationMethod(null);
        og0 og0Var2 = this.f79652a;
        Context context2 = getContext();
        og0Var2.getClass();
        int iA = og0.a(context2, 26.0f);
        button.setMinimumHeight(iA);
        button.setMinHeight(iA);
        button.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.f79661j = button;
        linearLayout16.addView(getCallToActionView());
        LinearLayout linearLayout17 = this.f79677z;
        if (linearLayout17 == null) {
            ck.p.B("callToActionContainer");
            linearLayout17 = null;
        }
        linearLayout17.addView(linearLayout15);
        LinearLayout linearLayout18 = this.f79677z;
        if (linearLayout18 == null) {
            ck.p.B("callToActionContainer");
            linearLayout18 = null;
        }
        linearLayout18.addView(linearLayout16);
        LinearLayout linearLayout19 = this.f79677z;
        if (linearLayout19 == null) {
            ck.p.B("callToActionContainer");
            linearLayout19 = null;
        }
        linearLayout12.addView(linearLayout19);
        LinearLayout linearLayout20 = this.f79676y;
        if (linearLayout20 == null) {
            ck.p.B("centerContainer");
            linearLayout20 = null;
        }
        linearLayout20.addView(frameLayout);
        LinearLayout linearLayout21 = this.f79676y;
        if (linearLayout21 == null) {
            ck.p.B("centerContainer");
            linearLayout21 = null;
        }
        linearLayout21.addView(linearLayout12);
        LinearLayout linearLayout22 = this.f79676y;
        if (linearLayout22 == null) {
            ck.p.B("centerContainer");
            linearLayout22 = null;
        }
        LinearLayout linearLayout23 = new LinearLayout(getContext());
        linearLayout23.setOrientation(0);
        linearLayout23.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.B = linearLayout23;
        ImageView imageView2 = new ImageView(getContext());
        imageView2.setAdjustViewBounds(true);
        imageView2.setScaleType(scaleType);
        imageView2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.A = imageView2;
        LinearLayout linearLayout24 = this.B;
        if (linearLayout24 == null) {
            ck.p.B("largeImageContainer");
            linearLayout24 = null;
        }
        ImageView imageView3 = this.A;
        if (imageView3 == null) {
            ck.p.B("largeImageView");
            imageView3 = null;
        }
        linearLayout24.addView(imageView3);
        LinearLayout linearLayout25 = this.B;
        if (linearLayout25 == null) {
            ck.p.B("largeImageContainer");
            linearLayout25 = null;
        }
        LinearLayout linearLayout26 = new LinearLayout(getContext());
        linearLayout26.setOrientation(0);
        linearLayout26.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.D = linearLayout26;
        CustomizableMediaView customizableMediaView = new CustomizableMediaView(getContext());
        customizableMediaView.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        this.C = customizableMediaView;
        LinearLayout linearLayout27 = this.D;
        if (linearLayout27 == null) {
            ck.p.B("mediaContainer");
            linearLayout27 = null;
        }
        linearLayout27.addView(getMediaView());
        LinearLayout linearLayout28 = this.D;
        if (linearLayout28 == null) {
            ck.p.B("mediaContainer");
            linearLayout28 = null;
        }
        TextView textView6 = new TextView(getContext());
        textView6.setEllipsize(truncateAt);
        this.f79667p = textView6;
        TextView warningView = getWarningView();
        linearLayout.addView(linearLayout9);
        linearLayout.addView(linearLayout22);
        linearLayout.addView(linearLayout25);
        linearLayout.addView(linearLayout28);
        linearLayout.addView(warningView);
        this.f79673v = linearLayout;
        c52 contentPadding = this.f79658g.getBannerAppearance().getContentPadding();
        if (contentPadding != null) {
            og0 og0Var3 = this.f79652a;
            Context context3 = getContext();
            float right = contentPadding.getRight();
            og0Var3.getClass();
            int iA2 = og0.a(context3, right) - this.f79656e;
            Context context4 = getContext();
            FrameLayout frameLayout2 = new FrameLayout(getContext());
            frameLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            this.f79674w = frameLayout2;
            int i10 = this.f79655d;
            ImageView imageView4 = new ImageView(context4);
            int iA3 = kl3.a(context4, 28.0f);
            FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(iA3, iA3);
            layoutParams6.gravity = GravityCompat.END;
            layoutParams6.rightMargin = iA2;
            layoutParams6.topMargin = i10;
            imageView4.setLayoutParams(layoutParams6);
            this.f79663l = imageView4;
            FrameLayout frameLayout3 = this.f79674w;
            if (frameLayout3 == null) {
                ck.p.B("feedbackContainer");
                frameLayout3 = null;
            }
            frameLayout3.addView(getFeedbackView());
            FrameLayout frameLayout4 = this.f79674w;
            if (frameLayout4 == null) {
                ck.p.B("feedbackContainer");
                frameLayout4 = null;
            }
            frameLayout4.setVisibility(8);
        }
        ImageView imageView5 = this.f79672u;
        if (imageView5 == null) {
            ck.p.B("adFoxView");
            imageView5 = null;
        }
        addView(imageView5, new ViewGroup.LayoutParams(-1, -2));
        LinearLayout linearLayout29 = this.f79673v;
        if (linearLayout29 == null) {
            ck.p.B("mainContainer");
            linearLayout29 = null;
        }
        addView(linearLayout29, new ViewGroup.LayoutParams(-1, -1));
        FrameLayout frameLayout5 = this.f79674w;
        if (frameLayout5 == null) {
            ck.p.B("feedbackContainer");
            frameLayout5 = null;
        }
        addView(frameLayout5);
        hideContent();
        ImageView[] imageViewArr = new ImageView[5];
        imageViewArr[0] = getFaviconView();
        imageViewArr[1] = getIconView();
        imageViewArr[2] = this.f79664m;
        ImageView imageView6 = this.A;
        if (imageView6 == null) {
            ck.p.B("largeImageView");
            imageView6 = null;
        }
        imageViewArr[3] = imageView6;
        ImageView imageView7 = this.f79672u;
        if (imageView7 == null) {
            ck.p.B("adFoxView");
            imageView7 = null;
        }
        imageViewArr[4] = imageView7;
        this.H = new h02(imageViewArr);
        a();
    }

    /* JADX WARN: Code duplicated, block: B:99:0x028f  */
    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        a10 a10Var;
        a10 a10Var2;
        int iC;
        int iC2;
        int i12;
        y00 y00Var;
        a10 a10Var3;
        y00 y00Var2;
        a10 a10Var4;
        y00 y00Var3;
        a10 a10Var5;
        int size = View.MeasureSpec.getSize(i10);
        float borderWidth = this.f79658g.getBannerAppearance().getBorderWidth();
        og0 og0Var = this.f79652a;
        Context context = getContext();
        og0Var.getClass();
        int iA = size - (og0.a(context, borderWidth) * 2);
        if (iA < 0) {
            iA = 0;
        }
        q32 q32Var = this.G;
        LinearLayout linearLayout = null;
        if (q32Var != null) {
            c52 contentPadding = this.f79658g.getBannerAppearance().getContentPadding();
            if (contentPadding != null) {
                Context context2 = getContext();
                og0 og0Var2 = this.f79652a;
                float left = contentPadding.getLeft();
                og0Var2.getClass();
                int iA2 = og0.a(context2, left);
                og0 og0Var3 = this.f79652a;
                float right = contentPadding.getRight();
                og0Var3.getClass();
                int iC3 = ek.b.c(TypedValue.applyDimension(1, right, context2.getResources().getDisplayMetrics()));
                c52 imageMargins = this.f79658g.getBannerAppearance().getImageMargins();
                if (imageMargins != null) {
                    if (q32Var.a() || q32Var.b() || q32Var.c()) {
                        int iC4 = ek.b.c((iA - iA2) - iC3);
                        float left2 = imageMargins.getLeft();
                        og0 og0Var4 = this.f79652a;
                        Context context3 = getContext();
                        og0Var4.getClass();
                        int iA3 = og0.a(context3, left2);
                        this.f79652a.getClass();
                        int iC5 = ek.b.c(TypedValue.applyDimension(1, iA2, context2.getResources().getDisplayMetrics())) + iA3;
                        float right2 = imageMargins.getRight();
                        og0 og0Var5 = this.f79652a;
                        Context context4 = getContext();
                        og0Var5.getClass();
                        int iA4 = og0.a(context4, right2);
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
                        if (q32Var.a() && (y00Var3 = this.E) != null && (a10Var5 = y00Var3.f84767b) != null) {
                            int i13 = a10Var5.f75360c;
                            int i14 = a10Var5.f75361d;
                            h52 widthConstraint = this.f79658g.getFaviconAppearance().getWidthConstraint();
                            if (widthConstraint != null) {
                                o31 o31VarA = a(widthConstraint).a(getContext(), iC4, i13, i14);
                                og0 og0Var6 = this.f79652a;
                                Context context5 = getContext();
                                og0Var6.getClass();
                                int iA5 = og0.a(context5, 5.0f);
                                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(o31VarA.f80923a, o31VarA.f80924b);
                                layoutParams2.leftMargin = iC5;
                                layoutParams2.rightMargin = iA5;
                                layoutParams = layoutParams2;
                            }
                        }
                        getFaviconView().setLayoutParams(layoutParams);
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                        if (q32Var.b() && (y00Var2 = this.E) != null && (a10Var4 = y00Var2.f84768c) != null) {
                            layoutParams3 = new FrameLayout.LayoutParams(0, 0);
                            h52 widthConstraint2 = this.f79658g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint2 != null) {
                                o31 o31VarA2 = a(widthConstraint2).a(getContext(), iC4, a10Var4.f75360c, a10Var4.f75361d);
                                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(o31VarA2.f80923a, o31VarA2.f80924b);
                                layoutParams4.leftMargin = iC5;
                                layoutParams4.rightMargin = iA4;
                                layoutParams3 = layoutParams4;
                            }
                        }
                        getIconView().setLayoutParams(layoutParams3);
                        FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                        if (q32Var.c() && (y00Var = this.E) != null && (a10Var3 = y00Var.f84769d) != null) {
                            layoutParams5 = new FrameLayout.LayoutParams(0, 0);
                            h52 widthConstraint3 = this.f79658g.getImageAppearance().getWidthConstraint();
                            if (widthConstraint3 != null) {
                                o31 o31VarA3 = a(widthConstraint3).a(getContext(), iC4, a10Var3.f75360c, a10Var3.f75361d);
                                layoutParams5 = new FrameLayout.LayoutParams(o31VarA3.f80923a, o31VarA3.f80924b);
                                layoutParams5.leftMargin = iC5;
                                layoutParams5.rightMargin = iA4;
                            }
                        }
                        this.f79664m.setLayoutParams(layoutParams5);
                        LinearLayout linearLayout2 = this.f79676y;
                        if (linearLayout2 == null) {
                            ck.p.B("centerContainer");
                            linearLayout2 = null;
                        }
                        ViewGroup.LayoutParams layoutParams6 = linearLayout2.getLayoutParams();
                        ck.p.h(layoutParams6, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams7 = (LinearLayout.LayoutParams) layoutParams6;
                        layoutParams7.leftMargin = 0;
                        LinearLayout linearLayout3 = this.f79676y;
                        if (linearLayout3 == null) {
                            ck.p.B("centerContainer");
                            linearLayout3 = null;
                        }
                        linearLayout3.setLayoutParams(layoutParams7);
                    } else {
                        FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(0, 0);
                        getFaviconView().setLayoutParams(layoutParams8);
                        getIconView().setLayoutParams(layoutParams8);
                        this.f79664m.setLayoutParams(layoutParams8);
                        LinearLayout linearLayout4 = this.f79676y;
                        if (linearLayout4 == null) {
                            ck.p.B("centerContainer");
                            linearLayout4 = null;
                        }
                        ViewGroup.LayoutParams layoutParams9 = linearLayout4.getLayoutParams();
                        ck.p.h(layoutParams9, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                        LinearLayout.LayoutParams layoutParams10 = (LinearLayout.LayoutParams) layoutParams9;
                        layoutParams10.leftMargin = iA2;
                        LinearLayout linearLayout5 = this.f79676y;
                        if (linearLayout5 == null) {
                            ck.p.B("centerContainer");
                            linearLayout5 = null;
                        }
                        linearLayout5.setLayoutParams(layoutParams10);
                    }
                }
            }
            LinearLayout.LayoutParams layoutParams11 = new LinearLayout.LayoutParams(0, 0);
            y00 y00Var4 = q32Var.f81695a;
            if (y00Var4.f84766a == null && (a10Var = y00Var4.f84769d) != null && q32.a(a10Var)) {
                layoutParams11 = new LinearLayout.LayoutParams(0, 0);
                y00 y00Var5 = this.E;
                if (y00Var5 != null && (a10Var2 = y00Var5.f84769d) != null) {
                    int i15 = a10Var2.f75360c;
                    int iC6 = a10Var2.f75361d;
                    float f10 = i15;
                    float f11 = iC6;
                    if (f11 != 0.0f && f10 / f11 < 1.0f) {
                        iC = ek.b.c(iA * 0.75f);
                        iC2 = ek.b.c((iC / f11) * f10);
                    } else {
                        if (i15 != 0) {
                            iC6 = ek.b.c((iA / f10) * f11);
                        }
                        iC = iC6;
                        iC2 = iA;
                    }
                    float f12 = a10Var2.f75360c;
                    float f13 = a10Var2.f75361d;
                    if (f13 == 0.0f || f12 / f13 <= 1.5f) {
                        iC = ek.b.c(iC * 0.8f);
                    }
                    LinearLayout.LayoutParams layoutParams12 = new LinearLayout.LayoutParams(iC2, iC);
                    c42 c42Var = this.F;
                    if (c42Var == null || !c42Var.a()) {
                        c42 c42Var2 = this.F;
                        if (c42Var2 != null) {
                            y00 y00Var6 = c42Var2.f76156a;
                            if (y00Var6.f84771f != null || y00Var6.f84778m != null || c42Var2.a()) {
                                i12 = this.f79655d;
                            }
                        }
                        i12 = 0;
                    } else {
                        i12 = this.f79655d;
                    }
                    layoutParams12.topMargin = i12;
                    layoutParams12.gravity = 1;
                    layoutParams11 = layoutParams12;
                }
            }
            LinearLayout linearLayout6 = this.B;
            if (linearLayout6 == null) {
                ck.p.B("largeImageContainer");
                linearLayout6 = null;
            }
            linearLayout6.setLayoutParams(layoutParams11);
        }
        q32 q32Var2 = this.G;
        if (q32Var2 != null) {
            LinearLayout.LayoutParams layoutParams13 = new LinearLayout.LayoutParams(0, 0);
            y00 y00Var7 = this.E;
            h10 h10Var = y00Var7 != null ? y00Var7.f84766a : null;
            if (h10Var != null && q32Var2.f81695a.f84766a != null) {
                float f14 = h10Var.f78012a;
                if (f14 == 0.0f) {
                    f14 = 1.7777778f;
                }
                layoutParams13 = new LinearLayout.LayoutParams(iA, Math.round(iA / f14));
            }
            LinearLayout linearLayout7 = this.D;
            if (linearLayout7 == null) {
                ck.p.B("mediaContainer");
                linearLayout7 = null;
            }
            linearLayout7.setLayoutParams(layoutParams13);
        }
        c42 c42Var3 = this.F;
        if (c42Var3 == null || (c42Var3.f76156a.f84773h == null && !c42Var3.d())) {
            LinearLayout linearLayout8 = this.f79677z;
            if (linearLayout8 == null) {
                ck.p.B("callToActionContainer");
            } else {
                linearLayout = linearLayout8;
            }
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, 0));
        } else {
            c42 c42Var4 = this.F;
            if (c42Var4 == null || c42Var4.f76156a.f84773h == null || !(c42Var4.b() || c42Var4.c())) {
                LinearLayout linearLayout9 = this.f79677z;
                if (linearLayout9 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout9 = null;
                }
                ViewParent parent = linearLayout9.getParent();
                ck.p.h(parent, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager = (ViewManager) parent;
                LinearLayout linearLayout10 = this.f79677z;
                if (linearLayout10 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout10 = null;
                }
                viewManager.removeView(linearLayout10);
                LinearLayout linearLayout11 = this.f79677z;
                if (linearLayout11 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout11 = null;
                }
                linearLayout11.setPadding(0, 0, 0, 0);
                LinearLayout.LayoutParams layoutParams14 = new LinearLayout.LayoutParams(-1, -2);
                int i16 = this.f79656e;
                layoutParams14.topMargin = i16;
                layoutParams14.bottomMargin = i16;
                ViewParent parent2 = getDomainView().getParent();
                ck.p.h(parent2, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager2 = (ViewManager) parent2;
                LinearLayout linearLayout12 = this.f79677z;
                if (linearLayout12 == null) {
                    ck.p.B("callToActionContainer");
                } else {
                    linearLayout = linearLayout12;
                }
                viewManager2.addView(linearLayout, layoutParams14);
            } else {
                LinearLayout linearLayout13 = this.f79677z;
                if (linearLayout13 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout13 = null;
                }
                ViewParent parent3 = linearLayout13.getParent();
                ck.p.h(parent3, "null cannot be cast to non-null type android.view.ViewManager");
                ViewManager viewManager3 = (ViewManager) parent3;
                LinearLayout linearLayout14 = this.f79677z;
                if (linearLayout14 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout14 = null;
                }
                viewManager3.removeView(linearLayout14);
                LinearLayout.LayoutParams layoutParams15 = new LinearLayout.LayoutParams(-1, -2);
                c42 c42Var5 = this.F;
                if (c42Var5 == null || !c42Var5.c()) {
                    layoutParams15.topMargin = this.f79655d;
                } else {
                    layoutParams15.topMargin = this.f79657f;
                }
                layoutParams15.bottomMargin = this.f79656e;
                LinearLayout linearLayout15 = this.f79677z;
                if (linearLayout15 == null) {
                    ck.p.B("callToActionContainer");
                    linearLayout15 = null;
                }
                linearLayout15.setLayoutParams(layoutParams15);
                c52 contentPadding2 = this.f79658g.getBannerAppearance().getContentPadding();
                if (contentPadding2 != null) {
                    og0 og0Var7 = this.f79652a;
                    Context context6 = getContext();
                    float left3 = contentPadding2.getLeft();
                    og0Var7.getClass();
                    int iA6 = og0.a(context6, left3);
                    og0 og0Var8 = this.f79652a;
                    Context context7 = getContext();
                    float right3 = contentPadding2.getRight();
                    og0Var8.getClass();
                    int iA7 = og0.a(context7, right3);
                    LinearLayout linearLayout16 = this.f79677z;
                    if (linearLayout16 == null) {
                        ck.p.B("callToActionContainer");
                        linearLayout16 = null;
                    }
                    linearLayout16.setPadding(iA6, 0, iA7, 0);
                    LinearLayout linearLayout17 = this.f79673v;
                    if (linearLayout17 == null) {
                        ck.p.B("mainContainer");
                        linearLayout17 = null;
                    }
                    LinearLayout linearLayout18 = this.f79677z;
                    if (linearLayout18 == null) {
                        ck.p.B("callToActionContainer");
                        linearLayout18 = null;
                    }
                    LinearLayout linearLayout19 = this.f79673v;
                    if (linearLayout19 == null) {
                        ck.p.B("mainContainer");
                    } else {
                        linearLayout = linearLayout19;
                    }
                    linearLayout17.addView(linearLayout18, linearLayout.getChildCount() - 1);
                }
            }
            c42 c42Var6 = this.F;
            getCallToActionView().setLayoutParams((c42Var6 == null || !c42Var6.b()) ? new LinearLayout.LayoutParams(-2, -2) : new LinearLayout.LayoutParams(-1, -2));
        }
        int iC7 = ek.b.c(iA * 0.4f);
        getCallToActionView().setMinWidth(iC7);
        getCallToActionView().setMinimumWidth(iC7);
        c42 c42Var7 = this.F;
        if (c42Var7 != null && c42Var7.f76156a.f84780o != null) {
            TextView warningView = getWarningView();
            c42 c42Var8 = this.F;
            if (c42Var8 == null || !(c42Var8.b() || (c42Var8.c() && (!c42Var8.d())))) {
                warningView.setBackgroundColor(kl3.a(warningView.getCurrentTextColor(), 92.0f));
            } else {
                warningView.setBackgroundColor(0);
            }
            getWarningView().setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        super.onMeasure(i10, i11);
    }

    private final void b() {
        y00 y00Var = this.E;
        ju0 ju0Var = y00Var != null ? new ju0(getContext(), y00Var, new ku0(y00Var)) : null;
        if (ju0Var != null) {
            ImageView feedbackView = getFeedbackView();
            FrameLayout frameLayout = this.f79674w;
            if (frameLayout == null) {
                ck.p.B("feedbackContainer");
                frameLayout = null;
            }
            int i10 = this.f79657f;
            ku0 ku0Var = ju0Var.f79191c;
            if (ku0Var.f79570a.size() != 2 || !ku0Var.f79570a.contains("feedback") || !ku0Var.f79570a.contains(C3426d4.i.I0)) {
                int i11 = ju0.f79188f;
                Drawable drawable = ContextCompat.getDrawable(ju0Var.f79189a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_ATOP);
                if (drawable != null) {
                    drawable.setColorFilter(porterDuffColorFilter);
                }
                feedbackView.setImageDrawable(drawable);
                ju0.a(frameLayout, null, 0);
                frameLayout.setVisibility(0);
                return;
            }
            y00 y00Var2 = ju0Var.f79190b;
            if (y00Var2.f84766a != null) {
                int i12 = ju0.f79188f;
                Drawable drawable2 = ContextCompat.getDrawable(ju0Var.f79189a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter2 = new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_ATOP);
                if (drawable2 != null) {
                    drawable2.setColorFilter(porterDuffColorFilter2);
                }
                feedbackView.setImageDrawable(drawable2);
                ju0.a(frameLayout, null, 0);
                frameLayout.setVisibility(8);
                return;
            }
            if (y00Var2.f84769d != null) {
                Drawable drawable3 = ContextCompat.getDrawable(ju0Var.f79189a, R$drawable.monetization_ads_internal_ic_close_gray);
                PorterDuffColorFilter porterDuffColorFilter3 = new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_ATOP);
                if (drawable3 != null) {
                    drawable3.setColorFilter(porterDuffColorFilter3);
                }
                feedbackView.setImageDrawable(drawable3);
                ju0.a(frameLayout, new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ju0.f79186d, ju0.f79187e}), i10);
                frameLayout.setVisibility(0);
            }
        }
    }

    private final ImageView d() {
        ImageView imageView = new ImageView(getContext());
        imageView.setAdjustViewBounds(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        return imageView;
    }

    public final TextView getAgeView() {
        TextView textView = this.f79659h;
        if (textView != null) {
            return textView;
        }
        ck.p.B("ageView");
        return null;
    }

    public final TextView getBodyView() {
        TextView textView = this.f79660i;
        if (textView != null) {
            return textView;
        }
        ck.p.B("bodyView");
        return null;
    }

    public final Button getCallToActionView() {
        Button button = this.f79661j;
        if (button != null) {
            return button;
        }
        ck.p.B("callToActionView");
        return null;
    }

    public final TextView getDomainView() {
        TextView textView = this.f79662k;
        if (textView != null) {
            return textView;
        }
        ck.p.B("domainView");
        return null;
    }

    public final ImageView getFaviconView() {
        ImageView imageView = this.f79671t;
        if (imageView != null) {
            return imageView;
        }
        ck.p.B("faviconView");
        return null;
    }

    public final ImageView getFeedbackView() {
        ImageView imageView = this.f79663l;
        if (imageView != null) {
            return imageView;
        }
        ck.p.B("feedbackView");
        return null;
    }

    public final ImageView getIconView() {
        ImageView imageView = this.f79668q;
        if (imageView != null) {
            return imageView;
        }
        ck.p.B("iconView");
        return null;
    }

    public final ImageView getImageView() {
        y00 y00Var;
        a10 a10Var;
        ImageView imageView = this.f79664m;
        if (this.G == null || (y00Var = this.E) == null || (a10Var = y00Var.f84769d) == null) {
            return imageView;
        }
        if (ck.p.e(VastAttributes.FILL_COLOR, a10Var.f75359b)) {
            ImageView imageView2 = this.f79672u;
            if (imageView2 != null) {
                return imageView2;
            }
            ck.p.B("adFoxView");
        } else {
            if (!q32.a(a10Var)) {
                return imageView;
            }
            ImageView imageView3 = this.A;
            if (imageView3 != null) {
                return imageView3;
            }
            ck.p.B("largeImageView");
        }
        return null;
    }

    public final CustomizableMediaView getMediaView() {
        CustomizableMediaView customizableMediaView = this.C;
        if (customizableMediaView != null) {
            return customizableMediaView;
        }
        ck.p.B("mediaView");
        return null;
    }

    public final View getRatingView() {
        wl2 wl2Var = this.f79669r;
        if (wl2Var != null) {
            return wl2Var;
        }
        ck.p.B("_ratingView");
        return null;
    }

    public final TextView getReviewCountView() {
        TextView textView = this.f79670s;
        if (textView != null) {
            return textView;
        }
        ck.p.B("reviewCountView");
        return null;
    }

    public final TextView getSponsoredView() {
        a33 a33Var = this.f79665n;
        if (a33Var != null) {
            return a33Var;
        }
        ck.p.B("_sponsoredView");
        return null;
    }

    public final TextView getTitleView() {
        TextView textView = this.f79666o;
        if (textView != null) {
            return textView;
        }
        ck.p.B("titleView");
        return null;
    }

    public final TextView getWarningView() {
        TextView textView = this.f79667p;
        if (textView != null) {
            return textView;
        }
        ck.p.B("warningView");
        return null;
    }

    @VisibleForTesting
    public final void hideContent() {
        ImageView imageView = this.f79672u;
        LinearLayout linearLayout = null;
        if (imageView == null) {
            ck.p.B("adFoxView");
            imageView = null;
        }
        imageView.setVisibility(8);
        LinearLayout linearLayout2 = this.f79673v;
        if (linearLayout2 == null) {
            ck.p.B("mainContainer");
        } else {
            linearLayout = linearLayout2;
        }
        linearLayout.setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        w02 w02Var = this.I;
        if (w02Var != null) {
            w02Var.a(this.J);
        }
        super.onDetachedFromWindow();
    }

    public final void setAd(w02 w02Var) {
        w02 w02Var2 = this.I;
        if (w02Var2 != w02Var) {
            if (w02Var2 != null) {
                try {
                    w02Var2.a(this.J);
                } catch (j02 e10) {
                    boolean z10 = ad1.f75480a;
                    this.f79654c.reportError("Failed to set Native Ad", e10);
                    return;
                }
            }
            w02Var.b(this.J);
            cq2 adType = w02Var.getAdType();
            y00 adAssets = w02Var.getAdAssets();
            this.F = new c42(adAssets, adType);
            this.G = new q32(adAssets, adType);
            this.E = adAssets;
            b();
            this.f79653b.getClass();
            w02Var.a(m10.a(this));
            showContent();
            this.I = w02Var;
        }
    }

    @VisibleForTesting
    public final void showContent() {
        a10 a10Var;
        y00 y00Var = this.E;
        int i10 = 0;
        LinearLayout linearLayout = null;
        if (y00Var != null && (a10Var = y00Var.f84769d) != null) {
            if (this.G != null && ck.p.e(VastAttributes.FILL_COLOR, a10Var.f75359b)) {
                ImageView imageView = this.f79672u;
                if (imageView == null) {
                    ck.p.B("adFoxView");
                    imageView = null;
                }
                imageView.setVisibility(0);
                i10 = 8;
            }
            if (this.G != null && q32.a(a10Var)) {
                c42 c42Var = this.F;
                if (c42Var != null && !c42Var.a()) {
                    LinearLayout linearLayout2 = this.f79676y;
                    if (linearLayout2 == null) {
                        ck.p.B("centerContainer");
                        linearLayout2 = null;
                    }
                    linearLayout2.setVisibility(8);
                }
                c42 c42Var2 = this.F;
                if (c42Var2 != null) {
                    y00 y00Var2 = c42Var2.f76156a;
                    if (y00Var2.f84771f == null && y00Var2.f84778m == null && !c42Var2.a()) {
                        LinearLayout linearLayout3 = this.f79675x;
                        if (linearLayout3 == null) {
                            ck.p.B("topContainer");
                            linearLayout3 = null;
                        }
                        linearLayout3.setVisibility(8);
                    }
                }
            }
        }
        LinearLayout linearLayout4 = this.f79673v;
        if (linearLayout4 == null) {
            ck.p.B("mainContainer");
        } else {
            linearLayout = linearLayout4;
        }
        linearLayout.setVisibility(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        w02 w02Var = this.I;
        if (w02Var != null) {
            w02Var.b(this.J);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l10(Context context, AttributeSet attributeSet, int i10, NativeTemplateAppearance nativeTemplateAppearance, cq3 cq3Var) {
        this(context, attributeSet, i10, nativeTemplateAppearance, new og0(), new m10(), cf.a(context, cq3Var));
        pu3 pu3Var = pu3.f81606a;
    }

    private static p31 a(h52 h52Var) {
        f52 f52VarA = ((SizeConstraint.SizeConstraintType) h52Var.getSizeConstraintType()).a();
        int i10 = f52VarA == null ? -1 : j10.f78889a[f52VarA.ordinal()];
        if (i10 == 1) {
            return new l31(h52Var.getValue());
        }
        if (i10 == 2) {
            return new m31(h52Var.getValue());
        }
        if (i10 != 3) {
            return new n31(h52Var.getValue());
        }
        return new n31(h52Var.getValue());
    }
}
