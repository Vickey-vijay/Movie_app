package com.yk.e.inf;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public interface IAdPlayer {
    int getDuration();

    int getRestTime();

    void hasVoice();

    void init(Context context, View view, String str);

    void noVoice();

    void pause();

    void play(Context context, String str);

    void play(Context context, String str, boolean z10);

    void preLoad(Activity activity, String str);

    void release();

    void restore();

    void stop();
}
