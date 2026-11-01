package com.google.android.gms.internal.ads;

import com.ironsource.C3426d4;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zzide {
    private static final char[] zza;

    static {
        char[] cArr = new char[80];
        zza = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static String zza(zzidc zzidcVar, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        zzc(zzidcVar, sb2, 0);
        return sb2.toString();
    }

    public static void zzb(StringBuilder sb2, int i10, String str, Object obj) {
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
        zzd(i10, sb2);
        if (!str.isEmpty()) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(Character.toLowerCase(str.charAt(0)));
            for (int i11 = 1; i11 < str.length(); i11++) {
                char cCharAt = str.charAt(i11);
                if (Character.isUpperCase(cCharAt)) {
                    sb3.append("_");
                }
                sb3.append(Character.toLowerCase(cCharAt));
            }
            str = sb3.toString();
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            sb2.append(zzied.zza(zzian.zzv((String) obj)));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzian) {
            sb2.append(": \"");
            sb2.append(zzied.zza((zzian) obj));
            sb2.append('\"');
            return;
        }
        if (obj instanceof zzibr) {
            sb2.append(" {");
            zzc((zzibr) obj, sb2, i10 + 2);
            sb2.append("\n");
            zzd(i10, sb2);
            sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb2.append(": ");
            sb2.append(obj);
            return;
        }
        int i12 = i10 + 2;
        sb2.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        zzb(sb2, i12, C3426d4.i.W, entry.getKey());
        zzb(sb2, i12, "value", entry.getValue());
        sb2.append("\n");
        zzd(i10, sb2);
        sb2.append(com.safedk.android.analytics.brandsafety.creatives.discoveries.h.f44172e);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01fb  */
    private static void zzc(zzidc zzidcVar, StringBuilder sb2, int i10) {
        int i11;
        boolean zEquals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap map = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = zzidcVar.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i12 = 0;
        while (true) {
            i11 = 3;
            if (i12 >= length) {
                break;
            }
            Method method3 = declaredMethods[i12];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        map.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i12++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String strSubstring = ((String) entry.getKey()).substring(i11);
            if (strSubstring.endsWith("List") && !strSubstring.endsWith("OrBuilderList") && !strSubstring.equals("List") && (method2 = (Method) entry.getValue()) != null && method2.getReturnType().equals(List.class)) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 4), zzibr.zzbB(method2, zzidcVar, new Object[0]));
            } else if (strSubstring.endsWith("Map") && !strSubstring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                zzb(sb2, i10, strSubstring.substring(0, strSubstring.length() - 3), zzibr.zzbB(method, zzidcVar, new Object[0]));
            } else if (hashSet.contains("set".concat(strSubstring)) && (!strSubstring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(strSubstring.substring(0, strSubstring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) map.get("has".concat(strSubstring));
                if (method4 != null) {
                    Object objZzbB = zzibr.zzbB(method4, zzidcVar, new Object[0]);
                    if (method5 == null) {
                        if (objZzbB instanceof Boolean) {
                            if (((Boolean) objZzbB).booleanValue()) {
                                zzb(sb2, i10, strSubstring, objZzbB);
                            }
                        } else if (objZzbB instanceof Integer) {
                            if (((Integer) objZzbB).intValue() != 0) {
                                zzb(sb2, i10, strSubstring, objZzbB);
                            }
                        } else if (objZzbB instanceof Float) {
                            if (Float.floatToRawIntBits(((Float) objZzbB).floatValue()) != 0) {
                                zzb(sb2, i10, strSubstring, objZzbB);
                            }
                        } else if (!(objZzbB instanceof Double)) {
                            if (objZzbB instanceof String) {
                                zEquals = objZzbB.equals("");
                            } else if (objZzbB instanceof zzian) {
                                zEquals = objZzbB.equals(zzian.zza);
                            } else if (objZzbB instanceof zzidc) {
                                if (objZzbB != ((zzidc) objZzbB).zzbw()) {
                                    zzb(sb2, i10, strSubstring, objZzbB);
                                }
                            } else if (!(objZzbB instanceof Enum) || ((Enum) objZzbB).ordinal() != 0) {
                                zzb(sb2, i10, strSubstring, objZzbB);
                            }
                            if (!zEquals) {
                                zzb(sb2, i10, strSubstring, objZzbB);
                            }
                        } else if (Double.doubleToRawLongBits(((Double) objZzbB).doubleValue()) != 0) {
                            zzb(sb2, i10, strSubstring, objZzbB);
                        }
                    } else if (((Boolean) zzibr.zzbB(method5, zzidcVar, new Object[0])).booleanValue()) {
                        zzb(sb2, i10, strSubstring, objZzbB);
                    }
                }
            }
            i11 = 3;
        }
        if (zzidcVar instanceof zzibn) {
            Iterator itZzc = ((zzibn) zzidcVar).zza.zzc();
            while (itZzc.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itZzc.next();
                int i13 = ((zzibo) entry2.getKey()).zza;
                StringBuilder sb3 = new StringBuilder(String.valueOf(i13).length() + 2);
                sb3.append(C3426d4.j.f28586d);
                sb3.append(i13);
                sb3.append(C3426d4.j.f28588e);
                zzb(sb2, i10, sb3.toString(), entry2.getValue());
            }
        }
        zzieg zziegVar = ((zzibr) zzidcVar).zzt;
        if (zziegVar != null) {
            zziegVar.zzj(sb2, i10);
        }
    }

    private static void zzd(int i10, StringBuilder sb2) {
        while (i10 > 0) {
            int i11 = 80;
            if (i10 <= 80) {
                i11 = i10;
            }
            sb2.append(zza, 0, i11);
            i10 -= i11;
        }
    }
}
