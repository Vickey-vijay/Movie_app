package tf;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.iab.mraid.MraidCalendarEvent;
import io.bidmachine.unified.UnifiedMediationParams;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final DateFormat f72380a = new SimpleDateFormat("yyyy-MM-dd'T'HH:mmZ", Locale.US);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f72381b = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};

    public void a(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("expires")) {
            return;
        }
        try {
            Date date = f72380a.parse(jSONObject.getString("expires"));
            sb2.append("UNTIL=");
            sb2.append(date);
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    public void b(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("frequency")) {
            return;
        }
        try {
            sb2.append("FREQ=");
            sb2.append(jSONObject.getString("frequency"));
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    public void c(JSONObject jSONObject, StringBuilder sb2) {
        if (jSONObject.isNull("interval")) {
            return;
        }
        try {
            sb2.append("INTERVAL=");
            sb2.append(jSONObject.getInt("interval"));
            sb2.append(";");
        } catch (Exception unused) {
        }
    }

    public void d(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"monthly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("daysInMonth")) {
                JSONArray jSONArray = jSONObject.getJSONArray("daysInMonth");
                if (jSONArray.length() > 0) {
                    sb2.append("BYMONTHDAY=");
                    sb2.append(b(jSONArray));
                    sb2.append(";");
                }
            }
            if (jSONObject.isNull("weeksInMonth")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("weeksInMonth");
            if (jSONArray2.length() > 0) {
                sb2.append("BYWEEKNO=");
                sb2.append(b(jSONArray2));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }

    public void e(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"weekly".equalsIgnoreCase(jSONObject.getString("frequency")) || jSONObject.isNull("daysInWeek")) {
                return;
            }
            JSONArray jSONArray = jSONObject.getJSONArray("daysInWeek");
            if (jSONArray.length() > 0) {
                sb2.append("BYDAY=");
                sb2.append(a(jSONArray));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }

    public void f(JSONObject jSONObject, StringBuilder sb2) {
        try {
            if (jSONObject.isNull("frequency") || !"yearly".equalsIgnoreCase(jSONObject.getString("frequency"))) {
                return;
            }
            if (!jSONObject.isNull("monthsInYear")) {
                JSONArray jSONArray = jSONObject.getJSONArray("monthsInYear");
                if (jSONArray.length() > 0) {
                    sb2.append("BYMONTH=");
                    sb2.append(b(jSONArray));
                    sb2.append(";");
                }
            }
            if (jSONObject.isNull("daysInYear")) {
                return;
            }
            JSONArray jSONArray2 = jSONObject.getJSONArray("daysInYear");
            if (jSONArray2.length() > 0) {
                sb2.append("BYYEARDAY=");
                sb2.append(b(jSONArray2));
                sb2.append(";");
            }
        } catch (Exception unused) {
        }
    }

    public String a(JSONArray jSONArray) throws JSONException {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                sb2.append(StringUtils.COMMA);
            }
            int i11 = jSONArray.getInt(i10);
            if (i11 >= 0 && i11 <= 6) {
                sb2.append(f72381b[i11]);
            }
        }
        return sb2.toString();
    }

    public String b(JSONArray jSONArray) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            if (i10 > 0) {
                sb2.append(StringUtils.COMMA);
            }
            sb2.append(jSONArray.get(i10).toString());
        }
        return sb2.toString();
    }

    public String a(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        b(jSONObject, sb2);
        c(jSONObject, sb2);
        a(jSONObject, sb2);
        e(jSONObject, sb2);
        d(jSONObject, sb2);
        f(jSONObject, sb2);
        if (sb2.length() > 0) {
            return sb2.toString();
        }
        return null;
    }

    public MraidCalendarEvent b(JSONObject jSONObject) throws JSONException, ParseException {
        String string = jSONObject.getString(UnifiedMediationParams.KEY_DESCRIPTION);
        Objects.requireNonNull(string);
        DateFormat dateFormat = f72380a;
        Date date = dateFormat.parse(jSONObject.getString("start"));
        Objects.requireNonNull(date);
        MraidCalendarEvent mraidCalendarEvent = new MraidCalendarEvent(string, date);
        if (jSONObject.has("location")) {
            mraidCalendarEvent.a(jSONObject.getString("location"));
        }
        if (jSONObject.has("summary")) {
            mraidCalendarEvent.d(jSONObject.getString("summary"));
        }
        if (jSONObject.has("end")) {
            mraidCalendarEvent.a(dateFormat.parse(jSONObject.getString("end")));
        }
        if (jSONObject.has("status")) {
            mraidCalendarEvent.c(jSONObject.getString("status"));
        }
        if (jSONObject.has("transparency")) {
            mraidCalendarEvent.e(jSONObject.getString("transparency"));
        }
        if (jSONObject.has("recurrence")) {
            mraidCalendarEvent.b(a(jSONObject.getJSONObject("recurrence")));
        }
        return mraidCalendarEvent;
    }

    public MraidCalendarEvent a(String str) {
        return b(new JSONObject(str));
    }
}
