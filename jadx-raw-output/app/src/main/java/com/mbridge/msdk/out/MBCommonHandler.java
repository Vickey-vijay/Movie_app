package com.mbridge.msdk.out;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public abstract class MBCommonHandler {
    public Context context;
    public Map<String, Object> properties;

    public MBCommonHandler() {
    }

    public abstract boolean load();

    public abstract void release();

    public MBCommonHandler(Map<String, Object> map, Context context) {
        this.properties = map;
        this.context = context;
    }
}
