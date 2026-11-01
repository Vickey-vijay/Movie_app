package com.fyber.inneractive.sdk.topics;

import android.adservices.topics.EncryptedTopic;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.Topic;
import android.os.OutcomeReceiver;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public final class a implements OutcomeReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f18490a;

    public a(b bVar) {
        this.f18490a = bVar;
    }

    public final void onError(Throwable th2) {
        IAlog.a("%sTopic Experienced an error, and did not return successfully: %s", IAlog.a(b.class), ((Exception) th2).getMessage());
    }

    public final void onResult(Object obj) {
        GetTopicsResponse getTopicsResponse = (GetTopicsResponse) obj;
        b bVar = this.f18490a;
        if (bVar.f18491a) {
            List<Topic> topics = getTopicsResponse.getTopics();
            if (topics.isEmpty()) {
                IAlog.a("Topic results returned empty", new Object[0]);
            } else {
                bVar.f18496f = new ArrayList();
                for (int i10 = 0; i10 < topics.size(); i10++) {
                    IAlog.a("Topic returned %s", topics.get(i10).toString());
                    bVar.f18496f.add(topics.get(i10));
                }
            }
        }
        if (this.f18490a.f18492b && IAConfigManager.c()) {
            b bVar2 = this.f18490a;
            List encryptedTopics = getTopicsResponse.getEncryptedTopics();
            bVar2.getClass();
            if (encryptedTopics.isEmpty()) {
                IAlog.a("EncryptedTopic results returned empty", new Object[0]);
                return;
            }
            bVar2.f18495e = new ArrayList();
            for (int i11 = 0; i11 < encryptedTopics.size(); i11++) {
                IAlog.a("EncryptedTopic returned %s", ((EncryptedTopic) encryptedTopics.get(i11)).toString());
                bVar2.f18495e.add((EncryptedTopic) encryptedTopics.get(i11));
            }
        }
    }
}
