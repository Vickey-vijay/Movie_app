package j2;

import androidx.annotation.RestrictTo;
import ck.p;
import com.ironsource.C3426d4;
import f2.j;
import java.io.File;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ErrorReportData.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0007B\u0013\b\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0019\u0010\u001aB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0019\u0010\u001dJ\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\u0007\u001a\u00020\u0005J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\nR\u0018\u0010\f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0014\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0016¨\u0006\u001e"}, d2 = {"Lj2/a;", "", "data", "", "b", "Lmj/r;", "e", "a", "", "toString", "Ljava/lang/String;", "filename", "errorMessage", "", "c", "Ljava/lang/Long;", "timestamp", "", "d", "()Z", "isValid", "Lorg/json/JSONObject;", "()Lorg/json/JSONObject;", "parameters", "message", "<init>", "(Ljava/lang/String;)V", "Ljava/io/File;", C3426d4.i.f28530b, "(Ljava/io/File;)V", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public String filename;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public String errorMessage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public Long timestamp;

    public a(String str) {
        this.timestamp = Long.valueOf(System.currentTimeMillis() / ((long) 1000));
        this.errorMessage = str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("error_log_");
        Long l10 = this.timestamp;
        if (l10 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
        }
        stringBuffer.append(l10.longValue());
        stringBuffer.append(".json");
        String string = stringBuffer.toString();
        p.i(string, "StringBuffer()\n            .append(InstrumentUtility.ERROR_REPORT_PREFIX)\n            .append(timestamp as Long)\n            .append(\".json\")\n            .toString()");
        this.filename = string;
    }

    public final void a() {
        j jVar = j.f52827a;
        j.d(this.filename);
    }

    public final int b(a data) {
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
            Long l10 = this.timestamp;
            if (l10 != null) {
                jSONObject.put("timestamp", l10);
            }
            jSONObject.put("error_message", this.errorMessage);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final boolean d() {
        return (this.errorMessage == null || this.timestamp == null) ? false : true;
    }

    public final void e() {
        if (d()) {
            j jVar = j.f52827a;
            j.t(this.filename, toString());
        }
    }

    public String toString() {
        JSONObject jSONObjectC = c();
        if (jSONObjectC == null) {
            return super.toString();
        }
        String string = jSONObjectC.toString();
        p.i(string, "params.toString()");
        return string;
    }

    public a(File file) {
        p.j(file, C3426d4.i.f28530b);
        String name = file.getName();
        p.i(name, "file.name");
        this.filename = name;
        JSONObject jSONObjectR = j.r(name, true);
        if (jSONObjectR != null) {
            this.timestamp = Long.valueOf(jSONObjectR.optLong("timestamp", 0L));
            this.errorMessage = jSONObjectR.optString("error_message", null);
        }
    }
}
