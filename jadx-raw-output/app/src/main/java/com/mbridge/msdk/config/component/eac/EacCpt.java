package com.mbridge.msdk.config.component.eac;

import com.ironsource.C3426d4;
import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class EacCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.eac.model.a f33167h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f33168i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        this.f32957f = "921001";
        this.f33167h = new com.mbridge.msdk.config.component.eac.model.a(map);
        this.f33168i = new d();
    }

    private void a(Iterable<?> iterable, int i10) {
        int i11 = 0;
        for (Object obj : iterable) {
            Object objA = this.f33168i.a(this.f33167h.b(), this.f32955d);
            if (!(objA instanceof Integer) || ((Integer) objA).intValue() == 1) {
                Object objA2 = this.f33168i.a(this.f33167h.a(), this.f32955d);
                if ((objA2 instanceof Integer) && ((Integer) objA2).intValue() == 1) {
                    break;
                }
                HashMap map = new HashMap();
                map.put("count", i10 + "");
                if (obj != null) {
                    map.put("value", obj);
                }
                if (obj instanceof Map.Entry) {
                    map.put(C3426d4.i.W, ((Map.Entry) obj).getKey().toString());
                } else {
                    map.put(C3426d4.i.W, i11 + "");
                }
                a(a("921002", map));
            }
            i11++;
        }
        HashMap map2 = new HashMap();
        map2.put("count", Integer.valueOf(i10));
        a(a("921003", map2));
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        Object objC = this.f33167h.c();
        if (objC == null) {
            Map<String, Object> map = new HashMap<>();
            map.put("code", "");
            map.put("reason", "iterationData is null");
            map.put("count", 0);
            a(a("921003", map));
            return;
        }
        if (objC instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) objC;
            a(aVar.a(), aVar.e());
            return;
        }
        if (objC instanceof Map) {
            Map map2 = (Map) objC;
            a(map2.entrySet(), map2.size());
        } else {
            if (objC instanceof List) {
                List list = (List) objC;
                a(list, list.size());
                return;
            }
            Map<String, Object> map3 = new HashMap<>();
            map3.put("code", "");
            map3.put("reason", "iterationData type not match");
            map3.put("count", 0);
            a(a("921003", map3));
        }
    }
}
