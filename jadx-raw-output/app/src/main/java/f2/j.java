package f2;

import androidx.annotation.RestrictTo;
import ck.p;
import ck.w;
import com.facebook.GraphRequest;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import com.ironsource.Z7;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.Regex;
import lk.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q1.t;

/* JADX INFO: compiled from: InstrumentUtility.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J\u0014\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0012\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0012\u0010\u000b\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007J\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0007¢\u0006\u0004\b\u0011\u0010\u000fJ\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0007J\u001c\u0010\u0018\u001a\u00020\u00172\b\u0010\u0012\u001a\u0004\u0018\u00010\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u0007J\u0012\u0010\u0019\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0004H\u0007J$\u0010\u001f\u001a\u00020\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0007J\n\u0010 \u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0007¨\u0006&"}, d2 = {"Lf2/j;", "", "", "e", "", "h", "Ljava/lang/Thread;", "thread", "g", "", "j", CampaignEx.JSON_KEY_AD_K, "", "Ljava/io/File;", "l", "()[Ljava/io/File;", "n", "p", "filename", "deleteOnException", "Lorg/json/JSONObject;", "r", "content", "Lmj/r;", "t", "d", C3426d4.i.W, "Lorg/json/JSONArray;", Z7.f27982b, "Lcom/facebook/GraphRequest$b;", "callback", "s", InneractiveMediationDefs.GENDER_FEMALE, "Ljava/lang/StackTraceElement;", "element", "i", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f52827a = new j();

    public static final String h(Throwable e10) {
        Throwable th2 = null;
        if (e10 == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (e10 != null && e10 != th2) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            p.i(stackTrace, "t.stackTrace");
            int i10 = 0;
            int length = stackTrace.length;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                jSONArray.put(stackTraceElement.toString());
            }
            th2 = e10;
            e10 = e10.getCause();
        }
        return jSONArray.toString();
    }

    public static final boolean j(Throwable e10) {
        if (e10 == null) {
            return false;
        }
        Throwable th2 = null;
        while (e10 != null && e10 != th2) {
            StackTraceElement[] stackTrace = e10.getStackTrace();
            p.i(stackTrace, "t.stackTrace");
            int length = stackTrace.length;
            int i10 = 0;
            while (i10 < length) {
                StackTraceElement stackTraceElement = stackTrace[i10];
                i10++;
                p.i(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    return true;
                }
            }
            th2 = e10;
            e10 = e10.getCause();
        }
        return false;
    }

    public static final boolean k(Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                p.i(stackTraceElement, "element");
                if (i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    p.i(className, "element.className");
                    if (!x.R(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        p.i(className2, "element.className");
                        if (!x.R(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    p.i(methodName, "element.methodName");
                    if (x.R(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        p.i(methodName2, "element.methodName");
                        if (x.R(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            p.i(methodName3, "element.methodName");
                            if (!x.R(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final String e(Throwable e10) {
        if (e10 == null) {
            return null;
        }
        return e10.getCause() == null ? e10.toString() : String.valueOf(e10.getCause());
    }

    public static final String g(Thread thread) {
        p.j(thread, "thread");
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        p.i(stackTrace, "stackTrace");
        int length = stackTrace.length;
        int i10 = 0;
        while (i10 < length) {
            StackTraceElement stackTraceElement = stackTrace[i10];
            i10++;
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    public static final boolean i(StackTraceElement element) {
        p.j(element, "element");
        String className = element.getClassName();
        p.i(className, "element.className");
        if (!x.R(className, "com.facebook", false, 2, null)) {
            String className2 = element.getClassName();
            p.i(className2, "element.className");
            if (!x.R(className2, "com.meta", false, 2, null)) {
                return false;
            }
        }
        return true;
    }

    public static final boolean m(File file, String str) {
        p.i(str, "name");
        w wVar = w.f6066a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1));
        p.i(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    public static final boolean o(File file, String str) {
        p.i(str, "name");
        w wVar = w.f6066a;
        String str2 = String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1));
        p.i(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    public static final boolean q(File file, String str) {
        p.i(str, "name");
        w wVar = w.f6066a;
        String str2 = String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3));
        p.i(str2, "java.lang.String.format(format, *args)");
        return new Regex(str2).matches(str);
    }

    public static final void s(String str, JSONArray jSONArray, GraphRequest.b bVar) {
        p.j(jSONArray, Z7.f27982b);
        if (jSONArray.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, jSONArray.toString());
            JSONObject jSONObjectA = j0.A();
            if (jSONObjectA != null) {
                Iterator<String> itKeys = jSONObjectA.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectA.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            w wVar = w.f6066a;
            String str2 = String.format("%s/instruments", Arrays.copyOf(new Object[]{t.m()}, 1));
            p.i(str2, "java.lang.String.format(format, *args)");
            companion.A(null, str2, jSONObject, bVar).l();
        } catch (JSONException unused) {
        }
    }

    public static final boolean d(String filename) {
        File fileF = f();
        if (fileF != null && filename != null) {
            return new File(fileF, filename).delete();
        }
        return false;
    }

    public static final File f() {
        File file = new File(t.l().getCacheDir(), "instrument");
        if (!file.exists() && !file.mkdirs()) {
            return null;
        }
        return file;
    }

    public static final File[] l() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: f2.i
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.m(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    public static final File[] n() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: f2.h
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.o(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    public static final File[] p() {
        File fileF = f();
        if (fileF == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileF.listFiles(new FilenameFilter() { // from class: f2.g
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return j.q(file, str);
            }
        });
        if (fileArrListFiles == null) {
            return new File[0];
        }
        return fileArrListFiles;
    }

    public static final JSONObject r(String filename, boolean deleteOnException) {
        File fileF = f();
        if (fileF != null && filename != null) {
            try {
                return new JSONObject(j0.n0(new FileInputStream(new File(fileF, filename))));
            } catch (Exception unused) {
                if (deleteOnException) {
                    d(filename);
                }
            }
        }
        return null;
    }

    public static final void t(String str, String str2) {
        File fileF = f();
        if (fileF != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(fileF, str));
                byte[] bytes = str2.getBytes(lk.c.f63591b);
                p.i(bytes, "(this as java.lang.String).getBytes(charset)");
                fileOutputStream.write(bytes);
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }
}
