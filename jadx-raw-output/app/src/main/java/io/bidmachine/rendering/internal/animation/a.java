package io.bidmachine.rendering.internal.animation;

import android.view.View;
import android.view.ViewPropertyAnimator;
import ck.p;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.rendering.internal.o;
import io.bidmachine.rendering.model.AnimationEventType;
import io.bidmachine.util.Tag;
import io.bidmachine.util.ViewUtilsKt;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Tag f60071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final h f60072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f60073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ViewPropertyAnimator f60074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f60075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f60076f;

    public a(Tag tag, h hVar, f fVar) {
        p.j(tag, "tag");
        p.j(hVar, "animatorFactory");
        p.j(fVar, "valuesCalculator");
        this.f60071a = tag;
        this.f60072b = hVar;
        this.f60073c = fVar;
        this.f60075e = new AtomicBoolean(false);
        AnimationEventType animationEventType = AnimationEventType.Appear;
        Boolean bool = Boolean.FALSE;
        this.f60076f = kotlin.collections.a.o(mj.h.a(animationEventType, bool), mj.h.a(AnimationEventType.Disappear, bool));
    }

    private final void a(View view, e eVar) {
        view.setAlpha(eVar.a());
        view.setTranslationX(eVar.b());
        view.setTranslationY(eVar.c());
    }

    public final boolean b() {
        return this.f60075e.get();
    }

    public final void a() {
        o.b(this.f60071a, "Cancel animation", new Object[0]);
        this.f60075e.set(false);
        ViewPropertyAnimator viewPropertyAnimator = this.f60074d;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
            viewPropertyAnimator.setListener(null);
            viewPropertyAnimator.setUpdateListener(null);
        }
        this.f60074d = null;
    }

    public final void a(View view, AnimationEventType animationEventType) {
        p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
        p.j(animationEventType, "eventType");
        e eVarB = this.f60073c.b(view, animationEventType);
        a(view, eVarB);
        o.b(this.f60071a, "Prepare animation for event: " + animationEventType + "; initial values: " + eVarB, new Object[0]);
    }

    public final void a(View view, AnimationEventType animationEventType, Runnable runnable, final Runnable runnable2) {
        p.j(animationEventType, "eventType");
        o.b(this.f60071a, "Starting animation for event: " + animationEventType, new Object[0]);
        if (runnable != null) {
            runnable.run();
        }
        if (view == null || !ViewUtilsKt.isViewVisible(view) || b()) {
            o.b(this.f60071a, "Animation not started for event: " + animationEventType + "; isAnimating: " + b(), new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        e eVarA = this.f60073c.a(view, animationEventType);
        ViewPropertyAnimator viewPropertyAnimatorA = this.f60072b.a(view, animationEventType, eVarA);
        if (viewPropertyAnimatorA == null) {
            a(view, eVarA);
            o.b(this.f60071a, "Apply values without animation for event: " + animationEventType + "; target values: " + eVarA, new Object[0]);
            if (runnable2 != null) {
                runnable2.run();
                return;
            }
            return;
        }
        o.b(this.f60071a, "Start animation for event: " + animationEventType + "; target values: " + eVarA, new Object[0]);
        ViewPropertyAnimator viewPropertyAnimatorWithEndAction = viewPropertyAnimatorA.withStartAction(new Runnable() { // from class: yh.a
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.rendering.internal.animation.a.a(this.f85747b);
            }
        }).withEndAction(new Runnable() { // from class: yh.b
            @Override // java.lang.Runnable
            public final void run() {
                io.bidmachine.rendering.internal.animation.a.a(this.f85748b, runnable2);
            }
        });
        viewPropertyAnimatorWithEndAction.start();
        this.f60074d = viewPropertyAnimatorWithEndAction;
        this.f60076f.put(animationEventType, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar) {
        p.j(aVar, "this$0");
        aVar.f60075e.set(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(a aVar, Runnable runnable) {
        p.j(aVar, "this$0");
        aVar.f60075e.set(false);
        if (runnable != null) {
            runnable.run();
        }
    }
}
