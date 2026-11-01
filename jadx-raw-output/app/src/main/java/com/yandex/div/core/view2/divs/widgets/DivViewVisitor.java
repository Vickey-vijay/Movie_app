package com.yandex.div.core.view2.divs.widgets;

import android.view.View;

/* JADX INFO: compiled from: DivViewVisitor.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class DivViewVisitor {
    public void defaultVisit(DivHolderView<?> divHolderView) {
    }

    public void visit(View view) {
    }

    public void visit(DivWrapLayout divWrapLayout) {
        defaultVisit(divWrapLayout);
    }

    public void visit(DivFrameLayout divFrameLayout) {
        defaultVisit(divFrameLayout);
    }

    public void visit(DivGifImageView divGifImageView) {
        defaultVisit(divGifImageView);
    }

    public void visit(DivGridLayout divGridLayout) {
        defaultVisit(divGridLayout);
    }

    public void visit(DivImageView divImageView) {
        defaultVisit(divImageView);
    }

    public void visit(DivLinearLayout divLinearLayout) {
        defaultVisit(divLinearLayout);
    }

    public void visit(DivLineHeightTextView divLineHeightTextView) {
        defaultVisit(divLineHeightTextView);
    }

    public void visit(DivPagerIndicatorView divPagerIndicatorView) {
        defaultVisit(divPagerIndicatorView);
    }

    public void visit(DivPagerView divPagerView) {
        defaultVisit(divPagerView);
    }

    public void visit(DivRecyclerView divRecyclerView) {
        defaultVisit(divRecyclerView);
    }

    public void visit(DivSeparatorView divSeparatorView) {
        defaultVisit(divSeparatorView);
    }

    public void visit(DivStateLayout divStateLayout) {
        defaultVisit(divStateLayout);
    }

    public void visit(DivTabsLayout divTabsLayout) {
        defaultVisit(divTabsLayout);
    }

    public void visit(DivSliderView divSliderView) {
        defaultVisit(divSliderView);
    }

    public void visit(DivSelectView divSelectView) {
        defaultVisit(divSelectView);
    }

    public void visit(DivVideoView divVideoView) {
        defaultVisit(divVideoView);
    }

    public void visit(DivCustomWrapper divCustomWrapper) {
        defaultVisit(divCustomWrapper);
    }

    public void visit(DivSwitchView divSwitchView) {
        defaultVisit(divSwitchView);
    }
}
