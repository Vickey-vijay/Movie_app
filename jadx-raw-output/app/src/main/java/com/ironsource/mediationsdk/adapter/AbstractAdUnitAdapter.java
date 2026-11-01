package com.ironsource.mediationsdk.adapter;

import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractAdUnitAdapter<AdNetworkAdapter> implements INetworkInitCallbackListener {
    private final AdNetworkAdapter adapter;

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
    }

    @Override // com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
    }

    public final String getAdUnitIdMissingErrorString(String str) {
        p.j(str, C3426d4.i.W);
        return "Missing params - " + str;
    }

    public final AdNetworkAdapter getAdapter() {
        return this.adapter;
    }

    public final String getConfigStringValueFromKey(JSONObject jSONObject, String str) {
        p.j(jSONObject, "config");
        p.j(str, C3426d4.i.W);
        String strOptString = jSONObject.optString(str);
        p.i(strOptString, "config.optString(key)");
        return strOptString;
    }

    public final void postBackgroundThread(Runnable runnable) {
        p.j(runnable, "runnable");
        IronSourceThreadManager.postAdapterBackgroundTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public final void postOnUIThread(Runnable runnable) {
        p.j(runnable, "runnable");
        IronSourceThreadManager.postOnUiThreadTask$default(IronSourceThreadManager.INSTANCE, runnable, 0L, 2, null);
    }

    public AbstractAdUnitAdapter(AdNetworkAdapter adnetworkadapter) {
        this.adapter = adnetworkadapter;
    }
}
