package gl;

import android.app.Activity;
import com.yk.e.util.AdLog;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes3.dex */
public final class k1 implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Activity f53527b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f53528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0 f53529d;

    public k1(Activity activity, String str, a0 a0Var) {
        this.f53527b = activity;
        this.f53528c = str;
        this.f53529d = a0Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0078  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r3v4 */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Exception e10;
        HttpURLConnection httpURLConnection;
        int responseCode;
        ?? r10 = this.f53528c;
        AdLog.d("checkUrl4Head url = " + r10);
        ?? r11 = 0;
        try {
            try {
                httpURLConnection = (HttpURLConnection) new URL(r10).openConnection();
                try {
                    httpURLConnection.setRequestMethod("HEAD");
                    httpURLConnection.setReadTimeout(1500);
                    httpURLConnection.setConnectTimeout(1500);
                    responseCode = httpURLConnection.getResponseCode();
                    httpURLConnection.disconnect();
                    r10 = httpURLConnection;
                } catch (Exception e11) {
                    e10 = e11;
                    AdLog.e("checkUrl4Head err, msg = " + e10.getMessage());
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    responseCode = -1;
                    r10 = httpURLConnection;
                }
            } catch (Throwable th2) {
                th = th2;
                r11 = r10;
                if (r11 != 0) {
                    r11.disconnect();
                }
                throw th;
            }
        } catch (Exception e12) {
            e10 = e12;
            httpURLConnection = null;
        } catch (Throwable th3) {
            th = th3;
            if (r11 != 0) {
                r11.disconnect();
            }
            throw th;
        }
        if (responseCode != -1) {
            this.f53527b.runOnUiThread(new c0(this.f53529d, responseCode));
        } else {
            this.f53527b.runOnUiThread(new c0(this.f53529d, responseCode));
        }
    }
}
