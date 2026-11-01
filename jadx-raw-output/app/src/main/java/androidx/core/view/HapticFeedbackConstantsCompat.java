package androidx.core.view;

import android.os.Build;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes8.dex */
public final class HapticFeedbackConstantsCompat {
    public static final int CLOCK_TICK = 4;
    public static final int CONFIRM = 16;
    public static final int CONTEXT_CLICK = 6;
    public static final int DRAG_START = 25;

    @VisibleForTesting
    public static final int FIRST_CONSTANT_INT = 0;
    public static final int FLAG_IGNORE_VIEW_SETTING = 1;
    public static final int GESTURE_END = 13;
    public static final int GESTURE_START = 12;
    public static final int GESTURE_THRESHOLD_ACTIVATE = 23;
    public static final int GESTURE_THRESHOLD_DEACTIVATE = 24;
    public static final int KEYBOARD_PRESS = 3;
    public static final int KEYBOARD_RELEASE = 7;
    public static final int KEYBOARD_TAP = 3;

    @VisibleForTesting
    public static final int LAST_CONSTANT_INT = 27;
    public static final int LONG_PRESS = 0;
    public static final int NO_HAPTICS = -1;
    public static final int REJECT = 17;
    public static final int SEGMENT_FREQUENT_TICK = 27;
    public static final int SEGMENT_TICK = 26;
    public static final int TEXT_HANDLE_MOVE = 9;
    public static final int TOGGLE_OFF = 22;
    public static final int TOGGLE_ON = 21;
    public static final int VIRTUAL_KEY = 1;
    public static final int VIRTUAL_KEY_RELEASE = 8;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface HapticFeedbackFlags {
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface HapticFeedbackType {
    }

    private HapticFeedbackConstantsCompat() {
    }

    /* JADX WARN: Code duplicated, block: B:24:0x002c  */
    /* JADX WARN: Code duplicated, block: B:25:0x002e  */
    public static int getFeedbackConstantOrFallback(int i10) {
        if (i10 == -1) {
            return -1;
        }
        int i11 = Build.VERSION.SDK_INT;
        int i12 = 0;
        if (i11 < 34) {
            switch (i10) {
                case 21:
                case 23:
                case 26:
                    i10 = 6;
                    break;
                case 22:
                case 24:
                case 27:
                    i10 = 4;
                    break;
                case 25:
                    i10 = 0;
                    break;
            }
        }
        if (i11 >= 30) {
            i12 = i10;
        } else if (i10 == 12) {
            i12 = 1;
        } else if (i10 == 13) {
            i12 = 6;
        } else if (i10 == 16) {
            i12 = 1;
        } else if (i10 != 17) {
            i12 = i10;
        }
        if (i11 >= 27 || !(i12 == 7 || i12 == 8 || i12 == 9)) {
            return i12;
        }
        return -1;
    }
}
