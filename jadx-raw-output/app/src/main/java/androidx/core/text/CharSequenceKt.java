package androidx.core.text;

import android.text.TextUtils;

/* JADX INFO: compiled from: CharSequence.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class CharSequenceKt {
    public static final boolean isDigitsOnly(CharSequence charSequence) {
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(CharSequence charSequence) {
        return TextUtils.getTrimmedLength(charSequence);
    }
}
