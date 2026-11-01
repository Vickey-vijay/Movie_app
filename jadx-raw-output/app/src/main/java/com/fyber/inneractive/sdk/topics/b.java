package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.Topic;
import android.adservices.topics.TopicsManager;
import android.content.Context;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.r;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.FyberDiscovery;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f18491a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f18492b;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f18497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public GetTopicsRequest f18498h;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f18493c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashMap f18494d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ArrayList f18495e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f18496f = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f18499i = new AtomicBoolean(false);

    public final void a(boolean z10, boolean z11) {
        if (this.f18499i.compareAndSet(false, true)) {
            this.f18491a = z10;
            this.f18492b = z11;
            GetTopicsRequest.Builder builder = new GetTopicsRequest.Builder();
            builder.setAdsSdkName(FyberDiscovery.f43973g);
            this.f18498h = builder.build();
            this.f18497g = new a(this);
        }
    }

    public final JSONArray b() {
        JSONObject jSONObject;
        if (this.f18496f.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (Topic topic : this.f18496f) {
            if (this.f18494d.containsKey(topic)) {
                jSONObject = (JSONObject) this.f18494d.get(topic);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("id", topic.getTopicId());
                    jSONObject2.put("mv", topic.getModelVersion());
                    jSONObject2.put("tv", topic.getTaxonomyVersion());
                    this.f18494d.put(topic, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }

    public final void c() {
        TopicsManager topicsManager;
        Context baseContext = o.f18599a.getBaseContext();
        if (baseContext == null || (topicsManager = (TopicsManager) baseContext.getSystemService(TopicsManager.class)) == null) {
            return;
        }
        topicsManager.getTopics(this.f18498h, r.f18606a, this.f18497g);
    }

    public final JSONArray a() {
        JSONObject jSONObject;
        if (this.f18495e.isEmpty()) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (EncryptedTopic encryptedTopic : this.f18495e) {
            if (!IAConfigManager.c()) {
                jSONObject = null;
            } else if (this.f18493c.containsKey(encryptedTopic)) {
                jSONObject = (JSONObject) this.f18493c.get(encryptedTopic);
            } else {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    byte[] encryptedTopic2 = encryptedTopic.getEncryptedTopic();
                    jSONObject2.put("et", encryptedTopic2 == null ? null : Base64.encodeToString(encryptedTopic2, 10));
                    jSONObject2.put("ki", encryptedTopic.getKeyIdentifier());
                    byte[] encapsulatedKey = encryptedTopic.getEncapsulatedKey();
                    jSONObject2.put("ek", encapsulatedKey == null ? null : Base64.encodeToString(encapsulatedKey, 10));
                    this.f18493c.put(encryptedTopic, jSONObject2);
                    jSONObject = jSONObject2;
                } catch (Exception e10) {
                    IAlog.a("%sException when convertEncryptedTopicToJSON called", e10, IAlog.a(this));
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONArray.put(jSONObject);
            }
        }
        if (jSONArray.length() > 0) {
            return jSONArray;
        }
        return null;
    }
}
