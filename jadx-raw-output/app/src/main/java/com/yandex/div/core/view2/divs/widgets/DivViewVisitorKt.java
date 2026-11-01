package com.yandex.div.core.view2.divs.widgets;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.ViewGroupKt;
import java.util.Iterator;

/* JADX INFO: compiled from: DivViewVisitor.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class DivViewVisitorKt {
    public static final void visitViewTree(DivViewVisitor divViewVisitor, View view) {
        if (view instanceof DivWrapLayout) {
            Iterator<View> it = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it.hasNext()) {
                visitViewTree(divViewVisitor, it.next());
            }
            divViewVisitor.visit((DivWrapLayout) view);
            return;
        }
        if (view instanceof DivFrameLayout) {
            Iterator<View> it2 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it2.hasNext()) {
                visitViewTree(divViewVisitor, it2.next());
            }
            divViewVisitor.visit((DivFrameLayout) view);
            return;
        }
        if (view instanceof DivGridLayout) {
            Iterator<View> it3 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it3.hasNext()) {
                visitViewTree(divViewVisitor, it3.next());
            }
            divViewVisitor.visit((DivGridLayout) view);
            return;
        }
        if (view instanceof DivLinearLayout) {
            Iterator<View> it4 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it4.hasNext()) {
                visitViewTree(divViewVisitor, it4.next());
            }
            divViewVisitor.visit((DivLinearLayout) view);
            return;
        }
        if (view instanceof DivPagerView) {
            Iterator<View> it5 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it5.hasNext()) {
                visitViewTree(divViewVisitor, it5.next());
            }
            divViewVisitor.visit((DivPagerView) view);
            return;
        }
        if (view instanceof DivRecyclerView) {
            Iterator<View> it6 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it6.hasNext()) {
                visitViewTree(divViewVisitor, it6.next());
            }
            divViewVisitor.visit((DivRecyclerView) view);
            return;
        }
        if (view instanceof DivStateLayout) {
            Iterator<View> it7 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it7.hasNext()) {
                visitViewTree(divViewVisitor, it7.next());
            }
            divViewVisitor.visit((DivStateLayout) view);
            return;
        }
        if (view instanceof DivTabsLayout) {
            Iterator<View> it8 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it8.hasNext()) {
                visitViewTree(divViewVisitor, it8.next());
            }
            divViewVisitor.visit((DivTabsLayout) view);
            return;
        }
        if (view instanceof DivCustomWrapper) {
            Iterator<View> it9 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it9.hasNext()) {
                visitViewTree(divViewVisitor, it9.next());
            }
            divViewVisitor.visit((DivCustomWrapper) view);
            return;
        }
        if (view instanceof DivSeparatorView) {
            divViewVisitor.visit((DivSeparatorView) view);
            return;
        }
        if (view instanceof DivGifImageView) {
            divViewVisitor.visit((DivGifImageView) view);
            return;
        }
        if (view instanceof DivImageView) {
            divViewVisitor.visit((DivImageView) view);
            return;
        }
        if (view instanceof DivLineHeightTextView) {
            divViewVisitor.visit((DivLineHeightTextView) view);
            return;
        }
        if (view instanceof DivPagerIndicatorView) {
            divViewVisitor.visit((DivPagerIndicatorView) view);
            return;
        }
        if (view instanceof DivSliderView) {
            divViewVisitor.visit((DivSliderView) view);
            return;
        }
        if (view instanceof DivSelectView) {
            divViewVisitor.visit((DivSelectView) view);
            return;
        }
        if (view instanceof DivVideoView) {
            divViewVisitor.visit((DivVideoView) view);
            return;
        }
        if (view instanceof DivSwitchView) {
            divViewVisitor.visit((DivSwitchView) view);
            return;
        }
        if (view instanceof ViewGroup) {
            Iterator<View> it10 = ViewGroupKt.getChildren((ViewGroup) view).iterator();
            while (it10.hasNext()) {
                visitViewTree(divViewVisitor, it10.next());
            }
        }
        divViewVisitor.visit(view);
    }
}
