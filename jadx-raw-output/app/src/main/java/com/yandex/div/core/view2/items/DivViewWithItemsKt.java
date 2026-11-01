package com.yandex.div.core.view2.items;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import bk.p;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div2.DivSizeUnit;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: compiled from: DivViewWithItems.kt */
/* JADX INFO: loaded from: classes.dex */
public final class DivViewWithItemsKt {

    /* JADX INFO: compiled from: DivViewWithItems.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.PREVIOUS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.NEXT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DivSizeUnit.values().length];
            try {
                iArr2[DivSizeUnit.PX.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DivSizeUnit.SP.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DivSizeUnit.DP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollTo(T t10, int i10, DivSizeUnit divSizeUnit, DisplayMetrics displayMetrics, boolean z10) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[divSizeUnit.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                i10 = BaseDivViewExtensionsKt.spToPx(Integer.valueOf(i10), displayMetrics);
            } else {
                if (i11 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i10 = BaseDivViewExtensionsKt.dpToPx(Integer.valueOf(i10), displayMetrics);
            }
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager == null) {
            return;
        }
        p divViewWithItemsKt$scrollTo$scroll$1 = z10 ? new DivViewWithItemsKt$scrollTo$scroll$1(t10) : new DivViewWithItemsKt$scrollTo$scroll$2(t10);
        int orientation = linearLayoutManager.getOrientation();
        if (orientation == 0) {
            divViewWithItemsKt$scrollTo$scroll$1.mo1invoke(Integer.valueOf(i10 - t10.computeHorizontalScrollOffset()), 0);
        } else {
            if (orientation != 1) {
                return;
            }
            divViewWithItemsKt$scrollTo$scroll$1.mo1invoke(0, Integer.valueOf(i10 - t10.computeVerticalScrollOffset()));
        }
    }

    private static final int visibleItemPosition(LinearLayoutManager linearLayoutManager, Direction direction) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i10 == 1) {
            return linearLayoutManager.findLastVisibleItemPosition();
        }
        if (i10 == 2) {
            return linearLayoutManager.findFirstVisibleItemPosition();
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final <T extends RecyclerView> boolean canScroll(T t10) {
        Integer numValueOf;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager != null) {
            numValueOf = Integer.valueOf(linearLayoutManager.getOrientation());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return t10.canScrollHorizontally(1);
        }
        if (numValueOf != null && numValueOf.intValue() == 1) {
            return t10.canScrollVertically(1);
        }
        return false;
    }

    private static final <T extends RecyclerView> int completelyVisibleItemPosition(T t10, Direction direction) {
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager == null) {
            return -1;
        }
        int i10 = WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                if (canScroll(t10)) {
                    return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
                }
                return linearLayoutManager.findLastCompletelyVisibleItemPosition();
            }
            throw new NoWhenBranchMatchedException();
        }
        return linearLayoutManager.findFirstCompletelyVisibleItemPosition();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int currentItem(T t10, Direction direction) {
        boolean z10;
        Integer numValueOf = Integer.valueOf(completelyVisibleItemPosition(t10, direction));
        int iVisibleItemPosition = -1;
        if (numValueOf.intValue() != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager != null) {
            iVisibleItemPosition = visibleItemPosition(linearLayoutManager, direction);
        }
        return iVisibleItemPosition;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int getItemCount(RecyclerView recyclerView) {
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            return layoutManager.getItemCount();
        }
        return 0;
    }

    private static final <T extends RecyclerView> LinearLayoutManager getLinearLayoutManager(T t10) {
        RecyclerView.LayoutManager layoutManager = t10.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollOffset(T t10) {
        Integer numValueOf;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager != null) {
            numValueOf = Integer.valueOf(linearLayoutManager.getOrientation());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            return t10.computeHorizontalScrollOffset();
        }
        return t10.computeVerticalScrollOffset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> int scrollRange(T t10) {
        Integer numValueOf;
        int iComputeVerticalScrollRange;
        int paddingBottom;
        LinearLayoutManager linearLayoutManager = getLinearLayoutManager(t10);
        if (linearLayoutManager != null) {
            numValueOf = Integer.valueOf(linearLayoutManager.getOrientation());
        } else {
            numValueOf = null;
        }
        if (numValueOf != null && numValueOf.intValue() == 0) {
            iComputeVerticalScrollRange = (t10.computeHorizontalScrollRange() - t10.getWidth()) + t10.getPaddingLeft();
            paddingBottom = t10.getPaddingRight();
        } else {
            iComputeVerticalScrollRange = (t10.computeVerticalScrollRange() - t10.getHeight()) + t10.getPaddingTop();
            paddingBottom = t10.getPaddingBottom();
        }
        return iComputeVerticalScrollRange + paddingBottom;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends RecyclerView> void scrollToTheEnd(T t10, DisplayMetrics displayMetrics, boolean z10) {
        scrollTo(t10, scrollRange(t10), DivSizeUnit.PX, displayMetrics, z10);
    }
}
