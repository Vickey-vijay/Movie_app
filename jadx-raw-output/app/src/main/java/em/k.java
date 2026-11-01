package em;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: SpUtils.java */
/* JADX INFO: loaded from: classes11.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SharedPreferences f52675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SharedPreferences.Editor f52676b;

    public static k i(Context context) {
        return new k(context, "default_sp");
    }

    public boolean a(String str, boolean z10) {
        SharedPreferences sharedPreferences = this.f52675a;
        return sharedPreferences == null ? z10 : sharedPreferences.getBoolean(str, z10);
    }

    public <T> List<T> b(String str, Class<T> cls) {
        ArrayList arrayList = new ArrayList();
        SharedPreferences sharedPreferences = this.f52675a;
        String string = sharedPreferences != null ? sharedPreferences.getString(str, "") : "";
        if (o.c(string)) {
            return arrayList;
        }
        Gson gson = new Gson();
        Iterator<s5.h> it = new s5.k().c(string).c().iterator();
        while (it.hasNext()) {
            arrayList.add(gson.fromJson(it.next(), (Class) cls));
        }
        return arrayList;
    }

    public float c(String str, float f10) {
        SharedPreferences sharedPreferences = this.f52675a;
        return sharedPreferences == null ? f10 : sharedPreferences.getFloat(str, f10);
    }

    public int d(String str, int i10) {
        SharedPreferences sharedPreferences = this.f52675a;
        return sharedPreferences == null ? i10 : sharedPreferences.getInt(str, i10);
    }

    public long f(String str, long j10) {
        SharedPreferences sharedPreferences = this.f52675a;
        return sharedPreferences == null ? j10 : sharedPreferences.getLong(str, j10);
    }

    public String h(String str, String str2) {
        SharedPreferences sharedPreferences = this.f52675a;
        return sharedPreferences == null ? "" : sharedPreferences.getString(str, str2);
    }

    public void j(String str, boolean z10) {
        SharedPreferences.Editor editor = this.f52676b;
        if (editor == null) {
            return;
        }
        editor.putBoolean(str, z10);
        this.f52676b.commit();
    }

    public void k(String str, float f10) {
        SharedPreferences.Editor editor = this.f52676b;
        if (editor == null) {
            return;
        }
        editor.putFloat(str, f10);
        this.f52676b.commit();
    }

    public void l(String str, int i10) {
        SharedPreferences.Editor editor = this.f52676b;
        if (editor == null) {
            return;
        }
        editor.putInt(str, i10);
        this.f52676b.commit();
    }

    public void m(String str, long j10) {
        SharedPreferences.Editor editor = this.f52676b;
        if (editor == null) {
            return;
        }
        editor.putLong(str, j10);
        this.f52676b.commit();
    }

    public void o(String str, String str2) {
        SharedPreferences.Editor editor = this.f52676b;
        if (editor == null) {
            return;
        }
        editor.putString(str, str2);
        this.f52676b.commit();
    }

    public <T> void p(String str, List<T> list) {
        if (list == null || list.size() < 0) {
            return;
        }
        this.f52676b.putString(str, new Gson().toJson(list));
        this.f52676b.commit();
    }

    public k(Context context, String str) {
        if (context != null) {
            this.f52675a = context.getApplicationContext().getSharedPreferences(str, 0);
        }
        SharedPreferences sharedPreferences = this.f52675a;
        if (sharedPreferences != null) {
            this.f52676b = sharedPreferences.edit();
        }
    }

    public String e(Class<?> cls) {
        return cls.getName();
    }

    public <T> T g(Class<T> cls) {
        String strH = h(e(cls), null);
        if (TextUtils.isEmpty(strH)) {
            return null;
        }
        try {
            return (T) new Gson().fromJson(strH, (Class) cls);
        } catch (Exception unused) {
            return null;
        }
    }

    public void n(Object obj) {
        o(e(obj.getClass()), new Gson().toJson(obj));
    }
}
