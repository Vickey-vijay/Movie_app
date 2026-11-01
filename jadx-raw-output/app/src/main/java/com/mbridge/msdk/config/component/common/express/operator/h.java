package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: OperatorHighLevelMethod.java */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f33041a = Arrays.asList("map", "filter", "sorted");

    /* JADX INFO: compiled from: OperatorHighLevelMethod.java */
    public class a implements Comparator<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.mbridge.msdk.config.component.common.express.operator.parts.b f33042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f33043b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ boolean f33044c;

        /* JADX WARN: Code duplicated, block: B:67:0x0104  */
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int iCompareTo;
            boolean z10 = false;
            if (obj == null || obj2 == null) {
                return 0;
            }
            try {
                this.f33042a.a(obj);
                FutureTask futureTask = new FutureTask(this.f33042a);
                new Thread(futureTask).start();
                Object obj3 = futureTask.get();
                this.f33042a.a(obj2);
                FutureTask futureTask2 = new FutureTask(this.f33042a);
                new Thread(futureTask2).start();
                Object obj4 = futureTask2.get();
                int i10 = this.f33043b;
                if (i10 == 0) {
                    if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                        iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i10 == 1) {
                    if ((obj3 instanceof String) && (obj4 instanceof String)) {
                        iCompareTo = ((String) obj3).compareTo((String) obj4);
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i10 == 2) {
                    if ((obj3 instanceof Number) && (obj4 instanceof String)) {
                        iCompareTo = -1;
                        z10 = true;
                    } else if ((obj3 instanceof String) && (obj4 instanceof Number)) {
                        iCompareTo = 1;
                        z10 = true;
                    } else if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                        iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                    } else if ((obj3 instanceof String) && (obj4 instanceof String)) {
                        iCompareTo = ((String) obj3).compareTo((String) obj4);
                    } else {
                        iCompareTo = 0;
                    }
                } else if (i10 != 3) {
                    iCompareTo = 0;
                } else if ((obj3 instanceof Number) && (obj4 instanceof String)) {
                    iCompareTo = 1;
                    z10 = true;
                } else if ((obj3 instanceof String) && (obj4 instanceof Number)) {
                    iCompareTo = -1;
                    z10 = true;
                } else if ((obj3 instanceof Number) && (obj4 instanceof Number)) {
                    iCompareTo = Double.valueOf(obj3.toString()).compareTo(Double.valueOf(obj4.toString()));
                } else if ((obj3 instanceof String) && (obj4 instanceof String)) {
                    iCompareTo = ((String) obj3).compareTo((String) obj4);
                } else {
                    iCompareTo = 0;
                }
            } catch (Exception e10) {
                q0.b("SQLOperator", e10.getMessage(), e10);
            }
            return (this.f33044c || z10) ? iCompareTo : -iCompareTo;
        }

        public a(com.mbridge.msdk.config.component.common.express.operator.parts.b bVar, int i10, boolean z10) {
            this.f33042a = bVar;
            this.f33043b = i10;
            this.f33044c = z10;
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        byte b10 = -1;
        try {
            int iHashCode = str.hashCode();
            if (iHashCode != -1274492040) {
                if (iHashCode != -896593219) {
                    if (iHashCode == 107868 && str.equals("map")) {
                        b10 = 0;
                    }
                } else if (str.equals("sorted")) {
                    b10 = 2;
                }
            } else if (str.equals("filter")) {
                b10 = 1;
            }
            if (b10 == 0) {
                return b(obj, list);
            }
            if (b10 != 1) {
                return b10 != 2 ? com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null) : c(obj, list);
            }
            return a(obj, list);
        } catch (Exception e10) {
            q0.b("SQLOperator", e10.getMessage(), e10);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        Iterator<String> it = f33041a.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        if (!(obj instanceof ArrayList)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        Object obj2 = list.get(0);
        if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        boolean z10 = true;
        if (list.size() > 1 && Integer.parseInt(list.get(1).toString()) != 1) {
            z10 = false;
        }
        int i10 = list.size() > 2 ? Integer.parseInt(list.get(2).toString()) : 0;
        ArrayList arrayList = new ArrayList((ArrayList) obj);
        Collections.sort(arrayList, new a((com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2, i10, z10));
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        boolean z10 = obj instanceof ArrayList;
        if (!z10 && !(obj instanceof HashMap) && !(obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                ArrayList arrayList2 = (ArrayList) obj;
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    bVar.a(arrayList2.get(i10));
                    FutureTask futureTask = new FutureTask(bVar);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null) {
                            arrayList.add(futureTask.get());
                        }
                    } catch (Exception e10) {
                        q0.b("SQLOperator", e10.getMessage(), e10);
                    }
                }
            } else if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar2 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                    aVar.a(C3426d4.i.W, entry.getKey());
                    aVar.a("value", entry.getValue());
                    bVar2.a(aVar);
                    FutureTask futureTask2 = new FutureTask(bVar2);
                    new Thread(futureTask2).start();
                    try {
                        if (futureTask2.get() != null) {
                            arrayList.add(futureTask2.get());
                        }
                    } catch (Exception e11) {
                        q0.b("SQLOperator", e11.getMessage(), e11);
                    }
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        boolean z10 = obj instanceof ArrayList;
        if (!z10 && !(obj instanceof HashMap) && !(obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (list != null && !list.isEmpty()) {
            Object obj2 = list.get(0);
            if (!(obj2 instanceof com.mbridge.msdk.config.component.common.express.operator.parts.b)) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            ArrayList arrayList = new ArrayList();
            if (z10) {
                ArrayList arrayList2 = (ArrayList) obj;
                com.mbridge.msdk.config.component.common.express.operator.parts.b bVar = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                for (int i10 = 0; i10 < arrayList2.size(); i10++) {
                    Object obj3 = arrayList2.get(i10);
                    bVar.a(obj3);
                    FutureTask futureTask = new FutureTask(bVar);
                    new Thread(futureTask).start();
                    try {
                        if (futureTask.get() != null && Integer.parseInt(futureTask.get().toString()) == 1) {
                            arrayList.add(obj3);
                        }
                    } catch (Exception e10) {
                        q0.b("SQLOperator", e10.getMessage(), e10);
                    }
                }
            } else {
                if (obj instanceof HashMap) {
                    HashMap map = new HashMap();
                    com.mbridge.msdk.config.component.common.express.operator.parts.b bVar2 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                    for (Map.Entry entry : ((HashMap) obj).entrySet()) {
                        HashMap map2 = new HashMap();
                        map2.put(C3426d4.i.W, entry.getKey());
                        map2.put("value", entry.getValue());
                        bVar2.a(map2);
                        FutureTask futureTask2 = new FutureTask(bVar2);
                        new Thread(futureTask2).start();
                        try {
                            if (Integer.parseInt(futureTask2.get().toString()) == 1) {
                                arrayList.add(map2);
                                map.put(entry.getKey(), entry.getValue());
                            }
                        } catch (Exception e11) {
                            q0.b("SQLOperator", e11.getMessage(), e11);
                        }
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
                    com.mbridge.msdk.config.component.common.express.operator.parts.b bVar3 = (com.mbridge.msdk.config.component.common.express.operator.parts.b) obj2;
                    for (Map.Entry<String, Object> entry2 : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                        HashMap map3 = new HashMap();
                        map3.put(C3426d4.i.W, entry2.getKey());
                        map3.put("value", entry2.getValue());
                        bVar3.a(map3);
                        FutureTask futureTask3 = new FutureTask(bVar3);
                        new Thread(futureTask3).start();
                        try {
                            if (Integer.parseInt(futureTask3.get().toString()) == 1) {
                                arrayList.add(map3);
                                aVar.a(entry2.getKey(), entry2.getValue());
                            }
                        } catch (Exception e12) {
                            q0.b("SQLOperator", e12.getMessage(), e12);
                        }
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(arrayList);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }
}
