package com.yandex.div.core.view2;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.transition.ChangeBounds;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import com.yandex.div.core.util.DivUtilKt;
import com.yandex.div.core.view2.animations.Fade;
import com.yandex.div.core.view2.animations.Scale;
import com.yandex.div.core.view2.animations.Slide;
import com.yandex.div.core.view2.animations.TransitionsKt;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAppearanceTransition;
import com.yandex.div2.DivChangeTransition;
import com.yandex.div2.DivDimension;
import com.yandex.div2.DivSlideTransition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kk.i;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivTransitionBuilder.kt */
/* JADX INFO: loaded from: classes10.dex */
public class DivTransitionBuilder {
    private final Context context;
    private final DivViewIdProvider viewIdProvider;

    /* JADX INFO: compiled from: DivTransitionBuilder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivSlideTransition.Edge.values().length];
            try {
                iArr[DivSlideTransition.Edge.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivSlideTransition.Edge.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivSlideTransition.Edge.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivSlideTransition.Edge.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private Transition toAndroidTransition(DivAppearanceTransition divAppearanceTransition, int i10, ExpressionResolver expressionResolver) {
        if (divAppearanceTransition instanceof DivAppearanceTransition.d) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator<T> it = ((DivAppearanceTransition.d) divAppearanceTransition).c().f46485a.iterator();
            while (it.hasNext()) {
                Transition androidTransition = toAndroidTransition((DivAppearanceTransition) it.next(), i10, expressionResolver);
                transitionSet.setDuration(Math.max(transitionSet.getDuration(), androidTransition.getStartDelay() + androidTransition.getDuration()));
                transitionSet.addTransition(androidTransition);
            }
            return transitionSet;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.b) {
            DivAppearanceTransition.b bVar = (DivAppearanceTransition.b) divAppearanceTransition;
            Fade fade = new Fade((float) bVar.c().f47108a.evaluate(expressionResolver).doubleValue());
            fade.setMode(i10);
            fade.setDuration(bVar.c().b().evaluate(expressionResolver).longValue());
            fade.setStartDelay(bVar.c().d().evaluate(expressionResolver).longValue());
            fade.setInterpolator(DivUtilKt.getAndroidInterpolator(bVar.c().c().evaluate(expressionResolver)));
            return fade;
        }
        if (divAppearanceTransition instanceof DivAppearanceTransition.c) {
            DivAppearanceTransition.c cVar = (DivAppearanceTransition.c) divAppearanceTransition;
            Scale scale = new Scale((float) cVar.c().f48543e.evaluate(expressionResolver).doubleValue(), (float) cVar.c().f48541c.evaluate(expressionResolver).doubleValue(), (float) cVar.c().f48542d.evaluate(expressionResolver).doubleValue());
            scale.setMode(i10);
            scale.setDuration(cVar.c().b().evaluate(expressionResolver).longValue());
            scale.setStartDelay(cVar.c().d().evaluate(expressionResolver).longValue());
            scale.setInterpolator(DivUtilKt.getAndroidInterpolator(cVar.c().c().evaluate(expressionResolver)));
            return scale;
        }
        if (!(divAppearanceTransition instanceof DivAppearanceTransition.e)) {
            throw new NoWhenBranchMatchedException();
        }
        DivAppearanceTransition.e eVar = (DivAppearanceTransition.e) divAppearanceTransition;
        DivDimension divDimension = eVar.c().f48837a;
        Slide slide = new Slide(divDimension != null ? BaseDivViewExtensionsKt.toPx(divDimension, getDisplayMetrics(), expressionResolver) : -1, toGravity(eVar.c().f48839c.evaluate(expressionResolver)));
        slide.setMode(i10);
        slide.setDuration(eVar.c().b().evaluate(expressionResolver).longValue());
        slide.setStartDelay(eVar.c().d().evaluate(expressionResolver).longValue());
        slide.setInterpolator(DivUtilKt.getAndroidInterpolator(eVar.c().c().evaluate(expressionResolver)));
        return slide;
    }

    private List<Transition> buildChangeTransitions(i<DivItemBuilderResult> iVar, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : iVar) {
            String id2 = divItemBuilderResult.getDiv().b().getId();
            DivChangeTransition divChangeTransitionJ = divItemBuilderResult.getDiv().b().j();
            if (id2 != null && divChangeTransitionJ != null) {
                Transition androidTransition = toAndroidTransition(divChangeTransitionJ, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildIncomingTransitions(i<DivItemBuilderResult> iVar, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : iVar) {
            String id2 = divItemBuilderResult.getDiv().b().getId();
            DivAppearanceTransition divAppearanceTransitionX = divItemBuilderResult.getDiv().b().x();
            if (id2 != null && divAppearanceTransitionX != null) {
                Transition androidTransition = toAndroidTransition(divAppearanceTransitionX, 1, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private List<Transition> buildOutgoingTransitions(i<DivItemBuilderResult> iVar, ExpressionResolver expressionResolver) {
        ArrayList arrayList = new ArrayList();
        for (DivItemBuilderResult divItemBuilderResult : iVar) {
            String id2 = divItemBuilderResult.getDiv().b().getId();
            DivAppearanceTransition divAppearanceTransitionI = divItemBuilderResult.getDiv().b().i();
            if (id2 != null && divAppearanceTransitionI != null) {
                Transition androidTransition = toAndroidTransition(divAppearanceTransitionI, 2, expressionResolver);
                androidTransition.addTarget(this.viewIdProvider.getViewId(id2));
                arrayList.add(androidTransition);
            }
        }
        return arrayList;
    }

    private DisplayMetrics getDisplayMetrics() {
        return this.context.getResources().getDisplayMetrics();
    }

    private int toGravity(DivSlideTransition.Edge edge) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[edge.ordinal()];
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 48;
        }
        if (i10 == 3) {
            return 5;
        }
        if (i10 == 4) {
            return 80;
        }
        throw new NoWhenBranchMatchedException();
    }

    public TransitionSet buildTransitions(i<DivItemBuilderResult> iVar, i<DivItemBuilderResult> iVar2, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.setOrdering(0);
        if (iVar != null) {
            TransitionsKt.plusAssign(transitionSet, buildOutgoingTransitions(iVar, expressionResolver));
        }
        if (iVar != null && iVar2 != null) {
            TransitionsKt.plusAssign(transitionSet, buildChangeTransitions(iVar, expressionResolver));
        }
        if (iVar2 != null) {
            TransitionsKt.plusAssign(transitionSet, buildIncomingTransitions(iVar2, expressionResolver2));
        }
        return transitionSet;
    }

    public Transition createAndroidTransition(DivAppearanceTransition divAppearanceTransition, int i10, ExpressionResolver expressionResolver) {
        if (divAppearanceTransition == null) {
            return null;
        }
        return toAndroidTransition(divAppearanceTransition, i10, expressionResolver);
    }

    public DivTransitionBuilder(Context context, DivViewIdProvider divViewIdProvider) {
        this.context = context;
        this.viewIdProvider = divViewIdProvider;
    }

    private Transition toAndroidTransition(DivChangeTransition divChangeTransition, ExpressionResolver expressionResolver) {
        if (divChangeTransition instanceof DivChangeTransition.c) {
            TransitionSet transitionSet = new TransitionSet();
            Iterator<T> it = ((DivChangeTransition.c) divChangeTransition).c().f46580a.iterator();
            while (it.hasNext()) {
                transitionSet.addTransition(toAndroidTransition((DivChangeTransition) it.next(), expressionResolver));
            }
            return transitionSet;
        }
        if (divChangeTransition instanceof DivChangeTransition.a) {
            ChangeBounds changeBounds = new ChangeBounds();
            DivChangeTransition.a aVar = (DivChangeTransition.a) divChangeTransition;
            changeBounds.setDuration(aVar.c().b().evaluate(expressionResolver).longValue());
            changeBounds.setStartDelay(aVar.c().d().evaluate(expressionResolver).longValue());
            changeBounds.setInterpolator(DivUtilKt.getAndroidInterpolator(aVar.c().c().evaluate(expressionResolver)));
            return changeBounds;
        }
        throw new NoWhenBranchMatchedException();
    }
}
