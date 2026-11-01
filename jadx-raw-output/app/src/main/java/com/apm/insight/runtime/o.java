package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RuntimeContext.java */
/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static o f6747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private File f6748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f6749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f6750d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Context f6751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private a f6752f = null;

    /* JADX INFO: compiled from: RuntimeContext.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f6755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f6756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private File f6757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private JSONObject f6758d;

        public /* synthetic */ a(File file, byte b10) {
            this(file);
        }

        private a(File file) {
            this.f6758d = null;
            this.f6757c = file;
            String[] strArrSplit = file.getName().split("-|\\.");
            if (strArrSplit.length >= 2) {
                this.f6755a = Long.parseLong(strArrSplit[0]);
                this.f6756b = Long.parseLong(strArrSplit[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String strSubstring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(strSubstring)) {
                long j10 = Long.parseLong(strSubstring);
                this.f6755a = j10;
                this.f6756b = j10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public JSONObject a() {
            if (this.f6758d == null) {
                try {
                    this.f6758d = new JSONObject(com.apm.insight.l.f.a(this.f6757c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f6758d == null) {
                    this.f6758d = new JSONObject();
                }
            }
            return this.f6758d;
        }

        public static /* synthetic */ void d(a aVar) {
            aVar.f6757c.delete();
        }

        public static /* synthetic */ boolean a(a aVar, long j10) {
            long j11 = aVar.f6755a;
            if (j11 > j10 && j11 - j10 > 604800000) {
                return true;
            }
            long j12 = aVar.f6756b;
            if (j12 >= j10 || j10 - j12 <= 604800000) {
                return aVar.f6757c.lastModified() < j10 && j10 - aVar.f6757c.lastModified() > 604800000;
            }
            return true;
        }
    }

    public static o a() {
        if (f6747a == null) {
            f6747a = new o(com.apm.insight.e.g());
        }
        return f6747a;
    }

    public final String b() {
        try {
            return com.apm.insight.l.f.a(this.f6749c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    public final String c() {
        try {
            return com.apm.insight.l.f.a(this.f6750d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    private o(Context context) {
        File fileC = com.apm.insight.l.j.c(context);
        if (!fileC.exists() || (!fileC.isDirectory() && fileC.delete())) {
            fileC.mkdirs();
            com.apm.insight.runtime.a.b.a();
        }
        this.f6748b = fileC;
        this.f6749c = new File(fileC, "did");
        this.f6750d = new File(fileC, "device_uuid");
        this.f6751e = context;
    }

    private ArrayList<a> c(final String str) {
        File[] fileArrListFiles = this.f6748b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.o.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                return str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches();
            }
        });
        ArrayList<a> arrayList = new ArrayList<>();
        if (fileArrListFiles == null) {
            return arrayList;
        }
        com.apm.insight.a.a((Object) ("foundRuntimeContextFiles " + fileArrListFiles.length));
        a aVar = null;
        byte b10 = 0;
        for (File file : fileArrListFiles) {
            try {
                a aVar2 = new a(file, b10);
                arrayList.add(aVar2);
                if (this.f6752f == null && ".ctx".equals(str) && (aVar == null || aVar2.f6756b >= aVar.f6756b)) {
                    aVar = aVar2;
                }
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
            }
        }
        if (this.f6752f == null && aVar != null) {
            this.f6752f = aVar;
        }
        return arrayList;
    }

    public final void b(String str) {
        try {
            com.apm.insight.l.f.a(this.f6750d, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x005f  */
    public final void a(Map<String, Object> map, JSONArray jSONArray) {
        char c10;
        JSONObject jSONObjectA = Header.a(this.f6751e).a(map);
        if (Header.c(jSONObjectA)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.f6752f == null) {
            c(".ctx");
        }
        a aVar = this.f6752f;
        if (aVar != null) {
            JSONObject jSONObjectA2 = aVar.a();
            if (Header.c(jSONObjectA2)) {
                c10 = 2;
            } else if (Header.c(jSONObjectA)) {
                c10 = 0;
            } else if (String.valueOf(jSONObjectA.opt("update_version_code")).equals(String.valueOf(jSONObjectA2.opt("update_version_code"))) && Header.d(jSONObjectA2)) {
                c10 = 1;
            } else {
                c10 = 2;
            }
            if (c10 == 1) {
                a(aVar.f6755a, jCurrentTimeMillis, jSONObjectA, jSONArray);
                com.apm.insight.l.f.a(aVar.f6757c);
            } else if (c10 == 2) {
                a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
            }
            try {
                ArrayList<a> arrayListC = c("");
                if (arrayListC.size() <= 6) {
                    return;
                }
                for (a aVar2 : arrayListC) {
                    if (a.a(aVar2, jCurrentTimeMillis)) {
                        a.d(aVar2);
                    }
                }
                return;
            } catch (Throwable th2) {
                com.apm.insight.c.a();
                j.a(th2, "NPTH_CATCH");
                return;
            }
        }
        a(jCurrentTimeMillis, jCurrentTimeMillis, jSONObjectA, jSONArray);
    }

    @Nullable
    public final JSONArray b(long j10) {
        File file;
        String strA;
        Iterator<a> it = c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f6755a && j10 <= next.f6756b) {
                file = next.f6757c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".allData")) {
                if (aVar == null || Math.abs(aVar.f6756b - j10) > Math.abs(aVar2.f6756b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f6757c;
        }
        if (file == null) {
            return null;
        }
        try {
            strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
            try {
                return new JSONArray(strA);
            } catch (Throwable th2) {
                th = th2;
                com.apm.insight.c.a();
                j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            strA = null;
        }
    }

    private void a(long j10, long j11, JSONObject jSONObject, JSONArray jSONArray) {
        File file = new File(this.f6748b, j10 + "-" + j11 + ".ctx");
        File file2 = new File(this.f6748b, j10 + "-" + j11 + ".allData");
        try {
            com.apm.insight.l.f.a(file, jSONObject);
            com.apm.insight.l.f.a(file2, jSONArray);
            this.f6752f = new a(file, (byte) 0);
        } catch (IOException e10) {
            com.apm.insight.c.a();
            j.a(e10, "NPTH_CATCH");
        }
    }

    public final void a(String str) {
        try {
            com.apm.insight.l.f.a(this.f6749c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public final JSONObject a(long j10) {
        JSONObject jSONObject;
        File file;
        boolean z10;
        String strA;
        Iterator<a> it = c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            a next = it.next();
            if (j10 >= next.f6755a && j10 <= next.f6756b) {
                file = next.f6757c;
                break;
            }
        }
        if (file == null) {
            a aVar = null;
            for (a aVar2 : c(".ctx")) {
                if (aVar == null || Math.abs(aVar.f6756b - j10) > Math.abs(aVar2.f6756b - j10)) {
                    aVar = aVar2;
                }
            }
            file = aVar == null ? null : aVar.f6757c;
            z10 = true;
        } else {
            z10 = false;
        }
        if (file != null) {
            try {
                strA = com.apm.insight.l.f.a(file.getAbsolutePath(), "\n");
                try {
                    jSONObject = new JSONObject(strA);
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.c.a();
                    j.a(new IOException("content :".concat(String.valueOf(strA)), th), "NPTH_CATCH");
                }
            } catch (Throwable th3) {
                th = th3;
                strA = null;
            }
        }
        if (jSONObject != null && z10) {
            try {
                jSONObject.put("unauthentic_version", 1);
            } catch (JSONException e10) {
                com.apm.insight.c.a();
                j.a(e10, "NPTH_CATCH");
            }
        }
        return jSONObject;
    }
}
