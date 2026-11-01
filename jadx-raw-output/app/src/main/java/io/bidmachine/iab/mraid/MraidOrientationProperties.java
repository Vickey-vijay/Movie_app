package io.bidmachine.iab.mraid;

import android.content.Context;
import androidx.annotation.NonNull;
import com.ironsource.C3426d4;
import java.util.Arrays;

/* JADX INFO: loaded from: classes10.dex */
public final class MraidOrientationProperties {
    public static final int FORCE_ORIENTATION_LANDSCAPE = 1;
    public static final int FORCE_ORIENTATION_NONE = 2;
    public static final int FORCE_ORIENTATION_PORTRAIT = 0;
    public boolean allowOrientationChange;
    public int forceOrientation;

    public MraidOrientationProperties(boolean z10, int i10) {
        this.allowOrientationChange = z10;
        this.forceOrientation = i10;
    }

    public static int forceOrientationFromString(String str) {
        int iIndexOf = Arrays.asList(C3426d4.i.D, C3426d4.i.C, "none").indexOf(str);
        if (iIndexOf != -1) {
            return iIndexOf;
        }
        return 2;
    }

    public String forceOrientationString() {
        int i10 = this.forceOrientation;
        if (i10 == 0) {
            return C3426d4.i.D;
        }
        if (i10 != 1) {
            return i10 != 2 ? "error" : "none";
        }
        return C3426d4.i.C;
    }

    public int obtainTargetActivityOrientation(@NonNull Context context) {
        int i10 = context.getResources().getConfiguration().orientation == 1 ? 1 : 0;
        int i11 = this.forceOrientation;
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        if (this.allowOrientationChange) {
            return -1;
        }
        return i10;
    }

    @NonNull
    public String toString() {
        return "MRAIDOrientationProperties{allowOrientationChange=" + this.allowOrientationChange + ", forceOrientation=" + forceOrientationString() + '}';
    }
}
