package yads;

import android.media.MediaFormat;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ql1 {
    public static void a(MediaFormat mediaFormat, String str, int i10) {
        if (i10 != -1) {
            mediaFormat.setInteger(str, i10);
        }
    }
}
