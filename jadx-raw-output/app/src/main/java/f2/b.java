package f2;

import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import ck.p;
import ck.w;
import com.facebook.GraphRequest;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentData;
import com.facebook.internal.j0;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;
import q1.y;
import q1.z;

/* JADX INFO: compiled from: ExceptionAnalyzer.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\nJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u0012\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0001¢\u0006\u0004\b\b\u0010\nR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000b¨\u0006\u000e"}, d2 = {"Lf2/b;", "", "", "d", "()Z", "Lmj/r;", "b", "", "e", "c", "()V", "Z", "enabled", "<init>", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f52824a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    public static final void b() {
        enabled = true;
        if (t.p()) {
            f52824a.e();
        }
    }

    @VisibleForTesting(otherwise = 2)
    public static final boolean d() {
        return false;
    }

    public static final void c(Throwable th2) {
        if (!enabled || d() || th2 == null) {
            return;
        }
        HashSet hashSet = new HashSet();
        StackTraceElement[] stackTrace = th2.getStackTrace();
        p.i(stackTrace, "e.stackTrace");
        for (StackTraceElement stackTraceElement : stackTrace) {
            FeatureManager featureManager = FeatureManager.f14322a;
            String className = stackTraceElement.getClassName();
            p.i(className, "it.className");
            FeatureManager.Feature featureD = FeatureManager.d(className);
            if (featureD != FeatureManager.Feature.Unknown) {
                FeatureManager.c(featureD);
                hashSet.add(featureD.toString());
            }
        }
        if (t.p() && (!hashSet.isEmpty())) {
            InstrumentData.a aVar = InstrumentData.a.f14416a;
            InstrumentData.a.c(new JSONArray((Collection) hashSet)).g();
        }
    }

    public static final void f(InstrumentData instrumentData, z zVar) {
        p.j(instrumentData, "$instrumentData");
        p.j(zVar, "response");
        try {
            if (zVar.getError() == null) {
                JSONObject jSONObjectD = zVar.getJsonObject();
                if (p.e(jSONObjectD == null ? null : Boolean.valueOf(jSONObjectD.getBoolean("success")), Boolean.TRUE)) {
                    instrumentData.a();
                }
            }
        } catch (JSONException unused) {
        }
    }

    @VisibleForTesting(otherwise = 2)
    public final void e() {
        if (j0.U()) {
            return;
        }
        File[] fileArrN = j.n();
        ArrayList arrayList = new ArrayList();
        int length = fileArrN.length;
        int i10 = 0;
        while (i10 < length) {
            File file = fileArrN[i10];
            i10++;
            final InstrumentData instrumentDataD = InstrumentData.a.d(file);
            if (instrumentDataD.f()) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("crash_shield", instrumentDataD.toString());
                    GraphRequest.Companion cVar = GraphRequest.INSTANCE;
                    w wVar = w.f6066a;
                    String str = String.format("%s/instruments", Arrays.copyOf(new Object[]{t.m()}, 1));
                    p.i(str, "java.lang.String.format(format, *args)");
                    arrayList.add(cVar.A(null, str, jSONObject, new GraphRequest.b() { // from class: f2.a
                        @Override // com.facebook.GraphRequest.b
                        public final void b(z zVar) {
                            b.f(instrumentDataD, zVar);
                        }
                    }));
                } catch (JSONException unused) {
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        new y(arrayList).j();
    }
}
