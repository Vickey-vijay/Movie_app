package sg.bigo.ads.common.u;

import androidx.annotation.Nullable;
import com.ironsource.G5;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f69968a = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f69969b = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f69970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f69971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f69972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final String f69973f;

    private f(String str, String str2, String str3, @Nullable String str4) {
        this.f69970c = str;
        this.f69971d = str2;
        this.f69972e = str3;
        this.f69973f = str4;
    }

    @Nullable
    public static f a(String str) {
        Matcher matcher = f69968a.matcher(str);
        if (!matcher.lookingAt()) {
            return null;
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f69969b.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                return null;
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(G5.M)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    return null;
                }
                str2 = strGroup3;
            }
        }
        return new f(str, lowerCase, lowerCase2, str2);
    }

    public final boolean equals(@Nullable Object obj) {
        return (obj instanceof f) && ((f) obj).f69970c.equals(this.f69970c);
    }

    public final int hashCode() {
        return this.f69970c.hashCode();
    }

    public final String toString() {
        return this.f69970c;
    }
}
