package com.mgs.carparking.widgets.rv;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes10.dex */
public class HorizontalItemFourDecoration extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42880a;

    public HorizontalItemFourDecoration(int i10, Context context) {
        this.f42880a = a(i10, context);
    }

    public int a(float f10, Context context) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.State state) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        recyclerView.getAdapter().getItemCount();
        int i10 = childAdapterPosition % 4;
        if (i10 == 0) {
            rect.left = 0;
            rect.right = this.f42880a / 2;
        } else {
            if (i10 != 1 && i10 != 2) {
                if (i10 == 3) {
                    rect.left = this.f42880a / 2;
                    rect.right = 0;
                    return;
                }
                return;
            }
            int i11 = this.f42880a;
            rect.left = i11 / 2;
            rect.right = i11 / 2;
        }
    }
}
