package com.monetization.ads.exo.source.dash;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.datepicker.UtcDates;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import yads.bu;
import yads.ob2;
import yads.pb2;
import yads.r30;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements pb2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f42927a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override // yads.pb2
    public final Object a(Uri uri, r30 r30Var) throws IOException {
        String line = new BufferedReader(new InputStreamReader(r30Var, bu.f75964c)).readLine();
        try {
            Matcher matcher = f42927a.matcher(line);
            if (!matcher.matches()) {
                throw new ob2("Couldn't parse timestamp: " + line, null, true, 4);
            }
            String strGroup = matcher.group(1);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone(UtcDates.UTC));
            long time = simpleDateFormat.parse(strGroup).getTime();
            if (!"Z".equals(matcher.group(2))) {
                long j10 = BadgeDrawable.DEFAULT_EXCEED_MAX_BADGE_NUMBER_SUFFIX.equals(matcher.group(4)) ? 1L : -1L;
                long j11 = Long.parseLong(matcher.group(5));
                String strGroup2 = matcher.group(7);
                time -= (((j11 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000) * j10;
            }
            return Long.valueOf(time);
        } catch (ParseException e10) {
            throw new ob2(null, e10, true, 4);
        }
    }
}
