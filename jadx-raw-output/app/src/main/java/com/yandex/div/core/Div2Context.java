package com.yandex.div.core;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import androidx.annotation.MainThread;
import androidx.annotation.StyleRes;
import androidx.core.view.LayoutInflaterCompat;
import androidx.lifecycle.LifecycleOwner;
import bk.a;
import ck.i;
import ck.p;
import com.yandex.div.R$style;
import com.yandex.div.core.dagger.Div2Component;
import com.yandex.div.core.expression.variables.GlobalVariableController;
import com.yandex.div.core.view2.Div2View;
import kotlin.b;
import mj.g;

/* JADX INFO: compiled from: Div2Context.kt */
/* JADX INFO: loaded from: classes10.dex */
public class Div2Context extends ContextWrapper {
    public static final Companion Companion = new Companion(null);
    private final ContextThemeWrapper baseContext;
    private final Div2Component div2Component;
    private final g globalVariableController$delegate;
    private LayoutInflater inflater;
    private final LifecycleOwner lifecycleOwner;

    /* JADX INFO: compiled from: Div2Context.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: Div2Context.kt */
    public static final class Div2InflaterFactory implements LayoutInflater.Factory2 {
        public static final Companion Companion = new Companion(null);
        private final Div2Context div2Context;

        /* JADX INFO: compiled from: Div2Context.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(i iVar) {
                this();
            }
        }

        @Override // android.view.LayoutInflater.Factory2
        public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
            return onCreateView(str, context, attributeSet);
        }

        private final boolean isDiv2View(String str) {
            return p.e("com.yandex.div.core.view2.Div2View", str) || p.e("Div2View", str);
        }

        @Override // android.view.LayoutInflater.Factory
        public View onCreateView(String str, Context context, AttributeSet attributeSet) {
            if (isDiv2View(str)) {
                return new Div2View(this.div2Context, attributeSet, 0, 4, null);
            }
            return null;
        }

        public Div2InflaterFactory(Div2Context div2Context) {
            this.div2Context = div2Context;
        }
    }

    @MainThread
    private Div2Context(ContextThemeWrapper contextThemeWrapper, Div2Component div2Component, LifecycleOwner lifecycleOwner) {
        super(contextThemeWrapper);
        this.baseContext = contextThemeWrapper;
        this.div2Component = div2Component;
        this.lifecycleOwner = lifecycleOwner;
        this.globalVariableController$delegate = b.a(new a<GlobalVariableController>() { // from class: com.yandex.div.core.Div2Context$globalVariableController$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.a
            public final GlobalVariableController invoke() {
                return new GlobalVariableController(this.this$0.getDiv2Component$div_release().getDivVariableController());
            }
        });
        getDiv2Component$div_release().getDivCreationTracker().onContextCreationFinished();
    }

    private LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflaterCloneInContext;
        LayoutInflater layoutInflater = this.inflater;
        if (layoutInflater != null) {
            return layoutInflater;
        }
        synchronized (this) {
            layoutInflaterCloneInContext = this.inflater;
            if (layoutInflaterCloneInContext == null) {
                layoutInflaterCloneInContext = LayoutInflater.from(this.baseContext).cloneInContext(this);
                p.h(layoutInflaterCloneInContext, "null cannot be cast to non-null type android.view.LayoutInflater");
                LayoutInflaterCompat.setFactory2(layoutInflaterCloneInContext, new Div2InflaterFactory(this));
                this.inflater = layoutInflaterCloneInContext;
            }
        }
        return layoutInflaterCloneInContext;
    }

    public Div2Component getDiv2Component$div_release() {
        return this.div2Component;
    }

    public LifecycleOwner getLifecycleOwner$div_release() {
        return this.lifecycleOwner;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Object getSystemService(String str) {
        return p.e("layout_inflater", str) ? getLayoutInflater() : this.baseContext.getSystemService(str);
    }

    public /* synthetic */ Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, int i10, LifecycleOwner lifecycleOwner, int i11, i iVar) {
        this(contextThemeWrapper, divConfiguration, (i11 & 4) != 0 ? R$style.Div_Theme : i10, (i11 & 8) != 0 ? null : lifecycleOwner);
    }

    public Div2Context(ContextThemeWrapper contextThemeWrapper, DivConfiguration divConfiguration, @StyleRes int i10, LifecycleOwner lifecycleOwner) {
        this(contextThemeWrapper, DivKit.Companion.getInstance(contextThemeWrapper).getComponent$div_release().div2Component().baseContext(contextThemeWrapper).configuration(divConfiguration).themeId(i10).divCreationTracker(new DivCreationTracker(SystemClock.uptimeMillis())).divVariableController(divConfiguration.getDivVariableController()).build(), lifecycleOwner);
    }
}
