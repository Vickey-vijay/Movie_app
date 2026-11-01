package com.applovin.impl.mediation;

import android.text.TextUtils;
import com.applovin.impl.k3;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.y2;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.sdk.AppLovinSdk;
import com.safedk.android.utils.SdksMapping;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.applovin.impl.sdk.o f8330c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f8328a = Collections.synchronizedMap(new HashMap(16));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8331d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f8332e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Set f8333f = new HashSet();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Object f8334g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f8335h = new HashSet();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f8336a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f8337b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final MaxAdFormat f8338c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final JSONObject f8339d;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            if (!this.f8336a.equals(aVar.f8336a) || !this.f8337b.equals(aVar.f8337b)) {
                return false;
            }
            MaxAdFormat maxAdFormat = this.f8338c;
            MaxAdFormat maxAdFormat2 = aVar.f8338c;
            return maxAdFormat == null ? maxAdFormat2 == null : maxAdFormat.equals(maxAdFormat2);
        }

        public JSONObject a() {
            return this.f8339d;
        }

        public int hashCode() {
            int iHashCode = ((this.f8336a.hashCode() * 31) + this.f8337b.hashCode()) * 31;
            MaxAdFormat maxAdFormat = this.f8338c;
            return iHashCode + (maxAdFormat != null ? maxAdFormat.hashCode() : 0);
        }

        public String toString() {
            return "DisabledAdapterInfo{className='" + this.f8336a + "', operationTag='" + this.f8337b + "', format=" + this.f8338c + '}';
        }

        public a(String str, String str2, y2 y2Var, com.applovin.impl.sdk.k kVar) {
            this.f8336a = str;
            this.f8337b = str2;
            JSONObject jSONObject = new JSONObject();
            this.f8339d = jSONObject;
            JsonUtils.putString(jSONObject, SdksMapping.KEY_INSTALLED_MEDIATION_ADAPTERS_CLASS, str);
            JsonUtils.putString(jSONObject, "operation", str2);
            if (y2Var != null) {
                this.f8338c = y2Var.getFormat();
                JsonUtils.putString(jSONObject, "format", y2Var.getFormat().getLabel());
            } else {
                this.f8338c = null;
            }
        }
    }

    public Collection a() {
        ArrayList arrayList;
        synchronized (this.f8334g) {
            arrayList = new ArrayList(this.f8335h.size());
            Iterator it = this.f8335h.iterator();
            while (it.hasNext()) {
                arrayList.add(((a) it.next()).a());
            }
        }
        return arrayList;
    }

    public Collection b() {
        Set setUnmodifiableSet;
        synchronized (this.f8331d) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.f8333f);
        }
        return setUnmodifiableSet;
    }

    public Collection c() {
        Set setUnmodifiableSet;
        synchronized (this.f8331d) {
            HashSet hashSet = new HashSet(this.f8332e.size());
            Iterator it = this.f8332e.values().iterator();
            while (it.hasNext()) {
                hashSet.add(((Class) it.next()).getName());
            }
            setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
        }
        return setUnmodifiableSet;
    }

    public g(com.applovin.impl.sdk.k kVar) {
        if (kVar != null) {
            this.f8329b = kVar;
            this.f8330c = kVar.O();
            return;
        }
        throw new IllegalArgumentException("No sdk specified");
    }

    public h a(k3 k3Var) {
        return a(k3Var, false);
    }

    public h a(k3 k3Var, boolean z10) {
        Class clsA;
        h hVar;
        if (k3Var != null) {
            String strC = k3Var.c();
            String strB = k3Var.b();
            if (TextUtils.isEmpty(strC)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8330c.b("MediationAdapterManager", "No adapter name provided for " + strB + ", not loading the adapter ");
                }
                return null;
            }
            if (TextUtils.isEmpty(strB)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8330c.b("MediationAdapterManager", "Unable to find default className for '" + strC + "'");
                }
                return null;
            }
            if (z10 && (hVar = (h) this.f8328a.get(strB)) != null) {
                return hVar;
            }
            synchronized (this.f8331d) {
                if (!this.f8333f.contains(strB)) {
                    if (this.f8332e.containsKey(strB)) {
                        clsA = (Class) this.f8332e.get(strB);
                    } else {
                        clsA = a(strB);
                        if (clsA == null) {
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8330c.k("MediationAdapterManager", "Adapter " + strC + " could not be loaded, class " + strB + " not found");
                            }
                            this.f8333f.add(strB);
                            return null;
                        }
                    }
                    h hVarA = a(k3Var, clsA, z10);
                    if (hVarA != null) {
                        if (com.applovin.impl.sdk.o.a()) {
                            this.f8330c.a("MediationAdapterManager", "Loaded " + strC);
                        }
                        this.f8332e.put(strB, clsA);
                        if (z10) {
                            this.f8328a.put(k3Var.b(), hVarA);
                        }
                        return hVarA;
                    }
                    if (com.applovin.impl.sdk.o.a()) {
                        this.f8330c.b("MediationAdapterManager", "Failed to load " + strC);
                    }
                    this.f8333f.add(strB);
                    return null;
                }
                if (com.applovin.impl.sdk.o.a()) {
                    this.f8330c.a("MediationAdapterManager", "Not attempting to load " + strC + " due to prior errors");
                }
                return null;
            }
        }
        throw new IllegalArgumentException("No adapter spec specified");
    }

    public void a(String str, String str2, y2 y2Var) {
        synchronized (this.f8334g) {
            this.f8329b.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f8329b.O().b("MediationAdapterManager", "Adding " + str + " to list of disabled adapters.");
            }
            this.f8335h.add(new a(str, str2, y2Var, this.f8329b));
        }
    }

    private h a(k3 k3Var, Class cls, boolean z10) {
        try {
            return new h(k3Var, (MediationAdapterBase) cls.getConstructor(AppLovinSdk.class).newInstance(this.f8329b.y0()), z10, this.f8329b);
        } catch (Throwable th2) {
            com.applovin.impl.sdk.o.c("MediationAdapterManager", "Failed to load adapter: " + k3Var, th2);
            return null;
        }
    }

    private Class a(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (MaxAdapter.class.isAssignableFrom(cls)) {
                return cls.asSubclass(MaxAdapter.class);
            }
            com.applovin.impl.sdk.o.h("MediationAdapterManager", str + " error: not an instance of '" + MaxAdapter.class.getName() + "'.");
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }
}
