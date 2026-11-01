package com.yandex.div.core.view2.backbutton;

import android.view.KeyEvent;
import android.view.View;
import ck.p;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;

/* JADX INFO: compiled from: BackKeyPressedHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class BackKeyPressedHelper {
    private OnBackClickListener mOnBackClickListener;
    private final View mOwnerView;

    /* JADX INFO: compiled from: BackKeyPressedHelper.kt */
    public interface OnBackClickListener {
        boolean onBackClick();
    }

    private final void setupAccessibilityFocus() {
        View rootView;
        if (this.mOnBackClickListener == null || !this.mOwnerView.hasWindowFocus()) {
            return;
        }
        View view = this.mOwnerView;
        if (view.isShown()) {
            BaseDivViewExtensionsKt.gainAccessibilityFocus(view);
        } else {
            if (!view.isAccessibilityFocused() || (rootView = view.getRootView()) == null) {
                return;
            }
            BaseDivViewExtensionsKt.gainAccessibilityFocus(rootView);
        }
    }

    public final boolean onKeyAction(int i10, KeyEvent keyEvent) {
        if (this.mOnBackClickListener == null || i10 != 4) {
            return false;
        }
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = this.mOwnerView.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = this.mOwnerView.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        OnBackClickListener onBackClickListener = this.mOnBackClickListener;
        p.g(onBackClickListener);
        return onBackClickListener.onBackClick();
    }

    public final void onWindowFocusChanged(boolean z10) {
        if (z10) {
            setupAccessibilityFocus();
        }
    }

    public final void setOnBackClickListener(OnBackClickListener onBackClickListener) {
        this.mOnBackClickListener = onBackClickListener;
        setupAccessibilityFocus();
    }

    public BackKeyPressedHelper(View view) {
        this.mOwnerView = view;
    }

    public final void onVisibilityChanged() {
        setupAccessibilityFocus();
    }
}
