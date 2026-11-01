package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.vungle.ads.internal.util.Logger;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: compiled from: VungleJobRunner.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 #2\u00020\u0001:\u0003#$%B!\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\"J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u000f\u0010\n\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner;", "Lcom/vungle/ads/internal/task/JobRunner;", "Lmj/r;", "executePendingJobs", "Lcom/vungle/ads/internal/task/JobInfo;", "jobInfo", "execute", "", "getPendingJobSize$vungle_ads_release", "()I", "getPendingJobSize", "", "tag", "cancelPendingJob", "Lcom/vungle/ads/internal/task/JobCreator;", "creator", "Lcom/vungle/ads/internal/task/JobCreator;", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/concurrent/Executor;", "Lcom/vungle/ads/internal/task/ThreadPriorityHelper;", "threadPriorityHelper", "Lcom/vungle/ads/internal/task/ThreadPriorityHelper;", "", "Lcom/vungle/ads/internal/task/VungleJobRunner$PendingJob;", "pendingJobs", "Ljava/util/List;", "Ljava/lang/Runnable;", "pendingRunnable", "Ljava/lang/Runnable;", "", "nextCheck", "J", "<init>", "(Lcom/vungle/ads/internal/task/JobCreator;Ljava/util/concurrent/Executor;Lcom/vungle/ads/internal/task/ThreadPriorityHelper;)V", VastTagName.COMPANION, "PendingJob", "PendingRunnable", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class VungleJobRunner implements JobRunner {
    private final JobCreator creator;
    private final Executor executor;
    private long nextCheck;
    private final List<PendingJob> pendingJobs;
    private final Runnable pendingRunnable;
    private final ThreadPriorityHelper threadPriorityHelper;
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = VungleJobRunner.class.getSimpleName();

    /* JADX INFO: compiled from: VungleJobRunner.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner$PendingJob;", "", "uptimeMillis", "", "info", "Lcom/vungle/ads/internal/task/JobInfo;", "(JLcom/vungle/ads/internal/task/JobInfo;)V", "getInfo", "()Lcom/vungle/ads/internal/task/JobInfo;", "setInfo", "(Lcom/vungle/ads/internal/task/JobInfo;)V", "getUptimeMillis", "()J", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class PendingJob {
        private JobInfo info;
        private final long uptimeMillis;

        public final JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(JobInfo jobInfo) {
            this.info = jobInfo;
        }

        public PendingJob(long j10, JobInfo jobInfo) {
            this.uptimeMillis = j10;
            this.info = jobInfo;
        }
    }

    /* JADX INFO: compiled from: VungleJobRunner.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\f\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R(\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/vungle/ads/internal/task/VungleJobRunner$PendingRunnable;", "Ljava/lang/Runnable;", "Lmj/r;", "run", "Ljava/lang/ref/WeakReference;", "Lcom/vungle/ads/internal/task/VungleJobRunner;", "runner", "Ljava/lang/ref/WeakReference;", "getRunner", "()Ljava/lang/ref/WeakReference;", "setRunner", "(Ljava/lang/ref/WeakReference;)V", "<init>", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
    public static final class PendingRunnable implements Runnable {
        private WeakReference<VungleJobRunner> runner;

        public PendingRunnable(WeakReference<VungleJobRunner> weakReference) {
            p.j(weakReference, "runner");
            this.runner = weakReference;
        }

        public final WeakReference<VungleJobRunner> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            VungleJobRunner vungleJobRunner = this.runner.get();
            if (vungleJobRunner != null) {
                vungleJobRunner.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<VungleJobRunner> weakReference) {
            p.j(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        long jMin = Long.MAX_VALUE;
        for (PendingJob pendingJob : this.pendingJobs) {
            if (jUptimeMillis >= pendingJob.getUptimeMillis()) {
                this.pendingJobs.remove(pendingJob);
                JobInfo info = pendingJob.getInfo();
                if (info != null) {
                    this.executor.execute(new JobRunnable(info, this.creator, this, this.threadPriorityHelper));
                }
            } else {
                jMin = Math.min(jMin, pendingJob.getUptimeMillis());
            }
        }
        if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
            Handler handler2 = handler;
            handler2.removeCallbacks(this.pendingRunnable);
            handler2.postAtTime(this.pendingRunnable, TAG, jMin);
        }
        this.nextCheck = jMin;
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void cancelPendingJob(String str) {
        p.j(str, "tag");
        ArrayList arrayList = new ArrayList();
        for (PendingJob pendingJob : this.pendingJobs) {
            JobInfo info = pendingJob.getInfo();
            if (p.e(info != null ? info.getJobTag() : null, str)) {
                arrayList.add(pendingJob);
            }
        }
        this.pendingJobs.removeAll(arrayList);
    }

    @Override // com.vungle.ads.internal.task.JobRunner
    public synchronized void execute(JobInfo jobInfo) {
        p.j(jobInfo, "jobInfo");
        JobInfo jobInfoCopy = jobInfo.copy();
        if (jobInfoCopy != null) {
            String jobTag = jobInfoCopy.getJobTag();
            long delay = jobInfoCopy.getDelay();
            jobInfoCopy.setDelay(0L);
            if (jobInfoCopy.getUpdateCurrent()) {
                for (PendingJob pendingJob : this.pendingJobs) {
                    JobInfo info = pendingJob.getInfo();
                    if (p.e(info != null ? info.getJobTag() : null, jobTag)) {
                        Logger.Companion companion = Logger.INSTANCE;
                        String str = TAG;
                        p.i(str, "TAG");
                        companion.d(str, "replacing pending job with new " + jobTag);
                        this.pendingJobs.remove(pendingJob);
                    }
                }
            }
            this.pendingJobs.add(new PendingJob(SystemClock.uptimeMillis() + delay, jobInfoCopy));
            executePendingJobs();
        }
    }

    public VungleJobRunner(JobCreator jobCreator, Executor executor, ThreadPriorityHelper threadPriorityHelper) {
        p.j(jobCreator, "creator");
        p.j(executor, "executor");
        this.creator = jobCreator;
        this.executor = executor;
        this.threadPriorityHelper = threadPriorityHelper;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new PendingRunnable(new WeakReference(this));
    }

    @VisibleForTesting
    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
