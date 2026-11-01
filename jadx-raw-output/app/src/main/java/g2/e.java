package g2;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import ck.p;
import com.facebook.GraphRequest;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.j0;
import f2.j;
import ik.k;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import nj.b0;
import nj.g0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.z;

/* JADX INFO: compiled from: ANRHandler.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\u0004\u001a\u00020\u0002H\u0007R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lg2/e;", "", "Lmj/r;", "c", "d", "Ljava/util/concurrent/atomic/AtomicBoolean;", "b", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f53019a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean enabled = new AtomicBoolean(false);

    public static final synchronized void c() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            if (enabled.getAndSet(true)) {
                return;
            }
            if (t.p()) {
                d();
            }
            b.d();
            return;
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return;
        }
        throw th;
    }

    @VisibleForTesting
    public static final void d() {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
            if (j0.U()) {
                return;
            }
            File[] fileArrL = j.l();
            ArrayList arrayList = new ArrayList(fileArrL.length);
            for (File file : fileArrL) {
                arrayList.add(InstrumentData.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((InstrumentData) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listH0 = b0.H0(arrayList2, new Comparator() { // from class: g2.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return e.e((InstrumentData) obj2, (InstrumentData) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator<Integer> it = k.q(0, Math.min(listH0.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listH0.get(((g0) it).nextInt()));
            }
            j jVar = j.f52827a;
            j.s("anr_reports", jSONArray, new GraphRequest.b() { // from class: g2.d
                @Override // com.facebook.GraphRequest.b
                public final void b(z zVar) {
                    e.f(listH0, zVar);
                }
            });
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }

    public static final int e(InstrumentData instrumentData, InstrumentData instrumentData2) {
        if (i2.a.d(e.class)) {
            return 0;
        }
        try {
            p.i(instrumentData2, "o2");
            return instrumentData.b(instrumentData2);
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
            return 0;
        }
    }

    public static final void f(List list, z zVar) {
        if (i2.a.d(e.class)) {
            return;
        }
        try {
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
        } catch (Throwable th2) {
            i2.a.b(th2, e.class);
        }
    }
}
