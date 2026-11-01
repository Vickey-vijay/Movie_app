package com.bytedance.sdk.component.ouw;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

/* JADX INFO: loaded from: classes8.dex */
final class le {

    /* JADX INFO: renamed from: le, reason: collision with root package name */
    public final com.bytedance.sdk.component.ouw.ouw f11876le;
    public final ra ouw;
    private final cf pno;
    public final Map<String, vt> vt = new HashMap();

    /* JADX INFO: renamed from: lh, reason: collision with root package name */
    public final zih<String, vm> f11877lh = new zih<>();
    public final Map<String, lh.vt> yu = new HashMap();

    /* JADX INFO: renamed from: ra, reason: collision with root package name */
    private final List<jg> f11878ra = new ArrayList();
    public final Set<lh> fkw = new HashSet();

    public static final class ouw {
        public boolean ouw;
        public String vt;

        public /* synthetic */ ouw(boolean z10, String str, byte b10) {
            this(z10, str);
        }

        private ouw(boolean z10, String str) {
            this.ouw = z10;
            this.vt = str;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ouw ouw(final jg jgVar, fkw fkwVar) throws Exception {
        vt vtVar = this.vt.get(jgVar.yu);
        String str = "";
        boolean z10 = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (vtVar != null) {
            try {
                if (vtVar instanceof yu) {
                    pno.ouw("Processing stateless call: ".concat(String.valueOf(jgVar)));
                    return ouw(jgVar, (yu) vtVar);
                }
            } catch (IllegalStateException e10) {
                pno.ouw("No remote permission config fetched, call pending: ".concat(String.valueOf(jgVar)), e10);
                this.f11878ra.add(jgVar);
                return new ouw(objArr2 == true ? 1 : 0, str, objArr == true ? 1 : 0);
            }
        }
        yu yuVar = this.f11877lh.ouw.get(jgVar.yu);
        if (yuVar != null) {
            pno.ouw("Processing stateless call: ".concat(String.valueOf(jgVar)));
            return ouw(jgVar, yuVar);
        }
        lh.vt vtVar2 = this.yu.get(jgVar.yu);
        if (vtVar2 == null) {
            pno.vt("Received call: " + jgVar + ", but not registered.");
            return null;
        }
        final lh lhVarOuw = vtVar2.ouw();
        lhVarOuw.ouw = jgVar.yu;
        pno.ouw("Processing stateful call: ".concat(String.valueOf(jgVar)));
        this.fkw.add(lhVarOuw);
        lhVarOuw.ouw(ouw(jgVar.fkw, lhVarOuw), fkwVar, new lh.ouw() { // from class: com.bytedance.sdk.component.ouw.le.1
            @Override // com.bytedance.sdk.component.ouw.lh.ouw
            public final void ouw(Object obj) {
                le leVar = le.this;
                com.bytedance.sdk.component.ouw.ouw ouwVar = leVar.f11876le;
                if (ouwVar == null) {
                    return;
                }
                ouwVar.vt(th.ouw(leVar.ouw.ouw(obj), lhVarOuw.vt), jgVar);
                le.this.fkw.remove(lhVarOuw);
            }

            @Override // com.bytedance.sdk.component.ouw.lh.ouw
            public final void ouw(Throwable th2) {
                com.bytedance.sdk.component.ouw.ouw ouwVar = le.this.f11876le;
                if (ouwVar == null) {
                    return;
                }
                ouwVar.vt(th.ouw(th2), jgVar);
                le.this.fkw.remove(lhVarOuw);
            }
        });
        return new ouw(z10, str, objArr3 == true ? 1 : 0);
    }

    public le(bly blyVar, com.bytedance.sdk.component.ouw.ouw ouwVar) {
        this.f11876le = ouwVar;
        this.ouw = blyVar.yu;
        this.pno = blyVar.pno;
    }

    public final void ouw() {
        Iterator<lh> it = this.fkw.iterator();
        while (it.hasNext()) {
            it.next().lh();
        }
        this.fkw.clear();
        this.vt.clear();
        this.yu.clear();
        this.f11877lh.ouw();
    }

    private ouw ouw(jg jgVar, yu yuVar) throws Exception {
        return new ouw(true, th.ouw(this.ouw.ouw(yuVar.ouw(jgVar.yu, ouw(jgVar.fkw, yuVar))), yuVar.vt), (byte) 0);
    }

    private Object ouw(String str, vt vtVar) throws JSONException {
        return this.ouw.ouw(str, ouw(vtVar)[0]);
    }

    private static Type[] ouw(Object obj) {
        Type genericSuperclass = obj.getClass().getGenericSuperclass();
        if (genericSuperclass != null) {
            return ((ParameterizedType) genericSuperclass).getActualTypeArguments();
        }
        throw new IllegalStateException("Method is not parameterized?!");
    }
}
