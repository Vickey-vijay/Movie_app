package com.unity3d.mediation;

/* JADX INFO: loaded from: classes5.dex */
public interface LevelPlayInitListener {
    void onInitFailed(LevelPlayInitError levelPlayInitError);

    void onInitSuccess(LevelPlayConfiguration levelPlayConfiguration);
}
