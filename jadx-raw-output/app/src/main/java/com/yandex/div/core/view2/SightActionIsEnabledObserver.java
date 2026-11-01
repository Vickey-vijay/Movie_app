package com.yandex.div.core.view2;

import android.view.View;
import bk.l;
import bk.s;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.view2.SightActionIsEnabledObserver;
import com.yandex.div.internal.core.ExpressionSubscriber;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.Div;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import mj.r;
import nj.b0;
import nj.q0;
import oe.c9;

/* JADX INFO: compiled from: SightActionIsEnabledObserver.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class SightActionIsEnabledObserver {
    private final s<Div2View, ExpressionResolver, View, Div, c9, r> onDisable;
    private final s<Div2View, ExpressionResolver, View, Div, c9, r> onEnable;
    private final WeakHashMap<View, Set<c9>> boundedActions = new WeakHashMap<>();
    private final HashMap<c9, Subscription> subscriptions = new HashMap<>();
    private final WeakHashMap<View, r> hasSubscription = new WeakHashMap<>();

    /* JADX INFO: compiled from: SightActionIsEnabledObserver.kt */
    public static final class Subscription {
        private final Disposable disposable;
        private final WeakReference<View> owner;

        public final void close() {
            this.disposable.close();
        }

        public final WeakReference<View> getOwner() {
            return this.owner;
        }

        public Subscription(Disposable disposable, View view) {
            this.disposable = disposable;
            this.owner = new WeakReference<>(view);
        }
    }

    private final void cancelObserving(c9 c9Var) {
        Set<c9> set;
        Subscription subscriptionRemove = this.subscriptions.remove(c9Var);
        if (subscriptionRemove == null) {
            return;
        }
        subscriptionRemove.close();
        View view = subscriptionRemove.getOwner().get();
        if (view == null || (set = this.boundedActions.get(view)) == null) {
            return;
        }
        set.remove(c9Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void addSubscriptionIfNeeded(final View view) {
        if (this.hasSubscription.containsKey(view) || !(view instanceof ExpressionSubscriber)) {
            return;
        }
        ((ExpressionSubscriber) view).addSubscription(new Disposable() { // from class: wd.w
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                SightActionIsEnabledObserver.addSubscriptionIfNeeded$lambda$2(this.f74061b, view);
            }
        });
        this.hasSubscription.put(view, r.f64562a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addSubscriptionIfNeeded$lambda$2(SightActionIsEnabledObserver sightActionIsEnabledObserver, View view) {
        Set<c9> setRemove = sightActionIsEnabledObserver.boundedActions.remove(view);
        if (setRemove == null) {
            setRemove = q0.f();
        }
        sightActionIsEnabledObserver.cancelObserving(setRemove);
    }

    public final void observe(final View view, final Div2View div2View, final ExpressionResolver expressionResolver, final Div div, List<? extends c9> list) {
        Subscription subscriptionRemove;
        this = this;
        addSubscriptionIfNeeded(view);
        WeakHashMap<View, Set<c9>> weakHashMap = this.boundedActions;
        Set<c9> setF = weakHashMap.get(view);
        if (setF == null) {
            setF = q0.f();
        }
        Set setL0 = b0.l0(list, setF);
        Set<c9> setS0 = b0.S0(setL0);
        for (c9 c9Var : setF) {
            if (!setL0.contains(c9Var) && (subscriptionRemove = this.subscriptions.remove(c9Var)) != null) {
                subscriptionRemove.close();
            }
        }
        for (final c9 c9Var2 : list) {
            if (!setL0.contains(c9Var2)) {
                setS0.add(c9Var2);
                this.cancelObserving(c9Var2);
                this.subscriptions.put(c9Var2, new Subscription(c9Var2.isEnabled().observe(expressionResolver, new l<Boolean, r>() { // from class: com.yandex.div.core.view2.SightActionIsEnabledObserver$observe$2$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // bk.l
                    public /* bridge */ /* synthetic */ r invoke(Boolean bool) {
                        invoke(bool.booleanValue());
                        return r.f64562a;
                    }

                    public final void invoke(boolean z10) {
                        if (z10) {
                            this.this$0.onEnable.invoke(div2View, expressionResolver, view, div, c9Var2);
                        } else {
                            this.this$0.onDisable.invoke(div2View, expressionResolver, view, div, c9Var2);
                        }
                    }
                }), view));
                setL0 = setL0;
            }
        }
        weakHashMap.put(view, setS0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SightActionIsEnabledObserver(s<? super Div2View, ? super ExpressionResolver, ? super View, ? super Div, ? super c9, r> sVar, s<? super Div2View, ? super ExpressionResolver, ? super View, ? super Div, ? super c9, r> sVar2) {
        this.onEnable = sVar;
        this.onDisable = sVar2;
    }

    public final void cancelObserving(Iterable<? extends c9> iterable) {
        Iterator<? extends c9> it = iterable.iterator();
        while (it.hasNext()) {
            cancelObserving(it.next());
        }
    }
}
