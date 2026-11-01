package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class HorizontalItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32254b;

    public HorizontalItemDecoration(int i10, int i11) {
        this.f32253a = i10;
        this.f32254b = i11;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f32253a;
        int i11 = childAdapterPosition % i10;
        if (childAdapterPosition == 0) {
            int i12 = this.f32254b;
            rect.left = i12 - ((i11 * i12) / i10);
        } else {
            rect.left = (this.f32254b * i11) / i10;
        }
        int i13 = this.f32254b;
        rect.right = i13 - (((i11 + 1) * i13) / i10);
        if (childAdapterPosition < i10) {
            rect.top = i13;
        }
        rect.bottom = i13;
    }
}
