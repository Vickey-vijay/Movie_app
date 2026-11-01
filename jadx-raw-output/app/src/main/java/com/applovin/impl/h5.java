package com.applovin.impl;

import androidx.arch.core.util.Function;
import androidx.core.util.Consumer;
import com.applovin.impl.sdk.utils.JsonUtils;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final JSONObject f7619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f7620b = new Object();

    public JSONObject a() {
        JSONObject jSONObjectDeepCopy;
        synchronized (this.f7620b) {
            jSONObjectDeepCopy = JsonUtils.deepCopy(this.f7619a);
        }
        return jSONObjectDeepCopy;
    }

    public List b(String str, List list) {
        List<String> stringList;
        synchronized (this.f7620b) {
            stringList = JsonUtils.getStringList(this.f7619a, str, list);
        }
        return stringList;
    }

    public void c(String str) {
        synchronized (this.f7620b) {
            this.f7619a.remove(str);
        }
    }

    public String toString() {
        String string;
        synchronized (this.f7620b) {
            string = this.f7619a.toString();
        }
        return string;
    }

    public h5(JSONObject jSONObject) {
        this.f7619a = jSONObject;
    }

    public boolean a(String str) {
        boolean zHas;
        synchronized (this.f7620b) {
            zHas = this.f7619a.has(str);
        }
        return zHas;
    }

    public Object b(String str) {
        Object objOpt;
        synchronized (this.f7620b) {
            objOpt = this.f7619a.opt(str);
        }
        return objOpt;
    }

    public void a(Consumer consumer) {
        synchronized (this.f7620b) {
            consumer.accept(this);
        }
    }

    public void b(String str, int i10) {
        synchronized (this.f7620b) {
            JsonUtils.putInt(this.f7619a, str, i10);
        }
    }

    public Object a(Function function) {
        Object objApply;
        synchronized (this.f7620b) {
            objApply = function.apply(this);
        }
        return objApply;
    }

    public void b(String str, long j10) {
        synchronized (this.f7620b) {
            JsonUtils.putLong(this.f7619a, str, j10);
        }
    }

    public Boolean a(String str, Boolean bool) {
        Boolean bool2;
        synchronized (this.f7620b) {
            bool2 = JsonUtils.getBoolean(this.f7619a, str, bool);
        }
        return bool2;
    }

    public void b(String str, String str2) {
        synchronized (this.f7620b) {
            JsonUtils.putString(this.f7619a, str, str2);
        }
    }

    public float a(String str, float f10) {
        float f11;
        synchronized (this.f7620b) {
            f11 = JsonUtils.getFloat(this.f7619a, str, f10);
        }
        return f11;
    }

    public int a(String str, int i10) {
        int i11;
        synchronized (this.f7620b) {
            i11 = JsonUtils.getInt(this.f7619a, str, i10);
        }
        return i11;
    }

    public JSONArray a(String str, JSONArray jSONArray) {
        JSONArray jSONArray2;
        synchronized (this.f7620b) {
            jSONArray2 = JsonUtils.getJSONArray(this.f7619a, str, jSONArray);
        }
        return jSONArray2;
    }

    public JSONObject a(String str, JSONObject jSONObject) {
        JSONObject jSONObject2;
        synchronized (this.f7620b) {
            jSONObject2 = JsonUtils.getJSONObject(this.f7619a, str, jSONObject);
        }
        return jSONObject2;
    }

    public long a(String str, long j10) {
        long j11;
        synchronized (this.f7620b) {
            j11 = JsonUtils.getLong(this.f7619a, str, j10);
        }
        return j11;
    }

    public String a(String str, String str2) {
        String string;
        synchronized (this.f7620b) {
            string = JsonUtils.getString(this.f7619a, str, str2);
        }
        return string;
    }

    public List a(String str, List list) {
        List<Integer> integerList;
        synchronized (this.f7620b) {
            integerList = JsonUtils.getIntegerList(this.f7619a, str, list);
        }
        return integerList;
    }

    public void a(String str, boolean z10) {
        synchronized (this.f7620b) {
            JsonUtils.putBoolean(this.f7619a, str, z10);
        }
    }

    public void a(String str, Object obj) {
        synchronized (this.f7620b) {
            JsonUtils.putObject(this.f7619a, str, obj);
        }
    }
}
