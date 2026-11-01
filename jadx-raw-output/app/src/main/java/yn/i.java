package yn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import org.fourthline.cling.model.types.InvalidValueException;

/* JADX INFO: compiled from: DateTimeDatatype.java */
/* JADX INFO: loaded from: classes8.dex */
public class i extends org.fourthline.cling.model.types.a<Calendar> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String[] f85810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f85811c;

    @Override // org.fourthline.cling.model.types.a, org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String e(Calendar calendar) throws InvalidValueException {
        if (calendar == null) {
            return "";
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(this.f85811c);
        simpleDateFormat.setTimeZone(j());
        return simpleDateFormat.format(calendar.getTime());
    }

    public String k(String str) {
        if (str.endsWith("Z")) {
            return str.substring(0, str.length() - 1) + "+0000";
        }
        if (str.length() <= 7 || str.charAt(str.length() - 3) != ':') {
            return str;
        }
        if (str.charAt(str.length() - 6) != '-' && str.charAt(str.length() - 6) != '+') {
            return str;
        }
        return str.substring(0, str.length() - 3) + str.substring(str.length() - 2);
    }

    @Override // org.fourthline.cling.model.types.Datatype
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Calendar c(String str) throws InvalidValueException {
        if (str.equals("")) {
            return null;
        }
        Date dateH = h(str, this.f85810b);
        if (dateH != null) {
            Calendar calendar = Calendar.getInstance(j());
            calendar.setTime(dateH);
            return calendar;
        }
        throw new InvalidValueException("Can't parse date/time from: " + str);
    }

    public i(String[] strArr, String str) {
        this.f85810b = strArr;
        this.f85811c = str;
    }

    public Date h(String str, String[] strArr) {
        String strK = k(str);
        Date date = null;
        for (String str2 : strArr) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2);
            simpleDateFormat.setTimeZone(j());
            try {
                date = simpleDateFormat.parse(strK);
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    public TimeZone j() {
        return TimeZone.getDefault();
    }
}
