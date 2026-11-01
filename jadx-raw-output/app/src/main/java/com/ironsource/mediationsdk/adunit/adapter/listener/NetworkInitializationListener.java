package com.ironsource.mediationsdk.adunit.adapter.listener;

import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface NetworkInitializationListener {
    void onInitFailed(int i10, String str);

    void onInitSuccess();

    default void onInitFailed(int i10, String str, Map<String, Object> map) {
        onInitFailed(i10, str);
    }

    default void onInitSuccess(Map<String, Object> map) {
        onInitSuccess();
    }
}
