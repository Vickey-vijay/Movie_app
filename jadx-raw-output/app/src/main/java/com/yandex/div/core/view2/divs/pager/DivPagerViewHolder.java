package com.yandex.div.core.view2.divs.pager;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.GravityCompat;
import bk.a;
import ck.i;
import com.yandex.div.core.Disposable;
import com.yandex.div.core.state.DivStatePath;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.DivBinder;
import com.yandex.div.core.view2.DivViewCreator;
import com.yandex.div.core.view2.divs.DivCollectionViewHolder;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.logging.Severity;
import com.yandex.div2.Div;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivPager;
import oe.e2;

/* JADX INFO: compiled from: DivPagerViewHolder.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class DivPagerViewHolder extends DivCollectionViewHolder {
    public static final Companion Companion = new Companion(null);
    private final a<DivPager.ItemAlignment> crossAxisAlignment;
    private final a<Boolean> isHorizontal;
    private final DivPagerPageLayout pageLayout;
    private final BindingContext parentContext;

    /* JADX INFO: compiled from: DivPagerViewHolder.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    private final void setCrossAxisAlignment(DivLayoutParams divLayoutParams, e2 e2Var, ExpressionResolver expressionResolver) {
        Enum enumInvoke;
        Expression expressionN = this.isHorizontal.invoke().booleanValue() ? e2Var.n() : e2Var.g();
        if (expressionN == null || (enumInvoke = (Enum) expressionN.evaluate(expressionResolver)) == null) {
            enumInvoke = this.crossAxisAlignment.invoke();
        }
        int i10 = 17;
        if (this.isHorizontal.invoke().booleanValue()) {
            if (!(enumInvoke == DivPager.ItemAlignment.CENTER || enumInvoke == DivAlignmentVertical.CENTER)) {
                i10 = enumInvoke == DivPager.ItemAlignment.END || enumInvoke == DivAlignmentVertical.BOTTOM ? 80 : 48;
            }
        } else {
            if (!(enumInvoke == DivPager.ItemAlignment.CENTER || enumInvoke == DivAlignmentHorizontal.CENTER)) {
                if (enumInvoke == DivPager.ItemAlignment.END || enumInvoke == DivAlignmentHorizontal.END) {
                    i10 = GravityCompat.END;
                } else if (enumInvoke == DivAlignmentHorizontal.LEFT) {
                    i10 = 3;
                } else {
                    i10 = enumInvoke == DivAlignmentHorizontal.RIGHT ? 5 : GravityCompat.START;
                }
            }
        }
        divLayoutParams.setGravity(i10);
        this.pageLayout.requestLayout();
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void logReuseError() {
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.DEBUG)) {
            kLog.print(3, "DivPagerViewHolder", "Pager holder reuse failed");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.view.View$OnAttachStateChangeListener, com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1] */
    public DivPagerViewHolder(BindingContext bindingContext, DivPagerPageLayout divPagerPageLayout, DivBinder divBinder, DivViewCreator divViewCreator, a<Boolean> aVar, a<? extends DivPager.ItemAlignment> aVar2) {
        super(divPagerPageLayout, bindingContext, divBinder, divViewCreator);
        this.parentContext = bindingContext;
        this.pageLayout = divPagerPageLayout;
        this.isHorizontal = aVar;
        this.crossAxisAlignment = aVar2;
        final View view = this.itemView;
        final ?? r10 = new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view2) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view2) {
                Div oldDiv = this.this$0.getOldDiv();
                if (oldDiv == null) {
                    return;
                }
                this.this$0.parentContext.getDivView().getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(this.this$0.parentContext, view2, oldDiv);
            }
        };
        view.addOnAttachStateChangeListener(r10);
        new Disposable() { // from class: com.yandex.div.core.view2.divs.pager.DivPagerViewHolder$special$$inlined$doOnEveryDetach$2
            @Override // com.yandex.div.core.Disposable, java.lang.AutoCloseable, java.io.Closeable
            public final void close() {
                view.removeOnAttachStateChangeListener(r10);
            }
        };
    }

    @Override // com.yandex.div.core.view2.divs.DivCollectionViewHolder
    public void bind(BindingContext bindingContext, Div div, int i10, DivStatePath divStatePath) {
        ViewGroup.LayoutParams layoutParams;
        super.bind(bindingContext, div, i10, divStatePath);
        View child = this.pageLayout.getChild();
        DivLayoutParams divLayoutParams = null;
        if (child != null) {
            layoutParams = child.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams instanceof DivLayoutParams) {
            divLayoutParams = (DivLayoutParams) layoutParams;
        }
        if (divLayoutParams != null) {
            setCrossAxisAlignment(divLayoutParams, div.b(), bindingContext.getExpressionResolver());
        }
    }
}
