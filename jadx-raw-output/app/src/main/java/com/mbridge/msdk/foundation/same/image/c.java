package com.mbridge.msdk.foundation.same.image;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: CommonImageLoaderListener.java */
/* JADX INFO: loaded from: classes4.dex */
public interface c {
    void onFailedLoad(String str, String str2);

    void onSuccessLoad(Bitmap bitmap, String str);
}
