package com.bytedance.sdk.component.utils;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class jqy {
    private static vt ouw;

    public interface vt {
        void ouw(String str, ouw ouwVar);
    }

    public static void ouw(vt vtVar) {
        ouw = vtVar;
    }

    public static abstract class ouw {
        public abstract JSONObject ouw();

        public final String vt() {
            try {
                return ouw().toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static void ouw(String str, ouw ouwVar) {
        vt vtVar = ouw;
        if (vtVar == null) {
            return;
        }
        vtVar.ouw(str, ouwVar);
    }
}
