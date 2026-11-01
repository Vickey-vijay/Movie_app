package io.bidmachine.analytics.internal;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b¨\u0006\f"}, d2 = {"Lio/bidmachine/analytics/internal/N;", "", "", "dateTime", "", "a", "(Ljava/lang/String;)Ljava/lang/Long;", "Ljava/text/SimpleDateFormat;", "Ljava/text/SimpleDateFormat;", "dateFormat", "<init>", "()V", "bidmachine-android-sdk_bh_3_3_0"}, k = 1, mv = {1, 7, 1})
public final class N {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM HH:mm:ss.SSS", Locale.getDefault());

    public final Long a(String dateTime) throws ParseException {
        int i10 = Calendar.getInstance().get(1);
        Date date = this.dateFormat.parse(i10 + '-' + dateTime);
        if (date != null) {
            return Long.valueOf(date.getTime());
        }
        return null;
    }
}
