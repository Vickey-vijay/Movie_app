package com.ironsource;

import java.util.Iterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class Ad {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<String, C3803yc> f25942a;

    public static final class a extends Lambda implements bk.l<String, Pair<? extends String, ? extends C3803yc>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ JSONObject f25943a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(JSONObject jSONObject) {
            super(1);
            this.f25943a = jSONObject;
        }

        @Override // bk.l
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Pair<String, C3803yc> invoke(String str) throws JSONException {
            ck.p.i(str, "networkName");
            JSONObject jSONObject = this.f25943a.getJSONObject(str);
            ck.p.i(jSONObject, "providerSettings.getJSONObject(networkName)");
            return mj.h.a(str, new C3803yc(str, jSONObject));
        }
    }

    public final Map<String, C3803yc> a() {
        return this.f25942a;
    }

    public Ad(JSONObject jSONObject) {
        ck.p.j(jSONObject, "providerSettings");
        Iterator<String> itKeys = jSONObject.keys();
        ck.p.i(itKeys, "providerSettings\n          .keys()");
        Map<String, C3803yc> mapY = kotlin.collections.a.y(SequencesKt___SequencesKt.K(kk.r.g(itKeys), new a(jSONObject)));
        this.f25942a = mapY;
        for (Map.Entry<String, C3803yc> entry : mapY.entrySet()) {
            entry.getKey();
            C3803yc value = entry.getValue();
            if (b(value)) {
                value.b(a(value));
            }
        }
    }

    private final C3803yc a(C3803yc c3803yc) {
        return this.f25942a.get(c3803yc.h());
    }

    private final boolean b(C3803yc c3803yc) {
        if (c3803yc.o() && c3803yc.l().length() > 0) {
            return true;
        }
        return false;
    }
}
