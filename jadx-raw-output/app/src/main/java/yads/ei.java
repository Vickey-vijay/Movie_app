package yads;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.ironsource.Z7;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: loaded from: classes2.dex */
public final class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f77078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj.g f77079b = kotlin.b.a(new zh(this));

    public static final lf a(ei eiVar, ApplicationExitInfo applicationExitInfo) {
        eiVar.getClass();
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream == null) {
                return null;
            }
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(traceInputStream));
                try {
                    String strE = yj.k.e(bufferedReader);
                    yj.b.a(bufferedReader, null);
                    yj.b.a(traceInputStream, null);
                    if (strE == null) {
                        return null;
                    }
                    long timestamp = applicationExitInfo.getTimestamp();
                    String description = applicationExitInfo.getDescription();
                    if (description == null) {
                        description = Z7.f27991k;
                    }
                    int importance = applicationExitInfo.getImportance();
                    int pid = applicationExitInfo.getPid();
                    long pss = applicationExitInfo.getPss();
                    long rss = applicationExitInfo.getRss();
                    String processName = applicationExitInfo.getProcessName();
                    applicationExitInfo.getReason();
                    return new lf(timestamp, description, strE, importance, pid, pss, rss, processName, applicationExitInfo.getStatus(), applicationExitInfo.getRealUid());
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        yj.b.a(bufferedReader, th2);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    yj.b.a(traceInputStream, th4);
                    throw th5;
                }
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    public ei(Context context) {
        this.f77078a = context;
    }

    public final List a(int i10, int i11, long j10) {
        ActivityManager activityManager = (ActivityManager) this.f77079b.getValue();
        if (activityManager == null) {
            return nj.s.k();
        }
        return SequencesKt___SequencesKt.T(SequencesKt___SequencesKt.L(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(SequencesKt___SequencesKt.z(nj.b0.S(activityManager.getHistoricalProcessExitReasons(this.f77078a.getPackageName(), 0, i10)), ai.f75524b), new bi(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(i11))), new ci(j10)), new di(this)));
    }
}
