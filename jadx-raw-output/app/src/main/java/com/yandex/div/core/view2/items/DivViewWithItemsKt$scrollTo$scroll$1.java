package com.yandex.div.core.view2.items;

import androidx.recyclerview.widget.RecyclerView;
import bk.p;
import kotlin.jvm.internal.FunctionReferenceImpl;
import mj.r;

/* JADX INFO: compiled from: DivViewWithItems.kt */
/* JADX INFO: loaded from: classes.dex */
public /* synthetic */ class DivViewWithItemsKt$scrollTo$scroll$1 extends FunctionReferenceImpl implements p<Integer, Integer, r> {
    public DivViewWithItemsKt$scrollTo$scroll$1(Object obj) {
        super(2, obj, RecyclerView.class, "smoothScrollBy", "smoothScrollBy(II)V", 0);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public /* bridge */ /* synthetic */ r mo1invoke(Integer num, Integer num2) {
        invoke(num.intValue(), num2.intValue());
        return r.f64562a;
    }

    public final void invoke(int i10, int i11) {
        ((RecyclerView) this.receiver).smoothScrollBy(i10, i11);
    }
}
