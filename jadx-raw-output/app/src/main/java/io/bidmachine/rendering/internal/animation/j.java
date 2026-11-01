package io.bidmachine.rendering.internal.animation;

import android.content.Context;
import android.view.View;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.rendering.model.AdElementParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import io.bidmachine.rendering.model.ElementLayoutParams;
import io.bidmachine.rendering.model.SideType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdElementParams f60157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f60158b;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f60160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f60161c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ int[] f60162d;

        static {
            int[] iArr = new int[AnimationEventType.values().length];
            try {
                iArr[AnimationEventType.Appear.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationEventType.Disappear.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f60159a = iArr;
            int[] iArr2 = new int[AnimationStyleType.values().length];
            try {
                iArr2[AnimationStyleType.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimationStyleType.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f60160b = iArr2;
            int[] iArr3 = new int[SideType.values().length];
            try {
                iArr3[SideType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[SideType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[SideType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[SideType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f60161c = iArr3;
            int[] iArr4 = new int[AnimationDirectionType.values().length];
            try {
                iArr4[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[AnimationDirectionType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[AnimationDirectionType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            f60162d = iArr4;
        }
    }

    public j(AdElementParams adElementParams, boolean z10) {
        p.j(adElementParams, "params");
        this.f60157a = adElementParams;
        this.f60158b = z10;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    private final e a(View view, ElementLayoutParams elementLayoutParams, AnimationDirectionType animationDirectionType) {
        float translationX;
        int i10;
        float translationY;
        Context context = view.getContext();
        p.i(context, GAMConfig.KEY_CONTEXT);
        float marginLeftPx = elementLayoutParams.getMarginLeftPx(context);
        float marginRightPx = elementLayoutParams.getMarginRightPx(context);
        float marginTopPx = elementLayoutParams.getMarginTopPx(context);
        float marginBottomPx = elementLayoutParams.getMarginBottomPx(context);
        float widthPx = elementLayoutParams.getWidthPx(context);
        float heightPx = elementLayoutParams.getHeightPx(context);
        int[] iArr = a.f60162d;
        int i11 = iArr[animationDirectionType.ordinal()];
        if (i11 == 1) {
            SideType sideTypeA = g.a(elementLayoutParams);
            int i12 = sideTypeA == null ? -1 : a.f60161c[sideTypeA.ordinal()];
            if (i12 == 1) {
                translationX = (-widthPx) - marginRightPx;
            } else if (i12 != 2) {
                translationX = view.getTranslationX();
            } else {
                translationX = widthPx - marginRightPx;
            }
        } else if (i11 == 2) {
            SideType sideTypeA2 = g.a(elementLayoutParams);
            int i13 = sideTypeA2 == null ? -1 : a.f60161c[sideTypeA2.ordinal()];
            if (i13 == 1) {
                translationX = (-widthPx) - marginLeftPx;
            } else if (i13 != 2) {
                translationX = view.getTranslationX();
            } else {
                translationX = widthPx - marginLeftPx;
            }
        } else {
            translationX = view.getTranslationX();
        }
        int i14 = iArr[animationDirectionType.ordinal()];
        if (i14 == 3) {
            SideType sideTypeB = g.b(elementLayoutParams);
            i10 = sideTypeB != null ? a.f60161c[sideTypeB.ordinal()] : -1;
            if (i10 == 3 || i10 == 4) {
                translationY = heightPx - marginBottomPx;
            } else {
                translationY = view.getTranslationY();
            }
        } else if (i14 == 4) {
            SideType sideTypeB2 = g.b(elementLayoutParams);
            i10 = sideTypeB2 != null ? a.f60161c[sideTypeB2.ordinal()] : -1;
            if (i10 == 3 || i10 == 4) {
                translationY = (-heightPx) - marginTopPx;
            } else {
                translationY = view.getTranslationY();
            }
        } else {
            translationY = view.getTranslationY();
        }
        return new e(view.getAlpha(), translationX, translationY);
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e b(View view, AnimationEventType animationEventType) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        int i10 = a.f60159a[animationEventType.ordinal()];
        if (i10 == 1) {
            AnimationParams animationParams = this.f60157a.getAnimationParams().get(animationEventType);
            return a(view, this.f60157a.getElementLayoutParams(), animationParams != null ? animationParams.getStyle() : null, animationParams != null ? animationParams.getDirectionOrDefault() : null);
        }
        if (i10 == 2) {
            return a(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e a(View view, ElementLayoutParams elementLayoutParams, AnimationStyleType animationStyleType, AnimationDirectionType animationDirectionType) {
        e eVarA;
        int i10 = animationStyleType == null ? -1 : a.f60160b[animationStyleType.ordinal()];
        if (i10 != 1) {
            return (i10 != 2 || animationDirectionType == null || (eVarA = a(view, elementLayoutParams, animationDirectionType)) == null) ? a(view) : eVarA;
        }
        return new e(0.0f, view.getTranslationX(), view.getTranslationY());
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e a(View view, AnimationEventType animationEventType) {
        AnimationDirectionType directionOrDefault;
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        ElementLayoutParams elementLayoutParams = this.f60157a.getElementLayoutParams();
        int i10 = a.f60159a[animationEventType.ordinal()];
        if (i10 == 1) {
            Float f10 = this.f60157a.getAppearanceParams().getIo.bidmachine.iab.vast.tags.VastAttributes.OPACITY java.lang.String();
            float fFloatValue = f10 != null ? f10.floatValue() : 1.0f;
            Context context = view.getContext();
            p.i(context, GAMConfig.KEY_CONTEXT);
            return new e(fFloatValue, elementLayoutParams.getTranslationXPx(context), elementLayoutParams.getTranslationYPx(context));
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AnimationParams animationParams = this.f60157a.getAnimationParams().get(animationEventType);
        AnimationDirectionType animationDirectionTypeInverted = null;
        AnimationStyleType style = animationParams != null ? animationParams.getStyle() : null;
        if (animationParams != null && (directionOrDefault = animationParams.getDirectionOrDefault()) != null) {
            animationDirectionTypeInverted = directionOrDefault.inverted();
        }
        return a(view, elementLayoutParams, style, animationDirectionTypeInverted);
    }

    private final e a(View view) {
        return new e(this.f60158b ? 0.0f : view.getAlpha(), view.getTranslationX(), view.getTranslationY());
    }
}
