package com.mbridge.msdk.videocommon;

import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: TemplateWebviewCache.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39462a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39463b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39464c = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39465d = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39466e = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39467f = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39468g = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39469h = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39470i = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static ConcurrentHashMap<String, C0412a> f39471j = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: com.mbridge.msdk.videocommon.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: TemplateWebviewCache.java */
    public static class C0412a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WindVaneWebView f39472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f39473b;

        public void a(WindVaneWebView windVaneWebView) {
            this.f39472a = windVaneWebView;
        }

        public void a(String str) {
            WindVaneWebView windVaneWebView = this.f39472a;
            if (windVaneWebView != null) {
                windVaneWebView.setTag(str);
            }
        }

        public WindVaneWebView b() {
            return this.f39472a;
        }

        public boolean c() {
            return this.f39473b;
        }

        public String a() {
            WindVaneWebView windVaneWebView = this.f39472a;
            return windVaneWebView != null ? (String) windVaneWebView.getTag() : "";
        }

        public void a(boolean z10) {
            this.f39473b = z10;
        }
    }

    public static void a(String str, C0412a c0412a, boolean z10, boolean z11) {
        if (z10) {
            if (z11) {
                f39469h.put(str, c0412a);
                return;
            } else {
                f39468g.put(str, c0412a);
                return;
            }
        }
        if (z11) {
            f39471j.put(str, c0412a);
        } else {
            f39470i.put(str, c0412a);
        }
    }

    public static C0412a b(String str) {
        if (f39468g.containsKey(str)) {
            return f39468g.get(str);
        }
        if (f39469h.containsKey(str)) {
            return f39469h.get(str);
        }
        if (f39470i.containsKey(str)) {
            return f39470i.get(str);
        }
        if (f39471j.containsKey(str)) {
            return f39471j.get(str);
        }
        return null;
    }

    public static void c(String str) {
        for (Map.Entry<String, C0412a> entry : f39468g.entrySet()) {
            if (entry.getKey().contains(str)) {
                f39468g.remove(entry.getKey());
            }
        }
    }

    public static void d(String str) {
        for (Map.Entry<String, C0412a> entry : f39469h.entrySet()) {
            if (entry.getKey().contains(str)) {
                f39469h.remove(entry.getKey());
            }
        }
    }

    public static void e(String str) {
        if (f39468g.containsKey(str)) {
            f39468g.remove(str);
        }
        if (f39470i.containsKey(str)) {
            f39470i.remove(str);
        }
        if (f39469h.containsKey(str)) {
            f39469h.remove(str);
        }
        if (f39471j.containsKey(str)) {
            f39471j.remove(str);
        }
    }

    public static void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : f39468g.keySet()) {
                if (!TextUtils.isEmpty(str2) && str2.startsWith(str)) {
                    f39468g.remove(str2);
                }
            }
        } else {
            f39468g.clear();
        }
        f39469h.clear();
    }

    public static void b(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 == 94) {
                if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0412a> concurrentHashMap = f39463b;
                    if (concurrentHashMap != null) {
                        concurrentHashMap.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0412a> concurrentHashMap2 = f39466e;
                if (concurrentHashMap2 != null) {
                    concurrentHashMap2.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (i10 != 287) {
                if (i10 != 288) {
                    ConcurrentHashMap<String, C0412a> concurrentHashMap3 = f39462a;
                    if (concurrentHashMap3 != null) {
                        concurrentHashMap3.remove(requestIdNotice);
                        return;
                    }
                    return;
                }
                ConcurrentHashMap<String, C0412a> concurrentHashMap4 = f39465d;
                if (concurrentHashMap4 != null) {
                    concurrentHashMap4.remove(requestIdNotice);
                    return;
                }
                return;
            }
            if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0412a> concurrentHashMap5 = f39464c;
                if (concurrentHashMap5 != null) {
                    concurrentHashMap5.remove(requestIdNotice);
                    return;
                }
                return;
            }
            ConcurrentHashMap<String, C0412a> concurrentHashMap6 = f39467f;
            if (concurrentHashMap6 != null) {
                concurrentHashMap6.remove(requestIdNotice);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a() {
        f39470i.clear();
        f39471j.clear();
    }

    public static C0412a a(int i10, CampaignEx campaignEx) {
        if (campaignEx == null) {
            return null;
        }
        try {
            String requestIdNotice = campaignEx.getRequestIdNotice();
            if (i10 == 288) {
                requestIdNotice = campaignEx.getKeyIaUrl();
            }
            if (i10 != 94) {
                if (i10 != 287) {
                    if (i10 != 288) {
                        ConcurrentHashMap<String, C0412a> concurrentHashMap = f39462a;
                        if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                            return f39462a.get(requestIdNotice);
                        }
                    } else {
                        ConcurrentHashMap<String, C0412a> concurrentHashMap2 = f39465d;
                        if (concurrentHashMap2 != null && concurrentHashMap2.size() > 0) {
                            return f39465d.get(requestIdNotice);
                        }
                    }
                } else if (campaignEx.isBidCampaign()) {
                    ConcurrentHashMap<String, C0412a> concurrentHashMap3 = f39464c;
                    if (concurrentHashMap3 != null && concurrentHashMap3.size() > 0) {
                        return f39464c.get(requestIdNotice);
                    }
                } else {
                    ConcurrentHashMap<String, C0412a> concurrentHashMap4 = f39467f;
                    if (concurrentHashMap4 != null && concurrentHashMap4.size() > 0) {
                        return f39467f.get(requestIdNotice);
                    }
                }
            } else if (campaignEx.isBidCampaign()) {
                ConcurrentHashMap<String, C0412a> concurrentHashMap5 = f39463b;
                if (concurrentHashMap5 != null && concurrentHashMap5.size() > 0) {
                    return f39463b.get(requestIdNotice);
                }
            } else {
                ConcurrentHashMap<String, C0412a> concurrentHashMap6 = f39466e;
                if (concurrentHashMap6 != null && concurrentHashMap6.size() > 0) {
                    return f39466e.get(requestIdNotice);
                }
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
        return null;
    }

    public static void b(int i10, String str, C0412a c0412a) {
        try {
            if (i10 == 94) {
                if (f39466e == null) {
                    f39466e = new ConcurrentHashMap<>();
                }
                f39466e.put(str, c0412a);
            } else if (i10 == 287) {
                if (f39467f == null) {
                    f39467f = new ConcurrentHashMap<>();
                }
                f39467f.put(str, c0412a);
            } else if (i10 != 288) {
                if (f39462a == null) {
                    f39462a = new ConcurrentHashMap<>();
                }
                f39462a.put(str, c0412a);
            } else {
                if (f39465d == null) {
                    f39465d = new ConcurrentHashMap<>();
                }
                f39465d.put(str, c0412a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }

    public static void a(int i10, String str, C0412a c0412a) {
        try {
            if (i10 == 94) {
                if (f39463b == null) {
                    f39463b = new ConcurrentHashMap<>();
                }
                f39463b.put(str, c0412a);
            } else {
                if (i10 != 287) {
                    return;
                }
                if (f39464c == null) {
                    f39464c = new ConcurrentHashMap<>();
                }
                f39464c.put(str, c0412a);
            }
        } catch (Exception e10) {
            if (MBridgeConstans.DEBUG) {
                e10.printStackTrace();
            }
        }
    }
}
