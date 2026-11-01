package com.apm.insight.nativecrash;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.ICommonParams;
import com.apm.insight.l.m;
import com.apm.insight.runtime.j;
import com.ironsource.C3784xa;
import com.ironsource.Z7;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: NativeFileParser.java */
/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f6628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ICommonParams f6629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ICommonParams f6630c;

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class d extends c {
        @NonNull
        public final HashMap<String, List<String>> b() {
            HashMap<String, List<String>> map = new HashMap<>();
            try {
                JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f6631a.getAbsolutePath());
                if (jSONArrayA == null) {
                    return map;
                }
                for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
                    String strOptString = jSONArrayA.optString(i10);
                    if (!TextUtils.isEmpty(strOptString) && strOptString.startsWith("[tid:0") && strOptString.endsWith("sigstack:0x0]")) {
                        int iIndexOf = strOptString.indexOf("[routine:0x");
                        int i11 = iIndexOf + 11;
                        String strSubstring = iIndexOf > 0 ? strOptString.substring(i11, strOptString.indexOf(93, i11)) : "unknown addr";
                        List<String> arrayList = map.get(strSubstring);
                        if (arrayList == null) {
                            arrayList = new ArrayList<>();
                            map.put(strSubstring, arrayList);
                        }
                        arrayList.add(strOptString);
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
            return map;
        }

        public d(File file) {
            super(file);
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class e extends c {
        @NonNull
        public final JSONArray a(HashMap<String, List<String>> map) {
            int iIndexOf;
            List<String> list;
            JSONArray jSONArray = new JSONArray();
            if (map.isEmpty()) {
                return jSONArray;
            }
            try {
                JSONArray jSONArrayA = com.apm.insight.l.f.a(this.f6631a.getAbsolutePath());
                if (jSONArrayA == null) {
                    return jSONArray;
                }
                for (int i10 = 0; i10 < jSONArrayA.length(); i10++) {
                    String strOptString = jSONArrayA.optString(i10);
                    if (!TextUtils.isEmpty(strOptString) && (iIndexOf = strOptString.indexOf(StringUtils.PROCESS_POSTFIX_DELIMITER)) > 2) {
                        String strSubstring = strOptString.substring(2, iIndexOf);
                        if (map.containsKey(strSubstring) && (list = map.get(strSubstring)) != null) {
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                jSONArray.put(it.next() + Z7.f27998r + strOptString);
                            }
                            map.remove(strSubstring);
                        }
                    }
                }
                Iterator<List<String>> it2 = map.values().iterator();
                while (it2.hasNext()) {
                    Iterator<String> it3 = it2.next().iterator();
                    while (it3.hasNext()) {
                        jSONArray.put(it3.next() + "  0x000000:unknown");
                    }
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
            return jSONArray;
        }

        public e(File file) {
            super(file);
        }
    }

    public b(Context context, ICommonParams iCommonParams) {
        this(context, iCommonParams, null);
    }

    @NonNull
    public static JSONArray a(File file, File file2) {
        return new e(file2).a(new d(file).b());
    }

    public static int b(String str) {
        return new f(com.apm.insight.l.j.c(str)).a();
    }

    public static int c(String str) {
        return new C0029b(com.apm.insight.l.j.d(str)).a();
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class a extends c {
        public a(File file) {
            super(file);
            this.f6632b = "Total FD Count:";
            this.f6633c = StringUtils.PROCESS_POSTFIX_DELIMITER;
            this.f6634d = -2;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.nativecrash.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class C0029b extends c {
        public C0029b(File file) {
            super(file);
            this.f6632b = "VmSize:";
            this.f6633c = "\\s+";
            this.f6634d = -1;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public File f6631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f6632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f6633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f6634d;

        public final int a() {
            int i10;
            Throwable th2;
            if (!this.f6631a.exists() || !this.f6631a.isFile()) {
                return -1;
            }
            BufferedReader bufferedReader = null;
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new FileReader(this.f6631a));
                int iA = -1;
                do {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        iA = a(line);
                    } catch (Throwable th3) {
                        th2 = th3;
                        i10 = iA;
                        bufferedReader = bufferedReader2;
                        try {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                            return i10;
                        } finally {
                            if (bufferedReader != null) {
                                com.apm.insight.a.a((Closeable) bufferedReader);
                            }
                        }
                    }
                } while (iA == -1);
                com.apm.insight.a.a((Closeable) bufferedReader2);
                return iA;
            } catch (Throwable th4) {
                i10 = -1;
                th2 = th4;
            }
        }

        public c(File file) {
            this.f6631a = file;
        }

        private int a(String str) {
            int i10 = this.f6634d;
            if (!str.startsWith(this.f6632b)) {
                return i10;
            }
            try {
                i10 = Integer.parseInt(str.split(this.f6633c)[1].trim());
            } catch (NumberFormatException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
            if (i10 < 0) {
                return -2;
            }
            return i10;
        }
    }

    /* JADX INFO: compiled from: NativeFileParser.java */
    public static class f extends c {
        public f(File file) {
            super(file);
            this.f6632b = "Total Threads Count:";
            this.f6633c = StringUtils.PROCESS_POSTFIX_DELIMITER;
            this.f6634d = -2;
        }
    }

    public b(Context context, ICommonParams iCommonParams, b bVar) {
        this.f6628a = context;
        this.f6629b = iCommonParams;
        this.f6630c = bVar == null ? null : bVar.f6629b;
    }

    @NonNull
    public final Map<String, Object> b() {
        Map<String, Object> map;
        Throwable th2;
        Map<String, Object> map2;
        try {
            ICommonParams iCommonParams = this.f6630c;
            map2 = iCommonParams != null ? iCommonParams.getCommonParams() : new HashMap<>();
            try {
                map2.putAll(this.f6629b.getCommonParams());
                th2 = null;
            } catch (Throwable th3) {
                map = map2;
                th = th3;
                Map<String, Object> map3 = map;
                th2 = th;
                map2 = map3;
            }
        } catch (Throwable th4) {
            th = th4;
            map = null;
        }
        if (map2 == null) {
            map2 = new HashMap<>(4);
            if (th2 != null) {
                try {
                    map2.put("err_info", m.a(th2));
                } catch (Throwable unused) {
                }
            }
        }
        if (a(map2)) {
            try {
                PackageInfo packageInfo = this.f6628a.getPackageManager().getPackageInfo(this.f6628a.getPackageName(), 128);
                map2.put("version_name", packageInfo.versionName);
                map2.put("version_code", Integer.valueOf(packageInfo.versionCode));
                if (map2.get("update_version_code") == null) {
                    Bundle bundle = packageInfo.applicationInfo.metaData;
                    Object obj = bundle != null ? bundle.get("UPDATE_VERSION_CODE") : null;
                    if (obj == null) {
                        obj = map2.get("version_code");
                    }
                    map2.put("update_version_code", obj);
                }
            } catch (Throwable unused2) {
                map2.put("version_name", com.apm.insight.l.a.c(this.f6628a));
                map2.put("version_code", Integer.valueOf(com.apm.insight.l.a.d(this.f6628a)));
                if (map2.get("update_version_code") == null) {
                    map2.put("update_version_code", map2.get("version_code"));
                }
            }
        } else {
            try {
                String str = this.f6628a.getPackageManager().getPackageInfo(this.f6628a.getPackageName(), 128).versionName;
                String str2 = (String) Class.forName(this.f6628a.getPackageName() + ".BuildConfig").getDeclaredField(com.safedk.android.analytics.brandsafety.creatives.discoveries.m.f44256e).get(null);
                if (str != null && !str.equals(str2)) {
                    map2.put("manifest_version", str);
                }
            } catch (Throwable unused3) {
            }
        }
        return map2;
    }

    @NonNull
    public final ICommonParams c() {
        return this.f6629b;
    }

    public final String d() {
        try {
            return this.f6629b.getDeviceId();
        } catch (Throwable unused) {
            return "";
        }
    }

    public final String e() {
        try {
            return String.valueOf(this.f6629b.getCommonParams().get(C3784xa.f31580b));
        } catch (Throwable unused) {
            return "4444";
        }
    }

    public final long f() {
        try {
            return this.f6629b.getUserId();
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public static int a(String str) {
        return new a(com.apm.insight.l.j.b(str)).a();
    }

    public final Map<String, Object> a() {
        Object obj;
        Map<String, Object> mapB = b();
        if (((mapB == null || (obj = mapB.get(C3784xa.f31580b)) == null) ? null : String.valueOf(obj)) == null) {
            mapB.put(C3784xa.f31580b, 4444);
        }
        return mapB;
    }

    public static boolean a(Map<String, Object> map) {
        if (map == null || map.isEmpty()) {
            return true;
        }
        return ((map.containsKey("app_version") || map.containsKey("version_name")) && map.containsKey("version_code") && map.containsKey("update_version_code")) ? false : true;
    }
}
