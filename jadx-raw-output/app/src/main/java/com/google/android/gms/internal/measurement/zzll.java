package com.google.android.gms.internal.measurement;

import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* JADX INFO: loaded from: classes9.dex */
final class zzll {
    public static String zza(zzlj zzljVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzd(zzljVar, sb2, 0);
        return sb2.toString();
    }

    public static final void zzb(StringBuilder sb2, int i10, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                zzb(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                zzb(sb2, i10, str, (Map.Entry) it2.next());
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
            sb2.append(zzmj.zza(zzjb.zzm((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzjb) {
            sb2.append(": \"");
            sb2.append(zzmj.zza((zzjb) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzkc) {
            sb2.append(" {");
            zzd((zzkc) obj, sb2, i10 + 2);
            sb2.append("\n");
            while (i11 < i10) {
                sb2.append(' ');
                i11++;
            }
            sb2.append(h.f44172e);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        int i13 = i10 + 2;
        zzb(sb2, i13, C3426d4.i.W, entry.getKey());
        zzb(sb2, i13, "value", entry.getValue());
        sb2.append("\n");
        while (i11 < i10) {
            sb2.append(' ');
            i11++;
        }
        sb2.append(h.f44172e);
    }

    private static final String zzc(String str) {
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

    private static void zzd(zzlj zzljVar, StringBuilder sb2, int i10) {
        boolean zEquals;
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : zzljVar.getClass().getDeclaredMethods()) {
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
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List")) {
                String strConcat = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 4)));
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    zzb(sb2, i10, zzc(strConcat), zzkc.zzbK(method2, zzljVar, new Object[0]));
                }
            }
            if (strSubstring.endsWith("Map") && !strSubstring.equals("Map")) {
                String strConcat2 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1, strSubstring.length() - 3)));
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    zzb(sb2, i10, zzc(strConcat2), zzkc.zzbK(method3, zzljVar, new Object[0]));
                }
            }
            if (((Method) map2.get("set".concat(strSubstring))) != null && (!strSubstring.endsWith("Bytes") || !map.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                String strConcat3 = String.valueOf(strSubstring.substring(0, 1).toLowerCase()).concat(String.valueOf(strSubstring.substring(1)));
                Method method4 = (Method) map.get("get".concat(strSubstring));
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbK = zzkc.zzbK(method4, zzljVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbK instanceof Boolean) {
                            if (((Boolean) objZzbK).booleanValue()) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbK);
                            }
                        } else if (objZzbK instanceof Integer) {
                            if (((Integer) objZzbK).intValue() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbK);
                            }
                        } else if (objZzbK instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbK).floatValue()) != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbK);
                            }
                        } else if (!(objZzbK instanceof Double)) {
                            if (objZzbK instanceof String) {
                                zEquals = objZzbK.equals("");
                            } else if (objZzbK instanceof zzjb) {
                                zEquals = objZzbK.equals(zzjb.zzb);
                            } else if (objZzbK instanceof zzlj) {
                                if (objZzbK != ((zzlj) objZzbK).zzbR()) {
                                    zzb(sb2, i10, zzc(strConcat3), objZzbK);
                                }
                            } else if (!(objZzbK instanceof Enum) || ((Enum) objZzbK).ordinal() != 0) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbK);
                            }
                            if (!zEquals) {
                                zzb(sb2, i10, zzc(strConcat3), objZzbK);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbK).doubleValue()) != 0) {
                            zzb(sb2, i10, zzc(strConcat3), objZzbK);
                        }
                    } else if (((Boolean) zzkc.zzbK(method5, zzljVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, zzc(strConcat3), objZzbK);
                    }
                }
            }
        }
        if (zzljVar instanceof zzjz) {
            throw null;
        }
        zzmm zzmmVar = ((zzkc) zzljVar).zzc;
        if (zzmmVar != null) {
            zzmmVar.zzg(sb2, i10);
        }
    }
}
