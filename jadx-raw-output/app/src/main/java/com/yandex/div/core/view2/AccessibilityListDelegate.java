package com.yandex.div.core.view2;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;
import ck.p;
import ck.s;
import com.yandex.div.core.view2.AccessibilityListDelegate;
import com.yandex.div.core.view2.backbutton.BackHandlingRecyclerView;
import com.yandex.div.core.view2.backbutton.BackKeyPressedHelper;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.core.widget.DivViewWrapper;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import kotlin.sequences.SequencesKt___SequencesKt;
import qj.b;

/* JADX INFO: compiled from: AccessibilityListDelegate.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessibilityListDelegate extends RecyclerViewAccessibilityDelegate {
    private boolean isItemsFocusActive;
    private AccessibilityDelegateCompat itemDelegate;
    private final ArrayList<ViewAccessibilityState> list;
    private final BackHandlingRecyclerView recyclerView;
    private final ViewTreeObserver.OnGlobalLayoutListener visibilityListener;

    /* JADX INFO: compiled from: AccessibilityListDelegate.kt */
    public final class ItemAccessibilityDelegate extends RecyclerViewAccessibilityDelegate.ItemDelegate {
        public ItemAccessibilityDelegate() {
            super(AccessibilityListDelegate.this);
        }

        @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate.ItemDelegate, androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.setClassName(s.b(Button.class).d());
            AccessibilityListDelegate.this.updateItemAccessibility(view);
        }
    }

    /* JADX INFO: compiled from: AccessibilityListDelegate.kt */
    public static final class ViewAccessibilityState {
        private final int accessibilityState;
        private final WeakReference<View> view;

        public final int getAccessibilityState() {
            return this.accessibilityState;
        }

        public final WeakReference<View> getView() {
            return this.view;
        }

        public ViewAccessibilityState(WeakReference<View> weakReference, int i10) {
            this.view = weakReference;
            this.accessibilityState = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void clearItemsFocus() {
        setItemsFocusActive(false);
        restoreAccessibilityState();
    }

    private final void focusChildren() {
        setItemsFocusActive(true);
        makeInaccessibleAllOtherViews(this.recyclerView);
        View firstChild = getFirstChild(this.recyclerView);
        View unwrap = firstChild != null ? getUnwrap(firstChild) : null;
        if (unwrap != null) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(unwrap);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
        boolean z10;
        if (i10 == 16) {
            focusChildren();
            z10 = true;
        } else {
            z10 = false;
        }
        return super.performAccessibilityAction(view, i10, bundle) || z10;
    }

    private final void focusContainer() {
        BaseDivViewExtensionsKt.gainAccessibilityFocus(this.recyclerView);
        clearItemsFocus();
    }

    private final View getUnwrap(View view) {
        View child;
        return (!(view instanceof DivViewWrapper) || (child = ((DivViewWrapper) view).getChild()) == null) ? view : child;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean onBackPressed() {
        if (!this.isItemsFocusActive) {
            return false;
        }
        focusContainer();
        return true;
    }

    private final void restoreAccessibilityState() {
        for (ViewAccessibilityState viewAccessibilityState : this.list) {
            View view = viewAccessibilityState.getView().get();
            if (view != null) {
                view.setImportantForAccessibility(viewAccessibilityState.getAccessibilityState());
            }
        }
        this.list.clear();
    }

    private final void setItemsFocusActive(boolean z10) {
        if (this.isItemsFocusActive == z10) {
            return;
        }
        this.isItemsFocusActive = z10;
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i10));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateItemAccessibility(View view) {
        view.setImportantForAccessibility(this.isItemsFocusActive ? 1 : 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void visibilityListener$lambda$0(AccessibilityListDelegate accessibilityListDelegate) {
        if (accessibilityListDelegate.isItemsFocusActive) {
            if (accessibilityListDelegate.recyclerView.getVisibility() == 0) {
                return;
            }
            accessibilityListDelegate.clearItemsFocus();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    public AccessibilityDelegateCompat getItemDelegate() {
        AccessibilityDelegateCompat accessibilityDelegateCompat = this.itemDelegate;
        if (accessibilityDelegateCompat != null) {
            return accessibilityDelegateCompat;
        }
        ItemAccessibilityDelegate itemAccessibilityDelegate = new ItemAccessibilityDelegate();
        this.itemDelegate = itemAccessibilityDelegate;
        return itemAccessibilityDelegate;
    }

    public AccessibilityListDelegate(BackHandlingRecyclerView backHandlingRecyclerView) {
        super(backHandlingRecyclerView);
        this.recyclerView = backHandlingRecyclerView;
        this.list = new ArrayList<>();
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: wd.a
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AccessibilityListDelegate.visibilityListener$lambda$0(this.f74039b);
            }
        };
        this.visibilityListener = onGlobalLayoutListener;
        if (backHandlingRecyclerView.isAttachedToWindow()) {
            backHandlingRecyclerView.getViewTreeObserver().addOnGlobalLayoutListener(onGlobalLayoutListener);
        }
        backHandlingRecyclerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.1
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                AccessibilityListDelegate.this.recyclerView.getViewTreeObserver().removeOnGlobalLayoutListener(AccessibilityListDelegate.this.visibilityListener);
                AccessibilityListDelegate.this.clearItemsFocus();
            }
        });
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i10));
        }
        this.recyclerView.setOnBackClickListener(new BackKeyPressedHelper.OnBackClickListener() { // from class: com.yandex.div.core.view2.AccessibilityListDelegate.3
            @Override // com.yandex.div.core.view2.backbutton.BackKeyPressedHelper.OnBackClickListener
            public boolean onBackClick() {
                return AccessibilityListDelegate.this.onBackPressed();
            }
        });
    }

    private final View getFirstChild(ViewGroup viewGroup) {
        return (View) SequencesKt___SequencesKt.M(ViewGroupKt.getChildren(viewGroup), b.b(AccessibilityListDelegate$firstChild$1.INSTANCE, AccessibilityListDelegate$firstChild$2.INSTANCE));
    }

    private final void makeInaccessibleAllOtherViews(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        ViewParent parent = viewGroup.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup2 = (ViewGroup) parent;
        } else {
            viewGroup2 = null;
        }
        if (viewGroup2 == null || p.e(viewGroup, viewGroup2.getRootView())) {
            return;
        }
        for (View view : ViewGroupKt.getChildren(viewGroup2)) {
            if (!p.e(view, viewGroup) && view.getImportantForAccessibility() != 4) {
                this.list.add(new ViewAccessibilityState(new WeakReference(view), view.getImportantForAccessibility()));
                view.setImportantForAccessibility(4);
            }
        }
        makeInaccessibleAllOtherViews(viewGroup2);
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate, androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        String strD;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (this.isItemsFocusActive) {
            strD = s.b(RecyclerView.class).d();
        } else {
            strD = s.b(Button.class).d();
        }
        accessibilityNodeInfoCompat.setClassName(strD);
        accessibilityNodeInfoCompat.addAction(16);
        accessibilityNodeInfoCompat.setClickable(true);
        accessibilityNodeInfoCompat.setImportantForAccessibility(true);
        accessibilityNodeInfoCompat.setScreenReaderFocusable(true);
        BackHandlingRecyclerView backHandlingRecyclerView = this.recyclerView;
        int childCount = backHandlingRecyclerView.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            updateItemAccessibility(backHandlingRecyclerView.getChildAt(i10));
        }
    }
}
