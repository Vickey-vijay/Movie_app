package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import s5.o;
import s5.p;

/* JADX INFO: loaded from: classes4.dex */
public final class TimeTypeAdapter extends o<Time> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f20770b = new p() { // from class: com.google.gson.internal.bind.TimeTypeAdapter.1
        @Override // s5.p
        public <T> o<T> a(Gson gson, x5.a<T> aVar) {
            if (aVar.c() == Time.class) {
                return new TimeTypeAdapter();
            }
            return null;
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateFormat f20771a = new SimpleDateFormat("hh:mm:ss a");

    @Override // s5.o
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public synchronized Time b(JsonReader jsonReader) throws IOException {
        if (jsonReader.peek() == JsonToken.NULL) {
            jsonReader.nextNull();
            return null;
        }
        try {
            return new Time(this.f20771a.parse(jsonReader.nextString()).getTime());
        } catch (ParseException e10) {
            throw new JsonSyntaxException(e10);
        }
    }

    @Override // s5.o
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public synchronized void d(JsonWriter jsonWriter, Time time) throws IOException {
        jsonWriter.value(time == null ? null : this.f20771a.format((Date) time));
    }
}
