package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public interface U4 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<String, Object> f27744a;

        public final void a(String str, Object obj) {
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            this.f27744a.put(str, obj);
        }

        public a(String str) {
            ck.p.j(str, "providerName");
            this.f27744a = kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_PROVIDER, str), mj.h.a(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final Map<String, Object> a() {
            return kotlin.collections.a.B(this.f27744a);
        }
    }

    public static final class b implements U4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final F7 f27745a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final a f27746b;

        @Override // com.ironsource.U4
        public void a(D5 d10, String str) {
            ck.p.j(d10, C3426d4.i.f28547j0);
            ck.p.j(str, "instanceId");
            Map<String, Object> mapA = this.f27746b.a();
            mapA.put("spId", str);
            this.f27745a.a(new C5(d10, new JSONObject(kotlin.collections.a.x(mapA))));
        }

        public b(F7 f10, a aVar) {
            ck.p.j(f10, "eventManager");
            ck.p.j(aVar, "eventBaseData");
            this.f27745a = f10;
            this.f27746b = aVar;
        }

        @Override // com.ironsource.U4
        public void a(D5 d10, Be be2) {
            ck.p.j(d10, C3426d4.i.f28547j0);
            Map<String, Object> mapA = this.f27746b.a();
            if (be2 != null) {
                mapA.put(IronSourceConstants.EVENTS_EXT1, be2.toString());
            }
            this.f27745a.a(new C5(d10, new JSONObject(kotlin.collections.a.x(mapA))));
        }
    }

    void a(D5 d10, Be be2);

    void a(D5 d10, String str);
}
