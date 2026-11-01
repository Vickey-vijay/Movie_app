package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import s5.o;
import s5.p;
import u5.f;

/* JADX INFO: loaded from: classes11.dex */
public final class DateTypeAdapter extends o<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f20739b = new p() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // s5.p
        public <T> o<T> a(Gson gson, x5.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<DateFormat> f20740a;

    public final synchronized Date e(String str) {
        Iterator<DateFormat> it = this.f20740a.iterator();
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

    @Override // s5.o
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public synchronized void d(JsonWriter jsonWriter, Date date) throws IOException {
        try {
            if (date == null) {
                jsonWriter.nullValue();
            } else {
                jsonWriter.value(this.f20740a.get(0).format(date));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f20740a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (u5.c.e()) {
            arrayList.add(f.c(2, 2));
        }
    }

    @Override // s5.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        return e(jsonReader.nextString());
    }
}
