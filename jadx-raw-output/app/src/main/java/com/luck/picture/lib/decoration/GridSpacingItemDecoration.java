package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class GridSpacingItemDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f32250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f32251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f32252c;

    public GridSpacingItemDecoration(int i10, int i11, boolean z10) {
        this.f32250a = i10;
        this.f32251b = i11;
        this.f32252c = z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, RecyclerView recyclerView, RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i10 = this.f32250a;
        int i11 = childAdapterPosition % i10;
        if (this.f32252c) {
            int i12 = this.f32251b;
            rect.left = i12 - ((i11 * i12) / i10);
            rect.right = ((i11 + 1) * i12) / i10;
        } else {
            int i13 = this.f32251b;
            rect.left = (i11 * i13) / i10;
            rect.right = i13 - (((i11 + 1) * i13) / i10);
        }
        if (childAdapterPosition < i10) {
            rect.top = this.f32251b;
        }
        rect.bottom = this.f32251b;
    }
}
