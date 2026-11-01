package sg.bigo.ads.common.form.render.a;

import android.content.Context;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import sg.bigo.ads.api.a.e;
import sg.bigo.ads.common.view.PrivacyCheckBox;

/* JADX INFO: loaded from: classes5.dex */
public final class c implements a.InterfaceC0705a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public Context f69577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Map<String, Object> f69578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f69579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e.c[] f69580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public View f69581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public PrivacyCheckBox f69582f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sg.bigo.ads.common.form.render.c.a f69584h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NonNull
    private Map<String, String> f69585i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public List<a> f69583g = new ArrayList();

    public c(@NonNull e eVar, @Nullable Map<String, Object> map, @NonNull Context context, sg.bigo.ads.common.form.render.c.a aVar) {
        this.f69577a = context;
        this.f69579c = eVar;
        this.f69578b = map;
        this.f69580d = eVar.m();
        this.f69584h = aVar;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, String> entry : this.f69585i.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                try {
                    jSONObject.putOpt(entry.getKey(), entry.getValue());
                } catch (JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // sg.bigo.ads.common.form.render.a.a.InterfaceC0705a
    public final void a(String str, String str2) {
        this.f69585i.put(str, str2);
        sg.bigo.ads.common.form.render.c.a aVar = this.f69584h;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean b() {
        PrivacyCheckBox privacyCheckBox = this.f69582f;
        return privacyCheckBox != null && privacyCheckBox.f70112a;
    }
}
