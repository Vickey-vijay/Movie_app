package com.ironsource.mediationsdk.adunit.adapter.internal;

import com.ironsource.mediationsdk.model.NetworkSettings;

/* JADX INFO: loaded from: classes6.dex */
public class AdapterBaseWrapper {
    public AdapterBaseInterface adapterBaseInterface;
    public NetworkSettings settings;

    public AdapterBaseInterface getAdapterBaseInterface() {
        return this.adapterBaseInterface;
    }

    public NetworkSettings getSettings() {
        return this.settings;
    }

    public AdapterBaseWrapper(AdapterBaseInterface adapterBaseInterface, NetworkSettings networkSettings) {
        this.adapterBaseInterface = adapterBaseInterface;
        this.settings = networkSettings;
    }
}
