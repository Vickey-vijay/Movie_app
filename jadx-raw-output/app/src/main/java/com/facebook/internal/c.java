package com.facebook.internal;

import android.os.Bundle;
import com.ironsource.C3426d4;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import me.goldze.mvvmhabit.base.ContainerActivity;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: BundleJSONConverter.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u000eB\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R$\u0010\u000b\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0007\u0012\u0004\u0012\u00020\b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/facebook/internal/c;", "", "Lorg/json/JSONObject;", "jsonObject", "Landroid/os/Bundle;", "a", "", "Ljava/lang/Class;", "Lcom/facebook/internal/c$h;", "b", "Ljava/util/Map;", "SETTERS", "<init>", "()V", "h", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f14360a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Map<Class<?>, h> SETTERS;

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$a", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            bundle.putBoolean(str, ((Boolean) obj).booleanValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$b", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class b implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            bundle.putInt(str, ((Integer) obj).intValue());
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$c", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class C0169c implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            bundle.putLong(str, ((Long) obj).longValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$d", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class d implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            bundle.putDouble(str, ((Double) obj).doubleValue());
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$e", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class e implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            bundle.putString(str, (String) obj);
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$f", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class f implements h {
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            throw new IllegalArgumentException("Unexpected type from JSON");
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"com/facebook/internal/c$g", "Lcom/facebook/internal/c$h;", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "", "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class g implements h {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.facebook.internal.c.h
        public void a(Bundle bundle, String str, Object obj) throws JSONException {
            ck.p.j(bundle, ContainerActivity.BUNDLE);
            ck.p.j(str, C3426d4.i.W);
            ck.p.j(obj, "value");
            JSONArray jSONArray = (JSONArray) obj;
            ArrayList arrayList = new ArrayList();
            if (jSONArray.length() == 0) {
                bundle.putStringArrayList(str, arrayList);
                return;
            }
            int i10 = 0;
            int length = jSONArray.length();
            if (length > 0) {
                while (true) {
                    int i11 = i10 + 1;
                    Object obj2 = jSONArray.get(i10);
                    if (!(obj2 instanceof String)) {
                        throw new IllegalArgumentException(ck.p.s("Unexpected type in an array: ", obj2.getClass()));
                    }
                    arrayList.add(obj2);
                    if (i11 < length) {
                        i10 = i11;
                    }
                }
            }
            bundle.putStringArrayList(str, arrayList);
        }
    }

    /* JADX INFO: compiled from: BundleJSONConverter.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0001H&¨\u0006\t"}, d2 = {"Lcom/facebook/internal/c$h;", "", "Landroid/os/Bundle;", ContainerActivity.BUNDLE, "", C3426d4.i.W, "value", "Lmj/r;", "a", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface h {
        void a(Bundle bundle, String str, Object obj) throws JSONException;
    }

    static {
        HashMap map = new HashMap();
        SETTERS = map;
        map.put(Boolean.class, new a());
        map.put(Integer.class, new b());
        map.put(Long.class, new C0169c());
        map.put(Double.class, new d());
        map.put(String.class, new e());
        map.put(String[].class, new f());
        map.put(JSONArray.class, new g());
    }

    public static final Bundle a(JSONObject jsonObject) throws JSONException {
        ck.p.j(jsonObject, "jsonObject");
        Bundle bundle = new Bundle();
        Iterator<String> itKeys = jsonObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jsonObject.get(next);
            if (obj != JSONObject.NULL) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(next, a((JSONObject) obj));
                } else {
                    h hVar = SETTERS.get(obj.getClass());
                    if (hVar == null) {
                        throw new IllegalArgumentException(ck.p.s("Unsupported type: ", obj.getClass()));
                    }
                    ck.p.i(next, C3426d4.i.W);
                    ck.p.i(obj, "value");
                    hVar.a(bundle, next, obj);
                }
            }
        }
        return bundle;
    }
}
