package dm;

import android.text.TextUtils;
import com.ironsource.C3426d4;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.h;
import java.io.IOException;
import java.util.List;
import me.goldze.mvvmhabit.http.interceptor.logging.Level;
import okhttp3.FormBody;
import okhttp3.Request;
import okio.Buffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: Printer.java */
/* JADX INFO: loaded from: classes11.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f52229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f52230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f52231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f52232d;

    public static void g(int i10, String str, String[] strArr, b bVar, boolean z10) {
        for (String str2 : strArr) {
            int length = str2.length();
            int i11 = z10 ? 110 : length;
            int i12 = 0;
            while (i12 <= length / i11) {
                int i13 = i12 * i11;
                i12++;
                int length2 = i12 * i11;
                if (length2 > str2.length()) {
                    length2 = str2.length();
                }
                if (bVar == null) {
                    a.a(i10, str, "│ " + str2.substring(i13, length2));
                } else {
                    bVar.a(i10, str, str2.substring(i13, length2));
                }
            }
        }
    }

    public static void h(c.b bVar, Request request) {
        String strG = bVar.g(true);
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "┌────── Request ────────────────────────────────────────────────────────────────────────");
        }
        g(bVar.getType(), strG, new String[]{"URL: " + request.url()}, bVar.f(), false);
        g(bVar.getType(), strG, d(request, bVar.e()), bVar.f(), true);
        if (request.body() instanceof FormBody) {
            StringBuilder sb2 = new StringBuilder();
            FormBody formBody = (FormBody) request.body();
            if (formBody != null && formBody.size() != 0) {
                for (int i10 = 0; i10 < formBody.size(); i10++) {
                    sb2.append(formBody.encodedName(i10) + "=" + formBody.encodedValue(i10) + C3426d4.j.f28584c);
                }
                sb2.delete(sb2.length() - 1, sb2.length());
                g(bVar.getType(), strG, new String[]{sb2.toString()}, bVar.f(), true);
            }
        }
        if (bVar.e() == Level.BASIC || bVar.e() == Level.BODY) {
            g(bVar.getType(), strG, f52232d, bVar.f(), true);
        }
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "└───────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    public static void i(c.b bVar, long j10, boolean z10, int i10, String str, List<String> list) {
        String strG = bVar.g(false);
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "┌────── Response ───────────────────────────────────────────────────────────────────────");
        }
        g(bVar.getType(), strG, e(str, j10, i10, z10, bVar.e(), list), bVar.f(), true);
        g(bVar.getType(), strG, f52231c, bVar.f(), true);
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "└───────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    static {
        String property = System.getProperty("line.separator");
        f52229a = property;
        f52230b = property + property;
        f52231c = new String[]{property, "Omitted response body"};
        f52232d = new String[]{property, "Omitted request body"};
    }

    public static String b(String str) {
        String str2;
        String[] strArrSplit = str.split(f52229a);
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        if (strArrSplit.length > 1) {
            while (i10 < strArrSplit.length) {
                if (i10 == 0) {
                    str2 = "┌ ";
                } else {
                    str2 = i10 == strArrSplit.length - 1 ? "└ " : "├ ";
                }
                sb2.append(str2);
                sb2.append(strArrSplit[i10]);
                sb2.append("\n");
                i10++;
            }
        } else {
            int length = strArrSplit.length;
            while (i10 < length) {
                String str3 = strArrSplit[i10];
                sb2.append("─ ");
                sb2.append(str3);
                sb2.append("\n");
                i10++;
            }
        }
        return sb2.toString();
    }

    public static String c(String str) {
        try {
            if (str.startsWith(h.f44171d)) {
                str = new JSONObject(str).toString(3);
            } else if (str.startsWith(C3426d4.j.f28586d)) {
                str = new JSONArray(str).toString(3);
            }
        } catch (JSONException unused) {
        }
        return str;
    }

    public static String[] e(String str, long j10, int i10, boolean z10, Level level, List<String> list) {
        String str2;
        boolean z11 = level == Level.HEADERS || level == Level.BASIC;
        String strL = l(list);
        StringBuilder sb2 = new StringBuilder();
        String str3 = "";
        if (TextUtils.isEmpty(strL)) {
            str2 = "";
        } else {
            str2 = strL + " - ";
        }
        sb2.append(str2);
        sb2.append("is success : ");
        sb2.append(z10);
        sb2.append(" - ");
        sb2.append("Received in: ");
        sb2.append(j10);
        sb2.append("ms");
        String str4 = f52230b;
        sb2.append(str4);
        sb2.append("Status Code: ");
        sb2.append(i10);
        sb2.append(str4);
        if (!f(str) && z11) {
            str3 = "Headers:" + f52229a + b(str);
        }
        sb2.append(str3);
        return sb2.toString().split(f52229a);
    }

    public static void j(c.b bVar, Request request) {
        StringBuilder sb2 = new StringBuilder();
        String str = f52229a;
        sb2.append(str);
        sb2.append("Body:");
        sb2.append(str);
        sb2.append(a(request));
        String string = sb2.toString();
        String strG = bVar.g(true);
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "┌────── Request ────────────────────────────────────────────────────────────────────────");
        }
        g(bVar.getType(), strG, new String[]{"URL: " + request.url()}, bVar.f(), false);
        g(bVar.getType(), strG, d(request, bVar.e()), bVar.f(), true);
        if (request.body() instanceof FormBody) {
            StringBuilder sb3 = new StringBuilder();
            FormBody formBody = (FormBody) request.body();
            if (formBody != null && formBody.size() != 0) {
                for (int i10 = 0; i10 < formBody.size(); i10++) {
                    sb3.append(formBody.encodedName(i10) + "=" + formBody.encodedValue(i10) + C3426d4.j.f28584c);
                }
                sb3.delete(sb3.length() - 1, sb3.length());
                g(bVar.getType(), strG, new String[]{sb3.toString()}, bVar.f(), true);
            }
        }
        if (bVar.e() == Level.BASIC || bVar.e() == Level.BODY) {
            g(bVar.getType(), strG, string.split(f52229a), bVar.f(), true);
        }
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "└───────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    public static void k(c.b bVar, long j10, boolean z10, int i10, String str, String str2, List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        String str3 = f52229a;
        sb2.append(str3);
        sb2.append("Body:");
        sb2.append(str3);
        sb2.append(c(str2));
        String string = sb2.toString();
        String strG = bVar.g(false);
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "┌────── Response ───────────────────────────────────────────────────────────────────────");
        }
        g(bVar.getType(), strG, e(str, j10, i10, z10, bVar.e(), list), bVar.f(), true);
        if (bVar.e() == Level.BASIC || bVar.e() == Level.BODY) {
            g(bVar.getType(), strG, string.split(str3), bVar.f(), true);
        }
        if (bVar.f() == null) {
            a.a(bVar.getType(), strG, "└───────────────────────────────────────────────────────────────────────────────────────");
        }
    }

    public static String l(List<String> list) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : list) {
            sb2.append("/");
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static String a(Request request) {
        try {
            Request requestBuild = request.newBuilder().build();
            Buffer buffer = new Buffer();
            if (requestBuild.body() == null) {
                return "";
            }
            requestBuild.body().writeTo(buffer);
            return c(buffer.readUtf8());
        } catch (IOException e10) {
            return "{\"err\": \"" + e10.getMessage() + "\"}";
        }
    }

    public static String[] d(Request request, Level level) {
        boolean z10;
        String string = request.headers().toString();
        if (level != Level.HEADERS && level != Level.BASIC) {
            z10 = false;
        } else {
            z10 = true;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Method: @");
        sb2.append(request.method());
        sb2.append(f52230b);
        String str = "";
        if (!f(string) && z10) {
            str = "Headers:" + f52229a + b(string);
        }
        sb2.append(str);
        return sb2.toString().split(f52229a);
    }

    public static boolean f(String str) {
        if (!TextUtils.isEmpty(str) && !"\n".equals(str) && !"\t".equals(str) && !TextUtils.isEmpty(str.trim())) {
            return false;
        }
        return true;
    }
}
