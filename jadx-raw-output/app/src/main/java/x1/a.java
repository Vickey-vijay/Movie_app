package x1;

import com.facebook.appevents.ml.ModelManager;
import com.facebook.internal.p;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import nj.b0;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: IntegrityManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u001c\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002R\u0016\u0010\u000e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\r¨\u0006\u0012"}, d2 = {"Lx1/a;", "", "Lmj/r;", "a", "", "", "parameters", "c", "input", "", "d", "textFeature", "b", "Z", "enabled", "isSampleEnabled", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f74243a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static boolean isSampleEnabled;

    public static final void a() {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            enabled = true;
            p pVar = p.f14475a;
            isSampleEnabled = p.d("FBSDKFeatureIntegritySample", t.m(), false);
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public static final void c(Map<String, String> map) {
        if (i2.a.d(a.class)) {
            return;
        }
        try {
            ck.p.j(map, "parameters");
            if (!enabled || map.isEmpty()) {
                return;
            }
            try {
                List<String> listO0 = b0.O0(map.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : listO0) {
                    String str2 = map.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                    String str3 = str2;
                    a aVar = f74243a;
                    if (aVar.d(str) || aVar.d(str3)) {
                        map.remove(str);
                        if (!isSampleEnabled) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    ck.p.i(string, "restrictiveParamJson.toString()");
                    map.put("_onDeviceParams", string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            i2.a.b(th2, a.class);
        }
    }

    public final String b(String textFeature) {
        String str;
        if (i2.a.d(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            ModelManager modelManager = ModelManager.f14256a;
            String[] strArrQ = ModelManager.q(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{textFeature});
            if (strArrQ == null || (str = strArrQ[0]) == null) {
                return "none";
            }
            return str;
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return null;
        }
    }

    public final boolean d(String input) {
        if (i2.a.d(this)) {
            return false;
        }
        try {
            return !ck.p.e("none", b(input));
        } catch (Throwable th2) {
            i2.a.b(th2, this);
            return false;
        }
    }
}
