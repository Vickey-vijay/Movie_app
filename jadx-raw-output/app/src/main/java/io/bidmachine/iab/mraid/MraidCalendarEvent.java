package io.bidmachine.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Date;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class MraidCalendarEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f59201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f59202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f59203c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f59204d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Date f59205e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f59206f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f59207g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f59208h;

    public MraidCalendarEvent(String str, Date date) {
        this.f59201a = str;
        this.f59202b = date;
    }

    public void a(Date date) {
        this.f59205e = date;
    }

    public void b(String str) {
        this.f59208h = str;
    }

    public void c(String str) {
        this.f59206f = str;
    }

    public void d(String str) {
        this.f59204d = str;
    }

    public void e(String str) {
        this.f59207g = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MraidCalendarEvent)) {
            return false;
        }
        MraidCalendarEvent mraidCalendarEvent = (MraidCalendarEvent) obj;
        return Objects.equals(this.f59201a, mraidCalendarEvent.f59201a) && Objects.equals(this.f59202b, mraidCalendarEvent.f59202b) && Objects.equals(this.f59203c, mraidCalendarEvent.f59203c) && Objects.equals(this.f59204d, mraidCalendarEvent.f59204d) && Objects.equals(this.f59205e, mraidCalendarEvent.f59205e) && Objects.equals(this.f59206f, mraidCalendarEvent.f59206f) && Objects.equals(this.f59207g, mraidCalendarEvent.f59207g) && Objects.equals(this.f59208h, mraidCalendarEvent.f59208h);
    }

    @NonNull
    public String getDescription() {
        return this.f59201a;
    }

    @Nullable
    public Date getEnd() {
        return this.f59205e;
    }

    @Nullable
    public String getLocation() {
        return this.f59203c;
    }

    @Nullable
    public String getRecurrence() {
        return this.f59208h;
    }

    @NonNull
    public Date getStart() {
        return this.f59202b;
    }

    @Nullable
    public String getStatus() {
        return this.f59206f;
    }

    @Nullable
    public String getSummary() {
        return this.f59204d;
    }

    @Nullable
    public String getTransparency() {
        return this.f59207g;
    }

    public int hashCode() {
        return Objects.hash(this.f59201a, this.f59202b, this.f59203c, this.f59204d, this.f59205e, this.f59206f, this.f59207g, this.f59208h);
    }

    @NonNull
    public String toString() {
        return "MraidCalendarEvent{description='" + this.f59201a + "', start=" + this.f59202b + ", location='" + this.f59203c + "', summary='" + this.f59204d + "', end=" + this.f59205e + ", status='" + this.f59206f + "', transparency='" + this.f59207g + "', recurrence='" + this.f59208h + "'}";
    }

    public void a(String str) {
        this.f59203c = str;
    }
}
