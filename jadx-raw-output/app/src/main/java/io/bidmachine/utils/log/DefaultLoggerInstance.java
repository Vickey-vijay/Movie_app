package io.bidmachine.utils.log;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C3426d4;
import io.bidmachine.utils.lazy.LazyValue;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;

/* JADX INFO: loaded from: classes8.dex */
public class DefaultLoggerInstance implements LoggerInstance {
    private static final int MAX_CHAR_COUNT = 1000;

    @NonNull
    private final String tag;

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(3, obj, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(6, obj, str, null, null);
    }

    public boolean isLoggable(int i10) {
        return true;
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Object obj, @NonNull String str) {
        prepareAndLog(5, obj, str, null, null);
    }

    @NonNull
    private static String buildStackTraceString(@NonNull Throwable th2) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        th2.printStackTrace(printWriter);
        printWriter.flush();
        return stringWriter.toString();
    }

    @NonNull
    public String buildMessage(@Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th2) {
        StringBuilder sb2 = new StringBuilder();
        if (obj != null) {
            sb2.append(C3426d4.j.f28586d);
            sb2.append(obj);
            sb2.append("] ");
        }
        if (str != null) {
            sb2.append(str);
        } else if (lazyValue != null) {
            sb2.append(lazyValue.get());
        }
        if (th2 != null) {
            if (sb2.length() != 0) {
                sb2.append("\n");
            }
            sb2.append(buildStackTraceString(th2));
        }
        return sb2.toString();
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull String str) {
        prepareAndLog(3, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull String str) {
        prepareAndLog(6, null, str, null, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull String str) {
        prepareAndLog(5, null, str, null, null);
    }

    public DefaultLoggerInstance(@NonNull String str) {
        this.tag = str;
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, obj, null, lazyValue, null);
    }

    public void log(int i10, @NonNull String str) {
        if (str.length() > 1000) {
            int length = ((str.length() + 1000) - 1) / 1000;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                int i13 = i12 + 1000;
                printLog(i10, this.tag, str.substring(i12, Math.min(str.length(), i13)));
                i11++;
                i12 = i13;
            }
            return;
        }
        printLog(i10, this.tag, str);
    }

    public void prepareAndLog(int i10, @Nullable Object obj, @Nullable String str, @Nullable LazyValue<String> lazyValue, @Nullable Throwable th2) {
        if (isLoggable(i10)) {
            log(i10, buildMessage(obj, str, lazyValue, th2));
        }
    }

    public void printLog(int i10, @NonNull String str, @NonNull String str2) {
        Log.println(i10, str, str2);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Object obj, @NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, obj, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void d(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(3, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void e(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(6, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull LazyValue<String> lazyValue) {
        prepareAndLog(5, null, null, lazyValue, null);
    }

    @Override // io.bidmachine.utils.log.LoggerInstance
    public void w(@NonNull Throwable th2) {
        prepareAndLog(5, null, null, null, th2);
    }
}
