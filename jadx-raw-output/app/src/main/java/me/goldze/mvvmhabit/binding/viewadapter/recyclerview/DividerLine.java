package me.goldze.mvvmhabit.binding.viewadapter.recyclerview;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes7.dex */
public class DividerLine extends RecyclerView.ItemDecoration {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f64431e = {R.attr.listDivider};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Drawable f64432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f64433b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f64434c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public LineDrawMode f64435d;

    public enum LineDrawMode {
        HORIZONTAL,
        VERTICAL,
        BOTH
    }

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f64437a;

        static {
            int[] iArr = new int[LineDrawMode.values().length];
            f64437a = iArr;
            try {
                iArr[LineDrawMode.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f64437a[LineDrawMode.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f64437a[LineDrawMode.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public int d() {
        return this.f64434c;
    }

    public LineDrawMode e() {
        return this.f64435d;
    }

    public static int a(Context context, float f10) {
        return (int) ((f10 * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final void b(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int iD;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int right = childAt.getRight() - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (d() == 0) {
                iD = a(this.f64433b, 1.0f);
            } else {
                iD = d();
            }
            this.f64432a.setBounds(left, bottom, right, iD + bottom);
            this.f64432a.draw(canvas);
        }
    }

    public final void c(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        int iD;
        int childCount = recyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = recyclerView.getChildAt(i10);
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) childAt.getLayoutParams();
            int top2 = childAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int bottom = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int right = childAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            if (d() == 0) {
                iD = a(this.f64433b, 1.0f);
            } else {
                iD = d();
            }
            this.f64432a.setBounds(right, top2, iD + right, bottom);
            this.f64432a.draw(canvas);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        super.getItemOffsets(rect, view, recyclerView, state);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
        super.onDrawOver(canvas, recyclerView, state);
        if (e() != null) {
            int i10 = a.f64437a[e().ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        b(canvas, recyclerView, state);
                        c(canvas, recyclerView, state);
                        return;
                    }
                    return;
                }
                b(canvas, recyclerView, state);
                return;
            }
            c(canvas, recyclerView, state);
            return;
        }
        throw new IllegalStateException("assign LineDrawMode,please!");
    }
}
