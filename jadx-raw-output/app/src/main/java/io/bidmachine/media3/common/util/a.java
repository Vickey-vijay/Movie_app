package io.bidmachine.media3.common.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: SystemHandlerWrapper.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements HandlerWrapper {
    private static final int MAX_POOL_SIZE = 50;

    @GuardedBy("messagePool")
    private static final List<b> messagePool = new ArrayList(50);
    private final Handler handler;

    /* JADX INFO: compiled from: SystemHandlerWrapper.java */
    public static final class b implements HandlerWrapper.Message {

        @Nullable
        private a handler;

        @Nullable
        private Message message;

        private b() {
        }

        private void recycle() {
            this.message = null;
            this.handler = null;
            a.recycleMessage(this);
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public HandlerWrapper getTarget() {
            return (HandlerWrapper) Assertions.checkNotNull(this.handler);
        }

        public boolean sendAtFrontOfQueue(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) Assertions.checkNotNull(this.message));
            recycle();
            return zSendMessageAtFrontOfQueue;
        }

        @Override // io.bidmachine.media3.common.util.HandlerWrapper.Message
        public void sendToTarget() {
            ((Message) Assertions.checkNotNull(this.message)).sendToTarget();
            recycle();
        }

        public b setMessage(Message message, a aVar) {
            this.message = message;
            this.handler = aVar;
            return this;
        }
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i10) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i10), this);
    }

    private static b obtainSystemMessage() {
        b bVar;
        List<b> list = messagePool;
        synchronized (list) {
            bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void recycleMessage(b bVar) {
        List<b> list = messagePool;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(bVar);
            }
        }
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public Looper getLooper() {
        return this.handler.getLooper();
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean hasMessages(int i10) {
        Assertions.checkArgument(i10 != 0);
        return this.handler.hasMessages(i10);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i10, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i10, obj), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean post(Runnable runnable) {
        return this.handler.post(runnable);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postAtFrontOfQueue(Runnable runnable) {
        return this.handler.postAtFrontOfQueue(runnable);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean postDelayed(Runnable runnable, long j10) {
        return this.handler.postDelayed(runnable, j10);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeCallbacksAndMessages(@Nullable Object obj) {
        this.handler.removeCallbacksAndMessages(obj);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public void removeMessages(int i10) {
        Assertions.checkArgument(i10 != 0);
        this.handler.removeMessages(i10);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessage(int i10) {
        return this.handler.sendEmptyMessage(i10);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageAtTime(int i10, long j10) {
        return this.handler.sendEmptyMessageAtTime(i10, j10);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendEmptyMessageDelayed(int i10, int i11) {
        return this.handler.sendEmptyMessageDelayed(i10, i11);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public boolean sendMessageAtFrontOfQueue(HandlerWrapper.Message message) {
        return ((b) message).sendAtFrontOfQueue(this.handler);
    }

    public a(Handler handler) {
        this.handler = handler;
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i10, int i11, int i12) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i10, i11, i12), this);
    }

    @Override // io.bidmachine.media3.common.util.HandlerWrapper
    public HandlerWrapper.Message obtainMessage(int i10, int i11, int i12, @Nullable Object obj) {
        return obtainSystemMessage().setMessage(this.handler.obtainMessage(i10, i11, i12, obj), this);
    }
}
