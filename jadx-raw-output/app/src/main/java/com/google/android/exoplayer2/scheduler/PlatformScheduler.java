package com.google.android.exoplayer2.scheduler;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.os.PersistableBundle;
import g5.a;
import g5.k0;
import j4.d;

/* JADX INFO: loaded from: classes9.dex */
@TargetApi(21)
public final class PlatformScheduler implements d {

    public static final class PlatformSchedulerService extends JobService {
        @Override // android.app.job.JobService
        public boolean onStopJob(JobParameters jobParameters) {
            return false;
        }

        @Override // android.app.job.JobService
        public boolean onStartJob(JobParameters jobParameters) {
            PlatformScheduler.c("PlatformSchedulerService started");
            PersistableBundle extras = jobParameters.getExtras();
            if (!new Requirements(extras.getInt("requirements")).a(this)) {
                PlatformScheduler.c("Requirements are not met");
                jobFinished(jobParameters, true);
                return false;
            }
            PlatformScheduler.c("Requirements are met");
            String string = extras.getString("service_action");
            String string2 = extras.getString("service_package");
            Intent intent = new Intent((String) a.e(string)).setPackage(string2);
            PlatformScheduler.c("Starting service action: " + string + " package: " + string2);
            k0.G0(this, intent);
            return false;
        }
    }

    public static void c(String str) {
    }
}
