package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.C3426d4;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f2 {
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    public static void a(d2 d2Var, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : d2Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith("get")) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strSubstring = str.startsWith("get") ? str.substring(3) : str;
            boolean zBooleanValue = true;
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String str2 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    a(sb2, i10, a(str2), z0.invokeOrDie(method2, d2Var, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String str3 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1, strSubstring.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    a(sb2, i10, a(str3), z0.invokeOrDie(method3, d2Var, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null) {
                if (strSubstring.endsWith("Bytes")) {
                    if (map.containsKey("get" + strSubstring.substring(0, strSubstring.length() - 5))) {
                    }
                }
                String str4 = strSubstring.substring(0, 1).toLowerCase() + strSubstring.substring(1);
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objInvokeOrDie = z0.invokeOrDie(method4, d2Var, new Object[0]);
                    if (method5 == null) {
                        if (objInvokeOrDie instanceof Boolean) {
                            zEquals = !((Boolean) objInvokeOrDie).booleanValue();
                        } else if (objInvokeOrDie instanceof Integer) {
                            if (((Integer) objInvokeOrDie).intValue() == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Float) {
                            if (((Float) objInvokeOrDie).floatValue() == 0.0f) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof Double) {
                            if (((Double) objInvokeOrDie).doubleValue() == 0.0d) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (objInvokeOrDie instanceof String) {
                            zEquals = objInvokeOrDie.equals("");
                        } else if (objInvokeOrDie instanceof s) {
                            zEquals = objInvokeOrDie.equals(s.f18274b);
                        } else if (!(objInvokeOrDie instanceof d2) ? !((objInvokeOrDie instanceof Enum) && ((Enum) objInvokeOrDie).ordinal() == 0) : objInvokeOrDie != ((d2) objInvokeOrDie).getDefaultInstanceForType()) {
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                        if (zEquals) {
                            zBooleanValue = false;
                        }
                    } else {
                        zBooleanValue = ((Boolean) z0.invokeOrDie(method5, d2Var, new Object[0])).booleanValue();
                    }
                    if (zBooleanValue) {
                        a(sb2, i10, a(str4), objInvokeOrDie);
                    }
                }
            }
        }
        if (d2Var instanceof GeneratedMessageLite$ExtendableMessage) {
            Iterator itD = ((GeneratedMessageLite$ExtendableMessage) d2Var).extensions.d();
            while (itD.hasNext()) {
                Map.Entry entry = (Map.Entry) itD.next();
                a(sb2, i10, C3426d4.j.f28586d + ((w0) entry.getKey()).f18318b + C3426d4.j.f28588e, entry.getValue());
            }
        }
        n3 n3Var = ((z0) d2Var).unknownFields;
        if (n3Var != null) {
            for (int i11 = 0; i11 < n3Var.f18246a; i11++) {
                a(sb2, i10, String.valueOf(n3Var.f18247b[i11] >>> 3), n3Var.f18248c[i11]);
            }
        }
    }

    public static final void a(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(h3.a(s.a((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof s) {
            sb2.append(": \"");
            sb2.append(h3.a((s) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof z0) {
            sb2.append(" {");
            a((z0) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
            return;
        }
        if (obj instanceof Map.Entry) {
            sb2.append(" {");
            Map.Entry entry = (Map.Entry) obj;
            int i13 = i10 + 2;
            a(sb2, i13, C3426d4.i.W, entry.getKey());
            a(sb2, i13, "value", entry.getValue());
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
            return;
        }
        sb2.append(": ");
        sb2.append(obj.toString());
    }

    public static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }
}
