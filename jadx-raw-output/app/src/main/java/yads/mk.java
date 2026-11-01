package yads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes10.dex */
public abstract class mk {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i10) {
        builder.setAllowedCapturePolicy(i10);
    }
}
