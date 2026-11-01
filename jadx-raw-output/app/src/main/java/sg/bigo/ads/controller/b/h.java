package sg.bigo.ads.controller.b;

import android.content.Context;
import android.os.Parcel;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import sg.bigo.ads.api.a.l;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends sg.bigo.ads.common.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, i> f70578a;

    public h(@NonNull Context context) {
        super(context);
    }

    @Override // sg.bigo.ads.common.e
    public final String a() {
        return "bigoad_slots.dat";
    }

    @Nullable
    public final l a(String str) {
        Map<String, i> map = this.f70578a;
        if (map == null || str == null) {
            return null;
        }
        return map.get(str);
    }

    @Nullable
    public final l a(@NonNull sg.bigo.ads.api.b bVar) {
        l lVarH = bVar.h();
        return lVarH != null ? lVarH : a(bVar.f69319a);
    }

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        ArrayList arrayList = new ArrayList();
        Map<String, i> map = this.f70578a;
        if (map != null) {
            arrayList.addAll(map.values());
        }
        n.a(parcel, arrayList);
    }

    public final void a(@NonNull JSONArray jSONArray) {
        HashMap map = new HashMap();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            i iVar = new i();
            if (iVar.a(jSONObjectOptJSONObject)) {
                map.put(iVar.l(), iVar);
            }
        }
        this.f70578a = map;
    }

    @Override // sg.bigo.ads.common.e
    public final String b() {
        return "SlotData";
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        List<i> listA = n.a(parcel, new sg.bigo.ads.common.f.a<i>() { // from class: sg.bigo.ads.controller.b.h.1
            @Override // sg.bigo.ads.common.f.a
            public final /* synthetic */ sg.bigo.ads.common.f a() {
                return new i();
            }
        });
        HashMap map = new HashMap();
        for (i iVar : listA) {
            map.put(iVar.l(), iVar);
        }
        this.f70578a = map;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        Map<String, i> map = this.f70578a;
        if (map != null) {
            for (i iVar : map.values()) {
                if (sb2.length() > 0) {
                    sb2.append(StringUtils.COMMA);
                }
                sb2.append(iVar);
            }
        }
        return "SlotData[" + sb2.toString() + ']';
    }
}
