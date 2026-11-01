package g5;

import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: HandlerWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public interface l {
    Looper getLooper();

    Message obtainMessage(int i10, int i11, int i12);

    Message obtainMessage(int i10, int i11, int i12, @Nullable Object obj);

    Message obtainMessage(int i10, @Nullable Object obj);

    void removeMessages(int i10);

    boolean sendEmptyMessage(int i10);

    boolean sendEmptyMessageAtTime(int i10, long j10);
}
