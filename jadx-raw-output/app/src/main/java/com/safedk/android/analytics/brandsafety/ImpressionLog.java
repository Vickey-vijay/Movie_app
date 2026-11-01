package com.safedk.android.analytics.brandsafety;

import android.os.SystemClock;
import android.text.TextUtils;
import com.safedk.android.utils.Logger;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
public class ImpressionLog implements Serializable {
    public static final String A = "fgr";
    public static final String B = "vst";
    public static final String C = "adr";
    public static final String D = "url";
    public static final String E = "cuo";
    public static final String F = "typ";
    public static final String G = "vad";
    public static final String H = "mth";
    public static final String I = "ntw";
    public static final String J = "api";
    public static final String K = "org";
    public static final String L = "dec";
    public static final String M = "cnt";
    public static final String N = "can";
    public static final String O = "fin";
    public static final String P = "||";
    public static final String Q = "|";
    public static final String R = "=";
    public static final String S = "[...]";
    private static final String T = "ImpressionLog";
    private static final int U = 60;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f43625a = "pre";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f43626b = "pr2";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f43627c = "prd";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f43628d = "mwl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f43629e = "mdl";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43630f = "mwd";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43631g = "mdd";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43632h = "mck";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f43633i = "mdh";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f43634j = "mfd";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f43635k = "mrv";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f43636l = "add";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f43637m = "cim";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f43638n = "clk";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f43639o = "vib";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f43640p = "vie";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f43641q = "ppl";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final String f43642r = "lad";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final String f43643s = "lar";
    private static final long serialVersionUID = -1926507337766691667L;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f43644t = "img";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final String f43645u = "jsm";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final String f43646v = "wnr";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final String f43647w = "int";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final String f43648x = "rid";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final String f43649y = "exp";

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f43650z = "bgr";
    private long V = Long.MAX_VALUE;
    private long W = Long.MAX_VALUE;
    private final Map<Long, List<String>> X = new TreeMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f43651a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f43652b;

        public a(String str, String str2) {
            this.f43651a = str;
            this.f43652b = str2;
        }
    }

    public ImpressionLog() {
    }

    public ImpressionLog(ImpressionLog impressionLog) {
        a(impressionLog);
    }

    public synchronized void a(ImpressionLog impressionLog) {
        if (impressionLog != null) {
            this.V = Math.min(this.V, impressionLog.V);
            this.W = Math.min(this.W, impressionLog.W);
            synchronized (impressionLog) {
                for (Map.Entry<Long, List<String>> entry : impressionLog.X.entrySet()) {
                    List<String> arrayList = this.X.get(entry.getKey());
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        this.X.put(entry.getKey(), arrayList);
                    }
                    arrayList.addAll(entry.getValue());
                }
            }
        }
    }

    private StringBuilder c(String str, a[] aVarArr) {
        StringBuilder sb2 = new StringBuilder(str);
        if (aVarArr != null) {
            for (a aVar : aVarArr) {
                String strA = aVar.f43652b;
                if (aVar.f43651a.equals("url")) {
                    strA = a(aVar.f43652b, 60);
                }
                sb2.append(Q).append(aVar.f43651a).append("=").append(strA);
            }
        }
        return sb2;
    }

    public synchronized void a(Long l10, Long l11, String str, a... aVarArr) {
        this.V = Math.min(this.V, l10.longValue());
        this.W = Math.min(this.W, l11.longValue());
        try {
            if (!TextUtils.isEmpty(str)) {
                StringBuilder sbC = c(str, aVarArr);
                List<String> arrayList = this.X.get(l11);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    this.X.put(l11, arrayList);
                } else if (!arrayList.contains(sbC.toString())) {
                }
                arrayList.add(sbC.toString());
                Logger.d(T, "add event: " + ((Object) sbC) + " at: " + l10 + ", count: " + arrayList.size());
            }
        } catch (NullPointerException e10) {
            Logger.d(T, "add event failed: type=" + str + ", logEvents=" + this.X + ", timeElapsed=" + l11);
        }
    }

    public void a(String str, a... aVarArr) {
        a(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    public synchronized void b(Long l10, Long l11, String str, a... aVarArr) {
        this.V = Math.min(this.V, l10.longValue());
        this.W = Math.min(this.W, l11.longValue());
        if (!TextUtils.isEmpty(str)) {
            int iB = 0;
            StringBuilder sbC = c(str, aVarArr);
            for (List<String> list : this.X.values()) {
                for (String str2 : list) {
                    if (str2.contains(sbC.toString())) {
                        iB = b(str2);
                        list.remove(str2);
                        break;
                    }
                }
                iB = iB;
            }
            sbC.append(Q).append(M).append("=").append(iB + 1);
            List<String> arrayList = this.X.get(l11);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.X.put(l11, arrayList);
            }
            arrayList.add(sbC.toString());
            Logger.d(T, "add cumulative event: " + ((Object) sbC) + " at: " + l10 + ", count: " + arrayList.size());
        }
    }

    public void b(String str, a... aVarArr) {
        b(Long.valueOf(System.currentTimeMillis()), Long.valueOf(SystemClock.elapsedRealtime()), str, aVarArr);
    }

    private int b(String str) {
        try {
            String[] strArrSplit = str.split("cnt=");
            if (strArrSplit.length > 1) {
                return Integer.parseInt(strArrSplit[1]);
            }
        } catch (Exception e10) {
            Logger.d(T, "get cumulative event counter, failed to parse event count from: " + str);
        }
        return 0;
    }

    private String a(String str, int i10) {
        if (str != null && str.length() > i10) {
            return str.substring(0, ((i10 * 2) / 3) - 3) + S + str.substring((str.length() - (i10 / 3)) + 2);
        }
        return str;
    }

    public synchronized boolean a(String str) {
        boolean z10;
        Iterator<List<String>> it = this.X.values().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().iterator();
            while (it2.hasNext()) {
                if (it2.next().contains(str)) {
                    z10 = true;
                }
            }
        }
        z10 = false;
        return z10;
    }

    public int a() {
        return this.X.size();
    }

    public synchronized String toString() {
        StringBuilder sb2;
        boolean z10;
        boolean z11 = true;
        sb2 = new StringBuilder();
        for (Map.Entry<Long, List<String>> entry : this.X.entrySet()) {
            for (String str : entry.getValue()) {
                if (z11) {
                    sb2.append(this.V);
                    z10 = false;
                } else {
                    sb2.append(P).append(entry.getKey().longValue() - this.W);
                    z10 = z11;
                }
                sb2.append(Q).append(str);
                z11 = z10;
            }
        }
        return sb2.toString();
    }
}
