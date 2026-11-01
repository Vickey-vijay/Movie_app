package com.vungle.ads.internal.task;

import android.content.Context;
import android.os.Bundle;
import bk.a;
import ck.i;
import ck.p;
import com.ironsource.sdk.controller.f;
import com.vungle.ads.BuildConfig;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.internal.Constants;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.Logger;
import com.vungle.ads.internal.util.PathProvider;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;
import io.bidmachine.iab.vast.tags.VastTagName;
import java.io.File;
import java.io.IOException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.b;
import me.goldze.mvvmhabit.base.ContainerActivity;
import mj.g;
import nj.q0;

/* JADX INFO: compiled from: CleanupJob.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0019\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u00020\u0002H\u0002J\b\u0010\u0007\u001a\u00020\u0002H\u0002J\b\u0010\b\u001a\u00020\u0002H\u0002J\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001e²\u0006\f\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob;", "Lcom/vungle/ads/internal/task/Job;", "Lmj/r;", "dropV6Data", "dropV700Data", "dropV730TempData", "dropV742TpatData", "dropV750Data", "checkIfSdkUpgraded", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "Lcom/vungle/ads/internal/task/JobRunner;", "jobRunner", "", "onRunJob", "Landroid/content/Context;", GAMConfig.KEY_CONTEXT, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Lcom/vungle/ads/internal/util/PathProvider;", "pathProvider", "Lcom/vungle/ads/internal/util/PathProvider;", "getPathProvider", "()Lcom/vungle/ads/internal/util/PathProvider;", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/util/PathProvider;)V", VastTagName.COMPANION, "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
public final class CleanupJob implements Job {
    private static final String AD_ID_KEY = "AD_ID_KEY";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String TAG = "CleanupJob";
    private final Context context;
    private final PathProvider pathProvider;

    /* JADX INFO: compiled from: CleanupJob.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/vungle/ads/internal/task/CleanupJob$Companion;", "", "()V", CleanupJob.AD_ID_KEY, "", "TAG", "makeJobInfo", "Lcom/vungle/ads/internal/task/JobInfo;", f.b.f30919c, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public static /* synthetic */ JobInfo makeJobInfo$default(Companion companion, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            return companion.makeJobInfo(str);
        }

        public final JobInfo makeJobInfo(String adId) {
            JobInfo priority = new JobInfo(CleanupJob.TAG).setPriority(0);
            Bundle bundle = new Bundle();
            if (adId != null) {
                bundle.putString(CleanupJob.AD_ID_KEY, adId);
            }
            return priority.setExtras(bundle).setUpdateCurrent(adId == null);
        }
    }

    public CleanupJob(Context context, PathProvider pathProvider) {
        p.j(context, GAMConfig.KEY_CONTEXT);
        p.j(pathProvider, "pathProvider");
        this.context = context;
        this.pathProvider = pathProvider;
    }

    private final void checkIfSdkUpgraded() {
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        final Context context = this.context;
        g gVarB = b.b(LazyThreadSafetyMode.SYNCHRONIZED, new a<FilePreferences>() { // from class: com.vungle.ads.internal.task.CleanupJob$checkIfSdkUpgraded$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.persistence.FilePreferences, java.lang.Object] */
            @Override // bk.a
            public final FilePreferences invoke() {
                return ServiceLocator.INSTANCE.getInstance(context).getService(FilePreferences.class);
            }
        });
        int i10 = m3269checkIfSdkUpgraded$lambda4(gVarB).getInt("VERSION_CODE", -1);
        if (i10 < 70602) {
            if (i10 < 70000) {
                dropV6Data();
            }
            if (i10 < 70100) {
                dropV700Data();
            }
            if (i10 < 70301) {
                dropV730TempData();
            }
            if (i10 < 70500) {
                dropV742TpatData();
            }
            if (i10 < 70600) {
                dropV750Data();
            }
            m3269checkIfSdkUpgraded$lambda4(gVarB).put("VERSION_CODE", BuildConfig.VERSION_CODE).apply();
        }
    }

    private final void dropV6Data() {
        Logger.INSTANCE.d(TAG, "CleanupJob: drop old files data");
        File file = new File(this.context.getNoBackupFilesDir(), "vungle_db");
        if (file.exists()) {
            FileUtility.delete$default(file, null, 2, null);
            FileUtility.delete$default(new File(file.getPath() + "-journal"), null, 2, null);
        } else {
            this.context.deleteDatabase("vungle_db");
        }
        String string = this.context.getSharedPreferences("com.vungle.sdk", 0).getString("cache_path", null);
        this.context.deleteSharedPreferences("com.vungle.sdk");
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        p.i(noBackupFilesDir, "context.noBackupFilesDir");
        FileUtility.delete$default(new File(noBackupFilesDir, "vungle_settings"), null, 2, null);
        if (string != null) {
            FileUtility.delete$default(new File(string), null, 2, null);
        }
    }

    private final void dropV700Data() {
        FileUtility.delete$default(new File(this.context.getApplicationInfo().dataDir, "vungle"), null, 2, null);
    }

    private final void dropV730TempData() {
        try {
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "vungleSettings"), null, 2, null);
            FileUtility.delete$default(new File(this.pathProvider.getSharedPrefsDir(), "failedTpatSet"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete temp data", e10);
        }
    }

    private final void dropV742TpatData() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "failedTpats"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "failedGenericTpats"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete 742 tpat data", e10);
        }
    }

    private final void dropV750Data() {
        File noBackupFilesDir = this.context.getNoBackupFilesDir();
        try {
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/downloads"), null, 2, null);
            FileUtility.delete$default(new File(noBackupFilesDir, "vungle_cache/js"), null, 2, null);
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Failed to delete 750 data", e10);
        }
    }

    public final Context getContext() {
        return this.context;
    }

    public final PathProvider getPathProvider() {
        return this.pathProvider;
    }

    @Override // com.vungle.ads.internal.task.Job
    public int onRunJob(Bundle bundle, JobRunner jobRunner) {
        File downloadsDirForAd;
        p.j(bundle, ContainerActivity.BUNDLE);
        p.j(jobRunner, "jobRunner");
        File vmDir = this.pathProvider.getVmDir();
        String string = bundle.getString(AD_ID_KEY);
        if (string == null || (downloadsDirForAd = this.pathProvider.getDownloadsDirForAd(string)) == null) {
            downloadsDirForAd = vmDir;
        }
        Logger.INSTANCE.d(TAG, "CleanupJob: Current directory snapshot");
        try {
            if (!p.e(downloadsDirForAd, vmDir)) {
                FileUtility.delete$default(downloadsDirForAd, null, 2, null);
                return 0;
            }
            checkIfSdkUpgraded();
            FileUtility.deleteContents(downloadsDirForAd, q0.j(Constants.OM_SDK_JS, Constants.OM_SESSION_JS));
            return 0;
        } catch (IOException unused) {
            return 1;
        }
    }

    /* JADX INFO: renamed from: checkIfSdkUpgraded$lambda-4, reason: not valid java name */
    private static final FilePreferences m3269checkIfSdkUpgraded$lambda4(g<FilePreferences> gVar) {
        return gVar.getValue();
    }
}
