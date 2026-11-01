package com.yandex.div.internal.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.ListPopupWindow;
import bk.l;
import ck.i;
import ck.p;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.view2.reuse.InputFocusTracker;
import java.util.List;
import mj.r;
import nj.s;

/* JADX INFO: compiled from: SelectView.kt */
/* JADX INFO: loaded from: classes11.dex */
public class SelectView extends EllipsizedTextView {
    private InputFocusTracker focusTracker;
    private l<? super Integer, r> onItemSelectedListener;

    @SuppressLint({"RestrictedApi"})
    private final PopupWindow popupWindow;

    /* JADX INFO: compiled from: SelectView.kt */
    public static class PopupWindow extends ListPopupWindow {
        private final PopupAdapter adapter;
        private final Context context;

        /* JADX INFO: compiled from: SelectView.kt */
        public final class PopupAdapter extends BaseAdapter {
            private List<String> items = s.k();

            @Override // android.widget.Adapter
            public long getItemId(int i10) {
                return i10;
            }

            public PopupAdapter() {
            }

            private final TextView createView() {
                TextView textView = new TextView(PopupWindow.this.context, null, R.attr.spinnerDropDownItemStyle);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, BaseDivViewExtensionsKt.dpToPx(48, textView.getResources().getDisplayMetrics())));
                textView.setTextAlignment(5);
                return textView;
            }

            @Override // android.widget.Adapter
            public int getCount() {
                return this.items.size();
            }

            @Override // android.widget.Adapter
            public String getItem(int i10) {
                return this.items.get(i10);
            }

            @Override // android.widget.Adapter
            public TextView getView(int i10, View view, ViewGroup viewGroup) {
                if (view == null) {
                    view = createView();
                }
                p.h(view, "null cannot be cast to non-null type android.widget.TextView");
                TextView textView = (TextView) view;
                textView.setText(getItem(i10));
                return textView;
            }

            public final void setItems(List<String> list) {
                this.items = list;
                notifyDataSetChanged();
            }
        }

        public PopupWindow(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, 0, 4, null);
        }

        public /* synthetic */ PopupWindow(Context context, AttributeSet attributeSet, int i10, int i11, i iVar) {
            this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? androidx.appcompat.R.attr.listPopupWindowStyle : i10);
        }

        @Override // androidx.appcompat.widget.ListPopupWindow
        public int getInputMethodMode() {
            return 1;
        }

        public PopupAdapter getAdapter() {
            return this.adapter;
        }

        public PopupWindow(Context context, AttributeSet attributeSet, int i10) {
            super(context, attributeSet, i10);
            this.context = context;
            this.adapter = new PopupAdapter();
        }

        public void resetPosition() {
            ListView listView = getListView();
            if (listView != null) {
                listView.setSelectionAfterHeaderView();
            }
        }

        @Override // androidx.appcompat.widget.ListPopupWindow, androidx.appcompat.view.menu.ShowableListMenu
        public void show() {
            if (getListView() == null) {
                super.show();
                ListView listView = getListView();
                if (listView != null) {
                    listView.setChoiceMode(1);
                }
            }
            super.show();
        }
    }

    public SelectView(Context context) {
        super(context, null, 0, 6, null);
        setOnClickListener(new View.OnClickListener() { // from class: com.yandex.div.internal.widget.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SelectView._init_$lambda$1(this.f45844b, view);
            }
        });
        final PopupWindow popupWindow = new PopupWindow(context, null, 0, 6, null);
        popupWindow.setModal(true);
        popupWindow.setAnchorView(this);
        popupWindow.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.yandex.div.internal.widget.b
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                SelectView.popupWindow$lambda$3$lambda$2(this.f45845b, popupWindow, adapterView, view, i10, j10);
            }
        });
        popupWindow.setOverlapAnchor(true);
        popupWindow.setBackgroundDrawable(new ColorDrawable(-1));
        popupWindow.setAdapter(popupWindow.getAdapter());
        this.popupWindow = popupWindow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void popupWindow$lambda$3$lambda$2(SelectView selectView, PopupWindow popupWindow, AdapterView adapterView, View view, int i10, long j10) {
        selectView.sendAccessibilityEvent(4);
        l<? super Integer, r> lVar = selectView.onItemSelectedListener;
        if (lVar != null) {
            lVar.invoke(Integer.valueOf(i10));
        }
        popupWindow.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public String getAccessibilityClassName() {
        return "android.widget.Spinner";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SelectView selectView, View view) {
        InputFocusTracker inputFocusTracker = selectView.focusTracker;
        if (inputFocusTracker != null) {
            BaseDivViewExtensionsKt.clearFocusOnClick(selectView, inputFocusTracker);
        }
        selectView.popupWindow.resetPosition();
        selectView.popupWindow.show();
    }

    public final InputFocusTracker getFocusTracker() {
        return this.focusTracker;
    }

    public final l<Integer, r> getOnItemSelectedListener() {
        return this.onItemSelectedListener;
    }

    public final void setFocusTracker(InputFocusTracker inputFocusTracker) {
        this.focusTracker = inputFocusTracker;
    }

    public final void setItems(List<String> list) {
        this.popupWindow.getAdapter().setItems(list);
    }

    public final void setOnItemSelectedListener(l<? super Integer, r> lVar) {
        this.onItemSelectedListener = lVar;
    }

    @Override // com.yandex.div.internal.widget.EllipsizedTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.popupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCanOpenPopup(true);
        accessibilityNodeInfo.setText(getText());
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10 && this.popupWindow.isShowing()) {
            this.popupWindow.show();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (i10 != 0 && this.popupWindow.isShowing()) {
            this.popupWindow.dismiss();
        }
    }
}
