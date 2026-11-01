package com.wangxiong.sdk.view;

import android.app.Activity;
import android.view.View;
import com.wangxiong.sdk.callBack.InternalAdCallBack;
import com.yk.e.subad.MainInternalAdLoader;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class InternalAdLoader extends MainInternalAdLoader {
    public InternalAdLoader(Activity activity, String str, InternalAdCallBack internalAdCallBack) {
        super(activity, str, internalAdCallBack);
    }

    public void loadAd() {
        super.loadAd();
    }

    public void registerViewList(List<View> list) {
        super.registerViewList(list);
    }
}
