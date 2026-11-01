package com.unity3d.ads.core.domain.work;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkManager;
import ck.i;
import ck.p;

/* JADX INFO: compiled from: BackgroundWorker.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BackgroundWorker {
    public static final Companion Companion = new Companion(null);
    public static final String TAG = "UnityAdsBackgroundWorker";
    private final WorkManager workManager;

    /* JADX INFO: compiled from: BackgroundWorker.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }
    }

    public BackgroundWorker(Context context) {
        p.j(context, "applicationContext");
        WorkManager workManager = WorkManager.getInstance(context);
        p.i(workManager, "getInstance(applicationContext)");
        this.workManager = workManager;
    }

    public final WorkManager getWorkManager() {
        return this.workManager;
    }

    public final /* synthetic */ <T extends UniversalRequestJob> void invoke(UniversalRequestWorkerData universalRequestWorkerData) {
        p.j(universalRequestWorkerData, "universalRequestWorkerData");
        p.p(4, "T");
        OneTimeWorkRequest oneTimeWorkRequestBuild = new OneTimeWorkRequest.Builder(ListenableWorker.class).setInputData(universalRequestWorkerData.invoke()).addTag(TAG).build();
        p.i(oneTimeWorkRequestBuild, "OneTimeWorkRequestBuilde…TAG)\n            .build()");
        getWorkManager().enqueue(oneTimeWorkRequestBuild);
    }
}
