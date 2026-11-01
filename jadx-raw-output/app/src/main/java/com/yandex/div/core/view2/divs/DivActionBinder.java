package com.yandex.div.core.view2.divs;

import android.annotation.SuppressLint;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.widget.PopupMenu;
import bk.l;
import bk.p;
import com.yandex.div.core.Div2Logger;
import com.yandex.div.core.DivActionHandler;
import com.yandex.div.core.DivViewFacade;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.DivGestureListener;
import com.yandex.div.core.view2.divs.DivActionBinder;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.util.CollectionsKt;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAction;
import com.yandex.div2.DivAnimation;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Ref$BooleanRef;
import mj.r;
import nj.n;

/* JADX INFO: compiled from: DivActionBinder.kt */
/* JADX INFO: loaded from: classes4.dex */
public class DivActionBinder {
    private final DivActionHandler actionHandler;
    private final DivActionBeaconSender divActionBeaconSender;
    private final Div2Logger logger;
    private final boolean longtapActionsPassToChild;
    private final l<View, Boolean> passToParentLongClickListener = new l<View, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$passToParentLongClickListener$1
        @Override // bk.l
        public final Boolean invoke(View view) {
            boolean zPerformLongClick = false;
            do {
                ViewParent parent = view.getParent();
                view = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (view == null || view.getParent() == null) {
                    break;
                }
                zPerformLongClick = view.performLongClick();
            } while (!zPerformLongClick);
            return Boolean.valueOf(zPerformLongClick);
        }
    };
    private final boolean shouldIgnoreActionMenuItems;

    /* JADX INFO: compiled from: DivActionBinder.kt */
    public final class MenuWrapperListener extends OverflowMenuWrapper.Listener.Simple {
        private final BindingContext context;
        private final List<DivAction.MenuItem> items;

        public MenuWrapperListener(BindingContext bindingContext, List<DivAction.MenuItem> list) {
            this.context = bindingContext;
            this.items = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean onMenuCreated$lambda$0(final Div2View div2View, final DivAction.MenuItem menuItem, final ExpressionResolver expressionResolver, final DivActionBinder divActionBinder, final int i10, MenuItem menuItem2) {
            final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            div2View.bulkActions$div_release(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$MenuWrapperListener$onMenuCreated$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    List<DivAction> list = menuItem.f46045b;
                    List<DivAction> listE = null;
                    if (list == null || list.isEmpty()) {
                        list = null;
                    }
                    if (list == null) {
                        DivAction divAction = menuItem.f46044a;
                        if (divAction != null) {
                            listE = nj.r.e(divAction);
                        }
                    } else {
                        listE = list;
                    }
                    if (listE == null || listE.isEmpty()) {
                        KAssert kAssert = KAssert.INSTANCE;
                        if (Assert.isEnabled()) {
                            Assert.fail("Menu item does not have any action");
                            return;
                        }
                        return;
                    }
                    List<DivAction> listOnlyEnabled = DivActionBinderKt.onlyEnabled(listE, expressionResolver);
                    DivActionBinder divActionBinder2 = divActionBinder;
                    Div2View div2View2 = div2View;
                    ExpressionResolver expressionResolver2 = expressionResolver;
                    int i11 = i10;
                    DivAction.MenuItem menuItem3 = menuItem;
                    for (DivAction divAction2 : listOnlyEnabled) {
                        divActionBinder2.logger.logPopupMenuItemClick(div2View2, expressionResolver2, i11, menuItem3.f46046c.evaluate(expressionResolver2), divAction2);
                        divActionBinder2.divActionBeaconSender.sendTapActionBeacon(divAction2, expressionResolver2);
                        DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder2, div2View2, expressionResolver2, divAction2, "menu", null, null, 48, null);
                        menuItem3 = menuItem3;
                    }
                    ref$BooleanRef.element = true;
                }
            });
            return ref$BooleanRef.element;
        }

        @Override // com.yandex.div.internal.widget.menu.OverflowMenuWrapper.Listener
        public void onMenuCreated(PopupMenu popupMenu) {
            final Div2View divView = this.context.getDivView();
            final ExpressionResolver expressionResolver = this.context.getExpressionResolver();
            Menu menu = popupMenu.getMenu();
            for (final DivAction.MenuItem menuItem : this.items) {
                final int size = menu.size();
                MenuItem menuItemAdd = menu.add(menuItem.f46046c.evaluate(expressionResolver));
                final DivActionBinder divActionBinder = DivActionBinder.this;
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: com.yandex.div.core.view2.divs.a
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem2) {
                        return DivActionBinder.MenuWrapperListener.onMenuCreated$lambda$0(divView, menuItem, expressionResolver, divActionBinder, size, menuItem2);
                    }
                });
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void applyDivActions(BindingContext bindingContext, View view, List<DivAction> list, List<DivAction> list2, List<DivAction> list3, List<DivAction> list4, List<DivAction> list5, List<DivAction> list6, List<DivAction> list7, DivAnimation divAnimation, Expression<Boolean> expression) {
        DivGestureListener divGestureListener = new DivGestureListener((list2.isEmpty() ^ true) || DivActionBinderKt.parentIsLongClickable(view));
        bindLongTapActions(bindingContext, view, list2, list.isEmpty(), expression);
        bindDoubleTapActions(bindingContext, view, divGestureListener, list3, expression);
        bindTapActions(bindingContext, view, divGestureListener, list, this.shouldIgnoreActionMenuItems, expression, (list2.isEmpty() ^ true) || (list3.isEmpty() ^ true));
        p<View, MotionEvent, Boolean> pVarCreateAnimatedTouchListener = BaseDivViewExtensionsKt.createAnimatedTouchListener(view, bindingContext, !CollectionsKt.allIsNullOrEmpty(list, list2, list3) ? divAnimation : null, divGestureListener);
        p<View, MotionEvent, Boolean> pVarCreatePressTouchListener = createPressTouchListener(bindingContext, view, list6, list7);
        bindHoverActions(bindingContext, view, list4, list5);
        attachTouchListeners(view, pVarCreateAnimatedTouchListener, pVarCreatePressTouchListener);
    }

    private void bindLongTapActions(final BindingContext bindingContext, final View view, final List<DivAction> list, boolean z10, final Expression<Boolean> expression) {
        Object next;
        boolean z11;
        if (list.isEmpty()) {
            clearLongClickListener(view, this.longtapActionsPassToChild, z10);
            return;
        }
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            List<DivAction.MenuItem> list2 = ((DivAction) next).f46034e;
            z11 = false;
            if (!(list2 == null || list2.isEmpty()) && !this.shouldIgnoreActionMenuItems) {
                z11 = true;
            }
        } while (!z11);
        final DivAction divAction = (DivAction) next;
        if (divAction != null) {
            List<DivAction.MenuItem> list3 = divAction.f46034e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.f46032c);
                }
            } else {
                final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
                Div2View divView = bindingContext.getDivView();
                divView.clearSubscriptions();
                divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
                view.setOnLongClickListener(new View.OnLongClickListener() { // from class: yd.e
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view2) {
                        return DivActionBinder.bindLongTapActions$lambda$10$lambda$9(this.f85722b, divAction, bindingContext, expression, overflowMenuWrapperOverflowGravity, view, list, view2);
                    }
                });
            }
        } else {
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: yd.f
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return DivActionBinder.bindLongTapActions$lambda$11(expression, bindingContext, this, view, list, view2);
                }
            });
        }
        if (this.longtapActionsPassToChild) {
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        }
    }

    private void bindTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, boolean z10, final Expression<Boolean> expression, boolean z11) {
        Object obj = null;
        if (list.isEmpty()) {
            if (z11) {
                bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: yd.a
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        DivActionBinder.bindTapActions$lambda$2(expression, bindingContext, view2);
                    }
                });
                return;
            }
            divGestureListener.setOnSingleTapListener(null);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        for (Object obj2 : list) {
            List<DivAction.MenuItem> list2 = ((DivAction) obj2).f46034e;
            boolean z12 = true;
            if ((list2 == null || list2.isEmpty()) || z10) {
                z12 = false;
            }
            if (z12) {
                obj = obj2;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction == null) {
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: yd.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$6(expression, bindingContext, this, view, list, view2);
                }
            });
            return;
        }
        List<DivAction.MenuItem> list3 = divAction.f46034e;
        if (list3 != null) {
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            bindTapActions$setTapListener(divGestureListener, view, new View.OnClickListener() { // from class: yd.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    DivActionBinder.bindTapActions$lambda$5$lambda$4(this.f85706b, bindingContext, view, divAction, expression, overflowMenuWrapperOverflowGravity, view2);
                }
            });
            return;
        }
        KAssert kAssert = KAssert.INSTANCE;
        if (Assert.isEnabled()) {
            Assert.fail("Unable to bind empty menu action: " + divAction.f46032c);
        }
    }

    private void clearLongClickListener(View view, boolean z10, boolean z11) {
        if (!z10 || z11) {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
        } else if (DivActionBinderKt.parentIsLongClickable(view)) {
            final l<View, Boolean> lVar = this.passToParentLongClickListener;
            view.setOnLongClickListener(new View.OnLongClickListener() { // from class: yd.h
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return DivActionBinder.clearLongClickListener$lambda$12(lVar, view2);
                }
            });
            DivActionBinderKt.setPenetratingLongClickable$default(view, null, 1, null);
        } else {
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            DivActionBinderKt.setPenetratingLongClickable(view, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$5$lambda$4(DivActionBinder divActionBinder, BindingContext bindingContext, View view, DivAction divAction, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view2) {
        divActionBinder.logger.logClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
    }

    public static /* synthetic */ boolean handleAction$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        DivActionHandler actionHandler;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleAction");
        }
        String str3 = (i10 & 16) != 0 ? null : str2;
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            actionHandler = div2View != null ? div2View.getActionHandler() : null;
        } else {
            actionHandler = divActionHandler;
        }
        return divActionBinder.handleAction$div_release(divViewFacade, expressionResolver, divAction, str, str3, actionHandler);
    }

    public static /* synthetic */ boolean handleActionWithoutEnableCheck$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler, int i10, Object obj) {
        DivActionHandler actionHandler;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActionWithoutEnableCheck");
        }
        String str3 = (i10 & 16) != 0 ? null : str2;
        if ((i10 & 32) != 0) {
            Div2View div2View = divViewFacade instanceof Div2View ? (Div2View) divViewFacade : null;
            actionHandler = div2View != null ? div2View.getActionHandler() : null;
        } else {
            actionHandler = divActionHandler;
        }
        return divActionBinder.handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str3, actionHandler);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void handleActions$div_release$default(DivActionBinder divActionBinder, DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List list, String str, l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleActions");
        }
        if ((i10 & 16) != 0) {
            lVar = null;
        }
        divActionBinder.handleActions$div_release(divViewFacade, expressionResolver, list, str, lVar);
    }

    public static /* synthetic */ void handleBulkActions$div_release$default(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: handleBulkActions");
        }
        if ((i10 & 8) != 0) {
            str = "click";
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, str);
    }

    public void bindDivActions(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2, final List<DivAction> list3, final List<DivAction> list4, final List<DivAction> list5, final List<DivAction> list6, final List<DivAction> list7, final DivAnimation divAnimation, final Expression<Boolean> expression) {
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        final bk.a<r> aVar = new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$onApply$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                List listOnlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
                List listOnlyEnabled2 = DivActionBinderKt.onlyEnabled(list3, expressionResolver);
                this.applyDivActions(bindingContext, view, listOnlyEnabled, DivActionBinderKt.onlyEnabled(list2, expressionResolver), listOnlyEnabled2, DivActionBinderKt.onlyEnabled(list4, expressionResolver), DivActionBinderKt.onlyEnabled(list5, expressionResolver), DivActionBinderKt.onlyEnabled(list6, expressionResolver), DivActionBinderKt.onlyEnabled(list7, expressionResolver), divAnimation, expression);
            }
        };
        DivActionBinderKt.observe(view, (List<DivAction>) list, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$1
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
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list2, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$2
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
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (List<DivAction>) list3, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$3
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
                aVar.invoke();
            }
        });
        DivActionBinderKt.observe(view, (Expression<Boolean>) expression, expressionResolver, (l<Object, r>) new l<Object, r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDivActions$1$4
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
                aVar.invoke();
            }
        });
        aVar.invoke();
    }

    public boolean handleAction$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler) {
        if (divAction.f46031b.evaluate(expressionResolver).booleanValue()) {
            return handleActionWithoutEnableCheck$div_release(divViewFacade, expressionResolver, divAction, str, str2, divActionHandler);
        }
        return false;
    }

    @VisibleForTesting
    public boolean handleActionWithoutEnableCheck$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, DivAction divAction, String str, String str2, DivActionHandler divActionHandler) {
        boolean z10 = false;
        if (!this.actionHandler.getUseActionUid() || str2 == null) {
            if (divActionHandler != null && divActionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str)) {
                z10 = true;
            }
            if (z10) {
                return true;
            }
            return this.actionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str);
        }
        if (divActionHandler != null && divActionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str2, str)) {
            z10 = true;
        }
        if (z10) {
            return true;
        }
        return this.actionHandler.handleActionWithReason(divAction, divViewFacade, expressionResolver, str2, str);
    }

    public void handleActions$div_release(DivViewFacade divViewFacade, ExpressionResolver expressionResolver, List<DivAction> list, String str, l<? super DivAction, r> lVar) {
        if (list == null) {
            return;
        }
        for (DivAction divAction : DivActionBinderKt.onlyEnabled(list, expressionResolver)) {
            handleActionWithoutEnableCheck$div_release$default(this, divViewFacade, expressionResolver, divAction, str, null, null, 48, null);
            if (lVar != null) {
                lVar.invoke(divAction);
            }
        }
    }

    public DivActionBinder(DivActionHandler divActionHandler, Div2Logger div2Logger, DivActionBeaconSender divActionBeaconSender, boolean z10, boolean z11) {
        this.actionHandler = divActionHandler;
        this.logger = div2Logger;
        this.divActionBeaconSender = divActionBeaconSender;
        this.longtapActionsPassToChild = z10;
        this.shouldIgnoreActionMenuItems = z11;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void attachTouchListeners(View view, p<? super View, ? super MotionEvent, Boolean>... pVarArr) {
        final List listG = n.G(pVarArr);
        if (!listG.isEmpty()) {
            view.setOnTouchListener(new View.OnTouchListener() { // from class: yd.g
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return DivActionBinder.attachTouchListeners$lambda$17(listG, view2, motionEvent);
                }
            });
        } else {
            view.setOnTouchListener(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean attachTouchListeners$lambda$17(List list, View view, MotionEvent motionEvent) {
        Iterator it = list.iterator();
        while (true) {
            boolean z10 = false;
            while (it.hasNext()) {
                if (((Boolean) ((p) it.next()).mo1invoke(view, motionEvent)).booleanValue() || z10) {
                    z10 = true;
                }
            }
            return z10;
        }
    }

    private void bindDoubleTapActions(final BindingContext bindingContext, final View view, DivGestureListener divGestureListener, final List<DivAction> list, final Expression<Boolean> expression) {
        boolean z10;
        Object obj = null;
        if (list.isEmpty()) {
            divGestureListener.setOnDoubleTapListener(null);
            return;
        }
        for (Object obj2 : list) {
            List<DivAction.MenuItem> list2 = ((DivAction) obj2).f46034e;
            boolean z11 = false;
            if (list2 != null && !list2.isEmpty()) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!z10 && !this.shouldIgnoreActionMenuItems) {
                z11 = true;
            }
            if (z11) {
                obj = obj2;
                break;
            }
        }
        final DivAction divAction = (DivAction) obj;
        if (divAction != null) {
            List<DivAction.MenuItem> list3 = divAction.f46034e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.f46032c);
                    return;
                }
                return;
            }
            final OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            divGestureListener.setOnDoubleTapListener(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindDoubleTapActions$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    this.this$0.logger.logDoubleClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, divAction);
                    this.this$0.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
                    DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                    overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(view);
                }
            });
            return;
        }
        divGestureListener.setOnDoubleTapListener(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.bindDoubleTapActions.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                DivActionBinderKt.captureFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
                this.handleBulkActions$div_release(bindingContext, view, list, "double_click");
            }
        });
    }

    private void bindHoverActions(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
            view.setOnHoverListener(null);
        } else {
            view.setOnHoverListener(new View.OnHoverListener() { // from class: yd.d
                @Override // android.view.View.OnHoverListener
                public final boolean onHover(View view2, MotionEvent motionEvent) {
                    return DivActionBinder.bindHoverActions$lambda$15(this.f85717b, bindingContext, view, list, list2, view2, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindHoverActions$lambda$15(DivActionBinder divActionBinder, BindingContext bindingContext, View view, List list, List list2, View view2, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 9) {
            if (action == 10) {
                divActionBinder.handleBulkActions$div_release(bindingContext, view, list2, "unhover");
                return false;
            }
            return false;
        }
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "hover");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$10$lambda$9(DivActionBinder divActionBinder, DivAction divAction, BindingContext bindingContext, Expression expression, OverflowMenuWrapper overflowMenuWrapper, View view, List list, View view2) {
        String string = UUID.randomUUID().toString();
        divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, bindingContext.getExpressionResolver());
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        overflowMenuWrapper.getOnMenuClickListener().onClick(view);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            divActionBinder.logger.logLongClick(bindingContext.getDivView(), bindingContext.getExpressionResolver(), view, (DivAction) it.next(), string);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean bindLongTapActions$lambda$11(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        divActionBinder.handleBulkActions$div_release(bindingContext, view, list, "long_click");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$2(Expression expression, BindingContext bindingContext, View view) {
        DivActionBinderKt.clearFocusIfNeeded(view, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindTapActions$lambda$6(Expression expression, BindingContext bindingContext, DivActionBinder divActionBinder, View view, List list, View view2) {
        DivActionBinderKt.captureFocusIfNeeded(view2, expression, bindingContext.getDivView().getInputFocusTracker$div_release(), bindingContext.getExpressionResolver());
        handleBulkActions$div_release$default(divActionBinder, bindingContext, view, list, null, 8, null);
    }

    private static final void bindTapActions$setTapListener(DivGestureListener divGestureListener, final View view, final View.OnClickListener onClickListener) {
        if (divGestureListener.getOnDoubleTapListener() != null) {
            divGestureListener.setOnSingleTapListener(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$bindTapActions$setTapListener$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // bk.a
                public /* bridge */ /* synthetic */ r invoke() {
                    invoke2();
                    return r.f64562a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    onClickListener.onClick(view);
                }
            });
        } else {
            view.setOnClickListener(onClickListener);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clearLongClickListener$lambda$12(l lVar, View view) {
        return ((Boolean) lVar.invoke(view)).booleanValue();
    }

    private p<View, MotionEvent, Boolean> createPressTouchListener(final BindingContext bindingContext, final View view, final List<DivAction> list, final List<DivAction> list2) {
        if (!(!list.isEmpty()) && !(!list2.isEmpty())) {
            return null;
        }
        return new p<View, MotionEvent, Boolean>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder.createPressTouchListener.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // bk.p
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public final Boolean mo1invoke(View view2, MotionEvent motionEvent) {
                int action = motionEvent.getAction();
                boolean z10 = true;
                if (action == 0) {
                    DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list, "press");
                } else if (action == 1 || action == 3) {
                    DivActionBinder.this.handleBulkActions$div_release(bindingContext, view, list2, "release");
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:44:0x0078 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public String toDivActionReason(String str) {
        switch (str.hashCode()) {
            case -338877947:
                if (str.equals("long_click")) {
                    return "long_click";
                }
                return "external";
            case -287575485:
                if (str.equals("unhover")) {
                    return "unhover";
                }
                return "external";
            case 3027047:
                if (str.equals("blur")) {
                    return "blur";
                }
                return "external";
            case 94750088:
                if (str.equals("click")) {
                    return "click";
                }
                return "external";
            case 96667352:
                if (str.equals("enter")) {
                    return "enter";
                }
                return "external";
            case 97604824:
                if (str.equals("focus")) {
                    return "focus";
                }
                return "external";
            case 99469628:
                if (str.equals("hover")) {
                    return "hover";
                }
                return "external";
            case 106931267:
                if (str.equals("press")) {
                    return "press";
                }
                return "external";
            case 1090594823:
                if (str.equals("release")) {
                    return "release";
                }
                return "external";
            case 1374143386:
                if (str.equals("double_click")) {
                    return "double_click";
                }
                return "external";
            default:
                return "external";
        }
    }

    public void handleBulkActions$div_release(BindingContext bindingContext, final View view, final List<DivAction> list, final String str) {
        final Div2View divView = bindingContext.getDivView();
        final ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        divView.bulkActions$div_release(new bk.a<r>() { // from class: com.yandex.div.core.view2.divs.DivActionBinder$handleBulkActions$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // bk.a
            public /* bridge */ /* synthetic */ r invoke() {
                invoke2();
                return r.f64562a;
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code duplicated, block: B:48:0x011a  */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                String string = UUID.randomUUID().toString();
                List<DivAction> listOnlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
                String str2 = str;
                DivActionBinder divActionBinder = this;
                Div2View div2View = divView;
                ExpressionResolver expressionResolver2 = expressionResolver;
                View view2 = view;
                for (DivAction divAction : listOnlyEnabled) {
                    switch (str2) {
                        case "long_click":
                            divActionBinder.logger.logLongClick(div2View, expressionResolver2, view2, divAction, string);
                            break;
                        case "unhover":
                            divActionBinder.logger.logHoverChanged(div2View, expressionResolver2, view2, divAction, false);
                            break;
                        case "blur":
                            divActionBinder.logger.logFocusChanged(div2View, expressionResolver2, view2, divAction, false);
                            break;
                        case "click":
                            divActionBinder.logger.logClick(div2View, expressionResolver2, view2, divAction, string);
                            break;
                        case "enter":
                            divActionBinder.logger.logImeEnter(div2View, expressionResolver2, view2, divAction);
                            break;
                        case "focus":
                            divActionBinder.logger.logFocusChanged(div2View, expressionResolver2, view2, divAction, true);
                            break;
                        case "hover":
                            divActionBinder.logger.logHoverChanged(div2View, expressionResolver2, view2, divAction, true);
                            break;
                        case "press":
                            divActionBinder.logger.logPressChanged(div2View, expressionResolver2, view2, divAction, true);
                            break;
                        case "release":
                            divActionBinder.logger.logPressChanged(div2View, expressionResolver2, view2, divAction, false);
                            break;
                        case "double_click":
                            divActionBinder.logger.logDoubleClick(div2View, expressionResolver2, view2, divAction, string);
                            break;
                        default:
                            Assert.fail("Please, add new logType");
                            break;
                    }
                    divActionBinder.divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver2);
                    DivActionBinder.handleActionWithoutEnableCheck$div_release$default(divActionBinder, div2View, expressionResolver2, divAction, divActionBinder.toDivActionReason(str2), string, null, 32, null);
                }
            }
        });
    }

    public void handleTapClick$div_release(BindingContext bindingContext, View view, List<DivAction> list) {
        Object next;
        boolean z10;
        ExpressionResolver expressionResolver = bindingContext.getExpressionResolver();
        List listOnlyEnabled = DivActionBinderKt.onlyEnabled(list, expressionResolver);
        Iterator it = listOnlyEnabled.iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
                List<DivAction.MenuItem> list2 = ((DivAction) next).f46034e;
                if (list2 != null && !list2.isEmpty()) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                next = null;
                break;
            }
        } while (!(!z10));
        DivAction divAction = (DivAction) next;
        if (divAction != null) {
            List<DivAction.MenuItem> list3 = divAction.f46034e;
            if (list3 == null) {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    Assert.fail("Unable to bind empty menu action: " + divAction.f46032c);
                    return;
                }
                return;
            }
            OverflowMenuWrapper overflowMenuWrapperOverflowGravity = new OverflowMenuWrapper(view.getContext(), view, bindingContext.getDivView()).listener(new MenuWrapperListener(bindingContext, list3)).overflowGravity(53);
            Div2View divView = bindingContext.getDivView();
            divView.clearSubscriptions();
            divView.subscribe(new DivActionBinder$prepareMenu$2$1(overflowMenuWrapperOverflowGravity));
            this.logger.logClick(bindingContext.getDivView(), expressionResolver, view, divAction);
            this.divActionBeaconSender.sendTapActionBeacon(divAction, expressionResolver);
            overflowMenuWrapperOverflowGravity.getOnMenuClickListener().onClick(view);
            return;
        }
        handleBulkActions$div_release$default(this, bindingContext, view, listOnlyEnabled, null, 8, null);
    }
}
