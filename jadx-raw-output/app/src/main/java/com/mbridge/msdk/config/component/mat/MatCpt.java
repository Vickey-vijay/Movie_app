package com.mbridge.msdk.config.component.mat;

import com.mbridge.msdk.config.component.base.a;
import com.mbridge.msdk.config.component.common.express.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes8.dex */
public class MatCpt extends a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList<Map<String, Object>> f33430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f33431i;

    @Override // com.mbridge.msdk.config.component.base.a
    public void b(Map<String, Object> map) {
        super.b(map);
        this.f32957f = "920001";
        Object obj = map.get("expression");
        if (obj instanceof List) {
            this.f33430h = (ArrayList) obj;
        }
        this.f33431i = new d();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        super.d();
        ArrayList<Map<String, Object>> arrayList = this.f33430h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Object objA = null;
            for (Map<String, Object> map : this.f33430h) {
                String strValueOf = String.valueOf(map.get("condition"));
                String strValueOf2 = String.valueOf(map.get("expression"));
                String strValueOf3 = String.valueOf(map.get("can_continue"));
                Object objA2 = this.f33431i.a(strValueOf, this.f32955d);
                boolean zEquals = true;
                if (objA2 instanceof Integer) {
                    if (((Integer) objA2).intValue() != 1) {
                        zEquals = false;
                    }
                } else if (objA2 instanceof String) {
                    zEquals = String.valueOf(objA2).equals("1");
                } else {
                    zEquals = false;
                }
                if (zEquals) {
                    objA = this.f33431i.a(strValueOf2, this.f32955d);
                    if (strValueOf3.equals("N")) {
                        break;
                    }
                }
            }
            HashMap map2 = new HashMap();
            map2.put("data", objA);
            a(a("920002", map2));
        }
    }
}
