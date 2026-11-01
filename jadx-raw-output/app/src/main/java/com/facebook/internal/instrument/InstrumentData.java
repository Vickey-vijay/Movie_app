package com.facebook.internal.instrument;

import android.os.Build;
import androidx.annotation.RestrictTo;
import ck.i;
import ck.p;
import com.facebook.internal.j0;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.ironsource.C3426d4;
import f2.j;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import lk.x;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: InstrumentData.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 02\u00020\u0001:\u0003\u0007\u00041B\u0011\b\u0012\u0012\u0006\u0010$\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&B\u001b\b\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010'\u0012\u0006\u0010(\u001a\u00020\f¢\u0006\u0004\b%\u0010)B\u001d\b\u0012\u0012\b\u0010*\u001a\u0004\u0018\u00010\b\u0012\b\u0010+\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b%\u0010,B\u0011\b\u0012\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b%\u0010/J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\nR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\nR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\nR\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0011\u0010\u001e\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001dR\u0016\u0010!\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010 R\u0016\u0010\"\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010\u001f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010 ¨\u00062"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData;", "", "data", "", "b", "Lmj/r;", "g", "a", "", "toString", "Ljava/lang/String;", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "type", "Lorg/json/JSONArray;", "c", "Lorg/json/JSONArray;", "featureNames", "d", "appVersion", "e", "cause", InneractiveMediationDefs.GENDER_FEMALE, "stackTrace", "", "Ljava/lang/Long;", "timestamp", "", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "analysisReportParameters", "exceptionReportParameters", "features", "<init>", "(Lorg/json/JSONArray;)V", "", "t", "(Ljava/lang/Throwable;Lcom/facebook/internal/instrument/InstrumentData$Type;)V", "anrCause", "st", "(Ljava/lang/String;Ljava/lang/String;)V", "Ljava/io/File;", C3426d4.i.f28530b, "(Ljava/io/File;)V", "h", "Type", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class InstrumentData {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String filename;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public Type type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public JSONArray featureNames;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public String appVersion;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public String cause;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public String stackTrace;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public Long timestamp;

    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0016R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$Type;", "", "(Ljava/lang/String;I)V", "logPrefix", "", "getLogPrefix", "()Ljava/lang/String;", "toString", "Unknown", "Analysis", "AnrReport", "CrashReport", "CrashShield", "ThreadCheck", "facebook-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public enum Type {
        Unknown,
        Analysis,
        AnrReport,
        CrashReport,
        CrashShield,
        ThreadCheck;

        /* JADX INFO: compiled from: InstrumentData.kt */
        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Type.valuesCustom().length];
                iArr[Type.Analysis.ordinal()] = 1;
                iArr[Type.AnrReport.ordinal()] = 2;
                iArr[Type.CrashReport.ordinal()] = 3;
                iArr[Type.CrashShield.ordinal()] = 4;
                iArr[Type.ThreadCheck.ordinal()] = 5;
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            Type[] typeArrValuesCustom = values();
            return (Type[]) Arrays.copyOf(typeArrValuesCustom, typeArrValuesCustom.length);
        }

        public final String getLogPrefix() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "analysis_log_";
            }
            if (i10 == 2) {
                return "anr_log_";
            }
            if (i10 == 3) {
                return "crash_log_";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "thread_check_log_";
            }
            return "shield_log_";
        }

        @Override // java.lang.Enum
        public String toString() {
            int i10 = a.$EnumSwitchMapping$0[ordinal()];
            if (i10 == 1) {
                return "Analysis";
            }
            if (i10 == 2) {
                return "AnrReport";
            }
            if (i10 == 3) {
                return "CrashReport";
            }
            if (i10 != 4) {
                return i10 != 5 ? "Unknown" : "ThreadCheck";
            }
            return "CrashShield";
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0007J\u001c\u0010\u0011\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$a;", "", "Ljava/io/File;", C3426d4.i.f28530b, "Lcom/facebook/internal/instrument/InstrumentData;", "d", "", "e", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "t", "b", "Lorg/json/JSONArray;", "features", "c", "", "anrCause", "st", "a", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f14416a = new a();

        public static final InstrumentData a(String anrCause, String st) {
            return new InstrumentData(anrCause, st, (i) null);
        }

        public static final InstrumentData b(Throwable e10, Type t10) {
            p.j(t10, "t");
            return new InstrumentData(e10, t10, (i) null);
        }

        public static final InstrumentData c(JSONArray features) {
            p.j(features, "features");
            return new InstrumentData(features, (i) null);
        }

        public static final InstrumentData d(File file) {
            p.j(file, C3426d4.i.f28530b);
            return new InstrumentData(file, (i) null);
        }
    }

    /* JADX INFO: renamed from: com.facebook.internal.instrument.InstrumentData$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0007R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0007R\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0007R\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0007R\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0007R\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/facebook/internal/instrument/InstrumentData$b;", "", "", "filename", "Lcom/facebook/internal/instrument/InstrumentData$Type;", "getType", "PARAM_APP_VERSION", "Ljava/lang/String;", "PARAM_CALLSTACK", "PARAM_DEVICE_MODEL", "PARAM_DEVICE_OS", "PARAM_FEATURE_NAMES", "PARAM_REASON", "PARAM_TIMESTAMP", "PARAM_TYPE", "UNKNOWN", "<init>", "()V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(i iVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Type getType(String filename) {
            if (x.R(filename, "crash_log_", false, 2, null)) {
                return Type.CrashReport;
            }
            if (x.R(filename, "shield_log_", false, 2, null)) {
                return Type.CrashShield;
            }
            if (x.R(filename, "thread_check_log_", false, 2, null)) {
                return Type.ThreadCheck;
            }
            if (x.R(filename, "analysis_log_", false, 2, null)) {
                return Type.Analysis;
            }
            return x.R(filename, "anr_log_", false, 2, null) ? Type.AnrReport : Type.Unknown;
        }
    }

    /* JADX INFO: compiled from: InstrumentData.kt */
    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    public /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            iArr[Type.Analysis.ordinal()] = 1;
            iArr[Type.AnrReport.ordinal()] = 2;
            iArr[Type.CrashReport.ordinal()] = 3;
            iArr[Type.CrashShield.ordinal()] = 4;
            iArr[Type.ThreadCheck.ordinal()] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ InstrumentData(File file, i iVar) {
        this(file);
    }

    public /* synthetic */ InstrumentData(String str, String str2, i iVar) {
        this(str, str2);
    }

    public /* synthetic */ InstrumentData(Throwable th2, Type type, i iVar) {
        this(th2, type);
    }

    public InstrumentData(JSONArray jSONArray) {
        this.type = Type.Analysis;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.featureNames = jSONArray;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("analysis_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        p.i(string, "StringBuffer()\n            .append(InstrumentUtility.ANALYSIS_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = string;
    }

    public /* synthetic */ InstrumentData(JSONArray jSONArray, i iVar) {
        this(jSONArray);
    }

    public final void a() {
        j jVar = j.f52827a;
        j.d(this.filename);
    }

    public final int b(InstrumentData data) {
        p.j(data, "data");
        Long l10 = this.timestamp;
        if (l10 == null) {
            return -1;
        }
        long jLongValue = l10.longValue();
        Long l11 = data.timestamp;
        if (l11 == null) {
            return 1;
        }
        return p.m(l11.longValue(), jLongValue);
    }

    public final JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = this.featureNames;
            if (jSONArray != null) {
                jSONObject.put("feature_names", jSONArray);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("device_os_version", Build.VERSION.RELEASE);
            jSONObject.put("device_model", Build.MODEL);
            String str = this.appVersion;
            if (str != null) {
                jSONObject.put("app_version", str);
            }
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            String str2 = this.cause;
            if (str2 != null) {
                jSONObject.put("reason", str2);
            }
            String str3 = this.stackTrace;
            if (str3 != null) {
                jSONObject.put("callstack", str3);
            }
            Type type = this.type;
            if (type != null) {
                jSONObject.put("type", type);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final JSONObject e() {
        Type type = this.type;
        int i10 = type == null ? -1 : c.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 == 1) {
            return c();
        }
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) {
            return d();
        }
        return null;
    }

    public final boolean f() {
        Type type = this.type;
        int i10 = type == null ? -1 : c.$EnumSwitchMapping$0[type.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                if ((i10 != 3 && i10 != 4 && i10 != 5) || this.stackTrace == null || this.timestamp == null) {
                    return false;
                }
            } else if (this.stackTrace == null || this.cause == null || this.timestamp == null) {
                return false;
            }
        } else if (this.featureNames == null || this.timestamp == null) {
            return false;
        }
        return true;
    }

    public final void g() {
        if (!f()) {
            return;
        }
        j jVar = j.f52827a;
        j.t(this.filename, toString());
    }

    public String toString() {
        JSONObject jSONObjectE = e();
        if (jSONObjectE == null) {
            String string = new JSONObject().toString();
            p.i(string, "JSONObject().toString()");
            return string;
        }
        String string2 = jSONObjectE.toString();
        p.i(string2, "params.toString()");
        return string2;
    }

    public InstrumentData(Throwable th2, Type type) {
        this.type = type;
        this.appVersion = j0.v();
        this.cause = j.e(th2);
        this.stackTrace = j.h(th2);
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(type.getLogPrefix());
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        p.i(string, "StringBuffer().append(t.logPrefix).append(timestamp.toString()).append(\".json\").toString()");
        this.filename = string;
    }

    public InstrumentData(String str, String str2) {
        this.type = Type.AnrReport;
        this.appVersion = j0.v();
        this.cause = str;
        this.stackTrace = str2;
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("anr_log_");
        stringBuffer.append(String.valueOf(this.timestamp));
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        p.i(string, "StringBuffer()\n            .append(InstrumentUtility.ANR_REPORT_PREFIX)\n            .append(timestamp.toString())\n            .append(\".json\")\n            .toString()");
        this.filename = string;
    }

    public InstrumentData(File file) {
        String name = file.getName();
        p.i(name, "file.name");
        this.filename = name;
        this.type = INSTANCE.getType(name);
        j jVar = j.f52827a;
        JSONObject jSONObjectR = j.r(this.filename, true);
        if (jSONObjectR != null) {
            this.timestamp = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.appVersion = jSONObjectR.optString("app_version", null);
            this.cause = jSONObjectR.optString("reason", null);
            this.stackTrace = jSONObjectR.optString("callstack", null);
            this.featureNames = jSONObjectR.optJSONArray("feature_names");
        }
    }
}
