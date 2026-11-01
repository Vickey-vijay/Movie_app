package com.yandex.div.core.view2;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;

/* JADX INFO: compiled from: DivAccessibilityBinder.kt */
/* JADX INFO: loaded from: classes.dex */
final class ExtensiveAccessibilityDelegate extends AccessibilityDelegateCompat {
    private final String className;
    private final boolean isCheckable;
    private Boolean isChecked;
    private final boolean isHeading;

    public final void setChecked(Boolean bool) {
        this.isChecked = bool;
    }

    public ExtensiveAccessibilityDelegate(String str, boolean z10, boolean z11) {
        this.className = str;
        this.isHeading = z10;
        this.isCheckable = z11;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        boolean z10;
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (this.className.length() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            accessibilityNodeInfoCompat.setClassName(this.className);
        }
        accessibilityNodeInfoCompat.setHeading(this.isHeading);
        if (this.isCheckable) {
            accessibilityNodeInfoCompat.setCheckable(true);
            Boolean bool = this.isChecked;
            if (bool != null) {
                accessibilityNodeInfoCompat.setChecked(bool.booleanValue());
            }
        }
    }
}
