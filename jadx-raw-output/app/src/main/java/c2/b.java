package c2;

import android.content.SharedPreferences;
import android.view.View;
import ck.p;
import com.facebook.internal.j0;
import com.mbridge.msdk.MBridgeConstans;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: PredictionHistoryManager.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0007J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\b\u0010\f\u001a\u00020\u0005H\u0002R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0014¨\u0006\u0018"}, d2 = {"Lc2/b;", "", "", "pathID", "predictedEvent", "Lmj/r;", "a", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "text", "b", "d", "c", "", "Ljava/util/Map;", "clickedViewPaths", "Landroid/content/SharedPreferences;", "Landroid/content/SharedPreferences;", "shardPreferences", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static SharedPreferences shardPreferences;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f5607a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, String> clickedViewPaths = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final AtomicBoolean initialized = new AtomicBoolean(false);

    public static final void a(String str, String str2) {
        if (i2.a.d(b.class)) {
            return;
        }
        try {
            p.j(str, "pathID");
            p.j(str2, "predictedEvent");
            if (!initialized.get()) {
                f5607a.c();
            }
            Map<String, String> map = clickedViewPaths;
            map.put(str, str2);
            SharedPreferences sharedPreferences = shardPreferences;
            if (sharedPreferences == null) {
                p.B("shardPreferences");
                throw null;
            }
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            j0 j0Var = j0.f14425a;
            editorEdit.putString("SUGGESTED_EVENTS_HISTORY", j0.g0(kotlin.collections.a.x(map))).apply();
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
        }
    }

    public static final String b(View view, String text) {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            p.j(view, MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW);
            p.j(text, "text");
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("text", text);
                JSONArray jSONArray = new JSONArray();
                while (view != null) {
                    jSONArray.put(view.getClass().getSimpleName());
                    view = u1.d.j(view);
                }
                jSONObject.put("classname", jSONArray);
            } catch (JSONException unused) {
            }
            j0 j0Var = j0.f14425a;
            return j0.A0(jSONObject.toString());
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public static final String d(String pathID) {
        if (i2.a.d(b.class)) {
            return null;
        }
        try {
            p.j(pathID, "pathID");
            Map<String, String> map = clickedViewPaths;
            if (map.containsKey(pathID)) {
                return map.get(pathID);
            }
            return null;
        } catch (Throwable th2) {
            i2.a.b(th2, b.class);
            return null;
        }
    }

    public final void c() {
        String str = "";
        if (i2.a.d(this)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = initialized;
            if (atomicBoolean.get()) {
                return;
            }
            SharedPreferences sharedPreferences = t.l().getSharedPreferences("com.facebook.internal.SUGGESTED_EVENTS_HISTORY", 0);
            p.i(sharedPreferences, "FacebookSdk.getApplicationContext()\n            .getSharedPreferences(CLICKED_PATH_STORE, Context.MODE_PRIVATE)");
            shardPreferences = sharedPreferences;
            Map<String, String> map = clickedViewPaths;
            j0 j0Var = j0.f14425a;
            SharedPreferences sharedPreferences2 = shardPreferences;
            if (sharedPreferences2 == null) {
                p.B("shardPreferences");
                throw null;
            }
            String string = sharedPreferences2.getString("SUGGESTED_EVENTS_HISTORY", "");
            if (string != null) {
                str = string;
            }
            map.putAll(j0.c0(str));
            atomicBoolean.set(true);
        } catch (Throwable th2) {
            i2.a.b(th2, this);
        }
    }
}
