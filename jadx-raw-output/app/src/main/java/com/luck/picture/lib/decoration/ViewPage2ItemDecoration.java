package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes8.dex */
public class ViewPage2ItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32255a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32256b;

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, @NonNull View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f32255a;
        int i11 = childAdapterPosition % i10;
        int i12 = this.f32256b;
        rect.left = i12 - ((i11 * i12) / i10);
        rect.right = ((i11 + 1) * i12) / i10;
    }
}
