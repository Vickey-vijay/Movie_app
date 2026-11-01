package h2;

import android.util.Log;
import androidx.annotation.RestrictTo;
import ck.i;
import ck.p;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.j0;
import com.ironsource.C3605n2;
import f2.j;
import ik.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import nj.b0;
import nj.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.z;

/* JADX INFO: compiled from: CrashHandler.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\bB\u0013\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lh2/c;", "Ljava/lang/Thread$UncaughtExceptionHandler;", "Ljava/lang/Thread;", "t", "", "e", "Lmj/r;", "uncaughtException", "a", "Ljava/lang/Thread$UncaughtExceptionHandler;", "previousHandler", "<init>", "(Ljava/lang/Thread$UncaughtExceptionHandler;)V", "b", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f53663c = c.class.getCanonicalName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f53664d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final Thread.UncaughtExceptionHandler previousHandler;

    /* JADX INFO: renamed from: h2.c$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CrashHandler.kt */
    @Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001c\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Lh2/c$a;", "", "Lmj/r;", "c", "d", "", "MAX_CRASH_REPORT_NUM", "I", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "Lh2/c;", C3605n2.f30210p, "Lh2/c;", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        public final synchronized void c() {
            if (t.p()) {
                d();
            }
            if (c.f53664d != null) {
                Log.w(c.f53663c, "Already enabled!");
            } else {
                c.f53664d = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                Thread.setDefaultUncaughtExceptionHandler(c.f53664d);
            }
        }

        public static final int e(InstrumentData instrumentData, InstrumentData instrumentData2) {
            p.i(instrumentData2, "o2");
            return instrumentData.b(instrumentData2);
        }

        public static final void f(List list, z zVar) {
            p.j(list, "$validReports");
            p.j(zVar, "response");
            try {
                if (zVar.getError() == null) {
                    JSONObject jsonObject = zVar.getJsonObject();
                    if (p.e(jsonObject == null ? null : Boolean.valueOf(jsonObject.getBoolean("success")), Boolean.TRUE)) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((InstrumentData) it.next()).a();
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }

        public final void d() {
            if (j0.U()) {
                return;
            }
            File[] fileArrP = j.p();
            ArrayList arrayList = new ArrayList(fileArrP.length);
            for (File file : fileArrP) {
                arrayList.add(InstrumentData.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listH0 = b0.H0(arrayList2, new Comparator() { // from class: h2.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return c.Companion.e((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = k.q(0, Math.min(listH0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listH0.get(((g0) it).nextInt()));
            }
            j jVar = j.f52827a;
            j.s("crash_reports", jSONArray, new GraphRequest.b() { // from class: h2.b
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    c.Companion.f(listH0, zVar);
                }
            });
        }
    }

    public c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.previousHandler = uncaughtExceptionHandler;
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, i iVar) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th2) {
        p.j(thread, "t");
        p.j(th2, "e");
        if (j.j(th2)) {
            f2.b.c(th2);
            InstrumentData.a aVar = InstrumentData.a.f14416a;
            InstrumentData.a.b(th2, InstrumentData.Type.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.previousHandler;
        if (uncaughtExceptionHandler == null) {
            return;
        }
        uncaughtExceptionHandler.uncaughtException(thread, th2);
    }
}
