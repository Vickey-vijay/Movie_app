package com.yandex.div.core.view2.animations;

import android.animation.Animator;
import android.view.View;
import ck.p;
import com.yandex.div.core.actions.DivActionTypedUtilsKt;
import com.yandex.div.core.animation.DivVariableAnimatorBuilder;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import com.yandex.div2.DivActionAnimatorStart;
import com.yandex.div2.DivAnimator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import mj.h;
import nj.b0;
import oe.e2;

/* JADX INFO: compiled from: DivAnimatorController.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivAnimatorController {
    private final Div2View divView;
    private final Map<Pair<String, String>, Animator> runningAnimators = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    private final DivAnimator findAnimator(View view, String str) {
        e2 e2VarB;
        if (view instanceof DivHolderView) {
            Div div = ((DivHolderView) view).getDiv();
            DivAnimator divAnimatorFindAnimator = findAnimator((div == null || (e2VarB = div.b()) == null) ? null : e2VarB.y(), str);
            if (divAnimatorFindAnimator != null) {
                return divAnimatorFindAnimator;
            }
            Object parent = view.getParent();
            View view2 = parent instanceof View ? (View) parent : null;
            if (view2 != null) {
                return findAnimator(view2, str);
            }
            return null;
        }
        if (!(view instanceof Div2View)) {
            Object parent2 = view.getParent();
            View view3 = parent2 instanceof View ? (View) parent2 : null;
            if (view3 != null) {
                return findAnimator(view3, str);
            }
            return null;
        }
        DivActionTypedUtilsKt.logWarning(this.divView, new RuntimeException("Unable to find animator with id '" + str + '\''));
        return null;
    }

    public final void onDetachedFromWindow() {
        Iterator it = new ArrayList(this.runningAnimators.values()).iterator();
        while (it.hasNext()) {
            ((Animator) it.next()).cancel();
        }
        this.runningAnimators.clear();
    }

    public final void startAnimator(String str, View view, DivActionAnimatorStart divActionAnimatorStart, ExpressionResolver expressionResolver) {
        Animator animatorRemove;
        String str2 = divActionAnimatorStart.f46051a;
        DivAnimator divAnimatorFindAnimator = findAnimator(view, str2);
        if (divAnimatorFindAnimator == null) {
            return;
        }
        final Pair<String, String> pairA = h.a(str, str2);
        if (this.runningAnimators.containsKey(pairA) && (animatorRemove = this.runningAnimators.remove(pairA)) != null) {
            animatorRemove.cancel();
        }
        Animator animatorBuild = DivVariableAnimatorBuilder.INSTANCE.build(this.divView, divAnimatorFindAnimator, divActionAnimatorStart, expressionResolver);
        if (animatorBuild == null) {
            return;
        }
        animatorBuild.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                this.this$0.runningAnimators.remove(pairA);
            }
        });
        animatorBuild.addListener(new Animator.AnimatorListener() { // from class: com.yandex.div.core.view2.animations.DivAnimatorController$startAnimator$$inlined$doOnCancel$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                this.this$0.runningAnimators.remove(pairA);
            }
        });
        this.runningAnimators.put(pairA, animatorBuild);
        animatorBuild.start();
    }

    public final void stopAnimator(String str, String str2) {
        Animator animatorRemove = this.runningAnimators.remove(h.a(str, str2));
        if (animatorRemove == null) {
            return;
        }
        animatorRemove.cancel();
    }

    public DivAnimatorController(Div2View div2View) {
        this.divView = div2View;
    }

    private final DivAnimator findAnimator(List<? extends DivAnimator> list, String str) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (p.e(((DivAnimator) obj).b().getId(), str)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty() && arrayList.size() <= 1) {
            return (DivAnimator) b0.f0(arrayList);
        }
        return null;
    }
}
