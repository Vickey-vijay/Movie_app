package yads;

import android.media.AudioAttributes;
import androidx.annotation.DoNotInline;

/* JADX INFO: loaded from: classes10.dex */
public abstract class nk {
    @DoNotInline
    public static void a(AudioAttributes.Builder builder, int i10) {
        builder.setSpatializationBehavior(i10);
    }
}
