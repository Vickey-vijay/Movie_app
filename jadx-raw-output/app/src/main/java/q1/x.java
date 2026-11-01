package q1;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import androidx.annotation.VisibleForTesting;
import com.facebook.GraphRequest;
import java.net.HttpURLConnection;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: GraphRequestAsyncTask.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u0000 \"2\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\rB\u0019\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010 B\u0011\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u001f\u0010!J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0017J\u0016\u0010\n\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0014J+\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0017¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\n\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R4\u0010\u001e\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00182\u000e\u0010\u0019\u001a\n\u0018\u00010\u0017j\u0004\u0018\u0001`\u00188\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006#"}, d2 = {"Lq1/x;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "", "Lq1/z;", "", "toString", "Lmj/r;", "onPreExecute", "result", "b", "", "params", "a", "([Ljava/lang/Void;)Ljava/util/List;", "Ljava/net/HttpURLConnection;", "Ljava/net/HttpURLConnection;", "connection", "Lq1/y;", "Lq1/y;", "getRequests", "()Lq1/y;", "requests", "Ljava/lang/Exception;", "Lkotlin/Exception;", "<set-?>", "c", "Ljava/lang/Exception;", "getException", "()Ljava/lang/Exception;", "exception", "<init>", "(Ljava/net/HttpURLConnection;Lq1/y;)V", "(Lq1/y;)V", "d", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public class x extends AsyncTask<Void, Void, List<? extends z>> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f66372e = x.class.getCanonicalName();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final HttpURLConnection connection;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final y requests;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Exception exception;

    public x(HttpURLConnection httpURLConnection, y yVar) {
        ck.p.j(yVar, "requests");
        this.connection = httpURLConnection;
        this.requests = yVar;
    }

    public String toString() {
        String str = "{RequestAsyncTask:  connection: " + this.connection + ", requests: " + this.requests + com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e;
        ck.p.i(str, "StringBuilder()\n        .append(\"{RequestAsyncTask: \")\n        .append(\" connection: \")\n        .append(connection)\n        .append(\", requests: \")\n        .append(requests)\n        .append(\"}\")\n        .toString()");
        return str;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public x(y yVar) {
        this(null, yVar);
        ck.p.j(yVar, "requests");
    }

    @VisibleForTesting(otherwise = 4)
    public List<z> a(Void... params) {
        List<z> listO;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                ck.p.j(params, "params");
                try {
                    HttpURLConnection httpURLConnection = this.connection;
                    if (httpURLConnection == null) {
                        listO = this.requests.h();
                    } else {
                        listO = GraphRequest.INSTANCE.o(httpURLConnection, this.requests);
                    }
                    return listO;
                } catch (Exception e10) {
                    this.exception = e10;
                    return null;
                }
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
            return null;
        }
    }

    public void b(List<z> list) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                ck.p.j(list, "result");
                super.onPostExecute(list);
                Exception exc = this.exception;
                if (exc != null) {
                    com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                    String str = f66372e;
                    ck.w wVar = ck.w.f6066a;
                    String str2 = String.format("onPostExecute: exception encountered during request: %s", Arrays.copyOf(new Object[]{exc.getMessage()}, 1));
                    ck.p.i(str2, "java.lang.String.format(format, *args)");
                    com.facebook.internal.j0.e0(str, str2);
                }
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ List<? extends z> doInBackground(Void[] voidArr) {
        if (i2.a.d(this)) {
            return null;
        }
        try {
            if (i2.a.d(this)) {
                return null;
            }
            try {
                return a(voidArr);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return null;
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(List<? extends z> list) {
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                b(list);
            } catch (Throwable th2) {
                i2.a.b(th2, this);
            }
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }

    @Override // android.os.AsyncTask
    @VisibleForTesting(otherwise = 4)
    public void onPreExecute() {
        Handler handler;
        if (i2.a.d(this)) {
            return;
        }
        try {
            if (i2.a.d(this)) {
                return;
            }
            try {
                super.onPreExecute();
                if (t.D()) {
                    com.facebook.internal.j0 j0Var = com.facebook.internal.j0.f14425a;
                    String str = f66372e;
                    ck.w wVar = ck.w.f6066a;
                    String str2 = String.format("execute async task: %s", Arrays.copyOf(new Object[]{this}, 1));
                    ck.p.i(str2, "java.lang.String.format(format, *args)");
                    com.facebook.internal.j0.e0(str, str2);
                }
                if (this.requests.getCallbackHandler() == null) {
                    if (Thread.currentThread() instanceof HandlerThread) {
                        handler = new Handler();
                    } else {
                        handler = new Handler(Looper.getMainLooper());
                    }
                    this.requests.A(handler);
                    return;
                }
                return;
            } catch (Throwable th2) {
                i2.a.b(th2, this);
                return;
            }
            i2.a.b(th, this);
        } catch (Throwable th3) {
            i2.a.b(th3, this);
        }
    }
}
