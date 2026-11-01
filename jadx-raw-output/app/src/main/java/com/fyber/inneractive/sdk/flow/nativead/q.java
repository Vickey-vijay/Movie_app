package com.fyber.inneractive.sdk.flow.nativead;

import com.fyber.inneractive.sdk.config.IAConfigManager;

/* JADX INFO: loaded from: classes11.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f15544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f15545b;

    static {
        String strB = com.fyber.inneractive.sdk.util.o.b("ia_js_load_monitor.txt");
        f15544a = "<html><head>" + strB + "<script src='%s'></script></head><body></body></html>";
        f15545b = "<html><head>" + strB + "%s</head><body></body></html>";
    }

    public static boolean a(String str) {
        return (str == null || str.trim().isEmpty()) ? false : true;
    }

    public static String b(String str) {
        IAConfigManager iAConfigManager = IAConfigManager.O;
        if (str.startsWith(iAConfigManager.f15022q ? "https" : "http")) {
            return String.format(f15544a, str);
        }
        if (iAConfigManager.f15022q && !str.startsWith("https")) {
            return null;
        }
        if (!str.startsWith("<script")) {
            str = "<script type='text/javascript'>".concat(str);
        }
        if (!str.endsWith("</script>")) {
            str = str.concat("</script>");
        }
        return String.format(f15545b, str);
    }
}
