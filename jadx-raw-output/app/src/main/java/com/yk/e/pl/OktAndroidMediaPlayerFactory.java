package com.yk.e.pl;

import android.content.Context;
import zo.c;

/* JADX INFO: loaded from: classes3.dex */
public class OktAndroidMediaPlayerFactory extends c<OktAndroidMediaPlayer> {
    public static OktAndroidMediaPlayerFactory create() {
        return new OktAndroidMediaPlayerFactory();
    }

    @Override // zo.c
    public OktAndroidMediaPlayer createPlayer(Context context) {
        return new OktAndroidMediaPlayer(context);
    }
}
