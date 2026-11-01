package com.yk.e.object;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public interface LifeListener {
    void onCreate(Bundle bundle);

    void onDestroy();

    void onPause();

    void onResume();

    void onStart();

    void onStop();
}
