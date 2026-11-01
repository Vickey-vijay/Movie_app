package com.yandex.div.core.dagger;

import com.yandex.div.core.expression.local.DivRuntimeVisitor;
import com.yandex.div.core.tooltip.DivTooltipController;
import com.yandex.div.core.view.DrawingPassOverrideStrategy;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivTransitionBuilder;
import com.yandex.div.core.view2.DivViewIdProvider;
import com.yandex.div.core.view2.ViewBindingProvider;
import com.yandex.div.core.view2.animations.DivAnimatorController;
import com.yandex.div.core.view2.divs.widgets.MediaReleaseViewVisitor;
import com.yandex.div.core.view2.divs.widgets.ReleaseViewVisitor;
import com.yandex.div.core.view2.errors.ErrorCollectors;
import com.yandex.div.core.view2.errors.ErrorVisualMonitor;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import com.yandex.div.core.view2.state.DivStateSwitcher;
import com.yandex.div.core.view2.state.DivStateTransitionHolder;

/* JADX INFO: compiled from: Div2ViewComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface Div2ViewComponent {

    /* JADX INFO: compiled from: Div2ViewComponent.kt */
    public interface Builder {
        Div2ViewComponent build();

        Builder divView(Div2View div2View);
    }

    DivAnimatorController getAnimatorController();

    ViewBindingProvider getBindingProvider();

    DivTooltipController getDivTooltipController();

    DrawingPassOverrideStrategy getDrawingPassOverrideStrategy();

    ErrorCollectors getErrorCollectors();

    ErrorVisualMonitor getErrorMonitor();

    InputFocusTracker getInputFocusTracker();

    MediaReleaseViewVisitor getMediaReleaseViewVisitor();

    ReleaseViewVisitor getReleaseViewVisitor();

    DivRuntimeVisitor getRuntimeVisitor();

    DivStateSwitcher getStateSwitcher();

    DivStateTransitionHolder getStateTransitionHolder();

    DivTransitionBuilder getTransitionBuilder();

    DivViewIdProvider getViewIdProvider();
}
