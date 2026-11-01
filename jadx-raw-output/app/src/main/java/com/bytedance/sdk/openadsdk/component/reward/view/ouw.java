package com.bytedance.sdk.openadsdk.component.reward.view;

import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.OrientationHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SnapHelper;

/* JADX INFO: loaded from: classes5.dex */
public final class ouw extends SnapHelper {

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    private RecyclerView f12460lh;
    private OrientationHelper ouw;
    private OrientationHelper vt;

    @Override // androidx.recyclerview.widget.SnapHelper
    @NonNull
    public final int[] calculateDistanceToFinalSnap(@NonNull RecyclerView.LayoutManager layoutManager, @NonNull View view) {
        int[] iArr = {0, 0};
        if (layoutManager.canScrollHorizontally()) {
            OrientationHelper orientationHelper = this.vt;
            if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
                this.vt = OrientationHelper.createHorizontalHelper(layoutManager);
            }
            iArr[0] = ouw(view, this.vt);
        } else if (layoutManager.canScrollVertically()) {
            iArr[1] = ouw(view, ouw(layoutManager));
        }
        return iArr;
    }

    private static int ouw(View view, @NonNull OrientationHelper orientationHelper) {
        int decoratedStart = orientationHelper.getDecoratedStart(view);
        return decoratedStart >= orientationHelper.getStartAfterPadding() / 2 ? decoratedStart - orientationHelper.getStartAfterPadding() : decoratedStart;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final void attachToRecyclerView(@Nullable RecyclerView recyclerView) throws IllegalStateException {
        this.f12460lh = recyclerView;
        super.attachToRecyclerView(recyclerView);
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public final RecyclerView.SmoothScroller createScroller(@NonNull RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.SmoothScroller.ScrollVectorProvider) {
            return new LinearSmoothScroller(this.f12460lh.getContext()) { // from class: com.bytedance.sdk.openadsdk.component.reward.view.ouw.1
                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                    return 100.0f / displayMetrics.densityDpi;
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller, androidx.recyclerview.widget.RecyclerView.SmoothScroller
                public final void onTargetFound(View view, RecyclerView.State state, RecyclerView.SmoothScroller.Action action) {
                    ouw ouwVar = ouw.this;
                    int[] iArrCalculateDistanceToFinalSnap = ouwVar.calculateDistanceToFinalSnap(ouwVar.f12460lh.getLayoutManager(), view);
                    int i10 = iArrCalculateDistanceToFinalSnap[0];
                    int i11 = iArrCalculateDistanceToFinalSnap[1];
                    int iCalculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i10), Math.abs(i11)));
                    if (iCalculateTimeForDeceleration > 0) {
                        action.update(i10, i11, iCalculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }

                @Override // androidx.recyclerview.widget.LinearSmoothScroller
                public final int calculateTimeForScrolling(int i10) {
                    return Math.min(100, super.calculateTimeForScrolling(i10));
                }
            };
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    @Nullable
    public final View findSnapView(@NonNull RecyclerView.LayoutManager layoutManager) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager.findLastCompletelyVisibleItemPosition() == linearLayoutManager.getItemCount() - 1) {
            return null;
        }
        int i10 = Integer.MAX_VALUE;
        OrientationHelper orientationHelperOuw = ouw(layoutManager);
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = linearLayoutManager.getChildAt(i11);
            int iAbs = Math.abs(orientationHelperOuw.getDecoratedStart(childAt));
            if (iAbs < i10) {
                view = childAt;
                i10 = iAbs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.SnapHelper
    public final int findTargetSnapPosition(RecyclerView.LayoutManager layoutManager, int i10, int i11) {
        int i12;
        View viewFindSnapView = findSnapView(layoutManager);
        int i13 = -1;
        if (viewFindSnapView == null) {
            return -1;
        }
        int position = layoutManager.getPosition(viewFindSnapView);
        if (layoutManager.canScrollVertically()) {
            if (i11 < 0) {
                i12 = position - 1;
            } else {
                i12 = position + 1;
            }
            i13 = i12;
        }
        return Math.min(layoutManager.getItemCount() - 1, Math.max(i13, 0));
    }

    private OrientationHelper ouw(RecyclerView.LayoutManager layoutManager) {
        OrientationHelper orientationHelper = this.ouw;
        if (orientationHelper == null || orientationHelper.getLayoutManager() != layoutManager) {
            this.ouw = OrientationHelper.createVerticalHelper(layoutManager);
        }
        return this.ouw;
    }
}
