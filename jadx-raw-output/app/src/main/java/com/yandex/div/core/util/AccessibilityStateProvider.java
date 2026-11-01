package com.yandex.div.core.util;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: AccessibilityStateProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessibilityStateProvider {
    public static final Companion Companion = new Companion(null);
    private static Boolean touchExplorationEnabled;
    private final boolean a11yConfigurationEnabled;

    /* JADX INFO: compiled from: AccessibilityStateProvider.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final void evaluateTouchModeEnabled(Context context) {
            AccessibilityManager accessibilityManager;
            Boolean boolValueOf;
            if (getTouchExplorationEnabled() != null) {
                return;
            }
            Object systemService = context.getSystemService("accessibility");
            if (systemService instanceof AccessibilityManager) {
                accessibilityManager = (AccessibilityManager) systemService;
            } else {
                accessibilityManager = null;
            }
            if (accessibilityManager != null) {
                boolValueOf = Boolean.valueOf(accessibilityManager.isTouchExplorationEnabled());
            } else {
                boolValueOf = Boolean.FALSE;
            }
            setTouchExplorationEnabled(boolValueOf);
        }

        public final Boolean getTouchExplorationEnabled() {
            return AccessibilityStateProvider.touchExplorationEnabled;
        }

        public final void setTouchExplorationEnabled(Boolean bool) {
            AccessibilityStateProvider.touchExplorationEnabled = bool;
        }
    }

    public final boolean isAccessibilityEnabled(Context context) {
        if (!this.a11yConfigurationEnabled) {
            return false;
        }
        Boolean bool = touchExplorationEnabled;
        if (bool != null) {
            p.g(bool);
            return bool.booleanValue();
        }
        Companion.evaluateTouchModeEnabled(context);
        Boolean bool2 = touchExplorationEnabled;
        p.g(bool2);
        return bool2.booleanValue();
    }

    public AccessibilityStateProvider(boolean z10) {
        this.a11yConfigurationEnabled = z10;
    }
}
