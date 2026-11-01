package g5;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f53071a;

    @Override // g5.l
    public Message obtainMessage(int i10, @Nullable Object obj) {
        return this.f53071a.obtainMessage(i10, obj);
    }

    @Override // g5.l
    public Looper getLooper() {
        return this.f53071a.getLooper();
    }

    @Override // g5.l
    public Message obtainMessage(int i10, int i11, int i12) {
        return this.f53071a.obtainMessage(i10, i11, i12);
    }

    @Override // g5.l
    public void removeMessages(int i10) {
        this.f53071a.removeMessages(i10);
    }

    @Override // g5.l
    public boolean sendEmptyMessage(int i10) {
        return this.f53071a.sendEmptyMessage(i10);
    }

    @Override // g5.l
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.f53071a.sendEmptyMessageAtTime(i10, j10);
    }

    public e0(Handler handler) {
        this.f53071a = handler;
    }

    @Override // g5.l
    public Message obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return this.f53071a.obtainMessage(i10, i11, i12, obj);
    }
}
