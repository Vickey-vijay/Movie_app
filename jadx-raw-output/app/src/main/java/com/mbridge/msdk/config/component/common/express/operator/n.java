package com.mbridge.msdk.config.component.common.express.operator;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: compiled from: OperatorSharePreferences.java */
/* JADX INFO: loaded from: classes8.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f33055a;

    /* JADX WARN: Code duplicated, block: B:28:0x0068  */
    /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, List<Object> list) {
        String strValueOf;
        int iIntValue;
        byte b10;
        byte b11;
        if (TextUtils.isEmpty(str) || list == null || list.isEmpty()) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (!str.equals("AppPresGetObj")) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Object objValueOf = "";
        String string = list.get(0) != null ? list.get(0).toString() : "";
        if (list.size() >= 2) {
            Object obj2 = list.get(1);
            if (obj2 instanceof Integer) {
                iIntValue = ((Integer) obj2).intValue();
            } else if (obj2 != null) {
                try {
                    iIntValue = Integer.parseInt(obj2.toString());
                } catch (NumberFormatException unused) {
                    iIntValue = 1;
                }
            } else {
                iIntValue = 1;
            }
            if (list.size() == 3) {
                Object obj3 = list.get(2);
                if (obj3 instanceof String) {
                    strValueOf = String.valueOf(obj3);
                } else {
                    strValueOf = "STRING";
                }
            } else {
                strValueOf = "STRING";
            }
        } else {
            strValueOf = "STRING";
            iIntValue = 1;
        }
        if (TextUtils.isEmpty(string)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (iIntValue == 1) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(com.mbridge.msdk.foundation.controller.c.n().d());
                switch (strValueOf.hashCode()) {
                    case -1838656495:
                        if (!strValueOf.equals("STRING")) {
                            b10 = -1;
                        } else {
                            b10 = 4;
                        }
                        break;
                    case 72655:
                        if (!strValueOf.equals("INT")) {
                            b10 = -1;
                        } else {
                            b10 = 0;
                        }
                        break;
                    case 2342524:
                        if (!strValueOf.equals("LONG")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 66988604:
                        if (!strValueOf.equals("FLOAT")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    case 782694408:
                        if (!strValueOf.equals("BOOLEAN")) {
                            b10 = -1;
                        } else {
                            b10 = 3;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                if (b10 == 0) {
                    objValueOf = Integer.valueOf(defaultSharedPreferences.getInt(string, 0));
                } else if (b10 == 1) {
                    objValueOf = Long.valueOf(defaultSharedPreferences.getLong(string, 0L));
                } else if (b10 != 2) {
                    objValueOf = b10 != 3 ? defaultSharedPreferences.getString(string, "") : Boolean.valueOf(defaultSharedPreferences.getBoolean(string, false));
                } else {
                    objValueOf = Float.valueOf(defaultSharedPreferences.getFloat(string, 0.0f));
                }
            } catch (Exception unused2) {
            }
        } else {
            switch (strValueOf) {
                case "STRING":
                    b11 = 4;
                    break;
                case "INT":
                    b11 = 0;
                    break;
                case "LONG":
                    b11 = 1;
                    break;
                case "FLOAT":
                    b11 = 2;
                    break;
                case "BOOLEAN":
                    b11 = 3;
                    break;
                default:
                    b11 = -1;
                    break;
            }
            if (b11 == 0) {
                objValueOf = Integer.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0));
            } else if (b11 == 1) {
                objValueOf = Long.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0L));
            } else if (b11 != 2) {
                objValueOf = b11 != 3 ? com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, "") : Boolean.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, false));
            } else {
                objValueOf = Float.valueOf(com.mbridge.msdk.config.component.common.util.b.a(com.mbridge.msdk.foundation.controller.c.n().d()).a(string, 0.0f));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(objValueOf);
    }

    public n(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f33055a = cVar;
    }
}
