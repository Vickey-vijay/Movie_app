package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import s5.o;
import s5.p;

/* JADX INFO: loaded from: classes9.dex */
public final class SqlDateTypeAdapter extends o<Date> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f20768b = new p() { // from class: com.google.gson.internal.bind.SqlDateTypeAdapter.1
        @Override // s5.p
        public <T> o<T> a(Gson gson, x5.a<T> aVar) {
            if (aVar.c() == Date.class) {
                return new SqlDateTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f20769a = new SimpleDateFormat("MMM d, yyyy");

    @Override // s5.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Date b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Date(this.f20769a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // s5.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(JsonWriter jsonWriter, Date date) throws IOException {
        jsonWriter.value(date == null ? null : this.f20769a.format((java.util.Date) date));
    }
}
