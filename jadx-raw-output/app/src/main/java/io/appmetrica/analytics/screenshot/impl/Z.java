package io.appmetrica.analytics.screenshot.impl;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.modulesapi.internal.client.ClientContext;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public final class Z extends ContentObserver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f58407d = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClientContext f58408a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bk.a f58409b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C4716k f58410c;

    public Z(ClientContext clientContext, C4723s c4723s) {
        super(clientContext.getClientExecutorProvider().getDefaultExecutor().getHandler());
        this.f58408a = clientContext;
        this.f58409b = c4723s;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        C4716k c4716k;
        super.onChange(z10, uri);
        if (lk.x.R(String.valueOf(uri), f58407d, false, 2, null) && (c4716k = this.f58410c) != null) {
            try {
                String[] strArr = (String[]) nj.l.s(new String[]{"date_added"}, c4716k.f58438b);
                Cursor cursorQuery = this.f58408a.getContext().getContentResolver().query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, strArr, "date_added >= ?", new String[]{String.valueOf(new SystemTimeProvider().currentTimeSeconds() - c4716k.f58439c)}, "date_added DESC");
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            for (String str : strArr) {
                            }
                            Iterator it = c4716k.f58438b.iterator();
                            while (it.hasNext()) {
                                if (lk.a0.X(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow((String) it.next())).toLowerCase(Locale.ROOT), "screenshot", false, 2, null)) {
                                    this.f58409b.invoke();
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            yj.b.a(cursorQuery, th2);
                            throw th3;
                        }
                    }
                }
                mj.r rVar = mj.r.f64562a;
                yj.b.a(cursorQuery, null);
            } catch (Exception unused) {
            }
        }
    }
}
