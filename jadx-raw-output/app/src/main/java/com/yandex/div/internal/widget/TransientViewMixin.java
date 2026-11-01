package com.yandex.div.internal.widget;

import android.view.View;
import androidx.core.view.ViewKt;
import bk.l;
import ck.p;
import com.yandex.div.core.view2.divs.widgets.DivBorderSupports;
import java.util.Iterator;
import kk.i;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: TransientView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class TransientViewMixin implements TransientView {
    private int transitionCount;

    @Override // com.yandex.div.internal.widget.TransientView
    public boolean isTransient() {
        return this.transitionCount != 0;
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionFinished(View view) {
        int i10 = this.transitionCount;
        if (i10 > 0) {
            int i11 = i10 - 1;
            this.transitionCount = i11;
            if (i11 == 0) {
                invalidateView(view);
            }
        }
    }

    @Override // com.yandex.div.internal.widget.TransientView
    public void transitionStarted(View view) {
        int i10 = this.transitionCount + 1;
        this.transitionCount = i10;
        if (i10 == 1) {
            invalidateView(view);
        }
    }

    private final void invalidateView(View view) {
        view.invalidate();
        i iVarZ = SequencesKt___SequencesKt.z(ViewKt.getAllViews(view), new l<Object, Boolean>() { // from class: com.yandex.div.internal.widget.TransientViewMixin$invalidateView$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // bk.l
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof DivBorderSupports);
            }
        });
        p.h(iVarZ, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator it = iVarZ.iterator();
        while (it.hasNext()) {
            ((DivBorderSupports) it.next()).invalidateBorder();
        }
    }
}
