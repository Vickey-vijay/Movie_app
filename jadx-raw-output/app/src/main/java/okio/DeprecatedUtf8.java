package okio;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;

/* JADX INFO: renamed from: okio.-DeprecatedUtf8, reason: invalid class name */
/* JADX INFO: compiled from: -DeprecatedUtf8.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class DeprecatedUtf8 {
    public static final DeprecatedUtf8 INSTANCE = new DeprecatedUtf8();

    private DeprecatedUtf8() {
    }

    public final long size(String str) {
        p.j(str, TypedValues.Custom.S_STRING);
        return Utf8.size$default(str, 0, 0, 3, null);
    }

    public final long size(String str, int i10, int i11) {
        p.j(str, TypedValues.Custom.S_STRING);
        return Utf8.size(str, i10, i11);
    }
}
