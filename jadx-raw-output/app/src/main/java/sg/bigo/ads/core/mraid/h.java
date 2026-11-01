package sg.bigo.ads.core.mraid;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.C3426d4;
import com.safedk.android.utils.Logger;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.bidmachine.unified.UnifiedMediationParams;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[] f71689a = {"yyyy-MM-dd'T'HH:mm:ssZZZZZ", "yyyy-MM-dd'T'HH:mmZZZZZ"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Set<String> f71690b = new HashSet();

    @VisibleForTesting
    public static class a extends AsyncTask<String, Void, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f71700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final InterfaceC0744a f71701b;

        /* JADX INFO: renamed from: sg.bigo.ads.core.mraid.h$a$a, reason: collision with other inner class name */
        public interface InterfaceC0744a {
            void a();

            void b();
        }

        public a(@NonNull Context context, @NonNull InterfaceC0744a interfaceC0744a) {
            this.f71700a = context.getApplicationContext();
            this.f71701b = interfaceC0744a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(@NonNull String[] strArr) throws Throwable {
            FileOutputStream fileOutputStream;
            FileOutputStream fileOutputStream2;
            Throwable th2;
            Boolean bool;
            InputStream inputStream;
            if (strArr != null && strArr.length != 0) {
                byte b10 = 0;
                if (strArr[0] != null) {
                    File fileD = sg.bigo.ads.common.utils.p.d();
                    fileD.mkdirs();
                    String str = strArr[0];
                    BufferedInputStream bufferedInputStream = null;
                    try {
                        sg.bigo.ads.common.u.b.a aVar = new sg.bigo.ads.common.u.b.a(new sg.bigo.ads.common.u.b.d(str), this.f71700a);
                        aVar.f69951l = sg.bigo.ads.common.u.a.e.a();
                        sg.bigo.ads.common.u.c<sg.bigo.ads.common.u.c.a> cVarA = sg.bigo.ads.common.u.g.a(aVar);
                        T t10 = cVarA.f69956a;
                        if (t10 != 0 && (inputStream = ((sg.bigo.ads.common.u.c.a) t10).f69959b) != null) {
                            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(inputStream);
                            try {
                                File file = new File(fileD, a(str, ((sg.bigo.ads.common.u.c.a) cVarA.f69956a).f69960c));
                                fileOutputStream2 = new FileOutputStream(file);
                                try {
                                    a(bufferedInputStream2, fileOutputStream2);
                                    b bVar = new b(file.toString(), b10);
                                    MediaScannerConnection mediaScannerConnection = new MediaScannerConnection(this.f71700a, bVar);
                                    bVar.f71704c = mediaScannerConnection;
                                    mediaScannerConnection.connect();
                                    bool = Boolean.TRUE;
                                    a(bufferedInputStream2);
                                } catch (Exception unused) {
                                    bufferedInputStream = bufferedInputStream2;
                                    try {
                                        bool = Boolean.FALSE;
                                        a(bufferedInputStream);
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        Throwable th4 = th2;
                                        fileOutputStream = fileOutputStream2;
                                        th = th4;
                                        a(bufferedInputStream);
                                        a(fileOutputStream);
                                        throw th;
                                    }
                                } catch (Throwable th5) {
                                    th2 = th5;
                                    bufferedInputStream = bufferedInputStream2;
                                    Throwable th6 = th2;
                                    fileOutputStream = fileOutputStream2;
                                    th = th6;
                                    a(bufferedInputStream);
                                    a(fileOutputStream);
                                    throw th;
                                }
                            } catch (Exception unused2) {
                                fileOutputStream2 = null;
                            } catch (Throwable th7) {
                                th = th7;
                                fileOutputStream = null;
                                bufferedInputStream = bufferedInputStream2;
                                a(bufferedInputStream);
                                a(fileOutputStream);
                                throw th;
                            }
                            a(fileOutputStream2);
                            return bool;
                        }
                        Boolean bool2 = Boolean.FALSE;
                        a((Closeable) null);
                        a((Closeable) null);
                        return bool2;
                    } catch (Exception unused3) {
                        fileOutputStream2 = null;
                    } catch (Throwable th8) {
                        th = th8;
                        fileOutputStream = null;
                    }
                }
            }
            return Boolean.FALSE;
        }

        @Nullable
        private static String a(@NonNull String str, @Nullable sg.bigo.ads.common.utils.h<List<String>> hVar) {
            if (hVar == null) {
                return null;
            }
            String name = new File(String.valueOf(str.hashCode())).getName();
            List<String> listA = hVar.a("content-type");
            if (listA == null || listA.isEmpty()) {
                return name;
            }
            if (listA.get(0) == null) {
                return name;
            }
            for (String str2 : listA.get(0).split(";")) {
                if (str2.contains("image/")) {
                    String str3 = "." + str2.split("/")[1];
                    if (name.endsWith(str3)) {
                        return name;
                    }
                    return name + str3;
                }
            }
            return name;
        }

        private static void a(Closeable closeable) {
            if (closeable == null) {
                return;
            }
            try {
                closeable.close();
            } catch (Exception unused) {
                sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Unable to close stream. Ignoring.");
            }
        }

        private static void a(InputStream inputStream, OutputStream outputStream) throws IOException {
            byte[] bArr = new byte[16384];
            while (true) {
                int i10 = inputStream.read(bArr);
                if (i10 == -1) {
                    return;
                } else {
                    outputStream.write(bArr, 0, i10);
                }
            }
        }

        @Override // android.os.AsyncTask
        public final /* synthetic */ void onPostExecute(Boolean bool) {
            Boolean bool2 = bool;
            if (bool2 == null || !bool2.booleanValue()) {
                this.f71701b.b();
            } else {
                this.f71701b.a();
            }
        }
    }

    public static class b implements MediaScannerConnection.MediaScannerConnectionClient {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f71702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f71703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private MediaScannerConnection f71704c;

        private b(String str) {
            this.f71702a = str;
            this.f71703b = null;
        }

        public /* synthetic */ b(String str, byte b10) {
            this(str);
        }

        @Override // android.media.MediaScannerConnection.MediaScannerConnectionClient
        public final void onMediaScannerConnected() {
            MediaScannerConnection mediaScannerConnection = this.f71704c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.scanFile(this.f71702a, this.f71703b);
            }
        }

        @Override // android.media.MediaScannerConnection.OnScanCompletedListener
        public final void onScanCompleted(String str, Uri uri) {
            MediaScannerConnection mediaScannerConnection = this.f71704c;
            if (mediaScannerConnection != null) {
                mediaScannerConnection.disconnect();
            }
        }
    }

    public interface c {
        void a(d dVar);
    }

    private static Date a(String str) {
        Date date = null;
        for (String str2 : f71689a) {
            try {
                date = new SimpleDateFormat(str2, Locale.US).parse(str);
                if (date != null) {
                    break;
                }
            } catch (ParseException unused) {
            }
        }
        return date;
    }

    public static void a(Context context, Map<String, String> map) throws d {
        String str;
        if (!d(context)) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "unsupported action createCalendarEvent for devices pre-ICS");
            throw new d("Action is unsupported on this device (need Android version Ice Cream Sandwich or above)");
        }
        try {
            HashMap map2 = new HashMap();
            if (!map.containsKey(UnifiedMediationParams.KEY_DESCRIPTION) || !map.containsKey("start")) {
                throw new IllegalArgumentException("Missing start and description fields");
            }
            map2.put("title", map.get(UnifiedMediationParams.KEY_DESCRIPTION));
            if (!map.containsKey("start") || map.get("start") == null) {
                throw new IllegalArgumentException("Invalid calendar event: start is null.");
            }
            Date dateA = a(map.get("start"));
            if (dateA == null) {
                throw new IllegalArgumentException("Invalid calendar event: start time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
            }
            map2.put("beginTime", Long.valueOf(dateA.getTime()));
            if (map.containsKey("end") && map.get("end") != null) {
                Date dateA2 = a(map.get("end"));
                if (dateA2 == null) {
                    throw new IllegalArgumentException("Invalid calendar event: end time is malformed. Date format expecting (yyyy-MM-DDTHH:MM:SS-xx:xx) or (yyyy-MM-DDTHH:MM-xx:xx) i.e. 2013-08-14T09:00:01-08:00");
                }
                map2.put("endTime", Long.valueOf(dateA2.getTime()));
            }
            if (map.containsKey("location")) {
                map2.put("eventLocation", map.get("location"));
            }
            if (map.containsKey("summary")) {
                map2.put(UnifiedMediationParams.KEY_DESCRIPTION, map.get("summary"));
            }
            if (map.containsKey("transparency")) {
                map2.put("availability", Integer.valueOf(map.get("transparency").equals(C3426d4.i.T) ? 1 : 0));
            }
            StringBuilder sb2 = new StringBuilder();
            if (map.containsKey("frequency")) {
                String str2 = map.get("frequency");
                int i10 = map.containsKey("interval") ? Integer.parseInt(map.get("interval")) : -1;
                if ("daily".equals(str2)) {
                    sb2.append("FREQ=DAILY;");
                    if (i10 != -1) {
                        str = "INTERVAL=" + i10 + ";";
                        sb2.append(str);
                    }
                } else if ("weekly".equals(str2)) {
                    sb2.append("FREQ=WEEKLY;");
                    if (i10 != -1) {
                        sb2.append("INTERVAL=" + i10 + ";");
                    }
                    if (map.containsKey("daysInWeek")) {
                        String strB = b(map.get("daysInWeek"));
                        if (strB == null) {
                            throw new IllegalArgumentException("invalid ");
                        }
                        str = "BYDAY=" + strB + ";";
                        sb2.append(str);
                    }
                } else {
                    if (!"monthly".equals(str2)) {
                        throw new IllegalArgumentException("frequency is only supported for daily, weekly, and monthly.");
                    }
                    sb2.append("FREQ=MONTHLY;");
                    if (i10 != -1) {
                        sb2.append("INTERVAL=" + i10 + ";");
                    }
                    if (map.containsKey("daysInMonth")) {
                        String strC = c(map.get("daysInMonth"));
                        if (strC == null) {
                            throw new IllegalArgumentException();
                        }
                        str = "BYMONTHDAY=" + strC + ";";
                        sb2.append(str);
                    }
                }
            }
            map2.put("rrule", sb2.toString());
            Intent type = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event");
            for (String str3 : map2.keySet()) {
                Object obj = map2.get(str3);
                if (obj instanceof Long) {
                    type.putExtra(str3, ((Long) obj).longValue());
                } else if (obj instanceof Integer) {
                    type.putExtra(str3, ((Integer) obj).intValue());
                } else {
                    type.putExtra(str3, (String) obj);
                }
            }
            type.setFlags(268435456);
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, type);
        } catch (ActivityNotFoundException unused) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "no calendar app installed");
            throw new d("Action is unsupported on this device - no calendar app installed");
        } catch (IllegalArgumentException e10) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "create calendar: invalid parameters " + e10.getMessage());
            throw new d(e10);
        } catch (Exception e11) {
            sg.bigo.ads.common.t.a.a(0, "MraidBridge", "could not create calendar event");
            throw new d(e11);
        }
    }

    private static <P> void a(@NonNull final AsyncTask<P, ?, ?> asyncTask, @Nullable final P... pArr) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
        } else {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Posting AsyncTask to main thread for execution.");
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: sg.bigo.ads.core.mraid.h.2
                @Override // java.lang.Runnable
                public final void run() {
                    asyncTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, pArr);
                }
            });
        }
    }

    public static boolean a(@NonNull Activity activity) {
        return (activity.getWindow() == null || (activity.getWindow().getAttributes().flags & 16777216) == 0) ? false : true;
    }

    public static boolean a(Context context) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        return a(context, intent);
    }

    private static boolean a(@NonNull Context context, @NonNull Intent intent) {
        try {
            return !context.getPackageManager().queryIntentActivities(intent, 0).isEmpty();
        } catch (Exception unused) {
        }
    }

    private static boolean a(@NonNull Context context, @NonNull String str) {
        try {
            return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
        } catch (Exception unused) {
        }
    }

    private static String b(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[7];
        String[] strArrSplit = str.split(StringUtils.COMMA);
        for (String str3 : strArrSplit) {
            int i10 = Integer.parseInt(str3);
            if (i10 == 7) {
                i10 = 0;
            }
            if (!zArr[i10]) {
                StringBuilder sb3 = new StringBuilder();
                switch (i10) {
                    case 0:
                        str2 = "SU";
                        break;
                    case 1:
                        str2 = "MO";
                        break;
                    case 2:
                        str2 = "TU";
                        break;
                    case 3:
                        str2 = "WE";
                        break;
                    case 4:
                        str2 = "TH";
                        break;
                    case 5:
                        str2 = "FR";
                        break;
                    case 6:
                        str2 = "SA";
                        break;
                    default:
                        throw new IllegalArgumentException("invalid day of week ".concat(String.valueOf(i10)));
                }
                sb3.append(str2);
                sb3.append(StringUtils.COMMA);
                sb2.append(sb3.toString());
                zArr[i10] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the week if specifying repeating weekly");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    public static boolean b(Context context) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        return a(context, intent);
    }

    private static String c(String str) {
        StringBuilder sb2 = new StringBuilder();
        boolean[] zArr = new boolean[63];
        String[] strArrSplit = str.split(StringUtils.COMMA);
        for (String str2 : strArrSplit) {
            int i10 = Integer.parseInt(str2);
            int i11 = i10 + 31;
            if (!zArr[i11]) {
                StringBuilder sb3 = new StringBuilder();
                if (i10 == 0 || i10 < -31 || i10 > 31) {
                    throw new IllegalArgumentException("invalid day of month ".concat(String.valueOf(i10)));
                }
                sb3.append(String.valueOf(i10));
                sb3.append(StringUtils.COMMA);
                sb2.append(sb3.toString());
                zArr[i11] = true;
            }
        }
        if (strArrSplit.length == 0) {
            throw new IllegalArgumentException("must have at least 1 day of the month if specifying repeating weekly");
        }
        sb2.deleteCharAt(sb2.length() - 1);
        return sb2.toString();
    }

    public static boolean c(Context context) {
        return "mounted".equals(Environment.getExternalStorageState()) && a(context, "android.permission.WRITE_EXTERNAL_STORAGE");
    }

    public static boolean d(Context context) {
        return a(context, new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.item/event"));
    }

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p10, Intent p11) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p11 == null) {
            return;
        }
        p10.startActivity(p11);
    }

    public final void a(final Context context, String str, final c cVar) {
        if (f71690b.contains(str)) {
            sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Image downloading task has been created");
        } else {
            f71690b.add(str);
            a(new a(context, new a.InterfaceC0744a() { // from class: sg.bigo.ads.core.mraid.h.1
                @Override // sg.bigo.ads.core.mraid.h.a.InterfaceC0744a
                public final void a() {
                    sg.bigo.ads.common.t.a.a(0, 3, "MraidBridge", "Image successfully saved.");
                }

                @Override // sg.bigo.ads.core.mraid.h.a.InterfaceC0744a
                public final void b() {
                    Toast.makeText(context, "Image failed to download.", 0).show();
                    sg.bigo.ads.common.t.a.a(0, "MraidBridge", "Error downloading and saving image file.");
                    cVar.a(new d("Error downloading and saving image file."));
                }
            }), str);
        }
    }
}
