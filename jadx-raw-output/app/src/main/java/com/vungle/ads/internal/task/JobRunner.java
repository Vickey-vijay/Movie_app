package com.vungle.ads.internal.task;

import kotlin.Metadata;

/* JADX INFO: compiled from: JobRunner.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/JobRunner;", "", "Lcom/vungle/ads/internal/task/JobInfo;", "jobInfo", "Lmj/r;", "execute", "", "tag", "cancelPendingJob", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public interface JobRunner {
    void cancelPendingJob(String str);

    void execute(JobInfo jobInfo);
}
