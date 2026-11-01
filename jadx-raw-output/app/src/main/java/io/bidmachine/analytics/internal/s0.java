package io.bidmachine.analytics.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import com.ironsource.C3426d4;
import java.io.Closeable;
import java.io.Flushable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0002\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0005H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0006\u001a\u0017\u0010\u0003\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u0007H\u0000¢\u0006\u0004\b\u0003\u0010\t\u001a\u001b\u0010\u0003\u001a\u00020\u000b*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\nH\u0000¢\u0006\u0004\b\u0003\u0010\f\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n*\u00020\u000bH\u0000¢\u0006\u0004\b\u0003\u0010\u000f\u001a\u0019\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007*\u00020\bH\u0000¢\u0006\u0004\b\u0003\u0010\u0010\u001a\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0003\u0010\u0012\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\n*\u00020\u0013H\u0000¢\u0006\u0004\b\u0003\u0010\u0014\u001a\u0013\u0010\u0003\u001a\u00020\u0016*\u00020\u0015H\u0000¢\u0006\u0004\b\u0003\u0010\u0017\u001a\u001b\u0010\u001a\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u0003\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0003\u0010\u001b\u001a\u001b\u0010\u0003\u001a\u00020\u0018*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0003\u0010\u001c\u001a\u0013\u0010\u001d\u001a\u00020\r*\u00020\rH\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u0013\u0010\u0003\u001a\u00020\r*\u00020\rH\u0000¢\u0006\u0004\b\u0003\u0010\u001e\u001a\u0013\u0010\u001f\u001a\u00020\r*\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010\u001e\u001a\u0013\u0010\u0003\u001a\u00020\r*\u00020 H\u0000¢\u0006\u0004\b\u0003\u0010!\u001a\u0013\u0010\u001a\u001a\u00020\r*\u00020\rH\u0000¢\u0006\u0004\b\u001a\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Ljava/io/Closeable;", "Lkotlin/Result;", "Lmj/r;", "a", "(Ljava/io/Closeable;)Ljava/lang/Object;", "Ljava/io/Flushable;", "(Ljava/io/Flushable;)Ljava/lang/Object;", "", "Lorg/json/JSONArray;", "(Ljava/util/List;)Lorg/json/JSONArray;", "", "Lorg/json/JSONObject;", "(Ljava/util/Map;)Lorg/json/JSONObject;", "", "", "(Lorg/json/JSONObject;)Ljava/util/Map;", "(Lorg/json/JSONArray;)Ljava/util/List;", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroid/os/Bundle;", "(Landroid/os/Bundle;)Ljava/util/Map;", "Landroid/content/Context;", "", "(Landroid/content/Context;)Z", "", C3426d4.i.W, "b", "([BLjava/lang/String;)[B", "([B[B)[B", "d", "(Ljava/lang/String;)Ljava/lang/String;", "c", "", "(Ljava/lang/Throwable;)Ljava/lang/String;", "bidmachine-android-sdk_bh_3_3_0"}, k = 2, mv = {1, 7, 1})
public final class s0 {
    public static final Object a(Closeable closeable) {
        try {
            Result.a aVar = Result.Companion;
            closeable.close();
            return Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    public static final String b(String str) {
        return a(d(str));
    }

    public static final String a(String str) {
        return new String(Base64.decode(str, 2), lk.c.f63591b);
    }

    public static final byte[] b(byte[] bArr, String str) {
        return a(bArr, str.getBytes(lk.c.f63591b));
    }

    public static final String c(String str) {
        return Base64.encodeToString(str.getBytes(lk.c.f63591b), 2);
    }

    public static final Object a(Flushable flushable) {
        try {
            Result.a aVar = Result.Companion;
            flushable.flush();
            return Result.m3458constructorimpl(mj.r.f64562a);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            return Result.m3458constructorimpl(kotlin.c.a(th2));
        }
    }

    public static final String d(String str) {
        if (str.length() == 0) {
            return str;
        }
        int iL0 = lk.a0.l0(str, "=", 0, false, 6, null);
        if (iL0 == -1) {
            return lk.c0.v1(str).toString();
        }
        return lk.c0.v1(str.substring(0, iL0)).toString() + str.substring(iL0);
    }

    public static final boolean a(Context context) {
        return (context.getApplicationInfo().flags & 2) != 0;
    }

    public static final JSONArray a(List<?> list) {
        JSONArray jSONArray = new JSONArray();
        for (Object objA : list) {
            if (objA instanceof List) {
                objA = a((List<?>) objA);
            } else if (objA instanceof Map) {
                objA = a((Map<?, ?>) objA);
            }
            jSONArray.put(objA);
        }
        return jSONArray;
    }

    public static final JSONObject a(Map<?, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            try {
                Result.a aVar = Result.Companion;
                String strValueOf = String.valueOf(key);
                if (strValueOf.length() != 0 && value != null) {
                    if (value instanceof List) {
                        value = a((List<?>) value);
                    } else if (value instanceof Map) {
                        value = a((Map<?, ?>) value);
                    }
                    jSONObject.put(strValueOf, value);
                }
                Result.m3458constructorimpl(mj.r.f64562a);
            } catch (Throwable th2) {
                Result.a aVar2 = Result.Companion;
                Result.m3458constructorimpl(kotlin.c.a(th2));
            }
        }
        return jSONObject;
    }

    private static final Object a(Object obj) {
        if (ck.p.e(obj, JSONObject.NULL)) {
            return null;
        }
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static final List<Object> a(JSONArray jSONArray) {
        ik.i iVarQ = ik.k.q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = iVarQ.iterator();
        while (it.hasNext()) {
            Object objA = a(jSONArray.get(((nj.g0) it).nextInt()));
            if (objA != null) {
                arrayList.add(objA);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> a(Bundle bundle) {
        short sShortValue;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            Object objA = bundle.get(str);
            if (!(objA instanceof Boolean)) {
                if (objA instanceof Byte) {
                    sShortValue = ((Number) objA).byteValue();
                } else if (!(objA instanceof Character) && !(objA instanceof Double) && !(objA instanceof Float) && !(objA instanceof Integer) && !(objA instanceof Long)) {
                    if (objA instanceof Short) {
                        sShortValue = ((Number) objA).shortValue();
                    } else if (!(objA instanceof String)) {
                        objA = objA instanceof Bundle ? a((Bundle) objA) : (!(objA instanceof CharSequence) && objA == null) ? null : objA.toString();
                    }
                }
                objA = Integer.valueOf(sShortValue);
            }
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final Map<String, Object> a(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : kk.r.g(jSONObject.keys())) {
            Object objA = a(jSONObject.get(str));
            if (objA != null) {
                linkedHashMap.put(str, objA);
            }
        }
        return linkedHashMap;
    }

    public static final String a(Throwable th2) {
        String message = th2.getMessage();
        if (message != null) {
            String str = th2.getClass().getName() + ": " + message;
            if (str != null) {
                return str;
            }
        }
        return th2.getClass().getName();
    }

    public static final byte[] a(byte[] bArr, String str) {
        return a(bArr, str.getBytes(lk.c.f63591b));
    }

    private static final byte[] a(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr3[i10] = (byte) (bArr[i10] ^ bArr2[i10 % bArr2.length]);
        }
        return bArr3;
    }
}
