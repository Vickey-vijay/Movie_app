package io.bidmachine.rendering.internal.animation;

import android.view.View;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.model.AdPhaseParams;
import io.bidmachine.rendering.model.AnimationDirectionType;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationParams;
import io.bidmachine.rendering.model.AnimationStyleType;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AdPhaseParams f60163a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60164a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f60165b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f60166c;

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
            f60164a = iArr;
            int[] iArr2 = new int[AnimationStyleType.values().length];
            try {
                iArr2[AnimationStyleType.Fade.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[AnimationStyleType.Slide.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f60165b = iArr2;
            int[] iArr3 = new int[AnimationDirectionType.values().length];
            try {
                iArr3[AnimationDirectionType.Left.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr3[AnimationDirectionType.Right.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[AnimationDirectionType.Top.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[AnimationDirectionType.Bottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            f60166c = iArr3;
        }
    }

    public k(AdPhaseParams adPhaseParams) {
        p.j(adPhaseParams, "params");
        this.f60163a = adPhaseParams;
    }

    private final e a(View view, AnimationDirectionType animationDirectionType) {
        float measuredWidth = view.getMeasuredWidth();
        int[] iArr = a.f60166c;
        int i10 = iArr[animationDirectionType.ordinal()];
        if (i10 != 1) {
            measuredWidth = i10 != 2 ? view.getTranslationX() : -measuredWidth;
        }
        float measuredHeight = view.getMeasuredHeight();
        int i11 = iArr[animationDirectionType.ordinal()];
        if (i11 != 3) {
            measuredHeight = i11 != 4 ? view.getTranslationY() : -measuredHeight;
        }
        return new e(view.getAlpha(), measuredWidth, measuredHeight);
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e b(View view, AnimationEventType animationEventType) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        int i10 = a.f60164a[animationEventType.ordinal()];
        if (i10 == 1) {
            AnimationParams animationParams = this.f60163a.getAnimationParams().get(animationEventType);
            return a(view, animationParams != null ? animationParams.getStyle() : null, animationParams != null ? animationParams.getDirectionOrDefault() : null);
        }
        if (i10 == 2) {
            return new e(view);
        }
        throw new NoWhenBranchMatchedException();
    }

    private final e a(View view, AnimationStyleType animationStyleType, AnimationDirectionType animationDirectionType) {
        e eVarA;
        int i10 = animationStyleType == null ? -1 : a.f60165b[animationStyleType.ordinal()];
        if (i10 == 1) {
            return new e(0.0f, view.getTranslationX(), view.getTranslationY());
        }
        if (i10 != 2) {
            return new e(view);
        }
        return (animationDirectionType == null || (eVarA = a(view, animationDirectionType)) == null) ? new e(view) : eVarA;
    }

    @Override // io.bidmachine.rendering.internal.animation.f
    public e a(View view, AnimationEventType animationEventType) {
        AnimationDirectionType directionOrDefault;
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        int i10 = a.f60164a[animationEventType.ordinal()];
        if (i10 == 1) {
            return new e(1.0f, 0.0f, 0.0f);
        }
        if (i10 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        AnimationParams animationParams = this.f60163a.getAnimationParams().get(animationEventType);
        AnimationDirectionType animationDirectionTypeInverted = null;
        AnimationStyleType style = animationParams != null ? animationParams.getStyle() : null;
        if (animationParams != null && (directionOrDefault = animationParams.getDirectionOrDefault()) != null) {
            animationDirectionTypeInverted = directionOrDefault.inverted();
        }
        return a(view, style, animationDirectionTypeInverted);
    }
}
