package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class Ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f27292a;

    private C8 a() throws Exception {
        C8 c10 = new C8(this.f27292a, Y5.d.f27936a);
        if (!c10.exists()) {
            a(c10);
        }
        return c10;
    }

    public synchronized JSONObject b() throws Exception {
        return IronSourceVideoBridge.jsonObjectInit(IronSourceStorageUtils.readFile(a()));
    }

    public Ob(String str) {
        this.f27292a = str;
    }

    private void a(C8 c10) throws Exception {
        IronSourceStorageUtils.saveFile(IronSourceVideoBridge.jsonObjectInit().toString().getBytes(), c10.getPath());
    }

    public synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        JSONObject jSONObjectOptJSONObject = jSONObjectB.optJSONObject(str);
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectOptJSONObject.putOpt(next, jSONObject.opt(next));
            }
        } else {
            jSONObjectB.putOpt(str, jSONObject);
        }
        return a(jSONObjectB);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject jSONObjectB;
        jSONObjectB = b();
        jSONObjectB.put(str, jSONObject);
        return a(jSONObjectB);
    }

    public synchronized boolean a(String str) throws Exception {
        JSONObject jSONObjectB = b();
        if (!jSONObjectB.has(str)) {
            return true;
        }
        jSONObjectB.remove(str);
        return a(jSONObjectB);
    }

    public boolean a(ArrayList<C8> arrayList) throws Exception {
        Iterator<C8> it = arrayList.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z10 = false;
            }
        }
        return z10;
    }
}
