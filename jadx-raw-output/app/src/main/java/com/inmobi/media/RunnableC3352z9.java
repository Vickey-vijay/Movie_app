package com.inmobi.media;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.z9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class RunnableC3352z9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ JSONObject f25832a;

    public RunnableC3352z9(JSONObject jSONObject) {
        this.f25832a = jSONObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (Ok.c()) {
            return;
        }
        F9.a(this.f25832a);
    }
}
