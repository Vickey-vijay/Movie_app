package com.yandex.div.core.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import bk.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: compiled from: ViewPager2Wrapper.kt */
/* JADX INFO: loaded from: classes7.dex */
public /* synthetic */ class ViewPager2Wrapper$onMeasure$maxHeight$1 extends FunctionReferenceImpl implements p<RecyclerView.LayoutManager, View, Integer> {
    public static final ViewPager2Wrapper$onMeasure$maxHeight$1 INSTANCE = new ViewPager2Wrapper$onMeasure$maxHeight$1();

    public ViewPager2Wrapper$onMeasure$maxHeight$1() {
        super(2, RecyclerView.LayoutManager.class, "getDecoratedMeasuredHeight", "getDecoratedMeasuredHeight(Landroid/view/View;)I", 0);
    }

    @Override // bk.p
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public final Integer mo1invoke(RecyclerView.LayoutManager layoutManager, View view) {
        return Integer.valueOf(layoutManager.getDecoratedMeasuredHeight(view));
    }
}
