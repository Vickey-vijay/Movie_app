package io.bidmachine.rendering.internal.animation;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.animation.h;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.rendering.model.AnimationFunctionType;
import io.bidmachine.rendering.model.AnimationParams;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f60085a;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f60086a;

        static {
            int[] iArr = new int[AnimationFunctionType.values().length];
            try {
                iArr[AnimationFunctionType.EaseIn.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnimationFunctionType.EaseOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnimationFunctionType.EaseInOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f60086a = iArr;
        }
    }

    public h(Map map) {
        p.j(map, "params");
        this.f60085a = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
    }

    public final ViewPropertyAnimator a(View view, AnimationEventType animationEventType, e eVar) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        p.j(eVar, "targetValues");
        AnimationParams animationParams = (AnimationParams) this.f60085a.get(animationEventType);
        if (animationParams == null) {
            return null;
        }
        ViewPropertyAnimator viewPropertyAnimatorWithStartAction = view.animate().alpha(eVar.a()).translationX(eVar.b()).translationY(eVar.c()).setDuration(animationParams.getDuration()).withStartAction(new Runnable() { // from class: yh.c
            @Override // java.lang.Runnable
            public final void run() {
                h.a();
            }
        });
        viewPropertyAnimatorWithStartAction.setInterpolator(a(animationParams.getFunction()));
        return viewPropertyAnimatorWithStartAction;
    }

    private final TimeInterpolator a(AnimationFunctionType animationFunctionType) {
        int i10 = animationFunctionType == null ? -1 : a.f60086a[animationFunctionType.ordinal()];
        if (i10 == 1) {
            return new AccelerateInterpolator();
        }
        if (i10 != 2) {
            return i10 != 3 ? new LinearInterpolator() : new AccelerateDecelerateInterpolator();
        }
        return new DecelerateInterpolator();
    }
}
