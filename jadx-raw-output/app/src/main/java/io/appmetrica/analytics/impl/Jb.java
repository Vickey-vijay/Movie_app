package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class Jb {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Kb.a(configuration) : nj.r.e(He.a(configuration.locale));
    }
}
