package m9;

import com.mgs.carparking.download.DownloadEntity;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: DownloadHistoryCache.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile a f64304e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Deque<DownloadEntity> f64305a = new ArrayDeque();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Map<String, List<DownloadEntity>> f64306b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f64307c = "^(.+)(\\(\\d+\\))$";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Pattern f64308d = Pattern.compile("^(.+)(\\(\\d+\\))$");

    public static a a() {
        if (f64304e == null) {
            synchronized (a.class) {
                if (f64304e == null) {
                    f64304e = new a();
                }
            }
        }
        return f64304e;
    }
}
