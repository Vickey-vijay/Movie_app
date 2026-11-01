package com.yandex.div.internal.viewpool;

import android.os.Process;
import ck.i;
import ck.p;
import ck.s;
import com.yandex.div.histogram.CpuUsageHistogramReporter;
import com.yandex.div.histogram.util.Cancelable;
import com.yandex.div.internal.util.UtilsKt;
import fk.d;
import java.util.Iterator;
import java.util.PriorityQueue;
import jk.k;
import kotlin.jvm.internal.PropertyReference1Impl;
import mj.r;

/* JADX INFO: compiled from: ViewCreator.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ViewCreator {
    private static final Companion Companion = new Companion(null);
    private final ViewCreatorThread creatorThread;

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class CreateViewTask implements Runnable, Comparable<CreateViewTask> {
        public static final /* synthetic */ k<Object>[] $$delegatedProperties = {s.i(new PropertyReference1Impl(CreateViewTask.class, "channelRef", "getChannelRef()Lcom/yandex/div/internal/viewpool/AdvanceViewPool$Channel;", 0))};
        private final d channelRef$delegate;
        private final int priority;
        private final String viewName;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!p.e(CreateViewTask.class, obj != null ? obj.getClass() : null)) {
                return false;
            }
            p.h(obj, "null cannot be cast to non-null type com.yandex.div.internal.viewpool.ViewCreator.CreateViewTask");
            CreateViewTask createViewTask = (CreateViewTask) obj;
            return p.e(this.viewName, createViewTask.viewName) && this.priority == createViewTask.priority;
        }

        private final AdvanceViewPool.Channel<?> getChannelRef() {
            return (AdvanceViewPool.Channel) this.channelRef$delegate.getValue(this, $$delegatedProperties[0]);
        }

        @Override // java.lang.Comparable
        public int compareTo(CreateViewTask createViewTask) {
            int i10 = this.priority - createViewTask.priority;
            return i10 != 0 ? i10 : !p.e(this.viewName, createViewTask.viewName) ? 1 : 0;
        }

        public final String getViewName() {
            return this.viewName;
        }

        public int hashCode() {
            return ((6913 + this.priority) * 31) + this.viewName.hashCode();
        }

        public CreateViewTask(AdvanceViewPool.Channel<?> channel, int i10) {
            this.priority = i10;
            this.viewName = channel.getViewName();
            this.channelRef$delegate = UtilsKt.weak(channel);
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvanceViewPool.Channel<?> channelRef = getChannelRef();
            if (channelRef != null) {
                channelRef.createAndEnqueueView();
            }
        }
    }

    /* JADX INFO: compiled from: ViewCreator.kt */
    public static final class ViewCreatorThread extends Thread {
        private final CpuUsageHistogramReporter cpuUsageHistogramReporter;
        private volatile String currentViewName;
        private final BatchBlockingQueue<CreateViewTask> taskQueue;

        private final void createView() throws InterruptedException {
            CreateViewTask createViewTaskPoll = this.taskQueue.poll();
            if (createViewTaskPoll == null) {
                try {
                    setPriority(3);
                    createViewTaskPoll = this.taskQueue.take();
                    setPriority(5);
                } catch (Throwable th2) {
                    setPriority(5);
                    throw th2;
                }
            }
            this.currentViewName = createViewTaskPoll.getViewName();
            createViewTaskPoll.run();
            this.currentViewName = null;
        }

        public final String getCurrentViewName() {
            return this.currentViewName;
        }

        public final BatchBlockingQueue<CreateViewTask> getTaskQueue() {
            return this.taskQueue;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Cancelable cancelableStartReporting = this.cpuUsageHistogramReporter.startReporting("Div.ViewPool.CPU", Process.myTid());
            while (true) {
                try {
                    try {
                        createView();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        cancelableStartReporting.cancel();
                        return;
                    }
                } catch (Throwable th2) {
                    cancelableStartReporting.cancel();
                    throw th2;
                }
            }
        }

        public ViewCreatorThread(String str, CpuUsageHistogramReporter cpuUsageHistogramReporter) {
            super(str);
            this.cpuUsageHistogramReporter = cpuUsageHistogramReporter;
            this.taskQueue = new BatchBlockingQueue<>(new PriorityQueue(32));
            setPriority(5);
        }
    }

    public final void request$div_release(AdvanceViewPool.Channel<?> channel, int i10) {
        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, i10));
    }

    public ViewCreator(CpuUsageHistogramReporter cpuUsageHistogramReporter) {
        ViewCreatorThread viewCreatorThread = new ViewCreatorThread("ViewPoolThread", cpuUsageHistogramReporter);
        this.creatorThread = viewCreatorThread;
        viewCreatorThread.start();
    }

    public final void promote$div_release(AdvanceViewPool.Channel<?> channel) {
        if (!p.e(channel.getViewName(), this.creatorThread.getCurrentViewName()) && !channel.getNotEmpty()) {
            BatchBlockingQueue<CreateViewTask> taskQueue = this.creatorThread.getTaskQueue();
            ((BatchBlockingQueue) taskQueue).lock.lock();
            try {
                if (!p.e(channel.getViewName(), this.creatorThread.getCurrentViewName()) && !channel.getNotEmpty()) {
                    taskQueue = this.creatorThread.getTaskQueue();
                    ((BatchBlockingQueue) taskQueue).lock.lock();
                    try {
                        Iterator it = ((BatchBlockingQueue) taskQueue).queue.iterator();
                        while (it.hasNext()) {
                            if (p.e(((CreateViewTask) it.next()).getViewName(), channel.getViewName())) {
                                it.remove();
                                break;
                            }
                        }
                        ((BatchBlockingQueue) taskQueue).lock.unlock();
                        this.creatorThread.getTaskQueue().offer(new CreateViewTask(channel, -1));
                        r rVar = r.f64562a;
                        return;
                    } finally {
                        ((BatchBlockingQueue) taskQueue).lock.unlock();
                    }
                }
                ((BatchBlockingQueue) taskQueue).lock.unlock();
            } catch (Throwable th2) {
                ((BatchBlockingQueue) taskQueue).lock.unlock();
                throw th2;
            }
        }
    }
}
