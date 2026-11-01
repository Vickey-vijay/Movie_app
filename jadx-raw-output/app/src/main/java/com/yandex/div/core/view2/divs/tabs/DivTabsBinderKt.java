package com.yandex.div.core.view2.divs.tabs;

import android.util.DisplayMetrics;
import bk.l;
import com.yandex.div.core.font.DivTypefaceType;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.divs.TextViewExtensionsKt;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.internal.widget.tabs.TabView;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivEdgeInsets;
import com.yandex.div2.DivFontWeight;
import com.yandex.div2.DivSize;
import com.yandex.div2.DivTabs;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mj.r;

/* JADX INFO: compiled from: DivTabsBinder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class DivTabsBinderKt {

    /* JADX INFO: compiled from: DivTabsBinder.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DivFontWeight.values().length];
            try {
                iArr[DivFontWeight.MEDIUM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DivFontWeight.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DivFontWeight.LIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DivFontWeight.BOLD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTabsAdapter tryReuse(DivTabsAdapter divTabsAdapter, DivTabs divTabs, ExpressionResolver expressionResolver) {
        if (divTabsAdapter != null && divTabsAdapter.isDynamicHeight() == divTabs.f49257j.evaluate(expressionResolver).booleanValue()) {
            return divTabsAdapter;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observe(DivEdgeInsets divEdgeInsets, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, l<Object, r> lVar) {
        expressionSubscriber.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar));
        lVar.invoke(null);
    }

    public static final void observeStyle(final TabView tabView, DivTabs.TabTitleStyle tabTitleStyle, final ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber) {
        TextViewExtensionsKt.observeFontSize(tabView, tabTitleStyle.f49302j, tabTitleStyle.f49303k, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLetterSpacing(tabView, tabTitleStyle.f49310r, tabTitleStyle.f49302j, null, null, expressionResolver, expressionSubscriber);
        TextViewExtensionsKt.observeLineHeight(tabView, tabTitleStyle.f49311s, tabTitleStyle.f49303k, null, null, expressionResolver, expressionSubscriber);
        final DivEdgeInsets divEdgeInsets = tabTitleStyle.f49312t;
        final DisplayMetrics displayMetrics = tabView.getResources().getDisplayMetrics();
        l<? super Long, r> lVar = new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt$observeStyle$applyTabPaddings$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(Object obj) {
                invoke2(obj);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                DivEdgeInsets divEdgeInsets2 = divEdgeInsets;
                Expression<Long> expression = divEdgeInsets2.f47058e;
                if (expression == null && divEdgeInsets2.f47055b == null) {
                    tabView.setTabPadding(BaseDivViewExtensionsKt.dpToPx(divEdgeInsets2.f47056c.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(divEdgeInsets.f47059f.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(divEdgeInsets.f47057d.evaluate(expressionResolver), displayMetrics), BaseDivViewExtensionsKt.dpToPx(divEdgeInsets.f47054a.evaluate(expressionResolver), displayMetrics));
                    return;
                }
                TabView tabView2 = tabView;
                int iDpToPx = BaseDivViewExtensionsKt.dpToPx(expression != null ? expression.evaluate(expressionResolver) : null, displayMetrics);
                int iDpToPx2 = BaseDivViewExtensionsKt.dpToPx(divEdgeInsets.f47059f.evaluate(expressionResolver), displayMetrics);
                Expression<Long> expression2 = divEdgeInsets.f47055b;
                tabView2.setTabPadding(iDpToPx, iDpToPx2, BaseDivViewExtensionsKt.dpToPx(expression2 != null ? expression2.evaluate(expressionResolver) : null, displayMetrics), BaseDivViewExtensionsKt.dpToPx(divEdgeInsets.f47054a.evaluate(expressionResolver), displayMetrics));
            }
        };
        expressionSubscriber.addSubscription(divEdgeInsets.f47059f.observe(expressionResolver, lVar));
        expressionSubscriber.addSubscription(divEdgeInsets.f47054a.observe(expressionResolver, lVar));
        Expression<Long> expression = divEdgeInsets.f47058e;
        if (expression == null && divEdgeInsets.f47055b == null) {
            expressionSubscriber.addSubscription(divEdgeInsets.f47056c.observe(expressionResolver, lVar));
            expressionSubscriber.addSubscription(divEdgeInsets.f47057d.observe(expressionResolver, lVar));
        } else {
            expressionSubscriber.addSubscription(expression != null ? expression.observe(expressionResolver, lVar) : null);
            Expression<Long> expression2 = divEdgeInsets.f47055b;
            expressionSubscriber.addSubscription(expression2 != null ? expression2.observe(expressionResolver, lVar) : null);
        }
        lVar.invoke(null);
        Expression<DivFontWeight> expression3 = tabTitleStyle.f49307o;
        if (expression3 == null) {
            expression3 = tabTitleStyle.f49304l;
        }
        observeStyle$addToSubscriber(expression3, expressionSubscriber, expressionResolver, new l<DivFontWeight, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt.observeStyle.1
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivFontWeight divFontWeight) {
                invoke2(divFontWeight);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivFontWeight divFontWeight) {
                tabView.setInactiveTypefaceType(DivTabsBinderKt.toTypefaceType(divFontWeight));
            }
        });
        Expression<DivFontWeight> expression4 = tabTitleStyle.f49295c;
        if (expression4 == null) {
            expression4 = tabTitleStyle.f49304l;
        }
        observeStyle$addToSubscriber(expression4, expressionSubscriber, expressionResolver, new l<DivFontWeight, r>() { // from class: com.yandex.div.core.view2.divs.tabs.DivTabsBinderKt.observeStyle.2
            {
                super(1);
            }

            @Override // bk.l
            public /* bridge */ /* synthetic */ r invoke(DivFontWeight divFontWeight) {
                invoke2(divFontWeight);
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(DivFontWeight divFontWeight) {
                tabView.setActiveTypefaceType(DivTabsBinderKt.toTypefaceType(divFontWeight));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DivTypefaceType toTypefaceType(DivFontWeight divFontWeight) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[divFontWeight.ordinal()];
        if (i10 == 1) {
            return DivTypefaceType.MEDIUM;
        }
        if (i10 == 2) {
            return DivTypefaceType.REGULAR;
        }
        if (i10 == 3) {
            return DivTypefaceType.LIGHT;
        }
        if (i10 == 4) {
            return DivTypefaceType.BOLD;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void observeFixedHeightChange(List<DivTabs.Item> list, ExpressionResolver expressionResolver, ExpressionSubscriber expressionSubscriber, l<Object, r> lVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            DivSize height = ((DivTabs.Item) it.next()).f49276a.b().getHeight();
            if (height instanceof DivSize.b) {
                DivSize.b bVar = (DivSize.b) height;
                expressionSubscriber.addSubscription(bVar.c().f47187a.observe(expressionResolver, lVar));
                expressionSubscriber.addSubscription(bVar.c().f47188b.observe(expressionResolver, lVar));
            }
        }
    }

    private static final void observeStyle$addToSubscriber(Expression<DivFontWeight> expression, ExpressionSubscriber expressionSubscriber, ExpressionResolver expressionResolver, l<? super DivFontWeight, r> lVar) {
        expressionSubscriber.addSubscription(expression.observeAndGet(expressionResolver, lVar));
    }
}
