package com.applovin.impl.sdk.network;

import android.text.TextUtils;
import com.applovin.impl.i5;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.m;
import com.applovin.impl.sdk.o;
import com.applovin.impl.x4;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public class c extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final b f9491g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final o f9492h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AtomicBoolean f9493i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f9494j;

    public List a(int i10) throws Throwable {
        ArrayList arrayList = new ArrayList();
        m mVarG = this.f7705a.G();
        if (!mVarG.b("persistent_postback_cache.json", k.o())) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file does not exist.");
            return arrayList;
        }
        File fileA = mVarG.a("persistent_postback_cache.json", k.o());
        String strF = mVarG.f(fileA);
        if (TextUtils.isEmpty(strF)) {
            o.h("PersistentPostbackQueueSaveTask", "Postbacks queue file has no content.");
            return arrayList;
        }
        boolean z10 = false;
        try {
            JSONArray jSONArray = new JSONObject(strF).getJSONArray("pb");
            if (o.a()) {
                this.f9492h.a("PersistentPostbackQueueSaveTask", "Deserializing " + jSONArray.length() + " postback(s)...");
            }
            arrayList.ensureCapacity(Math.max(1, jSONArray.length()));
            Integer num = (Integer) this.f7705a.a(x4.I2);
            for (int i11 = 0; i11 < jSONArray.length() && arrayList.size() < i10; i11++) {
                try {
                    d dVar = new d(jSONArray.getJSONObject(i11), this.f7705a);
                    if (dVar.c() < num.intValue()) {
                        arrayList.add(dVar);
                    } else {
                        o.h("PersistentPostbackQueueSaveTask", "Skipping deserialization because maximum attempt count exceeded for postback: " + dVar);
                    }
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to deserialize postback from json", th2);
                    this.f7705a.D().a("PersistentPostbackQueueSaveTask", "deserializePostback", th2);
                }
            }
            if (o.a()) {
                this.f9492h.a("PersistentPostbackQueueSaveTask", "Successfully loaded postback queue with " + arrayList.size() + " postback(s).");
            }
        } catch (Throwable th3) {
            try {
                o.c("PersistentPostbackQueueSaveTask", "Failed to load postback queue", th3);
                try {
                    this.f7705a.D().a("PersistentPostbackQueueSaveTask", "deserializePostbackQueue", th3);
                    if (((Boolean) this.f7705a.a(x4.N0)).booleanValue()) {
                        mVarG.a(fileA, "removeAfterDeserializationFail");
                    }
                } catch (Throwable th4) {
                    th = th4;
                    z10 = true;
                    if (z10 && ((Boolean) this.f7705a.a(x4.N0)).booleanValue()) {
                        mVarG.a(fileA, "removeAfterDeserializationFail");
                    }
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
            }
        }
        this.f9494j = arrayList.isEmpty();
        return arrayList;
    }

    public c(b bVar, k kVar) {
        super("PersistentPostbackQueueSaveTask", kVar);
        this.f9493i = new AtomicBoolean();
        this.f9494j = false;
        this.f9491g = bVar;
        this.f9492h = kVar.O();
    }

    @Override // java.lang.Runnable
    public void run() {
        a(this.f9491g.d());
    }

    private void a(List list) {
        if (!(this.f9494j && list.isEmpty()) && this.f9493i.compareAndSet(false, true)) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                try {
                    jSONArray.put(dVar.q());
                } catch (Throwable th2) {
                    o.c("PersistentPostbackQueueSaveTask", "Unable to serialize postback to JSON: " + dVar, th2);
                    this.f7705a.D().a("PersistentPostbackQueueSaveTask", "serializePostback", th2);
                }
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("pb", jSONArray);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(jSONObject.toString().getBytes("UTF-8"));
                m mVarG = this.f7705a.G();
                if (mVarG.a((InputStream) byteArrayInputStream, mVarG.a("persistent_postback_cache.json", k.o()), true)) {
                    if (o.a()) {
                        this.f9492h.a("PersistentPostbackQueueSaveTask", "Exported postback queue to disk.");
                    }
                } else if (o.a()) {
                    this.f9492h.b("PersistentPostbackQueueSaveTask", "Unable to export postback queue to disk.");
                }
            } catch (Throwable th3) {
                o.c("PersistentPostbackQueueSaveTask", "Unable to export postbacks to disk: " + jSONArray, th3);
                this.f7705a.D().a("PersistentPostbackQueueSaveTask", "serializePostbackQueue", th3);
            }
            this.f9493i.set(false);
        }
    }
}
