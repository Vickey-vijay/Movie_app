package s5;

import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: DefaultDateTypeAdapter.java */
/* JADX INFO: loaded from: classes11.dex */
public final class a extends o<Date> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends Date> f67024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List<DateFormat> f67025b;

    public a(Class<? extends Date> cls, String str) {
        ArrayList arrayList = new ArrayList();
        this.f67025b = arrayList;
        this.f67024a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(new SimpleDateFormat(str, locale));
        if (Locale.getDefault().equals(locale)) {
            return;
        }
        arrayList.add(new SimpleDateFormat(str));
    }

    public static Class<? extends Date> g(Class<? extends Date> cls) {
        if (cls == Date.class || cls == java.sql.Date.class || cls == Timestamp.class) {
            return cls;
        }
        throw new IllegalArgumentException("Date type must be one of " + Date.class + ", " + Timestamp.class + ", or " + java.sql.Date.class + " but was " + cls);
    }

    public final Date e(String str) {
        synchronized (this.f67025b) {
            Iterator<DateFormat> it = this.f67025b.iterator();
            while (it.hasNext()) {
                try {
                    return it.next().parse(str);
                } catch (ParseException unused) {
                }
            }
            try {
                return v5.a.c(str, new ParsePosition(0));
            } catch (ParseException e10) {
                throw new JsonSyntaxException(str, e10);
            }
        }
    }

    @Override // s5.o
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public void d(JsonWriter jsonWriter, Date date) throws IOException {
        if (date == null) {
            jsonWriter.nullValue();
            return;
        }
        synchronized (this.f67025b) {
            jsonWriter.value(this.f67025b.get(0).format(date));
        }
    }

    public String toString() {
        DateFormat dateFormat = this.f67025b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }

    @Override // s5.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        Date dateE = e(jsonReader.nextString());
        Class<? extends Date> cls = this.f67024a;
        if (cls == Date.class) {
            return dateE;
        }
        if (cls == Timestamp.class) {
            return new Timestamp(dateE.getTime());
        }
        if (cls == java.sql.Date.class) {
            return new java.sql.Date(dateE.getTime());
        }
        throw new AssertionError();
    }

    public a(Class<? extends Date> cls, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f67025b = arrayList;
        this.f67024a = g(cls);
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(i10, i11, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(i10, i11));
        }
        if (u5.c.e()) {
            arrayList.add(u5.f.c(i10, i11));
        }
    }
}
