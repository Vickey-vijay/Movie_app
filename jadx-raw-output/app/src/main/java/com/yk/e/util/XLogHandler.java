package com.yk.e.util;

import android.content.Context;
import com.ironsource.Z7;
import java.io.File;
import java.io.FileFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import y0.a;
import y0.c;
import y0.e;
import z0.b;

/* JADX INFO: loaded from: classes5.dex */
public class XLogHandler {
    private static XLogHandler instance;
    private String logFilePath = "";

    private void deleteOldLogFile(Context context) {
        File file = new File(getLogPath(context));
        final long jCurrentTimeMillis = System.currentTimeMillis() - ((long) 432000000);
        file.listFiles(new FileFilter() { // from class: com.yk.e.util.XLogHandler.3
            @Override // java.io.FileFilter
            public boolean accept(File file2) {
                if (file2.lastModified() < jCurrentTimeMillis) {
                    e.b("删除旧日志文件: " + file2.toString() + Z7.f27998r + file2.delete());
                    return false;
                }
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence getCustomFlattener(int i10, String str, String str2) {
        return getLogTagDetailsData() + " /" + c.a(i10) + "/" + str + ": " + str2;
    }

    public static XLogHandler getInstance() {
        if (instance == null) {
            instance = new XLogHandler();
        }
        return instance;
    }

    private String getLogPath(Context context) {
        return context.getExternalFilesDir("") + File.separator + this.logFilePath;
    }

    private String getLogTagDetailsData() {
        return new SimpleDateFormat("MM-dd HH:mm:ss.SSS").format(new Date());
    }

    public void init(Context context, String str, String str2) {
        this.logFilePath = str2;
        a aVarP = new a.C0799a().r(str).p();
        new l1.a();
        e.g(aVarP, new m1.a.b(getLogPath(context)).d(new b() { // from class: com.yk.e.util.XLogHandler.1
            @Override // z0.b
            public CharSequence flatten(long j10, int i10, String str3, String str4) {
                return XLogHandler.this.getCustomFlattener(i10, str3, str4);
            }
        }).b(new p1.b() { // from class: com.yk.e.util.XLogHandler.2
            public ThreadLocal<SimpleDateFormat> mLocalDateFormat = new ThreadLocal<SimpleDateFormat>() { // from class: com.yk.e.util.XLogHandler.2.1
                @Override // java.lang.ThreadLocal
                public SimpleDateFormat initialValue() {
                    return new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                }
            };

            @Override // p1.b
            public boolean isFileNameChangeable() {
                return true;
            }

            @Override // p1.b
            public String generateFileName(int i10, long j10) {
                SimpleDateFormat simpleDateFormat = this.mLocalDateFormat.get();
                simpleDateFormat.setTimeZone(TimeZone.getDefault());
                return simpleDateFormat.format(new Date(j10)) + ".log";
            }
        }).a());
        e.b("========================================================================\n");
        deleteOldLogFile(context);
    }

    private XLogHandler() {
    }
}
