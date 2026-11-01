package com.yk.e.object;

import android.app.Fragment;
import android.os.Bundle;
import com.yk.e.util.AdLog;

/* JADX INFO: loaded from: classes11.dex */
public class LifeListenerFragment extends Fragment {
    private LifeListener mLifeListener;

    public void removeLifeListener() {
        this.mLifeListener = null;
    }

    public void addLifeListener(LifeListener lifeListener) {
        this.mLifeListener = lifeListener;
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onCreate(bundle);
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AdLog.d("LifeListenerFragment onDestroy");
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onDestroy();
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        AdLog.d("LifeListenerFragment onPause");
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onPause();
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        AdLog.d("LifeListenerFragment onResume");
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onResume();
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        AdLog.d("LifeListenerFragment onStart");
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onStart();
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        AdLog.d("LifeListenerFragment onStop");
        LifeListener lifeListener = this.mLifeListener;
        if (lifeListener != null) {
            lifeListener.onStop();
        }
    }
}
