package yads;

import android.media.MediaDrmResetException;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vk0 {
    @DoNotInline
    public static boolean a(@Nullable Throwable th2) {
        return th2 instanceof MediaDrmResetException;
    }
}
