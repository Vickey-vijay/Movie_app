package gl;

import android.content.Context;
import android.text.TextUtils;
import com.yk.e.inf.IComCallback;
import com.yk.e.util.AdLog;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes2.dex */
public final class e1 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile e1 f53479d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentLinkedQueue f53480a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f53481b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f53482c = 0;

    public final synchronized void a(Context context, IComCallback iComCallback) {
        try {
            AdLog.i("Applovin initSdk");
            String strE = r0.e(context, "OKT_MAX_SDK_KEY");
            if (TextUtils.isEmpty(strE)) {
                iComCallback.onFailed(-1, "Max sdk init failed, sdk key is empty");
                return;
            }
            this.f53480a.offer(new e0(this, context, strE, iComCallback));
            if (!this.f53481b) {
                ((Runnable) this.f53480a.poll()).run();
            }
        } catch (Exception e10) {
            AdLog.ad("init max sdk failed, msg = " + e10.getMessage());
            AdLog.e(e10.getMessage(), e10);
            iComCallback.onFailed(-1, e10.getMessage());
        }
    }
}
