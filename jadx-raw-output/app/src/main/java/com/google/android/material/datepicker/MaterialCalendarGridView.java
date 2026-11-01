package com.google.android.material.datepicker;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ViewUtils;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
final class MaterialCalendarGridView extends GridView {
    private final Calendar dayCompute;
    private final boolean nestedScrollable;

    public MaterialCalendarGridView(Context context) {
        this(context, null);
    }

    private static boolean skipMonth(@Nullable Long l10, @Nullable Long l11, @Nullable Long l12, @Nullable Long l13) {
        return l10 == null || l11 == null || l12 == null || l13 == null || l12.longValue() > l11.longValue() || l13.longValue() < l10.longValue();
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void gainFocus(int i10, Rect rect) {
        if (i10 == 33) {
            setSelection(getAdapter().lastPositionInMonth());
        } else if (i10 == 130) {
            setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.onFocusChanged(true, i10, rect);
        }
    }

    @Override // android.view.View
    public final void onDraw(@NonNull Canvas canvas) {
        int iDayToPosition;
        int iHorizontalMidPoint;
        int iDayToPosition2;
        int iHorizontalMidPoint2;
        int width;
        int i10;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        MonthAdapter adapter = getAdapter();
        DateSelector<?> dateSelector = adapter.dateSelector;
        CalendarStyle calendarStyle = adapter.calendarStyle;
        Long item = adapter.getItem(adapter.firstPositionInMonth());
        Long item2 = adapter.getItem(adapter.lastPositionInMonth());
        for (Pair<Long, Long> pair : dateSelector.getSelectedRanges()) {
            Long l10 = pair.first;
            if (l10 != null) {
                if (pair.second != null) {
                    long jLongValue = l10.longValue();
                    long jLongValue2 = pair.second.longValue();
                    if (!skipMonth(item, item2, Long.valueOf(jLongValue), Long.valueOf(jLongValue2))) {
                        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
                        if (jLongValue < item.longValue()) {
                            iDayToPosition = adapter.firstPositionInMonth();
                            iHorizontalMidPoint = adapter.isFirstInRow(iDayToPosition) ? 0 : !zIsLayoutRtl ? materialCalendarGridView.getChildAt(iDayToPosition - 1).getRight() : materialCalendarGridView.getChildAt(iDayToPosition - 1).getLeft();
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue);
                            iDayToPosition = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            iHorizontalMidPoint = horizontalMidPoint(materialCalendarGridView.getChildAt(iDayToPosition));
                        }
                        if (jLongValue2 > item2.longValue()) {
                            iDayToPosition2 = Math.min(adapter.lastPositionInMonth(), getChildCount() - 1);
                            iHorizontalMidPoint2 = adapter.isLastInRow(iDayToPosition2) ? getWidth() : !zIsLayoutRtl ? materialCalendarGridView.getChildAt(iDayToPosition2).getRight() : materialCalendarGridView.getChildAt(iDayToPosition2).getLeft();
                        } else {
                            materialCalendarGridView.dayCompute.setTimeInMillis(jLongValue2);
                            iDayToPosition2 = adapter.dayToPosition(materialCalendarGridView.dayCompute.get(5));
                            iHorizontalMidPoint2 = horizontalMidPoint(materialCalendarGridView.getChildAt(iDayToPosition2));
                        }
                        int itemId = (int) adapter.getItemId(iDayToPosition);
                        int itemId2 = (int) adapter.getItemId(iDayToPosition2);
                        while (itemId <= itemId2) {
                            int numColumns = getNumColumns() * itemId;
                            int numColumns2 = (getNumColumns() + numColumns) - 1;
                            View childAt = materialCalendarGridView.getChildAt(numColumns);
                            int top2 = childAt.getTop() + calendarStyle.day.getTopInset();
                            int bottom = childAt.getBottom() - calendarStyle.day.getBottomInset();
                            if (zIsLayoutRtl) {
                                int i11 = iDayToPosition2 > numColumns2 ? 0 : iHorizontalMidPoint2;
                                width = numColumns > iDayToPosition ? getWidth() : iHorizontalMidPoint;
                                i10 = i11;
                            } else {
                                i10 = numColumns > iDayToPosition ? 0 : iHorizontalMidPoint;
                                width = iDayToPosition2 > numColumns2 ? getWidth() : iHorizontalMidPoint2;
                            }
                            canvas.drawRect(i10, top2, width, bottom, calendarStyle.rangeFill);
                            itemId++;
                            materialCalendarGridView = this;
                            adapter = adapter;
                        }
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onFocusChanged(boolean z10, int i10, Rect rect) {
        if (z10) {
            gainFocus(i10, rect);
        } else {
            super.onFocusChanged(false, i10, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i10, int i11) {
        if (!this.nestedScrollable) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(ViewCompat.MEASURED_SIZE_MASK, Integer.MIN_VALUE));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof MonthAdapter)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), MonthAdapter.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.dayCompute = UtcDates.getUtcCalendar();
        if (MaterialDatePicker.isFullscreen(getContext())) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        this.nestedScrollable = MaterialDatePicker.isNestedScrollable(getContext());
        ViewCompat.setAccessibilityDelegate(this, new AccessibilityDelegateCompat() { // from class: com.google.android.material.datepicker.MaterialCalendarGridView.1
            @Override // androidx.core.view.AccessibilityDelegateCompat
            public void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
                super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                accessibilityNodeInfoCompat.setCollectionInfo(null);
            }
        });
    }

    private static int horizontalMidPoint(@NonNull View view) {
        return view.getLeft() + (view.getWidth() / 2);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    @NonNull
    public MonthAdapter getAdapter() {
        return (MonthAdapter) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        getAdapter().notifyDataSetChanged();
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (!super.onKeyDown(i10, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= getAdapter().firstPositionInMonth()) {
            return true;
        }
        if (19 != i10) {
            return false;
        }
        setSelection(getAdapter().firstPositionInMonth());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public void setSelection(int i10) {
        if (i10 < getAdapter().firstPositionInMonth()) {
            super.setSelection(getAdapter().firstPositionInMonth());
        } else {
            super.setSelection(i10);
        }
    }
}
